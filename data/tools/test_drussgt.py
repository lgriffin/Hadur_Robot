"""Tests for the DrussGT bench tools in drussgt/: python3 -m unittest discover -s data/tools

Three things are pinned here: the energy model's rules against values worked by hand from
Robocode's rules and the DrussGT 3.1.16 jar, the two search paths of its predictor against each
other, and the headline figures of docs/bench/d0-drussgt-probes.md against the committed tables.
"""

import io
import os
import random
import sys
import tempfile
import unittest

HERE = os.path.dirname(os.path.abspath(__file__))
sys.path.insert(0, os.path.join(HERE, "drussgt"))

import duel  # noqa: E402
import runs  # noqa: E402
import shield_targets  # noqa: E402
import summary  # noqa: E402

DATA = os.path.dirname(HERE)


class EnergyRulesTest(unittest.TestCase):

    def test_bullet_damage_and_flight_follow_robocode(self):
        self.assertAlmostEqual(0.4, duel.dmg(0.1))
        self.assertAlmostEqual(4.0, duel.dmg(1.0))
        self.assertAlmostEqual(9.7, duel.dmg(1.95))      # 4 x 1.95 + 2 x 0.95
        self.assertAlmostEqual(16.0, duel.dmg(3.0))
        self.assertEqual(26, duel.flight(0.1))             # 500 px at 19.7 px a tick
        self.assertEqual(36, duel.flight(1.95))            # 500 px at 14.15 px a tick

    def test_break_even_hit_rates(self):
        # A bullet pays for itself when hit rate x (damage + refund) reaches its cost.
        self.assertAlmostEqual(0.125, 1.95 / (duel.dmg(1.95) + 3 * 1.95), places=3)
        self.assertAlmostEqual(1 / 7, 0.1 / (duel.dmg(0.1) + 3 * 0.1), places=6)

    def test_drussgt_power_at_even_energy(self):
        # Energy cap (own - 20 + half the clamped lead) / 25, then the snap to its power list.
        self.assertAlmostEqual(1.95, duel.druss_power(100, 100, 2.0, False, 100), places=6)
        self.assertAlmostEqual(1.15, duel.druss_power(50, 50, 2.0, False, 50), places=6)   # 1.2 snaps down
        self.assertAlmostEqual(0.15, duel.druss_power(24, 24, 2.0, False, 24), places=6)   # 0.16 snaps down
        self.assertAlmostEqual(0.15, duel.druss_power(15, 15, 2.0, False, 15), places=6)   # the floor

    def test_drussgt_lead_is_clamped(self):
        # 40 ahead counts as 30: (60 - 20 + 15) / 25 = 2.2, capped at the 1.95 base.
        self.assertAlmostEqual(1.95, duel.druss_power(60, 20, 2.0, False, 20), places=6)
        # 40 behind counts as 10: (60 - 20 - 5) / 25 = 1.4, which snaps to 1.15.
        self.assertAlmostEqual(1.15, duel.druss_power(60, 100, 2.0, False, 100), places=6)

    def test_drussgt_undercuts_the_power_it_expects(self):
        self.assertAlmostEqual(0.95, duel.druss_power(100, 100, 1.1, True, 100), places=6)  # 1.1 - 0.1 = 1.0
        self.assertAlmostEqual(0.15, duel.druss_power(100, 100, 0.1, True, 100), places=6)  # never below 0.15
        self.assertAlmostEqual(1.95, duel.druss_power(100, 100, 0.1, False, 100), places=6)

    def test_drussgt_kill_cap_rounds_up(self):
        # A quarter of the energy the target will have: 2.01 / 4 = 0.5025, rounded up to 0.65.
        self.assertAlmostEqual(0.65, duel.druss_power(80, 2.0, 2.0, False, 2.0), places=6)

    def test_released_power_rule(self):
        self.assertAlmostEqual(1.95, duel.hadur_base(100, 100, {}))
        self.assertAlmostEqual((40 / 63) ** 3 * 1.95, duel.hadur_base(40, 40, {}))
        self.assertAlmostEqual(0.1, duel.hadur_base(10, 60, {}))               # the cubic, floored at 0.1
        self.assertAlmostEqual(1.0, duel.hadur_base(100, 4, {}))               # END-3: just enough to kill

    def test_lead_aware_rule(self):
        rule = duel.make_lead()
        self.assertEqual(1.95, rule(100, 100, {}))      # the opening exchange, both above 60
        self.assertEqual(0.1, rule(55, 55, {}))         # level
        self.assertEqual(0.1, rule(55, 40, {}))         # ahead
        self.assertEqual(0.1, rule(52, 55, {}))         # 3 behind is not more than 3
        self.assertEqual(1.95, rule(50, 55, {}))        # more than 3 behind
        self.assertEqual(0.1, rule(9, 30, {}))          # too little left to gamble

    def test_last_shot_is_kept(self):
        rule = duel.keep_last(duel.make_lead())
        self.assertEqual(0.1, rule(1.0, 0.1, {}))       # leaves 0.9 against 0.1: fire
        self.assertGreater(rule(0.45, 0.1, {}), 0.45)   # would leave 0.35, within 0.3 of 0.1: hold
        self.assertEqual(0.1, rule(0.45, 0.2, {}))      # the enemy can still fire: the rule is off


class PredictorTest(unittest.TestCase):

    def test_needs_two_samples_to_answer(self):
        p = duel.Predictor(accelerate=False)
        self.assertEqual(2.0, p.predict(100, 100))
        p.train(100, 100, 1.95)
        self.assertEqual(2.0, p.predict(100, 100))
        p.train(98, 98, 1.95)
        self.assertEqual(1.95, p.predict(97, 97))

    def test_answers_with_the_power_its_neighbours_agree_on(self):
        p = duel.Predictor(accelerate=False)
        for e in range(100, 60, -2):
            p.train(e, e, 1.95)
        for e in range(60, 20, -1):
            p.train(e + 5, e, 0.1)
        self.assertEqual(1.95, p.predict(90, 90))
        self.assertEqual(0.1, p.predict(40, 35))

    @unittest.skipIf(duel.np is None, "numpy is not installed; only the pure-Python search runs")
    def test_both_search_paths_agree(self):
        rng = random.Random(3)
        pure, fast = duel.Predictor(accelerate=False), duel.Predictor(accelerate=True)
        self.assertTrue(fast.fast)
        powers = (0.1, 0.1, 0.1, 0.35, 1.15, 1.95, 1.95, 3.0)
        for i in range(1500):
            ed, eh = round(rng.uniform(0, 110), 1), round(rng.uniform(0, 110), 1)   # ties happen
            self.assertEqual(pure.predict(ed, eh), fast.predict(ed, eh), "sample %d" % i)
            power = rng.choice(powers)
            pure.train(ed, eh, power)
            fast.train(ed, eh, power)
        self.assertEqual(pure.nearest(0.25, 0.3, 20), fast.nearest(0.25, 0.3, 20))

    def test_a_battle_is_reproducible(self):
        a = duel.evaluate(duel.POLICIES["l0"], battles=1, seed=5, trace_ticks=None)
        b = duel.evaluate(duel.POLICIES["l0"], battles=1, seed=5, trace_ticks=None)
        self.assertEqual(a, b)
        self.assertTrue(20 < a["share"] < 80)


class CommittedTablesTest(unittest.TestCase):
    """The figures docs/bench/d0-drussgt-probes.md and the plan quote, from data/bench/."""

    @classmethod
    def setUpClass(cls):
        cls.bench = summary.Bench()

    def assertShare(self, build, mean, half_width, battles):
        m, ci, _ = self.bench.share(build)
        self.assertEqual(battles, len(self.bench.shares(build)))
        self.assertAlmostEqual(mean, m, places=2)
        self.assertAlmostEqual(half_width, ci, places=2)

    def test_builds_and_battles(self):
        self.assertEqual([label for label, _, _ in runs.SESSION], self.bench.builds)
        self.assertEqual(40, len(self.bench.battles))
        self.assertEqual(1400, len(self.bench.rounds))

    def test_score_shares(self):
        self.assertShare("released", 37.53, 3.49, 10)
        self.assertShare("lead-aware", 50.69, 3.39, 10)
        self.assertShare("lead-aware-sampled", 51.43, 2.98, 10)
        self.assertShare("random-gun", 34.17, 4.87, 5)
        self.assertShare("all-chaff", 29.94, 6.26, 3)
        self.assertAlmostEqual(24.55, self.bench.share("hold-fire")[0], places=2)

    def test_paired_differences(self):
        m, ci, n = self.bench.paired("lead-aware", "released")
        self.assertEqual((13.16, 4.18, 10), (round(m, 2), round(ci, 2), n))
        m, ci, n = self.bench.paired("lead-aware-sampled", "lead-aware")
        self.assertEqual((0.74, 3.96, 10), (round(m, 2), round(ci, 2), n))

    def test_round_outcomes(self):
        self.assertEqual((350, 86, 13, 251), self.bench.outcomes("released"))
        self.assertEqual((350, 188, 4, 158), self.bench.outcomes("lead-aware"))
        self.assertEqual((350, 191, 4, 155), self.bench.outcomes("lead-aware-sampled"))
        self.assertEqual((175, 36), self.bench.outcomes("random-gun")[:2])
        self.assertEqual((105, 29), self.bench.outcomes("all-chaff")[:2])
        self.assertEqual((70, 41), self.bench.outcomes("hold-fire")[:2])

    def test_outright_wins_are_the_survival_score(self):
        for build in self.bench.builds:
            self.assertEqual(self.bench.outcomes(build)[1], self.bench.result_sum(build, "survival") / 50, build)
        # The engine's first places also credit Hadur with the rounds both robots died in.
        self.assertEqual(99, self.bench.result_sum("released", "firsts"))

    def test_hit_rates(self):
        rate = self.bench.hit_rate
        self.assertAlmostEqual(7.47, rate("released", "hadur")[0], places=2)
        self.assertAlmostEqual(9.69, rate("released", "drussgt")[0], places=2)
        self.assertAlmostEqual(7.50, rate("released", "hadur", classes=summary.LIGHT)[0], places=2)
        self.assertAlmostEqual(9.91, rate("released", "drussgt", classes=summary.LIGHT)[0], places=2)
        self.assertAlmostEqual(7.08, rate("released", "hadur", classes=summary.HEAVY)[0], places=2)
        self.assertAlmostEqual(7.05, rate("released", "drussgt", classes=summary.HEAVY)[0], places=2)
        self.assertAlmostEqual(7.89, rate("lead-aware", "hadur", classes=summary.LIGHT)[0], places=2)
        self.assertAlmostEqual(9.28, rate("lead-aware-sampled", "hadur", classes=summary.LIGHT)[0], places=2)
        self.assertAlmostEqual(9.93, rate("lead-aware", "drussgt")[0], places=2)
        self.assertAlmostEqual(9.94, rate("lead-aware-sampled", "drussgt")[0], places=2)
        # With Hadur holding fire DrussGT hits more at the same range.
        self.assertAlmostEqual(9.71, rate("released", "drussgt", bands=("400-500",))[0], places=2)
        self.assertAlmostEqual(14.3, rate("hold-fire", "drussgt", bands=("400-500",))[0], places=1)

    def test_energy_economics_of_the_released_build(self):
        shots, spent, refund, dealt, net = self.bench.economics("released", "hadur")
        self.assertEqual((237.1, 88.1, 19.2, 29.3, -39.6), tuple(round(v, 1) for v in (shots, spent, refund, dealt, net)))
        shots, spent, refund, dealt, net = self.bench.economics("released", "drussgt")
        self.assertEqual((237.8, 76.4, 19.9, 28.8, -27.8), tuple(round(v, 1) for v in (shots, spent, refund, dealt, net)))

    def test_the_lead_at_tick_600_is_the_round(self):
        lead, ahead, won_ahead, behind, won_behind = self.bench.lead_split("released", 600)
        self.assertEqual((-8.6, 114, 62.3, 236, 6.4),
                         (round(lead, 1), ahead, round(won_ahead, 1), behind, round(won_behind, 1)))
        lead, ahead, won_ahead, behind, won_behind = self.bench.lead_split("lead-aware", 400)
        self.assertEqual((175, 89.1, 175, 18.3), (ahead, round(won_ahead, 1), behind, round(won_behind, 1)))

    def test_opening_shield(self):
        rows = [r for r in self.bench.battles if r["build"] == "released"]
        ticks = [int(r["shield_end_tick"]) for r in rows]
        leads = [float(r["shield_hadur_energy"]) - float(r["shield_drussgt_energy"]) for r in rows]
        self.assertEqual((91, 163), (min(ticks), max(ticks)))
        self.assertTrue(35.0 < min(leads) and max(leads) < 44.5)
        round0 = [r["outcome"] for r in self.bench.rounds_of("released") if r["round"] == "0"]
        self.assertEqual((5, 2, 3), (round0.count("win"), round0.count("double"), round0.count("loss")))

    def test_flattener_and_duress(self):
        def flattener(build):
            starts = [r["flattener"] for r in self.bench.rounds_of(build) if r["flattener"] != ""]
            return starts.count("1"), len(starts)
        self.assertEqual((91, 340), flattener("released"))
        self.assertEqual((180, 340), flattener("lead-aware"))
        self.assertEqual((317, 340), flattener("lead-aware-sampled"))
        duress = {b: sum(int(r["hadur_skips"]) >= 3 for r in self.bench.rounds_of(b)) for b in self.bench.builds}
        self.assertEqual({"released": 1, "lead-aware": 2, "lead-aware-sampled": 0, "random-gun": 2,
                          "all-chaff": 6, "hold-fire": 0}, duress)

    def test_report_prints(self):
        out = io.StringIO()
        summary.report(self.bench, out)
        self.assertIn("lead-aware minus released, paired on 10 seeds: +13.16 ±4.18", out.getvalue())


class ShieldTargetsTest(unittest.TestCase):

    JAVA = '''public class ShieldTargets {
        private static final String NAMES = ""
            + "a.One 1.0,b.Two 0.2,"
            + "c.Three 3";
    }'''

    def test_names_come_out_of_the_java_source(self):
        with tempfile.NamedTemporaryFile("w", suffix=".java", delete=False) as f:
            f.write(self.JAVA)
        try:
            self.assertEqual(["a.One 1.0", "b.Two 0.2", "c.Three 3"], shield_targets.read_targets(f.name))
        finally:
            os.unlink(f.name)

    def test_committed_table(self):
        path = os.path.join(DATA, "rumble", "parsed", "2026-10-05_drussgt-3.1.16_shield-targets_vs_hadur-3.4.tsv")
        rows = summary.read(path)
        listed = [r for r in rows if r["on_list"] == "1"]
        self.assertEqual((1215, 357), (len(rows), len(listed)))
        self.assertAlmostEqual(82.27, sum(float(r["hadur_aps"]) for r in listed) / 357, places=2)
        self.assertAlmostEqual(5.21, sum(100 - float(r["hadur_aps"]) for r in listed) / 1215, places=2)
        self.assertAlmostEqual(14.10, sum(100 - float(r["hadur_aps"]) for r in rows) / 1215, places=2)
        self.assertEqual(listed, [r for r in rows[:357]])        # the list comes first
        self.assertEqual(shield_targets.read_targets(path), [r["name"] for r in listed])


if __name__ == "__main__":
    unittest.main()

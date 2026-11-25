"""Tests for sepia_aps.py: the round model, the hit-chance rule, the projection and the saved estimate."""
import csv
import json
import os
import sys
import unittest

import numpy as np

HERE = os.path.dirname(os.path.abspath(__file__))
ROOT = os.path.normpath(os.path.join(HERE, "..", ".."))
sys.path.insert(0, HERE)

import sepia_aps as sa  # noqa: E402

CENTRAL = dict(k_punch=1.26, k_ink=1.63, stop=0.49, floor=1.0, m_simple=1.15, exact=1.0, circ=0.5, m_ram=1.5,
               gun=0.97, shield=-0.7)
SIMPLE = dict(aimed=1.0, aim_other=0.0, hit_simple=1.0, hit_learned=0.0)     # every bullet on a simple aim


def robots(n=1, **values):
    """`n` copies of one made-up robot, as the arrays read_inputs gives. No simple aim explains any of its bullets
    unless the caller says so."""
    base = dict(w=1.0, ticks=600.0, ne=30.0, nu=25.0, h=0.05, hu=0.2, dt=15.0, du=55.0, pe=2.0, dmg_u=11.0, pu=2.2,
                other=0.0, kill_u=1.0, ram_u=0.0, ram_t=0.0, share313=90.0, live324=92.0, rammer=0.0, shielded=0.0,
                aimed=0.0, aim_head=0.0, aim_lead=0.0, aim_circ=0.0, aim_other=1.0, hit_simple=0.0, hit_learned=1.0,
                exact_floor=0.0)
    base.update(values)
    return {k: np.full(n, v, float) for k, v in base.items()}


def census_row(**values):
    """A row of the census classes as the file gives it: strings."""
    return {k: str(v) for k, v in values.items()}


# @Tag("BENCH-294"): the round model scores a round as Robocode does and answers to the enemy's hit chance.
class RoundModelTest(unittest.TestCase):

    def test_bullet_damage_and_its_inverse(self):
        self.assertEqual([float(sa.damage(p)) for p in (1.0, 2.0, 3.0)], [4.0, 10.0, 16.0])
        for p in (0.1, 1.0, 1.95, 3.0):
            self.assertAlmostEqual(float(sa.power_of(sa.damage(p))), p)

    def test_an_enemy_that_never_hits_scores_nothing(self):
        share, ours, theirs, won = sa.play(robots(), 1.0, 0.0, rounds=60)
        self.assertEqual(float(won[0]), 1.0)
        self.assertEqual(float(theirs[0]), 0.0)
        self.assertAlmostEqual(float(share[0]), 100.0)
        self.assertGreater(float(ours[0]), 60.0)            # survival, and bullet damage with its kill bonus

    def test_more_enemy_hits_mean_a_lower_share(self):
        shares = [float(sa.play(robots(), 1.0, h, rounds=300, seed=3)[0][0]) for h in (0.02, 0.10, 0.25)]
        self.assertGreater(shares[0], shares[1] + 3.0)
        self.assertGreater(shares[1], shares[2] + 3.0)

    def test_ink_only_wins_the_round_but_scores_survival_alone(self):
        share, ours, theirs, won = sa.play(robots(), 0.0, 0.0, rounds=60)
        self.assertEqual(float(won[0]), 1.0)                # the enemy spends itself and cannot fire
        self.assertAlmostEqual(float(ours[0]), 60.0, delta=0.5)
        punching = float(sa.play(robots(), 1.0, 0.05, rounds=300, seed=3)[0][0])
        inking = float(sa.play(robots(), 0.0, 0.05, rounds=300, seed=3)[0][0])
        self.assertGreater(punching, inking)                # against a robot our gun can hit, punching pays

    def test_two_like_robots_split_the_score(self):
        twin = robots(ne=25.0, nu=25.0, h=0.2, hu=0.2, pe=2.0, dmg_u=10.0, pu=2.0, kill_u=1.0)
        share = float(sa.play(twin, 1.0, 0.2, rounds=600, seed=9)[0][0])
        self.assertAlmostEqual(share, 50.0, delta=6.0)


# @Tag("BENCH-294"): the enemy's hit chance on Sepia, and the regime picked.
class HitRuleTest(unittest.TestCase):

    def test_an_even_spray_finds_a_moving_body_about_one_time_in_ten(self):
        self.assertAlmostEqual(float(sa.spray(2.0)), 0.095, delta=0.001)
        self.assertGreater(float(sa.spray(1.0)), float(sa.spray(3.0)))   # a fast bullet leaves less room to escape

    def test_a_weak_gun_gets_the_floor_and_a_strong_one_its_ratio(self):
        weak = float(sa.sepia_hit(robots(h=0.01), CENTRAL, 0.0)[0])
        strong = float(sa.sepia_hit(robots(h=0.20), CENTRAL, 0.0)[0])
        self.assertAlmostEqual(weak, float(sa.spray(2.0)), delta=1e-6)
        self.assertAlmostEqual(strong, 1.26 * 0.20, delta=1e-6)

    def test_a_simple_aim_is_dodged_as_hadur_dodges_it(self):
        self.assertAlmostEqual(float(sa.sepia_hit(robots(h=0.01, **SIMPLE), CENTRAL, 0.0)[0]), 1.15 * 0.01)

    def test_a_simple_aim_gets_at_least_what_the_exact_pick_let_through(self):
        refs = dict(simple_gun_on_exact_pick=dict(headon=0.001, linear=0.022))
        d = robots(h=0.001, aim_head=0.25, aim_lead=0.75, **SIMPLE)
        d["exact_floor"] = sa.exact_floor(d, refs)
        self.assertAlmostEqual(float(d["exact_floor"][0]), 0.25 * 0.001 + 0.75 * 0.022)
        self.assertAlmostEqual(float(sa.sepia_hit(d, CENTRAL, 0.0)[0]), float(d["exact_floor"][0]))
        self.assertAlmostEqual(float(sa.sepia_hit(d, dict(CENTRAL, exact=0.0), 0.0)[0]), 1.15 * 0.001)

    def test_the_spray_floor_is_owed_on_the_bullets_no_simple_aim_explains(self):
        # four bullets in five on a simple aim, and the few that hit Hadur all among the rest: the floor is for
        # the fifth bullet, whatever share of the hits it made
        d = robots(h=0.01, aimed=0.8, aim_other=0.2, hit_simple=0.0, hit_learned=1.0)
        self.assertAlmostEqual(float(sa.sepia_hit(d, CENTRAL, 0.0)[0]), 0.2 * float(sa.spray(2.0)))

    def test_a_circular_aim_takes_its_part_of_the_hits_hadur_could_not_class(self):
        # Hadur's forensics have no circular class. Here 20% of the hits were head-on or linear, 80% neither, and
        # the bullets that could have made those are circular-aimed and unexplained in equal number.
        d = robots(h=0.30, aimed=0.7, aim_head=0.2, aim_lead=0.5, aim_circ=0.3, aim_other=0.3, hit_simple=0.2,
                   hit_learned=0.8)
        self.assertAlmostEqual(float(sa.simple_share(d, 0.0)[0]), 0.2)
        self.assertAlmostEqual(float(sa.simple_share(d, 1.0)[0]), 0.2 + 0.8 / 2)
        self.assertAlmostEqual(float(sa.simple_share(d, 0.5)[0]), 0.2 + 0.8 / 3)
        none, all_ = (float(sa.sepia_hit(d, dict(CENTRAL, circ=c), 0.0)[0]) for c in (0.0, 1.0))
        self.assertAlmostEqual(none, 1.15 * 0.2 * 0.30 + 1.26 * 0.8 * 0.30)
        self.assertAlmostEqual(all_, 1.15 * 0.6 * 0.30 + 1.26 * 0.4 * 0.30)
        self.assertEqual(float(sa.simple_share(robots(aim_other=0.0, hit_simple=0.2, hit_learned=0.8), 1.0)[0]), 0.2)

    def test_a_census_row_gives_the_aim_shares_and_the_classed_hits(self):
        row = census_row(aim_still=0.2, aim_headon=0.08, aim_linear=0.32, aim_circular=0.24, aim_other=0.16,
                         hit_headon=0.1, hit_linear=0.1, hit_learned=0.7, hit_nowave=0.1, hf_hits=100)
        got = sa.aims_and_hits(row)
        for key, want in dict(aimed=0.8, aim_head=0.1, aim_lead=0.7, aim_circ=0.3, aim_other=0.2, hit_simple=0.2 / 0.9,
                              hit_learned=0.7 / 0.9).items():
            self.assertAlmostEqual(got[key], want, msg=key)
        few = sa.aims_and_hits(dict(row, hf_hits="22"))       # 19.8 classed hits: the aim shares stand in
        self.assertAlmostEqual(few["hit_simple"], 0.8)
        self.assertEqual(few["hit_learned"], 0.0)

    def test_ink_stops_its_share_of_the_bullets_on_the_body(self):
        on_body = 1.63 * 0.20
        self.assertAlmostEqual(float(sa.sepia_hit(robots(h=0.20), CENTRAL, 1.0)[0]), on_body * (1 - 0.49))
        self.assertAlmostEqual(float(sa.sepia_hit(robots(h=0.20), CENTRAL, 0.52)[0]), on_body * (1 - 0.49 * 0.52))

    def test_a_rammer_costs_more(self):
        plain = float(sa.sepia_hit(robots(h=0.20), CENTRAL, 0.0)[0])
        self.assertAlmostEqual(float(sa.sepia_hit(robots(h=0.20, rammer=1.0), CENTRAL, 0.0)[0]), 1.5 * plain)

    def test_lookup_reads_the_grid_and_the_best_regime_is_taken(self):
        d = robots(n=2, h=0.20)
        grid = np.zeros((len(sa.REGIMES), len(sa.GUNS), len(sa.HITS), 2))
        for k, h in enumerate(sa.HITS):
            grid[:, :, k, :] = 100.0 - 100.0 * h            # share falls in a straight line with the hit chance
        got = sa.lookup(grid, 0, 0.97, np.array([0.03, 0.18]))
        self.assertAlmostEqual(float(got[0]), 97.0)
        self.assertAlmostEqual(float(got[1]), 82.0)
        share, pick = sa.project(d, grid, np.zeros(2), CENTRAL)
        self.assertEqual(list(pick), [3, 3])                # with nothing lost by inking, ink only is hit least
        only_punch, pick = sa.project(d, grid, np.zeros(2), CENTRAL, regimes={0})
        self.assertEqual(list(pick), [0, 0])
        self.assertGreater(float(share[0]), float(only_punch[0]))

    def test_the_grid_reaches_the_cap_and_nothing_is_read_off_its_edge(self):
        self.assertEqual(sa.HITS[0], 0.0)
        self.assertEqual(sa.HITS[-1], sa.HIT_CAP)
        self.assertEqual(list(sa.HITS), sorted(sa.HITS))
        grid = np.zeros((len(sa.REGIMES), len(sa.GUNS), len(sa.HITS), 1))
        for k, h in enumerate(sa.HITS):
            grid[:, :, k, :] = 100.0 - 100.0 * h
        self.assertAlmostEqual(float(sa.lookup(grid, 0, 0.97, np.array([0.95]))[0]), 5.0)
        with self.assertRaises(ValueError):
            sa.lookup(grid, 0, 0.97, np.array([0.96]))
        with self.assertRaises(ValueError):
            sa.lookup(grid, 0, 1.10, np.array([0.50]))
        # a rammer that hits Hadur with three bullets in four is read at the cap, not at some lower edge
        hit = sa.sepia_hit(robots(h=0.77, rammer=1.0), CENTRAL, 0.0)
        self.assertEqual(float(hit[0]), sa.HIT_CAP)
        self.assertAlmostEqual(float(sa.lookup(grid, 0, 0.97, hit)[0]), 5.0)


# @Tag("BENCH-294"): the inputs, the check against Hadur's measured share, and the saved estimate.
class RepoDataTest(unittest.TestCase):

    @classmethod
    def setUpClass(cls):
        cls.d, cls.meta, cls.unmatched = sa.read_inputs(ROOT)

    def test_every_robot_of_the_live_table_is_accounted_for(self):
        self.assertEqual(self.d["w"].size + len(self.unmatched), 1208)
        self.assertGreater(self.d["w"].size, 1150)
        self.assertGreater(int(self.d["shielded"].sum()), 250)
        self.assertAlmostEqual((self.d["live324"].sum() + sum(self.unmatched)) / 1208, 93.44, delta=0.01)

    def test_the_lab_table_is_read(self):
        self.assertEqual(sa.read_lab(ROOT), {"HeadOn": 1.0, "Linear": 0.5, "Circular": 2.5, "GFHist": 9.3, "Knn": 13.3,
                                             "PatternMatch": 12.5})

    def test_the_round_model_gives_back_hadurs_measured_share(self):
        fit = sa.play(self.d, 1.0, self.d["h"], rounds=40, seed=5)[0]
        miss = self.d["share313"] - fit
        self.assertLess(float(np.abs(miss).mean()), 2.5)
        self.assertLess(abs(float(miss.mean())), 1.5)
        self.assertGreater(float(np.corrcoef(fit, self.d["share313"])[0, 1]), 0.95)

    def test_the_ratios_come_from_the_lab_and_the_gait_runs(self):
        pri, refs = sa.gait_priors(ROOT)
        for low, mid, high in pri.values():
            self.assertTrue(low <= mid <= high)
        self.assertTrue(1.0 <= pri["k_punch"][1] <= 1.6)
        self.assertTrue(0.6 <= pri["stop"][2] <= 0.75)
        self.assertEqual(len(refs["punch_ratios"]), 4)
        least = refs["simple_gun_on_exact_pick"]
        self.assertLess(least["headon"], 0.02)               # a known simple aim is dodged, not sprayed
        self.assertLess(least["linear"], 0.05)

    def test_the_shares_of_every_robot_are_shares(self):
        d = self.d
        for key in ("aimed", "aim_head", "aim_lead", "aim_circ", "aim_other", "hit_simple", "hit_learned"):
            self.assertTrue(((d[key] >= 0.0) & (d[key] <= 1.0 + 1e-9)).all(), key)
        self.assertTrue((d["hit_simple"] + d["hit_learned"] <= 1.0 + 1e-9).all())
        self.assertTrue((d["aim_circ"] <= d["aim_lead"] + 1e-9).all())
        for circ in (0.0, 0.5, 1.0):
            sigma = sa.simple_share(d, circ)
            self.assertTrue(((sigma >= d["hit_simple"] - 1e-9) & (sigma <= 1.0)).all())
        self.assertGreater(float((sa.simple_share(d, 1.0) - sa.simple_share(d, 0.0)).mean()), 0.03)

    def test_no_robot_is_read_off_the_edge_of_the_grid(self):
        pri, refs = sa.gait_priors(ROOT)
        pri.update(sa.FIXED)
        d = dict(self.d, exact_floor=sa.exact_floor(self.d, refs))
        worst = {k: (v[2] if k in sa.HARMFUL else v[0]) for k, v in pri.items()}
        for a in (worst, {k: v[1] for k, v in pri.items()}):
            for _, _, keep in sa.REGIMES:
                hit = sa.sepia_hit(d, a, keep)
                self.assertTrue(((hit >= sa.HITS[0]) & (hit <= sa.HITS[-1])).all())
        # the grid once stopped at 0.45, and the robots beyond it are real: the rammers
        beyond = sa.sepia_hit(d, {k: v[1] for k, v in pri.items()}, 0.0) > 0.45
        self.assertGreater(int(beyond.sum()), 20)
        self.assertGreater(float(d["rammer"][beyond].mean()), 0.9)

    def test_the_saved_estimate_is_whole(self):
        base = os.path.join(ROOT, "docs", "bench", "local", "sepia-aps")
        with open(base + ".json", encoding="utf-8") as f:
            out = json.load(f)
        self.assertTrue(out["aps_p10"] <= out["aps_p50"] <= out["aps_p90"])
        self.assertTrue(out["corner_low"] <= out["aps_central"] <= out["corner_high"])
        self.assertLess(out["check"]["mean_abs_error"], 2.0)
        self.assertLess(abs(out["check"]["grid_mean_diff"]), 0.3)        # the grid gives back the direct play,
        self.assertLess(abs(out["check"]["grid_top_mean_diff"]), 2.0)    # in its top band as well
        self.assertGreater(out["check"]["grid_top_robots"], 15)
        self.assertEqual(sum(out["regimes"].values()) + out["shielded"], out["robots"])
        self.assertEqual(set(out["priors"]), set(out["sensitivity"]))
        with open(base + ".tsv", encoding="utf-8") as f:
            rows = list(csv.DictReader(f, delimiter="\t"))
        self.assertEqual(len(rows), out["robots"])
        self.assertEqual(sum(1 for r in rows if r["regime"] == "shield"), out["shielded"])

    def test_a_robot_that_hits_sepia_more_often_than_hadur_is_not_scored_higher(self):
        # Punching, Sepia fires no better than Hadur did. Where it is also hit more often it cannot do better
        # than Hadur 3.13 did, beyond the noise of 200 rounds. The rammers were the robots that once did.
        with open(os.path.join(ROOT, "docs", "bench", "local", "sepia-aps.tsv"), encoding="utf-8") as f:
            rows = [r for r in csv.DictReader(f, delimiter="\t") if r["regime"] == "punch"]
        more = [r for r in rows if float(r["hit_on_sepia"]) >= float(r["hit_on_hadur"])]
        self.assertGreater(len(more), 800)
        over = [float(r["sepia"]) - float(r["hadur_3_13_census"]) for r in more]
        self.assertLess(max(over), 2.0)
        rammers = [float(r["sepia"]) - float(r["hadur_3_13_census"]) for r in more if r["move_class"] == "rammer"]
        self.assertGreater(len(rammers), 60)
        self.assertLess(max(rammers), 2.0)
        self.assertLess(sum(rammers) / len(rammers), -3.0)


if __name__ == "__main__":
    unittest.main()

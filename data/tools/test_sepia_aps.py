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

CENTRAL = dict(k_punch=1.26, k_ink=1.63, stop=0.49, floor=1.0, m_simple=1.15, m_ram=1.5, gun=0.97, shield=-0.7)


def robots(n=1, **values):
    """`n` copies of one made-up robot, as the arrays read_inputs gives."""
    base = dict(w=1.0, ticks=600.0, ne=30.0, nu=25.0, h=0.05, hu=0.2, dt=15.0, du=55.0, pe=2.0, dmg_u=11.0, pu=2.2,
                other=0.0, kill_u=1.0, ram_u=0.0, ram_t=0.0, share313=90.0, live324=92.0, simple=0.0, rammer=0.0,
                shielded=0.0)
    base.update(values)
    return {k: np.full(n, v, float) for k, v in base.items()}


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
        self.assertAlmostEqual(float(sa.sepia_hit(robots(h=0.01, simple=1.0), CENTRAL, 0.0)[0]), 1.15 * 0.01)

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

    def test_the_saved_estimate_is_whole(self):
        base = os.path.join(ROOT, "docs", "bench", "local", "sepia-aps")
        with open(base + ".json", encoding="utf-8") as f:
            out = json.load(f)
        self.assertTrue(out["aps_p10"] <= out["aps_p50"] <= out["aps_p90"])
        self.assertTrue(out["corner_low"] <= out["aps_central"] <= out["corner_high"])
        self.assertLess(out["check"]["mean_abs_error"], 2.0)
        self.assertEqual(sum(out["regimes"].values()) + out["shielded"], out["robots"])
        with open(base + ".tsv", encoding="utf-8") as f:
            rows = list(csv.DictReader(f, delimiter="\t"))
        self.assertEqual(len(rows), out["robots"])
        self.assertEqual(sum(1 for r in rows if r["regime"] == "shield"), out["shielded"])


if __name__ == "__main__":
    unittest.main()

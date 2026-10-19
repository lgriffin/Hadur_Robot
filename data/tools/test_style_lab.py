"""Tests for the style lab (data/tools/style_lab): python test_style_lab.py"""

import gzip
import math
import os
import sys
import tempfile
import unittest

sys.path.insert(0, os.path.join(os.path.dirname(os.path.abspath(__file__)), "style_lab"))

import fingerprint as fpmod  # noqa: E402
import generator as gen  # noqa: E402
import guns  # noqa: E402
import movetrace  # noqa: E402

BASE = {"pref_dist": 500, "dist_gain": 0.5, "clock": "uniform", "dwell_min": 10, "dwell_span": 40,
        "levy_alpha": 1.5, "p_wave": 0, "wave_phase": 0.5, "p_stop": 0, "stop_len": 10,
        "p_stop_flip": 0.5, "v_max": 8, "p_slow": 0, "slow_v": 3, "wobble": 0, "wobble_period": 30,
        "stick": 120, "p_wall_rev": 0, "p_regime": 0, "regime_scale": 2}


def rate(res, g):
    return res[g][0] / res[g][1]


class PhysicsTest(unittest.TestCase):

    def test_speeds_up_by_one_and_slows_by_two(self):
        self.assertEqual(gen.step_velocity(0.0, 8.0), 1.0)
        self.assertEqual(gen.step_velocity(7.5, 8.0), 8.0)
        self.assertEqual(gen.step_velocity(8.0, 0.0), 6.0)
        self.assertEqual(gen.step_velocity(8.0, -8.0), 6.0)
        self.assertEqual(gen.step_velocity(1.0, -8.0), -0.5)

    def test_turn_rate_is_capped_and_walls_stop_the_robot(self):
        x, y, h, v = gen.drive(400, 300, 0.0, 8.0, math.pi / 2, 8.0)
        self.assertAlmostEqual(h, math.radians(4.0))
        x, y, h, v = gen.drive(18.5, 300, -math.pi / 2, 8.0, -math.pi / 2, 8.0)
        self.assertEqual((x, v), (18.0, 0.0))


class TraceTest(unittest.TestCase):

    def test_truth_log_round_trip(self):
        with tempfile.TemporaryDirectory() as d:
            p = os.path.join(d, "truth.log.gz")
            with gzip.open(p, "wt") as f:
                f.write("V,1\n")
                for t in range(40):
                    f.write(f"T,0,{t},{100 + t},200,1.57,1,100,500,200,0,0,100,\n")
                f.write("F,0,20,E,1.90\nF,0,25,H,3.00\n")
            tr = movetrace.read_truth(p)
            self.assertEqual(len(tr.rounds), 1)
            self.assertEqual(tr.rounds[0].fires, {20: 1.9})
            fr = movetrace.frame(tr.rounds[0])
            self.assertAlmostEqual(fr["dist"][0], 400.0)
            self.assertEqual(fr["since_fire"][19], 999.0)
            self.assertEqual(fr["since_fire"][25], 5.0)

    def test_symbols_and_reversals(self):
        self.assertEqual(list(fpmod.symbols([-8, 0, 8], [0, 0, 0])), [1, 7, 13])
        self.assertEqual(fpmod.reversals([3, 3, 0.2, -3, -3, 3]), [3, 5])


class PanelTest(unittest.TestCase):

    def test_a_still_robot_is_hit_by_everything(self):
        tr = gen.simulate(dict(BASE, v_max=0.0), seed=1, rounds=3, ticks=300)
        res = guns.run(tr)
        for g in guns.GUNS:
            self.assertGreater(rate(res, g), 0.95, g)

    def test_a_clockwork_mover_is_learned_and_a_random_one_less(self):
        clock = guns.run(gen.simulate(dict(BASE, clock="periodic", dwell_min=20), seed=2, rounds=8, ticks=500))
        rand = guns.run(gen.simulate(BASE, seed=2, rounds=8, ticks=500))
        self.assertGreater(rate(clock, "knn"), 0.5)
        self.assertLess(rate(rand, "knn"), rate(clock, "knn"))
        self.assertGreater(rate(clock, "knn"), 3 * rate(clock, "random"))

    def test_a_straight_line_falls_to_linear_not_head_on(self):
        res = guns.run(gen.simulate(dict(BASE, clock="none"), seed=3, rounds=4, ticks=400))
        self.assertGreater(rate(res, "linear"), rate(res, "head_on") + 0.3)


class FingerprintTest(unittest.TestCase):

    def test_periodic_dwell_is_seen(self):
        fp = fpmod.fingerprint([gen.simulate(dict(BASE, clock="periodic", dwell_min=30, dwell_span=0),
                                             seed=4, rounds=4, ticks=600)])
        self.assertTrue(25 <= fp["dwell_mean"] <= 35, fp["dwell_mean"])
        self.assertLess(fp["dwell_cv"], 0.5)
        self.assertEqual(len(fpmod.vector(fp)), len(fpmod.FEATURES))

    def test_wave_coupled_reversals_lock_to_the_gun_cycle(self):
        wave = fpmod.fingerprint([gen.simulate(dict(BASE, clock="none", p_wave=1.0, wave_phase=0.1),
                                               seed=5, rounds=4, ticks=600)])
        free = fpmod.fingerprint([gen.simulate(BASE, seed=5, rounds=4, ticks=600)])
        self.assertLess(wave["rev_phase_entropy"], free["rev_phase_entropy"] - 0.5)

if __name__ == "__main__":
    unittest.main()

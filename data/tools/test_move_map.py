"""Tests for move_map.py (rival movement maps): python test_move_map.py"""

import gzip
import math
import os
import tempfile
import unittest

import move_map as mm


def rows_orbit(n, lat_speed, dist=400.0):
    """Rival 400 px north of a fixed shooter, moving east at lat_speed, as T rows."""
    out = []
    for t in range(n):
        out.append((t, 400.0 + lat_speed * t, 300.0 + dist / 2, math.pi / 2, lat_speed, 100.0,
                    400.0, 300.0 - dist / 2, 0.0, 0.0, 100.0))
    return out


class GuessFactorTest(unittest.TestCase):

    def test_a_still_rival_sits_at_guess_factor_zero(self):
        _, gf_all, _, _, _, _ = mm.analyse_round(rows_orbit(120, 0.0), {})
        self.assertTrue(gf_all)
        self.assertTrue(all(abs(g) < 1e-9 for g in gf_all))
        self.assertAlmostEqual(mm.peak(gf_all), 1.0)

    def test_full_speed_straight_line_is_positive_and_below_the_escape_angle(self):
        _, gf_all, gf_fire, _, _, fx = mm.analyse_round(rows_orbit(200, 8.0), {50: 2.0})
        self.assertTrue(all(0.5 < g <= 1.0 for g in gf_all))
        self.assertEqual(len(gf_fire), 1)
        self.assertEqual(len(fx), 1)
        self.assertEqual(len(fx[0]), 7)

    def test_dance_mirrors_so_lateral_motion_is_to_the_right(self):
        east, _, _, _, _, _ = mm.analyse_round(rows_orbit(120, 8.0), {})
        west, _, _, _, _, _ = mm.analyse_round(rows_orbit(120, -8.0), {})
        self.assertTrue(all(d[0] > 0 for d in east))
        self.assertTrue(all(d[0] > 0 for d in west))

    def test_peak_of_a_flat_profile_is_about_half_the_window(self):
        flat = [-1 + 2 * i / 9999 for i in range(10000)]
        self.assertAlmostEqual(mm.peak(flat), mm.WINDOW / 2, delta=0.002)

    def test_learning_gun_needs_enough_shots(self):
        self.assertTrue(math.isnan(mm.knn_gun([(0,) * 7] * 100)))
        always_same = [(0.5, 0.5, 0.0, 0.5, 0.5, 0.0, 0.3)] * 500
        self.assertAlmostEqual(mm.knn_gun(always_same), 1.0)


class CollectTest(unittest.TestCase):

    def test_runs_merge_by_rival_and_split_by_shooter(self):
        with tempfile.TemporaryDirectory() as d:
            for run, shooter in (("x.Rival_1.0", "sample.TrackFire"), ("x.Rival_1.0-shadow", "abc.Shadow_3.83c")):
                b = os.path.join(d, run, "battles", shooter + "-1")
                os.makedirs(b)
                with gzip.open(os.path.join(b, "truth.log.gz"), "wt") as f:
                    f.write("V,1\n")
                    for r in rows_orbit(100, 6.0):
                        f.write(f"T,0,{r[0]}," + ",".join(f"{v:.2f}" for v in r[1:]) + ",\n")
                    f.write("F,0,40,E,2.00\n")
                with open(os.path.join(b, "result.csv"), "w") as f:
                    f.write("ok,rounds,theirBulletDamage,enemyShots\ntrue,1,8.0,4\n")
            data = mm.collect(d)
            self.assertEqual(list(data), ["x.Rival_1.0"])
            self.assertEqual(sorted(data["x.Rival_1.0"]), ["abc.Shadow_3.83c", "sample.TrackFire"])
            m = mm.metrics(data["x.Rival_1.0"]["sample.TrackFire"])
            self.assertEqual(m["shots_seen"], 1)
            self.assertAlmostEqual(m["damage_per_shot"], 2.0)


if __name__ == "__main__":
    unittest.main()

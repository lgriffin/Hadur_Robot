"""BENCH-240: the field diagnosis names the cause of each gap from both arms' play."""

import gzip
import os
import tempfile
import unittest

import diagnose_field as D

BASE = {"power": 1.5, "fires": 40, "still": 0.1, "dist": 450, "wall": 0.1, "ticks": 1000, "aimed": 30,
        "hit": 0.10, "taken": 10.0, "dealt": 20.0, "surv": 0.9, "share": 0.8}


def arm(**kw):
    d = dict(BASE)
    d.update(kw)
    return d


class DiagnoseTest(unittest.TestCase):

    def test_same_play_has_no_diagnosis(self):
        self.assertEqual(D.diagnose(arm(), arm()), [])

    def test_beepboop_standing_still_while_we_move_is_shield(self):
        self.assertIn("SHIELD", D.diagnose(arm(), arm(still=0.9, hit=0.01)))

    def test_both_still_but_we_leak_is_shield_quality(self):
        self.assertEqual(D.diagnose(arm(still=0.9, hit=0.05), arm(still=0.95, hit=0.01)), ["SHQ"])

    def test_low_power_in_a_long_round_is_cap(self):
        self.assertEqual(D.diagnose(arm(), arm(power=0.3, ticks=2000)), ["CAP"])

    def test_dodging_better_while_moving_is_move(self):
        self.assertEqual(D.diagnose(arm(), arm(hit=0.05)), ["MOVE"])

    def test_more_damage_dealt_is_gun_and_harder_shots_are_hard(self):
        self.assertEqual(D.diagnose(arm(), arm(dealt=30.0)), ["GUN"])
        self.assertEqual(D.diagnose(arm(), arm(power=2.2)), ["HARD"])

    def test_distance_and_wall(self):
        self.assertEqual(D.diagnose(arm(), arm(dist=560, wall=0.3)), ["DIST", "WALL"])

    def test_motion_from_a_truth_log(self):
        with tempfile.TemporaryDirectory() as tmp:
            path = os.path.join(tmp, "truth.log.gz")
            with gzip.open(path, "wt", encoding="utf-8") as f:
                f.write("V,1\n")
                f.write("T,0,1,30.00,300.00,0.00,0.00,100.00,430.00,300.00,0.00,8.00,100.00,\n")
                f.write("T,0,2,30.00,300.00,0.00,8.00,99.00,430.00,300.00,0.00,8.00,100.00,H:40.00:300.00:1.571:1.00\n")
            m = D.read_motion(path)
        self.assertEqual(m["turns"], 2)
        self.assertEqual(m["still"], 1)
        self.assertEqual(m["wall"], 2)
        self.assertEqual(m["fires"], 1)
        self.assertAlmostEqual(m["power"], 1.0)
        self.assertAlmostEqual(m["dist"] / m["turns"], 400.0)


if __name__ == "__main__":
    unittest.main()

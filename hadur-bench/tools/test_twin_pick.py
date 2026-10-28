"""Tests for tools/twin_pick.py, TwinSaor's per-team mode picks (docs/twinsaor.md section 9)."""
import os
import sys
import tempfile
import unittest

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import twin_pick  # noqa: E402


def battles(values):
    return {"s-%d" % i: v for i, v in enumerate(values)}


class TwinPickTest(unittest.TestCase):
    def test_reads_our_share_and_the_opposing_team_from_a_battle(self):
        d = tempfile.mkdtemp()
        path = os.path.join(d, "team.csv")
        with open(path, "w", encoding="utf-8") as f:
            f.write("rank,team,score,firsts,survival,bulletDamage\n"
                    "1,hadur117.twin.TwinSaor 0.1 (1),6000,28,3650,9176\n"
                    "2,jk.team.NightAndDay 1.6 (2),4000,7,3350,6716\n")
        team, share = twin_pick.battle(path)
        self.assertEqual(team, "jk.team.NightAndDay 1.6")
        self.assertAlmostEqual(share, 60.0)

    def test_an_unfinished_battle_is_skipped(self):
        d = tempfile.mkdtemp()
        path = os.path.join(d, "team.csv")
        with open(path, "w", encoding="utf-8") as f:
            f.write("rank,team,score,firsts,survival,bulletDamage\n")
        self.assertIsNone(twin_pick.battle(path))

    def test_pairs_by_battle(self):
        r = twin_pick.paired(battles([40, 50, 60]), battles([44, 54, 66]))
        self.assertEqual(r["n"], 3)
        self.assertAlmostEqual(r["diff"], 14 / 3)
        self.assertGreater(r["se"], 0)

    def test_the_pick_needs_the_gain_and_a_low_end_above_zero(self):
        control = {"t": battles([40, 50, 60, 45])}
        big_noisy = battles([60, 40, 80, 45])  # +7.5 but a low end below zero
        small_steady = battles([42, 52, 62, 47])  # +2, steady, under the gain
        steady = battles([44, 54, 64, 49])  # +4, steady
        p = twin_pick.pick(control, {"N": {"t": big_noisy}, "S": {"t": small_steady}, "W": {"t": steady}}, 3.0)
        self.assertEqual(p["t"][0], "W")

    def test_the_aa_arm_is_never_picked_and_no_clear_arm_keeps_the_control(self):
        control = {"t": battles([40, 50, 60, 45])}
        p = twin_pick.pick(control, {"A": {"t": battles([50, 60, 70, 55])}}, 3.0, aa="A")
        self.assertIsNone(p["t"][0])
        self.assertAlmostEqual(p["t"][2]["diff"], 10.0)


if __name__ == "__main__":
    unittest.main()

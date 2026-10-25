"""Tests for tools/saor_arms.py, the read of Saor's arm screen (docs/saor.md)."""
import os
import sys
import tempfile
import unittest

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import saor_arms  # noqa: E402

HEADER = "rank,robot,score,firsts,survival,bulletDamage\n"


def battle(root, run, n, rows, field="F01"):
    d = os.path.join(root, run, field, "battles", "melee-%d" % n)
    os.makedirs(d)
    with open(os.path.join(d, "melee.csv"), "w", encoding="utf-8") as f:
        f.write(HEADER)
        for i, (name, score, firsts, survival, damage) in enumerate(rows):
            f.write("%d,%s,%d,%d,%d,%d\n" % (i + 1, name, score, firsts, survival, damage))


class SaorArmsTest(unittest.TestCase):
    # @Tag("SAOR-12")
    def test_an_arm_is_paired_per_opponent_against_the_control(self):
        root = tempfile.mkdtemp()
        # Control: 50% against A, 25% against B. Arm X: 75% against A, 25% against B.
        battle(root, "census-C", 1, [("hadur117.micro.SaorC 0.1", 100, 1, 1, 1), ("a.A 1", 100, 0, 0, 0), ("b.B 1", 300, 0, 0, 0)])
        battle(root, "census-X", 1, [("hadur117.micro.SaorX 0.1", 300, 1, 1, 1), ("a.A 1", 100, 0, 0, 0), ("b.B 1", 900, 0, 0, 0)])
        rows = saor_arms.read(root, ["C", "X"], "C", 66.0, pairings=2)
        self.assertEqual(rows[0]["diff"], 0.0)
        self.assertAlmostEqual(rows[1]["aps"], 50.0)
        self.assertAlmostEqual(rows[1]["diff"], 12.5)
        self.assertEqual(rows[1]["paired"], 1)
        self.assertFalse(rows[1]["top5"])
        self.assertIn("| X | 50.00", saor_arms.render(rows, "C", 66.0))

    # @Tag("SAOR-12")
    def test_a_short_census_never_clears_the_bar(self):
        root = tempfile.mkdtemp()
        for n in (1, 2):
            battle(root, "census-C", n, [("hadur117.micro.SaorC 0.1", 900, 1, 1, 1), ("a.A 1", 100, 0, 0, 0)])
        full = saor_arms.read(root, ["C"], "C", 66.0, pairings=1)
        short = saor_arms.read(root, ["C"], "C", 66.0, pairings=156)
        self.assertTrue(full[0]["top5"])
        self.assertFalse(short[0]["top5"])

    # @Tag("SAOR-12")
    def test_the_interval_is_seed_to_seed_within_fields(self):
        groups = {"F01": [60.0, 70.0], "F02": [65.0, 65.0]}
        # F01: sd 7.07, se 5.0, half 9.8; F02: 0. Combined over two fields: 9.8 / 2.
        self.assertAlmostEqual(saor_arms.seed_half(groups), 1.96 * 5.0 / 2)
        diff, half, n = saor_arms.compare({"F01": [70.0, 80.0]}, {"F01": [60.0, 70.0]})
        self.assertEqual((diff, n), (10.0, 1))
        self.assertAlmostEqual(half, (2 * (1.96 * 5.0) ** 2) ** 0.5)

    # @Tag("SAOR-12")
    def test_the_top5_bar_needs_the_whole_interval_above_it(self):
        self.assertEqual(saor_arms.interval([70.0, 70.0]), (70.0, 0.0))
        mean, half = saor_arms.interval([60.0, 80.0])
        self.assertEqual(mean, 70.0)
        self.assertGreater(half, 4.0)


if __name__ == "__main__":
    unittest.main()

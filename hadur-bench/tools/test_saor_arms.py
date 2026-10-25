"""Tests for tools/saor_arms.py, the read of Saor's arm screen (docs/saor.md)."""
import os
import sys
import tempfile
import unittest

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import saor_arms  # noqa: E402

HEADER = "rank,robot,score,firsts,survival,bulletDamage\n"


def battle(root, run, n, rows):
    d = os.path.join(root, run, "battles", "melee-%d" % n)
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
        rows = saor_arms.read(root, ["C", "X"], "C", 66.0)
        self.assertEqual(rows[0]["diff"], 0.0)
        self.assertAlmostEqual(rows[1]["aps"], 50.0)
        self.assertAlmostEqual(rows[1]["diff"], 12.5)
        self.assertEqual(rows[1]["paired"], 2)
        self.assertFalse(rows[1]["top5"])
        self.assertIn("| X | 50.00", saor_arms.render(rows, "C", 66.0))

    # @Tag("SAOR-12")
    def test_the_top5_bar_needs_the_whole_interval_above_it(self):
        self.assertEqual(saor_arms.interval([70.0, 70.0]), (70.0, 0.0))
        mean, half = saor_arms.interval([60.0, 80.0])
        self.assertEqual(mean, 70.0)
        self.assertGreater(half, 4.0)


if __name__ == "__main__":
    unittest.main()

"""Tests for arm_pair.py (BENCH-269): python3 -m unittest discover -s hadur-bench/tools -p test_arm_pair.py"""
import os
import tempfile
import unittest

import arm_pair

HEADER = "arm\topponent\tseed\tok\tscore_share"


class ArmPairTest(unittest.TestCase):
    def write(self, rows):
        d = tempfile.mkdtemp()
        p = os.path.join(d, "arms.tsv")
        with open(p, "w") as f:
            f.write(HEADER + "\n" + "\n".join("\t".join(map(str, r)) for r in rows) + "\n")
        return p

    def test_pairs_by_seed_and_names_robots(self):
        rows = []
        for seed in (1, 2, 3):
            rows += [("n", "a.Foo 1.0", seed, "true", 0.50), ("t", "a.Foo 1.0", seed, "true", 0.56 + seed / 100)]
            rows += [("n", "b.Bar 1.0", seed, "true", 0.70), ("t", "b.Bar 1.0", seed, "true", 0.70)]
            rows += [("c", "b.Bar 1.0", seed, "true", 0.10)]
        rows.append(("t", "b.Bar 1.0", 4, "true", 0.99))  # no baseline on seed 4: not paired
        rows.append(("n", "a.Foo 1.0", 5, "false", 0.0))  # failed battle: dropped
        n, (m, _), lines = arm_pair.pair(self.write(rows), "t", "n", ["Foo", "Nobody"])
        self.assertEqual(2, n)
        self.assertAlmostEqual((8 + 0) / 2, m)
        self.assertEqual("Foo", lines[0][0])
        self.assertEqual(3, lines[0][1])
        self.assertAlmostEqual(8, lines[0][2])
        self.assertEqual(0, lines[1][1])

    def test_report_names_the_arms(self):
        rows = [("n", "a.Foo 1.0", s, "true", 0.5) for s in (1, 2)] + [("t", "a.Foo 1.0", s, "true", 0.6) for s in (1, 2)]
        text = arm_pair.report(self.write(rows), "t", "n", ["Foo"])
        self.assertIn("## t against n", text)
        self.assertIn("| Foo | 2 | +10.00", text)


if __name__ == "__main__":
    unittest.main()

"""BENCH-126: tools/per_robot.py lists every opponent, losses included."""
import os
import sys
import tempfile
import unittest

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import per_robot  # noqa: E402

ROWS = [("c", "x.A 1", 0.80), ("aa", "x.A 1", 0.82), ("s4", "x.A 1", 0.95),
        ("c", "x.B 1", 0.90), ("s4", "x.B 1", 0.80), ("s4", "x.C 1", 0.50)]


class PerRobotTest(unittest.TestCase):
    def test_wins_and_losses_listed(self):
        d = tempfile.mkdtemp()
        tsv = os.path.join(d, "arms.tsv")
        with open(tsv, "w", encoding="utf-8") as f:
            f.write("arm\topponent\tok\tscore_share\n")
            for arm, opp, s in ROWS:
                f.write("%s\t%s\ttrue\t%s\n" % (arm, opp, s))
        md, out = os.path.join(d, "r.md"), os.path.join(d, "r.tsv")
        self.assertEqual(0, per_robot.main([tsv, "--arms", "s4", "--out", md, "--out-tsv", out]))
        lines = open(out, encoding="utf-8").read().splitlines()[1:]
        self.assertEqual(["x.A 1", "x.B 1"], [l.split("\t")[0] for l in lines])  # x.C has no control
        self.assertAlmostEqual(14.0, float(lines[0].split("\t")[3]))
        self.assertAlmostEqual(-10.0, float(lines[1].split("\t")[3]))


if __name__ == "__main__":
    unittest.main()

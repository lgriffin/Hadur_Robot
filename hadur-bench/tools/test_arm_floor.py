"""BENCH-260: arm_floor.py stops a card when the candidate arm is below the floor."""
import os
import sys
import tempfile
import unittest

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import arm_floor  # noqa: E402

HEAD = "arm\topponent\trole\tseed\tok\tscore_share\n"


def write(rows):
    d = tempfile.mkdtemp()
    p = os.path.join(d, "arms.tsv")
    with open(p, "w") as f:
        f.write(HEAD + "".join("%s\t%s\tr\t%d\ttrue\t%.4f\n" % r for r in rows))
    return p, os.path.join(d, "out.md")


def rows(ic):
    out = []
    for o in ("a.A 1", "b.B 1", "c.C 1"):
        for s in (1, 2):
            out += [("c", o, s, 0.80), ("aa", o, s, 0.80), ("ic", o, s, ic)]
    return out


class ArmFloorTest(unittest.TestCase):
    def test_goes_on_when_above_floor(self):
        p, out = write(rows(0.82))
        self.assertEqual(0, arm_floor.main([p, "--arm", "ic", "--floor", "0", "--min", "3", "--out", out]))
        self.assertIn("GO ON", open(out).read())

    def test_stops_when_below_floor(self):
        p, out = write(rows(0.78))
        self.assertEqual(1, arm_floor.main([p, "--arm", "ic", "--floor", "0", "--min", "3", "--out", out]))
        self.assertIn("STOP", open(out).read())

    def test_stops_when_too_few_robots(self):
        p, out = write(rows(0.82))
        self.assertEqual(1, arm_floor.main([p, "--arm", "ic", "--floor", "0", "--min", "4", "--out", out]))


if __name__ == "__main__":
    unittest.main()

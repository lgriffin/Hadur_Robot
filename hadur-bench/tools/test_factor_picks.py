import os
import random
import sys
import tempfile
import unittest

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import factor_picks  # noqa: E402

DESIGN = os.path.join(os.path.dirname(os.path.abspath(__file__)), "..", "plans", "top5-factorial.design")
HEAD = "arm\topponent\tseed\tok\tscore_share\n"


class FactorPicksTest(unittest.TestCase):
    """BENCH-110: per-opponent factor picks with a held-out gain."""

    def run_on(self, rows, margin=5):
        with tempfile.TemporaryDirectory() as d:
            p = os.path.join(d, "arms.tsv")
            with open(p, "w") as f:
                f.write(HEAD + "".join(rows))
            return factor_picks.report([p], DESIGN, margin, 1000)

    def test_one_robot_that_wants_hj(self):
        factors, arms = factor_picks.multiarm.read_design(DESIGN)
        rnd = random.Random(1)
        rows = []
        for a, pt in arms.items():
            rows.append("%s\tA 1\t1\ttrue\t%.4f\n" % (a, 0.60 + (0.20 if pt["hj"] > 0 else 0)))
            for k in range(30):
                rows.append("%s\tN%d 1\t1\ttrue\t%.4f\n" % (a, k, 0.80 + rnd.gauss(0, 0.01)))
        _, data, rows_out, tsv, _ = self.run_on(rows)
        hj = [r for r in rows_out if r[0] == "hj"][0]
        self.assertEqual(1, hj[2], "only A is picked for hj")
        self.assertAlmostEqual(20 / 1000, hj[4], places=6)
        self.assertIn(("A 1", "hj"), [(o, f) for o, f, _ in tsv])
        others = [r for r in rows_out if r[0] != "hj"]
        self.assertTrue(all(abs(r[4]) < 1e-9 for r in others), "no other factor gains")

    def test_noise_picks_gain_nothing_on_average(self):
        _, arms = factor_picks.multiarm.read_design(DESIGN)
        rnd = random.Random(7)
        rows = ["%s\tN%d 1\t1\ttrue\t%.4f\n" % (a, k, 0.8 + rnd.gauss(0, 0.06)) for a in arms for k in range(200)]
        _, _, rows_out, _, _ = self.run_on(rows)
        mean_gain = sum(r[4] for r in rows_out) / len(rows_out)
        self.assertLess(abs(mean_gain), 0.05, "held out, chance picks average about 0 (noise sd about 0.015)")

    def test_off_picks_and_incomplete_robots_gain_nothing(self):
        _, arms = factor_picks.multiarm.read_design(DESIGN)
        rows = []
        for a, pt in arms.items():
            for k in range(5):
                rows.append("%s\tB%d 1\t1\ttrue\t%.4f\n" % (a, k, 0.80 - (0.20 if pt["hj"] > 0 else 0)))
            if a != "c" and a != "aa":
                rows.append("%s\tX 1\t1\ttrue\t%.4f\n" % (a, 0.60 + (0.20 if pt["hj"] > 0 else 0)))
        _, data, rows_out, _, dropped = self.run_on(rows)
        self.assertEqual(1, dropped, "X lacks the control point")
        self.assertNotIn("X 1", data)
        hj = [r for r in rows_out if r[0] == "hj"][0]
        self.assertEqual(5, hj[2], "the B robots are picked (hj hurts them)")
        self.assertEqual(0, hj[3])
        self.assertAlmostEqual(0.0, hj[4], places=9, msg="staying at the shipped off state gains nothing")


if __name__ == "__main__":
    unittest.main()

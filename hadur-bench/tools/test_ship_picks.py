"""BENCH-162: ship_picks.py writes a pick onto the 1v1 tables as the candidate build did."""

import os
import sys
import tempfile
import unittest

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import ship_picks as sp  # noqa: E402

LIST = """    static String[] lines() {
        return new String[] {
            "a.Listed 1.0",
            "b.StopGo 1.0",
        };
    }
"""
TABLE = "".join("""    static String[] %s() {
        return new String[] {
        };
    }
""" % m for m in ("stopGos", "stopGoShifts", "exitOffs", "stills"))


# @Tag("BENCH-162")
class ShipPicksTest(unittest.TestCase):

    def test_arm_codes(self):
        self.assertEqual(sp.parts("mtzl"), ["mt", "zl"])
        self.assertEqual(sp.parts("zlx0"), ["zl", "x0"])
        self.assertEqual(sp.parts("mdwm"), ["md", "wm"])
        with self.assertRaises(ValueError):
            sp.parts("kl")

    def test_apply(self):
        d = tempfile.mkdtemp()
        lp, tp = os.path.join(d, "L.java"), os.path.join(d, "T.java")
        open(lp, "w").write(LIST)
        open(tp, "w").write(TABLE)
        picks = [("c.New 1.0", "mtzl"), ("a.Listed 1.0", "zlx0"), ("b.StopGo 1.0", "mdwl"), ("d.Free 1.0", "mdwm")]
        sp.apply(picks, lp, tp, "test")
        ls, ts = open(lp).read(), open(tp).read()
        self.assertIn('"c.New 1.0",', ls)
        self.assertNotIn('"b.StopGo 1.0"', ls, "a stop-and-go pick leaves the shield list")
        self.assertIn('"a.Listed 1.0",', ls)

        def body(m):
            h = ts.index("static String[] %s()" % m)
            return ts[h:ts.index("        };", h)]
        self.assertIn("c.New 1.0", body("stills"))
        self.assertIn("a.Listed 1.0", body("stills"))
        self.assertIn("a.Listed 1.0", body("exitOffs"))
        self.assertIn("b.StopGo 1.0", body("stopGos"))
        self.assertIn("d.Free 1.0", body("stopGoShifts"))
        with self.assertRaises(SystemExit):
            sp.apply([("a.Listed 1.0", "mt")], lp, tp, "again")


if __name__ == "__main__":
    unittest.main()

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
        sp.apply([("b.StopGo 1.0", "mdwl")], lp, tp, "again")
        self.assertEqual(open(tp).read().count('"b.StopGo 1.0"'), 1, "a line already in the table is not added twice")
        sp.apply([("d.Free 1.0", "wl")], lp, tp, "variant 1 now")
        ts = open(tp).read()
        self.assertIn("d.Free 1.0", sp.body(ts, "stopGos"))
        self.assertNotIn("d.Free 1.0", sp.body(ts, "stopGoShifts"), "one stop-and-go variant per robot")
        with self.assertRaises(SystemExit):
            sp.apply([("a.Listed 1.0", "mt")], lp, tp, "again")

    def test_codes_from_combined_arm(self):
        """A confirm card's pick says rp; the card's input lists give each robot's own codes."""
        d = tempfile.mkdtemp()
        pre = os.path.join(d, "near")
        lists = {"add": ["c.New 1.0"], "drop": ["b.StopGo 1.0"], "still": ["c.New 1.0", "a.Listed 1.0"],
                 "exit0": ["a.Listed 1.0"], "stopgo": ["b.StopGo 1.0"], "stopgo2": ["d.Free 1.0"]}
        for k, v in lists.items():
            open("%s-%s.txt" % (pre, k), "w").write("# header\n" + "".join(n + "\n" for n in v))
        codes = sp.codes_from(pre)
        self.assertEqual(codes, {"c.New 1.0": "mtzl", "a.Listed 1.0": "zlx0", "b.StopGo 1.0": "mdwl", "d.Free 1.0": "wm"})
        pick = os.path.join(d, "pick.tsv")
        open(pick, "w").write("c.New 1.0\trp\t9.1\t3.2\t8\t8\nb.StopGo 1.0\trp\t4.0\t3.1\t8\t8\n")
        with self.assertRaises(ValueError):
            [sp.parts(arm) for _, arm in sp.read_picks(pick)]
        picks = sp.recode(sp.read_picks(pick), codes)
        self.assertEqual(picks, [("c.New 1.0", "mtzl"), ("b.StopGo 1.0", "mdwl")])
        lp, tp = os.path.join(d, "L.java"), os.path.join(d, "T.java")
        open(lp, "w").write(LIST)
        open(tp, "w").write(TABLE)
        sp.apply(picks, lp, tp, "near")
        self.assertIn('"c.New 1.0",', open(lp).read())
        self.assertNotIn('"b.StopGo 1.0"', open(lp).read())
        with self.assertRaises(SystemExit):
            sp.recode([("z.Unknown 1.0", "rp")], codes)
        self.assertEqual(sp.recode([("c.New 1.0", "mtzl")], codes), [("c.New 1.0", "mtzl")])
        with self.assertRaises(SystemExit, msg="a different arm is refused, not replaced"):
            sp.recode([("c.New 1.0", "zl")], codes)
        os.remove(pre + "-stopgo2.txt")
        with self.assertRaises(SystemExit, msg="a missing list file is refused"):
            sp.codes_from(pre)

    def test_rival_near_lists(self):
        """Every robot on the rival-near panel gets a code ship_picks accepts."""
        here = os.path.join(os.path.dirname(os.path.abspath(__file__)), "..")
        codes = sp.codes_from(os.path.join(here, "plans", "rival-near"))
        panel = sp.names(os.path.join(here, "panel-rival-near.txt"))
        self.assertEqual(sorted(codes), sorted(panel))
        for n in panel:
            sp.parts(codes[n])


if __name__ == "__main__":
    unittest.main()

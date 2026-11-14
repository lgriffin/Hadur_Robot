"""BENCH-244: lock_prep.py turns a screen's picks into a lock panel, lock arms and per-arm rebuilds."""
import os
import sys
import tempfile
import unittest

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import lock_prep  # noqa: E402


class LockPrepTest(unittest.TestCase):
    def setUp(self):
        self.d = tempfile.mkdtemp()
        self.panel = os.path.join(self.d, "panel.txt")
        with open(self.panel, "w") as f:
            f.write("# head\na.A 1 | r | a.A_1.jar\nb.B 2 | r | b.B_2.jar\nc.C 3 | r | c.C_3.jar\n")
        self.arms = os.path.join(self.d, "base.arms")
        with open(self.arms, "w") as f:
            f.write("# arms\n" + "".join("%s | hadur117.Hadur 3.22%s | x\n" % (a, "" if a == "c" else a)
                                         for a in ("c", "aa", "mtzl", "fq", "gl")))

    def run_prep(self, rows):
        pick = os.path.join(self.d, "pick.tsv")
        if rows is not None:
            with open(pick, "w") as f:
                f.write("".join("\t".join(r) + "\n" for r in rows))
        out = os.path.join(self.d, "out")
        self.assertEqual(0, lock_prep.main(pick, self.panel, self.arms, out))
        return out

    def test_picks_make_panel_arms_and_builds(self):
        out = self.run_prep([("robot", "arm", "gain"), ("a.A 1", "mtzl", "6.1"), ("c.C 3", "gl", "4.0")])
        self.assertEqual(["a.A 1 | r | a.A_1.jar\n", "c.C 3 | r | c.C_3.jar\n"], open(os.path.join(out, "picks-panel.txt")).readlines())
        arms = [l.split("|")[0].strip() for l in open(os.path.join(out, "lock.arms")) if not l.startswith("#")]
        self.assertEqual(["c", "aa", "mtzl", "gl"], arms)
        self.assertEqual("a.A 1\n", open(os.path.join(out, "mtzl.list")).read())
        build = open(os.path.join(out, "build.sh")).read()
        self.assertIn("SHIELD_ADD=%s SHIELD_STILL=%s bash ./build-ablation.sh slistadd,szlist" % ((os.path.join(out, "mtzl.list"),) * 2), build)
        self.assertIn("GUN_STACK=%s bash ./build-ablation.sh gslist" % os.path.join(out, "gl.list"), build)
        self.assertNotIn("fllist", build)

    def test_no_pick_leaves_an_empty_panel(self):
        for rows in ([], None):
            out = self.run_prep(rows)
            self.assertEqual("", open(os.path.join(out, "picks-panel.txt")).read())
            self.assertEqual("set -e\n", open(os.path.join(out, "build.sh")).read())


if __name__ == "__main__":
    unittest.main()

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
        posix = lambda name: os.path.join(out, name).replace(os.sep, "/")  # build.sh runs in bash, Windows too
        self.assertIn("SHIELD_ADD=%s SHIELD_STILL=%s bash ./build-ablation.sh slistadd,szlist" % ((posix("mtzl.list"),) * 2), build)
        self.assertIn("GUN_STACK=%s bash ./build-ablation.sh gslist" % posix("gl.list"), build)
        self.assertNotIn("\\", build, "no backslash path reaches bash")
        self.assertNotIn("fllist", build)

    def test_restrict_keeps_only_each_robots_own_pick(self):
        out = self.run_prep([("a.A 1", "mtzl", "6.1"), ("c.C 3", "gl", "4.0")])
        arms = os.path.join(self.d, "arms.tsv")
        rows = [("c", "a.A 1"), ("aa", "c.C 3"), ("mtzl", "a.A 1"), ("mtzl", "c.C 3"), ("gl", "a.A 1"), ("gl", "c.C 3")]
        with open(arms, "w") as f:
            f.write("arm\trobot\topponent\n" + "".join("%s\tH\t%s\n" % r for r in rows))
        picked = os.path.join(self.d, "picked.tsv")
        self.assertEqual(0, lock_prep.restrict(arms, out, picked))
        kept = [tuple(l.rstrip("\n").split("\t")[::2]) for l in open(picked)][1:]
        self.assertEqual([("c", "a.A 1"), ("aa", "c.C 3"), ("mtzl", "a.A 1"), ("gl", "c.C 3")], kept)

    def test_ram_wait_pick_builds_its_list(self):
        # MOVE-46: a ram-wait pick (arm rwl) gets its own list and an rwlist rebuild.
        with open(self.arms, "a") as f:
            f.write("rwl | hadur117.Hadur 3.22rwl | x\n")
        out = self.run_prep([("b.B 2", "rwl", "1.2")])
        self.assertEqual("b.B 2\n", open(os.path.join(out, "rwl.list")).read())
        posix = os.path.join(out, "rwl.list").replace(os.sep, "/")
        self.assertIn("RAM_WAIT=%s bash ./build-ablation.sh rwlist" % posix, open(os.path.join(out, "build.sh")).read())

    def test_no_pick_leaves_an_empty_panel(self):
        for rows in ([], None):
            out = self.run_prep(rows)
            self.assertEqual("", open(os.path.join(out, "picks-panel.txt")).read())
            self.assertEqual("set -e\n", open(os.path.join(out, "build.sh")).read())

    def test_power_band_picks_carry_their_fitted_lines(self):
        lines = os.path.join(self.d, "pb.txt")
        with open(lines, "w") as f:
            f.write("# fitted\n0.40 0.30 0.30 0.30 a.A 1\n1.0 1.0 1.0 2.0 b.B 2\n")
        with open(self.arms, "a") as f:
            f.write("pb | hadur117.Hadur 3.22pb | x\n")
        old, lock_prep.PB_LINES = lock_prep.PB_LINES, lines
        try:
            out = self.run_prep([("a.A 1", "pb", "8.0")])
            self.assertEqual("0.40 0.30 0.30 0.30 a.A 1\n", open(os.path.join(out, "pb.list")).read())
            self.assertIn("POWER_BAND=%s bash ./build-ablation.sh pblist" % os.path.join(out, "pb.list").replace(os.sep, "/"),
                          open(os.path.join(out, "build.sh")).read())
            arms = os.path.join(self.d, "arms.tsv")
            with open(arms, "w") as f:
                f.write("arm\trobot\topponent\npb\tH\ta.A 1\npb\tH\tb.B 2\n")
            picked = os.path.join(self.d, "picked.tsv")
            lock_prep.restrict(arms, out, picked)
            self.assertEqual(["pb\tH\ta.A 1\n"], open(picked).readlines()[1:])
            with self.assertRaises(SystemExit):
                self.run_prep([("c.C 3", "pb", "5.0")])
        finally:
            lock_prep.PB_LINES = old


if __name__ == "__main__":
    unittest.main()

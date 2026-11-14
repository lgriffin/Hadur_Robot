"""BENCH-245: live_match.py passes a bench that scores us and BeepBoop as live does, and fails a harsh or partial one."""
import os
import sys
import tempfile
import unittest

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import live_match  # noqa: E402

HEAD = "arm\trobot\topponent\tseed\tok\tscore_share\tskippedTurns\n"
MATCH = [("c", "a.A", 0.61, 5), ("bb", "a.A", 0.79, 30), ("c", "b.B", 0.69, 5),
         ("bb", "b.B", 0.91, 30), ("c", "c.C", 0.51, 5), ("bb", "c.C", 0.70, 30)]


class LiveMatchTest(unittest.TestCase):
    def setUp(self):
        self.d = tempfile.mkdtemp()
        self.live = os.path.join(self.d, "live.tsv")
        with open(self.live, "w") as f:
            f.write("# live\nrobot\thadur\tbeepboop\na.A\t60.0\t80.0\nb.B\t70.0\t90.0\nc.C\t50.0\t70.0\n")
        self.panel = os.path.join(self.d, "panel.txt")
        with open(self.panel, "w") as f:
            f.write("# panel\na.A 1.0 | r | a.jar\nb.B 1.0 | r | b.jar\nc.C 1.0 | r | c.jar\n")

    def arms(self, rows):
        """rows: (arm, opponent, share, skips[, seed[, ok]])"""
        p = os.path.join(self.d, "arms.tsv")
        with open(p, "w") as f:
            f.write(HEAD)
            for r in rows:
                arm, opp, share, skips = r[:4]
                seed = r[4] if len(r) > 4 else "1"
                ok = r[5] if len(r) > 5 else "true"
                f.write("%s\tx\t%s 1.0\t%s\t%s\t%.4f\t%d\n" % (arm, opp, seed, ok, share, skips))
        return p

    def run_main(self, p, *extra):
        return live_match.main([p, "--live", self.live, "--panel", self.panel, *extra])

    def test_matching_bench_passes(self):
        out = os.path.join(self.d, "r.md")
        self.assertEqual(0, self.run_main(self.arms(MATCH), "--out", out))
        self.assertIn("PASS", open(out).read())

    def test_harsh_bench_fails(self):
        """BeepBoop starved of time: it skips hundreds of turns and the gap halves."""
        p = self.arms([("c", "a.A", 0.64, 30), ("bb", "a.A", 0.72, 500), ("c", "b.B", 0.73, 30),
                       ("bb", "b.B", 0.83, 500), ("c", "c.C", 0.54, 30), ("bb", "c.C", 0.62, 500)])
        res = live_match.check(live_match.read_arms(p, "c", "bb"), live_match.read_live(self.live),
                               "c", "bb", 4.0, 3.0, 100.0)
        self.assertEqual("FAIL", res["verdict"])
        self.assertEqual(3, len(res["reasons"]))
        self.assertEqual(live_match.FAIL_EXIT, self.run_main(p))

    def test_no_overlap_fails(self):
        p = self.arms([("c", "z.Z", 0.6, 0), ("bb", "z.Z", 0.8, 0)])
        self.assertEqual(live_match.FAIL_EXIT, live_match.main([p, "--live", self.live, "--panel", "none"]))

    def test_failed_battle_leaves_robot_out_and_fails_panel(self):
        """BeepBoop's battle on c.C failed: c.C has no paired seed, so the panel is incomplete."""
        rows = MATCH[:5] + [("bb", "c.C", 0.70, 30, "1", "false")]
        self.assertEqual(live_match.FAIL_EXIT, self.run_main(self.arms(rows)))
        self.assertEqual(0, live_match.main([self.arms(rows), "--live", self.live, "--panel", "none"]))

    def test_unpaired_seeds_are_dropped(self):
        """A seed only one arm finished does not enter either arm's mean."""
        rows = MATCH + [("c", "a.A", 0.10, 5, "2")]
        arms = live_match.read_arms(self.arms(rows), "c", "bb")
        self.assertEqual(1, len(arms["c"]["a.A"]))
        self.assertAlmostEqual(61.0, arms["c"]["a.A"][0][0])

    def test_shipped_files_read(self):
        live = live_match.read_live(live_match.DEFAULT_LIVE)
        self.assertGreater(len(live), 1000)
        panel = live_match.read_panel(live_match.DEFAULT_PANEL)
        self.assertEqual(31, len(panel))
        self.assertTrue(all(r in live for r in panel))


if __name__ == "__main__":
    unittest.main()

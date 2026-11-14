"""BENCH-245: live_match.py passes a bench that scores us and BeepBoop as live does, and fails a harsh one."""
import os
import sys
import tempfile
import unittest

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import live_match  # noqa: E402

HEAD = "arm\trobot\topponent\tok\tscore_share\tskippedTurns\n"


class LiveMatchTest(unittest.TestCase):
    def setUp(self):
        self.d = tempfile.mkdtemp()
        self.live = os.path.join(self.d, "live.tsv")
        with open(self.live, "w") as f:
            f.write("# live\nrobot\thadur\tbeepboop\na.A\t60.0\t80.0\nb.B\t70.0\t90.0\nc.C\t50.0\t70.0\n")

    def arms(self, rows):
        p = os.path.join(self.d, "arms.tsv")
        with open(p, "w") as f:
            f.write(HEAD + "".join("%s\tx\t%s 1.0\ttrue\t%.4f\t%d\n" % r for r in rows))
        return p

    def test_matching_bench_passes(self):
        p = self.arms([("c", "a.A", 0.61, 5), ("bb", "a.A", 0.79, 30), ("c", "b.B", 0.69, 5),
                       ("bb", "b.B", 0.91, 30), ("c", "c.C", 0.51, 5), ("bb", "c.C", 0.70, 30)])
        self.assertEqual(0, live_match.main([p, "--live", self.live, "--out", os.path.join(self.d, "r.md")]))
        self.assertIn("PASS", open(os.path.join(self.d, "r.md")).read())

    def test_harsh_bench_fails(self):
        """BeepBoop starved of time: it skips hundreds of turns and the gap halves."""
        p = self.arms([("c", "a.A", 0.64, 30), ("bb", "a.A", 0.72, 500), ("c", "b.B", 0.73, 30),
                       ("bb", "b.B", 0.83, 500), ("c", "c.C", 0.54, 30), ("bb", "c.C", 0.62, 500)])
        res = live_match.check(live_match.read_arms(p, "c", "bb"), live_match.read_live(self.live),
                               "c", "bb", 4.0, 3.0, 100.0)
        self.assertEqual("FAIL", res["verdict"])
        self.assertEqual(3, len(res["reasons"]))
        self.assertEqual(1, live_match.main([p, "--live", self.live]))

    def test_no_overlap_fails(self):
        p = self.arms([("c", "z.Z", 0.6, 0), ("bb", "z.Z", 0.8, 0)])
        self.assertEqual(1, live_match.main([p, "--live", self.live]))

    def test_shipped_live_file_reads(self):
        live = live_match.read_live(live_match.DEFAULT_LIVE)
        self.assertGreater(len(live), 1000)
        self.assertIn("abc.Shadow", live)


if __name__ == "__main__":
    unittest.main()

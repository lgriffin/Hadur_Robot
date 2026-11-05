#!/usr/bin/env python3
"""Tests for tools/x5_card.py (BENCH-197). Run: python3 tools/test_x5_card.py"""
import os
import sys
import tempfile
import unittest

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import x5_card  # noqa: E402

HEAD = "arm\trobot\topponent\trole\tseed\tworker\tposition\tok\trounds\tscore\ttheirScore\tscore_share\n"


def row(arm, opp, seed, share, ok="true"):
    return "%s\tr\t%s\tx\t%d\t1\t1\t%s\t35\t0\t0\t%.4f\n" % (arm, opp, seed, ok, share)


class X5CardTest(unittest.TestCase):
    def setUp(self):
        self.d = tempfile.mkdtemp()

    def path(self, name, text):
        p = os.path.join(self.d, name)
        open(p, "w").write(text)
        return p

    def test_pilot_goes_on_a_gain_and_stops_below_the_bar(self):
        names = self.path("p.txt", "# pilot\na.A 1 | n | a.jar\nb.B 1 | n | b.jar\n")
        arms = self.path("arms.tsv", HEAD + "".join(
            row("c", o, s, 0.70) + row("aa", o, s, 0.72) + row("xr", o, s, x) + row("xr", "z.Z 1", s, 0.99)
            for s in (1, 2) for o, x in (("a.A 1", 0.80), ("b.B 1", 0.73))) + row("xr", "a.A 1", 3, 0.0, ok="false"))
        stop = os.path.join(self.d, "stop")
        x5_card.main(["pilot", arms, "--names", names, "--bar", "2", "--out", os.path.join(self.d, "o.md"),
                      "--stop-file", stop])
        self.assertFalse(os.path.exists(stop), "mean gain (9 + 2) / 2 = 5.5 is above 2")
        self.assertIn("5.50 points over 2 robots", open(os.path.join(self.d, "o.md")).read())
        x5_card.main(["pilot", arms, "--names", names, "--bar", "6", "--out", os.path.join(self.d, "o.md"),
                      "--stop-file", stop])
        self.assertTrue(os.path.exists(stop))

    def test_a_partial_pilot_fails_and_decides_nothing(self):
        names = self.path("p.txt", "a.A 1 | n | a.jar\nb.B 1 | n | b.jar\n")
        arms = self.path("arms.tsv", HEAD + row("c", "a.A 1", 1, 0.5) + row("aa", "a.A 1", 1, 0.5) + row("xr", "a.A 1", 1, 0.9)
                         + row("c", "b.B 1", 1, 0.5) + row("aa", "b.B 1", 1, 0.5) + row("xr", "b.B 1", 1, 0.1, ok="false"))
        stop = os.path.join(self.d, "stop")
        rc = x5_card.main(["pilot", arms, "--names", names, "--out", os.path.join(self.d, "o.md"), "--stop-file", stop])
        self.assertEqual(2, rc, "b.B has no finished xr battle, so a favourable a.A alone cannot pass")
        self.assertFalse(os.path.exists(stop))
        self.assertFalse(os.path.exists(os.path.join(self.d, "o.md")))

    def test_lists_split_the_picks_and_name_the_jar(self):
        pick = self.path("pick.tsv", "a.A 1\txr\t9\t2\t3\t6\nr.R 2\txr\t6\t1\t3\t6\nq.Q 1\txr\t7\t1\t3\t6\n")
        x5p = self.path("x5.txt", "a.A 1 | n | a.jar\nb.B 1 | n | b.jar\n")
        rp = self.path("r.txt", "# rammers\nr.R 2 | n | r.jar\n")
        out = {k: os.path.join(self.d, k) for k in ("x5", "rd", "abl", "arms")}
        rc = x5_card.main(["lists", pick, "--x5-panel", x5p, "--ram-panel", rp, "--x5-out", out["x5"],
                           "--rd-out", out["rd"], "--abl-out", out["abl"], "--arms-out", out["arms"], "--version", "3.21"])
        self.assertEqual(0, rc)
        self.assertEqual("a.A 1\n", open(out["x5"]).read())
        self.assertEqual("r.R 2\n", open(out["rd"]).read())
        self.assertEqual("x5list,rdlist\n", open(out["abl"]).read())
        self.assertIn("xr | hadur117.Hadur 3.21x5rd | bisect/hadur117.Hadur_3.21x5rd.jar", open(out["arms"]).read())

    def test_lists_with_one_kind_builds_that_one_and_none_exits_1(self):
        x5p = self.path("x5.txt", "a.A 1 | n | a.jar\n")
        rp = self.path("r.txt", "r.R 2 | n | r.jar\n")
        out = {k: os.path.join(self.d, k) for k in ("x5", "rd", "abl", "arms")}
        args = ["--x5-panel", x5p, "--ram-panel", rp, "--x5-out", out["x5"], "--rd-out", out["rd"],
                "--abl-out", out["abl"], "--arms-out", out["arms"], "--version", "3.21"]
        self.assertEqual(0, x5_card.main(["lists", self.path("p1.tsv", "r.R 2\txr\t6\t1\t3\t6\n")] + args))
        self.assertEqual("rdlist\n", open(out["abl"]).read())
        self.assertEqual("", open(out["x5"]).read())
        self.assertIn("hadur117.Hadur 3.21rd |", open(out["arms"]).read())
        self.assertEqual(1, x5_card.main(["lists", self.path("p2.tsv", "q.Q 1\txr\t6\t1\t3\t6\n")] + args))


if __name__ == "__main__":
    unittest.main()

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

    def test_pilot_goes_on_when_either_check_passes_and_stops_when_none_does(self):
        names = self.path("p.txt", "# pilot\na.A 1 | n | a.jar\nb.B 1 | n | b.jar\nr.R 1 | n | r.jar\n")
        gun = self.path("g.txt", "a.A 1 | n | a.jar\nb.B 1 | n | b.jar\nz.Z 1 | n | z.jar\n")
        ram = self.path("r.txt", "r.R 1 | n | r.jar\n")
        rows = ""
        for s in (1, 2):
            for o, x5, rd in (("a.A 1", 0.80, 0.70), ("b.B 1", 0.73, 0.70), ("r.R 1", 0.60, 0.605)):
                rows += row("c", o, s, 0.70 if o != "r.R 1" else 0.60) + row("x5", o, s, x5) + row("rd", o, s, rd)
        arms = self.path("arms.tsv", HEAD + rows + row("x5", "a.A 1", 3, 0.0, ok="false"))
        stop, out = os.path.join(self.d, "stop"), os.path.join(self.d, "o.md")
        args = ["pilot", arms, "--names", names, "--out", out, "--stop-file", stop]
        self.assertEqual(0, x5_card.main(args + ["--check", "x5=%s@2" % gun, "--check", "rd=%s@1" % ram]))
        self.assertFalse(os.path.exists(stop), "x5 gains (10 + 3) / 2 = 6.5 on a.A and b.B, above 2")
        text = open(out).read()
        self.assertIn("Mean gain 6.50 points over 2 robots", text)
        self.assertIn("Mean gain 0.50 points over 1 robots; bar 1.0: below", text)
        self.assertEqual(0, x5_card.main(args + ["--check", "x5=%s@7" % gun, "--check", "rd=%s@1" % ram]))
        self.assertTrue(os.path.exists(stop), "neither check reaches its bar")

    def test_a_partial_pilot_fails_and_decides_nothing(self):
        names = self.path("p.txt", "a.A 1 | n | a.jar\nb.B 1 | n | b.jar\n")
        arms = self.path("arms.tsv", HEAD + row("c", "a.A 1", 1, 0.5) + row("x5", "a.A 1", 1, 0.9)
                         + row("c", "b.B 1", 1, 0.5) + row("x5", "b.B 1", 1, 0.1, ok="false"))
        stop, out = os.path.join(self.d, "stop"), os.path.join(self.d, "o.md")
        rc = x5_card.main(["pilot", arms, "--names", names, "--check", "x5=%s@2" % names, "--out", out, "--stop-file", stop])
        self.assertEqual(2, rc, "b.B has no finished x5 battle, so a favourable a.A alone cannot pass")
        self.assertFalse(os.path.exists(stop))
        self.assertFalse(os.path.exists(out))

    def outs(self):
        out = {k: os.path.join(self.d, k) for k in ("x5", "rd", "abl", "arms")}
        return out, ["--x5-out", out["x5"], "--rd-out", out["rd"], "--abl-out", out["abl"], "--arms-out", out["arms"],
                     "--version", "3.21"]

    def test_lists_split_the_picks_by_the_arm_that_won_and_name_the_jar(self):
        pick = self.path("pick.tsv", "a.A 1\tx5\t9\t2\t2\t2\nr.R 2\trd\t6\t1\t2\t2\nq.Q 1\tx5\t7\t1\t2\t2\n")
        out, args = self.outs()
        self.assertEqual(0, x5_card.main(["lists", pick] + args))
        self.assertEqual("a.A 1\nq.Q 1\n", open(out["x5"]).read())
        self.assertEqual("r.R 2\n", open(out["rd"]).read())
        self.assertEqual("x5list,rdlist\n", open(out["abl"]).read())
        self.assertIn("xr | hadur117.Hadur 3.21x5rd | bisect/hadur117.Hadur_3.21x5rd.jar", open(out["arms"]).read())

    def test_lists_with_one_kind_builds_that_one_and_none_exits_1(self):
        out, args = self.outs()
        self.assertEqual(0, x5_card.main(["lists", self.path("p1.tsv", "r.R 2\trd\t6\t1\t2\t2\n")] + args))
        self.assertEqual("rdlist\n", open(out["abl"]).read())
        self.assertEqual("", open(out["x5"]).read())
        self.assertIn("hadur117.Hadur 3.21rd |", open(out["arms"]).read())
        self.assertEqual(1, x5_card.main(["lists", self.path("p2.tsv", "")] + args))


if __name__ == "__main__":
    unittest.main()

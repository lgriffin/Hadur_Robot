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
        out = {k: os.path.join(self.d, k) for k in ("env", "abl", "arms")}
        prefix = os.path.join(self.d, "tf")
        return out, prefix, ["--list-prefix", prefix, "--env-out", out["env"], "--abl-out", out["abl"],
                             "--arms-out", out["arms"], "--version", "3.21"]

    def test_lists_split_the_picks_by_lever_and_name_the_jar(self):
        pick = self.path("pick.tsv", "a.A 1\tx5\t9\t2\t2\t2\nr.R 2\tgs\t6\t1\t2\t2\nq.Q 1\tx5\t7\t1\t2\t2\n"
                                     "s.S 1\tsg\t8\t1\t2\t2\nm.M 1\tmm\t6\t1\t2\t2\nu.U 1\tzz\t9\t1\t2\t2\n")
        out, prefix, args = self.outs()
        self.assertEqual(0, x5_card.main(["lists", pick] + args))
        self.assertEqual("a.A 1\nq.Q 1\n", open(prefix + "-x5.list").read())
        self.assertEqual("r.R 2\n", open(prefix + "-gs.list").read())
        self.assertEqual("s.S 1\n", open(prefix + "-sg.list").read())
        self.assertFalse(os.path.exists(prefix + "-fp.list"), "a lever no robot picked writes no list")
        self.assertEqual("x5list,gslist,sgolist,mmlist\n", open(out["abl"]).read(), "LEVERS order, so the suffix is known")
        env = open(out["env"]).read()
        self.assertIn("export X5_POWER=%s-x5.list\n" % prefix, env)
        self.assertIn("export STOP_GO=%s-sg.list\n" % prefix, env)
        self.assertIn("export MIMIC_ON=%s-mm.list\n" % prefix, env)
        self.assertIn("xr | hadur117.Hadur 3.21x5glwlmq | bisect/hadur117.Hadur_3.21x5glwlmq.jar", open(out["arms"]).read())

    def test_lists_with_one_lever_builds_that_one_and_none_exits_1(self):
        out, prefix, args = self.outs()
        self.assertEqual(0, x5_card.main(["lists", self.path("p1.tsv", "r.R 2\thj\t6\t1\t2\t2\n")] + args))
        self.assertEqual("hjlist\n", open(out["abl"]).read())
        self.assertIn("hadur117.Hadur 3.21hl |", open(out["arms"]).read())
        self.assertEqual(1, x5_card.main(["lists", self.path("p2.tsv", "")] + args))

    def test_lean_puts_each_undecided_robot_on_its_best_allowed_lever(self):
        census = self.path("census.txt", "# field\na.A 1 | n | a.jar\nb.B 1 | n | b.jar\nk.K 1 | n | k.jar\n"
                                          "p.P 1 | n | p.jar\nd.D 1 | n | d.jar\ne.E 1 | n | e.jar\n")
        rows = ""
        for s in (1, 2):
            rows += row("c", "a.A 1", s, 0.70) + row("x5", "a.A 1", s, 0.72) + row("hj", "a.A 1", s, 0.73)
            rows += row("c", "b.B 1", s, 0.70) + row("x5", "b.B 1", s, 0.705) + row("dg", "b.B 1", s, 0.90)
            rows += row("c", "k.K 1", s, 0.70) + row("gs", "k.K 1", s, 0.80)
            rows += row("c", "p.P 1", s, 0.50) + row("fp", "p.P 1", s, 0.60)
            rows += row("c", "d.D 1", s, 0.50) + row("mm", "d.D 1", s, 0.56)
        screen = self.path("arms.tsv", HEAD + rows)
        banked = self.path("pick.tsv", "k.K 1\tgs\t10\t2\t2\t2\n")
        o = {k: os.path.join(self.d, k) for k in ("lean", "set", "pilot")}
        args = ["lean", screen, "--census", census, "--exclude", banked, "--levers", "x5,gs,fp,sg,sw,hj,fl,mm",
                "--pick-out", o["lean"], "--set-out", o["set"], "--pilot-out", o["pilot"], "--pilot-every", "2"]
        self.assertEqual(0, x5_card.main(args))
        lean = [l.split("\t")[:2] for l in open(o["lean"]).read().splitlines()]
        self.assertEqual([["a.A 1", "hj"], ["p.P 1", "fp"], ["d.D 1", "mm"]], lean,
                         "best allowed lever; b.B leans only to dg (left out), k.K is banked, e.E was never fought")
        body = [l for l in open(o["set"]).read().splitlines() if not l.startswith("#")]
        self.assertEqual(["a.A 1 | n | a.jar", "p.P 1 | n | p.jar", "d.D 1 | n | d.jar"], body, "census lines, census order")
        pilot = [l for l in open(o["pilot"]).read().splitlines() if not l.startswith("#")]
        self.assertEqual(["a.A 1 | n | a.jar", "d.D 1 | n | d.jar"], pilot, "every second leaning robot")
        self.assertEqual(1, x5_card.main(args[:args.index("--levers") + 1] + ["sg"] + args[args.index("--levers") + 2:]))
        self.assertEqual(2, x5_card.main(args[:args.index("--levers") + 1] + ["rd"] + args[args.index("--levers") + 2:]),
                         "a retired lever is refused")

    def test_lists_can_name_the_arm_and_leave_out_the_aa_copy(self):
        out, prefix, args = self.outs()
        pick = self.path("pl.tsv", "a.A 1\thj\t2\t0\t2\t2\nb.B 1\tx5\t3\t0\t2\t2\n")
        self.assertEqual(0, x5_card.main(["lists", pick] + args + ["--arm", "ln", "--no-aa"]))
        arms = [l for l in open(out["arms"]).read().splitlines() if not l.startswith("#")]
        self.assertEqual(["c | hadur117.Hadur 3.21 | bisect/hadur117.Hadur_3.21.jar",
                          "ln | hadur117.Hadur 3.21x5hl | bisect/hadur117.Hadur_3.21x5hl.jar"], arms)

    def test_levers_match_build_ablation(self):
        here = os.path.dirname(os.path.abspath(__file__))
        script = open(os.path.join(here, "..", "build-ablation.sh"), encoding="utf-8").read()
        for k, (abl, var, suffix) in x5_card.LEVERS.items():
            self.assertIn("|%s|" % abl, script.replace(")", "|"), k)
            line = [l for l in script.splitlines() if 'file="${%s:-}"' % var in l]
            self.assertEqual(1, len(line), k)
            self.assertIn('version="${version}%s"' % suffix, line[0], k)


if __name__ == "__main__":
    unittest.main()

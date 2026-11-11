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
            self.assertTrue('version="${version}%s"' % suffix in line[0] or ':-%s}"' % suffix in line[0],
                            "%s: the default jar suffix is %s" % (k, suffix))

    def test_lean_stacks_a_second_lever_of_another_family_on_the_carried_robots(self):
        census = self.path("census.txt", "a.A 1 | n | a.jar\nb.B 1 | n | b.jar\ns.S 1 | n | s.jar\nn.N 1 | n | n.jar\n")
        rows = ""
        for s in (1, 2):
            # a.A carries x5 (power): fp is the same family, so hj wins; b.B carries sg: sw is out, gs wins.
            rows += row("c", "a.A 1", s, 0.70) + row("fp", "a.A 1", s, 0.80) + row("hj", "a.A 1", s, 0.73)
            rows += row("c", "b.B 1", s, 0.70) + row("sw", "b.B 1", s, 0.80) + row("gs", "b.B 1", s, 0.72)
            # s.S is a shield-mode robot carrying mm: gs and fl are barred, x5 is under the bar.
            rows += row("c", "s.S 1", s, 0.70) + row("gs", "s.S 1", s, 0.80) + row("fl", "s.S 1", s, 0.79) + row("x5", "s.S 1", s, 0.705)
            # n.N carries nothing: --only-carried leaves it out.
            rows += row("c", "n.N 1", s, 0.50) + row("hj", "n.N 1", s, 0.60)
        screen = self.path("arms.tsv", HEAD + rows)
        carried = self.path("carried.tsv", "a.A 1\tx5\nb.B 1\tsg\ns.S 1\tmm\n")
        shielded = self.path("shield.txt", "# listed\ns.S 1 | n | s.jar\n")
        o = {k: os.path.join(self.d, k) for k in ("lean", "set", "pilot")}
        args = ["lean", screen, "--census", census, "--carry", carried, "--only-carried", "--shielded", shielded,
                "--levers", "x5,gs,fp,sg,sw,hj,fl,mm", "--req", "BENCH-214",
                "--pick-out", o["lean"], "--set-out", o["set"], "--pilot-out", o["pilot"]]
        self.assertEqual(0, x5_card.main(args))
        lean = [l.split("\t")[:2] for l in open(o["lean"]).read().splitlines()]
        self.assertEqual([["a.A 1", "hj"], ["b.B 1", "gs"]], lean)
        self.assertTrue(open(o["set"]).read().startswith("# BENCH-214:"))
        # Without --only-carried a carried robot still stacks and an uncarried one leans as before; rp is a power lever.
        rows2 = HEAD + "".join(row("c", n, s, 0.50) + row("rp", n, s, 0.60) for n in ("a.A 1", "n.N 1") for s in (1, 2))
        screen2 = self.path("rp.tsv", rows2)
        args = ["lean", screen2, "--census", census, "--carry", carried, "--levers", "rp",
                "--pick-out", o["lean"], "--set-out", o["set"], "--pilot-out", o["pilot"]]
        self.assertEqual(0, x5_card.main(args))
        lean = [l.split("\t")[:2] for l in open(o["lean"]).read().splitlines()]
        self.assertEqual([["n.N 1", "rp"]], lean, "a.A carries a power lever, so rp is barred")

    def test_carried_reads_the_table_methods(self):
        src = self.path("T.java", "class T {\n    static String[] moves() {\n        return new String[] {\n            \"m.M 1\",\n        };\n    }\n"
                                  "    static String[] heatJits() {\n        return new String[] {\n            // a note\n            \"h.H 1\",  // +2\n            \"\",\n        };\n    }\n"
                                  "    static String[] racePowers() {\n        return new String[] {\n            \"r.R 1\",\n        };\n    }\n}\n")
        out = os.path.join(self.d, "carried.tsv")
        self.assertEqual(0, x5_card.main(["carried", src, "--out", out]))
        self.assertEqual("h.H 1\thj\nr.R 1\trp\n", open(out).read(), "moves is not a lever; blank entries are skipped")


    def test_portfolio_keeps_by_shrunk_gain_and_leaves_out_carried_shielded_and_short(self):
        # hj: four robots whose gains differ far beyond their noise (+10, +6, -6, -10): spread kept, sign decides.
        # mm: three robots with the same small gain and no spread: all kept on the lever's mean.
        # fl: two robots, both losing: none kept.
        gains = {"a.A 1": ("hj", 10), "b.B 1": ("hj", 6), "c.C 1": ("hj", -6), "d.D 1": ("hj", -10),
                 "e.E 1": ("mm", 1), "f.F 1": ("mm", 1), "g.G 1": ("mm", 1),
                 "h.H 1": ("fl", -2), "i.I 1": ("fl", -2),
                 "k.K 1": ("hj", 9), "s.S 1": ("gs", 9), "t.T 1": ("hj", 9)}
        rows = ""
        for o, (k, g) in gains.items():
            for seed, wob in ((1, 0.2), (2, -0.2), (3, 0.1), (4, -0.1)):
                if o == "t.T 1" and seed > 1:
                    continue   # one battle only: short
                rows += row("c", o, seed, (70 + wob) / 100.0) + row("ln", o, seed, (70 + g - wob) / 100.0)
        run = self.path("arms.tsv", HEAD + rows)
        lean = self.path("lean.tsv", "".join("%s\t%s\t1.0\t0\t2\t2\n" % (o, k) for o, (k, g) in gains.items()))
        census = self.path("census.txt", "# census\n" + "".join("%s | n | x.jar\n" % o for o in gains))
        carry = self.path("carry.tsv", "k.K 1\tx5\n")
        shield = self.path("shield.txt", "s.S 1 | n | s.jar\n")
        out = {n: os.path.join(self.d, n) for n in ("pick.tsv", "set.txt", "pilot.txt", "r.md")}
        args = ["portfolio", "--lean", lean, "--run", run + "@ln", "--census", census, "--carry", carry,
                "--shielded", shield, "--pick-out", out["pick.tsv"], "--set-out", out["set.txt"],
                "--pilot-out", out["pilot.txt"], "--pilot-every", "2", "--out", out["r.md"], "--field", "100"]
        self.assertEqual(0, x5_card.main(args))
        picked = {l.split("\t")[0]: l.split("\t") for l in open(out["pick.tsv"])}
        self.assertEqual({"a.A 1", "b.B 1", "e.E 1", "f.F 1", "g.G 1"}, set(picked))
        self.assertEqual("hj", picked["a.A 1"][1])
        # Shrunk toward the lever's mean (0): never past the raw +10, and barely moved when the noise is small.
        self.assertTrue(9.0 < float(picked["a.A 1"][2]) <= 10.0)
        self.assertAlmostEqual(10.0, float(picked["a.A 1"][3]), places=1)
        self.assertAlmostEqual(1.0, float(picked["e.E 1"][2]), places=1)
        text = open(out["r.md"]).read()
        self.assertIn("Kept: **5 robots**", text)
        self.assertIn("1 the table already carries a lever for, 1 shield-mode robots on gs or fl, 1 with under two", text)
        self.assertEqual(5, len([l for l in open(out["set.txt"]) if not l.startswith("#")]))
        self.assertEqual(3, len([l for l in open(out["pilot.txt"]) if not l.startswith("#")]))

    def test_portfolio_pools_runs_and_exits_1_when_nothing_is_kept(self):
        def run(name, arm, g):
            rows = ""
            for o in ("a.A 1", "b.B 1"):
                for seed, wob in ((1, 0.3), (2, -0.3)):
                    rows += row("c", o, seed, (60 + wob) / 100.0) + row(arm, o, seed, (60 + g - wob) / 100.0)
            return self.path(name, HEAD + rows)
        lean = self.path("lean.tsv", "a.A 1\tmm\t1\t0\t2\t2\nb.B 1\tmm\t1\t0\t2\t2\n")
        census = self.path("census.txt", "a.A 1 | n | a.jar\nb.B 1 | n | b.jar\n")
        out = {n: os.path.join(self.d, n) for n in ("pick.tsv", "set.txt", "pilot.txt", "r.md")}
        tail = ["--lean", lean, "--census", census, "--pick-out", out["pick.tsv"], "--set-out", out["set.txt"],
                "--pilot-out", out["pilot.txt"], "--out", out["r.md"]]
        # +4 on one run and -2 on the other pool to +1: kept; two losing runs: nothing kept.
        self.assertEqual(0, x5_card.main(["portfolio", "--run", run("r1.tsv", "ln", 4) + "@ln",
                                          "--run", run("r2.tsv", "xr", -2) + "@xr"] + tail))
        self.assertAlmostEqual(1.0, float(open(out["pick.tsv"]).readline().split("\t")[3]), places=1)
        self.assertEqual(1, x5_card.main(["portfolio", "--run", run("r3.tsv", "ln", -3) + "@ln"] + tail))
        self.assertEqual(2, x5_card.main(["portfolio", "--run", "noarm"] + tail))


if __name__ == "__main__":
    unittest.main()

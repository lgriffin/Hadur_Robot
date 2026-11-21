"""Tests for melee_strays.py: stray fire in the melee crowd, read from a melee trace."""

import gzip
import math
import os
import tempfile
import unittest

import melee_strays

US, A, B, C = "hadur117.Hadur 3.23", "a.A 1", "b.B 1", "c.C 1"


def rec(rnd, turn, robots, bullets):
    return "T,%d,%d,%s,%s\n" % (rnd, turn, ",".join("%s:%.1f:%.1f:%.4f:%.1f:%.1f:%d" % r for r in robots),
                                "|".join("%s:%.1f:%.1f:%.4f:%.2f" % b for b in bullets))


class MeleeStraysTest(unittest.TestCase):
    def test_geometry_reads_where_the_victim_stood_against_the_line_and_the_target(self):
        src, north = (500.0, 100.0), 0.0
        self.assertEqual("behind", melee_strays.geometry(src, north, (510.0, 700.0), (500.0, 400.0)))
        self.assertEqual("in front", melee_strays.geometry(src, north, (510.0, 250.0), (500.0, 400.0)))
        self.assertEqual("beside", melee_strays.geometry(src, north, (540.0, 410.0), (500.0, 400.0)))
        self.assertEqual("drove in", melee_strays.geometry(src, north, (700.0, 700.0), (500.0, 400.0)))
        self.assertEqual("drove in", melee_strays.geometry(src, north, (500.0, 50.0), (500.0, 400.0)), "behind the gun")
        self.assertEqual("no target", melee_strays.geometry(src, north, (510.0, 700.0), None))

    def test_predictable_takes_head_on_and_linear_aim_at_the_true_target(self):
        src = (500.0, 100.0)
        still = (500.0, 400.0, 0.0, 0.0)
        self.assertTrue(melee_strays.predictable(src, 0.0, 3.0, still, 600.0), "head-on at a still target")
        self.assertFalse(melee_strays.predictable(src, 0.2, 3.0, still, 600.0), "0.2 rad off is 120 px at 600")
        self.assertFalse(melee_strays.predictable(src, 0.0, 3.0, None, 600.0))
        east = (500.0, 400.0, math.pi / 2, 8.0)
        lead = melee_strays.linear_heading(500.0, 100.0, 500.0, 400.0, math.pi / 2, 8.0, 11.0)
        self.assertGreater(lead, 0.3)
        self.assertTrue(melee_strays.predictable(src, lead, 3.0, east, 600.0), "the linear lead")

    def test_exposure_is_higher_on_another_pair_s_line_than_off_it(self):
        def field(us):
            return [(US, us[0], us[1], 0.0, 0.0, 100.0, True), (A, 500.0, 100.0, 0.0, 0.0, 100.0, True),
                    (B, 500.0, 400.0, 0.0, 0.0, 100.0, True)]
        behind = melee_strays.exposure(US, field((500.0, 700.0)))
        aside = melee_strays.exposure(US, field((900.0, 250.0)))
        self.assertGreater(behind, 2 * aside)
        self.assertIsNone(melee_strays.exposure("x.X 1", field((500.0, 700.0))))

    def test_a_trace_splits_aimed_from_stray_and_reads_the_stray(self):
        def bots(e_us=100.0, e_b=100.0):
            return [(US, 510.0, 900.0, 0.0, 0.0, e_us, True), (A, 500.0, 100.0, 0.0, 0.0, 100.0, True),
                    (B, 500.0, 400.0, 0.0, 0.0, e_b, True), (C, 100.0, 100.0, 0.0, 0.0, 100.0, True)]
        lines = ["V,1\n", rec(0, 0, bots(), [])]
        # A fires north at B, 300 px away; the bullet passes B (no energy falls) and is gone beside Hadur, 800 px
        # out and behind B on the line, on the turn Hadur loses 16: a stray, behind the target, predictable.
        turn, y = 1, 111.0
        while y < 880.0:
            lines.append(rec(0, turn, bots(), [(A, 500.0, y, 0.0, 3.0)]))
            turn, y = turn + 1, y + 11.0
        lines.append(rec(0, turn, bots(e_us=84.0), []))
        # A fires north again and B takes it: aimed damage on B.
        start = turn + 1
        for i in range(27):
            lines.append(rec(0, start + i, bots(e_us=84.0), [(A, 500.0, 111.0 + 11.0 * i, 0.0, 3.0)]))
        lines.append(rec(0, start + 27, bots(e_us=84.0, e_b=84.0), []))
        d = tempfile.mkdtemp()
        os.makedirs(os.path.join(d, "f01", "battles", "melee-3360"))
        with gzip.open(os.path.join(d, "f01", "battles", "melee-3360", "trace.log.gz"), "wt", encoding="utf-8") as f:
            f.writelines(lines)
        stats, samples, hits, traces = melee_strays.read([d], {"hadur117.Hadur"})
        self.assertEqual(1, traces)
        h = stats["hadur117.Hadur"]
        self.assertEqual((16.0, 16.0, 0.0), (h["damage"], h["stray"], h["aimed"]))
        self.assertEqual(16.0, h["geo behind"])
        self.assertEqual(16.0, h["flight 3"], "over 40 turns in flight")
        self.assertEqual((16.0, 16.0, 0.0), (h["predictable"], h["avoidable"], h["dropped"]))
        self.assertEqual(1, h["rounds"])
        self.assertEqual((16.0, 16.0), (stats["b.B"]["damage"], stats["b.B"]["aimed"]))
        self.assertEqual(1, len(hits["hadur117.Hadur"]))
        self.assertTrue(samples["hadur117.Hadur"])
        self.assertTrue(melee_strays.gate(h))
        out = os.path.join(d, "r.md")
        melee_strays.main([d, "--out", out])
        text = open(out).read()
        self.assertIn("| hadur117.Hadur | 16 | 0 | 16 | 100% | 16.0 |", text)
        self.assertIn("Third-party bullets (M1): BUILD.", text)

    def test_seat_puts_the_robot_in_place_of_the_lowest_ranked_and_skips_a_field_that_holds_it(self):
        d = tempfile.mkdtemp()
        os.makedirs(os.path.join(d, "census"))
        row = "aaa.r.ScalarR 0.005g.047 | melee-1 | aaa.r.ScalarR_0.005g.047.jar"
        open(os.path.join(d, "census", "f01.txt"), "w").write("# f01\nx.X 1 | melee-9 | x.jar\ny.Y 1 | melee-300 | y.jar\n")
        open(os.path.join(d, "census", "f02.txt"), "w").write("# f02\n" + row + "\nz.Z 1 | melee-5 | z.jar\n")
        open(os.path.join(d, "census", "f03.txt"), "w").write("# f03\nw.W 1 | melee-7 | w.jar\nv.V 1 | melee-2 | v.jar\n")
        suite = os.path.join(d, "census.txt")
        open(suite, "w").write("# census\n" + "".join(
            "F0%d | --set census/f0%d.txt --melee true --field 1000x1000\n" % (i, i) for i in (1, 2, 3)))
        out_dir, out_suite = os.path.join(d, "seat"), os.path.join(d, "seat.txt")
        melee_strays.main(["seat", "--suite", suite, "--fields", "2", "--robot", row, "--out-dir", out_dir,
                           "--out-suite", out_suite])
        f1 = open(os.path.join(out_dir, "f01.txt")).read()
        self.assertIn(row, f1)
        self.assertIn("x.X 1", f1)
        self.assertNotIn("y.Y 1", f1)
        self.assertFalse(os.path.exists(os.path.join(out_dir, "f02.txt")), "ScalarR already sits in f02")
        f3 = open(os.path.join(out_dir, "f03.txt")).read()
        self.assertIn("v.V 1 | melee-2", f3)
        self.assertNotIn("w.W 1", f3, "melee-7 is the lowest-ranked of f03")
        lines = [l for l in open(out_suite).read().splitlines() if not l.startswith("#")]
        self.assertEqual(2, len(lines))
        self.assertTrue(lines[0].startswith("F01 | --set ") and lines[0].endswith("f01.txt --melee true --field 1000x1000"))
        with self.assertRaises(SystemExit):
            melee_strays.main(["seat", "--suite", suite, "--fields", "3", "--robot", row, "--out-dir", out_dir,
                               "--out-suite", out_suite])


if __name__ == "__main__":
    unittest.main()

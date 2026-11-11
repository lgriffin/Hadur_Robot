"""Tests for melee_states.py: the states melee robots are hit in, read from a melee trace."""

import gzip
import math
import os
import tempfile
import unittest

import melee_states

US, A, B = "hadur117.Hadur 3.21", "a.A 1", "b.B 1"


def rec(rnd, turn, robots, bullets):
    return "T,%d,%d,%s,%s\n" % (rnd, turn, ",".join("%s:%.1f:%.1f:%.4f:%.1f:%.1f:%d" % r for r in robots),
                                "|".join("%s:%.1f:%.1f:%.4f:%.2f" % b for b in bullets))


class MeleeStatesTest(unittest.TestCase):
    def test_aim_takes_the_robot_on_the_line_with_its_sideways_speed_and_guess_factor(self):
        # Fired north from (500, 500) at power 3 (speed 11): Hadur 200 px north driving east at 8 is the target;
        # the robot east of the shooter is 90 degrees off the line.
        robots = [(US, 500, 700, math.pi / 2, 8, 100, True), (A, 500, 500, 0, 0, 100, True), (B, 900, 500, 0, 0, 100, True)]
        name, dist, lat, gf = melee_states.aim((A, 500, 500, 0.0, 3.0), robots)
        self.assertEqual((US, 200.0), (name, dist))
        self.assertAlmostEqual(8.0, lat, places=6)
        self.assertAlmostEqual(0.0, gf, places=6)
        # Led by half the largest angle, the way Hadur is moving: +0.5; the other way: -0.5.
        mea = math.asin(8.0 / 11.0)
        self.assertAlmostEqual(0.5, melee_states.aim((A, 500, 500, 0.5 * mea, 3.0), robots)[3], places=6)
        self.assertAlmostEqual(-0.5, melee_states.aim((A, 500, 500, -0.5 * mea, 3.0), robots)[3], places=6)
        self.assertIsNone(melee_states.aim((A, 500, 500, math.pi, 3.0), robots), "nobody within 25 degrees to the south")
        self.assertIsNone(melee_states.aim((A, 500, 500, 0.0, 3.0), [robots[1]]), "the owner is never the target")

    def test_bands(self):
        self.assertEqual(0, melee_states.band(melee_states.DIST, 149.9))
        self.assertEqual(1, melee_states.band(melee_states.DIST, 150))
        self.assertEqual(5, melee_states.band(melee_states.DIST, 5000))
        self.assertEqual(4, melee_states.band(melee_states.LATERAL, 8.0))
        self.assertEqual(16.0, melee_states.damage(3.0))
        self.assertEqual("cz.libors.Ogi", melee_states.base("cz.libors.Ogi 1.0"))

    def test_a_trace_counts_the_aimed_hit_the_miss_the_crossfire_and_skips_the_duel(self):
        still = lambda alive_b=True: [(US, 500.0, 600.0, 0.0, 0.0, 100.0, True), (A, 500.0, 500.0, 0.0, 0.0, 100.0, True),
                                      (B, 900.0, 500.0, 0.0, 0.0, 100.0, alive_b)]
        lines = ["V,1\n"]
        # Round 0. A fires north at Hadur 100 px away (seen at y 511, then 522 ... gone after 577: 588 is within 40 of 600).
        for i, y in enumerate((511, 522, 533, 544, 555, 566, 577)):
            lines.append(rec(0, i + 1, still(), [(A, 500.0, float(y), 0.0, 3.0)]))
        lines.append(rec(0, 8, still(), []))
        # A fires south at nobody: unaimed, gone at the wall, nothing counted.
        lines.append(rec(0, 9, still(), [(A, 500.0, 489.0, math.pi, 3.0)]))
        lines.append(rec(0, 10, still(), []))
        # B fires west, aimed at A (400 px), and it is gone next to Hadur instead: crossfire on Hadur.
        lines.append(rec(0, 11, still(), [(B, 889.0, 500.0, -math.pi / 2, 3.0)]))
        lines.append(rec(0, 12, [(US, 860.0, 500.0, 0.0, 0.0, 100.0, True), still()[1], still()[2]], []))
        # Round 1, two alive: the last duel, not counted.
        lines.append(rec(1, 1, still(False), [(A, 500.0, 511.0, 0.0, 3.0)]))
        lines.append(rec(1, 2, still(False), [(A, 500.0, 589.0, 0.0, 3.0)]))
        lines.append(rec(1, 3, still(False), []))
        d = tempfile.mkdtemp()
        os.makedirs(os.path.join(d, "f01", "battles", "melee-3330"))
        with gzip.open(os.path.join(d, "f01", "battles", "melee-3330", "trace.log.gz"), "wt", encoding="utf-8") as f:
            f.writelines(lines)
        stats, traces = melee_states.read([d])
        self.assertEqual(1, traces)
        h = stats["hadur117.Hadur"]
        self.assertEqual((1, 1), (h["shots"], h["hits"]), "one aimed shot, one hit; the duel's is not counted")
        self.assertEqual((1, 1), (h["dist0"], h["hdist0"]), "fired from under 150 px")
        self.assertEqual((1, 1), (h["lat0"], h["gf0"]), "standing still, head-on")
        self.assertEqual(32.0, h["damage"])
        self.assertEqual(16.0, h["cross"], "half of it was aimed at A")
        self.assertEqual((1, 0), (stats["a.A"]["shots"], stats["a.A"]["hits"]))
        out = os.path.join(d, "r.md")
        melee_states.main([d, "--min-shots", "1", "--out", out])
        text = open(out).read()
        self.assertIn("| hadur117.Hadur | 1 | 100.0% |", text)
        self.assertIn("| hadur117.Hadur | 100% | 100% | 50% |", text)
        self.assertLess(text.index("| hadur117.Hadur |"), text.index("| a.A |"), "ours first")


if __name__ == "__main__":
    unittest.main()

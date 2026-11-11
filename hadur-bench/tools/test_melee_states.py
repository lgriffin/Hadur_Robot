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
        def bots(us=(500.0, 600.0), e_us=100.0, alive_b=True, us_v=0.0, us_h=0.0):
            return [(US, us[0], us[1], us_h, us_v, e_us, True), (A, 500.0, 500.0, 0.0, 0.0, 100.0, True),
                    (B, 900.0, 500.0, 0.0, 0.0, 100.0, alive_b)]
        lines = ["V,1\n", rec(0, 0, bots(), [])]
        # Round 0. A fires north at Hadur 100 px away: seen from y 511 to 577, gone on the turn Hadur loses 16.
        for i, y in enumerate((511, 522, 533, 544, 555, 566, 577)):
            lines.append(rec(0, i + 1, bots(), [(A, 500.0, float(y), 0.0, 3.0)]))
        lines.append(rec(0, 8, bots(e_us=84.0), []))
        # A fires north again; the bullet is gone beside Hadur but Hadur's energy does not fall: a miss, not a hit.
        for i, y in enumerate((511, 522, 533, 544, 555, 566, 577)):
            lines.append(rec(0, 9 + i, bots(e_us=84.0), [(A, 500.0, float(y), 0.0, 3.0)]))
        lines.append(rec(0, 16, bots(e_us=84.0), []))
        # A fires south at nobody: unaimed, nothing counted.
        lines.append(rec(0, 17, bots(e_us=84.0), [(A, 500.0, 489.0, math.pi, 3.0)]))
        lines.append(rec(0, 18, bots(e_us=84.0), []))
        # B fires west, aimed at A (400 px), and it is gone next to Hadur, which loses 16: crossfire on Hadur.
        lines.append(rec(0, 19, bots(e_us=84.0), [(B, 889.0, 500.0, -math.pi / 2, 3.0)]))
        lines.append(rec(0, 20, bots(us=(860.0, 500.0), e_us=68.0), []))
        # Round 1, two alive: the last duel, not counted.
        lines.append(rec(1, 0, bots(alive_b=False), []))
        lines.append(rec(1, 1, bots(alive_b=False), [(A, 500.0, 511.0, 0.0, 3.0)]))
        lines.append(rec(1, 2, bots(alive_b=False), [(A, 500.0, 589.0, 0.0, 3.0)]))
        lines.append(rec(1, 3, bots(e_us=84.0, alive_b=False), []))
        d = tempfile.mkdtemp()
        os.makedirs(os.path.join(d, "f01", "battles", "melee-3330"))
        with gzip.open(os.path.join(d, "f01", "battles", "melee-3330", "trace.log.gz"), "wt", encoding="utf-8") as f:
            f.writelines(lines)
        stats, traces = melee_states.read([d])
        self.assertEqual(1, traces)
        h = stats["hadur117.Hadur"]
        self.assertEqual((2, 1), (h["shots"], h["hits"]), "two aimed shots, one hit: no energy fell on the second")
        self.assertEqual((2, 1), (h["dist0"], h["hdist0"]), "fired from under 150 px")
        self.assertEqual((2, 2), (h["lat0"], h["gf0"]), "standing still, head-on")
        self.assertEqual(32.0, h["damage"])
        self.assertEqual(16.0, h["cross"], "half of it was aimed at A")
        self.assertEqual((1, 0), (stats["a.A"]["shots"], stats["a.A"]["hits"]))
        out = os.path.join(d, "r.md")
        melee_states.main([d, "--min-shots", "1", "--out", out])
        with open(out) as f:
            text = f.read()
        self.assertIn("| hadur117.Hadur | 2 | 50.0% |", text)
        self.assertIn("| hadur117.Hadur | 100% | 100% | 50% |", text)
        self.assertLess(text.index("| hadur117.Hadur |"), text.index("| a.A |"), "ours first")

    def test_the_firing_turn_is_the_turn_before_the_bullet_is_first_seen(self):
        # Hadur drives east at 8: on the firing turn it is at x 500, dead ahead of A; when the bullet is first seen
        # it has moved to 508. The shot is read on the firing turn: head-on, 100 px, 8 px a tick across the line.
        def bots(x):
            return [(US, x, 600.0, math.pi / 2, 8.0, 100.0, True), (A, 500.0, 500.0, 0.0, 0.0, 100.0, True),
                    (B, 900.0, 900.0, 0.0, 0.0, 100.0, True)]
        d = tempfile.mkdtemp()
        with gzip.open(os.path.join(d, "trace.log.gz"), "wt", encoding="utf-8") as f:
            f.writelines(["V,1\n", rec(0, 0, bots(500.0), []), rec(0, 1, bots(508.0), [(A, 500.0, 511.0, 0.0, 3.0)]),
                          rec(0, 2, bots(516.0), [])])
        stats, _ = melee_states.read([d])
        h = stats["hadur117.Hadur"]
        self.assertEqual((1, 1, 1, 1), (h["shots"], h["dist0"], h["lat4"], h["gf0"]))


if __name__ == "__main__":
    unittest.main()

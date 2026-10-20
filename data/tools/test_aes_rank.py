#!/usr/bin/env python3
"""Tests for aes_rank.py: the AES record, the truth join, the re-blend's parity and the fit."""

import gzip
import math
import os
import random
import shutil
import tempfile
import unittest

import aes_rank as ar

try:
    import numpy  # noqa: F401
    HAVE_NUMPY = True
except ImportError:
    HAVE_NUMPY = False

VIEWS = 11


def option_terms(rng, low):
    """One option's terms, consistent with SurfMover.waveDanger at today's weights, and its first danger."""
    a = [rng.random() * 3 if rng.random() < 0.7 else 0.0 for _ in range(VIEWS)]
    b = [x * (1 + rng.random()) + (0.01 if x else 0.0) for x in a]
    views = sum(a) / sum(b) if sum(b) > 0 else 0.0
    hit_rate, shadowed = rng.random() * 0.2, rng.random() * 0.3
    damage, uncertain = 4 * 1.9 + 2 * 0.9, 0
    tti, q, esc = 5 + rng.random() * 20, 0.9 + rng.random() * 0.2, 1.0
    first = (hit_rate * (1 - shadowed) + views) * damage / tti * 2.5 ** q / 2.5 * esc
    terms = [low, low + 0.1, first, hit_rate, shadowed, views, damage, uncertain, tti, q, esc] + a + b + [float("nan")]
    return terms, first


def record_line(rng, rnd, fire, power, lows, firing=1):
    """An AES line as the harvester writes it (round,tick, prefix) and the chosen ordinal."""
    totals, parts = [], []
    for low in lows:
        terms, first = option_terms(rng, low)
        total = first + rng.random() * 0.5
        totals.append(total)
        parts.append("1," + ar_num(total) + "," + ",".join(ar_num(t) for t in terms))
    ccw, stop, cw = totals
    chosen = 1 if stop <= ccw and stop <= cw else (2 if cw < ccw else 0)
    body = "AES,%d,%d,%d,%s,%d,400,500,%d,%d," % (rnd, fire + 3, fire, ar_num(power), firing, chosen, VIEWS)
    return "%d,%d,%s%s\n" % (rnd, fire + 3, body, ",".join(parts)), chosen


def ar_num(v):
    return "nan" if isinstance(v, float) and math.isnan(v) else repr(float(v))


class ParseTest(unittest.TestCase):

    def test_record_round_trip(self):
        rng = random.Random(1)
        line, chosen = record_line(rng, 2, 40, 1.9, [0.0, 1.0, 2.0])
        rec = ar.parse_record(line)
        self.assertIsNotNone(rec)
        self.assertEqual((rec["round"], rec["fire"], rec["chosen"], rec["views"]), (2, 40, chosen, VIEWS))
        self.assertTrue(rec["firing"])
        self.assertEqual(len(rec["options"]), 3)
        self.assertEqual(len(rec["options"][0][1]), ar.FIXED + 2 * VIEWS + 1)
        self.assertTrue(math.isnan(rec["options"][2][1][-1]))

    def test_missing_option_and_bad_lines(self):
        rng = random.Random(2)
        line, _ = record_line(rng, 0, 10, 2.0, [0.0, 1.0, 2.0])
        head, rest = line.split(",AES,", 1)
        p = ("AES," + rest).rstrip("\n").split(",")
        width = ar.FIXED + 2 * VIEWS + 1
        # Drop the clockwise option: '0' in its place.
        cut = 10 + 2 * (2 + width)
        no_cw = ",".join(p[:cut] + ["0"])
        rec = ar.parse_record(no_cw)
        self.assertIsNone(rec["options"][2])
        self.assertIsNone(ar.parse_record(",".join(p[:-3])), "truncated")
        self.assertIsNone(ar.parse_record("0,1,HF,0,1,learned"))

    def test_inside_wraps(self):
        self.assertTrue(ar.inside(3.1, 3.05, 3.15))
        self.assertTrue(ar.inside(3.1 - 2 * math.pi, 3.05, 3.15))
        self.assertFalse(ar.inside(3.2, 3.05, 3.15))

    def test_damage(self):
        self.assertAlmostEqual(ar.bullet_damage(3.0), 16.0)
        self.assertAlmostEqual(ar.bullet_damage(0.5), 2.0)

    def test_battle_id(self):
        self.assertEqual(ar.battle_id("cx.Princess_1.0-3"), ("cx.Princess_1.0", 3, False))
        self.assertEqual(ar.battle_id("cx.Princess_1.0-3-baseline"), ("cx.Princess_1.0", 3, True))


class JoinTest(unittest.TestCase):

    def setUp(self):
        self.dir = tempfile.mkdtemp()

    def tearDown(self):
        shutil.rmtree(self.dir)

    def battle(self, name, waves, rng):
        """A battle directory: per wave (round, fire, power, heading), one record and its bullet."""
        d = os.path.join(self.dir, "battles", name)
        os.makedirs(d)
        chosen = []
        with open(os.path.join(d, "hadur.log"), "w") as f:
            for rnd, fire, power, heading in waves:
                line, c = record_line(rng, rnd, fire, power, [heading - 0.05, heading + 0.5, heading + 1.0])
                chosen.append(c)
                f.write(line)
            # A virtual wave's record is skipped.
            line, _ = record_line(rng, 0, 500, 1.0, [0.0, 1.0, 2.0], firing=0)
            f.write(line)
        with gzip.open(os.path.join(d, "truth.log.gz"), "wt") as f:
            f.write("V,1\n")
            for rnd, fire, power, heading in waves:
                t = fire + 1
                f.write("T,%d,%d,100,100,0,0,100,400,500,0,0,100,E:410.0:490.0:%.4f:%.2f\n" % (rnd, t, heading, power))
                f.write("F,%d,%d,E,%.2f\n" % (rnd, t, power))
        return d, chosen

    def test_join_matches_bullet_one_tick_on(self):
        rng = random.Random(3)
        d, _ = self.battle("x.Bot_1.0-1", [(0, 30, 1.9, 1.0), (0, 50, 2.5, 2.0), (1, 30, 1.9, 0.5)], rng)
        rows, stats = ar.join_battle(d)
        self.assertEqual(stats["records"], 4)
        self.assertEqual(stats["real"], 3)
        self.assertEqual(stats["matched"], 3)
        for rec, heading, power in rows:
            o = rec["options"]
            self.assertTrue(ar.inside(heading, o[0][1][ar.LOW], o[0][1][ar.HIGH]), "ccw's interval holds the bullet")
            self.assertFalse(ar.inside(heading, o[1][1][ar.LOW], o[1][1][ar.HIGH]))
            self.assertAlmostEqual(power, rec["power"], places=2)

    def test_power_must_match(self):
        rng = random.Random(4)
        d = os.path.join(self.dir, "battles", "y.Bot_1.0-1")
        os.makedirs(d)
        with open(os.path.join(d, "hadur.log"), "w") as f:
            f.write(record_line(rng, 0, 30, 1.0, [0.0, 1.0, 2.0])[0])
        with gzip.open(os.path.join(d, "truth.log.gz"), "wt") as f:
            f.write("T,0,31,100,100,0,0,100,400,500,0,0,100,E:410.0:490.0:1.0:3.00\nF,0,31,E,3.00\n")
        rows, stats = ar.join_battle(d)
        self.assertEqual(stats["matched"], 0)

    @unittest.skipUnless(HAVE_NUMPY, "numpy not installed")
    def test_parity_and_fit_end_to_end(self):
        rng = random.Random(5)
        for b in range(4):
            waves = [(r, 20 + 15 * k, 1.9, rng.uniform(-3, 3)) for r in range(3) for k in range(12)]
            self.battle("z.Bot%d_1.0-1" % b, waves, rng)
        out = os.path.join(self.dir, "aes.npz")
        ar.join([self.dir], out, 1)
        d = ar.Data(out, "family")
        x0 = ar.base_params(len(d.groups))
        picked = ar.pick(ar.totals(d, x0))
        self.assertEqual(float((picked == d.chosen).mean()), 1.0, "today's weights pick what the surf took")
        # The search can only match or beat today's weights on its own data.
        xb, fb, used = ar.cmaes(lambda x: ar.objective(d, x), x0, 0.5, 120, 1)
        self.assertLessEqual(fb, ar.objective(d, x0) + 1e-12)
        self.assertLessEqual(used, 120)

    @unittest.skipUnless(HAVE_NUMPY, "numpy not installed")
    def test_cmaes_finds_a_quadratic_minimum(self):
        import numpy as np
        target = np.array([1.0, -2.0, 0.5])
        xb, fb, _ = ar.cmaes(lambda x: float(((x - target) ** 2).sum()), [0.0, 0.0, 0.0], 1.0, 1500, 3)
        self.assertLess(fb, 1e-4)


if __name__ == "__main__":
    unittest.main()

"""Tests for copy_breed.py (COPY-1): python test_copy_breed.py"""

import gzip
import math
import os
import random
import shutil
import tempfile
import unittest

import copy_breed as cb


def mover(rounds, ticks, seed):
    """A target orbiting a fixed enemy at about 450 px, reversing at random: (round, turn, x, y,
    heading, velocity) a tick, and the enemy's place."""
    rng = random.Random(seed)
    ex, ey = 400.0, 300.0
    out = []
    for r in range(rounds):
        ang, d, v = rng.random() * 2 * math.pi, 1.0, 8.0
        for t in range(1, ticks + 1):
            if rng.random() < 0.04:
                d = -d
            rad = 250 + 20 * math.sin(t / 30)
            ang += d * v / rad
            x, y = ex + rad * math.sin(ang), ey + rad * math.cos(ang)
            h = (ang + d * math.pi / 2) % (2 * math.pi)
            out.append((r, t, x, y, h, v))
    return out, (ex, ey)


def write_log(path, track, enemy, shots):
    """shots: {(round, turn): (power, heading)}."""
    ex, ey = enemy
    with gzip.open(path, "wt") as f:
        f.write("V,1\n")
        for r, t, x, y, h, v in track:
            toks = ""
            if (r, t) in shots:
                p, bh = shots[(r, t)]
                s = cb.bullet_speed(p)
                toks = f"E:{ex + s * math.sin(bh):.2f}:{ey + s * math.cos(bh):.2f}:{bh:.4f}:{p:.2f}"
            f.write(f"T,{r},{t},{x:.2f},{y:.2f},{h:.4f},{v:.2f},100.00,{ex:.2f},{ey:.2f},0.00,0.00,100.00,{toks}\n")
            if (r, t) in shots:
                f.write(f"F,{r},{t},E,{shots[(r, t)][0]:.2f}\n")


class CopyBreedTest(unittest.TestCase):

    def setUp(self):
        self.tmp = tempfile.mkdtemp()
        self.addCleanup(shutil.rmtree, self.tmp)

    def battle_with(self, genome, run):
        """A battle whose enemy fires every 14 ticks along the copy {genome}'s aim."""
        track, enemy = mover(8, 400, 7)
        turns = {(r, t) for r, t, *_ in track if t > 20 and t % 14 == 0}
        path = os.path.join(self.tmp, "truth.log.gz")
        write_log(path, track, enemy, {k: (2.0, 0.0) for k in turns})
        b = cb.Battle(path)
        rp = cb.Replay(b, 10_000, random.Random(1))
        aims = run(rp, genome, b.shots)
        shots = {}
        for (i, p, _), a in zip(b.shots, aims):
            shots[(int(b.round[i]), int(b.turn[i]))] = (p, a if a is not None else 0.0)
        d = os.path.join(self.tmp, "battles", "lab.Hidden_1.0-1-si")
        os.makedirs(d)
        write_log(os.path.join(d, "truth.log.gz"), track, enemy, shots)
        return cb.Battle(os.path.join(d, "truth.log.gz"))

    # @Tag("COPY-1"): the shots and their bullets' headings are read from a truth log.
    def test_reads_the_shots_and_their_headings(self):
        track, enemy = mover(2, 100, 3)
        path = os.path.join(self.tmp, "t.log.gz")
        write_log(path, track, enemy, {(0, 50): (2.0, 1.0), (1, 60): (1.5, -2.0)})
        b = cb.Battle(path)
        self.assertEqual(2, b.rounds)
        self.assertEqual(2, len(b.shots))
        self.assertAlmostEqual(1.0, b.shots[0][2], places=3)
        self.assertAlmostEqual(1.5, b.shots[1][1])

    # @Tag("COPY-1"): a gun's own copy fires every one of its bullets; head-on fires few.
    def test_a_copy_of_itself_scores_whole(self):
        g = {"ticks": 0, "bins": 31, "s_lat": 3, "s_dist": 2, "d_max": 900, "s_accel": 1, "s_since": 3,
             "s_wall": 1, "roll": 0.0, "smooth": 1, "lag": 1}
        b = self.battle_with(g, cb.run_hist)
        rp = cb.Replay(b, 10_000, random.Random(1))
        self.assertEqual(1.0, cb.matched(b, b.shots, cb.run_hist(rp, g, b.shots)))
        head_on = [b.absb[i - 1] for i, _, _ in b.shots]
        self.assertLess(cb.matched(b, b.shots, head_on), 0.5)

    # @Tag("COPY-1"): the genetic algorithm grows a copy of a hidden histogram gun from its bullets.
    def test_breeding_finds_a_hidden_histogram_gun(self):
        g = {"ticks": 1, "bins": 23, "s_lat": 4, "s_dist": 1, "d_max": 900, "s_accel": 1, "s_since": 2,
             "s_wall": 1, "roll": 0.01, "smooth": 1, "lag": 0}
        self.battle_with(g, cb.run_hist)
        res = cb.read_battle(os.path.join(self.tmp, "battles", "lab.Hidden_1.0-1-si", "truth.log.gz"),
                             (800.0, 600.0), 12, 400, 5)
        self.assertEqual("hist", max(res["families"], key=lambda k: res["families"][k][0]))
        self.assertGreater(res["families"]["hist"][0], 0.8)

    def test_wave_guess_factors_are_signed_by_direction(self):
        track, enemy = mover(1, 200, 11)
        path = os.path.join(self.tmp, "t.log.gz")
        write_log(path, track, enemy, {})
        b = cb.Battle(path)
        t, k, g = b.waves(True)
        self.assertTrue(all(kk > tt for tt, kk in zip(t, k)))
        self.assertTrue(all(-1 <= x <= 1 for x in g))
        # Orbiting steadily, a wave mostly finds the body ahead of it: positive factors.
        self.assertGreater(sum(1 for x in g if x > 0), 0.7 * len(g))


if __name__ == "__main__":
    unittest.main()

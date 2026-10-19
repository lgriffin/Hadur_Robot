"""Tests for census_classify.py: python test_census_classify.py"""

import gzip
import math
import os
import tempfile
import unittest

import census_classify as cc


def write_battle(dirpath, enemy_aim, rounds=2, ticks=400):
    """A synthetic battle: Hadur runs back and forth along x at y=100, the enemy sits at
    (400, 500) and fires a power-2 bullet every 12 ticks with the aim enemy_aim gives."""
    os.makedirs(dirpath)
    ex, ey = 400.0, 500.0
    with gzip.open(os.path.join(dirpath, "truth.log.gz"), "wt", encoding="utf-8") as f:
        for r in range(rounds):
            hx, v = 200.0, 8.0
            hist = []
            for t in range(ticks):
                if hx > 600 or hx < 200:
                    v = -v
                hx += v
                heading = math.pi / 2 if v > 0 else 3 * math.pi / 2
                hist.append((hx, 100.0, heading, abs(v)))
                bullets, fire = "", False
                if t > 5 and t % 12 == 0:
                    sx, sy, sh, sv = hist[-3]  # fired on the scan two ticks back
                    a = enemy_aim(ex, ey, sx, sy, sh, sv)
                    bullets = "E:%.2f:%.2f:%.2f:2.00" % (ex + 14 * math.sin(a), ey + 14 * math.cos(a), a)
                    fire = True
                f.write("T,%d,%d,%.2f,%.2f,%.2f,%.2f,100.00,%.2f,%.2f,0.00,0.00,100.00,%s\n"
                        % (r, t, hx, 100.0, heading, abs(v), ex, ey, bullets))
                if fire:
                    f.write("F,%d,%d,E,2.00\n" % (r, t))


def headon(ex, ey, x, y, h, v):
    return cc.bearing(ex, ey, x, y)


def linear(ex, ey, x, y, h, v):
    return cc.predict(x, y, h, v, 0.0, ex, ey, 14.0)


def off_by_a_lot(ex, ey, x, y, h, v):
    return cc.bearing(ex, ey, x, y) + 0.3


class EnemyGunTest(unittest.TestCase):

    def read(self, aim):
        with tempfile.TemporaryDirectory() as d:
            b = os.path.join(d, "x-1")
            write_battle(b, aim)
            s = cc.battle_features(b, 4)
        return s

    def test_head_on_shots_read_head_on(self):
        s = self.read(headon)
        moving = s["eread"] - s["egun_still"]
        self.assertGreater(s["egun_headon"], 0.8 * moving)

    def test_linear_shots_read_linear(self):
        s = self.read(linear)
        moving = s["eread"] - s["egun_still"]
        self.assertGreater(s["egun_linear"] + s["egun_circular"], 0.8 * moving)

    def test_unexplained_shots_read_other(self):
        s = self.read(off_by_a_lot)
        self.assertGreater(s["egun_other"], 0.8 * s["eread"])
        self.assertEqual(s["epower"], 2.0 * s["eshots"])

    def test_sitting_enemy_is_hit_by_every_offline_gun(self):
        s = self.read(headon)
        self.assertEqual(s["hit_headon"], s["try_headon"])
        self.assertGreater(s["try_headon"], 100)


class ClassRuleTest(unittest.TestCase):

    def row(self, **kw):
        r = {"speed": 5.0, "close": 0.0, "adv_speed": 0.0, "near_wall": 0.1, "rev_100": 3.0,
             "dwell": 30.0, "stopped": 0.0, "dist": 450.0,
             "shots_100": 6.0, "shots_read": 200, "aim_still": 0.0,
             "aim_headon": 0.0, "aim_linear": 0.0, "aim_circular": 0.0, "aim_other": 1.0}
        for g in cc.GUNS:
            r["off_" + g] = 0.1
        r.update(kw)
        return r

    def test_movement_rules(self):
        self.assertEqual(cc.move_class(self.row(speed=0.2))[0], "sitting")
        self.assertEqual(cc.move_class(self.row(close=0.5))[0], "rammer")
        self.assertEqual(cc.move_class(self.row(near_wall=0.8, rev_100=0.2))[0], "wall-runner")
        # a surfer that keeps to the walls but reverses often is not a wall-runner
        self.assertEqual(cc.move_class(self.row(near_wall=0.8, rev_100=4.0))[0], "flat")
        self.assertEqual(cc.move_class(self.row(off_headon=0.4))[0], "head-on-prone")
        self.assertEqual(cc.move_class(self.row(off_seg=0.3))[0], "stat-prone")

    def test_gun_rules(self):
        self.assertEqual(cc.gun_class(self.row(shots_100=0.1)), "silent")
        self.assertEqual(cc.gun_class(self.row(aim_headon=0.9, aim_other=0.1)), "head-on")
        self.assertEqual(cc.gun_class(self.row(aim_linear=0.5, aim_other=0.5)), "linear+learning")
        self.assertEqual(cc.gun_class(self.row()), "learning")
        self.assertEqual(cc.gun_class(self.row(shots_read=10)), "unread")


if __name__ == "__main__":
    unittest.main()

"""Tests for tools/jaylexi_power.py (pc-jaylexi-pt)."""
import gzip
import os
import sys
import tempfile
import unittest

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import jaylexi_power as jp  # noqa: E402


def tline(r, t, me, en, bullets):
    toks = " ".join("%s:%.2f:%.2f:0.00:%.2f" % b for b in bullets)
    return "T,%d,%d,%s,%s,%s\n" % (r, t, ",".join("%.2f" % v for v in me), ",".join("%.2f" % v for v in en), toks)


class Shots(unittest.TestCase):
    def log(self, text):
        d = tempfile.mkdtemp()
        p = os.path.join(d, "truth.log.gz")
        with gzip.open(p, "wt") as f:
            f.write(text)
        return p

    def test_new_own_bullet_counts_once_at_the_tick_before(self):
        me, en = (100, 100, 0, 0, 90), (100, 500, 0, 0, 80)
        p = self.log(tline(1, 1, me, en, [])
                     + tline(1, 2, me, en, [("H", 100, 110, 1.5)])     # new: within one step
                     + tline(1, 3, me, en, [("H", 100, 127, 1.5)])     # moved on: not new
                     + tline(1, 4, me, en, [("E", 100, 490, 2.0)]))    # enemy bullet: ignored
        self.assertEqual([(400.0, 1.5)], list(jp.shots([p], 16)))

    def test_a_bullet_still_near_the_gun_next_tick_counts_once(self):
        me, en = (100, 100, 0, 0, 90), (100, 500, 0, 0, 80)
        # Power 3 moves 11 px a tick: still inside the 13 px "near the gun" test on the next tick.
        p = self.log(tline(1, 1, me, en, [])
                     + tline(1, 2, me, en, [("H", 100, 101, 3.0)])
                     + tline(1, 3, me, en, [("H", 100, 112, 3.0)]))
        self.assertEqual([(400.0, 3.0)], list(jp.shots([p], 16)))

    def test_low_energy_shots_are_left_out(self):
        me, en = (100, 100, 0, 0, 10), (100, 500, 0, 0, 80)
        p = self.log(tline(1, 1, me, en, []) + tline(1, 2, me, en, [("H", 100, 105, 1.0)]))
        self.assertEqual([], list(jp.shots([p], 16)))

    def test_table_keeps_the_rule_where_thin(self):
        rows = [(420.0, 0.8)] * 5 + [(60.0, 2.9)] * 2
        tenths, taught, _ = jp.table(rows, "tenths", 5)
        self.assertEqual(1, taught)
        self.assertEqual(8, tenths[8])          # 400-450 px from Hadur
        self.assertEqual(30, tenths[1])         # 50-100 px: too few, 0.3's 3
        whole, _, _ = jp.table(rows, "whole", 5)
        self.assertEqual(1, whole[8])
        self.assertEqual(jp.OLD_RULE[1], whole[1])


if __name__ == "__main__":
    unittest.main()

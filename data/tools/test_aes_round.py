#!/usr/bin/env python3
"""aes_round: buckets, the views-only rebuild and the per-wave tally."""
import math
import os
import sys
import unittest

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import aes_rank as A  # noqa: E402
import aes_round as R  # noqa: E402


def terms(view_score, first, parts_a, parts_b, fallback=float("nan")):
    t = [float("nan")] * (A.FIXED + 2 * len(parts_a) + 1)
    t[A.VIEW_SCORE] = view_score
    t[A.FIRST] = first
    t[A.FIXED:A.FIXED + len(parts_a)] = parts_a
    t[A.FIXED + len(parts_a):A.FIXED + 2 * len(parts_a)] = parts_b
    t[-1] = fallback
    return t


class AesRoundTest(unittest.TestCase):

    def test_buckets_cover_a_battle(self):
        self.assertEqual(" 0- 0", R.bucket(0))
        self.assertEqual(" 1- 2", R.bucket(2))
        self.assertEqual("15-34", R.bucket(34))
        self.assertEqual(R.LATE, R.bucket(35))
        self.assertIn(R.LATE, R.LABELS)

    def test_battle_directory_names_take_every_bench_label(self):
        for name, arm in (("abc.Shadow_3.83c-10700-c", "c"), ("abc.Shadow_3.83c-10700-aa", "aa"),
                          ("x.Y_1.0-3-pf.2_B", "pf.2_B")):
            m = R.DIR.match(name)
            self.assertIsNotNone(m, name)
            self.assertEqual(arm, m.group("arm"))
            self.assertEqual("10700" if "10700" in name else "3", m.group("seed"))
        self.assertIsNone(R.DIR.match("abc.Shadow_3.83c-10700-baseline-x"))

    def test_strictly_top_excludes_ties(self):
        self.assertTrue(R.strictly_top([0.1, 0.5, 0.2], 1))
        self.assertFalse(R.strictly_top([0.5, 0.5, 0.2], 1))
        self.assertFalse(R.strictly_top([0.5, 0.5, 0.2], 0))
        self.assertTrue(R.strictly_top([-math.inf, 0.5, -math.inf], 1))

    def test_report_pairs_seeds_and_lists_late_rounds(self):
        def counter(waves, hit):
            return {"waves": float(waves), "hit": float(hit), "dmg": 0.0, "avoidable": 0.0, "allhit": 0.0,
                    "ranked": 0.0, "top": 0.0, "topfirst": 0.0, "topviews": 0.0}
        stats = {"c": {" 0- 0": counter(10, 1), R.LATE: counter(10, 2)}, "aa": {" 0- 0": counter(10, 1)},
                 "x": {" 0- 0": counter(10, 3)}}
        # c fought seeds 1 and 2 against bot A, x only seed 1 (with a different rate on seed 2 unfought)
        perbot = {"c": {"A": {1: counter(10, 1), 2: counter(10, 5)}},
                  "aa": {"A": {1: counter(10, 1), 2: counter(10, 5)}},
                  "x": {"A": {1: counter(10, 2)}}}
        totals = {a: {"records": 0, "real": 0, "matched": 0, "bullets": 0} for a in ("c", "aa", "x")}
        text = R.report(stats, perbot, totals)
        self.assertIn("| c | %s | 10 |" % R.LATE, text, "the late bucket has its row")
        self.assertIn("x minus c", text, "c is the reference even though aa sorts first")
        self.assertNotIn("minus aa", text)
        # the paired row uses seed 1 alone: c 0.100, x 0.200
        self.assertIn("| A | 1 | 10 | 0.100 | 0.200 | +0.100 |", text)
        with self.assertRaises(SystemExit):
            R.report(stats, perbot, totals, ref="zz")

    def test_views_only_rebuilds_the_blend_or_falls_back(self):
        t = terms(0.0, 0.0, [0.2, 0.6], [1.0, 1.0])
        self.assertAlmostEqual(0.4, R.views_only(t, 2))
        t = terms(0.0, 0.0, [0.0, 0.0], [0.0, 0.0], fallback=0.7)
        self.assertAlmostEqual(0.7, R.views_only(t, 2))
        t = terms(0.0, 0.0, [0.0, 0.0], [0.0, 0.0])
        self.assertEqual(-math.inf, R.views_only(t, 2))

    def test_tally_counts_hits_and_rankings(self):
        # three options, the chosen (1) hit, option 0 missed: avoidable; the blend ranks option 2 top
        # (wrong), the views alone rank option 1 top (right).
        rec = {"chosen": 1, "views": 2, "options": [
            (1.0, terms(0.3, 1.0, [0.3, 0.3], [1.0, 1.0])),
            (0.9, terms(0.5, 0.9, [0.9, 0.9], [1.0, 1.0])),
            (1.2, terms(0.6, 1.2, [0.1, 0.1], [1.0, 1.0]))]}
        key = {k: 0.0 for k in ("waves", "hit", "dmg", "avoidable", "allhit", "ranked", "top", "topfirst", "topviews")}
        R.tally(key, rec, [False, True, False], [True, True, True], 4.0)
        self.assertEqual(1, key["waves"])
        self.assertEqual(1, key["hit"])
        self.assertEqual(4.0, key["dmg"])
        self.assertEqual(1, key["avoidable"])
        self.assertEqual(0, key["allhit"])
        self.assertEqual(1, key["ranked"])
        self.assertEqual(0, key["top"])
        self.assertEqual(0, key["topfirst"])
        self.assertEqual(1, key["topviews"])
        # a miss on the chosen option counts the wave and nothing else
        R.tally(key, rec, [False, False, False], [True, True, True], 4.0)
        self.assertEqual(2, key["waves"])
        self.assertEqual(1, key["hit"])
        self.assertEqual(1, key["ranked"])


if __name__ == "__main__":
    unittest.main()

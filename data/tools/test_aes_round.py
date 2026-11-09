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
        self.assertEqual("35+", R.bucket(35))

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

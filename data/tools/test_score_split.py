"""Tests for score_split.py (docs/plan-top5.md): python3 test_score_split.py"""

import unittest

import score_split as ss


class SplitTest(unittest.TestCase):

    def test_the_two_sides_sum_to_the_share_gap(self):
        ours, theirs = ss.sides(4161, 399, 4482, 319)
        self.assertAlmostEqual(ours + theirs, ss.share(4482, 319) - ss.share(4161, 399))
        self.assertGreater(theirs, ours)

    def test_equal_own_scores_put_the_whole_gap_on_their_side(self):
        ours, theirs = ss.sides(5000, 150, 5000, 70)
        self.assertEqual(ours, 0)
        self.assertGreater(theirs, 0)

    def test_exposure_parts_sum_to_the_excess_damage(self):
        tick, length = ss.exposure(600, 0.02, 550, 0.015)
        self.assertAlmostEqual(tick + length, 600 * 0.02 - 550 * 0.015)
        self.assertAlmostEqual(length, 50 * 0.02)

    def test_ranks_401_and_up_split_at_800_and_other_segments_pass_through(self):
        classes = {"b.B": {"move_class": "flat", "rank": "800"}, "c.C": {"move_class": "flat", "rank": "801"},
                   "r.R": {"move_class": "rammer", "rank": "900"}, "d.D": {"move_class": "flat", "rank": "60"}}
        got = {o: ss.group(o, classes, set()) for o in classes}
        self.assertEqual(got, {"b.B": "B401", "c.C": "B801", "r.R": "A", "d.D": "D"})


if __name__ == "__main__":
    unittest.main()

"""Tests for midrange_gap.py (docs/plan-midrange.md): python3 test_midrange_gap.py"""

import os
import tempfile
import unittest

import midrange_gap as mg


class GapTest(unittest.TestCase):

    def test_class_rows_add_up_to_the_peers_lead_over_hadurs_pairings(self):
        hadur = {"a.A": 70.0, "b.B": 80.0, "c.C": 99.0, "d.D": 60.0}
        peers = {"P": {"a.A": 80.0, "b.B": 85.0, "c.C": 99.0, "d.D": 70.0}}
        ranks = {"a.A": 60, "b.B": 300, "c.C": 900, "d.D": 100}
        classes = {"a.A": {"move_class": "flat", "gun_class": "learning", "base_taken": "20"},
                   "b.B": {"move_class": "flat", "gun_class": "learning", "base_taken": "10"},
                   "d.D": {"move_class": "rammer", "gun_class": "linear", "base_taken": "60"}}
        by_class, by_group = mg.gap_table(hadur, peers, ranks, classes, 51, 400, listed={"b.B"})
        # c.C is outside the range; the lead on the range is (10 + 5 + 10) / 4 pairings.
        self.assertAlmostEqual(sum(s["peers"]["P"] for s in by_class.values()), 25.0 / 4)
        self.assertEqual(by_class["flat x learning"]["n"], 2)
        self.assertAlmostEqual(by_class["flat x learning"]["taken"], 15.0)
        self.assertEqual(by_group["listed"]["n"], 1)
        self.assertAlmostEqual(by_group["neither"]["peers"]["P"], 20.0 / 4)


class RatesTest(unittest.TestCase):

    def test_rates_count_only_the_set_from_the_given_round(self):
        rounds = [
            {"opponent": "a.A 1.0", "round": "0", "ticks": "100", "damageDealt": "10", "damageTaken": "50"},
            {"opponent": "a.A 1.0", "round": "3", "ticks": "200", "damageDealt": "20", "damageTaken": "4"},
            {"opponent": "a.A 1.0", "round": "20", "ticks": "200", "damageDealt": "4", "damageTaken": "8"},
            {"opponent": "z.Z 1.0", "round": "5", "ticks": "999", "damageDealt": "999", "damageTaken": "999"},
        ]
        ticks, dealt, taken, buckets = mg.rates(rounds, {"a.A"}, from_round=3)
        self.assertAlmostEqual(ticks, 200.0)
        self.assertAlmostEqual(dealt, 100.0 * 24 / 400)
        self.assertAlmostEqual(taken, 100.0 * 12 / 400)
        self.assertAlmostEqual(buckets["r0"], 50.0)
        self.assertAlmostEqual(buckets["r20-34"], 8.0)
        self.assertTrue(buckets["r1-2"] != buckets["r1-2"])  # nan: no such round


class SplitTest(unittest.TestCase):

    def test_split_scores_the_pick_on_the_other_seeds(self):
        rows = {}
        # Opponent a: the candidate is better on every seed. Opponent b: worse on every seed.
        for seed in "1234":
            rows[("C", "a.A", seed)] = {"build": "C", "score": "60", "theirScore": "40"}
            rows[("B", "a.A", seed)] = {"build": "B", "score": "50", "theirScore": "50"}
            rows[("C", "b.B", seed)] = {"build": "C", "score": "40", "theirScore": "60"}
            rows[("B", "b.B", seed)] = {"build": "B", "score": "50", "theirScore": "50"}
        res = mg.split_half(rows, "C", "B")
        self.assertEqual(len(res), 6)
        for _, every, chosen in res:
            self.assertAlmostEqual(every, 0.0)   # +10 on a, -10 on b
            self.assertAlmostEqual(chosen, 5.0)  # the pick keeps a and drops b


class SetTest(unittest.TestCase):

    def test_set_lines_come_from_the_census_file(self):
        with tempfile.TemporaryDirectory() as d:
            census = os.path.join(d, "census.txt")
            with open(census, "w", encoding="utf-8") as f:
                f.write("# comment\na.A 1.0 | rank60-band3 | a.A_1.0.jar\nb.B 2 | rank70-band3 | b.B_2.jar\n")
            lines = mg.read_set_lines(census)
            self.assertEqual(set(lines), {"a.A", "b.B"})
            self.assertEqual(lines["a.A"], "a.A 1.0 | rank60-band3 | a.A_1.0.jar")
            self.assertEqual(mg.read_list(census), {"a.A", "b.B"})


if __name__ == "__main__":
    unittest.main()

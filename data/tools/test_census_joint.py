"""Tests for census_joint.py (docs/plan-top5.md): python3 test_census_joint.py"""

import random
import unittest

import census_joint as cj

REPORT = """# jk.mega.DrussGT 3.1.16 (rank3-band1) vs hadur2.Hadur 3.13hjsw

35 rounds x 4 seeds (data wiped) per opponent on 800x600.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 46.2% | 50.0% | 42.1% | 18 / 35 | 7.2% | 10.5% | 67 | 0 | 1.34 / 2471.7 | 36.0% | +10.2 |
| 2 | 47.5% | 48.6% | 46.3% | 17 / 35 | 7.9% | 10.7% | 76 | 0 in 1 round(s) | 1.32 / 7995.3 | 50.1% | -2.6 |

Mean score share 46.9% ± 4.6, baseline 43.0% ± 10.2, paired diff +3.8 ± 12.3.

## Full report

| 9 | 1.0% | 1.0% | 1.0% | 1 / 35 | 1% | 1% | 1 | 0 | 1 / 1 | 1% | 0 |
"""


class ParseTest(unittest.TestCase):

    def test_a_report_gives_its_opponent_rank_and_only_the_battles_table(self):
        opp, rank, rows = cj.parse_report(REPORT)
        self.assertEqual(opp, "jk.mega.DrussGT 3.1.16")
        self.assertEqual(rank, 3)
        self.assertEqual([r["seed"] for r in rows], [1, 2])
        self.assertAlmostEqual(rows[0]["share"], 46.2)
        self.assertAlmostEqual(rows[1]["baseline"], 50.1)
        self.assertEqual(rows[1]["won"], 17)
        self.assertEqual(rows[0]["skips"], 67)

    def test_text_without_a_battles_table_is_not_a_report(self):
        self.assertIsNone(cj.parse_report("# Bench: hadur2.Hadur 3.13 (cold)\n"))


class StatsTest(unittest.TestCase):

    def test_bands_follow_the_census_ranks(self):
        self.assertEqual([cj.band_of(r) for r in (1, 10, 11, 200, 401, 1200)], [1, 1, 2, 3, 5, 6])

    def test_runs_drawn_alike_pass_and_a_shifted_run_fails_the_permutation_test(self):
        rnd = random.Random(7)
        alike = [[rnd.gauss(80, 3) for _ in range(16)] for _ in range(300)]
        self.assertGreater(cj.permutation_test(alike, 4, 200)[2], 0.01)
        shifted = [row[:4] + [x - 1.0 for x in row[4:8]] + row[8:] for row in alike]
        self.assertLess(cj.permutation_test(shifted, 4, 200)[2], 0.01)

    def test_segments_put_rammers_first_then_the_large_losses_then_rank(self):
        classes = {"r.R": {"move_class": "rammer", "rank": "900"}, "c.C": {"move_class": "flat", "rank": "300"},
                   "b.B": {"move_class": "flat", "rank": "500"}, "d.D": {"move_class": "flat", "rank": "51"},
                   "e.E": {"move_class": "flat", "rank": "50"}}
        got = {o: cj.segment(o, classes, {"c.C", "r.R"}) for o in classes}
        self.assertEqual(got, {"r.R": "A", "c.C": "C", "b.B": "B", "d.D": "D", "e.E": "E"})


if __name__ == "__main__":
    unittest.main()

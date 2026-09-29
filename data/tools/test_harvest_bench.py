"""Tests for harvest_bench.py: python3 -m unittest discover -s data/tools"""

import os
import unittest

import harvest_bench as hb

REPORT = """# Bench: hadur2.Hadur 2.1 (warm)

35 rounds x 5 seeds per opponent.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| abc.Shadow 3.83c | headline | 57.4% ± 5.0 | 71.4% ± 7.1 | 44.1% ± 3.7 | 125 / 175 | 9.0% ± 0.6 | 7.9% ± 0.7 | 26 | 0 | 1.49 / 21.4 |
| zen.Mirage 0.9.5 | rumble-33 | n/a | n/a | n/a | 0 / 0 | - | - | 0 | 0 | 0.00 / 0.0 | 5 battle(s) failed
| broken row | only | three |

## Melee: hadur2.Hadur 3.0 against 9 opponents

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.6 | 72.6 | 3 / 105 | 3.47 | 13.6% | 10,004 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.22 | 1.0 | 17.9% | 29 |
"""

OLD_REPORT = """# Bench: hadur117.Hadur 1.20 (cold)

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Skipped turns | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|
| sample.Walls | sanity | 99.8% ± 0.2 | 100.0% ± 0.0 | 99.6% ± 0.4 | 175 / 175 | 6 | 0.71 / 13.6 |
"""


class HarvestReportTest(unittest.TestCase):

    def test_duel_row_splits_values_from_intervals(self):
        duel, _, _ = hb.harvest_report("s6.md", REPORT)
        self.assertEqual(len(duel), 2, "the short row is skipped")
        row = duel[0]
        self.assertEqual(row["note"], "")
        self.assertEqual((row["robot"], row["version"], row["mode"]), ("hadur2.Hadur", "2.1", "warm"))
        self.assertEqual((row["opponent"], row["role"]), ("abc.Shadow 3.83c", "headline"))
        self.assertEqual((row["score_share"], row["score_ci"]), ("57.4", "5.0"))
        self.assertEqual((row["rounds_won"], row["rounds"]), ("125", "175"))
        self.assertEqual((row["their_hit_rate"], row["their_hit_ci"]), ("7.9", "0.7"))
        self.assertEqual((row["turn_p95_ms"], row["turn_max_ms"]), ("1.49", "21.4"))

    def test_failed_matchup_is_kept_with_its_status_as_the_note(self):
        duel, _, _ = hb.harvest_report("top50.md", REPORT)
        failed = duel[1]
        self.assertEqual(failed["opponent"], "zen.Mirage 0.9.5")
        self.assertEqual(failed["note"], "5 battle(s) failed")
        self.assertEqual((failed["score_share"], failed["rounds_won"], failed["rounds"]), ("", "0", "0"))

    def test_later_heading_names_the_build_for_the_tables_under_it(self):
        _, melee, field = hb.harvest_report("m6.md", REPORT)
        self.assertEqual(melee[0]["version"], "3.0")
        self.assertEqual(melee[0]["bullet_damage"], "10004")
        self.assertEqual((melee[0]["rounds_won"], melee[0]["rounds"]), ("3", "105"))
        self.assertEqual(field[0]["entrant"], "voidious.Diamond 1.8.22")
        self.assertEqual(field[0]["score_share"], "17.9")

    def test_older_report_without_hit_rates_leaves_them_blank(self):
        duel, _, _ = hb.harvest_report("s0.md", OLD_REPORT)
        self.assertEqual(duel[0]["version"], "1.20")
        self.assertEqual(duel[0]["our_hit_rate"], "")
        self.assertEqual(duel[0]["faults"], "")
        self.assertEqual(duel[0]["skipped_turns"], "6")

    def test_committed_history_matches_the_reports(self):
        outputs = hb.harvest()
        for name, content in zip(("duel-history.tsv", "melee-history.tsv", "melee-field.tsv"), outputs):
            with open(os.path.join(hb.OUT, name), encoding="utf-8") as f:
                self.assertEqual(f.read(), content, name + " is stale; rerun harvest_bench.py")


if __name__ == "__main__":
    unittest.main()

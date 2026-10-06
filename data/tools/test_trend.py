"""Tests for trend.py: python test_trend.py"""

import unittest

import trend as t


def duel(opponents, seeds, cand_share, base_share, cand="hadur-3.8", base="hadur-3.7"):
    rows = []
    for o in opponents:
        for s in range(1, seeds + 1):
            for build, share in ((cand, cand_share + 0.01 * (s % 3)), (base, base_share + 0.01 * (s % 2))):
                rows.append({"build": build, "opponent": o, "seed": str(s), "ok": "true",
                             "score_share": "%.4f" % share, "skippedTurns": "10"})
    return rows


class PooledTest(unittest.TestCase):

    def test_equal_weight_over_opponents_and_interval_contains_mean(self):
        cells = {"a": {"1": (60.0, 50.0), "2": (62.0, 50.0), "3": (61.0, 50.0)},
                 "b": {"1": (50.0, 50.0), "2": (52.0, 50.0), "3": (51.0, 50.0)}}
        mean, lo, hi, pairs, strata = t.pooled(cells)
        self.assertAlmostEqual(6.0, mean)
        self.assertEqual((6, 2), (pairs, strata))
        self.assertLess(lo, mean)
        self.assertGreater(hi, mean)

    def test_single_pair_strata_are_ignored(self):
        self.assertIsNone(t.pooled({"a": {"1": (60.0, 50.0)}}))


class DuelRowTest(unittest.TestCase):

    def test_baseline_is_lowest_version_and_diff_is_in_points(self):
        h = t.duel_row(duel(["a", "b"], 4, 0.55, 0.50))
        self.assertEqual(("3.8", "3.7"), (h["candidate"], h["baseline"]))
        self.assertAlmostEqual(5.5, h["res"][0], places=6)
        self.assertEqual(4, h["seeds"])
        self.assertEqual(2, h["units"])

    def test_failed_battles_are_dropped_and_counted(self):
        rows = duel(["a"], 4, 0.55, 0.50)
        rows[0]["ok"] = "false"
        h = t.duel_row(rows)
        self.assertEqual(1, h["failed"])
        self.assertEqual(3, h["res"][3])

    def test_three_builds_are_not_guessed_at(self):
        rows = duel(["a"], 3, 0.5, 0.5) + duel(["a"], 3, 0.5, 0.5, cand="hadur-3.9", base="hadur-3.8")
        self.assertIsNone(t.duel_row(rows))


class MeleeRowTest(unittest.TestCase):

    def test_hadur_share_of_battle_points_paired_by_field_and_seed(self):
        rows = []
        for seed in "123":
            for build, hadur in (("3.8", 300), ("3.7", 200)):
                rows.append({"field": "A", "seed": seed, "build": build, "rank": "1", "robot": "hadur2.Hadur " + build, "score": str(hadur)})
                rows.append({"field": "A", "seed": seed, "build": build, "rank": "2", "robot": "x.Other 1.0", "score": "100"})
        rows[0]["score"] = "310"
        h = t.melee_row(rows)
        self.assertEqual("melee", h["mode"])
        self.assertGreater(h["res"][0], 0)


class HistoryTest(unittest.TestCase):

    def test_engine_from_catalog_subject(self):
        self.assertEqual("1.11.1", t.engine_of("16 seeds, Robocode 1.11.1, parallel 12"))
        self.assertEqual(t.DEFAULT_ENGINE, t.engine_of("16 seeds, parallel 12"))

    def test_merge_is_idempotent_and_keeps_unscanned_rows(self):
        old = {"2026-01-01_x.tsv": {"file": "2026-01-01_x.tsv", "date": "2026-01-01"}}
        fresh = {"2026-02-01_y.tsv": {"file": "2026-02-01_y.tsv", "date": "2026-02-01", "diff_pp": "1.00"}}
        once = t.merge(old, fresh)
        twice = t.merge({r["file"]: r for r in once}, fresh)
        self.assertEqual(once, twice)
        self.assertEqual(["2026-01-01_x.tsv", "2026-02-01_y.tsv"], [r["file"] for r in once])

    def test_committed_history_is_current_and_lists_each_run_once(self):
        fresh, _ = t.history_rows()
        committed = t.read_history(t.HISTORY)
        self.assertTrue(set(fresh) <= set(committed))
        for name, row in fresh.items():
            self.assertEqual(row, {k: committed[name][k] for k in row})

    def test_svg_has_one_interval_per_scored_run(self):
        rows = [{"date": "2026-10-06", "label": "a", "candidate": "3.8", "baseline": "3.7", "engine": t.DEFAULT_ENGINE,
                 "file": "f", "diff_pp": "1.00", "ci_lo": "-0.50", "ci_hi": "2.50"},
                {"date": "2026-10-06", "label": "b", "candidate": "3.8", "baseline": "3.7", "engine": t.DEFAULT_ENGINE,
                 "file": "g", "diff_pp": "", "ci_lo": "", "ci_hi": ""}]
        svg = t.render_svg(rows)
        self.assertEqual(1, svg.count("<circle"))
        self.assertIn("<title>f: 1.00 pp", svg)


if __name__ == "__main__":
    unittest.main()

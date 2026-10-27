"""Tests for tools/twin_read.py, the reader of TwinSaor's arms (docs/twinsaor.md section 6)."""
import os
import sys
import tempfile
import unittest

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import twin_read  # noqa: E402

REPORT = """# Team bench

| Opponent team | Battles | Score share | Rounds won | Survival |
|---|---|---|---|---|
| ags.lunartwins.LunarTwins 1.4a | 20 | %s%% | 571/700 | 81.6%% |
| kc.twins.GeminiTeam 2.1 | 20 | %s%% | 500/700 | 70.0%% |
| **All** | 40 | 50.0%% | 1071/1400 | 75.8%% |

| Opponent team | Rounds | Focus fire |
|---|---|---|
| ags.lunartwins.LunarTwins 1.4a | 700 | 64.1%% |
"""


class TwinReadTest(unittest.TestCase):
    def write(self, a, b):
        fd, path = tempfile.mkstemp(suffix=".md")
        with os.fdopen(fd, "w", encoding="utf-8") as f:
            f.write(REPORT % (a, b))
        return path

    def test_reads_one_share_per_team_and_skips_the_total_and_focus_tables(self):
        s = twin_read.shares(self.write("58.4", "61.0"))
        self.assertEqual(s, {"ags.lunartwins.LunarTwins 1.4a": 58.4, "kc.twins.GeminiTeam 2.1": 61.0})

    def test_paired_difference_and_its_error(self):
        r = twin_read.compare({"a": 50.0, "b": 60.0}, {"a": 51.0, "b": 63.0})
        self.assertAlmostEqual(r["diff"], 2.0)
        self.assertAlmostEqual(r["se"], 1.0)
        self.assertAlmostEqual(r["control"], 55.0)
        self.assertEqual(twin_read.verdict(r, 0.5), "fail")  # 2.0 is not more than 2 SE
        r = twin_read.compare({"a": 50.0, "b": 60.0, "c": 40.0}, {"a": 51.0, "b": 61.1, "c": 41.0})
        self.assertEqual(twin_read.verdict(r, 0.5), "pass")

    def test_no_shared_teams_is_no_data(self):
        self.assertEqual(twin_read.verdict(twin_read.compare({"a": 1.0}, {"b": 1.0}), 0.5), "no data")


if __name__ == "__main__":
    unittest.main()

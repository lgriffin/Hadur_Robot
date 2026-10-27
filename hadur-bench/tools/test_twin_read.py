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

    def test_an_incomplete_report_is_not_read(self):
        c = {"a": (10, 50.0), "b": (10, 60.0)}
        self.assertIsNone(twin_read.complete(c, {"a": (10, 51.0), "b": (10, 61.0)}))
        self.assertIn("teams differ", twin_read.complete(c, {"a": (10, 51.0)}))
        self.assertIn("battle counts", twin_read.complete(c, {"a": (10, 51.0), "b": (7, 61.0)}))

    def test_the_aa_arm_must_agree_with_the_control(self):
        self.assertTrue(twin_read.aa_ok(twin_read.compare({"a": 50.0, "b": 60.0}, {"a": 51.0, "b": 59.0})))
        self.assertFalse(twin_read.aa_ok(twin_read.compare({"a": 50.0, "b": 60.0, "c": 40.0},
                                                           {"a": 52.0, "b": 62.1, "c": 42.0})))
        self.assertFalse(twin_read.aa_ok(None))

    def test_a_failed_aa_voids_every_arm(self):
        d = tempfile.mkdtemp()
        def put(arm, a, b):
            with open(os.path.join(d, "twin-r-f-%s.md" % arm), "w", encoding="utf-8") as f:
                f.write(REPORT % (a, b))
        put("C", "50.0", "60.0")
        put("A", "55.0", "65.2")
        put("X", "60.0", "70.1")
        import io
        import contextlib
        out = io.StringIO()
        with contextlib.redirect_stdout(out):
            twin_read.main(["--reports", d, "--run", "r", "--label", "f", "--arms", "C,A,X"])
        text = out.getvalue()
        self.assertIn("A/A check failed", text)
        self.assertIn("| X | 2 |", text)
        self.assertIn("void", text)
        self.assertIn("A/A noisy", text)


if __name__ == "__main__":
    unittest.main()

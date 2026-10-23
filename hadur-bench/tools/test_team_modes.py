"""Tests for team_modes.py (T7, TMODE-1): screen picks and the fresh-seed lock."""

import tempfile
import unittest
import zipfile
from pathlib import Path

import team_modes

REPORT = """# Team bench

## Paired A/B: x vs y

| Opponent team | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
{rows}

| Opponent team | Candidate | Baseline | Paired seeds |
|---|---|---|---|
| a.ATeam 1 | 6 of 6 | 6 of 6 | 6 |
"""


def report(d, name, diffs):
    rows = "\n".join(f"| {t} | 50.0% ± 1.0 | 50.0% ± 1.0 | {m:+.1f} ± {c:.1f} |" for t, (m, c) in diffs.items())
    p = Path(d) / name
    p.write_text(REPORT.format(rows=rows), encoding="utf-8")
    return str(p)


def team_jar(d, jar, members):
    with zipfile.ZipFile(Path(d) / jar, "w") as z:
        z.writestr("x/T.team", "team.members=" + ",".join(members) + "\n")


class TeamModesTest(unittest.TestCase):

    def setUp(self):
        self.d = tempfile.mkdtemp()
        Path(self.d, "census.txt").write_text(
            "# census\na.ATeam 1 | team-0 | a.ATeam_1.jar\nb.BTeam 2 | team-1 | b.BTeam_2.jar\n"
            "c.CTeam 3 | team-2 | c.CTeam_3.jar\n", encoding="utf-8")
        team_jar(self.d, "a.ATeam_1.jar", ["a.A 1", "a.A 1"])
        team_jar(self.d, "b.BTeam_2.jar", ["b.Lead [2]", "b.Droid [2]"])
        team_jar(self.d, "c.CTeam_3.jar", ["c.C"])

    def pick(self):
        soft = report(self.d, "soft.md", {"a.ATeam 1": (5.0, 2.0), "b.BTeam 2": (1.0, 4.0), "c.CTeam 3": (3.0, 2.0)})
        gang = report(self.d, "gang.md", {"a.ATeam 1": (8.0, 3.0), "b.BTeam 2": (6.0, 5.0), "c.CTeam 3": (-1.0, 2.0)})
        out = Path(self.d)
        team_modes.main(["pick", "--report", f"SOFT={soft}", "--report", f"GANG={gang}",
                         "--census", str(out / "census.txt"), "--opponents", self.d,
                         "--out-md", str(out / "pick.md"), "--out-tsv", str(out / "pick.tsv"),
                         "--out-java", str(out / "t.java"), "--out-set", str(out / "set.txt")])
        return out

    def test_pick_takes_the_best_mode_whose_low_end_clears_zero(self):
        out = self.pick()
        java = (out / "t.java").read_text()
        # a: GANG +8 > SOFT +5, both clear; b: GANG +6 +/- 5 clears, SOFT does not; c: SOFT.
        self.assertIn('t.put("a.A", forced(false, true, false, false));', java)
        self.assertIn('t.put("b.Lead", forced(false, true, false, false));', java)
        self.assertIn('t.put("b.Droid", forced(false, true, false, false));', java)
        self.assertIn('t.put("c.C", forced(true, false, false, false));', java)
        self.assertEqual(3, len([l for l in (out / "set.txt").read_text().splitlines() if not l.startswith("#")]))

    def test_lock_keeps_only_confirmed_gains(self):
        out = self.pick()
        confirm = report(self.d, "confirm.md", {"a.ATeam 1": (2.5, 4.0), "b.BTeam 2": (0.5, 3.0), "c.CTeam 3": (-3.0, 2.0)})
        team_modes.main(["lock", "--confirm", confirm, "--pick-tsv", str(out / "pick.tsv"),
                         "--census", str(out / "census.txt"), "--opponents", self.d, "--min-gain", "1.0",
                         "--out-md", str(out / "lock.md"), "--out-java", str(out / "l.java")])
        java = (out / "l.java").read_text()
        self.assertIn('"a.A"', java)
        self.assertNotIn('"b.Lead"', java)
        self.assertNotIn('"c.C"', java)

    def test_a_class_two_teams_share_with_different_picks_is_left_out(self):
        lines, clashes = team_modes.java_lines({"x": {"SOFT"}, "y": {"GANG"}}, {"x": ["s.Same"], "y": ["s.Same"]})
        self.assertEqual([], lines)
        self.assertEqual(["s.Same"], clashes)

    def test_a_class_an_unpicked_team_shares_is_left_out(self):
        lines, clashes = team_modes.java_lines({"x": {"SOFT"}}, {"x": ["s.Same", "s.Own"], "y": ["s.Same"]})
        self.assertEqual(['        t.put("s.Own", forced(true, false, false, false));'], lines)
        self.assertEqual(["s.Same"], clashes)

    def test_a_single_pair_row_has_no_interval(self):
        p = Path(self.d) / "one.md"
        p.write_text("## Paired A/B: x\n\n| Opponent team | Candidate share | Baseline share | Paired diff (pp) |\n"
                     "|---|---|---|---|\n| a.ATeam 1 | 50.0% | 48.0% | +2.0 |\n", encoding="utf-8")
        mean, ci = team_modes.paired(str(p))["a.ATeam 1"]
        self.assertEqual(2.0, mean)
        self.assertEqual(float("inf"), ci)


if __name__ == "__main__":
    unittest.main()

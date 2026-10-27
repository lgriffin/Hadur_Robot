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
        self.assertIn('t.put("a.A", of(Mode.GANG));', java)
        self.assertIn('t.put("b.Lead", of(Mode.GANG));', java)
        self.assertIn('t.put("b.Droid", of(Mode.GANG));', java)
        self.assertIn('t.put("c.C", of(Mode.SOFT));', java)
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
        self.assertEqual(['        t.put("s.Own", of(Mode.SOFT));'], lines)
        self.assertEqual(["s.Same"], clashes)

    def test_a_single_pair_row_has_no_interval(self):
        p = Path(self.d) / "one.md"
        p.write_text("## Paired A/B: x\n\n| Opponent team | Candidate share | Baseline share | Paired diff (pp) |\n"
                     "|---|---|---|---|\n| a.ATeam 1 | 50.0% | 48.0% | +2.0 |\n", encoding="utf-8")
        mean, ci = team_modes.paired(str(p))["a.ATeam 1"]
        self.assertEqual(2.0, mean)
        self.assertEqual(float("inf"), ci)


    def test_base_modes_join_every_entry_in_mode_order(self):
        lines, _ = team_modes.java_lines({"x": {"LANEP"}}, {"x": ["s.X"]}, ("MATEFIRE", "HUNT"))
        self.assertEqual(['        t.put("s.X", of(Mode.MATEFIRE, Mode.HUNT, Mode.LANEP));'], lines)

    def test_min_mean_picks_on_the_mean_alone(self):
        lanep = report(self.d, "lp.md", {"a.ATeam 1": (4.0, 9.0), "b.BTeam 2": (2.0, 1.0), "c.CTeam 3": (3.5, 9.0)})
        lines = report(self.d, "ml.md", {"a.ATeam 1": (3.0, 1.0), "b.BTeam 2": (-1.0, 1.0), "c.CTeam 3": (1.0, 9.0)})
        out = Path(self.d)
        team_modes.main(["pick", "--report", f"LANEP={lanep}", "--report", f"LINES={lines}", "--min-mean", "3.0",
                         "--base", "MATEFIRE,HUNT", "--census", str(out / "census.txt"), "--opponents", self.d,
                         "--out-tsv", str(out / "p.tsv"), "--out-java", str(out / "p.java")])
        java = (out / "p.java").read_text()
        self.assertIn('t.put("a.A", of(Mode.MATEFIRE, Mode.HUNT, Mode.LANEP));', java)
        self.assertNotIn('"b.Lead"', java)
        self.assertIn('t.put("c.C", of(Mode.MATEFIRE, Mode.HUNT, Mode.LANEP));', java)


    def test_control_scores_a_mode_against_both_baselines(self):
        lanep = report(self.d, "lp.md", {"a.ATeam 1": (4.0, 2.0), "b.BTeam 2": (4.0, 2.0), "c.CTeam 3": (0.0, 2.0)})
        bb = report(self.d, "bb.md", {"a.ATeam 1": (0.0, 2.0), "b.BTeam 2": (4.0, 2.0), "c.CTeam 3": (0.0, 2.0)})
        out = Path(self.d)
        team_modes.main(["pick", "--report", f"LANEP={lanep}", "--control", f"LANEP={bb}", "--min-mean", "3.0",
                         "--census", str(out / "census.txt"), "--opponents", self.d, "--out-tsv", str(out / "c.tsv")])
        tsv = (out / "c.tsv").read_text()
        self.assertIn("a.ATeam 1\tLANEP\t4.00", tsv)
        self.assertNotIn("b.BTeam 2", tsv)


    def counters_tsv(self):
        p = Path(self.d, "counters.tsv")
        p.write_text("# counters\nteam\ts1\ts2\na.ATeam 1\tOWN,LINEAR\tFAR\nb.BTeam 2\tOWN\t-\n", encoding="utf-8")
        return str(p)

    def test_screens_write_one_table_and_set_per_screen(self):
        out = Path(self.d)
        team_modes.main(["screens", "--counters", self.counters_tsv(), "--census", str(out / "census.txt"),
                         "--opponents", self.d, "--base", "MATEFIRE,HUNT", "--out-dir", str(out / "w")])
        s1 = (out / "w" / "team-counters-s1.java").read_text()
        self.assertIn('t.put("a.A", of(Mode.MATEFIRE, Mode.HUNT, Mode.OWN, Mode.LINEAR));', s1)
        self.assertIn('t.put("b.Lead", of(Mode.MATEFIRE, Mode.HUNT, Mode.OWN));', s1)
        s2 = (out / "w" / "team-counters-s2.java").read_text()
        self.assertEqual(['        t.put("a.A", of(Mode.MATEFIRE, Mode.HUNT, Mode.FAR));'], s2.splitlines())
        sets = {n: [l.split(" |")[0] for l in (out / "w" / f"team-counters-{n}.txt").read_text().splitlines() if not l.startswith("#")]
                for n in ("s1", "s2", "all")}
        self.assertEqual(["a.ATeam 1", "b.BTeam 2"], sets["s1"])
        self.assertEqual(["a.ATeam 1"], sets["s2"])
        self.assertEqual(["a.ATeam 1", "b.BTeam 2"], sets["all"])

    def test_screens_refuse_a_team_not_in_the_census(self):
        p = Path(self.d, "bad.tsv")
        p.write_text("team\ts1\nz.Nobody 1\tOWN\n", encoding="utf-8")
        with self.assertRaises(SystemExit):
            team_modes.main(["screens", "--counters", str(p), "--census", str(Path(self.d) / "census.txt"),
                             "--opponents", self.d, "--out-dir", str(Path(self.d) / "w")])

    def test_pick_with_counters_takes_the_screen_modes_and_needs_the_low_end(self):
        s1 = report(self.d, "s1.md", {"a.ATeam 1": (4.0, 3.0), "b.BTeam 2": (5.0, 6.0)})
        s2 = report(self.d, "s2.md", {"a.ATeam 1": (6.0, 2.0)})
        out = Path(self.d)
        team_modes.main(["pick", "--counters", self.counters_tsv(), "--report", f"s1={s1}", "--report", f"s2={s2}",
                         "--min-mean", "3.0", "--low-end", "0", "--base", "MATEFIRE,HUNT",
                         "--census", str(out / "census.txt"), "--opponents", self.d,
                         "--out-tsv", str(out / "k.tsv"), "--out-java", str(out / "k.java"), "--out-md", str(out / "k.md")])
        java = (out / "k.java").read_text()
        # a: s2 (FAR) +6 beats s1 +4; b: s1 +5 has its low end under zero, so no pick.
        self.assertIn('t.put("a.A", of(Mode.MATEFIRE, Mode.HUNT, Mode.FAR));', java)
        self.assertNotIn('"b.Lead"', java)
        self.assertIn("a.ATeam 1\tFAR\t6.00", (out / "k.tsv").read_text())
        self.assertIn("s2 (FAR)", (out / "k.md").read_text())

    def test_gate_spreads_the_gains_over_every_team(self):
        mk = report(self.d, "mk.md", {"a.ATeam 1": (6.0, 3.0), "b.BTeam 2": (4.0, 4.0)})
        bb = report(self.d, "gbb.md", {"a.ATeam 1": (2.0, 2.0), "b.BTeam 2": (0.0, 2.0)})
        out = Path(self.d) / "gate.md"
        team_modes.main(["gate", "--report", mk, "--control", bb, "--teams", "20", "--out-md", str(out)])
        text = out.read_text()
        self.assertIn("**+0.45 ±", text)
        self.assertIn("**PASS**", text)


    def counted(self, name, diffs, pairs):
        p = Path(report(self.d, name, diffs))
        rows = "\n".join(f"| {t} | {n} of 16 | {n} of 16 | {n} |" for t, n in pairs.items())
        text = p.read_text().replace("| a.ATeam 1 | 6 of 6 | 6 of 6 | 6 |", rows)
        p.write_text(text, encoding="utf-8")
        return str(p)

    def test_gate_is_incomplete_when_a_team_lacks_its_seeds(self):
        Path(self.d, "gate.txt").write_text("a.ATeam 1 | team-0 | a.ATeam_1.jar\nb.BTeam 2 | team-1 | b.BTeam_2.jar\n")
        mk = self.counted("mk2.md", {"a.ATeam 1": (6.0, 3.0), "b.BTeam 2": (4.0, 4.0)}, {"a.ATeam 1": 16, "b.BTeam 2": 15})
        bb = self.counted("bb2.md", {"a.ATeam 1": (0.0, 2.0), "b.BTeam 2": (0.0, 2.0)}, {"a.ATeam 1": 16, "b.BTeam 2": 16})
        out = Path(self.d) / "g2.md"
        with self.assertRaises(SystemExit):
            team_modes.main(["gate", "--report", mk, "--control", bb, "--set", str(Path(self.d, "gate.txt")),
                             "--seeds", "16", "--out-md", str(out)])
        self.assertIn("**INCOMPLETE**", out.read_text())

    def test_lock_scores_both_baselines_and_sets_only_teams_with_an_entry(self):
        out = self.pick()
        confirm = report(self.d, "c2.md", {"a.ATeam 1": (2.5, 4.0), "b.BTeam 2": (2.0, 3.0), "c.CTeam 3": (3.0, 2.0)})
        bb = report(self.d, "cbb2.md", {"a.ATeam 1": (0.0, 1.0), "b.BTeam 2": (4.0, 1.0), "c.CTeam 3": (0.0, 1.0)})
        Path(self.d, "c.CTeam_3.jar").unlink()
        team_modes.main(["lock", "--confirm", confirm, "--control", bb, "--pick-tsv", str(out / "pick.tsv"),
                         "--census", str(out / "census.txt"), "--opponents", self.d, "--min-gain", "1.0",
                         "--out-md", str(out / "l2.md"), "--out-java", str(out / "l2.java"), "--out-set", str(out / "l2.txt")])
        java = (out / "l2.java").read_text()
        self.assertIn('"a.A"', java)
        self.assertNotIn('"b.Lead"', java, "+2.0 less half of bb's +4.0 is 0")
        teams = [l.split(" |")[0] for l in (out / "l2.txt").read_text().splitlines() if not l.startswith("#")]
        self.assertEqual(["a.ATeam 1"], teams, "c kept but its jar is missing: no entry, not gated")


if __name__ == "__main__":
    unittest.main()

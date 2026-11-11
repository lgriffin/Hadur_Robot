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
        team_modes.main(["pick", "--report", f"HEADON={soft}", "--report", f"LINEAR={gang}",
                         "--census", str(out / "census.txt"), "--opponents", self.d,
                         "--out-md", str(out / "pick.md"), "--out-tsv", str(out / "pick.tsv"),
                         "--out-java", str(out / "t.java"), "--out-set", str(out / "set.txt")])
        return out

    def test_pick_takes_the_best_mode_whose_low_end_clears_zero(self):
        out = self.pick()
        java = (out / "t.java").read_text()
        # a: LINEAR +8 > HEADON +5, both clear; b: LINEAR +6 +/- 5 clears, HEADON does not; c: HEADON.
        self.assertIn('t.put("a.A", of(Mode.LINEAR));', java)
        self.assertIn('t.put("b.Lead", of(Mode.LINEAR));', java)
        self.assertIn('t.put("b.Droid", of(Mode.LINEAR));', java)
        self.assertIn('t.put("c.C", of(Mode.HEADON));', java)
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
        lines, clashes = team_modes.java_lines({"x": {"HEADON"}, "y": {"LINEAR"}}, {"x": ["s.Same"], "y": ["s.Same"]})
        self.assertEqual([], lines)
        self.assertEqual(["s.Same"], clashes)

    def test_a_class_an_unpicked_team_shares_is_left_out(self):
        lines, clashes = team_modes.java_lines({"x": {"HEADON"}}, {"x": ["s.Same", "s.Own"], "y": ["s.Same"]})
        self.assertEqual(['        t.put("s.Own", of(Mode.HEADON));'], lines)
        self.assertEqual(["s.Same"], clashes)

    def test_a_single_pair_row_has_no_interval(self):
        p = Path(self.d) / "one.md"
        p.write_text("## Paired A/B: x\n\n| Opponent team | Candidate share | Baseline share | Paired diff (pp) |\n"
                     "|---|---|---|---|\n| a.ATeam 1 | 50.0% | 48.0% | +2.0 |\n", encoding="utf-8")
        mean, ci = team_modes.paired(str(p))["a.ATeam 1"]
        self.assertEqual(2.0, mean)
        self.assertEqual(float("inf"), ci)


    def test_base_modes_join_every_entry_in_mode_order(self):
        lines, _ = team_modes.java_lines({"x": {"DODGE"}}, {"x": ["s.X"]}, ("MATEFIRE", "HUNT"))
        self.assertEqual(['        t.put("s.X", of(Mode.MATEFIRE, Mode.HUNT, Mode.DODGE));'], lines)

    def test_a_class_the_shipped_table_names_keeps_its_modes(self):
        shipped = {"s.T": {"MATEFIRE", "HUNT", "OWN", "HEADON"}}
        lines, _ = team_modes.java_lines({"x": {"DODGE"}, "y": {"PATH"}}, {"x": ["s.T"], "y": ["s.Y"]},
                                         ("MATEFIRE", "HUNT"), shipped)
        self.assertEqual(['        t.put("s.T", of(Mode.MATEFIRE, Mode.HUNT, Mode.OWN, Mode.HEADON, Mode.DODGE));',
                          '        t.put("s.Y", of(Mode.MATEFIRE, Mode.HUNT, Mode.PATH));'], lines)

    def test_shipped_table_reads_the_t_put_lines(self):
        with tempfile.TemporaryDirectory() as d:
            src = Path(d) / "TeamModes.java"
            src.write_text('        Map<String, Set<Mode>> t = new HashMap<>();\n'
                           '        t.put("a.B", of(Mode.MATEFIRE, Mode.HUNT, Mode.OWN));\n', encoding="utf-8")
            self.assertEqual({"a.B": {"MATEFIRE", "HUNT", "OWN"}}, team_modes.shipped_table(src))

    def test_min_mean_picks_on_the_mean_alone(self):
        lanep = report(self.d, "lp.md", {"a.ATeam 1": (4.0, 9.0), "b.BTeam 2": (2.0, 1.0), "c.CTeam 3": (3.5, 9.0)})
        lines = report(self.d, "ml.md", {"a.ATeam 1": (3.0, 1.0), "b.BTeam 2": (-1.0, 1.0), "c.CTeam 3": (1.0, 9.0)})
        out = Path(self.d)
        team_modes.main(["pick", "--report", f"DODGE={lanep}", "--report", f"CONCORD={lines}", "--min-mean", "3.0",
                         "--base", "MATEFIRE,HUNT", "--census", str(out / "census.txt"), "--opponents", self.d,
                         "--out-tsv", str(out / "p.tsv"), "--out-java", str(out / "p.java")])
        java = (out / "p.java").read_text()
        self.assertIn('t.put("a.A", of(Mode.MATEFIRE, Mode.HUNT, Mode.DODGE));', java)
        self.assertNotIn('"b.Lead"', java)
        self.assertIn('t.put("c.C", of(Mode.MATEFIRE, Mode.HUNT, Mode.DODGE));', java)


    def test_control_scores_a_mode_against_both_baselines(self):
        lanep = report(self.d, "lp.md", {"a.ATeam 1": (4.0, 2.0), "b.BTeam 2": (4.0, 2.0), "c.CTeam 3": (0.0, 2.0)})
        bb = report(self.d, "bb.md", {"a.ATeam 1": (0.0, 2.0), "b.BTeam 2": (4.0, 2.0), "c.CTeam 3": (0.0, 2.0)})
        out = Path(self.d)
        team_modes.main(["pick", "--report", f"DODGE={lanep}", "--control", f"DODGE={bb}", "--min-mean", "3.0",
                         "--census", str(out / "census.txt"), "--opponents", self.d, "--out-tsv", str(out / "c.tsv")])
        tsv = (out / "c.tsv").read_text()
        self.assertIn("a.ATeam 1\tDODGE\t4.00", tsv)
        self.assertNotIn("b.BTeam 2", tsv)


    def counters_tsv(self):
        p = Path(self.d, "counters.tsv")
        p.write_text("# counters\nteam\ts1\ts2\na.ATeam 1\tOWN,LINEAR\tDODGE\nb.BTeam 2\tOWN\t-\n", encoding="utf-8")
        return str(p)

    def test_screens_write_one_table_and_set_per_screen(self):
        out = Path(self.d)
        team_modes.main(["screens", "--counters", self.counters_tsv(), "--census", str(out / "census.txt"),
                         "--opponents", self.d, "--base", "MATEFIRE,HUNT", "--out-dir", str(out / "w")])
        s1 = (out / "w" / "team-counters-s1.java").read_text()
        self.assertIn('t.put("a.A", of(Mode.MATEFIRE, Mode.HUNT, Mode.OWN, Mode.LINEAR));', s1)
        self.assertIn('t.put("b.Lead", of(Mode.MATEFIRE, Mode.HUNT, Mode.OWN));', s1)
        s2 = (out / "w" / "team-counters-s2.java").read_text()
        self.assertEqual(['        t.put("a.A", of(Mode.MATEFIRE, Mode.HUNT, Mode.DODGE));'], s2.splitlines())
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
        # a: s2 (DODGE) +6 beats s1 +4; b: s1 +5 has its low end under zero, so no pick.
        self.assertIn('t.put("a.A", of(Mode.MATEFIRE, Mode.HUNT, Mode.DODGE));', java)
        self.assertNotIn('"b.Lead"', java)
        self.assertIn("a.ATeam 1\tDODGE\t6.00", (out / "k.tsv").read_text())
        self.assertIn("s2 (DODGE)", (out / "k.md").read_text())

    def test_gate_spreads_the_gains_over_every_team(self):
        mk = report(self.d, "mk.md", {"a.ATeam 1": (6.0, 3.0), "b.BTeam 2": (4.0, 4.0)})
        bb = report(self.d, "gbb.md", {"a.ATeam 1": (2.0, 2.0), "b.BTeam 2": (0.0, 2.0)})
        out = Path(self.d) / "gate.md"
        team_modes.main(["gate", "--report", mk, "--control", bb, "--teams", "20", "--out-md", str(out)])
        text = out.read_text()
        self.assertIn("**+0.45 ±", text)
        self.assertIn("**PASS**", text)

    def test_pick_takes_a_mode_and_writes_it_into_the_table(self):
        am = report(self.d, "am.md", {"a.ATeam 1": (6.0, 2.0), "b.BTeam 2": (1.0, 2.0)})
        bb = report(self.d, "abb.md", {"a.ATeam 1": (0.0, 1.0), "b.BTeam 2": (0.0, 1.0)})
        out = Path(self.d)
        team_modes.main(["pick", "--report", f"GANG={am}", "--control", f"GANG={bb}", "--min-mean", "3.0", "--low-end", "0",
                         "--base", "MATEFIRE,HUNT,PATH,DODGE,CONCORD", "--census", str(out / "census.txt"),
                         "--opponents", self.d, "--out-tsv", str(out / "gang.tsv"), "--out-java", str(out / "aim.java"),
                         "--out-md", str(out / "aim.md")])
        java = (out / "aim.java").read_text()
        self.assertIn("Mode.GANG", java)
        self.assertIn("Mode.CONCORD", java)
        self.assertNotIn('"b.', java)
        for mode in ("MATEFIRE", "HUNT", "PATH", "DODGE", "CONCORD"):
            self.assertIn(mode, team_modes.MODES)

    def test_gate_stop_below_ends_a_pilot_with_no_gain(self):
        mk = report(self.d, "pmk.md", {"a.ATeam 1": (-1.0, 3.0), "b.BTeam 2": (0.5, 4.0)})
        bb = report(self.d, "pbb.md", {"a.ATeam 1": (0.0, 2.0), "b.BTeam 2": (0.0, 2.0)})
        out = Path(self.d) / "pilot.md"
        with self.assertRaises(SystemExit) as stop:
            team_modes.main(["gate", "--report", mk, "--control", bb, "--teams", "20", "--min-aps", "0.3",
                             "--stop-below", "0", "--out-md", str(out)])
        self.assertEqual(3, stop.exception.code)
        self.assertIn("the card stops here", out.read_text())
        # A pilot that shows a gain goes on, whatever its verdict.
        up = report(self.d, "pup.md", {"a.ATeam 1": (2.0, 3.0), "b.BTeam 2": (0.5, 4.0)})
        team_modes.main(["gate", "--report", up, "--control", bb, "--teams", "20", "--min-aps", "0.3",
                         "--stop-below", "0", "--out-md", str(Path(self.d) / "pilot2.md")])


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


    def arms_tsv(self):
        p = Path(self.d, "arms.tsv")
        p.write_text("# arms\nname\tadd\tremove\tneeds\nfo\tGANG\t-\t-\ncl\tCLOSE\t-\tHUNT\nnh\t-\tHUNT\t-\n",
                     encoding="utf-8")
        return str(p)

    def shipped_java(self):
        src = Path(self.d) / "TeamModes.java"
        src.write_text('        t.put("b.Lead", of(Mode.MATEFIRE, Mode.PATH));\n'
                       '        t.put("b.Droid", of(Mode.MATEFIRE, Mode.PATH));\n', encoding="utf-8")
        return str(src)

    def test_arms_change_each_team_s_current_entry(self):
        out = Path(self.d)
        team_modes.main(["arms", "--arms", self.arms_tsv(), "--census", str(out / "census.txt"), "--opponents", self.d,
                         "--shipped", self.shipped_java(), "--default", "MATEFIRE,HUNT,CONCORD",
                         "--out-dir", str(out / "w"), "--stem", "farm"])
        fo = (out / "w" / "farm-fo.java").read_text()
        # a and c play the default plus GANG; b starts from its shipped entry.
        self.assertIn('t.put("a.A", of(Mode.GANG, Mode.MATEFIRE, Mode.HUNT, Mode.CONCORD));', fo)
        self.assertIn('t.put("b.Lead", of(Mode.GANG, Mode.MATEFIRE, Mode.PATH));', fo)
        self.assertIn('t.put("c.C", of(Mode.GANG, Mode.MATEFIRE, Mode.HUNT, Mode.CONCORD));', fo)
        cl = (out / "w" / "farm-cl.java").read_text()
        self.assertNotIn('"b.Lead"', cl, "CLOSE needs HUNT, which b does not play")
        self.assertIn('t.put("a.A", of(Mode.MATEFIRE, Mode.HUNT, Mode.CONCORD, Mode.CLOSE));', cl)
        nh = (out / "w" / "farm-nh.java").read_text()
        self.assertIn('t.put("a.A", of(Mode.MATEFIRE, Mode.CONCORD));', nh)
        self.assertNotIn('"b.Lead"', nh, "b plays no HUNT to drop")
        sets = {n: [l.split(" |")[0] for l in (out / "w" / f"farm-{n}.txt").read_text().splitlines() if not l.startswith("#")]
                for n in ("fo", "cl")}
        self.assertEqual(["a.ATeam 1", "b.BTeam 2", "c.CTeam 3"], sets["fo"])
        self.assertEqual(["a.ATeam 1", "c.CTeam 3"], sets["cl"])
        tsv = (out / "w" / "farm-counters.tsv").read_text().splitlines()
        self.assertEqual("team\tfo\tcl\tnh", tsv[1])
        self.assertEqual("b.BTeam 2\tGANG,MATEFIRE,PATH\t-\t-", tsv[3])

    def test_arms_skip_a_team_with_no_jar(self):
        out = Path(self.d)
        Path(self.d, "census.txt").write_text("a.ATeam 1 | team-0 | a.ATeam_1.jar\nz.Sample | team | -\n", encoding="utf-8")
        team_modes.main(["arms", "--arms", self.arms_tsv(), "--census", str(out / "census.txt"), "--opponents", self.d,
                         "--default", "MATEFIRE,HUNT", "--out-dir", str(out / "w")])
        self.assertIn("z.Sample\t-\t-\t-", (out / "w" / "team-farm-counters.tsv").read_text())
        self.assertNotIn("z.Sample", (out / "w" / "team-farm-fo.txt").read_text())

    def test_pick_from_the_arms_counters_writes_the_whole_entry(self):
        out = Path(self.d)
        team_modes.main(["arms", "--arms", self.arms_tsv(), "--census", str(out / "census.txt"), "--opponents", self.d,
                         "--shipped", self.shipped_java(), "--default", "MATEFIRE,HUNT,CONCORD", "--out-dir", str(out / "w")])
        fo = report(self.d, "fo.md", {"a.ATeam 1": (6.0, 3.0), "b.BTeam 2": (1.0, 3.0), "c.CTeam 3": (2.0, 3.0)})
        nh = report(self.d, "nh.md", {"a.ATeam 1": (2.0, 3.0), "b.BTeam 2": (7.0, 3.0), "c.CTeam 3": (-2.0, 3.0)})
        team_modes.main(["pick", "--counters", str(out / "w" / "team-farm-counters.tsv"), "--report", f"fo={fo}",
                         "--report", f"nh={nh}", "--low-end", "0", "--margin", "0",
                         "--census", str(out / "census.txt"), "--opponents", self.d,
                         "--out-tsv", str(out / "f.tsv"), "--out-java", str(out / "f.java")])
        java = (out / "f.java").read_text()
        self.assertIn('t.put("a.A", of(Mode.GANG, Mode.MATEFIRE, Mode.HUNT, Mode.CONCORD));', java)
        self.assertNotIn('"b.Lead"', java, "b plays no HUNT, so nh never reached it")
        self.assertNotIn('"c.C"', java)

    def test_pick_stops_a_pilot_under_the_aps_bar(self):
        out = Path(self.d)
        fo = report(self.d, "fo.md", {"a.ATeam 1": (3.0, 1.0), "b.BTeam 2": (0.0, 1.0), "c.CTeam 3": (0.0, 1.0)})
        args = ["pick", "--report", f"GANG={fo}", "--low-end", "0", "--census", str(out / "census.txt"),
                "--opponents", self.d, "--teams", "10", "--out-md", str(out / "s.md"), "--out-tsv", str(out / "s.tsv")]
        team_modes.main(args + ["--stop-below", "0.2"])
        self.assertIn("+0.30", (out / "s.md").read_text())
        with self.assertRaises(SystemExit) as cm:
            team_modes.main(args + ["--stop-below", "0.5"])
        self.assertEqual(3, cm.exception.code)
        self.assertIn("the card stops here", (out / "s.md").read_text())


    def test_shrink_pulls_noisy_gains_to_the_mode_mean_and_keeps_real_spread(self):
        # Gains +6, 0, -6 read to +/-1.96 (noise variance 1): spread 24 - 1 = 23, so each keeps 23/24 of its gain.
        s = team_modes.shrink({"x": {"a": (6.0, 1.96), "b": (0.0, 1.96), "c": (-6.0, 1.96)}})
        self.assertAlmostEqual(5.75, s["x"]["a"], places=2)
        self.assertAlmostEqual(-5.75, s["x"]["c"], places=2)
        # Gains +2, +1, 0 read to +/-9.8 (noise variance 25): no spread shows, every team gets the mean, +1.
        s = team_modes.shrink({"x": {"a": (2.0, 9.8), "b": (1.0, 9.8), "c": (0.0, 9.8)}})
        for t in "abc":
            self.assertAlmostEqual(1.0, s["x"][t], places=6)
        # The bench's half-widths are Student's t: at 6 paired seeds +/-2.571 is a noise variance of 1, not 1.72.
        self.assertAlmostEqual(2.571, team_modes.t95(6))
        self.assertAlmostEqual(1.96, team_modes.t95(None))
        self.assertAlmostEqual(1.96, team_modes.t95(100))
        six = {"x": {"a": 6, "b": 6, "c": 6}}
        s = team_modes.shrink({"x": {"a": (6.0, 2.571), "b": (0.0, 2.571), "c": (-6.0, 2.571)}}, six)
        self.assertAlmostEqual(5.75, s["x"]["a"], places=2)

    def test_pick_shrink_takes_teams_no_interval_would_and_records_the_shrunk_gain(self):
        out = Path(self.d)
        # No team's low end clears zero, so the interval rule picks nothing; the mean is +2 and nothing but noise
        # separates the teams, so the portfolio rule picks all three at the mode's mean.
        fo = report(self.d, "fo.md", {"a.ATeam 1": (3.0, 6.0), "b.BTeam 2": (2.0, 6.0), "c.CTeam 3": (1.0, 6.0)})
        base = ["pick", "--report", f"GANG={fo}", "--census", str(out / "census.txt"), "--opponents", self.d,
                "--out-tsv", str(out / "p.tsv"), "--out-md", str(out / "p.md")]
        team_modes.main(base + ["--low-end", "0", "--margin", "0"])
        self.assertEqual(1, len((out / "p.tsv").read_text().splitlines()), "the lock keeps none")
        team_modes.main(base + ["--shrink", "--margin", "0"])
        rows = (out / "p.tsv").read_text().splitlines()[1:]
        self.assertEqual(3, len(rows))
        self.assertTrue(all(r.split("\t")[2] == "2.00" for r in rows), rows)
        self.assertIn("portfolio, BENCH-231", (out / "p.md").read_text())
        # A losing mode picks no team however it is shrunk.
        lose = report(self.d, "lose.md", {"a.ATeam 1": (-1.0, 6.0), "b.BTeam 2": (-2.0, 6.0), "c.CTeam 3": (-3.0, 6.0)})
        team_modes.main(["pick", "--report", f"GANG={lose}", "--census", str(out / "census.txt"), "--opponents", self.d,
                         "--out-tsv", str(out / "q.tsv"), "--shrink", "--margin", "0"])
        self.assertEqual(1, len((out / "q.tsv").read_text().splitlines()))


if __name__ == "__main__":
    unittest.main()

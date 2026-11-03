"""BENCH-180: tests of the pc-shelf pilot and confirm-jar tools."""
import os
import sys
import tempfile
import unittest
from pathlib import Path

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import shelf_build  # noqa: E402
import shelf_pilot  # noqa: E402

HEAD = "arm\trobot\topponent\trole\tseed\tworker\tposition\tok\trounds\tscore\ttheirScore\tscore_share\n"


def tsv(rows):
    f = tempfile.NamedTemporaryFile("w", suffix=".tsv", delete=False)
    f.write(HEAD)
    for arm, opp, share in rows:
        f.write(f"{arm}\tr\t{opp}\t-\t1\t0\t0\ttrue\t35\t0\t0\t{share}\n")
    f.close()
    return f.name


class PilotTest(unittest.TestCase):
    def rows(self, wins_mt, wins_aa, n=20):
        out = []
        for i in range(n):
            o = f"bot{i}"
            out += [("c", o, 0.70), ("aa", o, 0.76 if i < wins_aa else 0.70),
                    ("mt", o, 0.80 if i < wins_mt else 0.69)]
        return out

    def test_passes_when_an_arm_beats_the_aa_count(self):
        passed, noise, wins = shelf_pilot.judge(shelf_pilot.read(tsv(self.rows(5, 1))), ["mt"], 5, 3)
        self.assertTrue(passed)
        self.assertEqual((noise, len(wins["mt"])), (1, 5))

    def test_stops_when_no_arm_beats_chance(self):
        passed, _, _ = shelf_pilot.judge(shelf_pilot.read(tsv(self.rows(3, 1))), ["mt"], 5, 3)
        self.assertFalse(passed)

    def test_stop_file_written_and_cleared(self):
        d = tempfile.mkdtemp()
        stop, out = os.path.join(d, "stop"), os.path.join(d, "r.md")
        shelf_pilot.main([tsv(self.rows(0, 0)), "--arms", "mt", "--out", out, "--stop-file", stop])
        self.assertTrue(Path(stop).exists())
        shelf_pilot.main([tsv(self.rows(8, 0)), "--arms", "mt", "--out", out, "--stop-file", stop])
        self.assertFalse(Path(stop).exists())


class BuildTest(unittest.TestCase):
    def test_plan_keeps_switch_order_and_suffix(self):
        abl, env, version = shelf_build.plan({"zl": ["a"], "mt": ["b"], "hl": ["c"]}, "3.21")
        self.assertEqual(abl, ["aa", "slistadd", "hjlist", "szlist"])
        self.assertEqual(version, "3.21aamthlzl")
        self.assertEqual(env, {"SHIELD_ADD": "mt", "HEAT_JIT": "hl", "SHIELD_STILL": "zl"})

    def test_picks_split_by_arm_and_unknown_arm_refused(self):
        d = tempfile.mkdtemp()
        p = os.path.join(d, "pick.tsv")
        Path(p).write_text("A 1\tmt\t5\t1\t5\t10\nB 2\tzl\t4\t1\t5\t10\nA 1\tzl\t9\t1\t5\t10\n")
        self.assertEqual(shelf_build.picks([p]), {"mt": ["A 1"], "zl": ["B 2"]})
        Path(p).write_text("A 1\tc\t5\t1\t5\t10\n")
        with self.assertRaises(SystemExit):
            shelf_build.picks([p])

    def test_dry_run_writes_arms_and_panel(self):
        d = tempfile.mkdtemp()
        pick, panel, out = (os.path.join(d, x) for x in ("pick.tsv", "panel.txt", "picks.txt"))
        Path(pick).write_text("B 2\twl\t6\t1\t5\t10\n")
        Path(panel).write_text("# head\nA 1 | t | a.jar\nB 2 | t | b.jar\n")
        rc = shelf_build.main([pick, "--version", "3.21", "--work", d, "--panel", panel, "--panel-out", out, "--dry-run"])
        self.assertEqual(rc, 0)
        self.assertEqual(Path(out).read_text(), "B 2 | t | b.jar\n")
        arms = Path(d, "shelf.arms").read_text()
        self.assertIn("sh | hadur117.Hadur 3.21aawl | bisect/hadur117.Hadur_3.21aawl.jar", arms)
        self.assertEqual(Path(d, "wl.list").read_text(), "B 2\n")

    def test_no_picks_passes_through(self):
        d = tempfile.mkdtemp()
        out = os.path.join(d, "picks.txt")
        Path(out).write_text("old\n")
        Path(d, "shelf.arms").write_text("old\n")
        rc = shelf_build.main([os.path.join(d, "missing.tsv"), "--version", "3.21", "--work", d,
                               "--panel", out, "--panel-out", out])
        self.assertEqual(rc, 0)
        self.assertFalse(Path(out).exists() or Path(d, "shelf.arms").exists())


if __name__ == "__main__":
    unittest.main()

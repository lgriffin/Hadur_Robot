"""Tests for top5_panels.py and round0_skips.py's multi-arm and SETUP reading (docs/plan-top5.md):
python3 -m unittest discover -s hadur-bench/tools -p "test_top5_tools.py" """
import csv
import os
import sys
import tempfile
import unittest

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import round0_skips  # noqa: E402
import top5_panels  # noqa: E402

CENSUS = """# a census
kc.mega.BeepBoop 2.0 | rank1-band1 | kc.mega.BeepBoop_2.0.jar
a.B 1 | rank2-band1 | a.B_1.jar
c.D 1.0 | rank11-band2 | c.D_1.0.jar
ap.Frederick 1.1 | rank903-band6 | ap.Frederick_1.1.jar
x.Y 0.1a | rank904-band6 | x.Y_0.1a.jar
z.Q 2 | rank905-band6 | z.Q_2.jar
"""


class PanelTest(unittest.TestCase):
    def setUp(self):
        self.dir = tempfile.mkdtemp()
        self.census = os.path.join(self.dir, "census.txt")
        with open(self.census, "w") as f:
            f.write(CENSUS)

    def test_stratified_takes_per_band_in_census_order_and_repeats(self):
        c = top5_panels.read_census(self.census)
        p = top5_panels.stratified(c, 2, 7)
        bands = [top5_panels.band(r) for _, r, _ in p]
        self.assertEqual((bands.count(1), bands.count(2), bands.count(6)), (2, 1, 2))
        self.assertEqual([x[0] for x in p], [x[0] for x in c if x in p], "census order kept")
        self.assertEqual(p, top5_panels.stratified(c, 2, 7))

    def test_halves_interleave_the_census(self):
        prefix = os.path.join(self.dir, "c")
        top5_panels.main(["halves", self.census, prefix])
        names = []
        for h in (1, 2):
            with open(f"{prefix}-half{h}.txt") as f:
                names.append([l.split(" | ")[0] for l in f.read().splitlines() if not l.startswith("#")])
        self.assertEqual(names[0], ["kc.mega.BeepBoop 2.0", "c.D 1.0", "x.Y 0.1a"])
        self.assertEqual(names[1], ["a.B 1", "ap.Frederick 1.1", "z.Q 2"])

    def test_stall_matches_slugs_and_reads_old_tsvs(self):
        c = top5_panels.read_census(self.census)
        rows = [
            {"opponent": "ap.Frederick_1.1", "startup_disable": "1"},
            {"opponent": "x.Y_0.1a", "dis_r0": "1", "r0_result": "win"},  # post-win: not start-up
            {"opponent": "z.Q_2", "dis_r0": "1", "r0_result": ""},        # old TSV, start-up
            {"opponent": "gone.Bot_1", "startup_disable": "1"},
        ]
        panel, missing = top5_panels.stall(c, rows)
        self.assertEqual([x[0] for x in panel], ["ap.Frederick 1.1", "z.Q 2"])
        self.assertEqual(missing, ["gone.Bot_1"])
        out = os.path.join(self.dir, "stall.txt")
        top5_panels.main(["stall", self.census, out, self._tsv(rows)])
        with open(out) as f:
            lines = [l for l in f.read().splitlines() if not l.startswith("#")]
        self.assertEqual(lines, ["ap.Frederick 1.1 | rank903-band6 | ap.Frederick_1.1.jar", "z.Q 2 | rank905-band6 | z.Q_2.jar"])

    def _tsv(self, rows):
        p = os.path.join(self.dir, "r0.tsv")
        cols = ["opponent", "startup_disable", "dis_r0", "r0_result"]
        with open(p, "w", newline="") as f:
            w = csv.DictWriter(f, cols, delimiter="\t", restval="")
            w.writeheader()
            w.writerows(rows)
        return p


class Round0Test(unittest.TestCase):
    def battle(self, name, log):
        d = os.path.join(tempfile.mkdtemp(), "battles", name)
        os.makedirs(d)
        with open(os.path.join(d, "hadur.log"), "w") as f:
            f.write(log)
        return d

    def test_multi_arm_dir_and_setup_record(self):
        d = self.battle("ap.Frederick_1.1-3-nowarm", "0,1,SETUP,0,0,212.4,35.0,3.5,250.9\n0,1,V,1\n0,200,R,0,190,win\n")
        r = round0_skips.scan(d)
        self.assertEqual((r["opponent"], r["slot"], r["build"]), ("ap.Frederick_1.1", "3", "nowarm"))
        self.assertEqual((r["setup_warm"], r["setup_ms"]), (212.4, 250.9))
        self.assertEqual(r["startup_disable"], 0)

    def test_start_up_disable_is_a_round_0_disable_without_a_win(self):
        log = "".join(f"0,{t},SYSTEM: hadur2.Hadur 3.14 skipped turn {t}\n" for t in range(1, 105))
        log += "0,105,V,1\n0,106,SYSTEM: hadur2.Hadur 3.14 has not performed any actions in a reasonable amount of time.\n"
        r = round0_skips.scan(self.battle("z.Q_2-1-baseline", log))
        self.assertEqual((r["build"], r["dis_r0"], r["startup_disable"], r["r0_run"]), ("baseline", 1, 1, 104))
        post = "0,1,V,1\n0,150,R,0,140,win\n0,210,SYSTEM: hadur2.Hadur 3.14 has not performed any actions in a reasonable amount of time.\n"
        r = round0_skips.scan(self.battle("z.Q_2-2", post))
        self.assertEqual((r["build"], r["dis_r0"], r["startup_disable"]), ("candidate", 1, 0))


if __name__ == "__main__":
    unittest.main()

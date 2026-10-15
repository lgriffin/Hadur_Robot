"""Tests for move_lab.py (BENCH-90, the movement lab, docs/bench/move-lab.md): python test_move_lab.py"""

import io
import os
import shutil
import tempfile
import unittest
from contextlib import redirect_stdout

import move_lab as ml

HEADER = "build\topponent\tseed\tround\twon\tsurvived\tticks\tdamageDealt\tdamageTaken\thitRate\tduressTicks\tskips\n"


class MoveLabTest(unittest.TestCase):

    def setUp(self):
        self.tmp = tempfile.mkdtemp()
        self.addCleanup(shutil.rmtree, self.tmp)
        self.set = os.path.join(self.tmp, "panel.txt")
        with open(self.set, "w") as f:
            f.write("# panel\nlab.Knn 1.0 | lab-knn | lab.Knn_1.0.jar\nlab.HeadOn 1.0 | lab-headon | lab.HeadOn_1.0.jar\n")

    def workdir(self, name, damage, survived=None, hit=0.1, build="hadur2.Hadur 3.13si"):
        """damage: {(opponent, seed): [damageTaken per round]}"""
        w = os.path.join(self.tmp, name)
        os.makedirs(os.path.join(w, "battles"))
        rows = [HEADER]
        for (opp, seed), ds in damage.items():
            for i, d in enumerate(ds):
                alive = 1 if survived is None else survived[(opp, seed)][i]
                rows.append(f"{build}\t{opp}\t{seed}\t{i}\t{alive}\t{alive}\t900\t0.0\t{d}\t0.0000\t0\t0\n")
            bd = os.path.join(w, "battles", f"{ml.slug(opp)}-{seed}")
            os.makedirs(bd)
            with open(os.path.join(bd, "result.csv"), "w") as f:
                f.write(f"ok,rounds,theirHitRate\ntrue,{len(ds)},{hit}\n")
        with open(os.path.join(w, "rounds.tsv"), "w") as f:
            f.writelines(rows)
        return w

    def test_hit_rate_found_when_battle_dirs_count_seeds(self):
        # The bench names battle directories 1, 2, ... while the rounds carry the seed (301, ...).
        w = os.path.join(self.tmp, "real")
        bd = os.path.join(w, "battles", "lab.Knn_1.0-1")
        os.makedirs(bd)
        with open(os.path.join(bd, "rounds.tsv"), "w") as f:
            f.write(HEADER + "hadur2.Hadur 3.13si\tlab.Knn 1.0\t301\t0\t1\t1\t900\t0.0\t30\t0.0\t0\t0\n")
        with open(os.path.join(bd, "result.csv"), "w") as f:
            f.write("ok,rounds,theirHitRate\ntrue,1,0.12\n")
        d = ml.read_workdir(w, ["lab.Knn 1.0"])
        self.assertAlmostEqual(d["lab.Knn 1.0"]["301"]["theirHit"], 0.12)

    def test_set_file_names_in_order(self):
        self.assertEqual(ml.load_set(self.set), [("lab.Knn 1.0", "lab-knn"), ("lab.HeadOn 1.0", "lab-headon")])

    def test_one_label_damage_survival_and_hit_rate(self):
        w = self.workdir("a", {("lab.Knn 1.0", "1"): [40, 60, 80], ("lab.Knn 1.0", "2"): [20, 20, 20]},
                         survived={("lab.Knn 1.0", "1"): [1, 1, 0], ("lab.Knn 1.0", "2"): [1, 1, 1]}, hit=0.08)
        data = {"a": ml.read_workdir(w, ["lab.Knn 1.0"])}
        s = ml.summary(data["a"]["lab.Knn 1.0"])
        self.assertAlmostEqual(s["damage"], 40.0)  # mean of 60 and 20
        self.assertAlmostEqual(s["survived"], 100 * (2 / 3 + 1) / 2)
        self.assertAlmostEqual(s["hit"], 8.0)
        self.assertEqual(s["n"], 2)

    def test_paired_difference_over_common_seeds_only(self):
        a = self.workdir("a", {("lab.Knn 1.0", "1"): [50], ("lab.Knn 1.0", "2"): [70], ("lab.Knn 1.0", "3"): [90]})
        b = self.workdir("b", {("lab.Knn 1.0", "1"): [40], ("lab.Knn 1.0", "2"): [50], ("lab.Knn 1.0", "9"): [0]})
        da, db = (ml.read_workdir(x, ["lab.Knn 1.0"])["lab.Knn 1.0"] for x in (a, b))
        dd, _, hd = ml.paired(da, db)
        self.assertEqual(sorted(dd), [-20.0, -10.0])
        self.assertEqual(len(hd), 2)  # the shooter's hit rate, where both battles report one
        m, h, n = ml.mean_ci(dd)
        self.assertAlmostEqual(m, -15.0)
        self.assertEqual(n, 2)
        self.assertAlmostEqual(h, 12.706 * (50 ** 0.5 / 1) / (2 ** 0.5) / 1, places=2)  # t(1) * sd / sqrt(2), sd = 7.07

    def test_interval_needs_two_values(self):
        m, h, n = ml.mean_ci([3.0])
        self.assertEqual((m, n), (3.0, 1))
        self.assertTrue(h != h)
        self.assertEqual(ml.pm(m, h), "+3.0 (n=1)")

    def test_markdown_table_with_two_labels(self):
        a = self.workdir("a", {("lab.Knn 1.0", "1"): [50, 50], ("lab.Knn 1.0", "2"): [70, 70]})
        b = self.workdir("b", {("lab.Knn 1.0", "1"): [40, 40], ("lab.Knn 1.0", "2"): [60, 60]})
        out = io.StringIO()
        with redirect_stdout(out):
            self.assertEqual(ml.main([f"base={a}", f"heat={b}", "--set", self.set]), 0)
        lines = out.getvalue().splitlines()
        self.assertTrue(lines[0].startswith("| Opponent | base dmg/round |"))
        knn = next(l for l in lines if l.startswith("| lab.Knn 1.0"))
        self.assertIn("-10.0 ± 0.0", knn)
        self.assertIn("| 2 |", knn)
        headon = next(l for l in lines if l.startswith("| lab.HeadOn 1.0"))
        self.assertIn("| 0 | - | - |", headon)
        self.assertTrue(any(l.startswith("| **All") for l in lines))
        widths = {l.count("|") for l in lines if l.startswith("|")}
        self.assertEqual(len(widths), 1, "every table row has the same number of cells")

    def test_several_builds_need_a_choice(self):
        a = self.workdir("a", {("lab.Knn 1.0", "1"): [10]}, build="x")
        with open(os.path.join(a, "rounds.tsv"), "a") as f:
            f.write("y\tlab.Knn 1.0\t1\t0\t1\t1\t900\t0.0\t99\t0.0000\t0\t0\n")
        with self.assertRaises(SystemExit):
            ml.read_workdir(a, ["lab.Knn 1.0"])
        d = ml.read_workdir(a, ["lab.Knn 1.0"], build="y")
        self.assertAlmostEqual(d["lab.Knn 1.0"]["1"]["damage"], 99.0)

    def test_falls_back_to_battle_rounds_files(self):
        a = self.workdir("a", {("lab.Knn 1.0", "1"): [30]})
        bd = os.path.join(a, "battles", "lab.Knn_1.0-1")
        shutil.move(os.path.join(a, "rounds.tsv"), os.path.join(bd, "rounds.tsv"))
        d = ml.read_workdir(a, ["lab.Knn 1.0"])
        self.assertAlmostEqual(d["lab.Knn 1.0"]["1"]["damage"], 30.0)


if __name__ == "__main__":
    unittest.main()

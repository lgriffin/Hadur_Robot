"""Tests for export_melee.py: python test_export_melee.py"""

import csv
import os
import tempfile
import unittest

import export_melee as em

MELEE = "rank,robot,score,firsts,survival,bulletDamage\n"
HEADER = ["field", "seed", "build", "rank", "robot", "score", "firsts", "survival", "bulletDamage"]


def _write(path, text):
    os.makedirs(os.path.dirname(path), exist_ok=True)
    with open(path, "w", encoding="utf-8") as f:
        f.write(text)


def build_work(root):
    """Two fields. Field A: seeds 1, 2 and 10 for the candidate and seed 1 for the baseline.
    Field B: one battle that never wrote melee.csv, and a stray directory."""
    a = os.path.join(root, "A", "battles")
    _write(os.path.join(a, "melee-1", "melee.csv"), MELEE + "1,hadur2.Hadur 3.8,300,5,100,40\n2,aaa.Big 1.0,200,1,50,30\n")
    _write(os.path.join(a, "melee-1-baseline", "melee.csv"), MELEE + "1,aaa.Big 1.0,310,6,90,35\n2,hadur2.Hadur 3.7,250,2,60,20\n")
    _write(os.path.join(a, "melee-2", "melee.csv"), MELEE + "1,aaa.Big 1.0,300,5,100,40\n")
    _write(os.path.join(a, "melee-10", "melee.csv"), MELEE + "1,hadur2.Hadur 3.8,400,5,100,40\n")
    os.makedirs(os.path.join(root, "B", "battles", "melee-1"))
    os.makedirs(os.path.join(root, "B", "battles", "notes"))
    _write(os.path.join(root, "B", "battles", "notes", "melee.csv"), MELEE + "1,zzz.Stray 1.0,1,1,1,1\n")
    os.makedirs(os.path.join(root, "C"))
    return root


class RowsTest(unittest.TestCase):

    def setUp(self):
        self.tmp = tempfile.TemporaryDirectory()
        self.addCleanup(self.tmp.cleanup)
        self.work = build_work(os.path.join(self.tmp.name, "work"))

    def test_one_row_per_entrant_with_field_seed_and_build(self):
        rows = list(em.rows(self.work, "3.8", "3.7"))
        self.assertEqual(rows[0], ["A", "1", "3.8", "1", "hadur2.Hadur 3.8", "300", "5", "100", "40"])
        self.assertEqual(rows[1], ["A", "1", "3.8", "2", "aaa.Big 1.0", "200", "1", "50", "30"])
        self.assertEqual(len(rows), 2 + 2 + 1 + 1)

    def test_baseline_battles_take_the_baseline_build_and_are_skipped_without_one(self):
        base = [r for r in em.rows(self.work, "3.8", "3.7") if r[2] == "3.7"]
        self.assertEqual([r[4] for r in base], ["aaa.Big 1.0", "hadur2.Hadur 3.7"])
        self.assertEqual(base[0][1], "1")
        self.assertTrue(all(r[2] == "3.8" for r in em.rows(self.work, "3.8", "")))

    def test_seeds_are_in_numeric_order(self):
        seeds = [r[1] for r in em.rows(self.work, "3.8", "3.7") if r[3] == "1" and r[2] == "3.8"]
        self.assertEqual(seeds, ["1", "2", "10"])

    def test_a_directory_that_is_not_a_battle_or_has_no_standings_gives_no_rows(self):
        self.assertEqual({r[0] for r in em.rows(self.work, "3.8", "3.7")}, {"A"})


class MainTest(unittest.TestCase):

    def test_writes_the_header_and_tab_separated_rows_with_lf_endings(self):
        with tempfile.TemporaryDirectory() as tmp:
            work = build_work(os.path.join(tmp, "work"))
            out = os.path.join(tmp, "out.tsv")
            argv = em.sys.argv
            em.sys.argv = ["export_melee.py", "--work", work, "--build", "3.8", "--baseline-build", "3.7", "--out", out]
            try:
                self.assertEqual(em.main(), 0)
            finally:
                em.sys.argv = argv
            with open(out, "rb") as f:
                content = f.read()
            with open(out, newline="", encoding="utf-8") as f:
                parsed = list(csv.reader(f, delimiter="\t"))
        self.assertNotIn(b"\r\n", content)
        self.assertEqual(parsed[0], HEADER)
        self.assertEqual(len(parsed), 1 + 6)
        self.assertTrue(all(len(r) == len(HEADER) for r in parsed))

    def test_an_empty_work_dir_writes_only_the_header_and_fails(self):
        with tempfile.TemporaryDirectory() as tmp:
            out = os.path.join(tmp, "out.tsv")
            argv = em.sys.argv
            em.sys.argv = ["export_melee.py", "--work", tmp, "--build", "3.8", "--out", out]
            try:
                self.assertEqual(em.main(), 1)
            finally:
                em.sys.argv = argv


if __name__ == "__main__":
    unittest.main()

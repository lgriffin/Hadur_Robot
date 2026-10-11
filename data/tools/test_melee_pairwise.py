"""Tests for melee_pairwise.py: python test_melee_pairwise.py"""

import math
import os
import tempfile
import unittest

import melee_pairwise as mp

MELEE = "rank,robot,score,firsts,survival,bulletDamage\n"
ROUNDS = "round,place,fielded,duelOpponent,duelWon,sentryHitsTaken,sentryHitsGiven,skippedTurns\n"
ROUNDS_DEATH = ROUNDS.rstrip() + ",deathTick,killer,lastHit" + chr(10)


def write(path, text):
    os.makedirs(os.path.dirname(path), exist_ok=True)
    with open(path, "w", encoding="utf-8") as f:
        f.write(text)


class PairwiseTest(unittest.TestCase):

    def test_pairwise_share_places_and_duels(self):
        with tempfile.TemporaryDirectory() as tmp:
            b1 = os.path.join(tmp, "a", "battles", "melee-1")
            write(os.path.join(b1, "melee.csv"), MELEE
                  + "1,aaa.Big 1.0,300,5,100,100\n2,hadur2.Hadur 3.8,200,2,100,100\n3,bbb.Small 2.0,100,0,0,0\n")
            write(os.path.join(b1, "rounds.csv"),
                  ROUNDS + "1,2,3,aaa.Big 1.0,0,0,0,4\n2,1,3,-,-,0,0,1\n")
            per_opp, per_field = mp.analyse(tmp, "hadur2.Hadur")
        big, small = per_opp["aaa.Big 1.0"], per_opp["bbb.Small 2.0"]
        self.assertAlmostEqual(big["shares"][0], 40.0)
        self.assertAlmostEqual(small["shares"][0], 200 / 3.0, places=5)
        self.assertEqual((big["wins"], small["wins"]), (0, 1))
        self.assertEqual((big["duels"], big["duelwon"]), (1, 0))
        self.assertEqual(per_field["a"]["skipped"], [5])
        self.assertAlmostEqual(per_field["a"]["aps"][0], (40.0 + 200 / 3.0) / 2)
        self.assertIn("aaa.Big 1.0", mp.render(per_opp, per_field, {"aaa.Big 1.0": 1}))


class DeathColumnsTest(unittest.TestCase):

    def test_field_table_reports_deaths_and_killers(self):
        with tempfile.TemporaryDirectory() as tmp:
            b1 = os.path.join(tmp, "a", "battles", "melee-1")
            write(os.path.join(b1, "melee.csv"), MELEE
                  + "1,aaa.Big 1.0,300,5,100,100\n2,hadur2.Hadur 3.8,200,2,100,100\n")
            write(os.path.join(b1, "rounds.csv"), ROUNDS_DEATH
                  + "1,2,2,-,-,0,0,0,100,aaa.Big 1.0,aaa.Big 1.0\n"
                  + "2,2,2,-,-,0,0,0,300,aaa.Big 1.0,bbb.Small 2.0\n"
                  + "3,1,2,-,-,0,0,0,-,-,-\n")
            per_opp, per_field = mp.analyse(tmp, "hadur2.Hadur")
            text = mp.render(per_opp, per_field, {})
        f = per_field["a"]
        self.assertEqual((f["deaths"], f["death_ticks"], f["killers"]), (2, [100, 300], {"aaa.Big 1.0": 2}))
        self.assertIn("| a | 1 | 3 |", text)
        self.assertIn("| 2 | 200 | aaa.Big 1.0 (2) |", text)
        self.assertIn("| aaa.Big 1.0 | 2 | 100% |", text)

    def test_old_rounds_file_leaves_the_death_columns_out(self):
        with tempfile.TemporaryDirectory() as tmp:
            b1 = os.path.join(tmp, "a", "battles", "melee-1")
            write(os.path.join(b1, "melee.csv"), MELEE
                  + "1,aaa.Big 1.0,300,5,100,100\n2,hadur2.Hadur 3.8,200,2,100,100\n")
            write(os.path.join(b1, "rounds.csv"), ROUNDS + "1,2,2,-,-,0,0,0\n")
            per_opp, per_field = mp.analyse(tmp, "hadur2.Hadur")
            text = mp.render(per_opp, per_field, {})
        self.assertNotIn("Top killer", text)
        self.assertNotIn("killed Hadur", text)


def battle(root, field, name, build_score, other_score, hadur="hadur2.Hadur 3.8"):
    d = os.path.join(root, field, "battles", name)
    write(os.path.join(d, "melee.csv"), MELEE
          + "1,%s,%d,1,1,1\n2,aaa.Big 1.0,%d,1,1,1\n" % (hadur, build_score, other_score))


class PooledPairedTest(unittest.TestCase):

    def test_interval_and_mean_over_the_cells(self):
        m, h = mp.t_interval([1.0, 3.0])
        self.assertAlmostEqual(m, 2.0)
        self.assertAlmostEqual(h, 12.706 * math.sqrt(2.0) / math.sqrt(2))
        self.assertTrue(math.isnan(mp.t_interval([1.0])[1]))
        self.assertTrue(math.isnan(mp.t_interval([])[0]))
        self.assertAlmostEqual(mp.t_interval([1.0] * 40 + [3.0] * 40)[1],
                               1.96 * mp.sd([1.0] * 40 + [3.0] * 40) / math.sqrt(80))

    def test_work_dir_pairs_a_seed_with_its_baseline(self):
        with tempfile.TemporaryDirectory() as tmp:
            battle(tmp, "a", "melee-1", 300, 100)
            battle(tmp, "a", "melee-1-baseline", 100, 100, "hadur2.Hadur 3.7")
            battle(tmp, "a", "melee-2", 100, 100)
            cells = mp.cells_from_work(tmp, "hadur2.Hadur")
        self.assertAlmostEqual(cells[("a", 1)]["cand"], 75.0)
        self.assertAlmostEqual(cells[("a", 1)]["base"], 50.0)
        self.assertNotIn("base", cells[("a", 2)])
        text = mp.render_paired(cells, "3.8", "3.7")
        self.assertIn("Pooled over 1 cells in 1 fields: candidate 75.0, baseline 50.0, difference +25.0", text)
        self.assertIn("1 cells had only one build and were left out.", text)

    def test_tsv_from_export_melee(self):
        with tempfile.TemporaryDirectory() as tmp:
            path = os.path.join(tmp, "x.tsv")
            rows = [["field", "seed", "build", "rank", "robot", "score", "firsts", "survival", "bulletDamage"]]
            for seed, (c, b) in enumerate([(300, 100), (200, 200)], start=1):
                rows += [["a", str(seed), "3.8", "1", "hadur2.Hadur 3.8", str(c), "0", "0", "0"],
                         ["a", str(seed), "3.8", "2", "aaa.Big 1.0", "100", "0", "0", "0"],
                         ["a", str(seed), "3.7", "1", "hadur2.Hadur 3.7", str(b), "0", "0", "0"],
                         ["a", str(seed), "3.7", "2", "aaa.Big 1.0", "100", "0", "0", "0"]]
            write(path, "\n".join("\t".join(r) for r in rows) + "\n")
            cells, build, baseline = mp.cells_from_tsv(path, "hadur2.Hadur")
            swapped = mp.cells_from_tsv(path, "hadur2.Hadur", "3.7", "3.8")[0]
        self.assertEqual((build, baseline), ("3.8", "3.7"))
        diffs = [v["cand"] - v["base"] for v in cells.values()]
        self.assertAlmostEqual(mean_of(diffs), 12.5)
        self.assertAlmostEqual(mean_of([v["cand"] - v["base"] for v in swapped.values()]), -12.5)
        self.assertIn("| a | 2 | 70.8 | 58.3 | +12.5 +/- ", mp.render_paired(cells, build, baseline))


def mean_of(xs):
    return sum(xs) / len(xs)


if __name__ == "__main__":
    unittest.main()

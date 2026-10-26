"""BENCH-104: tools/melee_s0.py builds the melee census fields and reads a paired run."""

import os
import tempfile
import unittest

import melee_s0 as ms

RANKINGS = "<table>" + "".join(
    "<tr><td>%d</td><td></td><td>%s</td><td>%.2f</td></tr>" % (i, n, 70 - i)
    for i, n in enumerate(["aaa.Big 1.0", "hadur2.Hadur 3.15", "bbb.Gone 1.0"]
                          + ["c.R%02d 1.0" % k for k in range(1, 18)], 1)) + "</table>"

HEADER = ("round,place,fielded,duelOpponent,duelWon,sentryHitsTaken,sentryHitsGiven,skippedTurns,"
          "deathTick,killer,lastHit,duelTick,duelEnergy,duelOppEnergy,takenCrowd,takenDuel\n")


def write(path, text):
    os.makedirs(os.path.dirname(path), exist_ok=True)
    with open(path, "w", encoding="utf-8") as f:
        f.write(text)


class FieldsTest(unittest.TestCase):

    def test_fields_drop_hadur_and_missing_and_top_up(self):
        with tempfile.TemporaryDirectory() as tmp:
            src = os.path.join(tmp, "rank.html")
            write(src, RANKINGS)
            fs = ms.build_fields(src, tmp, 317, {"bbb.Gone 1.0"})
            names = [r["name"] for f in fs for r in f]
            self.assertEqual(len(fs), 2)
            self.assertTrue(all(len(f) == 9 for f in fs))
            self.assertNotIn("hadur2.Hadur 3.15", names)
            self.assertNotIn("bbb.Gone 1.0", names)
            self.assertEqual(len(set(names)), 18)
            with open(os.path.join(tmp, "melee-census-317.txt"), encoding="utf-8") as f:
                suite = f.read()
            self.assertIn("F02 | --set melee-census-317/f02.txt --melee true --field 1000x1000", suite)
            with open(os.path.join(tmp, "melee-census-317", "f01.txt"), encoding="utf-8") as f:
                body = f.read()
            self.assertRegex(body, r"\| melee-\d+ \| \S+_1\.0\.jar")
            self.assertEqual(ms.census_ranks(os.path.join(tmp, "melee-census-317.txt"))["aaa.Big 1.0"], 1)


class ReadTest(unittest.TestCase):

    def battle(self, work, field, n, baseline, us_score, rounds):
        d = os.path.join(work, field, "battles", "melee-%d%s" % (n, "-baseline" if baseline else ""))
        us = "hadur2.Hadur 3.17.1" + ("aa" if baseline else "bb")
        write(os.path.join(d, "melee.csv"), "rank,robot,score,firsts,survival,bulletDamage\n"
              "1,aaa.Big 1.0,100,1,1,1\n2,%s,%d,0,0,0\n" % (us, us_score))
        write(os.path.join(d, "rounds.csv"), HEADER + "".join(rounds))

    def test_gate_tables_and_width(self):
        with tempfile.TemporaryDirectory() as tmp:
            sets = os.path.join(tmp, "census")
            write(os.path.join(sets, "f.txt"), "aaa.Big 1.0 | melee-3 | aaa.Big_1.0.jar\n")
            write(os.path.join(sets, "suite.txt"), "F01 | --set f.txt --melee true\nF02 | --set f.txt --melee true\n")
            work = os.path.join(tmp, "work")
            duel_won = "0,1,2,aaa.Big 1.0,1,0,0,2,-,-,aaa.Big 1.0,800,60.00,40.00,30.00,5.00\n"
            duel_lost = "1,2,2,aaa.Big 1.0,0,0,0,4,900,aaa.Big 1.0,aaa.Big 1.0,700,20.00,50.00,50.00,30.00\n"
            crowd = "2,2,2,-,-,0,0,0,300,aaa.Big 1.0,aaa.Big 1.0,-,-,-,90.00,0.00\n"
            for field in ("F01", "F02"):
                for n in (1, 2):
                    self.battle(work, field, n, False, 100, [duel_won, duel_lost, crowd])
                    self.battle(work, field, n, True, 100, [duel_won, duel_lost, crowd])
            res = ms.analyse(work, ms.census_ranks(os.path.join(sets, "suite.txt")))
            self.assertEqual(res["fields"], 2)
            self.assertEqual(res["paired"][0], 0.0)
            self.assertTrue(res["aa_pass"])
            d = res["duel"][(1, 10)]
            self.assertEqual((d["n"], d["won"], d["lead_n"], d["lead_won"], d["behind_n"]), (16, 8, 8, 8, 8))
            self.assertEqual(res["crowd_deaths"], {1: 8})
            self.assertEqual(res["won"][(1, 10)], [8, 24])
            res["width"] = ms.width_check(work, work)
            self.assertIsNone(res["width"][4])
            self.assertIn("Width check on the same fields and seeds: ", ms.render(res, "t"))
            write(os.path.join(work, "conditions.json"), '{"parallel": 1}')
            res["width"] = ms.width_check(work, work)
            self.assertIn("Width check: not applicable, both runs used 1 worker.", ms.render(res, "t"))
            text = ms.render(res, "t")
            self.assertIn("**PASS**", text)
            self.assertIn("| 1-10 | 16 | 66.7% | 50% | 40.0 | 45.0 | 100% of 8 | 0% of 8 |", text)
            self.assertIn("Three or more alive: 56.7. Two alive (the endgame): 11.7.", text)

    def test_gate_fails_on_a_shift(self):
        with tempfile.TemporaryDirectory() as tmp:
            sets = os.path.join(tmp, "census")
            write(os.path.join(sets, "f.txt"), "aaa.Big 1.0 | melee-3 | aaa.Big_1.0.jar\n")
            write(os.path.join(sets, "suite.txt"), "F01 | --set f.txt\nF02 | --set f.txt\n")
            work = os.path.join(tmp, "work")
            for field, extra in (("F01", 10), ("F02", 12)):
                self.battle(work, field, 1, False, 100 + extra, [])
                self.battle(work, field, 1, True, 100, [])
            res = ms.analyse(work, ms.census_ranks(os.path.join(sets, "suite.txt")))
            self.assertFalse(res["aa_pass"])
            self.assertEqual(ms.main(["read", work, "--census", os.path.join(sets, "suite.txt"),
                                      "--out", os.path.join(tmp, "r.md")]), 1)


if __name__ == "__main__":
    unittest.main()


class ScreenTest(unittest.TestCase):
    # @Tag("BENCH-109")

    def run_of(self, work, scores, rounds):
        for field, per_seed in scores.items():
            for n, score in enumerate(per_seed, 1):
                d = os.path.join(work, field, "battles", "melee-%d" % n)
                write(os.path.join(d, "melee.csv"), "rank,robot,score,firsts,survival,bulletDamage\n"
                      "1,aaa.Big 1.0,100,1,1,1\n2,hadur2.Hadur 3.17.1x,%d,0,0,0\n" % score)
                write(os.path.join(d, "rounds.csv"), HEADER + "".join(rounds))

    def test_pairs_by_field_and_seed_and_judges(self):
        with tempfile.TemporaryDirectory() as tmp:
            sets = os.path.join(tmp, "census")
            write(os.path.join(sets, "f.txt"), "aaa.Big 1.0 | melee-3 | aaa.Big_1.0.jar\n")
            write(os.path.join(sets, "suite.txt"), "F01 | --set f.txt\nF02 | --set f.txt\n")
            won = "0,1,2,aaa.Big 1.0,1,0,0,2,-,-,aaa.Big 1.0,800,60.00,40.00,30.00,5.00\n"
            lost = "1,2,2,aaa.Big 1.0,0,0,0,4,900,aaa.Big 1.0,aaa.Big 1.0,700,20.00,50.00,50.00,30.00\n"
            third = "2,3,2,-,-,0,0,0,300,aaa.Big 1.0,aaa.Big 1.0,-,-,-,90.00,0.00\n"
            base, aa, up, down = (os.path.join(tmp, x) for x in ("aa", "bb", "up", "down"))
            self.run_of(base, {"F01": [100, 102], "F02": [98, 100]}, [won, lost, third])
            self.run_of(aa, {"F01": [100, 102], "F02": [98, 100]}, [won, lost, third])
            self.run_of(up, {"F01": [106, 107], "F02": [104, 106]}, [won, won, third])
            self.run_of(down, {"F01": [106, 107], "F02": [104, 106]}, [lost, lost, third])
            rows, base_phase = ms.screen(base, [("bb", aa), ("up", up), ("down", down)],
                                         ms.census_ranks(os.path.join(sets, "suite.txt")))
            self.assertEqual(base_phase[0], 50.0)
            self.assertAlmostEqual(base_phase[2], 100.0 / 3)
            by = {r["name"]: r for r in rows}
            self.assertEqual(by["bb"]["paired"][0], 0.0)
            self.assertEqual((by["up"]["fields"], by["up"]["pairs"]), (2, 4))
            self.assertEqual(ms.verdict(by["bb"], base_phase), "CLEAN")
            self.assertEqual(ms.verdict(by["up"], base_phase), "PASS")
            self.assertEqual(ms.verdict(by["down"], base_phase), "FAIL", "the 1-30 endgame band fell 50 points")
            text = ms.render_screen(rows, base_phase, "t")
            self.assertIn("| bb | +0.00 ± 0.00 | 2 | 4 |", text)
            self.assertIn("**PASS**", text)

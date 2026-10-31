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
            self.assertIn("| bb | +0.00 ± 0.00 | 2 | 4 (0) |", text)
            self.assertIn("**PASS**", text)

    def test_base2_pairs_with_both_baselines(self):
        # @Tag("BENCH-115")
        with tempfile.TemporaryDirectory() as tmp:
            sets = os.path.join(tmp, "census")
            write(os.path.join(sets, "f.txt"), "aaa.Big 1.0 | melee-3 | aaa.Big_1.0.jar\n")
            write(os.path.join(sets, "suite.txt"), "F01 | --set f.txt\nF02 | --set f.txt\n")
            won = "0,1,2,aaa.Big 1.0,1,0,0,2,-,-,aaa.Big 1.0,800,60.00,40.00,30.00,5.00\n"
            base, bb, arm = (os.path.join(tmp, x) for x in ("aa", "bb", "arm"))
            self.run_of(base, {"F01": [100, 100], "F02": [100, 100]}, [won])
            self.run_of(bb, {"F01": [102, 102], "F02": [102, 102]}, [won])
            self.run_of(arm, {"F01": [102, 102], "F02": [102, 102]}, [won])
            ranks = ms.census_ranks(os.path.join(sets, "suite.txt"))
            alone, _ = ms.screen(base, [("bb", bb), ("arm", arm)], ranks)
            both, _ = ms.screen(base, [("bb", bb), ("arm", arm)], ranks, base2_work=bb)
            gain = alone[1]["paired"][0]
            self.assertGreater(gain, 0)
            self.assertAlmostEqual(both[0]["paired"][0], alone[0]["paired"][0], msg="bb stays against aa")
            self.assertAlmostEqual(both[1]["paired"][0], gain / 2, msg="the arm pairs with the mean of aa and bb")
            self.assertIn("mean of the aa and bb baselines", ms.render_screen(both, _, "t", both=True))

    def test_base2_pools_phase_and_counts_every_baseline_battle(self):
        # @Tag("BENCH-115")
        with tempfile.TemporaryDirectory() as tmp:
            sets = os.path.join(tmp, "census")
            write(os.path.join(sets, "f.txt"), "aaa.Big 1.0 | melee-3 | aaa.Big_1.0.jar\n")
            write(os.path.join(sets, "suite.txt"), "F01 | --set f.txt\n")
            won = "0,1,2,aaa.Big 1.0,1,0,0,2,-,-,aaa.Big 1.0,800,60.00,40.00,30.00,5.00\n"
            lost = "1,2,2,aaa.Big 1.0,0,0,0,4,900,aaa.Big 1.0,aaa.Big 1.0,700,20.00,50.00,50.00,30.00\n"
            base, bb, arm = (os.path.join(tmp, x) for x in ("aa", "bb", "arm"))
            self.run_of(base, {"F01": [100, 100, 100]}, [won, won])
            self.run_of(bb, {"F01": [100, 100]}, [lost, lost])
            self.run_of(arm, {"F01": [100, 100]}, [won, lost])
            ranks = ms.census_ranks(os.path.join(sets, "suite.txt"))
            rows, phase = ms.screen(base, [("bb", bb), ("arm", arm)], ranks, base2_work=bb)
            self.assertAlmostEqual(phase[0], 60.0, msg="aa's 6 duels won of 6 and bb's 0 of 4 pool to 60%")
            self.assertEqual(phase[1], 10)
            by = {r["name"]: r for r in rows}
            self.assertEqual(by["arm"]["missing"], 1, "aa's third battle is missing from bb and the arm")
            self.assertEqual(ms.verdict(by["arm"], phase), "INCOMPLETE")

    def test_incomplete_or_unmeasured_never_passes(self):
        with tempfile.TemporaryDirectory() as tmp:
            sets = os.path.join(tmp, "census")
            write(os.path.join(sets, "f.txt"), "aaa.Big 1.0 | melee-3 | aaa.Big_1.0.jar\n")
            write(os.path.join(sets, "suite.txt"), "F01 | --set f.txt\nF02 | --set f.txt\n")
            won = "0,1,2,aaa.Big 1.0,1,0,0,2,-,-,aaa.Big 1.0,800,60.00,40.00,30.00,5.00\n"
            crowd = "1,3,2,-,-,0,0,0,300,aaa.Big 1.0,aaa.Big 1.0,-,-,-,90.00,0.00\n"
            base, part, blind = (os.path.join(tmp, x) for x in ("aa", "part", "blind"))
            self.run_of(base, {"F01": [100, 102], "F02": [98, 100]}, [won, crowd])
            self.run_of(part, {"F01": [110, 112]}, [won, crowd])
            self.run_of(blind, {"F01": [110, 112], "F02": [108, 110]}, [crowd])
            rows, base_phase = ms.screen(base, [("part", part), ("blind", blind)],
                                         ms.census_ranks(os.path.join(sets, "suite.txt")), seeds=2)
            by = {r["name"]: r for r in rows}
            self.assertEqual(by["part"]["missing"], 2)
            self.assertEqual(ms.verdict(by["part"], base_phase), "INCOMPLETE")
            self.assertEqual(ms.verdict(by["blind"], base_phase), "NO DATA", "no 1-30 endgame duel to compare")
            short, _ = ms.screen(part, [("bb", base)], ms.census_ranks(os.path.join(sets, "suite.txt")), seeds=2)
            self.assertEqual(ms.verdict(short[0], base_phase), "INCOMPLETE", "a short baseline is incomplete too")
            out = os.path.join(tmp, "r.md")
            self.assertEqual(ms.main(["screen", base, "--arm", "x=" + blind, "--census",
                                      os.path.join(sets, "suite.txt"), "--seeds", "2", "--out", out]), 1,
                             "no bb copy, no clean exit")


    def test_gain_and_survival_bars(self):
        with tempfile.TemporaryDirectory() as tmp:
            sets = os.path.join(tmp, "census")
            write(os.path.join(sets, "f.txt"), "aaa.Big 1.0 | melee-3 | aaa.Big_1.0.jar\n")
            write(os.path.join(sets, "suite.txt"), "F01 | --set f.txt\nF02 | --set f.txt\n")
            won = "0,1,10,aaa.Big 1.0,1,0,0,2,-,-,aaa.Big 1.0,800,60.00,40.00,30.00,5.00\n"
            fifth = "1,5,10,-,-,0,0,0,300,aaa.Big 1.0,aaa.Big 1.0,-,-,-,90.00,0.00\n"
            ninth = "1,9,10,-,-,0,0,0,300,aaa.Big 1.0,aaa.Big 1.0,-,-,-,90.00,0.00\n"
            base, arm, dies = (os.path.join(tmp, x) for x in ("aa", "up", "dies"))
            self.run_of(base, {"F01": [100, 102], "F02": [98, 100]}, [won, fifth])
            self.run_of(arm, {"F01": [103, 104], "F02": [101, 103]}, [won, fifth])
            self.run_of(dies, {"F01": [106, 107], "F02": [104, 106]}, [won, ninth])
            rows, base_phase = ms.screen(base, [("up", arm), ("dies", dies)],
                                         ms.census_ranks(os.path.join(sets, "suite.txt")))
            self.assertAlmostEqual(base_phase[4], (100 + 500 / 9) / 2)
            by = {r["name"]: r for r in rows}
            self.assertEqual(ms.verdict(by["up"], base_phase), "PASS")
            self.assertEqual(ms.verdict(by["up"], base_phase, gain=1.5), "FAIL", "a higher bar")
            self.assertEqual(ms.verdict(by["dies"], base_phase), "PASS")
            self.assertEqual(ms.verdict(by["dies"], base_phase, survival_slack=1), "FAIL",
                             "outlived 22 points fewer of the others")
            text = ms.render_screen(rows, base_phase, "t", 0.5, 1, {"up": 1.5})
            self.assertIn("up is judged at +1.5, not +0.5.", text)
            self.assertIn("others outlived no more than 1 point lower", text)

    def test_skipped_turns_bar(self):
        """BENCH-146: an arm whose skipped turns a battle rise more than 20% over aa's fails whatever its APS."""
        with tempfile.TemporaryDirectory() as tmp:
            sets = os.path.join(tmp, "census")
            write(os.path.join(sets, "f.txt"), "aaa.Big 1.0 | melee-3 | aaa.Big_1.0.jar\n")
            write(os.path.join(sets, "suite.txt"), "F01 | --set f.txt\nF02 | --set f.txt\n")
            won = "0,1,10,aaa.Big 1.0,1,0,0,%d,-,-,aaa.Big 1.0,800,60.00,40.00,30.00,5.00\n"
            fifth = "1,5,10,-,-,0,0,%d,300,aaa.Big 1.0,aaa.Big 1.0,-,-,-,90.00,0.00\n"
            base, arm, slow = (os.path.join(tmp, x) for x in ("aa", "up", "slow"))
            self.run_of(base, {"F01": [100, 102], "F02": [98, 100]}, [won % 10, fifth % 10])
            self.run_of(arm, {"F01": [103, 104], "F02": [101, 103]}, [won % 12, fifth % 11])
            self.run_of(slow, {"F01": [103, 104], "F02": [101, 103]}, [won % 20, fifth % 10])
            rows, base_phase = ms.screen(base, [("up", arm), ("slow", slow)],
                                         ms.census_ranks(os.path.join(sets, "suite.txt")))
            self.assertAlmostEqual(base_phase[5], 20.0)
            by = {r["name"]: r for r in rows}
            self.assertAlmostEqual(ms.skips_over(by["up"], base_phase), 0.15)
            self.assertEqual(ms.verdict(by["up"], base_phase), "PASS", "15% more skips is inside the bar")
            self.assertAlmostEqual(ms.skips_over(by["slow"], base_phase), 0.5)
            self.assertEqual(ms.verdict(by["slow"], base_phase), "FAIL", "50% more skips fails at any APS")
            text = ms.render_screen(rows, base_phase, "t")
            self.assertIn("skipped turns a battle no more than 20%\nover aa's", text)
            self.assertIn("| 30.0 (+50%) | **FAIL** |", text)
            self.assertIn("| 20.0 | - |", text)


if __name__ == "__main__":
    unittest.main()

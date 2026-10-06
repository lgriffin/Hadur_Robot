"""Tests for melee_pairwise.py: python test_melee_pairwise.py"""

import os
import tempfile
import unittest

import melee_pairwise as mp

MELEE = "rank,robot,score,firsts,survival,bulletDamage\n"
ROUNDS = "round,place,fielded,duelOpponent,duelWon,sentryHitsTaken,sentryHitsGiven,skippedTurns\n"


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


if __name__ == "__main__":
    unittest.main()

"""Tests for melee_firepower.py: python test_melee_firepower.py"""

import os
import tempfile
import unittest

import melee_firepower as mf

HEADER = "round,robot,shots,power,hits,damage,bulletHits,crowdShots,crowdPower,crowdHits,crowdDamage\n"


def write(path, text):
    os.makedirs(os.path.dirname(path), exist_ok=True)
    with open(path, "w", encoding="utf-8") as f:
        f.write(text)


class FirepowerTest(unittest.TestCase):

    def test_pools_rounds_and_battles(self):
        with tempfile.TemporaryDirectory() as tmp:
            write(os.path.join(tmp, "A", "battles", "melee-1", "bullets.csv"), HEADER
                  + "0,hadur2.Hadur 3.13,10,15.0,2,20.0,1,8,12.0,2,20.0\n"
                  + "1,hadur2.Hadur 3.13,10,25.0,3,30.0,0,6,15.0,1,10.0\n"
                  + "0,aaa.Big 1.0,20,60.0,8,120.0,2,20,60.0,8,120.0\n")
            write(os.path.join(tmp, "B", "battles", "melee-1", "bullets.csv"), HEADER
                  + "0,aaa.Big 1.0,10,30.0,2,30.0,0,10,30.0,2,30.0\n")
            table = {t["robot"]: t for t in mf.rows(mf.pool(tmp))}
            h = table["hadur2.Hadur 3.13"]
            self.assertEqual(h["battles"], 1)
            self.assertAlmostEqual(h["shots_per_round"], 10.0)
            self.assertAlmostEqual(h["mean_power"], 2.0)
            self.assertAlmostEqual(h["hit_rate"], 0.25)
            self.assertAlmostEqual(h["damage_per_round"], 25.0)
            self.assertAlmostEqual(h["crowd_power"], 27.0 / 14)
            self.assertAlmostEqual(h["crowd_hit_rate"], 3.0 / 14)
            self.assertAlmostEqual(h["lost_to_bullets"], 0.05)
            big = table["aaa.Big 1.0"]
            self.assertEqual(big["battles"], 2)
            self.assertAlmostEqual(big["damage_per_round"], 75.0)
            self.assertAlmostEqual(big["mean_power"], 3.0)

    def test_sorted_by_damage_and_empty_work(self):
        with tempfile.TemporaryDirectory() as tmp:
            self.assertEqual(mf.rows(mf.pool(tmp)), [])
            write(os.path.join(tmp, "melee-1", "bullets.csv"), HEADER
                  + "0,a,1,1.0,0,0.0,0,0,0.0,0,0.0\n0,b,1,3.0,1,16.0,0,1,3.0,1,16.0\n")
            self.assertEqual([t["robot"] for t in mf.rows(mf.pool(tmp))], ["b", "a"])
            self.assertEqual(mf.main(["--work", os.path.join(tmp, "none")]), 1)


if __name__ == "__main__":
    unittest.main()

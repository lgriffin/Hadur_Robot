"""Tests for hit_forensics.py (MOVE-9, docs/plan-top3.md): python test_hit_forensics.py"""

import os
import shutil
import tempfile
import unittest

import hit_forensics as hf


class HitForensicsToolTest(unittest.TestCase):

    def setUp(self):
        self.work = tempfile.mkdtemp()
        self.addCleanup(shutil.rmtree, self.work)
        self.set = os.path.join(self.work, "set.txt")
        with open(self.set, "w") as f:
            f.write("# header\nweak.Bot 1.0 | rank500-band5 | weak.Bot_1.0.jar\n"
                    "listed.Bot 2 | rank100-band3 | listed.Bot_2.jar\n")
        self.listed = os.path.join(self.work, "list.txt")
        with open(self.listed, "w") as f:
            f.write("listed.Bot 2 | x | listed.Bot_2.jar\n")

    def battle(self, name, rounds, hf_lines):
        d = os.path.join(self.work, "battles", name)
        os.makedirs(d)
        with open(os.path.join(d, "rounds.tsv"), "w") as f:
            f.write("header\n" + "row\n" * rounds)
        with open(os.path.join(d, "hadur.log"), "w") as f:
            f.write("EW,0,10,1,1,1,1,1,400\n" + "".join(l + "\n" for l in hf_lines))

    def test_damage_by_class_and_rating_per_round(self):
        self.battle("weak.Bot_1.0-1", 2, [
            "HF,0,100,headon,0.010,0.500,0.100,400.0,3.00,1",   # 16 damage, safe
            "HF,0,200,learned,0.400,0.500,0.900,400.0,1.00,1",  # 4, known
            "HF,1,50,nowave,NaN,NaN,NaN,300.0,2.00,1",          # 10, n/a
            "HF,1,60,learned,0.400,0.500,0.500,400.0,1.00,0",   # shield drove: not counted
        ])
        self.battle("listed.Bot_2-1", 1, ["HF,0,10,headon,0,0,0,400,3.00,1"])
        roles = hf.read_set(self.set)
        t = hf.tally(self.work, roles, skip=hf.read_list(self.listed))
        self.assertEqual(t["all"]["rounds"], 2)
        self.assertEqual(t["all"][("headon", "safe")], 16)
        self.assertEqual(t["all"][("learned", "known")], 4)
        self.assertEqual(t["all"][("nowave", "n/a")], 10)
        self.assertIn("401-800", t)
        self.assertNotIn("51-200", t)       # the listed robot is skipped
        out = hf.render(t)
        self.assertIn("| all | 1 | 15.0 | 8.0 | 0.0 | 2.0 | 5.0 | 8.0 | 0.0 | 2.0 |", out)

    def test_damage_and_parse(self):
        self.assertEqual(hf.damage(3.0), 16)
        self.assertEqual(hf.damage(0.5), 2)
        self.assertIsNone(hf.parse_hf("SB,0,1,off,0,0,1"))
        self.assertEqual(hf.rating(float("nan")), "n/a")
        self.assertEqual(hf.rating(0.7), "known")


if __name__ == "__main__":
    unittest.main()

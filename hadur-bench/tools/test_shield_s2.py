"""BENCH-100: tools/shield_s2.py builds the list adds, opening drives, shipped aims, candidate and verify gate."""
import os
import random
import sys
import tempfile
import unittest

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import shield_s2  # noqa: E402

LISTDATA = '''final class ShieldListData {
    static String[] lines() {
        return new String[] {
            "a.Listed 1.0",
            "b.Bare",
        };
    }
}
'''
HEADER = "arm\trobot\topponent\trole\tseed\tok\tscore_share\n"


class ShieldS2Test(unittest.TestCase):
    def setUp(self):
        self.dir = tempfile.mkdtemp()

    def file(self, name, text):
        path = os.path.join(self.dir, name)
        os.makedirs(os.path.dirname(path), exist_ok=True)
        with open(path, "w", encoding="utf-8") as f:
            f.write(text)
        return path

    def test_entries(self):
        listdata = self.file("ShieldListData.java", LISTDATA)
        pick = self.file("pick.tsv", "a.Listed 1.0\tsasvsk\t6\t1\t4\t8\n"
                         "c.New 2\tsask\t7\t2\t4\t8\nd.Mover 1\tsasvsk\t9\t3\t4\t8\nb.Bare 3\tsask\t6\t1\t4\t8\n")
        adds, moves = shield_s2.entries(pick, listdata, "sasvsk")
        self.assertEqual(["c.New 2", "d.Mover 1"], adds, "listed robots, with or without version, are not added")
        self.assertEqual(["a.Listed 1.0", "d.Mover 1"], moves)

    def sp_log(self, run, robot, seed, arm, records):
        body = "".join("SP,%d,900,5,%d,%.9f,%d,40,0\n" % (i, k, off, exact) for i, (k, off, exact) in enumerate(records))
        self.file(os.path.join(run, "battles", "%s-%s-%s" % (shield_s2.slug(robot), seed, arm), "hadur.log"),
                  "SR,0,900,1,1,0,0,0,0.0,10.0,-\n" + body)

    def test_aims(self):
        listdata = self.file("ShieldListData.java", LISTDATA)
        pick = self.file("pick.tsv", "d.Mover 1\tsasvsk\t9\t3\t4\t8\n")
        run = "run"
        rows = []
        for robot in ("a.Listed 1.0", "d.Mover 1", "e.Off 1", "b.Bare 3"):
            for arm in ("c", "sask", "sasvsk"):
                for seed in (1, 2, 3, 4):
                    rows.append("%s\tx\t%s\tband1\t%d\ttrue\t0.5\n" % (arm, robot, seed))
        self.file(os.path.join(run, "arms.tsv"), HEADER + "".join(rows))
        # a.Listed plays sask: three of four battles end on predictor 7, the last round's record counts.
        for seed, k in ((1, 7), (2, 7), (3, 7), (4, 2)):
            self.sp_log(run, "a.Listed 1.0", seed, "sask", [(0, 0, 9), (k, 0.01 * seed, 12)])
        # d.Mover plays the move arm; its sask logs disagree and must not be read.
        for seed in (1, 2, 3, 4):
            self.sp_log(run, "d.Mover 1", seed, "sasvsk", [(11, -0.02, 6)])
            self.sp_log(run, "d.Mover 1", seed, "sask", [(3, 0, 30)])
        # e.Off is not shielded by the candidate; b.Bare's predictor never reaches 5 exact.
        for seed in (1, 2, 3, 4):
            self.sp_log(run, "e.Off 1", seed, "sask", [(4, 0, 30)])
            self.sp_log(run, "b.Bare 3", seed, "sask", [(4, 0, 2)])
        lines = shield_s2.aims(os.path.join(self.dir, run), pick, listdata, "sask", "sasvsk", 5)
        self.assertEqual(["7 0.020000000 a.Listed 1.0", "11 -0.020000000 d.Mover 1"], lines)

    def test_aim_needs_half(self):
        self.assertIsNone(shield_s2.aim_for([(5, 1, 0, 9), None, None, (5, 2, 0, 9), None], 5))
        self.assertEqual((1, 0.0), shield_s2.aim_for([(5, 1, 0, 9), (5, 1, 0, 9), None, None], 5))
        self.assertIsNone(shield_s2.aim_for([], 5))

    def test_candidate_spec(self):
        self.assertEqual(("slistadd,smovelist,saimlist", "mtmvak"), shield_s2.candidate_spec(["x"], ["y"], ["z"]))
        self.assertEqual(("saimlist", "ak"), shield_s2.candidate_spec([], [], ["z"]))
        self.assertEqual(("", ""), shield_s2.candidate_spec([], [], []))
        arms = shield_s2.candidate_arms("3.16", "ak")
        self.assertIn("t2 | hadur2.Hadur 3.16ak | bisect/hadur2.Hadur_3.16ak.jar\n", arms)

    def gate_rows(self, gain):
        rng = random.Random(5)
        rows = []
        for o in range(300):
            for arm, add in (("c", 0), ("aa", 0), ("t2", gain)):
                for seed in range(4):
                    s = 0.6 + add / 100.0 + rng.gauss(0, 0.02)
                    rows.append("%s\tx\topp%d\tband%d\t%d\ttrue\t%.4f\n" % (arm, o, 1 + o % 5, seed, s))
        return self.file("verify.tsv", HEADER + "".join(rows))

    def test_gate(self):
        ok, m, ci, n, aa = shield_s2.gate(self.gate_rows(1.0), "t2", 1217, 0.15, 0.0)
        self.assertTrue(ok)
        self.assertEqual(300, n)
        self.assertAlmostEqual(300 * 1.0 / 1217, m, delta=0.05)
        ok, m, ci, n, aa = shield_s2.gate(self.gate_rows(0.0), "t2", 1217, 0.15, 0.0)
        self.assertFalse(ok)


if __name__ == "__main__":
    unittest.main()

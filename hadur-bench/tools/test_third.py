import os
import sys
import tempfile
import unittest

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import third  # noqa: E402


def log(dir_, lines):
    os.makedirs(dir_, exist_ok=True)
    with open(os.path.join(dir_, "hadur.log"), "w") as f:
        f.writelines(l + "\n" for l in lines)


class ThirdTest(unittest.TestCase):
    """BENCH-111: the pc-1v1-third card's expert, candidate and panel steps."""

    def test_experts_from_our_dp_records(self):
        with tempfile.TemporaryDirectory() as d:
            b = os.path.join(d, "battles")
            log(os.path.join(b, "a.B_1.0-1-sp"), ["0,10,DP,0,10,7,3.00,3,4,0,1,9", "1,10,DP,1,10,14,9.00,9,9,0,1,20"])
            log(os.path.join(b, "a.B_1.0-2-sp"), ["1,10,DP,1,10,14,8.00,8,9,0,1,20"])
            log(os.path.join(b, "a.B_1.0-1-c"), ["1,10,DP,1,10,3,8.00,8,9,0,1,20"])
            log(os.path.join(b, "c.D_2-1-sp"), ["1,10,DP,1,10,5,1.00,1,9,4,0,0"])
            pick = os.path.join(d, "pick.tsv")
            with open(pick, "w") as f:
                f.write("a.B 1.0\tsp\t6\t1\t3\t6\nc.D 2\tsp\t6\t1\t3\t6\ne.F 1\twp\t9\t2\t3\t6\n")
            self.assertEqual(["14 a.B 1.0", "-1 c.D 2"], third.experts(d, pick, "sp"))

    def test_disagreeing_battles_learn_in_battle(self):
        with tempfile.TemporaryDirectory() as d:
            b = os.path.join(d, "battles")
            log(os.path.join(b, "x_1-1-sp"), ["1,1,DP,1,1,14,9.00,9,9,0,1,1"])
            log(os.path.join(b, "x_1-2-sp"), ["1,1,DP,1,1,5,9.00,9,9,0,1,1"])
            self.assertEqual(-1, third.expert_for(third.battle_logs(d, "x 1", "sp")))

    def test_panel_and_names(self):
        self.assertEqual(["a.B 1.0", "c.D 2"], third.plan_names(["14 a.B 1.0", "-1 c.D 2", "junk"]))
        with tempfile.TemporaryDirectory() as d:
            s = os.path.join(d, "set.txt")
            with open(s, "w") as f:
                f.write("# head\na.B 1.0 | r1 | a.jar\nz.Z 1 | r2 | z.jar\n")
            self.assertEqual(["a.B 1.0 | r1 | a.jar\n"], third.panel(s, ["a.B 1.0"]))

    def test_candidate_arms(self):
        arms = third.candidate_arms("3.17.1", "dp")
        self.assertIn("t4 | hadur117.Hadur 3.17.1dp | bisect/hadur117.Hadur_3.17.1dp.jar\n", arms)


if __name__ == "__main__":
    unittest.main()

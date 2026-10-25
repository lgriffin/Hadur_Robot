"""Tests for tools/saor_gates.py, the evaluator of Saor's bench gates (docs/saor.md)."""
import os
import sys
import tempfile
import unittest

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import saor_gates  # noqa: E402

HEADER = "rank,robot,score,firsts,survival,bulletDamage\n"
SAOR = "hadur117.micro.Saor 0.1"
FIG = "kc.micro.Figment 1.0"
WAL = "wompi.Wallaby 5.1"


class SaorGatesTest(unittest.TestCase):
    def setUp(self):
        self.work = tempfile.mkdtemp()
        self.n = 0

    def battle(self, rows, baseline=False):
        self.n += 1
        d = os.path.join(self.work, "battles", "melee-%d%s" % (self.n, "-baseline" if baseline else ""))
        os.makedirs(d)
        with open(os.path.join(d, "melee.csv"), "w", encoding="utf-8") as f:
            f.write(HEADER)
            for i, (name, score, firsts, survival, damage) in enumerate(rows):
                f.write("%d,%s,%d,%d,%d,%d\n" % (i + 1, name, score, firsts, survival, damage))

    # @Tag("SAOR-12")
    def test_aps_is_the_mean_over_opponents_of_the_mean_pairwise_share(self):
        self.battle([(SAOR, 300, 20, 900, 800), (FIG, 100, 10, 500, 600), (WAL, 300, 5, 400, 900)])
        self.battle([(SAOR, 100, 5, 200, 300), (FIG, 300, 30, 950, 700)])
        r = saor_gates.evaluate([self.work], "hadur117.micro.Saor", pairings=2)
        # Figment: (75 + 25) / 2 = 50; Wallaby: 50. APS 50.
        self.assertEqual(r["per_opponent"], {FIG: 50.0, WAL: 50.0})
        self.assertEqual(r["SAOR-12 aps"]["value"], 50.0)
        self.assertEqual(r["SAOR-12 aps"]["verdict"], "fail")

    # @Tag("SAOR-12")
    def test_a_short_run_is_marked_short_and_baselines_are_skipped(self):
        self.battle([(SAOR, 900, 30, 900, 800), (FIG, 100, 5, 100, 100)])
        self.battle([("other.Bot 1.0", 900, 30, 900, 800), (SAOR, 100, 5, 100, 100)], baseline=True)
        r = saor_gates.evaluate([self.work], "hadur117.micro.Saor")
        self.assertEqual(r["battles"], 1)
        self.assertEqual(r["SAOR-12 aps"]["verdict"], "pass (short: 1 of 155)")
        self.assertEqual(r["U1 survival"]["value"], round(100 * 30 / 35, 2))

    # @Tag("SAOR-13")
    def test_figment_gate_counts_battles_out_survived(self):
        self.battle([(SAOR, 300, 20, 900, 800), (FIG, 100, 10, 500, 600)])
        self.battle([(SAOR, 300, 20, 400, 800), (FIG, 100, 10, 500, 600)])
        self.battle([(SAOR, 300, 20, 600, 800), (WAL, 100, 10, 500, 600)])
        r = saor_gates.evaluate([self.work], "hadur117.micro.Saor", needed_battles=2)
        self.assertEqual(r["SAOR-13 figment"]["n"], 2)
        self.assertEqual(r["SAOR-13 figment"]["value"], 50.0)
        self.assertEqual(r["SAOR-13 figment"]["verdict"], "pass")

    # @Tag("SAOR-14")
    def test_wallaby_gate_counts_battles_out_damaged(self):
        self.battle([(SAOR, 300, 20, 900, 800), (WAL, 100, 10, 500, 900)])
        self.battle([(SAOR, 300, 20, 400, 950), (WAL, 100, 10, 500, 900)])
        self.battle([(SAOR, 300, 20, 400, 100), (WAL, 100, 10, 500, 900)])
        r = saor_gates.evaluate([self.work], "hadur117.micro.Saor", needed_battles=3)
        self.assertEqual(r["SAOR-14 wallaby"]["n"], 3)
        self.assertAlmostEqual(r["SAOR-14 wallaby"]["value"], 33.33)
        self.assertEqual(r["SAOR-14 wallaby"]["verdict"], "fail")

    def test_no_battles_is_no_data_and_exit_1(self):
        self.assertEqual(saor_gates.main(["--work", self.work]), 1)


if __name__ == "__main__":
    unittest.main()

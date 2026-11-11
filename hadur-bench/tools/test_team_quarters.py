"""Tests for team_quarters.py: close-quarters fire on HadurTeam, read from a run's bullets.log."""

import math
import tempfile
import unittest
from pathlib import Path

import team_quarters

ROUNDS = "round,membersAlive,enemiesAlive,won,shots,shotsWithMateInLane,countBelowTruth,countReports,bulletsOnMates,focusFireRatio\n"
US = "hadur117.Hadur 3.22qt"


def battle(root, name, rounds, bullets):
    d = Path(root) / "battles" / name
    d.mkdir(parents=True)
    (d / "rounds.csv").write_text(ROUNDS + "0,5,0,1,0,0,0,0,0,-\n" * rounds, encoding="utf-8")
    (d / "bullets.log").write_text("".join(bullets), encoding="utf-8")


class TeamQuartersTest(unittest.TestCase):
    def test_damage_and_opponent(self):
        self.assertEqual(4.0, team_quarters.damage(1.0))
        self.assertEqual(16.0, team_quarters.damage(3.0))
        self.assertEqual("jab.Enjambre", team_quarters.opponent("jab.Enjambre_3-9701-baseline"))
        self.assertEqual("jab.Enjambre", team_quarters.opponent("jab.Enjambre_3-9701"))

    def test_aimed_picks_the_member_on_the_line(self):
        # Fired north from (500, 500): the member 100 px north is aimed at, the one east is not.
        members = f"{US} (1):500.0:600.0:0.0:8.0;{US} (2):900.0:500.0:0.0:0.0"
        self.assertAlmostEqual(100.0, team_quarters.aimed(500, 500, 0.0, members))
        self.assertAlmostEqual(400.0, team_quarters.aimed(500, 500, math.pi / 2, members))
        # 20 degrees off the nearer line still counts; south-west has no member within 25 degrees.
        self.assertAlmostEqual(100.0, team_quarters.aimed(500, 500, math.radians(20), members))
        self.assertIsNone(team_quarters.aimed(500, 500, math.radians(225), members))
        self.assertIsNone(team_quarters.aimed(500, 500, 0.0, "-"))

    def test_report_splits_candidate_and_baseline(self):
        near = f"{US} (1):500.0:600.0:0.0:8.0"
        far = f"{US} (1):500.0:900.0:0.0:8.0"
        with tempfile.TemporaryDirectory() as d:
            battle(d, "jab.Enjambre_3-9700", 2, [
                f"0,10,F,1,jab.Bee 3 (1),3.00,500.0,500.0,0.0000,{near}\n",   # near, hits: 16
                f"0,12,H,1,jab.Bee 3 (1),{US} (1),3.00\n",
                f"0,20,F,2,jab.Bee 3 (1),1.00,500.0,500.0,0.0000,{near}\n",   # near, misses
                f"0,30,F,3,jab.Bee 3 (2),2.00,500.0,500.0,0.0000,{far}\n",    # far, hits: 10
                f"0,60,H,3,jab.Bee 3 (2),{US} (1),2.00\n",
                f"1,10,F,1,{US} (1),3.00,0.0,0.0,0.0000,-,jab.Bee 3 (1):1:1:0:0\n",  # ours: not read
                f"1,12,H,1,{US} (1),jab.Bee 3 (1),3.00\n",
            ])
            battle(d, "jab.Enjambre_3-9700-baseline", 1, [
                f"0,10,F,1,jab.Bee 3 (1),3.00,500.0,500.0,0.0000,{near}\n",
                f"0,12,H,1,jab.Bee 3 (1),{US} (1),3.00\n",
            ])
            table = team_quarters.read([d])
            c, b = table["jab.Enjambre"]["candidate"], table["jab.Enjambre"]["baseline"]
            self.assertEqual((2, 26.0, 16.0, 2, 1), (c["rounds"], c["aimed"], c["near"], c["near_shots"], c["near_hits"]))
            self.assertEqual((1, 16.0, 16.0), (b["rounds"], b["aimed"], b["near"]))
            md = team_quarters.report([d])
            self.assertIn("| jab.Enjambre | 2 | 13.0 | 8.0 | 50.0% of 2 | 1 | 16.0 | 16.0 | 100.0% of 1 | -50% |", md)


if __name__ == "__main__":
    unittest.main()

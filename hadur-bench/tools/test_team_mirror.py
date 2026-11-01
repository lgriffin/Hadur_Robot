"""Tests for team_mirror.py: OgiTeam's and HadurTeam's score parts, team by team (BENCH-166)."""

import tempfile
import unittest
from pathlib import Path

import team_mirror

ROUNDS = "round,membersAlive,enemiesAlive,won,shots,shotsWithMateInLane,countBelowTruth,countReports,bulletsOnMates,focusFireRatio\n"
HEAD = ("ok,rounds,score,theirScore,firsts,survival,theirSurvival,bulletDamage,theirBulletDamage,skippedTurns\n")


def battle(root, name, subject, score, theirs, surv, tsurv, bul, tbul, lost):
    d = Path(root) / "battles" / name
    d.mkdir(parents=True)
    (d / "result.csv").write_text(HEAD + f"true,1,{score},{theirs},1,{surv},{tsurv},{bul},{tbul},0\n", encoding="utf-8")
    (d / "rounds.csv").write_text(ROUNDS + f"0,{5 - lost},0,1,0,0,0,0,0,-\n", encoding="utf-8")
    (d / "bullets.log").write_text(
        f"0,10,F,1,{subject} (1),3.00,0,0,0,-\n0,12,H,1,{subject} (1),rz.Hawk 0.2 (1),3.00\n", encoding="utf-8")


class TeamMirrorTest(unittest.TestCase):
    def test_parts_and_lever(self):
        with tempfile.TemporaryDirectory() as o, tempfile.TemporaryDirectory() as h:
            # Same team: Ogi gives up 50 survival points, HadurTeam 250 (four members lost); bullets alike.
            battle(o, "rz.HOFSwarm_1.1-1", "cz.libors.Ogi v1", 1000, 150, 600, 50, 300, 100, 0)
            battle(h, "rz.HOFSwarm_1.1-1", "hadur117.Hadur 3.21aa", 900, 350, 500, 250, 300, 100, 4)
            parts = team_mirror.split(team_mirror.per_round(team_mirror.run(o, True)["rz.HOFSwarm"]),
                                      team_mirror.per_round(team_mirror.run(h, False)["rz.HOFSwarm"]))
            self.assertGreater(parts["their_survival"], parts["our_survival"])
            self.assertAlmostEqual(0.0, parts["their_bullets"])
            text = team_mirror.report(o, h)
            self.assertIn("| rz.HOFSwarm | 1/1 | 87.0", text)
            self.assertIn("their survival", text)
            self.assertIn("- **their survival** (1): rz.HOFSwarm", text)
            self.assertIn("| 100/100 | 0.00/4.00 |", text)

    def test_unfinished_battle_left_out(self):
        with tempfile.TemporaryDirectory() as d:
            p = Path(d) / "battles" / "rz.HOFSwarm_1.1-1"
            p.mkdir(parents=True)
            (p / "result.csv").write_text(HEAD + "false,1,0,0,0,0,0,0,0,0\n", encoding="utf-8")
            self.assertIsNone(team_mirror.result(str(p)))


if __name__ == "__main__":
    unittest.main()

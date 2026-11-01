"""Tests for team_mirror.py: OgiTeam's and HadurTeam's score parts, team by team (BENCH-166)."""

import tempfile
import unittest
from pathlib import Path

import team_mirror

ROUNDS = "round,membersAlive,enemiesAlive,won,shots,shotsWithMateInLane,countBelowTruth,countReports,bulletsOnMates,focusFireRatio\n"
HEAD = "rank,team,score,firsts,survival,bulletDamage\n"


def battle(root, name, subject, score, theirs, surv, tsurv, bul, tbul, lost):
    d = Path(root) / "battles" / name
    d.mkdir(parents=True)
    (d / "team.csv").write_text(HEAD + f"1,{subject} (1),{score},1,{surv},{bul}\n2,rz.Hawk 0.2 (1),{theirs},0,{tsurv},{tbul}\n",
                                encoding="utf-8")
    (d / "rounds.csv").write_text(ROUNDS + f"0,{5 - lost},0,1,0,0,0,0,0,-\n", encoding="utf-8")
    (d / "bullets.log").write_text(
        f"0,10,F,1,{subject} (1),3.00,0,0,0,-\n0,12,H,1,{subject} (1),rz.Hawk 0.2 (1),3.00\n", encoding="utf-8")


class TeamMirrorTest(unittest.TestCase):
    def test_parts_and_lever(self):
        with tempfile.TemporaryDirectory() as o, tempfile.TemporaryDirectory() as h:
            # Same team: Ogi gives up 50 survival points, HadurTeam 250 (four members lost); bullets alike.
            battle(o, "rz.HOFSwarm_1.1-1", "cz.libors.Ogi v1", 1000, 150, 600, 50, 300, 100, 0)
            battle(h, "rz.HOFSwarm_1.1-1", "hadur117.Hadur 3.21aa", 900, 350, 500, 250, 300, 100, 4)
            o_run, h_run = team_mirror.run(o, "cz.libors.Ogi"), team_mirror.run(h, team_mirror.team_losses.DEFAULT_OURS)
            parts = team_mirror.split(o_run["rz.HOFSwarm_1.1-1"][0], h_run["rz.HOFSwarm_1.1-1"][0])
            self.assertGreater(parts["their_survival"], parts["our_survival"])
            self.assertAlmostEqual(0.0, parts["their_bullets"])
            text = team_mirror.report(o, h)
            self.assertIn("| rz.HOFSwarm | 1 | 87.0", text)
            self.assertIn("their survival", text)
            self.assertIn("- **their survival** (1): rz.HOFSwarm", text)
            self.assertIn("| 100/100 | 0.00/4.00 |", text)

    def test_only_battles_finished_on_both_sides_pair(self):
        with tempfile.TemporaryDirectory() as o, tempfile.TemporaryDirectory() as h:
            battle(o, "rz.HOFSwarm_1.1-1", "cz.libors.Ogi v1", 1000, 150, 600, 50, 300, 100, 0)
            battle(o, "rz.HOFSwarm_1.1-2", "cz.libors.Ogi v1", 100, 900, 50, 600, 30, 300, 5)
            battle(h, "rz.HOFSwarm_1.1-1", "hadur117.Hadur 3.21aa", 900, 350, 500, 250, 300, 100, 4)
            # Seed 2 never finished for HadurTeam: Ogi's seed-2 battle must not count.
            (Path(h) / "battles" / "rz.HOFSwarm_1.1-2").mkdir(parents=True)
            text = team_mirror.report(o, h)
            self.assertIn("| rz.HOFSwarm | 1 | 87.0", text)

    def test_parts_average_per_battle(self):
        with tempfile.TemporaryDirectory() as o, tempfile.TemporaryDirectory() as h:
            # A big battle and a small one: each pair counts once, whatever its total score.
            battle(o, "rz.HOFSwarm_1.1-1", "cz.libors.Ogi v1", 10000, 0, 5000, 0, 5000, 0, 0)
            battle(h, "rz.HOFSwarm_1.1-1", "hadur117.Hadur 3.21aa", 10000, 10000, 5000, 5000, 5000, 5000, 2)
            battle(o, "rz.HOFSwarm_1.1-2", "cz.libors.Ogi v1", 100, 100, 50, 50, 50, 50, 0)
            battle(h, "rz.HOFSwarm_1.1-2", "hadur117.Hadur 3.21aa", 100, 100, 50, 50, 50, 50, 0)
            text = team_mirror.report(o, h)
            # Gap = (100 - 50 + 50 - 50) / 2 = +25.0; their survival swap alone: (66.7 - 50 + 0) / 2 = +8.3.
            self.assertIn("| +25.0 | +8.3 |", text)

    def test_unfinished_battle_left_out(self):
        with tempfile.TemporaryDirectory() as d:
            p = Path(d) / "battles" / "rz.HOFSwarm_1.1-1"
            p.mkdir(parents=True)
            (p / "team.csv").write_text(HEAD, encoding="utf-8")
            self.assertIsNone(team_mirror.result(str(p), "cz.libors.Ogi"))


if __name__ == "__main__":
    unittest.main()

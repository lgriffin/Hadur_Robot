"""Tests for team_losses.py: how HadurTeam loses rounds, read from a team bench run's logs."""

import tempfile
import unittest
from pathlib import Path

import team_losses

ROUNDS = "round,membersAlive,enemiesAlive,won,shots,shotsWithMateInLane,countBelowTruth,countReports,bulletsOnMates,focusFireRatio\n"
US = "hadur2.Hadur 3.17.1bb"


def battle(root, name, rounds, bullets, ends):
    d = Path(root) / "battles" / name
    d.mkdir(parents=True)
    (d / "rounds.csv").write_text(ROUNDS + "".join(rounds), encoding="utf-8")
    (d / "bullets.log").write_text("".join(bullets), encoding="utf-8")
    for m, ticks in enumerate(ends):
        (d / f"member-{m}.log").write_text(
            "".join(f"{r},{t},R,{r},{t},x,0\n" for r, t in enumerate(ticks)), encoding="utf-8")


class TeamLossesTest(unittest.TestCase):
    def test_opponent_name(self):
        self.assertEqual("cz.libors.OgiTeam", team_losses.opponent("cz.libors.OgiTeam_v1-3-baseline"))
        self.assertEqual("rz.HOFSwarm", team_losses.opponent("rz.HOFSwarm_1.1-2"))

    def test_round_summary(self):
        with tempfile.TemporaryDirectory() as d:
            # Round 0 won with 4 members left (one died at 200 of 500); round 1 lost, first death 100.
            battle(d, "rz.HOFSwarm_1.1-1", ["0,4,0,1,0,0,0,0,0,-\n", "1,0,3,0,0,0,0,0,0,-\n"], [
                f"0,10,F,1,{US} (1),3.00,0,0,0,-\n",
                f"0,12,H,1,{US} (1),rz.Hawk 0.2 (1),3.00\n",
                f"0,20,F,2,rz.Hawk 0.2 (1),2.00,0,0,0,-\n",
                f"0,21,F,4,rz.Hawk 0.2 (2),2.00,0,0,0,-\n",
                f"0,22,F,5,rz.Hawk 0.2 (2),2.00,0,0,0,-\n",
                f"0,23,F,6,rz.Hawk 0.2 (3),2.00,0,0,0,-\n",
                f"0,25,H,2,rz.Hawk 0.2 (1),{US} (2),2.00\n",
                f"1,30,H,3,{US} (1),{US} (2),1.00\n",
            ], [[500, 300], [200, 100], [500, 300], [500, 300], [500, 300]])
            s = team_losses.summary(team_losses.battle(str(Path(d) / "battles" / "rz.HOFSwarm_1.1-1")))
            self.assertEqual(2, s["rounds"])
            self.assertEqual(50.0, s["won"])
            self.assertEqual(1.0, s["lost_won"])
            self.assertEqual(150, s["first"])
            self.assertEqual(5.0, s["dmg_us"])        # 2.0 power = 10 damage over 2 rounds
            self.assertEqual(8.0, s["dmg_them"])      # 3.0 power = 16 damage over 2 rounds
            self.assertEqual(25.0, s["hit_us"])          # 1 of their 4 shots hit us
            self.assertEqual(100.0, s["hit_them"])       # our 1 shot hit
            self.assertEqual(2.0, s["mates"])
            self.assertEqual(27.5, s["last_shot"])    # rounds end their shooting at 25 and 30
            (Path(d) / "battles" / "rz.HOFSwarm_1.1-1" / "friendly.log").write_text(
                "1,30,owner=0,victim=1,power=1.00,travelled=500,victimVelocity=0.0,ownerVelocity=0.0,"
                "target=300,victimAlong=500,victimAcross=0,kind=beyond\n", encoding="utf-8")
            (Path(d) / "battles" / "rz.HOFSwarm_1.1-2").mkdir()
            text = team_losses.report([d])
            self.assertIn("mid 14", text)
            self.assertIn("left out: rz.HOFSwarm_1.1-2", text)
            self.assertIn("| mid 14 | 1 | 0% | 0% | 100% | 0% |", text)
            self.assertEqual("top 8", team_losses.band("cb.fire.FirestarterTeam"))

    def test_other_subject(self):
        fire = "cb.fire.Firestarter 2.0"
        with tempfile.TemporaryDirectory() as d:
            battle(d, "rz.HOFSwarm_1.1-1", ["0,5,0,1,0,0,0,0,0,-\n"], [
                f"0,40,F,1,{fire} (1),3.00,0,0,0,-\n",
                f"0,44,H,1,{fire} (1),rz.Hawk 0.2 (1),3.00\n",
            ], [])
            battle(d, "rz.HOFSwarm_1.1-1-baseline", ["0,0,3,0,0,0,0,0,0,-\n"], [], [])
            team_losses.OURS = "cb.fire.Firestarter "
            try:
                text = team_losses.report([d], "Firestarter")
            finally:
                team_losses.OURS = "hadur2."
            self.assertIn("Battles read: 1 over 1 opponents", text)   # the baseline is HadurTeam's
            self.assertIn("| rz.HOFSwarm (mid) | 1 | 100.0 | 0.00 | 0.00 | nan | nan | 44 | 0 | 16 |", text)


if __name__ == "__main__":
    unittest.main()

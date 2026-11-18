"""Tests for team_tempo.py: where a team's ticks go, read from bullets.log and deaths.log."""

import collections
import os
import tempfile
import unittest

import team_tempo

M1, M2, E1, E2 = "hadur117.Hadur 3.23 (1)", "hadur117.Hadur 3.23 (2)", "e.Bot 1 (1)", "e.Bot 1 (2)"


def battle(root, name, bullets, deaths):
    d = os.path.join(root, "battles", name)
    os.makedirs(d)
    with open(os.path.join(d, "bullets.log"), "w", encoding="utf-8") as f:
        f.write("".join(l + "\n" for l in bullets))
    with open(os.path.join(d, "deaths.log"), "w", encoding="utf-8") as f:
        f.write("".join(l + "\n" for l in deaths))
    return d


def fire(turn, bid, owner, power, x, y, heading, enemies):
    return "0,%d,F,%d,%s,%.2f,%.1f,%.1f,%.4f,-,%s" % (turn, bid, owner, power, x, y, heading, enemies)


class TeamTempoTest(unittest.TestCase):
    def test_helpers(self):
        self.assertEqual(16.0, team_tempo.damage(3.0))
        self.assertEqual(4.0, team_tempo.damage(1.0))
        self.assertEqual(16, team_tempo.cooling(3.0))
        self.assertEqual(("mn.CombatTeam_3.25.0", "7300"), team_tempo.team_seed("/w/battles/mn.CombatTeam_3.25.0-7300"))
        self.assertEqual(("x.Team_1", "12"), team_tempo.team_seed("x.Team_1-12-baseline"))
        # A power-3 bullet first shown at (500, 511) heading north was fired from (500, 500): the enemy 300 px north
        # is its target, the one to the east is not.
        north = E1 + ":500.0:800.0:0.0000:0.00;" + E2 + ":900.0:500.0:0.0000:0.00"
        self.assertEqual((E1, 300.0), team_tempo.target(500.0, 511.0, 0.0, 11.0, north))
        self.assertIsNone(team_tempo.target(500.0, 489.0, 3.14159, 11.0, north))

    def test_a_battle_is_read_for_its_factors_overkill_and_own_hits(self):
        root = tempfile.mkdtemp()
        enemies = E1 + ":500.0:800.0:0.0000:0.00;" + E2 + ":900.0:500.0:0.0000:0.00"
        bullets = [
            fire(40, 1, M1, 3.0, 500.0, 511.0, 0.0, enemies), "0,60,H,1,%s,%s,3.00" % (M1, E1),
            # Aimed at E1, which dies at turn 70 while this one is in flight: overkill.
            fire(56, 2, M1, 3.0, 500.0, 511.0, 0.0, enemies),
            # Member 2 hits member 1: an own hit.
            fire(50, 3, M2, 1.0, 100.0, 117.0, 0.0, enemies), "0,58,H,3,%s,%s,1.00" % (M2, M1),
            # An enemy bullet: not the subject's.
            "0,45,F,4,%s,2.00,500.0,786.0,3.1416,%s:500.0:500.0:0.0000:0.00" % (E1, M1),
        ]
        deaths = ["0,70,3,0,0," + E1, "0,90,1,1,0," + M2, "0,130,4,0,0," + E2]
        d = battle(root, "e.Team_1-100", bullets, deaths)
        acc = collections.Counter()
        team_tempo.read(d, "hadur117", acc)
        self.assertEqual((3, 1, 16.0), (acc["shots"], acc["hits"], acc["dealt"]))
        self.assertEqual((1, 3.0), (acc["overkill"], acc["overkill energy"]))
        self.assertEqual((1, 4.0), (acc["own hits"], acc["own damage"]))
        self.assertEqual((1, 130), (acc["rounds"], acc["ticks"]))
        self.assertEqual((70, 130), (acc["kill 1"], acc["kill 2"]))
        self.assertEqual(40, acc["first shot"])
        # Two members: one alive to the end (130 - 30), one to turn 90 (90 - 30).
        self.assertEqual(160, acc["gun ticks"])
        self.assertEqual(16 + 16 + 12, acc["cooling"])
        f = team_tempo.factors(acc)
        self.assertAlmostEqual(16.0 / 130, f[0])
        self.assertAlmostEqual(1.6, f[1])
        self.assertAlmostEqual(f[0], f[1] * f[2] * f[3] * f[4] * (130 - 30) / 130.0)
        self.assertEqual((2, 600.0), (acc["opening shots"], acc["opening range"]), "member 2 fired at nobody")

    def test_the_report_reads_only_battles_both_subjects_finished(self):
        a, b = tempfile.mkdtemp(), tempfile.mkdtemp()
        enemies = E1 + ":500.0:800.0:0.0000:0.00"
        ours = [fire(40, 1, M1, 3.0, 500.0, 511.0, 0.0, enemies), "0,60,H,1,%s,%s,3.00" % (M1, E1)]
        theirs = [l.replace("hadur117.Hadur 3.23", "cz.libors.Ogi v1") for l in ours]
        battle(a, "e.Team_1-100", theirs, ["0,60,2,0,0," + E1])
        battle(a, "e.Team_1-101", theirs, ["0,60,2,0,0," + E1])
        battle(b, "e.Team_1-100", ours, ["0,90,2,0,0," + E1])
        out = os.path.join(a, "r.md")
        team_tempo.main(["--a", "OgiTeam=cz.libors=" + a, "--b", "HadurTeam=hadur117=" + b, "--out", out])
        with open(out, encoding="utf-8") as f:
            text = f.read()
        self.assertIn("Battles both subjects finished: 1.", text)
        self.assertIn("| OgiTeam | 1 | 60 | 60 |", text)
        self.assertIn("| HadurTeam | 1 | 90 | 90 |", text)
        self.assertIn("| e.Team_1, HadurTeam | 1 | 90 |", text)
        with self.assertRaises(SystemExit):
            team_tempo.main(["--a", "OgiTeam=cz.libors=" + tempfile.mkdtemp(), "--b", "HadurTeam=hadur117=" + b])


if __name__ == "__main__":
    unittest.main()

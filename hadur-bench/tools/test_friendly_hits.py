"""Tests for friendly_hits.py: where our own hits came from, read from friendly.log."""

import tempfile
import unittest
from pathlib import Path

import friendly_hits


def line(kind, travelled, along, across, power=3.0):
    return ("0,10,owner=0,victim=1,power={:.2f},travelled={},victimVelocity=0.0,ownerVelocity=0.0,"
            "target=-,victimAlong={},victimAcross={},kind={}\n").format(power, travelled, along, across, kind)


class FriendlyHitsTest(unittest.TestCase):
    def test_report(self):
        with tempfile.TemporaryDirectory() as d:
            b = Path(d) / "battles" / "rz.HOFSwarm_1.1-1"
            b.mkdir(parents=True)
            (b / "friendly.log").write_text(
                line("noline", 400, 380, 36) + line("noline", 300, 250, 120) + line("noline", 500, -80, 300)
                + line("beyond", 600, 600, 5) + "0,9,owner=0,victim=1,power=1.00,travelled=50,victimVelocity=0.0,"
                "ownerVelocity=0.0\n", encoding="utf-8")
            text = friendly_hits.report([d])
            self.assertIn("Friendly hits read: 4.", text)
            self.assertIn("| noline | 3 | 75% | 400 | 250 | 120 | 3.00 |", text)
            self.assertIn("| within 36 px (in the lane) | 1 | 33% | 100% | 400 |", text)
            self.assertIn("| over 250 px | 1 | 33% | 0% | 500 |", text)


    def test_candidate_only_skips_the_baseline_battles(self):
        with tempfile.TemporaryDirectory() as d:
            for name in ("rz.HOFSwarm_1.1-1", "rz.HOFSwarm_1.1-1-baseline"):
                b = Path(d) / "battles" / name
                b.mkdir(parents=True)
                (b / "friendly.log").write_text(line("noline", 400, 380, 36), encoding="utf-8")
            self.assertIn("Friendly hits read: 2.", friendly_hits.report([d]))
            self.assertIn("Friendly hits read: 1.", friendly_hits.report([d], candidate_only=True))

    def test_an_arm_with_no_own_hits_still_reports(self):
        with tempfile.TemporaryDirectory() as d:
            arm = Path(d) / "battles" / "rz.HOFSwarm_1.1-1"
            arm.mkdir(parents=True)
            (arm / "friendly.log").write_text("", encoding="utf-8")
            base = Path(d) / "battles" / "rz.HOFSwarm_1.1-1-baseline"
            base.mkdir(parents=True)
            (base / "friendly.log").write_text(line("noline", 400, 380, 36), encoding="utf-8")
            self.assertIn("Friendly hits read: 0.", friendly_hits.report([d], candidate_only=True))

    def test_no_logs_at_all_stops_the_read(self):
        with tempfile.TemporaryDirectory() as d:
            with self.assertRaises(SystemExit):
                friendly_hits.report([d])


if __name__ == "__main__":
    unittest.main()

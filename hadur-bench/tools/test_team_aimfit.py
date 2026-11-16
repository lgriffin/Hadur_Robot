"""Tests for team_aimfit.py (TMODE-50): the fit finds a lagged head-on gun in a synthetic bullets.log."""

import math
import tempfile
import unittest
from pathlib import Path

import team_aimfit

US = "hadur117.Hadur 3.23aa"
THEM = "kawigi.micro.Shiz 1.1"


def member(t):
    """Our one member drives east at 8 px a tick from (200, 600)."""
    return 200 + 8 * t, 600.0


def write_battle(root, name, lag):
    lines = []
    for t in range(20, 120):
        x, y = member(t)
        mates = "%s (1):%.1f:%.1f:%.4f:%.2f" % (US, x, y, math.pi / 2, 8.0)
        if t % 10 == 0:
            # Their shot at (600, 1000), head-on at where we were `lag` ticks earlier.
            px, py = member(t - lag)
            heading = math.atan2(px - 600, py - 1000)
            lines.append("0,%d,F,%d,%s (1),2.00,600.0,1000.0,%.4f,%s\n" % (t, t, THEM, heading, mates))
        else:
            # Our own bullet, which lists our members as the shooter's mates.
            lines.append("0,%d,F,%d,%s (1),1.00,%.1f,%.1f,0.0000,-,-\n" % (t, 100000 + t, US, x, y))
    d = Path(root) / name
    d.mkdir(parents=True)
    (d / "bullets.log").write_text("".join(lines), encoding="utf-8")
    return str(d)


class Fit(unittest.TestCase):

    def test_lagged_head_on_is_found(self):
        """Head-on at where we were 6 ticks back: every shot fits there, and lag 0 misses."""
        with tempfile.TemporaryDirectory() as root:
            d = write_battle(root, "kawigi.micro.ArmyOfShiz_1.1-1", 6)
            score = team_aimfit.fit([d], "hadur117")
            best = max(score, key=lambda k: score[k][0])
            # Two ticks at 8 px are under half a bot width, so the lags next to the truth tie with it.
            self.assertEqual((0, 0.0, 0.0), best[1:])
            self.assertLessEqual(abs(best[0] - 6), 2)
            self.assertGreater(score[(6, 0, 0.0, 0.0)][0], 0.95)
            self.assertGreater(score[best][0], 0.95)
            self.assertLess(score[(0, 0, 0.0, 0.0)][0], 0.5)

    def test_team_of_strips_seed_and_baseline(self):
        self.assertEqual("rz.HOFSwarm_1.1", team_aimfit.team_of("work/x/battles/rz.HOFSwarm_1.1-3-baseline/"))
        self.assertEqual("rz.HOFSwarm_1.1", team_aimfit.team_of("rz.HOFSwarm_1.1-12"))


if __name__ == "__main__":
    unittest.main()

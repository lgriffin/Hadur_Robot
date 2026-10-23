"""BENCH-98: tools/ladder.py reads battles an hour and load per run and applies the pick rule."""
import gzip
import json
import os
import sys
import tempfile
import time
import unittest

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import ladder  # noqa: E402

HEADER = "ok,rounds,skippedTurns,engineDisables\n"


def duel_run(root, name, workers, minutes, battles, skips_each, truth=True):
    work = os.path.join(root, name)
    t0 = time.time() - 5
    os.makedirs(work)
    with open(os.path.join(work, "conditions.json"), "w") as f:
        json.dump({"mode": "cold", "workers": workers, "childFlags": [],
                   "started": time.strftime("%Y-%m-%dT%H:%M:%SZ", time.gmtime(t0)),
                   "finished": time.strftime("%Y-%m-%dT%H:%M:%SZ", time.gmtime(t0 + minutes * 60))}, f)
    for i in range(battles):
        d = os.path.join(work, "battles", f"x-{i}")
        os.makedirs(d)
        with open(os.path.join(d, "result.csv"), "w") as f:
            f.write(HEADER + f"true,35,{skips_each},0\n")
        if truth:
            with gzip.open(os.path.join(d, "truth.log.gz"), "wt") as f:
                f.write("V,1\n" * 1000)
    return work


def team_run(root, name, workers, minutes, battles, skips_each):
    work = os.path.join(root, name)
    t0 = time.time() - 5
    os.makedirs(work)
    with open(os.path.join(work, "conditions.json"), "w") as f:
        json.dump({"mode": "team", "workers": workers, "rounds": 10,
                   "started": time.strftime("%Y-%m-%dT%H:%M:%SZ", time.gmtime(t0)),
                   "finished": time.strftime("%Y-%m-%dT%H:%M:%SZ", time.gmtime(t0 + minutes * 60))}, f)
    for i in range(battles):
        d = os.path.join(work, "battles", f"t-{i}")
        os.makedirs(d)
        with open(os.path.join(d, "team-done.txt"), "w") as f:
            f.write("hadur2.HadurTeam 3.15\n")
        with open(os.path.join(d, "member-0.log"), "w") as f:
            f.write("".join(f"0,{k},SYSTEM: Hadur (1) skipped turn {k}\n" for k in range(skips_each)))
    return work


class LadderTest(unittest.TestCase):
    def test_rates_and_pick(self):
        with tempfile.TemporaryDirectory() as root:
            d12 = ladder.read_run("d12", duel_run(root, "d12", 12, 60, 20, 35))
            d16 = ladder.read_run("d16", duel_run(root, "d16", 16, 45, 20, 38))   # +10% skips: inside
            d20 = ladder.read_run("d20", duel_run(root, "d20", 20, 40, 20, 50))   # +43% skips: outside
            d16x = ladder.read_run("d16x", duel_run(root, "d16x", 16, 40, 20, 38, truth=False))
            t8 = ladder.read_run("t8", team_run(root, "t8", 8, 60, 10, 10))
            self.assertAlmostEqual(d12["per_hour"], 20.0, places=3)
            self.assertAlmostEqual(d12["skips_round"], 1.0, places=6)
            self.assertGreater(d12["truth_mb"], 0)
            self.assertEqual(d16x["truth_mb"], 0)
            self.assertTrue(t8["team"])
            self.assertAlmostEqual(t8["skips_round"], 1.0, places=6)
            picks = ladder.verdict([d12, d16, d20, d16x, t8], {"d12", "t8"})
            self.assertEqual(picks["duel"][0]["label"], "d12")
            self.assertEqual(picks["duel"][1]["workers"], 16)
            self.assertEqual(picks["team"][1]["label"], "t8")
            text = ladder.render([d12, d16, d20, d16x, t8], {"d12", "t8"})
            self.assertIn("run at **16 workers**", text)


if __name__ == "__main__":
    unittest.main()

"""BENCH-106: tools/host_check.py judges a machine's run against the PC's run of the same battles."""
import json
import os
import sys
import tempfile
import time
import unittest

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import host_check  # noqa: E402

HEADER = "ok,rounds,score,theirScore,skippedTurns,engineDisables\n"


def run(root, name, workers, skips_each, share=83.3, battles=40, team=False, set_name="top5-s0-panel.txt"):
    work = os.path.join(root, name)
    t0 = time.time() - 5
    os.makedirs(work)
    with open(os.path.join(work, "conditions.json"), "w") as f:
        json.dump({"mode": "team" if team else "cold", "workers": workers, "rounds": 10, "set": set_name,
                   "parallel": workers, "parallelSource": "auto: HADUR_BENCH_WORKERS_DUEL",
                   "hostProfile": "laptop: Intel Core i7, 8 cores / 16 threads", "cpuConstant": "robocode.cpu.constant=3000000",
                   "started": time.strftime("%Y-%m-%dT%H:%M:%SZ", time.gmtime(t0)),
                   "finished": time.strftime("%Y-%m-%dT%H:%M:%SZ", time.gmtime(t0 + 1800))}, f)
    for i in range(battles):
        d = os.path.join(work, "battles", f"bot{i}_1.0-1")
        os.makedirs(d)
        if team:
            open(os.path.join(d, "team-done.txt"), "w").close()
            with open(os.path.join(d, "member-0.log"), "w") as f:
                f.write("".join(f"SYSTEM: Hadur (1) skipped turn {k}\n" for k in range(skips_each)))
        else:
            with open(os.path.join(d, "result.csv"), "w") as f:
                f.write(HEADER + f"true,35,{share * 10:.0f},{(100 - share) * 10:.0f},{skips_each},0\n")
    return work


# @Tag("BENCH-106"): host_check.py's VALID / TOO LOADED verdicts against the PC ladder blocks.
class HostCheckTest(unittest.TestCase):
    def test_a_run_like_the_pc_is_valid(self):
        with tempfile.TemporaryDirectory() as root:
            r = host_check.check("laptop", run(root, "a", 3, 16))   # 16/35 = 0.457 a round, PC 0.465
            self.assertEqual(r["verdict"], "VALID", r["reasons"])
            self.assertAlmostEqual(r["run"]["level"], 83.3, places=1)

    def test_too_many_skips_or_a_shifted_level_is_too_loaded(self):
        with tempfile.TemporaryDirectory() as root:
            loaded = host_check.check("laptop", run(root, "b", 4, 25))   # 0.714 a round
            self.assertEqual(loaded["verdict"], "TOO LOADED")
            self.assertIn("skips a round", loaded["reasons"][0])
            shifted = host_check.check("laptop", run(root, "c", 3, 16, share=80.0))
            self.assertEqual(shifted["verdict"], "TOO LOADED")
            self.assertIn("level 80.00", shifted["reasons"][0])
            text = host_check.render([loaded])
            self.assertIn("--workers 3", text)
            self.assertIn("laptop: Intel Core i7", text)

    def test_team_reference_and_unknown_sets(self):
        with tempfile.TemporaryDirectory() as root:
            ok = host_check.check("t", run(root, "t", 3, 1, team=True, set_name="team-census46.txt"))  # 0.1 a member-round
            self.assertEqual(ok["verdict"], "VALID", ok["reasons"])
            unknown = host_check.check("u", run(root, "u", 3, 16, set_name="other.txt"))
            self.assertEqual(unknown["verdict"], "NO REFERENCE")
            given = host_check.check("g", os.path.join(root, "u"), {"label": "given", "skips_round": 0.2,
                                                                   "disables_100": 0.0, "level": None})
            self.assertEqual(given["verdict"], "TOO LOADED")

    def test_exit_code(self):
        with tempfile.TemporaryDirectory() as root:
            work = run(root, "a", 3, 16)
            out = os.path.join(root, "r.md")
            self.assertEqual(host_check.main([f"laptop={work}", "--out", out]), 0)
            self.assertIn("**VALID**", open(out).read())
            self.assertEqual(host_check.main([run(root, "b", 4, 30)]), 1)


# @Tag("BENCH-151"): a run judged against another run of the same battles on the same machine.
class ReferenceRunTest(unittest.TestCase):
    def test_a_same_day_baseline_replaces_the_pc_reference(self):
        with tempfile.TemporaryDirectory() as root:
            base = run(root, "base", 12, 20)        # 0.571 a round: over the PC's bar on its own
            near = run(root, "near", 12, 21)        # 0.600: within 15% of today's base
            far = run(root, "far", 12, 27)          # 0.771: not
            out = os.path.join(root, "r.md")
            self.assertEqual(host_check.main([f"near={near}", "--reference-run", f"base={base}", "--out", out]), 0)
            self.assertIn("**VALID**", open(out).read())
            self.assertEqual(host_check.main([f"far={far}", "--reference-run", f"base={base}"]), 1)
            self.assertEqual(host_check.main([f"base={base}"]), 1, "the same base fails the PC's 10-23 reference")


if __name__ == "__main__":
    unittest.main()

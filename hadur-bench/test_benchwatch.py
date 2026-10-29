"""Tests for benchwatch.py and the queue runner's watch, stop rules and progress branch (BENCH-129..131).
Fake steps only: a small script writes arm rows the way Bench does (battles/<job>-<arm>/arm-row.tsv).

    python3 -m unittest discover -s hadur-bench -p "test_benchwatch.py"
"""
import io
import json
import os
import random
import signal
import subprocess
import sys
import tempfile
import time
import unittest
from contextlib import redirect_stdout
from pathlib import Path

sys.path.insert(0, str(Path(__file__).resolve().parent))
import benchqueue  # noqa: E402
import benchwatch  # noqa: E402

PY = sys.executable.replace("\\", "/")

# Writes N jobs x the arms as arm rows, one battle every DELAY s, then sleeps (a Bench still running).
# Arm shifts: score share = 0.5 + shift/100 + noise; FAILARM's battles are ok=false; SKIPS turns each.
WRITER = r'''
import os, random, sys, time
out, n, delay = sys.argv[1], int(sys.argv[2]), float(sys.argv[3])
arms = [a.split("=") for a in sys.argv[4].split(",")]
fail_arm, skips = sys.argv[5], int(sys.argv[6])
rnd = random.Random(7)
for j in range(n):
    opp = "opp.Bot%03d 1.0" % (j // 2)
    for label, shift in arms:
        share = 0.0 if label == "dead" else min(0.99, max(0.01, 0.5 + float(shift) / 100 + rnd.gauss(0, 0.03)))
        ok = "false" if label == fail_arm else "true"
        row = [label, "hadur2.Hadur 1." + label, opp, "band1", str(j % 2 + 1), "1", "1", ok, "35",
               "%.4f" % (share * 1000), "%.4f" % ((1 - share) * 1000), "%.4f" % share, "0.5", "0.5", "10",
               "0.5", "0.5", "100", "100", str(skips), "1.0", "0", "0", "50", ""]
        d = os.path.join(out, "battles", "bot%03d-%d-%s" % (j // 2, j % 2 + 1, label))
        os.makedirs(d, exist_ok=True)
        with open(os.path.join(d, "arm-row.tsv"), "w") as f:
            f.write("\t".join(row) + "\n")
        time.sleep(delay)
time.sleep(60)
'''


def row(arm, opp, seed, share, ok="true", skips=0):
    return dict(zip(benchwatch.HEADER, [arm, "r 1", opp, "band1", str(seed), "1", "1", ok, "35", "1", "1",
                                        f"{share:.4f}", "0", "0", "0", "0", "0", "0", "0", str(skips), "0", "0",
                                        "0", "0", ""]))


class RuleTest(unittest.TestCase):
    def test_forms(self):
        r = benchwatch.Rule("futility s4,s0 below 0.10 after 30%")
        self.assertEqual((r.kind, r.arms, r.bar, r.after, r.action), ("futility", ["s4", "s0"], 0.10, 0.30, "finish"))
        self.assertEqual(benchwatch.Rule("skips 40 over 200").window, 200)
        self.assertEqual(benchwatch.Rule("skips 40").window, 100)
        self.assertEqual(benchwatch.Rule("stall 30m").seconds, 1800)
        self.assertEqual(benchwatch.Rule("stall 90s").seconds, 90)
        self.assertEqual(benchwatch.Rule("aa after 20%").action, "halt")
        self.assertEqual(benchwatch.Rule("fails 5").n, 5)

    def test_bad_forms_are_refused(self):
        for text in ("explode 3", "fails", "fails x", "futility s4 0.1", "skips 40 over", "aa after", "stall soon",
                     "futility s4 below 0.1 after 150%"):
            with self.assertRaises(benchwatch.WatchError, msg=text):
                benchwatch.Rule(text)


class SpecTest(unittest.TestCase):
    def setUp(self):
        self._tmp = tempfile.TemporaryDirectory()
        self.home = Path(self._tmp.name)
        (self.home / "plans").mkdir()
        (self.home / "x.arms").write_text("# arms\nc | h 1 | c.jar\naa | h 1aa | aa.jar\ns4 | h 1s4 | s4.jar\n")
        (self.home / "panel.txt").write_text("# panel\na 1 | r | a.jar\nb 1 | r | b.jar\n\nc 1 | r | c.jar\n")

    def tearDown(self):
        self._tmp.cleanup()

    def test_defaults_come_from_the_command(self):
        sp = benchwatch.Spec("field=1217", "./bench-top20.sh --set panel.txt --seeds 3 --arms x.arms --out work/x "
                             "--shuffle-jobs", self.home)
        self.assertEqual((sp.out, sp.panel, sp.seeds, sp.battles, sp.field, sp.shuffled),
                         ("work/x", 3, 3, 27, 1217, True))
        self.assertEqual(sp.arm_labels, ["c", "aa", "s4"])

    def test_futility_needs_shuffled_jobs_and_known_arms(self):
        cmd = "./bench-top20.sh --set panel.txt --seeds 3 --arms x.arms --out work/x"
        sp = benchwatch.Spec("", cmd, self.home)
        with self.assertRaisesRegex(benchwatch.WatchError, "shuffle"):
            sp.check([benchwatch.Rule("futility s4 below 0 after 30%")])
        sp = benchwatch.Spec("", cmd + " --shuffle-jobs", self.home)
        with self.assertRaisesRegex(benchwatch.WatchError, "no arm 'zz'"):
            sp.check([benchwatch.Rule("futility zz below 0")])
        sp.check([benchwatch.Rule("futility s4 below 0 after 30%"), benchwatch.Rule("aa")])

    def test_arm_rules_need_an_arms_step(self):
        sp = benchwatch.Spec("", "mvn -q exec:java -Dexec.args=@work/team.args", self.home)
        with self.assertRaisesRegex(benchwatch.WatchError, "multi-arm"):
            sp.check([benchwatch.Rule("dead 5")])
        sp.check([benchwatch.Rule("fails 5"), benchwatch.Rule("stall 30m")])

    def test_plan_errors_reach_the_queue(self):
        (self.home / "plans" / "t.queue").write_text("a | true\n  stop: explode\n")
        out = io.StringIO()
        with redirect_stdout(out):
            code = benchqueue.main(["--home", str(self.home), "run", "t", "--dry-run"])
        self.assertEqual(code, 2)


class SummaryTest(unittest.TestCase):
    def setUp(self):
        self._tmp = tempfile.TemporaryDirectory()
        self.home = Path(self._tmp.name)
        (self.home / "x.arms").write_text("c | h 1 | c.jar\naa | h 1aa | aa.jar\ns4 | h 1s4 | s4.jar\n")
        (self.home / "panel.txt").write_text("".join(f"b{i} 1 | r | b.jar\n" for i in range(100)))
        self.spec = benchwatch.Spec("field=1000", "x --set panel.txt --seeds 2 --arms x.arms --out w --shuffle-jobs",
                                    self.home)

    def tearDown(self):
        self._tmp.cleanup()

    def summary(self, rows, rules, started=None):
        out = self.home / "w" / "battles"
        for i, r in enumerate(rows):
            d = out / f"j{i}"
            d.mkdir(parents=True, exist_ok=True)
            (d / "arm-row.tsv").write_text("\t".join(r[h] for h in benchwatch.HEADER) + "\n")
        rules = [benchwatch.Rule(t) for t in rules]
        return benchwatch.summarize(self.spec, rules, self.home / "none.log", started or time.time() - 600)

    def field(self, n_opp, shift, aa_shift=0.0, skips=0):
        rnd, rows = random.Random(3), []
        for o in range(n_opp):
            for seed in (1, 2):
                base = 0.6 + rnd.gauss(0, 0.1)
                for arm, sh in (("c", 0), ("aa", aa_shift), ("s4", shift)):
                    rows.append(row(arm, f"b{o} 1", seed, base + sh / 100 + rnd.gauss(0, 0.02), skips=skips))
        return rows

    def test_a_clear_loser_trips_futility_and_a_level_arm_does_not(self):
        s = self.summary(self.field(40, -4.0), ["futility s4 below 0.10 after 30%", "aa"])
        self.assertEqual(s["battles"], 240)
        self.assertAlmostEqual(s["fraction"], 240 / 600)
        e = next(x for x in s["arms"] if x["arm"] == "s4")
        self.assertAlmostEqual(e["diff"], -4.0, delta=0.5)
        self.assertEqual(s["rules"][0]["state"], "TRIPPED")
        self.assertEqual(s["rules"][1]["state"], "ok")
        md = benchwatch.render_step("screen", self.spec, s)
        self.assertIn("240 of 600 battles", md)
        self.assertIn("TRIPPED", md)

    def test_futility_waits_for_its_fraction_and_holds_on_a_winner(self):
        s = self.summary(self.field(20, -4.0), ["futility s4 below 0.10 after 30%"])
        self.assertEqual(s["rules"][0]["state"], "waiting")
        for f in (self.home / "w").rglob("arm-row.tsv"):
            f.unlink()
        s = self.summary(self.field(40, +2.0), ["futility s4 below 0.10 after 30%"])
        self.assertEqual(s["rules"][0]["state"], "ok")

    def test_a_broken_aa_copy_trips_the_aa_rule(self):
        s = self.summary(self.field(40, 0.0, aa_shift=3.0), ["aa after 10%"])
        self.assertEqual(s["rules"][0]["state"], "TRIPPED")

    def test_failures_dead_arms_and_skips(self):
        rows = self.field(10, 0.0, skips=50)
        rows += [row("s4", "b99 1", 1, 0.5, ok="false") for _ in range(3)]
        for r in rows:
            if r["arm"] == "aa":
                r["score_share"] = "0.0000"
        s = self.summary(rows, ["fails 3", "dead 8", "skips 40 over 20", "stall 5m"])
        states = {r["rule"]: r["state"] for r in s["rules"]}
        self.assertEqual(states, {"fails 3": "TRIPPED", "dead 8": "TRIPPED", "skips 40 over 20": "TRIPPED",
                                  "stall 5m": "ok"})

    def test_rows_from_before_the_step_are_not_new_failures_or_dead_arms(self):
        rows = self.field(10, 0.0) + [row("s4", "b99 1", 1, 0.5, ok="false") for _ in range(3)]
        for r in rows:
            if r["arm"] == "aa":
                r["score_share"] = "0.0000"
        s = self.summary(rows, ["fails 3", "dead 8"], started=time.time() + 60)
        self.assertEqual(s["resumed"], len(rows))
        self.assertEqual([r["state"] for r in s["rules"]], ["ok", "ok"])

    def test_a_melee_step_log_counts_failures_and_skips(self):
        # The lines Bench's melee path prints: a failed battle has no colon after its count.
        log = self.home / "melee.log"
        log.write_text(
            "  melee battle 1/6: Hadur placed 2, APS 66.5, survival 84.0, skipped turns 3\n"
            "  melee battle 2/6 FAILED; see battles/f01-2/engine.log\n"
            "  melee battle 3/6 baseline FAILED; see battles/f01-3/engine.log\n"
            "  melee battle 4/6 FAILED: bench error: java.io.IOException\n"
            "  melee battle 5/6: Hadur placed 1, APS 71.1, survival 93.9, skipped turns 0\n")
        self.assertEqual(benchwatch.read_log(log), (5, 3, [3, 0]))

    def test_write_arms_tsv_matches_the_bench_header(self):
        rows = self.field(3, 0.0)
        p = self.home / "arms.tsv"
        benchwatch.write_arms_tsv(rows, p)
        lines = p.read_text().splitlines()
        self.assertEqual(lines[0].split("\t"), benchwatch.HEADER)
        self.assertEqual(len(lines), 1 + len(rows))


class RunnerTest(unittest.TestCase):
    def setUp(self):
        self._tmp = tempfile.TemporaryDirectory()
        self.home = Path(self._tmp.name)
        (self.home / "plans").mkdir()
        (self.home / "writer.py").write_text(WRITER)
        (self.home / "x.arms").write_text("c | h 1 | c.jar\naa | h 1aa | aa.jar\ns4 | h 1s4 | s4.jar\n")
        (self.home / "panel.txt").write_text("".join(f"b{i} 1 | r | b.jar\n" for i in range(60)))
        self._sigs = {s: signal.getsignal(s) for s in (signal.SIGINT, signal.SIGTERM)}

    def tearDown(self):
        for s, h in self._sigs.items():
            signal.signal(s, h)
        self._tmp.cleanup()

    def plan(self, text, name="t"):
        (self.home / "plans" / f"{name}.queue").write_text(text, encoding="utf-8")

    def run_queue(self, *extra, name="t"):
        out = io.StringIO()
        with redirect_stdout(out):
            code = benchqueue.main(["--home", str(self.home), "run", name, "--poll", "0.1", "--min-free-gb", "0",
                                    "--watch-seconds", "0.3", *extra])
        return code, out.getvalue()

    def state(self, name="t"):
        return benchqueue.load_state(benchqueue.Paths(self.home, self.home / "plans" / f"{name}.queue"))["steps"]

    def screen(self, arms, fail="none", skips=0, jobs=120, delay=0.004):
        return (f'screen | "{PY}" writer.py work/x {jobs} {delay} {arms} {fail} {skips} '
                f'# --set panel.txt --seeds 2 --arms x.arms --out work/x --shuffle-jobs\n')

    def test_futility_finishes_the_step_and_the_gate_reads_the_rows_so_far(self):
        self.plan("set PROGRESS_BRANCH = off\n" + self.screen("c=0,aa=0,s4=-6") +
                  "  watch: field=1217\n  stop: futility s4 below 0.10 after 30%\n"
                  f'gate | "{PY}" -c "import sys;n=len(open(\'work/x/arms.tsv\').read().splitlines());'
                  f'open(\'gate.txt\',\'w\').write(str(n))"\n  after: screen\n')
        t0 = time.time()
        code, out = self.run_queue()
        self.assertEqual(code, 0, out)
        self.assertLess(time.time() - t0, 30)
        st = self.state()
        self.assertEqual(st["screen"]["status"], "done")
        self.assertIn("futility", st["screen"]["early"])
        self.assertTrue((self.home / "work/x/EARLY-STOP.md").is_file())
        n = int((self.home / "gate.txt").read_text())
        self.assertGreater(n, 0.3 * 360)
        self.assertLess(n, 360)
        md = (self.home / "work/queue-t.progress.md").read_text()
        self.assertIn("STOPPED EARLY", md)
        self.assertIn("APS", md)
        log = (self.home / "work-queue-t.log").read_text()
        self.assertIn("STOP screen by rule futility", log)
        self.assertIn("fought and kept", log)

    def test_a_halt_rule_stops_the_queue_and_a_rerun_resumes(self):
        self.plan("set PROGRESS_BRANCH = off\n" + self.screen("c=0,aa=0,s4=0", fail="s4", jobs=30) +
                  "  watch:\n  stop: fails 5\n"
                  f'after | "{PY}" -c "open(\'after.txt\',\'w\').write(\'x\')"\n  after: screen\n')
        code, out = self.run_queue()
        self.assertEqual(code, 75, out)
        self.assertEqual(self.state()["screen"]["status"], "halted")
        self.assertFalse((self.home / "after.txt").exists())
        dry = io.StringIO()
        with redirect_stdout(dry):
            benchqueue.main(["--home", str(self.home), "run", "t", "--dry-run"])
        self.assertIn("run  screen (halted)", dry.getvalue())
        self.assertIn("stop: fails 5 -> halt", dry.getvalue())

    def test_continue_early_reruns_the_step_and_its_gate(self):
        self.plan("set PROGRESS_BRANCH = off\n" + self.screen("c=0,aa=0,s4=-6") +
                  "  watch: field=1217\n  stop: futility s4 below 0.10 after 30%\n"
                  f'gate | "{PY}" -c "open(\'gate.txt\',\'a\').write(\'g\')"\n  after: screen\n')
        self.assertEqual(self.run_queue()[0], 0)
        self.plan(self.home.joinpath("plans/t.queue").read_text().replace("  stop: futility s4 below 0.10 after 30%\n",
                  "  stop: futility s4 below 0.10 after 30%\n  timeout: 2s\n"))
        self.run_queue("--continue-early")
        log = (self.home / "work-queue-t.log").read_text()
        self.assertEqual(log.count("start screen"), 2)
        self.assertIn("would trip", log)

    def test_analysis_commands_with_arms_are_not_watched(self):
        steps = benchqueue.parse_plan("a | python3 tools/per_robot.py work/x/arms.tsv --arms s4 s0 --out r.md\n"
                                      "b | ./bench-top20.sh --arms x.arms --out work/x\n")
        benchqueue.bind_watches(steps, self.home)
        self.assertIsNone(steps[0].spec)
        self.assertIsNotNone(steps[1].spec)

    def test_no_stop_rules_shows_the_trip_but_runs_on(self):
        self.plan("set PROGRESS_BRANCH = off\n" + self.screen("c=0,aa=0,s4=-6", jobs=40, delay=0.001) +
                  "  watch:\n  stop: futility s4 below 0.10\n  timeout: 4s\n")
        code, out = self.run_queue("--no-stop-rules")
        log = (self.home / "work-queue-t.log").read_text()
        self.assertIn("would trip", log)
        self.assertIn("(timeout)", log)
        self.assertEqual(self.state()["screen"]["status"], "failed")

    def test_progress_is_pushed_to_its_branch_without_touching_the_work_tree(self):
        remote = self.home / "remote.git"
        subprocess.run(["git", "init", "-q", "--bare", str(remote)], check=True)
        subprocess.run(["git", "init", "-q", str(self.home)], check=True)
        self.plan(f"set PROGRESS_REMOTE = {remote.as_posix()}\nset PROGRESS_MINUTES = 0\n" +
                  self.screen("c=0,aa=0,s4=-6") + "  watch: field=1217\n  stop: futility s4 below 0.10 after 30%\n")
        code, out = self.run_queue()
        self.assertEqual(code, 0, out)
        md = subprocess.run(["git", "--git-dir", str(remote), "show", "claude/t-progress:progress.md"],
                            capture_output=True, text=True, check=True).stdout
        self.assertIn("# Queue t: progress", md)
        js = json.loads(subprocess.run(["git", "--git-dir", str(remote), "show", "claude/t-progress:progress.json"],
                                       capture_output=True, text=True, check=True).stdout)
        self.assertEqual(js["steps"]["screen"]["status"], "done")
        head = subprocess.run(["git", "-C", str(self.home), "status", "--porcelain"], capture_output=True, text=True)
        self.assertNotIn("progress.md", head.stdout)
        self.assertIn("progress pushed", (self.home / "work-queue-t.log").read_text())


if __name__ == "__main__":
    unittest.main()

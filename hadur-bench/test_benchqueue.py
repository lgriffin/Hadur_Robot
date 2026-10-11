"""Tests for benchqueue.py. Fake steps only (`python -c`); no Robocode, no battles.

    python3 -m unittest discover -s hadur-bench -p "test_benchqueue.py"
"""
import io
import os
import signal
import subprocess
import sys
import tempfile
import threading
import time
import unittest
from contextlib import redirect_stdout
from pathlib import Path
from unittest import mock

sys.path.insert(0, str(Path(__file__).resolve().parent))
import benchqueue  # noqa: E402

PY = sys.executable.replace("\\", "/")

SPAWN_CHILD = ("import subprocess,sys,time;"
               "p=subprocess.Popen([sys.executable,'-c','import time;time.sleep(120)']);"
               "open('CHILD','w').write(str(p.pid));time.sleep(120)")


def py(code):
    """A shell command that runs `code` with this interpreter (code must not use double quotes)."""
    return f'"{PY}" -c "{code}"'


def append_marker(name):
    return py(f"open('{name}','a').write('x')")


class QueueCase(unittest.TestCase):
    def setUp(self):
        self._tmp = tempfile.TemporaryDirectory()
        self.home = Path(self._tmp.name)
        (self.home / "plans").mkdir()
        self._sigs = {s: signal.getsignal(s) for s in (signal.SIGINT, signal.SIGTERM)}

    def tearDown(self):
        for s, h in self._sigs.items():
            signal.signal(s, h)
        self._tmp.cleanup()

    def plan(self, text, name="t"):
        (self.home / "plans" / f"{name}.queue").write_text(text, encoding="utf-8")
        return name

    def run_queue(self, name="t", *extra):
        out = io.StringIO()
        with redirect_stdout(out):
            code = benchqueue.main(["--home", str(self.home), "run", name, "--poll", "0.1",
                                    "--min-free-gb", "0", *extra])
        return code, out.getvalue()

    def state(self, name="t"):
        paths = benchqueue.Paths(self.home, self.home / "plans" / f"{name}.queue")
        return benchqueue.load_state(paths)["steps"]

    def logtext(self, name="t"):
        return (self.home / f"work-queue-{name}.log").read_text()

    def child_step(self):
        child = (self.home / "child.pid").as_posix()
        return py(SPAWN_CHILD.replace("CHILD", child)), child

    def wait_for(self, path, seconds=30):
        end = time.time() + seconds
        while time.time() < end:
            if Path(path).exists() and Path(path).read_text().strip():
                return Path(path).read_text().strip()
            time.sleep(0.1)
        self.fail(f"{path} never appeared")

    def assert_dead(self, pid, seconds=15):
        end = time.time() + seconds
        while time.time() < end:
            if not benchqueue.pid_alive(pid):
                return
            time.sleep(0.1)
        self.fail(f"process {pid} is still alive")


class ParseTest(unittest.TestCase):
    def test_variables_attributes_and_comments(self):
        steps = benchqueue.parse_plan(
            "# c\nset A = --x 1\nset B = ${A} --y\n\none | echo ${B}\n  timeout: 2h\ntwo | echo hi\n  after: one\n")
        self.assertEqual([s.name for s in steps], ["one", "two"])
        self.assertEqual(steps[0].command, "echo --x 1 --y")
        self.assertEqual(steps[0].timeout, 7200)
        self.assertEqual(steps[1].after, "one")

    def test_errors(self):
        for text in ("nonsense\n", "a | x\na | y\n", "a | x\n  after: nope\n", "a | echo ${UNDEFINED_THING_X}\n",
                     "a | x\n  colour: red\n", "a | x\n  timeout: soon\n", "a |\n", "bad name | x\n"):
            with self.assertRaises(benchqueue.PlanError, msg=text):
                benchqueue.parse_plan(text)

    def test_durations(self):
        self.assertEqual(benchqueue.parse_duration("90s"), 90)
        self.assertEqual(benchqueue.parse_duration("30m"), 1800)
        self.assertEqual(benchqueue.parse_duration("6h"), 21600)


class RunTest(QueueCase):
    def test_runs_every_step_and_logs_like_the_hand_written_queues(self):
        self.plan(f"a | {py('print(1)')}\nb | {py('print(2)')}\n")
        code, _ = self.run_queue()
        self.assertEqual(code, 0)
        lines = self.logtext().splitlines()
        self.assertRegex(lines[0], r"^\d\d:\d\d:\d\d start a$")
        self.assertRegex(lines[1], r"^\d\d:\d\d:\d\d a exit=0 in \d+ s$")
        self.assertTrue(lines[-1].endswith("ALLDONE"))
        self.assertEqual({k: v["status"] for k, v in self.state().items()}, {"a": "done", "b": "done"})
        self.assertIn("1", (self.home / "work-queue-t-a.log").read_text())

    def test_restart_skips_steps_that_already_exited_zero(self):
        marker = (self.home / "marker").as_posix()
        self.plan(f"a | {append_marker('a.count')}\nb | test -f {marker}\n")
        code, _ = self.run_queue()
        self.assertEqual(code, 1)
        self.assertEqual(self.state()["b"]["status"], "failed")
        Path(marker).write_text("ok")
        code, _ = self.run_queue()
        self.assertEqual(code, 0)
        self.assertEqual((self.home / "a.count").read_text(), "x", "step a must not run twice")
        self.assertIn("skip a (already exit=0)", self.logtext())
        self.assertEqual(self.state()["b"]["status"], "done")

    def test_fresh_ignores_saved_state(self):
        self.plan(f"a | {append_marker('a.count')}\n")
        self.run_queue()
        self.run_queue("t", "--fresh")
        self.assertEqual((self.home / "a.count").read_text(), "xx")

    def test_after_skips_when_the_dependency_failed(self):
        self.plan(f"a | {py('raise SystemExit(3)')}\nb | {py('print(1)')}\n  after: a\nc | {py('print(2)')}\n")
        code, _ = self.run_queue()
        self.assertEqual(code, 1)
        st = self.state()
        self.assertEqual((st["a"]["status"], st["a"]["exit"]), ("failed", 3))
        self.assertEqual(st["b"]["status"], "skipped")
        self.assertEqual(st["c"]["status"], "done")

    def test_stop_on_fail(self):
        self.plan(f"a | {py('raise SystemExit(2)')}\nb | {py('print(1)')}\n")
        code, _ = self.run_queue("t", "--stop-on-fail")
        self.assertEqual(code, 2)
        self.assertNotIn("b", self.state())
        self.assertNotIn("ALLDONE", self.logtext())

    def test_only_and_skip(self):
        self.plan(f"a | {py('print(1)')}\nb | {py('print(2)')}\nc | {py('print(3)')}\n")
        self.run_queue("t", "--only", "b,c", "--skip", "c")
        self.assertEqual(list(self.state()), ["b"])

    def test_unknown_step_name_is_an_error(self):
        self.plan(f"a | {py('print(1)')}\n")
        code, _ = self.run_queue("t", "--only", "zzz")
        self.assertEqual(code, 2)

    def test_dry_run_runs_nothing(self):
        self.plan(f"a | {append_marker('ran')}\n")
        code, out = self.run_queue("t", "--dry-run")
        self.assertEqual(code, 0)
        self.assertIn("dry run: nothing was run", out)
        self.assertFalse((self.home / "ran").exists())
        self.assertFalse((self.home / "work-queue-t.log").exists())

    def test_timeout_kills_the_whole_tree(self):
        step, child = self.child_step()
        self.plan(f"slow | {step}\n  timeout: 3s\n")
        code, _ = self.run_queue()
        self.assertEqual(code, 1)
        self.assertEqual(self.state()["slow"]["exit"], 124)
        self.assertIn("(timeout)", self.logtext())
        self.assert_dead(int(self.wait_for(child)))

    def test_a_second_runner_for_the_same_plan_is_refused(self):
        self.plan(f"a | {py('print(1)')}\n")
        (self.home / "work").mkdir()
        (self.home / "work" / "queue-t.pid").write_text(str(os.getpid()))
        code, _ = self.run_queue()
        self.assertEqual(code, 2)


class StopTest(QueueCase):
    def test_stop_kills_the_step_tree_and_a_rerun_resumes(self):
        step, child = self.child_step()
        self.plan(f"first | {py('print(1)')}\nlong | {step}\n")
        runner = subprocess.Popen([sys.executable, str(Path(benchqueue.__file__)), "--home", str(self.home),
                                   "run", "t", "--poll", "0.1", "--min-free-gb", "0"],
                                  stdout=subprocess.DEVNULL, stderr=subprocess.DEVNULL)
        try:
            pid = int(self.wait_for(child))
            out = io.StringIO()
            with redirect_stdout(out):
                self.assertEqual(benchqueue.main(["--home", str(self.home), "stop", "t"]), 0)
            self.assertIn("stop requested", out.getvalue())
            runner.wait(timeout=60)
            self.assert_dead(pid)
        finally:
            if runner.poll() is None:
                runner.kill()
        st = self.state()
        self.assertEqual(st["first"]["status"], "done")
        self.assertEqual(st["long"]["status"], "interrupted")
        self.assertFalse((self.home / "work" / "queue-t.pid").exists())
        self.assertNotIn("ALLDONE", self.logtext())
        self.plan(f"first | {py('print(1)')}\nlong | {py('print(2)')}\n")
        code, _ = self.run_queue()
        self.assertEqual(code, 0)
        self.assertIn("skip first (already exit=0)", self.logtext())
        self.assertEqual(self.state()["long"]["status"], "done")

    def test_stop_when_nothing_runs(self):
        self.plan(f"a | {py('print(1)')}\n")
        out = io.StringIO()
        with redirect_stdout(out):
            self.assertEqual(benchqueue.main(["--home", str(self.home), "stop", "t"]), 0)
        self.assertIn("not running", out.getvalue())


class MemoryGuardTest(QueueCase):
    def test_pauses_before_a_step_while_memory_is_low(self):
        self.plan(f"a | {append_marker('ran')}\n")
        stop = self.home / "work" / "queue-t.STOP"

        def later():
            time.sleep(1.0)
            stop.write_text("stop")

        threading.Thread(target=later, daemon=True).start()
        with mock.patch.object(benchqueue, "free_memory_gb", return_value=0.5):
            with redirect_stdout(io.StringIO()):
                code = benchqueue.main(["--home", str(self.home), "run", "t", "--poll", "0.1", "--min-free-gb", "8"])
        self.assertEqual(code, 130)
        self.assertIn("paused before a: 0.5 GB free is under 8 GB", self.logtext())
        self.assertFalse((self.home / "ran").exists())

    def test_resumes_when_memory_recovers(self):
        self.plan(f"a | {py('print(1)')}\n")
        readings = iter([0.5, 0.5, 20.0, 20.0, 20.0])
        with mock.patch.object(benchqueue, "free_memory_gb", side_effect=lambda: next(readings)):
            with redirect_stdout(io.StringIO()):
                code = benchqueue.main(["--home", str(self.home), "run", "t", "--poll", "0.05", "--min-free-gb", "8"])
        self.assertEqual(code, 0)
        text = self.logtext()
        self.assertIn("paused before a", text)
        self.assertIn("memory recovered", text)

    def test_free_memory_reads_on_this_host(self):
        free = benchqueue.free_memory_gb()
        self.assertTrue(free is None or free > 0)


class StatusTest(QueueCase):
    def test_status_lists_each_step(self):
        self.plan(f"a | {py('print(1)')}\nb | {py('raise SystemExit(5)')}\nc | {py('print(3)')}\n  after: b\n")
        self.run_queue()
        out = io.StringIO()
        with redirect_stdout(out):
            self.assertEqual(benchqueue.main(["--home", str(self.home), "status", "t"]), 0)
        text = out.getvalue()
        self.assertIn("runner not running", text)
        self.assertRegex(text, r"a\s+done\s+exit=0")
        self.assertRegex(text, r"b\s+failed\s+exit=5")
        self.assertRegex(text, r"c\s+skipped")
        self.assertIn("1 of 3 steps done", text)


def wait_for_flag(flag, seconds=20):
    """A step that waits for `flag` to appear and exits 0 if it did, 1 if it never did."""
    return py("import os,sys,time;e=time.time()+%d;"
              "[None for _ in iter(lambda:(time.sleep(0.05),not os.path.exists('%s') and time.time()<e)[1],False)];"
              "sys.exit(0 if os.path.exists('%s') else 1)" % (seconds, flag, flag))


def nap(seconds):
    return py(f"import time;time.sleep({seconds})")


class ConcurrencyTest(QueueCase):
    def order(self, name="t"):
        """The log lines that name a step starting or ending, as 'start a' / 'end a'."""
        seen = []
        for line in self.logtext(name).splitlines():
            parts = line.split()
            if len(parts) >= 3 and parts[1] == "start":
                seen.append(f"start {parts[2]}")
            elif len(parts) >= 3 and parts[2].startswith("exit="):
                seen.append(f"end {parts[1]}")
        return seen

    def test_independent_steps_run_side_by_side_with_the_flag(self):
        self.plan(f"a | {wait_for_flag('b.flag')}\nb | {append_marker('b.flag')}\n")
        code, _ = self.run_queue("t", "--concurrency", "2")
        self.assertEqual(code, 0)
        self.assertEqual(self.state()["a"]["status"], "done")
        self.assertEqual(self.order()[:2], ["start a", "start b"])
        self.assertIn("ALLDONE", self.logtext())

    def test_the_plan_can_ask_for_concurrency(self):
        self.plan(f"set CONCURRENCY = 2\na | {wait_for_flag('b.flag')}\nb | {append_marker('b.flag')}\n")
        code, _ = self.run_queue()
        self.assertEqual(code, 0)
        self.assertIn("running up to 2 steps at a time", self.logtext())

    def test_the_default_is_one_step_at_a_time(self):
        self.plan(f"a | {wait_for_flag('b.flag', 1)}\nb | {append_marker('b.flag')}\n")
        code, _ = self.run_queue()
        self.assertEqual(code, 1)
        self.assertEqual(self.order()[:3], ["start a", "end a", "start b"])
        self.assertEqual(self.state()["a"]["status"], "failed")
        self.assertEqual(self.state()["b"]["status"], "done")

    def test_the_cap_is_respected(self):
        self.plan(f"a | {nap(1.5)}\nb | {nap(1.5)}\nc | {nap(0.1)}\n")
        code, _ = self.run_queue("t", "--concurrency", "2")
        self.assertEqual(code, 0)
        order = self.order()
        self.assertEqual(order[:2], ["start a", "start b"])
        self.assertEqual(order[2], "end a")
        self.assertLess(order.index("end a"), order.index("start c"))

    def test_a_step_waits_for_its_after_step_while_others_run(self):
        self.plan(f"a | {nap(1.5)}\nc | {append_marker('c.ran')}\n  after: a\nb | {nap(0.1)}\n")
        code, _ = self.run_queue("t", "--concurrency", "3")
        self.assertEqual(code, 0)
        order = self.order()
        self.assertLess(order.index("start b"), order.index("end a"))
        self.assertLess(order.index("end a"), order.index("start c"))
        self.assertTrue((self.home / "c.ran").exists())

    def test_an_after_step_later_in_the_plan_is_waited_for(self):
        self.plan(f"a | {append_marker('a.ran')}\n  after: b\nb | {py('print(2)')}\n")
        code, _ = self.run_queue("t", "--concurrency", "2")
        self.assertEqual(code, 0)
        self.assertEqual(self.order(), ["start b", "end b", "start a", "end a"])

    def test_a_failed_after_step_skips_its_dependents_even_when_concurrent(self):
        self.plan(f"a | {py('raise SystemExit(3)')}\nb | {append_marker('b.ran')}\n  after: a\nc | {py('print(1)')}\n")
        code, _ = self.run_queue("t", "--concurrency", "3")
        self.assertEqual(code, 1)
        st = self.state()
        self.assertEqual(st["b"]["status"], "skipped")
        self.assertEqual(st["c"]["status"], "done")
        self.assertFalse((self.home / "b.ran").exists())
        self.assertIn("ALLDONE", self.logtext())

    def test_a_cycle_is_skipped_not_hung(self):
        self.plan(f"a | {py('print(1)')}\n  after: b\nb | {py('print(2)')}\n  after: a\n")
        code, _ = self.run_queue("t", "--concurrency", "2")
        self.assertEqual(code, 1)
        self.assertEqual(self.state()["a"]["status"], "skipped")
        self.assertEqual(self.state()["b"]["status"], "skipped")

    def test_a_timeout_kills_only_that_step(self):
        self.plan(f"a | {nap(60)}\n  timeout: 1s\nb | {nap(2.5)}\n")
        code, _ = self.run_queue("t", "--concurrency", "2")
        self.assertEqual(code, 1)
        st = self.state()
        self.assertEqual(st["a"]["status"], "failed")
        self.assertEqual(st["a"]["exit"], 124)
        self.assertEqual(st["b"]["status"], "done")
        self.assertIn("a exit=124", self.logtext())

    def test_stop_on_fail_lets_the_running_step_finish_and_starts_no_more(self):
        self.plan(f"a | {py('raise SystemExit(4)')}\nb | {nap(1.5)}\nc | {append_marker('c.ran')}\n")
        code, _ = self.run_queue("t", "--concurrency", "2", "--stop-on-fail")
        self.assertEqual(code, 4)
        st = self.state()
        self.assertEqual(st["b"]["status"], "done")
        self.assertNotIn("c", st)
        self.assertFalse((self.home / "c.ran").exists())
        self.assertNotIn("ALLDONE", self.logtext())

    def test_stop_kills_every_running_tree_and_a_rerun_resumes(self):
        kids = [(self.home / f"child{i}.pid").as_posix() for i in (1, 2)]
        self.plan(f"one | {py(SPAWN_CHILD.replace('CHILD', kids[0]))}\ntwo | {py(SPAWN_CHILD.replace('CHILD', kids[1]))}\n")
        runner = subprocess.Popen([sys.executable, str(Path(benchqueue.__file__)), "--home", str(self.home),
                                   "run", "t", "--poll", "0.1", "--min-free-gb", "0", "--concurrency", "2"],
                                  stdout=subprocess.DEVNULL, stderr=subprocess.DEVNULL)
        try:
            pids = [int(self.wait_for(k)) for k in kids]
            out = io.StringIO()
            with redirect_stdout(out):
                self.assertEqual(benchqueue.main(["--home", str(self.home), "stop", "t"]), 0)
            runner.wait(timeout=60)
            for pid in pids:
                self.assert_dead(pid)
        finally:
            if runner.poll() is None:
                runner.kill()
        st = self.state()
        self.assertEqual(st["one"]["status"], "interrupted")
        self.assertEqual(st["two"]["status"], "interrupted")
        self.assertFalse((self.home / "work" / "queue-t.pid").exists())
        self.assertNotIn("ALLDONE", self.logtext())

    def test_a_started_steps_memory_is_held_back_until_it_has_ramped_up(self):
        self.plan(f"a | {nap(2)}\n  memory: 5g\nb | {py('print(1)')}\n")
        with mock.patch.object(benchqueue, "free_memory_gb", return_value=10.0), \
                mock.patch.object(benchqueue, "RAMP_SECONDS", 0.6):
            with redirect_stdout(io.StringIO()):
                code = benchqueue.main(["--home", str(self.home), "run", "t", "--poll", "0.1",
                                        "--min-free-gb", "8", "--concurrency", "2"])
        self.assertEqual(code, 0)
        text = self.logtext()
        self.assertIn("paused before b: 10.0 GB free is under 13 GB", text)
        self.assertIn("memory recovered", text)
        order = self.order()
        self.assertEqual(order[0], "start a")
        self.assertLess(order.index("start b"), order.index("end a"))

    def test_status_shows_the_concurrency_and_the_running_steps(self):
        self.plan(f"set CONCURRENCY = 2\na | {py('print(1)')}\nb | {py('print(2)')}\n")
        paths = benchqueue.Paths(self.home, self.home / "plans" / "t.queue")
        benchqueue.save_state(paths, {"steps": {"a": {"status": "running"}, "b": {"status": "running"}}})
        with mock.patch.object(benchqueue, "runner_pid", return_value=4242):
            out = io.StringIO()
            with redirect_stdout(out):
                benchqueue.main(["--home", str(self.home), "status", "t"])
        text = out.getvalue()
        self.assertIn("up to 2 steps at a time", text)
        self.assertRegex(text, r"a\s+running")
        self.assertRegex(text, r"b\s+running")
        self.assertIn("0 of 2 steps done, 2 running", text)

    def test_a_bad_concurrency_or_memory_is_refused(self):
        with self.assertRaises(benchqueue.PlanError):
            benchqueue.parse_plan("set CONCURRENCY = 0\na | echo 1\n")
        with self.assertRaises(benchqueue.PlanError):
            benchqueue.parse_plan("set CONCURRENCY = lots\na | echo 1\n")
        with self.assertRaises(benchqueue.PlanError):
            benchqueue.parse_plan("a | echo 1\n  memory: plenty\n")
        self.plan(f"a | {py('print(1)')}\n")
        with redirect_stdout(io.StringIO()):
            self.assertEqual(benchqueue.main(["--home", str(self.home), "run", "t", "--concurrency", "0"]), 2)

    def test_parse_reads_the_plan_concurrency_and_a_step_memory(self):
        plan = benchqueue.parse_plan("set CONCURRENCY = 3\na | echo 1\n  memory: 24g\nb | echo 2\n")
        self.assertEqual(plan.concurrency, 3)
        self.assertEqual(plan[0].memory, 24.0)
        self.assertEqual(plan[1].memory, 0.0)
        self.assertEqual(benchqueue.parse_plan("a | echo 1\n").concurrency, 1)


class ShippedPlanTest(unittest.TestCase):
    def test_every_shipped_plan_parses_with_all_variables_resolved(self):
        plans = Path(benchqueue.__file__).resolve().parent / "plans"
        found = sorted(plans.glob("*.queue"))
        self.assertTrue(found)
        for p in found:
            steps = benchqueue.parse_plan(p.read_text(encoding="utf-8"))
            self.assertTrue(steps, p.name)
            for s in steps:
                self.assertNotIn("${", s.command, f"{p.name}:{s.name}")


if __name__ == "__main__":
    unittest.main()

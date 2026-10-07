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

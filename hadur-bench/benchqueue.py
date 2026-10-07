#!/usr/bin/env python3
"""Resumable queue runner for overnight bench plans (issue #117).

    benchqueue.py run PLAN [--dry-run] [--only A,B] [--skip A] [--fresh] [--stop-on-fail] [--min-free-gb N]
    benchqueue.py status PLAN
    benchqueue.py stop PLAN

PLAN is a path, or a name resolved to plans/NAME.queue. A plan is one step per line:

    # comment
    set HEAP = --child-heap 2G          variable, used as ${HEAP} in later commands
    name | command ...                  run through bash (Git Bash on Windows) in hadur-bench/
        after: other                    only run if step `other` finished with exit 0
        timeout: 6h                     kill the step after this long (s, m or h)

State is kept in work/queue-<plan>.state.json, so a restart skips steps that already
exited 0 and runs the rest. The log (work-queue-<plan>.log) reads like the hand-written
queues: `HH:MM:SS start X`, `HH:MM:SS X exit=N in S s`, and a final `ALLDONE`.

Every step is run in its own process group (POSIX) or job object (Windows) and only
that tree is killed on stop, timeout or runner exit; no other java is touched.
Python 3 standard library only.
"""
import argparse
import ctypes
import json
import os
import re
import shutil
import signal
import subprocess
import sys
import time
from pathlib import Path

HERE = Path(__file__).resolve().parent
IS_WIN = os.name == "nt"
TERMINAL_OK = "done"


class PlanError(Exception):
    pass


class Step:
    def __init__(self, name, command):
        self.name = name
        self.command = command
        self.after = None
        self.timeout = None


def parse_duration(text):
    m = re.fullmatch(r"\s*(\d+(?:\.\d+)?)\s*([smh]?)\s*", text)
    if not m:
        raise PlanError(f"bad timeout '{text}' (use 90s, 30m or 6h)")
    return float(m.group(1)) * {"": 1, "s": 1, "m": 60, "h": 3600}[m.group(2)]


def parse_plan(text):
    steps, variables, current = [], {}, None
    for n, raw in enumerate(text.splitlines(), 1):
        line = raw.rstrip()
        if not line.strip() or line.lstrip().startswith("#"):
            continue
        indented = raw[:1] in (" ", "\t")
        stripped = line.strip()
        if indented and current is not None:
            key, _, value = stripped.partition(":")
            key, value = key.strip(), value.strip()
            if key == "after":
                current.after = value
            elif key == "timeout":
                current.timeout = parse_duration(value)
            else:
                raise PlanError(f"line {n}: unknown attribute '{key}'")
            continue
        m = re.match(r"set\s+(\w+)\s*=\s*(.*)$", stripped)
        if m:
            value = m.group(2)
            for key, known in variables.items():
                value = value.replace("${%s}" % key, known)
            variables[m.group(1)] = value
            current = None
            continue
        if "|" not in stripped:
            raise PlanError(f"line {n}: expected 'name | command'")
        name, _, command = stripped.partition("|")
        name, command = name.strip(), command.strip()
        if not re.fullmatch(r"[\w.-]+", name):
            raise PlanError(f"line {n}: bad step name '{name}'")
        if any(s.name == name for s in steps):
            raise PlanError(f"line {n}: duplicate step '{name}'")
        if not command:
            raise PlanError(f"line {n}: step '{name}' has no command")
        for key, value in variables.items():
            command = command.replace("${%s}" % key, value)
        left = re.findall(r"\$\{([A-Za-z_]\w*)\}", command)
        undefined = [v for v in left if v not in variables and v not in os.environ]
        if undefined:
            raise PlanError(f"line {n}: step '{name}' uses undefined ${{{undefined[0]}}}")
        current = Step(name, command)
        steps.append(current)
    for s in steps:
        if s.after and not any(o.name == s.after for o in steps):
            raise PlanError(f"step '{s.name}' is after unknown step '{s.after}'")
    return steps


def resolve_plan(arg, home):
    p = Path(arg)
    if p.is_file():
        return p.resolve()
    named = home / "plans" / (arg if arg.endswith(".queue") else arg + ".queue")
    if named.is_file():
        return named
    raise PlanError(f"no such plan: {arg}")


class Paths:
    def __init__(self, home, plan_file):
        self.home = home
        self.plan = plan_file.stem
        self.work = home / "work"
        self.state = self.work / f"queue-{self.plan}.state.json"
        self.stop = self.work / f"queue-{self.plan}.STOP"
        self.pid = self.work / f"queue-{self.plan}.pid"
        self.log = home / f"work-queue-{self.plan}.log"

    def step_log(self, name):
        return self.home / f"work-queue-{self.plan}-{name}.log"


def load_state(paths):
    try:
        return json.loads(paths.state.read_text())
    except (OSError, ValueError):
        return {"steps": {}}


def save_state(paths, state):
    paths.work.mkdir(parents=True, exist_ok=True)
    tmp = paths.state.with_suffix(".tmp")
    tmp.write_text(json.dumps(state, indent=1))
    os.replace(tmp, paths.state)


def stamp():
    return time.strftime("%H:%M:%S")


def log(paths, message):
    with open(paths.log, "a", encoding="utf-8") as f:
        f.write(f"{stamp()} {message}\n")
    print(f"{stamp()} {message}", flush=True)


def pid_alive(pid):
    if pid <= 0:
        return False
    if IS_WIN:
        k = ctypes.windll.kernel32
        h = k.OpenProcess(0x00100000, False, pid)  # SYNCHRONIZE
        if not h:
            return False
        alive = k.WaitForSingleObject(h, 0) == 0x102  # WAIT_TIMEOUT
        k.CloseHandle(h)
        return alive
    try:
        os.kill(pid, 0)
        return True
    except PermissionError:
        return True
    except OSError:
        return False


def runner_pid(paths):
    try:
        pid = int(paths.pid.read_text().strip())
    except (OSError, ValueError):
        return None
    return pid if pid_alive(pid) else None


def free_memory_gb():
    """Available physical memory in GB, or None where it cannot be read."""
    if IS_WIN:
        class MemStatus(ctypes.Structure):
            _fields_ = [("length", ctypes.c_ulong), ("load", ctypes.c_ulong),
                        ("totalPhys", ctypes.c_ulonglong), ("availPhys", ctypes.c_ulonglong),
                        ("totalPage", ctypes.c_ulonglong), ("availPage", ctypes.c_ulonglong),
                        ("totalVirt", ctypes.c_ulonglong), ("availVirt", ctypes.c_ulonglong),
                        ("availExt", ctypes.c_ulonglong)]
        s = MemStatus()
        s.length = ctypes.sizeof(MemStatus)
        if not ctypes.windll.kernel32.GlobalMemoryStatusEx(ctypes.byref(s)):
            return None
        return s.availPhys / 2**30
    try:
        for line in open("/proc/meminfo"):
            if line.startswith("MemAvailable:"):
                return int(line.split()[1]) / 2**20
    except OSError:
        pass
    return None


def find_shell():
    override = os.environ.get("QUEUE_SHELL")
    if override:
        return [override, "-c"]
    if IS_WIN:
        for root in (os.environ.get("ProgramFiles"), os.environ.get("ProgramFiles(x86)"),
                     os.environ.get("LOCALAPPDATA") and os.path.join(os.environ["LOCALAPPDATA"], "Programs")):
            if root:
                for rel in ("Git/bin/bash.exe", "Git/usr/bin/bash.exe"):
                    cand = os.path.join(root, *rel.split("/"))
                    if os.path.isfile(cand):
                        return [cand, "-c"]
        found = shutil.which("bash")
        if found and "system32" not in found.lower():
            return [found, "-c"]
        raise PlanError("Git Bash not found; set QUEUE_SHELL to a bash.exe")
    return [shutil.which("bash") or "/bin/sh", "-c"]


class Job:
    """The process tree of one step, killable as a unit."""

    def __init__(self):
        self.proc = None
        self.handle = None

    def start(self, argv, cwd, out):
        if IS_WIN:
            self.proc = subprocess.Popen(argv, cwd=cwd, stdout=out, stderr=subprocess.STDOUT,
                                         stdin=subprocess.DEVNULL, creationflags=0x00000200)
            self._assign_job()
        else:
            self.proc = subprocess.Popen(argv, cwd=cwd, stdout=out, stderr=subprocess.STDOUT,
                                         stdin=subprocess.DEVNULL, start_new_session=True)
        return self.proc

    def _assign_job(self):
        k = ctypes.windll.kernel32
        k.CreateJobObjectW.restype = ctypes.c_void_p
        k.OpenProcess.restype = ctypes.c_void_p
        h = k.CreateJobObjectW(None, None)
        if not h:
            return

        class Basic(ctypes.Structure):
            _fields_ = [("a", ctypes.c_int64), ("b", ctypes.c_int64), ("limit", ctypes.c_uint32),
                        ("minWs", ctypes.c_size_t), ("maxWs", ctypes.c_size_t),
                        ("affinity", ctypes.c_uint32), ("prio", ctypes.c_uint32),
                        ("sched", ctypes.c_uint32)]

        class IoCounters(ctypes.Structure):
            _fields_ = [(n, ctypes.c_uint64) for n in "abcdef"]

        class Extended(ctypes.Structure):
            _fields_ = [("basic", Basic), ("io", IoCounters), ("procMem", ctypes.c_size_t),
                        ("jobMem", ctypes.c_size_t), ("peakProc", ctypes.c_size_t),
                        ("peakJob", ctypes.c_size_t)]

        info = Extended()
        info.basic.limit = 0x2000  # JOB_OBJECT_LIMIT_KILL_ON_JOB_CLOSE
        k.SetInformationJobObject(ctypes.c_void_p(h), 9, ctypes.byref(info), ctypes.sizeof(info))
        ph = k.OpenProcess(0x1F0FFF, False, self.proc.pid)
        if ph:
            k.AssignProcessToJobObject(ctypes.c_void_p(h), ctypes.c_void_p(ph))
            k.CloseHandle(ctypes.c_void_p(ph))
        self.handle = h

    def kill(self):
        if self.proc is None:
            return
        if IS_WIN:
            if self.handle:
                ctypes.windll.kernel32.TerminateJobObject(ctypes.c_void_p(self.handle), 1)
            subprocess.run(["taskkill", "/PID", str(self.proc.pid), "/T", "/F"],
                           stdout=subprocess.DEVNULL, stderr=subprocess.DEVNULL)
        else:
            for sig in (signal.SIGTERM, signal.SIGKILL):
                try:
                    os.killpg(self.proc.pid, sig)
                except OSError:
                    break
                try:
                    self.proc.wait(timeout=5)
                    break
                except subprocess.TimeoutExpired:
                    continue
        try:
            self.proc.wait(timeout=10)
        except subprocess.TimeoutExpired:
            pass

    def close(self):
        if IS_WIN and self.handle:
            ctypes.windll.kernel32.CloseHandle(ctypes.c_void_p(self.handle))
            self.handle = None


class Runner:
    def __init__(self, paths, steps, args):
        self.paths, self.steps, self.args = paths, steps, args
        self.stop_requested = False
        self.job = None

    def _on_signal(self, *_):
        self.stop_requested = True

    def stopping(self):
        return self.stop_requested or self.paths.stop.exists()

    def wait_for_memory(self, name):
        threshold = self.args.min_free_gb
        if not threshold:
            return
        paused_at = None
        while not self.stopping():
            free = free_memory_gb()
            if free is None or free >= threshold:
                if paused_at is not None:
                    log(self.paths, f"memory recovered ({free:.1f} GB free), resuming before {name}")
                return
            if paused_at is None or time.time() - paused_at >= 300:
                log(self.paths, f"paused before {name}: {free:.1f} GB free is under {threshold:g} GB")
                paused_at = time.time()
            time.sleep(self.args.poll)

    def run_step(self, step):
        paths = self.paths
        out = open(paths.step_log(step.name), "w", encoding="utf-8", errors="replace")
        started = time.time()
        log(paths, f"start {step.name}")
        job = self.job = Job()
        job.start(find_shell() + [step.command], str(paths.home), out)
        code, reason = None, None
        while code is None:
            try:
                code = job.proc.wait(timeout=self.args.poll)
            except subprocess.TimeoutExpired:
                if self.stopping():
                    reason = "stopped"
                elif step.timeout and time.time() - started > step.timeout:
                    reason = "timeout"
                if reason:
                    job.kill()
                    code = 124 if reason == "timeout" else 130
        if reason is None and job.proc.poll() is not None:
            job.kill()  # sweep anything the shell left behind
        job.close()
        out.close()
        self.job = None
        secs = int(time.time() - started)
        suffix = f" ({reason})" if reason else ""
        log(paths, f"{step.name} exit={code} in {secs} s{suffix}")
        return code, secs, reason

    def run(self):
        paths, args = self.paths, self.args
        paths.work.mkdir(parents=True, exist_ok=True)
        existing = runner_pid(paths)
        if existing:
            raise PlanError(f"plan '{paths.plan}' is already running (pid {existing})")
        paths.pid.write_text(str(os.getpid()))
        paths.stop.unlink(missing_ok=True)
        signal.signal(signal.SIGINT, self._on_signal)
        if hasattr(signal, "SIGBREAK"):
            signal.signal(signal.SIGBREAK, self._on_signal)
        signal.signal(signal.SIGTERM, self._on_signal)
        state = {"steps": {}} if args.fresh else load_state(paths)
        try:
            return self._loop(state)
        finally:
            if self.job:
                self.job.kill()
                self.job.close()
            paths.pid.unlink(missing_ok=True)

    def _loop(self, state):
        paths, args = self.paths, self.args
        failed = False
        for step in self.steps:
            rec = state["steps"].get(step.name, {})
            if self.stopping():
                log(paths, "stop requested, leaving the remaining steps pending")
                return 130
            if args.only and step.name not in args.only:
                continue
            if step.name in args.skip:
                log(paths, f"skip {step.name} (--skip)")
                continue
            if rec.get("status") == TERMINAL_OK:
                log(paths, f"skip {step.name} (already exit=0)")
                continue
            if step.after and state["steps"].get(step.after, {}).get("status") != TERMINAL_OK:
                log(paths, f"skip {step.name} (after {step.after}, which has not finished exit=0)")
                state["steps"][step.name] = {"status": "skipped", "reason": f"after {step.after}"}
                save_state(paths, state)
                continue
            self.wait_for_memory(step.name)
            if self.stopping():
                log(paths, "stop requested, leaving the remaining steps pending")
                return 130
            state["steps"][step.name] = {"status": "running", "start": time.strftime("%Y-%m-%dT%H:%M:%S")}
            save_state(paths, state)
            code, secs, reason = self.run_step(step)
            state["steps"][step.name] = {
                "status": TERMINAL_OK if code == 0 else ("interrupted" if reason == "stopped" else "failed"),
                "exit": code, "seconds": secs, "end": time.strftime("%Y-%m-%dT%H:%M:%S")}
            save_state(paths, state)
            if reason == "stopped":
                log(paths, "stopped; rerun to resume from this step")
                return 130
            if code != 0:
                failed = True
                if args.stop_on_fail:
                    log(paths, f"stopping after failed step {step.name} (--stop-on-fail)")
                    return code
        log(paths, "ALLDONE")
        return 1 if failed else 0


def cmd_run(args):
    home = Path(args.home).resolve()
    plan_file = resolve_plan(args.plan, home)
    steps = parse_plan(plan_file.read_text(encoding="utf-8"))
    paths = Paths(home, plan_file)
    known = {s.name for s in steps}
    for name in args.only + args.skip:
        if name not in known:
            raise PlanError(f"no step named '{name}' in {plan_file.name}")
    if args.dry_run:
        state = load_state(paths)
        for s in steps:
            status = state["steps"].get(s.name, {}).get("status", "pending")
            mark = "skip" if status == TERMINAL_OK or s.name in args.skip or (args.only and s.name not in args.only) else "run "
            extra = (f" [after {s.after}]" if s.after else "") + (f" [timeout {s.timeout:g}s]" if s.timeout else "")
            print(f"{mark} {s.name} ({status}){extra}: {s.command}")
        print("dry run: nothing was run")
        return 0
    return Runner(paths, steps, args).run()


def cmd_status(args):
    home = Path(args.home).resolve()
    plan_file = resolve_plan(args.plan, home)
    steps = parse_plan(plan_file.read_text(encoding="utf-8"))
    paths = Paths(home, plan_file)
    state = load_state(paths)
    pid = runner_pid(paths)
    print(f"plan {paths.plan}: runner " + (f"running (pid {pid})" if pid else "not running"))
    done = 0
    for s in steps:
        rec = state["steps"].get(s.name, {})
        status = rec.get("status", "pending")
        if status == "running" and not pid:
            status = "interrupted"
        done += status == TERMINAL_OK
        detail = f"exit={rec['exit']} in {rec['seconds']} s" if "exit" in rec else rec.get("reason", "")
        print(f"  {s.name:<28} {status:<12} {detail}")
    print(f"{done} of {len(steps)} steps done")
    return 0


def cmd_stop(args):
    home = Path(args.home).resolve()
    plan_file = resolve_plan(args.plan, home)
    paths = Paths(home, plan_file)
    pid = runner_pid(paths)
    if not pid:
        print(f"plan {paths.plan} is not running")
        return 0
    paths.work.mkdir(parents=True, exist_ok=True)
    paths.stop.write_text("stop\n")
    print(f"stop requested for plan {paths.plan} (pid {pid}); the runner kills the current step's tree within a few seconds")
    return 0


def build_parser():
    p = argparse.ArgumentParser(prog="benchqueue.py", description=__doc__.split("\n\n")[0])
    p.add_argument("--home", default=os.environ.get("QUEUE_HOME", str(HERE)), help="bench directory (default: this file's directory)")
    sub = p.add_subparsers(dest="command", required=True)
    r = sub.add_parser("run", help="run a plan, skipping steps that already exited 0")
    r.add_argument("plan")
    r.add_argument("--dry-run", action="store_true")
    r.add_argument("--only", default="", help="comma-separated step names to run")
    r.add_argument("--skip", default="", help="comma-separated step names to skip")
    r.add_argument("--fresh", action="store_true", help="ignore the saved state and run every step")
    r.add_argument("--stop-on-fail", action="store_true", help="stop the queue at the first failed step")
    r.add_argument("--min-free-gb", type=float, default=8.0, help="pause before a step while free memory is under this (0 disables), default 8")
    r.add_argument("--poll", type=float, default=1.0, help=argparse.SUPPRESS)
    r.set_defaults(func=cmd_run)
    s = sub.add_parser("status", help="show each step's state")
    s.add_argument("plan")
    s.set_defaults(func=cmd_status)
    t = sub.add_parser("stop", help="ask a running plan to stop and kill its current step's tree")
    t.add_argument("plan")
    t.set_defaults(func=cmd_stop)
    return p


def main(argv=None):
    args = build_parser().parse_args(argv)
    for attr in ("only", "skip"):
        if hasattr(args, attr):
            setattr(args, attr, [x for x in getattr(args, attr).split(",") if x])
    try:
        return args.func(args)
    except PlanError as e:
        print(f"benchqueue.py: {e}", file=sys.stderr)
        return 2


if __name__ == "__main__":
    sys.exit(main())

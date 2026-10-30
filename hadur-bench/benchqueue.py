#!/usr/bin/env python3
"""Resumable queue runner for overnight bench plans (issue #117).

    benchqueue.py run PLAN [--dry-run] [--only A,B] [--skip A] [--fresh] [--stop-on-fail] [--min-free-gb N]
                           [--concurrency N] [--workers N] [--work-dir DIR]
    benchqueue.py host [--workers N] [--work-dir DIR]
    benchqueue.py status PLAN
    benchqueue.py stop PLAN

PLAN is a path, or a name resolved to plans/NAME.queue. A plan is one step per line:

    # comment
    set HEAP = --child-heap 2G          variable, used as ${HEAP} in later commands
    set CONCURRENCY = 2                 run up to 2 independent steps side by side (default 1)
    name | command ...                  run through bash (Git Bash on Windows) in hadur-bench/
        after: other                    only run if step `other` finished with exit 0
        timeout: 6h                     kill the step after this long (s, m or h)
        memory: 24g                     rough peak memory in GB, held back from the free-memory
                                        check for a minute after the step starts (concurrent runs)
        watch: field=1217               read the step's battles as they land (BENCH-129, benchwatch.py)
        stop: futility s4 below 0.1 after 30%
                                        a pre-declared stop rule, checked every minute (BENCH-130);
                                        one per line: fails, dead, skips, stall, aa, futility

State is kept in work/queue-<plan>.state.json, so a restart skips steps that already
exited 0 and runs the rest. With CONCURRENCY (or --concurrency) above 1, steps whose `after:`
step is done (or that have none) start together, up to that many at once, in plan order; a step
that is after a step still running waits for it. The default is one step at a time. The log (work-queue-<plan>.log) reads like the hand-written
queues: `HH:MM:SS start X`, `HH:MM:SS X exit=N in S s`, and a final `ALLDONE`.

Progress (BENCH-129..131): every minute the runner writes work/queue-<plan>.progress.md and .json
(each step's state; for a watched step its battles, rate, ETA, failures, skipped turns, each arm's
running difference from the control and every stop rule's state) and every PROGRESS_MINUTES (15)
pushes them, with the log's tail, to the branch PROGRESS_BRANCH (claude/<plan>-progress when a
step is watched; `off` for none) without touching the working tree, so Leigh and a thread can read a run mid-way on GitHub. A
stop rule that trips stops its step (see benchwatch.py: halt stops the queue, finish lets the gate
and PR steps run on the rows so far), pushes at once and, with `set ALERT = <github login>`, opens a
GitHub issue assigned to that login. --no-stop-rules shows the rules without acting on them;
--continue-early reruns steps a finish rule ended, its rules shown only.

Host (BENCH-105): before a plan is read, hostprofile.py sizes the bench to this machine and
offers the plan ${WORKERS} (duel width), ${TEAM_WORKERS}, ${MELEE_WORKERS} and ${CPU} (the
--cpu-constant flag, or nothing). They are 12, 12, 12 and --cpu-constant 1488498 on the PC and
narrower on a smaller machine. A plan's own `set WORKERS = N` wins over the detected value;
--workers N (or HADUR_BENCH_WORKERS) wins over both. Every step also gets them in its environment
(HADUR_BENCH_WORKERS_DUEL/_TEAM/_MELEE, HADUR_BENCH_CPU_CONSTANT, HADUR_BENCH_HOST), so Bench's
--parallel auto and --cpu-constant auto agree with the plan, and the run's conditions.json names
the host. The first log line of a run names the host and the widths. --work-dir DIR (or
HADUR_BENCH_WORK, or WORK_DIR in host.local) puts the work folder on another disk: when
hadur-bench/work does not exist yet it is made a link (a junction on Windows) to DIR; an
existing work folder is never moved.

Fence (BENCH-145): with FENCE = on in host.local (or HADUR_BENCH_FENCE=on) the runner binds itself, and
so every step and battle JVM, to the bench's side of tools/fence.py's split (on the PC every L3 group
but the last), so RoboRumble clients started with `tools/fence.py clients` on the last group never
share a core or cache with a battle. Off by default.

Every step is run in its own process group (POSIX) or job object (Windows) and only
that tree is killed on stop, timeout or runner exit; no other java is touched. A timeout kills
that one step; a stop kills every running step.
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
sys.path.insert(0, str(HERE))
import hostprofile  # noqa: E402
import benchwatch  # noqa: E402
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
        self.memory = 0.0
        self.watch = None
        self.stops = []


class Plan(list):
    """The steps of a plan, in order, plus the plan's variables and its concurrency."""

    variables = {}
    concurrency = 1


def parse_duration(text):
    m = re.fullmatch(r"\s*(\d+(?:\.\d+)?)\s*([smh]?)\s*", text)
    if not m:
        raise PlanError(f"bad timeout '{text}' (use 90s, 30m or 6h)")
    return float(m.group(1)) * {"": 1, "s": 1, "m": 60, "h": 3600}[m.group(2)]


def parse_gb(text):
    m = re.fullmatch(r"\s*(\d+(?:\.\d+)?)\s*[gG]?[bB]?\s*", text)
    if not m:
        raise PlanError(f"bad memory '{text}' (use 24 or 24g)")
    return float(m.group(1))


HOST_VARIABLES = ("WORKERS", "DUEL_WORKERS", "TEAM_WORKERS", "MELEE_WORKERS", "CPU")


def parse_plan(text, preset=None, locked=()):
    """The plan's steps. `preset` variables (the host's) are defined before the first line; a
    plan's `set` replaces one unless its name is in `locked` (a --workers override)."""
    steps, variables, current = [], dict(preset or {}), None
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
            elif key == "memory":
                current.memory = parse_gb(value)
            elif key == "watch":
                current.watch = value
            elif key == "stop":
                try:
                    current.stops.append(benchwatch.Rule(value))
                except benchwatch.WatchError as e:
                    raise PlanError(f"line {n}: {e}")
                current.watch = current.watch if current.watch is not None else ""
            else:
                raise PlanError(f"line {n}: unknown attribute '{key}'")
            continue
        m = re.match(r"set\s+(\w+)\s*=\s*(.*)$", stripped)
        if m and m.group(1) in locked:
            current = None
            continue
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
    plan = Plan(steps)
    plan.variables = variables
    if "CONCURRENCY" in variables:
        try:
            plan.concurrency = int(variables["CONCURRENCY"])
        except ValueError:
            plan.concurrency = 0
        if plan.concurrency < 1:
            raise PlanError(f"CONCURRENCY must be a whole number of 1 or more, not '{variables['CONCURRENCY']}'")
    return plan


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
        self.progress = self.work / f"queue-{self.plan}.progress.md"
        self.progress_json = self.work / f"queue-{self.plan}.progress.json"

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

    def start(self, argv, cwd, out, env=None):
        if IS_WIN:
            self.proc = subprocess.Popen(argv, cwd=cwd, stdout=out, stderr=subprocess.STDOUT,
                                         stdin=subprocess.DEVNULL, creationflags=0x00000200, env=env)
            self._assign_job()
        else:
            self.proc = subprocess.Popen(argv, cwd=cwd, stdout=out, stderr=subprocess.STDOUT,
                                         stdin=subprocess.DEVNULL, start_new_session=True, env=env)
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


RAMP_SECONDS = 60


class Active:
    """One running step."""

    def __init__(self, step, job, out):
        self.step, self.job, self.out = step, job, out
        self.started = time.time()
        self.spec = None
        self.enforce = True
        self.summary = None


def bind_watches(steps, home):
    """Each watched step's benchwatch.Spec, checked against its rules before anything runs."""
    for s in steps:
        if s.watch is None and "bench-top20.sh" in s.command and re.search(r"(^|\s)--arms\s", s.command):
            s.watch = ""  # every multi-arm step shows its progress; only declared rules stop anything
        if s.watch is None:
            s.spec = None
            continue
        try:
            s.spec = benchwatch.Spec(s.watch, s.command, home)
            s.spec.check(s.stops)
        except benchwatch.WatchError as e:
            raise PlanError(f"step '{s.name}': {e}")


class Progress:
    """The run's progress file and its pushes to a progress branch (BENCH-129, BENCH-131)."""

    def __init__(self, paths, steps, args):
        v = getattr(steps, "variables", {})
        self.paths, self.steps = paths, steps
        watched = any(getattr(s, "watch", None) is not None for s in steps)
        self.branch = v.get("PROGRESS_BRANCH", f"claude/{paths.plan}-progress" if watched else "off")
        if getattr(args, "no_publish", False) or self.branch.lower() in ("off", "none", ""):
            self.branch = None
        self.remote = v.get("PROGRESS_REMOTE", "origin")
        self.alert = v.get("ALERT", "").strip() or None
        try:
            self.every = float(v.get("PROGRESS_MINUTES", "15")) * 60
        except ValueError:
            raise PlanError(f"PROGRESS_MINUTES must be a number, not '{v['PROGRESS_MINUTES']}'")
        self.last_push = 0.0
        self.last_log = 0.0
        self.pushing = None
        self.pending = None
        import threading
        self.lock = threading.Lock()
        self.warned = set()

    def render(self, state, running):
        p = self.paths
        lines = [f"# Queue {p.plan}: progress", "",
                 f"Updated {time.strftime('%Y-%m-%d %H:%M:%S')} PC time ({time.strftime('%H:%M', time.gmtime())} UTC), "
                 f"runner pid {os.getpid()}.", ""]
        for s in self.steps:
            rec = state["steps"].get(s.name, {})
            st_ = rec.get("status", "pending")
            extra = f", exit {rec['exit']} in {benchwatch.hours(rec['seconds'])}" if "exit" in rec else ""
            if rec.get("early"):
                extra += f", STOPPED EARLY: {rec['early']}"
            if rec.get("halted_by"):
                extra += f", HALTED by {rec['halted_by']}"
            lines.append(f"- `{s.name}` {st_}{extra}")
        lines.append("")
        summaries = []
        for s in self.steps:
            act = running.get(s.name)
            summ = act.summary if act else getattr(s, "last_summary", None)
            if s.spec is not None and summ is not None:
                lines.append(benchwatch.render_step(s.name, s.spec, summ))
                summaries.append({"step": s.name, **benchwatch.to_json(summ)})
        try:
            tail = p.log.read_text(encoding="utf-8", errors="replace").splitlines()[-15:]
        except OSError:
            tail = []
        lines += ["### Queue log (last lines)", "", "```", *tail, "```", ""]
        steps = {s.name: state["steps"].get(s.name, {"status": "pending"}) for s in self.steps}
        return "\n".join(lines), {"plan": p.plan, "updated": time.time(), "steps": steps, "watched": summaries}

    def write(self, state, running, push=False, message="progress"):
        md, js = self.render(state, running)
        for path, text in ((self.paths.progress, md), (self.paths.progress_json, json.dumps(js, indent=1, default=str))):
            tmp = path.with_suffix(path.suffix + ".tmp")
            tmp.write_text(text, encoding="utf-8")
            os.replace(tmp, path)
        now = time.time()
        if self.branch and (push or now - self.last_push >= self.every):
            self.last_push = now
            self._push_async(md, js, message)
        return md

    def _push_async(self, md, js, message):
        try:
            log_tail = "\n".join(self.paths.log.read_text(encoding="utf-8", errors="replace").splitlines()[-300:]) + "\n"
        except OSError:
            log_tail = ""
        files = {"progress.md": md, "progress.json": json.dumps(js, indent=1, default=str), "queue.log": log_tail}
        with self.lock:
            # A push still running takes this snapshot next, so a stop's page is never dropped.
            self.pending = (files, message)
            if self.pushing and self.pushing.is_alive():
                return
            import threading
            self.pushing = threading.Thread(target=self._drain, daemon=True)
            self.pushing.start()

    def _drain(self):
        while True:
            with self.lock:
                job, self.pending = self.pending, None
            if job is None:
                return
            self._push(*job)

    def wait(self, seconds=90):
        if self.pushing:
            self.pushing.join(seconds)

    def _push(self, files, message):
        """Commit FILES alone on the progress branch with git plumbing (a private index, no checkout)
        and force-push it. A failure is logged once and never touches the run."""
        p = self.paths
        env = {**os.environ, "GIT_INDEX_FILE": str(p.work / f"queue-{p.plan}.progress.index")}
        env.setdefault("GIT_AUTHOR_NAME", "hadur-bench")
        env.setdefault("GIT_AUTHOR_EMAIL", "hadur-bench@localhost")
        env.setdefault("GIT_COMMITTER_NAME", env["GIT_AUTHOR_NAME"])
        env.setdefault("GIT_COMMITTER_EMAIL", env["GIT_AUTHOR_EMAIL"])

        def git(*a, inp=None):
            r = subprocess.run(["git", *a], cwd=str(p.home), env=env, input=inp, capture_output=True,
                               text=True, timeout=120, encoding="utf-8")
            if r.returncode != 0 and a[0] != "rev-parse":
                raise RuntimeError(f"git {a[0]}: {(r.stderr or r.stdout).strip()[:300]}")
            return r.stdout.strip()

        ref = f"refs/hadur-progress/{p.plan}"
        try:
            prev = git("rev-parse", "--verify", "-q", ref)
            git("read-tree", "--empty")
            for name, text in files.items():
                blob = git("hash-object", "-w", "--stdin", inp=text)
                git("update-index", "--add", "--cacheinfo", f"100644,{blob},{name}")
            tree = git("write-tree")
            commit = git("commit-tree", tree, *(["-p", prev] if prev else []), "-m", f"{p.plan}: {message}")
            git("update-ref", ref, commit)
            git("push", "-q", "--force", self.remote, f"{commit}:refs/heads/{self.branch}")
            if "pushed" not in self.warned:
                self.warned.add("pushed")
                log(p, f"progress pushed to {self.remote} {self.branch} (every {self.every / 60:g} min)")
        except (RuntimeError, OSError, subprocess.SubprocessError) as e:
            if "push" not in self.warned:
                self.warned.add("push")
                log(p, f"progress push failed (the run is unaffected; later failures not logged): {e}")

    def raise_alert(self, title, body):
        """BENCH-131: a GitHub issue assigned to ALERT, so a stop reaches Leigh's phone."""
        if not self.alert:
            return
        gh = shutil.which("gh")
        if not gh:
            log(self.paths, "alert skipped: gh not installed")
            return
        body_file = self.paths.work / f"queue-{self.paths.plan}.alert.md"
        link = f"\n\nLive progress: branch `{self.branch}`, `progress.md`.\n" if self.branch else "\n"
        try:
            body_file.write_text(body + link, encoding="utf-8")
            r = subprocess.run([gh, "issue", "create", "--title", title, "--body-file", str(body_file),
                                "--assignee", self.alert], cwd=str(self.paths.home), capture_output=True,
                               text=True, timeout=120)
            if r.returncode != 0:
                log(self.paths, f"alert FAILED (gh exit {r.returncode}): {(r.stderr or r.stdout).strip()[:200]}")
            else:
                log(self.paths, f"alert issue: {r.stdout.strip()[:200]}")
        except (OSError, subprocess.SubprocessError) as e:
            log(self.paths, f"alert failed: {e}")


class Runner:
    def __init__(self, paths, steps, args):
        self.paths, self.steps, self.args = paths, steps, args
        self.stop_requested = False
        self.running = {}
        self.paused = False
        self.last_pause_log = 0.0
        self.progress = Progress(paths, steps, args)
        self.last_watch = 0.0
        self.halt_code = 0
        self.progress_error = False

    def _on_signal(self, *_):
        self.stop_requested = True

    def stopping(self):
        return self.stop_requested or self.paths.stop.exists()

    def limit(self):
        return max(1, self.args.concurrency or getattr(self.steps, "concurrency", 1))

    def memory_ok(self, name):
        """True when a step may start now. A step that started in the last RAMP_SECONDS has not
        used its memory yet, so its `memory:` is held back from the free memory."""
        threshold = self.args.min_free_gb
        if not threshold:
            return True
        now = time.time()
        reserved = sum(a.step.memory for a in self.running.values() if now - a.started < RAMP_SECONDS)
        need = threshold + reserved
        free = free_memory_gb()
        if free is None or free >= need:
            if self.paused:
                log(self.paths, f"memory recovered ({free:.1f} GB free), resuming before {name}")
                self.paused = False
            return True
        if not self.paused or now - self.last_pause_log >= 300:
            log(self.paths, f"paused before {name}: {free:.1f} GB free is under {need:g} GB")
            self.last_pause_log = now
        self.paused = True
        return False

    def start_step(self, step, state):
        paths = self.paths
        out = open(paths.step_log(step.name), "w", encoding="utf-8", errors="replace")
        log(paths, f"start {step.name}")
        job = Job()
        env = dict(getattr(self.args, "step_env", None) or os.environ)
        env["HADUR_BENCH_PROGRESS"] = str(paths.progress)
        job.start(find_shell() + [step.command], str(paths.home), out, env)
        act = Active(step, job, out)
        act.spec = getattr(step, "spec", None)
        if act.spec is not None:
            # Read again now: an earlier step (prep) may have written the arms or set file the watch reads.
            try:
                act.spec = step.spec = benchwatch.Spec(step.watch, step.command, paths.home)
                step.spec.check(step.stops)
            except benchwatch.WatchError as e:
                log(paths, f"watch {step.name}: {e}; the step runs with its progress shown, rules not acted on")
                act.enforce = False
        was_early = bool(state["steps"].get(step.name, {}).get("early"))
        act.enforce = act.enforce and not (self.args.no_stop_rules or (self.args.continue_early and was_early))
        if act.spec is not None:
            log(paths, f"watching {step.name}" + (f": {len(step.stops)} stop rule(s)" + ("" if act.enforce else ", shown only") if step.stops else ""))
        self.running[step.name] = act
        state["steps"][step.name] = {"status": "running", "start": time.strftime("%Y-%m-%dT%H:%M:%S")}
        save_state(paths, state)

    def poll_step(self, act):
        """(exit code, reason) once the step has ended or been killed for its timeout, else (None, None)."""
        code = act.job.proc.poll()
        if code is not None:
            return code, None
        timeout = act.step.timeout
        if timeout and time.time() - act.started > timeout:
            act.job.kill()
            return 124, "timeout"
        return None, None

    def end_step(self, act, code, reason, state, status=None, early=None, halted_by=None):
        name = act.step.name
        if reason is None:
            act.job.kill()  # sweep anything the shell left behind
        act.job.close()
        act.out.close()
        self.running.pop(name, None)
        if act.spec is not None:
            act.step.last_summary = self.read_watch(act) or act.summary
        secs = int(time.time() - act.started)
        suffix = f" ({reason})" if reason else ""
        log(self.paths, f"{name} exit={code} in {secs} s{suffix}")
        state["steps"][name] = {
            "status": status or (TERMINAL_OK if code == 0 else ("interrupted" if reason == "stopped" else "failed")),
            "exit": code, "seconds": secs, "end": time.strftime("%Y-%m-%dT%H:%M:%S")}
        if early:
            state["steps"][name]["early"] = early
        if halted_by:
            state["steps"][name]["halted_by"] = halted_by
        save_state(self.paths, state)
        if act.spec is not None and code != 0 and status is None and reason != "stopped":
            md = self.progress.write(state, self.running, push=True, message=f"{name} failed")
            self.progress.raise_alert(f"PC card {self.paths.plan}: step {name} failed (exit {code})", md)

    def read_watch(self, act):
        try:
            return benchwatch.summarize(act.spec, act.step.stops, self.paths.step_log(act.step.name), act.started)
        except Exception as e:  # a reading error must never stop a run
            if not getattr(act, "watch_error", None):
                act.watch_error = str(e)
                log(self.paths, f"watch {act.step.name}: could not read progress ({e}); the step runs on")
            return None

    def watch_tick(self, state, force=False):
        """BENCH-129/130: read every watched step, act on a tripped stop rule, write the progress file."""
        now = time.time()
        if not force and now - self.last_watch < self.args.watch_seconds:
            return
        self.last_watch = now
        for act in list(self.running.values()):
            if act.spec is None:
                continue
            summ = self.read_watch(act)
            if summ is None:
                continue
            act.summary = summ
            hit = benchwatch.tripped(summ)
            if hit and act.enforce:
                self.trip(act, hit, summ, state)
            elif hit and not getattr(act, "shown_trip", None):
                act.shown_trip = hit["rule"]
                log(self.paths, f"stop rule {hit['rule']} would trip on {act.step.name} ({hit['detail']}); not acted on")
        if now - self.progress.last_log >= 1800 and any(a.summary for a in self.running.values()):
            self.progress.last_log = now
            for act in self.running.values():
                if act.summary:
                    log(self.paths, f"progress {act.step.name}: {one_line(act.summary)}")
        try:
            self.progress.write(state, self.running)
        except OSError as e:  # the progress page must never stop battles
            if not self.progress_error:
                self.progress_error = True
                log(self.paths, f"progress page not written ({e}); the run goes on")

    def trip(self, act, rule, summ, state):
        name = act.step.name
        left = (summ["expected"] - summ["battles"]) if summ["expected"] else None
        cost = (f"{left} battles left unrun" + (f" (about {benchwatch.hours(summ['eta'])})" if summ["eta"] else "")
                if left is not None else "the rest of the step unrun")
        why = f"{rule['rule']}: {rule['detail']}"
        log(self.paths, f"STOP {name} by rule {why}; {summ['battles']} battles fought and kept, {cost}")
        act.job.kill()
        if rule["action"] == benchwatch.FINISH:
            out = act.spec.home / act.spec.out
            benchwatch.write_arms_tsv(summ["rows"], out / "arms.tsv")
            (out / "EARLY-STOP.md").write_text(
                f"# {name} stopped early\n\nRule `{rule['rule']}` ({rule['detail']}) after {summ['battles']} of "
                f"{summ['expected'] or '?'} battles; {cost}. arms.tsv holds the battles fought so far.\n", encoding="utf-8")
            self.end_step(act, 0, f"early stop, {rule['rule']}", state, early=why)
        else:
            self.end_step(act, 75, f"halted, {rule['rule']}", state, status="halted", halted_by=why)
            self.halt_code = 75
        md = self.progress.write(state, self.running, push=True, message=f"STOP {name}: {rule['rule']}")
        verb = "stopped early (finish: gate and PR run on the battles so far)" if rule["action"] == benchwatch.FINISH \
            else "halted (queue stopped; rerun resumes)"
        self.progress.raise_alert(f"PC card {self.paths.plan}: {name} {verb.split(' (')[0]} by `{rule['rule']}`",
                                  f"**{name} {verb}.** {why}. {summ['battles']} battles fought and kept, {cost}.\n\n" + md)

    def kill_all(self, state):
        for act in list(self.running.values()):
            act.job.kill()
            self.end_step(act, 130, "stopped", state)

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
        for line in getattr(args, "host_lines", []):
            log(paths, line)
        try:
            return self._loop(state)
        finally:
            for act in list(self.running.values()):
                act.job.kill()
                act.job.close()
            paths.pid.unlink(missing_ok=True)

    def _next_ready(self, todo, state):
        """The first step in plan order whose `after:` step is done. A step whose `after:` step
        is neither done nor still to run is skipped, which can free or skip the steps behind it."""
        names = {s.name for s in todo} | set(self.running)
        for step in list(todo):
            if not step.after:
                return step
            if state["steps"].get(step.after, {}).get("status") == TERMINAL_OK:
                return step
            if step.after in names:
                continue
            log(self.paths, f"skip {step.name} (after {step.after}, which has not finished exit=0)")
            state["steps"][step.name] = {"status": "skipped", "reason": f"after {step.after}"}
            save_state(self.paths, state)
            todo.remove(step)
            return self._next_ready(todo, state)
        return None

    def _loop(self, state):
        paths, args = self.paths, self.args
        todo = []
        # --continue-early: a step a finish rule ended runs on, and every step after it (its gate and
        # results PR) runs again on the full rows.
        rerun = set()
        if args.continue_early:
            rerun = {s.name for s in self.steps if state["steps"].get(s.name, {}).get("early")}
            grew = True
            while grew:
                grew = False
                for s in self.steps:
                    if s.after in rerun and s.name not in rerun:
                        rerun.add(s.name)
                        grew = True
        for step in self.steps:
            rec = state["steps"].get(step.name, {})
            if args.only and step.name not in args.only:
                continue
            if step.name in args.skip:
                log(paths, f"skip {step.name} (--skip)")
                continue
            if rec.get("status") == TERMINAL_OK and step.name not in rerun:
                log(paths, f"skip {step.name} (already exit=0)")
                continue
            todo.append(step)
        limit = self.limit()
        if limit > 1:
            log(paths, f"running up to {limit} steps at a time")
        failed, first_failure, halted = False, 0, False
        while todo or self.running:
            if self.stopping():
                if self.running:
                    self.kill_all(state)
                    log(paths, "stopped; rerun to resume from the interrupted steps")
                else:
                    log(paths, "stop requested, leaving the remaining steps pending")
                self.final_progress(state, "stopped by hand")
                return 130
            for act in list(self.running.values()):
                code, reason = self.poll_step(act)
                if code is None:
                    continue
                self.end_step(act, code, reason, state)
                if code != 0:
                    failed, first_failure = True, first_failure or code
                    if args.stop_on_fail and not halted:
                        halted = True
                        log(paths, f"stopping after failed step {act.step.name} (--stop-on-fail)")
            self.watch_tick(state)
            if self.halt_code and not halted:
                halted, failed, first_failure = True, True, first_failure or self.halt_code
                for act in list(self.running.values()):
                    act.job.kill()
                    self.end_step(act, 130, "stopped", state)
                log(paths, "queue halted by a stop rule; fix the cause and rerun to resume (every fought battle is kept)")
            if halted:
                todo = []
            started = False
            while todo and len(self.running) < limit:
                step = self._next_ready(todo, state)
                if step is None or not self.memory_ok(step.name):
                    break
                todo.remove(step)
                self.start_step(step, state)
                started = True
            if todo and not self.running and not started and not self.paused:
                for step in todo:
                    log(paths, f"skip {step.name} (after {step.after}, which can never finish)")
                    state["steps"][step.name] = {"status": "skipped", "reason": f"after {step.after}"}
                save_state(paths, state)
                todo = []
                failed = True
                continue
            if self.running:
                first = next(iter(self.running.values()))
                try:
                    first.job.proc.wait(timeout=args.poll)
                except subprocess.TimeoutExpired:
                    pass
            elif todo:
                time.sleep(args.poll)
        if halted:
            self.final_progress(state, "halted")
            return first_failure
        log(paths, "ALLDONE")
        self.final_progress(state, "ALLDONE")
        return 1 if failed else 0

    def final_progress(self, state, message):
        try:
            self.progress.write(state, self.running, push=True, message=message)
            self.progress.wait()
        except OSError as e:
            log(self.paths, f"progress not written: {e}")


def one_line(s):
    """A watched step's progress in one log line."""
    parts = [f"{s['battles']}" + (f"/{s['expected']} ({s['fraction']:.0%})" if s["expected"] else "") + " battles"]
    if s["rate"]:
        parts.append(f"{s['rate']:.0f}/h")
    if s["eta"] is not None:
        parts.append(f"ETA {benchwatch.hours(s['eta'])}")
    parts.append(f"{s['failed']} failed")
    if s["skips"]:
        parts.append(f"skips {sum(s['skips'][-100:]) / len(s['skips'][-100:]):.1f}/battle (last 100)")
    for e in s["arms"]:
        if e["diff"] is not None:
            parts.append(f"{e['arm']} {e['diff'] * (e.get('scale') or 1):+.2f}")
    return ", ".join(parts)


def host_profile(args, home):
    """The host's profile (hostprofile.py) with the run's --workers and --work-dir, if any."""
    try:
        return hostprofile.profile(workers=getattr(args, "workers", None) or os.environ.get("HADUR_BENCH_WORKERS") or None,
                                   work_dir=getattr(args, "work_dir", None), home=home)
    except ValueError as e:
        raise PlanError(str(e))


def read_plan(plan_file, prof, args=None):
    locked = HOST_VARIABLES if (getattr(args, "workers", None) or os.environ.get("HADUR_BENCH_WORKERS")) else ()
    return parse_plan(plan_file.read_text(encoding="utf-8"), hostprofile.plan_variables(prof), locked)


def link_work_dir(home, target):
    """Make home/work a link to `target` when home/work does not exist; never move an existing one.
    Returns a line for the log, or None when there is nothing to say."""
    work, target = home / "work", Path(target).expanduser()
    if work.resolve() == target.resolve():
        return None
    if work.exists() or work.is_symlink():
        raise PlanError(f"work dir {target} was asked for, but {work} already exists and is not a link to it; "
                        "move or link it by hand (nothing was moved)")
    target.mkdir(parents=True, exist_ok=True)
    if IS_WIN:
        r = subprocess.run(["cmd", "/c", "mklink", "/J", str(work), str(target)], capture_output=True, text=True)
        if r.returncode != 0:
            raise PlanError(f"could not link {work} to {target}: {r.stdout.strip()} {r.stderr.strip()}")
    else:
        os.symlink(target, work, target_is_directory=True)
    return f"work dir {work} -> {target}"


def cmd_host(args):
    home = Path(args.home).resolve()
    print(hostprofile.describe(host_profile(args, home)))
    return 0


def cmd_run(args):
    home = Path(args.home).resolve()
    plan_file = resolve_plan(args.plan, home)
    prof = host_profile(args, home)
    steps = read_plan(plan_file, prof, args)
    bind_watches(steps, home)
    paths = Paths(home, plan_file)
    known = {s.name for s in steps}
    for name in args.only + args.skip:
        if name not in known:
            raise PlanError(f"no step named '{name}' in {plan_file.name}")
    if args.concurrency is not None and args.concurrency < 1:
        raise PlanError("--concurrency must be 1 or more")
    if args.dry_run:
        state = load_state(paths)
        for s in steps:
            status = state["steps"].get(s.name, {}).get("status", "pending")
            mark = "skip" if status == TERMINAL_OK or s.name in args.skip or (args.only and s.name not in args.only) else "run "
            extra = (f" [after {s.after}]" if s.after else "") + (f" [timeout {s.timeout:g}s]" if s.timeout else "") + (f" [memory {s.memory:g} GB]" if s.memory else "")
            print(f"{mark} {s.name} ({status}){extra}: {s.command}")
            if s.spec is not None:
                sp = s.spec
                print(f"       watch: {sp.out or 'step log'}" + (f", {sp.battles} battles" if sp.battles else "")
                      + (f", arms {','.join(sp.arm_labels)}" if sp.arm_labels else "")
                      + (f", APS over {sp.panel}/{sp.field}" if sp.field and sp.panel else "")
                      + (", jobs shuffled" if sp.shuffled else ""))
                for r in s.stops:
                    print(f"       stop: {r.text} -> {r.action}")
        print(f"host: {hostprofile.summary(prof)}")
        print(f"dry run: nothing was run (up to {args.concurrency or steps.concurrency} at a time)")
        return 0
    linked = link_work_dir(home, prof["work_dir"]) if prof["work_dir_source"] != "default" else None
    if args.min_free_gb is None:
        args.min_free_gb = prof["min_free_gb"]
    paths.work.mkdir(parents=True, exist_ok=True)
    profile_file = paths.work / f"queue-{paths.plan}.host.json"
    profile_file.write_text(json.dumps(prof, indent=1))
    args.step_env = {**os.environ, **hostprofile.step_environment(prof, profile_file)}
    args.host_lines = ([linked] if linked else []) + [f"host {hostprofile.summary(prof)}"] + \
        [f"host warning: {w}" for w in prof["warnings"]] + fence_bench()
    return Runner(paths, steps, args).run()


def fence_bench():
    """BENCH-145: with FENCE = on in host.local, the runner binds itself, and so every step, to the bench's
    side of the fence (tools/fence.py), leaving the last L3 group to RoboRumble clients."""
    sys.path.insert(0, str(HERE / "tools"))
    import fence
    if not fence.fence_on():
        return []
    try:
        return [fence.fence_role("bench")]
    except (fence.FenceError, OSError) as e:
        raise PlanError(f"FENCE = on but the fence could not be set: {e}")


def cmd_status(args):
    home = Path(args.home).resolve()
    plan_file = resolve_plan(args.plan, home)
    steps = read_plan(plan_file, host_profile(args, home))
    paths = Paths(home, plan_file)
    state = load_state(paths)
    pid = runner_pid(paths)
    print(f"plan {paths.plan}: runner " + (f"running (pid {pid})" if pid else "not running")
          + (f", up to {steps.concurrency} steps at a time" if steps.concurrency > 1 else ""))
    done = running = 0
    for s in steps:
        rec = state["steps"].get(s.name, {})
        status = rec.get("status", "pending")
        if status == "running" and not pid:
            status = "interrupted"
        done += status == TERMINAL_OK
        running += status == "running"
        detail = f"exit={rec['exit']} in {rec['seconds']} s" if "exit" in rec else rec.get("reason", "")
        print(f"  {s.name:<28} {status:<12} {detail}")
    print(f"{done} of {len(steps)} steps done" + (f", {running} running" if running else ""))
    if paths.progress.is_file():
        print()
        print(paths.progress.read_text(encoding="utf-8", errors="replace"))
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
    print(f"stop requested for plan {paths.plan} (pid {pid}); the runner kills every running step's tree within a few seconds")
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
    r.add_argument("--min-free-gb", type=float, default=None,
                   help="pause before a step while free memory is under this (0 disables); default 8, or a fifth of the RAM under 40 GB")
    r.add_argument("--concurrency", type=int, default=None,
                   help="run up to N independent steps side by side (default: the plan's CONCURRENCY, else 1)")
    r.add_argument("--workers", type=int, default=None,
                   help="battle width for every kind, over the plan's and the detected one (default: detected, see hostprofile.py)")
    r.add_argument("--work-dir", default=None, help="put the work folder here (linked from hadur-bench/work when that does not exist yet)")
    r.add_argument("--no-stop-rules", action="store_true", help="show the steps' stop rules without acting on them")
    r.add_argument("--continue-early", action="store_true",
                   help="rerun steps a finish rule stopped early, with their rules shown only")
    r.add_argument("--no-publish", action="store_true", help="write the progress file but push no progress branch")
    r.add_argument("--poll", type=float, default=1.0, help=argparse.SUPPRESS)
    r.add_argument("--watch-seconds", type=float, default=60.0, help=argparse.SUPPRESS)
    r.set_defaults(func=cmd_run)
    h = sub.add_parser("host", help="show what this machine runs: cores, memory, widths, CPU constant, work dir")
    h.add_argument("--workers", type=int, default=None)
    h.add_argument("--work-dir", default=None)
    h.set_defaults(func=cmd_host)
    s = sub.add_parser("status", help="show each step's state")
    s.add_argument("plan")
    s.set_defaults(func=cmd_status)
    t = sub.add_parser("stop", help="ask a running plan to stop and kill its running steps' trees")
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

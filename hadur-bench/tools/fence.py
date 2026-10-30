#!/usr/bin/env python3
"""Fence the bench and the RoboRumble clients onto separate cores (BENCH-145, BENCH-146).

    python3 tools/fence.py show
    python3 tools/fence.py run bench -- COMMAND ...
    python3 tools/fence.py run clients [--priority below] -- COMMAND ...
    python3 tools/fence.py clients rr01:roborumble.bat rr02:roborumble.bat [--root C:/RoboRumbleWorkers]
                                   [--out DIR] [--hours 0] [--restart-minutes 15] [--live]

Leigh, 2026-10-30: "On my high end PC if we containerised robocode would that protect the bench? I'd like
to be able to run rumbles as needed." A container caps how much CPU the clients take but not where it
runs: Docker on Windows is a WSL2 virtual machine whose virtual CPUs float over every host thread, and
the bench is unpinned, so client JVMs still share cores, hyperthread siblings and L3 cache with battle
JVMs. Eight clients beside nothing already starved the PC (PR #356). What does separate them is
processor affinity on both sides, cut along the L3 cache groups (the Threadripper's chiplets):

  - the bench keeps every group but the last (on the PC, 3 chiplets = 18 cores, still 12 workers);
  - the clients get the last group (6 cores, 12 threads) at below-normal priority, so they never touch
    the bench's caches or cores, and if the client side is oversubscribed only the clients slow down.

Every process inherits its parent's affinity and (below normal) priority class, so a fence set on a
launcher holds for every JVM it starts, with no race. Inside a fence the OS still moves threads freely:
this is not BENCH-93's --pin (two processors a battle), which starved Hadur's thread mid-round
(docs/bench/local/2026-10-22_stage0-defect.md).

The split. FENCE_BENCH_CPUS / FENCE_CLIENT_CPUS in hadur-bench/host.local (or HADUR_BENCH_FENCE_BENCH_CPUS
/ HADUR_BENCH_FENCE_CLIENT_CPUS), as CPU lists like 0-35 or 36-47; one alone means the other is the rest.
Without them: the last L3 group goes to the clients when there are two or more, else the last quarter
of the physical cores (whole cores, both threads). `show` prints the topology and the split.

The queue (benchqueue.py) fences itself, and so every card, to the bench side when host.local says
FENCE = on (or HADUR_BENCH_FENCE=on). Without it nothing changes.

`clients` (BENCH-146) is the everyday launcher: it fences itself to the client side at below-normal priority and
runs live_client.py watch over the given clients (console logs, Hadur's stall lines, restarts every 15
minutes between battles). It refuses any client whose config uploads (UPLOAD not NOT) unless --live is
given: live uploads need Leigh's go at the time, and the PC is not qualified (plans/live-watch.queue).

Standard library only; Windows and Linux.
"""
import argparse
import ctypes
import datetime as dt
import os
import re
import subprocess
import sys
from pathlib import Path

HERE = Path(__file__).resolve().parent
BENCH_HOME = HERE.parent
sys.path.insert(0, str(BENCH_HOME))
import hostprofile  # noqa: E402

IS_WIN = os.name == "nt"
ROLES = ("bench", "clients")
BELOW_NORMAL_PRIORITY_CLASS = 0x00004000
LIVE_CLIENT = BENCH_HOME.parent / "data" / "tools" / "live_client.py"


class FenceError(Exception):
    pass


# ---------------------------------------------------------------- CPU lists

def parse_cpus(text):
    """ "0-3,8,10-11" -> [0, 1, 2, 3, 8, 10, 11]."""
    out = set()
    for part in str(text).replace(" ", "").split(","):
        if not part:
            continue
        m = re.fullmatch(r"(\d+)(?:-(\d+))?", part)
        if not m:
            raise FenceError(f"bad CPU list {text!r} (use 0-35 or 0-5,12-17)")
        lo, hi = int(m.group(1)), int(m.group(2) or m.group(1))
        if hi < lo:
            raise FenceError(f"bad CPU range {part!r}")
        out.update(range(lo, hi + 1))
    return sorted(out)


def format_cpus(cpus):
    """[0, 1, 2, 3, 8] -> "0-3,8"."""
    cpus, parts, i = sorted(set(cpus)), [], 0
    while i < len(cpus):
        j = i
        while j + 1 < len(cpus) and cpus[j + 1] == cpus[j] + 1:
            j += 1
        parts.append(str(cpus[i]) if i == j else f"{cpus[i]}-{cpus[j]}")
        i = j + 1
    return ",".join(parts)


def mask_of(cpus):
    if any(c >= 64 for c in cpus):
        raise FenceError("a fence holds processors 0-63 only (one Windows processor group)")
    m = 0
    for c in cpus:
        m |= 1 << c
    return m


def cpus_of_mask(mask, base=0):
    return [base + i for i in range(64) if mask >> i & 1]


# ---------------------------------------------------------------- topology

def _win_records(relation):
    """(GroupMask mask, group) per record of one GetLogicalProcessorInformationEx relation, with the
    record's leading fields: RelationProcessorCore (0) or RelationCache (2, with level and type)."""
    k = ctypes.windll.kernel32
    need = ctypes.c_ulong(0)
    k.GetLogicalProcessorInformationEx(relation, None, ctypes.byref(need))
    if not need.value:
        return []
    buf = ctypes.create_string_buffer(need.value)
    if not k.GetLogicalProcessorInformationEx(relation, buf, ctypes.byref(need)):
        return []
    raw, offset, out = buf.raw, 0, []

    def u(at, n):
        return int.from_bytes(raw[at:at + n], "little")

    while offset + 8 <= need.value:
        rel, size = u(offset, 4), u(offset + 4, 4)
        if size <= 0:
            break
        if rel == relation == 0:
            # PROCESSOR_RELATIONSHIP: Flags, EfficiencyClass, Reserved[20], GroupCount @22, GroupMask @24.
            out.append({"mask": u(offset + 8 + 24, 8), "group": u(offset + 8 + 32, 2)})
        elif rel == relation == 2:
            # CACHE_RELATIONSHIP: Level @0, Type @8, GroupCount @30, GroupMask @32.
            out.append({"level": u(offset + 8, 1), "type": u(offset + 16, 4),
                        "mask": u(offset + 8 + 32, 8), "group": u(offset + 8 + 40, 2)})
        offset += size
    return out


def topology_windows():
    l3 = [r for r in _win_records(2) if r["level"] == 3 and r["type"] == 0]
    cores = _win_records(0)
    groups = sorted({tuple(cpus_of_mask(r["mask"])) for r in l3 if r["group"] == 0 and r["mask"]})
    core_sets = sorted({tuple(cpus_of_mask(r["mask"])) for r in cores if r["group"] == 0 and r["mask"]})
    return {"l3": [list(g) for g in groups], "cores": [list(c) for c in core_sets],
            "groups": len({r["group"] for r in l3 + cores}) or 1, "source": "GetLogicalProcessorInformationEx"}


def topology_linux(root="/sys/devices/system/cpu", allowed=None):
    """L3 groups and cores from sysfs, cut to `allowed` (this process's affinity or container cpuset)."""
    root = Path(root)
    l3, cores = set(), set()
    for cpu in root.glob("cpu[0-9]*"):
        for idx in cpu.glob("cache/index[0-9]*"):
            try:
                if (idx / "level").read_text().strip() == "3":
                    l3.add(tuple(parse_cpus((idx / "shared_cpu_list").read_text().strip())))
            except (OSError, FenceError):
                pass
        try:
            cores.add(tuple(parse_cpus((cpu / "topology" / "thread_siblings_list").read_text().strip())))
        except (OSError, FenceError):
            pass
    if allowed is not None:
        allowed = set(allowed)
        l3 = {tuple(c for c in g if c in allowed) for g in l3}
        cores = {tuple(c for c in g if c in allowed) for g in cores}
    return {"l3": [list(g) for g in sorted(l3) if g], "cores": [list(c) for c in sorted(cores) if c], "source": str(root)}


def topology():
    try:
        topo = topology_windows() if IS_WIN else topology_linux(allowed=os.sched_getaffinity(0))
    except (AttributeError, OSError, ValueError):
        topo = {"l3": [], "cores": [], "source": "unreadable"}
    topo["logical"] = os.cpu_count() or 1
    return topo


# ---------------------------------------------------------------- the split

def setting(name, env, local):
    return env.get(f"HADUR_BENCH_{name}") or local.get(name) or ""


def split(topo, env=None, local=None):
    """{"bench": [...], "clients": [...], "why": text} for this host."""
    env = os.environ if env is None else env
    local = hostprofile.read_local(BENCH_HOME) if local is None else local
    if topo.get("groups", 1) > 1:
        # Affinity masks here hold one processor group (64 processors); a split of group 0 alone would
        # leave the other groups to neither side.
        raise FenceError(f"{topo['groups']} Windows processor groups: the fence handles one (64 processors)")
    every = sorted({c for g in topo["l3"] for c in g} | {c for g in topo["cores"] for c in g}) \
        or list(range(topo.get("logical") or 1))
    bench_set, client_set = setting("FENCE_BENCH_CPUS", env, local), setting("FENCE_CLIENT_CPUS", env, local)
    if bench_set or client_set:
        bench = parse_cpus(bench_set) if bench_set else None
        clients = parse_cpus(client_set) if client_set else None
        if bench is None:
            bench = [c for c in every if c not in clients]
        if clients is None:
            clients = [c for c in every if c not in bench]
        why = "host.local / environment"
    elif len(topo["l3"]) >= 2:
        groups = sorted(topo["l3"], key=min)
        clients = groups[-1]
        bench = sorted(c for g in groups[:-1] for c in g)
        why = f"the last of {len(groups)} L3 cache groups to the clients"
    elif len(topo["cores"]) >= 4:
        cores = sorted(topo["cores"], key=min)
        n = max(1, len(cores) // 4)
        clients = sorted(c for core in cores[-n:] for c in core)
        bench = sorted(c for core in cores[:-n] for c in core)
        why = f"one L3 group: the last {n} of {len(cores)} cores to the clients"
    else:
        raise FenceError("too few cores read to fence (set FENCE_BENCH_CPUS and FENCE_CLIENT_CPUS in host.local)")
    if not bench or not clients:
        raise FenceError(f"a side of the fence is empty (bench {format_cpus(bench)!r}, clients {format_cpus(clients)!r})")
    if set(bench) & set(clients):
        raise FenceError(f"the sides overlap on {format_cpus(set(bench) & set(clients))}")
    return {"bench": sorted(bench), "clients": sorted(clients), "why": why}


def describe(topo, sides):
    cores = {c: i for i, core in enumerate(topo["cores"]) for c in core}

    def n_cores(cpus):
        return len({cores[c] for c in cpus if c in cores}) or "?"

    lines = [f"logical processors {topo['logical']}, read from {topo['source']}",
             f"L3 groups: " + ("; ".join(format_cpus(g) for g in sorted(topo["l3"], key=min)) or "none read"),
             f"bench:   CPUs {format_cpus(sides['bench'])} ({len(sides['bench'])} threads, {n_cores(sides['bench'])} cores)",
             f"clients: CPUs {format_cpus(sides['clients'])} ({len(sides['clients'])} threads, "
             f"{n_cores(sides['clients'])} cores), below-normal priority",
             f"split: {sides['why']}"]
    return lines


# ---------------------------------------------------------------- applying it

def apply(cpus, priority="normal"):
    """Binds this process (and so every child it starts later) to `cpus`; below lowers its priority."""
    if IS_WIN:
        k = ctypes.windll.kernel32
        k.GetCurrentProcess.restype = ctypes.c_void_p
        me = ctypes.c_void_p(k.GetCurrentProcess())
        if not k.SetProcessAffinityMask(me, ctypes.c_size_t(mask_of(cpus))):
            raise FenceError(f"SetProcessAffinityMask({format_cpus(cpus)}) failed: error {k.GetLastError()}")
        if priority == "below" and not k.SetPriorityClass(me, BELOW_NORMAL_PRIORITY_CLASS):
            raise FenceError(f"SetPriorityClass(below normal) failed: error {k.GetLastError()}")
    else:
        os.sched_setaffinity(0, cpus)
        if priority == "below":
            os.nice(5)


def fence_role(role, priority=None, env=None, local=None):
    """Fences this process to `role`'s side; returns the line that says so."""
    sides = split(topology(), env, local)
    priority = priority or ("below" if role == "clients" else "normal")
    apply(sides[role], priority)
    return f"fence: {role} on CPUs {format_cpus(sides[role])} ({sides['why']}), priority {priority}"


def fence_on(env=None, local=None):
    """Whether host.local (FENCE = on) or HADUR_BENCH_FENCE asks the queue to fence the bench."""
    env = os.environ if env is None else env
    local = hostprofile.read_local(BENCH_HOME) if local is None else local
    return (env.get("HADUR_BENCH_FENCE") or local.get("FENCE") or "").strip().lower() in ("on", "yes", "true", "1")


# ---------------------------------------------------------------- the client launcher

def uploads(folder, launcher):
    """The UPLOAD value in the launcher's config (roborumble.bat -> roborumble/roborumble.txt)."""
    stem = os.path.splitext(os.path.basename(launcher))[0].lower()
    path = os.path.join(folder, "roborumble", stem + ".txt")
    try:
        with open(path, encoding="utf-8", errors="replace") as f:
            text = f.read()
    except OSError:
        return path, None
    m = None
    for m in re.finditer(r"(?m)^\s*UPLOAD\s*=\s*(\S*)", text):
        pass
    return path, (m.group(1).upper() if m else "")


def uploading_clients(launches, root):
    out = []
    for spec in launches:
        folder, _, launcher = spec.rpartition(":")
        path, value = uploads(os.path.join(root, folder), launcher)
        if value != "NOT":
            out.append((spec, path, value))
    return out


def cmd_clients(a):
    bad = uploading_clients(a.launch, a.root)
    if bad and not a.live:
        for spec, path, value in bad:
            print(f"{spec}: {path} has UPLOAD={value if value is not None else '(file missing)'}", file=sys.stderr)
        print("refused: these clients would upload live. Set UPLOAD=NOT (tools/qualify_pc.py upload off FOLDER) "
              "or pass --live once Leigh has said to upload.", file=sys.stderr)
        return 2
    print(fence_role("clients"), flush=True)
    out = a.out or str(BENCH_HOME.parent / "data" / "live" / ("fenced-" + dt.datetime.utcnow().strftime("%Y-%m-%dT%H%MZ")))
    cmd = [sys.executable, str(LIVE_CLIENT), "watch", "--root", a.root, "--out", out,
           "--restart-minutes", str(a.restart_minutes), "--hours", str(a.hours)]
    for spec in a.launch:
        cmd += ["--launch", spec]
    for r in a.robot:
        cmd += ["--robot", r]
    print("clients: " + " ".join(a.launch) + f" -> {out}" + (" (LIVE uploads)" if bad else " (uploads off)"), flush=True)
    return subprocess.call(cmd)


def main(argv):
    p = argparse.ArgumentParser(description=__doc__.split("\n\n")[0])
    sub = p.add_subparsers(dest="cmd", required=True)
    sub.add_parser("show")
    r = sub.add_parser("run")
    r.add_argument("role", choices=ROLES)
    r.add_argument("--priority", choices=("normal", "below"))
    r.add_argument("command", nargs=argparse.REMAINDER)
    c = sub.add_parser("clients")
    c.add_argument("launch", nargs="+", help="FOLDER:LAUNCHER under --root, e.g. rr01:roborumble.bat")
    c.add_argument("--root", default="C:/RoboRumbleWorkers")
    c.add_argument("--out")
    c.add_argument("--hours", type=float, default=0.0)
    c.add_argument("--restart-minutes", type=float, default=15.0)
    c.add_argument("--robot", action="append", default=[])
    c.add_argument("--live", action="store_true", help="allow clients whose config uploads (Leigh's go only)")
    a = p.parse_args(argv)
    try:
        if a.cmd == "show":
            topo = topology()
            print("\n".join(describe(topo, split(topo))))
            print(f"queue fence: {'on' if fence_on() else 'off'} (FENCE = on in host.local fences every card)")
            return 0
        if a.cmd == "run":
            command = a.command[1:] if a.command[:1] == ["--"] else a.command
            if not command:
                p.error("run needs a command after --")
            if IS_WIN and command[0] == "bash":
                # Git Bash, never System32's WSL bash: the queue's own choice (QUEUE_SHELL or Git's bin).
                import benchqueue
                command = [benchqueue.find_shell()[0]] + command[1:]
            print(fence_role(a.role, a.priority), flush=True)
            return subprocess.call(command)
        return cmd_clients(a)
    except FenceError as e:
        print(f"fence: {e}", file=sys.stderr)
        return 2


if __name__ == "__main__":
    sys.exit(main(sys.argv[1:]))

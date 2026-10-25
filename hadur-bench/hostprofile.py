#!/usr/bin/env python3
"""What this machine can run (BENCH-105): cores, memory, disk, CPU constant, and the bench widths.

    python3 hostprofile.py                 a summary of the host and the widths it gets
    python3 hostprofile.py --json          the same as JSON
    python3 hostprofile.py --get duel      one value: duel, team, melee, cpu (the --cpu-constant
                                           flag, or nothing), cpu-constant, work, min-free-gb

The queue runner (benchqueue.py) reads this before every plan, so a card written with
--parallel ${WORKERS} runs 12 wide on the PC and narrower on a laptop without an edit.

Widths. One battle worker for every two physical cores. The anchor is the PC (Threadripper PRO
9965WX, 24 cores, 48 threads), where the 2026-10-23 worker ladder (docs/bench/throughput.md,
PR #232) settled on 12 unpinned workers for duel and team: a duel battle JVM uses about 1.25-1.5
cores and a team one about 2, and SMT threads are not whole cores, so 24 / 2 = 12. Below 16
physical cores the machine is also somebody's desktop, so one core (two for melee, which sheds
turns first when the CPU is short) is held back before dividing. The width is also capped so
the battle JVMs fit in 70% of free memory at 2.3 GB each (Bench's own memory check, Memory.java)
on those smaller hosts only: a big host always goes to its full width (Leigh 2026-10-25: "Main PC
should always go max"). It is never below 1. Workers are never pinned.

Overrides, strongest first: the queue's --workers N; the environment (HADUR_BENCH_WORKERS for
every kind, HADUR_BENCH_WORKERS_DUEL / _TEAM / _MELEE for one); the file hadur-bench/host.local
(KEY = VALUE lines: WORKERS, WORKERS_DUEL, WORKERS_TEAM, WORKERS_MELEE, CPU_CONSTANT, WORK_DIR,
MIN_FREE_GB; git ignores it); then the rule above.

CPU constant. HADUR_BENCH_CPU_CONSTANT or CPU_CONSTANT in host.local, else robocode.cpu.constant
from a local Robocode install's config/robocode.properties (ROBOCODE_HOME, C:\\robocode, ~/robocode),
which is how the PC's 1488498 was found (docs/bench/top20-strategy.md). With none, the bench
calibrates once, idle, and shares the value (Bench.pinCpuConstant), as a rumble client on this
machine would. A slower machine needs its own constant: the PC's would give its robots too little
time a turn and inflate skipped turns.

Work directory. HADUR_BENCH_WORK or WORK_DIR in host.local; default hadur-bench/work.

Python 3 standard library only.
"""
import argparse
import ctypes
import json
import os
import platform
import re
import shutil
import socket
import subprocess
import sys
from pathlib import Path

HERE = Path(__file__).resolve().parent
IS_WIN = os.name == "nt"
KINDS = ("duel", "team", "melee")

CORES_PER_WORKER = 2          # PC: 24 physical cores -> 12 workers (PR #232)
BIG_HOST_CORES = 16           # at or above this, no core is held back
RESERVE_SMALL = {"duel": 1, "team": 1, "melee": 2}
WORKER_MB = 2048 + 300        # Memory.perChildMb("2G")
MEMORY_SHARE = 0.70           # Memory.SHARE
LOW_DISK_GB = 20.0


# ---------------------------------------------------------------- detection

def logical_cpus():
    """Logical processors this process may use (affinity and container limits count)."""
    try:
        return len(os.sched_getaffinity(0))
    except (AttributeError, OSError):
        return os.cpu_count() or 1


def physical_cores_linux(cpuinfo_text=None, sysfs=None):
    """Distinct (package, core) pairs from /proc/cpuinfo, else from sysfs topology; None if unknown."""
    text = cpuinfo_text
    if text is None:
        try:
            text = Path("/proc/cpuinfo").read_text(errors="replace")
        except OSError:
            text = ""
    cores, phys, core = set(), None, None
    for line in text.splitlines() + [""]:
        if not line.strip():
            if core is not None:
                cores.add((phys, core))
            phys, core = None, None
            continue
        key, _, value = line.partition(":")
        key = key.strip()
        if key == "physical id":
            phys = value.strip()
        elif key == "core id":
            core = value.strip()
    if cores:
        return len(cores)
    root = Path(sysfs or "/sys/devices/system/cpu")
    sets = set()
    for f in root.glob("cpu[0-9]*/topology/core_cpus_list"):
        try:
            sets.add(f.read_text().strip())
        except OSError:
            pass
    if not sets:
        for f in root.glob("cpu[0-9]*/topology/thread_siblings_list"):
            try:
                sets.add(f.read_text().strip())
            except OSError:
                pass
    return len(sets) or None


def physical_cores_windows():
    """Processor cores over every processor group (GetLogicalProcessorInformationEx), or None."""
    try:
        k = ctypes.windll.kernel32
        need = ctypes.c_ulong(0)
        k.GetLogicalProcessorInformationEx(0, None, ctypes.byref(need))  # RelationProcessorCore
        if not need.value:
            return None
        buf = ctypes.create_string_buffer(need.value)
        if not k.GetLogicalProcessorInformationEx(0, buf, ctypes.byref(need)):
            return None
        count, offset, raw = 0, 0, buf.raw
        while offset + 8 <= need.value:
            relationship = int.from_bytes(raw[offset:offset + 4], "little")
            size = int.from_bytes(raw[offset + 4:offset + 8], "little")
            if size <= 0:
                break
            count += relationship == 0
            offset += size
        return count or None
    except (AttributeError, OSError, ValueError):
        return None


def physical_cores_mac():
    try:
        out = subprocess.run(["sysctl", "-n", "hw.physicalcpu"], capture_output=True, text=True, timeout=5)
        return int(out.stdout.strip()) or None
    except (OSError, ValueError, subprocess.SubprocessError):
        return None


def physical_cores():
    """(cores, how it was found). Unknown is guessed as half the logical processors, the cautious side."""
    if IS_WIN:
        n, how = physical_cores_windows(), "GetLogicalProcessorInformationEx"
    elif sys.platform == "darwin":
        n, how = physical_cores_mac(), "sysctl hw.physicalcpu"
    else:
        n, how = physical_cores_linux(), "/proc/cpuinfo"
    if n:
        return n, how
    return max(1, (os.cpu_count() or 2) // 2), "guessed: half the logical processors"


def memory_gb():
    """(total, available) physical memory in GB; None where it cannot be read."""
    if IS_WIN:
        class MemStatus(ctypes.Structure):
            _fields_ = [("length", ctypes.c_ulong), ("load", ctypes.c_ulong),
                        ("totalPhys", ctypes.c_ulonglong), ("availPhys", ctypes.c_ulonglong),
                        ("totalPage", ctypes.c_ulonglong), ("availPage", ctypes.c_ulonglong),
                        ("totalVirt", ctypes.c_ulonglong), ("availVirt", ctypes.c_ulonglong),
                        ("availExt", ctypes.c_ulonglong)]
        s = MemStatus()
        s.length = ctypes.sizeof(MemStatus)
        try:
            if ctypes.windll.kernel32.GlobalMemoryStatusEx(ctypes.byref(s)):
                return s.totalPhys / 2**30, s.availPhys / 2**30
        except (AttributeError, OSError):
            pass
        return None, None
    total = avail = None
    try:
        with open("/proc/meminfo") as f:
            for line in f:
                if line.startswith("MemTotal:"):
                    total = int(line.split()[1]) / 2**20
                elif line.startswith("MemAvailable:"):
                    avail = int(line.split()[1]) / 2**20
    except OSError:
        pass
    if total is None and sys.platform == "darwin":
        try:
            out = subprocess.run(["sysctl", "-n", "hw.memsize"], capture_output=True, text=True, timeout=5)
            total = int(out.stdout.strip()) / 2**30
        except (OSError, ValueError, subprocess.SubprocessError):
            pass
    return total, avail


def cpu_model():
    if IS_WIN:
        try:
            import winreg
            with winreg.OpenKey(winreg.HKEY_LOCAL_MACHINE, r"HARDWARE\DESCRIPTION\System\CentralProcessor\0") as key:
                return str(winreg.QueryValueEx(key, "ProcessorNameString")[0]).strip()
        except OSError:
            pass
    try:
        with open("/proc/cpuinfo", errors="replace") as f:
            for line in f:
                if line.startswith("model name"):
                    return line.partition(":")[2].strip()
    except OSError:
        pass
    if sys.platform == "darwin":
        try:
            out = subprocess.run(["sysctl", "-n", "machdep.cpu.brand_string"], capture_output=True, text=True, timeout=5)
            if out.stdout.strip():
                return out.stdout.strip()
        except (OSError, subprocess.SubprocessError):
            pass
    return platform.processor() or "unknown CPU"


def disk_free_gb(path):
    p = Path(path)
    while not p.exists() and p != p.parent:
        p = p.parent
    try:
        return shutil.disk_usage(p).free / 2**30
    except OSError:
        return None


def read_local(home=HERE):
    """host.local as a dict of upper-case keys; missing file is empty."""
    values = {}
    try:
        text = (Path(home) / "host.local").read_text(encoding="utf-8-sig")
    except OSError:
        return values
    for raw in text.splitlines():
        line = raw.strip()
        if not line or line.startswith("#") or "=" not in line:
            continue
        key, _, value = line.partition("=")
        values[key.strip().upper()] = value.strip()
    return values


def robocode_cpu_constant(env=None):
    """(nanoseconds, file) from a local Robocode install, or (None, None)."""
    env = os.environ if env is None else env
    roots = [env.get("ROBOCODE_HOME"), r"C:\robocode" if IS_WIN else None, str(Path.home() / "robocode")]
    for root in roots:
        if not root:
            continue
        props = Path(root) / "config" / "robocode.properties"
        try:
            for line in props.read_text(encoding="latin-1").splitlines():
                m = re.match(r"\s*robocode\.cpu\.constant\s*=\s*(\d+)", line)
                if m:
                    return int(m.group(1)), str(props)
        except OSError:
            continue
    return None, None


# ---------------------------------------------------------------- the rule

def auto_workers(kind, physical, avail_gb):
    """The width for one kind of battle on a host with `physical` cores and `avail_gb` free."""
    reserve = 0 if physical >= BIG_HOST_CORES else RESERVE_SMALL[kind]
    by_cpu = max(1, (physical - reserve) // CORES_PER_WORKER)
    why = f"{physical} physical cores" + (f" less {reserve} held back" if reserve else "") + f", / {CORES_PER_WORKER}"
    if avail_gb is None or physical >= BIG_HOST_CORES:
        # A big host always runs its full width (Leigh 2026-10-25: "Main PC should always go max");
        # Bench's own memory check still guards it.
        return by_cpu, why
    by_mem = max(1, int(avail_gb * 1024 * MEMORY_SHARE) // WORKER_MB)
    if by_mem < by_cpu:
        return by_mem, why + f" = {by_cpu}, capped to {by_mem} by {avail_gb:.1f} GB free memory"
    return by_cpu, why


def _positive_int(value, what):
    try:
        n = int(str(value).strip())
    except ValueError:
        raise ValueError(f"{what} must be a whole number of 1 or more, not '{value}'")
    if n < 1:
        raise ValueError(f"{what} must be a whole number of 1 or more, not '{value}'")
    return n


def resolve(detected, env=None, local=None, workers=None, work_dir=None, home=HERE):
    """The profile: what was detected plus the widths, CPU constant and work dir, each with its source."""
    env = os.environ if env is None else env
    local = read_local(home) if local is None else local
    prof = dict(detected)
    prof["workers"], prof["workers_source"] = {}, {}
    for kind in KINDS:
        key = f"WORKERS_{kind.upper()}"
        if workers is not None:
            n, src = _positive_int(workers, "--workers"), "--workers"
        elif env.get("HADUR_BENCH_" + key):
            n, src = _positive_int(env["HADUR_BENCH_" + key], "HADUR_BENCH_" + key), "HADUR_BENCH_" + key
        elif env.get("HADUR_BENCH_WORKERS"):
            n, src = _positive_int(env["HADUR_BENCH_WORKERS"], "HADUR_BENCH_WORKERS"), "HADUR_BENCH_WORKERS"
        elif local.get(key):
            n, src = _positive_int(local[key], f"host.local {key}"), f"host.local {key}"
        elif local.get("WORKERS"):
            n, src = _positive_int(local["WORKERS"], "host.local WORKERS"), "host.local WORKERS"
        else:
            n, why = auto_workers(kind, detected["physical"], detected.get("ram_free_gb"))
            src = "auto: " + why
        prof["workers"][kind], prof["workers_source"][kind] = n, src
    if env.get("HADUR_BENCH_CPU_CONSTANT"):
        cc, cc_src = _positive_int(env["HADUR_BENCH_CPU_CONSTANT"], "HADUR_BENCH_CPU_CONSTANT"), "HADUR_BENCH_CPU_CONSTANT"
    elif local.get("CPU_CONSTANT"):
        cc, cc_src = _positive_int(local["CPU_CONSTANT"], "host.local CPU_CONSTANT"), "host.local CPU_CONSTANT"
    elif detected.get("robocode_cpu_constant"):
        cc, cc_src = detected["robocode_cpu_constant"], detected["robocode_properties"]
    else:
        cc, cc_src = None, "none: the bench calibrates once, idle, and shares it"
    prof["cpu_constant"], prof["cpu_constant_source"] = cc, cc_src
    wd = work_dir or env.get("HADUR_BENCH_WORK") or local.get("WORK_DIR")
    prof["work_dir"] = str(Path(wd).expanduser()) if wd else str(Path(home) / "work")
    prof["work_dir_source"] = ("--work-dir" if work_dir else "HADUR_BENCH_WORK" if env.get("HADUR_BENCH_WORK")
                               else "host.local WORK_DIR" if local.get("WORK_DIR") else "default")
    total = detected.get("ram_total_gb")
    if local.get("MIN_FREE_GB"):
        prof["min_free_gb"] = float(local["MIN_FREE_GB"])
    else:
        # 8 GB as before on any machine of 40 GB or more; a fifth of the memory on a smaller one.
        prof["min_free_gb"] = 8.0 if not total else round(min(8.0, total * 0.2), 1)
    prof["disk_free_gb"] = disk_free_gb(prof["work_dir"])
    prof["warnings"] = warnings(prof)
    return prof


def warnings(prof):
    out = []
    if prof["physical_source"].startswith("guessed"):
        out.append("physical cores could not be read, guessed as half the logical processors")
    if prof.get("disk_free_gb") is not None and prof["disk_free_gb"] < LOW_DISK_GB:
        out.append(f"only {prof['disk_free_gb']:.0f} GB free on the work disk; a census writes several GB "
                   "(HADUR_BENCH_WORK or WORK_DIR in host.local moves it)")
    if prof.get("on_battery"):
        out.append("running on battery: plug in, a throttled CPU skips turns")
    return out


def on_battery():
    """True on battery power, False on mains, None when unknown."""
    if IS_WIN:
        class Power(ctypes.Structure):
            _fields_ = [("ac", ctypes.c_ubyte), ("flag", ctypes.c_ubyte), ("pct", ctypes.c_ubyte),
                        ("saver", ctypes.c_ubyte), ("life", ctypes.c_ulong), ("full", ctypes.c_ulong)]
        p = Power()
        try:
            if ctypes.windll.kernel32.GetSystemPowerStatus(ctypes.byref(p)):
                return {0: True, 1: False}.get(p.ac)
        except (AttributeError, OSError):
            pass
        return None
    supplies = list(Path("/sys/class/power_supply").glob("*/online"))
    for f in supplies:
        try:
            if (f.parent / "type").read_text().strip() == "Mains":
                return f.read_text().strip() == "0"
        except OSError:
            pass
    return None


def detect():
    physical, how = physical_cores()
    total, avail = memory_gb()
    cc, props = robocode_cpu_constant()
    return {
        "host": socket.gethostname(),
        "os": f"{platform.system()} {platform.release()}",
        "cpu": cpu_model(),
        "logical": logical_cpus(),
        "physical": physical,
        "physical_source": how,
        "ram_total_gb": round(total, 1) if total else None,
        "ram_free_gb": round(avail, 1) if avail else None,
        "robocode_cpu_constant": cc,
        "robocode_properties": props,
        "on_battery": on_battery(),
    }


def profile(env=None, workers=None, work_dir=None, home=HERE):
    return resolve(detect(), env=env, workers=workers, work_dir=work_dir, home=home)


def summary(prof):
    """One line for logs and conditions.json."""
    w = prof["workers"]
    auto = all(s.startswith("auto") for s in prof["workers_source"].values())
    ram = f"{prof['ram_total_gb']:g} GB RAM" if prof.get("ram_total_gb") else "RAM unknown"
    cc = prof["cpu_constant"] if prof["cpu_constant"] else "calibrated"
    return (f"{prof['host']}: {prof['cpu']}, {prof['physical']} cores / {prof['logical']} threads, {ram}; "
            f"workers duel {w['duel']} team {w['team']} melee {w['melee']} ({'auto' if auto else 'override'}); "
            f"cpu constant {cc}; work {prof['work_dir']}")


def cpu_flag(prof):
    return f"--cpu-constant {prof['cpu_constant']}" if prof.get("cpu_constant") else ""


def plan_variables(prof):
    """The variables a queue plan may use: ${WORKERS} (duel), ${TEAM_WORKERS}, ${MELEE_WORKERS}, ${CPU}."""
    return {"WORKERS": str(prof["workers"]["duel"]), "DUEL_WORKERS": str(prof["workers"]["duel"]),
            "TEAM_WORKERS": str(prof["workers"]["team"]), "MELEE_WORKERS": str(prof["workers"]["melee"]),
            "CPU": cpu_flag(prof)}


def step_environment(prof, profile_path=None):
    """What every queue step's process gets, so Bench's --parallel auto and --cpu-constant auto agree."""
    env = {f"HADUR_BENCH_WORKERS_{k.upper()}": str(prof["workers"][k]) for k in KINDS}
    env["HADUR_BENCH_CPU_CONSTANT"] = str(prof["cpu_constant"] or "")
    env["HADUR_BENCH_HOST"] = summary(prof)
    if profile_path:
        env["HADUR_BENCH_HOST_PROFILE"] = str(profile_path)
    return env


def describe(prof):
    lines = [f"host        {prof['host']} ({prof['os']})",
             f"cpu         {prof['cpu']}",
             f"cores       {prof['physical']} physical ({prof['physical_source']}), {prof['logical']} logical usable",
             f"memory      {prof['ram_total_gb']} GB total, {prof['ram_free_gb']} GB free",
             f"work dir    {prof['work_dir']} ({prof['work_dir_source']})"
             + (f", {prof['disk_free_gb']:.0f} GB free" if prof.get("disk_free_gb") is not None else "")]
    for kind in KINDS:
        lines.append(f"{kind:<11} {prof['workers'][kind]} workers ({prof['workers_source'][kind]})")
    lines.append(f"cpu const   {prof['cpu_constant'] or '-'} ({prof['cpu_constant_source']})")
    lines.append(f"queue       pauses a step while free memory is under {prof['min_free_gb']:g} GB")
    for w in prof["warnings"]:
        lines.append(f"WARNING     {w}")
    return "\n".join(lines)


def main(argv=None):
    p = argparse.ArgumentParser(prog="hostprofile.py", description=__doc__.split("\n\n")[0])
    p.add_argument("--json", action="store_true")
    p.add_argument("--get", choices=["duel", "team", "melee", "cpu", "cpu-constant", "work", "min-free-gb", "summary"])
    p.add_argument("--workers", help="width for every kind (overrides everything)")
    p.add_argument("--work-dir")
    args = p.parse_args(argv)
    try:
        prof = profile(workers=args.workers, work_dir=args.work_dir)
    except ValueError as e:
        print(f"hostprofile.py: {e}", file=sys.stderr)
        return 2
    if args.get:
        value = {"cpu": cpu_flag(prof), "cpu-constant": prof["cpu_constant"] or "", "work": prof["work_dir"],
                 "min-free-gb": prof["min_free_gb"], "summary": summary(prof)}.get(args.get)
        print(prof["workers"][args.get] if args.get in KINDS else value)
    elif args.json:
        print(json.dumps(prof, indent=1))
    else:
        print(describe(prof))
    return 0


if __name__ == "__main__":
    sys.exit(main())

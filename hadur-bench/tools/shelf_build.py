#!/usr/bin/env python3
"""BENCH-180: build the confirm jar of a menu screen's per-robot picks (pc-shelf).

    python3 tools/shelf_build.py --version 3.21 --work work/shelf --panel P1.txt [P2.txt ...]
            --panel-out work/panel-shelf-picks.txt PICK.tsv [PICK.tsv ...] [--dry-run]

Each pick TSV (mode_table.py --out-tsv) names one arm per robot. The picks are split by arm into one
list per switch, and one build-ablation.sh call turns every switch on for its own robots only, so a
single jar (arm sh) plays every robot with the switch the screen picked for it. Writes
WORK/shelf.arms (c, aa, sh) and PANEL-OUT (the picked robots' panel lines, in panel order).

With no pick it removes WORK/shelf.arms and PANEL-OUT and exits 0, so the confirm and gate pass
through. Standard library only.
"""
import argparse
import os
import subprocess
import sys
from pathlib import Path

# arm -> (build-ablation.sh ablation, the env var naming its list file, jar suffix)
SWITCHES = {
    "mt": ("slistadd", "SHIELD_ADD", "mt"),
    "md": ("slistdrop", "SHIELD_DROP", "md"),
    "wl": ("sgolist", "STOP_GO", "wl"),
    "hl": ("hjlist", "HEAT_JIT", "hl"),
    "gl": ("gslist", "GUN_STACK", "gl"),
    "zl": ("szlist", "SHIELD_STILL", "zl"),
    "x0": ("sx0list", "SHIELD_EXIT0", "x0"),
    "x4": ("sx4list", "SHIELD_EXIT4", "x4"),
    "mv": ("smovelist", "SHIELD_MOVE", "mv"),
}


def picks(paths):
    """{arm: [robot, ...]} over the pick TSVs, first pick of a robot wins."""
    seen, out = set(), {}
    for p in paths:
        for line in open(p, encoding="utf-8"):
            if not line.strip() or line.startswith("#"):
                continue
            f = line.rstrip("\n").split("\t")
            name, arm = f[0].strip(), f[1].strip()
            if arm not in SWITCHES:
                raise SystemExit(f"shelf_build: arm {arm!r} of {p} has no switch")
            if name in seen:
                continue
            seen.add(name)
            out.setdefault(arm, []).append(name)
    return out


def plan(chosen, version):
    """(ablations, env, suffix) for one build-ablation.sh call, in SWITCHES order."""
    # The aa copy first: the confirm jar's version (3.21aa...) never equals a screen jar's (3.21wl), so a
    # one-switch pick set cannot overwrite the jar a resumed screen still fights with.
    ablations, env, suffix = ["aa"], {}, "aa"
    for arm, (ablation, var, sfx) in SWITCHES.items():
        if arm in chosen:
            ablations.append(ablation)
            env[var] = arm
            suffix += sfx
    return ablations, env, f"{version}{suffix}"


def main(argv=None):
    p = argparse.ArgumentParser()
    p.add_argument("picks", nargs="+")
    p.add_argument("--version", required=True)
    p.add_argument("--work", required=True)
    p.add_argument("--panel", nargs="+", required=True)
    p.add_argument("--panel-out", required=True)
    p.add_argument("--dry-run", action="store_true")
    a = p.parse_args(argv)
    work, panel_out = Path(a.work), Path(a.panel_out)
    work.mkdir(parents=True, exist_ok=True)
    arms_file = work / "shelf.arms"
    chosen = picks([x for x in a.picks if Path(x).is_file() and Path(x).stat().st_size > 0])
    if not chosen:
        arms_file.unlink(missing_ok=True)
        panel_out.unlink(missing_ok=True)
        print("shelf_build: no picks; confirm and gate pass through")
        return 0
    names = {n for v in chosen.values() for n in v}
    rows = []
    for panel in a.panel:
        rows += [l for l in open(panel, encoding="utf-8")
                 if not l.startswith("#") and l.split("|")[0].strip() in names]
    panel_out.write_text("".join(rows), encoding="utf-8")
    ablations, env, version = plan(chosen, a.version)
    for arm, robots in chosen.items():
        f = work / f"{arm}.list"
        f.write_text("".join(n + "\n" for n in robots), encoding="utf-8")
    env = {var: str((work / f"{arm}.list").resolve()) for var, arm in env.items()}
    for arm, robots in chosen.items():
        print(f"{arm}: {len(robots)} robot(s): {', '.join(robots)}")
    jar = f"bisect/hadur117.Hadur_{version}.jar"
    arms_file.write_text(
        "# pc-shelf confirm (BENCH-180): c master, aa its A/A copy, sh every pick's switch on for its robot only.\n"
        f"c | hadur117.Hadur {a.version} | bisect/hadur117.Hadur_{a.version}.jar\n"
        f"aa | hadur117.Hadur {a.version}aa | bisect/hadur117.Hadur_{a.version}aa.jar\n"
        f"sh | hadur117.Hadur {version} | {jar}\n", encoding="utf-8")
    cmd = ["bash", "./build-ablation.sh", ",".join(ablations)]
    print(" ".join(f"{k}={v}" for k, v in env.items()), " ".join(cmd))
    if a.dry_run:
        return 0
    r = subprocess.run(cmd, env={**os.environ, **env})
    if r.returncode != 0 or not Path(jar).is_file():
        print(f"shelf_build: build failed or {jar} missing", file=sys.stderr)
        return 1
    return 0


if __name__ == "__main__":
    sys.exit(main())

#!/usr/bin/env python3
"""Rebuild a multi-arm run's arms.tsv from its battles' own rows when the bench step never finished.

    python3 tools/arms_from_battles.py WORK [--force]

The bench writes WORK/arms.tsv only when every job has run (Bench.java: the header and the sorted
battle rows). A step halted by a stop rule, or stuck on a robot that never ends a battle, leaves the
kept battles' rows in WORK/battles/*/arm-row.tsv and no arms.tsv, so the readers that need it cannot
run. This writes the same file from those rows: the same header, one row per battle, sorted as the
bench sorts them. An existing arms.tsv is left alone unless --force.
"""
import argparse
import os
import sys

HEADER = "\t".join(["arm", "robot", "opponent", "role", "seed", "worker", "position", "ok", "rounds", "score",
                    "theirScore", "score_share", "survival_share", "bullet_share", "firsts", "survival",
                    "theirSurvival", "bulletDamage", "theirBulletDamage", "skippedTurns", "turnMaxMs",
                    "engineDisables", "duressTicks", "hostCpuMean", "errors"])


def rows(work):
    """The kept battles' rows, sorted as the bench sorts them, and the battle folders left out: those with no
    row (a battle that never ended) and those whose row is cut short (a bench killed while writing it)."""
    out, missing, malformed = [], [], []
    width = len(HEADER.split("\t"))
    battles = os.path.join(work, "battles")
    for name in sorted(os.listdir(battles)):
        if not os.path.isdir(os.path.join(battles, name)):
            continue
        path = os.path.join(battles, name, "arm-row.tsv")
        if not os.path.isfile(path):
            missing.append(name)
            continue
        with open(path, encoding="utf-8") as f:
            line = f.readline().rstrip("\r\n")
        if len(line.split("\t")) != width:
            malformed.append(name)
            continue
        out.append(line)
    return sorted(out), missing, malformed


def main(argv=None):
    ap = argparse.ArgumentParser()
    ap.add_argument("work")
    ap.add_argument("--force", action="store_true", help="rebuild even when arms.tsv exists (a partial run read again)")
    ap.add_argument("--report", help="write a short Markdown note of the battles kept and left out")
    a = ap.parse_args(argv)
    target = os.path.join(a.work, "arms.tsv")
    if os.path.exists(target) and not a.force:
        print("arms_from_battles: %s exists, left as it is" % target)
        return 0
    found, missing, malformed = rows(a.work)
    if not found:
        print("arms_from_battles: no battle rows under %s/battles" % a.work, file=sys.stderr)
        return 2
    tmp = target + ".tmp"
    with open(tmp, "w", encoding="utf-8", newline="\n") as f:
        f.write(HEADER + "\n" + "\n".join(found) + "\n")
    os.replace(tmp, target)
    print("arms_from_battles: wrote %s from %d battle rows; %d folders without a row, %d cut short"
          % (target, len(found), len(missing), len(malformed)))
    for name in missing + malformed:
        print("  left out: " + name)
    if a.report:
        with open(a.report, "w", encoding="utf-8", newline="\n") as f:
            f.write("# Battles kept for the read\n\n`%s/arms.tsv` was rebuilt from the battles' own rows "
                    "(tools/arms_from_battles.py): %d battles kept.\n\n" % (a.work, len(found)))
            f.write("Left out, with no row (the battle never ended): %s.\n\n" % (", ".join(missing) or "none"))
            f.write("Left out, row cut short: %s.\n" % (", ".join(malformed) or "none"))
    return 0


if __name__ == "__main__":
    sys.exit(main())

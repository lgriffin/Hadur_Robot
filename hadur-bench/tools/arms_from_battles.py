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
    out = []
    battles = os.path.join(work, "battles")
    for name in sorted(os.listdir(battles)):
        path = os.path.join(battles, name, "arm-row.tsv")
        if not os.path.isfile(path):
            continue
        with open(path, encoding="utf-8") as f:
            line = f.readline().rstrip("\r\n")
        if line:
            out.append(line)
    return sorted(out)


def main(argv=None):
    ap = argparse.ArgumentParser()
    ap.add_argument("work")
    ap.add_argument("--force", action="store_true")
    a = ap.parse_args(argv)
    target = os.path.join(a.work, "arms.tsv")
    if os.path.exists(target) and not a.force:
        print("arms_from_battles: %s exists, left as it is" % target)
        return 0
    found = rows(a.work)
    if not found:
        print("arms_from_battles: no battle rows under %s/battles" % a.work, file=sys.stderr)
        return 2
    with open(target, "w", encoding="utf-8", newline="\n") as f:
        f.write(HEADER + "\n" + "\n".join(found) + "\n")
    print("arms_from_battles: wrote %s from %d battle rows" % (target, len(found)))
    return 0


if __name__ == "__main__":
    sys.exit(main())

#!/usr/bin/env python3
"""Every robot's firepower in a melee bench work directory (the melee gap read, 3.13).

hadur-bench's MeleeHarvester writes `bullets.csv` in each melee battle directory: one row per
fighter per round with its shots, their summed power, hits on a robot, the damage those did,
shots lost to another bullet, and the same four counted only for shots fired while five or
more fighters were alive (the "crowd"). This script pools those rows per robot and build:

  python3 data/tools/melee_firepower.py --work WORKDIR [--out FILE.tsv]

Hadur's rows carry the build's version in the robot name, so a paired run (candidate and
baseline) gives one row per build; opponents pool over both. A cut-off last row (a battle
still running) is skipped, as is any battle directory without the melee.csv a completed battle
writes. Columns: robot, battles, shots per round,
mean power, hit rate (hits / shots), damage per round, mean power and hit rate in the crowd,
crowd damage per round, the share of shots lost to bullets, shots per 100 ticks alive, and
the share of ticks alive the gun sat cool and unfired (ready_idle; nan for older files).
"""
import argparse
import csv
import os
import sys
from collections import defaultdict

FIELDS = ["shots", "power", "hits", "damage", "bulletHits",
          "crowdShots", "crowdPower", "crowdHits", "crowdDamage"]
# Written since the ready-tick count; older files leave them out.
TICKS = ["aliveTicks", "readyTicks"]


def battle_dirs(work):
    # melee.csv (the final standings) is written only when a battle completes, so a failed
    # or still-running battle's partial bullets.csv is left out.
    for root, _dirs, files in os.walk(work):
        if "bullets.csv" in files and "melee.csv" in files:
            yield root


def pool(work):
    """{robot: {"battles": n, "rounds": n, field: sum}} over every bullets.csv under work."""
    out = defaultdict(lambda: defaultdict(float))
    for d in battle_dirs(work):
        seen = set()
        rounds = set()
        with open(os.path.join(d, "bullets.csv"), newline="") as f:
            for row in csv.DictReader(f):
                if any(row.get(k) in (None, "") for k in FIELDS):
                    continue  # a battle still running: the last row may be cut off
                robot = row["robot"]
                t = out[robot]
                for k in FIELDS:
                    t[k] += float(row[k])
                if all(row.get(k) not in (None, "") for k in TICKS):
                    # Tick rates divide only the shots of rows that carry ticks, so a work
                    # directory mixing old and new files keeps numerator and denominator alike.
                    for k in TICKS:
                        t[k] += float(row[k])
                    t["tickShots"] += float(row["shots"])
                rounds.add((robot, row["round"]))
                seen.add(robot)
        for robot in seen:
            out[robot]["battles"] += 1
        for robot, _r in rounds:
            out[robot]["rounds"] += 1
    return out


def ratio(a, b):
    return a / b if b else float("nan")


def rows(pooled):
    table = []
    for robot, t in pooled.items():
        r = t["rounds"]
        table.append({
            "robot": robot,
            "battles": int(t["battles"]),
            "shots_per_round": ratio(t["shots"], r),
            "mean_power": ratio(t["power"], t["shots"]),
            "hit_rate": ratio(t["hits"], t["shots"]),
            "damage_per_round": ratio(t["damage"], r),
            "crowd_power": ratio(t["crowdPower"], t["crowdShots"]),
            "crowd_hit_rate": ratio(t["crowdHits"], t["crowdShots"]),
            "crowd_damage_per_round": ratio(t["crowdDamage"], r),
            "lost_to_bullets": ratio(t["bulletHits"], t["shots"]),
            "shots_per_100_ticks": 100 * ratio(t["tickShots"], t["aliveTicks"]),
            "ready_idle": ratio(t["readyTicks"], t["aliveTicks"]),
        })
    table.sort(key=lambda x: -x["damage_per_round"])
    return table


def main(argv=None):
    ap = argparse.ArgumentParser(description=__doc__.splitlines()[0])
    ap.add_argument("--work", required=True, help="bench work directory (searched recursively)")
    ap.add_argument("--out", help="also write the table as TSV here")
    args = ap.parse_args(argv)
    table = rows(pool(args.work))
    if not table:
        print("no bullets.csv under " + args.work, file=sys.stderr)
        return 1
    cols = list(table[0].keys())
    print("| " + " | ".join(cols) + " |")
    print("|" + "---|" * len(cols))
    for t in table:
        print("| " + " | ".join(t[c] if isinstance(t[c], str) else
                                 (str(t[c]) if isinstance(t[c], int) else f"{t[c]:.3f}")
                                 for c in cols) + " |")
    if args.out:
        with open(args.out, "w", newline="") as f:
            w = csv.DictWriter(f, fieldnames=cols, delimiter="\t")
            w.writeheader()
            for t in table:
                w.writerow(t)
    return 0


if __name__ == "__main__":
    sys.exit(main())

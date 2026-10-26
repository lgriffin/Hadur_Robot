#!/usr/bin/env python3
"""BENCH-116: where melee robots take their crowd damage (docs/plan-melee-move.md, step M0).

  python3 tools/melee_exposure.py WORK [WORK ...] --census SUITE --out REPORT.md

Reads every battle's exposure.csv (MeleeHarvester) under the WORK runs and writes, for Hadur and
for the census opponents by rank band, per 100 ticks alive in the crowd (three or more fighters
alive): the bullet damage taken, the share of it fired by a shooter whose nearest living fighter
the victim was when the shot was first seen, the share whose second nearest it was, and the mean
number of other fighters whose nearest the robot was. A robot that takes most of its damage as
somebody's nearest loses it to its place in the crowd; one that takes it from further off loses it
to shots meant for it.

Standard library only.
"""

import argparse
import os
import re
import sys
from collections import defaultdict

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import melee_s0 as ms  # noqa: E402

GROUPS = (("1-10", 1, 10), ("11-30", 11, 30), ("31-100", 31, 100), ("101+", 101, None))


def base_name(name):
    """The robot's name without the engine's " (n)" copy marker."""
    return re.sub(r" \(\d+\)$", "", name.strip())


def group_of(name, ranks):
    if ms.is_hadur(name):
        return "Hadur"
    r = ranks.get(base_name(name))
    if r is None:
        return None
    for label, lo, hi in GROUPS:
        if r >= lo and (hi is None or r <= hi):
            return label
    return None


def tally(works, ranks):
    """{group: [crowd ticks, nearest load, taken, taken as nearest, taken as second, robot-rounds]}."""
    t = defaultdict(lambda: [0.0] * 6)
    for work in works:
        for root, _dirs, files in os.walk(work):
            if "exposure.csv" not in files:
                continue
            for row in ms.read_csv(os.path.join(root, "exposure.csv")):
                g = group_of(row["robot"], ranks)
                if g is None:
                    continue
                x = t[g]
                x[0] += float(row["crowdTicks"])
                x[1] += float(row["nearestLoad"])
                x[2] += float(row["takenCrowd"])
                x[3] += float(row["takenNearest"])
                x[4] += float(row["takenSecond"])
                x[5] += 1
    return t


def render(t, title):
    out = ["# %s" % title, "",
           "Per robot, over its ticks alive with three or more fighters alive (BENCH-116). Damage is bullet damage taken,",
           "capped at the victim's energy. \"As nearest\": the shooter's nearest living fighter was the victim when the",
           "shot was first seen. Nearest of: the mean number of other fighters whose nearest it was.", "",
           "| Robots | Robot-rounds | Crowd ticks a round | Damage taken per 100 crowd ticks | As nearest | As second | Other | Nearest of |",
           "|---|---|---|---|---|---|---|---|"]
    for g in ["Hadur"] + [label for label, _, _ in GROUPS]:
        if g not in t:
            continue
        ticks, load, taken, near, second, n = t[g]
        if ticks <= 0:
            continue
        def share(v):
            return "%.0f%%" % (100.0 * v / taken) if taken else "-"
        out.append("| %s | %d | %.0f | %.1f | %s | %s | %s | %.2f |" % (
            g, n, ticks / n, 100.0 * taken / ticks, share(near), share(second), share(taken - near - second),
            load / ticks))
    return "\n".join(out) + "\n"


def main(argv=None):
    ap = argparse.ArgumentParser(description=__doc__.split("\n")[0])
    ap.add_argument("work", nargs="+")
    ap.add_argument("--census", required=True)
    ap.add_argument("--out", required=True)
    ap.add_argument("--title", default="Melee crowd exposure")
    a = ap.parse_args(argv)
    t = tally(a.work, ms.census_ranks(a.census))
    if "Hadur" not in t:
        print("no exposure.csv with Hadur under %s" % ", ".join(a.work), file=sys.stderr)
        return 1
    ms.write(a.out, render(t, a.title))
    print(render(t, a.title))
    return 0


if __name__ == "__main__":
    sys.exit(main())

#!/usr/bin/env python3
"""Where do Hadur's skipped turns land? Reads hadur.log files (round,turn,line) and, per
battle, classifies each engine "skipped turn" line by its position in the round:
  start   : turn <= 10 of the round (battle start / round start work)
  mid     : after that and before the round's R record (the round is still being fought)
  decided : at or after the R record's tick (the round is decided; these cost no score)
  nextR0  : skips in round 0 before the first R record, split out as 'start' when <= 10
Usage: skips.py DIR...   (each DIR holds one or more */hadur.log)
"""
import sys, re, glob, os
from collections import Counter


def classify(path):
    r_tick = {}
    skips = []
    for line in open(path, errors="replace"):
        parts = line.rstrip("\n").split(",", 2)
        if len(parts) < 3:
            continue
        try:
            rnd, turn = int(parts[0]), int(parts[1])
        except ValueError:
            continue
        body = parts[2]
        if body.startswith("R,"):
            f = body.split(",")
            r_tick.setdefault(rnd, int(f[2]))
        elif body.startswith("SYSTEM:") and "skipped turn" in body:
            m = re.search(r"skipped turn (\d+)", body)
            skips.append((rnd, int(m.group(1))))
    c = Counter()
    for rnd, t in skips:
        end = r_tick.get(rnd)
        if t <= 10:
            c["start"] += 1
        elif end is not None and t >= end:
            c["decided"] += 1
        else:
            c["mid"] += 1
    return c, len(skips)


def main():
    total = Counter()
    rows = []
    for d in sys.argv[1:]:
        for log in sorted(glob.glob(os.path.join(d, "**", "hadur.log"), recursive=True)):
            c, n = classify(log)
            total.update(c)
            rows.append((os.path.relpath(log, d), n, c))
    for name, n, c in rows:
        print(f"{n:4d}  start {c['start']:3d}  mid {c['mid']:3d}  decided {c['decided']:3d}  {name}")
    n = sum(total.values())
    print(f"TOTAL {n}: start {total['start']} mid {total['mid']} decided {total['decided']}")


if __name__ == "__main__":
    main()

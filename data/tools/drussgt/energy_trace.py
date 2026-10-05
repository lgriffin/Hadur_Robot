#!/usr/bin/env python3
"""Mean energy of both robots by tick, over every round of a run.

A round that has ended carries its final energies forward, so every tick averages all rounds.

    energy_trace.py <run>     a run is `label=dir[,dir...]` or one `battles` directory
"""
import collections
import gzip
import os
import statistics
import sys

import runs


def trace(battles_dirs, step=200, maxt=4000):
    """(ticks, Hadur's energies by tick, the opponent's, rounds still running by tick, rounds)."""
    pts = list(range(0, maxt + 1, step))
    H = collections.defaultdict(list)
    D = collections.defaultdict(list)
    alive = collections.Counter()
    n = 0

    def flush(rows):
        nonlocal n
        if not rows:
            return
        n += 1
        for t in pts:
            i = min(t, len(rows) - 1)
            H[t].append(rows[i][0])
            D[t].append(rows[i][1])
            if t < len(rows):
                alive[t] += 1

    for d in runs.battles(battles_dirs):
        cur = None
        rows = []
        with gzip.open(os.path.join(d, 'truth.log.gz'), 'rt') as fh:
            for line in fh:
                if line.startswith('T,'):
                    p = line.split(',', 13)
                    r = int(p[1])
                    if r != cur:
                        flush(rows)
                        rows = []
                        cur = r
                    rows.append((float(p[7]), float(p[12])))
        flush(rows)
    return pts, H, D, alive, n


if __name__ == '__main__':
    if len(sys.argv) != 2:
        sys.exit(__doc__)
    pts, H, D, alive, n = trace(runs.parse(sys.argv[1])[1])
    print('rounds', n)
    for t in pts:
        print('%5d  H %6.2f  D %6.2f  lead %+6.2f  rounds still running %3d' % (
            t, statistics.mean(H[t]), statistics.mean(D[t]), statistics.mean(H[t]) - statistics.mean(D[t]), alive[t]))

#!/usr/bin/env python3
"""How rounds end: a clean win, a loss, or both robots at zero energy on the same turn.

For the double kills it also says how often Hadur had the higher energy on the last turn
either was alive, and how often DrussGT was by then too low to fire (0.15 or less).

    endings.py <run> [<run> ...]      a run is `label=dir[,dir...]` or one `battles` directory
"""
import collections
import gzip
import os
import sys

import runs


def endings(battles_dirs):
    tot = collections.Counter()
    for d in runs.battles(battles_dirs):
        last = {}
        prev = {}
        with gzip.open(os.path.join(d, 'truth.log.gz'), 'rt') as f:
            for line in f:
                if line.startswith('T,'):
                    p = line.split(',', 13)
                    r = int(p[1])
                    eh = float(p[7])
                    ed = float(p[12])
                    if eh > 0 or ed > 0:
                        prev[r] = (int(p[2]), eh, ed)
                    last[r] = (int(p[2]), eh, ed)
        for r, (t, eh, ed) in last.items():
            tot['rounds'] += 1
            if ed <= 0 and eh <= 0:
                tot['both0'] += 1
                pt, peh, ped = prev[r]
                tot['both0_H_higher'] += peh > ped
                tot['both0_D_cannot_fire'] += ped <= 0.15
            elif ed <= 0:
                tot['H_wins_clean'] += 1
            else:
                tot['D_wins'] += 1
    return tot


if __name__ == '__main__':
    if len(sys.argv) < 2:
        sys.exit(__doc__)
    for spec in sys.argv[1:]:
        name, dirs = runs.parse(spec)
        print(name, dict(endings(dirs)))

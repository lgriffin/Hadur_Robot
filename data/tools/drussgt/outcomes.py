#!/usr/bin/env python3
"""Round outcomes, and the energy lead at fixed ticks against them.

A round is won outright when Hadur's own R record says so, which is also the engine's survival
score divided by 50. A double kill is a round with both robots at zero energy and no win in
Hadur's record: both died on the same turn, and neither scored survival. The engine's
first-place count credits Hadur with those rounds, so it is higher than the outright wins.

    outcomes.py <run> [<run> ...]     a run is `label=dir[,dir...]` or one `battles` directory
"""
import gzip
import os
import sys

import runs


def load(battles_dirs):
    """One row per round: ticks, outright win, final energies and the lead at five ticks."""
    rows = []
    for d in runs.battles(battles_dirs):
        rwin = {}
        for line in open(os.path.join(d, 'hadur.log'), errors='replace'):
            q = line.split(',')
            if len(q) > 5 and q[2] == 'R':
                rwin[int(q[3])] = (q[5] == 'win')
        cur = None
        e = {}

        def flush():
            if cur is None:
                return
            n = len(e['t'])

            def at(k):
                k = min(k, n - 1)
                return e['h'][k] - e['d'][k]
            rows.append(dict(battle=d, rnd=cur, ticks=n, win=rwin.get(cur, False), eh=e['h'][-1], ed=e['d'][-1],
                             l200=at(200), l400=at(400), l600=at(600), l800=at(800), l1000=at(1000)))
        with gzip.open(os.path.join(d, 'truth.log.gz'), 'rt') as f:
            for line in f:
                if line.startswith('T,'):
                    p = line.split(',', 13)
                    r = int(p[1])
                    if r != cur:
                        flush()
                        cur = r
                        e = {'t': [], 'h': [], 'd': []}
                    e['t'].append(int(p[2]))
                    e['h'].append(float(p[7]))
                    e['d'].append(float(p[12]))
        flush()
    return rows


def double(r):
    return not r['win'] and r['eh'] <= 0 and r['ed'] <= 0


if __name__ == '__main__':
    if len(sys.argv) < 2:
        sys.exit(__doc__)
    for spec in sys.argv[1:]:
        name, dirs = runs.parse(spec)
        rows = load(dirs)
        n = len(rows)
        win = sum(r['win'] for r in rows)
        dbl = sum(1 for r in rows if double(r))
        print('%s: rounds %d | Hadur outright %d (%.1f%%) | double kill %d | DrussGT %d (%.1f%%) | mean ticks %.0f' % (
            name, n, win, 100.0 * win / n, dbl, n - win - dbl, 100.0 * (n - win - dbl) / n, sum(r['ticks'] for r in rows) / n))
        r0 = [r for r in rows if r['rnd'] == 0]
        print('   round 0: outright %d, double %d, lost %d of %d' % (
            sum(r['win'] for r in r0), sum(1 for r in r0 if double(r)),
            sum(1 for r in r0 if not r['win'] and not double(r)), len(r0)))
        for k in ('l200', 'l400', 'l600', 'l800', 'l1000'):
            a = [r for r in rows if r[k] > 0]
            b = [r for r in rows if r[k] <= 0]
            print('   %-5s mean lead %+6.1f | ahead: %3d rounds, outright wins %4.1f%% | behind: %3d rounds, outright wins %4.1f%%' % (
                k, sum(r[k] for r in rows) / n, len(a), 100.0 * sum(r['win'] for r in a) / max(1, len(a)),
                len(b), 100.0 * sum(r['win'] for r in b) / max(1, len(b))))

#!/usr/bin/env python3
"""How many rounds a cold battle needs before the lead-aware rule's evidence is in.

The plan's power rule applies only while both robots' battle-long hit rates (all bullets) are
below 12.5% by more than their margins. This replays a run's bullets and tests that at each
round end with the Agresti-Coull margin Hadur already uses (`hadur2.core.memory.Estimate`).

    evidence_replay.py <run>          a run is `label=dir[,dir...]` or one `battles` directory
"""
import collections
import math
import sys

import analyze
import runs


def upper(h, n):
    """Upper end of the 95% interval on h hits in n shots."""
    p = (h + 2) / (n + 4)
    return p + 1.96 * math.sqrt(p * (1 - p) / (n + 4))


def first_rounds(rows):
    """{battle: the 0-based round at whose end the condition first holds, or None}."""
    by_battle = collections.defaultdict(list)
    for r in rows:
        by_battle[r['battle']].append(r)
    out = {}
    for battle, rs in by_battle.items():
        rs.sort(key=lambda r: r['rnd'])
        hh = hn = eh = en = 0
        first = None
        for r in rs:
            hh += r['h_hits']
            hn += r['h_shots']
            eh += r['e_hits']
            en += r['e_shots']
            if first is None and upper(hh, hn) < 0.125 and upper(eh, en) < 0.125:
                first = r['rnd']
        out[battle] = first
    return out


if __name__ == '__main__':
    if len(sys.argv) != 2:
        sys.exit(__doc__)
    res, allb, rows = analyze.analyse(runs.parse(sys.argv[1])[1])
    firsts = first_rounds(rows)
    for battle in sorted(firsts, key=runs.seed_of):
        print('seed %2s: condition first holds at the end of round %s (0-based)' % (runs.seed_of(battle), firsts[battle]))
    held = [f for f in firsts.values() if f is not None]
    print('mean rounds played before it holds: %.1f of 35' % (sum(f + 1 for f in held) / len(held)))

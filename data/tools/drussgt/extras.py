#!/usr/bin/env python3
"""Three things the other scripts do not print.

1. DrussGT's own console (`enemy.log`, written once bench-enemy-console.patch is applied): how
   often its flattener was on at a round start, which virtual gun it was using, and its gun
   scores against its own random gun at the last round start of each battle.
2. The opening shield: in round 0, the tick DrussGT first moves more than 5 px, both energies
   at that tick, and the power of the bullets it fired while it stood still.
3. Rounds that met the duress trigger (three skipped turns in a round), with the ticks of the
   skips and how the round ended.

    extras.py <run> [<run> ...]       a run is `label=dir[,dir...]` or one `battles` directory
"""
import collections
import gzip
import math
import os
import re
import statistics
import sys

import runs

CONSOLE = re.compile(r'(Accumulated, weighted enemy hitrate %|My hitrate|DC gun score|DCAS gun score|Random score)\s*:\s*([0-9.]+)')
SKIP = re.compile(r'SYSTEM: .*skipped turn')


def console_rounds(battle_dir):
    """{round: {'flattener': bool, 'gun': name, <console figure>: value}} from enemy.log."""
    out = collections.defaultdict(dict)
    path = os.path.join(battle_dir, 'enemy.log')
    if not os.path.exists(path):
        return out
    for line in open(path, errors='replace'):
        q = line.rstrip('\n').split(',', 2)
        if len(q) < 3:
            continue
        r, msg = int(q[0]), q[2]
        if msg.startswith('Flattener enabled:'):
            out[r]['flattener'] = msg.endswith('true')
        elif msg.startswith('gun:'):
            out[r]['gun'] = msg.split()[-1]
        m = CONSOLE.match(msg)
        if m:
            out[r][m.group(1)] = float(m.group(2))
    return out


def console(run, dirs):
    flat = starts = 0
    guns = collections.Counter()
    ends = []
    for d in runs.battles(dirs):
        cur = console_rounds(d)
        for r in cur.values():
            if 'flattener' in r:
                starts += 1
                flat += r['flattener']
            if 'gun' in r:
                guns[r['gun']] += 1
        scored = {r: v for r, v in cur.items() if 'Random score' in v}
        if scored:
            ends.append(scored[max(scored)])
    print('%s: DrussGT console over %d battles' % (run, len(ends)))
    print('   flattener on at round start: %d of %d (%.0f%%)' % (flat, starts, 100.0 * flat / max(1, starts)))
    tot = sum(guns.values())
    print('   gun at round start: ' + ', '.join('%s %d (%.1f%%)' % (k, v, 100.0 * v / tot) for k, v in guns.most_common()))
    dc = [e['DC gun score'] / e['Random score'] for e in ends]
    das = [e['DCAS gun score'] / e['Random score'] for e in ends]
    print('   at the last round start: DC/random %.3f (%.2f to %.2f), DC-AS/random %.3f (%.2f to %.2f)' % (
        statistics.mean(dc), min(dc), max(dc), statistics.mean(das), min(das), max(das)))
    print('   its own hit rate figure %.1f%% to %.1f%%; its weighted figure for our hit rate %.1f%% to %.1f%% (mean %.1f%%)' % (
        min(e['My hitrate'] for e in ends), max(e['My hitrate'] for e in ends),
        min(e['Accumulated, weighted enemy hitrate %'] for e in ends), max(e['Accumulated, weighted enemy hitrate %'] for e in ends),
        statistics.mean(e['Accumulated, weighted enemy hitrate %'] for e in ends)))


def shield_phase_of(battle_dir):
    """(tick DrussGT first moved, (Hadur's energy, DrussGT's) then, its bullet powers till then)."""
    t_move = None
    start = None
    at = None
    powers = []
    seen = set()
    with gzip.open(os.path.join(battle_dir, 'truth.log.gz'), 'rt') as f:
        for line in f:
            if not line.startswith('T,'):
                continue
            p = line.rstrip('\n').split(',')
            if int(p[1]) != 0:
                break
            t = int(p[2])
            eh = float(p[7])
            ed = float(p[12])
            x = float(p[8])
            y = float(p[9])
            if start is None:
                start = (x, y)
            if t_move is None and math.hypot(x - start[0], y - start[1]) > 5:
                t_move = t
                at = (eh, ed)
            if t_move is None and len(p) > 13 and p[13]:
                for tok in p[13].split(' '):
                    o, bx, by, bh, bp = tok.split(':')
                    if o == 'E' and (bh, bp) not in seen:
                        seen.add((bh, bp))
                        powers.append(float(bp))
    return t_move, at, powers


def shield_phase(run, dirs):
    rows = [(runs.seed_of(d),) + shield_phase_of(d) for d in runs.battles(dirs)]
    print('%s: round 0 until DrussGT first moves more than 5 px' % run)
    for seed, t, at, pw in rows:
        print('   seed %2s: tick %3d, Hadur %.1f, DrussGT %.1f, lead %.1f; its shield bullets: %d, power %.2f to %.2f (mean %.2f)' % (
            seed, t, at[0], at[1], at[0] - at[1], len(pw), min(pw) if pw else 0, max(pw) if pw else 0, statistics.mean(pw) if pw else 0))
    print('   ticks %d to %d; DrussGT down %.1f to %.1f; lead %.1f to %.1f' % (
        min(r[1] for r in rows), max(r[1] for r in rows), 100 - max(r[2][1] for r in rows), 100 - min(r[2][1] for r in rows),
        min(r[2][0] - r[2][1] for r in rows), max(r[2][0] - r[2][1] for r in rows)))


def skips_of(battle_dir):
    """({round: [ticks of Hadur's skipped turns]}, {round: 'win' or 'loss'}) from hadur.log."""
    sk = collections.defaultdict(list)
    res = {}
    for line in open(os.path.join(battle_dir, 'hadur.log'), errors='replace'):
        q = line.split(',', 2)
        if len(q) == 3 and SKIP.search(q[2]):
            sk[int(q[0])].append(int(q[1]))
        qq = line.split(',')
        if len(qq) > 5 and qq[2] == 'R':
            res[int(qq[3])] = qq[5]
    return sk, res


def duress(run, dirs):
    out = []
    for d in runs.battles(dirs):
        sk, res = skips_of(d)
        for r, ts in sk.items():
            if len(ts) >= 3:
                win300 = any(ts[i + 2] - ts[i] <= 300 for i in range(len(ts) - 2))
                out.append('   seed %s round %d: skips at %s; third at tick %d; three within 300 ticks: %s; Hadur R record: %s' % (
                    runs.seed_of(d), r, ts, ts[2], 'yes' if win300 else 'no', res.get(r)))
    print('%s: rounds with three or more skipped turns (the duress trigger): %d' % (run, len(out)))
    for o in out:
        print(o)


if __name__ == '__main__':
    if len(sys.argv) < 2:
        sys.exit(__doc__)
    for spec in sys.argv[1:]:
        run, dirs = runs.parse(spec)
        console(run, dirs)
        shield_phase(run, dirs)
        duress(run, dirs)
        print()

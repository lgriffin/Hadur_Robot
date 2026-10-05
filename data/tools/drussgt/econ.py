#!/usr/bin/env python3
"""What each robot's shooting does to its own energy lead.

Per round: energy spent on bullets, refunded by hits (3 x power) and taken from the target
(Robocode's bullet damage), by bullet power class and by 200-tick window. A robot's "effect on
own lead" is damage dealt plus refund less energy spent.

    econ.py <run>             a run is `label=dir[,dir...]` or one `battles` directory
"""
import sys

import analyze
import runs

if len(sys.argv) != 2:
    sys.exit(__doc__)
res, allb, rows = analyze.analyse(runs.parse(sys.argv[1])[1])
n = len(rows)
dmg = analyze.damage
for o, name in (('H', 'Hadur'), ('E', 'Druss')):
    bs = [b for _, b in allb if b.owner == o and b.fate != 'open']
    spent = sum(b.p for b in bs) / n
    back = sum(3 * b.p for b in bs if b.fate == 'hit') / n
    dealt = sum(dmg(b.p) for b in bs if b.fate == 'hit') / n
    print('%s per round: spent %.1f, refunded %.1f, damage dealt %.1f -> effect on own lead %.1f' % (
        name, spent, back, dealt, -spent + back + dealt))
    for lo, hi in ((0, 0.2), (0.2, 1.0), (1.0, 1.7), (1.7, 3.01)):
        b2 = [b for b in bs if lo <= b.p < hi]
        if not b2:
            continue
        sp = sum(b.p for b in b2) / n
        bk = sum(3 * b.p for b in b2 if b.fate == 'hit') / n
        dl = sum(dmg(b.p) for b in b2 if b.fate == 'hit') / n
        hr = sum(1 for b in b2 if b.fate == 'hit') / len(b2)
        print('   power %.1f-%.1f: %.1f shots/round, hit %.2f%%, spent %.1f, refund %.1f, dealt %.1f, lead effect %+.1f (%.3f per shot)' % (
            lo, hi, len(b2) / n, 100 * hr, sp, bk, dl, -sp + bk + dl, (-sp + bk + dl) / (len(b2) / n)))
for o, name in (('H', 'Hadur'), ('E', 'Druss')):
    bs = [b for _, b in allb if b.owner == o and b.fate != 'open']
    for lo, hi in ((0, 200), (200, 400), (400, 600), (600, 800), (800, 1000), (1000, 5000)):
        b2 = [b for b in bs if lo <= b.fire_turn < hi]
        print('%s ticks %4d-%4d: shots/round %.1f mean power %.2f spent/round %.1f hit %.2f%%' % (
            name, lo, hi, len(b2) / n, sum(b.p for b in b2) / max(1, len(b2)), sum(b.p for b in b2) / n,
            100 * sum(1 for b in b2 if b.fate == 'hit') / max(1, len(b2))))

"""Eveimear power arms: fire power 3 against a band of the MicroRumble ranking, 2 elsewhere.

Eveimear 0.2 fires 2 (3 close in) at every robot, and keeps one char a robot in MODES (keyed by the
name's hash & MASK) that scales the 40 + 23 a round damage threshold: 0 random from the first hit,
1 the detection, 9 stop-and-go for good. Its live gap to WaveShark is ranks 61 to 450 (-2.4 APS a
bot), -1.3 of it even against robots neither side loses a round to: the rounds last too long.

Eveimear has no bytes spare (746 of 749, the jar test holds 3), so the power rides in the same char.
Every arm, the all-2 control too, re-encodes the table as v = 20 m + p, with m the 0.2 mode and p
the power (2 or 3), and changes two expressions, at the same 746 B:

    power      2 + antiRam                          ->  tab % 4 + antiRam
    threshold  (40 + 23 * getRoundNum()) * tab      ->  (2 + getRoundNum()) * tab

The threshold is then (2 + r)(20 m + p): 44 + 22 r for the detection (0.2: 40 + 23 r), 364 + 182 r for
stop-and-go for good (360 + 207 r) and 4 + 2 r for random (0.2: from the first hit), about 0.2's.

    python3 tools/eveimear_power.py SRC OUT --rankings RANKINGS.json [--ranks 61-450] [--power 3]

--ranks takes the band by MicroRumble rank (our own robots left out); without it every robot fires 2.
"""
import argparse
import json
import os
import re
import sys

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
from kitlab_prior_arm import java, unjava  # noqa: E402

OURS = 'hadur117.'
POWER_OLD = 'Math.min(2 + antiRam,'
POWER_NEW = 'Math.min(tab % 4 + antiRam,'
THRESH_OLD = '(40 + 23 * getRoundNum()) * tab'
THRESH_NEW = '(2 + getRoundNum()) * tab'


def ranked(rankings):
    order = sorted(json.load(open(rankings)), key=lambda r: -float(r['APS']))
    return [r['name'] for r in order if not r['name'].startswith(OURS)]


def java_hash(name):
    h = 0
    for ch in name:
        h = (31 * h + ord(ch)) & 0xFFFFFFFF
    return h


def band(names, spec):
    lo, hi = (int(x) for x in spec.split('-'))
    return names[lo - 1:hi]


def encode(modes, cells, power):
    """v = 20 m + p: m the 0.2 mode char, p 3 in the given cells and 2 elsewhere."""
    out = []
    for i, m in enumerate(modes):
        if m not in (0, 1, 9):
            sys.exit('MODES char %d is %d: not 0.2\'s table (0, 1 or 9)' % (i, m))
        out.append(20 * m + (power if i in cells else 2))
    return out


def arm(src_path, out, names, power):
    src = open(src_path).read()
    for old in (POWER_OLD, THRESH_OLD):
        if src.count(old) != 1:
            sys.exit('%s: expected one "%s"' % (src_path, old))
    m = re.search(r'\bMODES\s*=\s*"((?:[^"\\]|\\.)*)"', src)
    mask = int(re.search(r'\bMASK\s*=\s*(\d+)', src).group(1))
    modes = unjava(m.group(1))
    if len(modes) != mask + 1:
        sys.exit('MODES holds %d chars, MASK %d' % (len(modes), mask))
    cells = {java_hash(n) & mask for n in names}
    table = encode(modes, cells, power)
    src = src[:m.start(1)] + java(table) + src[m.end(1):]
    src = src.replace(POWER_OLD, POWER_NEW).replace(THRESH_OLD, THRESH_NEW)
    open(out, 'w').write(src)
    print('%s: power %d against %d robots (%d cells), 2 elsewhere' % (out, power, len(names), len(cells)))


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument('src')
    ap.add_argument('out')
    ap.add_argument('--rankings', required=True)
    ap.add_argument('--ranks', help='LO-HI by MicroRumble rank; none: power 2 everywhere')
    ap.add_argument('--power', type=int, default=3, choices=(2, 3))
    a = ap.parse_args()
    names = band(ranked(a.rankings), a.ranks) if a.ranks else []
    arm(a.src, a.out, names, a.power)


if __name__ == '__main__':
    main()

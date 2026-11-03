"""JayLexi 0.4 arms: take the per-opponent surf rows off (or lighten them) for the strongest bots.

JayLexi 0.3 adds a per-opponent row of where that robot aimed at us (AIM, peak 2000, picked by the
name's hash char in NAMES) to its surf danger; row 0 is the field's row (peak 100). Live
(docs/bench/live-kitlab-0.3.md) the rows paid on ranks 121 and down and cost the top 30, the
learning guns. This writes an arm source in which the top N robots of a saved rankings list get
the field row instead (--peak 0), or their own row scaled down to a lower peak (--peak P). Only
the AIM string changes, so the arm is the same bytecode size as 0.3.

    python3 tools/jaylexi_rows_off.py SRC OUT --rankings RANKINGS.json --top 60 [--peak 0]
    python3 tools/jaylexi_rows_off.py --field OUT_FIELD --rankings RANKINGS.json --top 60
    python3 tools/jaylexi_rows_off.py SRC OUT --rankings RANKINGS.json --top 450 --skip 120 --peak 4000

The third form scales only ranks 121 to 450 (--skip leaves the first 120 of the top 450 alone).

The second form writes a kitlab field of the top N robots by name (weight 1 each).
"""
import argparse
import json
import os
import re
import sys

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
from kitlab_prior_arm import BINS, java, unjava  # noqa: E402

OURS = 'hadur117.'


def top(rankings, n):
    order = sorted(json.load(open(rankings)), key=lambda r: -float(r['APS']))
    return [r['name'] for r in order if not r['name'].startswith(OURS)][:n]


def hash_char(name):
    h = 0
    for ch in name:
        h = (31 * h + ord(ch)) & 0xFFFFFFFF
    return h & 0xFFFF


def literal(src, key):
    m = re.search(r'\b%s\s*=\s*"((?:[^"\\]|\\.)*)"' % key, src)
    if not m:
        sys.exit('no %s string in the source' % key)
    return m


def arm(src_path, out, names, peak):
    src = open(src_path).read()
    aim_m = literal(src, 'AIM')
    aim = unjava(aim_m.group(1))
    keys = unjava(literal(src, 'NAMES').group(1))
    if len(aim) != BINS * (len(keys) + 1):
        sys.exit('AIM holds %d chars, NAMES %d keys: not 0.3\'s layout' % (len(aim), len(keys)))
    field = aim[:BINS]
    changed = missing = 0
    for name in names:
        k = hash_char(name)
        if k not in keys:
            missing += 1
            continue
        r = BINS * (keys.index(k) + 1)
        row = aim[r:r + BINS]
        if peak <= 0:
            new = list(field)
        else:
            top_c = max(row) or 1
            new = [int(round(c * peak / top_c)) for c in row]
        aim[r:r + BINS] = new
        changed += 1
    src = src[:aim_m.start(1)] + java(aim) + src[aim_m.end(1):]
    open(out, 'w').write(src)
    print('%s: %d of the top %d rows %s, %d have no row' % (
        out, changed, len(names), 'set to the field row' if peak <= 0 else 'scaled to peak %d' % peak, missing))


def field(out, names):
    with open(out, 'w') as f:
        f.write('# jaylexi_rows_off.py: the top %d MiniRumble bots by name, from the saved rankings\n' % len(names))
        f.write('# name | role (top:weight or band:weight) | jar | weight; the weighted mean of score share estimates APS\n')
        for n in names:
            f.write('%s | top:1 | %s.jar | 1.0000\n' % (n, n.replace(' ', '_')))
    print('%s: %d bots' % (out, len(names)))


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument('src', nargs='?')
    ap.add_argument('out', nargs='?')
    ap.add_argument('--rankings', required=True)
    ap.add_argument('--top', type=int, required=True)
    ap.add_argument('--skip', type=int, default=0, help='leave the first SKIP of the top N as they are (a rank band SKIP+1..N)')
    ap.add_argument('--peak', type=int, default=0, help='0: the field row; else scale each row to this peak')
    ap.add_argument('--field', help='write a field file of the top N instead of an arm')
    a = ap.parse_args()
    names = top(a.rankings, a.top)[a.skip:]
    if a.field:
        field(a.field, names)
    else:
        if not (a.src and a.out):
            ap.error('give SRC and OUT, or --field')
        arm(a.src, a.out, names, a.peak)


if __name__ == '__main__':
    main()

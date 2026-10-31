#!/usr/bin/env python3
"""Replay Eveimear s10's string pattern-matching gun offline, from its blank history or from a
library of other robots' movement baked in (docs/bench/kitlab-priors.md).

  python3 tools/kitlab_pm_eval.py SET RUN_DIR [--train-half 0] [--library-chars 20000]

The gun (kitlab/arms/Eveimear-s10.java) keeps the enemy's lateral speed each tick as a char
(int + 64), newest first, after 120 blank chars; it finds the longest recent run (up to 29)
that also occurs at least 80 chars back, and walks forward from that match for the bullet's
flight at 14 px a tick. A library variant starts the history with the training robots'
recorded runs instead of the blanks, so the first match can come from the field's movement.
A shot hits when the enemy's centre at arrival is within 18 px (its half width) of the aim line.
The hit rate is weighted over the set; robots of the training half are left out of the read.
"""
import argparse
import gzip
import math
import os
import sys

sys.path.insert(0, os.path.dirname(__file__))
from kitlab_priors import lines, nra, read_set  # noqa: E402


def rounds_of(path):
    """round -> [(me x, y, heading, v), (enemy x, y, heading, v)] by turn order."""
    out = {}
    with gzip.open(path, 'rt') as f:
        for line in lines(f):
            if line[0] != 'T':
                continue
            p = line.split(',')
            out.setdefault(int(p[1]), []).append(
                (tuple(map(float, p[3:7])), tuple(map(float, p[8:12]))))
    return out


def symbol(me, en):
    bearing = math.atan2(en[0] - me[0], en[1] - me[1])
    return chr(int(en[3] * math.sin(en[2] - bearing)) + 64)


def play(path, start):
    """Hits and shots of the gun over one battle, its history starting as `start`."""
    history = start
    hits = shots = 0
    for _, turns in sorted(rounds_of(path).items()):
        for i, (me, en) in enumerate(turns):
            history = symbol(me, en) + history
            dist = math.hypot(en[0] - me[0], en[1] - me[1])
            absb = math.atan2(en[0] - me[0], en[1] - me[1])
            length = 30
            while True:
                length -= 1
                at = history.find(history[:length], 80)
                if at >= 0:
                    break
            angle, offset = absb, 0.0
            while True:
                offset += 14
                if offset >= dist:
                    break
                at -= 1
                angle += (ord(history[at]) - 64) / dist
            # Where the enemy is when a 14 px a tick bullet fired now arrives.
            for j in range(i + 1, len(turns)):
                m2, e2 = turns[j]
                if math.hypot(e2[0] - me[0], e2[1] - me[1]) <= 14 * (j - i):
                    miss = abs(nra(math.atan2(e2[0] - me[0], e2[1] - me[1]) - angle))
                    shots += 1
                    hits += miss * dist < 18
                    break
    return hits, shots


def library(paths, chars):
    """Newest-first runs of the training robots' lateral speeds, about `chars` long."""
    parts, n = [], 0
    for p in paths:
        for _, turns in sorted(rounds_of(p).items()):
            run = ''.join(symbol(me, en) for me, en in turns)[::-1]
            parts.append(run)
            n += len(run)
            if n >= chars:
                return ''.join(parts)[:chars]
    return ''.join(parts)


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument('set')
    ap.add_argument('run')
    ap.add_argument('--train-half', type=int, default=0)
    ap.add_argument('--library-chars', type=int, default=20000)
    a = ap.parse_args()
    bots = read_set(a.set)
    bdir = os.path.join(a.run, 'battles')
    by_bot = {}
    for d in sorted(os.listdir(bdir)):
        stem = d.rsplit('-', 1)[0]
        path = os.path.join(bdir, d, 'truth.log.gz')
        if stem in bots and os.path.exists(path):
            by_bot.setdefault(stem, []).append(path)
    stems = sorted(by_bot)
    train = [p for s in stems[a.train_half::2] for p in by_bot[s][:1]]
    test = stems[1 - a.train_half::2]
    lib = library(train, a.library_chars)
    print(f'library {len(lib)} chars from {len(train)} battles', file=sys.stderr)
    acc = {'blank': [0, 0], 'library': [0, 0]}
    for s in test:
        for p in by_bot[s]:
            w = bots[s] / len(by_bot[s])
            for name, start in (('blank', '@' * 120), ('library', lib)):
                h, n = play(p, start)
                if n:
                    acc[name][0] += w * h / n
                    acc[name][1] += w
        print(s, file=sys.stderr)
    for name, (x, wt) in acc.items():
        print(f'{name}: weighted hit rate {100 * x / wt:.2f}%')


if __name__ == '__main__':
    main()

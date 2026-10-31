#!/usr/bin/env python3
"""Replay JayLexi's GuessFactor gun offline on bench truth logs, from zero or from a prior
(docs/bench/kitlab-priors.md).

  python3 tools/kitlab_prior_eval.py SET RUN_DIR PRIORS.json [--scales 0,1,3,10] [--every 1]

For each battle the gun's stats start empty, or at the prior table times a scale (the scale is in
waves: a prior of scale m weighs like m waves logged at its peak). Every wave aims at the most
visited bin of its segment when it fires and is logged where the enemy was when it arrived, as
JayLexi logs (depth 600, the bullet's waves weighed 5). A wave hits when the enemy's centre is
within the robot's half width of the aim. The hit rate is weighted over the set like an APS, and
shown for the first 3 rounds, the first 10 and all 35.
"""
import argparse
import json
import os
import sys

import numpy as np

sys.path.insert(0, os.path.dirname(__file__))
from kitlab_priors import BINS, MID, battle, read_set  # noqa: E402

KERNEL = 1.0 / ((np.arange(BINS)[None, :] - np.arange(BINS)[:, None]) ** 2 + 1)


def replay(waves, prior, scale, every):
    """Hit flags (round, hit) of the waves that fire, every `every`-th wave carrying a bullet."""
    stats = {}
    pending = []
    out = []
    order = sorted(range(len(waves)), key=lambda i: waves[i][0])
    arrivals = sorted(range(len(waves)), key=lambda i: waves[i][1])
    ai = 0
    for n, i in enumerate(order):
        fire, _, seg, _, _ = waves[i]
        # Log every wave that arrived before this one fired.
        while ai < len(arrivals) and waves[arrivals[ai]][1] <= fire:
            j = arrivals[ai]
            s = waves[j][2]
            b = stats.get(s)
            if b is None:
                b = stats[s] = prior[s] * scale / 600 if scale else np.zeros(BINS)
            w = 4 if j % every == 0 else 0
            b *= 600
            b += (1 + w) * KERNEL[waves[j][3]]
            b /= 601 + w
            ai += 1
        b = stats.get(seg)
        if b is None:
            b = stats[seg] = prior[seg] * scale / 600 if scale else np.zeros(BINS)
        best = int(np.argmax(b)) if b.max() > 0 else MID
        if i % every == 0:
            out.append((fire[0], abs(best - waves[i][3]) <= max(1.0, waves[i][4])))
    return out


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument('set')
    ap.add_argument('run')
    ap.add_argument('priors')
    ap.add_argument('--scales', default='0,1,3,10,30')
    ap.add_argument('--every', type=int, default=1)
    ap.add_argument('--half', type=int, help='0 or 1: only the even or odd bots, by name order')
    ap.add_argument('--spike', action='store_true', help='the prior is one bin, its segment\'s peak, as a robot would ship it')
    a = ap.parse_args()
    bots = read_set(a.set)
    gun = np.array(json.load(open(a.priors))['gun'])
    # Each segment's prior: its counts smoothed by the gun's kernel, peak 1; empty segments take
    # the whole table's profile.
    flat = gun.reshape(-1, BINS) @ KERNEL
    overall = flat.sum(axis=0)
    overall /= overall.max()
    prior = {}
    for idx in np.ndindex(gun.shape[:4]):
        row = gun[idx] @ KERNEL
        prior[idx] = row / row.max() if row.max() > 0 else overall.copy()
        if a.spike:
            p = np.zeros(BINS)
            p[int(np.argmax(prior[idx]))] = 1
            prior[idx] = p
    scales = [float(s) for s in a.scales.split(',')]
    bdir = os.path.join(a.run, 'battles')
    acc = {s: {3: [0, 0], 10: [0, 0], 35: [0, 0]} for s in scales}
    stems = sorted({d.rsplit('-', 1)[0] for d in os.listdir(bdir)} & set(bots))
    keep = set(stems if a.half is None else stems[a.half::2])
    for d in sorted(os.listdir(bdir)):
        stem = d.rsplit('-', 1)[0]
        if stem not in keep:
            continue
        path = os.path.join(bdir, d, 'truth.log.gz')
        if stem not in bots or not os.path.exists(path):
            continue
        _, waves = battle(path)
        nb = sum(1 for e in os.listdir(bdir) if e.rsplit('-', 1)[0] == stem)
        for s in scales:
            res = replay(waves, prior, s, a.every)
            for cut in (3, 10, 35):
                sel = [h for r, h in res if r < cut]
                if sel:
                    acc[s][cut][0] += bots[stem] / nb * np.mean(sel)
                    acc[s][cut][1] += bots[stem] / nb
        print(d, file=sys.stderr)
    print('scale | hit rate rounds 1-3 | 1-10 | 1-35')
    for s in scales:
        print(f'{s:g} | ' + ' | '.join(f'{100 * acc[s][c][0] / acc[s][c][1]:.2f}%' for c in (3, 10, 35)))


if __name__ == '__main__':
    main()

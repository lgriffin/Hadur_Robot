#!/usr/bin/env python3
"""Learn field-wide priors for JayLexi from bench truth logs (docs/bench/kitlab-priors.md).

  python3 tools/kitlab_priors.py SET RUN_DIR [--out PRIORS.json] [--exclude SET2]

SET is the kitlab field the run fought (its last column is each bot's weight); RUN_DIR is the bench
--out directory of a run with --truth-log true. Two tables come out, each in JayLexi's own bins
(47, guess factor zero at 23) and segments, so a robot can start from them instead of from zero:

  surf  [distance band 4][our lateral band 5][47]: where the field's bullets were aimed at us,
        one count per enemy bullet, in the wave JayLexi builds for that shot.
  gun   [velocity history 6][lateral 4][walls 4][distance 5][47]: where the enemy was when a wave
        fired from us each tick reached it, in the gun's segments.

Each bot's counts are weighted by its field weight over its battle count, so a rank band stands
for the bots it represents. --exclude drops the opponents named in another set file, so a prior
learned on a wide field can be tested on a field it never saw.
"""
import argparse
import gzip
import json
import math
import os
import sys

import numpy as np

MID, BINS = 23, 47
FX0, FY0, FX1, FY1 = 18, 18, 782, 582


def nra(a):
    return (a + math.pi) % (2 * math.pi) - math.pi


def read_set(path):
    """name -> (jar stem, weight) for every bot line of a kitlab set file."""
    out = {}
    for line in open(path, encoding='utf-8'):
        if line.startswith('#') or '|' not in line:
            continue
        parts = [p.strip() for p in line.split('|')]
        out[parts[2][:-4]] = float(parts[3])
    return out


def read_names(path):
    """robot name as getName() gives it ("pkg.Bot 1.0") -> jar stem, for every bot line."""
    out = {}
    for line in open(path, encoding='utf-8'):
        if line.startswith('#') or '|' not in line:
            continue
        parts = [p.strip() for p in line.split('|')]
        out[parts[0]] = parts[2][:-4]
    return out


def bullet_speed(power):
    return 20 - 3 * power


def gf_index(angle, bearing, direction, speed):
    v = nra(angle - bearing) * direction / math.asin(8 / speed) * MID + MID
    return int(max(0, min(BINS - 1, v)))


def inside(x, y):
    return FX0 < x < FX1 and FY0 < y < FY1


def lines(f):
    """The lines of a gzip file, stopping quietly where a log still being written ends."""
    try:
        yield from f
    except EOFError:
        return


def battle(path):
    """One battle's events: surf shots (dband, lband, bin) and gun waves
    (fire order, arrival order, (history, lband, walls, dband), bin, half width in bins)."""
    shots, waves = [], []
    rounds = {}
    fires = []
    with gzip.open(path, 'rt') as f:
        for line in lines(f):
            if line[0] == 'T':
                p = line.rstrip('\n').split(',')
                r, t = int(p[1]), int(p[2])
                me = tuple(float(v) for v in p[3:8])
                en = tuple(float(v) for v in p[8:13])
                bullets = []
                for tok in p[13].split():
                    o, bx, by, bh, bp = tok.split(':')
                    if o == 'E':
                        bullets.append((float(bx), float(by), float(bh), float(bp)))
                rounds.setdefault(r, {})[t] = (me, en, bullets)
            elif line[0] == 'F':
                p = line.rstrip('\n').split(',')
                fires.append((int(p[1]), int(p[2]), float(p[4])))
    # Surf: each enemy shot, in the wave JayLexi builds for it. The drop shows on the scan of turn
    # t; the wave is the one made on the scan before (t - 1), from where the enemy was then, with the
    # bearing, distance and our lateral speed that scan kept from the one before it (t - 2).
    for r, t, power in fires:
        turns = rounds.get(r, {})
        if t - 1 not in turns or t not in turns:
            continue
        _, en, _ = turns[t - 1]
        me2, en2, _ = turns.get(t - 2, turns[t - 1])
        # The bullet that appeared at t: the one nearest the enemy's position.
        cands = turns[t][2]
        if not cands:
            continue
        b = min(cands, key=lambda b: (b[0] - en[0]) ** 2 + (b[1] - en[1]) ** 2)
        abs_to_enemy = math.atan2(en2[0] - me2[0], en2[1] - me2[1])
        bearing = abs_to_enemy + math.pi
        dist = math.hypot(me2[0] - en2[0], me2[1] - en2[1])
        lateral = me2[3] * math.sin(abs_to_enemy - me2[2])
        direction = 1.0 if lateral + 1e-9 > 0 else -1.0
        db = int(min((dist + 50) / 200, 3))
        lb = int((abs(lateral) + 1) / 2)
        lb = min(lb, 4)
        shots.append((db, lb, gf_index(b[2], bearing, direction, bullet_speed(b[3]))))
    # Gun: a wave from us every tick, at JayLexi's power rule for its distance.
    for r in sorted(rounds):
        turns = rounds[r]
        ts = sorted(turns)
        if not ts:
            continue
        ex = np.array([turns[t][1][0] for t in ts])
        ey = np.array([turns[t][1][1] for t in ts])
        index = {t: i for i, t in enumerate(ts)}
        v_change, speed_prev = 0.0, None
        for t in ts:
            me, en, _ = turns[t]
            dist = math.hypot(en[0] - me[0], en[1] - me[1])
            if dist < 1:
                continue
            bearing = math.atan2(en[0] - me[0], en[1] - me[1])
            lateral = en[3] * math.sin(en[2] - bearing)
            direction = 1.0 if lateral + 1e-9 > 0 else -1.0
            history = int(min(3, math.pow(280 * v_change / dist, .7)))
            v_change += 1
            lat = float(int(abs(lateral)))
            if speed_prev is not None and speed_prev != lat:
                history = 5 if speed_prev > lat else 4
                v_change = 0
            speed_prev = lat
            power = min(3 if dist < 150 else 2, me[4] / 15, en[4] / 4 + 0.1)
            if power < 0.1:
                continue
            speed = bullet_speed(power)
            walls = 0
            for frac in (0.18, 0.36, 0.64):
                a = bearing + direction * frac
                if inside(me[0] + math.sin(a) * dist, me[1] + math.cos(a) * dist):
                    walls += 1
                else:
                    break
            i0 = index[t]
            k = np.arange(1, min(len(ts) - i0, 120))
            if len(k) == 0:
                continue
            d = np.hypot(ex[i0 + k] - me[0], ey[i0 + k] - me[1])
            hit = np.nonzero(d <= speed * (k + 0.5))[0]
            if len(hit) == 0:
                continue
            j = i0 + k[hit[0]]
            angle = math.atan2(ex[j] - me[0], ey[j] - me[1])
            dband = min(int(dist / 250), 4)
            lband = min(int(1.4427 * math.log(lat + 1.5)), 3)
            width = math.atan(18 / dist) / math.asin(8 / speed) * MID
            waves.append(((r, t), (r, ts[j]), (history, lband, walls, dband),
                          gf_index(angle, bearing, direction, speed), width))
    return shots, waves


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument('set')
    ap.add_argument('run')
    ap.add_argument('--out', default='priors.json')
    ap.add_argument('--exclude')
    ap.add_argument('--half', type=int, help='0 or 1: only the even or odd bots of the set, by name order, to hold the other half out')
    a = ap.parse_args()
    bots = read_set(a.set)
    skip = set(read_set(a.exclude)) if a.exclude else set()
    bdir = os.path.join(a.run, 'battles')
    by_bot = {}
    for d in sorted(os.listdir(bdir)):
        stem = d.rsplit('-', 1)[0]
        if stem in bots and stem not in skip and os.path.exists(os.path.join(bdir, d, 'truth.log.gz')):
            by_bot.setdefault(stem, []).append(os.path.join(bdir, d, 'truth.log.gz'))
    surf = np.zeros((4, 5, BINS))
    gun = np.zeros((6, 4, 4, 5, BINS))
    # Per opponent, by its robot name as getName() gives it: [lateral band 5][47] of aim.
    names = {stem: line_name for line_name, stem in read_names(a.set).items()}
    per_bot = {}
    if a.half is not None:
        by_bot = {k: v for n, (k, v) in enumerate(sorted(by_bot.items())) if n % 2 == a.half}
    for i, (stem, paths) in enumerate(sorted(by_bot.items())):
        for p in paths:
            shots, waves = battle(p)
            w = bots[stem] / len(paths)
            mine = per_bot.setdefault(names[stem], np.zeros((5, BINS)))
            for db, lb, b in shots:
                surf[db][lb][b] += w
                mine[lb][b] += 1
            for _, _, (h, lb, wl, db), b, _ in waves:
                gun[h][lb][wl][db][b] += w
        print(f'{i + 1}/{len(by_bot)} {stem}', file=sys.stderr)
    json.dump({'bots': len(by_bot), 'surf': surf.tolist(), 'gun': gun.tolist(),
               'per_bot': {k: v.tolist() for k, v in per_bot.items()}}, open(a.out, 'w'))
    print(f'{len(by_bot)} bots, surf shots {surf.sum():.0f} (weighted), gun waves {gun.sum():.0f}')


if __name__ == '__main__':
    main()

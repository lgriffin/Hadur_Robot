#!/usr/bin/env python3
"""Who does each robot shoot at? Read from melee traces (BENCH-213, --melee-trace true).

    python3 tools/melee_targets.py DIR_OR_TRACE [...] [--us hadur117] [--tol 12] [--min 30]

For every bullet that first appears in a trace, the shooter's target is the living robot whose head-on or
linear-lead bearing from the shooter lies nearest the bullet's heading (within --tol degrees). The shot
is then filed by the target's distance rank from the shooter (0 = its nearest robot). Output: the field's
share of shots at the k-th nearest robot against the surfer's 1/(1+k)^2 weight, the chance a shot is at
Hadur given k robots were nearer the shooter, and the same per shooter.
"""
import argparse, glob, gzip, math, os, sys
from collections import defaultdict


def read(path):
    """Yields (round, turn, robots, bullets) per trace record; robots as dicts, bullets as tuples."""
    with gzip.open(path, 'rt') as f:
        for line in f:
            if not line.startswith('T,'):
                continue
            parts = line.rstrip('\n').split(',')
            rnd, turn = int(parts[1]), int(parts[2])
            robots = {}
            for p in parts[3:-1]:
                name, x, y, h, v, e, alive = p.rsplit(':', 6)
                robots[name] = dict(x=float(x), y=float(y), h=float(h), v=float(v), e=float(e), alive=alive == '1')
            bullets = []
            for b in (parts[-1].split('|') if parts[-1] else []):
                owner, x, y, h, pw = b.rsplit(':', 4)
                bullets.append((owner, float(x), float(y), float(h), float(pw)))
            yield rnd, turn, robots, bullets


def bearing(dx, dy):
    """Robocode bearing: 0 north, clockwise, radians in [0, 2pi)."""
    return math.atan2(dx, dy) % (2 * math.pi)


def ang_diff(a, b):
    d = (a - b + math.pi) % (2 * math.pi) - math.pi
    return abs(d)


def linear_lead(sx, sy, t, speed):
    """Heading to hit robot t moving at its heading/velocity, iterated."""
    x, y = t['x'], t['y']
    vx, vy = math.sin(t['h']) * t['v'], math.cos(t['h']) * t['v']
    tt = 0.0
    for _ in range(12):
        px, py = x + vx * tt, y + vy * tt
        tt = math.hypot(px - sx, py - sy) / speed
    return bearing(x + vx * tt - sx, y + vy * tt - sy)


def shots(trace, tol):
    """Yields (shooter, target, rank, others, names_by_rank) per new bullet."""
    prev_robots, prev_bullets = None, []
    seen = set()
    for rnd, turn, robots, bullets in trace:
        if prev_robots is None or turn == 1 or turn < getattr(shots, 'last', -1):
            prev_robots, prev_bullets, seen = robots, [], set()
        shots.last = turn
        for owner, x, y, h, pw in bullets:
            speed = 20 - 3 * pw
            key = (owner, round(h, 4), pw, rnd)
            # A bullet just fired is within a tick or two of its owner's gun.
            o = robots.get(owner) or prev_robots.get(owner)
            if o is None:
                continue
            op = prev_robots.get(owner, o)
            if math.hypot(x - op['x'], y - op['y']) > 2.5 * speed + 20 or key in seen:
                seen.add(key)
                continue
            seen.add(key)
            # The others alive when it fired: last turn's positions, the shot came before this turn.
            cands = []
            for name, r in prev_robots.items():
                if name == owner or not r['alive']:
                    continue
                d = math.hypot(r['x'] - op['x'], r['y'] - op['y'])
                hot = bearing(r['x'] - op['x'], r['y'] - op['y'])
                lin = linear_lead(op['x'], op['y'], r, speed)
                err = min(ang_diff(h, hot), ang_diff(h, lin))
                cands.append((d, name, err))
            if not cands:
                continue
            cands.sort()
            ranked = [c[1] for c in cands]
            best = min(cands, key=lambda c: c[2])
            if math.degrees(best[2]) > tol:
                target = None
            else:
                target = best[1]
            yield owner, target, (ranked.index(target) if target else -1), len(cands), ranked
        prev_robots, prev_bullets = robots, bullets


def is_us(name, us):
    return name.lower().startswith(us.lower())


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument('paths', nargs='+')
    ap.add_argument('--us', default='hadur117')
    ap.add_argument('--tol', type=float, default=12, help='degrees between bullet heading and an aim to count')
    ap.add_argument('--min', type=int, default=30, help='shots a shooter needs to be listed')
    a = ap.parse_args()
    files = []
    for p in a.paths:
        if os.path.isdir(p):
            files += glob.glob(os.path.join(p, '**', 'trace.log.gz'), recursive=True)
        else:
            files.append(p)
    if not files:
        sys.exit('no trace.log.gz under ' + ', '.join(a.paths))

    by_rank = defaultdict(int)          # rank -> shots (all shooters, others >= 4)
    unmatched = 0
    total = 0
    us_given_k = defaultdict(lambda: [0, 0])   # k = robots nearer the shooter than Hadur -> [shots at us, shots]
    per = defaultdict(lambda: dict(n=0, ranks=defaultdict(int), us=defaultdict(lambda: [0, 0]), none=0))
    for f in files:
        for owner, target, rank, others, ranked in shots(read(f), a.tol):
            if is_us(owner, a.us):
                continue
            total += 1
            p = per[owner]
            p['n'] += 1
            if target is None:
                unmatched += 1
                p['none'] += 1
                continue
            if others >= 3:
                by_rank[rank] += 1
                p['ranks'][rank] += 1
            us_names = [n for n in ranked if is_us(n, a.us)]
            if us_names and others >= 3:
                k = ranked.index(us_names[0])
                us_given_k[k][1] += 1
                p['us'][k][1] += 1
                if is_us(target, a.us):
                    us_given_k[k][0] += 1
                    p['us'][k][0] += 1

    print(f"{total} shots by opponents in {len(files)} traces; {unmatched} ({100.0 * unmatched / max(1, total):.0f}%) "
          f"match no robot's head-on or linear aim within {a.tol:g} degrees\n")
    ranked_total = sum(by_rank.values())
    print("| target's distance rank from the shooter (0 = nearest) | shots | share | surfer weight 1/(1+k)^2 |")
    print("|---:|---:|---:|---:|")
    for k in sorted(by_rank):
        print(f"| {k} | {by_rank[k]} | {100.0 * by_rank[k] / ranked_total:.0f}% | {1.0 / (1 + k) ** 2:.2f} |")

    print("\n| robots nearer the shooter than Hadur | shots with Hadur there | at Hadur | share | surfer weight |")
    print("|---:|---:|---:|---:|---:|")
    for k in sorted(us_given_k):
        hit, n = us_given_k[k]
        print(f"| {k} | {n} | {hit} | {100.0 * hit / max(1, n):.0f}% | {1.0 / (1 + k) ** 2:.2f} |")

    print(f"\n| shooter | shots | at its nearest | 2nd | 3rd+ | unmatched | at Hadur when 1+ nearer |")
    print("|---|---:|---:|---:|---:|---:|---:|")
    for name in sorted(per, key=lambda n: -per[n]['n']):
        p = per[name]
        if p['n'] < a.min:
            continue
        r = sum(p['ranks'].values()) or 1
        far = sum(v for k, v in p['ranks'].items() if k >= 2)
        us_hit = sum(v[0] for k, v in p['us'].items() if k >= 1)
        us_n = sum(v[1] for k, v in p['us'].items() if k >= 1)
        print(f"| {name} | {p['n']} | {100.0 * p['ranks'][0] / r:.0f}% | {100.0 * p['ranks'][1] / r:.0f}% | "
              f"{100.0 * far / r:.0f}% | {100.0 * p['none'] / p['n']:.0f}% | {100.0 * us_hit / max(1, us_n):.0f}% ({us_n}) |")


if __name__ == '__main__':
    main()

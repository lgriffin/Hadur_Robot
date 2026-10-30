"""Our team gun against theirs, read the same way from the same battles (BENCH-148).

Needs bullets.log from TeamHarvester with BENCH-148's 11th field (the living enemies at each of our
shots). Usage:
    python3 tools/team_gun.py [--ours PREFIX] work/RUN [work/RUN2 ...]

Each bullet, ours or the enemy's, is read against the robots of the side it was fired at, as they
stood when the bullet first showed. Its target is the robot it hit, or, for a miss, the robot whose
bearing is nearest the bullet's heading within the escape angle (asin(8 / bullet speed)) widened by
a bot's half-width at that range; a bullet with none is "no target" (fired at nobody in particular,
or at a robot that has gone). Prints, per side, per opponent team:

- shots, hits on a robot of the other side, hits per 100 shots, mean power, and the bullet damage
  dealt per point of energy fired;
- the share of shots with no target;
- hit rate by distance to the target, by bullet power, and by the target's speed across the line;
- the hits' guess factor (0 head-on, +1 the furthest the target could get moving as it was),
  as a spread: a gun that hits at a tight spread around 0 is reading a simple mover.
"""
import collections
import glob
import math
import os
import sys

OURS = ('hadur117.Hadur', 'hadur2.Hadur')
DIST = (200, 400, 600, 800)
POWER = (1.0, 1.8, 2.5)
CROSS = (2, 5)


def norm(a):
    while a > math.pi: a -= 2 * math.pi
    while a < -math.pi: a += 2 * math.pi
    return a


def band(v, edges):
    for i, e in enumerate(edges):
        if v < e:
            return i
    return len(edges)


def label(i, edges, unit=''):
    lo = '0' if i == 0 else '%g' % edges[i - 1]
    return ('%s-%g%s' % (lo, edges[i], unit)) if i < len(edges) else ('%g%s+' % (edges[-1], unit))


def robots(field):
    out = {}
    if not field or field == '-':
        return out
    for m in field.split(';'):
        if m.count(':') < 4:
            continue
        name, x, y, h, v = m.rsplit(':', 4)
        out[name] = (float(x), float(y), float(h), float(v))
    return out


def read(d, ours):
    """(side, power, bx, by, heading, robots, victim) for every bullet with positions, side 'ours' or 'theirs'."""
    fires, victims = {}, {}
    with open(os.path.join(d, 'bullets.log')) as f:
        for line in f:
            c = line.rstrip('\n').split(',')
            if len(c) >= 7 and c[2] == 'H':
                victims[(c[0], c[3])] = c[5]
            elif len(c) >= 10 and c[2] == 'F':
                mine = c[4].startswith(ours)
                field = (c[10] if len(c) > 10 else '-') if mine else c[9]
                listed = robots(field)
                if listed:
                    fires[(c[0], c[3])] = ('ours' if mine else 'theirs', float(c[5]), float(c[6]), float(c[7]),
                                           float(c[8]), listed)
    return [v + (victims.get(k),) for k, v in fires.items()]


def shot(power, bx, by, bh, listed, victim):
    """(target, distance, cross speed, guess factor, hit) or None for no target."""
    speed = 20 - 3 * power
    mea = math.asin(8 / speed)
    best = None
    for name, (x, y, h, v) in listed.items():
        dist = math.hypot(x - bx, y - by)
        bearing = math.atan2(x - bx, y - by)
        off = norm(bh - bearing)
        if name == victim:
            best = (0, name, dist, bearing, off, h, v)
            break
        if abs(off) <= mea + math.atan2(18, max(dist, 18)) and (best is None or abs(off) < best[0]):
            best = (abs(off), name, dist, bearing, off, h, v)
    if best is None:
        return None
    _, name, dist, bearing, off, h, v = best
    lateral = v * math.sin(h - bearing)
    direction = 1 if lateral >= 0 else -1
    return name, dist, abs(lateral), off * direction / mea, name == victim


def opponent(d):
    name = os.path.basename(d)
    name = name[:-len('-baseline')] if name.endswith('-baseline') else name
    return name.rsplit('-', 1)[0].split('_', 1)[0]


def report(roots, ours=OURS):
    stats = collections.defaultdict(lambda: {'shots': 0, 'hits': 0, 'none': 0, 'spent': 0.0, 'dealt': 0.0,
                                             'dist': collections.Counter(), 'dist_hit': collections.Counter(),
                                             'pow': collections.Counter(), 'pow_hit': collections.Counter(),
                                             'cross': collections.Counter(), 'cross_hit': collections.Counter(),
                                             'gf': collections.Counter()})
    for root in roots:
        for d in sorted(glob.glob(os.path.join(root, 'battles', '*'))):
            if not os.path.exists(os.path.join(d, 'bullets.log')):
                continue
            opp = opponent(d)
            for side, power, bx, by, bh, listed, victim in read(d, ours):
                for key in ((opp, side), ('all', side)):
                    s = stats[key]
                    s['shots'] += 1
                    s['spent'] += power
                    r = shot(power, bx, by, bh, listed, victim)
                    if victim in listed:
                        s['hits'] += 1
                        s['dealt'] += 4 * power + (2 * (power - 1) if power > 1 else 0)
                    if r is None:
                        s['none'] += 1
                        continue
                    _, dist, cross, gf, hit = r
                    for k, b in (('dist', band(dist, DIST)), ('pow', band(power, POWER)), ('cross', band(cross, CROSS))):
                        s[k][b] += 1
                        if hit:
                            s[k + '_hit'][b] += 1
                    if hit:
                        s['gf'][max(-1.0, min(1.0, round(gf * 5) / 5))] += 1
    if not stats:
        sys.exit('team_gun.py: no bullets with positions under ' + ', '.join(roots) + ' (needs BENCH-148 logs)')
    out = ['# Our team gun against theirs', '', 'Runs: ' + ', '.join(roots), '']

    def rate(s, k, i):
        n = s[k][i]
        return '%.1f%% of %d' % (100.0 * s[k + '_hit'][i] / n, n) if n else '-'

    def gfline(s):
        n = sum(s['gf'].values())
        inner = sum(c for g, c in s['gf'].items() if abs(g) <= 0.2)
        return '%d%% within ±0.2' % round(100.0 * inner / n) if n else '-'

    opps = sorted({o for o, _ in stats if o != 'all'}) + ['all']
    out += ['## Hits per 100 shots', '', '| Opponent | Side | Shots | Hits/100 | Mean power | Damage per energy fired | No target | Hits near GF 0 |', '|---|---|---|---|---|---|---|---|']
    for o in opps:
        for side in ('ours', 'theirs'):
            s = stats.get((o, side))
            if s and s['shots']:
                out.append('| %s | %s | %d | %.1f | %.2f | %.2f | %.0f%% | %s |' % (
                    o, side, s['shots'], 100.0 * s['hits'] / s['shots'], s['spent'] / s['shots'],
                    s['dealt'] / max(s['spent'], 1e-9), 100.0 * s['none'] / s['shots'], gfline(s)))
    for k, edges, title, unit in (('dist', DIST, 'distance to the target', ' px'), ('pow', POWER, 'bullet power', ''),
                                  ('cross', CROSS, "the target's speed across the line", '')):
        out += ['', '## Hit rate by ' + title, '',
                '| Opponent | Side | ' + ' | '.join(label(i, edges, unit) for i in range(len(edges) + 1)) + ' |',
                '|---|---|' + '---|' * (len(edges) + 1)]
        for o in opps:
            for side in ('ours', 'theirs'):
                s = stats.get((o, side))
                if s and s['shots']:
                    out.append('| %s | %s | %s |' % (o, side, ' | '.join(rate(s, k, i) for i in range(len(edges) + 1))))
    return '\n'.join(out) + '\n'


if __name__ == '__main__':
    args = sys.argv[1:]
    ours = OURS
    if len(args) > 1 and args[0] == '--ours':
        ours, args = (args[1],), args[2:]
    if not args:
        sys.exit(__doc__)
    sys.stdout.write(report(args, ours))

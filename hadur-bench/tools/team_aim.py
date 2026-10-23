"""How the enemy bullets that hit a team's members were aimed.

Needs bullets.log from TeamHarvester (any subject team). Usage:
    python3 tools/team_aim.py work/RUN [work/RUN2 ...]

For each enemy bullet that hit one of the subject's members, the member's position, heading and
velocity at the tick the bullet first showed give the bullet's aim as a guess factor: 0 is
head-on, +1 the furthest the member could have got moving the way it was going. A bullet within
0.03 rad of where a linear (straight on at the same speed) aim put it counts as linear; one within
0.03 rad of the member's position, as head-on. Prints, per run, enemy bullets fired and hits on
the subject (per 100 bullets fired while members were alive), and the hits by aim kind.
"""
import collections
import glob
import math
import os
import sys


def norm(a):
    while a > math.pi: a -= 2 * math.pi
    while a < -math.pi: a += 2 * math.pi
    return a


def battles(root):
    return [d for d in sorted(glob.glob(os.path.join(root, 'battles', '*')))
            if os.path.exists(os.path.join(d, 'bullets.log'))]


def run(root):
    fired = hits = 0
    kinds = collections.Counter()
    gfs = collections.Counter()
    per_opp = collections.defaultdict(lambda: [0, 0, collections.Counter()])
    subject = None
    for d in battles(root):
        opp = os.path.basename(d).rsplit('-', 1)[0]
        fires = {}
        for line in open(os.path.join(d, 'bullets.log')):
            f = line.rstrip('\n').split(',')
            if len(f) < 10 or f[2] != 'F' or f[9] == '-':
                continue
            members = {}
            for m in f[9].split(';'):
                if m.count(':') < 4:
                    continue
                name, x, y, h, v = m.rsplit(':', 4)
                members[name] = (float(x), float(y), float(h), float(v))
            fires[(f[0], f[3])] = (float(f[5]), float(f[6]), float(f[7]), float(f[8]), members)
            fired += 1
            per_opp[opp][0] += 1
        for line in open(os.path.join(d, 'bullets.log')):
            f = line.rstrip('\n').split(',')
            if len(f) < 6 or f[2] != 'H':
                continue
            fire = fires.get((f[0], f[3]))
            if fire is None or f[5] not in fire[4]:
                continue
            power, bx, by, bh, members = fire
            x, y, h, v = members[f[5]]
            hits += 1
            per_opp[opp][1] += 1
            speed = 20 - 3 * power
            bearing = math.atan2(x - bx, y - by)
            offset = norm(bh - bearing)
            lateral = v * math.sin(h - bearing)
            linear = math.asin(max(-1, min(1, lateral / speed)))
            mea = math.asin(8 / speed)
            direction = 1 if lateral >= 0 else -1
            gf = offset * direction / mea
            if abs(offset) < 0.03 and abs(lateral) > 2:
                kind = 'head-on'
            elif abs(offset - linear) < 0.03 and abs(lateral) > 2:
                kind = 'linear'
            elif abs(lateral) <= 2:
                kind = 'member barely moving across'
            else:
                kind = 'other'
            kinds[kind] += 1
            per_opp[opp][2][kind] += 1
            gfs[max(-1.0, min(1.0, round(gf * 5) / 5))] += 1
    print('%s: enemy bullets fired %d, hits on members %d (%.1f per 100)' % (root, fired, hits, 100 * hits / max(fired, 1)))
    for k, n in kinds.most_common():
        print('  %-30s %6d %5.1f%%' % (k, n, 100 * n / max(hits, 1)))
    print('  guess factor of hits: ' + ' '.join('%+.1f:%d' % (g, gfs[g]) for g in sorted(gfs)))
    for opp, (f, h, k) in sorted(per_opp.items()):
        print('  %-40s fired %5d hit %4d (%4.1f/100) head-on %4d linear %4d slow %4d other %4d' % (
            opp, f, h, 100 * h / max(f, 1), k['head-on'], k['linear'], k['member barely moving across'], k['other']))


if __name__ == '__main__':
    for root in sys.argv[1:]:
        run(root)

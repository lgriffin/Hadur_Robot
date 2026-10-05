#!/usr/bin/env python3
"""Follow every bullet in a run's truth logs to its fate.

Prints, for both robots, the hit rate by bullet power, distance, target speed and round, the
share of bullets destroyed by an enemy bullet, and the energy lead at fixed ticks against the
round's outcome. The other scripts here import its parser and bullet tracker.

    analyze.py <run>          a run is `label=dir[,dir...]` or one `battles` directory (runs.py)

A truth log (`truth.log.gz`, written by hadur-bench) has one `T` line per turn: round, turn,
Hadur's x, y, heading, velocity and energy, the opponent's five, and every bullet in the air as
`owner:x:y:heading:power` (owner H for Hadur, E for the enemy). A bullet's fate is read from
where it was when it left the log: on the target's box (hit), at a wall (miss) or in mid-air
(destroyed by a bullet, "bhb").
"""
import gzip, sys, os, math, collections

import runs

W, Hh = 800.0, 600.0


def bullet_speed(p):
    return 20.0 - 3.0 * p


def damage(p):
    return 4 * p + (2 * (p - 1) if p > 1 else 0)


def parse_battle(path):
    """Yield per-round lists of turns: (turn, me(x,y,h,v,e), en(x,y,h,v,e), bullets[(owner,x,y,h,p)])"""
    rounds = collections.OrderedDict()
    with gzip.open(path, 'rt') as f:
        for line in f:
            if not line.startswith('T,'):
                continue
            parts = line.rstrip('\n').split(',')
            rnd = int(parts[1]); turn = int(parts[2])
            me = tuple(float(x) for x in parts[3:8])
            en = tuple(float(x) for x in parts[8:13])
            bl = []
            if len(parts) > 13 and parts[13]:
                for tok in parts[13].split(' '):
                    o, x, y, h, p = tok.split(':')
                    bl.append((o, float(x), float(y), float(h), float(p)))
            rounds.setdefault(rnd, []).append((turn, me, en, bl))
    return rounds


def seg_hits_box(x0, y0, x1, y1, cx, cy, hw):
    """Liang-Barsky: does the segment touch the axis-aligned box centred (cx, cy), half-width hw?"""
    dx = x1 - x0; dy = y1 - y0
    t0, t1 = 0.0, 1.0
    for p, q in ((-dx, x0 - (cx - hw)), (dx, (cx + hw) - x0), (-dy, y0 - (cy - hw)), (dy, (cy + hw) - y0)):
        if abs(p) < 1e-12:
            if q < 0:
                return False
        else:
            r = q / p
            if p < 0:
                if r > t1:
                    return False
                t0 = max(t0, r)
            else:
                if r < t0:
                    return False
                t1 = min(t1, r)
    return True


class B:
    __slots__ = ('owner', 'x', 'y', 'h', 'p', 'fire_turn', 'dist', 'e_self', 'e_other', 'fate', 'end_turn',
                 'tx', 'ty', 'sx', 'sy', 'tgt_v', 'tgt_latv', 'rnd')


def track_round(rnd, turns):
    active = []
    done = []
    prev_me = prev_en = None
    for (turn, me, en, bl) in turns:
        # predicted positions
        used = [False] * len(bl)
        still = []
        for b in active:
            v = bullet_speed(b.p)
            nx = b.x + v * math.sin(b.h); ny = b.y + v * math.cos(b.h)
            best = -1; bd = 3.0
            for i, (o, x, y, h, p) in enumerate(bl):
                if used[i] or o != b.owner or abs(p - b.p) > 0.006:
                    continue
                d = math.hypot(x - nx, y - ny)
                if d < bd:
                    bd = d; best = i
            if best >= 0:
                used[best] = True
                b.x, b.y = bl[best][1], bl[best][2]
                still.append(b)
            else:
                # ended this turn: classify using predicted position and victim position
                vic = en if b.owner == 'H' else me
                pvic = prev_en if b.owner == 'H' else prev_me
                b.end_turn = turn
                ref = pvic if pvic else vic
                out = nx <= 3 or ny <= 3 or nx >= W - 3 or ny >= Hh - 3
                if seg_hits_box(b.x, b.y, nx, ny, ref[0], ref[1], 18.0):
                    b.fate = 'hit'
                elif out:
                    b.fate = 'miss'
                else:
                    b.fate = 'bhb'
                done.append(b)
        active = still
        for i, (o, x, y, h, p) in enumerate(bl):
            if used[i]:
                continue
            b = B()
            b.owner = o; b.x = x; b.y = y; b.h = h; b.p = p; b.fire_turn = turn; b.rnd = rnd
            src = me if o == 'H' else en
            tgt = en if o == 'H' else me
            b.sx, b.sy = x, y
            b.tx, b.ty = tgt[0], tgt[1]
            b.dist = math.hypot(tgt[0] - x, tgt[1] - y)
            b.e_self = src[4]; b.e_other = tgt[4]
            b.tgt_v = tgt[3]
            # lateral velocity of target relative to the line of fire
            bearing = math.atan2(tgt[0] - x, tgt[1] - y)
            b.tgt_latv = tgt[3] * math.sin(tgt[2] - bearing)
            b.fate = None; b.end_turn = None
            active.append(b)
        prev_me, prev_en = me, en
    for b in active:
        b.fate = 'open'
        done.append(b)
    return done


def analyse(battles_dirs):
    """Every round and every bullet of a run: (counts, [(battle name, bullet)], [round row]).

    `battles_dirs` is one `battles` directory or a list of them."""
    if isinstance(battles_dirs, str):
        battles_dirs = [battles_dirs]
    res = {'battles': 0, 'rounds': 0}
    allb = []
    round_rows = []
    for d in runs.battles(battles_dirs):
        t = os.path.join(d, 'truth.log.gz')
        if not os.path.exists(t):
            continue
        rounds = parse_battle(t)
        res['battles'] += 1
        # round outcomes from Hadur's own R records: round,tick,R,round,ticks,win|loss,...
        outcome = {}
        hl = os.path.join(d, 'hadur.log')
        if os.path.exists(hl):
            for line in open(hl, errors='replace'):
                q = line.split(',')
                if len(q) > 5 and q[2] == 'R':
                    outcome[int(q[3])] = (q[5] == 'win')
        for rnd, turns in rounds.items():
            res['rounds'] += 1
            bl = track_round(rnd, turns)
            for b in bl:
                allb.append((os.path.basename(d), b))
            last = turns[-1]
            # winner: the one with energy > 0 at the last turn (or higher)
            me_e, en_e = last[1][4], last[2][4]
            n = len(turns)
            # energy at checkpoints
            def at(k):
                k = min(k, n - 1)
                return turns[k][1][4], turns[k][2][4]
            # first turn at which either robot is <= 60 energy
            t60 = next((i for i, tt in enumerate(turns) if tt[1][4] <= 60 or tt[2][4] <= 60), n - 1)
            row = dict(battle=os.path.basename(d), rnd=rnd, ticks=n, win=(en_e <= 0.0),
                       me_end=me_e, en_end=en_e,
                       e200=at(200), e400=at(400), e600=at(600), e800=at(800), e1000=at(1000),
                       t60=t60, e_t60=at(t60))
            hs = [b for b in bl if b.owner == 'H']; es = [b for b in bl if b.owner == 'E']
            row['h_shots'] = len(hs); row['e_shots'] = len(es)
            row['h_hits'] = sum(1 for b in hs if b.fate == 'hit'); row['e_hits'] = sum(1 for b in es if b.fate == 'hit')
            row['h_dmg'] = sum(damage(b.p) for b in hs if b.fate == 'hit')
            row['e_dmg'] = sum(damage(b.p) for b in es if b.fate == 'hit')
            row['h_spent'] = sum(b.p for b in hs); row['e_spent'] = sum(b.p for b in es)
            round_rows.append(row)
    return res, allb, round_rows


def bucket_power(p):
    for lo, hi, name in [(0, 0.2, '0.10-0.20'), (0.2, 0.5, '0.20-0.50'), (0.5, 1.0, '0.50-1.00'),
                         (1.0, 1.7, '1.00-1.70'), (1.7, 2.2, '1.70-2.20'), (2.2, 3.01, '2.20-3.00')]:
        if lo <= p < hi:
            return name
    return 'other'


def bucket_dist(d):
    for lo, hi in [(0, 200), (200, 300), (300, 400), (400, 500), (500, 600), (600, 1000)]:
        if lo <= d < hi:
            return '%d-%d' % (lo, hi)


def rate(h, n):
    if n == 0:
        return '   -  '
    p = h / n
    m = 1.96 * math.sqrt(max(p * (1 - p), 1e-9) / n)
    return '%5.2f%% ±%4.2f (n=%d)' % (100 * p, 100 * m, n)


def report(battles_dirs):
    res, allb, rows = analyse(battles_dirs)
    out = []
    P = out.append
    P('battles %d rounds %d' % (res['battles'], res['rounds']))
    wins = sum(1 for r in rows if r['win'])
    P('first places for Hadur (engine count, includes double kills; see outcomes.py for outright wins): %d / %d (%.1f%%)' % (wins, len(rows), 100.0 * wins / max(1, len(rows))))
    P('mean ticks/round %.0f' % (sum(r['ticks'] for r in rows) / len(rows)))
    for o, name in (('H', 'Hadur'), ('E', 'Druss')):
        bs = [b for _, b in allb if b.owner == o and b.fate != 'open']
        n = len(bs); hit = sum(1 for b in bs if b.fate == 'hit'); bhb = sum(1 for b in bs if b.fate == 'bhb')
        P('%s shots %d (%.1f/round): hit %s ; bullet-hit-bullet %.1f%% ; hit rate excl. bhb %s' % (
            name, n, n / len(rows), rate(hit, n), 100.0 * bhb / n, rate(hit, n - bhb)))
        P('  mean power %.3f ; energy spent/round %.1f ; damage/round %.1f ; damage per energy %.3f' % (
            sum(b.p for b in bs) / n, sum(b.p for b in bs) / len(rows),
            sum(damage(b.p) for b in bs if b.fate == 'hit') / len(rows),
            sum(damage(b.p) for b in bs if b.fate == 'hit') / sum(b.p for b in bs)))
        P('  by power:')
        byp = collections.OrderedDict()
        for b in bs:
            k = bucket_power(b.p)
            a = byp.setdefault(k, [0, 0, 0, 0.0, 0.0])
            a[0] += 1; a[1] += b.fate == 'hit'; a[2] += b.fate == 'bhb'; a[3] += b.dist
            # naive random floor: bot width (36px..~44) over classical MEA range
            mea = math.asin(8.0 / bullet_speed(b.p))
            a[4] += (2 * math.atan(20.0 / max(b.dist, 40))) / (2 * mea)
        for k in sorted(byp):
            a = byp[k]
            P('    %s  share %5.1f%%  hit %s  bhb %4.1f%%  mean dist %3.0f  naive-random %4.1f%%' % (
                k, 100.0 * a[0] / n, rate(a[1], a[0]), 100.0 * a[2] / a[0], a[3] / a[0], 100 * a[4] / a[0]))
        P('  by distance:')
        byd = collections.OrderedDict()
        for b in bs:
            k = bucket_dist(b.dist)
            a = byd.setdefault(k, [0, 0, 0])
            a[0] += 1; a[1] += b.fate == 'hit'; a[2] += b.fate == 'bhb'
        for k in sorted(byd, key=lambda s: int(s.split('-')[0])):
            a = byd[k]
            P('    %-8s share %5.1f%%  hit %s' % (k, 100.0 * a[0] / n, rate(a[1], a[0])))
        P('  by target speed at fire:')
        bys = collections.OrderedDict()
        for b in bs:
            k = '|v|<1' if abs(b.tgt_v) < 1 else ('1-7' if abs(b.tgt_v) < 7.5 else '8')
            a = bys.setdefault(k, [0, 0]); a[0] += 1; a[1] += b.fate == 'hit'
        for k in bys:
            P('    %-6s share %5.1f%% hit %s' % (k, 100.0 * bys[k][0] / n, rate(bys[k][1], bys[k][0])))
        # by round phase
        P('  by round number (hit rate):')
        byr = collections.OrderedDict()
        for b in bs:
            k = '00' if b.rnd == 0 else ('01-04' if b.rnd < 5 else ('05-14' if b.rnd < 15 else '15-34'))
            a = byr.setdefault(k, [0, 0]); a[0] += 1; a[1] += b.fate == 'hit'
        for k in sorted(byr):
            P('    rounds %-6s hit %s' % (k, rate(byr[k][1], byr[k][0])))
    # energy lead at t=..., and outcome
    P('energy lead (Hadur - Druss) at checkpoints vs outcome:')
    for key in ('e200', 'e400', 'e600', 'e800', 'e1000', 'e_t60'):
        lead_w = [r[key][0] - r[key][1] for r in rows if r['win']]
        lead_l = [r[key][0] - r[key][1] for r in rows if not r['win']]
        allv = [r[key][0] - r[key][1] for r in rows]
        ahead = [r for r in rows if r[key][0] - r[key][1] > 0]
        behind = [r for r in rows if r[key][0] - r[key][1] <= 0]
        P('  %-6s mean lead %+6.1f | when ahead (%d rounds) Hadur is first %4.1f%% | when behind (%d) first %4.1f%%' % (
            key, sum(allv) / len(allv), len(ahead), 100.0 * sum(r['win'] for r in ahead) / max(1, len(ahead)),
            len(behind), 100.0 * sum(r['win'] for r in behind) / max(1, len(behind))))
    P('round 0 first places: %d / %d' % (sum(1 for r in rows if r['rnd'] == 0 and r['win']),
                                             sum(1 for r in rows if r['rnd'] == 0)))
    # per-round energy accounting
    P('per-round means: Hadur shots %.0f spent %.1f dmg dealt %.1f | Druss shots %.0f spent %.1f dmg dealt %.1f' % (
        sum(r['h_shots'] for r in rows) / len(rows), sum(r['h_spent'] for r in rows) / len(rows),
        sum(r['h_dmg'] for r in rows) / len(rows), sum(r['e_shots'] for r in rows) / len(rows),
        sum(r['e_spent'] for r in rows) / len(rows), sum(r['e_dmg'] for r in rows) / len(rows)))
    P('end energy: loser Hadur rounds -> Druss mean end energy %.1f ; won rounds -> Hadur mean end energy %.1f' % (
        sum(r['en_end'] for r in rows if not r['win']) / max(1, sum(1 for r in rows if not r['win'])),
        sum(r['me_end'] for r in rows if r['win']) / max(1, sum(1 for r in rows if r['win']))))
    return '\n'.join(out), rows, allb


if __name__ == '__main__':
    if len(sys.argv) != 2:
        sys.exit(__doc__)
    txt, rows, allb = report(runs.parse(sys.argv[1])[1])
    print(txt)

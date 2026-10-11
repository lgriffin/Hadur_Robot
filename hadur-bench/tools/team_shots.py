"""Match the shots Hadur team members infer from energy drops to the engine's bullets.

Needs a team bench run of a `tshots` build (build-ablation.sh): each member's log carries SC (own
scan) and SL (teammate sighting merged over the link) records, and TeamHarvester writes
bullets.log. Usage: python3 tools/team_shots.py work/RUN [delta...]

Prints, per update window (two consecutive updates of one enemy in one member's EnemyTracker),
how often a single enemy shot was inferred, split by what else happened to that enemy in the
window; then, for every enemy bullet that hit a member, whether that member inferred the shot.
"""
import sys, os, glob, collections, bisect
OURS = 'hadur2.'
def load(d):
    fires = collections.defaultdict(list)   # (round, owner) -> [turn]
    hits = collections.defaultdict(list)    # (round, victim) -> [(turn, owner, power)]
    gains = collections.defaultdict(list)   # (round, owner) -> [(turn, power)]  owner's bullet hit someone
    for line in open(os.path.join(d, 'bullets.log')):
        f = line.rstrip('\n').split(',')
        r, t, k = int(f[0]), int(f[1]), f[2]
        if k == 'F':
            fires[(r, f[4])].append((t, float(f[5])))
        elif k == 'H':
            hits[(r, f[5])].append((t, f[4], float(f[6])))
            gains[(r, f[4])].append((t, float(f[6])))
    scans = collections.defaultdict(list)   # (round, member, enemy) -> [(tick, energy, shot)]
    for p in glob.glob(os.path.join(d, 'member-*.log')):
        m = int(p.rsplit('-', 1)[1].split('.')[0])
        me = None
        for line in open(p):
            if ',SC,' not in line and ',SL,' not in line: continue
            f = line.rstrip('\n').split(',')
            name = ','.join(f[5:-2])
            if name.startswith(OURS): continue
            scans[(int(f[3]), m, name)].append((int(f[4]), float(f[6]), None if f[7] == '-' else float(f[7])))
    for v in scans.values(): v.sort(key=lambda x: x[0])
    return fires, hits, gains, scans

def between(lst, a, b, key=lambda x: x[0]):
    return [x for x in lst if a < key(x) <= b]

def main(dirs, delta):
    C = collections.Counter()
    hitme = collections.Counter()
    for d in dirs:
        fires, hits, gains, scans = load(d)
        for (r, m, x), ss in scans.items():
            myname = '(%d)' % (m + 1)
            for (t1, e1, _), (t2, e2, shot) in zip(ss, ss[1:]):
                a, b = t1 - delta, t2 - delta
                fs = between(fires[(r, x)], a, b)
                hs = between(hits[(r, x)], a, b)
                gs = between(gains[(r, x)], a, b)
                own = [h for h in hs if h[1].startswith(OURS) and h[1].endswith(myname)]
                mate = [h for h in hs if h[1].startswith(OURS) and not h[1].endswith(myname)]
                other = [h for h in hs if not h[1].startswith(OURS)]
                gap = t2 - t1
                cat = []
                if mate: cat.append('mateHit')
                if own: cat.append('ownHit')
                if other: cat.append('otherHit')
                if gs: cat.append('xGained')
                if gap > 10: cat.append('gap>10')
                cat = '+'.join(cat) or 'clean'
                n = len(fs)
                key = (min(n, 2), cat)
                C[key, shot is not None] += 1
    # summary
    cats = sorted({k[1] for (k, _) in C})
    print('delta', delta)
    print('%-34s %8s %8s %8s | %8s %8s' % ('window kind', 'n=1', 'det%', 'n>=2 det%', 'n=0', 'falseDet%'))
    tot = collections.Counter()
    for c in cats:
        n1 = C[(1, c), True] + C[(1, c), False]; d1 = C[(1, c), True]
        n2 = C[(2, c), True] + C[(2, c), False]; d2 = C[(2, c), True]
        n0 = C[(0, c), True] + C[(0, c), False]; f0 = C[(0, c), True]
        tot['n1'] += n1; tot['d1'] += d1; tot['n0'] += n0; tot['f0'] += f0; tot['n2'] += n2; tot['d2'] += d2
        if n1 + n0 + n2 < 50: continue
        print('%-34s %8d %8.1f %8.1f | %8d %8.1f' % (c, n1, 100 * d1 / max(n1, 1), 100 * d2 / max(n2, 1), n0, 100 * f0 / max(n0, 1)))
    print('%-34s %8d %8.1f %8.1f | %8d %8.1f' % ('ALL', tot['n1'], 100 * tot['d1'] / max(tot['n1'], 1), 100 * tot['d2'] / max(tot['n2'], 1), tot['n0'], 100 * tot['f0'] / max(tot['n0'], 1)))

def hits_on_us(dirs, by_opp=False):
    """Of enemy bullets that hit member M, was M's update window holding the fire a detected shot?"""
    out = collections.Counter(); opp = collections.defaultdict(collections.Counter)
    for d in dirs:
        fires, hits, gains, scans = load(d)
        fid = {}
        for line in open(os.path.join(d, 'bullets.log')):
            f = line.rstrip('\n').split(',')
            if f[2] == 'F': fid[(int(f[0]), int(f[3]))] = int(f[1])
        for line in open(os.path.join(d, 'bullets.log')):
            f = line.rstrip('\n').split(',')
            if f[2] != 'H': continue
            r, bid, owner, victim = int(f[0]), int(f[3]), f[4], f[5]
            if owner.startswith(OURS) or not victim.startswith(OURS): continue
            m = int(victim.rsplit('(', 1)[1].rstrip(')')) - 1
            ft = fid.get((r, bid))
            ss = scans.get((r, m, owner), [])
            res = 'unseen'
            for (t1, e1, _), (t2, e2, shot) in zip(ss, ss[1:]):
                if t1 < ft <= t2:
                    hs = between(hits[(r, owner)], t1, t2); gs = between(gains[(r, owner)], t1, t2)
                    mate = [h for h in hs if h[1].startswith(OURS) and not h[1].endswith('(%d)' % (m + 1))]
                    if shot is not None: res = 'detected'
                    elif t2 - t1 > 10: res = 'missed:gap'
                    elif mate: res = 'missed:mateHit'
                    elif gs: res = 'missed:shooterGained'
                    elif hs: res = 'missed:otherHit'
                    else: res = 'missed:other'
                    break
            out[res] += 1
            opp[os.path.basename(d).rsplit('-', 1)[0]][res] += 1
    n = sum(out.values())
    print('enemy bullets that hit a member: %d' % n)
    for k, v in out.most_common(): print('  %-22s %6d %5.1f%%' % (k, v, 100 * v / n))
    if by_opp:
        for o, c in sorted(opp.items()):
            t = sum(c.values()); print('  %-40s %5d det %5.1f%% mateHit %4.1f%% unseen %4.1f%%' % (o, t, 100*c['detected']/t, 100*c['missed:mateHit']/t, 100*c['unseen']/t))
    return out

if __name__ == '__main__':
    root = sys.argv[1]
    dirs = [d for d in glob.glob(os.path.join(root, 'battles', '*')) if os.path.exists(os.path.join(d, 'bullets.log'))]
    for delta in (int(x) for x in sys.argv[2:] or ['0']):
        main(dirs, delta)
    hits_on_us(dirs, True)

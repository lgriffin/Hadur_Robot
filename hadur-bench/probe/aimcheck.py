import gzip, math, sys, glob, os
def norm(a):
    while a > math.pi: a -= 2*math.pi
    while a < -math.pi: a += 2*math.pi
    return a
def bearing(x1,y1,x2,y2): return math.atan2(x2-x1, y2-y1)
for d in sorted(glob.glob(sys.argv[1] + '/*')):
    T = {}; F = []
    with gzip.open(d + '/truth.log.gz', 'rt') as f:
        for line in f:
            p = line.rstrip('\n').split(',')
            if p[0] == 'T':
                T[(int(p[1]), int(p[2]))] = p
            elif p[0] == 'F':
                F.append((int(p[1]), int(p[2]), float(p[4])))
    n = exact = close = 0
    errs = []
    for (r, t, pw) in F:
        cur = T.get((r, t)); prev = T.get((r, t-1))
        if not cur or not prev: continue
        mx, my = float(cur[3]), float(cur[4])
        ex, ey = float(cur[8]), float(cur[9])
        pex, pey = float(prev[8]), float(prev[9])
        pmx, pmy = float(prev[3]), float(prev[4])
        best = None
        for b in cur[13].split(' ') if len(cur) > 13 and cur[13] else []:
            o, bx, by, bh, bp = b.split(':')
            if o != 'E' or abs(float(bp) - pw) > 1e-6: continue
            dist = math.hypot(float(bx)-ex, float(by)-ey)
            if best is None or dist < best[0]: best = (dist, float(bh), float(bx), float(by))
        if best is None: continue
        h = best[1]
        # Refine the rounded heading from the bullet's track 8 ticks later.
        v = 20 - 3 * pw
        later = T.get((r, t + 8))
        if later and len(later) > 13 and later[13]:
            px, py = best[2] + 8 * v * math.sin(h), best[3] + 8 * v * math.cos(h)
            for b in later[13].split(' '):
                o, bx, by, bh, bp = b.split(':')
                if o == 'E' and abs(float(bp) - pw) < 1e-6 and math.hypot(float(bx) - px, float(by) - py) < 1.5:
                    h = math.atan2(float(bx) - best[2], float(by) - best[3]); break
            else:
                continue
        else:
            continue
        cands = [bearing(pex,pey,pmx,pmy), bearing(ex,ey,pmx,pmy), bearing(ex,ey,mx,my), bearing(pex,pey,mx,my)]
        e = min(abs(norm(h - c)) for c in cands)
        n += 1; errs.append(e)
        if e < 3e-4: exact += 1
        if e < 0.003: close += 1
    errs.sort()
    med = errs[len(errs)//2] if errs else float('nan')
    print(f"{os.path.basename(d):45s} shots {n:5d}  exact(<3e-4) {100*exact/max(n,1):5.1f}%  within 0.003 {100*close/max(n,1):5.1f}%  median err {med:.4f}")

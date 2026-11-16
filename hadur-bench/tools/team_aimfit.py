#!/usr/bin/env python3
"""TMODE-50: fit one parametric aim per enemy team from team bench bullet logs (BENCH-254's evidence).

heading = bearing(source, P) + f(d) * asin(clamp(v_lat / s)), P and v_lat the subject member's position and
lateral velocity `lag` ticks before the fire tick (from bullets.log F lines: field 9 the shooter's mates, 10+
its enemies, name:x:y:heading:velocity), s a fixed bullet speed or the shot's own (s=0), f(d) = a + b d / 1200.
The grid point that puts the most enemy shots within TOL bot widths of some subject member wins; a null
control turns every heading by 0.25 rad and scores the same point. Prints per team: shots, hits on the
subject, the fit, the share it explains (all shots, and hits), the control, and head-on / linear at lag 0
(what the dodge's simple aims see). Each TeamModes.FITTED entry comes from this read plus the team's code.

    python3 tools/team_aimfit.py SUBJECT_PREFIX BATTLE_DIR...     (e.g. hadur117 work/run/battles/*/)
"""
import collections
import itertools
import math
import os
import sys

FIELD = 1200.0


def norm(a):
    return (a + math.pi) % (2 * math.pi) - math.pi


def read(d, subj):
    track = collections.defaultdict(dict)  # (round, member) -> tick -> (x,y,hd,v)
    shots = []
    hits = set()
    for line in open(os.path.join(d, "bullets.log")):
        f = line.rstrip("\n").split(",")
        if len(f) >= 6 and f[2] == "H" and f[5].startswith(subj) and not f[4].startswith(subj):
            hits.add((int(f[0]), f[3]))
            continue
        if len(f) < 10 or f[2] != "F":
            continue
        r, t = int(f[0]), int(f[1])
        shooter = f[4]
        lists = [f[9]] + [",".join(f[10:])]
        for lst in lists:
            for m in lst.split(";"):
                if not m or m == "-" or m.count(":") < 4:
                    continue
                name, x, y, hd, v = m.rsplit(":", 4)
                if name.startswith(subj):
                    track[(r, name)][t] = (float(x), float(y), float(hd), float(v))
        if shooter.startswith(subj):
            mine = (r, shooter)
            track[mine][t] = (float(f[6]), float(f[7]), None, None) if t not in track[mine] else track[mine][t]
        else:
            shots.append((r, t, float(f[5]), float(f[6]), float(f[7]), float(f[8]) + 0.0, f[3]))
    shots = [x[:6] + ((x[0], x[6]) in hits,) for x in shots]
    return track, shots


def state(tr, t):
    """Member state at tick t, from the nearest known tick within 8 (forward or backward at its velocity)."""
    for back in range(0, 9):
        for dt in ((back, -back) if back else (0,)):
            s = tr.get(t - dt)
            if s and s[2] is not None:
                x, y, hd, v = s
                x += dt * v * math.sin(hd); y += dt * v * math.cos(hd)
                return x, y, hd, v
    return None


TOL = 0.5
LAGS = range(0, 9)
SPEEDS = (0, 11, 13, 14, 15, 17)
AS = (0.0, 0.5, 1.0)
BS = (0.0, -1.0)


def fit(dirs, subj, offset=0.0):
    rows = []  # per shot: list of (member features per lag)
    for d in dirs:
        track, shots = read(d, subj)
        members = collections.defaultdict(list)
        for (r, name) in track:
            members[r].append(name)
        for (r, t, p, sx, sy, h, hit) in shots:
            h += offset
            cands = []
            for name in members[r]:
                tr = track[(r, name)]
                per = []
                for k in LAGS:
                    s = state(tr, t - k)
                    if s is None:
                        per.append(None)
                        continue
                    x, y, hd, v = s
                    dist = math.hypot(x - sx, y - sy)
                    if dist < 30:
                        per.append(None)
                        continue
                    brg = math.atan2(x - sx, y - sy)
                    w = 2 * math.asin(min(1, 18 / dist))
                    per.append((norm(h - brg), v * math.sin(hd - brg), dist, w))
                cands.append(per)
            rows.append((20 - 3 * p, hit, cands))
    score = {}
    for lag, s, a, b in itertools.product(LAGS, SPEEDS, AS, BS):
        if a == 0 and b != 0:
            continue
        n = good = nh = gh = 0
        for speed, hit, cands in rows:
            sp = s or speed
            ok = False
            any_ = False
            for per in cands:
                c = per[lag]
                if c is None:
                    continue
                any_ = True
                off, vl, dist, w = c
                f = a + b * dist / 1200
                lead = f * math.asin(max(-1, min(1, vl / sp)))
                if abs(norm(off - lead)) / w < TOL:
                    ok = True
                    break
            if not any_:
                continue
            n += 1; good += ok
            if hit:
                nh += 1; gh += ok
        score[(lag, s, a, b)] = (good / max(n, 1), gh / max(nh, 1), n, nh)
    return score


def team_of(d):
    """'rz.HOFSwarm_1.1-3-baseline' or 'rz.HOFSwarm_1.1-3' -> 'rz.HOFSwarm_1.1'."""
    name = os.path.basename(d.rstrip("/"))
    if name.endswith("-baseline"):
        name = name[:-len("-baseline")]
    return name.rsplit("-", 1)[0]


def main():
    subj = sys.argv[1]
    by_team = collections.defaultdict(list)
    for d in sys.argv[2:]:
        by_team[team_of(d)].append(d)
    print("team\tshots\thits\tbest lag\tspeed(0=true)\ta\tb\texplained\tof hits\tnull\thead-on lag0\tlinear lag0")
    for team, dirs in sorted(by_team.items()):
        sc = fit(dirs, subj)
        best = max(sc, key=lambda k: sc[k][0])
        null = fit(dirs, subj, 0.25)[best][0]
        ho = sc[(0, 0, 0.0, 0.0)][0]
        li = sc[(0, 0, 1.0, 0.0)][0]
        e, eh, n, nh = sc[best]
        print("%s\t%d\t%d\t%d\t%d\t%.1f\t%.1f\t%.0f%%\t%.0f%%\t%.0f%%\t%.0f%%\t%.0f%%" % (
            team, n, nh, best[0], best[1], best[2], best[3], 100 * e, 100 * eh, 100 * null, 100 * ho, 100 * li))
        sys.stdout.flush()


if __name__ == "__main__":
    main()

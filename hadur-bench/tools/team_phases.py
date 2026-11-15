#!/usr/bin/env python3
"""Per opposing team, read a team bench's battle logs (bullets.log, deaths.log) by phase: how many
enemies are alive (5 = all). For each team: ticks a round in each phase, our fire (shots a tick,
mean power, hit rate), the enemies' hit rate on our members and their damage a tick, our member
deaths a round by phase and an inferred cause (the last bullet that hit the member in its last
three turns: an enemy's, a teammate's, or none; the engine logs no killing blow), the enemies'
hit rate on us by how near our nearest member stood when they fired, and the share of enemy
bullets that match a simple aim (head-on, linear, circular) at one of our members.

    python3 tools/team_phases.py [--subject PREFIX] [--tsv OUT] BATTLE_DIR...

PREFIX picks our members from the logs' robot names (default hadur117; cz.libors reads OgiTeam
as the subject). BATTLE_DIRs are a run's battles/<team>-<seed>[-baseline] directories; seeds of
one team pool. Standard library only.
"""
import argparse
import collections
import math
import os
import re
import sys

FIELD = 1200.0
PHASES = (5, 4, 3, 2, 1)


def norm(a):
    while a > math.pi:
        a -= 2 * math.pi
    while a < -math.pi:
        a += 2 * math.pi
    return a


def predict(x, y, hd, v, tr, sx, sy, speed, maxt=120):
    """Where a robot driving at v with turn rate tr meets a bullet of speed from (sx, sy)."""
    for t in range(1, maxt):
        hd += tr
        x = min(max(x + v * math.sin(hd), 18), FIELD - 18)
        y = min(max(y + v * math.cos(hd), 18), FIELD - 18)
        if math.hypot(x - sx, y - sy) <= speed * t:
            break
    return x, y


def damage(p):
    return 4 * p + (2 * (p - 1) if p > 1 else 0)


def team_of(d):
    return re.sub(r"-\d+(-baseline)?$", "", os.path.basename(d.rstrip("/")))


def read(d, subj, acc):
    deaths = collections.defaultdict(list)
    for line in open(os.path.join(d, "deaths.log")):
        r, t, _i, mine, _lead, name = line.strip().split(",", 5)
        deaths[int(r)].append((int(t), mine == "1", name))
    rows = [l.rstrip("\n").split(",") for l in open(os.path.join(d, "bullets.log"))]
    # A round ends at its last bullet or death; rounds.csv adds rounds with neither.
    ends = collections.Counter()
    for f in rows:
        ends[int(f[0])] = max(ends[int(f[0])], int(f[1]))
    for r, ev in deaths.items():
        for tt, _mine, _name in ev:
            ends[r] = max(ends[r], tt)
    rounds_csv = os.path.join(d, "rounds.csv")
    if os.path.exists(rounds_csv):
        for line in list(open(rounds_csv))[1:]:
            if line.strip():
                ends.setdefault(int(line.split(",")[0]), 0)
    # Enemies at the start of a round: the most living enemies any of our shots listed, else 5.
    start = collections.defaultdict(lambda: 5)
    seen = collections.defaultdict(int)
    for f in rows:
        if f[2] == "F" and f[4].startswith(subj) and len(f) > 10:
            live = [e for e in ",".join(f[10:]).split(";") if e and e != "-"]
            seen[int(f[0])] = max(seen[int(f[0])], len(live))
    for r, n in seen.items():
        start[r] = n

    def phase(r, t):
        # Phases are named by enemies alive, top phase = the team's own size (5 for most).
        return start[r] - sum(1 for tt, mine, _ in deaths[r] if not mine and tt <= t)

    fired, last_head, hits_on = {}, {}, collections.defaultdict(list)
    for f in rows:
        if f[2] == "F" and len(f) > 10:
            f = f[:10] + [",".join(f[10:])]
        r, t, kind, bid, owner = int(f[0]), int(f[1]), f[2], f[3], f[4]
        ours = owner.startswith(subj)
        if kind == "F":
            ph = phase(r, t)
            fired[(r, bid)] = ph
            p = float(f[5])
            if ours:
                acc["shots", ph] += 1
                acc["power", ph] += p
                continue
            acc["eshots", ph] += 1
            if len(f) < 10 or f[9] == "-":
                continue
            speed = 20 - 3 * p
            bh, bx, by = float(f[8]), float(f[6]), float(f[7])
            sx, sy = bx - speed * math.sin(bh), by - speed * math.cos(bh)
            near, best = 1e9, {}
            for m in f[9].split(";"):
                try:
                    name, x, y, hd, v = m.rsplit(":", 4)
                    x, y, hd, v = float(x), float(y), float(hd), float(v)
                except ValueError:
                    continue
                tr = 0.0
                if (r, name) in last_head:
                    ph0, t0 = last_head[(r, name)]
                    if 0 < t - t0 <= 3:
                        tr = norm(hd - ph0) / (t - t0)
                last_head[(r, name)] = (hd, t)
                x0, y0 = x - v * math.sin(hd), y - v * math.cos(hd)
                dist = math.hypot(x0 - sx, y0 - sy)
                near = min(near, dist)
                tol = math.atan(18 / max(dist, 36)) * 0.5
                aims = {"headon": math.atan2(x0 - sx, y0 - sy)}
                lx, ly = predict(x0, y0, hd, v, 0.0, sx, sy, speed)
                aims["linear"] = math.atan2(lx - sx, ly - sy)
                cx, cy = predict(x0, y0, hd, v, tr, sx, sy, speed)
                aims["circular"] = math.atan2(cx - sx, cy - sy)
                for k, a in aims.items():
                    best[k] = min(best.get(k, 9), abs(norm(bh - a)) / tol)
            acc["aimed"] += 1
            matched = [k for k in ("headon", "linear", "circular") if best.get(k, 9) <= 1]
            for k in matched:
                acc["aim", k] += 1
            if not matched:
                acc["aim", "none"] += 1
            band = min(int(near // 200), 3)
            fired[(r, bid)] = (ph, band)
            acc["band shots", band] += 1
        elif kind == "H":
            victim, p = f[5], float(f[6])
            got = fired.get((r, bid), phase(r, t))
            ph = got[0] if isinstance(got, tuple) else got
            hits_on[(r, victim)].append((t, ours))
            if ours and not victim.startswith(subj):
                acc["hits", ph] += 1
                acc["dmg", ph] += damage(p)
            elif ours:
                acc["matehits", ph] += 1
            elif victim.startswith(subj):
                acc["ehits", ph] += 1
                acc["edmg", ph] += damage(p)
                if isinstance(got, tuple):
                    acc["band hits", got[1]] += 1
    for r, end in ends.items():
        acc["rounds"] += 1
        ts = sorted(tt for tt, mine, _ in deaths[r] if not mine)
        prev = 0
        n0 = start[r]
        for k, t in enumerate(ts[:n0 - 1] + [end]):
            acc["ticks", n0 - k] += max(0, min(t, end) - prev)
            prev = min(t, end)
        for tt, mine, name in deaths[r]:
            if not mine:
                continue
            acc["deaths", phase(r, tt - 1)] += 1
            h = [x for x in hits_on.get((r, name), []) if tt - 3 <= x[0] <= tt]
            acc["cause", "none" if not h else ("mate" if h[-1][1] else "enemy")] += 1


def main():
    ap = argparse.ArgumentParser(description=__doc__.split("\n")[0])
    ap.add_argument("--subject", default="hadur117")
    ap.add_argument("--tsv")
    ap.add_argument("dirs", nargs="+")
    a = ap.parse_args()
    teams = collections.OrderedDict()
    for d in sorted(a.dirs):
        if os.path.exists(os.path.join(d, "deaths.log")) and os.path.exists(os.path.join(d, "team.csv")):
            read(d, a.subject, teams.setdefault(team_of(d), collections.Counter()))
    cols = ["team", "rounds", "ticks/round"] + ["ticks%d" % p for p in PHASES] + ["our hit%", "power",
            "enemy hit%"] + ["enemy hit%% p%d" % p for p in PHASES] + ["deaths/round"] + \
           ["deaths p%d" % p for p in PHASES] + ["death after mate hit (inferred)", "mate hits/round",
           "enemy hit% <200", "200-399", "400-599", "600+", "aim headon", "linear", "circular", "none"]
    out = ["\t".join(cols)]
    for team, c in teams.items():
        R = max(1, c["rounds"])
        def pct(a, b):
            return "%.1f" % (100.0 * a / b) if b else "-"
        shots = sum(c["shots", p] for p in PHASES)
        row = [team, str(c["rounds"]), "%.0f" % (sum(c["ticks", p] for p in PHASES) / R)]
        row += ["%.0f" % (c["ticks", p] / R) for p in PHASES]
        row += [pct(sum(c["hits", p] for p in PHASES), shots),
                "%.2f" % (sum(c["power", p] for p in PHASES) / max(1, shots)),
                pct(sum(c["ehits", p] for p in PHASES), sum(c["eshots", p] for p in PHASES))]
        row += [pct(c["ehits", p], c["eshots", p]) for p in PHASES]
        deaths = sum(c["deaths", p] for p in PHASES) + c["deaths", 0]
        row += ["%.2f" % (deaths / R)] + ["%.2f" % (c["deaths", p] / R) for p in PHASES]
        row += [pct(c["cause", "mate"], deaths), "%.2f" % (sum(c["matehits", p] for p in PHASES) / R)]
        row += [pct(c["band hits", b], c["band shots", b]) for b in range(4)]
        row += [pct(c["aim", k], c["aimed"]) for k in ("headon", "linear", "circular", "none")]
        out.append("\t".join(row))
    text = "\n".join(out) + "\n"
    if a.tsv:
        open(a.tsv, "w").write(text)
    sys.stdout.write(text)


if __name__ == "__main__":
    main()

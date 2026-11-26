#!/usr/bin/env python3
"""Sepia's cover, read from the bench's truth logs (docs/sepia.md, "Records"; design: ink_read.py).

    python3 data/tools/ink_read.py RUN [RUN ...] [--arm si --arm sp ...] [--md OUT.md]

RUN is a bench work dir: RUN/battles/<opponent>-<seed>[-<arm>]/truth.log.gz, where the subject
(Sepia, or silent Hadur as the reference) is the first robot of every T record and the shooter the
second. A T record lists every live bullet as owner:x:y:heading:power (H ours, E theirs).

Every enemy bullet is followed from turn to turn by its own straight flight. When it vanishes
before the round ends, the turn's segments decide why:

  hit     its last segment crosses the subject's 36 px body where the subject stood that turn
  met     one of our bullets vanished on the same turn and their lines crossed (see met())
  other   it left the field or struck nothing we can see

A met bullet is then flown on along its line against the subject's actual later path, to see
whether it would have hit (on an 800x600 field unless --field says otherwise). **Cover** is the share of the bullets that would have hit that our
bullets met first: met-and-would-hit over (hit + met-and-would-hit). This is the number the design
turns on (35% or more on the lab card; under 25% stops the project). The table also gives the
shooter's hit rate (hits over bullets fired), the shooter's hit rate had nothing been met
((hit + met-and-would-hit) over bullets), and, from Sepia's own INK records in hadur.log, the share
of each landing it planned as shaded, for the agreement check against cover.

Standard library only.
"""

import argparse
import gzip
import math
import os
import re
import sys
from collections import defaultdict

FIELD_W, FIELD_H = 800.0, 600.0
HALF = 18.0          # half the robot's body, px
TOL = 0.6            # truth positions are printed to 0.01 px; segments are allowed this slack
MATCH = 1.0          # a bullet's next position must fall within this of its prediction


def speed(power):
    return 20.0 - 3.0 * power


def parse_bullets(field):
    out = []
    for tok in field.split():
        p = tok.split(":")
        if len(p) != 5:
            continue
        out.append((p[0], float(p[1]), float(p[2]), float(p[3]), float(p[4])))
    return out


def read_truth(path):
    """Per round: ordered list of (turn, me(x, y), [bullets])."""
    rounds = defaultdict(list)
    with gzip.open(path, "rt") as f:
        for line in f:
            if not line.startswith("T,"):
                continue
            p = line.rstrip("\n").split(",", 13)
            if len(p) < 13:
                continue
            r, t = int(p[1]), int(p[2])
            me = (float(p[3]), float(p[4]))
            bullets = parse_bullets(p[13]) if len(p) > 13 else []
            rounds[r].append((t, me, bullets))
    return rounds


def track(turns, owner):
    """Follows each bullet of {owner} by its own flight. Returns tracks: dicts with first and last
    turn index, last position, heading and power."""
    open_tracks = []
    done = []
    for i, (_, _, bullets) in enumerate(turns):
        mine = [b for b in bullets if b[0] == owner]
        used = [False] * len(mine)
        still = []
        for tr in open_tracks:
            v = speed(tr["power"])
            px = tr["x"] + v * math.sin(tr["h"])
            py = tr["y"] + v * math.cos(tr["h"])
            hit = None
            for j, b in enumerate(mine):
                if used[j] or abs(b[4] - tr["power"]) > 0.011 or abs(b[3] - tr["h"]) > 0.02:
                    continue
                if math.hypot(b[1] - px, b[2] - py) < MATCH:
                    hit = j
                    break
            if hit is None:
                done.append(tr)
            else:
                used[hit] = True
                b = mine[hit]
                tr["x"], tr["y"], tr["last"] = b[1], b[2], i
                still.append(tr)
        for j, b in enumerate(mine):
            if not used[j]:
                still.append({"first": i, "last": i, "x": b[1], "y": b[2], "h": b[3], "power": b[4]})
        open_tracks = still
    done.extend(open_tracks)
    return done


def seg_box(x0, y0, x1, y1, cx, cy, half):
    """Whether the segment (x0, y0)-(x1, y1) meets the square of half-side {half} about (cx, cy)."""
    lo_x, hi_x, lo_y, hi_y = cx - half, cx + half, cy - half, cy + half
    t0, t1 = 0.0, 1.0
    dx, dy = x1 - x0, y1 - y0
    for p, q in ((-dx, x0 - lo_x), (dx, hi_x - x0), (-dy, y0 - lo_y), (dy, hi_y - y0)):
        if abs(p) < 1e-12:
            if q < 0:
                return False
        else:
            r = q / p
            if p < 0:
                t0 = max(t0, r)
            else:
                t1 = min(t1, r)
            if t0 > t1:
                return False
    return True


def seg_seg(a, b, tol=TOL):
    """Whether two segments cross, allowing {tol} px for the printed rounding."""
    (x1, y1, x2, y2), (x3, y3, x4, y4) = a, b
    d = (x2 - x1) * (y4 - y3) - (y2 - y1) * (x4 - x3)
    if abs(d) > 1e-9:
        t = ((x3 - x1) * (y4 - y3) - (y3 - y1) * (x4 - x3)) / d
        u = ((x3 - x1) * (y2 - y1) - (y3 - y1) * (x2 - x1)) / d
        la = math.hypot(x2 - x1, y2 - y1) or 1.0
        lb = math.hypot(x4 - x3, y4 - y3) or 1.0
        if -tol / la <= t <= 1 + tol / la and -tol / lb <= u <= 1 + tol / lb:
            return True
    # Near-parallel or just short: the closest approach of the endpoints.
    def pt_seg(px, py, sx, sy, ex, ey):
        vx, vy = ex - sx, ey - sy
        l2 = vx * vx + vy * vy
        s = 0.0 if l2 == 0 else max(0.0, min(1.0, ((px - sx) * vx + (py - sy) * vy) / l2))
        return math.hypot(px - sx - s * vx, py - sy - s * vy)
    return min(pt_seg(x1, y1, x3, y3, x4, y4), pt_seg(x2, y2, x3, y3, x4, y4),
               pt_seg(x3, y3, x1, y1, x2, y2), pt_seg(x4, y4, x1, y1, x2, y2)) <= tol


def next_seg(tr):
    v = speed(tr["power"])
    return (tr["x"], tr["y"], tr["x"] + v * math.sin(tr["h"]), tr["y"] + v * math.cos(tr["h"]))


def prev_seg(tr):
    v = speed(tr["power"])
    return (tr["x"] - v * math.sin(tr["h"]), tr["y"] - v * math.cos(tr["h"]), tr["x"], tr["y"])


def met(e, o):
    """Whether bullets {e} and {o}, both last seen on the same turn, met on the next one. The engine
    moves bullets one at a time and checks each against the others' lines as they stand, so the one
    moved first meets the other's line from the turn before: either bullet's new segment may cross
    the other's new or previous one (the order of play behind the kernel's possible shadow, MOVE-1)."""
    return (seg_seg(next_seg(e), next_seg(o)) or seg_seg(next_seg(e), prev_seg(o))
            or seg_seg(prev_seg(e), next_seg(o)))


def would_hit(tr, turns, start, field=(FIELD_W, FIELD_H)):
    """Flies a met bullet on from its last position against the subject's path from turn index
    {start} (the turn it was met on)."""
    v = speed(tr["power"])
    x, y = tr["x"], tr["y"]
    for i in range(start, len(turns)):
        nx, ny = x + v * math.sin(tr["h"]), y + v * math.cos(tr["h"])
        mx, my = turns[i][1]
        if seg_box(x, y, nx, ny, mx, my, HALF + TOL):
            return True
        if not (0 <= nx <= field[0] and 0 <= ny <= field[1]):
            return False
        x, y = nx, ny
    return False


def read_round(turns, field=(FIELD_W, FIELD_H)):
    """Counts for one round: fired, hit, met, met_would_hit, inks and punches that met."""
    c = defaultdict(int)
    enemy = track(turns, "E")
    ours = track(turns, "H")
    ends = defaultdict(list)
    for tr in ours:
        ends[tr["last"]].append(tr)
    last = len(turns) - 1
    for tr in enemy:
        c["fired"] += 1
        i = tr["last"]
        if i >= last:
            c["live_at_end"] += 1
            continue
        seg = next_seg(tr)
        mx, my = turns[i + 1][1]
        # A meeting is checked first: a bullet our ink stopped on the turn it would have reached
        # the body was stopped, not a hit.
        met_by = next((o for o in ends[i] if met(tr, o)), None)
        if met_by is None:
            c["hit" if seg_box(*seg, mx, my, HALF + TOL) else "other"] += 1
            continue
        c["met"] += 1
        c["met_ink" if met_by["power"] <= 0.1 + 1e-6 else "met_punch"] += 1
        if would_hit(tr, turns, i + 1, field):
            c["met_would_hit"] += 1
    for tr in ours:
        c["ours"] += 1
        if tr["power"] <= 0.1 + 1e-6:
            c["inks"] += 1
    return c


INK_RE = re.compile(r"INK round=\d+ .*?shaded=([0-9.]+) inks=(\d+) met=(\d) hit=(\d)")


def read_ink_records(path):
    """Sepia's own INK records (INK-6): planned shade per wave, met and hit."""
    shaded, waves, met, hit = 0.0, 0, 0, 0
    if not os.path.exists(path):
        return None
    with open(path, errors="replace") as f:
        for line in f:
            m = INK_RE.search(line)
            if m:
                waves += 1
                shaded += float(m.group(1))
                met += int(m.group(3))
                hit += int(m.group(4))
    return {"waves": waves, "shaded": shaded, "met": met, "hit": hit} if waves else None


# <opponent>-<seed>, then the arm's label on a multi-arm run, or the warm-run suffix (warm,
# baseline-warm), which is read as an arm of its own.
DIR_RE = re.compile(r"^(?P<opp>.+?)-(?P<seed>\d+)(?:-(?P<arm>.+))?$")


def collect(runs, arms_wanted, field=(FIELD_W, FIELD_H)):
    """{(arm, opponent): {"c": counts summed, "seeds": {seed: counts}, "ink": records summed}}."""
    out = defaultdict(lambda: {"c": defaultdict(int), "seeds": defaultdict(lambda: defaultdict(int)),
                               "ink": defaultdict(float)})
    for run in runs:
        bdir = os.path.join(run, "battles")
        if not os.path.isdir(bdir):
            print(f"ink_read: no battles/ in {run}", file=sys.stderr)
            continue
        for name in sorted(os.listdir(bdir)):
            m = DIR_RE.match(name)
            tp = os.path.join(bdir, name, "truth.log.gz")
            if not m or not os.path.exists(tp):
                continue
            arm = m.group("arm") or os.path.basename(os.path.normpath(run))
            if arms_wanted and arm not in arms_wanted:
                continue
            key = (arm, m.group("opp"))
            # A seed is a sample within its run: two runs may reuse the same seed numbers.
            sample = (run, m.group("seed"))
            for turns in read_truth(tp).values():
                rc = read_round(turns, field)
                for k, v in rc.items():
                    out[key]["c"][k] += v
                    out[key]["seeds"][sample][k] += v
            ink = read_ink_records(os.path.join(bdir, name, "hadur.log"))
            if ink:
                for k, v in ink.items():
                    out[key]["ink"][k] += v
    return out


def cover(c):
    d = c["hit"] + c["met_would_hit"]
    return c["met_would_hit"] / d if d else float("nan")


def mean_ci(xs):
    xs = [x for x in xs if not math.isnan(x)]
    n = len(xs)
    if n == 0:
        return float("nan"), float("nan")
    m = sum(xs) / n
    if n < 2:
        return m, float("nan")
    sd = math.sqrt(sum((x - m) ** 2 for x in xs) / (n - 1))
    return m, t95(n - 1) * sd / math.sqrt(n)


def t95(df):
    """Student's t, two-sided 95%, for {df} degrees of freedom: the table to 15, then the
    Cornish-Fisher expansion about the normal quantile (within 0.002 from 16 on)."""
    table = {1: 12.706, 2: 4.303, 3: 3.182, 4: 2.776, 5: 2.571, 6: 2.447, 7: 2.365, 8: 2.306,
             9: 2.262, 10: 2.228, 11: 2.201, 12: 2.179, 13: 2.160, 14: 2.145, 15: 2.131}
    if df in table:
        return table[df]
    z = 1.959964
    return z + (z ** 3 + z) / (4 * df) + (5 * z ** 5 + 16 * z ** 3 + 3 * z) / (96 * df ** 2)


def pct(x):
    return "-" if math.isnan(x) else f"{100 * x:.1f}%"


def render(data):
    lines = ["| Arm | Shooter | Fired | Hit rate | Hit rate unmet | Cover pooled (seed mean +- 95%) | Met by ink / punch | Inks fired | Planned shade |",
             "|---|---|---|---|---|---|---|---|---|"]
    by_arm = defaultdict(lambda: defaultdict(int))
    for (arm, opp) in sorted(data):
        d = data[(arm, opp)]
        c = d["c"]
        for k, v in c.items():
            by_arm[arm][k] += v
        f = c["fired"] or 1
        m, ci = mean_ci([cover(s) for s in d["seeds"].values()])
        cov = pct(cover(c)) + ("" if math.isnan(ci) else f" ({pct(m)} +- {100 * ci:.1f})")
        ink = d["ink"]
        planned = pct(ink["shaded"] / ink["waves"]) if ink.get("waves") else "-"
        lines.append(f"| {arm} | {opp} | {c['fired']} | {pct(c['hit'] / f)} | "
                     f"{pct((c['hit'] + c['met_would_hit']) / f)} | {cov} | "
                     f"{c['met_ink']} / {c['met_punch']} | {c['inks']} | {planned} |")
    for arm, c in sorted(by_arm.items()):
        f = c["fired"] or 1
        lines.append(f"| {arm} | **all** | {c['fired']} | {pct(c['hit'] / f)} | "
                     f"{pct((c['hit'] + c['met_would_hit']) / f)} | {pct(cover(c))} | "
                     f"{c['met_ink']} / {c['met_punch']} | {c['inks']} | |")
    return "\n".join(lines)


def main(argv=None):
    ap = argparse.ArgumentParser(description=__doc__, formatter_class=argparse.RawDescriptionHelpFormatter)
    ap.add_argument("runs", nargs="+", help="bench work dirs")
    ap.add_argument("--arm", action="append", default=[], help="only these arms (repeatable)")
    ap.add_argument("--md", help="also write the table to this file")
    ap.add_argument("--field", default="800x600", help="the battlefield, WIDTHxHEIGHT (default 800x600)")
    a = ap.parse_args(argv)
    w, h = (float(x) for x in a.field.lower().split("x"))
    table = render(collect(a.runs, set(a.arm), (w, h)))
    print(table)
    if a.md:
        with open(a.md, "w") as f:
            f.write(table + "\n")


if __name__ == "__main__":
    main()

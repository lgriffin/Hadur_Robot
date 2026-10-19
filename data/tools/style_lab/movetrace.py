"""Movement traces: a robot's movement as plain arrays, outside Robocode.

A trace is one battle of one subject robot against one shooter: per round, per tick, the
subject's true x, y, heading, velocity and energy, the shooter's, and the ticks the shooter
fired (with power). Everything else in the style lab (fingerprints, the gun panel, the style
map, the generator) reads traces only, so a recorded battle and a generated movement are
judged by the same code.

Recorded traces come from the bench's truth logs (hadur-bench work/<run>/battles/<shooter>-<seed>/
truth.log.gz, subject first); generated ones from generator.py. Coordinates are Robocode's:
x east, y north, heading 0 north and clockwise, radians.
"""
import gzip
import math
import os
from collections import defaultdict

import numpy as np

FIELD_W, FIELD_H = 800.0, 600.0
HALF_BOT = 18.0
COLS = ("t", "x", "y", "h", "v", "e", "sx", "sy", "sh", "sv", "se")


class Round:
    """One round: arrays named as COLS (subject first, shooter prefixed s), and fires {tick: power}."""

    def __init__(self, arr, fires):
        arr = np.asarray(arr, dtype=float)
        for i, c in enumerate(COLS):
            setattr(self, c, arr[:, i] if len(arr) else np.zeros(0))
        self.fires = dict(fires)
        self.n = len(arr)

    def alive(self):
        return (self.e > 0) & (self.se > 0)


class Trace:
    """One battle: subject name, shooter name, rounds in order."""

    def __init__(self, subject, shooter, rounds, label=""):
        self.subject, self.shooter, self.rounds, self.label = subject, shooter, rounds, label

    def ticks(self):
        return sum(r.n for r in self.rounds)


def read_truth(path, subject="", shooter="", label=""):
    rows = defaultdict(list)
    fires = defaultdict(dict)
    with gzip.open(path, "rt") as f:
        for line in f:
            p = line.rstrip("\n").split(",")
            if p[0] == "T" and len(p) >= 13:
                rows[int(p[1])].append((int(p[2]), *map(float, p[3:13])))
            elif p[0] == "F" and len(p) >= 5 and p[3] == "E":
                fires[int(p[1])][int(p[2])] = float(p[4])
    rounds = [Round(rows[r], fires.get(r, {})) for r in sorted(rows) if len(rows[r]) >= 30]
    return Trace(subject, shooter, rounds, label)


def read_work_one(work, run):
    """[Trace, ...] for one subject's run directory (its battles in order)."""
    out = []
    bdir = os.path.join(work, run, "battles")
    if not os.path.isdir(bdir):
        return out
    for b in sorted(os.listdir(bdir)):
        tp = os.path.join(bdir, b, "truth.log.gz")
        if os.path.exists(tp):
            try:
                out.append(read_truth(tp, run, b.rsplit("-", 1)[0], b))
            except (OSError, EOFError, ValueError):
                continue
    return out


def read_work(work):
    """{subject: [Trace, ...]} from a work directory of bench runs (one run directory per subject)."""
    out = {}
    for run in sorted(os.listdir(work)):
        traces = read_work_one(work, run)
        if traces:
            out[run] = traces
    return out


def bullet_speed(power):
    return 20.0 - 3.0 * power


def norm_angle(a):
    return (a + math.pi) % (2 * math.pi) - math.pi


def frame(r):
    """Per-tick features in the shooter's frame for one round, as a dict of arrays:
    dist, bearing (shooter to subject, absolute), lat (lateral velocity, + clockwise round
    the shooter), adv (advancing velocity, + toward the shooter), wall (distance to the
    nearest wall), since_fire (ticks since the shooter last fired, 999 before its first shot),
    cycle (ticks between the shooter's shots, the round's median), to_impact (ticks until the
    next enemy bullet in the air crosses the distance it was fired at, 999 with none)."""
    dx, dy = r.x - r.sx, r.y - r.sy
    dist = np.hypot(dx, dy)
    bearing = np.arctan2(dx, dy)
    rel = r.h - bearing
    lat = r.v * np.sin(rel)
    adv = -r.v * np.cos(rel)
    wall = np.minimum.reduce([r.x, r.y, FIELD_W - r.x, FIELD_H - r.y])
    since = np.full(r.n, 999.0)
    impact = np.full(r.n, 999.0)
    air = []
    last = None
    for i in range(r.n):
        tk = int(r.t[i])
        if tk in r.fires:
            last = tk
            air.append(tk + dist[i] / bullet_speed(r.fires[tk]))
        if last is not None:
            since[i] = tk - last
        air = [a for a in air if a > tk]
        if air:
            impact[i] = min(air) - tk
    ticks = sorted(r.fires)
    gaps = np.diff(ticks)
    cycle = float(np.median(gaps)) if len(gaps) else 14.0
    return {"dist": dist, "bearing": bearing, "lat": lat, "adv": adv, "wall": wall,
            "since_fire": since, "cycle": cycle, "to_impact": impact}


def arrival(r, i, power):
    """Index j of the tick a bullet fired by the shooter at index i (it leaves the next tick from
    where the shooter stands now) reaches the subject, or None if the round ends first."""
    speed = bullet_speed(power)
    ox, oy = r.sx[i], r.sy[i]
    alive = r.alive()
    for j in range(i + 1, r.n):
        if not alive[j]:
            return None
        if math.hypot(r.x[j] - ox, r.y[j] - oy) <= (j - i) * speed:
            return j
    return None


def write_csv(trace, path):
    """Export one trace as CSV (gzip if the path ends in .gz): round plus COLS plus fire power."""
    op = gzip.open if path.endswith(".gz") else open
    with op(path, "wt") as f:
        f.write("round," + ",".join(COLS) + ",fire\n")
        for k, r in enumerate(trace.rounds):
            for i in range(r.n):
                vals = ",".join(f"{getattr(r, c)[i]:.2f}" for c in COLS)
                f.write(f"{k},{vals},{r.fires.get(int(r.t[i]), 0):.2f}\n")

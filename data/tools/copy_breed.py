"""Breeds copies of the gun shooting at us from truth logs, with no battles (COPY-1).

A learning gun is a program whose only input is how its target has moved, and a truth log holds
exactly how we moved and every bullet the enemy fired. So a copy of that program, replayed over
the log and fed the same history, should fire the same bullets. This tool grows such a copy for
each opponent of a truth-log run, by family:

  hist   a segmented guess-factor histogram: which features slice it and into how many (and the
         range the distance slices span), the bins,
         whether it learns from real shots or from a wave every tick, how fast it forgets, how wide
         a visit is smoothed, and the fire lag;
  knn    a nearest-neighbour guess-factor gun: six feature weights, the neighbours, the kernel
         width, shots or every tick, the memory cap and the fire lag;
  pm     a pattern matcher on (velocity, turn) symbols: rounding, longest and least match, fire
         lag. Only 96 settings, so they are all scored, not bred.

The histogram and nearest-neighbour families are bred by a genetic algorithm: tournament of 3,
crossover gene by gene, mutation at 0.3 a gene, the best 2 kept, 20 generations on a sample of
400 shots from the first half of the rounds. A family whose best is under half the leader's
after 5 generations stops breeding. Every copy is then scored on the second half of the rounds:
the share of the opponent's real bullets it fires within 18 px of, at the body's range. The copy
learns from the whole battle as the real gun did; only the shots it is scored on differ.

Usage:
  python3 copy_breed.py RUN_DIR [RUN_DIR ...] [--arm si] [--out copies.tsv] [--jobs N]
      [--generations 20] [--sample 400] [--field 800x600] [--trace TRACE_TSV] [--limit N]

RUN_DIR holds battles/<opponent>-<seed>[-<arm>]/truth.log.gz, as bench-top20.sh writes them.
One row a battle: opponent, seed, the best family, the held-out share it reproduces (and the
share of the held-out bullets that hit), each family's best held-out share, and the winning genome
as a mode-table copy: line carries it ("copy: <genome> <robot name>").
With --trace, the points at stake are joined from a learn-trace tsv (columns opponent and
pts_at_stake, when present).
"""

import argparse
import gzip
import math
import os
import random
import re
import sys
from concurrent.futures import ProcessPoolExecutor

import numpy as np

BODY = 18.0
"""Half a robot's width: a copy's bullet within this many px of the real one's at range counts."""
DIR_RE = re.compile(r"^(?P<opp>.+?)-(?P<seed>\d+)(?:-(?P<arm>.+))?$")
NFEAT = 6
FEATURES = ("lateral", "advancing", "distance", "accel", "since_rev", "wall")


def bullet_speed(power):
    return 20.0 - 3.0 * power


def wrap(a):
    return (a + math.pi) % (2 * math.pi) - math.pi


# --------------------------------------------------------------------------------------------
# Reading a truth log

class Battle:
    """One battle from the target's truth log, flattened over its rounds into tick arrays."""

    def __init__(self, path, field=(800.0, 600.0)):
        self.width, self.height = field
        rows, fires = [], []
        with gzip.open(path, "rt") as f:
            for line in f:
                if line.startswith("T,"):
                    p = line.rstrip("\n").split(",")
                    r, t = int(p[1]), int(p[2])
                    mx, my, mh, mv = float(p[3]), float(p[4]), float(p[5]), float(p[6])
                    ex, ey = float(p[8]), float(p[9])
                    toks = p[13].split() if len(p) > 13 else []
                    rows.append((r, t, mx, my, mh, mv, ex, ey, toks))
                elif line.startswith("F,"):
                    p = line.rstrip("\n").split(",")
                    if p[3] == "E":
                        fires.append((int(p[1]), int(p[2]), float(p[4])))
        n = len(rows)
        self.n = n
        self.round = np.array([r[0] for r in rows], dtype=np.int32)
        self.turn = np.array([r[1] for r in rows], dtype=np.int32)
        self.mx = np.array([r[2] for r in rows])
        self.my = np.array([r[3] for r in rows])
        self.mh = np.array([r[4] for r in rows])
        self.mv = np.array([r[5] for r in rows])
        self.ex = np.array([r[6] for r in rows])
        self.ey = np.array([r[7] for r in rows])
        index = {(r[0], r[1]): i for i, r in enumerate(rows)}
        self.rounds = int(self.round.max()) + 1 if n else 0
        # Each real shot: the tick index it appears, its power and the bullet's heading, read from
        # the first enemy bullet seen near the enemy on that turn.
        shots = []
        for r, t, power in fires:
            i = index.get((r, t))
            if i is None or i == 0:
                continue
            heading = None
            for tok in rows[i][8]:
                q = tok.split(":")
                if q[0] != "E" or len(q) < 5:
                    continue
                bx, by, bh, bp = float(q[1]), float(q[2]), float(q[3]), float(q[4])
                if abs(bp - power) > 0.02:
                    continue
                if math.hypot(bx - self.ex[i - 1], by - self.ey[i - 1]) <= bullet_speed(power) + 3:
                    heading = bh
                    break
            if heading is not None:
                shots.append((i, power, heading))
        self.shots = shots
        self._derive()

    def _derive(self):
        n = self.n
        dx, dy = self.mx - self.ex, self.my - self.ey
        self.dist = np.hypot(dx, dy)
        self.absb = np.arctan2(dx, dy)
        rel = self.mh - self.absb
        self.lat = self.mv * np.sin(rel)
        self.adv = self.mv * np.cos(rel)
        # The orbit direction, holding the last non-zero sign, and ticks since it changed.
        direction = np.ones(n)
        since = np.zeros(n)
        accel = np.zeros(n)
        d, s = 1.0, 0
        for i in range(n):
            if i > 0 and self.round[i] != self.round[i - 1]:
                d, s = 1.0, 0
            if self.lat[i] > 0.1 and d < 0:
                d, s = 1.0, 0
            elif self.lat[i] < -0.1 and d > 0:
                d, s = -1.0, 0
            else:
                s += 1
            direction[i] = d
            since[i] = s
            if i > 0 and self.round[i] == self.round[i - 1]:
                dv = abs(self.mv[i]) - abs(self.mv[i - 1])
                accel[i] = 0.0 if dv < -0.1 else (1.0 if dv > 0.1 else 0.5)
            else:
                accel[i] = 0.5
        self.dir = direction
        # Room ahead: how far the body could run along its heading (by its velocity's sign) to a wall.
        hx = np.sin(self.mh) * np.where(self.mv < 0, -1.0, 1.0)
        hy = np.cos(self.mh) * np.where(self.mv < 0, -1.0, 1.0)
        big = 1e9
        with np.errstate(divide="ignore", invalid="ignore"):
            rx = np.where(hx > 1e-9, (self.width - 18 - self.mx) / hx,
                          np.where(hx < -1e-9, (18 - self.mx) / hx, big))
            ry = np.where(hy > 1e-9, (self.height - 18 - self.my) / hy,
                          np.where(hy < -1e-9, (18 - self.my) / hy, big))
        room = np.clip(np.minimum(rx, ry), 0, 400) / 400.0
        self.features = np.stack([
            np.abs(self.lat) / 8.0,
            (self.adv + 8.0) / 16.0,
            np.clip(self.dist / 900.0, 0, 1),
            accel,
            np.minimum(since, 60) / 60.0,
            room,
        ], axis=1)
        # The power the enemy fired last, for the waves a gun that learns every tick sends.
        power = np.full(n, 2.0)
        last = 2.0
        shot_at = {i: p for i, p, _ in self.shots}
        for i in range(n):
            if i in shot_at:
                last = shot_at[i]
            power[i] = last
        self.power = power

    def waves(self, ticks_only):
        """Every wave a gun could learn from: (tick, break tick, guess factor). ticks_only=False
        gives the real shots only, else one a tick (as a gun that learns every tick does)."""
        if ticks_only:
            starts = np.arange(self.n)
            powers = self.power
        else:
            starts = np.array([i - 1 for i, _, _ in self.shots], dtype=np.int64)
            powers = np.array([p for _, p, _ in self.shots])
        out_t, out_k, out_g = [], [], []
        rnd = self.round
        for t, p in zip(starts, powers):
            if t < 0:
                continue
            speed = bullet_speed(p)
            ox, oy = self.ex[t], self.ey[t]
            k = t + 1
            while k < self.n and rnd[k] == rnd[t]:
                if speed * (k - t) >= math.hypot(self.mx[k] - ox, self.my[k] - oy):
                    break
                k += 1
            if k >= self.n or rnd[k] != rnd[t]:
                continue
            b = math.atan2(self.mx[k] - ox, self.my[k] - oy)
            esc = math.asin(min(1.0, 8.0 / speed))
            g = wrap(b - self.absb[t]) * self.dir[t] / esc
            out_t.append(t)
            out_k.append(k)
            out_g.append(max(-1.0, min(1.0, g)))
        return np.array(out_t, dtype=np.int64), np.array(out_k, dtype=np.int64), np.array(out_g)


# --------------------------------------------------------------------------------------------
# The families. Each copy takes the battle and the shots to score, and returns one bearing a shot.

def aim_from_gf(b, t, gf, power):
    esc = math.asin(min(1.0, 8.0 / bullet_speed(power)))
    return b.absb[t] + gf * b.dir[t] * esc


HIST_GENES = {
    "ticks": [0, 1],
    "bins": [15, 23, 31, 41, 51, 61],
    "s_lat": [1, 2, 3, 4, 5, 6],
    "s_dist": [1, 2, 3, 4, 5],
    "d_max": [600, 750, 900, 1200],
    "s_accel": [1, 3],
    "s_since": [1, 2, 3, 4, 5],
    "s_wall": [1, 2, 3, 4],
    "roll": [0.0, 0.001, 0.003, 0.01, 0.03, 0.1, 0.3],
    "smooth": [0, 1, 2, 3],
    "lag": [0, 1, 2],
}
KNN_GENES = {
    "w_lat": [0, 0.25, 0.5, 1, 2, 4],
    "w_adv": [0, 0.25, 0.5, 1, 2, 4],
    "w_dist": [0, 0.25, 0.5, 1, 2, 4],
    "w_accel": [0, 0.25, 0.5, 1, 2, 4],
    "w_since": [0, 0.25, 0.5, 1, 2, 4],
    "w_wall": [0, 0.25, 0.5, 1, 2, 4],
    "k": [1, 3, 5, 10, 20, 35, 50],
    "width": [0.02, 0.05, 0.1, 0.2, 0.3],
    "ticks": [0, 1],
    "cap": [500, 2000, 5000, 20000],
    "lag": [0, 1, 2],
}
PM_ROUND = [(1.0, 1.0), (2.0, 2.0), (0.5, 0.5), (8.0, 4.0)]
PM_LONGEST = [10, 20, 40, 80]
PM_LEAST = [1, 5, 10, 20]
PM_LAG = [0, 1, 2]


class Replay:
    """The data every copy of one battle shares: waves, shots and their split."""

    def __init__(self, battle, sample, rng):
        self.b = battle
        half = battle.rounds // 2
        shots = [(i, p, h) for i, p, h in battle.shots]
        self.fit = [s for s in shots if battle.round[s[0]] < half]
        self.held = [s for s in shots if battle.round[s[0]] >= half]
        if len(self.fit) > sample:
            self.fit_sample = sorted(rng.sample(self.fit, sample))
        else:
            self.fit_sample = self.fit
        self._waves = {}

    def waves(self, ticks):
        if ticks not in self._waves:
            t, k, g = self.b.waves(bool(ticks))
            order = np.argsort(k, kind="stable")
            self._waves[ticks] = (t[order], k[order], g[order])
        return self._waves[ticks]


def matched(b, shots, aims):
    """The share of shots whose copy bearing falls within BODY px of the real bullet at range."""
    if not shots:
        return 0.0
    hit = 0
    for (i, _, h), a in zip(shots, aims):
        if a is None:
            continue
        t = max(0, i - 1)
        if abs(wrap(h - a)) * b.dist[t] <= BODY:
            hit += 1
    return hit / len(shots)


def run_hist(rp, g, shots):
    b = rp.b
    wt, wk, wg = rp.waves(g["ticks"])
    slices = [g["s_lat"], 1, g["s_dist"], g["s_accel"], g["s_since"], g["s_wall"]]
    mult = np.cumprod([1] + slices[:-1])
    nseg = int(np.prod(slices))
    feats = b.features
    dmax = g["d_max"]

    def seg(rows):
        idx = np.zeros(len(rows), dtype=np.int64)
        for j, s in enumerate(slices):
            if s > 1:
                col = np.clip(b.dist[rows] / dmax, 0, 0.999) if j == 2 else feats[rows, j]
                idx += np.minimum((col * s).astype(np.int64), s - 1) * mult[j]
        return idx

    bins = g["bins"]
    wseg = seg(wt)
    wbin = np.clip(np.rint((wg + 1) / 2 * (bins - 1)).astype(np.int64), 0, bins - 1)
    hist = np.zeros((nseg, bins))
    sm = g["smooth"]
    kern = np.exp(-0.5 * (np.arange(-3 * sm, 3 * sm + 1) / sm) ** 2) if sm > 0 else np.ones(1)
    half = len(kern) // 2
    roll = g["roll"]
    aims = []
    j = 0
    lag = g["lag"]
    for i, p, _ in shots:
        ta = i - 1 - lag
        if ta < 0:
            aims.append(None)
            continue
        while j < len(wk) and wk[j] <= ta:
            row = hist[wseg[j]]
            if roll > 0:
                row *= (1 - roll)
            c = wbin[j]
            lo, hi = max(0, c - half), min(bins, c + half + 1)
            row[lo:hi] += kern[lo - c + half:hi - c + half]
            j += 1
        row = hist[seg(np.array([ta]))[0]]
        gf = 0.0 if row.max() <= 0 else np.argmax(row) * 2.0 / (bins - 1) - 1
        aims.append(aim_from_gf(b, ta, gf, p))
    return aims


def run_knn(rp, g, shots):
    b = rp.b
    wt, wk, wg = rp.waves(g["ticks"])
    w = np.array([g["w_lat"], g["w_adv"], g["w_dist"], g["w_accel"], g["w_since"], g["w_wall"]])
    pts = b.features[wt] * w
    grid = np.linspace(-1, 1, 81)
    k, width, cap, lag = g["k"], g["width"], g["cap"], g["lag"]
    aims = []
    j = 0
    for i, p, _ in shots:
        ta = i - 1 - lag
        if ta < 0:
            aims.append(None)
            continue
        while j < len(wk) and wk[j] <= ta:
            j += 1
        if j == 0:
            aims.append(aim_from_gf(b, ta, 0.0, p))
            continue
        lo = max(0, j - cap)
        q = b.features[ta] * w
        d = np.sum((pts[lo:j] - q) ** 2, axis=1)
        kk = min(k, j - lo)
        near = np.argpartition(d, kk - 1)[:kk] if kk < len(d) else np.arange(len(d))
        gfs = wg[lo:j][near]
        dens = np.exp(-0.5 * ((grid[:, None] - gfs[None, :]) / width) ** 2).sum(axis=1)
        aims.append(aim_from_gf(b, ta, grid[np.argmax(dens)], p))
    return aims


class PatternData:
    """Symbols of (velocity, turn) a tick per rounding, as bytes for fast search."""

    def __init__(self, b):
        self.b = b
        turn = np.zeros(b.n)
        same = b.round[1:] == b.round[:-1]
        turn[1:] = np.where(same, np.vectorize(wrap)(b.mh[1:] - b.mh[:-1]), 0.0)
        self.turn = turn
        self._sym = {}

    def symbols(self, rounding):
        if rounding not in self._sym:
            rv, rt = rounding
            v = np.rint(self.b.mv / rv).astype(np.int64) + 64
            t = np.rint(np.degrees(self.turn) / rt).astype(np.int64) + 64
            v = np.clip(v, 1, 127)
            t = np.clip(t, 1, 127)
            arr = np.empty(2 * self.b.n, dtype=np.uint8)
            arr[0::2] = v
            arr[1::2] = t
            self._sym[rounding] = arr.tobytes()
        return self._sym[rounding]


def run_pm(rp, pd, g, shots):
    b = rp.b
    data = pd.symbols(g["round"])
    longest, least, lag = g["longest"], g["least"], g["lag"]
    aims = []
    for i, p, _ in shots:
        ta = i - 1 - lag
        if ta < 1:
            aims.append(None)
            continue
        found = -1
        n = longest
        while n >= least:
            start = ta - n + 1
            if start < 0:
                n -= 1
                continue
            key = data[2 * start:2 * (ta + 1)]
            # The latest earlier match whose replay has at least one tick after it.
            at = data.rfind(key, 0, 2 * ta)
            while at >= 0 and at % 2:
                at = data.rfind(key, 0, at + 2 * n - 1)
            if at >= 0:
                found = at // 2 + n - 1
                break
            n = n // 2 if n > 8 else n - 1
        if found < 0:
            aims.append(aim_from_gf(b, ta, 0.0, p))
            continue
        speed = bullet_speed(p)
        ox, oy = b.ex[ta], b.ey[ta]
        x, y, h = b.mx[ta], b.my[ta], b.mh[ta]
        j = found + 1
        steps = 0
        while j < ta and steps < 120:
            h += pd.turn[j]
            v = b.mv[j]
            x = min(max(x + v * math.sin(h), 18), b.width - 18)
            y = min(max(y + v * math.cos(h), 18), b.height - 18)
            steps += 1
            if speed * (steps + 1) >= math.hypot(x - ox, y - oy):
                break
            j += 1
            if j < b.n and b.round[j] != b.round[j - 1]:
                break
        aims.append(math.atan2(x - ox, y - oy))
    return aims


# --------------------------------------------------------------------------------------------
# Breeding

def random_genome(space, rng):
    return {k: rng.choice(v) for k, v in space.items()}


def key(g):
    return tuple(sorted(g.items()))


def breed(space, run, rp, generations, population, rng, stop_check=None):
    """A genetic algorithm over one family. Returns [(fit score, genome)], best first."""
    seen = {}

    def score(g):
        kk = key(g)
        if kk not in seen:
            seen[kk] = matched(rp.b, rp.fit_sample, run(rp, g, rp.fit_sample))
        return seen[kk]

    pop = [random_genome(space, rng) for _ in range(population)]
    scored = sorted(((score(g), g) for g in pop), key=lambda x: -x[0])
    for gen in range(generations):
        if stop_check is not None and stop_check(gen, scored[0][0]):
            break
        nxt = [scored[0][1], scored[1][1]]
        while len(nxt) < population:
            a = max(rng.sample(scored, 3), key=lambda x: x[0])[1]
            c = max(rng.sample(scored, 3), key=lambda x: x[0])[1]
            child = {k: (a[k] if rng.random() < 0.5 else c[k]) for k in space}
            for k, v in space.items():
                if rng.random() < 0.3:
                    child[k] = rng.choice(v)
            nxt.append(child)
        scored = sorted(((score(g), g) for g in nxt), key=lambda x: -x[0])
    everything = sorted(((s, dict(kk)) for kk, s in seen.items()), key=lambda x: -x[0])
    return everything


def read_battle(path, field, generations, sample, seed):
    rng = random.Random(seed)
    b = Battle(path, field)
    rp = Replay(b, sample, rng)
    if len(rp.fit) < 20 or len(rp.held) < 20:
        return None
    families = {}
    # Pattern matchers: every setting, scored on the fit sample.
    pd = PatternData(b)
    pm = []
    for r in PM_ROUND:
        for lo in PM_LONGEST:
            for le in PM_LEAST:
                if le > lo:
                    continue
                for lag in PM_LAG:
                    g = {"round": r, "longest": lo, "least": le, "lag": lag}
                    pm.append((matched(b, rp.fit_sample, run_pm(rp, pd, g, rp.fit_sample)), g))
    pm.sort(key=lambda x: -x[0])
    families["pm"] = (pm, lambda rp_, g, s: run_pm(rp_, pd, g, s))
    leader = [pm[0][0]]

    def stop(gen, best):
        leader[0] = max(leader[0], best)
        return gen >= 5 and best < 0.5 * leader[0]

    hist = breed(HIST_GENES, run_hist, rp, generations, 40, rng, stop)
    leader[0] = max(leader[0], hist[0][0])
    families["hist"] = (hist, run_hist)
    knn = breed(KNN_GENES, run_knn, rp, generations, 30, rng, stop)
    families["knn"] = (knn, run_knn)
    # Held-out: the top three of each family by fit, scored on the second half.
    out = {}
    for name, (ranked, run) in families.items():
        best = (-1.0, None, 0.0)
        for fit, g in ranked[:3]:
            held = matched(b, rp.held, run(rp, g, rp.held))
            if held > best[0]:
                best = (held, g, fit)
        out[name] = best
    hits = held_hits(b, rp.held)
    return {"shots": len(b.shots), "held": len(rp.held), "held_hit": hits, "families": out}


def held_hits(b, held):
    """The share of held-out bullets that hit, from their tracks in the truth log (a bullet that
    vanishes within a body of us)."""
    if not held:
        return 0.0
    hit = 0
    for i, p, h in held:
        speed = bullet_speed(p)
        x0, y0 = b.ex[i - 1], b.ey[i - 1]
        k = i
        while k + 1 < b.n and b.round[k + 1] == b.round[i]:
            r = speed * (k + 1 - i + 1)
            x, y = x0 + r * math.sin(h), y0 + r * math.cos(h)
            if abs(x - b.mx[k + 1]) <= 26 and abs(y - b.my[k + 1]) <= 26:
                hit += 1
                break
            if not (0 <= x <= b.width and 0 <= y <= b.height):
                break
            k += 1
    return hit / len(held)


def job(args):
    path, opp, seed, field, generations, sample = args
    try:
        res = read_battle(path, field, generations, sample, hash((opp, seed)) & 0xFFFF)
    except Exception as e:  # one bad log must not stop a read of a thousand
        return opp, seed, None, repr(e)
    return opp, seed, res, None


def fmt_genome(family, g):
    """The genome as a copy: line carries it (COPY-2): the family, then gene=value pairs, joined by ;
    with no spaces (a pattern matcher's rounding as 2.0x2.0)."""
    def val(v):
        return f"{v[0]}x{v[1]}" if isinstance(v, tuple) else str(v)
    return ";".join([family] + [f"{k}={val(v)}" for k, v in g.items()])


def main(argv=None):
    ap = argparse.ArgumentParser(description=__doc__.split("\n")[0])
    ap.add_argument("runs", nargs="+")
    ap.add_argument("--arm", default=None, help="only battle dirs of this arm")
    ap.add_argument("--out", default=None)
    ap.add_argument("--jobs", type=int, default=os.cpu_count() or 1)
    ap.add_argument("--generations", type=int, default=20)
    ap.add_argument("--sample", type=int, default=400)
    ap.add_argument("--field", default="800x600")
    ap.add_argument("--limit", type=int, default=0, help="read at most this many battles")
    ap.add_argument("--only", default=None, help="only opponents whose name holds this text")
    a = ap.parse_args(argv)
    field = tuple(float(x) for x in a.field.split("x"))
    work = []
    for run in a.runs:
        bdir = os.path.join(run, "battles") if os.path.isdir(os.path.join(run, "battles")) else run
        for name in sorted(os.listdir(bdir)):
            m = DIR_RE.match(name)
            path = os.path.join(bdir, name, "truth.log.gz")
            if not m or not os.path.exists(path):
                continue
            if a.arm is not None and m.group("arm") != a.arm:
                continue
            if a.only and a.only not in m.group("opp"):
                continue
            work.append((path, m.group("opp"), m.group("seed"), field, a.generations, a.sample))
    if a.limit:
        work = work[:a.limit]
    out = open(a.out, "w") if a.out else sys.stdout
    out.write("opponent\tseed\tshots\theld\theld_hit\tbest\tbest_share\thist\tknn\tpm\tgenome\n")
    out.flush()
    done = 0
    with ProcessPoolExecutor(max_workers=a.jobs) as ex:
        for opp, seed, res, err in ex.map(job, work):
            done += 1
            if res is None:
                out.write(f"{opp}\t{seed}\t-\t-\t-\t-\t-\t-\t-\t-\t{err or 'too few shots'}\n")
            else:
                fam = res["families"]
                best = max(fam, key=lambda k: fam[k][0])
                out.write("\t".join([
                    opp, seed, str(res["shots"]), str(res["held"]), f"{res['held_hit']:.3f}", best,
                    f"{fam[best][0]:.3f}", f"{fam['hist'][0]:.3f}", f"{fam['knn'][0]:.3f}",
                    f"{fam['pm'][0]:.3f}", fmt_genome(best, fam[best][1])]) + "\n")
            out.flush()
            print(f"copy_breed: {done}/{len(work)} {opp}", file=sys.stderr)
    if a.out:
        out.close()


if __name__ == "__main__":
    main()

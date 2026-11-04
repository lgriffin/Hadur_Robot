#!/usr/bin/env python3
"""GKEY-2: fit each opponent's gun key offline (docs/bench/gun-key.md).

    python3 data/tools/gun_key_fit.py join WORKDIR [WORKDIR ...] --out DATA.npz [--jobs 4]
    python3 data/tools/gun_key_fit.py fit DATA.npz --out REPORT.md --keys KEYS.txt [--tsv PER_BOT.tsv]
        [--jobs 4] [--queries 300] [--min-gain 1.5] [--min-shots 200]

A bench run of a `gkrec` build leaves, per battle, a GKR record for every duel gun wave that broke (real and
virtual): the wave's ten GunFormula features, the target's guess factor when the wave passed it, and the
centre and half-width of the guess factors that would have hit it (GunKeyRecord).

`fit` replays the main gun on those records under other feature weights. At each real bullet, the waves of the
same battle that had already broken are searched with the key's weights (the default GunFormula weights times
ten multipliers, half steps of log2, or 0 to drop a feature), k = min(100, max(1, n / 10)) nearest; each
neighbour's guess factor is a candidate, scored by the Gaussian kernel of the others at a robot's width
(MainGun.aim, in guess factors instead of replayed displacement vectors), and the best candidate is the shot.
It hits when it lies within the real bullet's hit window. The score is the hit rate in percent.

Each opponent is fitted by coordinate descent from the default key, twice: on its first battle and scored on the
second, then the other way round. A key ships (a line of KEYS.txt) only when both held-out folds beat the
default by at least --min-gain points of hit rate over --min-shots scored shots in all; the shipped key is the fit
on all its battles. Lines are "m0 ... m9 name", the format of ShieldTableData.gunKeys() (gklist).
"""

import argparse
import math
import os
import re
import sys
from collections import defaultdict
from multiprocessing import Pool

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))

DEFAULTS = (3, 4, 3, 2, 2, 4, 2, 3, 2, 2)    # GunFormula.weights
DIMS = len(DEFAULTS)
VIRTUALITY = 8                               # the feature a query sets to 0 (an aiming query is a real bullet)
K_MAX, K_DIVISOR = 100, 10                   # MainGun's view
STEPS = (None,) + tuple(range(-6, 7))        # None = feature off; else multiplier 2^(q/2): x1/8 .. x8
DIR_RE = re.compile(r"^(?P<slug>.+)-(?P<seed>\d+)$")
THIN = 3                                     # virtual waves kept: one in THIN
FIELDS = 7                                   # fireTime, power, firing, distance, gf, hitGf, halfWidthGf


def parse_gkr(line):
    """(round, tick, values) of a GKR record, or None."""
    i = line.find("GKR,")
    if i < 0:
        return None
    f = line[i:].strip().split(",")
    if len(f) != 3 + FIELDS + DIMS:
        return None
    try:
        v = [float("nan") if x == "nan" else float(x) for x in f[3:]]
        return int(f[1]), int(f[2]), v
    except ValueError:
        return None


def read_battle(dirpath):
    """The battle's records in break order: list of (round, tick, values)."""
    log = os.path.join(dirpath, "hadur.log")
    out = []
    if not os.path.exists(log):
        return out
    with open(log, encoding="utf-8", errors="replace") as f:
        for line in f:
            if "GKR," in line:
                r = parse_gkr(line)
                if r is not None:
                    out.append(r)
    return out


def _join_job(args):
    path, name = args
    return name, read_battle(path)


def join(workdirs, out, jobs):
    import numpy as np
    tasks = []
    for w in workdirs:
        base = os.path.join(w, "battles")
        for name in sorted(os.listdir(base)):
            if DIR_RE.match(name):
                tasks.append((os.path.join(base, name), name))
    cols = defaultdict(list)
    bots, nb = {}, 0
    with Pool(max(1, jobs)) as pool:
        for name, recs in pool.imap_unordered(_join_job, tasks, chunksize=1):
            if not recs:
                continue
            slug = DIR_RE.match(name).group("slug")
            bi = bots.setdefault(slug, len(bots))
            for rnd, tick, v in recs:
                cols["bot"].append(bi)
                cols["battle"].append(nb)
                cols["round"].append(rnd)
                cols["tick"].append(tick)
                cols["vals"].append(v)
            nb += 1
    names = [None] * len(bots)
    for k, i in bots.items():
        names[i] = k
    vals = np.array(cols["vals"], dtype=np.float64)
    np.savez_compressed(out, bot=np.array(cols["bot"]), battle=np.array(cols["battle"]),
                        round=np.array(cols["round"]), tick=np.array(cols["tick"]), vals=vals,
                        names=np.array(names))
    print(f"joined {nb} battles, {len(names)} opponents, {len(vals)} waves -> {out}")


class Battle:
    """One battle's waves, prepared for fast replays of the main gun at its real bullets."""

    def __init__(self, rnd, tick, vals, queries, seed=0):
        import numpy as np
        order = np.lexsort((tick, rnd))
        rnd, tick, vals = rnd[order], tick[order], vals[order]
        fire, power, firing, dist, gf, hit, half = (vals[:, i] for i in range(FIELDS))
        feat = vals[:, FIELDS:]
        q = np.nonzero((firing > 0) & np.isfinite(hit) & np.isfinite(half))[0]
        if len(q) > queries:
            q = np.sort(np.random.default_rng(seed).choice(q, queries, replace=False))
        # A wave is known at a shot when it broke in an earlier round, or in the same round before the shot left.
        known = (rnd[None, :] < rnd[q][:, None]) | ((rnd[None, :] == rnd[q][:, None]) & (tick[None, :] < fire[q][:, None]))
        n = known.sum(axis=1)                                # the view's size at the shot sets k
        keep = n > 0
        q, known, n = q[keep], known[keep], n[keep]
        # Memory: virtual waves are thinned to one in THIN (real ones all kept); k shrinks with them, so the
        # neighbourhood covers the same share of the view.
        thin = (firing > 0) | (np.arange(len(firing)) % THIN == 0)
        known = known & thin[None, :]
        kept = known.sum(axis=1)
        self.n = len(q)
        if self.n == 0:
            return
        cols = np.nonzero(known.any(axis=0))[0]
        known = known[:, cols]
        qf = feat[q].copy()
        qf[:, VIRTUALITY] = 0
        self.diff2 = ((qf[:, None, :] - feat[None, cols, :]) ** 2).astype(np.float32)   # shots x waves x dims
        self.mask = ~known
        self.k = np.clip(np.round(np.clip(n // K_DIVISOR, 1, K_MAX) * kept / n).astype(int), 1, K_MAX)
        self.gf = gf[cols]
        speed = 20 - 3 * power[q]
        mea = np.arcsin(np.clip(8 / speed, 0, 1))
        self.band = 2 * np.arctan(18 / np.maximum(dist[q], 1)) / mea
        self.hit, self.half = hit[q], half[q]

    def hits(self, weights):
        """How many of the shots the main gun replayed under these weights would have hit."""
        import numpy as np
        if self.n == 0:
            return 0
        w2 = np.asarray(weights, dtype=np.float32) ** 2
        d = self.diff2 @ w2
        d[self.mask] = np.inf
        kmax = int(self.k.max())
        idx = np.argpartition(d, kmax - 1, axis=1)[:, :kmax]
        dd = np.take_along_axis(d, idx, axis=1)
        o = np.argsort(dd, axis=1)
        idx = np.take_along_axis(idx, o, axis=1)
        valid = np.arange(kmax)[None, :] < self.k[:, None]
        cand = self.gf[idx]                                   # shots x k
        u = (cand[:, :, None] - cand[:, None, :]) / self.band[:, None, None]
        dens = (np.exp(-0.5 * u * u) * valid[:, None, :]).sum(axis=2) - 1
        dens[~valid] = -np.inf
        pick = cand[np.arange(self.n), dens.argmax(axis=1)]
        return int((np.abs(pick - self.hit) <= self.half).sum())


def key_weights(steps):
    return [0.0 if s is None else d * 2 ** (s / 2) for d, s in zip(DEFAULTS, steps)]


def rate(battles, steps):
    shots = sum(b.n for b in battles)
    return 100.0 * sum(b.hits(key_weights(steps)) for b in battles) / shots if shots else float("nan")


def descend(battles, passes=2):
    """Coordinate descent from the default key; returns (steps, rate)."""
    best = [0] * DIMS
    top = rate(battles, best)
    for _ in range(passes):
        moved = False
        for d in range(DIMS):
            for s in STEPS:
                if s == best[d]:
                    continue
                trial = best[:d] + [s] + best[d + 1:]
                r = rate(battles, trial)
                if r > top + 1e-9:
                    best, top, moved = trial, r, True
        if not moved:
            break
    return best, top


def fit_bot(args):
    name, parts, queries = args
    battles = [Battle(*p, queries=queries, seed=i) for i, p in enumerate(parts)]
    battles = [b for b in battles if b.n > 0]
    shots = sum(b.n for b in battles)
    row = {"name": name, "battles": len(battles), "shots": shots}
    if len(battles) < 2:
        return row
    base = rate(battles, [0] * DIMS)
    folds = []
    for i in range(len(battles)):
        train = [b for j, b in enumerate(battles) if j != i]
        steps, _ = descend(train)
        folds.append(rate([battles[i]], steps) - rate([battles[i]], [0] * DIMS))
    steps, full = descend(battles)
    row.update(base=base, full=full, folds=folds, steps=steps)
    return row


def fit(data, out, keys, tsv, jobs, queries, min_gain, min_shots):
    import numpy as np
    z = np.load(data, allow_pickle=False)
    names = [str(x) for x in z["names"]]
    tasks = []
    for bi, name in enumerate(names):
        sel = z["bot"] == bi
        parts = []
        for b in sorted(set(z["battle"][sel].tolist())):
            m = sel & (z["battle"] == b)
            parts.append((z["round"][m], z["tick"][m], z["vals"][m]))
        tasks.append((name, parts, queries))
    with Pool(max(1, jobs)) as pool:
        rows = list(pool.imap_unordered(fit_bot, tasks, chunksize=1))
    rows.sort(key=lambda r: -(min(r["folds"]) if r.get("folds") else -99))
    shipped = [r for r in rows if r.get("folds") and min(r["folds"]) >= min_gain and r["shots"] >= min_shots]
    lines = ["# Gun-key fit (GKEY-2)", "",
             f"{len(rows)} opponents, {sum(r['shots'] for r in rows)} replayed real bullets "
             f"(up to {queries} a battle). Hit rate of the main gun replayed in guess factors, default weights against "
             "the fitted key; held-out folds fit on the other battles.", ""]
    fitted = [r for r in rows if r.get("folds")]
    if fitted:
        allf = [f for r in fitted for f in r["folds"]]
        lines.append(f"Default hit rate {np.mean([r['base'] for r in fitted]):.1f}%; in-sample fitted "
                     f"{np.mean([r['full'] for r in fitted]):.1f}%; held-out gain {np.mean(allf):+.2f} points a fold "
                     f"(sd {np.std(allf):.2f}, {len(allf)} folds), {sum(1 for f in allf if f > 0)} of {len(allf)} positive.")
        lines.append(f"Keys shipping (both folds +{min_gain:g} or more, {min_shots}+ shots): {len(shipped)}.")
        lines += ["", "| Opponent | Shots | Default % | Fitted % (in sample) | Held-out folds | Key |", "|---|---:|---:|---:|---|---|"]
        for r in fitted:
            key = " ".join("off" if s is None else f"{2 ** (s / 2):.3g}" for s in r["steps"])
            lines.append(f"| {r['name']} | {r['shots']} | {r['base']:.1f} | {r['full']:.1f} | "
                         f"{', '.join(f'{f:+.1f}' for f in r['folds'])} | {key} |")
    with open(out, "w") as f:
        f.write("\n".join(lines) + "\n")
    with open(keys, "w") as f:
        for r in shipped:
            f.write(" ".join("0" if s is None else f"{2 ** (s / 2):.4g}" for s in r["steps"]) + " " + r["name"] + "\n")
    if tsv:
        with open(tsv, "w") as f:
            f.write("opponent\tshots\tdefault\tfitted\tfold_min\tfold_mean\n")
            for r in fitted:
                f.write(f"{r['name']}\t{r['shots']}\t{r['base']:.2f}\t{r['full']:.2f}\t{min(r['folds']):.2f}\t{np.mean(r['folds']):.2f}\n")
    print("\n".join(lines[:6]))


def main(argv=None):
    p = argparse.ArgumentParser()
    sub = p.add_subparsers(dest="cmd", required=True)
    j = sub.add_parser("join")
    j.add_argument("workdirs", nargs="+")
    j.add_argument("--out", required=True)
    j.add_argument("--jobs", type=int, default=4)
    f = sub.add_parser("fit")
    f.add_argument("data")
    f.add_argument("--out", required=True)
    f.add_argument("--keys", required=True)
    f.add_argument("--tsv")
    f.add_argument("--jobs", type=int, default=4)
    f.add_argument("--queries", type=int, default=200)
    f.add_argument("--min-gain", type=float, default=1.5)
    f.add_argument("--min-shots", type=int, default=200)
    a = p.parse_args(argv)
    if a.cmd == "join":
        join(a.workdirs, a.out, a.jobs)
    else:
        fit(a.data, a.out, a.keys, a.tsv, a.jobs, a.queries, a.min_gain, a.min_shots)


if __name__ == "__main__":
    main()

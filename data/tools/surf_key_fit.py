#!/usr/bin/env python3
"""SKEY-3: fit each opponent's surf key offline (docs/bench/surf-key.md).

    python3 data/tools/surf_key_fit.py join WORKDIR [WORKDIR ...] --out DATA.npz [--jobs 4]
    python3 data/tools/surf_key_fit.py fit DATA.npz --out REPORT.md --keys KEYS.txt [--tsv PER_BOT.tsv] [--jobs 4]
        [--min-gain 0.02] [--min-hits 30]

A bench run of an `oracle,skrec` build with the truth log on leaves, per battle, ORC and SKN records for every
wave the surf rated, HF records for every bullet that hit us, and the engine's truth log. `join` reuses the
enemy-gun oracle's join (gun_oracle.join_battle: each ORC record on a real wave matched to the bullet the enemy
fired on it, its true guess factor, and whether it hit us) and adds the wave's surf key from its SKN record: the
nine MoveFormula values the hit views search on.

`fit` asks, per opponent, which key explains that opponent's bullets best. The model is the "normal" hit view as
MoveController builds it: at each of the opponent's bullets, the hits of the same battle already known to the
robot (seen, before the bullet's fire time) are searched with the key's weights (the default weights times nine
multipliers, quarter steps of log2), the k = min(20, max(1, n / 5)) nearest each count 1 / distance, and each
puts the surf's kernel (2^-|u| integrated over a robot's width, u in half-widths times the key's width) at its
guess factor. The surface is normalised over [-1, 1] and mixed with 5% uniform; a bullet scores log2 of the
density at its true guess factor over the uniform's (bits; 0 = no better than guessing).

Each opponent is fitted by coordinate descent from the default key, twice: on its first battle and scored on
the second, then the other way round. The key ships (a line of KEYS.txt) only when both held-out folds gain at
least --min-gain bits a bullet over the default and the opponent has --min-hits hits; the shipped key is the
fit on all its battles. Lines are "m1 ... m9 bw name", the format of ShieldTableData.surfKeys() (sklist).
"""

import argparse
import math
import os
import sys
from multiprocessing import Pool

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import gun_oracle as go  # noqa: E402
import aes_rank as ar  # noqa: E402

DEFAULTS = (4, 3, 3, 3, 2, 4, 1, 3, 2)   # MoveFormula.weights
DIMS = len(DEFAULTS)
K, K_DIVISOR = 20, 5                      # the "normal" view
MIN_DISTANCE = 1e-6                       # MoveController.MIN_DISTANCE floor on the squared distance
STEPS = range(-12, 13)                    # weight multipliers 2^(q/4): x1/8 .. x8
WIDTHS = (0.5, 0.7, 1.0, 1.4, 2.0, 2.8)
SAMPLES = 41                              # guess factors a surface is rated at, evenly over [-1, 1]
EPS = 0.05


def parse_skn(line):
    """((round, fire), nine key values) of an SKN record, or None."""
    i = line.find("SKN,")
    if i < 0:
        return None
    p = line[i:].rstrip("\n").split(",")
    try:
        return (int(p[1]), int(p[3])), [float(x) for x in p[6:6 + DIMS]]
    except (ValueError, IndexError):
        return None


def join_battle(dirpath):
    rows, _, _ = go.join_battle(dirpath)
    keys = {}
    log = os.path.join(dirpath, "hadur.log")
    if os.path.exists(log):
        with open(log, encoding="utf-8", errors="replace") as f:
            for line in f:
                if "SKN," in line:
                    r = parse_skn(line)
                    if r is not None:
                        keys.setdefault(r[0], r[1])
    out = []
    for r in rows:
        k = keys.get((r["round"], r["fire"]))
        if k is None or len(k) != DIMS:
            continue
        out.append((r["round"], r["fire"], r["gf"], r["dist"], r["mea"], r["seen"], r["hit"], k))
    return out


def _job(args):
    path, name = args
    return name, join_battle(path)


def join(workdirs, out, jobs):
    import numpy as np
    tasks = []
    for w in workdirs:
        base = os.path.join(w, "battles")
        for name in sorted(os.listdir(base)):
            bid = ar.battle_id(name)
            if bid is None or bid[2]:
                continue
            tasks.append((os.path.join(base, name), name))
    fields = ("bot", "battle", "round", "fire", "gf", "dist", "mea", "seen", "hit", "key")
    cols = {k: [] for k in fields}
    bots = {}
    with Pool(max(1, jobs)) as pool:
        for b, (name, rows) in enumerate(pool.imap(_job, tasks, chunksize=1)):
            bi = bots.setdefault(ar.battle_id(name)[0], len(bots))
            for rnd, fire, gf, dist, mea, seen, hit, k in rows:
                for c, v in zip(fields, (bi, b, rnd, fire, gf, dist, mea, seen, hit, k)):
                    cols[c].append(v)
    if not cols["bot"]:
        sys.exit("no joined waves: is this a run of an oracle,skrec build with the truth log on?")
    names = sorted(bots, key=bots.get)
    np.savez_compressed(out, bots=np.array(names), **{k: np.array(v, dtype=np.float64 if k in ("gf", "dist", "mea", "hit", "key") else np.int64)
                                                      for k, v in cols.items()})
    print("battles %d, bullets with a key %d (hits %d), opponents %d -> %s"
          % (len(tasks), len(cols["bot"]), int(sum(cols["seen"])), len(names), out))


class Battle:
    """One battle's bullets in time order, with what the robot knew of its hits at each one."""

    def __init__(self, z, idx):
        import numpy as np
        order = idx[np.lexsort((z["fire"][idx], z["round"][idx]))]
        self.gf = z["gf"][order]
        self.key = z["key"][order]
        self.half = np.arctan(18.0 / np.maximum(z["dist"][order], 18.0))
        # A wave's guess factors span [-1, 1] over its escape angle, so the kernel's half width in guess factors
        # is the robot's half width (radians) over the wave's escape angle.
        self.hw = self.half / z["mea"][order]
        # time on one axis: round * 100000 + tick
        t_fire = z["round"][order] * 100000 + z["fire"][order]
        seen = z["seen"][order] == 1
        t_hit = np.where(seen, z["round"][order] * 100000 + np.nan_to_num(z["hit"][order], nan=0), np.inf)
        self.hits = np.nonzero(seen)[0]
        # known[i, j]: hit j was known when bullet i was fired
        self.known = t_hit[self.hits][None, :] < t_fire[:, None]
        self.n = len(self.gf)


def bits(battle, mult, width):
    """Mean bits a bullet of the model with key (mult, width) on this battle; NaN with no rated bullet."""
    import numpy as np
    b = battle
    if len(b.hits) == 0:
        return float("nan"), 0
    w = np.array(DEFAULTS, dtype=float) * mult
    hk = b.key[b.hits]
    d2 = (((b.key[:, None, :] - hk[None, :, :]) * w) ** 2).sum(axis=2)
    d2 = np.where(b.known, d2, np.inf)
    n_known = b.known.sum(axis=1)
    rated = n_known >= 1
    if not rated.any():
        return float("nan"), 0
    grid = np.linspace(-1.0, 1.0, SAMPLES)
    total, count = 0.0, 0
    for i in np.nonzero(rated)[0]:
        kk = min(K, max(1, int(n_known[i]) // K_DIVISOR))
        nn = np.argpartition(d2[i], kk - 1)[:kk]
        sc = 1.0 / np.sqrt(np.maximum(d2[i, nn], MIN_DISTANCE))
        g = b.gf[b.hits[nn]]
        hw = b.hw[i]
        bw = hw * width
        at = np.append(grid, b.gf[i])
        lo, hi = at - hw, at + hw

        def cdf(x):
            u = (x[:, None] - g[None, :]) / bw
            m = 1.0 - np.power(2.0, -np.abs(u))
            return np.where(u >= 0, m, -m)

        mass = (cdf(hi) - cdf(lo)) @ sc
        area = mass[:SAMPLES].sum() * (2.0 / (SAMPLES - 1))
        p = mass[SAMPLES] / area if area > 0 else 0.5
        total += math.log2((1 - EPS) * p / 0.5 + EPS)
        count += 1
    return total / count, count


def score(battles, mult, width):
    s, n = 0.0, 0
    for b in battles:
        v, c = bits(b, mult, width)
        if c:
            s += v * c
            n += c
    return s / n if n else float("nan")


FIT_WIDTH = True                          # --no-width fixes the width at 1


def descend(battles, sweeps=3):
    """Coordinate descent from the default key; returns (mult, width, bits)."""
    import numpy as np
    q = np.zeros(DIMS, dtype=int)
    wi = WIDTHS.index(1.0)
    best = score(battles, 2.0 ** (q / 4.0), WIDTHS[wi])
    if not math.isfinite(best):
        return 2.0 ** (q / 4.0), WIDTHS[wi], best
    for _ in range(sweeps):
        moved = False
        for d in range(DIMS + 1):
            if d == DIMS:
                cands = [(q, j) for j in range(len(WIDTHS)) if j != wi] if FIT_WIDTH else []
            else:
                cands = []
                for step in (-4, -2, -1, 1, 2, 4):
                    v = q[d] + step
                    if v in STEPS:
                        c = q.copy()
                        c[d] = v
                        cands.append((c, wi))
            for c, j in cands:
                s = score(battles, 2.0 ** (c / 4.0), WIDTHS[j])
                if s > best + 1e-4:
                    best, q, wi, moved = s, c, j, True
        if not moved:
            break
    return 2.0 ** (q / 4.0), WIDTHS[wi], best


def fit_bot(args):
    import numpy as np
    name, battles = args
    hits = int(sum(len(b.hits) for b in battles))
    ones, wd = np.ones(DIMS), 1.0
    row = {"name": name, "battles": len(battles), "hits": hits, "bullets": int(sum(b.n for b in battles))}
    row["default"] = score(battles, ones, wd)
    folds = []
    if len(battles) >= 2:
        for k in range(2):
            train = [b for i, b in enumerate(battles) if i % 2 == k]
            test = [b for i, b in enumerate(battles) if i % 2 != k]
            m, w, _ = descend(train)
            folds.append(score(test, m, w) - score(test, ones, wd))
    row["folds"] = folds
    m, w, s = descend(battles)
    row["mult"], row["width"], row["fitted"] = m, w, s
    return row


def fit(path, out, keys, tsv, jobs, min_gain, min_hits):
    import numpy as np
    z = np.load(path)
    names = list(z["bots"])
    tasks = []
    for bi, name in enumerate(names):
        idx = np.nonzero(z["bot"] == bi)[0]
        battles = [Battle(z, idx[z["battle"][idx] == b]) for b in sorted(set(z["battle"][idx].tolist()))]
        tasks.append((name, battles))
    with Pool(max(1, jobs)) as pool:
        rows = list(pool.imap(fit_bot, tasks, chunksize=1))
    rows.sort(key=lambda r: -min(r["folds"]) if r["folds"] else 0)
    shipped = [r for r in rows if r["folds"] and min(r["folds"]) >= min_gain and r["hits"] >= min_hits]
    with open(keys, "w") as f:
        f.write("# SKEY-3 surf keys (data/tools/surf_key_fit.py fit %s): both held-out folds gain >= %.3f bits a bullet,"
                " >= %d hits. SURF_KEY for sklist.\n" % (os.path.basename(path), min_gain, min_hits))
        for r in shipped:
            f.write(" ".join("%.4g" % v for v in r["mult"]) + " %.4g %s\n" % (r["width"], r["name"]))
    gains = [min(r["folds"]) for r in rows if r["folds"]]
    with open(out, "w") as f:
        f.write("# SKEY-3: per-opponent surf-key fit\n\n")
        f.write("Data: `%s`, %d opponents, %d bullets, %d hits. Model: the normal hit view (k <= 20, n/5), the surf's"
                " kernel; bits a bullet over uniform, 5%% uniform mixed in.\n\n" % (
                    os.path.basename(path), len(rows), sum(r["bullets"] for r in rows), sum(r["hits"] for r in rows)))
        f.write("Ship rule: both held-out folds gain >= %.3f bits a bullet and >= %d hits: **%d of %d shipped**."
                " Mean of the worse fold over all opponents: %+.4f bits.\n\n" % (
                    min_gain, min_hits, len(shipped), len(rows), sum(gains) / len(gains) if gains else float("nan")))
        f.write("| opponent | hits | default bits | fitted (all) | fold A gain | fold B gain | width | multipliers | ships |\n")
        f.write("|---|---:|---:|---:|---:|---:|---:|---|---|\n")
        for r in rows:
            fa = "%+.4f" % r["folds"][0] if r["folds"] else "-"
            fb = "%+.4f" % r["folds"][1] if len(r["folds"]) > 1 else "-"
            f.write("| %s | %d | %.4f | %.4f | %s | %s | %.2g | %s | %s |\n" % (
                r["name"], r["hits"], r["default"], r["fitted"], fa, fb, r["width"],
                " ".join("%.3g" % v for v in r["mult"]), "yes" if r in shipped else ""))
    if tsv:
        with open(tsv, "w") as f:
            f.write("name\thits\tdefault\tfitted\tfoldA\tfoldB\twidth\tmult\tships\n")
            for r in rows:
                f.write("%s\t%d\t%.5f\t%.5f\t%s\t%s\t%.3g\t%s\t%d\n" % (
                    r["name"], r["hits"], r["default"], r["fitted"],
                    "%.5f" % r["folds"][0] if r["folds"] else "", "%.5f" % r["folds"][1] if len(r["folds"]) > 1 else "",
                    r["width"], " ".join("%.4g" % v for v in r["mult"]), 1 if r in shipped else 0))
    print("%d of %d opponents shipped -> %s" % (len(shipped), len(rows), keys))


def main(argv=None):
    global FIT_WIDTH
    ap = argparse.ArgumentParser()
    sub = ap.add_subparsers(dest="cmd", required=True)
    p = sub.add_parser("join")
    p.add_argument("workdirs", nargs="+")
    p.add_argument("--out", required=True)
    p.add_argument("--jobs", type=int, default=4)
    p = sub.add_parser("fit")
    p.add_argument("data")
    p.add_argument("--out", required=True)
    p.add_argument("--keys", required=True)
    p.add_argument("--tsv")
    p.add_argument("--jobs", type=int, default=4)
    p.add_argument("--min-gain", type=float, default=0.02)
    p.add_argument("--min-hits", type=int, default=30)
    p.add_argument("--no-width", action="store_true", help="fit the nine weights only; the width stays 1")
    a = ap.parse_args(argv)
    FIT_WIDTH = not getattr(a, "no_width", False)
    if a.cmd == "join":
        join(a.workdirs, a.out, a.jobs)
    else:
        fit(a.data, a.out, a.keys, a.tsv, a.jobs, a.min_gain, a.min_hits)


if __name__ == "__main__":
    main()

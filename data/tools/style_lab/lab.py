#!/usr/bin/env python3
"""Style lab: movement as pattern and design, outside Robocode.

    python3 data/tools/style_lab/lab.py measure --work hadur-bench/work/style --out OUT
    python3 data/tools/style_lab/lab.py search  --out OUT [--evals 1200] [--jobs 4]
    python3 data/tools/style_lab/lab.py confirm --out OUT [--top 14] [--seeds 4]
    python3 data/tools/style_lab/lab.py ablate  --out OUT [--seeds 8]
    python3 data/tools/style_lab/lab.py draw    --out OUT
    python3 data/tools/style_lab/lab.py export  --work hadur-bench/work/style --out OUT/traces

measure  fingerprints every recorded subject and runs the gun panel over each battle
         (OUT/measured.json). The real shooter's hit rate comes from result.csv.
search   MAP-Elites over the generator: the style map (PCA of the real robots and 400 random styles)
         is cut into a grid, and each cell keeps the generated style the gun panel finds
         hardest to learn (OUT/elites.json).
confirm  re-runs the 14 least learnable styles (half of them far from every real robot) on
         fresh seeds (OUT/confirmed.json).
ablate   switches the best confirmed style's ingredients off one at a time (OUT/ablation.json).
draw     the style map, the gun panel, the judge's validation and per-robot trace glyphs (OUT/*.png).
export   every recorded trace as CSV, one file per battle, for use outside this lab.

Record traces first: bench each subject against hadur-bench/style-shooter.txt (one run
directory per subject under the work directory; see docs/bench/style-lab.md).
"""
import argparse
import csv
import json
import math
import os
import random
import sys
from multiprocessing import Pool

import numpy as np

HERE = os.path.dirname(os.path.abspath(__file__))
sys.path.insert(0, HERE)

import fingerprint as fpmod  # noqa: E402
import generator as gen  # noqa: E402
import guns  # noqa: E402
import movetrace  # noqa: E402

GRID = 14


def rates(res):
    return {k: v[0] / v[1] if v[1] else float("nan") for k, v in res.items()}


def add_res(a, b):
    for k, v in b.items():
        a.setdefault(k, [0, 0])
        a[k][0] += v[0]
        a[k][1] += v[1]
    return a


def real_hit_rate(work, subject, traces):
    """Hits by the real shooter over its shots, from result.csv damage and the mean power."""
    hits = shots = 0.0
    for tr in traces:
        p = os.path.join(work, subject, "battles", tr.label, "result.csv")
        if not os.path.exists(p):
            continue
        with open(p) as f:
            rows = list(csv.reader(f))
        if len(rows) < 2:
            continue
        rec = dict(zip(rows[0], rows[1]))
        powers = [pw for r in tr.rounds for pw in r.fires.values()]
        if not powers:
            continue
        pm = sum(powers) / len(powers)
        per_hit = 4 * pm + 2 * max(0.0, pm - 1)
        try:
            hits += float(rec["theirBulletDamage"]) / per_hit
            shots += len(powers)
        except (KeyError, ValueError):
            continue
    return hits / shots if shots else float("nan")


def measure_one(args):
    work, subject = args
    traces = movetrace.read_work_one(work, subject)
    fp = fpmod.fingerprint(traces)
    res = {}
    for tr in traces:
        add_res(res, guns.run(tr))
    return subject, fp, res, real_hit_rate(work, subject, traces), len(traces)


def cmd_measure(a):
    subjects = sorted(d for d in os.listdir(a.work) if os.path.isdir(os.path.join(a.work, d, "battles")))
    out = {}
    with Pool(a.jobs) as pool:
        for subject, fp, res, real, n in pool.imap_unordered(measure_one, [(a.work, s) for s in subjects]):
            if fp is None:
                continue
            r = rates(res)
            out[subject] = {"fingerprint": fp, "panel": r, "shots": res["knn"][1], "battles": n,
                            "best_gun": max(r[g] for g in guns.GUNS), "real_hit_rate": real}
            print(f"{subject:40s} best {out[subject]['best_gun']:.3f} knn {r['knn']:.3f} "
                  f"real {real:.3f} random {r['random']:.3f}", flush=True)
    os.makedirs(a.out, exist_ok=True)
    with open(os.path.join(a.out, "measured.json"), "w") as f:
        json.dump(out, f)


class StyleSpace:
    """Standardise fingerprints and project them on two principal axes.

    The scale and the axes come from the real robots plus a reference sample of random
    generated styles (reference.json, written by search), so a feature the real robots happen
    to agree on does not blow a generated style's distance up. Without the reference, the real
    robots alone set them."""

    def __init__(self, measured, reference=None):
        names = sorted(measured)
        X = np.array([fpmod.vector(measured[n]["fingerprint"]) for n in names])
        U = X if not reference else np.vstack([X, [fpmod.vector(r) for r in reference]])
        self.mu, self.sd = U.mean(axis=0), U.std(axis=0) + 1e-9
        ZU = (U - self.mu) / self.sd
        _, s, vt = np.linalg.svd(ZU - ZU.mean(axis=0), full_matrices=False)
        self.axes = vt[:2]
        self.explained = (s[:2] ** 2 / (s ** 2).sum()).tolist()
        Z = (X - self.mu) / self.sd
        self.names, self.real = names, Z @ self.axes.T
        self.Z = Z
        P = ZU @ self.axes.T
        lo, hi = P.min(axis=0), P.max(axis=0)
        pad = (hi - lo) * 0.05
        self.lo, self.hi = lo - pad, hi + pad

    def z(self, fp):
        return (fpmod.vector(fp) - self.mu) / self.sd

    def project(self, fp):
        return self.z(fp) @ self.axes.T

    def cell(self, p):
        c = np.floor((p - self.lo) / (self.hi - self.lo) * GRID).astype(int)
        return tuple(int(v) for v in np.clip(c, 0, GRID - 1))

    def novelty(self, fp):
        """Distance in the full standardised fingerprint to the nearest real robot."""
        return float(np.min(np.linalg.norm(self.Z - self.z(fp), axis=1)))

    def loadings(self):
        return {fpmod.FEATURES[i]: [float(self.axes[0, i]), float(self.axes[1, i])] for i in range(len(fpmod.FEATURES))}


def load_reference(out):
    p = os.path.join(out, "reference.json")
    if not os.path.exists(p):
        return None
    with open(p) as f:
        return json.load(f)


def evaluate(args):
    g, seed = args
    tr = gen.simulate(g, seed=seed)
    res = guns.run(tr)
    fp = fpmod.fingerprint([tr])
    r = rates(res)
    return g, seed, fp, r


def cmd_search(a):
    with open(os.path.join(a.out, "measured.json")) as f:
        measured = json.load(f)
    rng = random.Random(a.seed)
    archive = {}
    log = []
    n0 = min(a.evals // 3, 400)
    batch = [(gen.random_genome(rng), rng.randrange(10 ** 6)) for _ in range(n0)]
    with Pool(a.jobs) as pool:
        first = [x for x in pool.imap_unordered(evaluate, batch) if x[2] is not None]
        reference = [{k: fp[k] for k in fpmod.FEATURES} for _, _, fp, _ in first]
        with open(os.path.join(a.out, "reference.json"), "w") as f:
            json.dump(reference, f)
        space = StyleSpace(measured, reference)

        def place(g, seed, fp, r):
            if fp is None:
                return
            p = space.project(fp)
            c = space.cell(p)
            best = max(r[x] for x in guns.GUNS)
            rec = {"genome": g, "seed": seed, "xy": p.tolist(), "best_gun": best, "panel": r,
                   "novelty": space.novelty(fp), "fingerprint": {k: fp[k] for k in fpmod.FEATURES}}
            log.append({"xy": rec["xy"], "best_gun": best, "novelty": rec["novelty"]})
            if c not in archive or best < archive[c]["best_gun"]:
                archive[c] = rec

        for g, seed, fp, r in first:
            place(g, seed, fp, r)
        done = len(batch)
        print(f"{done} evals, {len(archive)} cells", flush=True)
        while done < a.evals:
            cells = list(archive.values())
            batch = []
            for _ in range(min(a.batch, a.evals - done)):
                parent = rng.choice(cells)
                batch.append((gen.mutate(parent["genome"], rng), rng.randrange(10 ** 6)))
            for g, seed, fp, r in pool.imap_unordered(evaluate, batch):
                place(g, seed, fp, r)
            done += len(batch)
            print(f"{done} evals, {len(archive)} cells", flush=True)
    out = {"cells": {f"{c[0]},{c[1]}": v for c, v in archive.items()}, "log": log,
           "explained": space.explained, "loadings": space.loadings(),
           "lo": space.lo.tolist(), "hi": space.hi.tolist(), "grid": GRID}
    with open(os.path.join(a.out, "elites.json"), "w") as f:
        json.dump(out, f)


def cmd_confirm(a):
    """Re-run the best elites on fresh seeds (and, as a control, 3 seeds each), to separate a
    real low hit rate from a lucky one."""
    with open(os.path.join(a.out, "elites.json")) as f:
        el = json.load(f)
    with open(os.path.join(a.out, "measured.json")) as f:
        measured = json.load(f)
    space = StyleSpace(measured, load_reference(a.out))
    # the least learnable styles overall, plus the least learnable of those far from every
    # real robot (further than three in four real robots are from their nearest neighbour)
    D = np.linalg.norm(space.Z[:, None, :] - space.Z[None, :, :], axis=2)
    np.fill_diagonal(D, np.inf)
    far = float(np.percentile(D.min(axis=1), 75))
    ranked = sorted(el["cells"].values(), key=lambda c: c["best_gun"])
    novel = [c for c in ranked if space.novelty(c["fingerprint"]) > far]
    cells = ranked[:a.top // 2]
    cells += [c for c in novel if c not in cells][:a.top - len(cells)]
    print(f"novel means further than {far:.2f} from every real robot; {len(novel)} of {len(ranked)} cells are", flush=True)
    jobs = [(c["genome"], 9000 + s) for c in cells for s in range(a.seeds)]
    with Pool(a.jobs) as pool:
        results = pool.map(evaluate, jobs)
    out = []
    for k, c in enumerate(cells):
        rs = results[k * a.seeds:(k + 1) * a.seeds]
        panel = {g: float(np.mean([r[3][g] for r in rs])) for g in list(guns.GUNS) + ["random"]}
        fps = [r[2] for r in rs if r[2]]
        xy = np.mean([space.project(fp) for fp in fps], axis=0)
        nov = float(np.mean([space.novelty(fp) for fp in fps]))
        out.append({"genome": c["genome"], "search_best": c["best_gun"], "panel": panel, "novel_threshold": far,
                    "best_gun": max(panel[g] for g in guns.GUNS), "xy": xy.tolist(), "novelty": nov,
                    "fingerprint": {f: float(np.mean([fp[f] for fp in fps])) for f in fpmod.FEATURES}})
        print(f"{k:2d} search {c['best_gun']:.3f} confirm {out[-1]['best_gun']:.3f} novelty {nov:.2f} "
              f"clock {c['genome']['clock']}", flush=True)
    with open(os.path.join(a.out, "confirmed.json"), "w") as f:
        json.dump(out, f)


ABLATIONS = {
    "as found": {},
    "no regime switch": {"p_regime": 0.0},
    "no wobble": {"wobble": 0.0},
    "no wall reversals": {"p_wall_rev": 0.0},
    "no wave coupling": {"p_wave": 0.0},
    "distance held loosely": {"dist_gain": 0.3},
    "closer (450)": {"pref_dist": 450.0},
    "no regime switch, no wobble": {"p_regime": 0.0, "wobble": 0.0},
    "plain random orbit": {"p_regime": 0.0, "wobble": 0.0, "p_wall_rev": 0.0, "p_wave": 0.0,
                           "clock": "uniform", "dwell_min": 10.0, "dwell_span": 40.0},
}


def cmd_ablate(a):
    """Switch the best confirmed style's ingredients off one at a time, on a.seeds fresh seeds."""
    with open(os.path.join(a.out, "confirmed.json")) as f:
        base = sorted(json.load(f), key=lambda c: c["best_gun"])[0]["genome"]
    jobs = [(dict(base, **v), 7000 + s) for v in ABLATIONS.values() for s in range(a.seeds)]
    with Pool(a.jobs) as pool:
        R = pool.map(evaluate, jobs)
    out = {}
    for k, name in enumerate(ABLATIONS):
        rs = R[k * a.seeds:(k + 1) * a.seeds]
        best = np.array([max(r[3][g] for g in guns.GUNS) for r in rs])
        ratio = best / np.array([r[3]["random"] for r in rs])
        se = math.sqrt(a.seeds)
        out[name] = {"best": float(best.mean()), "best_se": float(best.std() / se),
                     "ratio": float(ratio.mean()), "ratio_se": float(ratio.std() / se)}
        print(f"{name:28s} best {best.mean():.3f} +- {best.std() / se:.3f}  x random {ratio.mean():.2f} +- {ratio.std() / se:.2f}")
    with open(os.path.join(a.out, "ablation.json"), "w") as f:
        json.dump(out, f)


def cmd_export(a):
    os.makedirs(a.out, exist_ok=True)
    for subject, traces in movetrace.read_work(a.work).items():
        for tr in traces:
            movetrace.write_csv(tr, os.path.join(a.out, f"{subject}__{tr.label}.csv.gz"))


def cmd_draw(a):
    import draw
    draw.all_figures(a.out, a.work)


def main(argv=None):
    ap = argparse.ArgumentParser(description=__doc__.split("\n")[0])
    sub = ap.add_subparsers(dest="cmd", required=True)
    for name in ("measure", "search", "draw", "export", "confirm", "ablate"):
        p = sub.add_parser(name)
        p.add_argument("--out", required=True)
        p.add_argument("--work", default="hadur-bench/work/style")
        p.add_argument("--jobs", type=int, default=4)
        p.add_argument("--evals", type=int, default=1200)
        p.add_argument("--batch", type=int, default=100)
        p.add_argument("--seed", type=int, default=17)
        p.add_argument("--top", type=int, default=12)
        p.add_argument("--seeds", type=int, default=3)
    a = ap.parse_args(argv)
    {"measure": cmd_measure, "search": cmd_search, "draw": cmd_draw, "export": cmd_export,
     "confirm": cmd_confirm, "ablate": cmd_ablate}[a.cmd](a)


if __name__ == "__main__":
    main()

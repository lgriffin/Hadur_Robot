#!/usr/bin/env python3
"""Read a kitlab bench run as a predicted division APS (docs/kitlab.md, KIT-9).

  python3 tools/kitlab_read.py SET RUN_DIR [--ref REF_DIR --ref-aps 87.54] [--rankings R.json]
                               [--pairs]

SET is the kitlab_fields.py set file (its role column carries each bot's weight); RUN_DIR is the
bench's --out directory. Each battle's score share is score / (score + theirScore), averaged over
seeds per opponent, then weighted over the set: the estimate of the division APS.

With --ref (a run of a reference bot whose live APS is known, on the same set and seeds) the
paired estimate is ref-aps + weighted mean of (ours - ref) per opponent, which cancels most of
the sample's bias. --rankings adds each opponent's live APS to --pairs (the per-opponent table).
"""
import argparse
import csv
import glob
import json
import math
import os


def load_set(path):
    rows = []
    for line in open(path):
        if not line.strip() or line.lstrip().startswith("#"):
            continue
        name, role, jar = [c.strip() for c in line.split("|")][:3]
        rows.append((name, float(role.split(":")[1]), jar[:-4]))
    return rows


def by_seed(run):
    """{jar stem: {seed: share}} from RUN_DIR/battles/<stem>-<seed>/result.csv; failed battles left out."""
    out = {}
    for f in glob.glob(os.path.join(run, "battles", "*", "result.csv")):
        stem, seed = os.path.basename(os.path.dirname(f)).rsplit("-", 1)
        for r in csv.DictReader(open(f)):
            if r["ok"] != "true":
                continue
            s, t = float(r["score"]), float(r["theirScore"])
            if s + t > 0:
                out.setdefault(stem, {})[seed] = 100 * s / (s + t)
    return out


def shares(run):
    """{jar stem: [share per battle]}, in seed order."""
    return {k: [v[x] for x in sorted(v)] for k, v in by_seed(run).items()}


def paired(ours, ref, stem):
    """Mean and SE of ours - ref on one opponent: per seed where both ran it, else unpaired."""
    if stem not in ours or stem not in ref:
        return None
    seeds = sorted(set(ours[stem]) & set(ref[stem]))
    if len(seeds) >= 2:
        return mean_se([ours[stem][x] - ref[stem][x] for x in seeds])
    mo, so = mean_se(list(ours[stem].values()))
    mr, sr = mean_se(list(ref[stem].values()))
    return mo - mr, math.hypot(so, sr)


def weighted(rows, value):
    num = den = 0.0
    var = 0.0
    for name, w, stem in rows:
        v = value(stem)
        if v is None:
            continue
        m, se = v
        num += w * m
        den += w
        var += (w * se) ** 2
    if den == 0:
        return None
    return num / den, math.sqrt(var) / den


def mean_se(xs):
    m = sum(xs) / len(xs)
    if len(xs) < 2:
        return m, 0.0
    sd = math.sqrt(sum((x - m) ** 2 for x in xs) / (len(xs) - 1))
    return m, sd / math.sqrt(len(xs))


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument("set")
    ap.add_argument("run")
    ap.add_argument("--ref")
    ap.add_argument("--ref-aps", type=float)
    ap.add_argument("--rankings")
    ap.add_argument("--pairs", action="store_true")
    a = ap.parse_args()
    rows = load_set(a.set)
    ours = shares(a.run)
    missing = [n for n, _, s in rows if s not in ours]
    est = weighted(rows, lambda s: mean_se(ours[s]) if s in ours else None)
    battles = sum(len(v) for v in ours.values())
    print("%s: %d battles, %d of %d opponents%s" % (a.run, battles, len(rows) - len(missing), len(rows),
                                                   " (missing: %s)" % ", ".join(missing) if missing else ""))
    if est:
        print("  raw weighted APS %.2f +- %.2f (SE from seeds only)" % est)
    ref = shares(a.ref) if a.ref else {}
    if a.ref:
        ours_seeds, ref_seeds = by_seed(a.run), by_seed(a.ref)
        dif = weighted(rows, lambda s: paired(ours_seeds, ref_seeds, s))
        refraw = weighted(rows, lambda s: mean_se(ref[s]) if s in ref else None)
        if refraw is None:
            print("  reference %s has no successful battles on this set: no paired estimate" % a.ref)
        elif dif is None:
            print("  no opponent ran in both runs: no paired estimate")
        else:
            print("  reference raw weighted APS %.2f (live %s)" % (refraw[0], a.ref_aps))
            print("  ours - reference %+.2f +- %.2f" % dif)
        if a.ref_aps is not None and dif is not None and refraw is not None:
            print("  PAIRED ESTIMATE %.2f +- %.2f" % (a.ref_aps + dif[0], dif[1]))
    if a.pairs:
        live = {}
        if a.rankings:
            live = {b["name"]: b["APS"] for b in json.load(open(a.rankings))}
        print("\n| Opponent | Weight | Live APS | Ours | Ref | Diff |\n|---|---|---|---|---|---|")
        for name, w, s in rows:
            o = "%.1f" % mean_se(ours[s])[0] if s in ours else "-"
            r = "%.1f" % mean_se(ref[s])[0] if s in ref else "-"
            d = "%+.1f" % (mean_se(ours[s])[0] - mean_se(ref[s])[0]) if s in ours and s in ref else "-"
            print("| %s | %g | %s | %s | %s | %s |" % (name, w, live.get(name, "-"), o, r, d))


if __name__ == "__main__":
    main()

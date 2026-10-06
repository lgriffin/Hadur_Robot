#!/usr/bin/env python3
"""How repeatable is one (jar, opponent, seed) battle, and does seed pairing cancel noise?

Standard library only. Give it two or more bench TSVs that ran the same jar on the same
opponents and seeds in different sessions (different host load, say), or one TSV with a run
column naming the session:

  python3 data/tools/repeatability.py A.tsv B.tsv [C.tsv ...]
  python3 data/tools/repeatability.py ALL.tsv --run-col session
  python3 data/tools/repeatability.py A.tsv B.tsv --build 3.7 --per-opponent

For each build present in every run, over the (opponent, seed) cells present in every run:
  per-battle SD     pooled within-cell SD of the metric across runs, in points (shares x100)
  identical         cells whose value is exactly the same in every run, and run pairs that match
  ICC               one-way intraclass correlation of a cell's repeated values: the share of
                    variance that belongs to the (opponent, seed) cell rather than to the run.
                    "ICC within opponent" first removes each opponent's mean, so it asks only
                    whether a seed reproduces its own result within an opponent, which is what
                    seed pairing relies on.
Then, in each run with two builds, per opponent the correlation across seeds between the
candidate's and the baseline's metric, the mean of those correlations, and the ratio
Var(candidate - baseline) / (Var(candidate) + Var(baseline)): 1.00 means pairing by seed buys no
variance reduction, below 1 means it helps.
"""

import argparse
import csv
import math
import os
import sys
from collections import OrderedDict

NAN = float("nan")


def load_runs(paths, run_col, metric):
    """OrderedDict run label -> list of rows. One path with a run column splits on it."""
    runs = OrderedDict()
    for path in paths:
        with open(path, encoding="utf-8", newline="") as f:
            reader = csv.DictReader(f, delimiter="\t")
            for row in reader:
                if row.get("ok", "true").strip().lower() == "false":
                    continue
                label = row[run_col] if run_col and run_col in row else os.path.basename(path)
                runs.setdefault(label, []).append(row)
    for rows in runs.values():
        if rows and metric not in rows[0]:
            if metric == "score_share" and "score" in rows[0] and "theirScore" in rows[0]:
                for row in rows:
                    s, t = float(row["score"]), float(row["theirScore"])
                    row["score_share"] = repr(s / (s + t)) if s + t > 0 else ""
            else:
                raise SystemExit("column %r missing" % metric)
    return runs


def cells(rows, build, metric, scale):
    """dict (opponent, seed) -> value for one build."""
    out = {}
    for row in rows:
        if row["build"] == build and row.get(metric, "") != "":
            out[(row["opponent"], row["seed"])] = float(row[metric]) * scale
    return out


def mean(xs):
    return sum(xs) / len(xs)


def variance(xs):
    m = mean(xs)
    return sum((x - m) ** 2 for x in xs) / (len(xs) - 1)


def icc1(groups):
    """One-way ICC(1) for equal-sized groups of repeated values (rows = cells, k per cell)."""
    n = len(groups)
    k = len(groups[0])
    if n < 2 or k < 2:
        return NAN
    grand = mean([v for g in groups for v in g])
    msb = k * sum((mean(g) - grand) ** 2 for g in groups) / (n - 1)
    msw = sum((v - mean(g)) ** 2 for g in groups for v in g) / (n * (k - 1))
    denom = msb + (k - 1) * msw
    return (msb - msw) / denom if denom > 0 else NAN


def pearson(xs, ys):
    if len(xs) < 3:
        return NAN
    mx, my = mean(xs), mean(ys)
    sxx = sum((x - mx) ** 2 for x in xs)
    syy = sum((y - my) ** 2 for y in ys)
    if sxx == 0 or syy == 0:
        return NAN
    return sum((x - mx) * (y - my) for x, y in zip(xs, ys)) / math.sqrt(sxx * syy)


def repeat_stats(per_run):
    """Repeatability of one build. per_run is a list of {cell: value}, one per run.

    Returns None when the runs share fewer than two cells.
    """
    keys = sorted(set.intersection(*(set(r) for r in per_run)))
    if len(keys) < 2:
        return None
    k = len(per_run)
    groups = [[r[key] for r in per_run] for key in keys]
    within = sum(variance(g) for g in groups) / len(groups)
    identical_cells = sum(1 for g in groups if max(g) - min(g) < 1e-9)
    pairs = identical_pairs = 0
    for g in groups:
        for i in range(k):
            for j in range(i + 1, k):
                pairs += 1
                identical_pairs += abs(g[i] - g[j]) < 1e-9
    by_opp = {}
    for key, g in zip(keys, groups):
        by_opp.setdefault(key[0], []).append(g)
    centred = []
    for gs in by_opp.values():
        m = mean([v for g in gs for v in g])
        centred.extend([v - m for v in g] for g in gs)
    return dict(cells=len(keys), runs=k, sd=math.sqrt(within), identical_cells=identical_cells,
                pairs=pairs, identical_pairs=identical_pairs, icc=icc1(groups),
                icc_within=icc1(centred))


def pairing(rows, candidate, baseline, metric, scale):
    """Per opponent, within one run: correlation of candidate and baseline shares over seeds,
    and Var(diff) / (Var(cand) + Var(base)). Returns {opponent: dict(n, r, ratio)}."""
    c = cells(rows, candidate, metric, scale)
    b = cells(rows, baseline, metric, scale)
    by_opp = {}
    for key in c:
        if key in b:
            by_opp.setdefault(key[0], []).append((c[key], b[key]))
    out = {}
    for opp, pairs in by_opp.items():
        cs, bs = [p[0] for p in pairs], [p[1] for p in pairs]
        ratio = NAN
        if len(pairs) >= 3 and variance(cs) + variance(bs) > 0:
            ratio = variance([x - y for x, y in pairs]) / (variance(cs) + variance(bs))
        out[opp] = dict(n=len(pairs), r=pearson(cs, bs), ratio=ratio)
    return out


def fmt(x, places=2, signed=False):
    if x is None or math.isnan(x):
        return "n/a"
    return ("%+.*f" if signed else "%.*f") % (places, x)


def render(runs, build_stats, pairings, per_opponent, unit):
    out = ["runs (%d): %s" % (len(runs), ", ".join(runs)), ""]
    for build, st in build_stats.items():
        if st is None:
            out.append("build %s: fewer than two cells in common" % build)
            continue
        out.append("build %s: %d cells x %d runs, metric in %s" % (build, st["cells"], st["runs"], unit))
        out.append("  per-battle SD            %s" % fmt(st["sd"]))
        out.append("  identical in every run   %d of %d cells; %d of %d run pairs" % (
            st["identical_cells"], st["cells"], st["identical_pairs"], st["pairs"]))
        out.append("  ICC                      %s" % fmt(st["icc"]))
        out.append("  ICC within opponent      %s" % fmt(st["icc_within"]))
    out.append("")
    for label, per_opp in pairings.items():
        rs = [v["r"] for v in per_opp.values() if not math.isnan(v["r"])]
        ratios = [v["ratio"] for v in per_opp.values() if not math.isnan(v["ratio"])]
        out.append("run %s: candidate vs baseline per-seed correlation over %d opponents: "
                   "mean r %s, median r %s; mean paired/unpaired variance ratio %s" % (
                       label, len(rs), fmt(mean(rs) if rs else NAN, 3, True),
                       fmt(sorted(rs)[len(rs) // 2] if rs else NAN, 3, True),
                       fmt(mean(ratios) if ratios else NAN)))
        if per_opponent:
            for opp, v in sorted(per_opp.items()):
                out.append("    %-34s n=%2d r=%s ratio=%s" % (
                    opp[:34], v["n"], fmt(v["r"], 3, True), fmt(v["ratio"])))
    return "\n".join(out)


def main(argv=None):
    ap = argparse.ArgumentParser(description=__doc__,
                                 formatter_class=argparse.RawDescriptionHelpFormatter)
    ap.add_argument("tsv", nargs="+", help="two or more TSVs of the same jar and seeds, or one with a run column")
    ap.add_argument("--run-col", help="column naming the run/session (default: run or session if present)")
    ap.add_argument("--metric", default="score_share", help="column to compare (default score_share)")
    ap.add_argument("--scale", type=float, help="multiply the metric (default 100 for *_share, else 1)")
    ap.add_argument("--build", action="append", help="build label to analyse (repeatable; default all common)")
    ap.add_argument("--candidate", help="candidate build for the pairing check (default: first build)")
    ap.add_argument("--baseline", help="baseline build for the pairing check (default: second build)")
    ap.add_argument("--per-opponent", action="store_true", help="list the per-opponent correlations")
    args = ap.parse_args(argv)

    run_col = args.run_col
    if run_col is None and len(args.tsv) == 1:
        with open(args.tsv[0], encoding="utf-8") as f:
            header = f.readline().rstrip("\r\n").split("\t")
        run_col = next((c for c in ("run", "session") if c in header), None)
    runs = load_runs(args.tsv, run_col if len(args.tsv) == 1 else None, args.metric)
    if len(runs) < 2:
        raise SystemExit("need at least two runs (give two TSVs, or one with a --run-col)")
    share = args.metric.endswith("_share")
    scale = args.scale if args.scale is not None else (100.0 if share else 1.0)
    unit = "points" if share and scale == 100.0 else "units of " + args.metric

    builds_per_run = [OrderedDict.fromkeys(r["build"] for r in rows) for rows in runs.values()]
    common = [b for b in builds_per_run[0] if all(b in x for x in builds_per_run)]
    if args.build:
        common = [b for b in common if b in args.build]
    if not common:
        raise SystemExit("no build appears in every run")
    build_stats = OrderedDict(
        (b, repeat_stats([cells(rows, b, args.metric, scale) for rows in runs.values()]))
        for b in common)

    pairings = OrderedDict()
    for label, rows in runs.items():
        builds = list(OrderedDict.fromkeys(r["build"] for r in rows))
        cand = args.candidate or builds[0]
        base = args.baseline or (builds[1] if len(builds) > 1 else None)
        if base and cand in builds and base in builds:
            pairings[label] = pairing(rows, cand, base, args.metric, scale)
    print(render(runs, build_stats, pairings, args.per_opponent, unit))
    return 0


if __name__ == "__main__":
    sys.exit(main())

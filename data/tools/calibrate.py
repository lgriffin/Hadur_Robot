#!/usr/bin/env python3
"""Regress bench score share per opponent on the live RoboRumble figure for the same build.

The live per-opponent figures are the BotDetails tables under data/rumble/parsed/
(docs/bench/live-3.8.md reads one). live-3.7.md and live-3.8.md themselves hold only ladder-level
numbers and per-opponent changes in prose, so they cannot be regressed. For each build that has
both a bench run and a saved BotDetails page, join on opponent name and report, in percentage points:

  offset      mean of (bench - live), with its SE
  fit         bench = intercept + slope * live (OLS), slope SE, correlation
  residual SD of the fit, set beside the SD that bench and live sampling noise alone would give

  python3 data/tools/calibrate.py
  python3 data/tools/calibrate.py --bench data/bench/X.tsv --bench data/bench/Y.tsv --list

Standard library only.
"""

import argparse
import csv
import math
import re
import sys
from pathlib import Path

import bench_tables as bt

ROOT = Path(__file__).resolve().parent.parent
DEFAULT_BENCH = [
    "bench/2026-10-06_hadur-3.8_top20-local_cold.tsv",
    "bench/2026-10-06_hadur-3.8_drussgt40-local_cold.tsv",
    "bench/2026-10-06_hadur-leak38-step1-16seeds-local_cold.tsv",
]
MIN_JOINED = 8


def live_page(build):
    pages = sorted((ROOT / "rumble" / "parsed").glob("*_roborumble_botdetails_hadur2.Hadur_%s.csv" % build))
    return pages[-1] if pages else None


def read_live(path):
    """{opponent: (aps, se)} from a BotDetails CSV; se is the page's interval / 1.96."""
    live = {}
    with open(path, encoding="utf-8", newline="") as f:
        for r in csv.DictReader(f):
            m = re.search(r"[\d.]+", r["aps_ci"])
            live[r["name"].strip()] = (float(r["aps"]), float(m.group()) / 1.96 if m else float("nan"))
    return live


def bench_by_build(paths):
    """{build: {opponent: [share pp, ...]}} pooled over the given per-battle tables."""
    out = {}
    for p in paths:
        rows = bt.read_tsv(p)
        if not bt.is_battle_table(rows):
            continue
        for r in rows:
            s = bt.share_pp(r)
            if s is not None:
                out.setdefault(bt.norm_build(r["build"]), {}).setdefault(r["opponent"], []).append(s)
    return out


def join(bench, live):
    """Rows (opponent, bench mean, bench se, live aps, live se) where both exist."""
    rows = []
    for opp, shares in sorted(bench.items()):
        if opp in live:
            se_b = bt.sd(shares) / math.sqrt(len(shares)) if len(shares) > 1 else float("nan")
            rows.append((opp, bt.mean(shares), se_b, live[opp][0], live[opp][1]))
    return rows


def ols(xs, ys):
    n = len(xs)
    mx, my = bt.mean(xs), bt.mean(ys)
    sxx = sum((x - mx) ** 2 for x in xs)
    sxy = sum((x - mx) * (y - my) for x, y in zip(xs, ys))
    syy = sum((y - my) ** 2 for y in ys)
    slope = sxy / sxx
    icpt = my - slope * mx
    sse = sum((y - icpt - slope * x) ** 2 for x, y in zip(xs, ys))
    resid_sd = math.sqrt(sse / (n - 2))
    return {"n": n, "slope": slope, "intercept": icpt, "slope_se": resid_sd / math.sqrt(sxx),
            "r": sxy / math.sqrt(sxx * syy), "resid_sd": resid_sd}


def noise_sd(rows):
    """SD the fit's residuals would have from bench and live sampling error alone."""
    v = [b * b + l * l for _, _, b, _, l in rows if not math.isnan(b) and not math.isnan(l)]
    return math.sqrt(bt.mean(v)) if v else float("nan")


def report(build, rows, page, list_rows=False):
    lines = ["Build %s: bench vs %s" % (build, page.name if page else "(no live per-opponent page saved)")]
    if page is None:
        lines.append("  no live per-opponent figures exist for this build, so there is nothing to calibrate against.")
        return lines
    n = len(rows)
    if n < MIN_JOINED:
        lines.append("  only %d opponents have both a bench figure and a live figure; too thin to fit a line." % n)
        return lines
    diffs = [b - l for _, b, _, l, _ in rows]
    fit = ols([r[3] for r in rows], [r[1] for r in rows])
    off_se = bt.sd(diffs) / math.sqrt(n)
    lines.append("  joined opponents: %d (live APS %.1f to %.1f)" % (n, min(r[3] for r in rows), max(r[3] for r in rows)))
    lines.append("  offset (bench - live): %+.2f pp, SE %.2f, SD of the differences %.2f" % (bt.mean(diffs), off_se, bt.sd(diffs)))
    inside = abs(fit["slope"] - 1) <= bt.t_crit95(n - 2) * fit["slope_se"]
    lines.append("  fit: bench = %.2f + %.3f * live; slope SE %.3f; r %.3f; slope 1 is %s the 95%% interval"
                 % (fit["intercept"], fit["slope"], fit["slope_se"], fit["r"], "inside" if inside else "outside"))
    lines.append("  residual SD: %.2f pp; sampling noise alone would give %.2f pp" % (fit["resid_sd"], noise_sd(rows)))
    if list_rows:
        lines.append("  %-42s %7s %6s %7s %6s %7s" % ("opponent", "bench", "se", "live", "se", "diff"))
        for opp, b, sb, l, sl in sorted(rows, key=lambda r: r[1] - r[3]):
            lines.append("  %-42s %7.2f %6.2f %7.2f %6.2f %+7.2f" % (opp, b, sb, l, sl, b - l))
    return lines


def main(argv=None):
    ap = argparse.ArgumentParser(description=__doc__.split("\n")[0])
    ap.add_argument("--bench", action="append", help="per-battle bench TSV (repeatable); default is the 3.8 duel runs")
    ap.add_argument("--live", help="a BotDetails CSV, used for every build instead of looking one up by version")
    ap.add_argument("--list", action="store_true", help="also list every joined opponent")
    args = ap.parse_args(argv)
    paths = [Path(p) for p in args.bench] if args.bench else [ROOT / p for p in DEFAULT_BENCH]
    by_build = bench_by_build(paths)
    if not by_build:
        print("no per-battle bench tables in the given files", file=sys.stderr)
        return 1
    for build in sorted(by_build, key=bt.version_key):
        page = Path(args.live) if args.live else live_page(build)
        rows = join(by_build[build], read_live(page)) if page else []
        print("\n".join(report(build, rows, page, args.list)))
    return 0


if __name__ == "__main__":
    sys.exit(main())

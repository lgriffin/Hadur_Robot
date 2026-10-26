#!/usr/bin/env python3
"""BENCH-110: per-opponent picks of the Stage 2 factorial's switches (plan to 3rd, lever L1), 0 battles.

  factor_picks.py ARMS.tsv [ARMS.tsv ...] --design plans/top5-factorial.design --out REPORT.md
      [--out-tsv PICKS.tsv] [--margin 5] [--pairings 1217]

Stage 2 fought every switch on every opponent in a 2^(8-4) design: per robot, each factor's
effect is the mean score share of its 8 design points at + minus its 8 at - (the control and its
A/A copy pooled into their point). A field-wide switch averages that over 1,212 robots; the mode
table would turn a switch on only where it pays. Picking the robots with the largest effects and
reading the same effects back is biased upwards, so the gain is measured held out: for factor f,
the design points are split by a second factor g; robots are picked on the g- half (effect at
least MARGIN points) and their effect read on the g+ half, then the other way round, and the two
averaged. In a resolution IV design f's effect in either half is still free of every other main
effect. The held-out gain, summed over the picked robots / PAIRINGS, is the APS a per-opponent
switch would add; the report says per factor whether it is worth building the table entry.
Every factor ships at the control's level (the all-low point), so only "on" picks move a robot
off the field default: a robot whose effect is negative stays at the default and gains nothing.
An opponent missing a design point (a failed or absent arm) is left out and counted in the report,
so no unbalanced contrast enters the picks.
Standard library plus data/tools/multiarm.py.
"""
import argparse
import csv
import os
import statistics as st
import sys

HERE = os.path.dirname(os.path.abspath(__file__))
sys.path.insert(0, os.path.join(HERE, "..", "..", "data", "tools"))
import multiarm  # noqa: E402


def complete(data, design):
    """(opponents with every design point, the number left out)."""
    want = {tuple(pt[f] for f in design[0]) for pt in design[1].values()}
    keep = {o: p for o, p in data.items() if want <= set(p)}
    return keep, len(data) - len(keep)


def cells(paths, design):
    """{opponent: {design point: [score share in points]}} over the arms the design names."""
    out = {}
    for r in multiarm.read_rows(paths):
        if r.get("ok") != "true" or r.get("arm") not in design[1]:
            continue
        point = tuple(design[1][r["arm"]][f] for f in design[0])
        out.setdefault(r["opponent"], {}).setdefault(point, []).append(100.0 * float(r["score_share"]))
    return out


def effect(points, i, keep=None):
    """Factor i's effect over the points (mean of point means at + minus at -), keep(point) filtering; None if a side is empty."""
    hi = [st.mean(v) for p, v in points.items() if p[i] > 0 and (keep is None or keep(p))]
    lo = [st.mean(v) for p, v in points.items() if p[i] < 0 and (keep is None or keep(p))]
    if not hi or not lo:
        return None
    return st.mean(hi) - st.mean(lo)


def held_out(data, i, j, margin):
    """Factor i picked on the half with factor j at one level and read on the other, both ways.

    Returns (picked robots by the full data, held-out gain in points summed over robots)."""
    gains = []
    for pick_side in (-1, 1):
        g = 0.0
        for o, points in data.items():
            e_pick = effect(points, i, lambda p: p[j] == pick_side)
            e_read = effect(points, i, lambda p: p[j] == -pick_side)
            if e_pick is None or e_read is None:
                continue
            # The switch ships off (the control's level): only an "on" pick changes anything.
            if e_pick >= margin:
                g += e_read
        gains.append(g)
    return st.mean(gains)


def picks(data, i, margin):
    out = []
    for o, points in sorted(data.items()):
        e = effect(points, i)
        if e is not None and abs(e) >= margin:
            out.append((o, e))
    return out


def report(paths, design_path, margin, pairings):
    design = multiarm.read_design(design_path)
    factors = design[0]
    data, dropped = complete(cells(paths, design), design)
    rows, tsv = [], []
    for i, f in enumerate(factors):
        j = (i + 1) % len(factors)
        gain = held_out(data, i, j, margin)
        chosen = picks(data, i, margin)
        field = st.mean(e for e in (effect(p, i) for p in data.values()) if e is not None) if data else 0.0
        rows.append((f, field, len(chosen), sum(1 for _, e in chosen if e > 0), gain / pairings))
        tsv += [(o, f, e) for o, e in chosen]
    return factors, data, rows, tsv, dropped


def main(argv=None):
    ap = argparse.ArgumentParser()
    ap.add_argument("arms", nargs="+")
    ap.add_argument("--design", required=True)
    ap.add_argument("--out", required=True)
    ap.add_argument("--out-tsv")
    ap.add_argument("--margin", type=float, default=5.0)
    ap.add_argument("--pairings", type=int, default=1217)
    a = ap.parse_args(argv)
    factors, data, rows, tsv, dropped = report(a.arms, a.design, a.margin, a.pairings)
    lines = ["# Stage 2 factorial: per-opponent switch picks (L1)\n\n",
             "Files: %s. %d robots with every design point (%d left out as incomplete); picks at |effect| >= %.1f "
             "points; held-out gain (\"on\" picks only, every switch ships off) over %d pairings.\n\n"
             % (", ".join("`%s`" % p for p in a.arms), len(data), dropped, a.margin, a.pairings),
             "| Factor | Field effect (pts a robot) | Picked | of them on | Held-out gain (APS) |\n",
             "|---|---:|---:|---:|---:|\n"]
    for f, field, n, on, g in rows:
        lines.append("| %s | %+.2f | %d | %d | %+.3f |\n" % (f, field, n, on, g))
    total = sum(max(0.0, r[4]) for r in rows)
    lines.append("\nSum of the positive held-out gains: **%+.3f APS** (factors can overlap on a robot, so this is an upper "
                 "end). A factor is worth a table entry at +0.03 APS or more.\n" % total)
    with open(a.out, "w", encoding="utf-8") as f:
        f.writelines(lines)
    if a.out_tsv:
        with open(a.out_tsv, "w", encoding="utf-8", newline="") as f:
            w = csv.writer(f, delimiter="\t", lineterminator="\n")
            w.writerow(["opponent", "factor", "effect"])
            for o, fac, e in tsv:
                w.writerow([o, fac, "%.2f" % e])
    print("".join(lines[4:]), end="")
    return 0


if __name__ == "__main__":
    sys.exit(main())

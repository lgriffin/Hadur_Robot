#!/usr/bin/env python3
"""Append each committed bench run's headline to data/bench/history.tsv and chart the trend.

Scans the per-battle tables listed in data/catalog.tsv (kind starting "bench ", path under bench/)
and writes one row per table. Rows are keyed by file name, so a re-run replaces rather than
duplicates, and rows for files no longer scanned are kept. Tables that are not per-battle duel or
melee tables (probe tables, the 2026-09-28 summary) are listed as skipped, not guessed at.

Headline: the candidate minus baseline score share, in percentage points, pooled over opponents.
The baseline is the build with the lowest version in the table. Duels: per-opponent mean difference
over paired seeds, averaged with equal opponent weight, 95% t interval from Welch-Satterthwaite.
Melee: Hadur's share of all points in a battle, paired by (field, seed), same pooling over fields.
Failed battles (ok != true) are dropped and counted. This is a record, not a gate.

Conditions (rounds, engine, child heap, CPU constant, parallel width, CPUs per child) come from the catalog
row, then the subject text and the rows; blank is not recorded. In the chart a run whose recorded
conditions differ from the chart's usual ones is an open circle, with a footnote per difference.

  python3 data/tools/trend.py            write data/bench/history.tsv and docs/bench/trend.svg
  python3 data/tools/trend.py --check    exit 1 if either is stale

Standard library only.
"""

import argparse
import csv
import io
import math
import re
import sys
from collections import Counter
from pathlib import Path

import bench_tables as bt
import compare_conditions as cc

ROOT = Path(__file__).resolve().parent.parent
HISTORY = ROOT / "bench" / "history.tsv"
CHART = ROOT.parent / "docs" / "bench" / "trend.svg"
DEFAULT_ENGINE = "1.9.5.6"
COLUMNS = ["file", "date", "label", "mode", "candidate", "baseline", "engine", "rounds", "child_heap",
           "cpu_constant", "parallel", "child_cpus", "seeds", "units",
           "pairs", "diff_pp", "ci_lo", "ci_hi", "skipped_cand", "skipped_base", "failed", "rows"]


def catalog_runs(catalog):
    with open(catalog, encoding="utf-8", newline="") as f:
        for r in csv.DictReader(f, delimiter="\t"):
            if r["kind"].startswith("bench ") and r["path"].startswith("bench/"):
                yield r


def engine_of(subject):
    m = re.search(r"Robocode (\d+(?:\.\d+)+)", subject)
    return m.group(1) if m else DEFAULT_ENGINE


def pooled(cells):
    """cells {stratum: {key: (cand, base)}} -> (mean diff, lo, hi, pairs, strata) over strata with 2+ pairs."""
    means, ses, dfs_num, n_pairs = [], [], [], 0
    for pairs in cells.values():
        d = [c - b for c, b in pairs.values()]
        if len(d) < 2:
            continue
        n_pairs += len(d)
        means.append(bt.mean(d))
        var = bt.sd(d) ** 2 / len(d)
        ses.append(var)
        dfs_num.append((var, len(d) - 1))
    k = len(means)
    if k == 0:
        return None
    mean = bt.mean(means)
    var_mean = sum(ses) / k**2
    denom = sum(v * v / df for v, df in dfs_num) / k**4
    if var_mean == 0:
        return mean, mean, mean, n_pairs, k
    half = bt.t_crit95(var_mean**2 / denom) * math.sqrt(var_mean)
    return mean, mean - half, mean + half, n_pairs, k


def split_builds(builds):
    # Ties (3.9 and 3.9sa) break by name, so the suffixed build is the candidate on every run.
    ordered = sorted(builds, key=lambda b: (bt.version_key(b), b))
    return ordered[-1], ordered[0]


def duel_row(rows):
    builds = {bt.norm_build(r["build"]) for r in rows}
    if len(builds) != 2:
        return None
    cand, base = split_builds(builds)
    shares, skipped, failed = {}, {cand: [], base: []}, 0
    for r in rows:
        b = bt.norm_build(r["build"])
        s = bt.share_pp(r)
        if s is None:
            failed += 1
            continue
        shares.setdefault((r["opponent"], r["seed"]), {})[b] = s
        if r.get("skippedTurns", "").strip():
            skipped[b].append(float(r["skippedTurns"]))
    cells = {}
    for (opp, seed), by in shares.items():
        if cand in by and base in by:
            cells.setdefault(opp, {})[seed] = (by[cand], by[base])
    res = pooled(cells)
    return {"mode": "duel", "candidate": cand, "baseline": base, "seeds": len({r["seed"] for r in rows}),
            "units": len(cells), "failed": failed, "rows": len(rows), "res": res,
            "skipped_cand": skipped[cand], "skipped_base": skipped[base]}


def melee_row(rows):
    builds = {bt.norm_build(r["build"]) for r in rows}
    if len(builds) != 2:
        return None
    cand, base = split_builds(builds)
    totals, hadur = {}, {}
    for r in rows:
        key = (r["field"], r["seed"], bt.norm_build(r["build"]))
        score = float(r["score"])
        totals[key] = totals.get(key, 0.0) + score
        if r["robot"].startswith("hadur2.Hadur"):
            hadur[key] = score
    cells = {}
    for (field, seed, b), score in hadur.items():
        if b == cand and (field, seed, base) in hadur:
            cells.setdefault(field, {})[seed] = (100 * score / totals[(field, seed, cand)],
                                                100 * hadur[(field, seed, base)] / totals[(field, seed, base)])
    return {"mode": "melee", "candidate": cand, "baseline": base, "seeds": len({r["seed"] for r in rows}),
            "units": len(cells), "failed": 0, "rows": len(rows), "res": pooled(cells),
            "skipped_cand": [], "skipped_base": []}


def headline(path):
    rows = bt.read_tsv(path)
    if bt.is_battle_table(rows):
        h = duel_row(rows)
        counts = Counter(r["rounds"] for r in rows if r.get("rounds", "").strip())
        if h is not None and counts:
            h["rounds"] = counts.most_common(1)[0][0]
        return h
    if rows and {"field", "seed", "build", "robot", "score"} <= set(rows[0]):
        return melee_row(rows)
    return None


def conditions_of(entry, h):
    """The run's conditions: the catalog's columns, then what the subject text or the rows themselves say.

    Blank means not recorded. Nothing is guessed: a value only the catalog columns can give stays blank.
    """
    c = cc.from_catalog_row(entry)
    c["engine"] = c["engine"] or engine_of(entry["subject"])
    m = re.search(r"parallel (\d+)", entry["subject"])
    c["parallel"] = c["parallel"] or (m.group(1) if m else "")
    c["rounds"] = c["rounds"] or h.get("rounds", "")
    return c


def fmt(x, nd=2):
    return "" if x is None or (isinstance(x, float) and math.isnan(x)) else "%.*f" % (nd, x)


def history_rows(catalog=ROOT / "catalog.tsv"):
    out, skipped = {}, []
    for entry in catalog_runs(catalog):
        path = ROOT / entry["path"]
        name = Path(entry["path"]).name
        h = headline(path) if path.is_file() else None
        if h is None:
            skipped.append(name)
            continue
        m = re.match(r"(\d{4}-\d{2}-\d{2})_(.*)\.tsv$", name)
        res = h["res"]
        out[name] = {
            "file": name, "date": m.group(1) if m else "", "label": m.group(2) if m else name,
            "mode": h["mode"], "candidate": h["candidate"], "baseline": h["baseline"],
            **conditions_of(entry, h), "seeds": str(h["seeds"]), "units": str(h["units"]),
            "pairs": str(res[3]) if res else "", "diff_pp": fmt(res[0]) if res else "",
            "ci_lo": fmt(res[1]) if res else "", "ci_hi": fmt(res[2]) if res else "",
            "skipped_cand": fmt(bt.mean(h["skipped_cand"]), 1) if h["skipped_cand"] else "",
            "skipped_base": fmt(bt.mean(h["skipped_base"]), 1) if h["skipped_base"] else "",
            "failed": str(h["failed"]), "rows": str(h["rows"])}
    return out, skipped


def merge(existing, fresh):
    merged = dict(existing)
    merged.update(fresh)
    return sorted(merged.values(), key=lambda r: (r["date"], r["file"]))


def read_history(path):
    if not path.is_file():
        return {}
    with open(path, encoding="utf-8", newline="") as f:
        return {r["file"]: r for r in csv.DictReader(f, delimiter="\t")}


def render_history(rows):
    buf = io.StringIO(newline="")
    w = csv.DictWriter(buf, COLUMNS, delimiter="\t", lineterminator="\n", extrasaction="ignore")
    w.writeheader()
    w.writerows(rows)
    return buf.getvalue()


def usual_conditions(rows):
    """{key: the most common recorded value} over the rows; a key no row records is left out."""
    out = {}
    for k in cc.KEYS:
        counts = Counter(r.get(k, "") for r in rows if r.get(k, ""))
        if counts:
            out[k] = counts.most_common(1)[0][0]
    return out


def unusual(row, usual):
    """[(key, value)] for each recorded condition of this run that is not the series' usual one."""
    return [(k, row[k]) for k in cc.KEYS if row.get(k, "") and k in usual and row[k] != usual[k]]


def condition_notes(rows, usual):
    """One footnote per (condition, value) that differs from the usual, with how many runs share it."""
    counts = Counter(kv for r in rows for kv in unusual(r, usual))
    return ["%s %s (usual %s): %d run%s" % (cc.LABELS[k], v, usual[k], n, "" if n == 1 else "s")
            for (k, v), n in sorted(counts.items(), key=lambda kv: (cc.KEYS.index(kv[0][0]), kv[0][1]))]


def render_svg(rows):
    rows = [r for r in rows if r["diff_pp"]]
    usual = usual_conditions(rows)
    notes = condition_notes(rows, usual)
    row_h, left, right, top = 22, 290, 40, 54
    width, plot_bottom = 900, top + row_h * len(rows) + 46
    height = plot_bottom + (22 + 15 * len(notes) if notes else 0)
    vals = [float(r[k]) for r in rows for k in ("ci_lo", "ci_hi")] + [0.0]
    lo, hi = math.floor(min(vals)), math.ceil(max(vals))
    if hi == lo:
        hi = lo + 1

    def x(v):
        return left + (v - lo) / (hi - lo) * (width - left - right)

    o = ['<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 %d %d" width="%d" height="%d" role="img" '
         'aria-label="Candidate minus baseline score share by bench run">' % (width, height, width, height),
         "<style>.bg{fill:#fff}.t{fill:#1f2328;font:12px sans-serif}.m{fill:#59636e;font:11px sans-serif}"
         ".g{stroke:#d1d9e0}.z{stroke:#59636e}.ci{stroke:#0b6bcb;stroke-width:2}.pt{fill:#0b6bcb;stroke:#fff;stroke-width:2}.pt.open{fill:#fff;stroke:#0b6bcb}"
         "@media (prefers-color-scheme:dark){.bg{fill:#0d1117}.t{fill:#e6edf3}.m{fill:#9198a1}"
         ".g{stroke:#30363d}.z{stroke:#9198a1}.ci{stroke:#58a6ff}.pt{fill:#58a6ff;stroke:#0d1117}.pt.open{fill:#0d1117;stroke:#58a6ff}}</style>",
         '<rect class="bg" width="%d" height="%d"/>' % (width, height),
         '<text class="t" x="16" y="22" font-weight="bold">Candidate minus baseline score share, by committed bench run</text>',
         '<text class="m" x="16" y="38">Percentage points, pooled over opponents, 95% interval. Right of zero means the candidate scored more.</text>']
    for v in range(lo, hi + 1):
        o.append('<line class="%s" x1="%.1f" x2="%.1f" y1="%d" y2="%d"/>' % ("z" if v == 0 else "g", x(v), x(v), top - 6, plot_bottom - 30))
        o.append('<text class="m" x="%.1f" y="%d" text-anchor="middle">%s</text>' % (x(v), plot_bottom - 14, "0" if v == 0 else "%+d" % v))
    for i, r in enumerate(rows):
        y = top + row_h * i + row_h / 2
        run = re.sub(r"^(hadur-)?(3\.[\d.]+_)?", "", r["label"]).replace("-local_cold", "")
        label = "%s vs %s  %s%s" % (r["candidate"], r["baseline"], run, " [" + r["engine"] + "]" if r["engine"] != DEFAULT_ENGINE else "")
        o.append('<text class="t" x="16" y="%.1f">%s</text>' % (y + 4, label.replace("&", "&amp;")))
        o.append('<line class="ci" x1="%.1f" x2="%.1f" y1="%.1f" y2="%.1f"/>' % (x(float(r["ci_lo"])), x(float(r["ci_hi"])), y, y))
        odd = unusual(r, usual)
        why = "; conditions differ from the usual: " + ", ".join("%s %s" % (cc.LABELS[k], v) for k, v in odd) if odd else ""
        o.append('<circle class="%s" cx="%.1f" cy="%.1f" r="4.5"><title>%s: %s pp (%s to %s)%s</title></circle>'
                 % ("pt open" if odd else "pt", x(float(r["diff_pp"])), y, r["file"], r["diff_pp"], r["ci_lo"], r["ci_hi"], why))
    if notes:
        o.append('<text class="m" x="16" y="%d">Open circle: a condition that differs from the usual one for this chart (a blank is not recorded, not assumed).</text>'
                 % (plot_bottom + 2))
        for i, n in enumerate(notes):
            o.append('<text class="m" x="16" y="%d">%s</text>' % (plot_bottom + 18 + 15 * i, n.replace("&", "&amp;")))
    o.append("</svg>")
    return "\n".join(o) + "\n"


def main(argv=None):
    ap = argparse.ArgumentParser(description=__doc__.split("\n")[0])
    ap.add_argument("--check", action="store_true", help="exit 1 if history.tsv or trend.svg is stale")
    ap.add_argument("--no-chart", action="store_true", help="do not write or check docs/bench/trend.svg")
    args = ap.parse_args(argv)
    fresh, skipped = history_rows()
    rows = merge(read_history(HISTORY), fresh)
    text, svg = render_history(rows), render_svg(rows)
    if args.check:
        stale = [p.name for p, t in ((HISTORY, text), (CHART, svg))
                 if not (args.no_chart and p == CHART) and (not p.is_file() or p.read_text(encoding="utf-8") != t)]
        print("stale: " + ", ".join(stale) if stale else "up to date")
        return 1 if stale else 0
    HISTORY.write_text(text, encoding="utf-8", newline="")
    if not args.no_chart:
        CHART.write_text(svg, encoding="utf-8", newline="")
    print("%d runs in %s; skipped (not a per-battle duel or melee table): %s" % (len(rows), HISTORY.name, ", ".join(skipped) or "none"))
    return 0


if __name__ == "__main__":
    sys.exit(main())

#!/usr/bin/env python3
"""Pick a mode per opponent from a multi-arm bench run (docs/plan-mode-table.md, MODE-1).

  python3 data/tools/mode_table.py RUN/arms.tsv [RUN2/arms.tsv ...]
      [--control c] [--aa aa] [--margin 5] [--out-tsv FILE.tsv] [--out FILE.md]

Each arm other than the control and the A/A copy is a candidate mode. Per opponent, the
reference is the control and A/A battles pooled; a mode is locked for that opponent when its
mean score share beats the reference by at least --margin points AND the lower end of the 95%
interval of that difference is above 0 (battle-to-battle sd from the data, pooled over the
two groups). Where several modes pass, the one with the largest mean difference wins. An
opponent no mode passes for keeps the normal play (no table entry).

The TSV holds one line per locked opponent: opponent<TAB>arm<TAB>diff<TAB>low<TAB>n_mode<TAB>n_ref.
The report gives the count and the panel-mean gain of the table (sum of locked diffs over the
panel's opponents), which is an in-sample estimate: re-measure the locked entries on fresh seeds
before shipping them. Standard library only.
"""
import argparse
import csv
import math
import statistics as st
from collections import defaultdict


def load(files):
    share = defaultdict(lambda: defaultdict(list))
    for f in files:
        with open(f, newline="") as fh:
            for r in csv.DictReader(fh, delimiter="\t"):
                if r.get("ok") != "true":
                    continue
                share[r["arm"]][r["opponent"]].append(100.0 * float(r["score_share"]))
    return share


def diff_ci(mode, ref):
    """Mean difference mode - ref and its 95% lower bound (Welch-style, pooled sd floor 1)."""
    d = st.mean(mode) - st.mean(ref)
    var_m = st.variance(mode) if len(mode) > 1 else 0.0
    var_r = st.variance(ref) if len(ref) > 1 else 0.0
    pooled = max(1.0, math.sqrt((var_m + var_r) / 2))
    se = pooled * math.sqrt(1 / len(mode) + 1 / len(ref))
    return d, d - 1.96 * se


def pick(share, control="c", aa="aa", margin=5.0):
    """Locked entries: opponent -> (arm, diff, low, n_mode, n_ref), and the panel's opponents."""
    modes = [a for a in share if a not in (control, aa)]
    opps = sorted(set(share.get(control, {})) | set(share.get(aa, {})))
    table = {}
    for o in opps:
        ref = share.get(control, {}).get(o, []) + share.get(aa, {}).get(o, [])
        if not ref:
            continue
        best = None
        for m in modes:
            xs = share[m].get(o, [])
            if not xs:
                continue
            d, low = diff_ci(xs, ref)
            if d >= margin and low > 0 and (best is None or d > best[1]):
                best = (m, d, low, len(xs), len(ref))
        if best:
            table[o] = best
    return table, opps


def main(argv=None):
    ap = argparse.ArgumentParser()
    ap.add_argument("files", nargs="+")
    ap.add_argument("--control", default="c")
    ap.add_argument("--aa", default="aa")
    ap.add_argument("--margin", type=float, default=5.0)
    ap.add_argument("--out-tsv")
    ap.add_argument("--out")
    a = ap.parse_args(argv)
    share = load(a.files)
    table, opps = pick(share, a.control, a.aa, a.margin)
    if a.out_tsv:
        with open(a.out_tsv, "w") as f:
            for o, (m, d, low, nm, nr) in sorted(table.items()):
                f.write(f"{o}\t{m}\t{d:.2f}\t{low:.2f}\t{nm}\t{nr}\n")
    per_mode = defaultdict(list)
    for o, e in table.items():
        per_mode[e[0]].append(e[1])
    lines = [f"# Mode table pick ({', '.join(a.files)})", "",
             f"Opponents in the panel: {len(opps)}. Margin {a.margin} points, interval above 0.", "",
             "| Mode arm | Opponents locked | Mean gain there (pts) | Panel-mean gain (pts) |",
             "|---|---|---|---|"]
    for m, ds in sorted(per_mode.items()):
        lines.append(f"| {m} | {len(ds)} | {st.mean(ds):+.1f} | {sum(ds) / max(1, len(opps)):+.2f} |")
    total = sum(e[1] for e in table.values())
    lines += ["", f"Table total, in sample: {len(table)} entries, {total / max(1, len(opps)):+.2f} points "
              f"over the panel, {total / 1212:+.2f} APS over a 1,212-bot field. Re-measure on fresh seeds."]
    text = "\n".join(lines) + "\n"
    if a.out:
        with open(a.out, "w") as f:
            f.write(text)
    print(text)


if __name__ == "__main__":
    main()

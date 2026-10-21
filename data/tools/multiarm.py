#!/usr/bin/env python3
"""Read a multi-arm bench run (BENCH-92, BENCH-94; docs/plan-top5.md sections 6 and 7).

  python3 data/tools/multiarm.py RUN/arms.tsv [RUN2/arms.tsv ...]
      [--control c] [--aa aa] [--blocks] [--census hadur-bench/census-312.txt]
      [--segments FILE.tsv] [--design FILE] [--startup R0.tsv ...] [--out FILE.md]

Each arms.tsv is one run: one row per battle (Arms.HEADER). Only finished battles (ok=true)
count. Scores are score share in points (100 x score / (score + their score)); a difference in
mean share over a panel is the APS difference on that panel.

For every arm the report gives:
  level      mean share over the panel's opponents (each opponent's mean over its seeds)
  vs ref     the paired difference per opponent, mean and 95% interval over opponents. The
             reference is the control and A/A arms pooled (all their battles on that opponent);
             the A/A arm itself is read against the control alone.
  bands      the same difference within each band (the role's band<B>), and per segment when
             --segments gives opponent<TAB>segment lines (segments A-E, census_joint.py)
  field      with --census, the band differences weighted by each band's share of that census:
             the panel's estimate of the whole-field APS difference
  load       skipped turns per battle and per round, the share of trusted battles (at most 2
             skipped turns a round, as the bench marks them), engine disables per 100 battles
  start-up   from the round0.tsv beside each arms.tsv (round0_skips.py RUN RUN/round0.tsv) and any
             --startup TSVs: start-up disables per
             arm, and TIME-8's setup time (median, p90, max)

The A/A check: |aa - control| against its 1% band, 2.58 x 3.2 x sqrt(1/s1 + 1/s2) / sqrt(n)
(s1, s2 the mean seeds per opponent of the two arms, n opponents; plan section 6.1, item 3).
Outside it, the run has an arm-specific defect and its other comparisons are void.

--blocks reads each file as its own block (Stage 0: one file per worker setting) and adds a
table of the blocks side by side; without it the files are pooled as one run.

--design FILE gives a factorial design: a header line "arm f1 f2 ...", then one line per arm
with + or - per factor. Each main effect is, per opponent, the mean over the arms at + minus
the mean over the arms at -, then its mean and 95% interval over opponents.

Standard library only.
"""
import argparse
import csv
import datetime
import json
import math
import os
import re
import statistics as st
import sys
from collections import OrderedDict, defaultdict

Z95 = 1.96
Z99 = 2.58
BATTLE_SD = 3.2  # points of share per battle, seed to seed (plan section 2.2)


def read_rows(paths):
    rows = []
    for p in paths:
        with open(p, newline="", encoding="utf-8") as f:
            for r in csv.DictReader(f, delimiter="\t"):
                r["_file"] = p
                rows.append(r)
    return rows


def band_of(role):
    m = re.search(r"band(\d+)", role or "")
    return int(m.group(1)) if m else None


def mean_ci(xs):
    xs = [x for x in xs if x is not None]
    if not xs:
        return None, None, 0
    m = st.mean(xs)
    ci = Z95 * st.stdev(xs) / math.sqrt(len(xs)) if len(xs) > 1 else float("nan")
    return m, ci, len(xs)


def fmt(m, ci=None, signed=True):
    if m is None:
        return "-"
    s = f"{m:+.2f}" if signed else f"{m:.2f}"
    if ci is not None and not math.isnan(ci):
        s += f" ± {ci:.2f}"
    return s


class Run:
    """The finished battles of one run (or of several pooled), by arm and opponent."""

    def __init__(self, rows):
        self.rows = [r for r in rows if r.get("ok") == "true"]
        self.all = rows
        self.share = defaultdict(lambda: defaultdict(list))
        self.role = {}
        self.arms = []
        for r in rows:
            if r["arm"] not in self.arms:
                self.arms.append(r["arm"])
        for r in self.rows:
            self.share[r["arm"]][r["opponent"]].append(100.0 * float(r["score_share"]))
            self.role[r["opponent"]] = r["role"]

    def opps(self, *arms):
        sets = [set(self.share[a]) for a in arms]
        return sorted(set.intersection(*sets)) if sets else []

    def level(self, arm):
        return mean_ci([st.mean(v) for v in self.share[arm].values()])

    def ref(self, arms, opp):
        xs = [x for a in arms for x in self.share[a].get(opp, [])]
        return st.mean(xs) if xs else None

    def diffs(self, arm, refs, opps=None):
        """Per-opponent arm minus pooled refs, over the opponents both have."""
        out = {}
        for o in opps if opps is not None else self.opps(arm, *refs):
            r = self.ref(refs, o)
            if o in self.share[arm] and r is not None:
                out[o] = st.mean(self.share[arm][o]) - r
        return out

    def seeds(self, arm, opps):
        return st.mean(len(self.share[arm][o]) for o in opps) if opps else 0

    def load(self, arm):
        rs = [r for r in self.rows if r["arm"] == arm]
        if not rs:
            return {}
        skips = [int(r["skippedTurns"]) for r in rs]
        rounds = [max(1, int(r["rounds"])) for r in rs]
        trusted = sum(1 for s, n in zip(skips, rounds) if s <= 2 * n)
        dis = sum(int(r["engineDisables"]) for r in rs)
        return {"battles": len(rs), "attempted": sum(1 for r in self.all if r["arm"] == arm),
                "skips": st.mean(skips), "skips_round": sum(skips) / sum(rounds),
                "trusted": 100.0 * trusted / len(rs), "disables": 100.0 * dis / len(rs),
                "dis_battles": 100.0 * sum(1 for r in rs if int(r["engineDisables"]) > 0) / len(rs)}


def aa_check(run, control, aa):
    opps = run.opps(control, aa)
    if not opps:
        return None
    d = run.diffs(aa, [control], opps)
    m, ci, n = mean_ci(list(d.values()))
    s1, s2 = run.seeds(control, opps), run.seeds(aa, opps)
    band = Z99 * BATTLE_SD * math.sqrt(1 / s1 + 1 / s2) / math.sqrt(n)
    return {"diff": m, "ci": ci, "n": n, "band": band, "ok": abs(m) <= band}


def census_weights(path):
    counts = defaultdict(int)
    with open(path, encoding="utf-8") as f:
        for raw in f:
            line = raw.strip().lstrip("﻿")
            if not line or line.startswith("#"):
                continue
            parts = [p.strip() for p in line.split("|")]
            b = band_of(parts[1] if len(parts) > 1 else "")
            if b is not None:
                counts[b] += 1
    total = sum(counts.values())
    return {b: n / total for b, n in counts.items()}


def by_group(d, group):
    """Mean and interval of a per-opponent difference dict within each group."""
    g = defaultdict(list)
    for o, x in d.items():
        k = group(o)
        if k is not None:
            g[k].append(x)
    return OrderedDict((k, mean_ci(v)) for k, v in sorted(g.items(), key=lambda kv: str(kv[0])))


def field_estimate(bands, weights):
    """Band means weighted by the census's band shares; interval from the band intervals."""
    have = [b for b in weights if b in bands and bands[b][0] is not None]
    if not have:
        return None, None
    w = sum(weights[b] for b in have)
    m = sum(weights[b] * bands[b][0] for b in have) / w
    var = sum((weights[b] / w) ** 2 * ((bands[b][1] or 0) / Z95) ** 2 for b in have
              if bands[b][1] is not None and not math.isnan(bands[b][1]))
    return m, Z95 * math.sqrt(var)


def read_design(path):
    factors, arms = None, OrderedDict()
    with open(path, encoding="utf-8") as f:
        for raw in f:
            line = raw.split("#", 1)[0].strip()
            if not line:
                continue
            parts = line.split()
            if factors is None:
                factors = parts[1:]
                continue
            if len(parts) != len(factors) + 1 or any(p not in "+-" for p in parts[1:]):
                raise ValueError("design line needs an arm and one + or - per factor: " + raw.strip())
            arms[parts[0]] = {f: (1 if s == "+" else -1) for f, s in zip(factors, parts[1:])}
    if not factors or not arms:
        raise ValueError("empty design: " + path)
    return factors, arms


def main_effects(run, factors, design):
    """Each factor's main effect per opponent. Arms that share a design point (the control and
    its A/A copy at the all-low corner) are pooled into that point first, so the design stays
    balanced: the effect is the mean over the points at + minus the mean over the points at -."""
    arms = [a for a in design if a in run.share]
    opps = run.opps(*arms)
    cells = OrderedDict()
    for a in arms:
        cells.setdefault(tuple(design[a][f] for f in factors), []).append(a)
    out = OrderedDict()
    for i, f in enumerate(factors):
        hi = [c for c in cells if c[i] > 0]
        lo = [c for c in cells if c[i] < 0]
        d = {}
        for o in opps:
            d[o] = (st.mean(run.ref(cells[c], o) for c in hi) - st.mean(run.ref(cells[c], o) for c in lo))
        out[f] = (d, len(hi), len(lo))
    return out, opps


def read_startup(paths):
    by = defaultdict(lambda: {"battles": 0, "startup": 0, "setup": []})
    for p in paths:
        with open(p, newline="", encoding="utf-8") as f:
            for r in csv.DictReader(f, delimiter="\t"):
                s = by[r["build"]]
                s["battles"] += 1
                if r.get("startup_disable") == "1":
                    s["startup"] += 1
                if r.get("setup_ms"):
                    s["setup"].append(float(r["setup_ms"]))
    return by


def throughput(path, battles):
    """Hours and battles an hour from the conditions.json beside an arms.tsv, or (None, None)."""
    try:
        with open(os.path.join(os.path.dirname(os.path.abspath(path)), "conditions.json"), encoding="utf-8") as f:
            c = json.load(f)
        t0 = datetime.datetime.fromisoformat(c["started"].replace("Z", "+00:00"))
        t1 = datetime.datetime.fromisoformat(c["finished"].replace("Z", "+00:00"))
        hours = (t1 - t0).total_seconds() / 3600.0
        return hours, battles / hours if hours > 0 else None
    except (OSError, KeyError, TypeError, ValueError, AttributeError):
        return None, None


def pct(xs, q):
    xs = sorted(xs)
    return xs[min(len(xs) - 1, int(q * (len(xs) - 1) + 0.5))]


def report_run(run, a, title, weights, segments, design):
    out = [f"## {title}", ""]
    control, aa = a.control, a.aa
    refs = [x for x in (control, aa) if x in run.share]
    if control not in run.share:
        out.append(f"No finished battles for the control arm `{control}`.")
        return out, {}
    chk = aa_check(run, control, aa) if aa in run.share else None
    summary = {"_aa": chk}
    if chk:
        verdict = "inside: the run stands" if chk["ok"] else "**OUTSIDE: the run has an arm-specific defect; its comparisons are void**"
        out += [f"A/A: {aa} - {control} = {fmt(chk['diff'], chk['ci'])} points over {chk['n']} opponents; "
                f"1% band ± {chk['band']:.2f}, {verdict}.", ""]
    out += ["| Arm | Opponents | Level | vs ref | Field (census-weighted) | Skips a battle | Skips a round | Trusted | Disables /100 | Battles |",
            "|---|---:|---:|---:|---:|---:|---:|---:|---:|---:|"]
    band_tables = []
    for arm in run.arms:
        lv = run.level(arm)
        if arm == control:
            d = {}
        elif arm == aa:
            d = run.diffs(arm, [control])
        else:
            d = run.diffs(arm, refs)
        m, ci, n = mean_ci(list(d.values()))
        bands = by_group(d, lambda o: band_of(run.role.get(o)))
        fm, fci = field_estimate(bands, weights) if weights and d else (None, None)
        ld = run.load(arm)
        summary[arm] = {"level": lv[0], "diff": m, "ci": ci, "field": fm, "field_ci": fci, **ld}
        out.append(f"| {arm} | {lv[2]} | {fmt(lv[0], None, False)} | {fmt(m, ci) if d else 'ref'} | {fmt(fm, fci)} | "
                   f"{ld.get('skips', 0):.1f} | {ld.get('skips_round', 0):.2f} | {ld.get('trusted', 0):.0f}% | "
                   f"{ld.get('disables', 0):.1f} | {ld.get('battles', 0)} of {ld.get('attempted', 0)} |")
        if d:
            row = [arm] + [fmt(*bands[b][:2]) + f" ({bands[b][2]})" if b in bands else "-" for b in range(1, 7)]
            if segments:
                seg = by_group(d, lambda o: segments.get(o))
                row += [fmt(*seg[s][:2]) + f" ({seg[s][2]})" if s in seg else "-" for s in "ABCDE"]
            band_tables.append("| " + " | ".join(row) + " |")
    if band_tables:
        head = "| Arm | Band 1 | Band 2 | Band 3 | Band 4 | Band 5 | Band 6 |"
        rule = "|---|---:|---:|---:|---:|---:|---:|"
        if segments:
            head += " A | B | C | D | E |"
            rule += "---:|---:|---:|---:|---:|"
        out += ["", "Difference against the reference by band" + (" and segment" if segments else "") + " (points, opponents):", "",
                head, rule] + band_tables
    if design:
        factors, dz = design
        eff, opps = main_effects(run, factors, dz)
        out += ["", f"Factorial main effects over {len(opps)} opponents (points of share = APS on this panel):", "",
                "| Factor | Design points + / - | Effect | Field (census-weighted) |", "|---|---|---:|---:|"]
        summary["_effects"] = {}
        for f, (d, nh, nl) in eff.items():
            m, ci, _ = mean_ci(list(d.values()))
            fm, fci = field_estimate(by_group(d, lambda o: band_of(run.role.get(o))), weights) if weights else (None, None)
            summary["_effects"][f] = (m, ci)
            out.append(f"| {f} | {nh} / {nl} | {fmt(m, ci)} | {fmt(fm, fci)} |")
    return out, summary


def main(argv=None):
    ap = argparse.ArgumentParser(description=__doc__.split("\n")[0])
    ap.add_argument("files", nargs="+")
    ap.add_argument("--control", default="c")
    ap.add_argument("--aa", default="aa")
    ap.add_argument("--blocks", action="store_true")
    ap.add_argument("--census")
    ap.add_argument("--segments")
    ap.add_argument("--design")
    ap.add_argument("--startup", nargs="*", default=[])
    ap.add_argument("--out")
    a = ap.parse_args(argv)
    weights = census_weights(a.census) if a.census else None
    segments = None
    if a.segments:
        with open(a.segments, encoding="utf-8") as f:
            segments = dict(l.rstrip("\n").split("\t")[:2] for l in f if "\t" in l and not l.startswith("#"))
    design = read_design(a.design) if a.design else None
    out = ["# Multi-arm run", "", "Files: " + ", ".join(f"`{p}`" for p in a.files), ""]
    rows = read_rows(a.files)
    summaries = OrderedDict()
    if a.blocks:
        for p in a.files:
            lines, s = report_run(Run([r for r in rows if r["_file"] == p]), a, p, weights, segments, design)
            out += lines + [""]
            summaries[p] = s
        arms = []
        for s in summaries.values():
            arms += [k for k in s if not k.startswith("_") and k not in arms]
        out += ["## Blocks side by side", "",
                "| Block | Battles an hour | A/A (band) | " + " | ".join(f"{x} level / vs ref / skips a round" for x in arms) + " |",
                "|---|---:|---|" + "---|" * len(arms)]
        for p, s in summaries.items():
            chk = s.get("_aa")
            _, rate = throughput(p, sum(1 for r in rows if r["_file"] == p))
            cells = [f"{rate:.0f}" if rate else "-",
                     f"{fmt(chk['diff'], chk['ci'])} (± {chk['band']:.2f}){'' if chk['ok'] else ' FAIL'}" if chk else "-"]
            for x in arms:
                v = s.get(x)
                cells.append("-" if not v else f"{fmt(v['level'], None, False)} / {fmt(v['diff'], v['ci']) if v['diff'] is not None else 'ref'} / {v.get('skips_round', 0):.2f}")
            out.append(f"| {p} | " + " | ".join(cells) + " |")
    else:
        lines, s = report_run(Run(rows), a, "All files pooled", weights, segments, design)
        out += lines
    # Start-up: each run's own round0.tsv (round0_skips.py RUN RUN/round0.tsv) is found beside its
    # arms.tsv; --startup adds others. With --blocks each block gets its own table.
    groups = OrderedDict()
    for p in a.files:
        beside = os.path.join(os.path.dirname(os.path.abspath(p)), "round0.tsv")
        if os.path.exists(beside):
            groups.setdefault(p if a.blocks else "all", []).append(beside)
    if a.startup:
        groups.setdefault("all" if not a.blocks else "--startup", []).extend(a.startup)
    for g, paths in groups.items():
        su = read_startup(paths)
        out += ["", "## Start-up (round0_skips.py)" + ("" if g == "all" else f": {g}"), "",
                "| Arm | Battles | Start-up disables | Rate | Setup ms median | p90 | max |", "|---|---:|---:|---:|---:|---:|---:|"]
        for arm, s in su.items():
            setup = s["setup"]
            out.append(f"| {arm} | {s['battles']} | {s['startup']} | {100.0 * s['startup'] / max(1, s['battles']):.2f}% | "
                       + (f"{st.median(setup):.0f} | {pct(setup, 0.9):.0f} | {max(setup):.0f} |" if setup else "- | - | - |"))
    text = "\n".join(out) + "\n"
    if a.out:
        with open(a.out, "w", encoding="utf-8") as f:
            f.write(text)
    sys.stdout.write(text)
    return 0


if __name__ == "__main__":
    sys.exit(main())

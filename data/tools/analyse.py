#!/usr/bin/env python3
"""Pooled paired analysis of a bench TSV (candidate and baseline rows), standard library only.

  python3 data/tools/analyse.py data/bench/2026-10-06_hadur-leak38-step1-e1111-local_cold.tsv
  python3 data/tools/analyse.py FILE.tsv --candidate 3.8 --baseline 3.7 --margin 1.0
  python3 data/tools/analyse.py FILE.tsv --plan --halfwidth 2.0

Reads the rows export_battles.py writes (columns build, opponent, seed, ok and the metric
column, by default score_share) and pairs candidate and baseline by (opponent, seed).
Differences are in points: share columns are scaled by 100.

Reports
  pooled     the mean paired difference over all opponents, with a 95% t interval two ways:
             per battle (every pair counts once) and opponent-clustered (each opponent's mean
             difference counts once, so the interval allows for the opponents' own spread).
  per opponent  the paired t test and its Holm and Benjamini-Hochberg adjusted p-values
             across the opponents, and a one-sided non-inferiority p-value.
  TOST       non-inferiority (candidate no worse than -margin) and equivalence (within
             +-margin) for the pooled difference, both ways.
  --plan     seeds needed per opponent for a target half-width, from the UNPAIRED standard
             deviation: measured seed pairing gave about zero variance reduction (see
             repeatability.py), so planning as paired would be optimistic.
  --weights [COL]  weight each opponent by the column COL (default "weight") when present.
"""

import argparse
import csv
import math
import sys
from collections import OrderedDict

NAN = float("nan")


def _beta_cf(x, a, b):
    tiny = 1e-300
    qab, qap, qam = a + b, a + 1, a - 1
    c, d = 1.0, 1 - qab * x / qap
    d = 1 / (d if abs(d) > tiny else tiny)
    h = d
    for m in range(1, 1001):
        m2 = 2 * m
        aa = m * (b - m) * x / ((qam + m2) * (a + m2))
        d = 1 + aa * d
        d = 1 / (d if abs(d) > tiny else tiny)
        c = 1 + aa / c
        c = c if abs(c) > tiny else tiny
        h *= d * c
        aa = -(a + m) * (qab + m) * x / ((a + m2) * (qap + m2))
        d = 1 + aa * d
        d = 1 / (d if abs(d) > tiny else tiny)
        c = 1 + aa / c
        c = c if abs(c) > tiny else tiny
        delta = d * c
        h *= delta
        if abs(delta - 1) < 1e-15:
            break
    return h


def _reg_beta(x, a, b):
    if x <= 0:
        return 0.0
    if x >= 1:
        return 1.0
    front = math.exp(math.lgamma(a + b) - math.lgamma(a) - math.lgamma(b)
                     + a * math.log(x) + b * math.log1p(-x))
    if x < (a + 1) / (a + b + 2):
        return front * _beta_cf(x, a, b) / a
    return 1 - front * _beta_cf(1 - x, b, a) / b


def t_cdf(t, df):
    """CDF of Student's t with df degrees of freedom (df may be fractional)."""
    if t == 0:
        return 0.5
    tail = 0.5 * _reg_beta(df / (df + t * t), df / 2, 0.5)
    return 1 - tail if t > 0 else tail


def t_ppf(p, df):
    """The p-quantile of Student's t, by bisection on the CDF."""
    if not 0 < p < 1 or not df > 0:
        return NAN
    if p == 0.5:
        return 0.0
    if p < 0.5:
        return -t_ppf(1 - p, df)
    lo, hi = 0.0, 1.0
    while t_cdf(hi, df) < p:
        lo, hi = hi, hi * 2
        if hi > 1e300:
            return float("inf")
    for _ in range(200):
        if hi - lo <= 1e-13 * hi:
            break
        mid = 0.5 * (lo + hi)
        if t_cdf(mid, df) < p:
            lo = mid
        else:
            hi = mid
    return 0.5 * (lo + hi)


def mean_sd(xs):
    n = len(xs)
    if n == 0:
        return NAN, NAN
    m = sum(xs) / n
    if n < 2:
        return m, NAN
    return m, math.sqrt(sum((x - m) ** 2 for x in xs) / (n - 1))


def _empty(n=0, mean=NAN):
    return dict(n=n, mean=mean, se=NAN, df=NAN, half=NAN, lo=NAN, hi=NAN)


def estimate(values, weights=None):
    """Weighted mean with a 95% t interval, as a dict (n, mean, se, df, half, lo, hi).

    With weights, the effective sample size is Kish's (sum w)^2 / sum w^2 and the variance the
    bias-corrected one for reliability weights; for equal weights both reduce to the ordinary
    n and sample variance.
    """
    if weights is None:
        weights = [1.0] * len(values)
    pairs = [(v, w) for v, w in zip(values, weights) if w > 0]
    if not pairs:
        return _empty()
    sw = sum(w for _, w in pairs)
    mean = sum(v * w for v, w in pairs) / sw
    sw2 = sum(w * w for _, w in pairs)
    neff = sw * sw / sw2
    denom = sw - sw2 / sw
    if len(pairs) < 2 or denom <= 0:
        return _empty(len(pairs), mean)
    var = sum(w * (v - mean) ** 2 for v, w in pairs) / denom
    se = math.sqrt(var / neff)
    df = max(round(neff) - 1, 1)
    half = t_ppf(0.975, df) * se
    return dict(n=len(pairs), mean=mean, se=se, df=df, half=half, lo=mean - half, hi=mean + half)


def p_two_sided(mean, se, df):
    if math.isnan(se) or math.isnan(df):
        return NAN
    if se == 0:
        return 1.0 if mean == 0 else 0.0
    return min(1.0, 2 * (1 - t_cdf(abs(mean / se), df)))


def p_noninferior(mean, se, df, margin):
    """One-sided p for H0: true difference <= -margin (small p: the candidate is not worse)."""
    if math.isnan(se) or math.isnan(df):
        return NAN
    if se == 0:
        return 0.0 if mean > -margin else 1.0
    return 1 - t_cdf((mean + margin) / se, df)


def p_nonsuperior(mean, se, df, margin):
    """One-sided p for H0: true difference >= +margin."""
    if math.isnan(se) or math.isnan(df):
        return NAN
    if se == 0:
        return 0.0 if mean < margin else 1.0
    return t_cdf((mean - margin) / se, df)


def holm(ps):
    """Holm step-down adjusted p-values, in the order given; NaN p-values stay NaN."""
    order = sorted((i for i, p in enumerate(ps) if not math.isnan(p)), key=lambda i: ps[i])
    m = len(order)
    out = [NAN] * len(ps)
    running = 0.0
    for rank, i in enumerate(order):
        running = max(running, min(1.0, (m - rank) * ps[i]))
        out[i] = running
    return out


def benjamini_hochberg(ps):
    """Benjamini-Hochberg step-up adjusted p-values, in the order given."""
    order = sorted((i for i, p in enumerate(ps) if not math.isnan(p)), key=lambda i: ps[i],
                   reverse=True)
    m = len(order)
    out = [NAN] * len(ps)
    running = 1.0
    for k, i in enumerate(order):
        running = min(running, ps[i] * m / (m - k))
        out[i] = min(1.0, running)
    return out


def load(paths, metric):
    """Rows as dicts from one or more TSVs; failed battles (ok false) are dropped."""
    rows = []
    for path in paths:
        with open(path, encoding="utf-8", newline="") as f:
            for row in csv.DictReader(f, delimiter="\t"):
                if row.get("ok", "true").strip().lower() == "false":
                    continue
                rows.append(row)
    if rows and metric not in rows[0]:
        if metric == "score_share" and "score" in rows[0] and "theirScore" in rows[0]:
            for row in rows:
                s, t = float(row["score"]), float(row["theirScore"])
                row["score_share"] = repr(s / (s + t)) if s + t > 0 else ""
        else:
            raise SystemExit("column %r not in %s" % (metric, paths))
    return rows


def pair(rows, metric, candidate, baseline, scale, weight_col=None):
    """OrderedDict opponent -> dict(diffs, cand, base, weight), paired by (opponent, seed)."""
    by = OrderedDict()
    weights = {}
    for row in rows:
        if row["build"] not in (candidate, baseline) or row.get(metric, "") == "":
            continue
        by.setdefault((row["opponent"], row["seed"]), {})[row["build"]] = float(row[metric]) * scale
        if weight_col and row.get(weight_col, "") != "":
            weights[row["opponent"]] = float(row[weight_col])
    out = OrderedDict()
    for (opp, _seed), got in by.items():
        if candidate in got and baseline in got:
            o = out.setdefault(opp, dict(diffs=[], cand=[], base=[], weight=weights.get(opp, 1.0)))
            o["diffs"].append(got[candidate] - got[baseline])
            o["cand"].append(got[candidate])
            o["base"].append(got[baseline])
    return out


def analyse(per_opp, margin):
    """The numbers behind the report, as a dict (no printing)."""
    rows = []
    for opp, o in per_opp.items():
        e = estimate(o["diffs"])
        rows.append(dict(opponent=opp, n=len(o["diffs"]), weight=o["weight"],
                         mean=e["mean"], se=e["se"], df=e["df"], half=e["half"]))
    for r in rows:
        r["p"] = p_two_sided(r["mean"], r["se"], r["df"])
        r["p_ni"] = p_noninferior(r["mean"], r["se"], r["df"], margin)
    for r, h, b in zip(rows, holm([r["p"] for r in rows]),
                       benjamini_hochberg([r["p"] for r in rows])):
        r["p_holm"], r["p_bh"] = h, b
    weighted = any(r["weight"] != 1.0 for r in rows)
    values, wts = [], []
    for o in per_opp.values():
        for d in o["diffs"]:
            values.append(d)
            wts.append(o["weight"] / len(o["diffs"]))
    return dict(rows=rows, weighted=weighted, pairs=len(values), margin=margin,
                battle=estimate(values, wts if weighted else None),
                cluster=estimate([r["mean"] for r in rows],
                                 [r["weight"] for r in rows] if weighted else None))


def tost(est, margin):
    """Non-inferiority and equivalence from a pooled estimate (90% interval for TOST)."""
    df, se, mean = est["df"], est["se"], est["mean"]
    p_lo = p_noninferior(mean, se, df, margin)
    p_hi = p_nonsuperior(mean, se, df, margin)
    t90 = t_ppf(0.95, df) if not math.isnan(se) else NAN
    p_eq = max(p_lo, p_hi)
    return dict(p_noninferior=p_lo, p_equivalent=p_eq, lower90=mean - t90 * se,
                upper90=mean + t90 * se, noninferior=p_lo < 0.05, equivalent=p_eq < 0.05)


def seeds_needed(sd_battle, halfwidth, alpha=0.05, max_n=100000):
    """Smallest n per build with t(2n-2) * sd_battle * sqrt(2/n) <= halfwidth, where
    sd_battle is the per-battle SD of one build (independent arms, Welch-like df)."""
    if math.isnan(sd_battle) or sd_battle == 0:
        return 2
    for n in range(2, max_n):
        if t_ppf(1 - alpha / 2, 2 * n - 2) * sd_battle * math.sqrt(2.0 / n) <= halfwidth:
            return n
    return max_n


def plan(per_opp, halfwidth):
    """Per opponent: seeds now and seeds needed from the unpaired SD, sqrt((sc^2 + sb^2) / 2)
    being the per-battle SD of one build."""
    rows = []
    for opp, o in per_opp.items():
        sc = mean_sd(o["cand"])[1]
        sb = mean_sd(o["base"])[1]
        sp = mean_sd(o["diffs"])[1]
        unpaired_var = sc * sc + sb * sb
        sd_build = math.sqrt(unpaired_var / 2)
        rows.append(dict(opponent=opp, n=len(o["diffs"]), sd_cand=sc, sd_base=sb, sd_paired=sp,
                         need=seeds_needed(sd_build, halfwidth),
                         ratio=sp * sp / unpaired_var if unpaired_var > 0 else NAN))
    return rows


def fmt(x, places=2, signed=False):
    if x is None or math.isnan(x):
        return "n/a"
    return ("%+.*f" if signed else "%.*f") % (places, x)


def fmtp(p):
    if math.isnan(p):
        return "n/a"
    return "<0.0001" if p < 1e-4 else "%.4f" % p


def render(result, candidate, baseline, metric, unit):
    out = ["%s: %s minus %s, paired by (opponent, seed), in %s" % (metric, candidate, baseline, unit), ""]
    for label, e in (("per battle", result["battle"]), ("opponent-clustered", result["cluster"])):
        out.append("pooled %-19s %s +/- %s  [%s, %s]  n=%d df=%s  (95%% t interval)" % (
            label, fmt(e["mean"], 2, True), fmt(e["half"]), fmt(e["lo"], 2, True),
            fmt(e["hi"], 2, True), e["n"], fmt(e["df"], 0)))
    out.append("pairs: %d across %d opponents%s" % (
        result["pairs"], len(result["rows"]), ", weighted" if result["weighted"] else ""))
    out.append("")
    m = result["margin"]
    for label, key in (("per battle", "battle"), ("opponent-clustered", "cluster")):
        t = tost(result[key], m)
        out.append("TOST %-19s margin %s: non-inferior p=%s (%s); equivalent p=%s (%s); "
                   "90%% interval [%s, %s]" % (
                       label, fmt(m), fmtp(t["p_noninferior"]), "yes" if t["noninferior"] else "no",
                       fmtp(t["p_equivalent"]), "yes" if t["equivalent"] else "no",
                       fmt(t["lower90"], 2, True), fmt(t["upper90"], 2, True)))
    out.append("")
    out.append("%-34s %3s %8s %7s %8s %8s %8s %8s" % (
        "opponent", "n", "diff", "+/-", "p", "Holm", "BH", "NI p"))
    for r in sorted(result["rows"], key=lambda r: (math.isnan(r["p"]), r["p"])):
        out.append("%-34s %3d %8s %7s %8s %8s %8s %8s" % (
            r["opponent"][:34], r["n"], fmt(r["mean"], 2, True), fmt(r["half"]),
            fmtp(r["p"]), fmtp(r["p_holm"]), fmtp(r["p_bh"]), fmtp(r["p_ni"])))
    rows = result["rows"]
    out.append("")
    out.append("opponents significant at 0.05: Holm %d, BH %d, of %d" % (
        sum(1 for r in rows if r["p_holm"] < 0.05), sum(1 for r in rows if r["p_bh"] < 0.05),
        len(rows)))
    return "\n".join(out)


def render_plan(rows, halfwidth, unit):
    out = ["seeds per build needed for a 95%% half-width of %s %s per opponent, "
           "from the unpaired SD" % (fmt(halfwidth), unit), "",
           "%-34s %4s %8s %8s %9s %6s" % ("opponent", "now", "sd cand", "sd base", "sd paired", "need")]
    for r in rows:
        out.append("%-34s %4d %8s %8s %9s %6d" % (
            r["opponent"][:34], r["n"], fmt(r["sd_cand"]), fmt(r["sd_base"]), fmt(r["sd_paired"]),
            r["need"]))
    out.append("")
    out.append("total seeds per build over %d opponents: %d (now %d)" % (
        len(rows), sum(r["need"] for r in rows), sum(r["n"] for r in rows)))
    ratios = [r["ratio"] for r in rows if not math.isnan(r["ratio"])]
    if ratios:
        out.append("mean paired/unpaired variance ratio: %.2f (1.00 means pairing buys nothing)"
                   % (sum(ratios) / len(ratios)))
    return "\n".join(out)


def pick_builds(rows, candidate, baseline):
    builds = []
    for row in rows:
        if row["build"] not in builds:
            builds.append(row["build"])
    if candidate is None and baseline is None:
        if len(builds) != 2:
            raise SystemExit("found builds %s; name them with --candidate and --baseline" % builds)
        return builds[0], builds[1]
    rest = [b for b in builds if b not in (candidate, baseline)]
    if candidate is None and len(rest) == 1:
        candidate = rest[0]
    if baseline is None and len(rest) == 1:
        baseline = rest[0]
    if candidate is None or baseline is None:
        raise SystemExit("name both builds with --candidate and --baseline (found %s)" % builds)
    return candidate, baseline


def main(argv=None):
    ap = argparse.ArgumentParser(description=__doc__,
                                 formatter_class=argparse.RawDescriptionHelpFormatter)
    ap.add_argument("tsv", nargs="+", help="bench TSV file(s) with candidate and baseline rows")
    ap.add_argument("--candidate", help="candidate build label (default: first build in the file)")
    ap.add_argument("--baseline", help="baseline build label (default: the other build)")
    ap.add_argument("--metric", default="score_share", help="column to compare (default score_share)")
    ap.add_argument("--scale", type=float, help="multiply the metric (default 100 for *_share, else 1)")
    ap.add_argument("--margin", type=float, default=1.0,
                    help="non-inferiority margin in points (default 1.0)")
    ap.add_argument("--weights", nargs="?", const="weight", metavar="COL",
                    help="weight opponents by this column (default name: weight)")
    ap.add_argument("--plan", action="store_true", help="print seeds needed per opponent instead")
    ap.add_argument("--halfwidth", type=float, default=2.0,
                    help="target 95%% half-width for --plan, in points (default 2.0)")
    args = ap.parse_args(argv)

    rows = load(args.tsv, args.metric)
    candidate, baseline = pick_builds(rows, args.candidate, args.baseline)
    share = args.metric.endswith("_share")
    scale = args.scale if args.scale is not None else (100.0 if share else 1.0)
    unit = "points" if share and scale == 100.0 else "units of " + args.metric
    weight_col = None
    if args.weights:
        if not rows or args.weights not in rows[0]:
            raise SystemExit("no weight column %r in the TSV" % args.weights)
        weight_col = args.weights
    per_opp = pair(rows, args.metric, candidate, baseline, scale, weight_col)
    if not per_opp:
        raise SystemExit("no (opponent, seed) pairs with both %s and %s" % (candidate, baseline))
    if args.plan:
        print(render_plan(plan(per_opp, args.halfwidth), args.halfwidth, unit))
    else:
        print(render(analyse(per_opp, args.margin), candidate, baseline, args.metric, unit))
    return 0


if __name__ == "__main__":
    sys.exit(main())

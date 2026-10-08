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
  --live PAGE.csv  (issue #151) read the run the way LiteRumble would: each build's APS, CI and
             PWIN by LiteRumble's arithmetic, the per-opponent differences projected onto the
             live APS of the parsed BotDetails page (literumble.py), and the run's coverage of
             the live field by rank band, with set entries whose version is not the live one.
  --json FILE      also write analysis.json (docs/bench/analysis-json.md): the numbers above, a
             trust gate (TRUSTED, CAUTION, NOT_TRUSTED), the opponents set aside, and the run's
             conditions. --conditions FILE reads the run's conditions.json for the latter.

The HEADLINE is the opponent-clustered interval: the opponents are a sample of the field, so the
interval has to allow for how much they differ from each other. The per-battle interval treats
every battle as an independent draw about one opponent and is narrower; it is shown for
reference and never decides the verdict. More seeds against the same opponents narrow only the
within-opponent part, so --plan also says when more opponents are the only way to narrow it.
"""

import argparse
import csv
import json
import math
import os
import re
import sys
from collections import OrderedDict

import literumble

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


def read_rows(paths, metric):
    """Every row of one or more TSVs as dicts, failed battles included (ok is 'true' or 'false')."""
    rows = []
    for path in paths:
        with open(path, encoding="utf-8", newline="") as f:
            for row in csv.DictReader(f, delimiter="	"):
                row["ok"] = row.get("ok", "true").strip().lower()
                rows.append(row)
    if rows and metric not in rows[0]:
        if metric == "score_share" and "score" in rows[0] and "theirScore" in rows[0]:
            for row in rows:
                if row["ok"] == "false":
                    continue
                s, t = float(row["score"]), float(row["theirScore"])
                row["score_share"] = repr(s / (s + t)) if s + t > 0 else ""
        else:
            raise SystemExit("column %r not in %s" % (metric, paths))
    return rows


def load(paths, metric):
    """Rows as dicts from one or more TSVs; failed battles (ok false) are dropped."""
    return [r for r in read_rows(paths, metric) if r["ok"] != "false"]


def _num(row, key):
    """A row's column as a float, or None when the column is absent or empty."""
    v = row.get(key, "")
    if v is None or v == "":
        return None
    try:
        x = float(v)
    except ValueError:
        return None
    return None if math.isnan(x) else x


def untrusted_reasons(row, skips_per_round=2.0):
    """Why a battle row is not trusted, mirroring BattleResult.trusted(): duress ticks, a missing
    R record, more than skips_per_round skipped turns a round, or a JDK resource denied to a robot
    (BENCH-84). The one exception is the last
    round's record that never arrives on this engine (finalRMissing, G14), which both builds
    share and which is not held against a row; with no rShortfall column any record short of
    the rounds counts. Columns the TSV lacks are not held against the row. A reference build
    (reference = 1: a robot that is not Hadur, issue #138) writes no R records, so the record
    rule is not applied to it and the engine's skipped turns are its trust signal."""
    why = []
    duress = _num(row, "duressTicks")
    if duress is not None and duress > 0:
        why.append("duress")
    rounds, records = _num(row, "rounds"), _num(row, "roundRecords")
    short, final = _num(row, "rShortfall"), _num(row, "finalRMissing")
    if str(row.get("reference", "")).strip() == "1":
        pass
    elif short is not None and final is not None:
        if short - final > 0:
            why.append("R records")
    elif rounds is not None and records is not None and records != rounds:
        why.append("R records")
    skips = _num(row, "skippedTurns")
    if rounds is not None and skips is not None and skips > skips_per_round * rounds:
        why.append("skips")
    if host_denials(row.get("errors", "")) > 0:
        why.append("JDK resource denied")
    return why


def host_denials(errors):
    """BENCH-84, as BattleResult.hostDenials(): security-manager denials naming a JDK service
    resource (META-INF/...) on the bench's class path, which cripple the robot they hit and never
    happen on a RoboRumble client (issue #151)."""
    parts = str(errors or "").split("Preventing ")[1:]
    return sum(1 for p in parts if "META-INF" in p)


def pair(rows, metric, candidate, baseline, scale, weight_col=None):
    """OrderedDict opponent -> dict(diffs, cand, base, weight, duress, untrusted), paired by
    (opponent, seed). duress and untrusted are one bool per pair: duress on either side, and
    untrusted_reasons() on either side."""
    by = OrderedDict()
    weights = {}
    for row in rows:
        if row["build"] not in (candidate, baseline) or row.get(metric, "") == "":
            continue
        got = by.setdefault((row["opponent"], row["seed"]), {})
        got[row["build"]] = (float(row[metric]) * scale, row)
        if weight_col and row.get(weight_col, "") != "":
            weights[row["opponent"]] = float(row[weight_col])
    out = OrderedDict()
    for (opp, _seed), got in by.items():
        if candidate in got and baseline in got:
            o = out.setdefault(opp, dict(diffs=[], cand=[], base=[], duress=[], untrusted=[],
                                         weight=weights.get(opp, 1.0)))
            (cv, cr), (bv, br) = got[candidate], got[baseline]
            o["diffs"].append(cv - bv)
            o["cand"].append(cv)
            o["base"].append(bv)
            o["duress"].append(any("duress" in untrusted_reasons(r) for r in (cr, br)))
            o["untrusted"].append(bool(untrusted_reasons(cr) or untrusted_reasons(br)))
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


SELECTION_WARNING = ("set chosen from the baseline's results; gaps are likely overstated "
                     "(regression to the mean); confirm on fresh opponents")
FLOOR_SKIPS_PER_BATTLE = 100.0
FLOOR_SHARE = 35.0
SKIPS_PER_ROUND_LIMIT = 2.0


def excluded_opponents(all_rows, candidate, baseline):
    """Opponents whose every battle (either build) failed: they carry no pairs, so they are set
    aside and named, not silently missing from the pooled figures."""
    tally = OrderedDict()
    for row in all_rows:
        if row["build"] not in (candidate, baseline):
            continue
        t = tally.setdefault(row["opponent"], [0, 0])
        t[1] += 1
        t[0] += row["ok"] == "false"
    return [dict(name=o, reason="failed every battle (%d of %d)" % (f, n), failed=f, total=n)
            for o, (f, n) in tally.items() if n and f == n]


def failed_counts(all_rows, candidate, baseline):
    out = {}
    for row in all_rows:
        if row["build"] in (candidate, baseline) and row["ok"] == "false":
            out[row["opponent"]] = out.get(row["opponent"], 0) + 1
    return out


def _mean(xs):
    xs = [x for x in xs if x is not None]
    return sum(xs) / len(xs) if xs else None


def mean_column(rows, build, key):
    """The mean of a column over one build's rows. A negative duressTicks is the bench's
    "unknown" (a reference build writes none), so it is left out rather than averaged in."""
    xs = [_num(r, key) for r in rows if r["build"] == build]
    if key == "duressTicks":
        xs = [x for x in xs if x is None or x >= 0]
    return _mean(xs)


def trust_summary(per_opp, ok_rows, candidate, baseline):
    """Skips and duress per battle by build, and how many pairs are untrusted or carry duress."""
    pairs = sum(len(o["diffs"]) for o in per_opp.values())
    return dict(
        pairs=pairs,
        untrusted=sum(sum(o["untrusted"]) for o in per_opp.values()),
        duressPairs=sum(sum(o["duress"]) for o in per_opp.values()),
        skipped=dict(cand=mean_column(ok_rows, candidate, "skippedTurns"),
                     base=mean_column(ok_rows, baseline, "skippedTurns")),
        duress=dict(cand=mean_column(ok_rows, candidate, "duressTicks"),
                    base=mean_column(ok_rows, baseline, "duressTicks")))


def without_duress(per_opp):
    """The pooled paired difference with every pair that had duress on either side removed, as
    dict(n, diff, clusteredCi95, removed); None when no pair carried duress or none is left."""
    kept = OrderedDict()
    removed = 0
    for opp, o in per_opp.items():
        idx = [i for i, d in enumerate(o["duress"]) if not d]
        removed += len(o["diffs"]) - len(idx)
        if idx:
            kept[opp] = dict(diffs=[o["diffs"][i] for i in idx], cand=[o["cand"][i] for i in idx],
                             base=[o["base"][i] for i in idx], duress=[False] * len(idx),
                             untrusted=[o["untrusted"][i] for i in idx], weight=o["weight"])
    if not removed or not kept:
        return None
    res = analyse(kept, 1.0)
    c = res["cluster"]
    return dict(n=res["pairs"], diff=c["mean"], clusteredCi95=[c["lo"], c["hi"]], removed=removed)


def floor_state(ok_rows, per_opp, trust, share_metric=True):
    """True when both builds are pushed so far that their difference is a floor effect: more than
    FLOOR_SKIPS_PER_BATTLE skipped turns a battle on either side, or both mean score shares under
    FLOOR_SHARE with skipping over the trusted limit. Returns (flag, reasons)."""
    reasons = []
    skips = [v for v in trust["skipped"].values() if v is not None]
    if skips and max(skips) > FLOOR_SKIPS_PER_BATTLE:
        reasons.append("skipped turns reach %.0f a battle (over %.0f)"
                       % (max(skips), FLOOR_SKIPS_PER_BATTLE))
    cm = _mean([x for o in per_opp.values() for x in o["cand"]])
    bm = _mean([x for o in per_opp.values() for x in o["base"]])
    rounds = _mean([_num(r, "rounds") for r in ok_rows])
    if (share_metric and cm is not None and bm is not None and cm < FLOOR_SHARE and bm < FLOOR_SHARE and skips
            and rounds and max(skips) > SKIPS_PER_ROUND_LIMIT * rounds):
        reasons.append("both builds average under %.0f%% score share while skipping over %.1f "
                       "turns a round" % (FLOOR_SHARE, SKIPS_PER_ROUND_LIMIT))
    return bool(reasons), reasons


def pooled_verdict(cluster, margin):
    """level when the clustered 90% interval sits inside +-margin (TOST equivalent), else up or
    down when the clustered 95% interval excludes zero, else not-resolved."""
    if math.isnan(cluster["mean"]) or math.isnan(cluster["half"]):
        return "not-resolved"
    if tost(cluster, margin)["equivalent"]:
        return "level"
    if cluster["hi"] < 0:
        return "down"
    if cluster["lo"] > 0:
        return "up"
    return "not-resolved"


def gate(trust, floor, floor_reasons, ok_rows, host_load, other_jvms, selected_on):
    """TRUSTED, CAUTION or NOT_TRUSTED with the reasons.

    NOT_TRUSTED: no pairs, more than a quarter of the pairs untrusted (duress, missing R records,
    over 2 skipped turns a round), or the two builds skipping very different numbers of turns
    (over 1.5 times and 10 more a battle: they ran under different load).
    CAUTION: any untrusted pairs, a floor effect, mixed rounds, the host busier than 85% or other
    Robocode JVMs running, or a set selected from the baseline's results."""
    bad, caution = [], []
    if not trust["pairs"]:
        bad.append("no (opponent, seed) pairs with both builds")
    else:
        share = trust["untrusted"] / trust["pairs"]
        if share > 0.25:
            bad.append("%.0f%% of pairs are untrusted (duress, skipped turns or R records)"
                       % (100 * share))
        elif trust["untrusted"]:
            caution.append("%d of %d pairs are untrusted (%.0f%%)" % (
                trust["untrusted"], trust["pairs"], 100 * share))
        c, b = trust["skipped"]["cand"], trust["skipped"]["base"]
        if c is not None and b is not None and max(c, b) > 1.5 * min(c, b) and abs(c - b) > 10:
            bad.append("the builds skipped different numbers of turns (%.1f against %.1f a "
                       "battle): they ran under different load" % (c, b))
    if floor:
        caution.extend("floor effect: " + r + "; sign differences here are not evidence"
                       for r in floor_reasons)
    rounds = sorted({r.get("rounds") for r in ok_rows if r.get("rounds")})
    if len(rounds) > 1:
        caution.append("mixed rounds per battle in the rows: " + ", ".join(rounds))
    if host_load["mean"] is not None and host_load["mean"] > 0.85:
        caution.append("host CPU averaged %.0f%%" % (100 * host_load["mean"]))
    if other_jvms:
        caution.append("up to %d other Robocode JVMs ran beside the bench" % other_jvms)
    if selected_on == "baseline":
        caution.append(SELECTION_WARNING)
    if bad:
        return dict(verdict="NOT_TRUSTED", reasons=bad + caution)
    if caution:
        return dict(verdict="CAUTION", reasons=caution)
    return dict(verdict="TRUSTED", reasons=[])


def conditions_of(cond, ok_rows):
    """The run's conditions for analysis.json: from conditions.json when given, else what the
    rows' host columns hold, else None (not measured)."""
    cond = cond or {}
    opts = cond.get("options") or {}
    sample = cond.get("hostSample") or {}
    cpu = cond.get("cpuConstant")
    if isinstance(cpu, str):
        m = re.search(r"=\s*(\d+)", cpu) or re.search(r"(\d+)", cpu)
        cpu = int(m.group(1)) if m else None
    child_cpus = cond.get("childCpus")
    child_cpus = int(child_cpus) if str(child_cpus).isdigit() else None
    mins = [_num(r, "hostCpuMin") for r in ok_rows]
    mins = [x for x in mins if x is not None and x >= 0]
    maxs = [_num(r, "hostCpuMax") for r in ok_rows]
    maxs = [x for x in maxs if x is not None and x >= 0]
    means = [_num(r, "hostCpuMean") for r in ok_rows]
    means = [x for x in means if x is not None and x >= 0]
    jvms = [_num(r, "otherJvms") for r in ok_rows]
    jvms = [x for x in jvms if x is not None and x >= 0]
    host_load = dict(min=sample.get("cpuMin", min(mins) if mins else None),
                     mean=sample.get("cpuMean", _mean(means)),
                     max=sample.get("cpuMax", max(maxs) if maxs else None))
    other = sample.get("otherJvmsMax", int(max(jvms)) if jvms else None)
    return dict(host=cond.get("host"), cpuConstant=cpu, parallel=cond.get("parallel"),
                childHeap=opts.get("child-heap"), childCpus=child_cpus,
                hostLoad=host_load, otherJvms=other)


def _j(x):
    """JSON-safe: NaN and infinities become null."""
    if isinstance(x, float) and (math.isnan(x) or math.isinf(x)):
        return None
    if isinstance(x, dict):
        return {k: _j(v) for k, v in x.items()}
    if isinstance(x, (list, tuple)):
        return [_j(v) for v in x]
    return x


def opponent_skips(ok_rows, candidate, baseline):
    out = {}
    for opp in {r["opponent"] for r in ok_rows}:
        rs = [r for r in ok_rows if r["opponent"] == opp]
        out[opp] = dict(cand=mean_column(rs, candidate, "skippedTurns"),
                        base=mean_column(rs, baseline, "skippedTurns"))
    return out


def run_meta(cond, args, tsv_paths, ok_rows):
    """label, set, seeds, rounds, engine and date for analysis.json, from conditions.json when
    given and the command line over it."""
    cond = cond or {}
    started = cond.get("started") or ""
    return dict(label=args.label or os.path.splitext(os.path.basename(tsv_paths[0]))[0],
                set=args.set_name or cond.get("set"), seeds=cond.get("seeds"),
                rounds=cond.get("rounds"), engine=cond.get("engine"),
                date=started[:10] or None)


def build_json(per_opp, result, all_rows, ok_rows, candidate, baseline, margin, cond, meta,
               selected_on, metric="score_share"):
    """The analysis.json document (docs/bench/analysis-json.md)."""
    conditions = conditions_of(cond, ok_rows)
    trust = trust_summary(per_opp, ok_rows, candidate, baseline)
    floor, floor_reasons = floor_state(ok_rows, per_opp, trust, metric.endswith("_share"))
    g = gate(trust, floor, floor_reasons, ok_rows, conditions["hostLoad"],
             conditions["otherJvms"], selected_on)
    conditions = dict(conditions, hostLoad={k: (None if v is None else round(100.0 * v, 1))
                                            for k, v in conditions["hostLoad"].items()})
    cl, bt = result["cluster"], result["battle"]
    t = tost(cl, margin)
    failed = failed_counts(all_rows, candidate, baseline)
    skips = opponent_skips(ok_rows, candidate, baseline)
    opponents = [dict(name=r["opponent"], diff=r["mean"],
                      ci95=[r["mean"] - r["half"], r["mean"] + r["half"]],
                      holm=r["p_holm"], bh=r["p_bh"],
                      skips=skips.get(r["opponent"], dict(cand=None, base=None)),
                      n=r["n"], failed=failed.get(r["opponent"], 0)) for r in result["rows"]]
    rounds = meta.get("rounds") or _mean([_num(r, "rounds") for r in ok_rows])
    seeds = meta.get("seeds") or max((len(o["diffs"]) for o in per_opp.values()), default=None)
    doc = dict(
        schema=1,
        run=dict(label=meta.get("label"), candidate=candidate, baseline=baseline,
                 set=meta.get("set"), seeds=seeds, rounds=int(rounds) if rounds else None,
                 engine=meta.get("engine"), date=meta.get("date"), selectedOn=selected_on,
                 conditions=conditions),
        gate=g,
        pooled=dict(diff=cl["mean"], ci95=[bt["lo"], bt["hi"]], clusteredCi95=[cl["lo"], cl["hi"]],
                    n=result["pairs"], nOpponents=len(result["rows"]),
                    tost=dict(margin=margin, p=t["p_equivalent"], equivalent=t["equivalent"]),
                    verdict=pooled_verdict(cl, margin)),
        opponents=opponents,
        excluded=excluded_opponents(all_rows, candidate, baseline),
        floorWarning=floor,
        trust=dict(skippedPerBattle=trust["skipped"], duressPerBattle=trust["duress"],
                   untrustedPairs=trust["untrusted"], pairs=trust["pairs"],
                   withoutDuress=without_duress(per_opp)))
    return _j(doc)


def live_read(page, all_rows, result, candidate, baseline, unrunnable=None):
    """Issue #151 (A5, A6, A9): the run read as LiteRumble reads a bot. Returns dict(text, json)."""
    pairings = literumble.read_page(page)
    bad = literumble.read_set(unrunnable) if unrunnable and os.path.exists(unrunnable) else []
    builds = OrderedDict()
    for b in (candidate, baseline):
        builds[b] = literumble.bench_summary(literumble.bench_per_opponent(all_rows, b))
    # The projection is in APS points whatever --metric and --scale the headline used: score
    # share, scaled to 0-100, paired over the usable battles.
    shares = []
    for r in all_rows:
        if r["ok"] == "false":
            continue
        share = literumble.row_share(r)
        if share is not None:
            shares.append(dict(r, _aps=repr(share)))
    paired = pair(shares, "_aps", candidate, baseline, 1.0)
    diffs = OrderedDict((r["opponent"], (r["mean"], r["se"])) for r in analyse(paired, 1.0)["rows"])
    proj = literumble.project(diffs, pairings)
    names = list(OrderedDict.fromkeys(r["opponent"] for r in all_rows))
    cov = literumble.coverage(names, pairings, bad, measured=set(diffs))
    text = ["LITERUMBLE-STYLE (each opponent once, unweighted; not the headline above)"]
    for b, s in builds.items():
        if s:
            text.append("  " + literumble.render_summary(s, b))
    text.append("")
    text.append(literumble.render_projection(proj))
    text.append("")
    text.append(literumble.render_coverage(cov))
    doc = dict(page=os.path.basename(page), builds=builds,
               projection=dict(direct=proj["direct"], directSe=proj["direct_se"],
                               extrapolated=proj["extrapolated"], pairings=proj["pairings"],
                               covered=proj["covered"], bands=proj["bands"],
                               bandsLeftOut=proj["bands_left_out"], notLive=proj["missing"]),
               coverage=dict(bands=[dict(band=l, pairings=n, covered=c) for l, n, c in cov["bands"]],
                             flagged=[dict(name=n, status=st, live=lv, rank=rk)
                                      for n, st, lv, rk in cov["entries"] if st != "live"]))
    return dict(text="\n".join(text), json=doc)


def plan_pooled(per_opp, halfwidth):
    """What narrows the POOLED opponent-clustered interval. The opponents' own spread (the
    between SD) is not shrunk by seeds, so the pooled half-width cannot fall below
    t * between_sd / sqrt(k) for k opponents however many seeds are fought. Returns dict(k,
    between_sd, floor_half, k_need, seeds_limited), or None with fewer than two opponents."""
    means = [mean_sd(o["diffs"])[0] for o in per_opp.values()]
    k = len(means)
    if k < 2:
        return None
    var_means = mean_sd(means)[1] ** 2
    within = [mean_sd(o["diffs"])[1] ** 2 / len(o["diffs"]) for o in per_opp.values()
              if len(o["diffs"]) > 1]
    within_mean = sum(within) / len(within) if within else 0.0
    between_var = max(0.0, var_means - within_mean)
    floor_half = t_ppf(0.975, k - 1) * math.sqrt(between_var / k)
    k_need = None
    for kk in range(2, 100000):
        if t_ppf(0.975, kk - 1) * math.sqrt(between_var / kk) <= halfwidth:
            k_need = kk
            break
    return dict(k=k, between_sd=math.sqrt(between_var), floor_half=floor_half, k_need=k_need,
                seeds_limited=floor_half > halfwidth)


def fmt(x, places=2, signed=False):
    if x is None or math.isnan(x):
        return "n/a"
    return ("%+.*f" if signed else "%.*f") % (places, x)


def fmtp(p):
    if math.isnan(p):
        return "n/a"
    return "<0.0001" if p < 1e-4 else "%.4f" % p


def render(result, candidate, baseline, metric, unit, margin=None, extra=None):
    """The text report. The opponent-clustered interval leads and decides the verdict; the
    per-battle interval follows for reference. extra carries the gate, exclusions and warnings."""
    margin = result["margin"] if margin is None else margin
    extra = extra or {}
    cl, bt = result["cluster"], result["battle"]
    out = ["%s: %s minus %s, paired by (opponent, seed), in %s" % (metric, candidate, baseline, unit)]
    if extra.get("engine"):
        out.append("engine: Robocode %s" % extra["engine"])
    out.append("")
    out.append("HEADLINE  %s +/- %s  [%s, %s]  opponent-clustered 95%% interval, %d opponents  -> %s" % (
        fmt(cl["mean"], 2, True), fmt(cl["half"]), fmt(cl["lo"], 2, True), fmt(cl["hi"], 2, True),
        cl["n"], pooled_verdict(cl, margin).upper()))
    out.append("per battle %s +/- %s  [%s, %s]  n=%d  (ignores how much the opponents differ; "
               "narrower, for reference only)" % (
                   fmt(bt["mean"], 2, True), fmt(bt["half"]), fmt(bt["lo"], 2, True),
                   fmt(bt["hi"], 2, True), bt["n"]))
    out.append("pairs: %d across %d opponents%s" % (
        result["pairs"], len(result["rows"]), ", weighted" if result["weighted"] else ""))
    if not math.isnan(bt["half"]) and not math.isnan(cl["half"]) and cl["half"] > 1.5 * bt["half"]:
        out.append("the clustered interval is %.1f times the per-battle one: the opponents' own "
                   "spread dominates, so more seeds will not resolve this, more opponents might"
                   % (cl["half"] / bt["half"]))
    if extra.get("gate"):
        g = extra["gate"]
        out.append("")
        out.append("GATE %s" % g["verdict"])
        out.extend("  - " + r for r in g["reasons"])
        if g["verdict"] == "NOT_TRUSTED":
            out.append("  the headline above is not a result: this run's conditions were not trusted")
    sd = extra.get("without_duress")
    if sd:
        out.append("without the %d pairs with duress on either side: %s  [%s, %s]  n=%d (clustered)" % (
            sd["removed"], fmt(sd["diff"], 2, True), fmt(sd["clusteredCi95"][0], 2, True),
            fmt(sd["clusteredCi95"][1], 2, True), sd["n"]))
    for ex in extra.get("excluded", []):
        out.append("excluded from the pooled figures: %s, %s" % (ex["name"], ex["reason"]))
    out.append("")
    for label, key in (("opponent-clustered", "cluster"), ("per battle", "battle")):
        t = tost(result[key], margin)
        out.append("TOST %-19s margin %s: non-inferior p=%s (%s); equivalent p=%s (%s); "
                   "90%% interval [%s, %s]" % (
                       label, fmt(margin), fmtp(t["p_noninferior"]), "yes" if t["noninferior"] else "no",
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


def render_plan(rows, halfwidth, unit, pooled=None):
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
    if pooled:
        out.append("")
        out.append("pooled opponent-clustered interval over %d opponents: the opponents differ from "
                   "each other with SD %s %s, which no number of seeds shrinks" % (
                       pooled["k"], fmt(pooled["between_sd"]), unit))
        if pooled["seeds_limited"]:
            need = ("about %d opponents" % pooled["k_need"]) if pooled["k_need"] else "many more opponents"
            out.append("MORE OPPONENTS, NOT MORE SEEDS: even with unlimited seeds the pooled half-width "
                       "stays at about %s %s; reaching %s needs %s (now %d)" % (
                           fmt(pooled["floor_half"]), unit, fmt(halfwidth), need, pooled["k"]))
        else:
            out.append("the pooled half-width floor from the opponent spread is about %s %s, under "
                       "the target %s: seeds can still narrow it" % (
                           fmt(pooled["floor_half"]), unit, fmt(halfwidth)))
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
    ap.add_argument("--json", metavar="FILE", help="also write analysis.json here")
    ap.add_argument("--conditions", metavar="FILE",
                    help="the run's conditions.json, for analysis.json's conditions block")
    ap.add_argument("--label", help="run label for analysis.json (default: the TSV's name)")
    ap.add_argument("--set-name", help="opponent set name for analysis.json (default: conditions.json's)")
    ap.add_argument("--live", metavar="PAGE.csv",
                    help="a parsed BotDetails page: add the LiteRumble-style read (issue #151)")
    ap.add_argument("--unrunnable", metavar="FILE",
                    default=os.path.join(os.path.dirname(os.path.abspath(__file__)), "..", "..",
                                         "hadur-bench", "unrunnable.txt"),
                    help="robots no build can fight, flagged in --live's coverage "
                         "(default hadur-bench/unrunnable.txt)")
    ap.add_argument("--selected-on", choices=["baseline"],
                    help="the opponent set was chosen from the baseline's results: warn that the "
                         "gaps are likely overstated")
    args = ap.parse_args(argv)

    all_rows = read_rows(args.tsv, args.metric)
    rows = [r for r in all_rows if r["ok"] != "false"]
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
    cond = None
    if args.conditions:
        with open(args.conditions, encoding="utf-8") as f:
            cond = json.load(f)
    if args.plan:
        print(render_plan(plan(per_opp, args.halfwidth), args.halfwidth, unit,
                          plan_pooled(per_opp, args.halfwidth)))
        return 0
    result = analyse(per_opp, args.margin)
    doc = build_json(per_opp, result, all_rows, rows, candidate, baseline, args.margin, cond,
                     run_meta(cond, args, args.tsv, rows), args.selected_on, args.metric)
    extra = dict(gate=doc["gate"], excluded=doc["excluded"],
                 without_duress=doc["trust"]["withoutDuress"], engine=doc["run"]["engine"])
    print(render(result, candidate, baseline, args.metric, unit, args.margin, extra))
    if args.live:
        live = live_read(args.live, all_rows, result, candidate, baseline, args.unrunnable)
        doc["live"] = _j(live["json"])
        print("")
        print(live["text"])
    if args.json:
        with open(args.json, "w", encoding="utf-8") as f:
            json.dump(doc, f, indent=2)
            f.write("\n")
    return 0


if __name__ == "__main__":
    sys.exit(main())

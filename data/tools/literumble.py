#!/usr/bin/env python3
"""LiteRumble's arithmetic, so bench numbers can be read the way the live ranking reads them
(issue #151, A5, A6, A9). Standard library only.

  python3 data/tools/literumble.py summary PAGE.csv
  python3 data/tools/literumble.py coverage SET.txt PAGE.csv [--unrunnable FILE]
  python3 data/tools/literumble.py score BENCH.tsv [--build LABEL]

PAGE.csv is a BotDetails page parsed by parse_rumble_page.py (one row per live pairing).

How LiteRumble scores (checked against the 3.9 page, whose header this reproduces exactly from
its 1,215 pairing rows: APS 87.15, CI +/-0.19, PWIN 99.34, survival 95.04, 1,885 battles):
  per battle   100 * a / (a + b) from the two total scores; survival is rounds won (the client
               uploads getFirsts()), never Robocode's survival score
  per pairing  the mean over the pairing's battles; its variance is shrunk toward a prior of
               16 with weight 3, (SS + 16 * 3) / (n + 2), so a one-battle pairing shows
               +/-1.96 * 4 = 7.84
  per bot      APS is the UNWEIGHTED mean of the pairing APS; the CI is
               1.96 * sqrt(sum(var_i / n_i)) / P; PWIN is the share of pairings above 50, a
               tie counting half; survival is the mean pairing survival
ANPP is not the mean of the NPP column (87.83 against the page's 90.31), so it is not offered.

Projection (A5): because APS is a flat mean over P pairings, a change of d_i points against
opponent i moves APS by exactly sum(d_i) / P over the opponents a bench set covers. The rest of
the field is assumed unchanged; the band extrapolation instead assumes every uncovered pairing
in a rank band moves by that band's mean, and says so.
"""

import argparse
import csv
import math
import sys
from collections import OrderedDict

PRIOR_VAR = 16.0
PRIOR_WEIGHT = 3
Z95 = 1.96
# Rank bands used across the live analyses (docs/bench/live-3.9.md).
BANDS = ((1, 50), (51, 200), (201, 400), (401, 700), (701, None))


def band_label(band):
    lo, hi = band
    return "%d+" % lo if hi is None else "%d-%d" % (lo, hi)


def band_of(rank):
    for b in BANDS:
        if rank >= b[0] and (b[1] is None or rank <= b[1]):
            return b
    raise ValueError("rank %r" % rank)


def _f(x):
    return float(str(x).replace("±", "").replace("+/-", "").strip())


def read_page(path):
    """Pairings of a parsed BotDetails CSV: dicts name, aps, ci, survival, battles, opponent_aps."""
    out = []
    with open(path, encoding="utf-8", newline="") as f:
        for row in csv.DictReader(f):
            out.append(dict(name=row["name"].strip(), aps=_f(row["aps"]), ci=_f(row["aps_ci"]),
                            survival=_f(row["survival"]), battles=int(row["battles"]),
                            opponent_aps=_f(row["opponent_aps"])))
    if not out:
        raise SystemExit("no pairings in %s" % path)
    return out


def shrunk_var(values):
    """A pairing's variance as LiteRumble keeps it: the sum of squares about the mean plus the
    prior's, over n + 2. One value gives the prior, 16."""
    n = len(values)
    if n == 0:
        return PRIOR_VAR
    m = sum(values) / n
    ss = sum((v - m) ** 2 for v in values)
    return (ss + PRIOR_VAR * PRIOR_WEIGHT) / (n - 1 + PRIOR_WEIGHT)


def pwin(apses):
    """Share (0-100) of pairings won: APS above 50, a tie counting half."""
    if not apses:
        return float("nan")
    won = sum(1.0 if a > 50 else 0.5 if a == 50 else 0.0 for a in apses)
    return 100.0 * won / len(apses)


def summary(pairings):
    """The bot's header line from its pairing rows, the way LiteRumble computes it."""
    p = len(pairings)
    apses = [x["aps"] for x in pairings]
    var_n = sum((x["ci"] / Z95) ** 2 for x in pairings)
    return dict(aps=sum(apses) / p, ci=Z95 * math.sqrt(var_n) / p, pwin=pwin(apses),
                survival=sum(x["survival"] for x in pairings) / p, pairings=p,
                battles=sum(x["battles"] for x in pairings))


def bench_summary(per_opponent):
    """LiteRumble-style APS, CI, PWIN and survival for one build of a bench run.
    per_opponent: name -> dict(shares=[points 0-100 per battle], survival=[points per battle]).
    Labelled as LiteRumble-style: the bench's own headline stays the clustered paired interval."""
    if not per_opponent:
        return None
    means, var_n, surv = [], 0.0, []
    for o in per_opponent.values():
        xs = o["shares"]
        means.append(sum(xs) / len(xs))
        var_n += shrunk_var(xs) / len(xs)
        if o.get("survival"):
            surv.append(sum(o["survival"]) / len(o["survival"]))
    p = len(means)
    return dict(aps=sum(means) / p, ci=Z95 * math.sqrt(var_n) / p, pwin=pwin(means),
                survival=sum(surv) / len(surv) if surv else float("nan"), pairings=p,
                battles=sum(len(o["shares"]) for o in per_opponent.values()))


def ranks(pairings, self_aps=None):
    """name -> the opponent's ladder rank, by their own APS (the page's opponent APS column), so
    a band needs no separate rankings page. The page's own bot is not among its pairings, so it
    takes its place by its APS (self_aps, by default the page's own, the mean pairing APS) and
    every opponent below it moves down one, as on the ladder."""
    if self_aps is None:
        self_aps = sum(x["aps"] for x in pairings) / len(pairings) if pairings and "aps" in pairings[0] else None
    order = sorted(pairings, key=lambda x: -x["opponent_aps"])
    out = {}
    for i, x in enumerate(order):
        below_self = self_aps is not None and x["opponent_aps"] < self_aps
        out[x["name"]] = i + (2 if below_self else 1)
    return out


def split_name(name):
    """'pkg.Bot 1.2' -> ('pkg.Bot', '1.2'); a name with no version keeps '' as its version."""
    name = name.strip()
    base, _, version = name.rpartition(" ")
    return (base, version) if base else (name, "")


def read_set(path):
    """Robot names of a bench set or unrunnable list (name | ... per line, # comments)."""
    names = []
    with open(path, encoding="utf-8") as f:
        for line in f:
            line = line.strip()
            if not line or line.startswith("#") or "=" in line.split("|")[0]:
                continue
            names.append(line.split("|")[0].strip())
    return names


def coverage(names, pairings, unrunnable=(), measured=None):
    """How a bench set sits on the live field (A6). Returns dict(entries, bands): each entry is
    (name, status, live_name, rank) with status live, drift (same robot, other version live),
    absent, unrunnable, or unmeasured (a live pairing the run has no usable pair for, when
    measured names the opponents it does); bands are (label, live pairings, covered) over the
    whole field, counting only measured opponents."""
    by_name = {x["name"]: x for x in pairings}
    by_base = {}
    for x in pairings:
        by_base.setdefault(split_name(x["name"])[0], x["name"])
    rank = ranks(pairings)
    bad = set(unrunnable)
    entries, covered = [], set()
    for n in names:
        if n in bad:
            entries.append((n, "unrunnable", by_name.get(n, {}).get("name"), rank.get(n)))
        elif n in by_name and measured is not None and n not in measured:
            entries.append((n, "unmeasured", n, rank[n]))
        elif n in by_name:
            entries.append((n, "live", n, rank[n]))
            covered.add(n)
        elif split_name(n)[0] in by_base:
            live = by_base[split_name(n)[0]]
            entries.append((n, "drift", live, rank[live]))
        else:
            entries.append((n, "absent", None, None))
    bands = []
    for b in BANDS:
        in_band = [x["name"] for x in pairings if band_of(rank[x["name"]]) == b]
        bands.append((band_label(b), len(in_band), sum(1 for n in in_band if n in covered)))
    return dict(entries=entries, bands=bands)


def project(diffs, pairings, min_band=3):
    """Per-opponent bench differences onto the live APS (A5).
    diffs: name -> (mean difference in points, its standard error or NaN).
    direct: sum of the covered differences over all P pairings, the rest of the field unchanged.
    by band: each band's covered mean applied to every pairing in that band, for bands with at
    least min_band covered opponents; other bands are left at 0 and listed."""
    p = len(pairings)
    rank = ranks(pairings)
    live = {x["name"] for x in pairings}
    hit = OrderedDict((n, v) for n, v in diffs.items() if n in live)
    direct = sum(v[0] for v in hit.values()) / p
    ses = [v[1] for v in hit.values()]
    direct_se = (math.sqrt(sum(s * s for s in ses)) / p) if ses and not any(math.isnan(s) for s in ses) else float("nan")
    bands, total, left_out = [], 0.0, []
    for b in BANDS:
        n_band = sum(1 for x in pairings if band_of(rank[x["name"]]) == b)
        got = [v[0] for n, v in hit.items() if band_of(rank[n]) == b]
        mean = sum(got) / len(got) if got else float("nan")
        used = len(got) >= min_band
        contrib = mean * n_band / p if used else 0.0
        if not used and n_band:
            left_out.append(band_label(b))
        total += contrib
        bands.append(dict(band=band_label(b), pairings=n_band, covered=len(got), mean=mean,
                          contribution=contrib, used=used))
    return dict(pairings=p, covered=len(hit), missing=[n for n in diffs if n not in live],
                direct=direct, direct_se=direct_se, extrapolated=total, bands=bands,
                bands_left_out=left_out)


def _fmt(x, places=2, signed=False):
    if x is None or (isinstance(x, float) and math.isnan(x)):
        return "n/a"
    return ("%+.*f" if signed else "%.*f") % (places, x)


def render_summary(s, title="LiteRumble-style"):
    return ("%s: APS %s +/- %s, PWIN %s, survival %s, %d pairings, %d battles" % (
        title, _fmt(s["aps"]), _fmt(s["ci"]), _fmt(s["pwin"]), _fmt(s["survival"]),
        s["pairings"], s["battles"]))


def render_projection(pr):
    out = ["LIVE PROJECTION over %d live pairings: %d of the run's opponents are live pairings"
           % (pr["pairings"], pr["covered"])]
    out.append("  direct (covered pairings only, the rest unchanged): %s APS +/- %s (95%%)" % (
        _fmt(pr["direct"], 3, True), _fmt(Z95 * pr["direct_se"], 3)))
    out.append("  band extrapolation (each band's mean applied to all its pairings): %s APS" %
               _fmt(pr["extrapolated"], 3, True))
    out.append("  %-8s %9s %8s %9s %13s" % ("band", "pairings", "covered", "mean", "contribution"))
    for b in pr["bands"]:
        out.append("  %-8s %9d %8d %9s %13s%s" % (
            b["band"], b["pairings"], b["covered"], _fmt(b["mean"], 2, True),
            _fmt(b["contribution"], 3, True), "" if b["used"] or not b["pairings"] else "  (too few, left at 0)"))
    if pr["missing"]:
        out.append("  not live pairings (left out): " + ", ".join(pr["missing"]))
    return "\n".join(out)


def render_coverage(cov):
    out = ["COVERAGE of the live field by rank band (ranks by the opponents' own APS)"]
    out.append("  %-8s %9s %8s" % ("band", "pairings", "covered"))
    for label, n, c in cov["bands"]:
        out.append("  %-8s %9d %8d" % (label, n, c))
    flagged = [e for e in cov["entries"] if e[1] != "live"]
    if flagged:
        out.append("  set entries that are not a live pairing:")
        for name, status, live, rank in flagged:
            extra = (" (live: %s, rank %d)" % (live, rank)) if status == "drift" else ""
            out.append("    %-40s %s%s" % (name, status, extra))
    return "\n".join(out)


def row_share(r):
    """A bench row's score share in points (0-100), from score_share or score/theirScore, or None."""
    if r.get("score_share", "") not in ("", None):
        return 100.0 * float(r["score_share"])
    if r.get("score", "") in ("", None) or r.get("theirScore", "") in ("", None):
        return None
    s, t = float(r["score"]), float(r["theirScore"])
    return 100.0 * s / (s + t) if s + t > 0 else None


def bench_per_opponent(rows, build):
    """name -> dict(shares, survival) for one build's ok rows of a bench TSV (score_share or
    score/theirScore; survival from firsts over rounds, the rumble's own survival)."""
    out = OrderedDict()
    for r in rows:
        if r.get("build") != build or r.get("ok", "true").strip().lower() == "false":
            continue
        share = row_share(r)
        if share is None:
            continue
        o = out.setdefault(r["opponent"], dict(shares=[], survival=[]))
        o["shares"].append(share)
        if r.get("firsts", "") not in ("", None) and r.get("rounds", "") not in ("", None):
            o["survival"].append(100.0 * float(r["firsts"]) / float(r["rounds"]))
    return out


def main(argv=None):
    ap = argparse.ArgumentParser(description=__doc__,
                                 formatter_class=argparse.RawDescriptionHelpFormatter)
    sub = ap.add_subparsers(dest="cmd", required=True)
    s = sub.add_parser("summary", help="a parsed BotDetails page's header, from its pairings")
    s.add_argument("page")
    c = sub.add_parser("coverage", help="how a bench set covers the live field")
    c.add_argument("set")
    c.add_argument("page")
    c.add_argument("--unrunnable", help="robots no build can fight (default: none)")
    b = sub.add_parser("score", help="LiteRumble-style APS, CI, PWIN for each build of a bench TSV")
    b.add_argument("tsv")
    b.add_argument("--build", help="one build label (default: every build in the file)")
    args = ap.parse_args(argv)
    if args.cmd == "summary":
        print(render_summary(summary(read_page(args.page)), "live page"))
    elif args.cmd == "coverage":
        bad = read_set(args.unrunnable) if args.unrunnable else ()
        print(render_coverage(coverage(read_set(args.set), read_page(args.page), bad)))
    else:
        with open(args.tsv, encoding="utf-8", newline="") as f:
            rows = list(csv.DictReader(f, delimiter="\t"))
        builds = [args.build] if args.build else list(OrderedDict.fromkeys(r["build"] for r in rows))
        for build in builds:
            s = bench_summary(bench_per_opponent(rows, build))
            if s:
                print(render_summary(s, "%s, LiteRumble-style" % build))
    return 0


if __name__ == "__main__":
    sys.exit(main())

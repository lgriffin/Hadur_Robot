#!/usr/bin/env python3
"""Where Hadur's APS gap to the robots above it lives (plan-top3, docs/plan-top3.md).

  python3 data/tools/peer_gap.py live HADUR.csv PEER.csv... --rankings RANKINGS.tsv
          [--list hadur-bench/shield-313.txt] [--other-list hadur-bench/shield-nullstride.txt]
  python3 data/tools/peer_gap.py bench SUBJECT=CENSUS.tsv[@BUILD]... [--list ...] [--other-list ...]
          [--min-rank 0]

live: BotDetails pages parsed by parse_rumble_page.py. For each peer, the APS it gains over
Hadur (sum of the per-opponent difference over the common opponents, divided by Hadur's
pairings), split by the opponent's rank band and by shield group: on Hadur's list, on the
other list only (Nullstride's), or on neither.

bench: census runs (one subject's rows per file, or BUILD picks one). For the opponents on
neither list, each subject's mean score share, bullet damage dealt and taken per round, by
rank band. The first subject is the reference the others are compared to.

Opponents are matched by name without the version, so a version change between pages keeps
the pairing. Standard library only.
"""

import argparse
import csv
import re
import statistics
import sys
from collections import defaultdict

BANDS = ((1, 50), (51, 200), (201, 400), (401, 800), (801, None))
GROUPS = ("listed", "other list", "neither")


def band_label(band):
    lo, hi = band
    return "%d+" % lo if hi is None else "%d-%d" % (lo, hi)


def band_of(rank):
    for b in BANDS:
        if rank >= b[0] and (b[1] is None or rank <= b[1]):
            return b
    raise ValueError("rank %r" % rank)


def base(name):
    """A robot's name without its version."""
    return name.strip().rsplit(" ", 1)[0]


def read_list(path):
    """Names (no version) of a shield list file: 'name version | ...' lines, # comments."""
    if not path:
        return set()
    out = set()
    with open(path, encoding="utf-8") as f:
        for line in f:
            line = line.strip()
            if line and not line.startswith("#"):
                out.add(base(line.split("|")[0]))
    return out


def read_page(path):
    """{name without version: aps} from a parsed BotDetails CSV."""
    with open(path, encoding="utf-8", newline="") as f:
        return {base(r["name"]): float(r["aps"]) for r in csv.DictReader(f)}


def read_rankings(path):
    """{name without version: rank} from a parsed Rankings TSV."""
    with open(path, encoding="utf-8") as f:
        return {base(r["name"]): int(r["rank"]) for r in csv.DictReader(f, delimiter="\t")}


def group_of(name, listed, other):
    if name in listed:
        return "listed"
    if name in other:
        return "other list"
    return "neither"


def live_gap(hadur, peer, ranks, listed=(), other=()):
    """The peer's APS over Hadur by (group, band), with the opponent count of each cell.

    Cells are sums of (peer - Hadur) over the common opponents divided by Hadur's pairing
    count, so they add up to the peer's lead on those opponents in APS."""
    n = len(hadur)
    cells = defaultdict(lambda: [0.0, 0])
    for name, aps in hadur.items():
        if name not in peer:
            continue
        key = (group_of(name, listed, other), band_of(ranks.get(name, 10 ** 6)))
        cells[key][0] += (peer[name] - aps) / n
        cells[key][1] += 1
    return {k: tuple(v) for k, v in cells.items()}


def read_census(path, build=None):
    """{opponent without version: dict(role, rounds, score, theirScore, dealt, taken)}."""
    agg = defaultdict(lambda: defaultdict(float))
    role = {}
    with open(path, encoding="utf-8", newline="") as f:
        for r in csv.DictReader(f, delimiter="\t"):
            if build and r["build"] != build:
                continue
            if r.get("ok", "true") != "true":
                continue
            k = base(r["opponent"])
            role[k] = r["role"]
            a = agg[k]
            for field in ("rounds", "score", "theirScore", "bulletDamage", "theirBulletDamage"):
                try:
                    a[field] += float(r[field])
                except (TypeError, ValueError):
                    pass
    out = {}
    for k, a in agg.items():
        if a["rounds"] and a["score"] + a["theirScore"]:
            out[k] = dict(role=role[k], share=100.0 * a["score"] / (a["score"] + a["theirScore"]),
                          dealt=a["bulletDamage"] / a["rounds"],
                          taken=a["theirBulletDamage"] / a["rounds"])
    return out


def role_rank(role):
    m = re.search(r"rank(\d+)", role or "")
    return int(m.group(1)) if m else 10 ** 6


def bench_table(subjects, listed=(), other=(), min_rank=0):
    """Rows (band label, count, {subject: (share, dealt, taken)}) over the opponents every
    subject met that are on neither list, plus an 'all' row."""
    names = set.intersection(*(set(s) for s in subjects.values()))
    names = [k for k in names if k not in listed and k not in other]
    first = next(iter(subjects.values()))
    names = [k for k in names if role_rank(first[k]["role"]) > min_rank]
    rows = []
    for band in list(BANDS) + [None]:
        ks = [k for k in names if band is None or band_of(role_rank(first[k]["role"])) == band]
        if not ks:
            continue
        stats = {s: tuple(statistics.mean(d[k][f] for k in ks) for f in ("share", "dealt", "taken"))
                 for s, d in subjects.items()}
        rows.append(("all" if band is None else band_label(band), len(ks), stats))
    return rows


def main(argv=None):
    ap = argparse.ArgumentParser(description=__doc__, formatter_class=argparse.RawDescriptionHelpFormatter)
    sub = ap.add_subparsers(dest="cmd", required=True)
    lv = sub.add_parser("live")
    lv.add_argument("hadur")
    lv.add_argument("peers", nargs="+")
    lv.add_argument("--rankings", required=True)
    bn = sub.add_parser("bench")
    bn.add_argument("subjects", nargs="+", help="LABEL=CENSUS.tsv or LABEL=CENSUS.tsv@BUILD")
    bn.add_argument("--min-rank", type=int, default=0)
    for p in (lv, bn):
        p.add_argument("--list", default="hadur-bench/shield-313.txt")
        p.add_argument("--other-list", default="hadur-bench/shield-nullstride.txt")
    a = ap.parse_args(argv)
    listed, other = read_list(a.list), read_list(a.other_list) - read_list(a.list)
    if a.cmd == "live":
        hadur, ranks = read_page(a.hadur), read_rankings(a.rankings)
        print("| Peer | Group | " + " | ".join(band_label(b) for b in BANDS) + " | Total |")
        print("|---|---|" + "---|" * (len(BANDS) + 1))
        for path in a.peers:
            cells = live_gap(hadur, read_page(path), ranks, listed, other)
            label = path.rsplit("botdetails_", 1)[-1].rsplit(".", 1)[0]
            for g in GROUPS:
                vals = [cells.get((g, b), (0.0, 0)) for b in BANDS]
                print("| %s | %s | %s | %+.2f |" % (label, g, " | ".join(
                    "%+.2f (%d)" % v for v in vals), sum(v[0] for v in vals)))
            print("| %s | all | | | | | | %+.2f |" % (label, sum(v[0] for v in cells.values())))
    else:
        subjects = {}
        for spec in a.subjects:
            label, path = spec.split("=", 1)
            path, _, build = path.partition("@")
            subjects[label] = read_census(path, build or None)
        print("| Band | Opponents | " + " | ".join(
            "%s share / dealt / taken" % s for s in subjects) + " |")
        print("|---|---|" + "---|" * len(subjects))
        for label, n, stats in bench_table(subjects, listed, other, a.min_rank):
            print("| %s | %d | %s |" % (label, n, " | ".join(
                "%.1f / %.1f / %.1f" % stats[s] for s in subjects)))
    return 0


if __name__ == "__main__":
    sys.exit(main())

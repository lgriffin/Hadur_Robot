#!/usr/bin/env python3
"""Where Hadur loses to the robots above it in the midrange (docs/plan-midrange.md).

  python3 data/tools/midrange_gap.py gap CLASSES.tsv HADUR.csv PEER.csv... --rankings R.tsv
          [--list hadur-bench/shield-313.txt] [--other-list hadur-bench/shield-nullstride.txt]
          [--lo 51] [--hi 400]
  python3 data/tools/midrange_gap.py rates SET.txt SUBJECT=ROWS.tsv[@BUILD]... [--from-round 3]
  python3 data/tools/midrange_gap.py split ROWS.tsv --candidate BUILD --baseline BUILD
  python3 data/tools/midrange_gap.py set CLASSES.tsv CENSUS.txt --move CLASS --gun CLASS
          [--lo 51] [--hi 400] [--exclude LIST...] [--out FILE]

gap: the live BotDetails pages (parse_rumble_page.py output) of Hadur and its peers, joined
to census_classify's per-opponent classes. For the opponents ranked lo..hi, the APS each peer
gains over Hadur (sum of the per-opponent difference, divided by Hadur's pairings), by
shield group and by movement x gun class, with the bench exchange of each class.

rates: for the opponents in SET (a bench set file), each subject's rounds: ticks a round,
bullet damage dealt and taken per 100 ticks from --from-round on, and the damage taken a
round by round bucket. ROWS.tsv is an export_battles.py rows file; its _rounds.tsv must sit
beside it. BUILD picks one build out of a paired file.

split: the value of choosing, opponent by opponent, between two builds of a paired run.
Half the seeds pick the better build for each opponent, the other half score the choice.
Compared with taking the candidate everywhere, over the same scoring seeds.

set: writes a bench set file (name | role | jar lines, copied from CENSUS.txt) for the
opponents of one movement and gun class in a rank range, less any on the excluded lists.

Opponents are matched by name without the version. Standard library only.
"""

import argparse
import csv
import statistics
import sys
from collections import defaultdict
from itertools import combinations

BANDS = ((1, 50), (51, 200), (201, 400), (401, 800), (801, None))
ROUND_BUCKETS = (("r0", 0, 0), ("r1-2", 1, 2), ("r3-9", 3, 9), ("r10-19", 10, 19), ("r20-34", 20, 999))


def base(name):
    """A robot's name without its version."""
    return name.strip().rsplit(" ", 1)[0]


def read_list(path):
    """Names (no version) in a set or shield list file: 'name version | ...' lines, # comments."""
    out = set()
    if not path:
        return out
    with open(path, encoding="utf-8") as f:
        for line in f:
            line = line.strip()
            if line and not line.startswith("#"):
                out.add(base(line.split("|")[0]))
    return out


def read_set_lines(path):
    """The set file's lines by name (no version), comments dropped."""
    out = {}
    with open(path, encoding="utf-8") as f:
        for line in f:
            s = line.rstrip("\n")
            if s.strip() and not s.startswith("#"):
                out[base(s.split("|")[0])] = s
    return out


def read_page(path):
    """APS by opponent (no version) from a parsed BotDetails csv."""
    out = {}
    with open(path, encoding="utf-8", newline="") as f:
        for r in csv.DictReader(f):
            out[base(r["name"])] = float(r["aps"])
    return out


def read_rankings(path):
    """Rank by robot name (no version) from a parsed rankings tsv."""
    out = {}
    with open(path, encoding="utf-8", newline="") as f:
        for r in csv.DictReader(f, delimiter="\t"):
            out[base(r["name"])] = int(r["rank"])
    return out


def read_classes(path):
    """census_classify rows by opponent name (no version)."""
    out = {}
    with open(path, encoding="utf-8", newline="") as f:
        for r in csv.DictReader(f, delimiter="\t"):
            out[base(r["opponent"])] = r
    return out


def fnum(r, key):
    try:
        return float(r.get(key) or "nan")
    except ValueError:
        return float("nan")


def mean(xs):
    xs = [x for x in xs if x == x]
    return statistics.fmean(xs) if xs else float("nan")


def gap_table(hadur, peers, ranks, classes, lo, hi, listed=(), other=()):
    """Rows per class: (class, n, hadur mean, {peer: APS gained over Hadur}, bench stats).

    APS gained = the sum over the opponents of peer - hadur, over all of Hadur's pairings
    (the flat mean the rumble takes), so the rows add up to the peer's lead on the range."""
    n_total = len(hadur)
    rows = defaultdict(list)
    groups = defaultdict(list)
    for name, aps in hadur.items():
        rank = ranks.get(name)
        if rank is None or rank < lo or rank > hi:
            continue
        c = classes.get(name, {})
        cls = "%s x %s" % (c.get("move_class", "?"), c.get("gun_class", "?"))
        grp = "listed" if name in listed else ("other list" if name in other else "neither")
        rows[cls].append((name, aps, grp))
        groups[grp].append((name, aps, cls))

    def summarise(items):
        out = {"n": len(items), "hadur": mean([a for _, a, _ in items]), "peers": {}}
        for p, page in peers.items():
            diffs = [page[nm] - a for nm, a, _ in items if nm in page]
            out["peers"][p] = sum(diffs) / n_total if n_total else float("nan")
        cs = [classes[nm] for nm, _, _ in items if nm in classes]
        out["taken"] = mean([fnum(c, "base_taken") for c in cs])
        out["dealt"] = mean([fnum(c, "base_dealt") for c in cs])
        out["their_hit"] = mean([fnum(c, "base_their_hit") for c in cs])
        out["our_hit"] = mean([fnum(c, "base_our_hit") for c in cs])
        return out

    by_class = {k: summarise(v) for k, v in rows.items()}
    by_group = {k: summarise(v) for k, v in groups.items()}
    return by_class, by_group


def print_gap(by, title, peers):
    order = sorted(by.items(), key=lambda kv: -kv[1]["peers"].get(peers[0], 0))
    print("\n%s" % title)
    print("| Class | Bots | Hadur | " + " | ".join("APS to %s" % p for p in peers)
          + " | Dealt/rd | Taken/rd | Our hit | Their hit |")
    print("|---|---|---|" + "---|" * len(peers) + "---|---|---|---|")
    for k, s in order:
        print("| %s | %d | %.1f | %s | %.1f | %.1f | %.3f | %.3f |" % (
            k, s["n"], s["hadur"], " | ".join("%+.3f" % s["peers"][p] for p in peers),
            s["dealt"], s["taken"], s["our_hit"], s["their_hit"]))


def read_rows(path, build=None):
    """export_battles rows by (opponent base name, seed): ok battles only, one build."""
    out = {}
    with open(path, encoding="utf-8", newline="") as f:
        for r in csv.DictReader(f, delimiter="\t"):
            if build and r["build"] != build:
                continue
            if str(r.get("ok", "true")).lower() != "true":
                continue
            out[(r["build"], base(r["opponent"]), r["seed"])] = r
    return out


def read_rounds(path, build=None):
    """export_battles --rounds-out rows, one build."""
    out = []
    with open(path, encoding="utf-8", newline="") as f:
        for r in csv.DictReader(f, delimiter="\t"):
            if build and r["build"] != build:
                continue
            out.append(r)
    return out


def rates(rounds, names, from_round=3):
    """(ticks a round, dealt per 100 ticks, taken per 100 ticks, {bucket: taken a round})
    over the rounds against the opponents in names."""
    ticks = dealt = taken = n = 0
    buckets = defaultdict(list)
    for r in rounds:
        if base(r["opponent"]) not in names:
            continue
        rd = int(r["round"])
        for label, a, b in ROUND_BUCKETS:
            if a <= rd <= b:
                buckets[label].append(float(r["damageTaken"]))
        if rd < from_round:
            continue
        ticks += float(r["ticks"])
        dealt += float(r["damageDealt"])
        taken += float(r["damageTaken"])
        n += 1
    if not n:
        return None
    return (ticks / n, 100.0 * dealt / ticks, 100.0 * taken / ticks,
            {label: mean(buckets[label]) for label, _, _ in ROUND_BUCKETS})


def split_half(rows, candidate, baseline):
    """For every way of halving the seeds: (candidate everywhere, candidate where the
    picking half preferred it), both as the mean change in score share over the opponents on
    the scoring half, in points."""
    diffs = defaultdict(dict)
    for (build, name, seed), r in rows.items():
        if build != candidate:
            continue
        b = rows.get((baseline, name, seed))
        if b is None:
            continue
        diffs[name][seed] = 100.0 * (share(r) - share(b))
    seeds = sorted({s for d in diffs.values() for s in d})
    out = []
    for pick in combinations(seeds, len(seeds) // 2):
        score = [s for s in seeds if s not in pick]
        if not pick or not score:
            continue
        every, chosen, n = 0.0, 0.0, 0
        for name, d in diffs.items():
            if not all(s in d for s in seeds):
                continue
            p = mean([d[s] for s in pick])
            e = mean([d[s] for s in score])
            every += e
            chosen += e if p > 0 else 0.0
            n += 1
        if n:
            out.append((pick, every / n, chosen / n))
    return out


def share(r):
    s, t = float(r["score"]), float(r["theirScore"])
    return s / (s + t) if s + t else 0.0


def main(argv=None):
    ap = argparse.ArgumentParser(description=__doc__.splitlines()[0])
    sub = ap.add_subparsers(dest="cmd", required=True)

    g = sub.add_parser("gap")
    g.add_argument("classes")
    g.add_argument("hadur")
    g.add_argument("peers", nargs="+")
    g.add_argument("--rankings", required=True)
    g.add_argument("--list", default=None)
    g.add_argument("--other-list", default=None)
    g.add_argument("--lo", type=int, default=51)
    g.add_argument("--hi", type=int, default=400)

    r = sub.add_parser("rates")
    r.add_argument("set")
    r.add_argument("subjects", nargs="+")
    r.add_argument("--from-round", type=int, default=3)

    s = sub.add_parser("split")
    s.add_argument("rows")
    s.add_argument("--candidate", required=True)
    s.add_argument("--baseline", required=True)

    w = sub.add_parser("set")
    w.add_argument("classes")
    w.add_argument("census")
    w.add_argument("--move", required=True)
    w.add_argument("--gun", required=True)
    w.add_argument("--lo", type=int, default=51)
    w.add_argument("--hi", type=int, default=400)
    w.add_argument("--exclude", nargs="*", default=[])
    w.add_argument("--out", default=None)

    a = ap.parse_args(argv)
    if a.cmd == "gap":
        hadur = read_page(a.hadur)
        hadur.pop("hadur2.Hadur", None)
        peers = {}
        for p in a.peers:
            page = read_page(p)
            label = p.rsplit("botdetails_", 1)[-1].rsplit(".", 1)[0].split("_")[0].rsplit(".", 1)[-1]
            peers[label] = page
        by_class, by_group = gap_table(hadur, peers, read_rankings(a.rankings), read_classes(a.classes),
                                       a.lo, a.hi, read_list(a.list), read_list(a.other_list))
        names = list(peers)
        print("Hadur pairings: %d; opponents ranked %d-%d" % (len(hadur), a.lo, a.hi))
        print_gap(by_group, "By shield group", names)
        print_gap(by_class, "By movement x gun class", names)
    elif a.cmd == "rates":
        names = read_list(a.set)
        print("| Subject | Rounds | Ticks/rd | Dealt/100t | Taken/100t | " + " | ".join(b[0] for b in ROUND_BUCKETS) + " |")
        print("|---|---|---|---|---|" + "---|" * len(ROUND_BUCKETS))
        for spec in a.subjects:
            label, path = spec.split("=", 1)
            build = None
            if "@" in path:
                path, build = path.split("@", 1)
            rounds_path = path[:-4] + "_rounds.tsv" if path.endswith(".tsv") else path + "_rounds.tsv"
            res = rates(read_rounds(rounds_path, build), names, a.from_round)
            if res is None:
                print("| %s | none | | | | |" % label)
                continue
            ticks, dealt, taken, buckets = res
            print("| %s | %d+ | %.0f | %.2f | %.2f | %s |" % (
                label, a.from_round, ticks, dealt, taken,
                " | ".join("%.1f" % buckets[b[0]] for b in ROUND_BUCKETS)))
    elif a.cmd == "split":
        res = split_half(read_rows(a.rows), a.candidate, a.baseline)
        print("| Picking seeds | Candidate everywhere | Candidate where picked |")
        print("|---|---|---|")
        for pick, every, chosen in res:
            print("| %s | %+.3f | %+.3f |" % (",".join(pick), every, chosen))
        if res:
            print("| mean | %+.3f | %+.3f |" % (mean([e for _, e, _ in res]), mean([c for _, _, c in res])))
    elif a.cmd == "set":
        classes = read_classes(a.classes)
        lines = read_set_lines(a.census)
        excluded = set()
        for p in a.exclude:
            excluded |= read_list(p)
        chosen = []
        for name, c in classes.items():
            rank = int(fnum(c, "rank")) if c.get("rank") else 0
            if (c.get("move_class") == a.move and c.get("gun_class") == a.gun
                    and a.lo <= rank <= a.hi and name not in excluded and name in lines):
                chosen.append((rank, lines[name]))
        chosen.sort()
        text = "\n".join(l for _, l in chosen) + "\n"
        if a.out:
            with open(a.out, "w", encoding="utf-8") as f:
                f.write(text)
            print("%d robots -> %s" % (len(chosen), a.out))
        else:
            sys.stdout.write(text)


if __name__ == "__main__":
    main()

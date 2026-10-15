#!/usr/bin/env python3
"""Why the bullets that hit Hadur got through: the HF records (MOVE-9, plan-top3 stage 0).

    python3 data/tools/hit_forensics.py WORKDIR --set hadur-bench/census-312.txt \\
        [--list hadur-bench/shield-313.txt] [--other-list hadur-bench/shield-nullstride.txt] [--all]

WORKDIR is a cold bench run of a build that writes HF records: WORKDIR/battles/<slug>-<seed>/
holds hadur.log (one `HF,round,tick,class,gf,linearGf,dangerPct,distance,power,driving` line
per bullet that hit us in a duel) and rounds.tsv (one row per round). By default only the
opponents on neither shield list are read, since the plan's gap is there; --all reads every one.
Only hits while the Duel drove count (shield mode drives listed robots).

Prints, by rank band and over all, the bullet damage taken a round split by class (headon,
linear, learned, nowave) and by how the danger views rated the angle the bullet came from:
safe (percentile under 1/3: the views did not expect it), mid, and known (2/3 and over: the
views knew it was dangerous, so the surf could not or did not get away).

Standard library only.
"""

import argparse
import os
import re
import sys
from collections import defaultdict

BANDS = ((1, 50), (51, 200), (201, 400), (401, 800), (801, None))
CLASSES = ("headon", "linear", "learned", "nowave")
RATINGS = ("safe", "mid", "known", "n/a")


def slug(name):
    return re.sub(r"[^A-Za-z0-9.]+", "_", name)


def base(name):
    return name.strip().rsplit(" ", 1)[0]


def band_label(band):
    lo, hi = band
    return "%d+" % lo if hi is None else "%d-%d" % (lo, hi)


def band_of(rank):
    for b in BANDS:
        if rank >= b[0] and (b[1] is None or rank <= b[1]):
            return b
    return BANDS[-1]


def damage(power):
    """Robocode's bullet damage: 4p, plus 2(p - 1) above power 1."""
    return 4 * power + max(0.0, 2 * (power - 1))


def rating(pct):
    if pct != pct:
        return "n/a"
    return "safe" if pct < 1 / 3 else "known" if pct >= 2 / 3 else "mid"


def read_set(path):
    """{slug: (name, rank)} from a set file's 'name version | rankN-bandB | jar' lines."""
    out = {}
    with open(path, encoding="utf-8") as f:
        for line in f:
            if line.startswith("#") or "|" not in line:
                continue
            p = [x.strip() for x in line.split("|")]
            m = re.search(r"rank(\d+)", p[1]) if len(p) > 1 else None
            out[slug(p[0])] = (p[0], int(m.group(1)) if m else 10 ** 6)
    return out


def read_list(path):
    if not path:
        return set()
    with open(path, encoding="utf-8") as f:
        return {base(l.split("|")[0]) for l in f if l.strip() and not l.startswith("#")}


def parse_hf(line):
    """(class, gf, linearGf, dangerPct, distance, power, driving) of an HF line, or None."""
    p = line.strip().split(",")
    if len(p) != 10 or p[0] != "HF":
        return None
    return (p[3], float(p[4]), float(p[5]), float(p[6]), float(p[7]), float(p[8]), p[9] == "1")


def read_battle(bdir):
    """(rounds, [hf tuples]) of one battle directory; rounds 0 when it never finished."""
    rounds = 0
    rpath = os.path.join(bdir, "rounds.tsv")
    if os.path.exists(rpath):
        with open(rpath, encoding="utf-8") as f:
            rounds = max(0, sum(1 for l in f if l.strip()) - 1)
    hits = []
    lpath = os.path.join(bdir, "hadur.log")
    if os.path.exists(lpath):
        with open(lpath, encoding="utf-8", errors="replace") as f:
            for line in f:
                if line.startswith("HF,"):
                    h = parse_hf(line)
                    if h:
                        hits.append(h)
    return rounds, hits


def tally(work, roles, skip=frozenset()):
    """{band label or 'all': {'rounds': n, (class, rating): damage}} over the battles of work."""
    out = defaultdict(lambda: defaultdict(float))
    bdir = os.path.join(work, "battles")
    for d in sorted(os.listdir(bdir)):
        key, _, seed = d.rpartition("-")
        if key not in roles or not seed.isdigit():
            continue
        name, rank = roles[key]
        if base(name) in skip:
            continue
        rounds, hits = read_battle(os.path.join(bdir, d))
        if not rounds:
            continue
        for b in (band_label(band_of(rank)), "all"):
            out[b]["rounds"] += rounds
            out[b]["opponents:" + key] = 1
            for cls, gf, lin, pct, dist, power, driving in hits:
                if driving:
                    out[b][(cls, rating(pct))] += damage(power)
    return out


def render(t):
    rows = ["| Ranks | Opponents | Taken a round | " + " | ".join(CLASSES) + " | "
            + " | ".join("views: " + r for r in RATINGS[:3]) + " |",
            "|---|---|---|" + "---|" * (len(CLASSES) + 3)]
    for b in [band_label(x) for x in BANDS] + ["all"]:
        if b not in t:
            continue
        c = t[b]
        n = c["rounds"]
        opps = sum(1 for k in c if isinstance(k, str) and k.startswith("opponents:"))
        by_cls = {k: sum(v for kk, v in c.items() if isinstance(kk, tuple) and kk[0] == k) / n
                  for k in CLASSES}
        by_rat = {r: sum(v for kk, v in c.items() if isinstance(kk, tuple) and kk[1] == r) / n
                  for r in RATINGS}
        rows.append("| %s | %d | %.1f | %s | %s |" % (
            b, opps, sum(by_cls.values()), " | ".join("%.1f" % by_cls[k] for k in CLASSES),
            " | ".join("%.1f" % by_rat[r] for r in RATINGS[:3])))
    return "\n".join(rows)


def main(argv=None):
    ap = argparse.ArgumentParser(description=__doc__, formatter_class=argparse.RawDescriptionHelpFormatter)
    ap.add_argument("work")
    ap.add_argument("--set", required=True)
    ap.add_argument("--list", default="hadur-bench/shield-313.txt")
    ap.add_argument("--other-list", default="hadur-bench/shield-nullstride.txt")
    ap.add_argument("--all", action="store_true", help="read listed opponents too")
    a = ap.parse_args(argv)
    skip = set() if a.all else read_list(a.list) | read_list(a.other_list)
    print("Bullet damage taken a round (driving hits), by class and by the views' rating:\n")
    print(render(tally(a.work, read_set(a.set), skip)))
    return 0


if __name__ == "__main__":
    sys.exit(main())

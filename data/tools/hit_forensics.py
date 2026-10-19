#!/usr/bin/env python3
"""Why the bullets that hit Hadur got through: the HF records (MOVE-9, plan-top3 stage 0).

    python3 data/tools/hit_forensics.py WORKDIR --set hadur-bench/census-312.txt \\
        [--list hadur-bench/shield-313.txt] [--other-list hadur-bench/shield-nullstride.txt] [--all]

WORKDIR is a cold bench run of a build that writes HF records: WORKDIR/battles/<slug>-<seed>/
holds hadur.log (each line prefixed `round,tick,`; one `HF,round,tick,class,...` line (docs/requirements.md MOVE-9, MOVE-10)
per bullet that hit us in a duel) and rounds.tsv (one row per round). By default only the
opponents on neither shield list are read, since the plan's gap is there; --all reads every one.
Only hits while the Duel drove count (shield mode drives listed robots).

Prints, by rank band and over all, the bullet damage taken a round split by class (headon,
linear, learned, nowave) and by how the danger views rated the angle the bullet came from:
safe (percentile under 1/3: the views did not expect it), mid, and known (2/3 and over: the
views knew it was dangerous, so the surf could not or did not get away), and by the surf's last
plan on the bullet's wave: on (the hit lay inside the interval the plan expected us to occupy:
the surf chose to be there), off (we were somewhere the plan did not put us) or none; and, from
MOVE-10's option flags, whether another of the three options' plans would have dodged a hit the
option taken was planned into (dodge), none would (trapped), or there is no such reading (n/a).

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
PLANS = ("on", "off", "none")
OPTIONS = ("dodge", "trapped")


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
    """(class, gf, linearGf, dangerPct, distance, power, driving) of an HF line, or None.
    Lines with the plan fields (13 values) or option flags (14, 15 with their age) read the same; plan_of() and
    options_of() read those."""
    p = line.strip().split(",")
    if len(p) not in (10, 13, 14, 15) or p[0] != "HF":
        return None
    return (p[3], float(p[4]), float(p[5]), float(p[6]), float(p[7]), float(p[8]), p[9] == "1")


def plan_of(line):
    """'on' when the hit lay inside the surf's last plan on its wave (offset at most 1),
    'off' outside it, 'none' with no plan or an older record without the plan fields."""
    p = line.strip().split(",")
    if len(p) not in (13, 14, 15):
        return "none"
    off = float(p[10])
    return "none" if off != off else "on" if off <= 1.0 else "off"


def options_of(line):
    """MOVE-10: 'dodge' when the option taken was hit inside its plan (capital H) and another
    option's plan would have missed (m), 'trapped' when the taken option was hit and no other
    would have missed, 'n/a' otherwise (no flags, or the taken option's plan was missed)."""
    p = line.strip().split(",")
    if len(p) not in (14, 15) or "H" not in p[13]:
        return "n/a"
    return "dodge" if "m" in p[13] else "trapped"


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
                # The robot's log prefixes each record with the round and tick it was written.
                i = line.find("HF,")
                if i == 0 or (i > 0 and line[i - 1] == ","):
                    h = parse_hf(line[i:])
                    if h:
                        hits.append(h + (plan_of(line[i:]), options_of(line[i:])))
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
            for cls, gf, lin, pct, dist, power, driving, plan, opt in hits:
                if driving:
                    out[b][(cls, rating(pct))] += damage(power)
                    out[b]["plan:" + plan] += damage(power)
                    out[b]["options:" + opt] += damage(power)
    return out


def render(t):
    rows = ["| Ranks | Opponents | Taken a round | " + " | ".join(CLASSES) + " | "
            + " | ".join("views: " + r for r in RATINGS[:3]) + " | "
            + " | ".join("plan: " + p for p in PLANS) + " | "
            + " | ".join("options: " + o for o in OPTIONS) + " |",
            "|---|---|---|" + "---|" * (len(CLASSES) + 3 + len(PLANS) + len(OPTIONS))]
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
        rows.append("| %s | %d | %.1f | %s | %s | %s | %s |" % (
            b, opps, sum(by_cls.values()), " | ".join("%.1f" % by_cls[k] for k in CLASSES),
            " | ".join("%.1f" % by_rat[r] for r in RATINGS[:3]),
            " | ".join("%.1f" % (c["plan:" + p] / n) for p in PLANS),
            " | ".join("%.1f" % (c["options:" + o] / n) for o in OPTIONS)))
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

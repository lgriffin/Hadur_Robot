#!/usr/bin/env python3
"""Where one melee seat's points go against another's, field by field (docs/deise.md, E2 and E6).

Reads the per-seat census reports the bench writes (docs/bench/local/<run>-live-<ARM>.md, one
"## Melee bench: Fnn" section a field) and splits each seat's score into what it is made of:
bullet damage a round, rounds died in, mean death tick, rounds reaching the last two, and those
final duels won. Then, field by field against the reference seat, it correlates the APS gap with
the survival gap (rounds lived) and with the damage gap, which says which one the score follows.

  python3 tools/melee_split.py --ref D ../docs/bench/local/deise-e09-live-D.md \\
      ../docs/bench/local/deise-e09-live-MIR.md ../docs/bench/local/deise-e09-live-SAOR.md

Each file's arm is the name after "-live-". Standard library only.
"""

import argparse
import math
import os
import re
import sys

SECTION = re.compile(r"^## Melee bench: (F\d+)")
SUMMARY = re.compile(r"^\| ([\d.]+) \| ([\d.]+) \| (\d+) / (\d+) \| [\d.]+ \| [\d.]+% \| (\d+) \|$")
DIED = re.compile(r"^Hadur died in (\d+) of (\d+) rounds, at a mean tick of (\d+)")
DUEL = re.compile(r"^\| (\S.*?) \| (\d+) \| (\d+)% \|$")


def parse(path):
    """{field: {aps, rounds, damage, died, tick, duels, duels_won}} for one seat's report."""
    fields, cur, in_duels = {}, None, False
    with open(path, encoding="utf-8") as f:
        for line in f:
            line = line.rstrip("\n")
            m = SECTION.match(line)
            if m:
                cur = fields[m.group(1)] = {"duels": 0, "duels_won": 0.0}
                in_duels = False
                continue
            if cur is None:
                continue
            if line.startswith("Rounds that ended as a duel"):
                in_duels = True
                continue
            if line.startswith("Hadur died in"):
                in_duels = False
                m = DIED.match(line)
                if m:
                    cur["died"], cur["tick"] = int(m.group(1)), int(m.group(3))
                continue
            if "aps" not in cur:
                m = SUMMARY.match(line)
                if m:
                    cur["aps"] = float(m.group(1))
                    cur["rounds"] = int(m.group(4))
                    cur["damage"] = int(m.group(5))
                continue
            if in_duels:
                m = DUEL.match(line)
                if m and m.group(1) != "Last opponent":
                    n = int(m.group(2))
                    cur["duels"] += n
                    cur["duels_won"] += n * int(m.group(3)) / 100.0
    return {k: v for k, v in fields.items() if "aps" in v and "died" in v}


def totals(fields):
    rounds = sum(v["rounds"] for v in fields.values())
    died = sum(v["died"] for v in fields.values())
    duels = sum(v["duels"] for v in fields.values())
    return {
        "aps": sum(v["aps"] for v in fields.values()) / len(fields),
        "damage": sum(v["damage"] for v in fields.values()) / rounds,
        "died": 100.0 * died / rounds,
        "tick": sum(v["tick"] * v["died"] for v in fields.values()) / max(died, 1),
        "last_two": 100.0 * duels / rounds,
        "duels_won": 100.0 * sum(v["duels_won"] for v in fields.values()) / max(duels, 1),
    }


def corr(xs, ys):
    n = len(xs)
    if n < 3:
        return float("nan")
    mx, my = sum(xs) / n, sum(ys) / n
    sxy = sum((x - mx) * (y - my) for x, y in zip(xs, ys))
    sxx = sum((x - mx) ** 2 for x in xs)
    syy = sum((y - my) ** 2 for y in ys)
    return sxy / math.sqrt(sxx * syy) if sxx and syy else float("nan")


def arm_of(path):
    m = re.search(r"-live-([A-Za-z0-9]+)\.md$", os.path.basename(path))
    return m.group(1) if m else os.path.basename(path)


def main(argv=None):
    ap = argparse.ArgumentParser(description=__doc__, formatter_class=argparse.RawDescriptionHelpFormatter)
    ap.add_argument("--ref", required=True, help="the reference arm (the seat the others are split against)")
    ap.add_argument("reports", nargs="+")
    args = ap.parse_args(argv)

    seats = {arm_of(p): parse(p) for p in args.reports}
    if args.ref not in seats:
        sys.exit("melee_split: no report for the reference arm %s" % args.ref)
    arms = [a for a in seats if a != args.ref]
    ref = seats[args.ref]
    common = sorted(set(ref).intersection(*(set(seats[a]) for a in arms)))
    sub = {a: {k: seats[a][k] for k in common} for a in seats}
    tot = {a: totals(sub[a]) for a in seats}
    order = [args.ref] + arms

    out = ["# Where the points go (%d fields)" % len(common), ""]
    out.append("| | " + " | ".join(order) + " |")
    out.append("|---|" + "---|" * len(order))
    for key, label, fmt in (("aps", "APS (mean of fields)", "%.2f"),
                            ("damage", "Bullet damage a round", "%.1f"),
                            ("died", "Rounds died in", "%.1f%%"),
                            ("tick", "Mean death tick", "%.0f"),
                            ("last_two", "Rounds reaching the last two", "%.1f%%"),
                            ("duels_won", "Those final duels won", "%.1f%%")):
        out.append("| %s | " % label + " | ".join(fmt % tot[a][key] for a in order) + " |")
    out.append("")
    out.append("Field by field against %s: how the APS gap follows the survival gap (rounds lived) "
               "and the damage gap (a round)." % args.ref)
    out.append("")
    out.append("| Arm | APS gap | r with survival gap | r with damage gap |")
    out.append("|---|---|---|---|")
    for a in arms:
        aps = [sub[a][k]["aps"] - ref[k]["aps"] for k in common]
        live = [100.0 * (ref[k]["died"] / ref[k]["rounds"] - sub[a][k]["died"] / sub[a][k]["rounds"]) for k in common]
        dmg = [sub[a][k]["damage"] / sub[a][k]["rounds"] - ref[k]["damage"] / ref[k]["rounds"] for k in common]
        out.append("| %s | %+.2f | %.2f | %.2f |" % (a, sum(aps) / len(aps), corr(aps, live), corr(aps, dmg)))
    print("\n".join(out))


if __name__ == "__main__":
    main()

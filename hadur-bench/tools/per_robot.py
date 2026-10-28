#!/usr/bin/env python3
"""BENCH-126: per-robot read of a multi-arm run, losses included.

    python3 tools/per_robot.py ARMS.tsv --arms s4 s0 --out REPORT.md --out-tsv ROWS.tsv

For each opponent and each named arm: the arm's mean score share minus the control's (c and aa
pooled when aa is present), in points, with the seed counts. Every opponent is listed, wins and
losses alike, sorted by the first arm's difference, so a per-opponent pick can see where an arm
costs as well as where it pays. Standard library only.
"""
import argparse
import collections
import csv
import statistics


def read(path):
    shares = collections.defaultdict(list)
    with open(path, newline="", encoding="utf-8") as f:
        for row in csv.DictReader(f, delimiter="\t"):
            if row.get("ok", "true") != "true":
                continue
            shares[(row["opponent"], row["arm"])].append(100 * float(row["score_share"]))
    return shares


def rows(shares, arms, control=("c", "aa")):
    opponents = sorted({o for o, _ in shares})
    out = []
    for o in opponents:
        ref = [s for a in control for s in shares.get((o, a), [])]
        if not ref:
            continue
        base = statistics.mean(ref)
        diffs = []
        for a in arms:
            v = shares.get((o, a), [])
            diffs.append((statistics.mean(v) - base, len(v)) if v else (None, 0))
        out.append((o, base, len(ref), diffs))
    out.sort(key=lambda r: -(r[3][0][0] if r[3][0][0] is not None else float("-inf")))
    return out


def main(argv=None):
    p = argparse.ArgumentParser(description=__doc__.splitlines()[0])
    p.add_argument("arms_tsv")
    p.add_argument("--arms", nargs="+", required=True)
    p.add_argument("--out", required=True)
    p.add_argument("--out-tsv", required=True)
    a = p.parse_args(argv)
    table = rows(read(a.arms_tsv), a.arms)
    if not table:
        raise SystemExit("per_robot: no opponent with control battles in " + a.arms_tsv)
    with open(a.out_tsv, "w", encoding="utf-8") as f:
        f.write("opponent\tcontrol\tcontrol_n\t" + "\t".join("%s_minus_c\t%s_n" % (x, x) for x in a.arms) + "\n")
        for o, base, n, diffs in table:
            f.write("%s\t%.2f\t%d\t%s\n" % (o, base, n, "\t".join(
                ("%.2f" % d if d is not None else "") + "\t%d" % k for d, k in diffs)))
    lines = ["# Per robot: %s minus control\n\n" % ", ".join(a.arms),
             "Every opponent, wins and losses, sorted by %s. Points of score share.\n\n" % a.arms[0],
             "| Opponent | Control | " + " | ".join(a.arms) + " |\n",
             "|---|---:|" + "---:|" * len(a.arms) + "\n"]
    for o, base, n, diffs in table:
        lines.append("| %s | %.1f | %s |\n" % (o, base, " | ".join(
            "%+.1f" % d if d is not None else "-" for d, _ in diffs)))
    with open(a.out, "w", encoding="utf-8") as f:
        f.writelines(lines)
    return 0


if __name__ == "__main__":
    raise SystemExit(main())

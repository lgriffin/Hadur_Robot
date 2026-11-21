#!/usr/bin/env python3
"""Paired read of two arms of a multi-arm run (BENCH-269): candidate minus baseline score share.

    python3 tools/arm_pair.py RUN/arms.tsv --candidate t --baseline n [--robots NAME ...] [--out FILE.md]

Each opponent's difference is the mean over the seeds both arms fought (ok rows only) of candidate share minus
baseline share, in points (share x 100). The field line is the mean over opponents with its 95% normal interval.
Each --robots NAME (a substring of the opponent name) gets its own line: the mean over its paired seeds and the
95% normal interval over those seeds. Standard library only.
"""
import argparse
import collections
import csv
import math
import statistics as st


def read(path, candidate, baseline):
    """{opponent: {seed: {arm: share}}} for the two arms, ok rows only."""
    out = collections.defaultdict(lambda: collections.defaultdict(dict))
    with open(path, newline="", encoding="utf8") as f:
        for r in csv.DictReader(f, delimiter="\t"):
            if r["arm"] in (candidate, baseline) and r["ok"] == "true":
                out[r["opponent"]][r["seed"]][r["arm"]] = 100 * float(r["score_share"])
    return out


def interval(xs):
    m = st.mean(xs)
    h = 1.96 * st.stdev(xs) / math.sqrt(len(xs)) if len(xs) > 1 else float("nan")
    return m, h


def pair(path, candidate, baseline, robots=()):
    data = read(path, candidate, baseline)
    per_opp, per_seed = {}, {}
    for opp, seeds in data.items():
        diffs = [s[candidate] - s[baseline] for s in seeds.values() if candidate in s and baseline in s]
        if diffs:
            per_opp[opp] = st.mean(diffs)
            per_seed[opp] = diffs
    field = interval(list(per_opp.values())) if per_opp else (float("nan"), float("nan"))
    lines = []
    for name in robots:
        hits = [o for o in per_seed if name in o]
        diffs = [d for o in hits for d in per_seed[o]]
        lines.append((name, len(diffs)) + (interval(diffs) if diffs else (float("nan"), float("nan"))))
    return len(per_opp), field, lines


def report(path, candidate, baseline, robots=()):
    n, (m, h), lines = pair(path, candidate, baseline, robots)
    out = [f"## {candidate} against {baseline}", "",
           f"Field: {m:+.2f} +- {h:.2f} points over {n} robots (mean over robots, paired seeds).", ""]
    if lines:
        out += ["| robot | paired seeds | " + candidate + " - " + baseline + " |", "|---|---:|---:|"]
        out += [f"| {name} | {k} | {mm:+.2f} +- {hh:.2f} |" for name, k, mm, hh in lines]
        out.append("")
    return "\n".join(out)


def main(argv=None):
    ap = argparse.ArgumentParser(description=__doc__.splitlines()[0])
    ap.add_argument("arms")
    ap.add_argument("--candidate", required=True)
    ap.add_argument("--baseline", required=True)
    ap.add_argument("--robots", nargs="*", default=[])
    ap.add_argument("--out")
    a = ap.parse_args(argv)
    text = report(a.arms, a.candidate, a.baseline, a.robots)
    if a.out:
        with open(a.out, "a", encoding="utf8") as f:
            f.write("\n" + text)
    print(text)


if __name__ == "__main__":
    main()

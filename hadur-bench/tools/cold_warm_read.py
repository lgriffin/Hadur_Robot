#!/usr/bin/env python3
"""BENCH-174: read a --cold-warm run (cold-warm.tsv) of a robot and its baseline.

  python3 tools/cold_warm_read.py RUN/cold-warm.tsv --robot "hadur117.Hadur 3.21sa" --baseline "hadur117.Hadur 3.21aa" \
      --out REPORT.md --out-tsv PER_ROBOT.tsv

Each build fought every seed cold (data directory empty) and then warm on the profile the cold battle
left. Per robot it averages over seeds, then reads, over the robots (each weighted equally, so on a
band-proportional panel the mean is an APS estimate):
  - each build's warm minus cold (what memory is worth to it), with a 95% interval;
  - the robot's warm minus the baseline's warm, and the same for cold (the cold pair is an A/A when the
    two builds play alike until they save, as seedall and its base do);
  - the 25 robots memory hurts most and helps most, for each build.
Python 3 standard library only.
"""
import argparse
import csv
import math
import statistics as st
import sys
from collections import defaultdict


def mean_ci(xs):
    if not xs:
        return float("nan"), float("nan")
    if len(xs) < 2:
        return xs[0], float("nan")
    return st.mean(xs), 1.96 * st.stdev(xs) / math.sqrt(len(xs))


def fmt(m, ci):
    return "%+.2f ± %.2f" % (m, ci) if not math.isnan(ci) else "%+.2f" % m


def main(argv=None):
    ap = argparse.ArgumentParser()
    ap.add_argument("tsv")
    ap.add_argument("--robot", required=True)
    ap.add_argument("--baseline", required=True)
    ap.add_argument("--out", required=True)
    ap.add_argument("--out-tsv", required=True)
    a = ap.parse_args(argv)
    cell = defaultdict(dict)  # (build, opponent) -> {seed: (cold, warm)}
    with open(a.tsv, newline="") as f:
        for r in csv.DictReader(f, delimiter="\t"):
            if r["coldOk"] != "true" or r["warmOk"] != "true":
                continue
            cell[(r["build"], r["opponent"])][r["seed"]] = (100 * float(r["coldScoreShare"]), 100 * float(r["warmScoreShare"]))
    builds = {b for b, _ in cell}
    if a.robot not in builds or a.baseline not in builds:
        print("cold_warm_read: %s or %s has no finished pair in %s" % (a.robot, a.baseline, a.tsv), file=sys.stderr)
        return 1
    # Only the seeds both builds finished, so every comparison is between the same battles.
    per = {}
    for opp in sorted({o for _, o in cell}):
        r, b = cell.get((a.robot, opp), {}), cell.get((a.baseline, opp), {})
        seeds = sorted(set(r) & set(b))
        if not seeds:
            continue
        per[opp] = {build: (st.mean(src[s][0] for s in seeds), st.mean(src[s][1] for s in seeds))
                    for build, src in ((a.robot, r), (a.baseline, b))}
    both = sorted(per)
    lines = ["# Cold against warm (BENCH-174)", "",
             "%d robots with both builds' pairs on the same seeds; each robot weighted equally (points of score share)." % len(both), "",
             "| Read | Mean ± 95% |", "|---|---|"]
    for build in (a.baseline, a.robot):
        lines.append("| %s: warm minus cold | %s |" % (build, fmt(*mean_ci([per[o][build][1] - per[o][build][0] for o in both]))))
    lines.append("| warm: %s minus %s | %s |" % (a.robot, a.baseline,
                 fmt(*mean_ci([per[o][a.robot][1] - per[o][a.baseline][1] for o in both]))))
    lines.append("| cold: %s minus %s (A/A when they play alike until they save) | %s |" % (a.robot, a.baseline,
                 fmt(*mean_ci([per[o][a.robot][0] - per[o][a.baseline][0] for o in both]))))
    for build in (a.baseline, a.robot):
        d = sorted(both, key=lambda o: per[o][build][1] - per[o][build][0])
        for title, rows in (("hurts most", d[:25]), ("helps most", d[::-1][:25])):
            lines += ["", "## %s: memory %s" % (build, title), "", "| Robot | Cold | Warm | Warm - cold |", "|---|---|---|---|"]
            for o in rows:
                c, w = per[o][build]
                lines.append("| %s | %.1f | %.1f | %+.1f |" % (o, c, w, w - c))
    with open(a.out, "w") as f:
        f.write("\n".join(lines) + "\n")
    with open(a.out_tsv, "w") as f:
        f.write("opponent\tbase_cold\tbase_warm\trobot_cold\trobot_warm\n")
        for o in both:
            bc, bw = per[o][a.baseline]
            rc, rw = per[o][a.robot]
            f.write("%s\t%.2f\t%.2f\t%.2f\t%.2f\n" % (o, bc, bw, rc, rw))
    print("\n".join(lines[:10]))
    return 0


if __name__ == "__main__":
    sys.exit(main())

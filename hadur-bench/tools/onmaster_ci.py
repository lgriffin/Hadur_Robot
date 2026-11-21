#!/usr/bin/env python3
"""BENCH-253: per-robot read of lines already on master against an arm built without them.

    python3 tools/onmaster_ci.py ARMS.tsv --without bb --robots NAME... --out REPORT.md --out-tsv ROWS.tsv

For each named robot: the control (c and aa pooled) minus the without-arm, in points of score share, with a 95%
interval (1.96 x the standard error of the difference of two means). Positive means the on-master line pays.
A line stays where the low end is above 0 and comes off where the high end is below 0. Standard library only.
"""
import argparse
import collections
import csv
import statistics


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument("arms")
    ap.add_argument("--without", default="bb")
    ap.add_argument("--robots", nargs="+", required=True)
    ap.add_argument("--out", required=True)
    ap.add_argument("--out-tsv", required=True)
    a = ap.parse_args()
    s = collections.defaultdict(list)
    with open(a.arms, newline="", encoding="utf-8") as f:
        for r in csv.DictReader(f, delimiter="\t"):
            if r.get("ok", "true") != "true":
                continue
            arm = "ctl" if r["arm"] in ("c", "aa") else r["arm"]
            s[(r["opponent"], arm)].append(100 * float(r["score_share"]))
    rows = []
    for name in a.robots:
        c, x = s.get((name, "ctl"), []), s.get((name, a.without), [])
        if len(c) < 2 or len(x) < 2:
            rows.append((name, None, None, len(c), len(x), "no read"))
            continue
        d = statistics.mean(c) - statistics.mean(x)
        h = 1.96 * (statistics.variance(c) / len(c) + statistics.variance(x) / len(x)) ** 0.5
        verdict = "keep" if d - h > 0 else "remove" if d + h < 0 else "level"
        rows.append((name, d, h, len(c), len(x), verdict))
    with open(a.out_tsv, "w") as g:
        g.write("opponent\tcontrol_minus_%s\thalf95\tcontrol_n\t%s_n\tverdict\n" % (a.without, a.without))
        for n, d, h, nc, nx, v in rows:
            g.write("%s\t%s\t%s\t%d\t%d\t%s\n" % (n, "" if d is None else "%.2f" % d, "" if h is None else "%.2f" % h, nc, nx, v))
    with open(a.out, "w") as g:
        g.write("# On-master lines: control minus %s\n\nPoints of score share, 95%% interval; positive means the line pays.\n\n" % a.without)
        g.write("| Opponent | Control - %s | 95%% | Battles | Verdict |\n|---|---:|---:|---:|---|\n" % a.without)
        for n, d, h, nc, nx, v in rows:
            g.write("| %s | %s | %s | %d / %d | %s |\n" % (n, "-" if d is None else "%+.2f" % d, "-" if h is None else "± %.2f" % h, nc, nx, v))
    return 0


if __name__ == "__main__":
    raise SystemExit(main())

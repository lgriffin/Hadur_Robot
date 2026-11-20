"""A pilot stop rule (first used by the pc-intercept card, now retired). Reads an arms.tsv and fails (exit 1) when ARM minus pooled c and aa,
averaged over the robots all three arms read, is below FLOOR points, or when fewer than MIN robots
are read; otherwise exit 0. Writes a one-line verdict to OUT.

  python3 tools/arm_floor.py ARMS_TSV --arm ic --floor 0 --min 20 --out FILE.md
"""
import argparse
import os
import sys

sys.path.insert(0, os.path.join(os.path.dirname(os.path.abspath(__file__)), "..", "..", "data", "tools"))
import multiarm  # noqa: E402


def verdict(arms_tsv, arm, floor, min_robots):
    run = multiarm.Run(multiarm.read_rows([arms_tsv]))
    d = run.diffs(arm, ["c", "aa"], run.opps(arm, "c", "aa"))
    m, ci, n = multiarm.mean_ci(list(d.values()))
    ok = m is not None and n >= min_robots and m >= floor
    return ok, m, ci, n


def main(argv=None):
    ap = argparse.ArgumentParser()
    ap.add_argument("arms")
    ap.add_argument("--arm", required=True)
    ap.add_argument("--floor", type=float, default=0.0)
    ap.add_argument("--min", type=int, default=1)
    ap.add_argument("--out", required=True)
    a = ap.parse_args(argv)
    ok, m, ci, n = verdict(a.arms, a.arm, a.floor, a.min)
    est = "no robots read" if m is None else multiarm.fmt(m, ci)
    text = "%s: %s minus pooled c and aa = %s points a robot over %d robots (floor %+.2f, at least %d robots).\n" % (
        "GO ON" if ok else "STOP", a.arm, est, n, a.floor, a.min)
    with open(a.out, "w", encoding="utf-8") as f:
        f.write("# Pilot stop rule\n\n" + text)
    print(text, end="")
    return 0 if ok else 1


if __name__ == "__main__":
    sys.exit(main())

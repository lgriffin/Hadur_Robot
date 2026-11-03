#!/usr/bin/env python3
"""BENCH-180: the per-robot pilot of a menu screen (pc-shelf).

    python3 tools/shelf_pilot.py ARMS.tsv --arms mt wl hl gl [--threshold 5] [--excess 3]
            --out REPORT.md --stop-file STOP

A menu card turns one per-opponent switch on per arm and keeps, robot by robot, the arm that wins.
A panel-mean futility read cannot judge that: a switch can lose on average and still win big on a
few robots. This pilot reads the first seed of every robot instead. For each arm, it counts the
robots where the arm beats the control (c) by THRESHOLD points or more, and does the same for the
A/A copy (aa), whose count is pure noise. The pilot passes when some switch arm beats the A/A's
count by EXCESS robots or more; otherwise no switch shows more big wins than chance, and it writes
STOP so the screen and everything after it on that panel pass straight through.

Exit 0 either way (a failed pilot is a result, not a broken run). Standard library only.
"""
import argparse
import collections
import csv
import statistics
import sys
from pathlib import Path


def read(path):
    shares = collections.defaultdict(list)
    with open(path, newline="", encoding="utf-8") as f:
        for row in csv.DictReader(f, delimiter="\t"):
            if row.get("ok", "true") != "true":
                continue
            shares[(row["opponent"], row["arm"])].append(100 * float(row["score_share"]))
    return shares


def big_wins(shares, arm, threshold, control="c"):
    """The robots where ARM's mean beats the control's by THRESHOLD points or more, with the gain."""
    out = {}
    for (o, a), v in shares.items():
        if a != arm:
            continue
        ref = shares.get((o, control))
        if not ref or not v:
            continue
        d = statistics.mean(v) - statistics.mean(ref)
        if d >= threshold:
            out[o] = d
    return out


def judge(shares, arms, threshold, excess, aa="aa"):
    """(passed, aa count, {arm: wins}) for the pilot rule above."""
    noise = len(big_wins(shares, aa, threshold))
    wins = {a: big_wins(shares, a, threshold) for a in arms}
    passed = any(len(w) >= noise + excess for w in wins.values())
    return passed, noise, wins


def main(argv=None):
    p = argparse.ArgumentParser()
    p.add_argument("tsv")
    p.add_argument("--arms", nargs="+", required=True)
    p.add_argument("--threshold", type=float, default=5.0)
    p.add_argument("--excess", type=int, default=3)
    p.add_argument("--out", required=True)
    p.add_argument("--stop-file", required=True)
    a = p.parse_args(argv)
    shares = read(a.tsv)
    robots = sorted({o for o, arm in shares if arm == "c"})
    passed, noise, wins = judge(shares, a.arms, a.threshold, a.excess)
    lines = [f"# Shelf pilot: {a.tsv}", "",
             f"{len(robots)} robots read. Robots where an arm beats c by {a.threshold:g} points or more on the "
             f"pilot seed; the A/A copy does so on **{noise}** by chance. Pass: a switch arm on {noise + a.excess} or more.", "",
             "| Arm | Robots at +%g or more | Over the A/A | Largest |" % a.threshold, "|---|---:|---:|---|"]
    for arm in a.arms:
        w = wins[arm]
        top = ", ".join(f"{o} {d:+.1f}" for o, d in sorted(w.items(), key=lambda x: -x[1])[:5])
        lines.append(f"| {arm} | {len(w)} | {len(w) - noise:+d} | {top} |")
    lines += ["", "PASS: the screen runs." if passed else "STOP: no switch beats chance; the screen and confirm skip this panel."]
    Path(a.out).write_text("\n".join(lines) + "\n", encoding="utf-8")
    stop = Path(a.stop_file)
    if passed:
        stop.unlink(missing_ok=True)
    else:
        stop.write_text("pilot found no switch above chance\n", encoding="utf-8")
    print("\n".join(lines))
    return 0


if __name__ == "__main__":
    sys.exit(main())

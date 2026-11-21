#!/usr/bin/env python3
"""Read a hybrid multi-arm run as predicted MiniRumble APS per arm, and paired differences.

  python3 hybrid/mini/read.py SET RUN_DIR [--ref jl --ref-aps 88.56]

While the run is going (no arms.tsv yet) it reads RUN_DIR.log, the bench's console.

SET is a kitlab field file (the role column carries each robot's weight). Each arm's score share
is averaged over seeds per opponent, then weighted over the set (tools/kitlab_read.py's estimate).
Paired: arm minus REF per opponent on the (opponent, seed) battles both finished, weighted, with a
95% interval from the weighted spread of the per-opponent differences. With --ref-aps the
estimate is REF_APS + that difference.
"""
import argparse
import collections
import csv
import math
import os
import re


def load_set(path):
    w = {}
    for line in open(path):
        if not line.strip() or line.lstrip().startswith("#"):
            continue
        name, role = [c.strip() for c in line.split("|")][:2]
        w[name] = float(role.split(":")[1])
    return w


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument("set")
    ap.add_argument("run")
    ap.add_argument("--ref", default="jl")
    ap.add_argument("--ref-aps", type=float)
    a = ap.parse_args()
    weights = load_set(a.set)
    share = collections.defaultdict(dict)  # arm -> (opp, seed) -> share
    if os.path.exists(a.run + "/arms.tsv"):
        for r in csv.DictReader(open(a.run + "/arms.tsv"), delimiter="\t"):
            if r["ok"] != "true" or r["opponent"] not in weights:
                continue
            share[r["arm"]][(r["opponent"], r["seed"])] = 100 * float(r["score_share"])
    else:
        # A run still going: the bench's log lines, "<opponent> seed <n> <arm>: score share <x>%".
        for line in open(a.run + ".log"):
            m = re.match(r"^(.*) seed (\d+) (\S+): score share ([\d.]+)%", line)
            if m and m.group(1) in weights:
                share[m.group(3)][(m.group(1), m.group(2))] = float(m.group(4))
    ref = share.get(a.ref, {})
    print(f"{'arm':6} {'battles':>7} {'opps':>4} {'APS est':>8} {'vs ' + a.ref:>16} {'paired est':>10}")
    for arm in sorted(share, key=lambda k: -sum(share[k].values()) / max(1, len(share[k]))):
        by_opp = collections.defaultdict(list)
        for (o, s), v in share[arm].items():
            by_opp[o].append(v)
        wsum = sum(weights[o] for o in by_opp)
        aps = sum(weights[o] * sum(v) / len(v) for o, v in by_opp.items()) / wsum
        diffs = collections.defaultdict(list)
        for k, v in share[arm].items():
            if k in ref:
                diffs[k[0]].append(v - ref[k])
        line = f"{arm:6} {len(share[arm]):7d} {len(by_opp):4d} {aps:8.2f}"
        if diffs and arm != a.ref:
            ws = {o: weights[o] for o in diffs}
            tw = sum(ws.values())
            means = {o: sum(d) / len(d) for o, d in diffs.items()}
            m = sum(ws[o] * means[o] for o in means) / tw
            # weighted standard error of the mean over opponents
            var = sum(ws[o] ** 2 * (means[o] - m) ** 2 for o in means) / tw ** 2
            ci = 1.96 * math.sqrt(var)
            line += f" {m:+7.2f} +-{ci:5.2f}"
            if a.ref_aps is not None:
                line += f" {a.ref_aps + m:10.2f}"
        print(line)


if __name__ == "__main__":
    main()

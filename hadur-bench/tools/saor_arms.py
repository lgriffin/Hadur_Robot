#!/usr/bin/env python3
"""Saor's arm screen read (docs/saor.md, "Duel endgame"): each arm's census APS paired per opponent
against the control arm, and its gate-field head-to-heads.

Each arm's census and gate-field runs are read with saor_gates.evaluate. The census APS of an arm
is compared with the control's opponent by opponent: the mean difference over the opponents both
fought, with a 95% interval from the spread of those differences. The top-5 bar (Leigh,
2026-10-25: "a guaranteed top 5") is a census APS whose 95% interval sits wholly above
--top5 (default 66.0, over 5th place Quantum at 65.61 on the 2026-10-25 rankings).

  python3 tools/saor_arms.py --arms C,P,N,U --control C [--work-root work/saor-arms] [--top5 66.0]

Standard library only.
"""

import argparse
import math
import os
import sys

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import saor_gates  # noqa: E402


def interval(values):
    """Mean and 95% half-width of a list (normal approximation); half-width 0 below two values."""
    n = len(values)
    if n == 0:
        return None, None
    mean = sum(values) / n
    if n < 2:
        return mean, 0.0
    var = sum((v - mean) ** 2 for v in values) / (n - 1)
    return mean, 1.96 * math.sqrt(var / n)


def compare(per_opponent, control):
    """Paired difference of an arm's per-opponent APS against the control's."""
    common = sorted(set(per_opponent) & set(control))
    return interval([per_opponent[n] - control[n] for n in common]) + (len(common),)


def read(root, arms, control_arm, top5):
    rows = []
    results = {}
    for arm in arms:
        robot = "hadur117.micro.Saor%s" % arm
        census = saor_gates.evaluate([os.path.join(root, "census-" + arm)], robot)
        gate = saor_gates.evaluate([os.path.join(root, "gate9-" + arm)], robot)
        results[arm] = (census, gate)
    control = results[control_arm][0]["per_opponent"]
    for arm in arms:
        census, gate = results[arm]
        aps, half = interval(list(census["per_opponent"].values()))
        diff, dhalf, n = compare(census["per_opponent"], control)
        rows.append({
            "arm": arm,
            "aps": aps,
            "aps_half": half,
            "diff": diff,
            "diff_half": dhalf,
            "paired": n,
            "top5": aps is not None and aps - half > top5,
            "figment": gate["SAOR-13 figment"],
            "wallaby": gate["SAOR-14 wallaby"],
        })
    return rows


def fmt(v, digits=2):
    return "-" if v is None else "%.*f" % (digits, v)


def render(rows, control_arm, top5):
    lines = ["| Arm | Census APS | vs %s (paired) | Top-5 bar (low end > %.1f) | Figment out-survived | Wallaby out-damaged |" % (control_arm, top5),
             "|---|---|---|---|---|---|"]
    for r in rows:
        lines.append("| %s | %s ± %s | %s ± %s (%d) | %s | %s%% (%d) | %s%% (%d) |" % (
            r["arm"], fmt(r["aps"]), fmt(r["aps_half"]), fmt(r["diff"]), fmt(r["diff_half"]), r["paired"],
            "yes" if r["top5"] else "no",
            fmt(r["figment"]["value"], 1), r["figment"]["n"], fmt(r["wallaby"]["value"], 1), r["wallaby"]["n"]))
    return "\n".join(lines)


def main(argv=None):
    p = argparse.ArgumentParser(description=__doc__, formatter_class=argparse.RawDescriptionHelpFormatter)
    p.add_argument("--arms", required=True, help="comma-separated arm names, as in saor-arms/arms.txt")
    p.add_argument("--control", default="C")
    p.add_argument("--work-root", default="work/saor-arms")
    p.add_argument("--top5", type=float, default=66.0)
    a = p.parse_args(argv)
    arms = [s.strip() for s in a.arms.split(",") if s.strip()]
    print(render(read(a.work_root, arms, a.control, a.top5), a.control, a.top5))
    return 0


if __name__ == "__main__":
    sys.exit(main())

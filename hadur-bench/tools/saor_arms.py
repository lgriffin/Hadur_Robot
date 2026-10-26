#!/usr/bin/env python3
"""Saor's arm screen read (docs/saor.md, "Duel endgame"): each arm's census APS paired per opponent
against the control arm, and its gate-field head-to-heads.

Each arm's census and gate-field runs are read with saor_gates.evaluate. An arm's census APS
carries a 95% interval for seed-to-seed noise: within each census field the battles' own APS
values vary from seed to seed, and the field variances combine into the error of the mean over
fields. The arm is compared with the control field by field (the same opponents, other seeds),
with the interval of that difference built the same way. The top-5 bar (Leigh, 2026-10-25: "a
guaranteed top 5") is a full census (--pairings opponents, 156) whose APS interval sits wholly
above --top5: default 66.6, which is 5th place (Quantum, 65.61 on the 2026-10-25 rankings) plus a
1.0 margin for the bench-to-live offset (Hadur's 1v1 ran 0.5 to 0.7 under its bench live).

  python3 tools/saor_arms.py --arms C,P,N,U --control C [--work-root work/saor-arms] [--top5 66.6]
  python3 tools/saor_arms.py --field live --arms C,FIG,WAL --control C --only work/saor-arms/live/micro.txt --top5 69.37

--field live reads the live-shaped census (tools/saor_live.py: fields drawn from the whole
MeleeRumble list), and --only limits APS to the pairings against the robots that file names,
the MicroMelee field, as LiteRumble scores MicroMelee from mixed MeleeRumble battles
(docs/plan-saor-first.md, stage 0). An arm whose arms.txt line is `@robot name` is that robot
in the seat, not a Saor build. On the live census the bar is a 1st-place bar: Figment's 69.37.
--control-live names the control's live score (Saor 0.1: 68.08): the bar then moves by the run's
offset, the control's read minus that score, so a card that reads high or low clears the bar only
as live would (docs/plan-saor-first.md 6d).

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


def seed_half(groups):
    """95% half-width of the mean over groups of each group's mean, from the within-group spread."""
    if not groups:
        return None
    var = 0.0
    for values in groups.values():
        if len(values) > 1:
            var += interval(values)[1] ** 2
    return math.sqrt(var) / len(groups)


def field_means(groups):
    return {g: sum(v) / len(v) for g, v in groups.items() if v}


def compare(groups, control):
    """Mean and 95% half-width of the arm's field-by-field APS difference against the control."""
    common = sorted(set(groups) & set(control))
    if not common:
        return None, None, 0
    a, c = field_means(groups), field_means(control)
    diff = sum(a[g] - c[g] for g in common) / len(common)
    half = seed_half({g: groups[g] for g in common}) ** 2 + seed_half({g: control[g] for g in common}) ** 2
    return diff, math.sqrt(half), len(common)


def seats(path):
    """Arm name to seated robot for the `@robot name` lines of an arms file."""
    out = {}
    if path and os.path.exists(path):
        with open(path, encoding="utf-8") as f:
            for line in f:
                parts = [p.strip() for p in line.split("|")]
                if not line.startswith("#") and len(parts) == 3 and parts[2].startswith("@"):
                    out[parts[0]] = parts[2][1:].strip()
    return out


def read_only(path):
    with open(path, encoding="utf-8") as f:
        return {l.strip() for l in f if l.strip() and not l.startswith("#")}


def per_opponent_aps(census):
    po = census["per_opponent"]
    return sum(po.values()) / len(po) if po else None


def bar_for(top5, control_aps, control_live=None):
    """The bar an arm's low end must clear: top5, moved by the run's offset when control_live is set."""
    if control_live is None or control_aps is None:
        return top5
    return top5 + (control_aps - control_live)


def read(root, arms, control_arm, top5, pairings=156, field="census", robots=None, only=None, control_live=None):
    rows = []
    results = {}
    robots = robots or {}
    for arm in arms:
        robot = robots.get(arm, "hadur117.micro.Saor%s" % arm)
        census = saor_gates.evaluate([os.path.join(root, field + "-" + arm)], robot, only=only)
        gate = saor_gates.evaluate([os.path.join(root, "gate9-" + arm)], robot)
        results[arm] = (census, gate)
    control = results[control_arm][0]["groups"]
    bar = bar_for(top5, per_opponent_aps(results[control_arm][0]), control_live)
    for arm in arms:
        census, gate = results[arm]
        po = census["per_opponent"]
        aps = per_opponent_aps(census)
        half = seed_half(census["groups"])
        diff, dhalf, n = compare(census["groups"], control)
        rows.append({
            "arm": arm,
            "aps": aps,
            "aps_half": half,
            "diff": diff,
            "diff_half": dhalf,
            "paired": n,
            "opponents": len(po),
            # Only a full census can clear the bar; a short one never does.
            "top5": aps is not None and len(po) >= pairings and aps - half > bar,
            "bar": bar,
            "figment": gate["SAOR-13 figment"],
            "wallaby": gate["SAOR-14 wallaby"],
        })
    return rows


def fmt(v, digits=2):
    return "-" if v is None else "%.*f" % (digits, v)


def render(rows, control_arm, top5, bar="Top-5 bar"):
    level = rows[0]["bar"] if rows and "bar" in rows[0] else top5
    if abs(level - top5) > 1e-9:
        label = "%s (full census, low end > %.2f: %.2f moved by the run's offset %+.2f)" % (bar, level, top5, level - top5)
    else:
        label = "%s (full census, low end > %.2f)" % (bar, top5)
    lines = ["| Arm | Census APS (opponents) | vs %s, by field (fields) | %s | Figment out-survived | Wallaby out-damaged |" % (control_arm, label),
             "|---|---|---|---|---|---|"]
    for r in rows:
        lines.append("| %s | %s ± %s (%d) | %s ± %s (%d) | %s | %s%% (%d) | %s%% (%d) |" % (
            r["arm"], fmt(r["aps"]), fmt(r["aps_half"]), r["opponents"], fmt(r["diff"]), fmt(r["diff_half"]), r["paired"],
            "yes" if r["top5"] else "no",
            fmt(r["figment"]["value"], 1), r["figment"]["n"], fmt(r["wallaby"]["value"], 1), r["wallaby"]["n"]))
    return "\n".join(lines)


def main(argv=None):
    p = argparse.ArgumentParser(description=__doc__, formatter_class=argparse.RawDescriptionHelpFormatter)
    p.add_argument("--arms", required=True, help="comma-separated arm names, as in saor-arms/arms.txt")
    p.add_argument("--control", default="C")
    p.add_argument("--work-root", default="work/saor-arms")
    p.add_argument("--top5", type=float, default=66.6)
    p.add_argument("--control-live", type=float, help="the control's live score; moves the bar by the run's offset")
    p.add_argument("--pairings", type=int, default=156, help="opponents a full census has")
    p.add_argument("--field", default="census", choices=("census", "live"))
    p.add_argument("--only", help="count only pairings against the robots this file names, one a line")
    p.add_argument("--arms-file", default=os.path.join(os.path.dirname(os.path.dirname(os.path.abspath(__file__))), "saor-arms", "arms.txt"))
    a = p.parse_args(argv)
    arms = [s.strip() for s in a.arms.split(",") if s.strip()]
    only = read_only(a.only) if a.only else None
    rows = read(a.work_root, arms, a.control, a.top5, a.pairings, a.field, seats(a.arms_file), only, a.control_live)
    print(render(rows, a.control, a.top5, "1st bar" if a.field == "live" else "Top-5 bar"))
    return 0


if __name__ == "__main__":
    sys.exit(main())

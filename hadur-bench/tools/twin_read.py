#!/usr/bin/env python3
"""Reads TwinSaor's arms off their team bench reports (docs/twinsaor.md section 6, card pc-twin-w3).

Each report's first table gives one row per opposing team: `| team | battles | NN.N% | ...`. An arm's
APS is the mean of its per-team score shares, as the rumble's APS is the mean of its pairings. An arm
is read against the control team by team, so the difference's error is the paired one:
sd(differences) / sqrt(teams).

    python3 tools/twin_read.py --reports DIR --label twinduel-field --run w3 --arms C,A,R2W --control C
"""
import argparse
import math
import os
import re
import sys

ROW = re.compile(r"^\| (?!\*\*All|Opponent team)(.+?) \| (\d+) \| ([\d.]+)% \|")


def rows(path):
    """{team: (battles, score share %)} from a team bench report's first table."""
    out = {}
    with open(path, encoding="utf-8") as f:
        for line in f:
            if line.startswith("| Opponent team | Rounds |"):
                break
            m = ROW.match(line)
            if m:
                out[m.group(1)] = (int(m.group(2)), float(m.group(3)))
    return out


def shares(path):
    """{team: score share %} from a team bench report's first table."""
    return {t: share for t, (_, share) in rows(path).items()}


def complete(control_rows, arm_rows):
    """Why an arm's report cannot be read against the control's, or None: both must hold the same
    teams with the same number of battles each, so no arm passes on part of the field."""
    if set(control_rows) != set(arm_rows):
        return "teams differ: %d against %d" % (len(arm_rows), len(control_rows))
    short = [t for t in control_rows if arm_rows[t][0] != control_rows[t][0]]
    return "battle counts differ on %d teams" % len(short) if short else None


def compare(control, arm):
    """APS of both over the teams both fought, the paired difference and its standard error."""
    teams = sorted(set(control) & set(arm))
    if not teams:
        return None
    diffs = [arm[t] - control[t] for t in teams]
    n = len(teams)
    mean = sum(diffs) / n
    se = math.sqrt(sum((d - mean) ** 2 for d in diffs) / (n - 1) / n) if n > 1 else float("nan")
    return {"teams": n, "control": sum(control[t] for t in teams) / n, "arm": sum(arm[t] for t in teams) / n,
            "diff": mean, "se": se}


def verdict(r, gate):
    if r is None:
        return "no data"
    return "pass" if r["diff"] >= gate and r["diff"] > 2 * r["se"] else "fail"


def aa_ok(r):
    """Whether the A/A arm agrees with the control: its difference inside 2 standard errors."""
    return r is not None and abs(r["diff"]) <= 2 * r["se"]


def main(argv=None):
    p = argparse.ArgumentParser(description=__doc__)
    p.add_argument("--reports", default="../docs/bench/local")
    p.add_argument("--run", required=True)
    p.add_argument("--label", default="twinduel-field")
    p.add_argument("--arms", required=True)
    p.add_argument("--control", default="C")
    p.add_argument("--gate", type=float, default=0.5, help="share points over the control an arm needs")
    p.add_argument("--aa", default="A", help="the A/A arm: the control again; 'none' (or '') for none")
    a = p.parse_args(argv)
    if a.aa == "none":
        a.aa = ""
    path = lambda arm: os.path.join(a.reports, "twin-%s-%s-%s.md" % (a.run, a.label, arm))
    control_rows = rows(path(a.control))
    control = {t: share for t, (_, share) in control_rows.items()}
    print("# TwinSaor arms, %s on %s\n" % (a.run, a.label))
    print("Control %s: APS %.2f over %d teams. Gate: +%.1f share points and more than 2 standard errors.\n"
          % (a.control, sum(control.values()) / max(1, len(control)), len(control), a.gate))
    aa = None
    if a.aa and os.path.exists(path(a.aa)):
        aa_rows = rows(path(a.aa))
        aa = None if complete(control_rows, aa_rows) else compare(control, shares(path(a.aa)))
    void = bool(a.aa) and not aa_ok(aa)
    if void:
        print("**A/A check failed or missing** (%s against %s): no arm passes on this run.\n" % (a.aa, a.control))
    print("| Arm | Teams | APS | vs %s | SE | Verdict |" % a.control)
    print("|---|---|---|---|---|---|")
    for arm in a.arms.split(","):
        if arm == a.control:
            continue
        if not os.path.exists(path(arm)):
            print("| %s | - | - | - | - | no report |" % arm)
            continue
        arm_rows = rows(path(arm))
        why = complete(control_rows, arm_rows)
        if why:
            print("| %s | %d | - | - | - | incomplete: %s |" % (arm, len(arm_rows), why))
            continue
        r = compare(control, {t: share for t, (_, share) in arm_rows.items()})
        if r is None:
            print("| %s | 0 | - | - | - | no data |" % arm)
            continue
        v = ("A/A ok" if aa_ok(r) else "A/A noisy") if arm == a.aa else ("void" if void else verdict(r, a.gate))
        print("| %s | %d | %.2f | %+.2f | %.2f | %s |" % (arm, r["teams"], r["arm"], r["diff"], r["se"], v))
    return 0


if __name__ == "__main__":
    sys.exit(main())

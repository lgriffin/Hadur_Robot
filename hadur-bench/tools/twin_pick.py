#!/usr/bin/env python3
"""Picks TwinSaor's mode for each opposing team (docs/twinsaor.md section 9, card pc-twin-w3).

Every arm of the screen is TwinSaor with one mode for every team. This reader goes team by team:
for each arm, the difference from the control battle by battle (the same seeds, so the pairs share
the engine's dice), its mean and its standard error. A team's pick is the arm with the best mean
that clears the pick rule: at least --gain share points over the control and a low end (mean - 2 SE)
above zero. A team no arm clears keeps the control's mode. The A/A arm (the control again) is read
the same way and never picked: the teams it would have "won" are the rule's false picks.

Picking the best of several arms on the same battles flatters it (the winner's curse), so the
expected gain printed here is an upper bound; the table is only kept if it passes a fresh-seed gate.

    python3 tools/twin_pick.py --run w3 --label twinduel-tailor --arms C,A,R2W,R2N --control C
"""
import argparse
import csv
import math
import os
import sys

OURS = "hadur117.twin.TwinSaor"


def battle(path):
    """(opposing team, our score share %) from one battle's team.csv, or None if unfinished."""
    with open(path, encoding="utf-8") as f:
        rows = list(csv.DictReader(f))
    if len(rows) != 2:
        return None
    ours = [r for r in rows if r["team"].startswith(OURS)]
    theirs = [r for r in rows if not r["team"].startswith(OURS)]
    if len(ours) != 1 or len(theirs) != 1:
        return None
    total = float(ours[0]["score"]) + float(theirs[0]["score"])
    team = theirs[0]["team"].rsplit(" (", 1)[0]
    return team, (100.0 * float(ours[0]["score"]) / total if total > 0 else 50.0)


def arm_battles(directory):
    """{team: {battle dir name: share}} for one arm's run."""
    out = {}
    battles = os.path.join(directory, "battles")
    if not os.path.isdir(battles):
        return out
    for name in sorted(os.listdir(battles)):
        path = os.path.join(battles, name, "team.csv")
        if not os.path.exists(path):
            continue
        b = battle(path)
        if b:
            out.setdefault(b[0], {})[name] = b[1]
    return out


def paired(control, arm):
    """Mean and standard error of arm - control over the battles both hold, and their number."""
    keys = sorted(set(control) & set(arm))
    n = len(keys)
    if n < 2:
        return None
    d = [arm[k] - control[k] for k in keys]
    mean = sum(d) / n
    se = math.sqrt(sum((x - mean) ** 2 for x in d) / (n - 1) / n)
    return {"n": n, "diff": mean, "se": se, "control": sum(control[k] for k in keys) / n}


def clears(r, gain):
    """The pick rule: at least `gain` share points and a low end above zero."""
    return r is not None and r["diff"] >= gain and r["diff"] - 2 * r["se"] > 0


def pick(control, arms, gain, aa=None):
    """{team: (best arm or None, its read, A/A read)} over the control's teams."""
    out = {}
    for team, c in sorted(control.items()):
        best = None
        for name, battles in arms.items():
            if name == aa or team not in battles:
                continue
            r = paired(c, battles[team])
            if clears(r, gain) and (best is None or r["diff"] > best[1]["diff"]):
                best = (name, r)
        a = paired(c, arms[aa][team]) if aa in arms and team in arms[aa] else None
        out[team] = (best[0] if best else None, best[1] if best else None, a)
    return out


def main(argv=None):
    p = argparse.ArgumentParser(description=__doc__)
    p.add_argument("--work", default="work")
    p.add_argument("--run", required=True)
    p.add_argument("--label", default="twinduel-tailor")
    p.add_argument("--arms", required=True)
    p.add_argument("--control", default="C")
    p.add_argument("--aa", default="A", help="the A/A arm, never picked; '' for none")
    p.add_argument("--gain", type=float, default=3.0, help="share points over the control a pick needs")
    p.add_argument("--field", type=int, default=27, help="teams in the live rumble, for the APS estimate")
    p.add_argument("--picks", help="also write team<TAB>arm lines here")
    a = p.parse_args(argv)
    d = lambda arm: os.path.join(a.work, "twin-%s" % a.run, "%s-%s" % (a.label, arm))
    control = arm_battles(d(a.control))
    arms = {arm: arm_battles(d(arm)) for arm in a.arms.split(",") if arm != a.control}
    picks = pick(control, arms, a.gain, a.aa or None)
    print("# TwinSaor per-team picks, %s on %s\n" % (a.run, a.label))
    print("Pick rule: the best arm with at least +%.1f share points over %s and a low end (mean - 2 SE) above"
          " zero, battle by battle on the same seeds. The gain is an upper bound (best of %d arms); the table"
          " is kept only if a fresh-seed gate agrees.\n" % (a.gain, a.control, len(arms) - (1 if a.aa in arms else 0)))
    print("| Team | Battles | %s share | Pick | Gain | SE | A/A diff |" % a.control)
    print("|---|---|---|---|---|---|---|")
    total = 0.0
    false_picks = 0
    for team, (arm, r, aa) in picks.items():
        n = len(control[team])
        share = sum(control[team].values()) / n
        aa_txt = "%+.1f" % aa["diff"] if aa else "-"
        if aa and clears(aa, a.gain):
            false_picks += 1
            aa_txt += " (would pick)"
        if arm:
            total += r["diff"]
            print("| %s | %d | %.1f | **%s** | %+.1f | %.1f | %s |" % (team, n, share, arm, r["diff"], r["se"], aa_txt))
        else:
            print("| %s | %d | %.1f | %s | - | - | %s |" % (team, n, share, a.control, aa_txt))
    print("\nPicked %d of %d teams. Upper-bound gain: %.1f share points = %+.2f APS over a %d-team field."
          % (sum(1 for v in picks.values() if v[0]), len(picks), total, total / a.field, a.field))
    if a.aa:
        print("A/A false picks: %d of %d teams (the rule's noise on this run).\n" % (false_picks, len(picks)))
    if a.picks:
        with open(a.picks, "w", encoding="utf-8") as f:
            for team, (arm, _, _) in picks.items():
                if arm:
                    f.write("%s\t%s\n" % (team, arm))
    return 0


if __name__ == "__main__":
    sys.exit(main())

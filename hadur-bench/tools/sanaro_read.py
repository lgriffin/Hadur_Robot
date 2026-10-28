#!/usr/bin/env python3
"""Sanaro's arm read (docs/sanaro.md, "Bench"; SANARO-10 to SANARO-12).

For each arm's runs under --work-root (tools/sanaro_arms.sh: census-ARM, duel-ARM, live-ARM) it
reports, from every battle's melee.csv:

  aps        the arm's APS, LiteRumble's way (saor_gates.evaluate), counting only the pairings
             against --only's robots (the NanoMelee field), with the 95% seed interval
  vs ctrl    the field-by-field APS difference against the control arm, with its interval
  survival   rounds won, as a share of the rounds in its battles
  leaders    on the NanoMelee census, each leader's APS in the same battles, and the arm's
             battle-by-battle APS margin over it (SANARO-10: above NaturalScience by more than
             two standard errors; the read also holds the arm to Quantum, the live 1st), and
             whether the arm outsurvived both (SANARO-11)
  duel       on the duel suite, the share of rounds the arm won against each leader alone
             (SANARO-12: more than 55%)

  python3 tools/sanaro_read.py --work-root work/sanaro-n01 --arms S10,S0,S06 --control S0 \\
      --only nanomelee-field.txt [--field census] [--live 66.60]

--field live reads the live-shaped census instead (seated arms are robots, not Sanaro builds);
there --live, the 1st robot's live score, is printed beside the reads. Standard library only.
"""

import argparse
import math
import os
import sys

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import saor_arms  # noqa: E402
import saor_gates  # noqa: E402

LEADERS = ("d414.nano.Quantum 1.0.0", "sheldor.melee.nano.NaturalScience 1.2.1")
PREFIX = "hadur117.nano.Sanaro"


def names(path):
    with open(path, encoding="utf-8") as f:
        return {l.split("|")[0].strip() for l in f if l.strip() and not l.startswith("#")}


def battle_aps(battle, who, only=None):
    s = battle[who]["score"]
    shares = []
    for name, row in battle.items():
        if name == who or (only is not None and name not in only):
            continue
        total = s + row["score"]
        shares.append(50.0 if total == 0 else 100.0 * s / total)
    return sum(shares) / len(shares) if shares else None


def leaders(work, robot, only):
    """Per leader: its APS in the arm's battles, the arm's margin over it (mean and 95% half-width
    over fields of the field mean of battle margins), and the share of battles the arm outsurvived it."""
    out = {}
    for leader in LEADERS:
        aps, margins, outs = [], {}, []
        for group, battle in saor_gates.battles([work], robot, with_group=True):
            if leader not in battle:
                continue
            us = next(n for n in battle if saor_gates.is_robot(n, robot))
            a = battle_aps(battle, leader)
            m = battle_aps(battle, us, only)
            aps.append(a)
            margins.setdefault(group, []).append(m - a)
            outs.append(battle[us]["survival"] > battle[leader]["survival"])
        means = [sum(v) / len(v) for v in margins.values()]
        mean, half = saor_arms.interval(means)
        out[leader] = {
            "aps": sum(aps) / len(aps) if aps else None,
            "margin": mean,
            "half": half,
            "outsurvived": 100.0 * sum(outs) / len(outs) if outs else None,
            "battles": len(aps),
        }
    return out


def duel(work, robot):
    out = {}
    for group, battle in saor_gates.battles([work], robot, with_group=True):
        us = next(n for n in battle if saor_gates.is_robot(n, robot))
        for name, row in battle.items():
            if name != us:
                won, rounds = out.get(name, (0, 0))
                out[name] = (won + battle[us]["firsts"], rounds + battle[us]["firsts"] + row["firsts"])
    return {n: 100.0 * w / r for n, (w, r) in out.items() if r}


def fmt(v, digits=2, sign=False):
    if v is None:
        return "-"
    return ("%+.*f" if sign else "%.*f") % (digits, v)


def read(root, arms, control, only, field="census", seats=None):
    seats = seats or {}
    rows = []
    results = {}
    for arm in arms:
        robot = seats.get(arm, PREFIX + arm)
        work = os.path.join(root, field + "-" + arm)
        results[arm] = (robot, work, saor_gates.evaluate([work], robot, only=only))
    ctrl = results[control][2]["groups"] if control in results else {}
    for arm in arms:
        robot, work, r = results[arm]
        aps = saor_arms.per_opponent_aps(r)
        diff, dhalf, n = saor_arms.compare(r["groups"], ctrl)
        survival = r["U1 survival"]["value"]
        row = {"arm": arm, "robot": robot, "aps": aps, "half": saor_arms.seed_half(r["groups"]),
               "diff": diff, "dhalf": dhalf, "paired": n, "battles": r["battles"],
               "opponents": r["opponents"], "survival": survival}
        if field == "census":
            row["leaders"] = leaders(work, robot, only)
        dwork = os.path.join(root, "duel-" + arm)
        if os.path.isdir(dwork):
            row["duel"] = duel(dwork, robot)
        rows.append(row)
    return rows


def render(rows, control, field, live=None):
    out = ["# Sanaro arms: %s field, control %s" % (field, control), ""]
    if live is not None:
        out += ["Live 1st: %.2f." % live, ""]
    head = "| Arm | Battles | Opponents | APS | vs %s | Survival |" % control
    rule = "|---|---|---|---|---|---|"
    if field == "census":
        head += " Quantum APS | margin | outsurvived | NaturalScience APS | margin | outsurvived |"
        rule += "---|---|---|---|---|---|"
    if any("duel" in r for r in rows):
        head += " duel Quantum | duel NaturalScience |"
        rule += "---|---|"
    out += [head, rule]
    for r in rows:
        line = "| %s | %d | %d | %s ± %s | %s ± %s | %s |" % (
            r["arm"], r["battles"], r["opponents"], fmt(r["aps"]), fmt(r["half"]),
            fmt(r["diff"], sign=True), fmt(r["dhalf"]), fmt(r["survival"], 1))
        if field == "census":
            for leader in LEADERS:
                l = r["leaders"][leader]
                line += " %s | %s ± %s | %s%% |" % (fmt(l["aps"]), fmt(l["margin"], sign=True), fmt(l["half"]),
                                                   fmt(l["outsurvived"], 0))
        if any("duel" in x for x in rows):
            d = r.get("duel", {})
            line += " %s | %s |" % tuple(("%s%%" % fmt(d[n], 1)) if n in d else "-" for n in LEADERS)
        out.append(line)
    out += ["", "APS counts only NanoMelee pairings. Intervals are 95%. A margin is the arm's APS less the",
            "leader's, battle by battle in the same battles; SANARO-10 needs the NaturalScience margin's low",
            "end above zero over 20 or more battles, and the duel columns (SANARO-12) need more than 55%."]
    return "\n".join(out) + "\n"


def main(argv=None):
    p = argparse.ArgumentParser(description=__doc__, formatter_class=argparse.RawDescriptionHelpFormatter)
    p.add_argument("--work-root", required=True)
    p.add_argument("--arms", required=True)
    p.add_argument("--control", required=True)
    p.add_argument("--only", required=True, help="the NanoMelee field file (or saor_live.py's micro.txt)")
    p.add_argument("--field", default="census", choices=("census", "live"))
    p.add_argument("--arms-file", default=os.path.join(os.path.dirname(os.path.dirname(os.path.abspath(__file__))),
                                                       "sanaro-arms", "arms.txt"))
    p.add_argument("--live", type=float)
    a = p.parse_args(argv)
    only = names(a.only)
    seats = saor_arms.seats(a.arms_file)
    rows = read(a.work_root, a.arms.split(","), a.control, only, a.field, seats)
    sys.stdout.write(render(rows, a.control, a.field, a.live))
    return 0


if __name__ == "__main__":
    sys.exit(main())

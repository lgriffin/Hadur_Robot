#!/usr/bin/env python3
"""Saor's bench gates (docs/saor.md, SAOR-12 to SAOR-14 and the stage gates U1 to U3).

Reads every melee battle under one or more bench work directories (`melee-N/melee.csv`, one
row per robot: rank, robot, score, firsts, survival, bulletDamage; `melee-N-baseline`
battles are skipped) and reports, for the robot named by --robot (default hadur117.micro.Saor):

  aps        LiteRumble's average percentage score: per battle, 100 S / (S + X) against each
             opponent X by total score; averaged per opponent over its battles, then over
             opponents (SAOR-12: 66.0 or more over the full MicroMelee field)
  survival   rounds won, as a share of rounds (firsts / rounds): our reading of LiteRumble's
             melee Survival column, on which Capulet stands at 29.2 (U1 gate)
  figment    share of the battles with kc.micro.Figment in them where we out-survived it, by
             the survival score (SAOR-13: 50% or more of 200 battles)
  wallaby    share of the battles with wompi.Wallaby in them where our bullet damage beat its
             (SAOR-14: 50% or more of 200 battles)

  python3 hadur-bench/tools/saor_gates.py --work hadur-bench/work/saor-gate9 [--json out.json]

A gate passes only with its full sample: the APS gate needs --pairings opponents (156, the
MicroMelee field), the head-to-head gates --battles battles (200). A smaller run's verdict is
"short: n of N" with whether the value is above or below the threshold, never "pass", so a cloud
smoke run reads as a smoke run. Run the census and the gate field separately: the APS and survival
gates belong to the census, the head-to-heads to the gate field. Standard library only.
"""

import argparse
import csv
import json
import os
import sys

APS_GATE = 66.0
CAPULET_SURVIVAL = 29.2
COLD_GUN_APS = 64.0
HEAD_TO_HEAD = 50.0
FIGMENT = "kc.micro.Figment"
WALLABY = "wompi.Wallaby"


def is_robot(name, configured):
    return name == configured or name.startswith(configured + " ")


def battles(works, robot):
    """Yield the rows of each battle our robot fought, as {name: row} with numbers parsed."""
    for work in works:
        for root, _dirs, files in sorted(os.walk(work)):
            base = os.path.basename(root)
            if "melee.csv" not in files or not base.startswith("melee-") or base.endswith("-baseline"):
                continue
            with open(os.path.join(root, "melee.csv"), newline="", encoding="utf-8") as f:
                rows = list(csv.DictReader(f))
            if len(rows) < 2:
                continue
            parsed = {}
            for r in rows:
                parsed[r["robot"]] = {k: float(r[k]) for k in ("score", "firsts", "survival", "bulletDamage")}
            if any(is_robot(n, robot) for n in parsed):
                yield parsed


def head_to_head(battle, us, prefix, key):
    """None when no robot named `prefix` fought, else whether our `key` beat its."""
    for name, row in battle.items():
        if is_robot(name, prefix):
            return battle[us][key] > row[key]
    return None


def evaluate(works, robot, pairings=156, needed_battles=200):
    shares = {}
    firsts = rounds = 0
    figment = []
    wallaby = []
    count = 0
    for battle in battles(works, robot):
        count += 1
        us = next(n for n in battle if is_robot(n, robot))
        s = battle[us]["score"]
        for name, row in battle.items():
            if name == us:
                continue
            total = s + row["score"]
            shares.setdefault(name, []).append(50.0 if total == 0 else 100.0 * s / total)
        firsts += battle[us]["firsts"]
        rounds += sum(r["firsts"] for r in battle.values())
        f = head_to_head(battle, us, FIGMENT, "survival")
        if f is not None:
            figment.append(f)
        w = head_to_head(battle, us, WALLABY, "bulletDamage")
        if w is not None:
            wallaby.append(w)
    per_opponent = {n: sum(v) / len(v) for n, v in shares.items()}
    aps = sum(per_opponent.values()) / len(per_opponent) if per_opponent else None
    survival = 100.0 * firsts / rounds if rounds else None

    def gate(value, threshold, n, needed):
        if value is None:
            return {"value": None, "n": n, "verdict": "no data"}
        ok = value >= threshold
        if n >= needed:
            verdict = "pass" if ok else "fail"
        else:
            # Never a pass: a gate is decided only on its full sample.
            verdict = "short: %d of %d, %s threshold" % (n, needed, "above" if ok else "below")
        return {"value": round(value, 2), "n": n, "threshold": threshold, "verdict": verdict}

    share = lambda xs: 100.0 * sum(xs) / len(xs) if xs else None
    return {
        "robot": robot,
        "battles": count,
        "opponents": len(per_opponent),
        "per_opponent": {n: round(v, 2) for n, v in sorted(per_opponent.items())},
        "U1 survival": gate(survival, CAPULET_SURVIVAL, len(per_opponent), pairings),
        "U2 aps": gate(aps, COLD_GUN_APS, len(per_opponent), pairings),
        "SAOR-12 aps": gate(aps, APS_GATE, len(per_opponent), pairings),
        "SAOR-13 figment": gate(share(figment), HEAD_TO_HEAD, len(figment), needed_battles),
        "SAOR-14 wallaby": gate(share(wallaby), HEAD_TO_HEAD, len(wallaby), needed_battles),
    }


def render(result):
    lines = ["Saor gates for %s: %d battles, %d opponents" % (result["robot"], result["battles"], result["opponents"]), ""]
    lines.append("| Gate | Value | Threshold | n | Verdict |")
    lines.append("|---|---|---|---|---|")
    for key in ("U1 survival", "U2 aps", "SAOR-12 aps", "SAOR-13 figment", "SAOR-14 wallaby"):
        g = result[key]
        lines.append("| %s | %s | %s | %d | %s |" % (key, "-" if g["value"] is None else "%.2f" % g["value"],
                                                   g.get("threshold", "-"), g["n"], g["verdict"]))
    return "\n".join(lines)


def main(argv=None):
    p = argparse.ArgumentParser(description=__doc__, formatter_class=argparse.RawDescriptionHelpFormatter)
    p.add_argument("--work", action="append", required=True, help="bench work directory; repeatable")
    p.add_argument("--robot", default="hadur117.micro.Saor")
    p.add_argument("--pairings", type=int, default=156, help="opponents the APS gate needs")
    p.add_argument("--battles", type=int, default=200, help="battles each head-to-head gate needs")
    p.add_argument("--json", help="also write the result here")
    a = p.parse_args(argv)
    result = evaluate(a.work, a.robot, a.pairings, a.battles)
    print(render(result))
    if a.json:
        with open(a.json, "w", encoding="utf-8") as f:
            json.dump(result, f, indent=2)
    return 0 if result["battles"] else 1


if __name__ == "__main__":
    sys.exit(main())

#!/usr/bin/env python3
"""Per-opponent view of a melee bench work directory (the melee top-20 bench).

hadur-bench's melee report averages Hadur's pairwise share over the whole field. For a
per-robot read this script walks every `battles/melee-N/` directory under a work directory
(the suite's `work/<label>-<stamp>/`, or one field's), reads `melee.csv` (final scores of
every robot) and `rounds.csv` (per round: Hadur's place, the last opponent of a duel and
whether Hadur won it, skipped turns), and writes one row per opponent, pooled over every
field the opponent stood in:

  python3 data/tools/melee_pairwise.py --work hadur-bench/work/melee-top20-20261006-120000 \\
      --set hadur-bench/melee-top20-set.txt

Columns: rank (from the set file's `melee-<rank>` role), opponent, fields and battles it
was in, Hadur's mean pairwise share against it (100 H / (H + X) per battle, as the
MeleeRumble scores APS) with the standard deviation over battles, how many battles Hadur
out-scored it, Hadur's and its mean finishing place, and the rounds that ended as a duel
between Hadur and it with Hadur's win rate in them. Who killed Hadur in a round is not
recorded by the bench; the duel columns are the nearest thing (the last robot standing
with Hadur). A second table gives Hadur's APS, mean place and skipped turns per battle
for each field.

Standard library only.
"""

import argparse
import csv
import os
import statistics
import sys


def read_csv(path):
    with open(path, newline="", encoding="utf-8") as f:
        return list(csv.DictReader(f))


def load_ranks(paths):
    """name -> rank from `name | melee-<rank> | jar` lines of the given set files."""
    ranks = {}
    for path in paths or []:
        with open(path, encoding="utf-8") as f:
            for line in f:
                line = line.strip()
                if not line or line.startswith("#"):
                    continue
                parts = [p.strip() for p in line.split("|")]
                if len(parts) >= 2 and parts[1].startswith("melee-"):
                    try:
                        ranks[parts[0]] = int(parts[1][len("melee-"):])
                    except ValueError:
                        pass
    return ranks


def is_robot(name, configured):
    return name == configured or name.startswith(configured + " ")


def collect(work, hadur):
    """Yield (field label, battle number, robots, rounds) for each readable battle."""
    for root, _dirs, files in os.walk(work):
        if "melee.csv" not in files or not os.path.basename(root).startswith("melee-"):
            continue
        # A bench run with --baseline keeps the baseline's battles beside ours as
        # `melee-N-baseline`; they are not Hadur's, so they are not pooled here.
        if os.path.basename(root).endswith("-baseline"):
            continue
        rows = read_csv(os.path.join(root, "melee.csv"))
        if len(rows) < 2:
            continue
        robots = {r["robot"]: (float(r["score"]), int(r["rank"])) for r in rows}
        if not any(is_robot(n, hadur) for n in robots):
            continue
        rounds = []
        rounds_path = os.path.join(root, "rounds.csv")
        if os.path.exists(rounds_path):
            rounds = read_csv(rounds_path)
        field = os.path.basename(os.path.dirname(os.path.dirname(root)))
        yield field, int(os.path.basename(root)[len("melee-"):]), robots, rounds


def analyse(work, hadur):
    per_opp = {}
    per_field = {}
    for field, _number, robots, rounds in collect(work, hadur):
        us_name = next(n for n in robots if is_robot(n, hadur))
        us, us_place = robots[us_name]
        f = per_field.setdefault(field, {"aps": [], "place": [], "skipped": [], "rounds": 0})
        shares = []
        for name, (score, place) in robots.items():
            if name == us_name:
                continue
            total = us + score
            share = 50.0 if total == 0 else 100.0 * us / total
            shares.append(share)
            o = per_opp.setdefault(name, {"fields": set(), "shares": [], "wins": 0,
                                          "hplace": [], "oplace": [], "duels": 0, "duelwon": 0})
            o["fields"].add(field)
            o["shares"].append(share)
            o["wins"] += 1 if us > score else 0
            o["hplace"].append(us_place)
            o["oplace"].append(place)
        f["aps"].append(sum(shares) / len(shares))
        f["place"].append(us_place)
        f["skipped"].append(sum(int(r["skippedTurns"]) for r in rounds))
        f["rounds"] += len(rounds)
        for r in rounds:
            opp = r.get("duelOpponent", "-")
            if opp and opp != "-":
                for name in robots:
                    if name != us_name and (name == opp or opp.startswith(name)):
                        o = per_opp[name]
                        o["duels"] += 1
                        o["duelwon"] += 1 if r["duelWon"] == "1" else 0
                        break
    return per_opp, per_field


def mean(xs):
    return sum(xs) / len(xs) if xs else float("nan")


def sd(xs):
    return statistics.stdev(xs) if len(xs) > 1 else float("nan")


def render(per_opp, per_field, ranks):
    out = []
    out.append("| Rank | Opponent | Fields | Battles | Hadur share | sd | Hadur out-scored it | "
               "Hadur place | Its place | Duels with Hadur | Hadur won |")
    out.append("|---|---|---|---|---|---|---|---|---|---|---|")
    ordered = sorted(per_opp.items(), key=lambda kv: (ranks.get(kv[0], 999), kv[0]))
    for name, o in ordered:
        n = len(o["shares"])
        duel = "%d%%" % round(100.0 * o["duelwon"] / o["duels"]) if o["duels"] else "-"
        out.append("| %s | %s | %d | %d | %.1f | %.1f | %d / %d | %.1f | %.1f | %d | %s |" % (
            ranks.get(name, "?"), name, len(o["fields"]), n, mean(o["shares"]), sd(o["shares"]),
            o["wins"], n, mean(o["hplace"]), mean(o["oplace"]), o["duels"], duel))
    out.append("")
    out.append("| Field | Battles | Rounds | Hadur APS | Hadur mean place | Skipped turns per battle |")
    out.append("|---|---|---|---|---|---|")
    for field in sorted(per_field):
        f = per_field[field]
        out.append("| %s | %d | %d | %.1f | %.1f | %.1f |" % (
            field, len(f["aps"]), f["rounds"], mean(f["aps"]), mean(f["place"]), mean(f["skipped"])))
    return "\n".join(out) + "\n"


def main(argv=None):
    ap = argparse.ArgumentParser(description=__doc__.split("\n")[0])
    ap.add_argument("--work", required=True, help="a melee bench work directory")
    ap.add_argument("--hadur", default="hadur2.Hadur", help="Hadur's robot name (prefix match)")
    ap.add_argument("--set", action="append", help="set file(s) giving each opponent's melee rank")
    ap.add_argument("--out", help="write the tables here instead of stdout")
    args = ap.parse_args(argv)
    per_opp, per_field = analyse(args.work, args.hadur)
    if not per_opp:
        print("no finished melee battles under %s" % args.work, file=sys.stderr)
        return 1
    text = render(per_opp, per_field, load_ranks(args.set))
    if args.out:
        with open(args.out, "w", encoding="utf-8", newline="\n") as f:
            f.write(text)
    else:
        sys.stdout.write(text)
    return 0


if __name__ == "__main__":
    sys.exit(main())

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

Rounds written since the death columns (BENCH-40) also carry the tick Hadur died, who killed
it (the robot whose bullet hit it on that tick, else the nearest robot still alive) and the
last robot to hit it. The field table then adds Hadur's deaths, their mean tick and the
robot that killed it most, and a pooled table lists every robot's kills. Older rounds.csv
files, without those columns, just leave them out.

The pooled paired view compares two builds fought over the same seeds. From a work
directory that holds `melee-N` and `melee-N-baseline` battles, or from the TSV that
export_melee.py wrote (--tsv, with --build and --baseline-build, the first two builds in the
file by default), it takes Hadur's APS in each (field, seed) cell for both builds,
subtracts, and reports the mean candidate-minus-baseline difference over all cells with a
95% t interval, then the same per field:

  python3 data/tools/melee_pairwise.py --tsv data/bench/<date>_hadur-melee-top20-local_cold.tsv

Standard library only.
"""

import argparse
import csv
import math
import os
import statistics
import sys

# Two-sided 95% t, df 1 to 30; 1.96 beyond. The same table as hadur-bench's Stats.
T975 = [12.706, 4.303, 3.182, 2.776, 2.571, 2.447, 2.365, 2.306, 2.262, 2.228,
        2.201, 2.179, 2.160, 2.145, 2.131, 2.120, 2.110, 2.101, 2.093, 2.086,
        2.080, 2.074, 2.069, 2.064, 2.060, 2.056, 2.052, 2.048, 2.045, 2.042]


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
        f = per_field.setdefault(field, {"aps": [], "place": [], "skipped": [], "rounds": 0,
                                         "deaths": 0, "death_ticks": [], "killers": {}})
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
            tick, killer = r.get("deathTick", "-"), r.get("killer", "-")
            if tick not in (None, "", "-"):
                f["deaths"] += 1
                f["death_ticks"].append(int(tick))
                if killer not in (None, "", "-"):
                    f["killers"][killer] = f["killers"].get(killer, 0) + 1
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


def aps_of(hadur_score, others):
    """Hadur's mean pairwise share against the other scores, as the MeleeRumble scores APS."""
    shares = [50.0 if hadur_score + x == 0 else 100.0 * hadur_score / (hadur_score + x) for x in others]
    return sum(shares) / len(shares)


def cells_from_work(work, hadur):
    """(field, seed) -> {"cand": APS, "base": APS} from melee-N and melee-N-baseline battles."""
    cells = {}
    for root, _dirs, files in os.walk(work):
        name = os.path.basename(root)
        if "melee.csv" not in files or not name.startswith("melee-"):
            continue
        role = "base" if name.endswith("-baseline") else "cand"
        seed = int(name[len("melee-"):].replace("-baseline", ""))
        rows = read_csv(os.path.join(root, "melee.csv"))
        us = [r for r in rows if is_robot(r["robot"], hadur)]
        others = [float(r["score"]) for r in rows if not is_robot(r["robot"], hadur)]
        if len(us) != 1 or not others:
            continue
        field = os.path.basename(os.path.dirname(os.path.dirname(root)))
        cells.setdefault((field, seed), {})[role] = aps_of(float(us[0]["score"]), others)
    return cells


def cells_from_tsv(path, hadur, build=None, baseline_build=None):
    """The same cells from export_melee.py's TSV. Returns (cells, candidate build, baseline build)."""
    with open(path, newline="", encoding="utf-8") as f:
        rows = list(csv.DictReader(f, delimiter="\t"))
    builds = []
    for r in rows:
        if r["build"] not in builds:
            builds.append(r["build"])
    build = build or (builds[0] if builds else None)
    baseline_build = baseline_build or next((b for b in builds if b != build), None)
    battles = {}
    for r in rows:
        if r["build"] in (build, baseline_build):
            battles.setdefault((r["field"], int(r["seed"]), r["build"]), []).append(r)
    cells = {}
    for (field, seed, label), rs in battles.items():
        us = [r for r in rs if is_robot(r["robot"], hadur)]
        others = [float(r["score"]) for r in rs if not is_robot(r["robot"], hadur)]
        if len(us) != 1 or not others:
            continue
        role = "cand" if label == build else "base"
        cells.setdefault((field, seed), {})[role] = aps_of(float(us[0]["score"]), others)
    return cells, build, baseline_build


def t_interval(diffs):
    """(mean, 95% half width) of the differences; the half width is nan under two of them."""
    n = len(diffs)
    if n == 0:
        return float("nan"), float("nan")
    m = mean(diffs)
    if n < 2:
        return m, float("nan")
    t = T975[n - 2] if n - 2 < len(T975) else 1.96
    return m, t * sd(diffs) / math.sqrt(n)


def pm(m, h):
    return "n/a" if math.isnan(m) else ("%+.1f" % m if math.isnan(h) else "%+.1f +/- %.1f" % (m, h))


def render_paired(cells, build, baseline_build):
    """Pooled candidate-minus-baseline APS over the cells that have both builds, then per field."""
    paired = {k: v for k, v in cells.items() if "cand" in v and "base" in v}
    dropped = len(cells) - len(paired)
    out = ["Paired APS, %s minus %s, over (field, seed) cells fought by both builds." % (build, baseline_build), ""]
    diffs = [v["cand"] - v["base"] for v in paired.values()]
    m, h = t_interval(diffs)
    out.append("Pooled over %d cells in %d fields: candidate %.1f, baseline %.1f, difference %s APS points "
               "(mean +/- 95%% t interval)." % (
                   len(diffs), len({k[0] for k in paired}),
                   mean([v["cand"] for v in paired.values()]), mean([v["base"] for v in paired.values()]),
                   pm(m, h)))
    if dropped:
        out.append("%d cells had only one build and were left out." % dropped)
    out.append("")
    out.append("| Field | Cells | Candidate APS | Baseline APS | Paired diff |")
    out.append("|---|---|---|---|---|")
    for field in sorted({k[0] for k in paired}):
        vs = [v for k, v in paired.items() if k[0] == field]
        fm, fh = t_interval([v["cand"] - v["base"] for v in vs])
        out.append("| %s | %d | %.1f | %.1f | %s |" % (
            field, len(vs), mean([v["cand"] for v in vs]), mean([v["base"] for v in vs]), pm(fm, fh)))
    return "\n".join(out) + "\n"


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
    deaths = any(f["deaths"] for f in per_field.values())
    out.append("| Field | Battles | Rounds | Hadur APS | Hadur mean place | Skipped turns per battle |"
               + (" Deaths | Mean death tick | Top killer |" if deaths else ""))
    out.append("|---|---|---|---|---|---|" + ("---|---|---|" if deaths else ""))
    for field in sorted(per_field):
        f = per_field[field]
        row = "| %s | %d | %d | %.1f | %.1f | %.1f |" % (
            field, len(f["aps"]), f["rounds"], mean(f["aps"]), mean(f["place"]), mean(f["skipped"]))
        if deaths:
            top = max(f["killers"].items(), key=lambda kv: (kv[1], kv[0]), default=None)
            row += " %d | %s | %s |" % (f["deaths"], "%.0f" % mean(f["death_ticks"]) if f["deaths"] else "-",
                                        "%s (%d)" % top if top else "-")
        out.append(row)
    kills = {}
    for f in per_field.values():
        for name, n in f["killers"].items():
            kills[name] = kills.get(name, 0) + n
    if kills:
        total = sum(kills.values())
        out.append("")
        out.append("| Robot that killed Hadur | Kills | Share of deaths |")
        out.append("|---|---|---|")
        for name, n in sorted(kills.items(), key=lambda kv: (-kv[1], kv[0]))[:20]:
            out.append("| %s | %d | %.0f%% |" % (name, n, 100.0 * n / total))
    return "\n".join(out) + "\n"


def main(argv=None):
    ap = argparse.ArgumentParser(description=__doc__.split("\n")[0])
    ap.add_argument("--work", help="a melee bench work directory")
    ap.add_argument("--tsv", help="export_melee.py's TSV: print the pooled paired APS difference of two builds")
    ap.add_argument("--build", help="the candidate build in --tsv (default: the first in the file)")
    ap.add_argument("--baseline-build", help="the baseline build in --tsv (default: the next one in the file)")
    ap.add_argument("--hadur", default="hadur2.Hadur", help="Hadur's robot name (prefix match)")
    ap.add_argument("--set", action="append", help="set file(s) giving each opponent's melee rank")
    ap.add_argument("--out", help="write the tables here instead of stdout")
    args = ap.parse_args(argv)
    if not args.work and not args.tsv:
        ap.error("give --work, --tsv or both")
    parts = []
    if args.work:
        per_opp, per_field = analyse(args.work, args.hadur)
        if not per_opp:
            print("no finished melee battles under %s" % args.work, file=sys.stderr)
            return 1
        parts.append(render(per_opp, per_field, load_ranks(args.set)))
        cells = cells_from_work(args.work, args.hadur)
        if any("base" in v for v in cells.values()):
            parts.append(render_paired(cells, args.build or "candidate", args.baseline_build or "baseline"))
    if args.tsv:
        cells, build, baseline_build = cells_from_tsv(args.tsv, args.hadur, args.build, args.baseline_build)
        if not baseline_build or not any("base" in v for v in cells.values()):
            print("no second build with battles in %s" % args.tsv, file=sys.stderr)
            return 1
        parts.append(render_paired(cells, build, baseline_build))
    text = "\n".join(parts)
    if args.out:
        with open(args.out, "w", encoding="utf-8", newline="\n") as f:
            f.write(text)
    else:
        sys.stdout.write(text)
    return 0


if __name__ == "__main__":
    sys.exit(main())

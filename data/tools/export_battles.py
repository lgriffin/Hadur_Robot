#!/usr/bin/env python3
"""Export a bench work directory's raw per-battle rows to a flat TSV.

hadur-bench leaves one `result.csv` per battle under `<workdir>/battles/`, named
`<opponent slug>-<seed>` for the candidate robot and `<opponent slug>-<seed>-baseline`
for the baseline robot of a paired run (see hadur.bench.BattleResult and Opponent in
hadur-bench). This script walks those files, maps each slug back to the opponent name
and role from a set file (hadur-bench/top20.txt and friends), and writes one row per
battle so bench runs can be joined and analysed outside the JVM.

  python3 data/tools/export_battles.py --work hadur-bench/work/top20-38-vs-37 \\
      --set hadur-bench/top20.txt --build 3.8 --baseline-build 3.7 \\
      --out data/bench/top20-38-vs-37.tsv

Standard library only. Numbers from result.csv are copied verbatim as strings.
"""

import argparse
import csv
import os
import re
import sys

import compare_conditions

# hadur.bench.BattleResult.HEADER, used only when no result.csv in the work directory
# has a readable header line yet (every file still empty, battle(s) in flight).
FALLBACK_HEADER = (
    "ok,rounds,score,theirScore,firsts,survival,theirSurvival,"
    "bulletDamage,theirBulletDamage,skippedTurns,turns,turnP50Ms,turnP95Ms,turnMaxMs,"
    "roundRecords,faults,faultRecords,ourHitRate,theirHitRate,"
    "phantomWaves,enemyShots,unseenShots,inferredWaves,matchedWaves,radarReacquired,hiddenShots,"
    "profileFound,memoryFailures,seedsEvicted,bulletsIntercepted,jitteredShots,shotsFired,"
    "tiers,openingGun,gunSeed,surfSeed,seedDecays,"
    "openingDistance,meanDistance,targetDistance,roundTicks,finishTicks,ramTicks,fullPowerShots,"
    "maxLevel,slowTicks,shadowedWaves,interceptsShadowed,flavourChanges,flavourStep,errors,"
    "duressTicks,engineDisables,securityErrors,rShortfall,finalRMissing"
).split(",")

# hadur.bench.Opponent.slug(): runs of characters outside [A-Za-z0-9.] become one "_".
_SLUG_RUN = re.compile(r"[^A-Za-z0-9.]+")

# A battle directory name: <slug>-<seed> or <slug>-<seed>-baseline. The slug may itself
# contain digits and dots, so this relies on regex backtracking to find the LAST "-<digits>"
# run (optionally followed by "-baseline") rather than the first.
DIR_RE = re.compile(r"^(?P<slug>.+)-(?P<seed>\d+)(?P<baseline>-baseline)?$")

RANK_RE = re.compile(r"^rumble-(\d+)$")


def slug(name):
    return _SLUG_RUN.sub("_", name)


def load_set(path):
    """Return {slug: (name, role, rank)} for every opponent line in a set file."""
    opponents = {}
    with open(path, encoding="utf-8") as f:
        for line in f:
            line = line.strip()
            if not line or line.startswith("#"):
                continue
            fields = [c.strip() for c in line.split("|")]
            name = fields[0]
            role = fields[1] if len(fields) > 1 else ""
            m = RANK_RE.match(role)
            rank = m.group(1) if m else ""
            opponents[slug(name)] = (name, role, rank)
    return opponents


def find_header(battles_dir, dirnames):
    """The first result.csv header line found among the battle directories, if any."""
    for name in dirnames:
        path = os.path.join(battles_dir, name, "result.csv")
        try:
            with open(path, encoding="utf-8") as f:
                first = f.readline().rstrip("\n").rstrip("\r")
        except OSError:
            continue
        if first:
            return first.split(",")
    return None


def read_result(path, header):
    """Return {column: value} for one result.csv, blank with ok=false if short."""
    try:
        with open(path, encoding="utf-8") as f:
            lines = f.read().splitlines()
    except OSError:
        lines = []
    if len(lines) < 2:
        row = {col: "" for col in header}
        if "ok" in row:
            row["ok"] = "false"
        return row
    local_header = lines[0].split(",")
    values = lines[1].split(",")
    data = dict(zip(local_header, values))
    return {col: data.get(col, "") for col in header}


def share(row, numer, denom):
    try:
        a = float(row.get(numer, ""))
        b = float(row.get(denom, ""))
    except ValueError:
        return ""
    if row.get("ok", "").strip().lower() != "true":
        return ""
    total = a + b
    if total == 0:
        return ""
    return "%.4f" % (a / total)


def collect(work, set_file, build, baseline_build, want_share):
    battles_dir = os.path.join(work, "battles")
    try:
        dirnames = sorted(
            n for n in os.listdir(battles_dir) if os.path.isdir(os.path.join(battles_dir, n))
        )
    except OSError:
        dirnames = []

    opponents = load_set(set_file)
    header = find_header(battles_dir, dirnames) or FALLBACK_HEADER

    columns = ["build", "opponent", "role", "rank", "seed"] + header
    if want_share:
        columns += ["score_share", "survival_share"]

    rows = []
    unmatched = []
    candidate_count = 0
    baseline_count = 0

    for dirname in dirnames:
        m = DIR_RE.match(dirname)
        if not m:
            unmatched.append(dirname)
            continue
        opp = opponents.get(m.group("slug"))
        if opp is None:
            unmatched.append(dirname)
            continue
        name, role, rank = opp
        is_baseline = m.group("baseline") is not None
        if is_baseline:
            if not baseline_build:
                print(
                    "warning: skipping baseline row for %s (no --baseline-build given)" % dirname,
                    file=sys.stderr,
                )
                continue
            row_build = baseline_build
            baseline_count += 1
        else:
            row_build = build
            candidate_count += 1

        data = read_result(os.path.join(battles_dir, dirname, "result.csv"), header)
        row = {
            "build": row_build,
            "opponent": name,
            "role": role,
            "rank": rank,
            "seed": m.group("seed"),
        }
        row.update(data)
        if want_share:
            row["score_share"] = share(data, "score", "theirScore")
            row["survival_share"] = share(data, "survival", "theirSurvival")
        rows.append(row)

    def sort_key(row):
        build_rank = 0 if row["build"] == build else 1
        rank = row["rank"]
        rank_key = int(rank) if rank != "" else float("inf")
        return (build_rank, rank_key, row["opponent"], int(row["seed"]))

    rows.sort(key=sort_key)
    return columns, rows, candidate_count, baseline_count, unmatched


def read_rounds(path):
    """Return (columns, [row dicts]) from one battle's rounds.tsv, or (None, []) if absent."""
    try:
        with open(path, encoding="utf-8") as f:
            lines = f.read().splitlines()
    except OSError:
        return None, []
    if not lines:
        return None, []
    header = lines[0].split("\t")
    return header, [dict(zip(header, line.split("\t"))) for line in lines[1:] if line]


def collect_rounds(work, set_file, build, baseline_build):
    """One row per round of every battle that left a rounds.tsv (hadur.bench.RoundSeries).

    The build, opponent and seed columns come from the directory name and the set file, as
    in collect(), so the labels match the battle TSV; the rest are the file's own columns.
    """
    battles_dir = os.path.join(work, "battles")
    try:
        dirnames = sorted(
            n for n in os.listdir(battles_dir) if os.path.isdir(os.path.join(battles_dir, n))
        )
    except OSError:
        dirnames = []
    opponents = load_set(set_file)
    columns = None
    rows = []
    for dirname in dirnames:
        m = DIR_RE.match(dirname)
        opp = opponents.get(m.group("slug")) if m else None
        if opp is None:
            continue
        is_baseline = m.group("baseline") is not None
        if is_baseline and not baseline_build:
            continue
        header, battle_rows = read_rounds(os.path.join(battles_dir, dirname, "rounds.tsv"))
        if header is None:
            continue
        own = [c for c in header if c not in ("build", "opponent", "seed")]
        if columns is None:
            columns = ["build", "opponent", "role", "rank", "seed"] + own
        for r in battle_rows:
            row = {"build": baseline_build if is_baseline else build, "opponent": opp[0],
                   "role": opp[1], "rank": opp[2], "seed": m.group("seed")}
            row.update({c: r.get(c, "") for c in own})
            rows.append(row)

    def sort_key(row):
        rank = row["rank"]
        return (0 if row["build"] == build else 1, int(rank) if rank != "" else float("inf"),
                row["opponent"], int(row["seed"]), int(row.get("round") or 0))

    rows.sort(key=sort_key)
    return columns or ["build", "opponent", "role", "rank", "seed"], rows


def write_tsv(path, columns, rows):
    with open(path, "w", encoding="utf-8", newline="") as f:
        writer = csv.DictWriter(f, columns, delimiter="\t", lineterminator="\n")
        writer.writeheader()
        writer.writerows(rows)


def main():
    parser = argparse.ArgumentParser(description=__doc__.splitlines()[0])
    parser.add_argument("--work", required=True, help="bench work directory (holds battles/)")
    parser.add_argument("--set", required=True, help="opponent set file (name | role | jar)")
    parser.add_argument("--build", required=True, help="label for the candidate robot's rows")
    parser.add_argument("--baseline-build", default="", help="label for baseline rows; omit to skip them")
    parser.add_argument("--out", required=True, help="TSV file to write")
    parser.add_argument("--share", action="store_true", help="add score_share and survival_share columns")
    parser.add_argument("--rounds-out", default="",
                        help="also write the per-round rows (each battle's rounds.tsv) to this TSV")
    args = parser.parse_args()

    columns, rows, candidate_count, baseline_count, unmatched = collect(
        args.work, args.set, args.build, args.baseline_build, args.share
    )
    write_tsv(args.out, columns, rows)

    summary = "wrote %d rows to %s (%d candidate, %d baseline)" % (
        len(rows), args.out, candidate_count, baseline_count,
    )
    if unmatched:
        summary += "; %d unmatched: %s" % (len(unmatched), ", ".join(unmatched))
    print(summary)
    print(compare_conditions.catalog_note(args.work))
    if args.rounds_out:
        r_columns, r_rows = collect_rounds(args.work, args.set, args.build, args.baseline_build)
        write_tsv(args.rounds_out, r_columns, r_rows)
        print("wrote %d round rows to %s" % (len(r_rows), args.rounds_out))
    return 0


if __name__ == "__main__":
    sys.exit(main())

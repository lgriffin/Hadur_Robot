#!/usr/bin/env python3
"""Round-0 engine disables and skipped turns, per battle, from a bench run's battle dirs.

  python3 round0_skips.py RUN_DIR OUT.tsv

RUN_DIR is a bench output folder (its battles/*/ hold hadur.log, result.csv, rounds.tsv,
engine.log). One row per battle dir:

  build        baseline (the *-baseline dirs) or candidate
  slot         the seed slot (the -N suffix); the worker home is not recorded per battle
  disables     the engine's "has not performed any actions" / "Robot disabled" lines, all rounds
  dis_r0       1 when one of those lines falls in round 0
  dis_turn     the harvest turn of the first round-0 disable line
  dis_rounds   the round of each disable line (34 is the last round of 35)
  r0_won, r0_dmg, r0_ticks   round 0 from rounds.tsv; r0_result, r0_rtick Hadur's own R record
  r0_skips_live  round-0 skips before the R record's tick (the round still being fought)
  r0_skips     round-0 "skipped turn N" lines; r0_first the lowest N; r0_run the longest run of
               consecutive N; r0_first_harvest the harvest turn the first skip was read at
  first_rec    harvest turn of Hadur's first own record in round 0 (V/ROLE/B/P/T/...), and
  first_tick   the earliest tick a round-0 record carries in its own tick field (B, P, EW)
  r0_max_gap   the longest gap in harvest turns between two of Hadur's own records in round 0
               before its R record (r0_gap_from: the turn it starts); r0_last_budget the last
               skip-budget level Hadur logged in that span
  warm_before  1 when a WARM line appears before the first round-0 skip
  rec_before   1 when a ROLE, TICK or R record appears before the first round-0 skip
  setup_lines  count of WARM/MEM/IO/prepare/profile lines anywhere in round 0
  start, end   engine.log creation and result.csv modification (epoch seconds)
Standard library only.
"""
import csv
import glob
import os
import re
import sys

SKIP = re.compile(r"skipped turn (\d+)")
SETUP = re.compile(r"^(WARM|MEM|IO)\b|prepareMemory|profile", re.I)
HEADER = ("dir", "opponent", "build", "slot", "disables", "dis_r0", "dis_turn", "r0_won", "r0_dmg",
          "r0_ticks", "r0_result", "r0_rtick", "dis_rounds", "r0_skips", "r0_skips_live", "r0_first", "r0_run", "r0_first_harvest", "first_rec", "first_rec_type",
          "first_tick", "r0_max_gap", "r0_gap_from", "r0_last_budget", "warm_before", "rec_before", "setup_lines", "skips_total", "turn_max_ms",
          "host_cpu_mean", "start", "end")


def longest_run(ns):
    best = run = 0
    prev = None
    for n in sorted(set(ns)):
        run = run + 1 if prev is not None and n == prev + 1 else 1
        best = max(best, run)
        prev = n
    return best


def scan(d):
    name = os.path.basename(d)
    build = "baseline" if name.endswith("-baseline") else "candidate"
    stem = name[:-len("-baseline")] if build == "baseline" else name
    opp, slot = stem.rsplit("-", 1)
    row = dict(dir=name, opponent=opp, build=build, slot=slot, disables=0, dis_r0=0, dis_turn="",
               r0_result="", r0_rtick="", dis_rounds="", r0_skips_live=0, r0_skips=0, r0_first="", r0_run=0, r0_first_harvest="", first_rec="", first_rec_type="",
               first_tick="", r0_max_gap=0, r0_gap_from="", r0_last_budget="", warm_before=0, rec_before=0, setup_lines=0)
    skips = []
    seen_skip = False
    last_rec = None
    try:
        f = open(os.path.join(d, "hadur.log"), errors="replace")
    except OSError:
        return None
    with f:
        for line in f:
            parts = line.rstrip("\n").split(",", 2)
            if len(parts) < 3:
                continue
            try:
                rnd, turn = int(parts[0]), int(parts[1])
            except ValueError:
                continue
            body = parts[2]
            if body.startswith("SYSTEM:") and ("not performed any actions" in body or "Robot disabled" in body):
                row["disables"] += 1
                row["dis_rounds"] += ("" if row["dis_rounds"] == "" else " ") + str(rnd)
                if rnd == 0 and row["dis_turn"] == "":
                    row["dis_r0"] = 1
                    row["dis_turn"] = turn
            if rnd != 0:
                continue
            if body.startswith("SYSTEM:") and "skipped turn" in body:
                m = SKIP.search(body)
                if m:
                    skips.append(int(m.group(1)))
                    if not seen_skip:
                        row["r0_first_harvest"] = turn
                    seen_skip = True
                continue
            if SETUP.search(body):
                row["setup_lines"] += 1
            if body.startswith(("=", "Round ", "SYSTEM:", "WARNING:")):
                continue
            kind = body.split(",", 1)[0]
            if row["r0_rtick"] == "":
                if last_rec is not None and turn - last_rec > row["r0_max_gap"]:
                    row["r0_max_gap"], row["r0_gap_from"] = turn - last_rec, last_rec
                last_rec = turn
                if body.startswith("P,") and ",budget," in body:
                    row["r0_last_budget"] = body.rsplit(",", 1)[1]
            if kind == "R" and row["r0_rtick"] == "":
                f2 = body.split(",")
                row["r0_rtick"], row["r0_result"] = int(f2[2]), f2[3]
            if row["first_rec"] == "":
                row["first_rec"] = turn
                row["first_rec_type"] = kind
            if row["first_tick"] == "" and kind in ("B", "P", "EW"):
                f2 = body.split(",")
                try:
                    row["first_tick"] = int(f2[2])
                except (IndexError, ValueError):
                    pass
            if not seen_skip:
                if kind == "WARM":
                    row["warm_before"] = 1
                if kind in ("ROLE", "TICK", "R"):
                    row["rec_before"] = 1
    row["r0_skips"] = len(skips)
    rt = row["r0_rtick"]
    row["r0_skips_live"] = sum(1 for n in skips if rt == "" or n < rt)
    row["r0_first"] = min(skips) if skips else ""
    row["r0_run"] = longest_run(skips)
    try:
        r = next(csv.DictReader(open(os.path.join(d, "result.csv"))))
        row["skips_total"] = r["skippedTurns"]
        row["turn_max_ms"] = r["turnMaxMs"]
        row["host_cpu_mean"] = r["hostCpuMean"]
        if int(r["engineDisables"]) != row["disables"]:
            row["disables"] = f"{row['disables']}/{r['engineDisables']}"
    except (OSError, StopIteration, KeyError, ValueError):
        pass
    try:
        for r in csv.DictReader(open(os.path.join(d, "rounds.tsv")), delimiter="\t"):
            if r["round"] == "0":
                row["r0_won"], row["r0_dmg"], row["r0_ticks"] = r["won"], r["damageDealt"], r["ticks"]
                break
    except (OSError, KeyError):
        pass
    try:
        row["start"] = int(os.stat(os.path.join(d, "engine.log")).st_ctime)
        row["end"] = int(os.stat(os.path.join(d, "result.csv")).st_mtime)
    except OSError:
        pass
    return row


def main():
    run, out = sys.argv[1], sys.argv[2]
    dirs = sorted(glob.glob(os.path.join(run, "battles", "*")))
    with open(out, "w", newline="") as fo:
        w = csv.DictWriter(fo, HEADER, delimiter="\t", extrasaction="ignore")
        w.writeheader()
        for i, d in enumerate(dirs):
            row = scan(d)
            if row:
                w.writerow(row)
            if i % 1000 == 0:
                print(i, len(dirs), file=sys.stderr)


if __name__ == "__main__":
    main()

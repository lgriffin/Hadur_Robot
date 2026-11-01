#!/usr/bin/env python3
"""Deise's per-opponent rows: how well Deise hits each robot and how hard each robot hits Deise.

Reads the melee harvest a census run leaves (work/<run>/live-<ARM>/Fnn/battles/melee-*/: shots.csv,
hits.csv, bullets.csv) and writes one row per opponent: rounds it fought Deise, Deise's shots aimed
at it, Deise's hits on it, the hit rate, Deise's damage to it, its damage to Deise and that damage a
round. These are the measurements the per-opponent rows are chosen from (docs/deise.md, stage E7).

  python3 tools/deise_rows.py work/deise-po/live-D [--min-shots 40] [--tsv out.tsv]

Standard library only.
"""

import argparse
import csv
import glob
import os
import sys
from collections import defaultdict


def main(argv=None):
    ap = argparse.ArgumentParser(description=__doc__, formatter_class=argparse.RawDescriptionHelpFormatter)
    ap.add_argument("run", help="a census seat's output directory, e.g. work/deise-po/live-D")
    ap.add_argument("--min-shots", type=int, default=40, help="rows with fewer of Deise's shots are left out")
    ap.add_argument("--tsv", help="also write every row, unfiltered, to this TSV")
    args = ap.parse_args(argv)

    rows = defaultdict(lambda: defaultdict(float))
    us = None
    battles = sorted(glob.glob(os.path.join(args.run, "F*", "battles", "melee-*")))
    for b in battles:
        try:
            with open(os.path.join(b, "bullets.csv"), newline="") as f:
                tally = list(csv.DictReader(f))
            with open(os.path.join(b, "shots.csv"), newline="") as f:
                shots = list(csv.DictReader(f))
            with open(os.path.join(b, "hits.csv"), newline="") as f:
                hits = list(csv.DictReader(f))
        except FileNotFoundError:
            continue
        names = {r["robot"] for r in tally}
        mine = [n for n in names if n.startswith("hadur117.mini.Deise")]
        if not mine:
            continue
        us = mine[0]
        for r in tally:
            if r["robot"] != us:
                rows[r["robot"]]["rounds"] += 1
        for s in shots:
            rows[s["target"]]["shots"] += 1
        for h in hits:
            if h["shooter"] == us:
                rows[h["victim"]]["hits"] += 1
                rows[h["victim"]]["dealt"] += float(h["damage"])
            elif h["victim"] == us:
                rows[h["shooter"]]["taken"] += float(h["damage"])
    if us is None:
        sys.exit("deise_rows: no harvest with Deise under %s" % args.run)

    table = []
    for name, r in rows.items():
        if name == us or not r["rounds"]:
            continue
        table.append((name, int(r["rounds"]), int(r["shots"]), int(r["hits"]),
                      r["hits"] / r["shots"] if r["shots"] else 0.0, r["dealt"], r["taken"],
                      r["taken"] / r["rounds"]))
    if args.tsv:
        with open(args.tsv, "w", newline="") as f:
            w = csv.writer(f, delimiter="\t")
            w.writerow(["robot", "rounds", "shots", "hits", "hitRate", "dealt", "taken", "takenPerRound"])
            for t in sorted(table):
                w.writerow([t[0], t[1], t[2], t[3], "%.4f" % t[4], "%.1f" % t[5], "%.1f" % t[6], "%.2f" % t[7]])

    shown = [t for t in table if t[2] >= args.min_shots]
    all_shots = sum(t[2] for t in table)
    all_hits = sum(t[3] for t in table)
    print("# Deise's per-opponent rows: %s (%d battles)" % (args.run, len(battles)))
    print()
    print("Overall hit rate %.1f%% over %d shots. %d opponents, %d with %d+ shots aimed at them."
          % (100.0 * all_hits / max(all_shots, 1), all_shots, len(table), len(shown), args.min_shots))
    for title, key, rev in (("Hardest to hit", 4, False), ("Easiest to hit", 4, True),
                            ("Hurt Deise most a round", 7, True)):
        print()
        print("## %s" % title)
        print()
        print("| Robot | Rounds | Shots | Hit rate | Damage to it | Its damage to Deise a round |")
        print("|---|---|---|---|---|---|")
        for t in sorted(shown, key=lambda t: t[key], reverse=rev)[:15]:
            print("| %s | %d | %d | %.1f%% | %.0f | %.2f |" % (t[0], t[1], t[2], 100 * t[4], t[5], t[7]))


if __name__ == "__main__":
    main()

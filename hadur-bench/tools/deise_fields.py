#!/usr/bin/env python3
"""Deise's MiniMelee field from LiteRumble's MiniMelee rankings (docs/deise.md, "Bench").

From a rankings TSV (rank, name, aps; data/rumble/parsed/) it writes hadur-bench/minimelee-field.txt:
every ranked robot, `name | minimelee-<rank> | jar`, the robots the live-shaped MiniMelee census
counts (saor_live.py --counted) and the fetch list. Saor's jar is ours: the card's prep copies it
into opponents/.

  python3 hadur-bench/tools/deise_fields.py data/rumble/parsed/2026-10-27T1540Z_minimeleerumble_rankings.tsv

Standard library only; the output is deterministic for a given TSV.
"""

import argparse
import csv
import os
import sys

HERE = os.path.dirname(os.path.dirname(os.path.abspath(__file__)))


def read(tsv):
    with open(tsv, newline="", encoding="utf-8") as f:
        return [dict(r, rank=int(r["rank"])) for r in csv.DictReader(f, delimiter="\t")]


def lines(robots, source):
    out = ["# The MiniMelee field: every robot on LiteRumble's MiniMelee rankings (%s, %d robots)."
           % (os.path.basename(source), len(robots)),
           "# Deise's opponents (DEISE-13): the robots its live-shaped census counts. Never run it as one",
           "# field. Role minimelee-<rank>. Made by tools/deise_fields.py."]
    for r in sorted(robots, key=lambda r: r["rank"]):
        out.append("%s | minimelee-%d | %s.jar" % (r["name"], r["rank"], r["name"].replace(" ", "_")))
    return "\n".join(out) + "\n"


def main(argv=None):
    p = argparse.ArgumentParser(description=__doc__, formatter_class=argparse.RawDescriptionHelpFormatter)
    p.add_argument("tsv")
    p.add_argument("--out", default=os.path.join(HERE, "minimelee-field.txt"))
    a = p.parse_args(argv)
    robots = read(a.tsv)
    with open(a.out, "w", encoding="utf-8", newline="\n") as f:
        f.write(lines(robots, a.tsv))
    print("%d robots -> %s" % (len(robots), a.out))
    return 0


if __name__ == "__main__":
    sys.exit(main())

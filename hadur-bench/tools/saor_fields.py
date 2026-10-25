#!/usr/bin/env python3
"""Saor's bench sets from LiteRumble's MicroMelee rankings (docs/saor.md, "Bench").

From a rankings TSV (rank, name, aps, survival, pairings; data/rumble/parsed/) it writes, in
hadur-bench/:

  micromelee-field.txt     every ranked robot, `name | micromelee-<rank> | jar`: the fetch list
                           (Leigh's PC pulls missing jars with ./fetch-opponents.sh) and the
                           census source; never run as one field
  micromelee-census/fNN.txt and micromelee-census.txt
                           the field shuffled (--seed) into fields of nine, so each battle is ten
                           robots with Saor, as MeleeRumble's are; the last field is topped up
                           from the first, so every robot is met at least once (SAOR-12)
  saor-gate9.txt           the fixed nine of the U3 gate: Figment, Wallaby and Capulet (the top
                           three) and six more spread down the table (SAOR-13, SAOR-14)

  python3 hadur-bench/tools/saor_fields.py data/rumble/parsed/2026-10-25T1340Z_micromeleerumble_rankings.tsv

Standard library only; the output is deterministic for a given TSV and seed.
"""

import argparse
import csv
import os
import random
import sys

HERE = os.path.dirname(os.path.dirname(os.path.abspath(__file__)))
FIELD = 9
# Ranks of the gate field beyond the top three: one from each band of the table.
GATE_RANKS = (1, 2, 3, 6, 12, 25, 50, 90, 130)


def read(tsv):
    with open(tsv, newline="", encoding="utf-8") as f:
        return [dict(r, rank=int(r["rank"])) for r in csv.DictReader(f, delimiter="\t")]


def jar(name):
    return name.replace(" ", "_") + ".jar"


def line(r):
    return "%s | micromelee-%d | %s" % (r["name"], r["rank"], jar(r["name"]))


def fields(robots, seed):
    order = list(robots)
    random.Random(seed).shuffle(order)
    out = [order[i:i + FIELD] for i in range(0, len(order), FIELD)]
    if len(out[-1]) < FIELD:
        names = {r["name"] for r in out[-1]}
        out[-1] += [r for r in out[0] if r["name"] not in names][:FIELD - len(out[-1])]
    return out


def write(path, text):
    os.makedirs(os.path.dirname(path), exist_ok=True)
    with open(path, "w", encoding="utf-8", newline="\n") as f:
        f.write(text)


def build(tsv, out, seed):
    robots = sorted(read(tsv), key=lambda r: r["rank"])
    src = os.path.basename(tsv)
    write(os.path.join(out, "micromelee-field.txt"), "\n".join([
        "# The MicroMelee field: every robot on LiteRumble's MicroMelee rankings (%s, %d robots)," % (src, len(robots)),
        "# all in the robot archive. Saor's opponents (SAOR-12). The fetch list and the census source:",
        "# never run it as one field, the rumble's battles are ten robots. Role micromelee-<rank>.",
        "# Jars: ./fetch-opponents.sh --set micromelee-field.txt. Made by tools/saor_fields.py.",
    ] + [line(r) for r in robots]) + "\n")
    fs = fields(robots, seed)
    suite = [
        "# Saor's MicroMelee census (SAOR-12): the %d robots of micromelee-field.txt (%s)" % (len(robots), src),
        "# shuffled (seed %d) into %d fields of nine, each fought with Saor at MeleeRumble settings;" % (seed, len(fs)),
        "# the last field is topped up from the first. Made by tools/saor_fields.py.",
    ]
    for i, f in enumerate(fs, 1):
        name = "f%02d.txt" % i
        write(os.path.join(out, "micromelee-census", name),
              "# MicroMelee census field %s (see micromelee-census.txt)\n" % name[:-4] + "\n".join(line(r) for r in f) + "\n")
        suite.append("F%02d | --set micromelee-census/%s --melee true --field 1000x1000" % (i, name))
    write(os.path.join(out, "micromelee-census.txt"), "\n".join(suite) + "\n")
    by_rank = {r["rank"]: r for r in robots}
    gate = [by_rank[k] for k in GATE_RANKS if k in by_rank]
    write(os.path.join(out, "saor-gate9.txt"), "\n".join([
        "# Saor's U3 gate field (SAOR-13, SAOR-14; docs/saor.md): nine fixed MicroMelee robots with Saor,",
        "# the top three and one from each band below, by rank in %s." % src,
        "# Run with --melee true --field 1000x1000 --rounds 35 --seeds 200. Made by tools/saor_fields.py.",
    ] + [line(r) for r in gate]) + "\n")
    return robots, fs, gate


def main(argv=None):
    p = argparse.ArgumentParser(description=__doc__, formatter_class=argparse.RawDescriptionHelpFormatter)
    p.add_argument("tsv")
    p.add_argument("--out", default=HERE)
    p.add_argument("--seed", type=int, default=117)
    a = p.parse_args(argv)
    robots, fs, gate = build(a.tsv, a.out, a.seed)
    print("%d robots, %d census fields, gate field of %d" % (len(robots), len(fs), len(gate)))
    return 0


if __name__ == "__main__":
    sys.exit(main())

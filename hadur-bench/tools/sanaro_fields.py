#!/usr/bin/env python3
"""Sanaro's NanoMelee census (docs/sanaro.md, "Bench"; SANARO-10, SANARO-11).

The design's own bench: ten NanoMelee robots a battle, the two leaders in every one. From
nanomelee-field.txt (tools/deise_fields.py --rumble nanomelee) it writes nanomelee-census/fNN.txt,
each field the 1st and 2nd robots plus seven of the rest (the bench adds Sanaro as the tenth),
and nanomelee-census.txt, the suite over them. The rest are shuffled with a fixed seed and dealt
seven a field, so every robot below the leaders plays in one field a pass; the last field is
topped up from the start of the deal. --passes N deals N times with fresh shuffles.

It also writes nanomelee-duel.txt: a suite of one field per leader, a one-on-one each (SANARO-12).

  python3 tools/sanaro_fields.py [--passes 1] [--seed 117]

Standard library only; the output is deterministic for a given field file, seed and pass count.
"""

import argparse
import os
import random
import sys

HERE = os.path.dirname(os.path.dirname(os.path.abspath(__file__)))
FIELD = os.path.join(HERE, "nanomelee-field.txt")
OPTS = "--melee true --field 1000x1000"


def set_lines(path):
    with open(path, encoding="utf-8") as f:
        return [l.rstrip("\n") for l in f if "|" in l and not l.startswith("#")]


def deal(rest, passes, seed, size=7):
    rng = random.Random(seed)
    fields = []
    for _ in range(passes):
        order = list(rest)
        rng.shuffle(order)
        for i in range(0, len(order), size):
            chunk = order[i:i + size]
            if len(chunk) < size:
                chunk += [r for r in order if r not in chunk][:size - len(chunk)]
            fields.append(chunk)
    return fields


def write(field_file, passes, seed, out_dir):
    lines = set_lines(field_file)
    leaders, rest = lines[:2], lines[2:]
    fields = deal(rest, passes, seed)
    census = os.path.join(out_dir, "nanomelee-census")
    os.makedirs(census, exist_ok=True)
    suite = ["# Sanaro's NanoMelee census (tools/sanaro_fields.py, %d passes, seed %d): the leaders %s"
             % (passes, seed, " and ".join(l.split("|")[0].strip() for l in leaders))]
    for n, chunk in enumerate(fields, 1):
        name = "f%02d.txt" % n
        with open(os.path.join(census, name), "w", encoding="utf-8", newline="\n") as f:
            f.write("# NanoMelee census field f%02d (see nanomelee-census.txt)\n" % n)
            for l in leaders + chunk:
                f.write(l + "\n")
        suite.append("F%02d | --set nanomelee-census/%s %s" % (n, name, OPTS))
    with open(os.path.join(out_dir, "nanomelee-census.txt"), "w", encoding="utf-8", newline="\n") as f:
        f.write("\n".join(suite) + "\n")
    duel = ["# Sanaro one on one with each NanoMelee leader (tools/sanaro_fields.py; SANARO-12)"]
    for n, l in enumerate(leaders, 1):
        name = "duel-%d.txt" % n
        with open(os.path.join(census, name), "w", encoding="utf-8", newline="\n") as f:
            f.write("# Sanaro against %s alone\n%s\n" % (l.split("|")[0].strip(), l))
        duel.append("D%d | --set nanomelee-census/%s %s" % (n, name, OPTS))
    with open(os.path.join(out_dir, "nanomelee-duel.txt"), "w", encoding="utf-8", newline="\n") as f:
        f.write("\n".join(duel) + "\n")
    return len(fields)


def main(argv=None):
    p = argparse.ArgumentParser(description=__doc__, formatter_class=argparse.RawDescriptionHelpFormatter)
    p.add_argument("--field", default=FIELD)
    p.add_argument("--passes", type=int, default=1)
    p.add_argument("--seed", type=int, default=117)
    p.add_argument("--out", default=HERE)
    a = p.parse_args(argv)
    n = write(a.field, a.passes, a.seed, a.out)
    print("%d census fields -> %s" % (n, os.path.join(a.out, "nanomelee-census.txt")))
    return 0


if __name__ == "__main__":
    sys.exit(main())

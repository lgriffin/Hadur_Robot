#!/usr/bin/env python3
"""Opponent panels for the top-5 plan's PC runs (docs/plan-top5.md, Stage 0 and Stage F).

  python3 top5_panels.py stratified CENSUS.txt OUT.txt [--per-band 40] [--seed 2026]
  python3 top5_panels.py stall CENSUS.txt OUT.txt ROUND0.tsv [ROUND0.tsv ...]
  python3 top5_panels.py halves CENSUS.txt OUT_PREFIX

stratified  a random draw of --per-band opponents from each band of a census set file (roles
            rank<N>-band<B>), kept in census order. Seeded, so the same command gives the same
            panel.
stall       every census opponent that had a start-up disable in any of the round0_skips.py
            TSVs given (round 0 has an engine disable line and no round-0 win: Hadur never
            acted). Battle dirs carry the opponent's slug (Opponent.slug: every run of
            characters outside [A-Za-z0-9.] becomes '_'), matched back to the census line.
halves      the census split into two interleaved halves by position (1st, 3rd, ... and 2nd,
            4th, ...; the census is in rank order), OUT_PREFIX-half1.txt and -half2.txt, for
            Stage 2's sequential halves (plan section 6.1, item 5).

Each writes a set file Bench reads (name | role | jar), with a comment saying how it was made.
Standard library only.
"""
import argparse
import csv
import random
import re
import sys
from collections import OrderedDict


def slug(name):
    return re.sub(r"[^A-Za-z0-9.]+", "_", name)


def read_census(path):
    """(name, role, line) for every opponent line, in file order."""
    out = []
    with open(path, encoding="utf-8") as f:
        for raw in f:
            line = raw.strip().lstrip("﻿")
            if not line or line.startswith("#"):
                continue
            parts = [p.strip() for p in line.split("|")]
            out.append((parts[0], parts[1] if len(parts) > 1 else "", line))
    return out


def band(role):
    m = re.search(r"band(\d+)", role)
    return int(m.group(1)) if m else None


def stratified(census, per_band, seed):
    by = OrderedDict()
    for i, (name, role, line) in enumerate(census):
        by.setdefault(band(role), []).append(i)
    rng = random.Random(seed)
    keep = set()
    for b, idx in by.items():
        keep.update(idx if len(idx) <= per_band else rng.sample(idx, per_band))
    return [census[i] for i in sorted(keep)]


def startup_disabled(rows):
    """Opponent slugs with a start-up disable in these round0_skips rows."""
    out = set()
    for r in rows:
        if "startup_disable" in r and r["startup_disable"] != "":
            hit = r["startup_disable"] == "1"
        else:  # TSVs written before the column existed
            hit = r.get("dis_r0") == "1" and r.get("r0_result") != "win"
        if hit:
            out.add(r["opponent"])
    return out


def stall(census, rows):
    slugs = startup_disabled(rows)
    panel = [c for c in census if slug(c[0]) in slugs]
    missing = slugs - {slug(c[0]) for c in panel}
    return panel, sorted(missing)


def write(path, header, panel):
    with open(path, "w", encoding="utf-8", newline="\n") as f:
        for h in header:
            f.write("# " + h + "\n")
        for _, _, line in panel:
            f.write(line + "\n")


def main(argv=None):
    ap = argparse.ArgumentParser(description=__doc__.split("\n")[0])
    ap.add_argument("mode", choices=("stratified", "stall", "halves"))
    ap.add_argument("census")
    ap.add_argument("out")
    ap.add_argument("round0", nargs="*")
    ap.add_argument("--per-band", type=int, default=40)
    ap.add_argument("--seed", type=int, default=2026)
    a = ap.parse_args(argv)
    census = read_census(a.census)
    if a.mode == "halves":
        for h in (1, 2):
            half = census[h - 1::2]
            path = f"{a.out}-half{h}.txt"
            write(path, [f"Stage 2 census half {h} of 2 (docs/plan-top5.md 6.1): every other line of {a.census} from line {h}.",
                         "Made by: python3 tools/top5_panels.py " + " ".join(argv or sys.argv[1:])], half)
            print(f"{len(half)} opponents -> {path}")
        return 0
    if a.mode == "stratified":
        panel = stratified(census, a.per_band, a.seed)
        counts = OrderedDict()
        for _, role, _ in panel:
            counts[band(role)] = counts.get(band(role), 0) + 1
        write(a.out, [f"Stage 0 panel (docs/plan-top5.md 6.2): {a.per_band} a band drawn from {a.census}, seed {a.seed}.",
                      "Made by: python3 tools/top5_panels.py " + " ".join(argv or sys.argv[1:]),
                      "Per band: " + ", ".join(f"{b}: {n}" for b, n in counts.items())], panel)
        print(f"{len(panel)} opponents -> {a.out}")
        return 0
    if not a.round0:
        ap.error("stall needs at least one round0_skips.py TSV")
    rows = []
    for p in a.round0:
        with open(p, newline="", encoding="utf-8") as f:
            rows.extend(csv.DictReader(f, delimiter="\t"))
    panel, missing = stall(census, rows)
    write(a.out, [f"Stage F stall panel (docs/plan-top5.md): opponents with a round-0 start-up disable in {', '.join(a.round0)}.",
                  f"{len(panel)} opponents" + (f"; {len(missing)} slugs not in {a.census}: {' '.join(missing)}" if missing else "")],
          panel)
    print(f"{len(panel)} opponents -> {a.out}" + (f" ({len(missing)} not in the census)" if missing else ""))
    return 0


if __name__ == "__main__":
    sys.exit(main())

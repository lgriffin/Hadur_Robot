#!/usr/bin/env python3
"""A Hadur-taught bullet-power table for Deise (pc-deise-pt1), as Sanaro's HS (PR #514).

Deise 0.4 fires max(0.1, min(3, log10(energy) * 325 / distance)). The arm keeps that line's shape
but reads the power from a string, POWER.charAt(((int) getEnergy() << 7) + (int) (distance / 16))
in fortieths of a power, so the table costs about what the formula did. This tool fills the table
from Hadur's shots on Deise's MiniMelee census (shots.csv, BENCH-155: own energy before the shot,
distance, power): cells are pooled into blocks of --own-step energy by --dist-step distance cells
(16 px each); a block with at least --min shots holds Hadur's modal power there, every other cell
keeps Deise's own formula, so the arm differs from 0.4 only where Hadur's shots agree.

It writes the arm as a flat class (deise-arms' `=FILE` form) from the shipped
deise/src/main/java/hadur117/mini/Deise.java, with the power line replaced and POWER added.

  python3 tools/deise_power.py 'work/deise-pt1/live-TEACH/*/battles/*/shots.csv' \
      --own-step 2 --dist-step 2 --min 20 --out work/deise-pt1/PTS.java
"""
import argparse
import collections
import math
import os
import sys

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
from distill import read_shots  # noqa: E402
from kitlab_prior_arm import java, unjava  # noqa: E402

ROWS = 256      # own energy 0..255
STRIDE = 128    # distance / 16: 0..127 covers 2,048 px, past the 1,414 px corner-to-corner
DIST = 16.0
SRC = os.path.join(os.path.dirname(os.path.abspath(__file__)), "..", "..", "deise", "src", "main",
                   "java", "hadur117", "mini", "Deise.java")
OLD = "Math.log10(getEnergy()) * 325 / distance));"
NEW = "POWER.charAt(((int) getEnergy() << 7) + (int) (distance / 16)) / 40.0));"


def formula(own, dcell):
    """Deise 0.4's power at this cell's centre, in fortieths, as the robot would clamp it."""
    d = (dcell + 0.5) * DIST
    p = max(0.1, min(3, math.log10(max(own, 1e-9)) * 325 / d)) if own >= 1 else 0.1
    return fortieths(p)


def fortieths(power):
    return max(4, min(120, int(round(power * 40))))


def table(shots, own_step, dist_step, minimum):
    blocks = collections.defaultdict(collections.Counter)
    for own, _enemy, dist, power in shots:
        r, c = int(own), int(dist / DIST)
        if r >= ROWS or c >= STRIDE:
            continue
        blocks[(r // own_step, c // dist_step)][fortieths(power)] += 1
    out, taught = [], 0
    for r in range(ROWS):
        for c in range(STRIDE):
            b = blocks.get((r // own_step, c // dist_step))
            if b and sum(b.values()) >= minimum:
                out.append(b.most_common(1)[0][0])
                taught += 1
            else:
                out.append(formula(r, c))
    return out, taught, len(blocks)


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument("shots", nargs="+")
    ap.add_argument("--own-step", type=int, default=2)
    ap.add_argument("--dist-step", type=int, default=2)
    ap.add_argument("--min", type=int, default=20)
    ap.add_argument("--src", default=SRC)
    ap.add_argument("--out", required=True)
    a = ap.parse_args()
    shots = list(read_shots(a.shots))
    if not shots:
        raise SystemExit("deise_power: no shots read")
    values, taught, seen = table(shots, a.own_step, a.dist_step, a.min)
    src = open(a.src).read()
    if src.count(OLD) != 1:
        raise SystemExit("deise_power: the power line was not found once in %s" % a.src)
    lit = java(values)
    assert unjava(lit) == values
    src = src.replace(OLD, NEW).replace(
        "public class Deise extends AdvancedRobot {",
        "public class Deise extends AdvancedRobot {\n\n    /** Hadur's power by own energy and distance / 16 px, in fortieths (tools/deise_power.py). */\n"
        "    static final String POWER = \"%s\";" % lit, 1)
    os.makedirs(os.path.dirname(a.out) or ".", exist_ok=True)
    open(a.out, "w").write(src)
    print("%s: %d shots, %d blocks seen, %d of %d cells from Hadur (blocks %d x %d, min %d), the rest Deise's formula"
          % (a.out, len(shots), seen, taught, len(values), a.own_step, a.dist_step, a.min))


if __name__ == "__main__":
    main()

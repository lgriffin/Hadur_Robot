#!/usr/bin/env python3
"""Scales every cell of a Sanaro power table (pc-sanaro-n09): the source's POWER string, cell by cell,
times --scale, rounded to the nearest fortieth and kept in 1..120. No code changes, so no bytes.

pc-sanaro-n08 (PR #575) found that the distance-indexed tables, which fire Hadur's power at every range,
cost Sanaro 6 to 8 points of survival. n09 asks the other way round: does weaker fire pay?

  python3 tools/sanaro_scale.py --scale 0.8 --src work/sanaro-n09/build/SanaroK80/SanaroK80.java

Robocode raises any power under 0.1 to 0.1 (BasicRobotProxy.setFireImpl), so a table cannot hold
fire. A cell's least shot is 0.1, and the 640 / d step's 0 past 640 px fires 0.1 too.
"""
import argparse
import os
import re
import sys

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
from distill import literal, write_constant  # noqa: E402

DECL = re.compile(r'static final String POWER = "((?:[^"\\]|\\.)*)";')


def cells(body):
    """The chars of a POWER literal written as octal escapes (table.py, distill.py)."""
    parts = body.split("\\")
    if parts[0] != "" or not all(re.fullmatch(r"[0-7]{1,3}", p) for p in parts[1:]):
        raise SystemExit("sanaro_scale: POWER is not all octal escapes")
    return [int(p, 8) for p in parts[1:]]


def scaled(values, scale):
    return [max(1, min(120, int(round(v * scale)))) for v in values]


def main(argv=None):
    ap = argparse.ArgumentParser(description=__doc__, formatter_class=argparse.RawDescriptionHelpFormatter)
    ap.add_argument("--scale", type=float, required=True)
    ap.add_argument("--src", required=True)
    a = ap.parse_args(argv)
    with open(a.src, encoding="utf-8") as f:
        m = DECL.search(f.read())
    if not m:
        raise SystemExit("sanaro_scale: %s has no POWER string" % a.src)
    old = cells(m.group(1))
    new = scaled(old, a.scale)
    write_constant(a.src, "POWER", literal(new))
    changed = sum(1 for x, y in zip(old, new) if x != y)
    print("POWER x %.2f: %d of %d cells changed -> %s" % (a.scale, changed, len(new), a.src))


if __name__ == "__main__":
    main()

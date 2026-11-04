#!/usr/bin/env python3
"""JayLexi per-robot bullet power (pc-jaylexi-pw, BENCH-184).

JayLexi 0.4 fires POWER.charAt(distance / 50): 3 under 150 px, else 2, at every robot. Its waves already fly at the
speed of the power fired (w.speed = getBulletSpeed(power)), so a power change needs no gun fix. On the diet's 1,470 B
(tools/jaylexi_diet.py, neutral) this build gives each recorded robot its own 21-char power row, read through the row
index the aim prior already computes, in tenths:

    POWER.charAt((int) (distance / 50))  ->  POWER.charAt(row / 2 + (int) (distance / 50)) / 10.0      1,480 B

row is BINS x (k + 1) for NAMES entry k and 0 for the rest, so row / 2 starts each robot's segment 23 or 24 chars
after the last; distance / 50 stays under 21. With every row the 0.4 table (30 x3, then 20) it plays as the diet.

  python3 tools/jaylexi_power2.py SRC OUT [--all P] [--pick PICK.tsv --field FIELD --arm-power hi=30 --arm-power lo=15 --written F]

--all P sets every row to P tenths at every distance (an arm that plays P against every robot); --pick writes the
picked robots' rows (robots without a NAMES entry share the field's row and are skipped, and a row
another FIELD robot's hash also finds is written only when that robot picked the same arm).
"""
import argparse
import os
import re
import sys

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import jaylexi_diet  # noqa: E402
from kitlab_prior_arm import java, unjava  # noqa: E402

SEG = 21
BASE = [30, 30, 30] + [20] * (SEG - 3)
CODE = [("POWER.charAt((int) (distance / 50))", "POWER.charAt(row / 2 + (int) (distance / 50)) / 10.0")]
BINS = 47


def java_hash(name):
    h = 0
    for ch in name:
        h = (31 * h + ord(ch)) & 0xFFFFFFFF
    return h


def table(src, name):
    m = re.compile(r'\b%s\s*=\s*"((?:[^"\\]|\\.)*)"' % name).search(src)
    if not m:
        sys.exit("no %s table" % name)
    return m


def start(k):
    """Where NAMES entry k's power row starts (k = -1 the field's)."""
    return BINS * (k + 1) // 2


def build(rows, n):
    out = [0] * (start(n - 1) + SEG)
    for k in range(-1, n):
        out[start(k):start(k) + SEG] = rows.get(k, BASE)
    return out


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument("src"); ap.add_argument("out")
    ap.add_argument("--all", type=int, help="every row this many tenths at every distance")
    ap.add_argument("--pick"); ap.add_argument("--written")
    ap.add_argument("--field", help="every robot JayLexi meets: a row two of them find is written only if both picked it")
    ap.add_argument("--arm-power", action="append", default=None)
    a = ap.parse_args()
    src = jaylexi_diet.apply(open(a.src).read(), jaylexi_diet.NEUTRAL, "diet")
    src = jaylexi_diet.apply(src, CODE, "power")
    names = unjava(table(src, "NAMES").group(1))
    n = len(names)
    rows = {}
    if a.all:
        rows = dict((k, [a.all] * SEG) for k in range(-1, n))
    if a.pick:
        powers = dict((k, int(v)) for k, v in (x.split("=") for x in (a.arm_power or ["hi=30", "lo=15"])))
        lines = [l for l in open(a.pick, encoding="utf-8") if l.strip() and not l.startswith("#")]
        on_row = {}
        for f in ([l.split("|")[0].strip() for l in open(a.field, encoding="utf-8") if l.strip() and not l.startswith("#")]
                  if a.field else []):
            on_row.setdefault(java_hash(f) & 0xFFFF, []).append(f)
        chosen = dict((x.split("\t")[0].strip(), x.split("\t")[1].strip()) for x in lines)
        written = []
        for l in lines:
            name, arm = [x.strip() for x in l.split("\t")[:2]]
            if arm not in powers:
                sys.exit("%s: arm %s has no power (--arm-power)" % (a.pick, arm))
            h = java_hash(name) & 0xFFFF
            if names.count(h) != 1:
                # No row of its own (it plays the field's), or a row another robot's hash also finds.
                print("left alone (no NAMES row of its own): %s" % name)
                continue
            if any(chosen.get(o) != arm for o in on_row.get(h, [])):
                print("left alone (row shared with a robot that picked otherwise): %s" % name)
                continue
            k = names.index(h)
            rows[k] = [powers[arm]] * SEG
            written.append(l)
        if a.written:
            open(a.written, "w", encoding="utf-8").writelines(written)
        print("%d picks written, %d left alone" % (len(written), len(lines) - len(written)))
    m = table(src, "POWER")
    src = src[:m.start(1)] + java(build(rows, n)) + src[m.end(1):]
    open(a.out, "w").write(src)
    print("%s: %d robot rows" % (a.out, n))


if __name__ == "__main__":
    main()

#!/usr/bin/env python3
"""Writes Sanaro's bullet-power table into Sanaro.java (docs/sanaro.md, "Bullet power").

The table is one string constant, which costs Sanaro two bytes of code however long it is
(SANARO-8). Cell (own energy E, enemy energy e) sits at E * 128 + e, both truncated to ints, for
own energy 0..400 and enemy energy 0..400 (SANARO-2: never past the end). An enemy at 128 or
more reads energy // 128 rows on at its energy % 128 and draws that remainder's kill shot, a limit
of the 128 stride. A cell holds the power at 321-640 px in fortieths:
the lesser of Sanaro's base power for its own energy and the least power that kills the enemy
(worked out for one more than its truncated energy).
SanaroTableTest holds the constant to this formula.

  python3 sanaro/table.py            (rewrites sanaro/src/main/java/hadur117/nano/Sanaro.java)

The bench's power arms (hadur-bench/sanaro-arms/arms.txt) write a variant table into an arm's
source with the options below; the defaults are the shipped table.

  python3 sanaro/table.py --floor 0 --div 7 --src work/.../SanaroQ7.java

Standard library only; the output is deterministic.
"""

import argparse
import math
import os
import re

STRIDE = 128
TOP = 400
SRC = os.path.join(os.path.dirname(os.path.abspath(__file__)), "src/main/java/hadur117/nano/Sanaro.java")


FLOOR, DIV, CAP, TOP_AT, TOP_POWER = 0.1, 16.0, 2.5, 120, 3.0


def base(energy, floor=FLOOR, div=DIV, cap=CAP, top_at=TOP_AT, top_power=TOP_POWER):
    """Sanaro's power for its own energy: 0.1 plus a sixteenth of its energy, at most 2.5, and 3.0
    from 120 energy, when it is winning and has the energy to spend."""
    return top_power if energy >= top_at else min(cap, floor + energy / div)


def kill(enemy):
    """The least power whose damage reaches enemy + 1, so it kills any energy the truncated int
    stands for (enemy up to enemy + 1), at least 0.1. Damage is 4p up to power 1 and 6p - 2 above it."""
    e = enemy + 1
    p = e / 4.0 if e <= 4 else (e + 2) / 6.0
    return max(0.1, p)


def cell(i, **curve):
    p = min(base(i // STRIDE, **curve), kill(i % STRIDE))
    return max(1, min(120, int(math.ceil(p * 40 - 1e-9))))


def literal(**curve):
    # Octal escapes: a \\u escape is read before the lexer, so \\u0022 would end the string.
    return "".join("\\%o" % cell(i, **curve) for i in range(TOP * STRIDE + TOP + 1))


def main(argv=None):
    p = argparse.ArgumentParser(description=__doc__, formatter_class=argparse.RawDescriptionHelpFormatter)
    p.add_argument("--floor", type=float, default=FLOOR, help="base power at no energy")
    p.add_argument("--div", type=float, default=DIV, help="energy per unit of base power")
    p.add_argument("--cap", type=float, default=CAP, help="the most base power below --top-at")
    p.add_argument("--top-at", type=int, default=TOP_AT, help="own energy from which --top-power fires")
    p.add_argument("--top-power", type=float, default=TOP_POWER)
    p.add_argument("--src", default=SRC, help="the source file whose POWER constant is rewritten")
    a = p.parse_args(argv)
    curve = dict(floor=a.floor, div=a.div, cap=a.cap, top_at=a.top_at, top_power=a.top_power)
    with open(a.src, encoding="utf-8") as f:
        src = f.read()
    out, n = re.subn(r'(static final String POWER = ")[^"]*(";)', lambda m: m.group(1) + literal(**curve) + m.group(2), src)
    assert n == 1, "POWER not found"
    with open(a.src, "w", encoding="utf-8", newline="\n") as f:
        f.write(out)
    print("POWER: %d cells -> %s" % (TOP * STRIDE + TOP + 1, a.src))


if __name__ == "__main__":
    main()

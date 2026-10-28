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

Standard library only; the output is deterministic.
"""

import math
import os
import re

STRIDE = 128
TOP = 400
SRC = os.path.join(os.path.dirname(os.path.abspath(__file__)), "src/main/java/hadur117/nano/Sanaro.java")


def base(energy):
    """Sanaro's power for its own energy: 0.1 plus a sixteenth of its energy, at most 2.5, and 3.0
    from 120 energy, when it is winning and has the energy to spend."""
    return 3.0 if energy >= 120 else min(2.5, 0.1 + energy / 16.0)


def kill(enemy):
    """The least power whose damage reaches enemy + 1, so it kills any energy the truncated int
    stands for (enemy up to enemy + 1), at least 0.1. Damage is 4p up to power 1 and 6p - 2 above it."""
    e = enemy + 1
    p = e / 4.0 if e <= 4 else (e + 2) / 6.0
    return max(0.1, p)


def cell(i):
    p = min(base(i // STRIDE), kill(i % STRIDE))
    return max(1, min(120, int(math.ceil(p * 40 - 1e-9))))


def literal():
    # Octal escapes: a \\u escape is read before the lexer, so \\u0022 would end the string.
    return "".join("\\%o" % cell(i) for i in range(TOP * STRIDE + TOP + 1))


def main():
    with open(SRC, encoding="utf-8") as f:
        src = f.read()
    out, n = re.subn(r'(static final String POWER = ")[^"]*(";)', lambda m: m.group(1) + literal() + m.group(2), src)
    assert n == 1, "POWER not found"
    with open(SRC, "w", encoding="utf-8", newline="\n") as f:
        f.write(out)
    print("POWER: %d cells -> %s" % (TOP * STRIDE + TOP + 1, SRC))


if __name__ == "__main__":
    main()

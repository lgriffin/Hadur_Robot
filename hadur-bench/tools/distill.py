#!/usr/bin/env python3
"""Distils Hadur's decisions into the string tables a nano or micro can carry (BENCH-156).

A nano cannot learn in a battle, but it can carry what Hadur already learned: a lookup table costs
two bytes of code however long it is, and the index shapes the small robots already pay for
(own energy, enemy energy, distance band, robots left, the opponent's name hash) are the only
state they can see. This tool turns the bench's records of Hadur's choices into those tables,
so Hadur is the teacher and the small robots memorise its answers.

Two subcommands:

  power   Reads the melee bench's shots.csv files (BENCH-155, one row per Hadur shot: round, turn,
          robots alive, own energy before the shot, the target, its energy and distance, the power)
          and writes a Sanaro-shaped power table (sanaro/table.py: cell E * 128 + e in fortieths of a
          power, the power at 321-640 px, times BAND / distance in the robot). Each shot is read
          back to the 321-640 band by dividing its power by Sanaro's integer step for its distance
          (640 // distance; shots beyond 640 px, step 0, are left out). A cell with at least --min
          shots holds the modal power Hadur chose there; a cell with fewer borrows the nearest filled
          cell on its row within --reach of enemy energy; the rest fall back to table.py's formula, so
          the table is never thinner than the shipped one. --own-step and --enemy-step pool shots by
          blocks of energy (a 4 x 4 block has sixteen cells' shots to agree on one power), the knob
          against a thin teach run; borrowing then goes by whole blocks. --alive keeps only shots fired with that
          many fighters or fewer alive, so a 1v1 row block can be distilled from the endgame alone.

            python3 distill.py power work/pc-melee-*/battle-*/shots.csv --src path/to/Robot.java
            python3 distill.py power ... --report          (prints coverage, writes nothing)

  hash    Finds the smallest power-of-two mask under which the Java String.hashCode() of every name
          in a participants file (RoboRumble "name version,url" lines, or bare names) lands on its
          own cell, and writes a MODES constant of that length: one char per robot from a
          name<TAB>char TSV (--modes), --default for robots not listed. In the robot that is
          MODES.charAt(e.getName().hashCode() & MASK), about 17 bytes, the nano form of Hadur's
          per-opponent profile. --protect keeps only the listed names free of collisions and lets the
          rest share cells (the default char), when the whole field will not fit a mask the string
          can afford (TOP mask bits are capped by --max-bits).

            python3 distill.py hash participants.txt --modes modes.tsv --src path/to/Robot.java
            python3 distill.py hash participants.txt --report

Standard library only; the output is deterministic.
"""

import argparse
import collections
import csv
import glob
import math
import os
import re
import sys

sys.path.insert(0, os.path.join(os.path.dirname(os.path.abspath(__file__)), "..", "..", "sanaro"))
import table  # noqa: E402

STRIDE = table.STRIDE
TOP = table.TOP
BAND = 640
CELLS = TOP * STRIDE + TOP + 1


# ---------------------------------------------------------------- power

def read_shots(paths, alive=None):
    """Yields (own energy, enemy energy, distance, power) from shots.csv files; globs allowed."""
    for pattern in paths:
        for path in sorted(glob.glob(pattern)) or [pattern]:
            with open(path, newline="", encoding="utf-8") as f:
                for row in csv.DictReader(f):
                    if alive is not None and int(row["alive"]) > alive:
                        continue
                    yield (float(row["ownEnergy"]), float(row["targetEnergy"]), float(row["distance"]),
                           float(row["power"]))


def band_power(distance, power):
    """The power read back to the 321-640 px band, or None beyond the band's reach."""
    step = BAND // max(1, int(distance))
    return None if step == 0 else power / step


def fortieths(power):
    return max(1, min(120, int(math.ceil(power * 40 - 1e-9))))


def block(own, enemy, own_step=1, enemy_step=1):
    """The cell a shot (or a table cell) pools into: energies quantised to the steps, then the
    robot's own index, where an enemy at 128 or more lands rows on, as table.py describes."""
    return (int(own) // own_step * own_step) * STRIDE + int(enemy) // enemy_step * enemy_step


def observed(shots, own_step=1, enemy_step=1):
    """Block index -> Counter of fortieths, from shots within the table's energy range."""
    cells = collections.defaultdict(collections.Counter)
    for own, enemy, distance, power in shots:
        p = band_power(distance, power)
        if p is None or own < 0 or enemy < 0:
            continue
        i = block(own, enemy, own_step, enemy_step)
        if i < CELLS:
            cells[i][fortieths(p)] += 1
    return cells


def mode(counter):
    """The most chosen value; ties go to the higher power, which errs toward Hadur's finishing shots."""
    best = max(counter.values())
    return max(v for v, n in counter.items() if n == best)


def distil(cells, minimum=3, reach=4, own_step=1, enemy_step=1, **curve):
    """A full table: data where it is dense, the nearest data on the row where it is near, the formula elsewhere.
    With steps above 1 a cell reads its block's data and borrows by whole blocks along the row.
    Returns (list of fortieths, dict of how each cell was filled: 'data', 'row', 'formula')."""
    filled = {i: mode(c) for i, c in cells.items() if sum(c.values()) >= minimum}
    out, how = [], collections.Counter()
    for i in range(CELLS):
        own, enemy = divmod(i, STRIDE)
        home = block(own, enemy, own_step, enemy_step)
        if home in filled:
            out.append(filled[home])
            how["data"] += 1
            continue
        borrowed = None
        for d in range(1, reach + 1):
            for e in (enemy - d * enemy_step, enemy + d * enemy_step):
                j = block(own, e, own_step, enemy_step)
                if 0 <= e < STRIDE and j in filled and j < CELLS:
                    borrowed = filled[j]
                    break
            if borrowed is not None:
                break
        if borrowed is not None:
            out.append(borrowed)
            how["row"] += 1
        else:
            out.append(table.cell(i, **curve))
            how["formula"] += 1
    return out, how


def literal(values):
    # Octal escapes, as table.py: a \u escape is read before the lexer and could end the string.
    return "".join("\\%o" % v for v in values)


def write_constant(src, name, value, mask=None):
    """Rewrites `static final String <name> = "...";` and, when mask is given and the source
    declares `static final int MASK = <n>;`, that too, so the string and its mask never drift."""
    with open(src, encoding="utf-8") as f:
        text = f.read()
    out, n = re.subn(r'(static final String %s = ")[^"]*(";)' % name,
                     lambda m: m.group(1) + value + m.group(2), text)
    if n != 1:
        raise SystemExit("%s: one 'static final String %s' expected, found %d" % (src, name, n))
    if mask is not None:
        out, m = re.subn(r'(static final int MASK = )\d+(;)', lambda x: x.group(1) + str(mask) + x.group(2), out)
        if m == 0:
            print("warning: %s declares no 'static final int MASK'; set it to %d by hand" % (src, mask))
    with open(src, "w", encoding="utf-8", newline="\n") as f:
        f.write(out)


def power_main(a):
    shots = list(read_shots(a.shots, a.alive))
    cells = observed(shots, a.own_step, a.enemy_step)
    values, how = distil(cells, a.min, a.reach, a.own_step, a.enemy_step)
    print("shots: %d read, %d in band, %d cells seen, %d filled from data, %d from the row, %d from the formula"
          % (len(shots), sum(sum(c.values()) for c in cells.values()), len(cells), how["data"], how["row"],
             how["formula"]))
    if a.report:
        rows = collections.Counter(i // STRIDE for i, c in cells.items() if sum(c.values()) >= a.min)
        for own in sorted(rows):
            print("  own energy %3d: %3d data blocks" % (own, rows[own]))
        return
    write_constant(a.src, a.name, literal(values))
    print("%s: %d cells -> %s" % (a.name, CELLS, a.src))


# ---------------------------------------------------------------- hash

def java_hash(s):
    """String.hashCode(): over UTF-16 code units, so a name outside the BMP hashes as Java does."""
    h = 0
    units = s.encode("utf-16-le")
    for i in range(0, len(units), 2):
        h = (31 * h + (units[i] | units[i + 1] << 8)) & 0xFFFFFFFF
    return h - (1 << 32) if h >= 1 << 31 else h


def read_names(path):
    names = []
    with open(path, encoding="utf-8") as f:
        for line in f:
            line = line.strip()
            if not line or line.startswith("#"):
                continue
            names.append(line.split(",", 1)[0].strip())
    return names


def read_modes(path):
    modes = {}
    if path is None:
        return modes
    with open(path, encoding="utf-8") as f:
        for line in f:
            line = line.rstrip("\n")
            if not line or line.startswith("#"):
                continue
            name, char = line.split("\t", 1)
            if len(char) != 1:
                raise SystemExit("%s: one char per robot, got %r for %s" % (path, char, name))
            modes[name.strip()] = char
    return modes


def find_mask(names, protect=None, min_bits=4, max_bits=14):
    """The smallest 2^k - 1 (min_bits <= k <= max_bits) under which the protected names (all names
    by default) land on distinct cells; None when none does."""
    keep = names if protect is None else [n for n in names if n in protect]
    for bits in range(min_bits, max_bits + 1):
        mask = (1 << bits) - 1
        cells = [java_hash(n) & mask for n in keep]
        if len(set(cells)) == len(cells):
            return mask
    return None


def modes_string(names, modes, mask, default):
    """One char per cell; a cell two unprotected robots share takes the first in file order."""
    out = [default] * (mask + 1)
    taken = set()
    for n in names:
        cell = java_hash(n) & mask
        if cell in taken:
            continue
        if n in modes:
            out[cell] = modes[n]
            taken.add(cell)
    return "".join(out)


def hash_main(a):
    names = read_names(a.participants)
    modes = read_modes(a.modes)
    unknown = sorted(set(modes) - set(names))
    if unknown:
        print("warning: %d mode names are not in the participants file: %s" % (len(unknown), ", ".join(unknown[:5])))
    protect = set(modes) if a.protect else None
    mask = find_mask(names, protect, a.min_bits, a.max_bits)
    if mask is None:
        raise SystemExit("no mask up to %d bits separates the %s names; try --protect or more --max-bits"
                         % (a.max_bits, "listed" if a.protect else "%d" % len(names)))
    s = modes_string(names, modes, mask, a.default)
    print("mask 0x%x (%d cells) separates %d names; %d cells set from %s"
          % (mask, mask + 1, len(names) if protect is None else len(protect), sum(c != a.default for c in s),
             a.modes or "nothing"))
    if a.report:
        for n in names:
            print("  %5d  %s  %s" % (java_hash(n) & mask, modes.get(n, a.default), n))
        return
    write_constant(a.src, a.name, s.replace("\\", "\\\\").replace('"', '\\"'), mask)
    print("%s: %d chars, MASK = %d -> %s" % (a.name, len(s), mask, a.src))


# ---------------------------------------------------------------- cli

def main(argv=None):
    p = argparse.ArgumentParser(description=__doc__, formatter_class=argparse.RawDescriptionHelpFormatter)
    sub = p.add_subparsers(dest="cmd", required=True)

    pw = sub.add_parser("power", help="a Sanaro-shaped bullet-power table from shots.csv files")
    pw.add_argument("shots", nargs="+", help="shots.csv paths or globs")
    pw.add_argument("--src", help="the robot source whose constant is rewritten")
    pw.add_argument("--name", default="POWER", help="the constant's name (default POWER)")
    pw.add_argument("--min", type=int, default=3, help="shots a cell needs before its own mode is used")
    pw.add_argument("--reach", type=int, default=4, help="how far along a row (in blocks) a thin cell borrows")
    pw.add_argument("--own-step", type=int, default=1, help="pool shots by this many own-energy units")
    pw.add_argument("--enemy-step", type=int, default=1, help="pool shots by this many enemy-energy units")
    pw.add_argument("--alive", type=int, help="keep shots fired with at most this many fighters alive")
    pw.add_argument("--report", action="store_true", help="print coverage, write nothing")
    pw.set_defaults(run=power_main)

    hs = sub.add_parser("hash", help="a per-opponent MODES string keyed by name hash")
    hs.add_argument("participants", help="RoboRumble participants file or one name per line")
    hs.add_argument("--modes", help="name<TAB>char TSV of each robot's mode")
    hs.add_argument("--default", default="0", help="the char for robots with no mode (default 0)")
    hs.add_argument("--protect", action="store_true", help="only the --modes names need their own cell")
    hs.add_argument("--min-bits", type=int, default=4)
    hs.add_argument("--max-bits", type=int, default=14)
    hs.add_argument("--src", help="the robot source whose constant is rewritten")
    hs.add_argument("--name", default="MODES")
    hs.add_argument("--report", action="store_true", help="print each robot's cell, write nothing")
    hs.set_defaults(run=hash_main)

    a = p.parse_args(argv)
    if not a.report and not a.src:
        p.error("--src is needed unless --report")
    a.run(a)


if __name__ == "__main__":
    main()

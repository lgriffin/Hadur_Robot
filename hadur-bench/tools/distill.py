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

  hash    Finds the smallest power-of-two mask, and the unsigned shift, under which no two names in
          a participants file (RoboRumble "name version,url" lines, or bare names) that need
          different chars share a cell of the Java String.hashCode(), and writes a MODES constant of
          that length: one char per robot from a name<TAB>char TSV (--modes), --default for robots
          not listed. In the robot that is MODES.charAt(e.getName().hashCode() >>> SHIFT & MASK),
          about 17 bytes (3 fewer when SHIFT is 0), the nano form of Hadur's per-opponent profile.
          Two robots with the same char may share a cell, which is what lets 515 names fit 16,384
          cells; --strict wants every name alone (a table of per-robot values, not modes).
          --protect counts only the listed names. --max-bits 15 keeps the string under Java's
          65,535-byte constant limit.

  field   Writes a kitlab set file of a whole rumble from its participants (weight 1 each, so the
          flat mean is the APS), leaving out --skip prefixes and, with --present DIR, robots whose
          jar did not download.

  oracle  The robot as its own teacher. Reads kitlab runs of several arms on one set (--arm
          CHAR=RUN_DIR) and, per opponent, keeps the --default arm unless another arm's paired gain
          over it, seed by seed, clears --z standard errors and --min-gain points; writes the chosen
          char per robot as a modes TSV for hash. The printed total gain is in-sample, an upper
          bound: read the built robot on fresh seeds.

  tiers   Reads the bench's cold census TSVs (data/bench/*_cold.tsv, Hadur builds, rows that ran)
          and writes a modes TSV for hash: each robot's median hit rate on Hadur as one char, '2' a
          rammer (--ram-at), '1' a gun worth moving at random against from round 1 (--random-at),
          '0' a gun stop-and-go beats. Names come from --names (the rumble's current names, with
          versions); the census is matched without the version, so a rival's new release keeps its
          reading until Hadur has fought it.

            python3 distill.py tiers ../data/bench/*_cold.tsv --names kitlab/micro-participants.txt --out kitlab/micro-modes.tsv

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
import statistics
import sys

sys.path.insert(0, os.path.join(os.path.dirname(os.path.abspath(__file__)), "..", "..", "sanaro"))
import table  # noqa: E402

STRIDE = table.STRIDE
TOP = table.TOP
BAND = 640
CELLS = TOP * STRIDE + TOP + 1


# ---------------------------------------------------------------- power

def read_shots(paths, alive=None):
    """Yields (own energy, enemy energy, distance, power) from shots.csv files; globs allowed.
    A pattern that matches nothing is an error: a table silently built from no shots would be the
    shipped one, and the arm would measure nothing."""
    for pattern in paths:
        files = sorted(glob.glob(pattern)) or ([pattern] if os.path.exists(pattern) else [])
        if not files:
            raise SystemExit("distill: no shots.csv matches %s" % pattern)
        for path in files:
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
    """The cell a shot (or a table cell) pools into. The robot's own index comes first (an enemy
    at 128 or more lands rows on, as table.py describes), then that index's row and column are
    quantised to the steps, so a shot and the cells that read it always agree on the block."""
    row, col = divmod(int(own) * STRIDE + int(enemy), STRIDE)
    return (row // own_step * own_step) * STRIDE + col // enemy_step * enemy_step


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
        home = block(own, enemy, own_step, enemy_step)  # own * STRIDE + enemy == i
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


def write_constant(src, name, value, mask=None, shift=None):
    """Rewrites `static final String <name> = "...";` and, when mask (and shift) are given and the
    source declares `static final int MASK = <n>;` (`SHIFT = <n>;`), those too, so the string and
    its key never drift."""
    with open(src, encoding="utf-8") as f:
        text = f.read()
    out, n = re.subn(r'(static final String %s = ")[^"]*(";)' % name,
                     lambda m: m.group(1) + value + m.group(2), text)
    if n != 1:
        raise SystemExit("%s: one 'static final String %s' expected, found %d" % (src, name, n))
    if mask is not None:
        # `static final int MASK = 1;` or `..., MASK = 1, SHIFT = 0;`: the declaration's shape is the arm's.
        out, m = re.subn(r'(\bMASK = )\d+\b', lambda x: x.group(1) + str(mask), out)
        if m == 0:
            print("warning: %s declares no 'MASK = <n>'; set it to %d by hand" % (src, mask))
    if shift is not None:
        out, m = re.subn(r'(\bSHIFT = )\d+\b', lambda x: x.group(1) + str(shift), out)
        if m == 0 and shift:
            print("warning: %s declares no 'SHIFT = <n>'; the lookup needs >>> %d" % (src, shift))
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


def cell(name, mask, shift=0):
    """The robot's cell: (getName().hashCode() >>> shift) & mask, in Java's int arithmetic."""
    return ((java_hash(name) & 0xFFFFFFFF) >> shift) & mask


def conflicts(names, modes, default, mask, shift):
    """Robots whose cell another robot with a different char already holds."""
    held, bad = {}, []
    for n in names:
        c = modes.get(n, default)
        k = cell(n, mask, shift)
        if held.setdefault(k, c) != c:
            bad.append(n)
    return bad


def find_key(names, modes, default, min_bits=4, max_bits=15, strict=False, protect=None, max_conflicts=0,
             shifts=None):
    """The smallest 2^k - 1 (min_bits <= k <= max_bits) and the unsigned shift under which no two
    robots that need different chars share a cell (two robots with the same char may: the lookup
    cannot tell them apart and does not need to). strict=True needs every name on its own cell;
    protect limits the names that count to those. Returns (mask, shift) or None.

    An odd multiplier never helps here: (h * m) & mask is a permutation of h & mask. A shift does,
    because it brings the hash's high bits, which depend on the whole name, into the masked low
    ones; it costs the robot 3 bytes (bipush, iushr) and is 0 when the plain hash already serves."""
    keep = names if protect is None else [n for n in names if n in protect]
    for bits in range(min_bits, max_bits + 1):
        mask = (1 << bits) - 1
        for shift in (range(0, 33 - bits) if shifts is None else shifts):
            if strict:
                cells = [cell(n, mask, shift) for n in keep]
                ok = len(set(cells)) == len(cells)
            else:
                ok = len(conflicts(keep, modes, default, mask, shift)) <= max_conflicts
            if ok:
                return mask, shift
    return None


def find_mask(names, protect=None, min_bits=4, max_bits=14):
    """Every name on its own cell, plain hash: (mask) or None. Kept for callers of the first cut."""
    key = find_key(names, {}, "0", min_bits, max_bits, strict=True, protect=protect, shifts=[0])
    return key[0] if key else None


def modes_string(names, modes, mask, default, shift=0, resolve="first"):
    """One char per cell. A cell two robots share takes the first in file order, or with
    resolve="high" the higher char, or with resolve="default" the default (the cautious choice
    for whichever char means "as before", when a conflict was allowed)."""
    out = [default] * (mask + 1)
    taken = set()
    for n in names:
        k = cell(n, mask, shift)
        c = modes.get(n)
        if c is None:
            continue
        if k in taken:
            if resolve == "high":
                out[k] = max(out[k], c)
            elif resolve == "default" and out[k] != c:
                out[k] = default
            continue
        out[k] = c
        taken.add(k)
    return "".join(out)


def hash_main(a):
    names = read_names(a.participants)
    modes = read_modes(a.modes)
    unknown = sorted(set(modes) - set(names))
    if unknown:
        print("warning: %d mode names are not in the participants file: %s" % (len(unknown), ", ".join(unknown[:5])))
    protect = set(modes) if a.protect else None
    if a.shift is not None and not 0 <= a.shift <= 31:
        # Java masks a shift distance to five bits: >>> 32 is >>> 0, and the table would not match.
        raise SystemExit("--shift must be 0 to 31 (Java's >>> keeps five bits of the distance)")
    key = find_key(names, modes, a.default, a.min_bits, a.max_bits, a.strict, protect, a.max_conflicts,
                   None if a.shift is None else [a.shift])
    if key is None:
        raise SystemExit("no mask up to %d bits and shift separates the names; try --protect, no --strict, "
                         "--max-conflicts or more --max-bits" % a.max_bits)
    mask, shift = key
    bad = conflicts(names if protect is None else [n for n in names if n in protect], modes, a.default, mask, shift)
    if bad:
        print("%d conflicts resolved by %s: %s" % (len(bad), a.resolve, ", ".join(bad)))
    s = modes_string(names, modes, mask, a.default, shift, a.resolve)
    print("mask 0x%x (%d cells), shift %d: %d names, %d cells set from %s, %d chars not the default"
          % (mask, mask + 1, shift, len(names), sum(c != a.default for c in s), a.modes or "nothing",
             sum(1 for n in names if modes.get(n, a.default) != a.default)))
    if a.report:
        for n in names:
            print("  %5d  %s  %s" % (cell(n, mask, shift), modes.get(n, a.default), n))
        return
    if a.raw:
        # Digits become the chars 0..9 themselves (octal escapes), so the robot reads the value with no
        # '0' subtraction: charAt is the number. Two bytes of code.
        if any(not c.isdigit() for c in s):
            raise SystemExit("--raw needs every char to be a digit")
        value = "".join("\\%o" % int(c) for c in s)
    else:
        value = s.replace("\\", "\\\\").replace('"', '\\"')
    # A class-file constant is at most 65,535 bytes of modified UTF-8, where NUL takes two.
    size = sum(2 if (a.raw and c == "0") or (not a.raw and c == "\0") else 1 for c in s)
    if size > 65535:
        raise SystemExit("MODES would be %d bytes as a class-file constant (limit 65,535): lower --max-bits "
                         "or pick a --default that is not 0" % size)
    write_constant(a.src, a.name, value, mask, shift)
    print("%s: %d chars%s, MASK = %d, SHIFT = %d -> %s" % (a.name, len(s), " (raw digits)" if a.raw else "", mask, shift, a.src))


# ---------------------------------------------------------------- tiers

def read_census(paths, build_prefix="hadur"):
    """Opponent key (name without its version) -> list of their hit rate on Hadur, from the bench's
    cold census TSVs (data/bench/*_cold.tsv): rows the teacher won cleanly (ok) in a Hadur build."""
    rates = collections.defaultdict(list)
    for pattern in paths:
        files = sorted(glob.glob(pattern)) or ([pattern] if os.path.exists(pattern) else [])
        if not files:
            raise SystemExit("distill: no census file matches %s" % pattern)
        for path in files:
            with open(path, newline="", encoding="utf-8") as f:
                r = csv.DictReader(f, delimiter="\t")
                if not r.fieldnames or "theirHitRate" not in r.fieldnames or "opponent" not in r.fieldnames:
                    continue
                for row in r:
                    if row.get("ok") != "true" or not (row.get("build") or "").startswith(build_prefix):
                        continue
                    try:
                        h = float(row["theirHitRate"])
                    except ValueError:
                        continue
                    if h == h:
                        rates[key_of(row["opponent"])].append(h)
    return rates


def key_of(name):
    """A rumble name without its version: 'sheldor.micro.Epeeist 3.7' -> 'sheldor.micro.Epeeist'."""
    return name.rsplit(" ", 1)[0] if " " in name else name


def tier_char(rate, random_at, ram_at):
    """Hadur's reading of a gun as one char: '2' a rammer (point-blank hits), '1' a gun worth
    moving at random against from round 1, '0' a gun stop-and-go beats."""
    if rate >= ram_at:
        return "2"
    return "1" if rate >= random_at else "0"


def tiers_main(a):
    rates = read_census(a.census)
    names = read_names(a.names)
    rows, missing = [], []
    for n in names:
        k = key_of(n)
        if k not in rates:
            missing.append(n)
            continue
        r = statistics.median(rates[k])
        rows.append((n, r, len(rates[k]), tier_char(r, a.random_at, a.ram_at)))
    chars = collections.Counter(c for _, _, _, c in rows)
    print("%d names, %d with Hadur census data (%d battles), %d missing; chars %s"
          % (len(names), len(rows), sum(n for _, _, n, _ in rows), len(missing), dict(sorted(chars.items()))))
    if a.report:
        for n, r, k, c in sorted(rows, key=lambda t: -t[1]):
            print("  %s  %.3f  %4d  %s" % (c, r, k, n))
        for n in missing:
            print("  ?  -      -  %s" % n)
        return
    with open(a.out, "w", encoding="utf-8", newline="\n") as f:
        f.write("# tools/distill.py tiers: their hit rate on Hadur over %d census battles; '2' >= %.3f (rammer), "
                "'1' >= %.3f (random from round 1), '0' otherwise\n" % (sum(n for _, _, n, _ in rows), a.ram_at, a.random_at))
        for n, r, k, c in rows:
            f.write("%s\t%s\n" % (n, c))
    print("%d modes -> %s" % (len(rows), a.out))


# ---------------------------------------------------------------- field / oracle

def jar_of(name):
    """The archive's jar for a rumble name: 'kc.micro.Thorn 1.252' -> 'kc.micro.Thorn_1.252.jar'."""
    return name.replace(" ", "_") + ".jar"


def field_main(a):
    names = [n for n in read_names(a.participants) if not any(n.startswith(p) for p in a.skip)]
    kept, gone = [], []
    for n in names:
        if a.present and not os.path.exists(os.path.join(a.present, jar_of(n))):
            gone.append(n)
        else:
            kept.append(n)
    with open(a.out, "w", encoding="utf-8", newline="\n") as f:
        f.write("# tools/distill.py field: %d of %d names from %s, weight 1 each (the flat mean is the APS)%s\n"
                % (len(kept), len(names), os.path.basename(a.participants),
                   "; %d left out with no jar in %s" % (len(gone), a.present) if gone else ""))
        f.write("# name | role (all:weight) | jar | weight\n")
        for n in kept:
            f.write("%s | all:1 | %s | 1.0000\n" % (n, jar_of(n)))
    print("%d robots -> %s%s" % (len(kept), a.out, "; no jar for: " + ", ".join(gone) if gone else ""))


def oracle_pick(per_arm, default, z=1.0, min_gain=0.0):
    """One opponent's mode: per_arm maps a char to {seed: score share}. The default arm stands
    unless another arm's paired gain over it (seeds both ran) clears both z standard errors and
    min_gain; then the best such arm. Returns (char, gain, se)."""
    base = per_arm.get(default)
    best = (default, 0.0, 0.0)
    if not base:
        return best
    for c, runs in sorted(per_arm.items()):
        if c == default or not runs:
            continue
        seeds = sorted(set(runs) & set(base))
        if len(seeds) < 2:
            continue
        d = [runs[x] - base[x] for x in seeds]
        m = sum(d) / len(d)
        se = math.sqrt(sum((x - m) ** 2 for x in d) / (len(d) - 1) / len(d))
        if m - z * se > 0 and m > min_gain and m > best[1]:
            best = (c, m, se)
    return best


def oracle_main(a):
    sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
    import kitlab_read
    rows = kitlab_read.load_set(a.set)
    arms = {}
    for spec in a.arm:
        c, run = spec.split("=", 1)
        if len(c) != 1:
            raise SystemExit("--arm CHAR=RUN_DIR: one char, got %r" % c)
        if not os.path.isdir(os.path.join(run, "battles")):
            raise SystemExit("distill: no battles under %s" % run)
        arms[c] = kitlab_read.by_seed(run)
    if a.default not in arms:
        raise SystemExit("--default %s names no --arm" % a.default)
    picks, gain, var = collections.Counter(), 0.0, 0.0
    out = []
    for name, w, stem in rows:
        c, m, se = oracle_pick({k: v.get(stem, {}) for k, v in arms.items()}, a.default, a.z, a.min_gain)
        picks[c] += 1
        gain += m
        var += se * se
        out.append((name, c, m, se))
    n = len(rows)
    print("%d robots: %s; picked gain over the default %+.2f +- %.2f APS (in sample: an upper bound, "
          "read it on fresh seeds)" % (n, dict(sorted(picks.items())), gain / n, math.sqrt(var) / n))
    if a.report:
        for name, c, m, se in sorted(out, key=lambda t: -t[2]):
            if c != a.default:
                print("  %s  %+6.1f +- %4.1f  %s" % (c, m, se, name))
        return
    with open(a.out, "w", encoding="utf-8", newline="\n") as f:
        f.write("# tools/distill.py oracle: per robot the arm whose paired gain over arm %s clears %.1f SE "
                "and %.1f APS; arms %s\n" % (a.default, a.z, a.min_gain, ", ".join(a.arm)))
        for name, c, m, se in out:
            f.write("%s\t%s\n" % (name, c))
    print("%d modes -> %s" % (n, a.out))


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
    hs.add_argument("--protect", action="store_true", help="only the --modes names count for collisions")
    hs.add_argument("--strict", action="store_true", help="every counted name on its own cell, not only differing chars")
    hs.add_argument("--min-bits", type=int, default=4)
    hs.add_argument("--max-bits", type=int, default=15, help="15 keeps the string under the 65,535-byte constant limit")
    hs.add_argument("--src", help="the robot source whose constant is rewritten")
    hs.add_argument("--name", default="MODES")
    hs.add_argument("--raw", action="store_true", help="write digit chars as the values 0..9, so charAt needs no '0' subtraction")
    hs.add_argument("--shift", type=int, help="use this unsigned shift only (0 saves the robot 3 bytes)")
    hs.add_argument("--max-conflicts", type=int, default=0, help="accept up to this many robots on a cell with a different char")
    hs.add_argument("--resolve", choices=["first", "high", "default"], default="first",
                    help="an accepted conflict takes the first robot's char, the higher, or the default")
    hs.add_argument("--report", action="store_true", help="print each robot's cell, write nothing")
    hs.set_defaults(run=hash_main)

    tr = sub.add_parser("tiers", help="a modes TSV from Hadur's census: their hit rate on Hadur as one char a robot")
    tr.add_argument("census", nargs="+", help="data/bench/*_cold.tsv paths or globs")
    tr.add_argument("--names", required=True, help="the rumble's names (with versions), one a line or participants lines")
    tr.add_argument("--random-at", type=float, default=0.05, help="their hit rate from which the char is '1'")
    tr.add_argument("--ram-at", type=float, default=0.25, help="their hit rate from which the char is '2' (a rammer)")
    tr.add_argument("--out", help="the modes TSV to write")
    tr.add_argument("--report", action="store_true", help="print every robot's rate and char, write nothing")
    tr.set_defaults(run=tiers_main)

    fd = sub.add_parser("field", help="a kitlab set file of a whole rumble, weight 1 a robot")
    fd.add_argument("participants")
    fd.add_argument("--skip", action="append", default=[], help="leave out names starting with this (repeatable)")
    fd.add_argument("--present", help="keep only robots whose jar is in this directory")
    fd.add_argument("--out", required=True)
    fd.set_defaults(run=field_main, report=False)

    oc = sub.add_parser("oracle", help="per robot, the arm that beat the default on the bench: a modes TSV")
    oc.add_argument("set", help="the kitlab set file the arms ran on")
    oc.add_argument("--arm", action="append", required=True, help="CHAR=RUN_DIR, one per arm (repeatable)")
    oc.add_argument("--default", required=True, help="the char of the arm that stands unless beaten")
    oc.add_argument("--z", type=float, default=1.0, help="standard errors the paired gain must clear")
    oc.add_argument("--min-gain", type=float, default=0.0, help="APS points the paired gain must clear")
    oc.add_argument("--out", help="the modes TSV to write")
    oc.add_argument("--report", action="store_true", help="print the robots that leave the default, write nothing")
    oc.set_defaults(run=oracle_main)

    a = p.parse_args(argv)
    if a.cmd in ("field",):
        pass
    elif a.cmd == "oracle":
        if not a.report and not a.out:
            p.error("--out is needed unless --report")
    elif a.cmd == "tiers":
        if not a.report and not a.out:
            p.error("--out is needed unless --report")
    elif not a.report and not a.src:
        p.error("--src is needed unless --report")
    a.run(a)


if __name__ == "__main__":
    main()

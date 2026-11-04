#!/usr/bin/env python3
"""Eveimear per-robot bullet power with the gun's waves at the same speed (pc-eveimear-pw, BENCH-183).

0.2 fires 2 (3 close in) at every robot while its gun waves fly at 14 px a tick, power 2's speed, so the
power-3 screen of 2026-11-03 (-3.86) aimed every power-3 bullet with guess factors learned for the wrong
flight time. The 0.3 base fixes that in 22 bytes, on the diet's 719 B (tools/eveimear_diet.py, neutral):
each MODES char holds 16 x s + m, m the movement mode (0, 1 or 9, as 0.2) and s the wave speed, and

    speed = (int) (tab = MODES.charAt(...)) >> 4;        the robot's wave speed
    power  (20 - speed) / 3 + antiRam                    the power that flies at that speed (was 2 + antiRam)
    mode   ... * (tab % 16)                              the threshold reads m as before
    wave   travelled += speed                            (was 14)
    gun    w.dir = copySign(speed, ...): bins x speed / 14, aim / speed, so the escape angle is 0.65 x 14 / speed

With s = 14 for every robot the base plays 0.2's power, waves and escape angle (with the mode table it is given;
the gun's two products round in another order, so the gun turn can differ in the last bit); 741 B.

  panel FIELD OUT --pilot P --rest R [--every 5] [--broken FILE]   every robot but ours and the broken
  base SRC OUT [--modes MODES_SRC]   SRC (0.2) with the diet and the power code; MODES_SRC's mode table if given
  force BASE OUT --speed S          every cell's speed set to S (11 power 3, 17 power 1), modes kept
  apply BASE PICK.tsv OUT --field FIELD [--written FILE] [--arm-speed p3=11 --arm-speed p1=17]
        each picked robot's cell set to its arm's speed; a cell another FIELD robot shares is left alone
        unless every robot on it picked the same speed
"""
import argparse
import os
import sys

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
sys.path.insert(0, os.path.join(os.path.dirname(os.path.abspath(__file__)), "..", "..", "data", "tools"))
import eveimear_diet  # noqa: E402
from eveimear_modes import read_src, write_src, field_lines, name_of, broken  # noqa: E402
from distill import cell  # noqa: E402

CODE = [
    ("static double enemyEnergy, direction = 1, won, mode, lastSpeed, since, enemyX, enemyY, tab;",
     "static double enemyEnergy, direction = 1, won, mode, lastSpeed, since, enemyX, enemyY, tab, speed;"),
    ("        tab = MODES.charAt(e.getName().hashCode() & MASK);\n",
     "        // The robot's wave speed and mode (pc-eveimear-pw): MODES char = 16 x speed + mode.\n"
     "        speed = (int) (tab = MODES.charAt(e.getName().hashCode() & MASK)) >> 4;\n"),
    ("setFire(Math.min(Math.min(2 + antiRam,", "setFire(Math.min(Math.min((20 - speed) / 3 + antiRam,"),
    ("(40 + 23 * getRoundNum()) * tab)", "(40 + 23 * getRoundNum()) * (tab % 16))"),
    ("if ((travelled += 14) <", "if ((travelled += speed) <"),
    # The escape angle follows the speed, 0.65 x 14 / speed (0.2's 0.65 at 14; 0.83 at 11, where asin(8 / 11) is 0.81): the wave's
    # dir carries the speed with its sign, so the bins scale by speed and the aim divides by it.
    ("w.dir = Math.copySign(1, angle + 0.0);", "w.dir = Math.copySign(speed, angle + 0.0);"),
    ("+ w.dir * (best - MID) * (ESCAPE / MID)));", "+ (best - MID) * (ESCAPE * 14 / MID) / w.dir));"),
    ("* dir * (MID / ESCAPE) + 58.5))]++;", "* dir * (MID / ESCAPE / 14) + 72.5))]++;"),
    # At speed 17 a bin's x reaches +-70 (pi x 12 x 17 / 9.1), so CLAMP runs from -72: char k is clamp(k - 60, 0, 24).
    ('static final String CLAMP = "' + eveimear_diet.CLAMP + '";',
     'static final String CLAMP = "' + "".join("\\%o" % max(0, min(24, k - 60)) for k in range(145)) + '";'),
]


def cmd_panel(a):
    skip = broken(a.broken)
    rows = [l for l in field_lines(a.field) if name_of(l) not in skip and not name_of(l).startswith("hadur117.")]
    head = "# eveimear_power2.py panel: the %d robots of %s, none ours or in broken-1.11.2.txt" % (
        len(rows), os.path.basename(a.field))
    pilot = rows[::a.every]
    rest = [l for i, l in enumerate(rows) if i % a.every]
    for path, lines, note in ((a.out, rows, "."), (a.pilot, pilot, "; pilot: every %dth, %d robots." % (a.every, len(pilot))),
                              (a.rest, rest, "; the robots not in the pilot, %d." % len(rest))):
        with open(path, "w") as f:
            f.write(head + note + "\n")
            f.writelines(lines)
    print("panel %d, pilot %d, rest %d" % (len(rows), len(pilot), len(rest)))


def cmd_base(a):
    src = open(a.src).read()
    if a.modes:
        _, _, _, modes = read_src(a.modes)
        s, m, _, old = read_src(a.src)
        if len(old) != len(modes):
            sys.exit("MODES lengths differ")
        src = s[:m.start(1)] + "\0" + s[m.end(1):]
    src = eveimear_diet.apply(src, eveimear_diet.NEUTRAL, "diet")
    src = eveimear_diet.apply(src, CODE, "power")
    tmp = a.out + ".tmp"
    if a.modes:
        from kitlab_prior_arm import java
        src = src.replace('MODES = "\0"', 'MODES = "' + java(modes) + '"', 1)
    open(tmp, "w").write(src)
    s, m, _, modes = read_src(tmp)
    os.remove(tmp)
    if any(c not in (0, 1, 9) for c in modes):
        sys.exit("MODES holds chars other than 0, 1 and 9: not 0.2's table")
    write_src(s, m, [16 * 14 + c for c in modes], a.out)
    print("%s: base, every robot speed 14" % a.out)


def cmd_force(a):
    s, m, _, modes = read_src(a.base)
    write_src(s, m, [16 * a.speed + c % 16 for c in modes], a.out)
    print("%s: every robot speed %d" % (a.out, a.speed))


def cmd_apply(a):
    s, m, mask, modes = read_src(a.base)
    speeds = dict((k, int(v)) for k, v in (x.split("=") for x in a.arm_speed))
    lines = [l for l in open(a.pick, encoding="utf-8") if l.strip() and not l.startswith("#")]
    picks = {}
    for l in lines:
        name, arm = l.split("\t")[:2]
        if arm not in speeds:
            sys.exit("%s: arm %s has no speed (--arm-speed)" % (a.pick, arm))
        picks[name.strip()] = speeds[arm]
    on_cell = {}
    for l in field_lines(a.field):
        on_cell.setdefault(cell(name_of(l), mask), []).append(name_of(l))
    written, done = [], 0
    for name, sp in sorted(picks.items()):
        c = cell(name, mask)
        if all(picks.get(o) == sp for o in on_cell.get(c, [name])):
            modes[c] = 16 * sp + modes[c] % 16
            done += 1
            written += [l for l in lines if l.split("\t")[0].strip() == name]
        else:
            print("left alone (cell shared): %s" % name)
    write_src(s, m, modes, a.out)
    if a.written:
        open(a.written, "w", encoding="utf-8").writelines(written)
    print("%s: %d picks written, %d left alone" % (a.out, done, len(picks) - done))


def main():
    ap = argparse.ArgumentParser()
    sub = ap.add_subparsers(dest="cmd", required=True)
    p = sub.add_parser("panel"); p.add_argument("field"); p.add_argument("out")
    p.add_argument("--pilot", required=True); p.add_argument("--rest", required=True)
    p.add_argument("--every", type=int, default=5)
    p.add_argument("--broken", default=os.path.join(os.path.dirname(os.path.abspath(__file__)), "..", "broken-1.11.2.txt"))
    p = sub.add_parser("base"); p.add_argument("src"); p.add_argument("out"); p.add_argument("--modes")
    p = sub.add_parser("force"); p.add_argument("base"); p.add_argument("out")
    p.add_argument("--speed", type=int, choices=(11, 14, 17), required=True)
    p = sub.add_parser("apply"); p.add_argument("base"); p.add_argument("pick"); p.add_argument("out")
    p.add_argument("--field", required=True); p.add_argument("--written")
    p.add_argument("--arm-speed", action="append", default=None)
    a = ap.parse_args()
    if a.cmd == "apply" and not a.arm_speed:
        a.arm_speed = ["p3=11", "p1=17"]
    {"panel": cmd_panel, "base": cmd_base, "force": cmd_force, "apply": cmd_apply}[a.cmd](a)


if __name__ == "__main__":
    main()

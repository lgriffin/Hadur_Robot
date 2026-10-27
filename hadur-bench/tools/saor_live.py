#!/usr/bin/env python3
"""Saor's live-shaped census (docs/plan-saor-first.md, stage 0).

LiteRumble scores MicroMelee from the MeleeRumble battles: ten robots drawn from the whole
melee list, scored only on the pairings where both robots are micro. The MicroMelee census
(micromelee-census.txt) runs micro robots only, and reads 1.6 under live. This census runs the
whole-field melee census instead (melee-census-317.txt: the 2026-10-25 MeleeRumble list in 46
fields of nine) and the read counts only the micro pairings (saor_arms.py --only).

For each seat it writes, under OUT/<seat>/:

  fNN.txt      the census fields that hold at least one micro robot (a field with none adds
               nothing to the score); when the seated robot is itself in a field, Saor takes
               its place, as Saor now plays in the live field
  suite.txt    the suite over those fields, for the bench's --suite

and OUT/micro.txt, the robots the read counts: the MicroMelee field plus Saor (the release in the rumble).

  python3 tools/saor_live.py --seat "kc.micro.Figment 1.0" --seat "wompi.Wallaby 5.1" --seat saor

A seat of `saor` is any Saor build: no field changes. Deise's MiniMelee census (docs/deise.md)
runs the same way with --counted minimelee-field.txt, --resident naming Deise's field line, and
--own and --own-key naming Deise:

  python3 tools/saor_live.py --counted minimelee-field.txt --own "hadur117.mini.Deise 0.1" \
      --own-key deise --resident "hadur117.mini.Deise 0.1 | minimelee-deise | hadur117.mini.Deise_0.1.jar" \
      --seat "kc.mini.Mirage 0.2" --seat deise

Standard library only; the output is deterministic for a given suite.
"""

import argparse
import os
import re
import sys

HERE = os.path.dirname(os.path.dirname(os.path.abspath(__file__)))
SAOR = "hadur117.micro.Saor 0.2"
SAOR_LINE = "%s | micromelee-3 | hadur117.micro.Saor_0.2.jar" % SAOR


def set_lines(path):
    with open(path, encoding="utf-8") as f:
        return [l.rstrip("\n") for l in f if "|" in l and not l.startswith("#")]


def name(line):
    return line.split("|")[0].strip()


def suite_fields(suite):
    """(label, field file) of each suite line, the file relative to the suite's directory."""
    out = []
    for line in set_lines(suite):
        label, opts = [p.strip() for p in line.split("|", 1)]
        m = re.search(r"--set\s+(\S+)", opts)
        if m:
            out.append((label, m.group(1)))
    return out


def seat_key(seat, own_key="saor"):
    return own_key if seat == own_key else re.sub(r"[^A-Za-z0-9.]+", "_", seat)


def build(suite, micro_file, seats, out, own=SAOR, resident=SAOR_LINE, own_key="saor"):
    base = os.path.dirname(os.path.abspath(suite))
    micro = [name(l) for l in set_lines(micro_file)]
    written = {}
    os.makedirs(out, exist_ok=True)
    with open(os.path.join(out, "micro.txt"), "w", encoding="utf-8") as f:
        f.write("# Robots the live-shaped census read counts (saor_live.py): the %s field and %s.\n"
                % (os.path.basename(micro_file), own))
        for n in micro + [own]:
            f.write(n + "\n")
    micro = set(micro) | {own}
    for seat in seats:
        key = seat_key(seat, own_key)
        d = os.path.join(out, key)
        os.makedirs(d, exist_ok=True)
        suite_lines = []
        for label, rel in suite_fields(suite):
            lines = set_lines(os.path.join(base, rel))
            if not any(name(l) in micro for l in lines):
                continue
            lines = [resident if name(l) == seat else l for l in lines]
            fname = os.path.basename(rel)
            with open(os.path.join(d, fname), "w", encoding="utf-8") as f:
                f.write("# Live-shaped census field %s for seat %s (saor_live.py, from %s)\n" % (label, seat, rel))
                for l in lines:
                    f.write(l + "\n")
            suite_lines.append("%s | --set %s --melee true --field 1000x1000" % (label, os.path.join(d, fname)))
        with open(os.path.join(d, "suite.txt"), "w", encoding="utf-8") as f:
            f.write("# Live-shaped census for seat %s: %d fields with a micro robot (saor_live.py)\n" % (seat, len(suite_lines)))
            for l in suite_lines:
                f.write(l + "\n")
        written[seat] = (os.path.join(d, "suite.txt"), len(suite_lines))
    return written


def main(argv=None):
    p = argparse.ArgumentParser(description=__doc__, formatter_class=argparse.RawDescriptionHelpFormatter)
    p.add_argument("--suite", default=os.path.join(HERE, "melee-census-317.txt"))
    p.add_argument("--micro", "--counted", dest="micro", default=os.path.join(HERE, "micromelee-field.txt"),
                   help="the size rumble's field: the robots the read counts")
    p.add_argument("--own", default=SAOR, help="our release in the rumble, counted with the field")
    p.add_argument("--own-key", default="saor", help="the seat name that means a build of ours")
    p.add_argument("--resident", default=SAOR_LINE, help="the field line that takes a seated robot's place")
    p.add_argument("--seat", action="append", required=True, help="seated robot's name and version, or the own key")
    p.add_argument("--out", default="work/saor-arms/live")
    a = p.parse_args(argv)
    for seat, (path, n) in build(a.suite, a.micro, a.seat, a.out, a.own, a.resident, a.own_key).items():
        print("%s: %s (%d fields)" % (seat, path, n))
    return 0


if __name__ == "__main__":
    sys.exit(main())

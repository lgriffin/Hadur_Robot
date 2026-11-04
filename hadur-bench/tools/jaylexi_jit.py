#!/usr/bin/env python3
"""JayLexi per-robot aim jitter against bullet catchers (JAYLEXI-19, BENCH-190).

Bullet catchers (rsim.mini.BulletCatcher) shoot JayLexi's bullets down: its GuessFactor gun aims where they
expect, and every bullet caught costs JayLexi the energy it fired. A random turn of up to 0.0625 rad either side
of the aim breaks the catch (BulletCatcher 21.9% -> 72.7% of the score, 4 seeds, 2026-11-04). For most robots
the jitter only scatters good aim, so it has to be per robot. It costs no table: it rides the orbit char.

    gun turn += (Math.random() - 0.5) * ((int) orbit >> 2) / 4

The orbit is read in hundredths of a radian (tools/jaylexi_orbit.py, 0.95 to 1.35). (int) orbit >> 2 is 0 for
every orbit under 4 rad, so those robots aim exactly as before (the term is +-0.0, and JayLexi draws no other
random numbers, so their play is bit for bit unchanged). Adding 628 to a robot's char (2 pi in hundredths, 0.0032
rad short) keeps its orbit (the orbit only enters sin, cos and tan) and makes the term 1: that robot's aim
jitters by up to 0.0625 rad either way. 1,494 B with ecj + ProGuard (kitlab/build_arm_pg.sh), within 1,496.

  python3 tools/jaylexi_jit.py SRC OUT [--all] [--pick PICK.tsv --field FIELD --written F]

--all turns the jitter on for every robot (and the field's char); --pick turns it on for robots whose arm is jt
(robots without a NAMES row of their own are skipped, and so is a row another FIELD robot's hash finds unless
that robot picked jt too).
"""
import argparse
import os
import sys

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
from jaylexi_power2 import java_hash, table  # noqa: E402
from kitlab_prior_arm import java, unjava  # noqa: E402

TURN = 628
AIM = "+ w.dir * (best - MID) * Math.asin(8 / w.speed) / MID));"
JIT = ("+ (Math.random() - 0.5) * ((int) orbit >> 2) / 4 + w.dir * (best - MID) * Math.asin(8 / w.speed) / MID));"
       "\n        // Aim jitter where the robot's orbit char carries 2 pi more: bullet catchers (JAYLEXI-19).")


def jit_src(src):
    """The JayLexi source with the jitter term read from the orbit char (as it is if it has it), every char as given."""
    if "((int) orbit >> 2) / 4" in src:
        return src
    if src.count(AIM) != 1:
        sys.exit("jaylexi_jit.py: the aim line is not in the source once")
    return src.replace(AIM, JIT)


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument("src"); ap.add_argument("out")
    ap.add_argument("--all", action="store_true", help="jitter against every robot")
    ap.add_argument("--pick"); ap.add_argument("--written")
    ap.add_argument("--field", help="every robot JayLexi meets: a row two of them find is written only if both picked jt")
    a = ap.parse_args()
    src = jit_src(open(a.src).read())
    names = unjava(table(src, "NAMES").group(1))
    m = table(src, "ORB")
    orb = list(unjava(m.group(1)))
    if a.all:
        orb = [c if c >= 400 else c + TURN for c in orb]
    if a.pick:
        lines = [l for l in open(a.pick, encoding="utf-8") if l.strip() and not l.startswith("#")]
        chosen = dict((l.split("\t")[0].strip(), l.split("\t")[1].strip()) for l in lines)
        on_row = {}
        for f in ([l.split("|")[0].strip() for l in open(a.field, encoding="utf-8") if l.strip() and not l.startswith("#")]
                  if a.field else []):
            on_row.setdefault(java_hash(f) & 0xFFFF, []).append(f)
        written = []
        for l in lines:
            name, arm = [x.strip() for x in l.split("\t")[:2]]
            if arm != "jt":
                sys.exit("%s: arm %s is not jt" % (a.pick, arm))
            h = java_hash(name) & 0xFFFF
            if names.count(h) != 1:
                print("left alone (no NAMES row of its own): %s" % name)
                continue
            if any(chosen.get(o) != "jt" for o in on_row.get(h, [])):
                print("left alone (row shared with a robot that did not pick jt): %s" % name)
                continue
            if orb[names.index(h) + 1] < 400:
                orb[names.index(h) + 1] += TURN
            written.append(l)
        if a.written:
            open(a.written, "w", encoding="utf-8").writelines(written)
        print("%d picks written, %d left alone" % (len(written), len(lines) - len(written)))
    src = src[:m.start(1)] + java(orb) + src[m.end(1):]
    open(a.out, "w").write(src)
    print("%s: %d robots jitter" % (a.out, sum(c >= 400 for c in orb)))


if __name__ == "__main__":
    main()

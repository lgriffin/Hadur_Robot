#!/usr/bin/env python3
"""JayLexi per-robot orbit angle (pc-jaylexi-orb, BENCH-187).

JayLexi 0.4 surfs at ORBIT = 1.15 rad off the wave's bearing against every robot, in both the drive (run) and the
danger prediction. Movement is where it loses to the top of the MiniRumble, and the right orbit is robot-dependent:
closer in against weak guns and rammers' prey, further out against strong guns. On the diet's 1,470 B
(tools/jaylexi_diet.py, neutral) this build reads one char per recorded robot, in hundredths of a radian, through
the row index the aim prior already computes:

    orbit = ORB.charAt((row = BINS * (NAMES.indexOf(...) + 1)) / BINS) / 100.0;           1,487 B (9 spare)

row / BINS is k + 1 for NAMES entry k and 0 for the rest (the field's own char). With every char 115 it plays as
the diet (115 / 100.0 == 1.15 in IEEE doubles; JayLexiReplayTest holds).

  python3 tools/jaylexi_orbit.py SRC OUT [--all O] [--pick PICK.tsv --field FIELD --arm-orbit near=135 --arm-orbit far=95 --written F]

--all O sets every char to O hundredths (an arm that orbits at O against every robot); --pick writes the picked
robots' chars (robots without a NAMES entry share the field's char and are skipped, and a char another FIELD
robot's hash also finds is written only when that robot picked the same arm).
"""
import argparse
import os
import sys

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import jaylexi_diet  # noqa: E402
from jaylexi_power2 import java_hash, table  # noqa: E402
from kitlab_prior_arm import java, unjava  # noqa: E402

BASE = 115
ROW = "        row = BINS * (NAMES.indexOf((char) e.getName().hashCode()) + 1);\n"
CODE = [
    ("    // Orbit angle off the wave's bearing: a little under PI/2, so the orbit drifts outward (JAYLEXI-5).\n"
     "    static final double ORBIT = 1.15;\n", ""),
    ("static double enemyEnergy,", "static double orbit, enemyEnergy,"),
    (ROW, "        // This robot's orbit angle, hundredths of a radian (JAYLEXI-5: 1.15 off the wave's bearing).\n"
          "        orbit = ORB.charAt((row = BINS * (NAMES.indexOf((char) e.getName().hashCode()) + 1)) / BINS) / 100.0;\n"),
    ("+ ORBIT * (direction", "+ orbit * (direction"),
    ("dir * ORBIT, dir)", "dir * orbit, dir)"),
    ("            POWER = ", '            ORB = "",\n            POWER = '),
]


def orbit_src(src):
    """The diet (neutral) plus the per-robot orbit read, ORB still empty."""
    src = jaylexi_diet.apply(src, jaylexi_diet.NEUTRAL, "diet")
    return jaylexi_diet.apply(src, CODE, "orbit")


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument("src"); ap.add_argument("out")
    ap.add_argument("--all", type=int, help="every char this many hundredths of a radian")
    ap.add_argument("--pick"); ap.add_argument("--written")
    ap.add_argument("--field", help="every robot JayLexi meets: a char two of them find is written only if both picked it")
    ap.add_argument("--arm-orbit", action="append", default=None)
    a = ap.parse_args()
    src = orbit_src(open(a.src).read())
    names = unjava(table(src, "NAMES").group(1))
    n = len(names)
    orb = [a.all or BASE] * (n + 1)
    if a.pick:
        orbits = dict((k, int(v)) for k, v in (x.split("=") for x in (a.arm_orbit or ["near=135", "far=95"])))
        lines = [l for l in open(a.pick, encoding="utf-8") if l.strip() and not l.startswith("#")]
        on_row = {}
        for f in ([l.split("|")[0].strip() for l in open(a.field, encoding="utf-8") if l.strip() and not l.startswith("#")]
                  if a.field else []):
            on_row.setdefault(java_hash(f) & 0xFFFF, []).append(f)
        chosen = dict((x.split("\t")[0].strip(), x.split("\t")[1].strip()) for x in lines)
        written = []
        for l in lines:
            name, arm = [x.strip() for x in l.split("\t")[:2]]
            if arm not in orbits:
                sys.exit("%s: arm %s has no orbit (--arm-orbit)" % (a.pick, arm))
            h = java_hash(name) & 0xFFFF
            if names.count(h) != 1:
                print("left alone (no NAMES row of its own): %s" % name)
                continue
            if any(chosen.get(o) != arm for o in on_row.get(h, [])):
                print("left alone (row shared with a robot that picked otherwise): %s" % name)
                continue
            orb[names.index(h) + 1] = orbits[arm]
            written.append(l)
        if a.written:
            open(a.written, "w", encoding="utf-8").writelines(written)
        print("%d picks written, %d left alone" % (len(written), len(lines) - len(written)))
    m = table(src, "ORB")
    src = src[:m.start(1)] + java(orb) + src[m.end(1):]
    open(a.out, "w").write(src)
    print("%s: %d robot chars" % (a.out, n))


if __name__ == "__main__":
    main()

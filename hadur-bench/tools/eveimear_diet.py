#!/usr/bin/env python3
"""Eveimear codesize diet (Leigh's doc "Eveimear & Sanaro Codesize Diet", 2026-11-03; BENCH-182).

Rewrites Eveimear 0.2's source with the doc's measured byte cuts:

  neutral  rows 1 and 3-6: same play, fewer bytes (row 1 declares the wave first so it takes slot 2 and lets
           angle carry lateral in the gun; row 3 clamps the bin through a CLAMP string instead of the long
           round/min/max; row 4 an int Rectangle; row 5 getBulletHitBonus; row 6 copySign for the wave direction)
  row2     + onBulletHit reads the enemy's energy from the event instead of subtracting the damage
  row7     + no setAdjustRadarForGunTurn

  python3 tools/eveimear_diet.py SRC OUT --rows neutral[,row2,row7]
"""
import argparse
import sys

# CLAMP char k is clamp(k - 46, 0, 24): index (int) (x + 58.5) is floor(x + 0.5) + 58 for |x| <= 58, the
# bin round(x) + MID shifted by 46 so it is never negative.
CLAMP = "".join("\\%o" % max(0, min(24, k - 46)) for k in range(117))

NEUTRAL = [
    # row 1: w first (slot 2), angle slot 3; angle plays lateral in the gun (its last use as the angle is
    # the stop-and-go cos).
    ("""        double absBearing, distance, angle, drop, offset, antiRam;
        Wave w;
""", """        Wave w;
        double angle, absBearing, distance, drop, offset, antiRam;
"""),
    ("double lateral = e.getVelocity() * Math.sin(", "angle = e.getVelocity() * Math.sin("),
    # row 6 on the same line: copySign of a +0.0-normalised value is signum with the +1e-9 nudge.
    ("w.dir = Math.signum(lateral + 1e-9);", "w.dir = Math.copySign(1, angle + 0.0);"),
    ("if (lastSpeed != (lateral = (int) Math.abs(lateral))) {", "if (lastSpeed != (angle = (int) Math.abs(angle))) {"),
    ("history = lastSpeed > lateral ? 4 : 3;", "history = lastSpeed > angle ? 4 : 3;"),
    ("lastSpeed = lateral;", "lastSpeed = angle;"),
    ("stats[history][(int) lateral / 2]", "stats[history][(int) angle / 2]"),
    # row 3: the bin clamp as a string lookup.
    ("""            bins[(int) Math.max(0, Math.min(2 * MID,
                    Math.round(Utils.normalRelativeAngle(Math.atan2(dx, dy) - bearing) * dir * (MID / ESCAPE)) + MID))]++;""",
     """            bins[CLAMP.charAt((int) (Utils.normalRelativeAngle(Math.atan2(dx, dy) - bearing) * dir * (MID / ESCAPE) + 58.5))]++;"""),
    ("    static final int MASK = 16383;\n",
     "    static final int MASK = 16383;\n    // Gun bin k - 46 clamped to 0..2 MID, for the wave's (int) (x + 58.5) (diet row 3).\n"
     "    static final String CLAMP = \"" + CLAMP + "\";\n"),
    # row 4: an int rectangle, the same contains test on the same values.
    ("static final Rectangle2D.Double FIELD = new Rectangle2D.Double(18, 18, 764, 564);",
     "static final java.awt.Rectangle FIELD = new java.awt.Rectangle(18, 18, 764, 564);"),
    ("import java.awt.geom.Rectangle2D;\n", ""),
    # row 5: the API's bullet hit bonus is 3 x power.
    ("enemyEnergy += gain = 3 * e.getPower();", "enemyEnergy += gain = Rules.getBulletHitBonus(e.getPower());"),
]

ROWS = {
    "row2": [("enemyEnergy -= Rules.getBulletDamage(e.getBullet().getPower());", "enemyEnergy = e.getEnergy();")],
    "row7": [("        setAdjustRadarForGunTurn(true);\n", "")],
}


def apply(src, pairs, label):
    for old, new in pairs:
        n = src.count(old)
        if n != 1:
            sys.exit("%s: expected one %r, found %d" % (label, old[:70], n))
        src = src.replace(old, new)
    return src


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument("src")
    ap.add_argument("out")
    ap.add_argument("--rows", default="neutral", help="comma list: neutral, row2, row7")
    a = ap.parse_args()
    src = open(a.src).read()
    for r in a.rows.split(","):
        src = apply(src, NEUTRAL if r == "neutral" else ROWS[r], r)
    open(a.out, "w").write(src)
    print("%s: %s" % (a.out, a.rows))


if __name__ == "__main__":
    main()

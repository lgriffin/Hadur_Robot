#!/usr/bin/env python3
"""JayLexi codesize diet (Leigh's doc "JayLexi 0.4 Codesize Diet", 2026-11-03; BENCH-181).

Rewrites JayLexi 0.4's source with the doc's measured byte cuts:

  neutral  rows 1 and 3-8: same play, fewer bytes (row 1 shares slot 3 between lateral, drop, angle and
           power; row 3 counts the clear wall fractions in a loop over a FRAC string; row 4 an int
           Rectangle; row 5 copySign for the wave direction; row 6 a LAT table; row 7 getBulletHitBonus;
           row 8 the danger loop's move sign from copySign)
  row2     + onBulletHit reads the enemy's energy from the event instead of subtracting the damage
  row9     + a hit wave is marked dead (travelled 1e9) and test() drops it next tick
  row10    + no setAdjustRadarForGunTurn
  row11    + radar turns 1x the bearing offset, not 2x

  python3 tools/jaylexi_diet.py SRC OUT --rows neutral[,row2,row9,row10,row11]
"""
import argparse
import sys

NEUTRAL = [
    # row 1: drop, angle and power become lateral (slot 3).
    ("double lateral, absBearing, direction, angle, drop;", "double lateral, absBearing, direction;"),
    ("if ((drop = enemyEnergy - (enemyEnergy = e.getEnergy())) <= 3 && drop > 0.09) {",
     "if ((lateral = enemyEnergy - (enemyEnergy = e.getEnergy())) <= 3 && lateral > 0.09) {"),
    ("(w = next).speed = Rules.getBulletSpeed(drop);", "(w = next).speed = Rules.getBulletSpeed(lateral);"),
    ("angle = lastBearing = absBearing + Math.PI;", "lateral = lastBearing = absBearing + Math.PI;"),
    ("angle = wave(0).angle(me) + ORBIT * (direction", "lateral = wave(0).angle(me) + ORBIT * (direction"),
    ("setTurnRightRadians(Math.tan(angle = smooth(me, angle, direction) - getHeadingRadians()));",
     "setTurnRightRadians(Math.tan(lateral = smooth(me, lateral, direction) - getHeadingRadians()));"),
    ("setAhead(Math.cos(angle) * 1000);", "setAhead(Math.cos(lateral) * 1000);"),
    ("double power = Math.min(Math.min(POWER", "lateral = Math.min(Math.min(POWER"),
    ("w.travelled = -1.5 * (drop = w.speed = Rules.getBulletSpeed(power));",
     "w.travelled = -1.5 * (w.speed = Rules.getBulletSpeed(lateral));"),
    ("Math.asin(8 / drop) / MID));", "Math.asin(8 / w.speed) / MID));"),
    ("setFireBullet(power) != null", "setFireBullet(lateral) != null"),
    # row 3: the nested wall product is a count of leading clear fractions.
    ("""        int best;
        double[] b = w.bins = gun[best = ((history * 4 + LOG2.charAt((int) lateral)) * 4
                + wall(w, 0.18) * (1 + wall(w, 0.36) * (1 + wall(w, 0.64)))) * 5 + (int) (distance / 250)];""",
     """        int best = 0;
        while (best < 3 && FIELD.contains(project(me, w.bearing + w.dir * FRAC.charAt(best) / 100, distance))) {
            best++;
        }
        double[] b = w.bins = gun[best = ((history * 4 + LOG2.charAt((int) lateral)) * 4
                + best) * 5 + (int) (distance / 250)];"""),
    ("""    /** 1 if the point a fraction of the escape angle along the enemy's way is still in the field. */
    static int wall(Wave w, double fraction) {
        return FIELD.contains(project(me, w.bearing + w.dir * fraction, distance)) ? 1 : 0;
    }

""", ""),
    ('LOG2 = "\\0\\1\\1\\2\\2\\2\\2\\3\\3",', 'LOG2 = "\\0\\1\\1\\2\\2\\2\\2\\3\\3", FRAC = "\\22\\44\\100", LAT = "\\0\\1\\1\\2\\2\\3\\3\\4\\4",'),
    # row 4: an int rectangle, the same contains test on the same values.
    ("static final Rectangle2D.Double FIELD = new Rectangle2D.Double(18, 18, 764, 564);",
     "static final java.awt.Rectangle FIELD = new java.awt.Rectangle(18, 18, 764, 564);"),
    # row 5: copySign of a +0.0-normalised value is signum with the +1e-9 nudge.
    ("Math.signum(lastLateral + 1e-9)", "Math.copySign(1, lastLateral + 0.0)"),
    ("Math.signum(lateral + 1e-9)", "Math.copySign(1, lateral + 0.0)"),
    # row 6: the surf lateral band as a table.
    ("[(int) ((Math.abs(lastLateral) + 1) / 2)]", "[LAT.charAt((int) Math.abs(lastLateral))]"),
    # row 7: the API's bullet hit bonus is 3 x power.
    ("enemyEnergy += 3 * e.getPower();", "enemyEnergy += Rules.getBulletHitBonus(e.getPower());"),
    # row 8: the move sign straight from cos.
    ("""            move = 1;
            if (Math.cos(angle = smooth(p, s.angle(p) + dir * ORBIT, dir) - heading) < 0) {
                angle += Math.PI;
                move = -1;
            }""",
     """            if ((move = Math.copySign(1, Math.cos(angle = smooth(p, s.angle(p) + dir * ORBIT, dir) - heading))) < 0) {
                angle += Math.PI;
            }"""),
]

ROWS = {
    "row2": [("enemyEnergy -= Rules.getBulletDamage(e.getBullet().getPower());", "enemyEnergy = e.getEnergy();")],
    "row9": [("""                waves.remove(w);
                removeCustomEvent(w);""", """                w.travelled = 1e9;""")],
    "row10": [("        setAdjustRadarForGunTurn(true);\n", "")],
    "row11": [("setTurnRadarRightRadians(2 * Utils.normalRelativeAngle(", "setTurnRadarRightRadians(Utils.normalRelativeAngle(")],
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
    ap.add_argument("--rows", default="neutral", help="comma list: neutral, row2, row9, row10, row11")
    a = ap.parse_args()
    src = open(a.src).read()
    for r in a.rows.split(","):
        src = apply(src, NEUTRAL if r == "neutral" else ROWS[r], r)
    if "import java.awt.geom.Rectangle2D;" in src and "Rectangle2D" not in src.replace("import java.awt.geom.Rectangle2D;", ""):
        src = src.replace("import java.awt.geom.Rectangle2D;\n", "")
    open(a.out, "w").write(src)
    print("%s: %s" % (a.out, a.rows))


if __name__ == "__main__":
    main()

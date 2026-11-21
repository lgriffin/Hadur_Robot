"""Patch a scratch copy of hadur-core's DuelController for the hybrid robots.

Usage: python3 patch-core.py <copied DuelController.java>

Each edit must apply exactly once, or the script stops (the same rule as build-ablation.sh).
"""
import sys

path = sys.argv[1]
src = open(path, encoding="utf-8").read()

EDITS = [
    # Drain the external gun's real bullets into the shadows before anything reads them.
    (
        "        // The lock a scan asked for this tick, where the scan used to write it.\n",
        "        while (!hadur117.core.HybridHooks.FIRED.isEmpty()) {\n"
        "            double[] hb = hadur117.core.HybridHooks.FIRED.poll();\n"
        "            moveController.ourBulletFired(new OurBullet((long) hb[0],\n"
        "                new Point2D.Double(hb[1], hb[2]), hb[3], hb[4]));\n"
        "        }\n"
        "        hadur117.core.HybridHooks.shieldDriving = false;\n"
        "        // The lock a scan asked for this tick, where the scan used to write it.\n",
    ),
    # Tell the robot when Hadur's shield owns body and gun this tick.
    (
        "        if (shield != null && shield.active() && shieldDrive(in, orders, level, mayFire)) return;\n",
        "        if (shield != null && shield.active() && shieldDrive(in, orders, level, mayFire)) {\n"
        "            hadur117.core.HybridHooks.shieldDriving = true;\n"
        "            return;\n"
        "        }\n",
    ),
    # External movement: skip every movement branch (the radar re-acquire after it stays).
    (
        "        if (endgame == Endgame.State.RAM && !wavesInAir) {\n",
        "        if (hadur117.core.HybridHooks.externalMove) {\n"
        "            // hybrid: the body is driven by the other robot's movement\n"
        "        } else if (endgame == Endgame.State.RAM && !wavesInAir) {\n",
    ),
    # External gun: Hadur's own fire orders are dropped, so they leave no shadow.
    (
        "            moveController.ourBulletFired(new OurBullet(in.time(), in.location(), in.gunHeading(),\n"
        "                firedPower));\n"
        "            if (aimCarriesJitter) aimJitter.shotFired();\n",
        "            if (!hadur117.core.HybridHooks.externalGun) moveController.ourBulletFired(\n"
        "                new OurBullet(in.time(), in.location(), in.gunHeading(), firedPower));\n"
        "            if (aimCarriesJitter) aimJitter.shotFired();\n",
    ),
    # External gun: Hadur's gun still aims and learns, but never fires or counts a shot.
    (
        "            TickBudget.shadowAim(level) && !matchWon, mayFire);\n",
        "            TickBudget.shadowAim(level) && !matchWon, mayFire && !hadur117.core.HybridHooks.externalGun);\n",
    ),
    # External movement: Hadur's shield needs Hadur's body, so it never starts.
    (
        "        this.shield = enemiesTotal == 1 && shieldList != null && !shieldList.isEmpty()\n",
        "        this.shield = !hadur117.core.HybridHooks.externalMove\n"
        "            && enemiesTotal == 1 && shieldList != null && !shieldList.isEmpty()\n",
    ),
]

for old, new in EDITS:
    n = src.count(old)
    if n != 1:
        sys.exit(f"patch-core: expected 1 match, found {n}: {old.strip()[:70]}")
    src = src.replace(old, new)

open(path, "w", encoding="utf-8").write(src)
print(f"patch-core: {len(EDITS)} edits applied to {path}")

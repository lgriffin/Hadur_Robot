package hadur117.micro;

import java.awt.geom.Rectangle2D;
import robocode.AdvancedRobot;
import robocode.BulletHitEvent;
import robocode.Condition;
import robocode.CustomEvent;
import robocode.HitByBulletEvent;
import robocode.Rules;
import robocode.ScannedRobotEvent;
import robocode.util.Utils;

/**
 * Eveimear arm s8: s6 surf with a pattern-matching gun on lateral speed. lean surfer. Guess factors in padded arrays (no clamps), the surf choice by guess-factor
 * arithmetic instead of projected positions, hits segmented by our lateral speed when the enemy fired.
 */
public class Eveimear extends AdvancedRobot {
    // Bins either side of guess factor zero, and the padding that keeps every index in range.
    static final int MID = 12;
    static final int PAD = 100;
    static final double ESCAPE = 0.65;
    static final Rectangle2D.Double FIELD = new Rectangle2D.Double(18, 18, 764, 564);

    static double enemyEnergy, direction = 1, enemyX, enemyY, myX, myY, lastBearing, lastLateral;
    static double[][] surf = new double[5][2 * PAD + 1];
    static Wave surfWave;
    static String history = "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@";

    public void run() {
        setAdjustGunForRobotTurn(true);
        setAdjustRadarForGunTurn(true);
        setTurnRadarRightRadians(Double.POSITIVE_INFINITY);
    }

    public void onScannedRobot(ScannedRobotEvent e) {
        double absBearing, distance, angle, drop, offset, antiRam;
        Wave w;
        distance = e.getDistance();
        absBearing = e.getBearingRadians() + getHeadingRadians();
        myX = getX();
        myY = getY();

        if ((drop = enemyEnergy - (enemyEnergy = e.getEnergy())) > 0 && drop <= 3) {
            addCustomEvent(w = new Wave());
            w.x = enemyX;
            w.y = enemyY;
            w.bearing = lastBearing;
            w.scale = Math.signum(lastLateral + 1e-9) * (w.speed = Rules.getBulletSpeed(drop)) * (MID / ESCAPE / 14);
            w.hits = surf[(int) Math.abs(lastLateral) / 2];
        }

        // Surf the oldest live wave: keep on, or reverse, whichever guess factor its hits have visited least.
        try {
            double at = surfWave.bin(myX, myY), step = direction * Math.signum(surfWave.scale) * (1 - surfWave.travelled / distance) * 10;
            if (surfWave.hits[(int) (at + step)] < surfWave.hits[(int) (at - step)]) {
                direction = -direction;
            }
        } catch (Exception ex) {
        }
        surfWave = null;

        offset = 2 + (antiRam = (int) (100 / distance));
        do {
            angle = absBearing + direction * (offset -= 0.02);
        } while (!FIELD.contains(myX + 160 * Math.sin(angle), myY + 160 * Math.cos(angle)));
        if (offset < 0.9) {
            direction = -direction;
        }
        setTurnRightRadians(Math.tan(angle -= getHeadingRadians()));
        setAhead(Math.copySign(100, Math.cos(angle)));
        lastBearing = absBearing + Math.PI;
        lastLateral = getVelocity() * Math.sin(e.getBearingRadians());

        enemyX = myX + Math.sin(absBearing) * distance;
        enemyY = myY + Math.cos(absBearing) * distance;

        // Gun: pattern matching on the enemy's lateral speed, newest first; find the longest recent
        // run that happened before, then add up what came after it for the bullet's flight.
        int at, length = 30;
        history = String.valueOf((char) ((int) (e.getVelocity() * Math.sin(e.getHeadingRadians() - absBearing)) + 64)).concat(history);
        while ((at = history.indexOf(history.substring(0, --length), 80)) < 0) {
        }
        for (angle = absBearing, offset = 0; (offset += 14) < distance;) {
            angle += (history.charAt(--at) - 64) / distance;
        }
        setTurnGunRightRadians(Utils.normalRelativeAngle(angle - getGunHeadingRadians()));
        setFire(Math.min(Math.min(2 + antiRam, enemyEnergy / 4 + 0.1), getEnergy() - 0.1));
        setTurnRadarLeftRadians(getRadarTurnRemainingRadians());
    }

    public void onBulletHit(BulletHitEvent e) {
        enemyEnergy -= Rules.getBulletDamage(e.getBullet().getPower());
    }

    public void onHitByBullet(HitByBulletEvent e) {
        enemyEnergy += 3 * e.getPower();
        try {
            int at = (int) surfWave.bin(myX, myY);
            for (int i = 2 * PAD; i >= 0; i--) {
                surfWave.hits[i] += 1.0 / ((i - at) * (i - at) + 1);
            }
        } catch (Exception ex) {
        }
    }

    public void onCustomEvent(CustomEvent e) {
        removeCustomEvent(e.getCondition());
    }

    /** An enemy wave at us. */
    static class Wave extends Condition {
        double x, y, bearing, scale, travelled, speed;
        double[] hits;

        /** The padded bin, as a double, of a point on this wave. */
        double bin(double px, double py) {
            return Utils.normalRelativeAngle(Math.atan2(px - x, py - y) - bearing) * scale + PAD + 0.5;
        }

        public boolean test() {
            if ((travelled += speed) > Math.hypot(myX - x, myY - y) + 2 * speed) {
                return true;
            }
            if (surfWave == null) {
                surfWave = this;
            }
            return false;
        }
    }
}

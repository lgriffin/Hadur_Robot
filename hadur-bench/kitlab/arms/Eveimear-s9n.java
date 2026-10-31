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
 * Eveimear arm s9 (all3n): s8 golfed toward 746 B.
 * arithmetic instead of projected positions, hits segmented by our lateral speed when the enemy fired.
 */
public class Eveimear extends AdvancedRobot {
    // Bins either side of guess factor zero, and the padding that keeps every index in range.
    static final int MID = 12;
    static final int PAD = 100;
    static final double ESCAPE = 0.65;
    static final Rectangle2D.Double FIELD = new Rectangle2D.Double(18, 18, 764, 564);

    static double enemyEnergy, direction = 1, enemyX, enemyY, myX, myY, lastLateral;
    static double[] surf = new double[2 * PAD + 1];
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

        if ((drop = enemyEnergy - (enemyEnergy = e.getEnergy())) > 0) {
            addCustomEvent(w = new Wave());
            w.x = enemyX;
            w.y = enemyY;
            w.bearing = absBearing;
            w.scale = Math.copySign((w.speed = Rules.getBulletSpeed(drop)) * (MID / ESCAPE / 14), lastLateral);
            w.hits = surf;
        }

        // Surf the oldest live wave: keep on, or reverse, whichever guess factor its hits have visited least.
        try {
            double at = (w = surfWave).bin(myX, myY), step = direction * w.scale * 0.4;
            double[] h = w.hits;
            if (h[(int) (at + step)] < h[(int) (at - step)]) {
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
        setFire(2 + antiRam);
        setTurnRadarLeftRadians(getRadarTurnRemainingRadians());
    }

    public void onBulletHit(BulletHitEvent e) {
        enemyEnergy -= 10;
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


    /** An enemy wave at us. */
    static class Wave extends Condition {
        double x, y, bearing, scale, travelled, speed;
        double[] hits;

        /** The padded bin, as a double, of a point on this wave. */
        double bin(double px, double py) {
            return Utils.normalRelativeAngle(Math.atan2(x - px, y - py) - bearing) * scale + PAD + 0.5;
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

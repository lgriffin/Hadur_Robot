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
 * Eveimear arm s6: lean surfer. Guess factors in padded arrays (no clamps), the surf choice by guess-factor
 * arithmetic instead of projected positions, hits segmented by our lateral speed when the enemy fired.
 */
public class Eveimear extends AdvancedRobot {
    // Bins either side of guess factor zero, and the padding that keeps every index in range.
    static final int MID = 12;
    static final int PAD = 100;
    static final double ESCAPE = 0.65;
    static final Rectangle2D.Double FIELD = new Rectangle2D.Double(18, 18, 764, 564);

    static double enemyEnergy, direction = 1, lastSpeed, since, enemyX, enemyY, myX, myY, lastBearing, lastLateral;
    static int[][][][] stats = new int[5][5][5][2 * PAD + 1];
    static double[][] surf = new double[5][2 * PAD + 1];
    static Wave surfWave;

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

        addCustomEvent(w = new Wave());
        w.bearing = absBearing;
        w.speed = 14;
        double lateral = e.getVelocity() * Math.sin(e.getHeadingRadians() - absBearing);
        w.scale = Math.signum(lateral + 1e-9) * (MID / ESCAPE);
        enemyX = (w.x = myX) + Math.sin(absBearing) * distance;
        enemyY = (w.y = myY) + Math.cos(absBearing) * distance;
        int history = (int) Math.min(2, since++ / 12);
        if (lastSpeed != (lateral = (int) Math.abs(lateral))) {
            history = lastSpeed > lateral ? 4 : 3;
            since = 0;
        }
        lastSpeed = lateral;
        int[] bins = w.bins = stats[history][(int) lateral / 2][(int) distance / 200];
        int best = PAD;
        for (int i = 2 * PAD; i >= 0; i--) {
            if (bins[i] > bins[best]) {
                best = i;
            }
        }
        setTurnGunRightRadians(Utils.normalRelativeAngle(absBearing - getGunHeadingRadians() + (best - PAD) / w.scale));
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

    /** A wave: ours at the enemy (bins set), or the enemy's at us (hits set). */
    static class Wave extends Condition {
        double x, y, bearing, scale, travelled, speed;
        int[] bins;
        double[] hits;

        /** The padded bin, as a double, of a point on this wave. */
        double bin(double px, double py) {
            return Utils.normalRelativeAngle(Math.atan2(px - x, py - y) - bearing) * scale + PAD + 0.5;
        }

        public boolean test() {
            if (hits != null) {
                if ((travelled += speed) > Math.hypot(myX - x, myY - y) + 2 * speed) {
                    return true;
                }
                if (surfWave == null) {
                    surfWave = this;
                }
                return false;
            }
            if ((travelled += speed) < Math.hypot(enemyX - x, enemyY - y)) {
                return false;
            }
            bins[(int) bin(enemyX, enemyY)]++;
            return true;
        }
    }
}

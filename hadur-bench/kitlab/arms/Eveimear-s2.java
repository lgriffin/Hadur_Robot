package hadur117.micro;

import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import robocode.AdvancedRobot;
import robocode.BulletHitEvent;
import robocode.Condition;
import robocode.CustomEvent;
import robocode.HitByBulletEvent;
import robocode.Rules;
import robocode.ScannedRobotEvent;
import robocode.util.Utils;

/**
 * Eveimear arm s2: s1 without the stop option (surf on or back only).
 */
public class Eveimear extends AdvancedRobot {
    static final int MID = 12;
    static final double ESCAPE = 0.65;
    static final Rectangle2D.Double FIELD = new Rectangle2D.Double(18, 18, 764, 564);

    static double enemyEnergy, direction = 1, lastSpeed, since, enemyX, enemyY, myX, myY, lastBearing, lastDir;
    static int[][][][] stats = new int[5][5][5][2 * MID + 1];
    // Where the enemy's bullets have hit us, by guess factor; a little head-on to start.
    static double[] surf = new double[2 * MID + 1];
    static ArrayList<Wave> waves;

    public void run() {
        waves = new ArrayList<Wave>();
        surf[MID] = 1;
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

        // An enemy shot: a wave from where the enemy was, along last tick's bearing.
        if ((drop = enemyEnergy - (enemyEnergy = e.getEnergy())) > 0 && drop <= 3) {
            (w = new Wave()).x = enemyX;
            w.y = enemyY;
            w.bearing = lastBearing;
            w.dir = lastDir;
            w.speed = Rules.getBulletSpeed(drop);
            addCustomEvent(w);
            waves.add(w);
        }

        // Surf the nearest wave: on, back or stop, whichever lands on the least-hit guess factor.
        offset = 2 + (antiRam = (int) (100 / distance));
        setMaxVelocity(8);
        try {
            w = waves.get(0);
            double t = (Math.hypot(myX - w.x, myY - w.y) - w.travelled) / w.speed * 8,
                    on = surf[w.bin(myX + t * Math.sin(angle = absBearing + direction * 1.4), myY + t * Math.cos(angle))],
                    back = surf[w.bin(myX + t * Math.sin(angle = absBearing - direction * 1.4), myY + t * Math.cos(angle))];
            if (back < on) {
                direction = -direction;
                on = back;
            }
        } catch (Exception ex) {
        }

        do {
            angle = absBearing + direction * (offset -= 0.02);
        } while (!FIELD.contains(myX + 160 * Math.sin(angle), myY + 160 * Math.cos(angle)));
        if (offset < 0.9) {
            direction = -direction;
        }
        setTurnRightRadians(Math.tan(angle -= getHeadingRadians()));
        setAhead(Math.copySign(100, Math.cos(angle)));
        lastBearing = absBearing + Math.PI;
        lastDir = Math.signum(getVelocity() * Math.sin(e.getBearingRadians()) + 1e-9);

        // Gun (EVEIMEAR-6).
        addCustomEvent(w = new Wave());
        w.bearing = absBearing;
        w.speed = 14;
        double lateral = e.getVelocity() * Math.sin(e.getHeadingRadians() - absBearing);
        w.dir = Math.signum(lateral + 1e-9);
        enemyX = (w.x = myX) + Math.sin(absBearing) * distance;
        enemyY = (w.y = myY) + Math.cos(absBearing) * distance;
        int history = (int) Math.min(2, since++ / 12);
        if (lastSpeed != (lateral = (int) Math.abs(lateral))) {
            history = lastSpeed > lateral ? 4 : 3;
            since = 0;
        }
        lastSpeed = lateral;
        int[] bins = w.bins = stats[history][(int) lateral / 2][(int) distance / 200];
        int best = MID;
        for (int i = 2 * MID; i >= 0; i--) {
            if (bins[i] > bins[best]) {
                best = i;
            }
        }
        setTurnGunRightRadians(Utils.normalRelativeAngle(absBearing - getGunHeadingRadians() + w.dir * (best - MID) * (ESCAPE / MID)));
        setFire(Math.min(Math.min(2 + antiRam, enemyEnergy / 4 + 0.1), getEnergy() - 0.1));
        setTurnRadarLeftRadians(getRadarTurnRemainingRadians());
    }

    public void onBulletHit(BulletHitEvent e) {
        enemyEnergy -= Rules.getBulletDamage(e.getBullet().getPower());
    }

    public void onHitByBullet(HitByBulletEvent e) {
        enemyEnergy += 3 * e.getPower();
        try {
            int at = waves.get(0).bin(myX, myY);
            for (int i = 2 * MID; i >= 0; i--) {
                surf[i] += 1.0 / ((i - at) * (i - at) + 1);
            }
        } catch (Exception ex) {
        }
    }

    public void onCustomEvent(CustomEvent e) {
        removeCustomEvent(e.getCondition());
    }

    /** A wave: ours at the enemy (bins set), or the enemy's at us. */
    static class Wave extends Condition {
        double x, y, bearing, dir, travelled, speed;
        int[] bins;

        int bin(double px, double py) {
            return (int) Math.max(0, Math.min(2 * MID,
                    Math.round(Utils.normalRelativeAngle(Math.atan2(px - x, py - y) - bearing) * dir * speed * (MID / ESCAPE / 14)) + MID));
        }

        public boolean test() {
            if (bins == null) {
                if ((travelled += speed) > Math.hypot(myX - x, myY - y) + 2 * speed) {
                    waves.remove(this);
                    return true;
                }
                return false;
            }
            if ((travelled += speed) < Math.hypot(enemyX - x, enemyY - y)) {
                return false;
            }
            bins[bin(enemyX, enemyY)]++;
            return true;
        }
    }
}

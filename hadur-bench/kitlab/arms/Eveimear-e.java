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
 * Eveimear, a MicroRumble 1v1 robot (docs/kitlab.md): stop-and-go that steps once for each enemy
 * shot until the enemy's gun has found it, then random orbit for the rest of the battle, over a
 * GuessFactor gun on Condition waves segmented on velocity history, lateral speed and distance.
 *
 * Ideas taken, with thanks, from open RoboWiki bots: Epeeist and Continuation (Sheldor, RWPCL) for
 * the damage threshold, the anti-ram term and the stick smoothing; Cotillion (Jdev) for the step
 * length; Thorn and HedgehogGF for stop-and-go into random movement. The code is Eveimear's own
 * and ships with its source.
 */
public class Eveimear extends AdvancedRobot {
    // Bins either side of guess factor zero (EVEIMEAR-6).
    static final int MID = 12;
    // The escape angle the bins span, about asin(8 / 14) for the power-2 waves (EVEIMEAR-6).
    static final double ESCAPE = 0.65;
    static final Rectangle2D.Double FIELD = new Rectangle2D.Double(18, 18, 764, 564);

    static double enemyDir, enemyEnergy, direction = 1, damage, mode, lastSpeed, since, enemyX, enemyY;
    // Gun stats [velocity history][lateral speed][distance][bin] (EVEIMEAR-6).
    static int[][][][] stats = new int[5][5][5][2 * MID + 1];

    public void run() {
        setAdjustGunForRobotTurn(true);
        setAdjustRadarForGunTurn(true);
        setTurnRadarRightRadians(Double.POSITIVE_INFINITY);
    }

    public void onScannedRobot(ScannedRobotEvent e) {
        double absBearing, distance, angle, drop, offset, antiRam;
        Wave w;
        addCustomEvent(w = new Wave());
        distance = e.getDistance();
        // Under 100 px the enemy is ramming: retreat hard, keep moving, fire hard (EVEIMEAR-7).
        offset = 2 + (antiRam = (int) (100 / distance));

        // Smoothing: close the angle off the enemy until a 160 px stick stays in the field (EVEIMEAR-5).
        do {
            angle = (w.bearing = absBearing = e.getBearingRadians() + getHeadingRadians()) + direction * (offset -= 0.02);
        } while (!FIELD.contains(getX() + 160 * Math.sin(angle), getY() + 160 * Math.cos(angle)));
        setTurnRightRadians(Math.tan(angle -= getHeadingRadians()));

        // Stop-and-go (EVEIMEAR-2): one step per shot, sized to the bullet's flight; in random mode,
        // or against a rammer, every tick.
        // A shot is any drop in the enemy's energy once our hits and theirs are booked (EVEIMEAR-11).
        if ((drop = enemyEnergy - (enemyEnergy = e.getEnergy())) > mode - antiRam) {
            setAhead(Math.copySign((3 + (int) (drop * 1.999999)) << 3, Math.cos(angle)));
        }
        // Random mode reverses at random (EVEIMEAR-3); a tight wall reverses in either mode (EVEIMEAR-5).
        if (Math.random() + antiRam < 0.08 * -mode || offset < 0.9) {
            direction = -direction;
        }

        // Gun (EVEIMEAR-6).
        double lateral = e.getVelocity() * Math.sin(e.getHeadingRadians() - absBearing);
        w.dir = enemyDir = Math.signum(lateral + enemyDir / 100);
        enemyX = getX() + Math.sin(absBearing) * distance;
        enemyY = getY() + Math.cos(absBearing) * distance;
        w.x = getX();
        w.y = getY();
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
        // Power (EVEIMEAR-7, EVEIMEAR-8): 2, 3 close in, enough to finish, never the last of our energy.
        setFire(Math.min(Math.min(2 + antiRam, enemyEnergy / 4 + 0.1), getEnergy() - 0.1));

        // Radar: turn back as far as it was going to turn on, so it sweeps across the enemy (EVEIMEAR-10).
        setTurnRadarLeftRadians(getRadarTurnRemainingRadians());
    }

    public void onBulletHit(BulletHitEvent e) {
        enemyEnergy -= Rules.getBulletDamage(e.getBullet().getPower());
    }

    public void onHitByBullet(HitByBulletEvent e) {
        double gain;
        enemyEnergy += gain = 3 * e.getPower();
        // Once their hits have won back more than 40 + 23 per round, move at random for good (EVEIMEAR-3).
        if ((damage += gain) > 40 + 23 * getRoundNum()) {
            mode = -1;
        }
    }

    public void onCustomEvent(CustomEvent e) {
        removeCustomEvent(e.getCondition());
    }

    /** A gun wave: one per scan, at 14 px a tick (power 2), logged where the enemy is when it passes. */
    static class Wave extends Condition {
        double x, y, bearing, dir, travelled;
        int[] bins;

        public boolean test() {
            double dx = enemyX - x, dy = enemyY - y;
            if ((travelled += 14) < Math.hypot(dx, dy)) {
                return false;
            }
            bins[(int) Math.max(0, Math.min(2 * MID,
                    Math.round(Utils.normalRelativeAngle(Math.atan2(dx, dy) - bearing) * dir * (MID / ESCAPE)) + MID))]++;
            return true;
        }
    }
}

package hadur117.sepia;

import hadur117.core.physics.DiaUtils;
import hadur117.core.physics.Rules;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * The punch: a plain segmented guess-factor gun, Sepia's stand-in until the design promotes
 * Hadur's gun to the kernel (its stage H2). Every tick it sends a virtual wave from where Sepia
 * stands; when the wave reaches the enemy it records the guess factor the enemy was found at, in
 * a cell of distance, lateral speed and acceleration. It aims at the cell's peak.
 *
 * <p>It also keeps the hit rate of its real shots, which STRIKE-1 weighs against the ink.</p>
 */
public final class PunchGun {

    static final int BINS = 31;
    private static final int DIST = 5, LAT = 5, ACC = 3;
    /** Learnt guess factors: [distance][lateral speed][acceleration][bin]. */
    private final double[][][][] stats = new double[DIST][LAT][ACC][BINS];
    private final double[] global = new double[BINS];
    private final List<GunWave> waves = new ArrayList<>();
    private int shots;
    private int hits;
    private double lastLateral;

    /** A virtual wave on its way to the enemy. */
    private static final class GunWave {
        final Point2D.Double source;
        final long fireTime;
        final double speed;
        final double bearing;
        final int direction;
        final int[] cell;

        GunWave(Point2D.Double source, long fireTime, double speed, double bearing, int direction, int[] cell) {
            this.source = source;
            this.fireTime = fireTime;
            this.speed = speed;
            this.bearing = bearing;
            this.direction = direction;
            this.cell = cell;
        }
    }

    /** Forgets the waves in flight at a round's start; what was learnt stays. */
    public void newRound() {
        waves.clear();
        lastLateral = 0;
    }

    /**
     * One tick with the enemy seen: resolves the waves that reached it, sends a new one, and returns
     * the gun heading for a shot of {@code power} fired next tick from {@code next}.
     *
     * @param time this tick
     * @param next where Sepia will stand when the shot leaves
     * @param enemy the enemy's place
     * @param enemyHeading its heading, radians
     * @param enemyVelocity its velocity, px a tick
     * @param power the power the shot would be
     * @return the gun heading to fire on, radians
     */
    public double aim(long time, Point2D.Double next, Point2D.Double enemy, double enemyHeading,
                      double enemyVelocity, double power) {
        for (Iterator<GunWave> it = waves.iterator(); it.hasNext();) {
            GunWave w = it.next();
            double r = w.speed * (time - w.fireTime);
            if (r < w.source.distance(enemy) - 18) continue;
            double offset = DiaUtils.normalizeAngle(DiaUtils.absoluteBearing(w.source, enemy), w.bearing) - w.bearing;
            double gf = Math.max(-1, Math.min(1, offset / escape(w.speed) * w.direction));
            int bin = (int) Math.round((gf + 1) / 2 * (BINS - 1));
            double[] cell = stats[w.cell[0]][w.cell[1]][w.cell[2]];
            for (int i = 0; i < BINS; i++) {
                double add = 1.0 / (1 + (i - bin) * (i - bin));
                cell[i] = cell[i] * 0.97 + add;
                global[i] = global[i] * 0.99 + add;
            }
            it.remove();
        }
        double bearing = DiaUtils.absoluteBearing(next, enemy);
        double lateral = enemyVelocity * Math.sin(enemyHeading - bearing);
        int direction = lateral >= 0 ? 1 : -1;
        int[] cell = {
            Math.min(DIST - 1, (int) (next.distance(enemy) / 150)),
            Math.min(LAT - 1, (int) (Math.abs(lateral) / 2)),
            Math.abs(lateral) > Math.abs(lastLateral) + 0.5 ? 2 : Math.abs(lateral) < Math.abs(lastLateral) - 0.5 ? 0 : 1
        };
        lastLateral = lateral;
        double speed = Rules.getBulletSpeed(power);
        waves.add(new GunWave(next, time + 1, speed, bearing, direction, cell));
        double[] stat = stats[cell[0]][cell[1]][cell[2]];
        double[] use = sum(stat) > 1e-6 ? stat : global;
        int peak = BINS / 2;
        for (int i = 0; i < BINS; i++) if (use[i] > use[peak]) peak = i;
        double gf = 2.0 * peak / (BINS - 1) - 1;
        return bearing + gf * escape(speed) * direction;
    }

    /** A real shot left. */
    public void fired() {
        shots++;
    }

    /** A real shot hit the enemy. */
    public void hit() {
        hits++;
    }

    /** The hit rate of the real shots, pulled toward 12% while there are few. */
    public double hitRate() {
        return (hits + 1.2) / (shots + 10.0);
    }

    private static double escape(double speed) {
        return Math.asin(8.0 / speed);
    }

    private static double sum(double[] a) {
        double s = 0;
        for (double v : a) s += v;
        return s;
    }
}

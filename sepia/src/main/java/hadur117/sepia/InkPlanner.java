package hadur117.sepia;

import hadur117.core.move.BulletShadows;
import hadur117.core.move.OurBullet;
import hadur117.core.physics.DiaUtils;
import hadur117.core.physics.Rules;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;

/**
 * The ink planner (INK-1 to INK-5): where to aim a 0.1 bullet so that it stops the most danger
 * over the landings Sepia has fixed.
 *
 * <p>The engine destroys two bullets whose segments of the same turn cross. A bullet of the enemy's
 * wave flies on a ray from the wave's source, so to stop the bullets aimed at a bearing in the hit
 * set, our bullet must cross that bearing inside the ring the wave sweeps on the same turn. The
 * planner solves for those crossings rather than sweeping every angle: for each wave, at the hit
 * set's middle and both edges, it finds the turn on which our bullet can be where that bearing's
 * bullet is, and aims there (INK-3). Each candidate is then scored with the kernel's
 * {@link BulletShadows} over every wave in flight: the share of each hit set it newly shades,
 * walked only before the wave can meet the body (INK-5), times the chance that wave's bullet is on
 * the body and its damage (INK-1).</p>
 *
 * <p>Stateless apart from its inputs; each call builds its candidates afresh.</p>
 */
public final class InkPlanner {

    /** INK-2: every ink shot is the weakest bullet, the fastest and the quickest to reload. */
    public static final double INK_POWER = Rules.MIN_BULLET_POWER;
    /** INK-3: the most candidates evaluated for one shot. */
    public static final int MAX_CANDIDATES = 64;
    /** How far inside each edge of the hit set the edge candidates aim, as a share of its width. */
    static final double EDGE_INSET = 0.12;

    private final double fieldWidth;
    private final double fieldHeight;

    /**
     * A planner for a field of the given size.
     *
     * @param fieldWidth the field's width, px
     * @param fieldHeight the field's height, px
     */
    public InkPlanner(double fieldWidth, double fieldHeight) {
        this.fieldWidth = fieldWidth;
        this.fieldHeight = fieldHeight;
    }

    /** One planned shot: its aim, and what it adds over the waves it was scored on. */
    public static final class Shot {
        /** The gun heading to fire on, radians. */
        public final double aim;
        /** The expected bullets stopped: the sum over waves of new shade times aim belief. */
        public final double stopped;
        /** The same, weighted by each bullet's damage plus the energy it would have returned. */
        public final double worth;
        /** The new shade per wave, in the order of the waves given. */
        public final double[] gains;

        Shot(double aim, double stopped, double worth, double[] gains) {
            this.aim = aim;
            this.stopped = stopped;
            this.worth = worth;
            this.gains = gains;
        }

        /** The share of hit set it newly shades, summed over the waves. */
        public double newShade() {
            double sum = 0;
            for (double g : gains) sum += g;
            return sum;
        }
    }

    /**
     * The best ink aim for a shot leaving {@code from} on tick {@code fireTime}, or null when no
     * candidate shades anything.
     *
     * @param waves the waves to shade; each must have its landing fixed and its shadows current
     * @param fireTime the tick the shot would leave on
     * @param from where Sepia would stand that tick
     * @param gunHeading the gun's heading now, radians
     * @param maxGunTurn how far the gun can turn before {@code fireTime}, radians
     * @param belief where the enemy aims
     * @return the best shot, or null
     */
    public Shot best(List<InkWave> waves, long fireTime, Point2D.Double from, double gunHeading,
                     double maxGunTurn, AimBelief belief) {
        List<InkWave> live = new ArrayList<>();
        for (InkWave w : waves) {
            if (w.committed && !w.met && !w.hit && w.arrival > fireTime + 1) live.add(w);
        }
        if (live.isEmpty()) return null;
        double[] mass = new double[live.size()];
        double[] before = new double[live.size()];
        for (int i = 0; i < live.size(); i++) {
            InkWave w = live.get(i);
            mass[i] = belief.mass(w.wave, w.lo, w.hi);
            before[i] = w.shaded();
        }
        Shot best = null;
        for (double aim : candidates(live, fireTime, from)) {
            if (Math.abs(DiaUtils.normalizeAngle(aim, gunHeading) - gunHeading) > maxGunTurn + 1e-9) continue;
            Shot s = score(live, mass, before, fireTime, from, aim);
            if (s.stopped > 0 && (best == null || s.worth > best.worth)) best = s;
        }
        return best;
    }

    /**
     * Scores one aim over {@code live}: the share of each hit set it shades that the bullets in the
     * air do not, walked before the wave meets the body.
     */
    Shot score(List<InkWave> live, double[] mass, double[] before, long fireTime,
               Point2D.Double from, double aim) {
        OurBullet ink = new OurBullet(fireTime, from, aim, INK_POWER);
        List<OurBullet> one = List.of(ink);
        double stopped = 0, worth = 0;
        double[] gains = new double[live.size()];
        for (int i = 0; i < live.size(); i++) {
            InkWave w = live.get(i);
            long stop = w.arrival;
            List<List<double[]>> s = BulletShadows.of(w.wave, one, b -> stop, fieldWidth, fieldHeight);
            if (s.get(1).isEmpty()) continue;
            double after = Arcs.shade(w.lo, w.hi, Arcs.join(w.certain, s.get(0)), Arcs.join(w.possible, s.get(1)));
            double gain = Math.max(0, after - before[i]);
            gains[i] = gain;
            stopped += gain * mass[i];
            worth += gain * mass[i] * (w.damage + Rules.getBulletHitBonus(w.power()));
        }
        return new Shot(aim, stopped, worth, gains);
    }

    /**
     * INK-3: the candidate aims, at most {@link #MAX_CANDIDATES}, nearest wave first. For each wave
     * and each of three bearings in its hit set, the aim that puts our bullet on that bearing's
     * bullet on the turn the two can first share a ring, and on the turn after.
     */
    List<Double> candidates(List<InkWave> live, long fireTime, Point2D.Double from) {
        List<InkWave> order = new ArrayList<>(live);
        order.sort((a, b) -> Long.compare(a.arrival, b.arrival));
        List<Double> out = new ArrayList<>();
        double speed = Rules.getBulletSpeed(INK_POWER);
        for (InkWave w : order) {
            double width = w.hi - w.lo;
            double[] bearings = {w.lo + EDGE_INSET * width, (w.lo + w.hi) / 2, w.hi - EDGE_INSET * width};
            for (double bearing : bearings) {
                for (double aim : meet(w, bearing, fireTime, from, speed)) {
                    out.add(aim);
                    if (out.size() >= MAX_CANDIDATES) return out;
                }
            }
        }
        return out;
    }

    /**
     * The aims that put a bullet of {@code speed}, leaving {@code from} on {@code fireTime}, where
     * the wave's bullet on {@code bearing} is: at the turn the two first meet, solved between
     * whole turns, and half a turn later. Empty when our bullet cannot reach that bullet before the
     * wave meets the body.
     */
    static List<Double> meet(InkWave w, double bearing, long fireTime, Point2D.Double from, double speed) {
        Point2D.Double s = w.wave.sourceLocation;
        double sx = Math.sin(bearing), sy = Math.cos(bearing);
        double prev = Double.NaN;
        List<Double> out = new ArrayList<>(2);
        for (long k = fireTime + 1; k <= w.arrival; k++) {
            // How far our bullet is short of the enemy bullet's point at the end of turn k.
            double r = w.wave.distanceTraveled(k);
            double gap = Math.hypot(s.x + sx * r - from.x, s.y + sy * r - from.y) - speed * (k - fireTime);
            if (gap <= 0) {
                // Already within reach on the first turn: meet it half-way through that turn.
                double tk = Double.isNaN(prev) ? k - 0.5 : (k - 1) + prev / (prev - gap);
                out.add(aimAt(w, sx, sy, tk, from));
                out.add(aimAt(w, sx, sy, Math.min(w.arrival, tk + 0.5), from));
                return out;
            }
            prev = gap;
        }
        return out;
    }

    /** The bearing from {@code from} to where the wave's bullet on (sx, sy) is at time {@code t}. */
    private static double aimAt(InkWave w, double sx, double sy, double t, Point2D.Double from) {
        Point2D.Double s = w.wave.sourceLocation;
        double r = w.wave.bulletSpeed() * (t - w.wave.fireTime);
        return DiaUtils.absoluteBearing(from, new Point2D.Double(s.x + sx * r, s.y + sy * r));
    }
}

package hadur117.core.melee;

import hadur117.core.melee.MinimumRiskMovement.Wave;
import hadur117.core.physics.Angles;
import hadur117.core.physics.BattleField;
import hadur117.core.physics.DiaUtils;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

/**
 * MMOVE-28: the step surf, the melee mover behind {@link MinimumRiskMovement#STEP_SURF}. Where
 * the ring mover ranks 160 points by a risk sum and hands eight to the waves, this one tries
 * {@link #STEP} px steps in five directions (the anti-gravity direction with a weak pull to the
 * nearest corner, on, back, and either side), drives each through the {@link #WAVES} waves that
 * reach Hadur soonest, and scores the path by the damage those waves put on it and the crowd
 * it drives into:
 * <pre>
 *   danger = (WAVE_K x waveDamage / damageInAir + crowd / crowdNow) x (1 + crowd / crowdNow)
 * </pre>
 * where {@code crowd} along the path is, summed over the opponents,
 * {@code clamp(their energy / ours, CROWD_MIN, CROWD_MAX) / d^2} plus a collision penalty. The
 * step is chosen again every tick. No wall, corner or centre term: the posture comes out of the
 * candidates and the crowd. The idea is the melee top's (docs/bench/scalarr-melee-decompile.md,
 * section 3); the code is Hadur's own.
 */
final class StepSurf {
    static final double STEP = 140;
    static final int WAVES = 9;
    static final long WAVE_SPAN = 30;
    static final int TICKS = 130;
    static final double WAVE_K = 20;
    static final double CROWD_MIN = 0.25, CROWD_MAX = 4;
    static final double TOUCH = 52, TOUCH_K = 100, COLLIDE = 37, COLLIDE_K = 100_000;
    static final double CORNER_PULL = 0.5, CORNER_SOFT = 500;
    static final double MAX_SPEED = 8, ACCEL = 1, DECEL = 2;
    /** The seam's speed cap while the turn left is over 45 degrees. */
    static final double TURN_SPEED = 4;
    /** A move slower than this a tick counts as standing: the step's own direction replaces the heading. */
    static final double STILL = 0.5;
    /** Wall smoothing: the step turns in these increments, up to a right angle, to stay inside the margin. */
    static final double SMOOTH_TURN = Math.PI / 18;
    static final int SMOOTH_STEPS = 9;

    /**
     * The chance a shot is at Hadur given k living opponents nearer its shooter, from 63,408
     * traced census shots (docs/bench/melee-top3.md): the surf rides every shot at this weight,
     * where the ring mover drops a shot under 1/(1+k)^2 = 0.1.
     */
    static final double[] AIMED = {1, 0.42, 0.29, 0.25, 0.25, 0.21, 0.19, 0.19, 0.15};

    private StepSurf() {}

    static double aimedWeight(int k) {
        return AIMED[Math.min(k, AIMED.length - 1)];
    }

    /** One opponent as the surf sees it. */
    static final class Foe {
        final Point2D.Double at;
        final double energy;
        Foe(Point2D.Double at, double energy) {
            this.at = at;
            this.energy = energy;
        }
    }

    /**
     * The step to drive to. {@code prev} is Hadur's position a tick ago, or null; {@code clip}
     * keeps a point inside the field's margin.
     */
    static Point2D.Double choose(Point2D.Double me, Point2D.Double prev, double energy, List<Foe> foes,
                                 long now, List<Wave> waves, BattleField field, UnaryOperator<Point2D.Double> clip) {
        List<Wave> soon = soonest(me, waves);
        double inAir = 0;
        for (Wave w : soon) inAir += w.damage;
        double crowdNow = Math.max(1e-9, crowd(me, energy, foes));
        Point2D.Double best = null;
        double bestDanger = Double.POSITIVE_INFINITY;
        for (Point2D.Double to : candidates(me, prev, foes, field, clip)) {
            double[] path = drive(me, prev, to, energy, foes, now, soon);
            double crowd = path[1] / crowdNow;
            double danger = ((inAir > 0 ? WAVE_K * path[0] / inAir : 0) + crowd) * (1 + crowd);
            if (danger < bestDanger) {
                bestDanger = danger;
                best = to;
            }
        }
        return best;
    }

    /** The five steps: anti-gravity with the corner pull, on, back, left and right; each clipped. */
    static List<Point2D.Double> candidates(Point2D.Double me, Point2D.Double prev, List<Foe> foes,
                                           BattleField field, UnaryOperator<Point2D.Double> clip) {
        double away = antiGravity(me, foes, field);
        double heading = away;
        if (prev != null) {
            double moved = me.distance(prev);
            if (moved >= STILL && moved <= MAX_SPEED + 0.5) heading = Math.atan2(me.x - prev.x, me.y - prev.y);
        }
        List<Point2D.Double> out = new ArrayList<>(5);
        out.add(smooth(me, away, field, clip));
        for (double turn : new double[] {0, Math.PI, Math.PI / 2, -Math.PI / 2}) {
            out.add(smooth(me, heading + turn, field, clip));
        }
        return out;
    }

    /**
     * A full {@link #STEP} at {@code angle}, turned the least that keeps it inside the field's
     * margin (the wall slides the step along itself instead of cutting it short, which left the
     * first build standing in corners); clipped only when no turn within a right angle fits.
     */
    static Point2D.Double smooth(Point2D.Double me, double angle, BattleField field, UnaryOperator<Point2D.Double> clip) {
        for (int k = 0; k <= SMOOTH_STEPS; k++) {
            for (double sign : new double[] {1, -1}) {
                Point2D.Double p = DiaUtils.project(me, angle + sign * k * SMOOTH_TURN, STEP);
                if (p.x >= MinimumRiskMovement.WALL_MARGIN && p.x <= field.width - MinimumRiskMovement.WALL_MARGIN
                    && p.y >= MinimumRiskMovement.WALL_MARGIN && p.y <= field.height - MinimumRiskMovement.WALL_MARGIN) {
                    return p;
                }
                if (k == 0) break;
            }
        }
        return clip.apply(DiaUtils.project(me, angle, STEP));
    }

    /** The direction pushed by every opponent at 1/d^2 and drawn weakly to the nearest corner. */
    static double antiGravity(Point2D.Double me, List<Foe> foes, BattleField field) {
        double gx = 0, gy = 0;
        for (Foe f : foes) {
            double dx = me.x - f.at.x, dy = me.y - f.at.y;
            double d = Math.max(1, Math.hypot(dx, dy));
            gx += dx / (d * d * d);
            gy += dy / (d * d * d);
        }
        double cx = me.x < field.width / 2 ? 0 : field.width;
        double cy = me.y < field.height / 2 ? 0 : field.height;
        double dx = cx - me.x, dy = cy - me.y;
        double d = Math.max(1, Math.hypot(dx, dy));
        double pull = CORNER_PULL / (CORNER_SOFT + d * d);
        gx += pull * dx / d;
        gy += pull * dy / d;
        if (gx == 0 && gy == 0) return 0;
        return Math.atan2(gx, gy);
    }

    /** The {@link #WAVES} waves that reach {@code me} first, none more than {@link #WAVE_SPAN} ticks after the first. */
    static List<Wave> soonest(Point2D.Double me, List<Wave> waves) {
        List<Wave> sorted = new ArrayList<>(waves);
        sorted.sort((a, b) -> Double.compare(arrival(me, a), arrival(me, b)));
        List<Wave> out = new ArrayList<>();
        for (Wave w : sorted) {
            if (out.size() >= WAVES) break;
            if (!out.isEmpty() && arrival(me, w) - arrival(me, out.get(0)) > WAVE_SPAN) break;
            out.add(w);
        }
        return out;
    }

    static double arrival(Point2D.Double me, Wave w) {
        return w.fireTime + me.distance(w.source) / w.speed;
    }

    /** The crowd at {@code p}: each opponent's energy against ours over its distance squared, plus collision penalties. */
    static double crowd(Point2D.Double p, double energy, List<Foe> foes) {
        double sum = 0;
        for (Foe f : foes) {
            double d = Math.max(1, p.distance(f.at));
            sum += DiaUtils.limit(CROWD_MIN, f.energy / Math.max(1e-9, energy), CROWD_MAX) / (d * d);
            if (d < TOUCH) sum += TOUCH_K;
            if (d < COLLIDE) sum += COLLIDE_K;
        }
        return sum;
    }

    /**
     * Drive from {@code me} to {@code to} the way the seam drives (MeleeSeam.goTo): the body turns
     * toward the step at Robocode's rate (10 - 0.75 |v| degrees a tick), backwards when that is
     * the shorter turn, at most 4 px a tick while the turn left is over 45 degrees, 1 px a tick
     * faster to 8 and braking 2 a tick (through zero on a reversal), for at most {@link #TICKS}
     * ticks or until the waves have passed: the waves' damage on the way, and the mean crowd
     * along the path. The first build turned on the spot at full speed, so it chose side steps
     * the robot could not make in time.
     */
    static double[] drive(Point2D.Double me, Point2D.Double prev, Point2D.Double to, double energy,
                          List<Foe> foes, long now, List<Wave> waves) {
        boolean[] done = new boolean[waves.size()];
        double x = me.x, y = me.y;
        double heading = Math.atan2(to.x - me.x, to.y - me.y);
        double v = 0;
        if (prev != null) {
            double moved = me.distance(prev);
            if (moved >= STILL && moved <= MAX_SPEED + 0.5) {
                heading = Math.atan2(me.x - prev.x, me.y - prev.y);
                v = moved;
            }
        }
        double waveDamage = 0, crowd = 0;
        int ticks = 0;
        for (int t = 1; t <= TICKS; t++) {
            double left = Math.hypot(to.x - x, to.y - y);
            if (left > 0.01) {
                double turn = Angles.normalRelativeAngle(Math.atan2(to.x - x, to.y - y) - heading);
                double want = 1;
                if (Math.abs(turn) > Math.PI / 2) {
                    turn = Angles.normalRelativeAngle(turn + Math.PI);
                    want = -1;
                }
                double rate = Math.toRadians(10 - 0.75 * Math.abs(v));
                heading += DiaUtils.limit(-rate, turn, rate);
                double cap = Math.abs(turn) > Math.PI / 4 ? TURN_SPEED : MAX_SPEED;
                double stopIn = v * v / (2 * DECEL);
                if (v * want < 0) v = v > 0 ? Math.max(0, v - DECEL) : Math.min(0, v + DECEL);
                else if (left <= stopIn) v = want * Math.max(0, Math.abs(v) - DECEL);
                else v = want * Math.min(cap, Math.abs(v) + ACCEL);
                if (Math.abs(v) > cap) v = want * Math.max(cap, Math.abs(v) - DECEL);
                double step = Math.min(Math.abs(v), left) * Math.signum(v == 0 ? 1 : v);
                x += Math.sin(heading) * step;
                y += Math.cos(heading) * step;
            } else {
                v = 0;
            }
            crowd += crowd(new Point2D.Double(x, y), energy, foes);
            ticks = t;
            waveDamage += MinimumRiskMovement.waveHits(x, y, now + t, waves, done);
            boolean all = true;
            for (boolean b : done) all &= b;
            if (all && left <= 0.01) break;
        }
        return new double[] {waveDamage, crowd / Math.max(1, ticks)};
    }
}

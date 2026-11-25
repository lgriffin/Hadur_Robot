package hadur117.core.melee;

import hadur117.core.physics.Angles;
import hadur117.core.physics.BattleField;
import hadur117.core.physics.DiaUtils;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;

/**
 * TMODE-62, the running dodge: a team member picks a curve, not a point.
 *
 * <p>The team dodge (TMODE-27) scores a ring of points every tick and drives to the best, so the
 * chosen point jumps while a bullet flies and the member brakes and turns for each jump. Here the
 * choice is one of six curves round a reference robot, each flown at full speed: clockwise or
 * counter-clockwise, and on the circle, leaning out or leaning in. The reference is the source of
 * the next shot profile to reach the member; with no profile in the air the dodge's own point
 * choice plays, so the member still takes up its place between shots. Each curve is driven
 * through the shot profiles and the teammates' bullets as the dodge drives its candidates, and
 * scored the same way. The curve held is kept unless another scores better by
 * {@link #COMMIT_MARGIN}, so a member turns back only when the curve it is on is the one
 * predicted to be hit; when the reference changes, the curve held is the one that carries on the
 * member's motion.</p>
 *
 * <p>Team-only: it plays only with a living teammate, under DODGE with RUN, and RUN is in no
 * shipped entry.</p>
 */
final class TeamRun {

    /** How far ahead of the member, px, a curve's drive point lies: 20 ticks at full speed, so the drive never brakes for it. */
    static final double REACH = 160;
    /** The lean of the three curves each way, radians off the tangent: on the circle, out, in. */
    static final double[] LEAN = {0, 0.35, -0.35};
    /**
     * How much better than the held curve another must score to replace it, in the score's units
     * (a risk of one median, or a third of the median damage).
     */
    static final double COMMIT_MARGIN = 1.5;
    /** A drive point nearer a wall than this, px, is swung inward round the reference. */
    static final double WALL = 90;
    /** A curve that passes within {@link #MATE_RANGE} px of a teammate's predicted track in its first {@link TeamRisk#PATH_TICKS} ticks pays this, in the score's units. */
    static final double MATE_BLOCK = 2.0;
    static final double MATE_RANGE = 60;
    /** The speed, px a tick, from which the member's own motion names the curve held. */
    static final double MOVING = 1;
    /** The swing of one wall-smoothing step, radians, and the most steps taken. */
    static final double SMOOTH_STEP = 0.1;
    static final int SMOOTH_MAX = 16;

    private final BattleField field;
    /** The curve held: an index into {@link #candidates}, or -1 for none. */
    private int held = -1;
    /** The reference the held curve was last flown round. */
    private Point2D.Double lastRef;

    TeamRun(BattleField field) {
        this.field = field;
    }

    void newRound() {
        release();
    }

    int held() {
        return held;
    }

    /**
     * The point the curves run round: the source of the profile whose front reaches {@code me}
     * first; null with none still to come.
     */
    static Point2D.Double reference(Point2D.Double me, long now, List<MinimumRiskMovement.Wave> waves) {
        Point2D.Double best = null;
        double soonest = Double.POSITIVE_INFINITY;
        for (MinimumRiskMovement.Wave w : waves) {
            double left = me.distance(w.source) - w.speed * (now - w.fireTime);
            if (left <= 0) continue;
            double ticks = left / w.speed;
            if (ticks < soonest) {
                soonest = ticks;
                best = w.source;
            }
        }
        return best;
    }

    /**
     * The six drive points from {@code me} round {@code ref}: clockwise first, then
     * counter-clockwise, each in {@link #LEAN}'s order, {@link #REACH} px off, swung inward in
     * steps while they lie within {@link #WALL} px of a wall.
     */
    List<Point2D.Double> candidates(Point2D.Double me, Point2D.Double ref) {
        double radial = DiaUtils.absoluteBearing(ref, me);
        List<Point2D.Double> out = new ArrayList<>(2 * LEAN.length);
        for (int d = 1; d >= -1; d -= 2) {
            for (double lean : LEAN) {
                double off = Math.PI / 2 - lean;
                Point2D.Double p = DiaUtils.project(me, radial + d * off, REACH);
                for (int k = 0; k < SMOOTH_MAX && !inside(p); k++) {
                    off += SMOOTH_STEP;
                    p = DiaUtils.project(me, radial + d * off, REACH);
                }
                out.add(clip(p));
            }
        }
        return out;
    }

    /** Whether {@code path} comes within {@link #MATE_RANGE} px of a teammate's predicted place on the same tick, in its first {@link TeamRisk#PATH_TICKS} ticks. */
    static boolean crossesMate(double[][] path, MinimumRiskMovement.View v) {
        int ticks = Math.min(TeamRisk.PATH_TICKS, path.length);
        for (hadur117.core.world.Roster.Mate m : v.mates) {
            for (int t = 0; t < ticks; t++) {
                Point2D.Double q = m.at(v.now + t + 1);
                if (Math.hypot(path[t][0] - q.x, path[t][1] - q.y) < MATE_RANGE) return true;
            }
        }
        return false;
    }

    private boolean inside(Point2D.Double p) {
        return p.x >= WALL && p.x <= field.width - WALL && p.y >= WALL && p.y <= field.height - WALL;
    }

    private Point2D.Double clip(Point2D.Double p) {
        return new Point2D.Double(DiaUtils.limit(WALL, p.x, field.width - WALL),
            DiaUtils.limit(WALL, p.y, field.height - WALL));
    }

    /**
     * The curve to fly from the candidates' {@code risk} and profile {@code damage}, scored as
     * the dodge scores ({@link MinimumRiskMovement#waveScores}); the curve held keeps its place
     * unless another scores better by the margin. Holds the pick.
     */
    int pick(double[] risk, double[] damage) {
        return pick(risk, damage, new double[risk.length]);
    }

    /** As above, with each curve's {@code penalty} added to its score. */
    int pick(double[] risk, double[] damage, double[] penalty) {
        double[] score = MinimumRiskMovement.waveScores(risk, damage);
        for (int k = 0; k < score.length; k++) score[k] += penalty[k];
        int best = 0;
        for (int k = 1; k < score.length; k++) {
            if (score[k] < score[best]) best = k;
        }
        if (held >= 0 && held < score.length
                && score[best] > score[held] - COMMIT_MARGIN) {
            best = held;
        }
        held = best;
        return best;
    }

    /** Whether a profile's front has still to reach {@code me}: only then does the running dodge play. */
    static boolean inAir(Point2D.Double me, long now, List<MinimumRiskMovement.Wave> waves) {
        return reference(me, now, waves) != null;
    }

    /** Drops the curve held, when the dodge's own choice plays instead. */
    void release() {
        held = -1;
        lastRef = null;
    }

    /**
     * This tick's drive point for the member in {@code v}, through {@code waves} and the
     * teammates' bullets in {@code v}; a profile must be in the air ({@link #inAir}).
     */
    Point2D.Double choose(MinimumRiskMovement move, MinimumRiskMovement.View v,
                          List<MinimumRiskMovement.Wave> waves) {
        Point2D.Double ref = reference(v.me, v.now, waves);
        if (ref == null || ref.distance(v.me) < 1e-9) {
            release();
            return v.me;
        }
        List<Point2D.Double> pool = candidates(v.me, ref);
        double[] risk = new double[pool.size()];
        double[] damage = new double[pool.size()];
        double[] penalty = new double[pool.size()];
        int ticks = Math.max(MinimumRiskMovement.WAVE_TICKS, TeamRisk.PATH_TICKS);
        for (int k = 0; k < pool.size(); k++) {
            Point2D.Double p = pool.get(k);
            double[][] path = move.drivePath(v, p, ticks);
            risk[k] = move.risk(p, v);
            damage[k] = MinimumRiskMovement.waveDamage(path, v.now, waves);
            if (!v.pathBullets.isEmpty()) risk[k] += TeamRisk.PATH_K * TeamRisk.pathDamage(path, v.now, v.pathBullets);
            if (crossesMate(path, v)) penalty[k] = MATE_BLOCK;
        }
        if (lastRef != null && lastRef.distance(ref) > 0.5) held = along(v.me, v.heading, v.velocity, pool, held);
        lastRef = ref;
        return pool.get(pick(risk, damage, penalty));
    }

    /**
     * The curve that carries on the member's motion: the candidate whose drive point lies nearest
     * the direction it is travelling, so the curve held follows the member when the reference
     * changes; {@code fallback} when it is all but stopped.
     */
    static int along(Point2D.Double me, double heading, double velocity, List<Point2D.Double> pool, int fallback) {
        if (Math.abs(velocity) < MOVING) return fallback;
        double dir = velocity < 0 ? heading + Math.PI : heading;
        int best = fallback;
        double least = Double.POSITIVE_INFINITY;
        for (int k = 0; k < pool.size(); k++) {
            double off = Math.abs(Angles.normalRelativeAngle(DiaUtils.absoluteBearing(me, pool.get(k)) - dir));
            if (off < least) {
                least = off;
                best = k;
            }
        }
        return best;
    }
}

package hadur117.core.melee;

import hadur117.core.physics.BattleField;
import hadur117.core.physics.DiaUtils;
import hadur117.core.world.EnemyInfo;
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
 * the next shot profile to reach the member, or the nearest enemy when none is in the air. Each
 * curve is driven through the shot profiles and the teammates' bullets as the dodge drives its
 * candidates, and scored the same way. The curve held is kept unless another scores better by
 * {@link #COMMIT_MARGIN} while a profile is in the air ({@link #IDLE_MARGIN} otherwise), so a
 * member turns back only when the curve it is on is the one predicted to be hit.</p>
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
     * How much better than the held curve another must score to replace it while a shot profile
     * is in the air, in the score's units (a risk of one median, or a third of the median damage).
     */
    static final double COMMIT_MARGIN = 1.5;
    /** The same with nothing in the air. */
    static final double IDLE_MARGIN = 0.3;
    /** A drive point nearer a wall than this, px, is swung inward round the reference. */
    static final double WALL = 40;
    /** The swing of one wall-smoothing step, radians, and the most steps taken. */
    static final double SMOOTH_STEP = 0.1;
    static final int SMOOTH_MAX = 16;

    private final BattleField field;
    /** The curve held: an index into {@link #candidates}, or -1 for none. */
    private int held = -1;

    TeamRun(BattleField field) {
        this.field = field;
    }

    void newRound() {
        held = -1;
    }

    int held() {
        return held;
    }

    /**
     * The robot the curves run round: the source of the profile whose front reaches {@code me}
     * first, or with none still to come the nearest enemy; null with neither.
     */
    static Point2D.Double reference(Point2D.Double me, long now, List<MinimumRiskMovement.Wave> waves,
                                    List<EnemyInfo> enemies) {
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
        if (best != null) return best;
        double nearest = Double.POSITIVE_INFINITY;
        for (EnemyInfo e : enemies) {
            double d = e.location.distance(me);
            if (d < nearest) {
                nearest = d;
                best = e.location;
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
    int pick(double[] risk, double[] damage, boolean inAir) {
        double[] score = MinimumRiskMovement.waveScores(risk, damage);
        int best = 0;
        for (int k = 1; k < score.length; k++) {
            if (score[k] < score[best]) best = k;
        }
        if (held >= 0 && held < score.length
                && score[best] > score[held] - (inAir ? COMMIT_MARGIN : IDLE_MARGIN)) {
            best = held;
        }
        held = best;
        return best;
    }

    /** This tick's drive point for the member in {@code v}, through {@code waves} and the teammates' bullets in {@code v}. */
    Point2D.Double choose(MinimumRiskMovement move, MinimumRiskMovement.View v,
                          List<MinimumRiskMovement.Wave> waves, List<EnemyInfo> enemies) {
        Point2D.Double ref = reference(v.me, v.now, waves, enemies);
        if (ref == null || ref.distance(v.me) < 1e-9) {
            held = -1;
            return v.me;
        }
        List<Point2D.Double> pool = candidates(v.me, ref);
        double[] risk = new double[pool.size()];
        double[] damage = new double[pool.size()];
        int ticks = Math.max(MinimumRiskMovement.WAVE_TICKS, TeamRisk.PATH_TICKS);
        for (int k = 0; k < pool.size(); k++) {
            Point2D.Double p = pool.get(k);
            double[][] path = move.drivePath(v, p, ticks);
            risk[k] = move.risk(p, v);
            damage[k] = MinimumRiskMovement.waveDamage(path, v.now, waves);
            if (!v.pathBullets.isEmpty()) risk[k] += TeamRisk.PATH_K * TeamRisk.pathDamage(path, v.now, v.pathBullets);
        }
        boolean inAir = false;
        for (MinimumRiskMovement.Wave w : waves) {
            if (v.me.distance(w.source) - w.speed * (v.now - w.fireTime) > 0) inAir = true;
        }
        return pool.get(pick(risk, damage, inAir));
    }
}

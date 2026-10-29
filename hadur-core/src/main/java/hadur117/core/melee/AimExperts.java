package hadur117.core.melee;

import hadur117.core.model.RobotState;
import hadur117.core.model.RobotStateLog;
import hadur117.core.physics.Angles;
import hadur117.core.physics.BattleField;
import hadur117.core.physics.DiaUtils;
import hadur117.core.world.EnemyShot;
import java.awt.geom.Point2D;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * TMODE-27, Ogi's danger model: the ways an enemy class may aim at a member, each weighted by
 * how well it has called the bullets that hit the team.
 *
 * <p>Six experts: five simple aims (head-on, linear, circular, linear at the average velocity
 * of the last {@link #AVERAGE_TICKS} ticks, linear at half speed) and the team's learned
 * aims ({@link TeamDanger}). When an enemy bullet hits a member, the member works out where
 * each expert would have aimed at it when the shot was fired, and how far off each was in
 * bot widths ({@link #errors}); those errors travel with the hit's sample, so every member
 * scores the experts on the whole team's hits. Each class's experts carry a decayed loss
 * ({@link #DECAY} a hit), and an expert's weight is {@code exp(-}{@link #ETA}{@code  x loss)}:
 * the aims that keep missing fade, the ones that keep hitting take the profile. Pooled by
 * class ({@link TeamModes#key}), so every copy of an enemy teaches the rest.</p>
 */
public final class AimExperts {

    /** The experts, in the order of every errors and weights array. */
    public enum Expert { HEAD_ON, LINEAR, CIRCULAR, AVERAGE, HALF, LEARNED }

    public static final int COUNT = Expert.values().length;
    /** How much a hit's loss counts against an expert's weight. */
    static final double ETA = 1.0;
    /** Each new hit on a class keeps this share of its experts' earlier losses. */
    static final double DECAY = 0.95;
    /** Ticks the averaged-velocity expert looks back over. */
    static final int AVERAGE_TICKS = 16;
    /** An expert within this many bot widths of the bullet called it: no loss. */
    static final double HIT_WIDTHS = 1.0;
    /** Bot widths past {@link #HIT_WIDTHS} at which an expert's loss reaches 1. */
    static final double MISS_WIDTHS = 2.0;

    private final Map<String, double[]> losses = new HashMap<>();

    /** The decayed loss of each expert against {@code shooter}'s class; zeros before any hit. */
    double[] losses(String shooter) {
        double[] l = losses.get(TeamModes.key(shooter));
        return l == null ? new double[COUNT] : l.clone();
    }

    /**
     * Scores the experts on one hit: {@code errors} in bot widths, NaN for an expert that had
     * no aim then (the learned one before its log fills). Such an expert's loss stands.
     */
    public void observe(String shooter, double[] errors) {
        if (errors == null || errors.length != COUNT) return;
        double[] l = losses.computeIfAbsent(TeamModes.key(shooter), k -> new double[COUNT]);
        for (int e = 0; e < COUNT; e++) {
            if (Double.isNaN(errors[e])) continue;
            l[e] = DECAY * l[e] + loss(errors[e]);
        }
    }

    /** The loss of an aim {@code widths} bot widths off the bullet: 0 within one, 1 from three. */
    static double loss(double widths) {
        double off = Math.abs(widths) - HIT_WIDTHS;
        return off <= 0 ? 0 : Math.min(1.0, off / MISS_WIDTHS);
    }

    /**
     * Each expert's share against {@code shooter}, over the experts {@code available} marks;
     * they sum to 1. Before any hit, every available expert has an equal share.
     */
    public double[] weights(String shooter, boolean[] available) {
        double[] l = losses.get(TeamModes.key(shooter));
        double[] w = new double[COUNT];
        double least = Double.POSITIVE_INFINITY;
        for (int e = 0; e < COUNT; e++) {
            if (available[e]) least = Math.min(least, l == null ? 0 : l[e]);
        }
        double sum = 0;
        for (int e = 0; e < COUNT; e++) {
            if (!available[e]) continue;
            // Measured from the least loss, so a long battle never underflows every weight.
            w[e] = Math.exp(-ETA * ((l == null ? 0 : l[e]) - least));
            sum += w[e];
        }
        if (sum > 0) for (int e = 0; e < COUNT; e++) w[e] /= sum;
        return w;
    }

    /**
     * Where each simple expert aims {@code shot} at the member, in state {@code at} at its fire
     * tick, with {@code path} the member's own track; the learned slot is NaN (its aims come
     * from {@link TeamDanger#aims}).
     */
    static double[] headings(EnemyShot shot, RobotState at, RobotStateLog path, BattleField field) {
        double[] h = new double[COUNT];
        double speed = shot.speed();
        h[Expert.HEAD_ON.ordinal()] = DiaUtils.absoluteBearing(shot.source, at.location);
        h[Expert.LINEAR.ordinal()] = VirtualBullet.linearHeading(shot.source, at.location,
            at.heading, at.velocity, speed, field.width, field.height);
        RobotState before = path.getState(at.time - 1);
        double turn = before == null ? 0 : Angles.normalRelativeAngle(at.heading - before.heading);
        h[Expert.CIRCULAR.ordinal()] = circularHeading(shot.source, at.location, at.heading, at.velocity,
            turn, speed, field);
        RobotState back = path.getState(at.time - AVERAGE_TICKS);
        if (back == null) {
            h[Expert.AVERAGE.ordinal()] = h[Expert.LINEAR.ordinal()];
        } else {
            double dx = (at.location.x - back.location.x) / AVERAGE_TICKS;
            double dy = (at.location.y - back.location.y) / AVERAGE_TICKS;
            double v = Math.hypot(dx, dy);
            double heading = v < 1e-9 ? at.heading : Math.atan2(dx, dy);
            h[Expert.AVERAGE.ordinal()] = VirtualBullet.linearHeading(shot.source, at.location,
                heading, v, speed, field.width, field.height);
        }
        h[Expert.HALF.ordinal()] = VirtualBullet.linearHeading(shot.source, at.location,
            at.heading, at.velocity / 2, speed, field.width, field.height);
        h[Expert.LEARNED.ordinal()] = Double.NaN;
        return h;
    }

    /** The heading a circular-aiming shooter fires at a target turning {@code turn} a tick, kept inside the walls. */
    static double circularHeading(Point2D.Double source, Point2D.Double target, double heading,
                                  double velocity, double turn, double bulletSpeed, BattleField field) {
        double x = target.x, y = target.y, h = heading;
        for (int t = 1; t < 150; t++) {
            h += turn;
            x = DiaUtils.limit(18, x + Math.sin(h) * velocity, field.width - 18);
            y = DiaUtils.limit(18, y + Math.cos(h) * velocity, field.height - 18);
            if (t * bulletSpeed >= source.distance(x, y)) break;
        }
        return DiaUtils.absoluteBearing(source, new Point2D.Double(x, y));
    }

    /**
     * How far each expert was, in bot widths at the shot's range, from the {@code heading} the
     * bullet took; {@code predicted} from {@link #headings} with the learned slot filled in
     * (or NaN).
     */
    static double[] errors(EnemyShot shot, RobotState at, double[] predicted, double heading) {
        // botWidthAimAngle is the half-width (18 px); errors are in whole bot widths (36 px).
        double width = 2 * DiaUtils.botWidthAimAngle(shot.source.distance(at.location));
        double[] err = new double[COUNT];
        for (int e = 0; e < COUNT; e++) {
            err[e] = Double.isNaN(predicted[e]) ? Double.NaN
                : Angles.normalRelativeAngle(heading - predicted[e]) / Math.max(1e-6, width);
        }
        return err;
    }

    /** The heading of the strongest of {@code aims}, or NaN for none: the learned expert's call. */
    static double strongest(List<TeamDanger.Aim> aims) {
        if (aims == null || aims.isEmpty()) return Double.NaN;
        TeamDanger.Aim best = aims.get(0);
        for (TeamDanger.Aim a : aims) if (a.weight > best.weight) best = a;
        return best.heading;
    }
}

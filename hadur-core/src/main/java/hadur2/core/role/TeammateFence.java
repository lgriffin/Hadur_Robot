package hadur2.core.role;

import hadur2.core.model.BotOrders;
import hadur2.core.physics.Rules;
import java.awt.geom.Point2D;
import java.util.List;

/**
 * Keeps whichever role drives off a living teammate (WEAVE-8). Neither movement can see a
 * teammate, so the drive is checked instead, as {@link SentryFence} checks the border: the
 * robot is simulated {@link #HORIZON} ticks ahead under the orders, and each tick's point is
 * compared with where the teammate is predicted to be (the conductor hands over each teammate's
 * predicted track, from the World's prediction, WORLD-9). A tick
 * within {@link #CLEAR} px of it, and closer than the robot is now, is a predicted collision.
 *
 * <p>Each teammate is judged on its own: a track is clear when the robot's closest approach to
 * it is at least the lesser of {@link #CLEAR} and the track's own starting distance (one
 * already close does not lower the bar for another). Then the nearest drives that might clear
 * it are tried in turn: the orders as given, a brake (no distance left to cover), a reversal
 * (the distance's sign flipped; when the orders name no distance, or a stop, a retreat of
 * {@link #REVERSE} px either way, whichever clears best). The first that stays clear is kept;
 * if none does, the one with the least shortfall. A reversal is also checked against the
 * field's walls and the sentries' border: a point beyond either counts as no clearance at all,
 * so it never beats braking. An unset distance retains the adapter's previous order, which
 * the fence cannot see, so it is judged as the worst of either direction when the robot is
 * still, and replaced by an explicit distance whenever the fence steps in. Only the drive is
 * replaced (WEAVE-2): the gun, radar, fire and message orders pass through bit for bit, and
 * orders that stay clear are returned as the same object.</p>
 */
public final class TeammateFence {

    /** Ticks simulated ahead: enough to see a closing teammate and stop for it. */
    public static final int HORIZON = 6;
    /** Two robots' half-widths (36) and a margin: nearer than this is a predicted collision, px. */
    static final double CLEAR = 46.0;
    /** How far to drive back when the orders named no distance, px. */
    static final double REVERSE = 100.0;
    /** A robot's half-width: how far in from a wall its centre must stay, px. */
    static final double HALF_WIDTH = 18.0;
    /** An ordered distance this small is a stop, not a drive to reverse, px. */
    static final double TINY = 1.0;

    private final double width;
    private final double height;

    /** A fence with no walls: only the teammates count. */
    public TeammateFence() {
        this(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
    }

    /** A fence on a {@code width} by {@code height} field. */
    public TeammateFence(double width, double height) {
        this.width = width;
        this.height = height;
    }

    /** As {@link #apply(double, double, double, double, BotOrders, List, double)} with no sentry border. */
    public BotOrders apply(double x, double y, double heading, double velocity, BotOrders o,
                           List<Point2D.Double[]> tracks) {
        return apply(x, y, heading, velocity, o, tracks, 0);
    }

    /**
     * The orders {@code o} for a robot at ({@code x}, {@code y}) with {@code heading} and
     * {@code velocity}, kept if they stay clear of every one of the teammates' {@code tracks},
     * else the brake or reversal that does best, with {@code border} px the sentries' border
     * (0 for none). A track holds a teammate's predicted point on the tick of the orders and
     * on each of the {@link #HORIZON} ticks after it, so it has {@code HORIZON + 1} points.
     */
    public BotOrders apply(double x, double y, double heading, double velocity, BotOrders o,
                           List<Point2D.Double[]> tracks, double border) {
        if (tracks.isEmpty()) return o;
        double[] limit = new double[tracks.size()];
        for (int i = 0; i < limit.length; i++) {
            limit[i] = Math.min(CLEAR, tracks.get(i)[0].distance(x, y));
        }
        double asGiven = shortfall(limit, closest(x, y, heading, velocity, o, tracks, false, border));
        if (asGiven <= 0) return o;
        BotOrders brake = o.withDrive(o.bodyTurn(), 0, o.maxVelocity());
        double braked = shortfall(limit, closest(x, y, heading, velocity, brake, tracks, false, border));
        if (braked <= 0) return brake;
        BotOrders best = o;
        double least = asGiven;
        if (braked < least) {
            best = brake;
            least = braked;
        }
        double ahead = o.ahead();
        double[] backs = Double.isNaN(ahead) || Math.abs(ahead) < TINY
            ? (velocity >= 0 ? new double[] {-REVERSE, REVERSE} : new double[] {REVERSE, -REVERSE})
            : new double[] {-ahead};
        BotOrders reverse = null;
        double reversed = Double.POSITIVE_INFINITY;
        for (double back : backs) {
            BotOrders candidate = o.withDrive(o.bodyTurn(), back, o.maxVelocity());
            double d = shortfall(limit, closest(x, y, heading, velocity, candidate, tracks, true, border));
            if (d < reversed) {
                reverse = candidate;
                reversed = d;
            }
        }
        if (reversed <= 0) return reverse;
        // None clears: the least shortfall. A tie keeps the orders as given.
        return reversed < least ? reverse : best;
    }

    /** The worst shortfall, over the tracks, of the closest approaches {@code least} against {@code limit}; at most 0 is clear. */
    private static double shortfall(double[] limit, double[] least) {
        double worst = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < limit.length; i++) worst = Math.max(worst, limit[i] - least[i]);
        return worst;
    }

    /**
     * The least distance, over the horizon, between the robot under {@code o} and each of
     * {@code tracks}. With {@code bounded}, a tick that leaves the field or crosses the sentries'
     * {@code border} counts as no clearance from any of them. An unset distance is the worst
     * of both directions for a robot at rest, else the direction of its velocity.
     */
    double[] closest(double x, double y, double heading, double velocity, BotOrders o,
                     List<Point2D.Double[]> tracks, boolean bounded, double border) {
        if (!Double.isNaN(o.ahead())) return simulate(x, y, heading, velocity, o, o.ahead(), tracks, bounded, border);
        if (velocity != 0) {
            return simulate(x, y, heading, velocity, o,
                velocity < 0 ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY, tracks, bounded, border);
        }
        double[] fwd = simulate(x, y, heading, velocity, o, Double.POSITIVE_INFINITY, tracks, bounded, border);
        double[] back = simulate(x, y, heading, velocity, o, Double.NEGATIVE_INFINITY, tracks, bounded, border);
        for (int i = 0; i < fwd.length; i++) fwd[i] = Math.min(fwd[i], back[i]);
        return fwd;
    }

    private double[] simulate(double x, double y, double heading, double velocity, BotOrders o,
                              double distLeft, List<Point2D.Double[]> tracks, boolean bounded,
                              double border) {
        double turnLeft = Double.isNaN(o.bodyTurn()) ? 0 : o.bodyTurn();
        double maxV = Double.isNaN(o.maxVelocity()) ? Rules.MAX_VELOCITY
            : Math.min(Math.abs(o.maxVelocity()), Rules.MAX_VELOCITY);
        double v = velocity;
        double[] least = new double[tracks.size()];
        java.util.Arrays.fill(least, Double.POSITIVE_INFINITY);
        boolean out = false;
        for (int t = 1; t <= HORIZON; t++) {
            double rate = Rules.getTurnRateRadians(Math.abs(v));
            double turn = Math.max(-rate, Math.min(rate, turnLeft));
            heading += turn;
            turnLeft -= turn;
            v = SentryFence.nextVelocity(v, distLeft, maxV);
            x += Math.sin(heading) * v;
            y += Math.cos(heading) * v;
            if (!Double.isInfinite(distLeft)) distLeft -= v;
            if (bounded && !inside(x, y, border)) out = true;
            for (int i = 0; i < least.length; i++) least[i] = Math.min(least[i], tracks.get(i)[t].distance(x, y));
        }
        if (out) java.util.Arrays.fill(least, 0);
        return least;
    }

    /** Whether the robot's centre at ({@code x}, {@code y}) is within the walls and the sentries' border. */
    private boolean inside(double x, double y, double border) {
        double in = HALF_WIDTH;
        if (border > 0) {
            double sentry = SentryFence.inset(border);
            if (width - 2 * sentry > 0 && height - 2 * sentry > 0) in = sentry;
        }
        return x >= in && x <= width - in && y >= in && y <= height - in;
    }
}

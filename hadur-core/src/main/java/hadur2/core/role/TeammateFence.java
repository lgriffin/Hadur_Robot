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
 * <p>Then the nearest drives that might clear it are tried in turn: the orders as given, a
 * brake (no distance left to cover), a reversal (the distance's sign flipped). The first that
 * stays clear is kept; if none does, the one whose closest approach is greatest. Only the
 * drive is replaced (WEAVE-2): the gun, radar, fire and message orders pass through bit for
 * bit, and orders that stay clear are returned as the same object.</p>
 */
public final class TeammateFence {

    /** Ticks simulated ahead: enough to see a closing teammate and stop for it. */
    public static final int HORIZON = 6;
    /** Two robots' half-widths (36) and a margin: nearer than this is a predicted collision, px. */
    static final double CLEAR = 46.0;
    /** How far to drive back when the orders named no distance, px. */
    static final double REVERSE = 100.0;

    /**
     * The orders {@code o} for a robot at ({@code x}, {@code y}) with {@code heading} and
     * {@code velocity}, kept if they stay clear of every one of the teammates' {@code tracks},
     * else the brake or reversal that does best. A track holds a teammate's predicted point on
     * the tick of the orders and on each of the {@link #HORIZON} ticks after it, so it has
     * {@code HORIZON + 1} points.
     */
    public BotOrders apply(double x, double y, double heading, double velocity, BotOrders o,
                           List<Point2D.Double[]> tracks) {
        if (tracks.isEmpty()) return o;
        double start = Double.POSITIVE_INFINITY;
        for (Point2D.Double[] m : tracks) start = Math.min(start, m[0].distance(x, y));
        double limit = Math.min(CLEAR, start);
        double asGiven = closest(x, y, heading, velocity, o, tracks);
        if (asGiven >= limit) return o;
        BotOrders brake = o.withDrive(o.bodyTurn(), 0, o.maxVelocity());
        double braked = closest(x, y, heading, velocity, brake, tracks);
        if (braked >= limit) return brake;
        double ahead = o.ahead();
        double back = Double.isNaN(ahead) ? (velocity >= 0 ? -REVERSE : REVERSE) : -ahead;
        BotOrders reverse = o.withDrive(o.bodyTurn(), back, o.maxVelocity());
        double reversed = closest(x, y, heading, velocity, reverse, tracks);
        if (reversed >= limit) return reverse;
        // None clears: the best of the three. A tie keeps the orders as given.
        if (braked > asGiven && braked >= reversed) return brake;
        if (reversed > asGiven) return reverse;
        return o;
    }

    /** The least distance, over the horizon, between the robot under {@code o} and any of {@code tracks}. */
    double closest(double x, double y, double heading, double velocity, BotOrders o,
                   List<Point2D.Double[]> tracks) {
        double turnLeft = Double.isNaN(o.bodyTurn()) ? 0 : o.bodyTurn();
        double distLeft = Double.isNaN(o.ahead())
            ? (velocity < 0 ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY) : o.ahead();
        double maxV = Double.isNaN(o.maxVelocity()) ? Rules.MAX_VELOCITY
            : Math.min(Math.abs(o.maxVelocity()), Rules.MAX_VELOCITY);
        double v = velocity;
        double least = Double.POSITIVE_INFINITY;
        for (int t = 1; t <= HORIZON; t++) {
            double rate = Rules.getTurnRateRadians(Math.abs(v));
            double turn = Math.max(-rate, Math.min(rate, turnLeft));
            heading += turn;
            turnLeft -= turn;
            v = SentryFence.nextVelocity(v, distLeft, maxV);
            x += Math.sin(heading) * v;
            y += Math.cos(heading) * v;
            if (!Double.isInfinite(distLeft)) distLeft -= v;
            for (Point2D.Double[] m : tracks) least = Math.min(least, m[t].distance(x, y));
        }
        return least;
    }
}

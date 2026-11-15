package hadur117.core.melee;

import hadur117.core.physics.Angles;

/**
 * TMODE-49, momentum: where a team member really is, tick by tick, while it drives to a
 * spot from its present heading and velocity under the engine's movement rules.
 *
 * <p>The wave check (TMODE-11, TMODE-27) and the teammates'-bullet check (TMODE-25) drive each
 * candidate from a standstill, already pointed at it. A spot behind the member then looks as
 * quick to reach as one ahead, though the member must first brake at 2 px a tick and turn.
 * This drive takes the brake and the turn into account, so a turn back is priced as it is
 * flown. Our own code on the engine's published rules (Robocode's {@code Rules} and
 * {@code RobotPeer}): each tick the body turns at most {@code 10 - 0.75 |v|} degrees toward the
 * spot (backwards when that is the shorter turn), then the velocity moves toward the speed
 * that still stops on the spot, by 1 px a tick up and 2 down.</p>
 */
final class Momentum {

    static final double MAX_VELOCITY = 8.0;
    static final double ACCELERATION = 1.0;
    static final double DECELERATION = 2.0;
    /** The drive's speed cap through a turn over 45 degrees when the member brakes (MeleeSeam's goTo). */
    static final double TURN_SPEED = 4.0;
    /** Half a robot, the closest the centre comes to a wall. */
    static final double HALF_BOT = 18.0;

    private Momentum() {
    }

    /**
     * The member's centre after each of {@code ticks} ticks driving to ({@code toX}, {@code toY})
     * from ({@code x}, {@code y}) at {@code heading} (radians, the engine's: 0 north, clockwise)
     * and {@code velocity}; {@code out[t - 1]} is {x, y} after tick t. With {@code fullSpeed}
     * the drive keeps 8 px a tick through a sharp turn, else it caps at {@link #TURN_SPEED} there,
     * as the drive does. A wall stops the member on the field's edge.
     */
    static double[][] drive(double x, double y, double heading, double velocity, double toX, double toY,
                            int ticks, boolean fullSpeed, double width, double height) {
        double[][] out = new double[ticks][];
        double h = heading, v = velocity;
        for (int t = 0; t < ticks; t++) {
            double dx = toX - x, dy = toY - y;
            double left = Math.hypot(dx, dy);
            double turn = left < 1e-9 ? 0 : Angles.normalRelativeAngle(Math.atan2(dx, dy) - h);
            double distance = left;
            if (Math.abs(turn) > Math.PI / 2) {
                turn = Angles.normalRelativeAngle(turn + Math.PI);
                distance = -distance;
            }
            double cap = !fullSpeed && Math.abs(turn) > Math.PI / 4 ? TURN_SPEED : MAX_VELOCITY;
            double maxTurn = Math.toRadians(10 - 0.75 * Math.abs(v));
            h += Math.max(-maxTurn, Math.min(maxTurn, turn));
            v = newVelocity(v, distance, cap);
            double dx = Math.sin(h) * v, dy = Math.cos(h) * v;
            // A wall stops the member where its step first meets the edge, along its heading.
            double f = Math.min(Math.min(share(x, dx, width), share(y, dy, height)), 1);
            x += dx * f;
            y += dy * f;
            if (f < 1) v = 0;
            out[t] = new double[] {x, y};
        }
        return out;
    }

    /** The share of a step {@code d} from {@code p} that stays within the field's edge on one axis of length {@code size}. */
    private static double share(double p, double d, double size) {
        if (d > 0 && p + d > size - HALF_BOT) return Math.max(0, (size - HALF_BOT - p) / d);
        if (d < 0 && p + d < HALF_BOT) return Math.max(0, (HALF_BOT - p) / d);
        return 1;
    }

    /** The engine's next velocity from {@code velocity} with {@code distance} left to drive (negative: backwards), under {@code cap}. */
    static double newVelocity(double velocity, double distance, double cap) {
        if (distance < 0) return -newVelocity(-velocity, -distance, cap);
        double goal = Math.min(cap, maxSpeedFor(distance));
        if (velocity >= 0) return Math.max(velocity - DECELERATION, Math.min(goal, velocity + ACCELERATION));
        return Math.max(velocity - ACCELERATION, Math.min(goal, velocity + maxDeceleration(-velocity)));
    }

    /** The highest speed from which the robot can still stop within {@code distance}. */
    static double maxSpeedFor(double distance) {
        double decelTime = Math.max(1, Math.ceil((Math.sqrt((4 * 2 / DECELERATION) * distance + 1) - 1) / 2));
        double decelDist = (decelTime / 2.0) * (decelTime - 1) * DECELERATION;
        return ((decelTime - 1) * DECELERATION) + ((distance - decelDist) / decelTime);
    }

    /** How much speed a robot moving the other way at {@code speed} sheds in one tick (crossing zero accelerates). */
    static double maxDeceleration(double speed) {
        double decelTime = speed / DECELERATION;
        double accelTime = 1 - decelTime;
        return Math.min(1, decelTime) * DECELERATION + Math.max(0, accelTime) * ACCELERATION;
    }
}

package hadur2.core.physics;

import hadur2.core.model.*;
import hadur2.core.physics.*;
import hadur2.core.knn.*;

import java.awt.geom.Point2D;

/**
 * Small geometry and arithmetic helpers shared by the whole core: projecting points,
 * bearings between points, bullet flight times, the orbit's acceleration sign, firing-angle
 * grids and a Wald margin of error.
 *
 * <p>Conventions are Robocode's. Angles are radians with 0 north (+y) and growing
 * clockwise, so moving {@code length} px along angle {@code a} adds {@code sin(a) × length}
 * to x and {@code cos(a) × length} to y (sine and cosine swapped from the usual maths
 * convention). {@link #absoluteBearing(Point2D.Double, Point2D.Double)} is the inverse of
 * {@link #project(Point2D.Double, double, double)}. Distances are in px, times in ticks.</p>
 *
 * <p>Every method is a pure function, and only {@link #setBackAsFront} touches the model
 * (it writes into an order builder).</p>
 */
public final class DiaUtils {

    private DiaUtils() {}

    /**
     * The point {@code length} px from {@code src} along {@code angle}.
     *
     * @param src the start point (not modified)
     * @param angle the direction, in radians (0 north, clockwise)
     * @param length the distance, in px; negative goes the opposite way
     * @return a new point
     */
    public static Point2D.Double project(Point2D.Double src, double angle, double length) {
        return new Point2D.Double(
            src.x + Math.sin(angle) * length,
            src.y + Math.cos(angle) * length);
    }

    /**
     * {@link #project(Point2D.Double, double, double)} with the angle's sine and cosine
     * already worked out, for loops that project along one direction many times.
     *
     * @param src the start point (not modified)
     * @param sinAngle the sine of the direction
     * @param cosAngle the cosine of the direction
     * @param length the distance, in px
     * @return a new point
     */
    public static Point2D.Double project(Point2D.Double src,
            double sinAngle, double cosAngle, double length) {
        return new Point2D.Double(
            src.x + sinAngle * length,
            src.y + cosAngle * length);
    }

    /**
     * The direction from {@code src} to {@code target}, 0 north and clockwise. The
     * arguments to {@code atan2} are (dx, dy), not (dy, dx), because Robocode measures
     * angles from north rather than from east.
     *
     * @param src the point looked from
     * @param target the point looked at
     * @return the bearing, in radians, in (-π, π]
     */
    public static double absoluteBearing(Point2D.Double src, Point2D.Double target) {
        return Math.atan2(target.x - src.x, target.y - src.y);
    }

    /**
     * The sign of {@code d}, taking 0 as +1, for a direction that must be one way or the
     * other. Nothing in the core calls it at present.
     *
     * @param d any value
     * @return -1 if {@code d} is negative, else +1
     */
    public static int nonZeroSign(double d) {
        return d < 0 ? -1 : 1;
    }

    /**
     * {@code d × d}.
     *
     * @param d any value
     * @return its square
     */
    public static double square(double d) {
        return d * d;
    }

    /**
     * Clamps {@code value} into [{@code min}, {@code max}].
     *
     * @param min the lower bound
     * @param value the value to clamp
     * @param max the upper bound; if it is below {@code min}, {@code min} wins
     * @return the clamped value
     */
    public static double limit(double min, double value, double max) {
        return Math.max(min, Math.min(value, max));
    }

    /**
     * Clamps {@code value} into [{@code min}, {@code max}].
     *
     * @param min the lower bound
     * @param value the value to clamp
     * @param max the upper bound; if it is below {@code min}, {@code min} wins
     * @return the clamped value
     */
    public static int limit(int min, int value, int max) {
        return Math.max(min, Math.min(value, max));
    }

    /**
     * Half the angle a robot covers, seen from {@code distance} px away: a robot is 36 px
     * wide, so half of it is 18 px, and for the small angles involved {@code atan(18 / d)} is
     * close to {@code 18 / d}. The guns double it for the bandwidth they score firing angles with.
     *
     * @param distance the distance to the robot's centre, in px
     * @return the half-width, in radians
     */
    public static double botWidthAimAngle(double distance) {
        return Math.abs(18.0 / distance);
    }

    /**
     * Ticks a bullet at {@code speed} takes to cover {@code distance}, rounded up to whole
     * ticks since bullets move once a tick.
     *
     * @param distance the distance, in px
     * @param speed the bullet's speed, in px/tick
     * @return the flight time, in ticks
     */
    public static int bulletTicksFromSpeed(double distance, double speed) {
        return (int) Math.ceil(distance / speed);
    }

    /**
     * {@link #bulletTicksFromSpeed(double, double)} for a bullet of {@code power}, whose
     * speed is 20 - 3 × power (unlike {@link Rules#getBulletSpeed(double)}, the power is not
     * clamped).
     *
     * @param distance the distance, in px
     * @param power the bullet's power, in energy
     * @return the flight time, in ticks
     */
    public static int bulletTicksFromPower(double distance, double power) {
        return (int) Math.ceil(distance / (20.0 - 3.0 * power));
    }

    /**
     * A robot's acceleration relative to the way it was moving: positive when it speeds up
     * in its direction of travel, negative when it brakes, whichever way it faces. A plain
     * difference of velocities would call braking while reversing "acceleration". From a
     * standstill any change counts as speeding up. Each wave records it as its target's
     * acceleration, one of the KNN formulas' features.
     *
     * @param velocity this tick's velocity, in px/tick (signed: negative is reversing)
     * @param previousVelocity the previous tick's velocity, in px/tick
     * @return the change in speed, in px/tick per tick
     */
    public static double accel(double velocity, double previousVelocity) {
        double a = velocity - previousVelocity;
        if (previousVelocity == 0.0) {
            return Math.abs(a);
        }
        return a * Math.signum(previousVelocity);
    }

    /**
     * {@code angle} moved by whole turns until it is within π of {@code reference}, so two
     * angles can be compared or ordered without a wrap-around between them. Used to put the
     * ends of a bullet shadow and a bearing on the same side of the ±π seam.
     *
     * <p>The loop steps one turn at a time, so it expects angles a few turns apart at most;
     * an infinite {@code angle} never gets within π and would not return.</p>
     *
     * @param angle the angle to move, in radians
     * @param reference the angle to move it near, in radians
     * @return {@code angle} plus a whole number of turns, within π of {@code reference}
     */
    public static double normalizeAngle(double angle, double reference) {
        double normDiff = reference - angle;
        while (Math.abs(normDiff) > Math.PI) {
            angle += Math.signum(normDiff) * (Math.PI * 2);
            normDiff = reference - angle;
        }
        return angle;
    }

    /**
     * {@code numAngles} firing angles spread evenly over [-{@code maxEscapeAngle},
     * {@code maxEscapeAngle}], relative to the head-on bearing, with the middle one at 0
     * (guess factor 0). Angle {@code x} is at guess factor {@code (x - mid) / mid} in
     * [-1, 1]. {@code numAngles} should be odd and at least 3: an even count puts the last
     * angle past the escape angle, and 1 divides by zero.
     *
     * @param numAngles how many angles, odd
     * @param maxEscapeAngle the escape angle the grid spans each way, in radians
     * @return the angles, in radians, from -{@code maxEscapeAngle} up
     */
    public static double[] generateFiringAngles(int numAngles, double maxEscapeAngle) {
        int gfZero = (numAngles - 1) / 2;
        double[] firingAngles = new double[numAngles];
        for (int x = 0; x < numAngles; x++) {
            firingAngles[x] = (double) (x - gfZero) / gfZero * maxEscapeAngle;
        }
        return firingAngles;
    }

    /**
     * The 95% margin of error of a proportion by the normal (Wald) approximation:
     * 1.96 × sqrt(p (1 - p) / n). It is 0 for a rate of exactly 0 or 1 and undefined for
     * n = 0, so it understates the doubt over few samples; the policies' inputs use
     * {@link hadur2.core.memory.Estimate}'s Agresti-Coull margin instead. The surf's hit-rate
     * thresholds and the round statistics use this one.
     *
     * @param probability the observed rate, in [0, 1]
     * @param numDataPoints the number of trials
     * @return the margin, as a rate
     */
    public static double marginOfError(double probability, int numDataPoints) {
        return 1.96 * Math.sqrt(probability * (1.0 - probability) / numDataPoints);
    }

    /**
     * {@code d} rounded half up to {@code decimalPlaces} places. Nothing in the core calls
     * it at present.
     *
     * @param d the value
     * @param decimalPlaces how many places to keep, 0 or more
     * @return the rounded value
     */
    public static double round(double d, int decimalPlaces) {
        long powerTen = 1;
        for (int x = 0; x < decimalPlaces; x++) {
            powerTen *= 10;
        }
        return (double) Math.round(d * powerTen) / powerTen;
    }

    /**
     * Drives toward {@code goAngle}, reversing instead of turning more than 90 degrees.
     * Writes the body turn and distance into {@code orders}.
     *
     * <p>A Robocode robot drives equally fast backwards, so any heading is at most a quarter
     * turn from either its front or its back. Turning the short way and driving the matching
     * way keeps the robot's turn (and the speed it loses to turn rate, see
     * {@link Rules#getTurnRate(double)}) small. The 100 px distance only has to be larger
     * than the robot can cover before the next order replaces it.</p>
     *
     * @param orders the orders to write the body turn (radians, positive clockwise) and the
     *     distance (px, negative for reverse) into
     * @param heading the robot's current body heading, in radians
     * @param goAngle the direction to move in, in radians
     */
    public static void setBackAsFront(BotOrders.Builder orders, double heading, double goAngle) {
        double angle = Angles.normalRelativeAngle(goAngle - heading);
        if (Math.abs(angle) > Math.PI / 2) {
            // The back is nearer: turn so the back faces goAngle (angle + π when angle is
            // negative, angle - π when positive, either way within a quarter turn) and reverse.
            if (angle < 0) {
                orders.turnRight(Math.PI + angle);
            } else {
                orders.turnRight(-(Math.PI - angle));
            }
            orders.ahead(-100.0);
        } else {
            orders.turnRight(angle);
            orders.ahead(100.0);
        }
    }
}

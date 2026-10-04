package hadurling.physics;

/**
 * Angle helpers, written to give exactly the answers of {@code robocode.util.Utils}.
 *
 * <p>Angles are radians in Robocode's convention: 0 is north (up the screen, toward +y) and
 * angles grow clockwise, so {@code PI / 2} is east. We write our own copy, instead of calling
 * the engine's, because from lab 04 the core of the robot may not import Robocode at all. A
 * property test checks our copy against the engine on thousands of random angles.</p>
 */
public final class Angles {

    /** One full turn, in radians. */
    public static final double TWO_PI = 2 * Math.PI;

    private Angles() {}

    /**
     * Normalises to [0, 2 PI): the form for a compass heading or bearing.
     *
     * @param angle any angle, in radians
     * @return the same direction in [0, 2 PI); NaN for an infinite or NaN angle
     */
    public static double normalAbsoluteAngle(double angle) {
        // Java's % keeps the sign of the dividend, so a negative angle comes out in
        // (-2 PI, 0) and needs one more turn added.
        angle %= TWO_PI;
        return angle >= 0 ? angle : angle + TWO_PI;
    }

    /**
     * Normalises to [-PI, PI): the form for "how far to turn". The sign says which way
     * (positive is clockwise) and the size is the short way round.
     *
     * @param angle any angle, in radians
     * @return the same direction in [-PI, PI); NaN for an infinite or NaN angle
     */
    public static double normalRelativeAngle(double angle) {
        angle %= TWO_PI;
        // Now the angle is in (-2 PI, 2 PI). Fold each half into [-PI, PI). Exactly PI maps
        // to -PI, as in the engine: the interval is closed below and open above.
        if (angle >= 0) {
            return angle < Math.PI ? angle : angle - TWO_PI;
        }
        return angle >= -Math.PI ? angle : angle + TWO_PI;
    }

    /**
     * The compass direction from one point to another.
     *
     * @param fromX x of the start, in px
     * @param fromY y of the start, in px (y grows north)
     * @param toX x of the target, in px
     * @param toY y of the target, in px
     * @return the heading from start to target, in [0, 2 PI): 0 north, PI / 2 east
     */
    public static double absoluteBearing(double fromX, double fromY, double toX, double toY) {
        // atan2(dx, dy), with the arguments the "wrong" way round for maths but right for
        // a compass: zero points up the y axis and angles grow clockwise.
        return normalAbsoluteAngle(Math.atan2(toX - fromX, toY - fromY));
    }
}

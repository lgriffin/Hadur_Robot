package hadur2.core.physics;

/**
 * Angle normalisation, bit-for-bit identical to {@code robocode.util.Utils} so the core
 * behaves exactly as it did when it called the engine's helpers.
 *
 * <p>All angles in the core are in radians in Robocode's convention: 0 is north (up the
 * screen, toward +y), and angles grow clockwise, so {@code π/2} is east. The core may not
 * import the engine (CORE-1), so it carries its own copy; {@code PhysicsMatchesEngineProperties}
 * checks both methods against the engine's on thousands of random angles and on the edge
 * cases (±0, ±π, ±2π, infinities and NaN).</p>
 */
public final class Angles {

    /** π, in radians: half a turn. */
    public static final double PI = Math.PI;
    /** 2π, in radians: one full turn. */
    public static final double TWO_PI = 2 * Math.PI;

    private Angles() {}

    /**
     * Normalises to [0, 2π): the form for an absolute heading or bearing.
     *
     * @param angle any angle, in radians
     * @return the same direction in [0, 2π); NaN for an infinite or NaN angle
     */
    public static double normalAbsoluteAngle(double angle) {
        // Java's % keeps the dividend's sign, so a negative angle lands in (-2π, 0) and
        // needs one more turn added.
        angle %= TWO_PI;
        return angle >= 0 ? angle : angle + TWO_PI;
    }

    /**
     * Normalises to [-π, π): the form for a turn or an angle between two bearings, where
     * the sign says which way (positive is clockwise) and the magnitude is the short way
     * round.
     *
     * @param angle any angle, in radians
     * @return the same direction in [-π, π); NaN for an infinite or NaN angle
     */
    public static double normalRelativeAngle(double angle) {
        angle %= TWO_PI;
        // After %, the angle is in (-2π, 2π). Fold each half into [-π, π): exactly π maps
        // to -π, as in the engine, so the interval is closed below and open above.
        if (angle >= 0) {
            return angle < PI ? angle : angle - TWO_PI;
        }
        return angle >= -PI ? angle : angle + TWO_PI;
    }
}

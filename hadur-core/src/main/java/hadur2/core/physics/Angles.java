package hadur2.core.physics;

/**
 * Angle normalisation, bit-for-bit identical to {@code robocode.util.Utils} so the core
 * behaves exactly as it did when it called the engine's helpers.
 */
public final class Angles {

    public static final double PI = Math.PI;
    public static final double TWO_PI = 2 * Math.PI;

    private Angles() {}

    /** Normalises to [0, 2π). */
    public static double normalAbsoluteAngle(double angle) {
        angle %= TWO_PI;
        return angle >= 0 ? angle : angle + TWO_PI;
    }

    /** Normalises to [-π, π). */
    public static double normalRelativeAngle(double angle) {
        angle %= TWO_PI;
        if (angle >= 0) {
            return angle < PI ? angle : angle - TWO_PI;
        }
        return angle >= -PI ? angle : angle + TWO_PI;
    }
}

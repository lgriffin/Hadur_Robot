package hadurling.core.physics;

/**
 * The bullet rules of Robocode, copied so that they can be tested without the engine.
 *
 * <p>Units are the engine's: distances in pixels, time in ticks, speeds in px/tick.</p>
 */
public final class Rules {

    /** The weakest bullet the engine fires. */
    public static final double MIN_BULLET_POWER = 0.1;
    /** The strongest bullet the engine fires. */
    public static final double MAX_BULLET_POWER = 3.0;
    /** A robot's top speed, in px/tick. */
    public static final double MAX_VELOCITY = 8.0;

    private Rules() {}

    /**
     * A bullet's speed: {@code 20 - 3 * power}, from 11 px/tick for power 3 to 19.7 for
     * power 0.1. Harder bullets are slower, which is the whole trade-off of choosing a power.
     *
     * @param power the bullet power; values outside [0.1, 3] are clamped, as the engine does
     * @return the speed in px/tick
     */
    public static double bulletSpeed(double power) {
        return 20 - 3 * clampPower(power);
    }

    /**
     * The damage a bullet does when it hits: {@code 4 * power}, plus {@code 2 * (power - 1)}
     * more when the power is above 1.
     *
     * @param power the bullet power, clamped to [0.1, 3]
     * @return the energy the target loses
     */
    public static double bulletDamage(double power) {
        double p = clampPower(power);
        return p > 1 ? 4 * p + 2 * (p - 1) : 4 * p;
    }

    /**
     * The largest angle the enemy can move away from where it was when we fired, by the time
     * the bullet reaches it: {@code asin(8 / bulletSpeed)}. A gun that aims at the
     * enemy's current position can only miss by at most this much, left or right.
     *
     * @param power the bullet power, clamped to [0.1, 3]
     * @return the angle in radians, always positive
     */
    public static double maxEscapeAngle(double power) {
        return Math.asin(MAX_VELOCITY / bulletSpeed(power));
    }

    private static double clampPower(double power) {
        return Math.max(MIN_BULLET_POWER, Math.min(MAX_BULLET_POWER, power));
    }
}

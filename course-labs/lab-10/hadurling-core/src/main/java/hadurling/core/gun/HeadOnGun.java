package hadurling.core.gun;

import hadurling.core.model.Input;
import hadurling.core.physics.Angles;

/**
 * The simplest gun there is: point at where the enemy is <em>now</em> and fire. It misses
 * any enemy that is moving sideways, which is why later labs replace it, but it gives the
 * robot something to shoot with.
 */
public final class HeadOnGun {

    /** The bullet power fired. Power 1 is cheap and fast. */
    public static final double POWER = 1.0;
    /** How far off the aim may be and still fire, in radians (about 10 degrees). */
    public static final double AIM_TOLERANCE = Math.toRadians(10);

    /**
     * How far to turn the gun to point at the enemy.
     *
     * @param in this tick's input
     * @param enemyDirection the compass direction of the enemy, in radians
     * @return the gun turn in radians, clockwise positive, the short way round
     */
    public double turn(Input in, double enemyDirection) {
        return Angles.normalRelativeAngle(enemyDirection - in.gunHeading());
    }

    /**
     * Whether to fire this tick, and how hard.
     *
     * @param in this tick's input
     * @param gunTurn the turn still needed, from {@link #turn}
     * @return {@link #POWER} when the gun is cool and nearly on target, otherwise 0
     */
    public double power(Input in, double gunTurn) {
        boolean cool = in.gunHeat() == 0;
        return cool && Math.abs(gunTurn) < AIM_TOLERANCE ? POWER : 0;
    }
}

package hadur2.core.physics;

/**
 * The Robocode game rules the core relies on, identical to {@code robocode.Rules}.
 *
 * <p>The core may not import the engine (CORE-1), so the constants and formulas it needs
 * are copied here; {@code PhysicsMatchesEngineProperties} and {@code EnergyLedgerProperties}
 * check every one against the engine's own. Units are the engine's: distances in pixels,
 * time in ticks (turns), velocities in px/tick, energy in energy points and, unlike the rest
 * of the core, the turn rates in <em>degrees</em> per tick (use
 * {@link #getTurnRateRadians(double)} for radians).</p>
 *
 * <p>The energy formulas are what the {@link hadur2.core.ledger.EnergyLedger} uses to
 * explain an enemy's energy changes, so only a drop spent on a bullet becomes a wave
 * (WAVE-1); {@link #MIN_BULLET_POWER} and {@link #MAX_BULLET_POWER} are the [0.1, 3.0] range
 * a corrected drop must fall in (WAVE-2).</p>
 */
public final class Rules {

    /** How much a robot can speed up in one tick, in px/tick per tick. */
    public static final double ACCELERATION = 1.0;
    /** How much a robot can slow down in one tick, in px/tick per tick: braking is twice as fast as speeding up. */
    public static final double DECELERATION = 2.0;
    /** A robot's top speed, in px/tick. */
    public static final double MAX_VELOCITY = 8.0;
    /** A standing robot's body turn rate, in degrees per tick; see {@link #getTurnRate(double)}. */
    public static final double MAX_TURN_RATE = 10.0;
    /** The gun's turn rate, in degrees per tick, on top of the body's turn. */
    public static final double GUN_TURN_RATE = 20.0;
    /** The radar's turn rate, in degrees per tick, on top of the gun's turn. */
    public static final double RADAR_TURN_RATE = 45.0;
    /** The weakest bullet the engine fires, in energy; the lower bound of a shot (WAVE-2). */
    public static final double MIN_BULLET_POWER = 0.1;
    /** The strongest bullet the engine fires, in energy; the upper bound of a shot (WAVE-2). */
    public static final double MAX_BULLET_POWER = 3.0;
    /** Energy each robot loses when two robots collide. */
    public static final double ROBOT_HIT_DAMAGE = 0.6;

    private Rules() {}

    /**
     * Degrees per tick a robot can turn at {@code velocity}: 10 standing, falling by 0.75
     * per px/tick of speed to 4 at full speed. A fast robot turns wide.
     *
     * @param velocity the robot's velocity, in px/tick (either sign)
     * @return the body's turn limit, in degrees per tick
     */
    public static double getTurnRate(double velocity) {
        return MAX_TURN_RATE - 0.75 * Math.abs(velocity);
    }

    /**
     * {@link #getTurnRate(double)} in radians per tick, the unit the movement predictor
     * works in.
     *
     * @param velocity the robot's velocity, in px/tick (either sign)
     * @return the body's turn limit, in radians per tick
     */
    public static double getTurnRateRadians(double velocity) {
        return Math.toRadians(getTurnRate(velocity));
    }

    /**
     * A bullet's speed: 20 - 3 × power, so from 11 px/tick at power 3.0 to 19.7 at 0.1. As
     * in the engine, the power is first clamped to [{@link #MIN_BULLET_POWER},
     * {@link #MAX_BULLET_POWER}].
     *
     * @param power the bullet's power, in energy
     * @return the bullet's speed, in px/tick
     */
    public static double getBulletSpeed(double power) {
        power = Math.min(Math.max(power, MIN_BULLET_POWER), MAX_BULLET_POWER);
        return 20 - 3 * power;
    }

    /**
     * Energy a bullet of {@code power} takes from the robot it hits: 4 × power, plus
     * 2 × (power - 1) above power 1, so 16 at power 3.0. Unlike
     * {@link #getBulletSpeed(double)}, the power is not clamped (the engine's is not either).
     *
     * @param power the bullet's power, in energy
     * @return the damage, in energy
     */
    public static double getBulletDamage(double power) {
        double damage = 4 * power;
        if (power > 1) {
            damage += 2 * (power - 1);
        }
        return damage;
    }

    /**
     * Energy the shooter gets back when its bullet hits: 3 × power. This refund can hide a
     * shot fired on the same tick from a raw energy reading, which is why the ledger adds it
     * back (WAVE-1).
     *
     * @param power the bullet's power, in energy
     * @return the refund, in energy
     */
    public static double getBulletHitBonus(double power) {
        return 3 * power;
    }

    /**
     * Energy a robot loses hitting a wall at {@code velocity}: |velocity| / 2 - 1, and none
     * at 2 px/tick or slower. At full speed it is 3.0, the same as the strongest bullet, so
     * a wall hit on its own can pass for a shot unless the ledger explains it (WAVE-1).
     *
     * @param velocity the speed at impact, in px/tick (either sign)
     * @return the damage, in energy, never negative
     */
    public static double getWallHitDamage(double velocity) {
        return Math.max(Math.abs(velocity) / 2 - 1, 0);
    }

    /**
     * Gun heat a shot of {@code power} adds: 1 + power / 5. A gun can fire only at heat 0,
     * and cools by the battle's cooling rate (0.1 by default) each tick, so a power-3.0 shot
     * holds the gun 16 ticks at the default rate.
     *
     * @param power the bullet's power, in energy
     * @return the heat the shot adds
     */
    public static double getGunHeat(double power) {
        return 1 + power / 5;
    }
}

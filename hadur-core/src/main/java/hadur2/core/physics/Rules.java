package hadur2.core.physics;

/**
 * The Robocode game rules the core relies on, identical to {@code robocode.Rules}.
 */
public final class Rules {

    public static final double ACCELERATION = 1.0;
    public static final double DECELERATION = 2.0;
    public static final double MAX_VELOCITY = 8.0;
    public static final double MAX_TURN_RATE = 10.0;
    public static final double GUN_TURN_RATE = 20.0;
    public static final double RADAR_TURN_RATE = 45.0;
    public static final double MIN_BULLET_POWER = 0.1;
    public static final double MAX_BULLET_POWER = 3.0;
    public static final double ROBOT_HIT_DAMAGE = 0.6;

    private Rules() {}

    /** Degrees per tick a robot can turn at {@code velocity}. */
    public static double getTurnRate(double velocity) {
        return MAX_TURN_RATE - 0.75 * Math.abs(velocity);
    }

    public static double getTurnRateRadians(double velocity) {
        return Math.toRadians(getTurnRate(velocity));
    }

    public static double getBulletSpeed(double power) {
        power = Math.min(Math.max(power, MIN_BULLET_POWER), MAX_BULLET_POWER);
        return 20 - 3 * power;
    }

    public static double getBulletDamage(double power) {
        double damage = 4 * power;
        if (power > 1) {
            damage += 2 * (power - 1);
        }
        return damage;
    }

    /** Energy the shooter gets back when its bullet hits. */
    public static double getBulletHitBonus(double power) {
        return 3 * power;
    }

    /** Energy a robot loses hitting a wall at {@code velocity}. */
    public static double getWallHitDamage(double velocity) {
        return Math.max(Math.abs(velocity) / 2 - 1, 0);
    }

    public static double getGunHeat(double power) {
        return 1 + power / 5;
    }
}

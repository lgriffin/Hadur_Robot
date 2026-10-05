package hadur2.core.duel;

import hadur2.core.model.BotInput;
import hadur2.core.model.BotOrders;
import hadur2.core.physics.Angles;
import hadur2.core.physics.BattleField;
import hadur2.core.physics.DiaUtils;
import hadur2.core.policy.DistancePolicy;
import hadur2.core.policy.TickBudget;
import java.awt.geom.Point2D;

/**
 * Duress (RES-9): what the core does with the rest of a round once the engine has skipped
 * {@value #SKIPS} of its turns in it. Every other computation level still runs the KNN gun
 * and the surf, at halved k at best; a robot that cannot finish a tick in time dies when it
 * stops moving, not when it aims badly. Duress runs nothing that grows or searches: no gun
 * waves, no movement waves, no samples, no neighbour tree. It orbits the enemy at the
 * distance floor ({@link DistancePolicy#FLOOR}), reversing at pseudo-random intervals so
 * its path is not a straight line to predict, wall-smoothed so the reversal never drives it
 * into a wall; fires head-on at power {@value #POWER} whenever the gun is cool and on the
 * enemy's last known spot; and keeps the radar on it.
 *
 * <p>The reversal's interval comes from a seeded generator (RES-6: no unseeded
 * randomness), so a replay of the same inputs makes the same orders (CORE-2). A round in
 * duress scores worse than a healthy one against a surfer and better than a dead robot
 * against anything.</p>
 */
public final class Duress {

    /** The skipped turns in one round that bring duress on. */
    public static final int SKIPS = TickBudget.DURESS_SKIPS;
    /** The head-on shot's power: cheap, and 1.0 is slow enough for a moving robot to dodge only by luck. */
    public static final double POWER = 1.0;
    /** The wall stick, in px: how far ahead the wall-smoothing looks. */
    static final double WALL_STICK = 160;
    /** The band around the floor inside which the orbit holds its distance. */
    static final double BAND = 50;
    /** How much the orbit leans in or out when outside the band, in radians. */
    static final double LEAN = 0.3;
    /** The shortest and the longest stretch between reversals, in ticks. */
    static final int MIN_RUN = 15;
    static final int RUN_SPREAD = 30;
    /** The gun fires once it is within this many radians of the enemy's last known spot (about 6 degrees). */
    static final double AIM_TOLERANCE = 0.1;

    private final BattleField field;
    private long seed;
    /** +1 clockwise, -1 counter-clockwise, as {@link BattleField#wallSmoothing} reads it. */
    private int orientation = 1;
    private long reverseAt;

    /**
     * Duress for a field.
     *
     * @param field the battlefield, for wall-smoothing
     */
    public Duress(BattleField field) {
        this.field = field;
        newRound(0);
    }

    /**
     * A new round starts the orbit clockwise with a reversal due at once, and reseeds the
     * generator from the round so two rounds do not reverse on the same ticks.
     *
     * @param round the round's number
     */
    public void newRound(int round) {
        seed = 0x9E3779B97F4A7C15L ^ (round * 0xBF58476D1CE4E5B9L);
        orientation = 1;
        reverseAt = Long.MIN_VALUE;
    }

    /**
     * The orders for this tick: orbit, hold the distance, fire head-on, lock the radar.
     *
     * @param in the tick's input
     * @param enemy where the enemy was last seen
     * @param orders the builder to write into
     * @return whether the gun fired this tick
     */
    public boolean orders(BotInput in, Point2D.Double enemy, BotOrders.Builder orders) {
        return orders(in, enemy, false, orders);
    }

    /**
     * As {@link #orders(BotInput, Point2D.Double, BotOrders.Builder)}, but a stale position
     * (the enemy has not scanned for more than a tick, likely a turn skipped) sweeps the
     * radar to find it again and holds fire, rather than shooting at an empty spot.
     *
     * @param stale whether the enemy's last known spot is out of date
     */
    public boolean orders(BotInput in, Point2D.Double enemy, boolean stale, BotOrders.Builder orders) {
        Point2D.Double me = in.location();
        double toEnemy = DiaUtils.absoluteBearing(me, enemy);
        double distance = me.distance(enemy);

        // Reverse at a pseudo-random interval, never inside a wall's reach: wall-smoothing
        // below turns the robot off a wall whichever way it is going.
        if (in.time() >= reverseAt) {
            if (reverseAt != Long.MIN_VALUE) orientation = -orientation;
            reverseAt = in.time() + MIN_RUN + nextInt(RUN_SPREAD);
        }
        // Tangent to the enemy, leaning in when too far and out when too close. Measured
        // from the enemy to us, as the surf's orbit is.
        double offset = Math.PI / 2;
        if (distance > DistancePolicy.FLOOR + BAND) offset += LEAN;
        else if (distance < DistancePolicy.FLOOR - BAND) offset -= LEAN;
        double goAngle = Angles.normalAbsoluteAngle(toEnemy + Math.PI + orientation * offset);
        goAngle = field.wallSmoothing(me, goAngle, orientation, WALL_STICK);
        DiaUtils.setBackAsFront(orders, in.heading(), goAngle);
        orders.maxVelocity(8.0);

        double radarTurn = Angles.normalRelativeAngle(toEnemy - in.radarHeading());
        orders.turnRadarRight(stale ? (radarTurn < 0 ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY)
            : radarTurn * 2.0);

        double aim = Angles.normalRelativeAngle(toEnemy - in.gunHeading());
        orders.turnGunRight(aim);
        double power = Math.min(POWER, in.energy() - 0.1);
        if (!stale && in.gunHeat() == 0.0 && Math.abs(aim) < AIM_TOLERANCE && power >= 0.1) {
            orders.fire(power);
            return true;
        }
        return false;
    }

    /** A xorshift step: seeded, so the same inputs make the same reversals. */
    private int nextInt(int bound) {
        seed ^= seed << 13;
        seed ^= seed >>> 7;
        seed ^= seed << 17;
        return (int) Long.remainderUnsigned(seed, bound);
    }
}

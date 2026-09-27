package hadur2.core.policy;

import hadur2.core.physics.Rules;

/**
 * The enemy's gun heat as far as its shots show it (END-1 compares it with ours). Robocode
 * starts every gun at {@link #START_HEAT} on the round's first tick, adds
 * {@code 1 + power / 5} on each shot, and cools it by the battle's cooling rate each tick.
 * A shot we never saw leaves the estimate low, which only makes END-1 less eager.
 */
public final class EnemyGunHeat {

    public static final double START_HEAT = 3.0;

    private final double coolingRate;
    private double heat = START_HEAT;
    private long since;

    public EnemyGunHeat(double coolingRate) {
        if (!(coolingRate > 0)) throw new IllegalArgumentException("cooling rate " + coolingRate);
        this.coolingRate = coolingRate;
    }

    /** A new round: every gun starts hot at tick 0. */
    public void newRound() {
        heat = START_HEAT;
        since = 0;
    }

    /** The enemy fired a bullet of {@code power} on tick {@code fireTime}. */
    public void shot(long fireTime, double power) {
        heat = Rules.getGunHeat(power);
        since = fireTime;
    }

    /** The estimated heat on tick {@code time}, never below 0. */
    public double at(long time) {
        return Math.max(0, heat - coolingRate * Math.max(0, time - since));
    }
}

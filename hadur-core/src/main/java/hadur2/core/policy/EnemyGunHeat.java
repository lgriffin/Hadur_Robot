package hadur2.core.policy;

import hadur2.core.physics.Rules;

/**
 * The enemy's gun heat as far as its shots show it (END-1 compares it with ours). Robocode
 * starts every gun at {@link #START_HEAT} on the round's first tick, adds
 * {@code 1 + power / 5} on each shot, and cools it by the battle's cooling rate each tick.
 * A shot we never saw leaves the estimate low, which only makes END-1 less eager.
 *
 * <p>{@code HadurCore} makes one the first time it needs it, with the battle's cooling rate,
 * resets it each round, and tells it of every shot the {@link hadur2.core.ledger.EnergyLedger}
 * finds. The estimate never needs more than the last shot: a gun can fire only once it has
 * cooled to 0, so the heat just after a shot is exactly that shot's heat.</p>
 */
public final class EnemyGunHeat {

    /** The heat every gun starts a round with, in the engine's gun-heat units. */
    public static final double START_HEAT = 3.0;

    /** Heat lost per tick: the battle's setting, 0.1 by default. */
    private final double coolingRate;
    /** The heat at tick {@code since}: the round's start, or the last shot. */
    private double heat = START_HEAT;
    private long since;

    /**
     * An estimate for a battle whose guns cool at {@code coolingRate} a tick.
     *
     * @param coolingRate gun heat lost per tick, as the engine reports it
     * @throws IllegalArgumentException if {@code coolingRate} is not positive (or is NaN)
     */
    public EnemyGunHeat(double coolingRate) {
        if (!(coolingRate > 0)) throw new IllegalArgumentException("cooling rate " + coolingRate);
        this.coolingRate = coolingRate;
    }

    /** A new round: every gun starts hot at tick 0. */
    public void newRound() {
        heat = START_HEAT;
        since = 0;
    }

    /**
     * The enemy fired a bullet of {@code power} on tick {@code fireTime}. The heat is set,
     * not added to, since the gun was at 0 to fire.
     *
     * @param fireTime the tick the shot was fired, as the firing wave places it
     * @param power the shot's power, in energy (the ledger's corrected drop)
     */
    public void shot(long fireTime, double power) {
        heat = Rules.getGunHeat(power);
        since = fireTime;
    }

    /**
     * The estimated heat on tick {@code time}, never below 0.
     *
     * @param time the tick to estimate for; a tick before the last shot reads that shot's heat
     * @return the estimated heat, 0 meaning the enemy's gun may be ready to fire
     */
    public double at(long time) {
        return Math.max(0, heat - coolingRate * Math.max(0, time - since));
    }
}

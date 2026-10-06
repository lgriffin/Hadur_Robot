package hadur2.core.shieldmode;

import hadur2.core.physics.Rules;

/**
 * SHIELD-6: how much bullet damage shield mode may cost over a battle. Once the enemy's
 * bullet damage exceeds what would hold our score share at {@link #HOLD_SHARE} over the
 * whole battle, shield mode is left for the rest of the battle.
 *
 * <p>The score share is ours over the pair's total, as the rumble takes it. The core cannot
 * know the final scores, so the budget is worked out from the battle's length and what has
 * happened:</p>
 * <pre>
 *   ours    = 60 * rounds in the battle + damage we dealt so far
 *   allowed = ours * (1 - HOLD_SHARE) / HOLD_SHARE
 *   leave shield mode when the enemy's bullet damage &gt; allowed
 * </pre>
 * <p>With the enemy's bullet damage as its whole score, ours/(ours + damage) stays at or above
 * {@link #HOLD_SHARE} exactly while the damage is within {@code allowed}. The 60 is a round's
 * survival bonus (50) and last-survivor bonus (10) in a 1v1, counted for every round of the
 * battle: shield mode is there to win them, so the battle is read as won and the budget asks
 * how much damage that can afford. For a 35-round battle the allowance starts at about 370
 * (35 * 60 * 15/85), which is DrussGT's limit for the robots on its list, and rises by 0.176
 * per point of damage we deal. It does not move with rounds won or lost: a round lost
 * shows in the damage taken. Kill bonuses and ramming scores are left out of both sides; ours
 * is a lower bound, so the budget errs towards leaving early.</p>
 *
 * <p>The round count is the engine's {@code getNumRounds()}; when it is not known (0) the
 * rumble's 35 is assumed. Damage counts every enemy bullet that hit us in the battle, in
 * shield mode or out of it. Plain arithmetic, no state beyond two counters.</p>
 */
public final class ShieldBudget {

    /** The score share shield mode must not let the battle fall below. */
    public static final double HOLD_SHARE = 0.85;
    /** A round's survival and last-survivor bonuses in a 1v1, in score points. */
    public static final double ROUND_BONUS = 60;

    /** The rounds assumed when the battle's length is not known: the rumble's. */
    public static final int DEFAULT_ROUNDS = 35;

    private final int rounds;
    private double taken;
    private double dealt;

    /**
     * A budget for one battle.
     *
     * @param rounds the battle's number of rounds; 0 or less when not known
     */
    public ShieldBudget(int rounds) {
        this.rounds = rounds > 0 ? rounds : DEFAULT_ROUNDS;
    }

    /**
     * The number of rounds the allowance is worked out for.
     *
     * @return the engine's count, or {@link #DEFAULT_ROUNDS} when it was not known
     */
    public int rounds() {
        return rounds;
    }

    /**
     * An enemy bullet hit us.
     *
     * @param power the bullet's power
     */
    public void damageTaken(double power) {
        taken += Rules.getBulletDamage(power);
    }

    /**
     * One of our bullets hit the enemy.
     *
     * @param power the bullet's power
     */
    public void damageDealt(double power) {
        dealt += Rules.getBulletDamage(power);
    }

    /**
     * The bullet damage the enemy may have done to us so far.
     *
     * @return the allowance, always positive and never below the battle's 60 * rounds * 15/85
     */
    public double allowed() {
        double ours = dealt + ROUND_BONUS * rounds;
        return ours * (1 - HOLD_SHARE) / HOLD_SHARE;
    }

    /**
     * The bullet damage the enemy has done to us this battle.
     *
     * @return the damage
     */
    public double taken() {
        return taken;
    }

    /**
     * Whether the enemy's bullet damage exceeds {@link #allowed()}.
     *
     * @return true when shield mode must be left for the rest of the battle
     */
    public boolean exceeded() {
        return taken > allowed();
    }
}

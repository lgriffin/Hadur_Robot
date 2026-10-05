package hadur2.core.shieldmode;

import hadur2.core.physics.Rules;

/**
 * SHIELD-6: how much bullet damage shield mode may cost over a battle. Once the enemy's
 * bullet damage exceeds what would hold our score share at {@link #HOLD_SHARE}, shield mode
 * is left for the rest of the battle.
 *
 * <p>The score share is ours over the pair's total, as the rumble takes it. The core cannot
 * know the final scores, so the budget is worked out from what has happened:</p>
 * <pre>
 *   ours    = damage we dealt + 60 * (rounds won + 1)
 *   allowed = ours * (1 - HOLD_SHARE) / HOLD_SHARE
 *   leave shield mode when the enemy's bullet damage &gt; allowed
 * </pre>
 * <p>With the enemy's bullet damage as its whole score, ours/(ours + damage) stays at or above
 * {@link #HOLD_SHARE} exactly while the damage is within {@code allowed}. The 60 is a round's
 * survival bonus (50) and last-survivor bonus (10) in a 1v1. The round in progress is credited
 * to us as won, so round 0 has an allowance (60 * 15/85, about 10.6 damage) and each round won
 * adds about 10.6. At 35 rounds all won the allowance is about 370, which is DrussGT's limit for
 * the robots on its list. A round lost is not charged on top: it costs us the energy that
 * the damage counts already. Kill bonuses and ramming scores are left out of both sides; ours
 * is a lower bound, so the budget errs towards leaving early.</p>
 *
 * <p>Damage counts every enemy bullet that hit us in the battle, in shield mode or out of
 * it. Plain arithmetic, no state beyond three counters.</p>
 */
public final class ShieldBudget {

    /** The score share shield mode must not let the battle fall below. */
    public static final double HOLD_SHARE = 0.85;
    /** A round's survival and last-survivor bonuses in a 1v1, in score points. */
    public static final double ROUND_BONUS = 60;

    private double taken;
    private double dealt;
    private int won;

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
     * A round ended. Only a round won moves the budget: it adds the round's 60 points to ours.
     *
     * @param wonRound whether we won it
     */
    public void roundEnded(boolean wonRound) {
        if (wonRound) won++;
    }

    /**
     * The bullet damage the enemy may have done to us so far.
     *
     * @return the allowance, always positive
     */
    public double allowed() {
        double ours = dealt + ROUND_BONUS * (won + 1);
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

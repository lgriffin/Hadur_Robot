package hadur2.core.policy;

import hadur2.core.memory.Estimate;
import hadur2.core.memory.Tiers;

/**
 * When to fire full power instead of the gun's own choice. Landing a power-3 bullet refunds
 * 9 energy and deals 16, so against a gun that rarely hits us full power is energy-positive
 * at any distance.
 *
 * <ul>
 * <li>POW-1: where the profile rates their gun T0 and their energy exceeds 12, fire 3.0.
 *     A tier is only named once its own margin is narrow (see {@link Tiers}), so this is
 *     already DIAL-1's form.</li>
 * <li>POW-2: while this battle shows our rolling hit rate above {@link #OUR_RATE} and theirs
 *     below {@link #THEIR_RATE}, each by more than its margin of error (measured from
 *     the estimate's centre, see {@link Estimate#center()}), fire 3.0. Uncertain
 *     rates keep the gun's own power (DIAL-1).</li>
 * </ul>
 *
 * <p>In both, the shot is still capped at a quarter of their energy, which is what kills
 * them, so a finishing shot never wastes energy. Neither applies while our own energy is
 * {@link #MIN_OUR_ENERGY} or less: there the gun's power-down in a losing energy war stands,
 * because a full-power miss could leave us disabled.</p>
 */
public final class PowerPolicy {

    public static final double FULL_POWER = 3.0;
    /** POW-1: their energy must exceed this for a full-power shot. */
    public static final double MIN_ENEMY_ENERGY = 12;
    /** Neither applies unless our energy exceeds this. */
    public static final double MIN_OUR_ENERGY = 12;
    /** POW-2: our rolling hit rate must be certainly above this ... */
    public static final double OUR_RATE = 0.20;
    /** ... and theirs certainly below this. */
    public static final double THEIR_RATE = 0.10;

    /** Why a shot got the power it did. */
    public enum Reason { GUN, POW_1, POW_2 }

    private PowerPolicy() {}

    /** The reason full power applies, or {@link Reason#GUN} to keep the gun's choice. */
    public static Reason reason(Tiers.Gun gunTier, double enemyEnergy, double ourEnergy,
                                Estimate ours, Estimate theirs) {
        if (!(ourEnergy > MIN_OUR_ENERGY)) return Reason.GUN;
        if (gunTier == Tiers.Gun.T0 && enemyEnergy > MIN_ENEMY_ENERGY) return Reason.POW_1;
        if (!Double.isNaN(ours.value()) && !Double.isNaN(theirs.value())
                && ours.center() - ours.margin() > OUR_RATE
                && theirs.center() + theirs.margin() < THEIR_RATE) {
            return Reason.POW_2;
        }
        return Reason.GUN;
    }

    /**
     * The power to fire: {@code gunPower} unless a reason applies, then {@link #FULL_POWER}
     * capped at a quarter of their energy, never below the gun's own choice.
     */
    public static double power(Reason reason, double gunPower, double enemyEnergy) {
        if (reason == Reason.GUN) return gunPower;
        return Math.max(gunPower, Math.min(FULL_POWER, enemyEnergy / 4.0));
    }
}

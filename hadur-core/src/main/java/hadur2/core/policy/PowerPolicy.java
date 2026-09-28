package hadur2.core.policy;

import hadur2.core.memory.Estimate;
import hadur2.core.memory.Tiers;
import hadur2.core.physics.Rules;

/**
 * When to fire full power instead of the gun's own choice, and, separately, when to fire
 * less than it chose because a kill is already certain. Landing a power-3 bullet refunds
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
 * <li>POW-3: where the profile rates their gun T1, they are within {@link #POW_3_RANGE} px
 *     and their energy exceeds 12, fire 3.0. A T1 gun is weak enough that closing the range
 *     already outweighs the energy risk, the same reasoning as POW-1 with one more tier and
 *     a range gate instead of an unconditional one.</li>
 * <li>POW-4: where no other rule applies and both rates are known within
 *     {@link #POW_4_MARGIN}, fire whichever of the gun's own power or {@link #FULL_POWER}
 *     gives the higher expected value ({@link #expectedValue}), our hit rate times the
 *     bullet's damage less the power spent. Robocode's damage curve is convex (its slope
 *     rises from 4 to 6 past power 1), so that expected value is convex in the power fired,
 *     and a convex function's best value over an interval is always at one of its ends —
 *     there is no point part-way between the gun's choice and full power worth checking.</li>
 * </ul>
 *
 * <p>Every full-power rule is still capped at a quarter of their energy, which is what kills
 * them, so a finishing shot never wastes energy, and none applies while our own energy is
 * {@link #MIN_OUR_ENERGY} or less: there the gun's power-down in a losing energy war stands,
 * because a full-power miss could leave us disabled.</p>
 *
 * <p>END-3 is the opposite kind of override, so it is a separate calculation
 * ({@link #leastPowerThatKills}) rather than a {@link Reason}: while their energy is at most
 * a power-3 bullet's damage, the fight is already decided by whichever power is fired, so the
 * least power that still kills spends no more energy than a kill needs. {@code HadurCore}
 * applies it last, after {@link #power}, capping whatever the gun or the rules above chose
 * down to it — never raising it, so a shot the gun could already afford stays affordable.</p>
 *
 * <p>{@code HadurCore} asks on every duel aim: the gun proposes a power, {@link #reason}
 * says whether a policy overrides it, and {@link #power} gives the power the wave and the
 * shot carry. Every method here is pure.</p>
 */
public final class PowerPolicy {

    /** The power the full-power rules fire, in energy: the engine's maximum. */
    public static final double FULL_POWER = 3.0;
    /** POW-1, POW-3: their energy must exceed this for a full-power shot. */
    public static final double MIN_ENEMY_ENERGY = 12;
    /** No rule here applies unless our energy exceeds this. */
    public static final double MIN_OUR_ENERGY = 12;
    /** POW-2: our rolling hit rate must be certainly above this ... */
    public static final double OUR_RATE = 0.20;
    /** ... and theirs certainly below this. */
    public static final double THEIR_RATE = 0.10;
    /** POW-3: their distance must be at most this, in px. */
    public static final double POW_3_RANGE = 450;
    /**
     * POW-4: both rates' margins must be at most this for the comparison to run. Set so a
     * full {@link HitWindow} (100 outcomes) can actually reach it in the range where full
     * power wins the comparison (above roughly 17% against a power-1 gun): at 0.05 its
     * Agresti-Coull margin only closes that far below about 7% or above 93%, where full
     * power practically never wins, so the rule could pass its unit tests (built from wider,
     * unrealistic windows) yet never fire in a real battle.
     */
    public static final double POW_4_MARGIN = 0.10;

    /**
     * Why a shot got the power it did: {@code GUN} when no rule applies and the gun's own
     * power stands, {@code POW_1}/{@code POW_2}/{@code POW_3} for the full-power rules,
     * {@code POW_4} when the expected-value comparison picked full power over the gun's own.
     */
    public enum Reason { GUN, POW_1, POW_2, POW_3, POW_4 }

    private PowerPolicy() {}

    /**
     * The reason full power applies, or {@link Reason#GUN} to keep the gun's choice.
     *
     * <p>Checked in order: our own energy first (at {@link #MIN_OUR_ENERGY} or below nothing
     * applies), then POW-1, POW-3, POW-2, then POW-4. POW-2 needs both rates known and each
     * bound clear by a full margin: our centre less our margin above {@link #OUR_RATE}, their
     * centre plus their margin below {@link #THEIR_RATE}. POW-4 needs both rates known within
     * {@link #POW_4_MARGIN} and the expected-value comparison ({@link #expectedValue}) to
     * favour full power over the gun's own choice.</p>
     *
     * @param gunTier the profile's tier for their gun; {@code UNKNOWN} unless its margin is narrow
     * @param enemyEnergy their energy at the scan, in energy
     * @param ourEnergy our energy, in energy
     * @param enemyDistance their distance at the scan, in px
     * @param gunPower the power the gun chose, for POW-4's comparison, in energy
     * @param ours our rolling hit rate on them
     * @param theirs their rolling hit rate on us
     * @return which rule, if any, sets the power
     */
    public static Reason reason(Tiers.Gun gunTier, double enemyEnergy, double ourEnergy,
                                double enemyDistance, double gunPower, Estimate ours, Estimate theirs) {
        if (!(ourEnergy > MIN_OUR_ENERGY)) return Reason.GUN;
        if (gunTier == Tiers.Gun.T0 && enemyEnergy > MIN_ENEMY_ENERGY) return Reason.POW_1;
        if (gunTier == Tiers.Gun.T1 && enemyEnergy > MIN_ENEMY_ENERGY && enemyDistance <= POW_3_RANGE) {
            return Reason.POW_3;
        }
        if (!Double.isNaN(ours.value()) && !Double.isNaN(theirs.value())
                && ours.center() - ours.margin() > OUR_RATE
                && theirs.center() + theirs.margin() < THEIR_RATE) {
            return Reason.POW_2;
        }
        if (!Double.isNaN(ours.value()) && ours.within(POW_4_MARGIN) && theirs.within(POW_4_MARGIN)
                && expectedValue(ours.value(), FULL_POWER) > expectedValue(ours.value(), gunPower)) {
            return Reason.POW_4;
        }
        return Reason.GUN;
    }

    /**
     * POW-4: the expected value of firing {@code power} at hit rate {@code hitRate}: the
     * damage it would do, times how often it lands, less the energy spent firing it whether
     * it lands or not.
     *
     * @param hitRate our hit rate on them, a fraction
     * @param power the power being evaluated, in energy
     * @return the expected value, in energy (may be negative)
     */
    public static double expectedValue(double hitRate, double power) {
        return hitRate * Rules.getBulletDamage(power) - power;
    }

    /**
     * The power to fire: {@code gunPower} unless a reason applies, then {@link #FULL_POWER}
     * capped at a quarter of their energy, never below the gun's own choice.
     *
     * <p>A bullet of power p takes 4p up to power 1, so a quarter of their energy is exactly
     * a killing shot at 4 energy or less, and more than enough above that.</p>
     *
     * @param reason the reason from {@link #reason}
     * @param gunPower the power the gun chose, in energy
     * @param enemyEnergy their energy, in energy
     * @return the power to fire, in energy
     */
    public static double power(Reason reason, double gunPower, double enemyEnergy) {
        if (reason == Reason.GUN) return gunPower;
        return Math.max(gunPower, Math.min(FULL_POWER, enemyEnergy / 4.0));
    }

    /**
     * END-3: the least power that guarantees a kill on a hit, or {@link Double#NaN} when no
     * single shot, even at {@link #FULL_POWER}, would do it.
     *
     * <p>Damage is {@code 4p} up to power 1 and {@code 6p - 2} above it, so the inverse is
     * taken on whichever segment their energy falls in, then clamped to a legal power. The
     * result is never less than {@link Rules#MIN_BULLET_POWER}: a bullet that would need
     * less than that to kill still needs firing at the minimum.</p>
     *
     * @param enemyEnergy their energy, in energy; not negative
     * @return the least power that kills on a hit, or {@link Double#NaN} if none does
     */
    public static double leastPowerThatKills(double enemyEnergy) {
        if (!(enemyEnergy > 0)) return Rules.MIN_BULLET_POWER;
        if (enemyEnergy > Rules.getBulletDamage(FULL_POWER)) return Double.NaN;
        double power = enemyEnergy <= Rules.getBulletDamage(1.0)
            ? enemyEnergy / 4.0
            : (enemyEnergy + 2.0) / 6.0;
        return Math.max(Rules.MIN_BULLET_POWER, Math.min(FULL_POWER, power));
    }
}

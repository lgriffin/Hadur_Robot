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
 * <p>The lead-aware regime (D1) is the one place the gun's own power-down is replaced, and only
 * while it holds ({@link #lead}):</p>
 * <ul>
 * <li>POW-7: while both robots' battle-long hit rates over all their bullets are below
 *     {@link #BREAK_EVEN} by more than their margins ({@link #conditionStands}), and our energy
 *     is no more than {@link #LEAD_MARGIN} below the enemy's, fire {@link Lead#CHAFF}, the
 *     minimum power. Both guns lose energy on every shot, so a lead is frozen by firing the
 *     cheapest bullet that still refunds on a hit.</li>
 * <li>POW-8: while that condition holds, we are more than {@link #LEAD_MARGIN} behind and our
 *     energy exceeds {@link #LEAD_MIN_ENERGY}, fire the gun's default power
 *     ({@link Lead#DEFAULT}): a trailing robot cannot freeze anything.</li>
 * <li>POW-9: while both energies exceed {@link #OPENING_ENERGY}, fire the default whatever
 *     POW-7 would choose: the opening exchange is traded at full stakes.</li>
 * <li>ADAPT-5: a profile that records the condition as standing starts it standing, and
 *     {@link #applies} drops it once this battle's rates are above {@link #BREAK_EVEN} by
 *     more than their margins.</li>
 * </ul>
 * <p>{@link Lead#DEFAULT} is the gun's base power (1.95, or 2.95 inside 150 px) without 1.20's
 * cubic power-down, which {@code GunController} skips in the regime. POW-1 to POW-5, RAM-1
 * and END-3 still apply to what the regime chose, in the order {@code DuelController}
 * runs them, so the full-power rules raise it and END-3 lowers it as before.</p>
 *
 * <p>POW-10: {@link #payable} lowers a power that the energy cannot pay for instead of
 * holding the shot. END-4 ({@link #holdsLastShot}) is the one exception that holds a shot we
 * could pay for. SHIELD-4 ({@link #shieldPower}) raises the power to 3.0 against a still
 * bullet shielder, before END-3 caps it.</p>
 *
 * <p>Every full-power rule is still capped at a quarter of their energy, which is what kills
 * them, so a finishing shot never wastes energy, and none applies while our own energy is
 * {@link #MIN_OUR_ENERGY} or less: there the gun's power-down in a losing energy war stands,
 * because a full-power miss could leave us disabled.</p>
 *
 * <p>POW-5 is the opposite kind of rule, a cap rather than a raise: while the enemy's gun
 * tier is T3 and they are beyond {@link #POW_5_RANGE} px, cap the shot at
 * {@link #POW_5_CAP} unless a full-power rule (POW-1 to POW-4, or RAM-1) already applies. A
 * T3 gun is the opposite risk from POW-1/POW-3's weak guns: it is good enough to punish a
 * heavier bullet's telegraphed extra turn time at long range, where the extra damage is
 * worth less than the extra exposure, so the cap trades damage for staying less predictable
 * rather than the other rules' trade the other way.</p>
 *
 * <p>POW-5 is a cap, not a {@link Reason}, for the same reason END-3 is: it can only lower
 * what was chosen, never raise it, so it is applied before the full-power rules
 * ({@code HadurCore} calls {@link #capPower} on the gun's own choice, then {@link #reason}
 * and {@link #power} on the result) and a full-power rule that fires afterwards overrides it
 * exactly as "unless a full-power rule applies" asks — {@link #power}'s {@code Math.max}
 * against the gun's choice already ensures a full-power rule never ends up capped by POW-5
 * to something lower than what it or the gun would have chosen on their own.</p>
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
    /** POW-5: their distance must exceed this, in px, for the cap to apply. */
    public static final double POW_5_RANGE = 500;
    /** POW-5: the power the shot is capped at against a T3 gun beyond {@link #POW_5_RANGE}. */
    public static final double POW_5_CAP = 1.7;

    /**
     * POW-7: the hit rate at which a bullet of power p returns its cost, p over the damage it
     * does plus the 3p it refunds: 1 / 7 = 14.3% at power 1 and below, 1.95 / (9.7 + 5.85) =
     * 12.5% at 1.95. The lower figure is used for every bullet, so the condition stands only
     * while both guns lose energy at either of those powers.
     */
    public static final double BREAK_EVEN = 0.125;
    /** POW-7, POW-8: how far behind the enemy our energy may be before the regime stops chaffing. */
    public static final double LEAD_MARGIN = 3.0;
    /** POW-8: our energy must exceed this for the trailing robot to raise its stakes. */
    public static final double LEAD_MIN_ENERGY = 10;
    /** POW-9: both robots' energy must exceed this for the opening exchange to be traded at the default power. */
    public static final double OPENING_ENERGY = 60;
    /** POW-10: the energy left in hand when a shot is lowered to what we can pay for. */
    public static final double RESERVE = 0.1;
    /** END-4: the energy our side must keep above the enemy's once it can no longer fire. */
    public static final double END_4_MARGIN = 0.3;

    /**
     * What the lead-aware regime (POW-7 to POW-9) asks of the gun's power: {@code OFF} leaves
     * 1.20's choice, {@code CHAFF} is the minimum power, {@code DEFAULT} is the gun's base
     * power without its power-down.
     */
    public enum Lead { OFF, CHAFF, DEFAULT }

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
     * POW-7's hit-rate condition: both robots' hit rates over all their bullets are known and
     * below {@link #BREAK_EVEN} by more than their margins, measured from the estimate's centre
     * as POW-2 does (the centre plus the margin is still under the figure).
     *
     * @param ours our battle-long hit rate
     * @param theirs their battle-long hit rate
     * @return whether the condition stands
     */
    public static boolean conditionStands(Estimate ours, Estimate theirs) {
        return below(ours) && below(theirs);
    }

    /**
     * ADAPT-5: whether this battle's rates contradict the condition: either robot's hit rate is
     * above {@link #BREAK_EVEN} by more than its margin (the centre less the margin is still over
     * the figure).
     *
     * @param ours our battle-long hit rate
     * @param theirs their battle-long hit rate
     * @return whether the evidence is conclusive that the condition does not hold
     */
    public static boolean conditionContradicted(Estimate ours, Estimate theirs) {
        return above(ours) || above(theirs);
    }

    /**
     * Whether the lead-aware regime is in force: this battle's own rates satisfy POW-7's
     * condition, or the profile recorded it as standing (ADAPT-5) and this battle's rates have
     * not contradicted it. Evidence from this battle always outranks the profile's verdict, so
     * with neither side conclusive the profile's stands.
     *
     * @param profileVerdict the profile's verdict, false for a stranger
     * @param ours our battle-long hit rate
     * @param theirs their battle-long hit rate
     * @return whether POW-7 to POW-9 apply
     */
    public static boolean applies(boolean profileVerdict, Estimate ours, Estimate theirs) {
        if (conditionStands(ours, theirs)) return true;
        return profileVerdict && !conditionContradicted(ours, theirs);
    }

    /**
     * POW-7 to POW-9: what the regime asks of the power, given whether it is in force. POW-9
     * comes first (both energies above {@link #OPENING_ENERGY}: the default), then POW-7 (no
     * more than {@link #LEAD_MARGIN} behind: chaff), then POW-8 (further behind with more than
     * {@link #LEAD_MIN_ENERGY}: the default). Further behind with that much or less, no rule
     * raises the stakes: the minimum power is fired. 1.20's power-down is not relied on for
     * that, as it only applies beyond 325 px and a nearly dead robot closer in would
     * otherwise fire 1.95 or 2.95 and spend almost all it has left.
     *
     * @param applies whether the regime is in force ({@link #applies})
     * @param ourEnergy our energy
     * @param enemyEnergy their energy
     * @return the regime's call
     */
    public static Lead lead(boolean applies, double ourEnergy, double enemyEnergy) {
        if (!applies) return Lead.OFF;
        if (ourEnergy > OPENING_ENERGY && enemyEnergy > OPENING_ENERGY) return Lead.DEFAULT;
        if (ourEnergy - enemyEnergy >= -LEAD_MARGIN) return Lead.CHAFF;
        return ourEnergy > LEAD_MIN_ENERGY ? Lead.DEFAULT : Lead.CHAFF;
    }

    /**
     * SHIELD-4: the power to fire at a bullet shielder that has not moved in the last 10 ticks:
     * {@link #FULL_POWER}, never below what the rules before it chose. A shielder answers with a
     * bullet that scales with ours, so a heavier shot makes its shield dearer. END-3 lowers the
     * result afterwards, as it does every power.
     *
     * @param shielder whether the enemy is treated as a bullet shielder (SHIELD-1, SHIELD-3)
     * @param stillForTenTicks whether the enemy has not moved in the last 10 ticks
     * @param power the power chosen so far
     * @param ourEnergy our energy: like every full-power rule, SHIELD-4 does not apply at
     *     {@link #MIN_OUR_ENERGY} or below, where a shot a shielder destroys (no refund) could
     *     leave us disabled
     * @return the power to carry on with
     */
    public static double shieldPower(boolean shielder, boolean stillForTenTicks, double power,
                                     double ourEnergy) {
        return shielder && stillForTenTicks && ourEnergy > MIN_OUR_ENERGY ? Math.max(power, FULL_POWER) : power;
    }

    /**
     * END-4: whether to hold a shot so the last of our energy is kept. It holds while the
     * enemy's energy is below the smallest bullet power it has fired this battle (so it can no
     * longer fire, and the inactivity rule decides a stalemate for whoever has more energy), we
     * are ahead, and the shot would leave our energy less than {@link #END_4_MARGIN} above the
     * enemy's. When level or behind there is no lead to keep, and holding would lose to the
     * inactivity rule for certain, so the shot goes (POW-10).
     *
     * @param ourEnergy our energy now
     * @param firePower the power the shot would leave at
     * @param enemyEnergy their energy at the last scan
     * @param smallestEnemyPower the smallest bullet power they have fired this battle, or NaN if none
     * @return whether to hold the shot
     */
    public static boolean holdsLastShot(double ourEnergy, double firePower, double enemyEnergy,
                                        double smallestEnemyPower) {
        if (Double.isNaN(smallestEnemyPower) || !(enemyEnergy < smallestEnemyPower)) return false;
        if (!(ourEnergy > enemyEnergy)) return false;
        return ourEnergy - firePower - enemyEnergy < END_4_MARGIN;
    }

    /**
     * END-4 for a shot that does not go through the main gun's own hold: shield mode's attack
     * shots and duress's head-on shots. The power that would really leave is the one asked for,
     * lowered to what our energy can pay (shield mode keeps 1 of it), so that is what is tested.
     *
     * @param ourEnergy our energy now
     * @param power the power the shot would leave at
     * @param reserve the energy the shot's own rules keep back from it
     * @param enemyEnergy their energy at the last scan
     * @param smallestEnemyPower the smallest bullet power they have fired this battle, or NaN if none
     * @return whether to hold the shot
     */
    public static boolean holdsShotAt(double ourEnergy, double power, double reserve,
                                      double enemyEnergy, double smallestEnemyPower) {
        double fired = Math.min(power, ourEnergy - reserve);
        return fired >= Rules.MIN_BULLET_POWER - 1e-9
            && holdsLastShot(ourEnergy, fired, enemyEnergy, smallestEnemyPower);
    }

    private static boolean below(Estimate e) {
        return !Double.isNaN(e.value()) && e.center() + e.margin() < BREAK_EVEN;
    }

    private static boolean above(Estimate e) {
        return !Double.isNaN(e.value()) && e.center() - e.margin() > BREAK_EVEN;
    }

    /**
     * POW-10: the power a shot can be paid for at. A power below our energy stands; otherwise
     * it is lowered to {@link #RESERVE} less than our energy, never below the engine's minimum.
     * NaN when even the minimum power would leave nothing (our energy is at most
     * {@link Rules#MIN_BULLET_POWER}), the one shot we cannot pay for.
     *
     * @param power the power chosen
     * @param energy our energy now
     * @return the power to fire, or NaN when none can be paid for
     */
    public static double payable(double power, double energy) {
        if (power < energy) return power;
        double lowered = Math.max(Rules.MIN_BULLET_POWER, energy - RESERVE);
        return lowered < energy ? lowered : Double.NaN;
    }

    /**
     * POW-5: caps {@code gunPower} at {@link #POW_5_CAP} while {@code gunTier} is T3 and
     * {@code distance} exceeds {@link #POW_5_RANGE}, otherwise returns it unchanged. Never
     * raises it, so a cheaper shot the gun already chose is never made more expensive; a
     * caller applies this before {@link #reason}/{@link #power} so a full-power rule can
     * still override it upward afterwards ("unless a full-power rule applies").
     *
     * @param gunTier the profile's tier for their gun; {@code UNKNOWN} unless its margin is narrow
     * @param distance their distance at the scan, in px
     * @param gunPower the power the gun (or an earlier step) chose, in energy
     * @return {@code gunPower}, or {@link #POW_5_CAP} if that is lower and the gate is met
     */
    public static double capPower(Tiers.Gun gunTier, double distance, double gunPower) {
        if (gunTier == Tiers.Gun.T3 && distance > POW_5_RANGE) {
            return Math.min(gunPower, POW_5_CAP);
        }
        return gunPower;
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

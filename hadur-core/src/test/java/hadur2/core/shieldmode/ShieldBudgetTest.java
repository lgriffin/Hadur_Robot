package hadur2.core.shieldmode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import net.jqwik.api.Example;
import net.jqwik.api.ForAll;
import net.jqwik.api.Property;
import net.jqwik.api.Tag;
import net.jqwik.api.constraints.DoubleRange;
import net.jqwik.api.constraints.IntRange;

/** SHIELD-6: the damage budget, as arithmetic and as the 85% score share it stands for. */
class ShieldBudgetTest {

    /** What one round's 60 points allows the enemy to score: 60 * 15 / 85. */
    private static final double STEP = ShieldBudget.ROUND_BONUS * 0.15 / 0.85;

    @Example
    @Tag("SHIELD-6")
    void aThirtyFiveRoundBattleAllowsAboutThreeHundredSeventy() {
        ShieldBudget b = new ShieldBudget(35);
        assertEquals(35 * STEP, b.allowed(), 1e-9);
        assertEquals(370.6, b.allowed(), 0.1);
    }

    @Example
    @Tag("SHIELD-6")
    void anUnknownBattleLengthIsTheRumblesThirtyFive() {
        assertEquals(35, new ShieldBudget(0).rounds());
        assertEquals(35, new ShieldBudget(-3).rounds());
        assertEquals(new ShieldBudget(35).allowed(), new ShieldBudget(0).allowed(), 0);
    }

    @Example
    @Tag("SHIELD-6")
    void aOneRoundBattleAllowsAboutTenAndAHalf() {
        ShieldBudget b = new ShieldBudget(1);
        assertEquals(10.588, b.allowed(), 1e-3);
        b.damageTaken(1.95);
        assertFalse(b.exceeded(), "9.7 damage is under 10.59");
        b.damageTaken(1.95);
        assertTrue(b.exceeded(), "19.4 damage is over it");
    }

    @Example
    @Tag("SHIELD-6")
    void damageWeDealtRaisesTheAllowanceByItsShareOfTheLimit() {
        ShieldBudget b = new ShieldBudget(35);
        double before = b.allowed();
        b.damageDealt(2.0);
        // 4 * 2 + 2 * (2 - 1) = 10 damage dealt.
        assertEquals(before + 10 * 0.15 / 0.85, b.allowed(), 1e-9);
    }

    @Property
    @Tag("SHIELD-6")
    void leavingMeansTheShareWouldFallBelowEightyFivePercent(
            @ForAll @IntRange(min = 1, max = 100) int rounds,
            @ForAll @DoubleRange(min = 0.1, max = 3.0) double dealtPower,
            @ForAll @IntRange(min = 0, max = 200) int hits,
            @ForAll @DoubleRange(min = 0.1, max = 3.0) double hitPower) {
        ShieldBudget b = new ShieldBudget(rounds);
        b.damageDealt(dealtPower);
        for (int i = 0; i < hits; i++) b.damageTaken(hitPower);
        // Ours is the allowance back over (1 - hold) / hold.
        double ours = b.allowed() * ShieldBudget.HOLD_SHARE / (1 - ShieldBudget.HOLD_SHARE);
        double share = ours / (ours + b.taken());
        if (b.exceeded()) assertTrue(share < ShieldBudget.HOLD_SHARE, "share " + share);
        else assertTrue(share >= ShieldBudget.HOLD_SHARE - 1e-12, "share " + share);
    }

    @Property
    @Tag("SHIELD-6")
    void moreRoundsOrMoreDamageDealtRaiseTheAllowance(
            @ForAll @IntRange(min = 1, max = 100) int rounds,
            @ForAll @DoubleRange(min = 0.1, max = 3.0) double power) {
        ShieldBudget shorter = new ShieldBudget(rounds);
        ShieldBudget longer = new ShieldBudget(rounds + 1);
        assertTrue(longer.allowed() > shorter.allowed());
        double a0 = shorter.allowed();
        shorter.damageDealt(power);
        assertTrue(shorter.allowed() > a0);
    }
}

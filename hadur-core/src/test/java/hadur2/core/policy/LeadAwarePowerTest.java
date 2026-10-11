package hadur2.core.policy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur2.core.memory.Estimate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;

/** POW-7, POW-8, POW-9, POW-10 and ADAPT-5's rule, as pure functions. */
class LeadAwarePowerTest {

    /** 6% over 120 bullets: well under break-even even with its margin (about 4.6 points). */
    static final Estimate LOW = Estimate.of(7, 120);
    /** 10% over 40 bullets: under 12.5% as a rate, but the margin reaches over it. */
    static final Estimate UNSURE = Estimate.of(4, 40);
    /** 30% over 100 bullets: over break-even by more than the margin. */
    static final Estimate HIGH = Estimate.of(30, 100);

    @Test
    @Tag("POW-7")
    @DisplayName("POW-7: the break-even is the lower figure, 12.5%, for every bullet")
    void breakEvenIsTheLowerFigure() {
        assertEquals(0.125, PowerPolicy.BREAK_EVEN, 0.0);
        // A bullet of power p breaks even at p over (damage + refund): 1/7 at 1.0, 12.5% at 1.95.
        assertEquals(1.0 / 7, 1.0 / (4 + 3), 1e-12);
        assertEquals(0.125, 1.95 / (6 * 1.95 - 2 + 3 * 1.95), 1e-3);
    }

    @Test
    @Tag("POW-7")
    @DisplayName("POW-7: both rates must be below break-even by more than their margins")
    void conditionNeedsBothBelowByMoreThanTheMargin() {
        assertTrue(PowerPolicy.conditionStands(LOW, LOW));
        assertFalse(PowerPolicy.conditionStands(LOW, UNSURE), "a rate whose margin reaches break-even is not below it");
        assertFalse(PowerPolicy.conditionStands(UNSURE, LOW));
        assertFalse(PowerPolicy.conditionStands(LOW, HIGH));
        assertFalse(PowerPolicy.conditionStands(HIGH, LOW));
        assertFalse(PowerPolicy.conditionStands(Estimate.NONE, LOW), "nothing known is not below anything");
        assertFalse(PowerPolicy.conditionStands(LOW, Estimate.NONE));
    }

    @Test
    @Tag("POW-7")
    @DisplayName("POW-7: the margin is measured from the estimate's centre, as POW-2 does")
    void marginFromTheCentre() {
        // 0 hits in n: the centre is 2 / (n + 4), the margin 1.96 sqrt(p (1 - p) / (n + 4)).
        Estimate none = Estimate.of(0, 36);
        assertEquals(0.125, none.center() + none.margin(), 0.02, "about 36 misses are needed to clear 12.5%");
        assertTrue(PowerPolicy.conditionStands(Estimate.of(0, 40), Estimate.of(0, 40)));
        assertFalse(PowerPolicy.conditionStands(Estimate.of(0, 25), Estimate.of(0, 25)));
    }

    @Test
    @Tag("POW-7")
    @DisplayName("POW-7: level or ahead, or no more than 3 behind, fire the minimum power")
    void chaffWhenLevelOrAheadOrWithinThree() {
        assertEquals(PowerPolicy.Lead.CHAFF, PowerPolicy.lead(true, 50, 50));
        assertEquals(PowerPolicy.Lead.CHAFF, PowerPolicy.lead(true, 60, 40));
        assertEquals(PowerPolicy.Lead.CHAFF, PowerPolicy.lead(true, 47, 50), "exactly 3 behind is no more than 3");
        assertEquals(PowerPolicy.Lead.CHAFF, PowerPolicy.lead(true, 5, 6));
    }

    @Test
    @Tag("POW-8")
    @DisplayName("POW-8: more than 3 behind with more than 10 energy, the default power")
    void defaultWhenFurtherBehind() {
        assertEquals(PowerPolicy.Lead.DEFAULT, PowerPolicy.lead(true, 46.9, 50));
        assertEquals(PowerPolicy.Lead.DEFAULT, PowerPolicy.lead(true, 10.1, 40));
        assertEquals(PowerPolicy.Lead.CHAFF, PowerPolicy.lead(true, 10, 40),
            "10 energy is not more than 10: the minimum power, not 1.20's power-down (325 px only)");
        assertEquals(PowerPolicy.Lead.CHAFF, PowerPolicy.lead(true, 3, 40));
    }

    @Test
    @Tag("POW-9")
    @DisplayName("POW-9: while both exceed 60 energy, the default power whatever POW-7 would choose")
    void openingExchangeAtTheDefault() {
        assertEquals(PowerPolicy.Lead.DEFAULT, PowerPolicy.lead(true, 100, 100), "level: POW-7 would chaff");
        assertEquals(PowerPolicy.Lead.DEFAULT, PowerPolicy.lead(true, 100, 61));
        assertEquals(PowerPolicy.Lead.DEFAULT, PowerPolicy.lead(true, 61, 100), "behind: POW-8 says the same");
        assertEquals(PowerPolicy.Lead.CHAFF, PowerPolicy.lead(true, 61, 60), "one of them at 60: POW-7 holds");
        assertEquals(PowerPolicy.Lead.CHAFF, PowerPolicy.lead(true, 100, 60));
    }

    @Test
    @Tag("POW-7")
    @DisplayName("POW-7: no regime without the hit-rate condition")
    void offWithoutTheCondition() {
        assertEquals(PowerPolicy.Lead.OFF, PowerPolicy.lead(false, 50, 50));
        assertEquals(PowerPolicy.Lead.OFF, PowerPolicy.lead(false, 100, 100));
        assertEquals(PowerPolicy.Lead.OFF, PowerPolicy.lead(false, 20, 90));
    }

    @Test
    @Tag("ADAPT-5")
    @DisplayName("ADAPT-5: a profile's verdict applies from the first shot, until this battle contradicts it")
    void profileVerdictAppliesUntilContradicted() {
        assertTrue(PowerPolicy.applies(true, Estimate.NONE, Estimate.NONE), "from the first shot");
        assertFalse(PowerPolicy.applies(false, Estimate.NONE, Estimate.NONE), "a stranger waits for evidence");
        assertTrue(PowerPolicy.applies(true, UNSURE, UNSURE), "inconclusive evidence leaves the verdict standing");
        assertTrue(PowerPolicy.applies(true, LOW, UNSURE));
        assertFalse(PowerPolicy.applies(true, HIGH, LOW), "our rate is over break-even by more than its margin");
        assertFalse(PowerPolicy.applies(true, LOW, HIGH), "so is theirs");
        assertTrue(PowerPolicy.conditionContradicted(HIGH, Estimate.NONE));
        assertFalse(PowerPolicy.conditionContradicted(UNSURE, UNSURE), "a rate near break-even contradicts nothing");
    }

    @Test
    @Tag("ADAPT-5")
    @DisplayName("ADAPT-5: this battle's own evidence for the condition applies it whatever the profile says")
    void ownEvidenceAppliesWithoutAVerdict() {
        assertTrue(PowerPolicy.applies(false, LOW, LOW));
        assertTrue(PowerPolicy.applies(true, LOW, LOW));
    }

    @Test
    @Tag("POW-10")
    @DisplayName("POW-10: a power below our energy stands; one we cannot pay for is lowered, not held")
    void payableLowersInsteadOfHolding() {
        assertEquals(1.95, PowerPolicy.payable(1.95, 50), 0.0);
        assertEquals(0.1, PowerPolicy.payable(0.1, 0.15), 0.0, "0.1 can be paid for out of 0.15");
        assertEquals(1.4, PowerPolicy.payable(1.95, 1.5), 1e-12, "lowered to leave 0.1 in hand");
        assertEquals(1.4, PowerPolicy.payable(1.5, 1.5), 1e-12, "a shot equal to our energy is lowered too");
        assertEquals(0.1, PowerPolicy.payable(1.0, 0.15), 1e-12, "never below the engine's minimum");
        assertEquals(0.1, PowerPolicy.payable(0.5, 0.12), 1e-12);
        assertTrue(Double.isNaN(PowerPolicy.payable(0.1, 0.1)), "nothing can be paid for out of 0.1");
        assertTrue(Double.isNaN(PowerPolicy.payable(0.1, 0.05)));
    }
}

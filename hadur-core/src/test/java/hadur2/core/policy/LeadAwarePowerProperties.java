package hadur2.core.policy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur2.core.memory.Estimate;
import net.jqwik.api.ForAll;
import net.jqwik.api.Property;
import net.jqwik.api.Tag;
import net.jqwik.api.constraints.DoubleRange;
import net.jqwik.api.constraints.Scale;
import net.jqwik.api.constraints.IntRange;

/** The lead-aware regime and the payable power hold for every energy and every record of hits. */
class LeadAwarePowerProperties {

    @Property
    @Tag("POW-9")
    void bothAboveSixtyIsAlwaysTheDefault(@ForAll @DoubleRange(min = 60.001, max = 200) @Scale(3) double ours,
                                          @ForAll @DoubleRange(min = 60.001, max = 200) @Scale(3) double theirs) {
        assertEquals(PowerPolicy.Lead.DEFAULT, PowerPolicy.lead(true, ours, theirs));
    }

    @Property
    @Tag("POW-7")
    void levelOrAheadIsChaffUnlessBothAboveSixty(@ForAll @DoubleRange(min = 0.1, max = 60) @Scale(3) double theirs,
                                                  @ForAll @DoubleRange(min = 0, max = 100) @Scale(3) double extra) {
        // The enemy at 60 or less, so POW-9 cannot apply; we are at least level.
        assertEquals(PowerPolicy.Lead.CHAFF, PowerPolicy.lead(true, theirs + extra, theirs));
    }

    @Property
    @Tag("POW-8")
    void furtherBehindWithMoreThanTenIsTheDefault(@ForAll @DoubleRange(min = 10.001, max = 150) @Scale(3) double ours,
                                                   @ForAll @DoubleRange(min = 3.001, max = 100) @Scale(3) double behind) {
        assertEquals(PowerPolicy.Lead.DEFAULT, PowerPolicy.lead(true, ours, ours + behind));
    }

    @Property
    @Tag("POW-7")
    void noRegimeNoCall(@ForAll @DoubleRange(min = 0, max = 200) @Scale(3) double ours,
                         @ForAll @DoubleRange(min = 0, max = 200) @Scale(3) double theirs) {
        assertEquals(PowerPolicy.Lead.OFF, PowerPolicy.lead(false, ours, theirs));
    }

    @Property
    @Tag("ADAPT-5")
    void evidenceFromThisBattleOutranksTheProfile(@ForAll @IntRange(min = 0, max = 400) int oursHit,
                                                   @ForAll @IntRange(min = 1, max = 400) int oursShots,
                                                   @ForAll @IntRange(min = 0, max = 400) int theirsHit,
                                                   @ForAll @IntRange(min = 1, max = 400) int theirsShots) {
        Estimate ours = Estimate.of(Math.min(oursHit, oursShots), oursShots);
        Estimate theirs = Estimate.of(Math.min(theirsHit, theirsShots), theirsShots);
        // The condition and its contradiction never hold together.
        assertFalse(PowerPolicy.conditionStands(ours, theirs) && PowerPolicy.conditionContradicted(ours, theirs));
        // Met by this battle: applies whatever the profile says. Contradicted by it: never applies.
        if (PowerPolicy.conditionStands(ours, theirs)) {
            assertTrue(PowerPolicy.applies(false, ours, theirs));
            assertTrue(PowerPolicy.applies(true, ours, theirs));
        }
        if (PowerPolicy.conditionContradicted(ours, theirs)) {
            assertFalse(PowerPolicy.applies(false, ours, theirs));
            assertFalse(PowerPolicy.applies(true, ours, theirs));
        }
        // Neither: the profile's verdict stands as it is.
        if (!PowerPolicy.conditionStands(ours, theirs) && !PowerPolicy.conditionContradicted(ours, theirs)) {
            assertTrue(PowerPolicy.applies(true, ours, theirs));
            assertFalse(PowerPolicy.applies(false, ours, theirs));
        }
    }

    @Property
    @Tag("POW-10")
    void aShotWeCanPayForIsNeverHeld(@ForAll @DoubleRange(min = 0.1, max = 3.0) @Scale(3) double power,
                                      @ForAll @DoubleRange(min = 0, max = 200) @Scale(3) double energy) {
        double pay = PowerPolicy.payable(power, energy);
        if (energy > 0.1) {
            assertFalse(Double.isNaN(pay), "energy " + energy + " can pay for at least the minimum power");
            assertTrue(pay < energy, "paying leaves some energy");
            assertTrue(pay >= 0.1 - 1e-12, "never below the engine's minimum");
            assertTrue(pay <= power + 1e-12, "lowered, never raised");
            if (power < energy) assertEquals(power, pay, 0.0, "a payable power stands");
        } else {
            assertTrue(Double.isNaN(pay), "at most 0.1 energy cannot pay for any shot");
        }
    }
}

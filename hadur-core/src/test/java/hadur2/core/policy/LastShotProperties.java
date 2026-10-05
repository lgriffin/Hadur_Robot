package hadur2.core.policy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import net.jqwik.api.ForAll;
import net.jqwik.api.Property;
import net.jqwik.api.Tag;
import net.jqwik.api.constraints.DoubleRange;
import net.jqwik.api.constraints.Scale;

/** SHIELD-4 and END-4 hold for every energy and power. */
class LastShotProperties {

    @Property
    @Tag("SHIELD-4")
    void aStillShielderIsNeverShotBelowFullPower(@ForAll @DoubleRange(min = 0.1, max = 3.0) @Scale(3) double chosen) {
        assertEquals(PowerPolicy.FULL_POWER, PowerPolicy.shieldPower(true, true, chosen));
    }

    @Property
    @Tag("SHIELD-4")
    void withoutBothConditionsThePowerIsUnchanged(@ForAll @DoubleRange(min = 0.1, max = 3.0) @Scale(3) double chosen,
                                                  @ForAll boolean shielder, @ForAll boolean still) {
        if (!(shielder && still)) assertEquals(chosen, PowerPolicy.shieldPower(shielder, still, chosen));
    }

    @Property
    @Tag("END-4")
    void aHeldShotWouldHaveLeftUsUnderTheMargin(@ForAll @DoubleRange(min = 0, max = 10) @Scale(3) double ours,
                                                @ForAll @DoubleRange(min = 0.1, max = 3) @Scale(3) double power,
                                                @ForAll @DoubleRange(min = 0, max = 10) @Scale(3) double theirs,
                                                @ForAll @DoubleRange(min = 0.1, max = 3) @Scale(3) double smallest) {
        if (PowerPolicy.holdsLastShot(ours, power, theirs, smallest)) {
            assertTrue(theirs < smallest, "the enemy can no longer fire");
            assertTrue(ours > theirs, "we are ahead");
            assertTrue(ours - power - theirs < PowerPolicy.END_4_MARGIN);
        }
    }

    @Property
    @Tag("END-4")
    void anEnemyThatCanFireIsNeverReason(@ForAll @DoubleRange(min = 0, max = 10) @Scale(3) double ours,
                                         @ForAll @DoubleRange(min = 0.1, max = 3) @Scale(3) double power,
                                         @ForAll @DoubleRange(min = 0.1, max = 3) @Scale(3) double smallest,
                                         @ForAll @DoubleRange(min = 0, max = 5) @Scale(3) double extra) {
        assertFalse(PowerPolicy.holdsLastShot(ours, power, smallest + extra, smallest));
        assertFalse(PowerPolicy.holdsLastShot(ours, power, 0.1, Double.NaN));
    }

    @Property
    @Tag("END-4")
    void aShotThatKeepsTheMarginIsNeverHeld(@ForAll @DoubleRange(min = 0.1, max = 3) @Scale(3) double power,
                                            @ForAll @DoubleRange(min = 0, max = 5) @Scale(3) double theirs,
                                            @ForAll @DoubleRange(min = 0, max = 5) @Scale(3) double spare) {
        double ours = theirs + power + PowerPolicy.END_4_MARGIN + 1e-6 + spare;
        assertFalse(PowerPolicy.holdsLastShot(ours, power, theirs, theirs + 1));
    }
}

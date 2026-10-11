package hadur2.core.duel;

import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur2.core.model.Wave;
import hadur2.core.move.PlanInterval;
import net.jqwik.api.ForAll;
import net.jqwik.api.Property;
import net.jqwik.api.Tag;
import net.jqwik.api.constraints.DoubleRange;
import net.jqwik.api.constraints.Scale;

/** GUN-7's saving is a bounded, non-negative expected damage for any candidate. */
class ShadowAvoidanceProperties {

    @Property(tries = 80)
    @Tag("GUN-7")
    void theSavingIsBetweenZeroAndTheCeiling(
            @ForAll @DoubleRange(min = 0, max = 6.28) @Scale(3) double heading,
            @ForAll @DoubleRange(min = 0.1, max = 3.0) @Scale(2) double power,
            @ForAll @DoubleRange(min = 0, max = 1) @Scale(2) double danger,
            @ForAll @DoubleRange(min = 0.01, max = 0.3) @Scale(3) double halfWidth) {
        Wave w = ShadowAvoidanceTest.wave();
        PlanInterval p = new PlanInterval(w, ShadowAvoidanceTest.DOWN - halfWidth,
            ShadowAvoidanceTest.DOWN + halfWidth, danger);
        ShadowAvoidance s = ShadowAvoidanceTest.seam(p);
        double saved = s.avoided(heading, power);
        assertTrue(saved >= 0, "saved " + saved);
        assertTrue(saved <= s.ceiling(power) + 1e-9, "saved " + saved + " ceiling " + s.ceiling(power));
    }

    @Property(tries = 60)
    @Tag("GUN-7")
    void withMoreOfTheIntervalAlreadyStoppedTheSavingNeverGrowsPastTheRemainingDanger(
            @ForAll @DoubleRange(min = -0.05, max = 0.05) @Scale(3) double offset) {
        Wave w = ShadowAvoidanceTest.wave();
        PlanInterval p = ShadowAvoidanceTest.interval(w, 0.3);
        double open = ShadowAvoidanceTest.seam(p).avoided(offset, 1.95);
        w.setShadows(java.util.List.of(new double[] {ShadowAvoidanceTest.DOWN - 0.02,
            ShadowAvoidanceTest.DOWN + 0.02}));
        double partly = ShadowAvoidanceTest.seam(p).avoided(offset, 1.95);
        // What is left to stop is what the interval has less the old shadow: never more is saved.
        assertTrue(partly <= ShadowAvoidanceTest.seam(p).ceiling(1.95) + 1e-9);
        assertTrue(open >= 0 && partly >= 0);
    }
}

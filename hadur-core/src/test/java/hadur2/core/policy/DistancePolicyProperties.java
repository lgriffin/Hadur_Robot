package hadur2.core.policy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur2.core.memory.Estimate;
import java.util.List;
import net.jqwik.api.ForAll;
import net.jqwik.api.Property;
import net.jqwik.api.Tag;
import net.jqwik.api.constraints.DoubleRange;
import net.jqwik.api.constraints.IntRange;
import net.jqwik.api.constraints.Size;

/** DIST-1 and DIAL-1 over any sequence of rolling rates. */
class DistancePolicyProperties {

    @Property
    @Tag("DIST-1")
    @Tag("DIAL-1")
    void targetStaysInRangeMovesOneStepAndComesInOnlyOnACertainLead(
            @ForAll @DoubleRange(min = 400, max = 650) double opening,
            @ForAll @Size(max = 300) List<@IntRange(min = 0, max = 100) Integer> ourHits,
            @ForAll @IntRange(min = 0, max = 100) int theirHits,
            @ForAll @IntRange(min = 1, max = 100) int shots) {
        DistancePolicy d = new DistancePolicy(opening);
        Estimate theirs = Estimate.of(Math.min(theirHits, shots), shots);
        for (int hits : ourHits) {
            Estimate ours = Estimate.of(Math.min(hits, shots), shots);
            double before = d.controllerTarget();
            DistancePolicy.Step step = d.onWave(ours, theirs);
            double after = d.controllerTarget();
            assertTrue(after >= DistancePolicy.FLOOR && after <= DistancePolicy.CEILING, "in range: " + after);
            assertTrue(Math.abs(after - before) <= DistancePolicy.STEP + 1e-9, "one step a wave");
            double gap = ours.value() - theirs.value();
            if (after < before) {
                assertEquals(DistancePolicy.Step.IN, step);
                assertTrue(gap >= DistancePolicy.GAP, "in only on a 5-point lead");
                assertTrue(ours.center() - theirs.center() - Math.hypot(ours.margin(), theirs.margin())
                        >= DistancePolicy.GAP,
                    "in only when the lead is certain");
            }
            if (after > before) assertTrue(gap <= -DistancePolicy.GAP, "out only on a 5-point deficit");
        }
    }
}

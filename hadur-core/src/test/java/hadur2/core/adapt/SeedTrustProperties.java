package hadur2.core.adapt;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur2.core.memory.Estimate;
import hadur2.core.model.SeedWeight;
import java.util.List;
import net.jqwik.api.ForAll;
import net.jqwik.api.Property;
import net.jqwik.api.Tag;
import net.jqwik.api.constraints.DoubleRange;
import net.jqwik.api.constraints.IntRange;
import net.jqwik.api.constraints.Size;

/** RES-4 over any sequence of live estimates: the weight only falls, and 20 divergent waves empty it. */
class SeedTrustProperties {

    @Property
    @Tag("RES-4")
    void weightNeverRisesAndTwentyDivergentWavesEmptyIt(
            @ForAll @DoubleRange(min = 0.01, max = 1) double start,
            @ForAll @DoubleRange(min = 0, max = 0.3) double profileRate,
            @ForAll @Size(max = 200) List<@IntRange(min = 0, max = 400) Integer> liveHits) {
        SeedTrust t = new SeedTrust(new SeedWeight(start), Estimate.of(profileRate * 2000, 2000));
        double last = start;
        int diverged = 0;
        for (int i = 0; i < liveHits.size(); i++) {
            Estimate live = Estimate.of(liveHits.get(i), 400);
            boolean d = t.diverges(live);
            t.observe(live);
            if (d) diverged++;
            double w = t.weight().value();
            assertTrue(w <= last + 1e-15, "the weight never rises");
            last = w;
            if (diverged >= SeedTrust.DECAY_WAVES) assertEquals(0, w, "zero within 20 divergent waves");
        }
    }
}

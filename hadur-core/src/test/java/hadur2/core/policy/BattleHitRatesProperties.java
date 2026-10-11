package hadur2.core.policy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur2.core.memory.Estimate;
import java.util.List;
import net.jqwik.api.ForAll;
import net.jqwik.api.Property;
import net.jqwik.api.Tag;
import net.jqwik.api.constraints.DoubleRange;
import net.jqwik.api.constraints.Size;

/** POW-11's counters keep their invariants under any sequence of bullets. */
class BattleHitRatesProperties {

    @Property
    @Tag("POW-11")
    void classesPartitionTheTotal(@ForAll @Size(max = 300) List<@DoubleRange(min = 0.1, max = 3.0) Double> powers,
                                  @ForAll @Size(max = 300) List<Boolean> hits) {
        BattleHitRates r = new BattleHitRates();
        int n = Math.min(powers.size(), hits.size());
        int hitCount = 0;
        for (int i = 0; i < n; i++) {
            r.record(powers.get(i), hits.get(i));
            if (hits.get(i)) hitCount++;
        }
        int shots = 0;
        int classHits = 0;
        for (int c = 0; c < BattleHitRates.CLASSES; c++) {
            assertTrue(r.hits(c) <= r.shots(c), "hits never exceed shots in class " + c);
            shots += r.shots(c);
            classHits += r.hits(c);
        }
        assertEquals(n, shots, "every bullet is in exactly one class");
        assertEquals(n, r.shots());
        assertEquals(hitCount, classHits);
        assertEquals(hitCount, r.hits());
    }

    @Property
    @Tag("POW-11")
    void aBulletLandsInTheClassItsPowerNames(@ForAll @DoubleRange(min = 0.1, max = 3.0) double power) {
        int c = BattleHitRates.classOf(power);
        if (power < BattleHitRates.LIGHT_BELOW) assertEquals(0, c);
        else if (power > BattleHitRates.HEAVY_ABOVE) assertEquals(2, c);
        else assertEquals(1, c);
    }

    @Property
    @Tag("POW-11")
    void rateAndMarginAreTheCodebasesOwn(@ForAll @Size(min = 1, max = 300) List<Boolean> hits) {
        BattleHitRates r = new BattleHitRates();
        for (boolean h : hits) r.record(0.1, h);
        Estimate e = r.estimate();
        Estimate expected = Estimate.of(r.hits(), r.shots());
        assertEquals(expected.value(), e.value(), 0.0);
        assertEquals(expected.margin(), e.margin(), 0.0);
        assertTrue(e.value() >= 0 && e.value() <= 1);
        assertTrue(e.margin() > 0 && e.margin() < 1);
        assertEquals(e.value(), r.estimate(0).value(), 0.0, "all in one class: the class is the total");
    }

    @Property
    @Tag("POW-11")
    void clearingStartsOver(@ForAll @Size(max = 100) List<Boolean> hits) {
        BattleHitRates r = new BattleHitRates();
        for (boolean h : hits) r.record(1.0, h);
        r.clear();
        assertEquals(0, r.shots());
        assertEquals(0, r.hits());
    }
}

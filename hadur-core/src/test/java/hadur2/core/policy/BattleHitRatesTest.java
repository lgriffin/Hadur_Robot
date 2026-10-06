package hadur2.core.policy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur2.core.memory.Estimate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/** POW-11: battle-long hit counts in three power classes and over all bullets. */
@Tag("POW-11")
class BattleHitRatesTest {

    @ParameterizedTest
    @CsvSource({"0.1,0", "0.15,0", "0.1999,0", "0.2,1", "0.5,1", "1.2,1", "1.2001,2", "1.95,2", "3.0,2"})
    @DisplayName("POW-11: the classes are under 0.2, 0.2 to 1.2 and above 1.2")
    void classBoundaries(double power, int expected) {
        assertEquals(expected, BattleHitRates.classOf(power));
    }

    @Test
    @DisplayName("POW-11: each bullet counts in its own class and in the total, a hit in both")
    void countsByClass() {
        BattleHitRates r = new BattleHitRates();
        r.record(0.1, true);
        r.record(0.1, false);
        r.record(0.1, false);
        r.record(1.0, false);
        r.record(2.0, true);
        assertEquals(3, r.shots(0));
        assertEquals(1, r.hits(0));
        assertEquals(1, r.shots(1));
        assertEquals(0, r.hits(1));
        assertEquals(1, r.shots(2));
        assertEquals(1, r.hits(2));
        assertEquals(5, r.shots());
        assertEquals(2, r.hits());
    }

    @Test
    @DisplayName("POW-11: every rate carries Estimate's margin, and none is known before its first bullet")
    void rateWithMargin() {
        BattleHitRates r = new BattleHitRates();
        assertSame(Estimate.NONE, r.estimate());
        assertSame(Estimate.NONE, r.estimate(2));
        for (int i = 0; i < 40; i++) r.record(0.1, i % 10 == 0);
        for (int i = 0; i < 10; i++) r.record(1.95, i < 3);
        Estimate light = r.estimate(0);
        assertEquals(0.1, light.value(), 1e-12);
        assertEquals(Estimate.of(4, 40).margin(), light.margin(), 1e-12);
        assertEquals(Estimate.of(3, 10).margin(), r.estimate(2).margin(), 1e-12);
        assertSame(Estimate.NONE, r.estimate(1), "no bullet in the middle class");
        assertEquals(Estimate.of(7, 50).margin(), r.estimate().margin(), 1e-12);
        assertTrue(light.margin() > r.estimate().margin(), "more bullets, a narrower margin");
    }

    @Test
    @DisplayName("POW-11: a battle's counts are cleared only when the opponent changes")
    void clearForgetsEverything() {
        BattleHitRates r = new BattleHitRates();
        r.record(0.1, true);
        r.record(3.0, false);
        r.clear();
        assertEquals(0, r.shots());
        assertEquals(0, r.hits());
        assertSame(Estimate.NONE, r.estimate());
    }
}

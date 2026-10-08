package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** --seed-base (BENCH-72): fresh engine seeds for a confirmation run. No battle is started. */
class SeedBaseTest {

    @Test
    @Tag("BENCH-72")
    @DisplayName("without a base the engine gets the bench's own seed")
    void noBaseIsTheSeed() {
        assertEquals(1, Bench.engineSeed(1, 0));
        assertEquals(8, Bench.engineSeed(8, 0));
    }

    @Test
    @Tag("BENCH-72")
    @DisplayName("with base 100, seeds 1..8 reach the engine as 101..108, none of an earlier 8-seed run's")
    void baseShiftsTheEngineSeed() {
        for (int seed = 1; seed <= 8; seed++) {
            int engine = Bench.engineSeed(seed, 100);
            assertEquals(100 + seed, engine);
            assertEquals(true, engine > 8);
        }
    }

    @Test
    @Tag("BENCH-72")
    @DisplayName("a base that would overflow the engine's seed is refused, not wrapped")
    void overflowIsRefused() {
        assertThrows(ArithmeticException.class, () -> Bench.engineSeed(1, Integer.MAX_VALUE));
    }
}

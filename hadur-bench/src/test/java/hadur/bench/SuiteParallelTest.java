package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** BENCH-108: a melee suite runs fields side by side until --parallel is filled. No battle starts. */
class SuiteParallelTest {

    private static Map<String, String> opts(String... kv) {
        Map<String, String> m = new HashMap<>();
        for (int i = 0; i + 1 < kv.length; i += 2) m.put(kv[i], kv[i + 1]);
        return m;
    }

    @Test
    @Tag("BENCH-108")
    @DisplayName("the PC's 4-seed melee census runs three fields at once, 12 battles in flight")
    void meleeCensusFillsThePc() {
        Map<String, String> line = opts("melee", "true", "parallel", "12", "seeds", "4");
        assertEquals(3, Bench.suiteLinesAtOnce(line, line, Map.of()));
        Map<String, String> width = opts("melee", "true", "parallel", "6", "seeds", "2");
        assertEquals(3, Bench.suiteLinesAtOnce(width, width, Map.of()));
        Map<String, String> auto = opts("melee", "true", "parallel", "auto", "seeds", "4");
        assertEquals(3, Bench.suiteLinesAtOnce(auto, auto, Map.of("HADUR_BENCH_WORKERS_MELEE", "12")));
    }

    @Test
    @Tag("BENCH-108")
    @DisplayName("a field with as many seeds as workers, a duel suite and keep-data run one line at a time")
    void oneAtATimeOtherwise() {
        Map<String, String> wide = opts("melee", "true", "parallel", "6", "seeds", "10");
        assertEquals(1, Bench.suiteLinesAtOnce(wide, wide, Map.of()));
        Map<String, String> duel = opts("parallel", "12", "seeds", "2");
        assertEquals(1, Bench.suiteLinesAtOnce(duel, duel, Map.of()));
        Map<String, String> keep = opts("melee", "true", "parallel", "1", "seeds", "4", "keep-data", "true");
        assertEquals(1, Bench.suiteLinesAtOnce(keep, keep, Map.of()));
    }

    @Test
    @Tag("BENCH-108")
    @DisplayName("--suite-parallel overrides, and must be at least 1")
    void override() {
        Map<String, String> line = opts("melee", "true", "parallel", "12", "seeds", "4");
        assertEquals(1, Bench.suiteLinesAtOnce(opts("suite-parallel", "1"), line, Map.of()));
        assertThrows(IllegalArgumentException.class, () -> Bench.suiteLinesAtOnce(opts("suite-parallel", "0"), line, Map.of()));
    }
}

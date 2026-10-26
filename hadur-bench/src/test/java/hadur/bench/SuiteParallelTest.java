package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.HashMap;
import java.util.List;
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

    private static Map<String, String> field(String... kv) {
        Map<String, String> m = opts("melee", "true", "cpu-constant", "1488498");
        m.putAll(opts(kv));
        return m;
    }

    private static int atOnce(Map<String, String> global, List<Map<String, String>> lines, Map<String, String> env) {
        return Bench.suiteLinesAtOnce(global, lines, env);
    }

    @Test
    @Tag("BENCH-108")
    @DisplayName("the PC's 4-seed melee census runs three fields at once, 12 battles in flight")
    void meleeCensusFillsThePc() {
        Map<String, String> line = field("parallel", "12", "seeds", "4");
        assertEquals(3, atOnce(Map.of(), List.of(line, line, line), Map.of()));
        Map<String, String> width = field("parallel", "6", "seeds", "2");
        assertEquals(3, atOnce(Map.of(), List.of(width, width), Map.of()));
        Map<String, String> auto = field("parallel", "auto", "seeds", "4", "cpu-constant", "auto");
        assertEquals(3, atOnce(Map.of(), List.of(auto),
            Map.of("HADUR_BENCH_WORKERS_MELEE", "12", "HADUR_BENCH_CPU_CONSTANT", "1488498")));
    }

    @Test
    @Tag("BENCH-108")
    @DisplayName("warm fields count their battles, and a mixed suite takes its narrowest line")
    void warmAndMixed() {
        Map<String, String> warm = field("parallel", "12", "seeds", "2", "mode", "warm", "battles", "6");
        assertEquals(2, atOnce(Map.of(), List.of(warm), Map.of()));
        assertEquals(2, atOnce(Map.of(), List.of(field("parallel", "12", "seeds", "4"), warm), Map.of()));
        assertEquals(1, atOnce(Map.of(), List.of(field("parallel", "12", "seeds", "4"), opts("parallel", "12")), Map.of()));
    }

    @Test
    @Tag("BENCH-108")
    @DisplayName("duel suites, keep-data, recording and an unpinned CPU constant run one line at a time")
    void oneAtATimeOtherwise() {
        assertEquals(1, atOnce(Map.of(), List.of(field("parallel", "6", "seeds", "10")), Map.of()));
        assertEquals(1, atOnce(Map.of(), List.of(opts("parallel", "12", "seeds", "2")), Map.of()));
        assertEquals(1, atOnce(Map.of(), List.of(field("parallel", "1", "seeds", "4", "keep-data", "true")), Map.of()));
        assertEquals(1, atOnce(Map.of(), List.of(field("parallel", "12", "seeds", "4", "record", "fx")), Map.of()));
        Map<String, String> unpinned = opts("melee", "true", "parallel", "12", "seeds", "4");
        assertEquals(1, atOnce(Map.of(), List.of(unpinned), Map.of()));
    }

    @Test
    @Tag("BENCH-108")
    @DisplayName("--suite-parallel overrides, and must be at least 1")
    void override() {
        Map<String, String> line = field("parallel", "12", "seeds", "4");
        assertEquals(1, atOnce(opts("suite-parallel", "1"), List.of(line), Map.of()));
        assertThrows(IllegalArgumentException.class, () -> atOnce(opts("suite-parallel", "0"), List.of(line), Map.of()));
    }
}

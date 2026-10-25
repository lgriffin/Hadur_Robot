package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** BENCH-105: --parallel auto, --cpu-constant auto and --shard. Nothing here starts a battle. */
class HostWidthTest {

    private static Map<String, String> opts(String... kv) {
        Map<String, String> m = new HashMap<>();
        for (int i = 0; i + 1 < kv.length; i += 2) m.put(kv[i], kv[i + 1]);
        return m;
    }

    @Test
    @Tag("BENCH-105")
    @DisplayName("--parallel auto takes the queue runner's width for the battle's kind")
    void autoWidthByKind() {
        Map<String, String> env = Map.of("HADUR_BENCH_WORKERS_DUEL", "12", "HADUR_BENCH_WORKERS_TEAM", "10",
            "HADUR_BENCH_WORKERS_MELEE", "8");
        Map<String, String> duel = opts("parallel", "auto");
        HostWidth.resolve(duel, env, 48);
        assertEquals("12", duel.get("parallel"));
        assertEquals("auto: HADUR_BENCH_WORKERS_DUEL", duel.get("parallel-source"));
        Map<String, String> team = opts("parallel", "auto", "team", "true");
        HostWidth.resolve(team, env, 48);
        assertEquals("10", team.get("parallel"));
        Map<String, String> melee = opts("parallel", "AUTO", "melee", "true");
        HostWidth.resolve(melee, env, 48);
        assertEquals("8", melee.get("parallel"));
    }

    @Test
    @Tag("BENCH-105")
    @DisplayName("without a host profile auto is a quarter of the logical processors, 12 on the PC")
    void autoFallsBack() {
        Map<String, String> pc = opts("parallel", "auto");
        HostWidth.resolve(pc, Map.of(), 48);
        assertEquals("12", pc.get("parallel"));
        Map<String, String> small = opts("parallel", "auto");
        HostWidth.resolve(small, Map.of(), 2);
        assertEquals("1", small.get("parallel"));
        Map<String, String> all = opts("parallel", "auto");
        HostWidth.resolve(all, Map.of("HADUR_BENCH_WORKERS", "3"), 48);
        assertEquals("3", all.get("parallel"));
    }

    @Test
    @Tag("BENCH-105")
    @DisplayName("a number is left alone")
    void explicitWidthStays() {
        Map<String, String> o = opts("parallel", "12", "cpu-constant", "1488498");
        HostWidth.resolve(o, Map.of("HADUR_BENCH_WORKERS_DUEL", "3", "HADUR_BENCH_CPU_CONSTANT", "9"), 48);
        assertEquals("12", o.get("parallel"));
        assertEquals("1488498", o.get("cpu-constant"));
        assertFalse(o.containsKey("parallel-source"));
    }

    @Test
    @Tag("BENCH-105")
    @DisplayName("--cpu-constant auto pins the host's constant, or leaves the engine to calibrate")
    void autoCpuConstant() {
        Map<String, String> pinned = opts("cpu-constant", "auto");
        HostWidth.resolve(pinned, Map.of("HADUR_BENCH_CPU_CONSTANT", "1488498"), 48);
        assertEquals("1488498", pinned.get("cpu-constant"));
        Map<String, String> none = opts("cpu-constant", "auto");
        HostWidth.resolve(none, Map.of("HADUR_BENCH_CPU_CONSTANT", ""), 8);
        assertFalse(none.containsKey("cpu-constant"));
        assertTrue(none.get("cpu-constant-source").contains("calibrates"));
    }

    @Test
    @Tag("BENCH-105")
    @DisplayName("two shards split a set with every opponent fought exactly once")
    void shardsPartition() {
        List<Integer> set = List.of(0, 1, 2, 3, 4, 5, 6);
        assertEquals(List.of(0, 2, 4, 6), HostWidth.shard(set, 1, 2));
        assertEquals(List.of(1, 3, 5), HostWidth.shard(set, 2, 2));
        assertEquals(set, HostWidth.shard(set, 1, 1));
        assertThrows(IllegalArgumentException.class, () -> HostWidth.parseShard("3/2"));
        assertThrows(IllegalArgumentException.class, () -> HostWidth.parseShard("half"));
        assertThrows(IllegalArgumentException.class, () -> HostWidth.parseShard("0/2"));
    }

    @Test
    @Tag("BENCH-105")
    @DisplayName("the bench resolves auto when built, and refuses a shard of a melee field")
    void benchUsesIt() {
        Bench b = new Bench(opts("parallel", "auto"), Map.of("HADUR_BENCH_WORKERS_DUEL", "5"));
        assertTrue(b.duelHostLine(5).contains("parallel 5"), b.duelHostLine(5));
        assertThrows(IllegalArgumentException.class,
            () -> new Bench(opts("shard", "1/2", "melee", "true"), Map.of()));
        assertThrows(IllegalArgumentException.class, () -> new Bench(opts("shard", "2/1"), Map.of()));
    }
}

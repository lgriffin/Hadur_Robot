package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class MemoryTest {

    @Test
    @Tag("BENCH-60")
    @DisplayName("a battle JVM's heap is capped at 2G unless --child-heap names another size or none")
    void heapDefaultsToTwoGigabytes() {
        assertEquals("2G", Memory.DEFAULT_CHILD_HEAP);
        assertEquals(java.util.List.of("-Xmx2G"), Bench.childFlags(java.util.Map.of("child-cpus", "0"), 1));
        assertEquals(java.util.List.of("-Xmx512M"),
            Bench.childFlags(java.util.Map.of("child-cpus", "0", "child-heap", "512M"), 1));
        assertEquals(java.util.List.of(), Bench.childFlags(java.util.Map.of("child-cpus", "0", "child-heap", "none"), 1));
        assertEquals(2048, Memory.heapMb("2G"));
        assertEquals(512, Memory.heapMb("512m"));
        assertEquals(-1, Memory.heapMb("none"));
    }

    @Test
    @Tag("BENCH-61")
    @DisplayName("the memory check refuses a plan over 70% of free memory and suggests a width that fits")
    void checkRefusesAPlanThatDoesNotFit() {
        // 12 children at 2G + 300M overhead = 28176 MB, against 41000 MB free (70% is 28700)
        assertTrue(Memory.check(41_000, 12, "2G").ok());
        Memory.Check tight = Memory.check(30_000, 12, "2G");
        assertFalse(tight.ok());
        assertEquals(8, tight.suggestedParallel());
        assertTrue(tight.message().contains("--parallel 8"));
        assertTrue(tight.message().contains("--force-memory true"));
        assertEquals(28_176, tight.estimateMb());
    }

    @Test
    @Tag("BENCH-61")
    @DisplayName("an uncapped heap is planned at what such children were seen to use, and unknown free memory passes")
    void uncappedAndUnknownMemory() {
        assertEquals(12L * Memory.UNCAPPED_MB, Memory.estimateMb(12, "none"));
        assertFalse(Memory.check(100_000, 13, "none").ok());
        assertTrue(Memory.check(-1, 48, "none").ok());
        assertEquals(1, Memory.fittingParallel(100, "2G"));
    }

    @Test
    @Tag("BENCH-62")
    @DisplayName("conditions.json records the effective heap cap and the planned memory")
    void conditionsRecordTheHeap() {
        assertEquals("2G", Memory.conditions(12, "2G").get("childHeap"));
        assertEquals(28_176L, Memory.conditions(12, "2G").get("memoryEstimateMb"));
        assertEquals("none", Memory.conditions(4, "off").get("childHeap"));
    }
}

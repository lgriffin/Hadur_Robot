package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/**
 * BENCH-2: a paired A/B run needs the candidate and baseline installed as two distinct
 * Robocode robots (name + version). Robocode identifies a robot by that string, so two
 * jars sharing it would install to the same file, silently replacing one with the other.
 */
@Tag("BENCH-2")
class BenchTest {

    @Test
    @DisplayName("--baseline without --baseline-robot is rejected")
    void baselineNeedsARobotName() {
        Map<String, String> opts = Map.of("baseline", "/tmp/baseline.jar");
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> new Bench(opts));
        assertTrue(e.getMessage().contains("baseline-robot"));
    }

    @Test
    @DisplayName("--baseline-robot matching --robot is rejected")
    void baselineRobotMustDifferFromCandidate() {
        Map<String, String> opts = Map.of(
            "baseline", "/tmp/baseline.jar",
            "baseline-robot", "hadur2.Hadur 3.0",
            "robot", "hadur2.Hadur 3.0");
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> new Bench(opts));
        assertTrue(e.getMessage().contains("must differ"));
    }

    @Test
    @DisplayName("a distinct --baseline-robot is accepted")
    void distinctBaselineRobotIsFine() {
        Map<String, String> opts = Map.of(
            "baseline", "/tmp/baseline.jar",
            "baseline-robot", "hadur2.Hadur 3.0-dev",
            "robot", "hadur2.Hadur 3.0");
        new Bench(opts); // does not throw
    }

    @Test
    @Tag("BENCH-12")
    @DisplayName("--parallel 0 is rejected")
    void parallelZeroIsRejected() {
        Map<String, String> opts = Map.of("parallel", "0");
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> new Bench(opts));
        assertTrue(e.getMessage().contains("parallel"));
    }

    @Test
    @Tag("BENCH-12")
    @DisplayName("--parallel 4 is accepted")
    void parallelFourIsFine() {
        Map<String, String> opts = Map.of("parallel", "4");
        new Bench(opts); // does not throw
    }

    @Test
    @Tag("BENCH-12")
    @DisplayName("--parallel below 1 is rejected in melee and team mode too")
    void parallelBelowOneIsRejectedInMeleeAndTeam() {
        assertThrows(IllegalArgumentException.class, () -> new Bench(new HashMap<>(Map.of("melee", "true", "parallel", "0"))));
        assertThrows(IllegalArgumentException.class, () -> new Bench(new HashMap<>(Map.of("team", "true", "parallel", "-1"))));
    }

    @Test
    @Tag("BENCH-12")
    @DisplayName("--baseline is accepted in melee and team mode")
    void baselineIsAcceptedInMeleeAndTeam() {
        new Bench(new HashMap<>(Map.of("melee", "true", "baseline", "/tmp/b.jar",
            "baseline-robot", "hadur2.Hadur 3.7", "robot", "hadur2.Hadur 3.8")));
        new Bench(new HashMap<>(Map.of("team", "true", "baseline", "/tmp/b.jar",
            "baseline-robot", "hadur2.HadurTeam 3.7", "robot", "hadur2.HadurTeam 3.8")));
    }

    @Test
    @Tag("BENCH-12")
    @DisplayName("child flags: none for one worker, 2 CPUs for several, --child-cpus 0 off, --child-heap added")
    void childFlagsFollowTheOptions() {
        assertEquals(List.of(), Bench.childFlags(Map.of(), 1));
        assertEquals(List.of("-XX:ActiveProcessorCount=2"), Bench.childFlags(Map.of(), 4));
        assertEquals(List.of(), Bench.childFlags(Map.of("child-cpus", "0"), 4));
        assertEquals(List.of("-XX:ActiveProcessorCount=3", "-Xmx512M"),
            Bench.childFlags(Map.of("child-cpus", "3", "child-heap", "512M"), 1));
    }

    @Test
    @Tag("BENCH-12")
    @DisplayName("a pinned CPU constant is named in the report even when the main home never held it")
    void pinnedCpuConstantIsNamed() {
        assertEquals("robocode.cpu.constant=123 (pinned with --cpu-constant)", Bench.cpuConstantLine(" 123 ", "unknown"));
        assertEquals("robocode.cpu.constant=77", Bench.cpuConstantLine(null, "robocode.cpu.constant=77"));
    }

    @Test
    @Tag("BENCH-12")
    @DisplayName("the melee and team host line carries the CPU constant, the host, the parallel width and the child flags")
    void hostLineNamesTheConditions() {
        assertEquals("robocode.cpu.constant=5. Host: Ryzen, 48 logical cores, parallel 6. "
            + "Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.",
            Bench.hostLine("robocode.cpu.constant=5", "Ryzen, 48 logical cores", 6,
                List.of("-XX:ActiveProcessorCount=2", "-Xmx512M")));
        assertEquals("unknown. Host: h, parallel 1.", Bench.hostLine("unknown", "h", 1, List.of()));
    }

    @Test
    @Tag("BENCH-12")
    @DisplayName("--keep-data in melee is refused with --parallel above 1, and the baseline's field swaps only Hadur")
    void keepDataNeedsSerialAndBaselineFieldSwapsHadur() {
        assertThrows(IllegalArgumentException.class, () -> Bench.requireSerialKeepData(true, 2));
        Bench.requireSerialKeepData(true, 1);
        Bench.requireSerialKeepData(false, 8);
        assertEquals(List.of("hadur2.Hadur 3.7", "a", "b"),
            Bench.withFirst(List.of("hadur2.Hadur 3.8", "a", "b"), "hadur2.Hadur 3.7"));
    }
}

package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
}

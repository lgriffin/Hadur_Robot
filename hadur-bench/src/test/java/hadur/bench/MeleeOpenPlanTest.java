package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** BENCH-300: the pc-melee-open card (MMOVE-31) is complete before it reaches the PC. */
class MeleeOpenPlanTest {

    private static final Path QUEUE = Path.of("plans/pc-melee-open.queue");

    @Test
    @Tag("BENCH-300")
    @DisplayName("the steps chain from prep through every arm to a results PR, on the version the pom names")
    void stepsChain() throws IOException {
        String queue = Files.readString(QUEUE);
        String[] steps = {"moprep", "moaa", "mobb", "moml", "moread", "mopr"};
        for (int i = 1; i < steps.length; i++) {
            int at = queue.indexOf("\n" + steps[i] + " ");
            assertTrue(at >= 0, steps[i]);
            int end = queue.indexOf("\n", queue.indexOf("\n", at + 1) + 1);
            assertTrue(queue.substring(at, end < 0 ? queue.length() : end).contains("after: " + steps[i - 1]),
                steps[i] + " after " + steps[i - 1]);
        }
        assertTrue(queue.contains("<robot.release>"), "the version comes from the pom");
        assertFalse(queue.matches("(?s).*Hadur_3\\.\\d.*"), "no robot version is hard-coded");
        for (String a : List.of("aa", "bb", "mlane")) {
            assertTrue(queue.contains("bash ./build-ablation.sh " + a + " "), a + " is built");
        }
        assertTrue(queue.contains("echo \"$V\" > work/melee-open.version") && queue.contains("V=$(cat work/melee-open.version)"));
        assertTrue(queue.contains("C=${MELEE_WORKERS}"));
        assertTrue(queue.contains("screen \"$W\"-aa --base2 \"$W\"-bb --arm bb=\"$W\"-bb --arm ml=\"$W\"-ml --census"));
        assertTrue(queue.contains("--seeds 6 --gain 0.0 --survival-slack 1"));
        assertTrue(queue.contains("open_results_pr.sh claude/pc-melee-open-results"));
    }

    @Test
    @Tag("BENCH-300")
    @DisplayName("every arm step declares its stop rules")
    void stopRules() throws IOException {
        String queue = Files.readString(QUEUE);
        for (String step : List.of("moaa", "mobb", "moml")) {
            int at = queue.indexOf("\n" + step + " ");
            int next = queue.indexOf("\nmo", at + 1);
            String body = queue.substring(at, next);
            for (String rule : List.of("watch: battles=276", "stop: fails 20", "stop: stall 30m")) {
                assertTrue(body.contains(rule), step + " " + rule);
            }
            assertFalse(body.contains("stop: dead"), step);
        }
    }

    @Test
    @Tag("BENCH-300")
    @DisplayName("every arm runs alone on the census at 6 fresh seeds, the host's width and CPU constant")
    void args() throws IOException {
        String args = Files.readString(Path.of("plans/melee-open.args"));
        assertTrue(args.contains("--suite\nmelee-census-317.txt\n"));
        assertTrue(args.contains("--seeds\n6\n") && args.contains("--seed-base\n3380\n"));
        assertTrue(args.contains("--parallel\n@C@\n") && args.contains("--cpu-constant\nauto\n"));
        assertFalse(args.contains("--baseline"));
    }

    @Test
    @Tag("BENCH-300")
    @DisplayName("the ml arm switches on MMOVE-31, off on master")
    void ablation() throws IOException {
        String script = Files.readString(Path.of("build-ablation.sh"));
        assertTrue(script.contains("\"public static final boolean FIRE_LANES = false;\" \"public static final boolean FIRE_LANES = true;\""));
        String melee = "../hadur-core/src/main/java/hadur117/core/melee/";
        assertTrue(Files.readString(Path.of(melee + "MinimumRiskMovement.java")).contains("public static final boolean FIRE_LANES = false;"));
    }
}

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

/** BENCH-136: the pc-melee-surf card (MMOVE-15) is complete before it reaches the PC. */
class MeleeSurfPlanTest {

    private static final Path QUEUE = Path.of("plans/pc-melee-surf.queue");

    @Test
    @Tag("BENCH-136")
    @DisplayName("the steps chain from prep through every arm to a results PR, on the version the pom names")
    void stepsChain() throws IOException {
        String queue = Files.readString(QUEUE);
        String[] steps = {"msprep", "msaa", "msbb", "msms", "msread", "mspr"};
        for (int i = 1; i < steps.length; i++) {
            int at = queue.indexOf("\n" + steps[i] + " ");
            assertTrue(at >= 0, steps[i]);
            int end = queue.indexOf("\n", queue.indexOf("\n", at + 1) + 1);
            assertTrue(queue.substring(at, end < 0 ? queue.length() : end).contains("after: " + steps[i - 1]),
                steps[i] + " after " + steps[i - 1]);
        }
        assertTrue(queue.contains("<robot.release>"), "the version comes from the pom");
        assertFalse(queue.matches("(?s).*Hadur_3\\.\\d.*"), "no robot version is hard-coded");
        for (String a : List.of("aa", "bb", "msurf")) {
            assertTrue(queue.contains("bash ./build-ablation.sh " + a + " "), a + " is built");
        }
        assertTrue(queue.contains("rm -rf work/melee-surf-\"$V\"-aa work/melee-surf-\"$V\"-bb work/melee-surf-\"$V\"-ms"),
            "prep rebuilds the jars, so no battle of an older build survives into the read");
        assertTrue(queue.contains("echo \"$V\" > work/melee-surf.version") && queue.contains("V=$(cat work/melee-surf.version)"),
            "the read uses the version prep built, not the pom at read time");
        assertTrue(queue.contains("C=${MELEE_WORKERS}"), "the width is the host's melee width, fixed at prep");
        assertTrue(queue.contains("screen \"$W\"-aa --base2 \"$W\"-bb --arm bb=\"$W\"-bb --arm ms=\"$W\"-ms --census"),
            "bb against aa, ms against both baselines");
        assertTrue(queue.contains("--seeds 6 --gain 0.3 --survival-slack 1"), "ms passes at +0.30 with the low end above 0");
        assertTrue(queue.contains("open_results_pr.sh claude/pc-melee-surf-results"));
    }

    @Test
    @Tag("BENCH-136")
    @DisplayName("every arm step declares its stop rules")
    void stopRules() throws IOException {
        String queue = Files.readString(QUEUE);
        for (String step : List.of("msaa", "msbb", "msms")) {
            int at = queue.indexOf("\n" + step + " ");
            int next = queue.indexOf("\nms", at + 1);
            String body = queue.substring(at, next);
            for (String rule : List.of("watch: battles=276", "stop: fails 20", "stop: stall 30m")) {
                assertTrue(body.contains(rule), step + " " + rule);
            }
            assertFalse(body.contains("stop: dead"), step + ": dead needs a multi-arm step, so the runner would refuse the card");
        }
    }

    @Test
    @Tag("BENCH-136")
    @DisplayName("every arm runs alone on the census at 6 fresh seeds after the crowd card's, the host's width and CPU constant")
    void args() throws IOException {
        String args = Files.readString(Path.of("plans/melee-surf.args"));
        assertTrue(args.contains("--suite\nmelee-census-317.txt\n"));
        assertTrue(args.contains("--seeds\n6\n") && args.contains("--seed-base\n3224\n"));
        assertTrue(args.contains("--parallel\n@C@\n") && args.contains("--cpu-constant\nauto\n"));
        assertTrue(args.contains("bisect/hadur117.Hadur_@V@@A@.jar") && args.contains("work/melee-surf-@V@-@A@"));
        assertFalse(args.contains("--baseline"), "arms pair in the read, not in the run");
        assertFalse(args.matches("(?s).*3\\.1\\d.*"), "names no version");
    }

    @Test
    @Tag("BENCH-136")
    @DisplayName("the arm edits exactly MMOVE-15, which ships off")
    void ablation() throws IOException {
        assertTrue(Files.readString(Path.of("build-ablation.sh")).contains("msurf) flag=MELEE_SURF; suffix=ms ;;"));
        String move = Files.readString(Path.of("../hadur-core/src/main/java/hadur117/core/melee/MinimumRiskMovement.java"));
        assertTrue(move.contains("public static final boolean MELEE_SURF = false;"), "MELEE_SURF ships off");
    }
}

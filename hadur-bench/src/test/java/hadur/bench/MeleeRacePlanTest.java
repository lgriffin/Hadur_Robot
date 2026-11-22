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

/** BENCH-273: the pc-melee-race card (MEND-6) is complete before it reaches the PC. */
class MeleeRacePlanTest {

    private static final Path QUEUE = Path.of("plans/pc-melee-race.queue");

    @Test
    @Tag("BENCH-273")
    @DisplayName("the steps chain from prep through every arm to a results PR, on the version the pom names")
    void stepsChain() throws IOException {
        String queue = Files.readString(QUEUE);
        String[] steps = {"mrprep", "mraa", "mrbb", "mren", "mrez", "mrread", "mrpr"};
        for (int i = 1; i < steps.length; i++) {
            int at = queue.indexOf("\n" + steps[i] + " ");
            assertTrue(at >= 0, steps[i]);
            int end = queue.indexOf("\n", queue.indexOf("\n", at + 1) + 1);
            assertTrue(queue.substring(at, end < 0 ? queue.length() : end).contains("after: " + steps[i - 1]),
                steps[i] + " after " + steps[i - 1]);
        }
        assertTrue(queue.contains("<robot.release>"), "the version comes from the pom");
        assertFalse(queue.matches("(?s).*Hadur_3\\.\\d.*"), "no robot version is hard-coded");
        for (String a : List.of("aa", "bb", "mrace", "mracex")) {
            assertTrue(queue.contains("bash ./build-ablation.sh " + a + " "), a + " is built");
        }
        assertTrue(queue.contains("rm -rf work/melee-race-\"$V\"-aa work/melee-race-\"$V\"-bb work/melee-race-\"$V\"-en work/melee-race-\"$V\"-ez"),
            "prep rebuilds the jars, so no battle of an older build survives into the read");
        assertTrue(queue.contains("echo \"$V\" > work/melee-race.version") && queue.contains("V=$(cat work/melee-race.version)"),
            "the read uses the version prep built, not the pom at read time");
        assertTrue(queue.contains("C=${MELEE_WORKERS}"), "the width is the host's melee width, fixed at prep");
        assertTrue(queue.contains("screen \"$W\"-aa --base2 \"$W\"-bb --arm bb=\"$W\"-bb --arm en=\"$W\"-en --arm ez=\"$W\"-ez --census"),
            "bb against aa, en and ez against both baselines");
        assertTrue(queue.contains("--seeds 10 --gain 0.0 --survival-slack 1"), "en passes at +0.0 with the low end above 0");
        assertTrue(queue.contains("open_results_pr.sh claude/pc-melee-race-results"));
    }

    @Test
    @Tag("BENCH-273")
    @DisplayName("every arm step declares its stop rules")
    void stopRules() throws IOException {
        String queue = Files.readString(QUEUE);
        for (String step : List.of("mraa", "mrbb", "mren", "mrez")) {
            int at = queue.indexOf("\n" + step + " ");
            int next = queue.indexOf("\nmr", at + 1);
            String body = queue.substring(at, next);
            for (String rule : List.of("watch: battles=460", "stop: fails 20", "stop: stall 30m")) {
                assertTrue(body.contains(rule), step + " " + rule);
            }
            assertFalse(body.contains("stop: dead"), step + ": dead needs a multi-arm step, so the runner would refuse the card");
        }
    }

    @Test
    @Tag("BENCH-273")
    @DisplayName("every arm runs alone on the census at 10 fresh seeds, the host's width and CPU constant")
    void args() throws IOException {
        String args = Files.readString(Path.of("plans/melee-race.args"));
        assertTrue(args.contains("--suite\nmelee-census-317.txt\n"));
        assertTrue(args.contains("--seeds\n10\n") && args.contains("--seed-base\n3370\n"));
        assertTrue(args.contains("--parallel\n@C@\n") && args.contains("--cpu-constant\nauto\n"));
        assertTrue(args.contains("bisect/hadur117.Hadur_@V@@A@.jar") && args.contains("work/melee-race-@V@-@A@"));
        assertFalse(args.contains("--baseline"), "arms pair in the read, not in the run");
    }

    @Test
    @Tag("BENCH-273")
    @DisplayName("the arm switches on MEND-6, which is off on master")
    void ablation() throws IOException {
        String script = Files.readString(Path.of("build-ablation.sh"));
        assertTrue(script.contains("\"public static final boolean ENDGAME_RACE = false;\" \"public static final boolean ENDGAME_RACE = true;\""));
        String duel = Files.readString(Path.of("../hadur-core/src/main/java/hadur117/core/duel/DuelController.java"));
        assertTrue(duel.contains("public static final boolean ENDGAME_RACE = false;"), "off on master");
    }
}

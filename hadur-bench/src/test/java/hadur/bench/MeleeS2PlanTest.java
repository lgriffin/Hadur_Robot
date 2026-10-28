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

/** BENCH-110: the pc-melee-s2 card (melee Stage 2) is complete before it reaches the PC. */
class MeleeS2PlanTest {

    private static final Path QUEUE = Path.of("plans/pc-melee-s2.queue");

    @Test
    @Tag("BENCH-110")
    @DisplayName("the steps chain from prep through every arm to a results PR, on the version the pom names")
    void stepsChain() throws IOException {
        String queue = Files.readString(QUEUE);
        String[] steps = {"s2prep", "s2aa", "s2bb", "s2g4", "s2gc", "s2g4gc", "s2ef", "s2read", "s2pr"};
        for (int i = 1; i < steps.length; i++) {
            int at = queue.indexOf("\n" + steps[i] + " ");
            assertTrue(at >= 0, steps[i]);
            int end = queue.indexOf("\n", queue.indexOf("\n", at + 1) + 1);
            assertTrue(queue.substring(at, end < 0 ? queue.length() : end).contains("after: " + steps[i - 1]),
                steps[i] + " after " + steps[i - 1]);
        }
        assertTrue(queue.contains("<robot.release>"), "the version comes from the pom");
        assertFalse(queue.matches("(?s).*Hadur_3\\.\\d.*"), "no robot version is hard-coded");
        for (String a : List.of("aa", "bb", "g24", "gcrowd", "g24,gcrowd", "e3far")) {
            assertTrue(queue.contains("bash ./build-ablation.sh " + a + " "), a + " is built");
        }
        assertTrue(queue.contains("C=${MELEE_WORKERS}"), "the width is the host's melee width, fixed at prep");
        assertTrue(queue.contains("for f in melee-census-317/f*.txt; do ./fetch-opponents.sh --set \"$f\" || exit 1; done"));
        assertTrue(queue.contains("screen \"$W\"-aa --arm bb=\"$W\"-bb --arm g4=\"$W\"-g4 --arm gc=\"$W\"-gc --arm g4gc=\"$W\"-g4gc --arm ef=\"$W\"-ef"),
            "every arm is read against aa");
        assertTrue(queue.contains("--seeds 6 --gain 0.5 --gain ef=0.3 --survival-slack 1"), "the plan's Stage 2 gate, ef at Stage 1's");
        assertTrue(queue.contains("open_results_pr.sh claude/pc-melee-s2-results"));
    }

    @Test
    @Tag("BENCH-110")
    @DisplayName("every arm runs alone on the census at 6 fresh seeds, the host's width and CPU constant, with no baseline of its own")
    void args() throws IOException {
        String args = Files.readString(Path.of("plans/melee-s2.args"));
        assertTrue(args.contains("--suite\nmelee-census-317.txt\n"));
        assertTrue(args.contains("--seeds\n6\n") && args.contains("--seed-base\n3176\n"));
        assertTrue(args.contains("--parallel\n@C@\n") && args.contains("--cpu-constant\nauto\n"));
        assertTrue(args.contains("bisect/hadur117.Hadur_@V@@A@.jar") && args.contains("work/melee-s2-@V@-@A@"));
        assertFalse(args.contains("--baseline"), "arms pair with aa in the read, not in the run");
        assertFalse(args.matches("(?s).*3\\.1\\d.*"), "names no version");
    }

    @Test
    @Tag("BENCH-110")
    @DisplayName("the gun arms edit what shipped then: MGUN-7's 12 (24 since BENCH-115) and MGUN-11's switch, off")
    void ablations() throws IOException {
        String build = Files.readString(Path.of("build-ablation.sh"));
        assertTrue(build.contains("\"public static final int MELEE_K = 12;\" \"public static final int MELEE_K = 24;\""));
        assertTrue(build.contains("\"public static final boolean CROWD = false;\" \"public static final boolean CROWD = true;\""));
        String gun = Files.readString(Path.of("../hadur-core/src/main/java/hadur117/core/melee/FieldGun.java"));
        assertTrue(gun.contains("public static final int MELEE_K = 24;"), "banked by the bank card");
        String history = Files.readString(Path.of("../hadur-core/src/main/java/hadur117/core/melee/EnemyHistory.java"));
        assertTrue(history.contains("public static final boolean CROWD = false;"), "MGUN-11 ships off");
    }
}

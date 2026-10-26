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

/** BENCH-109: the pc-melee-s1 card (melee Stage 1) is complete before it reaches the PC. */
class MeleeS1PlanTest {

    private static final Path QUEUE = Path.of("plans/pc-melee-s1.queue");

    @Test
    @Tag("BENCH-109")
    @DisplayName("the steps chain from prep through every arm to a results PR, on the version the pom names")
    void stepsChain() throws IOException {
        String queue = Files.readString(QUEUE);
        String[] steps = {"s1prep", "s1aa", "s1bb", "s1er", "s1ep", "s1ef", "s1read", "s1pr"};
        for (int i = 1; i < steps.length; i++) {
            int at = queue.indexOf("\n" + steps[i] + " ");
            assertTrue(at >= 0, steps[i]);
            int end = queue.indexOf("\n", queue.indexOf("\n", at + 1) + 1);
            assertTrue(queue.substring(at, end < 0 ? queue.length() : end).contains("after: " + steps[i - 1]),
                steps[i] + " after " + steps[i - 1]);
        }
        assertTrue(queue.contains("<robot.release>"), "the version comes from the pom");
        assertFalse(queue.matches("(?s).*Hadur_3\\.\\d.*"), "no robot version is hard-coded");
        for (String a : List.of("aa", "bb", "e3ring", "e3pow", "e3far")) {
            assertTrue(queue.contains("bash ./build-ablation.sh " + a + " "), a + " is built");
        }
        assertTrue(queue.contains("C=${MELEE_WORKERS}"), "the width is the host's melee width, fixed at prep");
        assertTrue(queue.contains("for f in melee-census-317/f*.txt; do ./fetch-opponents.sh --set \"$f\" || exit 1; done"));
        assertTrue(queue.contains("screen \"$W\"-aa --arm bb=\"$W\"-bb --arm er=\"$W\"-er --arm ep=\"$W\"-ep --arm ef=\"$W\"-ef"),
            "every arm is read against aa");
        assertTrue(queue.contains("open_results_pr.sh claude/pc-melee-s1-results"));
    }

    @Test
    @Tag("BENCH-109")
    @DisplayName("every arm runs alone on the census at 6 seeds, the host's width and CPU constant, with no baseline of its own")
    void args() throws IOException {
        String args = Files.readString(Path.of("plans/melee-s1.args"));
        assertTrue(args.contains("--suite\nmelee-census-317.txt\n"));
        assertTrue(args.contains("--seeds\n6\n") && args.contains("--seed-base\n3170\n"));
        assertTrue(args.contains("--parallel\n@C@\n") && args.contains("--cpu-constant\nauto\n"));
        assertTrue(args.contains("bisect/hadur2.Hadur_@V@@A@.jar") && args.contains("work/melee-s1-@V@-@A@"));
        assertFalse(args.contains("--baseline"), "arms pair with aa in the read, not in the run");
        assertFalse(args.matches("(?s).*3\\.1\\d.*"), "names no version");
    }

    @Test
    @Tag("BENCH-109")
    @DisplayName("each Stage 1 arm flips exactly one MeleeEndgame switch, under its own suffix")
    void ablations() throws IOException {
        String build = Files.readString(Path.of("build-ablation.sh"));
        assertTrue(build.contains("e3ring) flag=THREE_RING; suffix=er ;;"));
        assertTrue(build.contains("e3pow) flag=THREE_POWER; suffix=ep ;;"));
        assertTrue(build.contains("e3far) flag=THREE_FAR; suffix=ef ;;"));
        String endgame = Files.readString(Path.of("../hadur-core/src/main/java/hadur2/core/melee/MeleeEndgame.java"));
        for (String f : List.of("THREE_RING", "THREE_POWER")) {
            assertTrue(endgame.contains("public static final boolean " + f + " = false;"), f + " ships off");
        }
        assertTrue(endgame.contains("public static final boolean THREE_FAR = true;"), "MEND-3 banked by BENCH-115");
    }
}

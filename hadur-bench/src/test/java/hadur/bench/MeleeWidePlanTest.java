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

/** BENCH-127: the pc-melee-wide card (MGUN-16) is complete before it reaches the PC. */
class MeleeWidePlanTest {

    private static final Path QUEUE = Path.of("plans/pc-melee-wide.queue");

    @Test
    @Tag("BENCH-127")
    @DisplayName("the steps chain from prep through every arm to a results PR, on the version the pom names")
    void stepsChain() throws IOException {
        String queue = Files.readString(QUEUE);
        String[] steps = {"owprep", "owaa", "owbb", "owow", "owread", "owpr"};
        for (int i = 1; i < steps.length; i++) {
            int at = queue.indexOf("\n" + steps[i] + " ");
            assertTrue(at >= 0, steps[i]);
            int end = queue.indexOf("\n", queue.indexOf("\n", at + 1) + 1);
            assertTrue(queue.substring(at, end < 0 ? queue.length() : end).contains("after: " + steps[i - 1]),
                steps[i] + " after " + steps[i - 1]);
        }
        assertTrue(queue.contains("<robot.release>"), "the version comes from the pom");
        assertFalse(queue.matches("(?s).*Hadur_3\\.\\d.*"), "no robot version is hard-coded");
        for (String a : List.of("aa", "bb", "ogi300")) {
            assertTrue(queue.contains("bash ./build-ablation.sh " + a + " "), a + " is built");
        }
        assertTrue(queue.contains("rm -rf work/melee-wide-\"$V\"-aa work/melee-wide-\"$V\"-bb work/melee-wide-\"$V\"-ow"),
            "prep rebuilds the jars, so no battle of an older build survives into the read");
        assertTrue(queue.contains("echo \"$V\" > work/melee-wide.version") && queue.contains("V=$(cat work/melee-wide.version)"),
            "the read uses the version prep built, not the pom at read time");
        assertTrue(queue.contains("C=${MELEE_WORKERS}"), "the width is the host's melee width, fixed at prep");
        assertTrue(queue.contains("screen \"$W\"-aa --base2 \"$W\"-bb --arm bb=\"$W\"-bb --arm ow=\"$W\"-ow --census"),
            "bb against aa, ow against both baselines");
        assertFalse(queue.contains("ogi2") || queue.contains("ogie10"), "only MGUN-16 is confirmed");
        assertTrue(queue.contains("--seeds 8 --gain 0 --survival-slack 1"), "an arm passes when it adds at all");
        assertTrue(queue.contains("open_results_pr.sh claude/pc-melee-wide-results"));
    }

    @Test
    @Tag("BENCH-127")
    @DisplayName("every arm runs alone on the census at 8 fresh seeds after the firepower part 2 card's, the host's width and CPU constant")
    void args() throws IOException {
        String args = Files.readString(Path.of("plans/melee-wide.args"));
        assertTrue(args.contains("--suite\nmelee-census-317.txt\n"));
        assertTrue(args.contains("--seeds\n8\n") && args.contains("--seed-base\n3210\n"));
        assertTrue(args.contains("--parallel\n@C@\n") && args.contains("--cpu-constant\nauto\n"));
        assertTrue(args.contains("bisect/hadur2.Hadur_@V@@A@.jar") && args.contains("work/melee-wide-@V@-@A@"));
        assertFalse(args.contains("--baseline"), "arms pair in the read, not in the run");
        assertFalse(args.matches("(?s).*3\\.1\\d.*"), "names no version");
    }

    @Test
    @Tag("BENCH-127")
    @DisplayName("the ow arm edits exactly MGUN-16, which ships off on top of MGUN-13")
    void ablations() throws IOException {
        String build = Files.readString(Path.of("build-ablation.sh"));
        assertTrue(build.contains("ogi300) flag=OGI_WIDE; suffix=ow ;;"));
        String policy = Files.readString(Path.of("../hadur-core/src/main/java/hadur2/core/melee/MeleeEnergyPolicy.java"));
        assertTrue(policy.contains("public static final boolean CROWD_OGI = true;"));
        for (String f : List.of("OGI_WIDE")) {
            assertTrue(policy.contains("public static final boolean " + f + " = false;"), f + " ships off");
        }
    }
}

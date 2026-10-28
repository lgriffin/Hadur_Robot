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

/** BENCH-122: the pc-melee-power2 card (MGUN-14..16) is complete before it reaches the PC. */
class MeleePower2PlanTest {

    private static final Path QUEUE = Path.of("plans/pc-melee-power2.queue");

    @Test
    @Tag("BENCH-122")
    @DisplayName("the steps chain from prep through every arm to a results PR, on the version the pom names")
    void stepsChain() throws IOException {
        String queue = Files.readString(QUEUE);
        String[] steps = {"p2prep", "p2aa", "p2bb", "p2o2", "p2oe", "p2ow", "p2all", "p2read", "p2pr"};
        for (int i = 1; i < steps.length; i++) {
            int at = queue.indexOf("\n" + steps[i] + " ");
            assertTrue(at >= 0, steps[i]);
            int end = queue.indexOf("\n", queue.indexOf("\n", at + 1) + 1);
            assertTrue(queue.substring(at, end < 0 ? queue.length() : end).contains("after: " + steps[i - 1]),
                steps[i] + " after " + steps[i - 1]);
        }
        assertTrue(queue.contains("<robot.release>"), "the version comes from the pom");
        assertFalse(queue.matches("(?s).*Hadur_3\\.\\d.*"), "no robot version is hard-coded");
        for (String a : List.of("aa", "bb", "ogi2", "ogie10", "ogi300", "ogi2,ogie10,ogi300")) {
            assertTrue(queue.contains("bash ./build-ablation.sh " + a + " "), a + " is built");
        }
        assertTrue(queue.contains("C=${MELEE_WORKERS}"), "the width is the host's melee width, fixed at prep");
        assertTrue(queue.contains("screen \"$W\"-aa --base2 \"$W\"-bb --arm bb=\"$W\"-bb --arm o2=\"$W\"-o2 --arm oe=\"$W\"-oe --arm ow=\"$W\"-ow --arm o2oeow=\"$W\"-o2oeow"),
            "bb against aa, every arm against both baselines");
        assertTrue(queue.contains("--seeds 6 --gain 0 --survival-slack 1"), "an arm passes when it adds at all");
        assertTrue(queue.contains("open_results_pr.sh claude/pc-melee-power2-results"));
    }

    @Test
    @Tag("BENCH-122")
    @DisplayName("every arm runs alone on the census at 6 seeds after the Ogi card's, the host's width and CPU constant")
    void args() throws IOException {
        String args = Files.readString(Path.of("plans/melee-power2.args"));
        assertTrue(args.contains("--suite\nmelee-census-317.txt\n"));
        assertTrue(args.contains("--seeds\n6\n") && args.contains("--seed-base\n3204\n"));
        assertTrue(args.contains("--parallel\n@C@\n") && args.contains("--cpu-constant\nauto\n"));
        assertTrue(args.contains("bisect/hadur2.Hadur_@V@@A@.jar") && args.contains("work/melee-power2-@V@-@A@"));
        assertFalse(args.contains("--baseline"), "arms pair in the read, not in the run");
        assertFalse(args.matches("(?s).*3\\.1\\d.*"), "names no version");
    }

    @Test
    @Tag("BENCH-122")
    @DisplayName("the arms edit exactly MGUN-14..16, which ship off on top of MGUN-13")
    void ablations() throws IOException {
        String build = Files.readString(Path.of("build-ablation.sh"));
        assertTrue(build.contains("ogi2) flag=OGI_TWO; suffix=o2 ;;"));
        assertTrue(build.contains("ogie10) flag=OGI_LOW; suffix=oe ;;"));
        assertTrue(build.contains("ogi300) flag=OGI_WIDE; suffix=ow ;;"));
        String policy = Files.readString(Path.of("../hadur-core/src/main/java/hadur2/core/melee/MeleeEnergyPolicy.java"));
        assertTrue(policy.contains("public static final boolean CROWD_OGI = true;"));
        for (String f : List.of("OGI_TWO", "OGI_LOW")) {
            assertTrue(policy.contains("public static final boolean " + f + " = false;"), f + " ships off");
        }
    }
}

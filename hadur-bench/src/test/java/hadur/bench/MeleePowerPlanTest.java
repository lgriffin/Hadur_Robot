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

/** BENCH-117: the pc-melee-power card (crowd firepower) is complete before it reaches the PC. */
class MeleePowerPlanTest {

    private static final Path QUEUE = Path.of("plans/pc-melee-power.queue");

    @Test
    @Tag("BENCH-117")
    @DisplayName("the steps chain from prep through every arm to a results PR, on the version the pom names")
    void stepsChain() throws IOException {
        String queue = Files.readString(QUEUE);
        String[] steps = {"powerprep", "poweraa", "powerbb", "powerpf", "powerpo", "powerread", "powerpr"};
        for (int i = 1; i < steps.length; i++) {
            int at = queue.indexOf("\n" + steps[i] + " ");
            assertTrue(at >= 0, steps[i]);
            int end = queue.indexOf("\n", queue.indexOf("\n", at + 1) + 1);
            assertTrue(queue.substring(at, end < 0 ? queue.length() : end).contains("after: " + steps[i - 1]),
                steps[i] + " after " + steps[i - 1]);
        }
        assertTrue(queue.contains("<robot.release>"), "the version comes from the pom");
        assertFalse(queue.matches("(?s).*Hadur_3\\.\\d.*"), "no robot version is hard-coded");
        for (String a : List.of("aa", "bb", "pfloor", "pogi")) {
            assertTrue(queue.contains("bash ./build-ablation.sh " + a + " "), a + " is built");
        }
        assertTrue(queue.contains("C=${MELEE_WORKERS}"), "the width is the host's melee width, fixed at prep");
        assertTrue(queue.contains("screen \"$W\"-aa --base2 \"$W\"-bb --arm bb=\"$W\"-bb --arm pf=\"$W\"-pf --arm po=\"$W\"-po"),
            "bb against aa, the power arms against both baselines");
        assertTrue(queue.contains("--seeds 6 --gain 0.3 --survival-slack 1"));
        assertTrue(queue.contains("open_results_pr.sh claude/pc-melee-power-results"));
    }

    @Test
    @Tag("BENCH-117")
    @DisplayName("every arm runs alone on the census at 6 seeds after the bank card's, the host's width and CPU constant")
    void args() throws IOException {
        String args = Files.readString(Path.of("plans/melee-power.args"));
        assertTrue(args.contains("--suite\nmelee-census-317.txt\n"));
        assertTrue(args.contains("--seeds\n6\n") && args.contains("--seed-base\n3190\n"));
        assertTrue(args.contains("--parallel\n@C@\n") && args.contains("--cpu-constant\nauto\n"));
        assertTrue(args.contains("bisect/hadur2.Hadur_@V@@A@.jar") && args.contains("work/melee-power-@V@-@A@"));
        assertFalse(args.contains("--baseline"), "arms pair in the read, not in the run");
        assertFalse(args.matches("(?s).*3\\.1\\d.*"), "names no version");
    }

    @Test
    @Tag("BENCH-117")
    @DisplayName("the power arms edit exactly the MGUN-12 and MGUN-13 switches, which ship off")
    void ablations() throws IOException {
        String build = Files.readString(Path.of("build-ablation.sh"));
        assertTrue(build.contains("flag=CROWD_FLOOR; suffix=pf") && build.contains("flag=CROWD_OGI; suffix=po"));
        String policy = Files.readString(Path.of("../hadur-core/src/main/java/hadur2/core/melee/MeleeEnergyPolicy.java"));
        assertTrue(policy.contains("public static final boolean CROWD_FLOOR = false;"));
        assertTrue(policy.contains("public static final boolean CROWD_OGI = false;"));
    }
}

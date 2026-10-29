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

/** BENCH-137: the pc-melee-crowd card (MMOVE-11..14) is complete before it reaches the PC. */
class MeleeCrowdPlanTest {

    private static final Path QUEUE = Path.of("plans/pc-melee-crowd.queue");

    @Test
    @Tag("BENCH-137")
    @DisplayName("the steps chain from prep through every arm to a results PR, on the version the pom names")
    void stepsChain() throws IOException {
        String queue = Files.readString(QUEUE);
        String[] steps = {"mcprep", "mcaa", "mcbb", "mcma", "mcmh", "mcmt", "mcmc", "mcread", "mcpr"};
        for (int i = 1; i < steps.length; i++) {
            int at = queue.indexOf("\n" + steps[i] + " ");
            assertTrue(at >= 0, steps[i]);
            int end = queue.indexOf("\n", queue.indexOf("\n", at + 1) + 1);
            assertTrue(queue.substring(at, end < 0 ? queue.length() : end).contains("after: " + steps[i - 1]),
                steps[i] + " after " + steps[i - 1]);
        }
        assertTrue(queue.contains("<robot.release>"), "the version comes from the pom");
        assertFalse(queue.matches("(?s).*Hadur_3\\.\\d.*"), "no robot version is hard-coded");
        for (String a : List.of("aa", "bb", "maim", "mhop", "mheat", "mcloser")) {
            assertTrue(queue.contains("bash ./build-ablation.sh " + a + " "), a + " is built");
        }
        assertTrue(queue.contains("rm -rf work/melee-crowd-\"$V\"-aa work/melee-crowd-\"$V\"-bb work/melee-crowd-\"$V\"-ma work/melee-crowd-\"$V\"-mh work/melee-crowd-\"$V\"-mt work/melee-crowd-\"$V\"-mc"),
            "prep rebuilds the jars, so no battle of an older build survives into the read");
        assertTrue(queue.contains("echo \"$V\" > work/melee-crowd.version") && queue.contains("V=$(cat work/melee-crowd.version)"),
            "the read uses the version prep built, not the pom at read time");
        assertTrue(queue.contains("C=${MELEE_WORKERS}"), "the width is the host's melee width, fixed at prep");
        assertTrue(queue.contains("screen \"$W\"-aa --base2 \"$W\"-bb --arm bb=\"$W\"-bb --arm ma=\"$W\"-ma --arm mh=\"$W\"-mh --arm mt=\"$W\"-mt --arm mc=\"$W\"-mc --census"),
            "bb against aa, every arm against both baselines");
        assertTrue(queue.contains("--seeds 6 --gain 0.3 --survival-slack 1"), "an arm passes at +0.30 with the low end above 0");
        assertTrue(queue.contains("open_results_pr.sh claude/pc-melee-crowd-results"));
    }

    @Test
    @Tag("BENCH-137")
    @DisplayName("every arm runs alone on the census at 6 fresh seeds after the wide card's, the host's width and CPU constant")
    void args() throws IOException {
        String args = Files.readString(Path.of("plans/melee-crowd.args"));
        assertTrue(args.contains("--suite\nmelee-census-317.txt\n"));
        assertTrue(args.contains("--seeds\n6\n") && args.contains("--seed-base\n3218\n"));
        assertTrue(args.contains("--parallel\n@C@\n") && args.contains("--cpu-constant\nauto\n"));
        assertTrue(args.contains("bisect/hadur117.Hadur_@V@@A@.jar") && args.contains("work/melee-crowd-@V@-@A@"));
        assertFalse(args.contains("--baseline"), "arms pair in the read, not in the run");
        assertFalse(args.matches("(?s).*3\\.1\\d.*"), "names no version");
    }

    @Test
    @Tag("BENCH-137")
    @DisplayName("the arms edit exactly MMOVE-11..14, which ship off")
    void ablations() throws IOException {
        String build = Files.readString(Path.of("build-ablation.sh"));
        assertTrue(build.contains("maim) flag=MELEE_AIMED; suffix=ma ;;"));
        assertTrue(build.contains("mhop) flag=MELEE_HOPS; suffix=mh ;;"));
        assertTrue(build.contains("mheat) flag=MELEE_HEAT; suffix=mt ;;"));
        assertTrue(build.contains("mcloser) flag=MELEE_CLOSER; suffix=mc ;;"));
        String move = Files.readString(Path.of("../hadur-core/src/main/java/hadur117/core/melee/MinimumRiskMovement.java"));
        for (String f : List.of("MELEE_AIMED", "MELEE_HOPS", "MELEE_HEAT", "MELEE_CLOSER")) {
            assertTrue(move.contains("public static final boolean " + f + " = false;"), f + " ships off");
        }
    }
}

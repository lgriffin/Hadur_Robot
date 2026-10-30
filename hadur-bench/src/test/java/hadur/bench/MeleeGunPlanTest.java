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

/** BENCH-143: the pc-melee-gun card (MGUN-17..20) is complete before it reaches the PC. */
class MeleeGunPlanTest {

    private static final Path QUEUE = Path.of("plans/pc-melee-gun.queue");

    @Test
    @Tag("BENCH-143")
    @DisplayName("the steps chain from prep through every arm to a results PR, on the version the pom names")
    void stepsChain() throws IOException {
        String queue = Files.readString(QUEUE);
        String[] steps = {"mgprep", "mgaa", "mgbb", "mggx", "mggr", "mggd", "mggv", "mgread", "mgpr"};
        for (int i = 1; i < steps.length; i++) {
            int at = queue.indexOf("\n" + steps[i] + " ");
            assertTrue(at >= 0, steps[i]);
            int end = queue.indexOf("\n", queue.indexOf("\n", at + 1) + 1);
            assertTrue(queue.substring(at, end < 0 ? queue.length() : end).contains("after: " + steps[i - 1]),
                steps[i] + " after " + steps[i - 1]);
        }
        assertTrue(queue.contains("<robot.release>"), "the version comes from the pom");
        assertFalse(queue.matches("(?s).*Hadur_3\\.\\d.*"), "no robot version is hard-coded");
        for (String a : List.of("aa", "bb", "gexp", "grate", "gdist", "gsoft")) {
            assertTrue(queue.contains("bash ./build-ablation.sh " + a + " "), a + " is built");
        }
        assertTrue(queue.contains("rm -rf work/melee-gun-\"$V\"-aa work/melee-gun-\"$V\"-bb work/melee-gun-\"$V\"-gx work/melee-gun-\"$V\"-gr work/melee-gun-\"$V\"-gd work/melee-gun-\"$V\"-gv"),
            "prep rebuilds the jars, so no battle of an older build survives into the read");
        assertTrue(queue.contains("echo \"$V\" > work/melee-gun.version") && queue.contains("V=$(cat work/melee-gun.version)"),
            "the read uses the version prep built, not the pom at read time");
        assertTrue(queue.contains("C=${MELEE_WORKERS}"), "the width is the host's melee width, fixed at prep");
        assertTrue(queue.contains("screen \"$W\"-aa --base2 \"$W\"-bb --arm bb=\"$W\"-bb --arm gx=\"$W\"-gx --arm gr=\"$W\"-gr --arm gd=\"$W\"-gd --arm gv=\"$W\"-gv --census"),
            "bb against aa, every arm against both baselines");
        assertTrue(queue.contains("--seeds 6 --gain 0.3 --survival-slack 1"), "an arm passes at +0.30 with the low end above 0");
        assertTrue(queue.contains("open_results_pr.sh claude/pc-melee-gun-results"));
    }

    @Test
    @Tag("BENCH-143")
    @DisplayName("every arm runs alone on the census at 6 fresh seeds after the surf card's and its smokes', the host's width and CPU constant")
    void args() throws IOException {
        String args = Files.readString(Path.of("plans/melee-gun.args"));
        assertTrue(args.contains("--suite\nmelee-census-317.txt\n"));
        assertTrue(args.contains("--seeds\n6\n") && args.contains("--seed-base\n3233\n"));
        assertTrue(args.contains("--parallel\n@C@\n") && args.contains("--cpu-constant\nauto\n"));
        assertTrue(args.contains("bisect/hadur117.Hadur_@V@@A@.jar") && args.contains("work/melee-gun-@V@-@A@"));
        assertFalse(args.contains("--baseline"), "arms pair in the read, not in the run");
        assertFalse(args.matches("(?s).*3\\.1\\d.*"), "names no version");
    }

    @Test
    @Tag("BENCH-143")
    @DisplayName("every arm step halts on 20 failed battles or 30 minutes without one")
    void stopRules() throws IOException {
        String queue = Files.readString(QUEUE);
        for (String step : List.of("mgaa", "mgbb", "mggx", "mggr", "mggd", "mggv")) {
            int at = queue.indexOf("\n" + step + " ");
            int next = queue.indexOf("\nmg", at + 1);
            String block = queue.substring(at, next < 0 ? queue.length() : next);
            assertTrue(block.contains("stop: fails 20") && block.contains("stop: stall 30m"), step);
        }
    }

    @Test
    @Tag("BENCH-143")
    @DisplayName("the arms edit exactly MGUN-17..20, which ship off")
    void ablations() throws IOException {
        String build = Files.readString(Path.of("build-ablation.sh"));
        assertTrue(build.contains("gexp) flag=EXPERTS; suffix=gx ;;"));
        assertTrue(build.contains("grate) flag=HIT_TARGET; suffix=gr ;;"));
        assertTrue(build.contains("gdist) flag=FLAT_DISTANCE; suffix=gd ;;"));
        assertTrue(build.contains("gsoft) flag=SOFT_MATCH; suffix=gv ;;"));
        String gun = Files.readString(Path.of("../hadur-core/src/main/java/hadur117/core/melee/FieldGun.java"));
        for (String f : List.of("EXPERTS", "HIT_TARGET", "FLAT_DISTANCE", "SOFT_MATCH")) {
            assertTrue(gun.contains("public static final boolean " + f + " = false;"), f + " ships off");
        }
    }
}

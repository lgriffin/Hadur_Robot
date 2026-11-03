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

/** BENCH-176: the pc-melee-near card (MMOVE-23) is complete before it reaches the PC. */
class MeleeNearPlanTest {

    private static final Path QUEUE = Path.of("plans/pc-melee-near.queue");
    private static final List<String> ARMS = List.of("aa", "bb", "n3", "n4");

    @Test
    @Tag("BENCH-176")
    @DisplayName("the steps chain from prep through every arm to a results PR, on the version the pom names")
    void stepsChain() throws IOException {
        String queue = Files.readString(QUEUE);
        List<String> steps = new java.util.ArrayList<>(List.of("mnprep"));
        for (String a : ARMS) steps.add("mn" + a);
        steps.add("mnread");
        steps.add("mnpr");
        for (int i = 1; i < steps.size(); i++) {
            int at = queue.indexOf("\n" + steps.get(i) + " ");
            assertTrue(at >= 0, steps.get(i));
            int end = queue.indexOf("\n", queue.indexOf("\n", at + 1) + 1);
            assertTrue(queue.substring(at, end < 0 ? queue.length() : end).contains("after: " + steps.get(i - 1)),
                steps.get(i) + " after " + steps.get(i - 1));
        }
        assertTrue(queue.contains("<robot.release>"), "the version comes from the pom");
        assertFalse(queue.matches("(?s).*Hadur_3\\.\\d.*"), "no robot version is hard-coded");
        for (String a : List.of("aa", "bb", "mnear3", "mnear4")) {
            assertTrue(queue.contains("bash ./build-ablation.sh " + a + " "), a + " is built");
        }
        for (String a : ARMS) {
            assertTrue(queue.contains("work/melee-near-\"$V\"-" + a), a + "'s battles are cleared at prep");
            if (!a.equals("aa")) assertTrue(queue.contains("--arm " + a + "=\"$W\"-" + a), a + " is read");
        }
        assertTrue(queue.contains("echo \"$V\" > work/melee-near.version") && queue.contains("V=$(cat work/melee-near.version)"),
            "the read uses the version prep built, not the pom at read time");
        assertTrue(queue.contains("C=${MELEE_WORKERS}"), "the width is the host's melee width, fixed at prep");
        assertTrue(queue.contains("screen \"$W\"-aa --base2 \"$W\"-bb"), "each arm against both baselines");
        assertTrue(queue.contains("--seeds 6 --gain 0 --survival-slack 1"), "an arm passes with the low end above 0");
        assertTrue(queue.contains("open_results_pr.sh claude/pc-melee-near-results"));
    }

    @Test
    @Tag("BENCH-176")
    @DisplayName("every arm step declares its stop rules")
    void stopRules() throws IOException {
        String queue = Files.readString(QUEUE);
        for (String a : ARMS) {
            int at = queue.indexOf("\nmn" + a + " ");
            int next = queue.indexOf("\nmn", at + 1);
            String body = queue.substring(at, next);
            for (String rule : List.of("watch: battles=276", "stop: fails 20", "stop: stall 30m")) {
                assertTrue(body.contains(rule), a + " " + rule);
            }
            assertFalse(body.contains("stop: dead"), a + ": dead needs a multi-arm step, so the runner would refuse the card");
        }
    }

    @Test
    @Tag("BENCH-176")
    @DisplayName("every arm runs alone on the census at 6 fresh seeds after pc-melee-end's")
    void args() throws IOException {
        String args = Files.readString(Path.of("plans/melee-near.args"));
        assertTrue(args.contains("--suite\nmelee-census-317.txt\n"));
        assertTrue(args.contains("--seeds\n6\n") && args.contains("--seed-base\n3270\n"));
        assertTrue(args.contains("--parallel\n@C@\n") && args.contains("--cpu-constant\nauto\n"));
        assertTrue(args.contains("bisect/hadur117.Hadur_@V@@A@.jar") && args.contains("work/melee-near-@V@-@A@"));
        assertFalse(args.contains("--baseline"), "arms pair in the read, not in the run");
        assertFalse(args.matches("(?s).*3\\.[12]\\d.*"), "names no version");
    }

    @Test
    @Tag("BENCH-176")
    @DisplayName("each arm edits only the off-team closest factor, shipped at 2, on master's melee")
    void ablation() throws IOException {
        String abl = Files.readString(Path.of("build-ablation.sh"));
        assertTrue(abl.contains("mnear3|mnear4)"));
        assertTrue(abl.contains("\"public static final double CLOSEST_FACTOR_SOLO = 2.0;\" \"public static final double CLOSEST_FACTOR_SOLO = $n.0;\""));
        assertTrue(abl.contains("version=\"${version}n$n\" ;;"));
        String melee = "../hadur-core/src/main/java/hadur117/core/melee/";
        String move = Files.readString(Path.of(melee + "MinimumRiskMovement.java"));
        assertTrue(move.contains("public static final double CLOSEST_FACTOR_SOLO = 2.0;"), "ships at 2");
        assertTrue(move.contains("public static final boolean MELEE_SURF = true;")
            && move.contains("public static final boolean MELEE_DAMAGE_MEMORY = true;"), "the arms sit on master's melee");
    }
}

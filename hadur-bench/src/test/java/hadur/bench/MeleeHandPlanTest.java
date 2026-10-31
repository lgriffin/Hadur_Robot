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

/** BENCH-157: the pc-melee-hand card (HAND-1 to HAND-3) is complete before it reaches the PC. */
class MeleeHandPlanTest {

    private static final Path QUEUE = Path.of("plans/pc-melee-hand.queue");
    private static final List<String> ARMS = List.of("aa", "bb", "et", "ed", "es");

    @Test
    @Tag("BENCH-157")
    @DisplayName("the steps chain from prep through every arm to a results PR, on the version the pom names")
    void stepsChain() throws IOException {
        String queue = Files.readString(QUEUE);
        List<String> steps = new java.util.ArrayList<>(List.of("haprep"));
        for (String a : ARMS) steps.add("ha" + a);
        steps.add("haread");
        steps.add("hapr");
        for (int i = 1; i < steps.size(); i++) {
            int at = queue.indexOf("\n" + steps.get(i) + " ");
            assertTrue(at >= 0, steps.get(i));
            int end = queue.indexOf("\n", queue.indexOf("\n", at + 1) + 1);
            assertTrue(queue.substring(at, end < 0 ? queue.length() : end).contains("after: " + steps.get(i - 1)),
                steps.get(i) + " after " + steps.get(i - 1));
        }
        assertTrue(queue.contains("<robot.release>"), "the version comes from the pom");
        assertFalse(queue.matches("(?s).*Hadur_3\\.\\d.*"), "no robot version is hard-coded");
        for (String a : List.of("aa", "bb", "etab", "edge", "eshd")) {
            assertTrue(queue.contains("bash ./build-ablation.sh " + a + " "), a + " is built");
        }
        for (String a : ARMS) {
            assertTrue(queue.contains("work/melee-hand-\"$V\"-" + a), a + "'s battles are cleared at prep");
            if (!a.equals("aa")) assertTrue(queue.contains("--arm " + a + "=\"$W\"-" + a), a + " is read");
        }
        assertTrue(queue.contains("echo \"$V\" > work/melee-hand.version") && queue.contains("V=$(cat work/melee-hand.version)"),
            "the read uses the version prep built, not the pom at read time");
        assertTrue(queue.contains("C=${MELEE_WORKERS}"), "the width is the host's melee width, fixed at prep");
        assertTrue(queue.contains("screen \"$W\"-aa --base2 \"$W\"-bb"), "each arm against both baselines");
        assertTrue(queue.contains("--seeds 6 --gain 0 --survival-slack 1"), "an arm passes with the low end above 0");
        assertTrue(queue.contains("open_results_pr.sh claude/pc-melee-hand-results"));
    }

    @Test
    @Tag("BENCH-157")
    @DisplayName("every arm step declares its stop rules")
    void stopRules() throws IOException {
        String queue = Files.readString(QUEUE);
        for (String a : ARMS) {
            int at = queue.indexOf("\nha" + a + " ");
            int next = queue.indexOf("\nha", at + 1);
            String body = queue.substring(at, next);
            for (String rule : List.of("watch: battles=276", "stop: fails 20", "stop: stall 30m")) {
                assertTrue(body.contains(rule), a + " " + rule);
            }
            assertFalse(body.contains("stop: dead"), a + ": dead needs a multi-arm step, so the runner would refuse the card");
        }
    }

    @Test
    @Tag("BENCH-157")
    @DisplayName("every arm runs alone on the census at 6 fresh seeds after pc-melee-dia's")
    void args() throws IOException {
        String args = Files.readString(Path.of("plans/melee-hand.args"));
        assertTrue(args.contains("--suite\nmelee-census-317.txt\n"));
        assertTrue(args.contains("--seeds\n6\n") && args.contains("--seed-base\n3258\n"));
        assertTrue(args.contains("--parallel\n@C@\n") && args.contains("--cpu-constant\nauto\n"));
        assertTrue(args.contains("bisect/hadur117.Hadur_@V@@A@.jar") && args.contains("work/melee-hand-@V@-@A@"));
        assertFalse(args.contains("--baseline"), "arms pair in the read, not in the run");
        assertFalse(args.matches("(?s).*3\\.[12]\\d.*"), "names no version");
    }

    @Test
    @Tag("BENCH-157")
    @DisplayName("each arm edits exactly its switch in HandOffDesign, all shipped off, on master's melee")
    void ablation() throws IOException {
        String abl = Files.readString(Path.of("build-ablation.sh"));
        assertTrue(abl.contains("etab) flag=ENDGAME_TABLE; suffix=et ;;"));
        assertTrue(abl.contains("edge) flag=ENDGAME_LEARNED_DODGE; suffix=ed ;;"));
        assertTrue(abl.contains("eshd) flag=ENDGAME_LEARNED_SHIELD; suffix=es ;;"));
        assertTrue(abl.contains("core/duel/HandOffDesign.java\" \\\n                \"public static final boolean $flag = false;\" \"public static final boolean $flag = true;\""));
        String design = Files.readString(Path.of("../hadur-core/src/main/java/hadur117/core/duel/HandOffDesign.java"));
        for (String f : List.of("ENDGAME_TABLE", "ENDGAME_LEARNED_DODGE", "ENDGAME_LEARNED_SHIELD")) {
            assertTrue(design.contains("public static final boolean " + f + " = false;"), f + " ships off");
        }
        String melee = "../hadur-core/src/main/java/hadur117/core/melee/";
        String move = Files.readString(Path.of(melee + "MinimumRiskMovement.java"));
        assertTrue(move.contains("public static final boolean MELEE_SURF = true;")
            && move.contains("public static final boolean MELEE_DAMAGE_MEMORY = true;"), "the arms sit on master's melee");
    }
}

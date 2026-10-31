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

/** BENCH-154: the pc-melee-dia card (MMOVE-22, MMOVE-23, MGUN-23) is complete before it reaches the PC. */
class MeleeDiaPlanTest {

    private static final Path QUEUE = Path.of("plans/pc-melee-dia.queue");
    private static final List<String> ARMS = List.of("aa", "bb", "dm", "la");

    @Test
    @Tag("BENCH-154")
    @DisplayName("the steps chain from prep through every arm to a results PR, on the version the pom names")
    void stepsChain() throws IOException {
        String queue = Files.readString(QUEUE);
        List<String> steps = new java.util.ArrayList<>(List.of("diprep"));
        for (String a : ARMS) steps.add("di" + a);
        steps.add("diread");
        steps.add("dipr");
        for (int i = 1; i < steps.size(); i++) {
            int at = queue.indexOf("\n" + steps.get(i) + " ");
            assertTrue(at >= 0, steps.get(i));
            int end = queue.indexOf("\n", queue.indexOf("\n", at + 1) + 1);
            assertTrue(queue.substring(at, end < 0 ? queue.length() : end).contains("after: " + steps.get(i - 1)),
                steps.get(i) + " after " + steps.get(i - 1));
        }
        assertTrue(queue.contains("<robot.release>"), "the version comes from the pom");
        assertFalse(queue.matches("(?s).*Hadur_3\\.\\d.*"), "no robot version is hard-coded");
        for (String a : List.of("aa", "bb", "mdmg", "mlat")) {
            assertTrue(queue.contains("bash ./build-ablation.sh " + a + " "), a + " is built");
        }
        for (String a : ARMS) {
            assertTrue(queue.contains("work/melee-dia-\"$V\"-" + a), a + "'s battles are cleared at prep");
            if (!a.equals("aa")) assertTrue(queue.contains("--arm " + a + "=\"$W\"-" + a), a + " is read");
        }
        assertTrue(queue.contains("echo \"$V\" > work/melee-dia.version") && queue.contains("V=$(cat work/melee-dia.version)"),
            "the read uses the version prep built, not the pom at read time");
        assertTrue(queue.contains("C=${MELEE_WORKERS}"), "the width is the host's melee width, fixed at prep");
        assertTrue(queue.contains("screen \"$W\"-aa --base2 \"$W\"-bb"), "each arm against both baselines");
        assertTrue(queue.contains("--seeds 6 --gain 0 --survival-slack 1"), "an arm passes with the low end above 0");
        assertTrue(queue.contains("open_results_pr.sh claude/pc-melee-dia-results"));
    }

    @Test
    @Tag("BENCH-154")
    @DisplayName("every arm step declares its stop rules")
    void stopRules() throws IOException {
        String queue = Files.readString(QUEUE);
        for (String a : ARMS) {
            int at = queue.indexOf("\ndi" + a + " ");
            int next = queue.indexOf("\ndi", at + 1);
            String body = queue.substring(at, next);
            for (String rule : List.of("watch: battles=276", "stop: fails 20", "stop: stall 30m")) {
                assertTrue(body.contains(rule), a + " " + rule);
            }
            assertFalse(body.contains("stop: dead"), a + ": dead needs a multi-arm step, so the runner would refuse the card");
        }
    }

    @Test
    @Tag("BENCH-154")
    @DisplayName("every arm runs alone on the census at 6 fresh seeds after pc-melee-scal's and the smoke's")
    void args() throws IOException {
        String args = Files.readString(Path.of("plans/melee-dia.args"));
        assertTrue(args.contains("--suite\nmelee-census-317.txt\n"));
        assertTrue(args.contains("--seeds\n6\n") && args.contains("--seed-base\n3252\n"));
        assertTrue(args.contains("--parallel\n@C@\n") && args.contains("--cpu-constant\nauto\n"));
        assertTrue(args.contains("bisect/hadur117.Hadur_@V@@A@.jar") && args.contains("work/melee-dia-@V@-@A@"));
        assertFalse(args.contains("--baseline"), "arms pair in the read, not in the run");
        assertFalse(args.matches("(?s).*3\\.[12]\\d.*"), "names no version");
    }

    @Test
    @Tag("BENCH-154")
    @DisplayName("each arm edits exactly its switch, all shipped off, on top of the shipped surfer and cross-learning")
    void ablation() throws IOException {
        String abl = Files.readString(Path.of("build-ablation.sh"));
        assertTrue(abl.contains("mdmg) flag=MELEE_DAMAGE_MEMORY; suffix=dm ;;"));
        assertTrue(abl.contains("mlat) flag=MELEE_FULL_LATERAL; suffix=la ;;"));
        assertTrue(abl.contains("\"public static final boolean AVG_POWER = false;\" \"public static final boolean AVG_POWER = true;\""));
        String melee = "../hadur-core/src/main/java/hadur117/core/melee/";
        String move = Files.readString(Path.of(melee + "MinimumRiskMovement.java"));
        assertTrue(move.contains("public static final boolean MELEE_SURF = true;"), "the arms sit on the surfer");
        for (String f : List.of("MELEE_DAMAGE_MEMORY", "MELEE_FULL_LATERAL")) {
            assertTrue(move.contains("public static final boolean " + f + " = false;"), f + " ships off");
        }
        assertTrue(Files.readString(Path.of(melee + "MeleeController.java")).contains("public static final boolean MELEE_CROSS = true;"),
            "MMOVE-19 ships on from 3.21");
        assertTrue(Files.readString(Path.of(melee + "MeleeEnergyPolicy.java")).contains("public static final boolean AVG_POWER = false;"));
    }
}

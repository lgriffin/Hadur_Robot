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

/** BENCH-185: the pc-melee-strong card (MGUN-24) is complete before it reaches the PC. */
class MeleeStrongPlanTest {

    private static final Path QUEUE = Path.of("plans/pc-melee-strong.queue");
    private static final List<String> ARMS = List.of("aa", "bb", "k1", "k2");

    @Test
    @Tag("BENCH-185")
    @DisplayName("the steps chain from prep through every arm to a results PR, on the version the pom names")
    void stepsChain() throws IOException {
        String queue = Files.readString(QUEUE);
        List<String> steps = new java.util.ArrayList<>(List.of("msprep", "mspilot", "mscheck"));
        for (String a : ARMS) steps.add("ms" + a);
        steps.add("msread");
        steps.add("mspr");
        for (int i = 1; i < steps.size(); i++) {
            int at = queue.indexOf("\n" + steps.get(i) + " ");
            assertTrue(at >= 0, steps.get(i));
            int end = queue.indexOf("\n", queue.indexOf("\n", at + 1) + 1);
            assertTrue(queue.substring(at, end < 0 ? queue.length() : end).contains("after: " + steps.get(i - 1)),
                steps.get(i) + " after " + steps.get(i - 1));
        }
        assertTrue(queue.contains("<robot.release>"), "the version comes from the pom");
        assertFalse(queue.matches("(?s).*Hadur_3\\.\\d.*"), "no robot version is hard-coded");
        for (String a : List.of("aa", "bb", "mstr1", "mstr2")) {
            assertTrue(queue.contains("bash ./build-ablation.sh " + a + " "), a + " is built");
        }
        for (String a : ARMS) {
            assertTrue(queue.contains("work/melee-strong-\"$V\"-" + a), a + "'s battles are cleared at prep");
            if (!a.equals("aa")) assertTrue(queue.contains("--arm " + a + "=\"$W\"-" + a), a + " is read");
        }
        assertTrue(queue.contains("echo \"$V\" > work/melee-strong.version") && queue.contains("V=$(cat work/melee-strong.version)"),
            "the read uses the version prep built, not the pom at read time");
        assertTrue(queue.contains("C=${MELEE_WORKERS}"), "the width is the host's melee width, fixed at prep");
        assertTrue(queue.contains("screen \"$W\"-aa --base2 \"$W\"-bb"), "each arm against both baselines");
        assertTrue(queue.contains("--seeds 6 --gain 0 --survival-slack 1"), "an arm passes with the low end above 0");
        assertTrue(queue.contains("open_results_pr.sh claude/pc-melee-strong-results"));
    }

    @Test
    @Tag("BENCH-185")
    @DisplayName("every arm step declares its stop rules")
    void stopRules() throws IOException {
        String queue = Files.readString(QUEUE);
        for (String a : ARMS) {
            int at = queue.indexOf("\nms" + a + " ");
            int next = queue.indexOf("\nms", at + 1);
            String body = queue.substring(at, next);
            for (String rule : List.of("watch: battles=276", "stop: fails 20", "stop: stall 30m")) {
                assertTrue(body.contains(rule), a + " " + rule);
            }
            assertFalse(body.contains("stop: dead"), a + ": dead needs a multi-arm step, so the runner would refuse the card");
        }
    }

    @Test
    @Tag("BENCH-185")
    @DisplayName("every arm runs alone on the census at 6 fresh seeds after pc-melee-near's")
    void args() throws IOException {
        String args = Files.readString(Path.of("plans/melee-strong.args"));
        assertTrue(args.contains("--suite\nmelee-census-317.txt\n"));
        assertTrue(args.contains("--seeds\n6\n") && args.contains("--seed-base\n3279\n"));
        assertTrue(args.contains("--parallel\n@C@\n") && args.contains("--cpu-constant\nauto\n"));
        assertTrue(args.contains("bisect/hadur117.Hadur_@V@@A@.jar") && args.contains("work/melee-strong-@V@-@A@"));
        assertFalse(args.contains("--baseline"), "arms pair in the read, not in the run");
        assertFalse(args.matches("(?s).*3\\.[12]\\d.*"), "names no version");
    }

    @Test
    @Tag("BENCH-185")
    @DisplayName("each arm edits only the strong-target boost, shipped at 0, on master's melee")
    void ablation() throws IOException {
        String abl = Files.readString(Path.of("build-ablation.sh"));
        assertTrue(abl.contains("mstr1|mstr2)"));
        assertTrue(abl.contains("\"public static final double STRONG_BOOST = 0.0;\" \"public static final double STRONG_BOOST = $n.0;\""));
        assertTrue(abl.contains("version=\"${version}k$n\" ;;"));
        String melee = "../hadur-core/src/main/java/hadur117/core/melee/";
        assertTrue(Files.readString(Path.of(melee + "FieldGun.java")).contains("public static final double STRONG_BOOST = 0.0;"), "ships off");
        String move = Files.readString(Path.of(melee + "MinimumRiskMovement.java"));
        assertTrue(move.contains("public static final boolean MELEE_SURF = true;")
            && move.contains("public static final boolean MELEE_DAMAGE_MEMORY = true;"), "the arms sit on master's melee");
    }

    @Test
    @Tag("BENCH-186")
    @DisplayName("a pilot of k2 against aa runs first and its check stops the card unless the share is up")
    void pilot() throws IOException {
        String queue = Files.readString(QUEUE);
        String args = Files.readString(Path.of("plans/melee-strong-pilot.args"));
        assertTrue(args.contains("--seeds\n2\n") && args.contains("--seed-base\n3285\n"), "fresh seeds after the card's");
        assertTrue(args.contains("bisect/hadur117.Hadur_@V@k2.jar") && args.contains("--baseline\nbisect/hadur117.Hadur_@V@aa.jar"));
        assertTrue(queue.contains("plans/melee-strong-pilot.args > work/melee-strong-pilot.args"), "prep writes the pilot's args");
        int at = queue.indexOf("\nmspilot ");
        String body = queue.substring(at, queue.indexOf("\nmscheck ", at));
        for (String rule : List.of("stop: fails 20", "stop: stall 30m")) assertTrue(body.contains(rule), "pilot " + rule);
        assertTrue(queue.contains("python3 tools/melee_pilot.py work/melee-strong-\"$V\"-pilot --expect 92 --rounds 35 --share-only"));
        assertTrue(queue.contains("@work/melee-strong-pilot.args\" || echo"), "a few failed pilot battles do not skip the check");
        assertTrue(queue.contains("open_results_pr.sh claude/pc-melee-strong-results \"Kill the strong scorers first (MGUN-24): pilot stopped the card\"")
            && queue.contains("; exit 1; }"), "a stopped pilot opens the results PR and fails, so no arm runs");
    }
}

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

/** BENCH-188: the pc-melee-far card (MGUN-25) is complete before it reaches the PC. */
class MeleeFarPlanTest {

    private static final Path QUEUE = Path.of("plans/pc-melee-far.queue");
    private static final List<String> ARMS = List.of("aa", "bb", "y3", "y5");

    @Test
    @Tag("BENCH-188")
    @DisplayName("the steps chain from prep through every arm to a results PR, on the version the pom names")
    void stepsChain() throws IOException {
        String queue = Files.readString(QUEUE);
        List<String> steps = new java.util.ArrayList<>(List.of("mfprep", "mfpilot", "mfcheck"));
        for (String a : ARMS) steps.add("mf" + a);
        steps.add("mfread");
        steps.add("mfpr");
        for (int i = 1; i < steps.size(); i++) {
            int at = queue.indexOf("\n" + steps.get(i) + " ");
            assertTrue(at >= 0, steps.get(i));
            int end = queue.indexOf("\n", queue.indexOf("\n", at + 1) + 1);
            assertTrue(queue.substring(at, end < 0 ? queue.length() : end).contains("after: " + steps.get(i - 1)),
                steps.get(i) + " after " + steps.get(i - 1));
        }
        assertTrue(queue.contains("<robot.release>"), "the version comes from the pom");
        assertFalse(queue.matches("(?s).*Hadur_3\\.\\d.*"), "no robot version is hard-coded");
        for (String a : List.of("aa", "bb", "mfar3", "mfar25")) {
            assertTrue(queue.contains("bash ./build-ablation.sh " + a + " "), a + " is built");
        }
        for (String a : ARMS) {
            assertTrue(queue.contains("work/melee-far-\"$V\"-" + a), a + "'s battles are cleared at prep");
            if (!a.equals("aa")) assertTrue(queue.contains("--arm " + a + "=\"$W\"-" + a), a + " is read");
        }
        assertTrue(queue.contains("echo \"$V\" > work/melee-far.version") && queue.contains("V=$(cat work/melee-far.version)"),
            "the read uses the version prep built, not the pom at read time");
        assertTrue(queue.contains("C=${MELEE_WORKERS}"), "the width is the host's melee width, fixed at prep");
        assertTrue(queue.contains("screen \"$W\"-aa --base2 \"$W\"-bb"), "each arm against both baselines");
        assertTrue(queue.contains("--seeds 6 --gain 0 --survival-slack 1"), "an arm passes with the low end above 0");
        assertTrue(queue.contains("open_results_pr.sh claude/pc-melee-far-results"));
    }

    @Test
    @Tag("BENCH-188")
    @DisplayName("every arm step declares its stop rules")
    void stopRules() throws IOException {
        String queue = Files.readString(QUEUE);
        for (String a : ARMS) {
            int at = queue.indexOf("\nmf" + a + " ");
            int next = queue.indexOf("\nmf", at + 1);
            String body = queue.substring(at, next);
            for (String rule : List.of("watch: battles=276", "stop: fails 20", "stop: stall 30m")) {
                assertTrue(body.contains(rule), a + " " + rule);
            }
            assertFalse(body.contains("stop: dead"), a + ": dead needs a multi-arm step, so the runner would refuse the card");
        }
    }

    @Test
    @Tag("BENCH-188")
    @DisplayName("every arm runs alone on the census at 6 fresh seeds after pc-melee-strong's")
    void args() throws IOException {
        String args = Files.readString(Path.of("plans/melee-far.args"));
        assertTrue(args.contains("--suite\nmelee-census-317.txt\n"));
        assertTrue(args.contains("--seeds\n6\n") && args.contains("--seed-base\n3287\n"));
        assertTrue(args.contains("--parallel\n@C@\n") && args.contains("--cpu-constant\nauto\n"));
        assertTrue(args.contains("bisect/hadur117.Hadur_@V@@A@.jar") && args.contains("work/melee-far-@V@-@A@"));
        assertFalse(args.contains("--baseline"), "arms pair in the read, not in the run");
        assertFalse(args.matches("(?s).*3\\.[12]\\d.*"), "names no version");
    }

    @Test
    @Tag("BENCH-188")
    @DisplayName("each arm turns on only the far power switch, shipped off, on master's melee")
    void ablation() throws IOException {
        String abl = Files.readString(Path.of("build-ablation.sh"));
        assertTrue(abl.contains("mfar3|mfar25)"));
        assertTrue(abl.contains("\"public static final boolean FAR_SPARE = false;\" \"public static final boolean FAR_SPARE = true;\""));
        assertTrue(abl.contains("\"static final double FAR_SPARE_POWER = 3.0;\" \"static final double FAR_SPARE_POWER = 2.5;\""));
        assertTrue(abl.contains("version=\"${version}y5\"") && abl.contains("version=\"${version}y3\""));
        String melee = "../hadur-core/src/main/java/hadur117/core/melee/";
        String policy = Files.readString(Path.of(melee + "MeleeEnergyPolicy.java"));
        assertTrue(policy.contains("public static final boolean FAR_SPARE = false;")
            && policy.contains("static final double FAR_SPARE_POWER = 3.0;"), "ships off");
        String move = Files.readString(Path.of(melee + "MinimumRiskMovement.java"));
        assertTrue(move.contains("public static final boolean MELEE_SURF = true;")
            && move.contains("public static final boolean MELEE_DAMAGE_MEMORY = true;"), "the arms sit on master's melee");
    }

    @Test
    @Tag("BENCH-189")
    @DisplayName("a pilot of y3 against aa runs first and its check stops the card unless the share is up")
    void pilot() throws IOException {
        String queue = Files.readString(QUEUE);
        String args = Files.readString(Path.of("plans/melee-far-pilot.args"));
        assertTrue(args.contains("--seeds\n2\n") && args.contains("--seed-base\n3293\n"), "fresh seeds after the card's");
        assertTrue(args.contains("bisect/hadur117.Hadur_@V@y3.jar") && args.contains("--baseline\nbisect/hadur117.Hadur_@V@aa.jar"));
        assertTrue(queue.contains("plans/melee-far-pilot.args > work/melee-far-pilot.args"), "prep writes the pilot's args");
        int at = queue.indexOf("\nmfpilot ");
        String body = queue.substring(at, queue.indexOf("\nmfcheck ", at));
        for (String rule : List.of("stop: fails 20", "stop: stall 30m")) assertTrue(body.contains(rule), "pilot " + rule);
        assertTrue(queue.contains("python3 tools/melee_pilot.py work/melee-far-\"$V\"-pilot --expect 92 --rounds 35 --share-only"));
        assertTrue(queue.contains("@work/melee-far-pilot.args\" || echo"), "a few failed pilot battles do not skip the check");
        assertTrue(queue.contains("open_results_pr.sh claude/pc-melee-far-results \"Far power on spare energy (MGUN-25): pilot stopped the card\"")
            && queue.contains("; exit 1; }"), "a stopped pilot opens the results PR and fails, so no arm runs");
    }
}

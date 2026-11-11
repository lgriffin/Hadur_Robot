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

/** BENCH-233: the pc-melee-dodge card (MMOVE-30) is complete before it reaches the PC. */
class MeleeDodgePlanTest {

    private static final Path QUEUE = Path.of("plans/pc-melee-dodge.queue");
    private static final List<String> ARMS = List.of("aa", "bb", "md");

    @Test
    @Tag("BENCH-233")
    @DisplayName("the steps chain from prep through every arm to a results PR, on the version the pom names")
    void stepsChain() throws IOException {
        String queue = Files.readString(QUEUE);
        List<String> steps = new java.util.ArrayList<>(List.of("dgprep", "dgpilot", "dgcheck"));
        for (String a : ARMS) steps.add("dg" + a);
        steps.add("dgread");
        steps.add("dgpr");
        for (int i = 1; i < steps.size(); i++) {
            int at = queue.indexOf("\n" + steps.get(i) + " ");
            assertTrue(at >= 0, steps.get(i));
            int end = queue.indexOf("\n", queue.indexOf("\n", at + 1) + 1);
            assertTrue(queue.substring(at, end < 0 ? queue.length() : end).contains("after: " + steps.get(i - 1)),
                steps.get(i) + " after " + steps.get(i - 1));
        }
        assertTrue(queue.contains("<robot.release>"), "the version comes from the pom");
        assertFalse(queue.matches("(?s).*Hadur_3\\.\\d.*"), "no robot version is hard-coded");
        for (String a : List.of("aa", "bb", "mdodge")) {
            assertTrue(queue.contains("bash ./build-ablation.sh " + a + " "), a + " is built");
        }
        for (String a : ARMS) {
            assertTrue(queue.contains("work/melee-dodge-\"$V\"-" + a), a + "'s battles are cleared at prep");
            if (!a.equals("aa")) assertTrue(queue.contains("--arm " + a + "=\"$W\"-" + a), a + " is read");
        }
        assertTrue(queue.contains("echo \"$V\" > work/melee-dodge.version") && queue.contains("V=$(cat work/melee-dodge.version)"),
            "the read uses the version prep built, not the pom at read time");
        assertTrue(queue.contains("C=${MELEE_WORKERS}"), "the width is the host's melee width, fixed at prep");
        assertTrue(queue.contains("screen \"$W\"-aa --base2 \"$W\"-bb"), "the arm against both baselines");
        assertTrue(queue.contains("--seeds 6 --gain 0 --survival-slack 1"), "the arm passes with the low end above 0");
        assertTrue(queue.contains("open_results_pr.sh claude/pc-melee-dodge-results"));
    }

    @Test
    @Tag("BENCH-233")
    @DisplayName("every arm step declares its stop rules")
    void stopRules() throws IOException {
        String queue = Files.readString(QUEUE);
        for (String a : ARMS) {
            int at = queue.indexOf("\ndg" + a + " ");
            int next = queue.indexOf("\ndg", at + 1);
            String body = queue.substring(at, next);
            for (String rule : List.of("watch: battles=276", "stop: fails 20", "stop: stall 30m")) {
                assertTrue(body.contains(rule), a + " " + rule);
            }
            assertFalse(body.contains("stop: dead"), a + ": dead needs a multi-arm step, so the runner would refuse the card");
        }
    }

    @Test
    @Tag("BENCH-233")
    @DisplayName("every arm runs alone on the census at 6 fresh seeds after pc-melee-states'")
    void args() throws IOException {
        String args = Files.readString(Path.of("plans/melee-dodge.args"));
        assertTrue(args.contains("--suite\nmelee-census-317.txt\n"));
        assertTrue(args.contains("--seeds\n6\n") && args.contains("--seed-base\n3339\n"));
        assertTrue(args.contains("--parallel\n@C@\n") && args.contains("--cpu-constant\nauto\n"));
        assertTrue(args.contains("bisect/hadur117.Hadur_@V@@A@.jar") && args.contains("work/melee-dodge-@V@-@A@"));
        assertFalse(args.contains("--baseline"), "arms pair in the read, not in the run");
        assertFalse(args.matches("(?s).*3\\.[12]\\d.*"), "names no version");
    }

    @Test
    @Tag("BENCH-233")
    @DisplayName("the arm turns on one switch that ships off on master")
    void ablation() throws IOException {
        String abl = Files.readString(Path.of("build-ablation.sh"));
        assertTrue(abl.contains("        mdodge)\n") && abl.contains("version=\"${version}md\" ;;"));
        assertTrue(abl.contains("\"public static final boolean MELEE_DODGE = false;\" \"public static final boolean MELEE_DODGE = true;\""));
        String melee = "../hadur-core/src/main/java/hadur117/core/melee/";
        assertTrue(Files.readString(Path.of(melee + "MinimumRiskMovement.java")).contains("public static final boolean MELEE_DODGE = false;"),
            "MMOVE-30 ships off");
    }

    @Test
    @Tag("BENCH-234")
    @DisplayName("a pilot of md against aa runs first and its check stops the card unless the share is up")
    void pilot() throws IOException {
        String queue = Files.readString(QUEUE);
        String args = Files.readString(Path.of("plans/melee-dodge-pilot.args"));
        assertTrue(args.contains("--seeds\n2\n") && args.contains("--seed-base\n3345\n"), "fresh seeds after the card's");
        assertTrue(args.contains("bisect/hadur117.Hadur_@V@md.jar") && args.contains("--baseline\nbisect/hadur117.Hadur_@V@aa.jar"));
        assertTrue(queue.contains("plans/melee-dodge-pilot.args > work/melee-dodge-pilot.args"), "prep writes the pilot's args");
        int at = queue.indexOf("\ndgpilot ");
        String body = queue.substring(at, queue.indexOf("\ndgcheck ", at));
        for (String rule : List.of("stop: fails 20", "stop: stall 30m")) assertTrue(body.contains(rule), "pilot " + rule);
        assertTrue(queue.contains("python3 tools/melee_pilot.py work/melee-dodge-\"$V\"-pilot --expect 92 --rounds 35 --share-only"));
        assertTrue(queue.contains("@work/melee-dodge-pilot.args\" || echo"), "a few failed pilot battles do not skip the check");
        assertTrue(queue.contains("open_results_pr.sh claude/pc-melee-dodge-results \"The shot profiles in the crowd (MMOVE-30): pilot stopped the card\"")
            && queue.contains("; exit 1; }"), "a stopped pilot opens the results PR and fails, so no arm runs");
    }
}

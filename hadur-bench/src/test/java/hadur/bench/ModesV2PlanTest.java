package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** BENCH-101: the 1v1 mode table v2 card (plans/pc-1v1-modes.queue) is complete before it reaches the PC. */
class ModesV2PlanTest {

    private static final Path QUEUE = Path.of("plans/pc-1v1-modes.queue");

    private static String release() throws IOException {
        Matcher m = Pattern.compile("<robot.release>([^<]+)</robot.release>")
            .matcher(Files.readString(Path.of("../hadur-robot/pom.xml")));
        assertTrue(m.find());
        return m.group(1);
    }

    @Test
    @Tag("BENCH-101")
    @DisplayName("the screens' arms are the control, its A/A copy and the forced modes, all built by the card on the release")
    void armsAreBuilt() throws IOException {
        String v = release();
        String queue = Files.readString(QUEUE);
        Path here = Path.of("").toAbsolutePath();
        List<Arms.Arm> poison = Arms.parse(Path.of("plans/modes-poison.arms"), here);
        List<Arms.Arm> dodge = Arms.parse(Path.of("plans/modes-dodge.arms"), here);
        assertEquals(List.of("c", "aa", "wp", "ws"), poison.stream().map(Arms.Arm::label).toList());
        assertEquals(List.of("c", "aa", "sg"), dodge.stream().map(Arms.Arm::label).toList());
        for (Arms.Arm a : poison) assertTrue(a.robot().startsWith("hadur2.Hadur " + v), a.robot());
        for (Arms.Arm a : dodge) assertTrue(a.robot().startsWith("hadur2.Hadur " + v), a.robot());
        assertTrue(queue.contains("cp ../hadur-robot/target/hadur2.Hadur_" + v + ".jar bisect/"));
        for (String b : new String[] {"aa", "sgo", "sgo2", "sdodge"}) {
            assertTrue(queue.contains("build-ablation.sh " + b + " "), b);
        }
        assertTrue(queue.contains("--base " + v + " "));
        assertTrue(queue.contains("fetch-opponents.sh --set panel-saguaro-poison.txt")
            && queue.contains("fetch-opponents.sh --set panel-saguaro-dodge.txt"));
    }

    @Test
    @Tag("BENCH-101")
    @DisplayName("every step reads the one before it at 12 workers; the verify uses fresh seeds and the run ends in a gate and a results PR")
    void stepsChain() throws IOException {
        String queue = Files.readString(QUEUE);
        assertTrue(queue.contains("set P = --parallel 12 --no-truth-log"));
        String[] steps = {"prep", "poison", "dodge", "pick", "candidate", "verify", "gate", "pr"};
        for (int i = 1; i < steps.length; i++) {
            int at = queue.indexOf("\n" + steps[i] + " | ");
            assertTrue(at >= 0, steps[i]);
            int next = queue.indexOf("\n\n", at + 1);
            assertTrue(queue.substring(at, next < 0 ? queue.length() : next).contains("after: " + steps[i - 1]),
                steps[i] + " after " + steps[i - 1]);
        }
        assertTrue(queue.contains("--margin 5"), "a mode is locked at +5 points");
        assertTrue(queue.contains("--seed-base 2700 --arms work/modes-v2-verify.arms"));
        assertFalse(queue.contains("--seed-base 2500 --arms work/modes-v2-verify.arms")
            || queue.contains("--seed-base 2600 --arms work/modes-v2-verify.arms"), "fresh seeds");
        assertTrue(queue.contains("gate work/modes-v2-verify/arms.tsv --arm t3 --panel work/modes-v2-panel.txt"));
        assertTrue(Files.isRegularFile(Path.of("tools/modes_v2.py")) && Files.isRegularFile(Path.of("tools/test_modes_v2.py")));
        assertTrue(queue.contains("open_results_pr.sh claude/pc-1v1-modes-results"));
    }

    @Test
    @Tag("BENCH-101")
    @DisplayName("team step C runs after the 1v1 results PR, from master, each step after the one before, and ends in its own results PR")
    void teamStepsFollow() throws IOException {
        String queue = Files.readString(QUEUE);
        String[] steps = {"pr", "tcprep", "tcbb", "tcl0", "tclo", "tclomb", "tcpr"};
        for (int i = 1; i < steps.length; i++) {
            int at = queue.indexOf("\n" + steps[i] + " ");
            assertTrue(at >= 0, steps[i]);
            int next = queue.indexOf("\n\n", at + 1);
            assertTrue(queue.substring(at, next < 0 ? queue.length() : next).contains("after: " + steps[i - 1]),
                steps[i] + " after " + steps[i - 1]);
        }
        assertTrue(queue.contains("tcprep | git checkout -q master && "), "back on master before the team builds");
        assertTrue(queue.contains("open_results_pr.sh claude/pc-team-c-results"));
        assertTrue(queue.contains("set OUT = ../docs/bench/local"));
    }
}

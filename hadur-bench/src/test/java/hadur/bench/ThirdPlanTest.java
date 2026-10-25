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

/** BENCH-109: the 1v1 plan-to-3rd card (plans/pc-1v1-third.queue) is complete before it reaches the PC. */
class ThirdPlanTest {

    private static final Path QUEUE = Path.of("plans/pc-1v1-third.queue");

    private static String release() throws IOException {
        Matcher m = Pattern.compile("<robot.release>(.*)</robot.release>")
            .matcher(Files.readString(Path.of("../hadur-robot/pom.xml")));
        assertTrue(m.find());
        return m.group(1);
    }

    @Test
    @Tag("BENCH-109")
    @DisplayName("the screen's arms are the control, its A/A copy and the planner, all built by the card on the current release")
    void armsAreBuilt() throws IOException {
        String v = release();
        String queue = Files.readString(QUEUE);
        List<Arms.Arm> arms = Arms.parse(Path.of("plans/third-dodge.arms"), Path.of("").toAbsolutePath());
        assertEquals(List.of("c", "aa", "sp"), arms.stream().map(Arms.Arm::label).toList());
        for (Arms.Arm a : arms) assertTrue(a.robot().startsWith("hadur2.Hadur " + v), a.robot());
        assertTrue(queue.contains("cp ../hadur-robot/target/hadur2.Hadur_" + v + ".jar bisect/"));
        assertTrue(queue.contains("build-ablation.sh aa ") && queue.contains("build-ablation.sh sdplan "));
        assertTrue(queue.contains("--base " + v + " "));
        assertTrue(queue.contains("fetch-opponents.sh --set panel-third-dodge.txt"));
        assertTrue(Files.isRegularFile(Path.of("panel-third-dodge.txt")));
    }

    @Test
    @Tag("BENCH-109")
    @DisplayName("every step reads the one before it at 12 workers; the verify uses fresh seeds and the run ends in a gate and a results PR")
    void stepsChain() throws IOException {
        String queue = Files.readString(QUEUE);
        assertTrue(queue.contains("set P = --parallel 12 --no-truth-log"));
        String[] steps = {"prep", "mine", "screen", "pick", "candidate", "verify", "gate", "pr"};
        for (int i = 1; i < steps.length; i++) {
            int at = queue.indexOf("\n" + steps[i] + " | ");
            assertTrue(at >= 0, steps[i]);
            int next = queue.indexOf("\n\n", at + 1);
            assertTrue(queue.substring(at, next < 0 ? queue.length() : next).contains("after: " + steps[i - 1]),
                steps[i] + " after " + steps[i - 1]);
        }
        assertTrue(queue.contains("--margin 5"));
        assertTrue(queue.contains("--seed-base 3000 --arms work/third-verify.arms"));
        assertFalse(queue.contains("--seed-base 2900 --arms work/third-verify.arms"), "fresh seeds");
        assertTrue(queue.contains("gate work/third-verify/arms.tsv --arm t4 --panel work/third-panel.txt"));
        for (String t : new String[] {"third", "factor_picks"}) {
            assertTrue(Files.isRegularFile(Path.of("tools/" + t + ".py")) && Files.isRegularFile(Path.of("tools/test_" + t + ".py")), t);
        }
        assertTrue(queue.contains("open_results_pr.sh claude/pc-1v1-third-results"));
        assertTrue(queue.contains("-name 'third-*' -size +0c"), "an empty list would stop open_results_pr.sh");
    }
}

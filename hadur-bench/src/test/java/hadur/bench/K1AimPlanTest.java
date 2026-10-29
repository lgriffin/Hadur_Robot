package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertEquals;
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

/** BENCH-138: the aim-member card (plans/pc-k1-aim.queue) is complete before it reaches the PC. */
class K1AimPlanTest {

    private static final Path QUEUE = Path.of("plans/pc-k1-aim.queue");

    private static String release() throws IOException {
        Matcher m = Pattern.compile("<robot.release>(.*)</robot.release>")
            .matcher(Files.readString(Path.of("../hadur-robot/pom.xml")));
        assertTrue(m.find());
        return m.group(1);
    }

    @Test
    @Tag("BENCH-138")
    @DisplayName("the arms are the control, its A/A copy and the aim members, all built by the card on the current release")
    void armsAreBuilt() throws IOException {
        String v = release();
        String queue = Files.readString(QUEUE);
        List<Arms.Arm> arms = Arms.parse(Path.of("plans/k1-aim.arms"), Path.of("").toAbsolutePath());
        assertEquals(List.of("c", "aa", "km"), arms.stream().map(Arms.Arm::label).toList());
        for (Arms.Arm a : arms) assertTrue(a.robot().startsWith("hadur117.Hadur " + v), a.robot());
        assertTrue(queue.contains("set V = " + v));
        assertTrue(queue.contains("cp ../hadur-robot/target/hadur117.Hadur_${V}.jar bisect/"));
        assertTrue(queue.contains("build-ablation.sh aa ") && queue.contains("build-ablation.sh aimmem "));
        long robots = Files.readAllLines(Path.of("aes-flat-learning.txt")).stream()
            .filter(l -> !l.startsWith("#") && l.contains("|")).count();
        assertEquals(432, robots, "the learning guns on flat movers");
    }

    @Test
    @Tag("BENCH-138")
    @DisplayName("a fresh seed, the gate, losses per robot, the oracle re-join, and a results PR only after every analysis passes")
    void stepsChain() throws IOException {
        String queue = Files.readString(QUEUE);
        assertTrue(queue.contains("set P = --parallel 12 --no-truth-log"));
        String[] steps = {"prep", "aim", "gate", "rejoin", "pr"};
        for (int i = 1; i < steps.length; i++) {
            int at = queue.indexOf("\n" + steps[i] + " | ");
            assertTrue(at >= 0, steps[i]);
            int next = queue.indexOf("\n\n", at + 1);
            assertTrue(queue.substring(at, next < 0 ? queue.length() : next).contains("after: " + steps[i - 1]),
                steps[i] + " after " + steps[i - 1]);
        }
        assertTrue(queue.contains("--seeds 1 --seed-base 4400 --arms plans/k1-aim.arms"));
        assertTrue(queue.contains("--arm km --panel aes-flat-learning.txt --bar 0.05"));
        assertTrue(queue.contains("tools/per_robot.py ${W}/arms.tsv --arms km"));
        String gate = queue.substring(queue.indexOf("\ngate | "), queue.indexOf("\n\nrejoin | "));
        assertTrue(!gate.contains(";"), "an analysis error must stop the card before the results PR");
        assertTrue(queue.contains("--out ${K0}/oracle-k1.npz"), "the re-join keeps pc-k0-oracle's oracle.npz");
        assertTrue(queue.contains("open_results_pr.sh claude/pc-k1-aim-results"));
        // BENCH-129, BENCH-130: watched, with stop rules fixed before the run.
        assertTrue(queue.contains("set ALERT = lgriffin"));
        String aim = queue.substring(queue.indexOf("\naim | "), queue.indexOf("\n\ngate | "));
        assertTrue(aim.contains("--shuffle-jobs") && aim.contains("watch: field=1217"), aim);
        for (String rule : new String[] {"fails 30", "dead 8", "skips 40 over 200", "stall 30m", "aa after 20%",
            "futility km below 0.05 after 30%"}) {
            assertTrue(aim.contains("stop: " + rule), rule);
        }
    }
}

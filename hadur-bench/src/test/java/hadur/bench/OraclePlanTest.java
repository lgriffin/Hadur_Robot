package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** BENCH-134: the K0 oracle card (plans/pc-k0-oracle.queue) is complete before it reaches the PC. */
class OraclePlanTest {

    private static final Path QUEUE = Path.of("plans/pc-k0-oracle.queue");

    private static String release() throws IOException {
        Matcher m = Pattern.compile("<robot.release>(.*)</robot.release>")
            .matcher(Files.readString(Path.of("../hadur-robot/pom.xml")));
        assertTrue(m.find());
        return m.group(1);
    }

    @Test
    @Tag("BENCH-134")
    @DisplayName("the current release with both records on, on the 432 learning guns on flat movers, truth log on")
    void recordsTheClass() throws IOException {
        String queue = Files.readString(QUEUE);
        assertTrue(queue.contains("set V = " + release() + "\n"), "the current release");
        assertTrue(queue.contains("build-ablation.sh aesrec,oracle "), "ORACLE-1 for the oracle, AES-1 for its gate");
        assertTrue(queue.contains("set JAR = bisect/hadur117.Hadur_${V}aror.jar"), "the jar the ablation builds");
        assertTrue(queue.contains("--set aes-flat-learning.txt --seeds 2 --seed-base 4200 --robot-jar ${JAR}"));
        assertTrue(!queue.contains("--no-truth-log"), "the oracle needs every bullet's heading");
        long robots = Files.readAllLines(Path.of("aes-flat-learning.txt")).stream()
            .filter(l -> !l.startsWith("#") && l.contains("|")).count();
        assertTrue(robots >= 430, "the learning-flat class: " + robots);
    }

    @Test
    @Tag("BENCH-134")
    @DisplayName("join, score and a results PR in order, with stop rules on the battles")
    void stepsChain() throws IOException {
        String queue = Files.readString(QUEUE);
        String[] steps = {"prep", "record", "join", "score", "pr"};
        for (int i = 1; i < steps.length; i++) {
            int at = queue.indexOf("\n" + steps[i] + " | ");
            assertTrue(at >= 0, steps[i]);
            int next = queue.indexOf("\n\n", at + 1);
            assertTrue(queue.substring(at, next < 0 ? queue.length() : next).contains("after: " + steps[i - 1]),
                steps[i] + " after " + steps[i - 1]);
        }
        assertTrue(queue.contains("gun_oracle.py join ${W} --out ${W}/oracle.npz"));
        assertTrue(queue.contains("gun_oracle.py score ${W}/oracle.npz"));
        assertTrue(queue.contains("open_results_pr.sh claude/pc-k0-oracle-results"));
        assertTrue(queue.contains("set ALERT = lgriffin"));
        String record = queue.substring(queue.indexOf("\nrecord | "), queue.indexOf("\n\njoin | "));
        for (String rule : new String[] {"fails 30", "skips 40 over 200", "stall 30m"}) {
            assertTrue(record.contains("stop: " + rule), rule);
        }
        assertTrue(record.contains("watch: battles=864"));
    }
}

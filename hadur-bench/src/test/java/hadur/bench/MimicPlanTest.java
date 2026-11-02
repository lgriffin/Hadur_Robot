package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** BENCH-168: the learning-gun mimic card (plans/pc-mimic.queue) is complete before it reaches the PC. */
class MimicPlanTest {

    @Test
    @Tag("BENCH-168")
    @DisplayName("the 232 learners with c/aa/mm at 3 fresh seeds, the gate, the pick and the stop rules")
    void cardIsComplete() throws IOException {
        String queue = Files.readString(Path.of("plans/pc-mimic.queue"));
        String version = Files.readString(Path.of("../hadur-robot/pom.xml"))
            .replaceAll("(?s).*<robot.release>(.*?)</robot.release>.*", "$1");
        assertTrue(queue.contains("set V = " + version + "\n"), "the card builds the current release");
        assertTrue(queue.contains("build-ablation.sh aa ") && queue.contains("build-ablation.sh mimmem "));
        assertTrue(queue.contains("--set panel-learners-flat.txt --seeds 3 --seed-base 7700 --arms plans/mimic.arms"));
        String arms = Files.readString(Path.of("plans/mimic.arms"));
        for (String arm : new String[] {"c | hadur117.Hadur " + version + " |", "aa | hadur117.Hadur " + version + "aa |",
                                        "mm | hadur117.Hadur " + version + "mm |"}) {
            assertTrue(arms.contains("\n" + arm), arm);
        }
        assertTrue(queue.contains("--arm mm --panel panel-learners-flat.txt --bar 0.05"));
        assertTrue(queue.contains("mode_table.py ${W}/arms.tsv --margin 5"));
        String[] steps = {"prep", "screen", "gate", "pr"};
        for (int i = 1; i < steps.length; i++) {
            int at = queue.indexOf("\n" + steps[i] + " | ");
            assertTrue(at >= 0, steps[i]);
            int next = queue.indexOf("\n\n", at + 1);
            assertTrue(queue.substring(at, next < 0 ? queue.length() : next).contains("after: " + steps[i - 1]),
                steps[i] + " after " + steps[i - 1]);
        }
        String gate = queue.substring(queue.indexOf("\ngate | "), queue.indexOf("\n\npr | "));
        assertTrue(!gate.contains(";"), "an analysis error must stop the card before the results PR");
        String screen = queue.substring(queue.indexOf("\nscreen | "), queue.indexOf("\n\ngate | "));
        assertTrue(screen.contains("--shuffle-jobs") && screen.contains("watch: field=1217"));
        for (String rule : new String[] {"fails 30", "dead 8", "skips 60 over 200", "stall 30m"}) {
            assertTrue(screen.contains("stop: " + rule), rule);
        }
        assertTrue(queue.contains("open_results_pr.sh claude/pc-mimic-results"));
        assertTrue(queue.contains("set ALERT = lgriffin") && queue.contains("set P = --parallel 12 --no-truth-log"));
    }
}

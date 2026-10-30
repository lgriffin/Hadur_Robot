package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** BENCH-140: the simple-gun card (plans/pc-sg-aim.queue) is complete before it reaches the PC. */
class SimpleGunPlanTest {

    private static final Path QUEUE = Path.of("plans/pc-sg-aim.queue");

    @Test
    @Tag("BENCH-140")
    @DisplayName("the 434 simple-gun robots, K1's arms built on the current release, a fresh seed and the gate")
    void cardIsComplete() throws IOException {
        String queue = Files.readString(QUEUE);
        long robots = Files.readAllLines(Path.of("simple-guns.txt")).stream()
            .filter(l -> !l.startsWith("#") && l.contains("|")).count();
        assertEquals(434, robots, "the census's simple-gun class");
        assertTrue(queue.contains("--set simple-guns.txt --seeds 1 --seed-base 4800 --arms plans/k1-aim.arms"));
        assertTrue(queue.contains("build-ablation.sh aa ") && queue.contains("build-ablation.sh aimmem "));
        assertTrue(queue.contains("--arm km --panel simple-guns.txt --bar 0.05"));
        assertTrue(queue.contains("tools/per_robot.py ${W}/arms.tsv --arms km"));
        String[] steps = {"prep", "aim", "gate", "pr"};
        for (int i = 1; i < steps.length; i++) {
            int at = queue.indexOf("\n" + steps[i] + " | ");
            assertTrue(at >= 0, steps[i]);
            int next = queue.indexOf("\n\n", at + 1);
            assertTrue(queue.substring(at, next < 0 ? queue.length() : next).contains("after: " + steps[i - 1]),
                steps[i] + " after " + steps[i - 1]);
        }
        String gate = queue.substring(queue.indexOf("\ngate | "), queue.indexOf("\n\npr | "));
        assertTrue(!gate.contains(";"), "an analysis error must stop the card before the results PR");
        assertTrue(queue.contains("open_results_pr.sh claude/pc-sg-aim-results"));
        // BENCH-129, BENCH-130: watched, with stop rules fixed before the run.
        assertTrue(queue.contains("set ALERT = lgriffin") && queue.contains("set P = --parallel 12 --no-truth-log"));
        String aim = queue.substring(queue.indexOf("\naim | "), queue.indexOf("\n\ngate | "));
        assertTrue(aim.contains("--shuffle-jobs") && aim.contains("watch: field=1217"), aim);
        for (String rule : new String[] {"fails 30", "dead 8", "skips 40 over 200", "stall 30m", "aa after 20%",
            "futility km below 0.05 after 30%"}) {
            assertTrue(aim.contains("stop: " + rule), rule);
        }
    }
}

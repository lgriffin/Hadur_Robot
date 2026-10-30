package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** BENCH-141: the 3.20 census card (plans/pc-census-320.queue) is complete before it reaches the PC. */
class CensusPlanTest {

    private static final Path QUEUE = Path.of("plans/pc-census-320.queue");

    @Test
    @Tag("BENCH-141")
    @DisplayName("the 1,212 census robots, master against MOVE-29 off, a fresh seed and the gate at 3rd")
    void cardIsComplete() throws IOException {
        String queue = Files.readString(QUEUE);
        long robots = Files.readAllLines(Path.of("census-312.txt")).stream()
            .filter(l -> !l.startsWith("#") && l.contains("|")).count();
        assertEquals(1212, robots, "the census field");
        String arms = Files.readString(Path.of("plans/census-320.arms"));
        assertTrue(arms.contains("c | hadur117.Hadur 3.19kx | bisect/hadur117.Hadur_3.19kx.jar"), arms);
        assertTrue(arms.contains("aa | hadur117.Hadur 3.19kxaa | bisect/hadur117.Hadur_3.19kxaa.jar"), arms);
        assertTrue(arms.contains("km | hadur117.Hadur 3.19aa | bisect/hadur117.Hadur_3.19aa.jar"), arms);
        assertTrue(queue.contains("--set census-312.txt --seeds 1 --seed-base 4900 --arms plans/census-320.arms"));
        assertTrue(queue.contains("build-ablation.sh aa ") && queue.contains("build-ablation.sh noaim ")
            && queue.contains("build-ablation.sh noaim,aa "));
        assertTrue(queue.contains("multiarm.py ${W}/arms.tsv --census census-312.txt "), "the census-weighted field column");
        assertTrue(queue.contains("--arm km --panel census-312.txt --bar 0.18"));
        assertTrue(queue.contains("tools/per_robot.py ${W}/arms.tsv --arms km"));
        String[] steps = {"prep", "census", "gate", "pr"};
        for (int i = 1; i < steps.length; i++) {
            int at = queue.indexOf("\n" + steps[i] + " | ");
            assertTrue(at >= 0, steps[i]);
            int next = queue.indexOf("\n\n", at + 1);
            assertTrue(queue.substring(at, next < 0 ? queue.length() : next).contains("after: " + steps[i - 1]),
                steps[i] + " after " + steps[i - 1]);
        }
        String gate = queue.substring(queue.indexOf("\ngate | "), queue.indexOf("\n\npr | "));
        assertTrue(!gate.contains(";"), "an analysis error must stop the card before the results PR");
        assertTrue(queue.contains("open_results_pr.sh claude/pc-census-320-results"));
        // BENCH-129, BENCH-130: watched, with stop rules fixed before the run, and no futility: a census reads
        // every robot.
        assertTrue(queue.contains("set ALERT = lgriffin") && queue.contains("set P = --parallel 12 --no-truth-log"));
        String census = queue.substring(queue.indexOf("\ncensus | "), queue.indexOf("\n\ngate | "));
        assertTrue(census.contains("--shuffle-jobs") && census.contains("watch: field=1217"), census);
        for (String rule : new String[] {"fails 30", "dead 8", "skips 60 over 200", "stall 30m", "aa after 20%"}) {
            assertTrue(census.contains("stop: " + rule), rule);
        }
        assertTrue(!census.contains("futility"), "a census reads every robot");
    }
}

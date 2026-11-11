package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** BENCH-232: the pc-melee-states card (the census once with the trace on, read for the states robots are hit in) is complete before it reaches the PC. */
class MeleeStatesPlanTest {

    @Test
    @Tag("BENCH-232")
    @DisplayName("master fights the 46 census fields once at 20 rounds with the melee trace on, the traces are read by melee_states.py, and the read goes out as a results PR")
    void cardIsComplete() throws IOException {
        String queue = Files.readString(Path.of("plans/pc-melee-states.queue"));
        String[] steps = {"msprep", "mstrace", "msread", "mspr"};
        for (int i = 1; i < steps.length; i++) {
            int at = queue.indexOf("\n" + steps[i] + " ");
            assertTrue(at >= 0, steps[i]);
            int next = queue.indexOf("\nms", at + 1);
            assertTrue(queue.substring(at, next < 0 ? queue.length() : next).contains("after: " + steps[i - 1]), steps[i]);
        }
        assertTrue(queue.contains("<robot.release>"), "the version comes from the pom");
        assertFalse(queue.matches("(?s).*Hadur_3\\.\\d.*"), "no robot version is hard-coded");
        assertTrue(queue.contains("stop: fails 10") && queue.contains("stop: stall 30m"));
        assertTrue(queue.contains("python3 tools/melee_states.py work/melee-states-\"$V\" --ours hadur117.Hadur --min-shots 2000 --out ${OUT}/melee-states-read.md"));
        assertTrue(queue.contains("open_results_pr.sh claude/pc-melee-states-results"));
        assertTrue(queue.contains("What the result decides"));
        String args = Files.readString(Path.of("plans/melee-states.args"));
        assertTrue(args.contains("--suite\nmelee-census-317.txt\n") && args.contains("--seeds\n1\n") && args.contains("--seed-base\n3330\n")
            && args.contains("--rounds\n20\n"));
        assertTrue(args.contains("--melee-trace\ntrue\n"), "the trace is on");
        assertFalse(args.contains("--baseline"), "one build: the card compares no builds");
        assertTrue(args.contains("--out\nwork/melee-states-@V@\n") && args.contains("bisect/hadur117.Hadur_@V@aa.jar"));
        assertTrue(Files.exists(Path.of("melee-census-317.txt")) && Files.exists(Path.of("tools/melee_states.py")));
    }
}

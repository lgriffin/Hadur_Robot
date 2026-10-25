package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** BENCH-102: the pc-shield-s3 card (warm-start shield, stop-and-go pass 2) is complete before it reaches the PC. */
class ShieldS3PlanTest {

    private static final Path QUEUE = Path.of("plans/pc-shield-s3.queue");

    @Test
    @Tag("BENCH-102")
    @DisplayName("every step reads the one before it at 12 workers, on the release the card builds, and ends in a gate and a results PR")
    void stepsChain() throws IOException {
        String queue = Files.readString(QUEUE);
        // The card ran on 3.16 and is finished, so later version bumps do not move it.
        String release = "3.16";
        assertTrue(queue.contains("set P = --parallel 12 --no-truth-log"));
        assertTrue(queue.contains("cp ../hadur-robot/target/hadur2.Hadur_" + release + ".jar bisect/"));
        assertTrue(queue.contains("--base " + release + " "));
        String[] steps = {"prep", "warm", "poison2", "pick", "candidate", "verify", "gate", "pr"};
        for (int i = 1; i < steps.length; i++) {
            int at = queue.indexOf("\n" + steps[i] + " | ");
            assertTrue(at >= 0, steps[i]);
            int next = queue.indexOf("\n\n", at + 1);
            assertTrue(queue.substring(at, next < 0 ? queue.length() : next).contains("after: " + steps[i - 1]),
                steps[i] + " after " + steps[i - 1]);
        }
        assertTrue(queue.contains("test -s work/shield-s2-screen/arms.tsv && test -s work/modes-poison/arms.tsv"),
            "prep stops before any battle without the earlier runs");
        assertTrue(queue.contains("work/modes-poison/arms.tsv work/shield-s3-poison/arms.tsv --margin 3"));
        assertTrue(queue.contains("gate work/shield-s3-verify/arms.tsv --arm t4"));
        assertTrue(Files.isRegularFile(Path.of("tools/shield_s3.py")) && Files.isRegularFile(Path.of("tools/test_shield_s3.py")));
        assertTrue(queue.contains("open_results_pr.sh claude/pc-shield-s3-results"));
        assertFalse(queue.contains("${OUT}/s3-*.txt"), "an empty list would stop open_results_pr.sh");
    }
}

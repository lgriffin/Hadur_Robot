package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/**
 * BENCH-179: the JayLexi mid-field surf-row card (plans/pc-jaylexi-mid.queue) is complete before it reaches the PC: its
 * arms built by tools/jaylexi_rows_off.py --skip, one shuffled multi-arm step with the 20% pilot stop (A/A and futility)
 * and the usual halts, the case for it written on the card, the read and the PR.
 */
class JayLexiMidPlanTest {

    @Test
    @Tag("BENCH-179")
    @DisplayName("the arms, the 80-robot mid-field panel, the 20% pilot stop and the why-it-should-win case are on the card")
    void cardIsComplete() throws IOException {
        String queue = Files.readString(Path.of("plans/pc-jaylexi-mid.queue"));
        List<String> arms = Files.readAllLines(Path.of("plans/jaylexi-mid.arms")).stream()
            .filter(l -> !l.startsWith("#") && l.contains("|")).map(l -> l.split("\\|")[0].trim()).toList();
        assertEquals(List.of("c", "aa", "p1", "p4"), arms);
        long panel = Files.readAllLines(Path.of("kitlab/mini-mid-field.txt")).stream()
            .filter(l -> !l.startsWith("#") && l.contains("|")).count();
        assertEquals(80, panel);
        assertTrue(Files.isRegularFile(Path.of("../data/rumble/parsed/2026-11-02T1440Z_minirumble_rankings.json")));
        assertTrue(Files.readString(Path.of("tools/jaylexi_rows_off.py")).contains("--skip"));
        assertTrue(queue.contains("--skip 120 --peak 1000") && queue.contains("--skip 120 --peak 4000"));
        assertTrue(queue.contains("# Why it should win"));
        int at = queue.indexOf("\nconfirm | ");
        assertTrue(at >= 0);
        String body = queue.substring(at, queue.indexOf("\n\n", at + 1));
        assertTrue(body.contains("--shuffle-jobs") && body.contains("--arms plans/jaylexi-mid.arms"));
        for (String rule : new String[] {"fails 30", "dead 8", "skips 60 over 200", "stall 30m", "aa after 20%",
                "futility p1,p4 below 0 after 20%"}) {
            assertTrue(body.contains("stop: " + rule), rule);
        }
        assertTrue(queue.contains("\ngate | ") && queue.contains("multiarm.py"));
        assertTrue(queue.contains("open_results_pr.sh claude/pc-jaylexi-mid-results"));
        assertTrue(queue.contains("set ALERT = lgriffin"));
    }
}

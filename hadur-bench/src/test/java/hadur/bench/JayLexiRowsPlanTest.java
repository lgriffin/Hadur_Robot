package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** BENCH-170: the JayLexi surf-rows card (plans/pc-jaylexi-rows.queue) is complete before it reaches the PC. */
class JayLexiRowsPlanTest {

    private static final Path QUEUE = Path.of("plans/pc-jaylexi-rows.queue");
    private static final String[] ARMS = {"J3", "S30", "S60", "S120", "L60"};

    @Test
    @Tag("BENCH-170")
    @DisplayName("every arm built and run on both fields in one chain, each bench step with its stop rules, then the read and the PR")
    void cardIsComplete() throws IOException {
        String queue = Files.readString(QUEUE);
        assertTrue(Files.isRegularFile(Path.of("../data/rumble/parsed/2026-11-02T1440Z_minirumble_rankings.json")));
        long top = Files.readAllLines(Path.of("kitlab/mini-top60-field.txt")).stream()
            .filter(l -> !l.startsWith("#") && l.contains("|")).count();
        assertEquals(60, top);
        for (String a : ARMS) {
            assertTrue(queue.contains("hadur117.mini.JayLexi " + a.toLowerCase()), a);
        }
        String prev = "build";
        for (String field : new String[] {"t", "w"}) {
            for (String a : ARMS) {
                String step = field + a;
                int at = queue.indexOf("\n" + step + " | ");
                assertTrue(at >= 0, step);
                int next = queue.indexOf("\n\n", at + 1);
                String body = queue.substring(at, next < 0 ? queue.length() : next);
                assertTrue(body.contains("after: " + prev), step + " after " + prev);
                for (String rule : new String[] {"fails 20", "stall 30m", "skips 40 over 100"}) {
                    assertTrue(body.contains("stop: " + rule), step + " " + rule);
                }
                prev = step;
            }
        }
        assertTrue(queue.contains("\nread | ") && queue.contains("after: " + prev));
        assertTrue(queue.contains("open_results_pr.sh claude/pc-jaylexi-rows-results"));
        assertTrue(queue.contains("set ALERT = lgriffin"));
    }
}

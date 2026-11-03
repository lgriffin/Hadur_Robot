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
 * BENCH-182: the Eveimear codesize diet card (plans/pc-eveimear-diet.queue) is complete before it reaches the PC: every
 * arm built by tools/eveimear_diet.py from the shipped 0.2 source, one shuffled multi-arm step with the A/A halt and the
 * 20% futility stop, the case for it written on the card, the read and the PR.
 */
class EveimearDietPlanTest {

    @Test
    @Tag("BENCH-182")
    @DisplayName("the diet arms, the 112-robot panel, the 20% pilot stop and the case are on the card")
    void cardIsComplete() throws IOException {
        String queue = Files.readString(Path.of("plans/pc-eveimear-diet.queue"));
        List<String> arms = Files.readAllLines(Path.of("plans/eveimear-diet.arms")).stream()
            .filter(l -> !l.startsWith("#") && l.contains("|")).map(l -> l.split("\\|")[0].trim()).toList();
        assertEquals(List.of("c", "aa", "n", "r2", "r27"), arms);
        String tool = Files.readString(Path.of("tools/eveimear_diet.py"));
        for (String row : new String[] {"\"row2\"", "\"row7\""}) {
            assertTrue(tool.contains(row), row);
        }
        for (String rows : new String[] {"--rows neutral &&", "--rows neutral,row2 &&", "--rows neutral,row2,row7 &&"}) {
            assertTrue(queue.contains(rows), rows);
        }
        assertTrue(queue.contains("# Why it should pass"));
        int at = queue.indexOf("\nbench | ");
        assertTrue(at >= 0);
        String body = queue.substring(at, queue.indexOf("\n\n", at + 1));
        assertTrue(body.contains("--shuffle-jobs") && body.contains("--arms plans/eveimear-diet.arms")
            && body.contains("--set kitlab/micro-wide2-field.txt"));
        for (String rule : new String[] {"fails 30", "dead 8", "skips 60 over 200", "stall 30m", "aa after 20%",
                "futility r2,r27 below -0.5 after 20%"}) {
            assertTrue(body.contains("stop: " + rule), rule);
        }
        assertTrue(queue.contains("open_results_pr.sh claude/pc-eveimear-diet-results"));
        assertTrue(queue.contains("set ALERT = lgriffin"));
    }
}

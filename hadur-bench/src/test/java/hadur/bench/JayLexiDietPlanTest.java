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
 * BENCH-181: the JayLexi codesize diet card (plans/pc-jaylexi-diet.queue) is complete before it reaches the PC: every
 * arm built by tools/jaylexi_diet.py from the shipped source, one shuffled multi-arm step with the A/A halt and the
 * 20% futility stop, the case for it written on the card, the read and the PR.
 */
class JayLexiDietPlanTest {

    @Test
    @Tag("BENCH-181")
    @DisplayName("the diet arms, the 112-robot panel, the 20% pilot stop and the case are on the card")
    void cardIsComplete() throws IOException {
        String queue = Files.readString(Path.of("plans/pc-jaylexi-diet.queue"));
        List<String> arms = Files.readAllLines(Path.of("plans/jaylexi-diet.arms")).stream()
            .filter(l -> !l.startsWith("#") && l.contains("|")).map(l -> l.split("\\|")[0].trim()).toList();
        assertEquals(List.of("c", "aa", "n", "r2", "r9", "r10", "r11", "all"), arms);
        String tool = Files.readString(Path.of("tools/jaylexi_diet.py"));
        for (String row : new String[] {"\"row2\"", "\"row9\"", "\"row10\"", "\"row11\""}) {
            assertTrue(tool.contains(row), row);
        }
        for (String rows : new String[] {"--rows neutral &&", "--rows neutral,row2 &&", "--rows neutral,row2,row9 &&",
                "--rows neutral,row2,row10 &&", "--rows neutral,row2,row11 &&", "--rows neutral,row2,row9,row10,row11 &&"}) {
            assertTrue(queue.contains(rows), rows);
        }
        assertTrue(queue.contains("# Why it should pass"));
        int at = queue.indexOf("\nbench | ");
        assertTrue(at >= 0);
        String body = queue.substring(at, queue.indexOf("\n\n", at + 1));
        assertTrue(body.contains("--shuffle-jobs") && body.contains("--arms plans/jaylexi-diet.arms")
            && body.contains("--set kitlab/mini-wide3-field.txt"));
        for (String rule : new String[] {"fails 30", "dead 8", "skips 60 over 200", "stall 30m", "aa after 20%",
                "futility r2,r9,r10,r11,all below -0.5 after 20%"}) {
            assertTrue(body.contains("stop: " + rule), rule);
        }
        assertTrue(queue.contains("open_results_pr.sh claude/pc-jaylexi-diet-results"));
        assertTrue(queue.contains("set ALERT = lgriffin"));
    }
}

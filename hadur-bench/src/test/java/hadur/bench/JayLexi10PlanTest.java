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
 * BENCH-266: the JayLexi 1.0 confirm card (plans/pc-jaylexi-10.queue) is complete before it reaches the PC: c is 0.9's
 * source read from master, one shuffled multi-arm step over the whole MiniRumble field at the live turn
 * time after the live-match check, the A/A halt and 20% futility stop, the case written on the card, the read and the PR.
 */
class JayLexi10PlanTest {

    @Test
    @Tag("BENCH-266")
    @DisplayName("pc-jaylexi-10: c (0.9), aa, n (1.0) and the released 0.6 on 668 robots x 6 fresh seeds, live timing, gate and PR")
    void cardIsComplete() throws IOException {
        String queue = Files.readString(Path.of("plans/pc-jaylexi-10.queue"));
        List<String> arms = Files.readAllLines(Path.of("plans/jaylexi-10.arms")).stream()
            .filter(l -> !l.startsWith("#") && l.contains("|")).map(l -> l.split("\\|")[0].trim()).toList();
        assertEquals(List.of("c", "aa", "n", "r6"), arms);
        assertTrue(queue.contains("! grep -q \"BAND\" ${SRC} && git show 70a0008f8:jaylexi/src/main/java/hadur117/mini/JayLexi.java"
            + " > ${W}/JayLexi.java && grep -q \"surf\\[BAND.charAt(band)\\]\" ${W}/JayLexi.java"),
            "c is 0.9's source with its four distance bands, n has none, both checked by grep");
        assertTrue(queue.contains("(cd ../jaylexi && mvn -q verify)"), "the replay and size tests pass on the PC first");
        assertTrue(queue.contains("# Why it should win"));
        int at = queue.indexOf("\nbench | ");
        assertTrue(at >= 0);
        String body = queue.substring(at, queue.indexOf("\n\n", at + 1));
        assertTrue(body.contains("--shuffle-jobs") && body.contains("--arms plans/jaylexi-10.arms")
            && body.contains("--set kitlab/mini-pw-field.txt") && body.contains("--seeds 6 --seed-base 61000"));
        assertTrue(body.contains("  after: livematch"));
        assertTrue(queue.contains("set C = --skip-build --skip-fetch --rounds 35 --cpu-constant live "));
        for (String rule : new String[] {"fails 30", "dead 8", "skips 60 over 200", "stall 30m", "aa after 20%",
                "futility n below -0.5 after 20%"}) {
            assertTrue(body.contains("stop: " + rule), rule);
        }
        assertTrue(PcLiveMatchPlanTest.violations("pc-jaylexi-10.queue", queue).isEmpty(),
            String.valueOf(PcLiveMatchPlanTest.violations("pc-jaylexi-10.queue", queue)));
        assertTrue(queue.contains("open_results_pr.sh claude/pc-jaylexi-10-results"));
        assertTrue(queue.contains("set ALERT = lgriffin"));
    }
}

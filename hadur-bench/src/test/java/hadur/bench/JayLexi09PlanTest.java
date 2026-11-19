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
 * BENCH-262: the JayLexi 0.9 confirm card (plans/pc-jaylexi-09.queue) is complete before it reaches the PC: c is the
 * shipped source turned back to tick 3, one shuffled multi-arm step over the whole MiniRumble field at the live turn
 * time after the live-match check, the A/A halt and 20% futility stop, the case written on the card, the read and the PR.
 */
class JayLexi09PlanTest {

    @Test
    @Tag("BENCH-262")
    @DisplayName("pc-jaylexi-09: c (tick 3), aa, n (0.9) and the released 0.6 on 668 robots x 6 fresh seeds, live timing, gate and PR")
    void cardIsComplete() throws IOException {
        String queue = Files.readString(Path.of("plans/pc-jaylexi-09.queue"));
        List<String> arms = Files.readAllLines(Path.of("plans/jaylexi-09.arms")).stream()
            .filter(l -> !l.startsWith("#") && l.contains("|")).map(l -> l.split("\\|")[0].trim()).toList();
        assertEquals(List.of("c", "aa", "n", "r6"), arms);
        assertTrue(queue.contains("grep -q \"int tick = 2;\" ${SRC} && sed 's/int tick = 2;/int tick = 3;/' ${SRC} > ${W}/JayLexi.java"
            + " && grep -q \"int tick = 3;\" ${W}/JayLexi.java"), "c is the shipped source at 0.8's tick, checked both ways");
        assertTrue(queue.contains("(cd ../jaylexi && mvn -q verify)"), "the replay and size tests pass on the PC first");
        assertTrue(queue.contains("# Why it should win"));
        int at = queue.indexOf("\nbench | ");
        assertTrue(at >= 0);
        String body = queue.substring(at, queue.indexOf("\n\n", at + 1));
        assertTrue(body.contains("--shuffle-jobs") && body.contains("--arms plans/jaylexi-09.arms")
            && body.contains("--set kitlab/mini-pw-field.txt") && body.contains("--seeds 6 --seed-base 60000"));
        assertTrue(body.contains("  after: livematch"));
        assertTrue(queue.contains("set C = --skip-build --skip-fetch --rounds 35 --cpu-constant live "));
        for (String rule : new String[] {"fails 30", "dead 8", "skips 60 over 200", "stall 30m", "aa after 20%",
                "futility n below -0.5 after 20%"}) {
            assertTrue(body.contains("stop: " + rule), rule);
        }
        assertTrue(PcLiveMatchPlanTest.violations("pc-jaylexi-09.queue", queue).isEmpty(),
            String.valueOf(PcLiveMatchPlanTest.violations("pc-jaylexi-09.queue", queue)));
        assertTrue(queue.contains("open_results_pr.sh claude/pc-jaylexi-09-results"));
        assertTrue(queue.contains("set ALERT = lgriffin"));
    }
}

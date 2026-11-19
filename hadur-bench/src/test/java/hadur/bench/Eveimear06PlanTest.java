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
 * BENCH-263: the Eveimear 0.6 confirm card (plans/pc-eveimear-06.queue) is complete before it reaches the PC: c is the
 * shipped source turned back to a 160 px wall stick, one shuffled multi-arm step over the whole MicroRumble field at the live turn
 * time after the live-match check, the A/A halt and 20% futility stop, the case written on the card, the read and the PR.
 */
class Eveimear06PlanTest {

    @Test
    @Tag("BENCH-263")
    @DisplayName("pc-eveimear-06: c (160 px stick), aa and n (0.6) on 515 robots x 6 fresh seeds, live timing, gate and PR")
    void cardIsComplete() throws IOException {
        String queue = Files.readString(Path.of("plans/pc-eveimear-06.queue"));
        List<String> arms = Files.readAllLines(Path.of("plans/eveimear-06.arms")).stream()
            .filter(l -> !l.startsWith("#") && l.contains("|")).map(l -> l.split("\\|")[0].trim()).toList();
        assertEquals(List.of("c", "aa", "n"), arms);
        assertTrue(queue.contains("test \"$(grep -c '120 \\* Math' ${SRC})\" = 2 && sed 's/120 \\* Math/160 * Math/g' ${SRC} > ${W}/Eveimear.java"
            + " && test \"$(grep -c '160 \\* Math' ${W}/Eveimear.java)\" = 2"), "c is the shipped source at 0.5's stick, checked both ways");
        assertTrue(queue.contains("(cd ../eveimear && mvn -q verify)"), "the replay and size tests pass on the PC first");
        assertTrue(queue.contains("# Why it should win"));
        int at = queue.indexOf("\nbench | ");
        assertTrue(at >= 0);
        String body = queue.substring(at, queue.indexOf("\n\n", at + 1));
        assertTrue(body.contains("--shuffle-jobs") && body.contains("--arms plans/eveimear-06.arms")
            && body.contains("--set kitlab/micro-pw-field.txt") && body.contains("--seeds 6 --seed-base 67000"));
        assertTrue(body.contains("  after: livematch"));
        assertTrue(queue.contains("set C = --skip-build --skip-fetch --rounds 35 --cpu-constant live "));
        for (String rule : new String[] {"fails 30", "dead 8", "skips 60 over 200", "stall 30m", "aa after 20%",
                "futility n below -0.5 after 20%"}) {
            assertTrue(body.contains("stop: " + rule), rule);
        }
        assertTrue(PcLiveMatchPlanTest.violations("pc-eveimear-06.queue", queue).isEmpty(),
            String.valueOf(PcLiveMatchPlanTest.violations("pc-eveimear-06.queue", queue)));
        assertTrue(queue.contains("open_results_pr.sh claude/pc-eveimear-06-results"));
        assertTrue(queue.contains("set ALERT = lgriffin"));
    }
}

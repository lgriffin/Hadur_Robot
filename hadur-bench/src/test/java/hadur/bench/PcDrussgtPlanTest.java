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

/** BENCH-270: the pc-drussgt card (plans/pc-drussgt.queue): three DrussGT 3.1.20 movement ideas, built off master. */
class PcDrussgtPlanTest {

    @Test
    @Tag("BENCH-270")
    @DisplayName("pc-drussgt: c/aa and three experiment arms from a pinned commit, panel-r31 then the mid-field at the live constant, stop rules, a results PR")
    void cardIsComplete() throws IOException {
        String queue = Files.readString(Path.of("plans/pc-drussgt.queue"));
        String version = Files.readString(Path.of("../hadur-robot/pom.xml"))
            .replaceAll("(?s).*<robot.release>(.*?)</robot.release>.*", "$1");
        assertTrue(queue.contains("set V = " + version + "\n"), "the card builds the current release");
        assertTrue(queue.matches("(?s).*\nset DRX = [0-9a-f]{40}\n.*"), "the experiment commit is pinned by full sha");
        String arms = Files.readString(Path.of("plans/pc-drussgt.arms"));
        for (String a : new String[] {"c", "aa", "ml16", "fb2", "df1"}) {
            String v = a.equals("c") ? version : version + a;
            assertTrue(arms.contains("\n" + a + " | hadur117.Hadur " + v + " |"), a);
        }
        assertTrue(queue.contains("git fetch -q origin claude/project-thread-n97hk6 && git cat-file -e ${DRX}^{commit}"), "the experiment commit is fetched and checked");
        assertTrue(queue.contains("bash ./build-ablation-drx.sh --ref ${DRX} $a"), "the experiment arms come from the experiment commit's own ablation script");
        assertTrue(queue.contains("--set panel-r31.txt --seeds 6 --seed-base 85400 --arms plans/pc-drussgt.arms"), "the screen");
        assertTrue(queue.contains("--set panel-midfield.txt --seeds 2 --seed-base 85500 --arms plans/pc-drussgt.arms"), "the mid-field confirm");
        int at = queue.indexOf("\nscreen | ");
        String body = queue.substring(at, queue.indexOf("\n\n", at + 1));
        for (String rule : new String[] {"fails 30", "dead 8", "skips 60 over 200", "stall 30m", "aa after 20%"}) assertTrue(body.contains("stop: " + rule), rule);
        assertTrue(body.contains("  after: livematch"), "the screen waits for the live-match check");
        assertEquals(List.of(), PcLiveMatchPlanTest.violations("pc-drussgt.queue", queue), "BENCH-245 timing rule");
        assertTrue(queue.contains("Why it should win") && queue.contains("set ALERT = lgriffin"));
        assertTrue(queue.contains("open_results_pr.sh claude/pc-drussgt-results") && queue.contains("set P = --parallel 16 --no-truth-log"));
    }
}

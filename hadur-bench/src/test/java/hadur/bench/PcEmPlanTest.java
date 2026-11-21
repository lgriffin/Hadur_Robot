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

/** BENCH-271: the pc-em card (plans/pc-em.queue): MOVE-65's coupled danger mixture, built off master. */
class PcEmPlanTest {

    @Test
    @Tag("BENCH-271")
    @DisplayName("pc-em: c/aa and two experiment arms from a pinned commit, the mid-field then panel-r31 at the live constant, stop rules, a results PR")
    void cardIsComplete() throws IOException {
        String queue = Files.readString(Path.of("plans/pc-em.queue"));
        String version = Files.readString(Path.of("../hadur-robot/pom.xml"))
            .replaceAll("(?s).*<robot.release>(.*?)</robot.release>.*", "$1");
        assertTrue(queue.contains("set V = " + version + "\n"), "the card builds the current release");
        assertTrue(queue.matches("(?s).*\nset EMX = [0-9a-f]{40}\n.*"), "the experiment commit is pinned by full sha");
        String arms = Files.readString(Path.of("plans/pc-em.arms"));
        for (String a : new String[] {"c", "aa", "em", "em2"}) {
            String v = a.equals("c") ? version : version + a;
            assertTrue(arms.contains("\n" + a + " | hadur117.Hadur " + v + " |"), a);
        }
        assertTrue(queue.contains("git fetch -q origin claude/project-thread-n97hk6 && git cat-file -e ${EMX}^{commit}"), "the experiment commit is fetched and checked");
        assertTrue(queue.contains("bash ./build-ablation-emx.sh --ref ${EMX} $a"), "the experiment arms come from the experiment commit's own ablation script");
        assertTrue(queue.contains("--set panel-midfield.txt --seeds 3 --seed-base 85600 --arms plans/pc-em.arms"), "the screen");
        assertTrue(queue.contains("--set panel-r31.txt --seeds 4 --seed-base 85700 --arms plans/pc-em.arms"), "the mid-field confirm");
        int at = queue.indexOf("\nscreen | ");
        String body = queue.substring(at, queue.indexOf("\n\n", at + 1));
        for (String rule : new String[] {"fails 30", "dead 8", "skips 60 over 200", "stall 30m", "aa after 20%"}) assertTrue(body.contains("stop: " + rule), rule);
        assertTrue(body.contains("  after: livematch"), "the screen waits for the live-match check");
        assertTrue(queue.contains("for b in c aa; do python3 tools/arm_pair.py ${W}/arms.tsv --candidate $a --baseline $b --out ${OUT}/$(date +%Y-%m-%d)_pc-em-pairs-mid.md && python3 tools/arm_pair.py ${M}/arms.tsv --candidate $a --baseline $b --out ${OUT}/$(date +%Y-%m-%d)_pc-em-pairs-r31.md"), "each arm is read against c and aa separately, one file per panel");
        assertEquals(List.of(), PcLiveMatchPlanTest.violations("pc-em.queue", queue), "BENCH-245 timing rule");
        assertTrue(queue.contains("Why it should win") && queue.contains("set ALERT = lgriffin"));
        assertTrue(queue.contains("open_results_pr.sh claude/pc-em-results") && queue.contains("set P = --parallel 16 --no-truth-log"));
    }
}

package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** BENCH-248: the pc-ram11 card (plans/pc-ram11.queue): RAM-11 per-opponent lines on the cloud-locked rammers. */
class PcRam11PlanTest {

    private static List<String> names(String file) throws IOException {
        return Files.readAllLines(Path.of(file)).stream()
            .filter(l -> !l.isBlank() && !l.startsWith("#")).map(l -> l.split("\\|")[0].trim()).toList();
    }

    @Test
    @Tag("BENCH-248")
    @DisplayName("pc-ram11: loadable rammers, c/aa/rcl on 12 fresh seeds at the live constant after the live-match check, a 0-margin gate, stop rules, a results PR")
    void cardIsComplete() throws IOException {
        String queue = Files.readString(Path.of("plans/pc-ram11.queue"));
        String version = Files.readString(Path.of("../hadur-robot/pom.xml"))
            .replaceAll("(?s).*<robot.release>(.*?)</robot.release>.*", "$1");
        assertTrue(queue.contains("set V = " + version + "\n"), "the card builds the current release");
        List<String> panel = names("panel-ram11.txt");
        assertTrue(panel.size() >= 3, "the cloud-locked rammers");
        assertEquals(panel.size(), new HashSet<>(panel).size(), "no robot twice");
        assertEquals(panel, names("plans/ram11-add.txt"), "one line per panel robot");
        Set<String> broken = Broken.names(Path.of(Broken.FILE));
        for (String n : panel) assertTrue(!broken.contains(n), n + " loads on 1.11.2");
        String arms = Files.readString(Path.of("plans/pc-ram11.arms"));
        assertTrue(arms.contains("\nc | hadur117.Hadur " + version + " |") && arms.contains("\naa | hadur117.Hadur " + version + "aa |")
            && arms.contains("\nrcl | hadur117.Hadur " + version + "rcl |"));
        assertEquals(3, names("plans/pc-ram11.arms").size(), "c, aa and rcl");
        assertTrue(queue.contains("RAM_CIRC=plans/ram11-add.txt bash ./build-ablation.sh rclist"));
        assertTrue(queue.contains("--set panel-ram11.txt --seeds 12 --seed-base 23400 --arms plans/pc-ram11.arms --out ${W} "), "the lock");
        assertTrue(queue.contains("mode_table.py ${W}/arms.tsv --margin 0 --out-tsv ${OUT}/pc-ram11-lock-pick.tsv"), "the gate");
        int at = queue.indexOf("\nlock | ");
        String body = queue.substring(at, queue.indexOf("\n\n", at + 1));
        for (String rule : new String[] {"fails 30", "dead 8", "skips 60 over 24", "stall 30m"}) {
            assertTrue(body.contains("stop: " + rule), rule);
        }
        assertTrue(body.contains("  after: livematch"), "the lock waits for the live-match check");
        assertTrue(panel.size() * 3 * 12 >= 24, "the skips window is reachable within the lock");
        assertTrue(!body.contains("stop: aa"), "under 10 robots the watcher's A/A stop never reads; aa is read in the gate");
        assertEquals(List.of(), PcLiveMatchPlanTest.violations("pc-ram11.queue", queue), "BENCH-245 timing rule");
        assertTrue(queue.contains("Why it should win") && queue.contains("set ALERT = lgriffin"));
        assertTrue(queue.contains("open_results_pr.sh claude/pc-ram11-results") && queue.contains("set P = --parallel 16 --no-truth-log"));
    }
}

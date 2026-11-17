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

/** BENCH-253: the pc-locks card (plans/pc-locks.queue): every cloud lock not yet on a PC card. */
class PcLocksPlanTest {

    private static List<String> names(String file) throws IOException {
        return Files.readAllLines(Path.of(file)).stream()
            .filter(l -> !l.isBlank() && !l.startsWith("#")).map(l -> l.split("\\|")[0].trim()).toList();
    }

    @Test
    @Tag("BENCH-253")
    @DisplayName("pc-locks: loadable robots, c/aa/rh/dp/sp2/rwl/gl/hl/mt/or/mtx0 on 12 fresh seeds at the live constant after the live-match check, a 0-margin gate, stop rules, a results PR")
    void cardIsComplete() throws IOException {
        String queue = Files.readString(Path.of("plans/pc-locks.queue"));
        String version = Files.readString(Path.of("../hadur-robot/pom.xml"))
            .replaceAll("(?s).*<robot.release>(.*?)</robot.release>.*", "$1");
        assertTrue(queue.contains("set V = " + version + "\n"), "the card builds the current release");
        List<String> panel = names("panel-locks.txt");
        assertTrue(panel.size() >= 1, "the cloud-locked robots");
        assertEquals(panel.size(), new HashSet<>(panel).size(), "no robot twice");
        List<String> picks = Files.readAllLines(Path.of("plans/locks-pick.tsv")).stream().filter(l -> !l.isBlank())
            .map(l -> l.split("\t")[0]).toList();
        assertEquals(panel, picks, "one cloud-locked pick per panel robot");
        Set<String> broken = Broken.names(Path.of(Broken.FILE));
        for (String n : panel) assertTrue(!broken.contains(n), n + " loads on 1.11.2");
        String arms = Files.readString(Path.of("plans/pc-locks.arms"));
        for (String a : new String[] {"c", "aa", "rh", "dp", "sp2", "rwl", "gl", "hl", "mt", "or", "mtx0"}) {
            String v = a.equals("c") ? version : version + a;
            assertTrue(arms.contains("\n" + a + " | hadur117.Hadur " + v + " |"), a);
        }
        assertEquals(11, names("plans/pc-locks.arms").size(), "c, aa, rh, dp, sp2, rwl, gl, hl, mt, or and mtx0");
        assertTrue(queue.contains("lock_prep.py plans/locks-pick.tsv panel-locks.txt plans/pc-locks.arms ${W}-prep && bash ${W}-prep/build.sh"), "each arm built with only its robots");
        assertTrue(queue.contains("--set panel-locks.txt --seeds 12 --seed-base 43600 --arms ${W}-prep/lock.arms --out ${W} "), "the lock");
        assertTrue(queue.contains("lock_prep.py --restrict ${W}/arms.tsv ${W}-prep ${W}/arms-picked.tsv && python3 ../data/tools/mode_table.py ${W}/arms-picked.tsv --margin 0"), "the gate, each robot on its own arm");
        int at = queue.indexOf("\nlock | ");
        String body = queue.substring(at, queue.indexOf("\n\n", at + 1));
        for (String rule : new String[] {"fails 30", "dead 8", "skips 60 over 24", "stall 30m"}) {
            assertTrue(body.contains("stop: " + rule), rule);
        }
        assertTrue(body.contains("  after: livematch"), "the lock waits for the live-match check");
        assertTrue(panel.size() * 8 * 12 >= 24, "the skips window is reachable within the lock");
        assertTrue(!body.contains("stop: aa"), "the watcher reads A/A only once 10 robots are read in both arms, near the end of this lock; aa is read in the gate");
        assertEquals(List.of(), PcLiveMatchPlanTest.violations("pc-locks.queue", queue), "BENCH-245 timing rule");
        assertTrue(queue.contains("Why it should win") && queue.contains("set ALERT = lgriffin"));
        assertTrue(queue.contains("run pc-locks --fresh"), "round 5 left the plan state complete, so round 6 starts fresh");
        assertTrue(!queue.contains("pc-locks5") && !queue.contains("/pc-locks-livematch.md") && queue.contains("${OUT}/*_pc-locks6-*.md"), "round 6 reports never replace round 5's");
        assertTrue(queue.contains("open_results_pr.sh claude/pc-locks6-results") && queue.contains("set P = --parallel 16 --no-truth-log"));
    }
}

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
    @DisplayName("pc-locks: loadable robots, c/aa and two lever arms on 12 fresh seeds, a 1.12.0 lock for robots that load only there, at the live constant after the live-match check, a 0-margin gate, stop rules, a results PR")
    void cardIsComplete() throws IOException {
        String queue = Files.readString(Path.of("plans/pc-locks.queue"));
        String version = Files.readString(Path.of("../hadur-robot/pom.xml"))
            .replaceAll("(?s).*<robot.release>(.*?)</robot.release>.*", "$1");
        assertTrue(queue.contains("set V = " + version + "\n"), "the card builds the current release");
        List<String> panel = names("panel-locks.txt");
        assertEquals(panel.size(), new HashSet<>(panel).size(), "no robot twice");
        List<String> picks = Files.readAllLines(Path.of("plans/locks-pick.tsv")).stream().filter(l -> !l.isBlank())
            .map(l -> l.split("\t")[0]).toList();
        List<String> panel112 = names("panel-locks-112.txt");
        List<String> all = new java.util.ArrayList<>(panel);
        all.addAll(panel112);
        assertEquals(all, picks, "one cloud-locked pick per panel robot, the 1.12.0-only robots last");
        Set<String> broken = Broken.names(Path.of(Broken.FILE));
        for (String n : panel) assertTrue(!broken.contains(n), n + " loads on 1.11.2");
        for (String n : panel112) assertTrue(broken.contains(n), n + " loads only on 1.12.0, else it belongs in the main lock");
        String arms = Files.readString(Path.of("plans/pc-locks.arms"));
        for (String a : new String[] {"c", "aa", "rp", "rfn"}) {
            String v = a.equals("c") ? version : version + a;
            assertTrue(arms.contains("\n" + a + " | hadur117.Hadur " + v + " |"), a);
        }
        assertEquals(4, names("plans/pc-locks.arms").size(), "c, aa and the two lever arms");
        assertTrue(panel.size() >= 1 && panel112.size() >= 1, "the 1.11.2 and the 1.12.0-only robots");
        assertTrue(queue.contains("lock_prep.py plans/locks-pick.tsv panel-locks.txt plans/pc-locks.arms ${W}-prep && bash ${W}-prep/build.sh"), "each arm built with only its robots");
        assertTrue(queue.contains("--set panel-locks.txt --seeds 12 --seed-base 47900 --arms ${W}-prep/lock.arms --out ${W} "), "the lock");
        assertTrue(queue.contains("lock_prep.py --restrict ${W}/arms.tsv ${W}-prep ${W}/arms-picked.tsv && python3 ../data/tools/mode_table.py ${W}/arms-picked.tsv --margin 0"), "the gate, each robot on its own arm");
        int at = queue.indexOf("\nlock | ");
        String body = queue.substring(at, queue.indexOf("\n\n", at + 1));
        for (String rule : new String[] {"fails 30", "dead 8", "skips 60 over 24", "stall 30m"}) assertTrue(body.contains("stop: " + rule), rule);
        assertTrue(body.contains("  after: livematch"), "the lock waits for the live-match check");
        assertTrue(!body.contains("stop: aa"), "aa is read in the gate");
        assertTrue(queue.contains("--engine 1.12.0 --keep-broken --set panel-locks-112.txt --seeds 12 --seed-base 47900 --arms ${W}-prep/lock.arms --out ${W}-112 "), "the 1.12.0 lock");
        int at112 = queue.indexOf("\nlock112 | ");
        String body112 = queue.substring(at112, queue.indexOf("\n\n", at112 + 1));
        assertTrue(body112.contains("  after: gate\n"), "the 1.12.0 lock follows the 1.11.2 gate");
        for (String rule : new String[] {"fails 30", "dead 8", "stall 30m"}) assertTrue(body112.contains("stop: " + rule), "lock112 " + rule);
        assertTrue(!body112.contains("stop: aa"), "the watcher reads A/A only once 10 robots are read in both arms; aa is read in the gate");
        int atg = queue.indexOf("\ngate112 | ");
        String gate112 = queue.substring(atg, queue.indexOf("\n\n", atg + 1));
        assertTrue(gate112.contains("[ \"$n\" -gt 0 ] && [ \"$m\" -eq \"$n\" ]"), "the gate needs every battle's engine.log to name 1.12.0");
        assertTrue(gate112.contains("grep -qv \"robocode.host/1.12.0\""), "the gate fails a battle that ran on another host");
        assertTrue(gate112.contains("lock_prep.py --restrict ${W}-112/arms.tsv ${W}-prep ${W}-112/arms-picked.tsv && python3 ../data/tools/mode_table.py ${W}-112/arms-picked.tsv --margin 0"), "the gate, each robot on its own arm");
        assertTrue(gate112.contains("); rc=$?; mvn -q compile; exit $rc\n"), "the gate compiles back on 1.11.2 even when it fails");
        assertTrue(queue.contains("./fetch-opponents.sh --set panel-locks-112.txt"), "prep fetches the 1.12.0 robots");
        int atp = queue.indexOf("\npr | ");
        assertTrue(queue.substring(atp).contains("  after: gate112"), "the results PR waits for the gate");
        assertEquals(List.of(), PcLiveMatchPlanTest.violations("pc-locks.queue", queue), "BENCH-245 timing rule");
        assertTrue(queue.contains("Why it should win") && queue.contains("set ALERT = lgriffin"));
        assertTrue(queue.contains("run pc-locks --fresh"), "round 10 left the plan state complete, so round 11 starts fresh");
        assertTrue(!queue.contains("pc-locks10-") && !queue.contains("/pc-locks-livematch.md") && queue.contains("${OUT}/*_pc-locks11-*.md"), "round 11 reports never replace round 10's");
        assertTrue(queue.contains("open_results_pr.sh claude/pc-locks11-results") && queue.contains("set P = --parallel 16 --no-truth-log"));
    }
}

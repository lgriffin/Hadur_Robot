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
    @DisplayName("pc-locks: loadable robots, c/aa and a lever arm on 24 fresh seeds at the live constant after the live-match check, a 0-margin gate, stop rules, a results PR")
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
        assertEquals(panel, picks, "one pick per panel robot (the A/A pads on arm aa, which lock_prep leaves out)");
        assertTrue(panel.size() >= 12, "12+ robots, so one bad battle cannot void the A/A check (round 15)");
        Set<String> broken = Broken.names(Path.of(Broken.FILE));
        for (String n : panel) assertTrue(!broken.contains(n), n + " loads on the bench engine (BENCH-267)");
        String arms = Files.readString(Path.of("plans/pc-locks.arms"));
        for (String a : new String[] {"c", "aa", "gl", "rwl", "x0", "ky", "rlnrkn"}) {
            String v = a.equals("c") ? version : version + a;
            assertTrue(arms.contains("\n" + a + " | hadur117.Hadur " + v + " |"), a);
        }
        assertEquals(7, names("plans/pc-locks.arms").size(), "c, aa and the lever arms gl, rwl, x0, ky and rlnrkn");
        assertTrue(queue.contains("test -f opponents/$j || { echo \"missing jar $j\"; exit 1; }"), "no panel robot silently dropped");
        assertTrue(queue.contains("lock_prep.py plans/locks-pick.tsv panel-locks.txt plans/pc-locks.arms ${W}-prep && bash ${W}-prep/build.sh"), "each arm built with only its robots");
        assertTrue(queue.contains("--set panel-locks.txt --seeds 24 --seed-base 110000 --arms ${W}-prep/ctl.arms --out ${W}-ctl "), "the lock: c and aa on the whole panel");
        // Round 27 stopped at lock-sb: a lever arm alone is a one-arm run, which the bench refuses. The stage step writes
        // each c-plus-lever arms file before its step starts (the watcher reads it at start) and copies in only that
        // step's robots' c battles, times kept, so the bench reads them back and the watcher counts them as resumed.
        int ats = queue.indexOf("\nstage | ");
        assertTrue(ats >= 0, "stage step");
        String stage = queue.substring(ats, queue.indexOf("\n\n", ats + 1));
        assertTrue(stage.contains("for a in gl rwl x0 ky rlnrkn; do grep -E \"^(c|$a) [|]\" ${W}-prep/lock.arms > ${W}-prep/$a-c.arms"), "c beside every lever arm");
        assertTrue(stage.contains("grep -v \"^#\" ${W}-prep/$a.panel | cut -d\"|\" -f1 | sed -E \"s/^ +| +$//g; s/[^A-Za-z0-9.]+/_/g\""), "slugs as Opponent.slug() makes them");
        assertTrue(stage.contains("cp -rp ${W}-ctl/battles/$s-*-c ${W}-$a/battles/ || exit 1"), "only the step's own robots' c battles, read back");
        assertTrue(stage.contains("  after: lock"), "stage waits for the c battles");
        assertEquals("infovk.s_schwarzm16.silverbird_1.0", "infovk.s_schwarzm16.silverbird 1.0".replaceAll("[^A-Za-z0-9.]+", "_"));
        String prev = "stage";
        for (String a : new String[] {"gl", "rwl", "x0", "ky", "rlnrkn"}) {
            int at2 = queue.indexOf("\nlock-" + a + " | ");
            assertTrue(at2 >= 0, a);
            String step = queue.substring(at2, queue.indexOf("\n\n", at2 + 1));
            assertTrue(step.contains("--set ${W}-prep/" + a + ".panel --seeds 24 --seed-base 110000 --arms ${W}-prep/" + a + "-c.arms --out ${W}-" + a + " "), "each lever arm beside c, on its own robots only: " + a);
            assertTrue(step.contains("  after: " + prev + "\n"), a + " after " + prev);
            prev = "lock-" + a;
        }
        assertTrue(queue.contains("for d in gl rwl x0 ky rlnrkn; do awk -F\"\\t\" -v a=$d 'NR > 1 && $1 == a' ${W}-$d/arms.tsv; done"), "the gate takes only the lever rows from each lever run");
        assertTrue(queue.contains("--out ${W}-livematch ") && !queue.contains("work/pc-livematch-rel-live"), "the live-match check never reads back an earlier card's battles");
        assertTrue(queue.contains("lock_prep.py --restrict ${W}/arms.tsv ${W}-prep ${W}/arms-picked.tsv && python3 ../data/tools/mode_table.py ${W}/arms-picked.tsv --margin 0"), "the gate, each robot on its own arm");
        int at = queue.indexOf("\nlock | ");
        String body = queue.substring(at, queue.indexOf("\n\n", at + 1));
        for (String rule : new String[] {"fails 30", "dead 8", "skips 60 over 24", "stall 30m"}) assertTrue(body.contains("stop: " + rule), rule);
        assertTrue(body.contains("  after: livematch"), "the lock waits for the live-match check");
        assertTrue(panel.size() * 3 * 24 >= 24, "the skips window is reachable within the lock");
        assertTrue(!body.contains("stop: aa"), "the watcher reads A/A only once 10 robots are read in both arms; aa is read in the gate");
        int atp = queue.indexOf("\npr | ");
        assertTrue(queue.substring(atp).contains("  after: gate"), "the results PR waits for the gate");
        assertTrue(queue.contains("  after: lock-rlnrkn\n\npr |") || queue.substring(queue.indexOf("\ngate | ")).contains("  after: lock-rlnrkn"), "the gate waits for the last lever arm");
        assertEquals(List.of(), PcLiveMatchPlanTest.violations("pc-locks.queue", queue), "BENCH-245 timing rule");
        assertTrue(queue.contains("Why it should win") && queue.contains("set ALERT = lgriffin"));
        assertTrue(queue.contains("run pc-locks --fresh"), "round 30 left the plan state complete, so round 31 starts fresh");
        assertTrue(!queue.contains("pc-locks30-") && !queue.contains("/pc-locks-livematch.md") && queue.contains("${OUT}/*_pc-locks31-*.md"), "round 31 reports never replace round 30's");
        assertTrue(queue.contains("set W = work/pc-locks31"), "round 31 has its own work directory");
        assertTrue(queue.contains("for a in gl rwl x0 ky rlnrkn; do test -f"), "every lever arm built before the lock");
        assertTrue(queue.contains("open_results_pr.sh claude/pc-locks31-results") && queue.contains("set P = --parallel 16 --no-truth-log"));
    }
}

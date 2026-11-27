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

/** BENCH-253: the round 39 overnight pc-locks card (plans/pc-locks39.queue), its own files beside round 38's. */
class PcLocks39PlanTest {

    private static final String[] LEVERS = {"zl", "pb", "rlnrkn", "fgl", "mt", "rf", "rp"};

    private static List<String> names(String file) throws IOException {
        return Files.readAllLines(Path.of(file)).stream()
            .filter(l -> !l.isBlank() && !l.startsWith("#")).map(l -> l.split("\\|")[0].trim()).toList();
    }

    @Test
    @Tag("BENCH-253")
    @DisplayName("pc-locks39: own panel, picks and arms; c/aa and seven lever arms on 48 fresh seeds after the live-match check; a 0-margin gate; a results PR")
    void overnightCardIsComplete() throws IOException {
        String queue = Files.readString(Path.of("plans/pc-locks39.queue"));
        String version = Files.readString(Path.of("../hadur-robot/pom.xml"))
            .replaceAll("(?s).*<robot.release>(.*?)</robot.release>.*", "$1");
        assertTrue(queue.contains("set V = " + version + "\n"), "the card builds the current release");
        List<String> panel = names("panel-locks39.txt");
        assertEquals(panel.size(), new HashSet<>(panel).size(), "no robot twice");
        List<String> picks = Files.readAllLines(Path.of("plans/locks39-pick.tsv")).stream().filter(l -> !l.isBlank())
            .map(l -> l.split("\t")[0]).toList();
        assertEquals(panel, picks, "one pick per panel robot");
        assertTrue(panel.size() >= 12, "12+ robots for the A/A check");
        Set<String> broken = Broken.names(Path.of(Broken.FILE));
        for (String n : panel) assertTrue(!broken.contains(n), n + " loads on the bench engine (BENCH-267)");
        String arms = Files.readString(Path.of("plans/pc-locks39.arms"));
        assertTrue(arms.contains("\nc | hadur117.Hadur " + version + " |"));
        for (String a : LEVERS) assertTrue(arms.contains("\n" + a + " | hadur117.Hadur " + version + a + " |"), a);
        assertTrue(queue.contains("lock_prep.py plans/locks39-pick.tsv panel-locks39.txt plans/pc-locks39.arms ${W}-prep"), "its own files");
        assertTrue(!queue.contains("panel-locks.txt") && !queue.contains("plans/locks-pick.tsv") && !queue.contains("plans/pc-locks.arms"),
            "round 38's files untouched, so a pull while round 38 runs changes nothing it reads");
        assertTrue(queue.contains("--set panel-locks39.txt --seeds 48 --seed-base 119000 --arms ${W}-prep/ctl.arms --out ${W}-ctl "));
        String prev = "stage";
        for (String a : LEVERS) {
            int at = queue.indexOf("\nlock-" + a + " | ");
            assertTrue(at >= 0, a);
            String step = queue.substring(at, queue.indexOf("\n\n", at + 1));
            assertTrue(step.contains("--set ${W}-prep/" + a + ".panel --seeds 48 --seed-base 119000 --arms ${W}-prep/" + a + "-c.arms --out ${W}-" + a + " "), a);
            assertTrue(step.contains("  after: " + prev + "\n"), a + " after " + prev);
            prev = "lock-" + a;
        }
        assertTrue(queue.substring(queue.indexOf("\ngate | ")).contains("  after: lock-rp\n"), "the gate waits for the last lever arm");
        assertTrue(queue.contains("mode_table.py ${W}/arms-picked.tsv --margin 0"), "the gate");
        assertEquals(List.of(), PcLiveMatchPlanTest.violations("pc-locks39.queue", queue), "BENCH-245 timing rule");
        assertTrue(queue.contains("set W = work/pc-locks39") && queue.contains("open_results_pr.sh claude/pc-locks39-results"));
        assertTrue(queue.contains("Why it should win") && queue.contains("set ALERT = lgriffin"));
        assertTrue(Files.readString(Path.of("plans/power-band-lines.txt")).contains("0.77 0.53 0.71 2.65 voidious.Diamond 1.8.22"),
            "Diamond's pb pick carries its fitted bands");
    }
}

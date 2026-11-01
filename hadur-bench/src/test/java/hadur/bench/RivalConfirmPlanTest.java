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

/** BENCH-161: the rival-confirm card (plans/pc-rival-confirm.queue) is complete before it reaches the PC. */
class RivalConfirmPlanTest {

    private static final Path QUEUE = Path.of("plans/pc-rival-confirm.queue");

    private static List<String> names(String file) throws IOException {
        return Files.readAllLines(Path.of(file)).stream()
            .filter(l -> !l.isBlank() && !l.startsWith("#")).map(l -> l.split("[\t|]")[0].trim()).toList();
    }

    private static String step(String queue, String name, String next) {
        int at = queue.indexOf("\n" + name + " | ");
        assertTrue(at >= 0, name);
        int end = next == null ? queue.length() : queue.indexOf("\n\n" + next + " | ");
        return queue.substring(at, end < 0 ? queue.length() : end);
    }

    @Test
    @Tag("BENCH-161")
    @DisplayName("the 18 picks in one build, 8 fresh seeds from 6300, gate, pick, per-robot read and stop rules")
    void cardIsComplete() throws IOException {
        String queue = Files.readString(QUEUE);
        List<String> panel = names("panel-rival-confirm.txt");
        assertEquals(18, panel.size());
        assertEquals(18, new HashSet<>(panel).size(), "no robot twice");
        Set<String> touched = new HashSet<>();
        for (String f : new String[] {"add", "still", "exit0", "drop", "stopgo", "stopgo2"}) {
            touched.addAll(names("plans/rival-confirm-" + f + ".txt"));
        }
        assertEquals(new HashSet<>(panel), touched, "every pick is on the panel and every panel robot has a line");
        assertTrue(names("plans/rival-confirm-still.txt").containsAll(names("plans/rival-confirm-exit0.txt")),
            "exit off rides with the still lines (zlx0)");
        assertTrue(names("plans/rival-confirm-stopgo.txt").containsAll(names("plans/rival-confirm-drop.txt")),
            "only stop-and-go picks leave the shield list");
        for (String n : names("plans/rival-confirm-drop.txt")) {
            assertTrue(names("plans/rival-stopgo-drop.txt").contains(n), n + " is on master's shield list");
        }
        String prep = step(queue, "prep", "confirm");
        assertTrue(prep.contains("bash ./build-ablation.sh slistadd,slistdrop,szlist,sx0list,sgolist,sgo2list ")
            && prep.contains("test -f bisect/hadur117.Hadur_${V}mtmdzlx0wlwm.jar"));
        String confirm = step(queue, "confirm", "gate");
        assertTrue(confirm.contains("--set panel-rival-confirm.txt --seeds 8 --seed-base 6300 --arms plans/rival-confirm.arms"));
        assertTrue(queue.contains("--no-truth-log") && confirm.contains("--shuffle-jobs") && confirm.contains("watch: field=1217"));
        for (String rule : new String[] {"fails 30", "dead 8", "skips 40 over 200", "stall 30m"}) {
            assertTrue(confirm.contains("stop: " + rule), rule);
        }
        String arms = Files.readString(Path.of("plans/rival-confirm.arms"));
        for (String a : new String[] {"c | hadur117.Hadur 3.20 | ", "aa | hadur117.Hadur 3.20aa | ",
            "rp | hadur117.Hadur 3.20mtmdzlx0wlwm | bisect/hadur117.Hadur_3.20mtmdzlx0wlwm.jar"}) {
            assertTrue(arms.contains("\n" + a), a);
        }
        String gate = step(queue, "gate", "pr");
        assertTrue(!gate.contains(";"), "an analysis error must stop the card before the results PR");
        assertTrue(gate.contains("--arm rp --panel panel-rival-confirm.txt --bar 0.05"));
        assertTrue(gate.contains("mode_table.py ${W}/arms.tsv --margin 3") && gate.contains("per_robot.py ${W}/arms.tsv --arms rp"));
        assertTrue(step(queue, "confirm", "gate").contains("after: prep"));
        assertTrue(gate.contains("after: confirm"));
        assertTrue(step(queue, "pr", null).contains("after: gate"));
        assertTrue(queue.contains("open_results_pr.sh claude/pc-rival-confirm-results"));
        assertTrue(queue.contains("set ALERT = lgriffin"));
    }
}

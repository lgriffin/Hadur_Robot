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

/** BENCH-153: the per-opponent shield step card (plans/pc-shield-still2.queue) is complete before it reaches the PC. */
class ShieldStill2PlanTest {

    private static final Path QUEUE = Path.of("plans/pc-shield-still2.queue");

    private static List<String> names(String file) throws IOException {
        return Files.readAllLines(Path.of(file)).stream()
            .filter(l -> !l.isBlank() && !l.startsWith("#")).map(l -> l.split("[\t|]")[0].trim()).toList();
    }

    @Test
    @Tag("BENCH-153")
    @DisplayName("the 40 picks with c/aa/mtzl at 4 fresh seeds, the gate, the pick and the stop rules")
    void cardIsComplete() throws IOException {
        String queue = Files.readString(QUEUE);
        List<String> picks = names("plans/shield-still-picks.txt");
        List<String> panel = names("panel-shield-still-picks.txt");
        List<String> added = names("plans/shield-still-add-picks.txt");
        assertEquals(40, picks.size());
        assertEquals(picks, panel, "the panel is the picks");
        assertEquals(9, added.size());
        assertTrue(picks.containsAll(added), "every added robot is also a still pick");
        assertTrue(queue.contains("--set panel-shield-still-picks.txt --seeds 4 --seed-base 5400 --arms plans/shield-still2.arms"));
        assertTrue(queue.contains("build-ablation.sh aa ") && queue.contains(
            "SHIELD_ADD=plans/shield-still-add-picks.txt SHIELD_STILL=plans/shield-still-picks.txt bash ./build-ablation.sh slistadd,szlist "));
        String arms = Files.readString(Path.of("plans/shield-still2.arms"));
        for (String arm : new String[] {"c | ", "aa | ", "mtzl | "}) assertTrue(arms.contains("\n" + arm), arm);
        assertTrue(queue.contains("--arm mtzl --panel panel-shield-still-picks.txt --bar 0.05"));
        assertTrue(queue.contains("mode_table.py ${W}/arms.tsv --margin 5"));
        String[] steps = {"prep", "confirm", "gate", "pr"};
        for (int i = 1; i < steps.length; i++) {
            int at = queue.indexOf("\n" + steps[i] + " | ");
            assertTrue(at >= 0, steps[i]);
            int next = queue.indexOf("\n\n", at + 1);
            assertTrue(queue.substring(at, next < 0 ? queue.length() : next).contains("after: " + steps[i - 1]),
                steps[i] + " after " + steps[i - 1]);
        }
        String gate = queue.substring(queue.indexOf("\ngate | "), queue.indexOf("\n\npr | "));
        assertTrue(!gate.contains(";"), "an analysis error must stop the card before the results PR");
        assertTrue(queue.contains("open_results_pr.sh claude/pc-shield-still2-results"));
        assertTrue(queue.contains("set ALERT = lgriffin") && queue.contains("set P = --parallel 12 --no-truth-log"));
        String confirm = queue.substring(queue.indexOf("\nconfirm | "), queue.indexOf("\n\ngate | "));
        assertTrue(confirm.contains("--shuffle-jobs") && confirm.contains("watch: field=1217"));
        for (String rule : new String[] {"fails 30", "dead 8", "skips 40 over 200", "stall 30m"}) {
            assertTrue(confirm.contains("stop: " + rule), rule);
        }
    }
}

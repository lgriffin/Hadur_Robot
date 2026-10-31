package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** BENCH-152: the shield step card (plans/pc-shield-still.queue) is complete before it reaches the PC. */
class ShieldStillPlanTest {

    private static final Path QUEUE = Path.of("plans/pc-shield-still.queue");

    private static long robots(String set) throws IOException {
        return Files.readAllLines(Path.of(set)).stream().filter(l -> !l.startsWith("#") && l.contains("|")).count();
    }

    @Test
    @Tag("BENCH-152")
    @DisplayName("the 273 listed robots with c/aa/sz, BeepBoop's 64 with c/aa/szmt, fresh seeds, both gates and the pick")
    void cardIsComplete() throws IOException {
        String queue = Files.readString(QUEUE);
        assertEquals(273, robots("panel-shield-listed-320.txt"), "the 3.20 shield list");
        assertEquals(64, robots("panel-beep-shield-only.txt"), "BeepBoop's shield list less ours");
        long added = Files.readAllLines(Path.of("plans/beep-shield-add.txt")).stream()
            .filter(l -> !l.isBlank() && !l.startsWith("#")).count();
        assertEquals(64, added);
        assertTrue(queue.contains("--set panel-shield-listed-320.txt --seeds 2 --seed-base 5200 --arms plans/shield-still.arms"));
        assertTrue(queue.contains("--set panel-beep-shield-only.txt --seeds 3 --seed-base 5300 --arms plans/shield-still-add.arms"));
        assertTrue(queue.contains("build-ablation.sh aa ") && queue.contains("build-ablation.sh sstill ")
            && queue.contains("SHIELD_ADD=plans/beep-shield-add.txt bash ./build-ablation.sh sstill,slistadd "));
        String arms = Files.readString(Path.of("plans/shield-still.arms"));
        for (String arm : new String[] {"c | ", "aa | ", "sz | "}) assertTrue(arms.contains("\n" + arm), arm);
        String add = Files.readString(Path.of("plans/shield-still-add.arms"));
        for (String arm : new String[] {"c | ", "aa | ", "szmt | "}) assertTrue(add.contains("\n" + arm), arm);
        assertTrue(queue.contains("--arm sz --panel panel-shield-listed-320.txt --bar 0.05"));
        assertTrue(queue.contains("--arm szmt --panel panel-beep-shield-only.txt --bar 0.05"));
        assertTrue(queue.contains("mode_table.py ${WA}/arms.tsv --margin 5"));
        String[] steps = {"prep", "still", "add", "gate", "pr"};
        for (int i = 1; i < steps.length; i++) {
            int at = queue.indexOf("\n" + steps[i] + " | ");
            assertTrue(at >= 0, steps[i]);
            int next = queue.indexOf("\n\n", at + 1);
            assertTrue(queue.substring(at, next < 0 ? queue.length() : next).contains("after: " + steps[i - 1]),
                steps[i] + " after " + steps[i - 1]);
        }
        String gate = queue.substring(queue.indexOf("\ngate | "), queue.indexOf("\n\npr | "));
        assertTrue(!gate.contains(";"), "an analysis error must stop the card before the results PR");
        assertTrue(queue.contains("open_results_pr.sh claude/pc-shield-still-results"));
        // BENCH-129, BENCH-130: watched, with stop rules fixed before the run.
        assertTrue(queue.contains("set ALERT = lgriffin") && queue.contains("set P = --parallel 12 --no-truth-log"));
        for (String step : new String[] {"still", "add"}) {
            int at = queue.indexOf("\n" + step + " | ");
            String body = queue.substring(at, queue.indexOf("\n\n", at + 1));
            assertTrue(body.contains("--shuffle-jobs") && body.contains("watch: field=1217"), step);
            for (String rule : new String[] {"fails 30", "dead 8", "skips 40 over 200", "stall 30m", "aa after 20%"}) {
                assertTrue(body.contains("stop: " + rule), step + " " + rule);
            }
        }
        assertTrue(queue.contains("stop: futility sz below 0.05 after 30%"));
    }
}

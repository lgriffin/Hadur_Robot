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

/** BENCH-164: the per-opponent flattener card (plans/pc-flat-on.queue) is complete before it reaches the PC. */
class FlatOnPlanTest {

    private static final Path QUEUE = Path.of("plans/pc-flat-on.queue");

    private static List<String> names(String file) throws IOException {
        return Files.readAllLines(Path.of(file)).stream()
            .filter(l -> !l.isBlank() && !l.startsWith("#")).map(l -> l.split("[\t|]")[0].trim()).toList();
    }

    private static String step(String queue, String name, String next) {
        int at = queue.indexOf("\n" + name + " | ");
        assertTrue(at >= 0, name);
        int end = next == null ? queue.length() : queue.indexOf("\n\n" + next + " | ");
        return queue.substring(at, end);
    }

    @Test
    @Tag("BENCH-164")
    @DisplayName("screen of the 232 learners, pick, confirm of the picks at 4 fresh seeds, the gate and the stop rules")
    void cardIsComplete() throws IOException {
        String queue = Files.readString(QUEUE);
        List<String> panel = names("panel-learners-flat.txt");
        assertEquals(232, panel.size());
        assertEquals(panel.size(), panel.stream().distinct().count(), "no robot twice");
        assertTrue(queue.contains("build-ablation.sh aa ") && queue.contains("build-ablation.sh flaton "));
        assertTrue(queue.contains("--set panel-learners-flat.txt --seeds 2 --seed-base 6800 --arms plans/flat-on.arms"));
        assertTrue(queue.contains("mode_table.py ${W}/arms.tsv --margin 5 --out-tsv ${OUT}/flat-on-pick.tsv"));
        assertTrue(queue.contains("tools/pick_panel.py ${OUT}/flat-on-pick.tsv panel-learners-flat.txt work/panel-flat-on-picks.txt"
            + " && FLAT_ON=${OUT}/flat-on-pick.tsv bash ./build-ablation.sh fllist"));
        assertTrue(queue.contains("--set work/panel-flat-on-picks.txt --seeds 4 --seed-base 6900 --arms plans/flat-on2.arms"));
        assertTrue(queue.contains("--arm fq --panel work/panel-flat-on-picks.txt --bar 0.03"));
        String screenArms = Files.readString(Path.of("plans/flat-on.arms"));
        for (String arm : new String[] {"\nc | ", "\naa | ", "\nfo | "}) assertTrue(screenArms.contains(arm), arm);
        String confirmArms = Files.readString(Path.of("plans/flat-on2.arms"));
        for (String arm : new String[] {"\nc | ", "\naa | ", "\nfq | "}) assertTrue(confirmArms.contains(arm), arm);
        String[] steps = {"prep", "screen", "pick", "prep2", "confirm", "gate", "pr"};
        for (int i = 1; i < steps.length; i++) {
            assertTrue(step(queue, steps[i], i + 1 < steps.length ? steps[i + 1] : null).contains("after: " + steps[i - 1]),
                steps[i] + " after " + steps[i - 1]);
        }
        for (String s : new String[] {"pick", "prep2", "gate"}) {
            String body = step(queue, s, s.equals("pick") ? "prep2" : s.equals("prep2") ? "confirm" : "pr");
            assertTrue(!body.contains(";"), s + ": an error must stop the card before the next step");
        }
        for (String s : new String[] {"screen", "confirm"}) {
            String body = step(queue, s, s.equals("screen") ? "pick" : "gate");
            assertTrue(body.contains("--shuffle-jobs") && body.contains("watch: field=1217"), s);
            for (String rule : new String[] {"fails 30", "dead 8", "skips 40 over 200", "stall 30m"}) {
                assertTrue(body.contains("stop: " + rule), s + " " + rule);
            }
        }
        assertTrue(step(queue, "screen", "pick").contains("stop: aa after 20%"));
        assertTrue(queue.contains("open_results_pr.sh claude/pc-flat-on-results"));
        assertTrue(queue.contains("set ALERT = lgriffin") && queue.contains("set P = --parallel 12 --no-truth-log"));
    }
}

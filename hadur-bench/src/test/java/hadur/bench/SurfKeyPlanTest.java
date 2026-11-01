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

/** BENCH-160: the per-opponent surf-key card (plans/pc-surf-key.queue) is complete before it reaches the PC. */
class SurfKeyPlanTest {

    private static final Path QUEUE = Path.of("plans/pc-surf-key.queue");

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
    @Tag("BENCH-160")
    @DisplayName("record with the truth log, fit both key sets, build them, confirm on fresh seeds, gate, pick, stop rules")
    void cardIsComplete() throws IOException {
        String queue = Files.readString(QUEUE);
        List<String> panel = names("panel-surf-key-200.txt");
        assertEquals(198, panel.size());
        assertEquals(names("panel-surf-key.txt"), panel.subList(0, 58), "the cloud panel is the first 58");
        String prep = step(queue, "prep", "record");
        assertTrue(prep.contains("bash ./build-ablation.sh aa ") && prep.contains("bash ./build-ablation.sh oracle,skrec "));
        String record = step(queue, "record", "fit");
        assertTrue(record.contains("--set panel-surf-key-200.txt --seeds 4 --seed-base 5800 --robot-jar ${REC}"));
        assertTrue(!record.contains("--no-truth-log"), "the fit needs the truth log");
        String fit = step(queue, "fit", "confirm");
        assertTrue(fit.contains("surf_key_fit.py join ${W}/rec") && fit.contains("--no-width"));
        assertTrue(fit.contains("SURF_KEY=${W}/keys.txt bash ./build-ablation.sh sklist ")
            && fit.contains("SURF_KEY=${W}/keys-nowidth.txt bash ./build-ablation.sh sklist,bb "));
        String confirm = step(queue, "confirm", "gate");
        assertTrue(confirm.contains("--no-truth-log --set panel-surf-key-200.txt --seeds 3 --seed-base 5900 --arms plans/surf-key.arms"));
        assertTrue(confirm.contains("--shuffle-jobs") && confirm.contains("watch: field=1217"));
        for (String s : new String[] {record, confirm}) {
            for (String rule : new String[] {"fails 30", "skips 40 over 200", "stall 30m"}) assertTrue(s.contains("stop: " + rule), rule);
        }
        assertTrue(confirm.contains("stop: dead 8"));
        String arms = Files.readString(Path.of("plans/surf-key.arms"));
        for (String a : new String[] {"c | hadur117.Hadur 3.20 | ", "aa | hadur117.Hadur 3.20aa | ",
            "kl | hadur117.Hadur 3.20kl | ", "klbb | hadur117.Hadur 3.20klbb | "}) {
            assertTrue(arms.contains("\n" + a), a);
        }
        String gate = step(queue, "gate", "pr");
        assertTrue(!gate.contains(";"), "an analysis error must stop the card before the results PR");
        assertTrue(gate.contains("--arm kl --panel panel-surf-key-200.txt --bar 0.05")
            && gate.contains("--arm klbb --panel panel-surf-key-200.txt --bar 0.05"));
        assertTrue(gate.contains("mode_table.py ${W}/confirm/arms.tsv --margin 3"));
        String[] order = {"prep", "record", "fit", "confirm", "gate", "pr"};
        for (int i = 1; i < order.length; i++) {
            assertTrue(step(queue, order[i], i + 1 < order.length ? order[i + 1] : null).contains("after: " + order[i - 1]),
                order[i] + " after " + order[i - 1]);
        }
        assertTrue(queue.contains("open_results_pr.sh claude/pc-surf-key-results"));
        assertTrue(queue.contains("set ALERT = lgriffin"));
    }
}

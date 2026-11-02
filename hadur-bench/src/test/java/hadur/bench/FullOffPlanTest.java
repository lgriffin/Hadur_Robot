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

/** BENCH-173: the per-opponent full-power card (plans/pc-full-off.queue) is complete before it reaches the PC. */
class FullOffPlanTest {

    private static List<String> names(String file, String split) throws IOException {
        return Files.readAllLines(Path.of(file)).stream()
            .filter(l -> !l.isBlank() && !l.startsWith("#")).map(l -> l.split(split)[0].trim()).toList();
    }

    private static String step(String queue, String name, String next) {
        int at = queue.indexOf("\n" + name + " | ");
        assertTrue(at >= 0, name);
        int end = next == null ? queue.length() : queue.indexOf("\n\n" + next + " | ");
        return queue.substring(at, end);
    }

    @Test
    @Tag("BENCH-173")
    @DisplayName("screen of the 167 mid-field learners, pick, confirm of the picks at 4 fresh seeds, the gate and the stop rules")
    void cardIsComplete() throws IOException {
        String queue = Files.readString(Path.of("plans/pc-full-off.queue"));
        String version = Files.readString(Path.of("../hadur-robot/pom.xml"))
            .replaceAll("(?s).*<robot.release>(.*?)</robot.release>.*", "$1");
        assertTrue(queue.contains("set V = " + version + "\n"), "the card builds the current release");
        List<String> panel = names("panel-midfield.txt", "\\|");
        assertEquals(167, panel.size());
        assertEquals(panel.size(), panel.stream().distinct().count(), "no robot twice");
        assertEquals(panel, names("plans/full-off-all.list", "\t"), "the screen arm names exactly the panel");
        for (String n : panel) assertTrue(!Broken.names(Path.of(Broken.FILE)).contains(n), n + " loads on 1.11.2");
        assertTrue(queue.contains("build-ablation.sh aa ")
            && queue.contains("FULL_OFF=plans/full-off-all.list bash ./build-ablation.sh fplist"));
        assertTrue(queue.contains("--set panel-midfield.txt --seeds 3 --seed-base 8000 --arms plans/full-off.arms"));
        assertTrue(queue.contains("mode_table.py ${W}/arms.tsv --margin 5 --out-tsv ${OUT}/full-off-pick.tsv"));
        assertTrue(queue.contains("tools/pick_panel.py ${OUT}/full-off-pick.tsv panel-midfield.txt work/panel-full-off-picks.txt"
            + " && FULL_OFF=${OUT}/full-off-pick.tsv bash ./build-ablation.sh fplist"));
        assertTrue(queue.contains("--set work/panel-full-off-picks.txt --seeds 4 --seed-base 8100 --arms plans/full-off2.arms"));
        assertTrue(queue.contains("--arm fp --panel work/panel-full-off-picks.txt --bar 0.03"));
        for (String file : new String[] {"plans/full-off.arms", "plans/full-off2.arms"}) {
            String arms = Files.readString(Path.of(file));
            for (String arm : new String[] {"c | hadur117.Hadur " + version + " |", "aa | hadur117.Hadur " + version + "aa |",
                                            "fp | hadur117.Hadur " + version + "fp |"}) {
                assertTrue(arms.contains("\n" + arm), file + " " + arm);
            }
        }
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
            for (String rule : new String[] {"fails 30", "dead 8", "skips 60 over 200", "stall 30m"}) {
                assertTrue(body.contains("stop: " + rule), s + " " + rule);
            }
        }
        assertTrue(queue.contains("open_results_pr.sh claude/pc-full-off-results"));
        assertTrue(queue.contains("set ALERT = lgriffin") && queue.contains("set P = --parallel 12 --no-truth-log"));
    }
}

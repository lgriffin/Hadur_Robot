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

/** BENCH-223: the still-shield field card (plans/pc-still-field.queue) is complete before it reaches the PC. */
class StillFieldPlanTest {

    private static List<String> names(String file) throws IOException {
        return Files.readAllLines(Path.of(file)).stream()
            .filter(l -> !l.isBlank() && !l.startsWith("#")).map(l -> l.split("\\|")[0].trim()).toList();
    }

    private static String step(String queue, String name, String next) {
        int at = queue.indexOf("\n" + name + " | ");
        assertTrue(at >= 0, name);
        int end = next == null ? queue.length() : queue.indexOf("\n\n" + next + " | ");
        return queue.substring(at, end);
    }

    @Test
    @Tag("BENCH-223")
    @DisplayName("six robots, three arms, 12 fresh seeds, the 3-point pick, the gate and the stop rules")
    void cardIsComplete() throws IOException {
        String queue = Files.readString(Path.of("plans/pc-still-field.queue"));
        String version = Files.readString(Path.of("../hadur-robot/pom.xml"))
            .replaceAll("(?s).*<robot.release>(.*?)</robot.release>.*", "$1");
        assertTrue(queue.contains("set V = " + version + "\n"), "the card builds the current release");
        List<String> panel = names("panel-still-field.txt");
        assertEquals(List.of("cjm.Che 1.2", "djc.Aardvark 0.3.6", "florent.XSeries.X2 0.17",
            "rz.SmallDevil 1.502", "slugzilla.Parallax 0.1", "stelo.MoojukNano 1.2"), panel);
        assertEquals(panel, names("plans/still-field-add.txt"), "all join the list");
        assertEquals(panel, names("plans/still-field-still.txt"), "all get still lines");
        for (String n : panel) assertTrue(!Broken.names(Path.of(Broken.FILE)).contains(n), n + " loads on 1.11.2");
        assertTrue(queue.contains("build-ablation.sh aa ") && queue.contains("SHIELD_ADD=plans/still-field-add.txt"
            + " SHIELD_STILL=plans/still-field-still.txt bash ./build-ablation.sh slistadd,szlist"));
        assertTrue(queue.contains("--set panel-still-field.txt --seeds 12 --seed-base 12200 --arms plans/pc-still-field.arms"));
        assertTrue(queue.contains("--arm mz --panel panel-still-field.txt --bar 0.005"), "gate mz");
        assertTrue(queue.contains("mode_table.py ${W}/arms.tsv --margin 3 --out-tsv ${OUT}/still-field-pc-pick.tsv"));
        assertTrue(queue.contains("per_robot.py ${W}/arms.tsv --arms mz "));
        // A panel robot already on master's list would shield in the control arm too.
        String listData = Files.readString(Path.of("../hadur-robot/src/main/java/hadur117/ShieldListData.java"));
        // Only the robots this card shipped may already be on master's list.
        List<String> shipped = names("plans/still-field-shipped.txt");
        for (String n : panel) assertTrue(shipped.contains(n) || !listData.contains("\"" + n + "\","), n + " is not on master's shield list yet");
        assertTrue(!panel.contains("axeBots.Musashi 2.18"), "Musashi failed this arm on the PC (BENCH-209)");
        String arms = Files.readString(Path.of("plans/pc-still-field.arms"));
        for (String arm : new String[] {"c | hadur117.Hadur " + version + " |", "aa | hadur117.Hadur " + version + "aa |",
                                        "mz | hadur117.Hadur " + version + "mtzl |"}) {
            assertTrue(arms.contains("\n" + arm), arm);
        }
        String[] steps = {"prep", "confirm", "gate", "pr"};
        for (int i = 1; i < steps.length; i++) {
            assertTrue(step(queue, steps[i], i + 1 < steps.length ? steps[i + 1] : null).contains("after: " + steps[i - 1]),
                steps[i] + " after " + steps[i - 1]);
        }
        assertTrue(!step(queue, "gate", "pr").contains(";"), "gate: an error must stop the card before the PR");
        String confirm = step(queue, "confirm", "gate");
        assertTrue(confirm.contains("--shuffle-jobs") && confirm.contains("watch: field=1217"));
        for (String rule : new String[] {"fails 30", "dead 8", "skips 60 over 200", "stall 30m"}) {
            assertTrue(confirm.contains("stop: " + rule), rule);
        }
        assertTrue(queue.contains("open_results_pr.sh claude/pc-still-field-results"));
        assertTrue(queue.contains("set ALERT = lgriffin") && queue.contains("set P = --parallel 12 --no-truth-log"));
    }
}

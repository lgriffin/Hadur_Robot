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

/** BENCH-172: the per-opponent mimic card (plans/pc-mimic-on.queue) is complete before it reaches the PC. */
class MimicOnPlanTest {

    private static List<String> names(String file, String split) throws IOException {
        return Files.readAllLines(Path.of(file)).stream()
            .filter(l -> !l.isBlank() && !l.startsWith("#")).map(l -> l.split(split)[0].trim()).toList();
    }

    @Test
    @Tag("BENCH-172")
    @DisplayName("the 28 top learners with c/aa/mq at 8 fresh seeds, mq naming the panel, the gate, the pick and the stop rules")
    void cardIsComplete() throws IOException {
        String queue = Files.readString(Path.of("plans/pc-mimic-on.queue"));
        String version = Files.readString(Path.of("../hadur-robot/pom.xml"))
            .replaceAll("(?s).*<robot.release>(.*?)</robot.release>.*", "$1");
        assertTrue(queue.contains("set V = " + version + "\n"), "the card builds the current release");
        List<String> panel = names("panel-mimic-on.txt", "\\|");
        assertEquals(28, panel.size());
        assertEquals(panel.size(), panel.stream().distinct().count(), "no robot twice");
        assertEquals(panel, names("plans/mimic-on.list", "\t"), "mq names exactly the panel");
        for (String n : panel) assertTrue(!Broken.names(Path.of(Broken.FILE)).contains(n), n + " loads on 1.11.2");
        assertTrue(queue.contains("build-ablation.sh aa ") && queue.contains("MIMIC_ON=plans/mimic-on.list bash ./build-ablation.sh mmlist"));
        assertTrue(queue.contains("--set panel-mimic-on.txt --seeds 8 --seed-base 7800 --arms plans/mimic-on.arms"));
        String arms = Files.readString(Path.of("plans/mimic-on.arms"));
        for (String arm : new String[] {"c | hadur117.Hadur " + version + " |", "aa | hadur117.Hadur " + version + "aa |",
                                        "mq | hadur117.Hadur " + version + "mq |"}) {
            assertTrue(arms.contains("\n" + arm), arm);
        }
        assertTrue(queue.contains("--arm mq --panel panel-mimic-on.txt --bar 0.02"));
        assertTrue(queue.contains("mode_table.py ${W}/arms.tsv --margin 3"));
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
        String confirm = queue.substring(queue.indexOf("\nconfirm | "), queue.indexOf("\n\ngate | "));
        assertTrue(confirm.contains("--shuffle-jobs") && confirm.contains("watch: field=1217"));
        for (String rule : new String[] {"fails 30", "dead 8", "skips 60 over 200", "stall 30m"}) {
            assertTrue(confirm.contains("stop: " + rule), rule);
        }
        assertTrue(queue.contains("open_results_pr.sh claude/pc-mimic-on-results"));
        assertTrue(queue.contains("set ALERT = lgriffin") && queue.contains("set P = --parallel 12 --no-truth-log"));
    }
}

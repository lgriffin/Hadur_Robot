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

/** BENCH-236: the power-cap card (plans/pc-power-cap.queue) is complete before it reaches the PC. */
class PowerCapPlanTest {

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
    @Tag("BENCH-236")
    @DisplayName("five low-hit R1 robots, three arms, 12 fresh seeds, the 3-point pick and the stop rules")
    void cardIsComplete() throws IOException {
        String queue = Files.readString(Path.of("plans/pc-power-cap.queue"));
        String version = Files.readString(Path.of("../hadur-robot/pom.xml"))
            .replaceAll("(?s).*<robot.release>(.*?)</robot.release>.*", "$1");
        assertTrue(queue.contains("set V = " + version + "\n"), "the card builds the current release");
        List<String> panel = names("panel-power-cap.txt");
        assertEquals(List.of("rsalesc.roborio.Roborio 1.2.4", "aw.Gilgalad 1.99.5c", "cb.fire.Firestarter 2.0f",
            "catcat20.Rabbit 0.001", "cb.Domogled 1.2"), panel);
        assertEquals(panel, names("plans/power-cap-add.txt"), "each panel robot gets a power-cap line");
        for (String n : panel) assertTrue(!Broken.names(Path.of(Broken.FILE)).contains(n), n + " loads on 1.11.2");
        // A robot already capped on master would be capped in the control arm too.
        String table = Files.readString(Path.of("../hadur-robot/src/main/java/hadur117/ShieldTableData.java"));
        String caps = table.substring(table.indexOf("static String[] powerCaps()"));
        caps = caps.substring(0, caps.indexOf("}"));
        for (String n : panel) assertTrue(!caps.contains("\"" + n + "\""), n + " is not capped on master yet");
        assertTrue(queue.contains("build-ablation.sh aa ")
            && queue.contains("POWER_CAP=plans/power-cap-add.txt bash ./build-ablation.sh pcaplist &&"));
        assertTrue(queue.contains("--set panel-power-cap.txt --seeds 12 --seed-base 16000 --arms plans/pc-power-cap.arms"));
        assertTrue(queue.contains("mode_table.py ${W}/arms.tsv --margin 3 --out-tsv ${OUT}/power-cap-pc-pick.tsv"));
        assertTrue(queue.contains("per_robot.py ${W}/arms.tsv --arms pk "));
        String arms = Files.readString(Path.of("plans/pc-power-cap.arms"));
        for (String arm : new String[] {"c | hadur117.Hadur " + version + " |", "aa | hadur117.Hadur " + version + "aa |",
                                        "pk | hadur117.Hadur " + version + "pk |"}) {
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
        assertTrue(queue.contains("open_results_pr.sh claude/pc-power-cap-results"));
        assertTrue(queue.contains("set ALERT = lgriffin") && queue.contains("set P = --parallel 12 --no-truth-log"));
    }
}

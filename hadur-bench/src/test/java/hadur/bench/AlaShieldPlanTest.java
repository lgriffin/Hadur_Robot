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

/** BENCH-220: the Ala shield pilot card (plans/pc-ala-shield.queue) is complete before it reaches the PC. */
class AlaShieldPlanTest {

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
    @Tag("BENCH-220")
    @DisplayName("one robot, four arms, 12 fresh seeds, the 3-point pick, the gate and the stop rules")
    void cardIsComplete() throws IOException {
        String queue = Files.readString(Path.of("plans/pc-ala-shield.queue"));
        String version = Files.readString(Path.of("../hadur-robot/pom.xml"))
            .replaceAll("(?s).*<robot.release>(.*?)</robot.release>.*", "$1");
        assertTrue(queue.contains("set V = " + version + "\n"), "the card builds the current release");
        List<String> panel = names("panel-ala-shield.txt");
        assertEquals(List.of("lechu.Ala 0.0.4"), panel);
        assertEquals(panel, names("plans/ala-shield-add.txt"), "Ala joins the list");
        assertEquals(panel, names("plans/ala-shield-still.txt"), "Ala gets the still line on mz");
        for (String n : panel) assertTrue(!Broken.names(Path.of(Broken.FILE)).contains(n), n + " loads on 1.11.2");
        assertTrue(queue.contains("build-ablation.sh aa ")
            && queue.contains("SHIELD_ADD=plans/ala-shield-add.txt bash ./build-ablation.sh slistadd ")
            && queue.contains("SHIELD_ADD=plans/ala-shield-add.txt SHIELD_STILL=plans/ala-shield-still.txt"
                + " bash ./build-ablation.sh slistadd,szlist"));
        assertTrue(queue.contains("--set panel-ala-shield.txt --seeds 12 --seed-base 11700 --arms plans/pc-ala-shield.arms"));
        for (String arm : new String[] {"mt", "mz"}) {
            assertTrue(queue.contains("--arm " + arm + " --panel panel-ala-shield.txt --bar 0.002"), "gate " + arm);
        }
        assertTrue(queue.contains("mode_table.py ${W}/arms.tsv --margin 3 --out-tsv ${OUT}/ala-shield-pc-pick.tsv"));
        assertTrue(queue.contains("per_robot.py ${W}/arms.tsv --arms mt mz "));
        String arms = Files.readString(Path.of("plans/pc-ala-shield.arms"));
        for (String arm : new String[] {"c | hadur117.Hadur " + version + " |", "aa | hadur117.Hadur " + version + "aa |",
                                        "mt | hadur117.Hadur " + version + "mt |", "mz | hadur117.Hadur " + version + "mtzl |"}) {
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
        assertTrue(queue.contains("open_results_pr.sh claude/pc-ala-shield-results"));
        assertTrue(queue.contains("set ALERT = lgriffin") && queue.contains("set P = --parallel 12 --no-truth-log"));
    }
}

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

/** BENCH-224: the mirror-off card (plans/pc-mirror-off.queue) is complete before it reaches the PC. */
class MirrorOffPlanTest {

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
    @Tag("BENCH-224")
    @DisplayName("three robots, three arms, 12 fresh seeds, the 3-point pick, the gate and the stop rules")
    void cardIsComplete() throws IOException {
        String queue = Files.readString(Path.of("plans/pc-mirror-off.queue"));
        String version = Files.readString(Path.of("../hadur-robot/pom.xml"))
            .replaceAll("(?s).*<robot.release>(.*?)</robot.release>.*", "$1");
        assertTrue(queue.contains("set V = " + version + "\n"), "the card builds the current release");
        List<String> panel = names("panel-mirror-off.txt");
        assertEquals(List.of("janm.Jammy 1.0", "suh.nano.MirrorL 1.00", "suh.nano.MirrorH 1.01"), panel);
        assertEquals(java.util.Set.copyOf(panel), java.util.Set.copyOf(names("plans/mirror-off-add.txt")), "each gets a mirror-off line");
        for (String n : panel) assertTrue(!Broken.names(Path.of(Broken.FILE)).contains(n), n + " loads on 1.11.2");
        assertTrue(queue.contains("build-ablation.sh aa ") && queue.contains("MIRROR_OFF=plans/mirror-off-add.txt bash ./build-ablation.sh mirofflist"));
        assertTrue(queue.contains("--set panel-mirror-off.txt --seeds 12 --seed-base 12700 --arms plans/pc-mirror-off.arms"));
        assertTrue(queue.contains("--arm mo --panel panel-mirror-off.txt --bar 0.005"), "gate mo");
        assertTrue(queue.contains("mode_table.py ${W}/arms.tsv --margin 3 --out-tsv ${OUT}/mirror-off-pc-pick.tsv"));
        assertTrue(queue.contains("per_robot.py ${W}/arms.tsv --arms mo "));
        // A robot already carrying a mirror-off line on master would be off in the control arm too.
        String table = Files.readString(Path.of("../hadur-robot/src/main/java/hadur117/ShieldTableData.java"));
        String offs = table.substring(table.indexOf("static String[] mirrorOffs()"));
        offs = offs.substring(0, offs.indexOf("};"));
        for (String n : panel) assertTrue(!offs.contains("\"" + n + "\","), n + " has no mirror-off line on master yet");
        String arms = Files.readString(Path.of("plans/pc-mirror-off.arms"));
        for (String arm : new String[] {"c | hadur117.Hadur " + version + " |", "aa | hadur117.Hadur " + version + "aa |",
                                        "mo | hadur117.Hadur " + version + "mo |"}) {
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
        assertTrue(queue.contains("open_results_pr.sh claude/pc-mirror-off-results"));
        assertTrue(queue.contains("set ALERT = lgriffin") && queue.contains("set P = --parallel 12 --no-truth-log"));
    }
}

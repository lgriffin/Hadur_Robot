package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** BENCH-239: the whole-field line screen (plans/pc-field-lines.queue) is complete before it reaches the PC. */
class PcFieldLinesPlanTest {

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
    @Tag("BENCH-239")
    @DisplayName("281 unlined gap robots, c/aa/pk/p5/mtzl on 2 seeds, the 5-point pick, A/A and stop rules")
    void cardIsComplete() throws IOException {
        String queue = Files.readString(Path.of("plans/pc-field-lines.queue"));
        String version = Files.readString(Path.of("../hadur-robot/pom.xml"))
            .replaceAll("(?s).*<robot.release>(.*?)</robot.release>.*", "$1");
        assertTrue(queue.contains("set V = " + version + "\n"), "the card builds the current release");
        List<String> panel = names("panel-pc-field-lines.txt");
        assertEquals(281, panel.size());
        assertEquals(panel.size(), new HashSet<>(panel).size(), "no robot twice");
        assertEquals(panel, names("plans/field-lines-add.txt"), "each panel robot gets one candidate line per arm");
        java.util.Set<String> broken = Broken.names(Path.of(Broken.FILE));
        java.util.Set<String> pcLines = new HashSet<>(names("panel-pc-lines.txt"));
        String list = Files.readString(Path.of("../hadur-robot/src/main/java/hadur117/ShieldListData.java"));
        String table = Files.readString(Path.of("../hadur-robot/src/main/java/hadur117/ShieldTableData.java"));
        for (String n : panel) {
            assertTrue(!broken.contains(n), n + " loads on 1.11.2");
            assertTrue(!pcLines.contains(n), n + " is not on pc-lines");
            String bare = n.split(" ", 2)[0];
            // SHIELD-26: a line matches by name, so a robot with any line would change the control arm too.
            assertTrue(!list.contains("\"" + bare + " ") && !list.contains("\"" + bare + "\"")
                && !table.contains(" " + bare + " ") && !table.contains("\"" + bare + " ") && !table.contains("\"" + bare + "\""),
                n + " carries no line on master");
        }
        assertTrue(queue.contains("build-ablation.sh aa ")
            && queue.contains("POWER_CAP=plans/field-lines-add.txt bash ./build-ablation.sh pcaplist &&")
            && queue.contains("POWER_CAP5=plans/field-lines-add.txt bash ./build-ablation.sh pcap5list &&")
            && queue.contains("SHIELD_ADD=plans/field-lines-add.txt SHIELD_STILL=plans/field-lines-add.txt bash ./build-ablation.sh slistadd,szlist &&"));
        assertTrue(queue.contains("--set panel-pc-field-lines.txt --seeds 2 --seed-base 17800 --arms plans/pc-field-lines.arms"));
        assertTrue(queue.contains("mode_table.py ${W}/arms.tsv --margin 5 --out-tsv ${OUT}/pc-field-lines-pick.tsv"));
        assertTrue(queue.contains("per_robot.py ${W}/arms.tsv --arms pk p5 mtzl "));
        String arms = Files.readString(Path.of("plans/pc-field-lines.arms"));
        for (String arm : new String[] {"c | hadur117.Hadur " + version + " |", "aa | hadur117.Hadur " + version + "aa |",
                                        "pk | hadur117.Hadur " + version + "pk |", "p5 | hadur117.Hadur " + version + "p5 |",
                                        "mtzl | hadur117.Hadur " + version + "mtzl |"}) {
            assertTrue(arms.contains("\n" + arm), arm);
        }
        String[] steps = {"prep", "screen", "gate", "pr"};
        for (int i = 1; i < steps.length; i++) {
            assertTrue(step(queue, steps[i], i + 1 < steps.length ? steps[i + 1] : null).contains("after: " + steps[i - 1]),
                steps[i] + " after " + steps[i - 1]);
        }
        assertTrue(!step(queue, "gate", "pr").contains(";"), "gate: an error must stop the card before the PR");
        String confirm = step(queue, "screen", "gate");
        assertTrue(confirm.contains("--shuffle-jobs") && confirm.contains("watch: field=1217"));
        for (String rule : new String[] {"fails 30", "dead 8", "skips 60 over 200", "stall 30m", "aa after 20%"}) {
            assertTrue(confirm.contains("stop: " + rule), rule);
        }
        assertTrue(queue.contains("open_results_pr.sh claude/pc-field-lines-results"));
        assertTrue(queue.contains("set ALERT = lgriffin") && queue.contains("set P = --parallel 16 --no-truth-log"));
    }
}

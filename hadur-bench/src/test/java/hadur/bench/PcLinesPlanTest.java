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

/** BENCH-238: the rolling PC line card (plans/pc-lines.queue) is complete before it reaches the PC. */
class PcLinesPlanTest {

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
    @Tag("BENCH-238")
    @DisplayName("JKHydra and 28 unlined gap robots, c/aa/pk on 8 fresh seeds, the 3-point pick, A/A and stop rules")
    void cardIsComplete() throws IOException {
        String queue = Files.readString(Path.of("plans/pc-lines.queue"));
        String version = Files.readString(Path.of("../hadur-robot/pom.xml"))
            .replaceAll("(?s).*<robot.release>(.*?)</robot.release>.*", "$1");
        assertTrue(queue.contains("set V = " + version + "\n"), "the card builds the current release");
        List<String> panel = names("panel-pc-lines.txt");
        assertEquals(29, panel.size());
        assertEquals(panel.size(), new HashSet<>(panel).size(), "no robot twice");
        assertEquals("jkong.JKHydra 1.4", panel.get(0), "the cloud lock leads the panel");
        assertEquals(panel, names("plans/lines-cap-add.txt"), "each panel robot gets one power-cap line");
        java.util.Set<String> broken = Broken.names(Path.of(Broken.FILE));
        String list = Files.readString(Path.of("../hadur-robot/src/main/java/hadur117/ShieldListData.java"));
        String table = Files.readString(Path.of("../hadur-robot/src/main/java/hadur117/ShieldTableData.java"));
        // After the results PR: the robots this card shipped lines for (plans/lines-cap-shipped.txt) carry them on master.
        List<String> shipped = names("plans/lines-cap-shipped.txt");
        // A later card (pc-class-1, plans/class-1-shipped.txt) may ship another line type to a robot this card read.
        List<String> later = new java.util.ArrayList<>(names("plans/class-1-shipped.txt"));
        later.addAll(names("plans/r31-shipped.txt")); // pc-r31 (PR #817) shipped lines to robots this card read
        for (String n : panel) {
            assertTrue(!broken.contains(n), n + " loads on 1.11.2");
            if (shipped.contains(n)) {
                assertTrue(table.contains("\"" + n + "\""), n + " ships its power-cap line");
                continue;
            }
            if (later.contains(n)) continue;
            String bare = n.split(" ", 2)[0];
            // SHIELD-26: a line matches by name, so a robot with any line would change the control arm too.
            assertTrue(!list.contains("\"" + bare + " ") && !list.contains("\"" + bare + "\"")
                && !table.contains(" " + bare + " ") && !table.contains("\"" + bare + " ") && !table.contains("\"" + bare + "\""),
                n + " carries no line on master");
        }
        assertTrue(queue.contains("build-ablation.sh aa ")
            && queue.contains("POWER_CAP=plans/lines-cap-add.txt bash ./build-ablation.sh pcaplist &&"));
        assertTrue(queue.contains("--set panel-pc-lines.txt --seeds 8 --seed-base 17600 --arms plans/pc-lines.arms"));
        assertTrue(queue.contains("mode_table.py ${W}/arms.tsv --margin 3 --out-tsv ${OUT}/pc-lines-pick.tsv"));
        assertTrue(queue.contains("per_robot.py ${W}/arms.tsv --arms pk "));
        String arms = Files.readString(Path.of("plans/pc-lines.arms"));
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
        for (String rule : new String[] {"fails 30", "dead 8", "skips 60 over 200", "stall 30m", "aa after 20%"}) {
            assertTrue(confirm.contains("stop: " + rule), rule);
        }
        assertTrue(queue.contains("open_results_pr.sh claude/pc-lines-results"));
        assertTrue(queue.contains("set ALERT = lgriffin") && queue.contains("set P = --parallel 16 --no-truth-log"));
    }
}

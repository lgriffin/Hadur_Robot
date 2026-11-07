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

/** BENCH-209: the shield audit confirm card (plans/pc-shield-audit.queue) is complete before it reaches the PC. */
class ShieldAuditPlanTest {

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
    @Tag("BENCH-209")
    @DisplayName("two robots, three arms, 12 fresh seeds, the gate, the pick and the stop rules")
    void cardIsComplete() throws IOException {
        String queue = Files.readString(Path.of("plans/pc-shield-audit.queue"));
        String version = Files.readString(Path.of("../hadur-robot/pom.xml"))
            .replaceAll("(?s).*<robot.release>(.*?)</robot.release>.*", "$1");
        assertTrue(queue.contains("set V = " + version + "\n"), "the card builds the current release");
        List<String> panel = names("panel-shield-audit.txt");
        assertEquals(List.of("axeBots.Musashi 2.18", "cx.Princess 1.0"), panel);
        assertEquals(panel, names("plans/shield-audit-add.txt"), "both join the list");
        assertEquals(panel, names("plans/shield-audit-still.txt"), "both get still lines");
        assertEquals(List.of("cx.Princess 1.0"), names("plans/shield-audit-exit0.txt"), "Princess alone gets exit off");
        for (String n : panel) assertTrue(!Broken.names(Path.of(Broken.FILE)).contains(n), n + " loads on 1.11.2");
        assertTrue(queue.contains("build-ablation.sh aa ") && queue.contains("SHIELD_ADD=plans/shield-audit-add.txt"
            + " SHIELD_STILL=plans/shield-audit-still.txt SHIELD_EXIT0=plans/shield-audit-exit0.txt"
            + " bash ./build-ablation.sh slistadd,szlist,sx0list"));
        assertTrue(queue.contains("--set panel-shield-audit.txt --seeds 12 --seed-base 9950 --arms plans/shield-audit.arms"));
        assertTrue(queue.contains("--arm sa --panel panel-shield-audit.txt --bar 0.01"));
        assertTrue(queue.contains("mode_table.py ${W}/arms.tsv --margin 3 --out-tsv ${OUT}/shield-audit-pick.tsv"));
        String arms = Files.readString(Path.of("plans/shield-audit.arms"));
        for (String arm : new String[] {"c | hadur117.Hadur " + version + " |", "aa | hadur117.Hadur " + version + "aa |",
                                        "sa | hadur117.Hadur " + version + "mtzlx0 |"}) {
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
        assertTrue(queue.contains("open_results_pr.sh claude/pc-shield-audit-results"));
        assertTrue(queue.contains("set ALERT = lgriffin") && queue.contains("set P = --parallel 12 --no-truth-log"));
    }
}

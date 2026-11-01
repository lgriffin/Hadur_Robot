package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** BENCH-165: the shield-power card (plans/pc-shield-power.queue) is complete before it reaches the PC. */
class ShieldPowerPlanTest {

    private static List<String> names(String file) throws IOException {
        return Files.readAllLines(Path.of(file)).stream()
            .filter(l -> !l.isBlank() && !l.startsWith("#")).map(l -> l.split("\\|")[0].trim()).toList();
    }

    private static String step(String queue, String name, String next) {
        int at = queue.indexOf("\n" + name + " | ");
        assertTrue(at >= 0, name);
        int end = next == null ? queue.length() : queue.indexOf("\n\n" + next + " | ");
        return queue.substring(at, end < 0 ? queue.length() : end);
    }

    @Test
    @Tag("BENCH-165")
    @DisplayName("every robot on master's shield list, c/aa/sc/sr on 4 fresh seeds from 7200, two gates, picks and stop rules")
    void cardIsComplete() throws IOException {
        String queue = Files.readString(Path.of("plans/pc-shield-power.queue"));
        List<String> panel = names("panel-shield-listed-321.txt");
        assertEquals(panel.size(), new HashSet<>(panel).size(), "no robot twice");
        String listData = Files.readString(Path.of("../hadur-robot/src/main/java/hadur117/ShieldListData.java"));
        Matcher m = Pattern.compile("(?m)^\\s*\"([^\"]+)\",").matcher(listData);
        Set<String> entries = new HashSet<>();
        while (m.find()) entries.add(m.group(1));
        for (String n : panel) {
            assertTrue(entries.stream().anyMatch(e -> n.equals(e) || n.startsWith(e + " ")), n + " is shielded on master");
        }
        assertEquals(entries.size(), panel.size(), "one panel robot per shield-list entry");

        String prep = step(queue, "prep", "screen");
        assertTrue(prep.contains("bash ./build-ablation.sh scheap") && prep.contains("bash ./build-ablation.sh sratio"));
        assertTrue(prep.contains("test -f bisect/hadur117.Hadur_${V}sc.jar") && prep.contains("test -f bisect/hadur117.Hadur_${V}sr.jar"));
        String screen = step(queue, "screen", "gate");
        assertTrue(screen.contains("--set panel-shield-listed-321.txt --seeds 4 --seed-base 7200 --arms plans/shield-power.arms"));
        assertTrue(queue.contains("--no-truth-log") && screen.contains("--shuffle-jobs") && screen.contains("watch: field=1217"));
        for (String rule : new String[] {"fails 30", "dead 8", "skips 60 over 200", "stall 30m", "aa after 20%"}) {
            assertTrue(screen.contains("stop: " + rule), rule);
        }
        assertTrue(!screen.contains("futility"), "the per-robot picks need every battle");
        String arms = Files.readString(Path.of("plans/shield-power.arms"));
        for (String a : new String[] {"c | hadur117.Hadur 3.20 | ", "aa | hadur117.Hadur 3.20aa | ",
            "sc | hadur117.Hadur 3.20sc | bisect/hadur117.Hadur_3.20sc.jar",
            "sr | hadur117.Hadur 3.20sr | bisect/hadur117.Hadur_3.20sr.jar"}) {
            assertTrue(arms.contains("\n" + a), a);
        }
        String gate = step(queue, "gate", "pr");
        assertTrue(!gate.contains(";"), "an analysis error must stop the card before the results PR");
        for (String arm : new String[] {"sc", "sr"}) {
            assertTrue(gate.contains("--arm " + arm + " --panel panel-shield-listed-321.txt --bar 0.05"), arm);
        }
        assertTrue(gate.contains("mode_table.py ${W}/arms.tsv --margin 5") && gate.contains("per_robot.py ${W}/arms.tsv --arms sc sr"));
        assertTrue(screen.contains("after: prep") && gate.contains("after: screen") && step(queue, "pr", null).contains("after: gate"));
        assertTrue(queue.contains("open_results_pr.sh claude/pc-shield-power-results"));
        assertTrue(queue.contains("set ALERT = lgriffin"));
    }
}

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

/** BENCH-197: the whole-field hidden-speed and rammer-dodge card (plans/pc-x5-field.queue) is complete before it reaches the PC. */
class X5PlanTest {

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
    @Tag("BENCH-197")
    @DisplayName("every robot of the field fought with x5 and rd, the 13-name pilot first, pick, confirm of the picks at 4 fresh seeds, the gate and the stop rules")
    void cardIsComplete() throws IOException {
        String queue = Files.readString(Path.of("plans/pc-x5-field.queue"));
        String version = Files.readString(Path.of("../hadur-robot/pom.xml"))
            .replaceAll("(?s).*<robot.release>(.*?)</robot.release>.*", "$1");
        assertTrue(queue.contains("set V = " + version + "\n"), "the card builds the current release");
        List<String> field = names("census-312.txt");
        assertEquals(1212, field.size(), "the whole 1v1 field");
        List<String> pilot = names("panel-x5-pilot.txt");
        assertEquals(13, pilot.size());
        assertTrue(field.containsAll(pilot), "the pilot's battles are the screen's first, so the screen resumes them");
        List<String> gun = names("panel-x5.txt");
        List<String> ram = names("panel-rammers.txt");
        assertEquals(7, pilot.stream().filter(gun::contains).count(), "the x5 check reads the 7 gun smoke names");
        assertEquals(6, pilot.stream().filter(ram::contains).count(), "the rd check reads the 6 rammer smoke names");
        assertTrue(queue.contains("grep -v '^#' census-312.txt | cut -d'|' -f1 | sed 's/ *$//' | grep . > work/field.list"),
            "both lists name every robot of the field");
        assertTrue(queue.contains("X5_POWER=work/field.list bash ./build-ablation.sh x5list"));
        assertTrue(queue.contains("RAM_DODGE=work/field.list bash ./build-ablation.sh rdlist"));
        assertTrue(queue.contains("--set panel-x5-pilot.txt --seeds 2 --seed-base 9300 --arms plans/x5-field.arms --out ${W}"));
        assertTrue(queue.contains("tools/x5_card.py pilot ${W}/arms.tsv --names panel-x5-pilot.txt --check x5=panel-x5.txt@2 --check rd=panel-rammers.txt@1 --ref c"));
        assertTrue(queue.contains("--set census-312.txt --seeds 2 --seed-base 9300 --arms plans/x5-field.arms --out ${W}"));
        assertTrue(queue.contains("mode_table.py ${W}/arms.tsv --margin 5 --out-tsv ${OUT}/x5f-pick.tsv"));
        assertTrue(queue.contains("tools/pick_panel.py ${OUT}/x5f-pick.tsv census-312.txt work/panel-x5f-picks.txt"));
        assertTrue(queue.contains("tools/x5_card.py lists ${OUT}/x5f-pick.tsv"));
        assertTrue(queue.contains("--set work/panel-x5f-picks.txt --seeds 4 --seed-base 9400 --arms work/x5f-2.arms"));
        assertTrue(queue.contains("--arm xr --panel work/panel-x5f-picks.txt --bar 0.03"));
        String arms = Files.readString(Path.of("plans/x5-field.arms"));
        for (String arm : new String[] {"c | hadur117.Hadur " + version + " |", "x5 | hadur117.Hadur " + version + "x5 |",
                                        "rd | hadur117.Hadur " + version + "rd |"}) {
            assertTrue(arms.contains("\n" + arm), arm);
        }
        String[] steps = {"prep", "pilot", "screen", "pick", "prep2", "confirm", "gate", "pr"};
        for (int i = 1; i < steps.length; i++) {
            assertTrue(step(queue, steps[i], i + 1 < steps.length ? steps[i + 1] : null).contains("after: " + steps[i - 1]),
                steps[i] + " after " + steps[i - 1]);
        }
        for (String s : new String[] {"screen", "pick", "prep2", "confirm", "gate"}) {
            assertTrue(step(queue, s, steps[List.of(steps).indexOf(s) + 1]).contains("if [ -f work/x5.stop ]; then"),
                s + " skips after a stopped pilot");
        }
        for (String s : new String[] {"pilot", "screen", "confirm"}) {
            String body = step(queue, s, steps[List.of(steps).indexOf(s) + 1]);
            assertTrue(body.contains("--shuffle-jobs") && body.contains("watch: field=1217"), s);
            for (String rule : new String[] {"fails 30", "dead 8", "skips 60 over 200", "stall 30m"}) {
                assertTrue(body.contains("stop: " + rule), s + " " + rule);
            }
        }
        assertTrue(queue.contains("open_results_pr.sh claude/pc-x5-field-results"));
        assertTrue(queue.contains("set ALERT = lgriffin") && queue.contains("set P = --parallel 12 --no-truth-log"));
        assertTrue(queue.contains("Why it should win"));
    }
}

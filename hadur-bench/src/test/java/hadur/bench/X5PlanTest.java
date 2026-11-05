package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** BENCH-197: the per-name hidden-speed and rammer-dodge card (plans/pc-x5.queue) is complete before it reaches the PC. */
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
    @DisplayName("pilot on the 13 smoke names, screen of the 46 + 87, pick, confirm of the picks at 4 fresh seeds, the gate and the stop rules")
    void cardIsComplete() throws IOException {
        String queue = Files.readString(Path.of("plans/pc-x5.queue"));
        String version = Files.readString(Path.of("../hadur-robot/pom.xml"))
            .replaceAll("(?s).*<robot.release>(.*?)</robot.release>.*", "$1");
        assertTrue(queue.contains("set V = " + version + "\n"), "the card builds the current release");
        List<String> x5 = names("panel-x5.txt");
        List<String> ram = names("panel-rammers.txt");
        assertEquals(46, x5.size());
        assertEquals(87, ram.size());
        List<String> screen = new ArrayList<>(x5);
        screen.addAll(ram);
        assertEquals(screen, names("panel-x5-screen.txt"), "the screen is the two panels");
        assertEquals(screen.size(), screen.stream().distinct().count(), "no robot twice, so each name gets one line");
        assertEquals(x5, names("plans/x5-all.list"), "the POW-16 list names exactly panel-x5.txt");
        assertEquals(ram, names("plans/rd-all.list"), "the RAM-6 list names exactly panel-rammers.txt");
        for (String n : screen) assertTrue(!Broken.names(Path.of(Broken.FILE)).contains(n), n + " loads on 1.11.2");
        List<String> pilot = names("panel-x5-pilot.txt");
        assertEquals(13, pilot.size());
        assertTrue(screen.containsAll(pilot), "the pilot's battles are the screen's first, so the screen resumes them");
        assertTrue(queue.contains("X5_POWER=plans/x5-all.list RAM_DODGE=plans/rd-all.list bash ./build-ablation.sh x5list,rdlist"));
        assertTrue(queue.contains("--set panel-x5-pilot.txt --seeds 3 --seed-base 9300 --arms plans/x5.arms --out ${W}"));
        assertTrue(queue.contains("tools/x5_card.py pilot ${W}/arms.tsv --arm xr --names panel-x5-pilot.txt --bar 2"));
        assertTrue(queue.contains("--set panel-x5-screen.txt --seeds 3 --seed-base 9300 --arms plans/x5.arms --out ${W}"));
        assertTrue(queue.contains("mode_table.py ${W}/arms.tsv --margin 5 --out-tsv ${OUT}/x5-pick.tsv"));
        assertTrue(queue.contains("tools/x5_card.py lists ${OUT}/x5-pick.tsv --x5-panel panel-x5.txt --ram-panel panel-rammers.txt"));
        assertTrue(queue.contains("--set work/panel-x5-picks.txt --seeds 4 --seed-base 9400 --arms work/x5-2.arms"));
        assertTrue(queue.contains("--arm xr --panel work/panel-x5-picks.txt --bar 0.03"));
        String arms = Files.readString(Path.of("plans/x5.arms"));
        for (String arm : new String[] {"c | hadur117.Hadur " + version + " |", "aa | hadur117.Hadur " + version + "aa |",
                                        "xr | hadur117.Hadur " + version + "x5rd |"}) {
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
        assertTrue(queue.contains("open_results_pr.sh claude/pc-x5-results"));
        assertTrue(queue.contains("set ALERT = lgriffin") && queue.contains("set P = --parallel 12 --no-truth-log"));
        assertTrue(queue.contains("Why it should win"));
    }
}

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

/** BENCH-260: the pc-intercept card (plans/pc-intercept.queue): MOVE-52's intercept views read field-wide. */
class PcInterceptPlanTest {

    private static String step(String queue, String name) {
        int at = queue.indexOf("\n" + name + " | ");
        assertTrue(at >= 0, "step " + name);
        int end = queue.indexOf("\n\n", at + 1);
        return queue.substring(at, end < 0 ? queue.length() : end);
    }

    @Test
    @Tag("BENCH-260")
    @DisplayName("pc-intercept: c, aa and ic at the live constant after the live-match check, an r31 pilot with a stop rule, field-e and the mid-field, a field gate, stop rules, a results PR")
    void cardIsComplete() throws IOException {
        String queue = Files.readString(Path.of("plans/pc-intercept.queue"));
        String version = Files.readString(Path.of("../hadur-robot/pom.xml"))
            .replaceAll("(?s).*<robot.release>(.*?)</robot.release>.*", "$1");
        assertTrue(queue.contains("set V = " + version + "\n"), "the card builds the current release");
        assertTrue(queue.contains("--cpu-constant live"), "the live turn time");
        List<String> arms = Files.readAllLines(Path.of("plans/pc-intercept.arms")).stream()
            .filter(l -> !l.isBlank() && !l.startsWith("#")).map(l -> l.split("\\|")[0].trim()).toList();
        assertEquals(List.of("c", "aa", "ic"), arms);
        assertTrue(step(queue, "prep").contains("bash ./build-ablation.sh icpt && test -f bisect/hadur117.Hadur_${V}ic.jar"), "builds ic");
        assertTrue(step(queue, "pilot").contains("  after: livematch"), "the pilot follows the live-match check");
        String stop = step(queue, "pilotstop");
        assertTrue(stop.contains("tools/arm_floor.py ${W}-r31/arms.tsv --arm ic --floor 0 --min 25"), "the pilot's stop rule");
        assertTrue(step(queue, "fielde").contains("  after: pilotstop"), "the field runs only past the stop rule");
        String guard = "grep -q \"^GO ON\" ${OUT}/pc-intercept-pilot.md || { echo \"the pilot stopped the card: no field battles\"; exit 0; }; ";
        for (String s : new String[] {"fielde", "midfield", "gate"}) {
            assertTrue(step(queue, s).contains(guard), s + " is skipped when the pilot stops the card");
        }
        assertTrue(stop.contains("--out ${OUT}/pc-intercept-pilot.md || true"), "a stopped pilot still reaches the results PR");
        assertTrue(step(queue, "pr").contains("${OUT}/pc-intercept-pilot.md"), "the results PR carries the pilot's verdict");
        assertTrue(step(queue, "midfield").contains("  after: fielde"), "then the mid-field");
        for (String s : new String[] {"pilot", "fielde", "midfield"}) {
            String t = step(queue, s);
            assertTrue(t.contains("--arms plans/pc-intercept.arms"), s + " arms");
            for (String rule : new String[] {"stop: fails 30", "stop: dead 8", "stop: skips 60 over 200", "stop: stall 30m"}) {
                assertTrue(t.contains(rule), s + " " + rule);
            }
        }
        assertTrue(queue.contains("--seed-base 49100") && queue.contains("--seed-base 49200") && queue.contains("--seed-base 49300"), "fresh seeds");
        assertTrue(step(queue, "gate").contains("shield_s2.py gate") && step(queue, "gate").contains("  after: midfield"), "the field gate");
        assertTrue(step(queue, "pr").contains("claude/pc-intercept-results") && step(queue, "pr").contains("  after: gate"), "results PR");
    }
}

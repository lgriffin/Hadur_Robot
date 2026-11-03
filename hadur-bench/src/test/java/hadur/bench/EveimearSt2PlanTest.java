package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/**
 * BENCH-180: the Eveimear mode-pick card (plans/pc-eveimear-st2.queue) is complete before it reaches the PC: the forced
 * arms built by tools/eveimear_modes.py, a pilot on a fifth of the panel gated against null picks, the screen on the
 * rest, the confirm on fresh seeds, the case for it written on the card, the read and the PR.
 */
class EveimearSt2PlanTest {

    private static List<String> names(String file) throws IOException {
        return Files.readAllLines(Path.of(file)).stream().filter(l -> !l.startsWith("#") && l.contains("|"))
            .map(l -> l.split("\\|")[0].trim()).toList();
    }

    private static String step(String queue, String name) {
        int at = queue.indexOf("\n" + name + " | ");
        assertTrue(at >= 0, name);
        int end = queue.indexOf("\n\n", at + 1);
        return queue.substring(at, end < 0 ? queue.length() : end);
    }

    @Test
    @Tag("BENCH-180")
    @DisplayName("the arms, the pilot and rest panels, the pilot gate, the confirm and the why-it-should-win case are on the card")
    void cardIsComplete() throws IOException {
        String queue = Files.readString(Path.of("plans/pc-eveimear-st2.queue"));
        assertEquals(List.of("c", "aa", "rn", "sg"), names("plans/eveimear-st2.arms"));
        assertEquals(List.of("c", "aa", "pk"), names("plans/eveimear-st2-confirm.arms"));
        List<String> panel = names("kitlab/micro-detect-field.txt");
        List<String> pilot = names("kitlab/micro-detect-pilot.txt");
        List<String> rest = names("kitlab/micro-detect-rest.txt");
        assertEquals(416, panel.size());
        assertEquals(84, pilot.size());
        Set<String> both = new HashSet<>(pilot);
        both.addAll(rest);
        assertEquals(new HashSet<>(panel), both);
        assertEquals(panel.size(), pilot.size() + rest.size());
        assertTrue(queue.contains("# Why it should win"));
        for (String s : new String[] {"pilot", "screen"}) {
            String body = step(queue, s);
            assertTrue(body.contains("--shuffle-jobs") && body.contains("--arms plans/eveimear-st2.arms"), s);
            for (String rule : new String[] {"fails 30", "dead 8", "skips 60 over 200", "stall 30m", "aa after 20%"}) {
                assertTrue(body.contains("stop: " + rule), s + ": " + rule);
            }
        }
        assertTrue(step(queue, "pilot").contains("--set kitlab/micro-detect-pilot.txt"));
        assertTrue(step(queue, "screen").contains("--set kitlab/micro-detect-rest.txt"));
        assertTrue(step(queue, "screen").contains("if [ ! -f ${W}/GO ]"));
        assertTrue(step(queue, "pilotgate").contains("eveimear_modes.py pilot"));
        assertTrue(step(queue, "build").contains("eveimear_modes.py apply"));
        assertTrue(step(queue, "confirm").contains("--seed-base 32000") && step(queue, "confirm").contains("--seeds 12"));
        assertTrue(step(queue, "gate").contains("--arm pk") && step(queue, "gate").contains("--field 515"));
        assertTrue(queue.contains("open_results_pr.sh claude/pc-eveimear-st2-results"));
        assertTrue(queue.contains("set ALERT = lgriffin"));
        assertTrue(Files.readString(Path.of("tools/eveimear_modes.py")).contains("def cmd_pilot"));
    }
}

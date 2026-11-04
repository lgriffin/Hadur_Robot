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

/**
 * BENCH-187: the JayLexi per-robot orbit card (plans/pc-jaylexi-orb.queue) is complete before it reaches the PC: the
 * base and forced arms built by tools/jaylexi_orbit.py, a gated pilot, the screen, the confirm on fresh seeds, the
 * stop rules, the case for it and the PR.
 */
class JayLexiOrbitPlanTest {

    static List<String> arms(String file) throws IOException {
        return Files.readAllLines(Path.of(file)).stream()
            .filter(l -> !l.startsWith("#") && l.contains("|")).map(l -> l.split("\\|")[0].trim()).toList();
    }

    static String step(String queue, String name) {
        int at = queue.indexOf("\n" + name + " | ");
        assertTrue(at >= 0, name);
        int end = queue.indexOf("\n\n", at + 1);
        return queue.substring(at, end < 0 ? queue.length() : end);
    }

    @Test
    @Tag("BENCH-187")
    @DisplayName("the orbit arms, the gated pilot, the screen, the confirm, the stops and the case are on the card")
    void cardIsComplete() throws IOException {
        String queue = Files.readString(Path.of("plans/pc-jaylexi-orb.queue"));
        assertEquals(List.of("c", "aa", "near", "far"), arms("plans/jaylexi-orb.arms"));
        assertEquals(List.of("c", "aa", "pk"), arms("plans/jaylexi-orb-confirm.arms"));
        assertTrue(queue.contains("# Why it should win"));
        String prep = step(queue, "prep");
        for (String s : new String[] {"jaylexi_orbit.py ${SRC} ${W}/b.java &&", "--all 135", "--all 95",
                "0.5ob &&", "0.5oba &&", "0.5onear &&", "0.5ofar"}) {
            assertTrue(prep.contains(s), s);
        }
        for (String name : new String[] {"pilot", "screen"}) {
            String body = step(queue, name);
            assertTrue(body.contains("--shuffle-jobs") && body.contains("--arms plans/jaylexi-orb.arms"), name);
            for (String rule : new String[] {"fails 30", "dead 8", "skips 60 over 200", "stall 30m", "aa after 20%"}) {
                assertTrue(body.contains("stop: " + rule), name + " " + rule);
            }
        }
        assertTrue(step(queue, "pilot").contains("--set kitlab/mini-pw-pilot.txt"));
        assertTrue(step(queue, "screen").contains("--set kitlab/mini-pw-rest.txt") && step(queue, "screen").contains("${W}/GO"));
        assertTrue(step(queue, "pilotgate").contains("eveimear_modes.py pilot ${W}/pilot/arms.tsv --margin 3"));
        assertTrue(step(queue, "build").contains("jaylexi_orbit.py ${SRC} ${W}/pk.java --pick ${W}/pick.tsv --field kitlab/mini-all-field.txt"));
        String confirm = step(queue, "confirm");
        assertTrue(confirm.contains("--seeds 12 --seed-base 39000") && confirm.contains("plans/jaylexi-orb-confirm.arms"));
        assertTrue(step(queue, "gate").contains("--arm pk --panel ${W}/picks.txt --field 669 --bar 0.05"));
        assertTrue(queue.contains("open_results_pr.sh claude/pc-jaylexi-orb-results"));
        assertTrue(queue.contains("set ALERT = lgriffin"));
    }
}

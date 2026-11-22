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
 * BENCH-274: the JayLexi 1.3 confirm card (plans/pc-jaylexi-13.queue) is complete before it reaches the PC: c is 1.2's
 * source read from master history, t the shipped 1.3, one shuffled multi-arm step over the whole MiniRumble field at the
 * live turn time after the live-match check, the A/A halt and 20% futility stop, the case written on the card, the read
 * and the PR.
 */
class JayLexi13PlanTest {

    @Test
    @Tag("BENCH-274")
    @DisplayName("pc-jaylexi-13: c (1.2), aa, t (1.3) and the released 0.6 on 668 robots x 6 fresh seeds, live timing, gate and PR")
    void cardIsComplete() throws IOException {
        String queue = Files.readString(Path.of("plans/pc-jaylexi-13.queue"));
        List<String> arms = Files.readAllLines(Path.of("plans/jaylexi-13.arms")).stream()
            .filter(l -> !l.startsWith("#") && l.contains("|")).map(l -> l.split("\\|")[0].trim()).toList();
        assertEquals(List.of("c", "aa", "t", "r6"), arms);
        assertTrue(queue.contains("grep -q \"waves.add(0, gone)\" ${SRC} && git show 4cbd7b3d6:jaylexi/src/main/java/hadur117/mini/JayLexi.java"
            + " > ${W}/JayLexi.java && grep -q \"POWER.charAt(row + band)\" ${W}/JayLexi.java && ! grep -q \"gone\" ${W}/JayLexi.java"),
            "c is 1.2's source without the dropped-wave logging, t has it, both checked by grep");
        for (String arm : new String[] {"${W}/JayLexi.java hadur117.mini.JayLexi 1.2c", "${W}/JayLexi.java hadur117.mini.JayLexi 1.2aa",
                "${SRC} hadur117.mini.JayLexi 1.3t"}) {
            assertTrue(queue.contains("bash kitlab/build_arm_pg.sh " + arm), arm);
        }
        assertTrue(queue.contains("(cd ../jaylexi && mvn -q verify)"), "the replay and size tests pass on the PC first");
        assertTrue(queue.contains("# Why it should win"));
        int at = queue.indexOf("\nbench | ");
        assertTrue(at >= 0);
        String body = queue.substring(at, queue.indexOf("\n\n", at + 1));
        assertTrue(body.contains("--shuffle-jobs") && body.contains("--arms plans/jaylexi-13.arms")
            && body.contains("--set kitlab/mini-pw-field.txt") && body.contains("--seeds 6 --seed-base 63000"));
        assertTrue(body.contains("  after: livematch"));
        assertTrue(queue.contains("set C = --skip-build --skip-fetch --rounds 35 --cpu-constant live "));
        for (String rule : new String[] {"fails 30", "dead 8", "skips 60 over 200", "stall 30m", "aa after 20%",
                "futility t below -0.5 after 20%"}) {
            assertTrue(body.contains("stop: " + rule), rule);
        }
        assertTrue(PcLiveMatchPlanTest.violations("pc-jaylexi-13.queue", queue).isEmpty(),
            String.valueOf(PcLiveMatchPlanTest.violations("pc-jaylexi-13.queue", queue)));
        assertTrue(queue.contains("tools/arm_pair.py ${W}/run/arms.tsv --candidate t --baseline c --robots FoilistMC CunobelinDC"),
            "the results read 1.3 against 1.2 on the field and on the robots above us");
        assertTrue(queue.contains("open_results_pr.sh claude/pc-jaylexi-13-results"));
        assertTrue(queue.contains("set ALERT = lgriffin"));
    }
}

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
 * BENCH-269: the JayLexi 1.2 and 1.1 confirm card (plans/pc-jaylexi-12.queue) is complete before it reaches the PC: c is
 * 1.0's source and n 1.1's, both read from master history, t the shipped 1.2, one shuffled multi-arm step over the whole MiniRumble field at the live turn
 * time after the live-match check, the A/A halt and 20% futility stop, the case written on the card, the read and the PR.
 */
class JayLexi12PlanTest {

    @Test
    @Tag("BENCH-269")
    @DisplayName("pc-jaylexi-12: c (1.0), aa, n (1.1), t (1.2) and the released 0.6 on 668 robots x 6 fresh seeds, live timing, gate and PR")
    void cardIsComplete() throws IOException {
        String queue = Files.readString(Path.of("plans/pc-jaylexi-12.queue"));
        List<String> arms = Files.readAllLines(Path.of("plans/jaylexi-12.arms")).stream()
            .filter(l -> !l.startsWith("#") && l.contains("|")).map(l -> l.split("\\|")[0].trim()).toList();
        assertEquals(List.of("c", "aa", "n", "t", "r6"), arms);
        assertTrue(queue.contains("grep -q \"POWER.charAt(row + band)\" ${SRC} && git show 299c55f3c:jaylexi/src/main/java/hadur117/mini/JayLexi.java"
            + " > ${W}/JayLexi.java && grep -q \"getGunTurnRemaining()) < 3 &&\" ${W}/JayLexi.java"),
            "c is 1.0's source with its flat 3 degree gate, t has the per-robot power rows, both checked by grep");
        assertTrue(queue.contains("git show 65a273240:jaylexi/src/main/java/hadur117/mini/JayLexi.java > ${W}/n/JayLexi.java"
            + " && grep -q \"POWER.charAt(band)\" ${W}/n/JayLexi.java"), "n is 1.1's source, with one power row, checked by grep");
        for (String arm : new String[] {"${W}/JayLexi.java hadur117.mini.JayLexi 1.0c", "${W}/JayLexi.java hadur117.mini.JayLexi 1.0aa",
                "${W}/n/JayLexi.java hadur117.mini.JayLexi 1.1n", "${SRC} hadur117.mini.JayLexi 1.2t"}) {
            assertTrue(queue.contains("bash kitlab/build_arm_pg.sh " + arm), arm);
        }
        assertTrue(queue.contains("(cd ../jaylexi && mvn -q verify)"), "the replay and size tests pass on the PC first");
        assertTrue(queue.contains("# Why it should win"));
        int at = queue.indexOf("\nbench | ");
        assertTrue(at >= 0);
        String body = queue.substring(at, queue.indexOf("\n\n", at + 1));
        assertTrue(body.contains("--shuffle-jobs") && body.contains("--arms plans/jaylexi-12.arms")
            && body.contains("--set kitlab/mini-pw-field.txt") && body.contains("--seeds 6 --seed-base 62000"));
        assertTrue(body.contains("  after: livematch"));
        assertTrue(queue.contains("set C = --skip-build --skip-fetch --rounds 35 --cpu-constant live "));
        for (String rule : new String[] {"fails 30", "dead 8", "skips 60 over 200", "stall 30m", "aa after 20%",
                "futility t below -0.5 after 20%"}) {
            assertTrue(body.contains("stop: " + rule), rule);
        }
        assertTrue(PcLiveMatchPlanTest.violations("pc-jaylexi-12.queue", queue).isEmpty(),
            String.valueOf(PcLiveMatchPlanTest.violations("pc-jaylexi-12.queue", queue)));
        assertTrue(queue.contains("tools/arm_pair.py ${W}/run/arms.tsv --candidate t --baseline n --robots FoilistMC CunobelinDC Mark8"
            + " CannonfodderMicro Charo"), "the results read 1.2 against 1.1 on the field and on each line robot");
        assertTrue(queue.contains("open_results_pr.sh claude/pc-jaylexi-12-results"));
        assertTrue(queue.contains("set ALERT = lgriffin"));
    }
}

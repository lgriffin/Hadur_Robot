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

/** BENCH-243: the shadow-fix card (plans/pc-shadow.queue) reads MOVE-43 on the whole 1v1 field. */
class PcShadowPlanTest {

    private static List<String> names(String file) throws IOException {
        return Files.readAllLines(Path.of(file)).stream()
            .filter(l -> !l.isBlank() && !l.startsWith("#")).map(l -> l.split("\\|")[0].trim()).toList();
    }

    @Test
    @Tag("BENCH-243")
    @DisplayName("census-312 less the 1.11.2 skips, c/aa/kp on 2 seeds from 19300, stop rules, results PR")
    void cardIsComplete() throws IOException {
        String queue = Files.readString(Path.of("plans/pc-shadow.queue"));
        String version = Files.readString(Path.of("../hadur-robot/pom.xml"))
            .replaceAll("(?s).*<robot.release>(.*?)</robot.release>.*", "$1");
        assertTrue(queue.contains("set V = " + version + "\n"), "the card builds the current release");
        java.util.Set<String> broken = Broken.names(Path.of(Broken.FILE));
        List<String> panel = names("panel-shadow.txt");
        List<String> census = names("census-312.txt").stream().filter(n -> !broken.contains(n)).toList();
        assertEquals(census, panel, "the whole census less the skips");
        assertEquals(panel.size(), new HashSet<>(panel).size(), "no robot twice");
        String arms = Files.readString(Path.of("plans/pc-shadow.arms"));
        assertTrue(arms.contains("\nc | hadur117.Hadur " + version + " |") && arms.contains("\naa | hadur117.Hadur " + version + "aa |")
            && arms.contains("\nkp | hadur117.Hadur " + version + "kp |"));
        assertTrue(queue.contains("bash ./build-ablation.sh shkeep &&") && queue.contains("bash ./build-ablation.sh aa &&"));
        assertTrue(queue.contains("--set panel-shadow.txt --seeds 2 --seed-base 19300 --arms plans/pc-shadow.arms --out ${W} "));
        for (String rule : new String[] {"fails 30", "dead 8", "skips 80 over 200", "stall 30m", "aa after 20%"}) {
            assertTrue(queue.contains("stop: " + rule), rule);
        }
        assertTrue(queue.contains("open_results_pr.sh claude/pc-shadow-results") && queue.contains("set P = --parallel 16 --no-truth-log"));
        String design = Files.readString(Path.of("../hadur-core/src/main/java/hadur117/core/duel/MoveDesign.java"));
        assertTrue(design.contains("static final boolean KEEP_SHADOWS = false;"), "master plays without the fix until the card holds");
    }
}

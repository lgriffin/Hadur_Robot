package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** BENCH-241: the first class card (plans/pc-class-1.queue) gives each robot only its diagnosed line type. */
class PcClassOnePlanTest {

    private static List<String> names(String file) throws IOException {
        return Files.readAllLines(Path.of(file)).stream()
            .filter(l -> !l.isBlank() && !l.startsWith("#")).map(l -> l.split("\\|")[0].trim()).toList();
    }

    @Test
    @Tag("BENCH-241")
    @DisplayName("shield/cap/gun classes on their own robots, c/aa plus the class's arms, 8 seeds, the 3-point pick, stop rules")
    void cardIsComplete() throws IOException {
        String queue = Files.readString(Path.of("plans/pc-class-1.queue"));
        String version = Files.readString(Path.of("../hadur-robot/pom.xml"))
            .replaceAll("(?s).*<robot.release>(.*?)</robot.release>.*", "$1");
        assertTrue(queue.contains("set V = " + version + "\n"), "the card builds the current release");
        java.util.Set<String> broken = Broken.names(Path.of(Broken.FILE));
        Map<String, List<String>> armsOf = Map.of("shield", List.of("mtzl"), "cap", List.of("pk", "p5"), "gun", List.of("gl", "x5"));
        Map<String, Integer> sizes = Map.of("shield", 21, "cap", 13, "gun", 30);
        for (var e : armsOf.entrySet()) {
            String k = e.getKey();
            List<String> panel = names("panel-class-" + k + ".txt");
            assertEquals(sizes.get(k), panel.size(), k);
            assertEquals(panel.size(), new HashSet<>(panel).size(), k + ": no robot twice");
            assertEquals(panel, names("plans/class-" + k + "-add.txt"), k + ": one candidate line per panel robot");
            for (String n : panel) assertTrue(!broken.contains(n), n + " loads on 1.11.2");
            assertTrue(queue.contains("--set panel-class-" + k + ".txt --seeds 8 --seed-base 18600 --arms plans/pc-class-" + k
                + ".arms --out ${W}-" + k + " "), k + " step");
            String arms = Files.readString(Path.of("plans/pc-class-" + k + ".arms"));
            assertTrue(arms.contains("\nc | hadur117.Hadur " + version + " |") && arms.contains("\naa | hadur117.Hadur " + version + "aa |"));
            for (String a : e.getValue()) {
                assertTrue(arms.contains("\n" + a + " | hadur117.Hadur " + version + a + " |"), k + " arm " + a);
                assertTrue(queue.contains("bisect/hadur117.Hadur_${V}" + a + ".jar"), "prep builds " + a);
            }
        }
        assertTrue(queue.contains("SHIELD_ADD=plans/class-shield-add.txt SHIELD_STILL=plans/class-shield-add.txt bash ./build-ablation.sh slistadd,szlist &&")
            && queue.contains("POWER_CAP=plans/class-cap-add.txt bash ./build-ablation.sh pcaplist &&")
            && queue.contains("POWER_CAP5=plans/class-cap-add.txt bash ./build-ablation.sh pcap5list &&")
            && queue.contains("GUN_STACK=plans/class-gun-add.txt bash ./build-ablation.sh gslist &&")
            && queue.contains("X5_POWER=plans/class-gun-add.txt bash ./build-ablation.sh x5list &&"));
        assertTrue(queue.contains("mode_table.py ${W}-$k/arms.tsv --margin 3 "));
        for (String step : new String[] {"shield", "cap", "gun"}) {
            int at = queue.indexOf("\n" + step + " | ");
            String body = queue.substring(at, queue.indexOf("\n\n", at + 1));
            for (String rule : new String[] {"fails 30", "dead 8", "skips 60 over 200", "stall 30m", "aa after 20%"}) {
                assertTrue(body.contains("stop: " + rule), step + " " + rule);
            }
        }
        assertTrue(queue.contains("open_results_pr.sh claude/pc-class-1-results") && queue.contains("set P = --parallel 16 --no-truth-log"));
    }
}

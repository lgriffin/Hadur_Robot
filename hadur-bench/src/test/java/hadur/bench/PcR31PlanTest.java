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

/** BENCH-244: the pc-r31 card (plans/pc-r31.queue): every lever screened on the 31 real-gap robots, the picks locked. */
class PcR31PlanTest {

    private static final List<String> LEVERS = List.of("mtzl", "fq", "gl", "mq", "x5", "wl", "hl", "rp");

    private static List<String> names(String file) throws IOException {
        return Files.readAllLines(Path.of(file)).stream()
            .filter(l -> !l.isBlank() && !l.startsWith("#")).map(l -> l.split("\\|")[0].trim()).toList();
    }

    @Test
    @Tag("BENCH-244")
    @DisplayName("31 loadable robots, c/aa and 8 levers on 6 seeds, a 3-point pick, a 12 fresh-seed lock of the picks, stop rules, a results PR")
    void cardIsComplete() throws IOException {
        String queue = Files.readString(Path.of("plans/pc-r31.queue"));
        String version = Files.readString(Path.of("../hadur-robot/pom.xml"))
            .replaceAll("(?s).*<robot.release>(.*?)</robot.release>.*", "$1");
        assertTrue(queue.contains("set V = " + version + "\n"), "the card builds the current release");
        List<String> panel = names("panel-r31.txt");
        assertEquals(31, panel.size(), "the 31 real-gap robots");
        assertEquals(panel.size(), new HashSet<>(panel).size(), "no robot twice");
        assertEquals(panel, names("plans/r31-add.txt"), "one line per panel robot");
        java.util.Set<String> broken = Broken.names(Path.of(Broken.FILE));
        for (String n : panel) assertTrue(!broken.contains(n), n + " loads on 1.11.2");
        String arms = Files.readString(Path.of("plans/pc-r31.arms"));
        assertTrue(arms.contains("\nc | hadur117.Hadur " + version + " |") && arms.contains("\naa | hadur117.Hadur " + version + "aa |"));
        for (String a : LEVERS) {
            assertTrue(arms.contains("\n" + a + " | hadur117.Hadur " + version + a + " |"), a + " arm");
        }
        assertEquals(10, names("plans/pc-r31.arms").size(), "c, aa and the 8 levers");
        for (String b : new String[] {"SHIELD_ADD=plans/r31-add.txt SHIELD_STILL=plans/r31-add.txt bash ./build-ablation.sh slistadd,szlist",
                "FLAT_ON=plans/r31-add.txt bash ./build-ablation.sh fllist", "GUN_STACK=plans/r31-add.txt bash ./build-ablation.sh gslist",
                "MIMIC_ON=plans/r31-add.txt bash ./build-ablation.sh mmlist", "X5_POWER=plans/r31-add.txt bash ./build-ablation.sh x5list",
                "STOP_GO=plans/r31-add.txt bash ./build-ablation.sh sgolist", "HEAT_JIT=plans/r31-add.txt bash ./build-ablation.sh hjlist",
                "RACE_POWER=plans/r31-add.txt bash ./build-ablation.sh rplist"}) {
            assertTrue(queue.contains(b), b);
        }
        assertTrue(queue.contains("--set panel-r31.txt --seeds 6 --seed-base 20800 --arms plans/pc-r31.arms --out ${W} "), "the screen");
        assertTrue(queue.contains("mode_table.py ${W}/arms.tsv --margin 3 --out-tsv ${OUT}/pc-r31-pick.tsv"), "the screen pick");
        assertTrue(queue.contains("python3 tools/lock_prep.py ${OUT}/pc-r31-pick.tsv panel-r31.txt plans/pc-r31.arms ${L}-prep && bash ${L}-prep/build.sh"));
        assertTrue(Files.exists(Path.of("tools/lock_prep.py")));
        assertTrue(queue.contains("--set ${L}-prep/picks-panel.txt --seeds 12 --seed-base 21000 --arms ${L}-prep/lock.arms --out ${L} "), "the lock");
        assertTrue(queue.contains("lock_prep.py --restrict ${L}/arms.tsv ${L}-prep ${L}/arms-picked.tsv && python3 ../data/tools/mode_table.py ${L}/arms-picked.tsv --margin 0 --out-tsv ${OUT}/pc-r31-lock-pick.tsv"), "the gate, each robot on its own pick");
        assertTrue(queue.contains("set W = work/pc-r31-t3\n") && queue.contains("set L = work/pc-r31-t3-lock\n"), "fresh folders for the new constant");
        for (String step : new String[] {"screen", "lock"}) {
            int at = queue.indexOf("\n" + step + " | ");
            String body = queue.substring(at, queue.indexOf("\n\n", at + 1));
            for (String rule : new String[] {"fails 30", "dead 8", "skips 60 over 200", "stall 30m", "aa after 20%"}) {
                assertTrue(body.contains("stop: " + rule), step + " " + rule);
            }
        }
        assertTrue(queue.contains("--cpu-constant 3272413 "), "the live-like turn time (docs/bench/local/2026-11-14_night.md)");
        assertTrue(queue.contains("open_results_pr.sh claude/pc-r31-results") && queue.contains("set P = --parallel 16 --no-truth-log"));
    }
}

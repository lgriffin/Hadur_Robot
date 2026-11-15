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

/** BENCH-251: the pc-field-screen card (plans/pc-field-screen.queue): six levers on the shard-E gap robots, picks locked. */
class PcFieldScreenPlanTest {

    private static final List<String> LEVERS = List.of("fq", "x5", "hl", "dg", "gl", "mq");

    private static List<String> names(String file) throws IOException {
        return Files.readAllLines(Path.of(file)).stream()
            .filter(l -> !l.isBlank() && !l.startsWith("#")).map(l -> l.split("\\|")[0].trim()).toList();
    }

    @Test
    @Tag("BENCH-251")
    @DisplayName("pc-field-screen: loadable robots, c/aa and 6 levers on 6 seeds at the live constant after the live-match check, a 3-point pick, a 12 fresh-seed lock, a 0-margin gate, stop rules, a results PR")
    void cardIsComplete() throws IOException {
        String queue = Files.readString(Path.of("plans/pc-field-screen.queue"));
        String version = Files.readString(Path.of("../hadur-robot/pom.xml"))
            .replaceAll("(?s).*<robot.release>(.*?)</robot.release>.*", "$1");
        assertTrue(queue.contains("set V = " + version + "\n"));
        List<String> panel = names("panel-field-e.txt");
        assertEquals(93, panel.size(), "the shard-E robots");
        assertEquals(panel.size(), new HashSet<>(panel).size(), "no robot twice");
        assertEquals(panel, names("plans/field-e-add.txt"), "one line per panel robot");
        java.util.Set<String> broken = Broken.names(Path.of(Broken.FILE));
        for (String n : panel) assertTrue(!broken.contains(n), n + " loads on 1.11.2");
        String arms = Files.readString(Path.of("plans/pc-field-screen.arms"));
        assertTrue(arms.contains("\nc | hadur117.Hadur " + version + " |") && arms.contains("\naa | hadur117.Hadur " + version + "aa |"));
        for (String a : LEVERS) assertTrue(arms.contains("\n" + a + " | hadur117.Hadur " + version + a + " |"), a);
        assertEquals(8, names("plans/pc-field-screen.arms").size());
        for (String b : new String[] {"FLAT_ON=plans/field-e-add.txt bash ./build-ablation.sh fllist",
                "X5_POWER=plans/field-e-add.txt bash ./build-ablation.sh x5list", "HEAT_JIT=plans/field-e-add.txt bash ./build-ablation.sh hjlist",
                "SHOT_DODGE=plans/field-e-add.txt bash ./build-ablation.sh sdodgelist", "GUN_STACK=plans/field-e-add.txt bash ./build-ablation.sh gslist",
                "MIMIC_ON=plans/field-e-add.txt bash ./build-ablation.sh mmlist"}) {
            assertTrue(queue.contains(b), b);
        }
        assertTrue(queue.contains("--set panel-field-e.txt --seeds 6 --seed-base 35000 --arms plans/pc-field-screen.arms --out ${W} "));
        assertTrue(queue.contains("mode_table.py ${W}/arms.tsv --margin 3 --out-tsv ${OUT}/pc-field-screen-pick.tsv"));
        assertTrue(queue.contains("python3 tools/lock_prep.py ${OUT}/pc-field-screen-pick.tsv panel-field-e.txt plans/pc-field-screen.arms ${L}-prep && bash ${L}-prep/build.sh"));
        assertTrue(queue.contains("--set ${L}-prep/picks-panel.txt --seeds 12 --seed-base 35100 --arms ${L}-prep/lock.arms --out ${L} "));
        assertTrue(queue.contains("lock_prep.py --restrict ${L}/arms.tsv ${L}-prep ${L}/arms-picked.tsv && python3 ../data/tools/mode_table.py ${L}/arms-picked.tsv --margin 0"));
        for (String[] sr : new String[][] {{"screen", "skips 60 over 200", "aa after 20%"}, {"lock", "skips 60 over 24", "stall 30m"}}) {
            int at = queue.indexOf("\n" + sr[0] + " | ");
            String body = queue.substring(at, queue.indexOf("\n\n", at + 1));
            for (String rule : new String[] {"fails 30", "dead 8", "stall 30m", sr[1], sr[2]}) assertTrue(body.contains("stop: " + rule), sr[0] + " " + rule);
        }
        assertEquals(List.of(), PcLiveMatchPlanTest.violations("pc-field-screen.queue", queue), "BENCH-245 timing rule");
        assertTrue(queue.contains("Why it should win") && queue.contains("set ALERT = lgriffin"));
        assertTrue(queue.contains("open_results_pr.sh claude/pc-field-screen-results") && queue.contains("set P = --parallel 16 --no-truth-log"));
    }
}

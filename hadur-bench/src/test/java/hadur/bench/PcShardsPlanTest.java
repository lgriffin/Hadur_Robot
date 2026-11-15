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

/** BENCH-252: the pc-shards card (plans/pc-shards.queue): seven levers on the field shards' robots at PC scale, picks locked. */
class PcShardsPlanTest {

    private static final List<String> LEVERS = List.of("fq", "x5", "hl", "dg", "gl", "mq", "mtzl");

    private static List<String> names(String file) throws IOException {
        return Files.readAllLines(Path.of(file)).stream()
            .filter(l -> !l.isBlank() && !l.startsWith("#")).map(l -> l.split("\\|")[0].trim()).toList();
    }

    @Test
    @Tag("BENCH-252")
    @DisplayName("pc-shards: loadable robots, c/aa and 7 levers on 6 seeds at the live constant after the live-match check, a 3-point pick, a 12 fresh-seed lock, a 0-margin gate, stop rules, a results PR")
    void cardIsComplete() throws IOException {
        String queue = Files.readString(Path.of("plans/pc-shards.queue"));
        String version = Files.readString(Path.of("../hadur-robot/pom.xml"))
            .replaceAll("(?s).*<robot.release>(.*?)</robot.release>.*", "$1");
        assertTrue(queue.contains("set V = " + version + "\n"));
        List<String> panel = names("panel-shards.txt");
        assertTrue(panel.size() >= 400, "the shard robots (A-D, G, M, L and F's locks)");
        for (String f : new String[] {"com.spp.robocode.MostlyHarmless 010", "tm.Yuugao 1.0", "davidalves.net.DuelistMicro 1.22"}) {
            assertTrue(panel.contains(f), f + ": shard F's cloud locks ride in the panel");
        }
        assertEquals(panel.size(), new HashSet<>(panel).size(), "no robot twice");
        assertEquals(panel, names("plans/shards-add.txt"), "one line per panel robot");
        java.util.Set<String> broken = Broken.names(Path.of(Broken.FILE));
        for (String n : panel) assertTrue(!broken.contains(n), n + " loads on 1.11.2");
        String arms = Files.readString(Path.of("plans/pc-shards.arms"));
        assertTrue(arms.contains("\nc | hadur117.Hadur " + version + " |") && arms.contains("\naa | hadur117.Hadur " + version + "aa |"));
        for (String a : LEVERS) assertTrue(arms.contains("\n" + a + " | hadur117.Hadur " + version + a + " |"), a);
        assertEquals(9, names("plans/pc-shards.arms").size());
        for (String b : new String[] {"FLAT_ON=plans/shards-add.txt bash ./build-ablation.sh fllist",
                "X5_POWER=plans/shards-add.txt bash ./build-ablation.sh x5list", "HEAT_JIT=plans/shards-add.txt bash ./build-ablation.sh hjlist",
                "SHOT_DODGE=plans/shards-add.txt bash ./build-ablation.sh sdodgelist", "GUN_STACK=plans/shards-add.txt bash ./build-ablation.sh gslist",
                "MIMIC_ON=plans/shards-add.txt bash ./build-ablation.sh mmlist",
                "SHIELD_ADD=plans/shards-add.txt SHIELD_STILL=plans/shards-add.txt bash ./build-ablation.sh slistadd,szlist"}) {
            assertTrue(queue.contains(b), b);
        }
        assertTrue(queue.contains("--set panel-shards.txt --seeds 6 --seed-base 42000 --arms plans/pc-shards.arms --out ${W} "));
        assertTrue(queue.contains("mode_table.py ${W}/arms.tsv --margin 3 --out-tsv ${OUT}/pc-shards-pick.tsv"));
        assertTrue(queue.contains("python3 tools/lock_prep.py ${OUT}/pc-shards-pick.tsv panel-shards.txt plans/pc-shards.arms ${L}-prep && bash ${L}-prep/build.sh"));
        assertTrue(queue.contains("--set ${L}-prep/picks-panel.txt --seeds 12 --seed-base 42100 --arms ${L}-prep/lock.arms --out ${L} "));
        assertTrue(queue.contains("lock_prep.py --restrict ${L}/arms.tsv ${L}-prep ${L}/arms-picked.tsv && python3 ../data/tools/mode_table.py ${L}/arms-picked.tsv --margin 0"));
        for (String[] sr : new String[][] {{"screen", "skips 60 over 200", "aa after 20%"}, {"lock", "skips 60 over 24", "stall 30m"}}) {
            int at = queue.indexOf("\n" + sr[0] + " | ");
            String body = queue.substring(at, queue.indexOf("\n\n", at + 1));
            for (String rule : new String[] {"fails 30", "dead 8", "stall 30m", sr[1], sr[2]}) assertTrue(body.contains("stop: " + rule), sr[0] + " " + rule);
        }
        assertEquals(List.of(), PcLiveMatchPlanTest.violations("pc-shards.queue", queue), "BENCH-245 timing rule");
        assertTrue(queue.contains("Why it should win") && queue.contains("set ALERT = lgriffin"));
        assertTrue(queue.contains("open_results_pr.sh claude/pc-shards-results") && queue.contains("set P = --parallel 16 --no-truth-log"));
    }
}

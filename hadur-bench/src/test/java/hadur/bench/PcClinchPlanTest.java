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

/** BENCH-299: the pc-clinch card (plans/pc-clinch.queue), MOVE-75's contact break over the live field. */
class PcClinchPlanTest {

    @Test
    @Tag("BENCH-299")
    @DisplayName("pc-clinch: c, aa, cb and cbe on the live field, 2 fresh seeds, after the live-match check; stop rules; two gates; a results PR")
    void cardIsComplete() throws IOException {
        String queue = Files.readString(Path.of("plans/pc-clinch.queue"));
        String version = Files.readString(Path.of("../hadur-robot/pom.xml"))
            .replaceAll("(?s).*<robot.release>(.*?)</robot.release>.*", "$1");
        assertTrue(queue.contains("set V = " + version + "\n"), "the card builds the current release");
        String arms = Files.readString(Path.of("plans/pc-clinch.arms"));
        assertTrue(arms.contains("\nc | hadur117.Hadur " + version + " | bisect/hadur117.Hadur_" + version + ".jar\n"));
        for (String[] a : new String[][] {{"aa", "aa"}, {"cb", "cb"}, {"cbe", "cbnerwa"}}) {
            assertTrue(arms.contains("\n" + a[0] + " | hadur117.Hadur " + version + a[1] + " | bisect/hadur117.Hadur_"
                + version + a[1] + ".jar"), a[0]);
            assertTrue(queue.contains("test -f bisect/hadur117.Hadur_${V}" + a[1] + ".jar") || a[0].equals("aa"), a[0] + " built");
        }
        assertTrue(queue.contains("bash ./build-ablation.sh clinch &&") && queue.contains("bash ./build-ablation.sh clinch,fin,rwall &&"));
        assertTrue(queue.contains("--set census-live.txt --seeds 2 --seed-base 125000 --arms plans/pc-clinch.arms --out ${W} "));
        assertTrue(queue.contains("--shuffle-jobs\n  after: livematch\n"), "the field waits for the live-match check");
        for (String r : List.of("stop: fails 30", "stop: dead 8", "stop: stall 30m", "stop: aa after 20%",
                "stop: futility cb,cbe below 0.02 after 30%")) {
            assertTrue(queue.contains("  " + r + "\n"), r);
        }
        assertTrue(queue.contains("--arm cb --panel census-live.txt --field 1217 --bar 0.02"));
        assertTrue(queue.contains("--arm cbe --panel census-live.txt --field 1217 --bar 0.02"));
        assertEquals(List.of(), PcLiveMatchPlanTest.violations("pc-clinch.queue", queue), "BENCH-245 timing rule");
        assertTrue(queue.contains("open_results_pr.sh claude/pc-clinch-results"));
        assertTrue(queue.contains("Why it should win") && queue.contains("set ALERT = lgriffin"));
        String build = Files.readString(Path.of("build-ablation.sh"));
        assertTrue(build.contains("static final boolean CLINCH_BREAK = false;"), "the ablation turns MOVE-75 on");
    }
}

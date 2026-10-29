package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** BENCH-139: the pc-team-dodge card (Ogi's dodge whole: global gate, per-team pick and gate) is complete before it reaches the PC. */
class TeamDodgePlanTest {

    private static final Path QUEUE = Path.of("plans/pc-team-dodge.queue");

    @Test
    @Tag("BENCH-139")
    @DisplayName("the steps chain from prep through bb, dg, the global gate, the pick and the picked gate to a results PR, on the version the pom names")
    void stepsChain() throws IOException {
        String queue = Files.readString(QUEUE);
        String[] steps = {"tdprep", "tdbb", "tddg", "tdglob", "tdpick", "tdgate", "tdgbb", "tdsum", "tdpr"};
        for (int i = 1; i < steps.length; i++) {
            int at = queue.indexOf("\n" + steps[i] + " ");
            assertTrue(at >= 0, steps[i]);
            int end = queue.indexOf("\n", queue.indexOf("\n", at + 1) + 1);
            assertTrue(queue.substring(at, end < 0 ? queue.length() : end).contains("after: " + steps[i - 1]),
                steps[i] + " after " + steps[i - 1]);
        }
        assertTrue(queue.contains("<robot.release>"), "the version comes from the pom");
        assertFalse(queue.matches("(?s).*HadurTeam_3\\.\\d.*"), "no robot version is hard-coded");
        for (String a : List.of("aa", "bb", "tmdodge", "tmlock")) {
            assertTrue(queue.contains("bash ./build-ablation.sh " + a), a + " is built");
        }
        assertTrue(queue.contains("gate --report ${OUT}/team-dodge-dg.md --control ${OUT}/team-dodge-bb.md --set team-census46.txt --seeds 12 --teams 46 --min-aps 0.3"),
            "the global gate pools every team, each fully paired");
        assertTrue(queue.contains("pick --report DODGE=${OUT}/team-dodge-dg.md --control DODGE=${OUT}/team-dodge-bb.md --min-mean 3.0 --low-end 0 --base MATEFIRE,HUNT --shipped ../hadur-core/src/main/java/hadur117/core/melee/TeamModes.java"),
            "picks against both baselines, and a named team keeps its entry's modes");
        assertTrue(queue.contains("--set work/team-dodge-gate.txt --seeds 16 --teams 46 --min-aps 0.3"), "the picked gate needs every team fully paired");
        assertTrue(queue.contains("grep -q '\\*\\*PASS\\*\\*' ${OUT}/team-dodge-verdict.md; then cp work/team-dodge-picked.java"),
            "only a passed gate writes the table to ship");
        assertTrue(queue.contains("rm -f ${OUT}/team-dodge-*.md ${OUT}/team-dodge-pick.tsv ${OUT}/team-dodge-locked.java.txt work/team-dodge-picked.java"),
            "a rerun never carries an old table");
        assertTrue(queue.contains("rm -rf work/team-dodge-\"$V\"-bb work/team-dodge-\"$V\"-dg"),
            "a fresh run never resumes battles an earlier build fought");
        assertFalse(queue.contains("; true"), "a failed step stops the queue");
        assertTrue(queue.contains("open_results_pr.sh claude/pc-team-dodge-results"));
        for (String step : List.of("tdbb", "tddg", "tdgate", "tdgbb")) {
            int at = queue.indexOf("\n" + step + " ");
            int next = queue.indexOf("\ntd", at + 1);
            String block = queue.substring(at, next < 0 ? queue.length() : next);
            for (String rule : List.of("stop: fails 20", "stop: stall 30m", "stop: skips 40 over 100")) {
                assertTrue(block.contains(rule), step + " declares " + rule);
            }
        }
        assertTrue(queue.contains("watch: battles=1104"), "the page states what a stop leaves unrun");
    }

    @Test
    @Tag("BENCH-139")
    @DisplayName("each screen shares seeds with its A/A; the gate runs fresh seeds on the picked teams beside its own A/A")
    void args() throws IOException {
        for (String[] a : List.of(new String[] {"bb", "bb", "team-census46.txt", "12", "5400"},
                                  new String[] {"dg", "dg", "team-census46.txt", "12", "5400"},
                                  new String[] {"gate", "mk", "work/team-dodge-gate.txt", "16", "5500"},
                                  new String[] {"gbb", "bb", "work/team-dodge-gate.txt", "16", "5500"})) {
            String args = Files.readString(Path.of("plans/team-dodge-" + a[0] + ".args"));
            assertTrue(args.contains("--set\n" + a[2] + "\n"), a[0]);
            assertTrue(args.contains("--seeds\n" + a[3] + "\n") && args.contains("--seed-base\n" + a[4] + "\n"), a[0]);
            assertTrue(args.contains("bisect/hadur117.HadurTeam_@V@" + a[1] + ".jar"), a[0]);
            assertTrue(args.contains("--baseline\nbisect/hadur117.HadurTeam_@V@aa.jar\n"), a[0]);
            assertTrue(args.contains("--report\n../docs/bench/local/team-dodge-" + a[0] + ".md\n"), a[0]);
            assertTrue(args.contains("--out\nwork/team-dodge-@V@-" + a[0] + "\n"), a[0]);
            assertTrue(args.contains("--parallel\nauto\n") && args.contains("--cpu-constant\nauto\n"), a[0]);
        }
    }
}

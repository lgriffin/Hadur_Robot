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

/** BENCH-142: the pc-team-dodge2 card (DODGE on every team, with and without own fire, fresh-seed confirm) is complete before it reaches the PC. */
class TeamDodge2PlanTest {

    private static final Path QUEUE = Path.of("plans/pc-team-dodge2.queue");

    @Test
    @Tag("BENCH-142")
    @DisplayName("the steps chain from prep through bb, dg and df to a pooled gate per arm and a results PR, on the version the pom names")
    void stepsChain() throws IOException {
        String queue = Files.readString(QUEUE);
        String[] steps = {"d2prep", "d2bb", "d2dg", "d2df", "d2sdg", "d2sdf", "d2pr"};
        for (int i = 1; i < steps.length; i++) {
            int at = queue.indexOf("\n" + steps[i] + " ");
            assertTrue(at >= 0, steps[i]);
            int end = queue.indexOf("\n", queue.indexOf("\n", at + 1) + 1);
            assertTrue(queue.substring(at, end < 0 ? queue.length() : end).contains("after: " + steps[i - 1]),
                steps[i] + " after " + steps[i - 1]);
        }
        assertTrue(queue.contains("<robot.release>"), "the version comes from the pom");
        assertFalse(queue.matches("(?s).*HadurTeam_3\\.\\d.*"), "no robot version is hard-coded");
        for (String a : List.of("aa", "bb", "tmdodge", "tmdodge,tmdodgef")) {
            assertTrue(queue.contains("bash ./build-ablation.sh " + a), a + " is built");
        }
        for (String a : List.of("dg", "df")) {
            assertTrue(queue.contains("gate --report ${OUT}/team-dodge2-" + a + ".md --control ${OUT}/team-dodge2-bb.md --set team-census46.txt --seeds 16 --teams 46 --min-aps 0.3"),
                a + ": the gate pools every team, each fully paired");
        }
        assertTrue(queue.contains("rm -f ${OUT}/team-dodge2-*.md"), "a rerun never carries an old verdict");
        assertTrue(queue.contains("rm -rf work/team-dodge2-\"$V\"-bb work/team-dodge2-\"$V\"-dg work/team-dodge2-\"$V\"-df"),
            "a fresh run never resumes battles an earlier build fought");
        assertFalse(queue.contains("; true"), "a failed step stops the queue");
        assertTrue(queue.contains("open_results_pr.sh claude/pc-team-dodge2-results"));
        for (String step : List.of("d2bb", "d2dg", "d2df")) {
            int at = queue.indexOf("\n" + step + " ");
            int next = queue.indexOf("\nd2", at + 1);
            String block = queue.substring(at, next < 0 ? queue.length() : next);
            for (String rule : List.of("watch: battles=1472", "stop: fails 20", "stop: stall 30m", "stop: skips 40 over 100")) {
                assertTrue(block.contains(rule), step + " declares " + rule);
            }
        }
    }

    @Test
    @Tag("BENCH-142")
    @DisplayName("dg, df and their A/A share 16 fresh seeds from 5600 at 12 rounds on all 46 teams against aa")
    void args() throws IOException {
        for (String[] a : List.of(new String[] {"bb", "bb"}, new String[] {"dg", "dg"}, new String[] {"df", "dgof"})) {
            String args = Files.readString(Path.of("plans/team-dodge2-" + a[0] + ".args"));
            assertTrue(args.contains("--set\nteam-census46.txt\n"), a[0]);
            assertTrue(args.contains("--seeds\n16\n") && args.contains("--rounds\n12\n") && args.contains("--seed-base\n5600\n"), a[0]);
            assertTrue(args.contains("bisect/hadur117.HadurTeam_@V@" + a[1] + ".jar"), a[0]);
            assertTrue(args.contains("--baseline\nbisect/hadur117.HadurTeam_@V@aa.jar\n"), a[0]);
            assertTrue(args.contains("--report\n../docs/bench/local/team-dodge2-" + a[0] + ".md\n"), a[0]);
            assertTrue(args.contains("--out\nwork/team-dodge2-@V@-" + a[0] + "\n"), a[0]);
            assertTrue(args.contains("--parallel\nauto\n") && args.contains("--cpu-constant\nauto\n"), a[0]);
        }
    }
}

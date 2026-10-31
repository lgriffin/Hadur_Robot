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

/** BENCH-153: the pc-team-concord2 card (the team brain on every team, on fresh seeds) is complete before it reaches the PC. */
class TeamConcord2PlanTest {

    private static final Path QUEUE = Path.of("plans/pc-team-concord2.queue");

    private static String block(String queue, String step) {
        int at = queue.indexOf("\n" + step + " ");
        assertTrue(at >= 0, step);
        int next = queue.indexOf("\nc2", at + 1);
        return queue.substring(at, next < 0 ? queue.length() : next);
    }

    @Test
    @Tag("BENCH-153")
    @DisplayName("the steps chain from prep through the A/A and the shipped arm to a pooled gate and a results PR")
    void stepsChain() throws IOException {
        String queue = Files.readString(QUEUE);
        String[] steps = {"c2prep", "c2bb", "c2on", "c2sum", "c2pr"};
        for (int i = 1; i < steps.length; i++) {
            assertTrue(block(queue, steps[i]).contains("after: " + steps[i - 1]), steps[i] + " after " + steps[i - 1]);
        }
        assertTrue(queue.contains("<robot.release>"), "the version comes from the pom");
        assertFalse(queue.matches("(?s).*HadurTeam_3\\.\\d.*"), "no robot version is hard-coded");
        assertTrue(queue.contains("bash ./build-ablation.sh tmnoconcord && bash ./build-ablation.sh bb,tmnoconcord"));
        assertTrue(queue.contains("rm -f ${OUT}/team-concord2-*.md"), "a rerun never carries an old verdict");
        assertTrue(block(queue, "c2sum").contains("--report ${OUT}/team-concord2-on.md --control ${OUT}/team-concord2-bb.md --set team-census46.txt --seeds 16 --teams 46 --min-aps 0.3"));
        assertTrue(queue.contains("open_results_pr.sh claude/pc-team-concord2-results"));
        for (String step : List.of("c2bb", "c2on")) {
            assertTrue(block(queue, step).contains("watch: battles=1472"), step);
            for (String rule : List.of("stop: fails 20", "stop: stall 30m", "stop: skips 40 over 100")) {
                assertTrue(block(queue, step).contains(rule), step + " declares " + rule);
            }
        }
    }

    @Test
    @Tag("BENCH-153")
    @DisplayName("both arms play all 46 teams at 16 fresh seeds from 6900 against ncn, the build before CONCORD shipped")
    void args() throws IOException {
        for (String a : List.of("bb", "on")) {
            String args = Files.readString(Path.of("plans/team-concord2-" + a + ".args"));
            String jar = a.equals("on") ? "aa" : "bbncn";
            assertTrue(args.contains("--seeds\n16\n") && args.contains("--rounds\n10\n"), a);
            assertTrue(args.contains("--seed-base\n6900\n"), a);
            assertTrue(args.contains("--set\nteam-census46.txt\n"), a);
            assertTrue(args.contains("bisect/hadur117.HadurTeam_@V@" + jar + ".jar"), a);
            assertTrue(args.contains("--baseline\nbisect/hadur117.HadurTeam_@V@ncn.jar\n"), a);
            assertTrue(args.contains("--report\n../docs/bench/local/team-concord2-" + a + ".md\n"), a);
            assertTrue(args.contains("--out\nwork/team-concord2-@V@-" + a + "\n"), a);
        }
    }
}

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

/** BENCH-150: the pc-team-concord card (the team brain, globally and per team, on the whole field) is complete before it reaches the PC. */
class TeamConcordPlanTest {

    private static final Path QUEUE = Path.of("plans/pc-team-concord.queue");

    private static String block(String queue, String step) {
        int at = queue.indexOf("\n" + step + " ");
        assertTrue(at >= 0, step);
        int next = queue.indexOf("\ncc", at + 1);
        return queue.substring(at, next < 0 ? queue.length() : next);
    }

    @Test
    @Tag("BENCH-150")
    @DisplayName("the steps chain from prep through two screens, a global gate, a pick, a gate and its A/A to a verdict and a results PR")
    void stepsChain() throws IOException {
        String queue = Files.readString(QUEUE);
        String[] steps = {"ccprep", "ccbb", "cccn", "ccglob", "ccpick", "ccgate", "ccgbb", "ccsum", "ccpr"};
        for (int i = 1; i < steps.length; i++) {
            assertTrue(block(queue, steps[i]).contains("after: " + steps[i - 1]), steps[i] + " after " + steps[i - 1]);
        }
        assertTrue(queue.contains("<robot.release>"), "the version comes from the pom");
        assertFalse(queue.matches("(?s).*HadurTeam_3\\.\\d.*"), "no robot version is hard-coded");
        assertTrue(queue.contains("bash ./build-ablation.sh tmconcord"));
        assertTrue(queue.contains("rm -f ${OUT}/team-concord-*.md"), "a rerun never carries an old verdict");
        assertTrue(block(queue, "ccglob").contains("--set team-census46.txt --seeds 12 --teams 46 --min-aps 0.3"));
        assertTrue(block(queue, "ccpick").contains("--report CONCORD=${OUT}/team-concord-cn.md --control CONCORD=${OUT}/team-concord-bb.md --min-mean 3.0 --low-end 0 --base MATEFIRE,HUNT,PATH,DODGE --shipped"));
        assertTrue(block(queue, "ccpick").contains("TEAM_MODE_LOCKED=\"$(pwd)/work/team-concord-picked.java\" bash ./build-ablation.sh tmlock"));
        assertTrue(block(queue, "ccsum").contains("--set work/team-concord-gate.txt --seeds 16 --teams 46 --min-aps 0.15"));
        assertTrue(queue.contains("open_results_pr.sh claude/pc-team-concord-results"));
        for (String step : List.of("ccbb", "cccn")) {
            assertTrue(block(queue, step).contains("watch: battles=1104"), step);
        }
        for (String step : List.of("ccbb", "cccn", "ccgate", "ccgbb")) {
            for (String rule : List.of("stop: fails 20", "stop: stall 30m", "stop: skips 40 over 100")) {
                assertTrue(block(queue, step).contains(rule), step + " declares " + rule);
            }
        }
    }

    @Test
    @Tag("BENCH-150")
    @DisplayName("bb and cn screen all 46 teams at 12 seeds from 6700; the gate and its A/A use 16 fresh seeds from 6800 on the picked set")
    void args() throws IOException {
        for (String a : List.of("bb", "cn", "gate", "gbb")) {
            String args = Files.readString(Path.of("plans/team-concord-" + a + ".args"));
            boolean screen = a.equals("bb") || a.equals("cn");
            String jar = a.equals("gate") ? "mk" : a.equals("gbb") ? "bb" : a;
            assertTrue(args.contains("--seeds\n" + (screen ? "12" : "16") + "\n") && args.contains("--rounds\n10\n"), a);
            assertTrue(args.contains("--seed-base\n" + (screen ? "6700" : "6800") + "\n"), a);
            assertTrue(args.contains("--set\n" + (screen ? "team-census46.txt" : "work/team-concord-gate.txt") + "\n"), a);
            assertTrue(args.contains("bisect/hadur117.HadurTeam_@V@" + jar + ".jar"), a);
            assertTrue(args.contains("--baseline\nbisect/hadur117.HadurTeam_@V@aa.jar\n"), a);
            assertTrue(args.contains("--report\n../docs/bench/local/team-concord-" + a + ".md\n"), a);
            assertTrue(args.contains("--out\nwork/team-concord-@V@-" + a + "\n"), a);
        }
    }
}

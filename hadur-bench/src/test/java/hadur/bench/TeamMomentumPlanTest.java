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

/** BENCH-171: the pc-team-momentum card (MOMENTUM on every team beside a bb A/A, own-fire read, gate) is complete before it reaches the PC. */
class TeamMomentumPlanTest {

    private static final Path QUEUE = Path.of("plans/pc-team-momentum.queue");

    private static String block(String queue, String step) {
        int at = queue.indexOf("\n" + step + " ");
        assertTrue(at >= 0, step);
        int next = queue.indexOf("\nmt", at + 1);
        return queue.substring(at, next < 0 ? queue.length() : next);
    }

    @Test
    @Tag("BENCH-171")
    @DisplayName("the steps chain from prep through the A/A and MOMENTUM to the own-fire read, the gate and a results PR")
    void stepsChain() throws IOException {
        String queue = Files.readString(QUEUE);
        String[] steps = {"mtprep", "mtbb", "mtmo", "mtff", "mtsum", "mtpr"};
        for (int i = 1; i < steps.length; i++) {
            assertTrue(block(queue, steps[i]).contains("after: " + steps[i - 1]), steps[i] + " after " + steps[i - 1]);
        }
        assertTrue(queue.contains("<robot.release>"), "the version comes from the pom");
        assertFalse(queue.matches("(?s).*HadurTeam_3\\.\\d.*"), "no robot version is hard-coded");
        assertTrue(queue.contains("bash ./build-ablation.sh aa && bash ./build-ablation.sh bb && bash ./build-ablation.sh tmmomentum"));
        assertTrue(queue.contains("rm -f ${OUT}/team-momentum-*.md"), "a rerun never carries an old verdict");
        assertTrue(block(queue, "mtff").contains("tools/friendly_hits.py --candidate-only"));
        assertTrue(block(queue, "mtsum").contains("--report ${OUT}/team-momentum-mo.md --control ${OUT}/team-momentum-bb.md --seeds 12 --teams 46 --min-aps 0.3"));
        assertTrue(queue.contains("open_results_pr.sh claude/pc-team-momentum-results"));
        for (String step : List.of("mtbb", "mtmo")) {
            assertTrue(block(queue, step).contains(".args\" || test $? -eq 1"), step + " goes on past failed battles");
            assertTrue(block(queue, step).contains("watch: battles=1080"), step);
            for (String rule : List.of("stop: fails 60", "stop: stall 30m", "stop: skips 40 over 100")) {
                assertTrue(block(queue, step).contains(rule), step + " declares " + rule);
            }
        }
    }

    @Test
    @Tag("BENCH-171")
    @DisplayName("both arms play the 45 loadable teams at 12 seeds from 7700, 10 rounds, against aa")
    void args() throws IOException {
        for (String a : List.of("bb", "mo")) {
            String args = Files.readString(Path.of("plans/team-momentum-" + a + ".args"));
            assertTrue(args.contains("--seeds\n12\n") && args.contains("--seed-base\n7700\n") && args.contains("--rounds\n10\n"), a);
            assertTrue(args.contains("--set\nplans/team-angles-set.txt\n"), a);
            assertTrue(args.contains("bisect/hadur117.HadurTeam_@V@" + a + ".jar"), a);
            assertTrue(args.contains("--out\nwork/team-momentum-@V@-" + a + "\n"), a);
            assertTrue(args.contains("--report\n../docs/bench/local/team-momentum-" + a + ".md\n"), a);
            assertTrue(args.contains("--baseline\nbisect/hadur117.HadurTeam_@V@aa.jar\n"), a);
        }
    }
}

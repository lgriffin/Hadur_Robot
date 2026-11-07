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

/** BENCH-205: the pc-team-close card (CLOSE on every team, confirmed field-wide) is complete before it reaches the PC. */
class TeamClosePlanTest {

    private static final Path QUEUE = Path.of("plans/pc-team-close.queue");

    private static String block(String queue, String step) {
        int at = queue.indexOf("\n" + step + " ");
        assertTrue(at >= 0, step);
        int next = queue.indexOf("\ntc", at + 1);
        return queue.substring(at, next < 0 ? queue.length() : next);
    }

    @Test
    @Tag("BENCH-205")
    @DisplayName("the steps chain from prep through the 4-seed pilot and its gate to the 12-seed read, the gate and a results PR, on the version the pom names")
    void stepsChain() throws IOException {
        String queue = Files.readString(QUEUE);
        String[] steps = {"tcprep", "tcbb1", "tctc1", "tcpilot", "tcbb2", "tctc2", "tcgate", "tcpr"};
        for (int i = 1; i < steps.length; i++) {
            assertTrue(block(queue, steps[i]).contains("after: " + steps[i - 1]), steps[i] + " after " + steps[i - 1]);
        }
        assertTrue(queue.contains("<robot.release>"), "the version comes from the pom");
        assertFalse(queue.matches("(?s).*HadurTeam_3\\.\\d.*"), "no robot version is hard-coded");
        for (String a : List.of("aa", "bb", "tmclose")) assertTrue(queue.contains("bash ./build-ablation.sh " + a), a + " is built");
        assertTrue(queue.contains("rm -f ${OUT}/team-close-*.md"), "a rerun never carries an old verdict");
        assertTrue(block(queue, "tcpilot").contains("gate --report ${OUT}/team-close-tc.md --control ${OUT}/team-close-bb.md --teams 46 --min-aps 0.15 --stop-below 0"),
            "the pilot stops the card under zero against both baselines");
        assertTrue(block(queue, "tcpilot").contains("open_results_pr.sh claude/pc-team-close-results") && block(queue, "tcpilot").contains("exit 1;"),
            "a stopped pilot opens the results PR and ends the card");
        assertTrue(block(queue, "tcgate").contains("gate --report ${OUT}/team-close-tc.md --control ${OUT}/team-close-bb.md --teams 46 --min-aps 0.15 --out-md"));
        assertTrue(block(queue, "tcpr").contains("open_results_pr.sh claude/pc-team-close-results"));
        for (String step : List.of("tcbb1", "tctc1")) assertTrue(block(queue, step).contains("-4.args") && block(queue, step).contains("watch: battles=368"), step);
        for (String step : List.of("tcbb2", "tctc2")) assertTrue(block(queue, step).contains("-12.args") && block(queue, step).contains("watch: battles=1104"), step);
        for (String step : List.of("tcbb1", "tctc1", "tcbb2", "tctc2")) {
            for (String rule : List.of("stop: fails 60", "stop: stall 30m", "stop: skips 60 over 200")) {
                assertTrue(block(queue, step).contains(rule), step + " declares " + rule);
            }
        }
    }

    @Test
    @Tag("BENCH-205")
    @DisplayName("bb and tc pair with aa on the 46 teams from seed 9600 at 12 rounds; the seeds are the pilot's 4 or the read's 12, into one out directory")
    void args() throws IOException {
        for (String a : List.of("bb", "tc")) {
            String args = Files.readString(Path.of("plans/team-close-" + a + ".args"));
            assertTrue(args.contains("--set\nteam-census46.txt\n"), a);
            assertTrue(args.contains("--seeds\n@S@\n") && args.contains("--rounds\n12\n") && args.contains("--seed-base\n9600\n"), a);
            assertTrue(args.contains("bisect/hadur117.HadurTeam_@V@" + a + ".jar"), a);
            assertTrue(args.contains("--baseline\nbisect/hadur117.HadurTeam_@V@aa.jar\n"), a);
            assertTrue(args.contains("--report\n../docs/bench/local/team-close-" + a + ".md\n"), a);
            assertTrue(args.contains("--out\nwork/team-close-@V@-" + a + "\n"), a);
            assertFalse(args.matches("(?s).*3\\.[12]\\d.*"), "names no version");
        }
    }
}

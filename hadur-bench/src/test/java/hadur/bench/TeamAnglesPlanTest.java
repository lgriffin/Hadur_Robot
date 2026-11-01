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

/** BENCH-167: the pc-team-angles card (HEAVY, WARY and DISABLED on every team, per-team pick and gate) is complete before it reaches the PC. */
class TeamAnglesPlanTest {

    private static final Path QUEUE = Path.of("plans/pc-team-angles.queue");

    private static String block(String queue, String step) {
        int at = queue.indexOf("\n" + step + " ");
        assertTrue(at >= 0, step);
        int next = queue.indexOf("\nan", at + 1);
        return queue.substring(at, next < 0 ? queue.length() : next);
    }

    @Test
    @Tag("BENCH-167")
    @DisplayName("the steps chain from prep through the A/A and three arms to the pick, a fresh-seed gate and a results PR")
    void stepsChain() throws IOException {
        String queue = Files.readString(QUEUE);
        String[] steps = {"anprep", "anbb", "anhv", "anwy", "anmd", "anglob", "anpick", "angate", "angbb", "ansum", "anpr"};
        for (int i = 1; i < steps.length; i++) {
            assertTrue(block(queue, steps[i]).contains("after: " + steps[i - 1]), steps[i] + " after " + steps[i - 1]);
        }
        assertTrue(queue.contains("<robot.release>"), "the version comes from the pom");
        assertFalse(queue.matches("(?s).*HadurTeam_3\\.\\d.*"), "no robot version is hard-coded");
        assertTrue(queue.contains("bash ./build-ablation.sh tmheavy && bash ./build-ablation.sh tmwary && bash ./build-ablation.sh tmdis"));
        assertTrue(queue.contains("rm -f ${OUT}/team-angles-*.md"), "a rerun never carries an old verdict");
        String pick = block(queue, "anpick");
        for (String m : List.of("HEAVY=", "WARY=", "DISABLED=")) assertTrue(pick.contains("--report " + m), m);
        assertTrue(pick.contains("--min-mean 3.0 --low-end 0 --base MATEFIRE,HUNT,PATH,DODGE,CONCORD"));
        assertTrue(block(queue, "ansum").contains("--seeds 16 --teams 46 --min-aps 0.15"));
        assertTrue(queue.contains("open_results_pr.sh claude/pc-team-angles-results"));
        for (String step : List.of("anbb", "anhv", "anwy", "anmd", "angate", "angbb")) {
            for (String rule : List.of("stop: fails 20", "stop: stall 30m", "stop: skips 40 over 100")) {
                assertTrue(block(queue, step).contains(rule), step + " declares " + rule);
            }
        }
    }

    @Test
    @Tag("BENCH-167")
    @DisplayName("the screens play all 46 teams at 8 seeds from 7400 and the gate 16 fresh seeds from 7500, all against aa")
    void args() throws IOException {
        for (String a : List.of("bb", "hv", "wy", "md")) {
            String args = Files.readString(Path.of("plans/team-angles-" + a + ".args"));
            assertTrue(args.contains("--seeds\n8\n") && args.contains("--seed-base\n7400\n") && args.contains("--rounds\n10\n"), a);
            assertTrue(args.contains("--set\nteam-census46.txt\n"), a);
            assertTrue(args.contains("bisect/hadur117.HadurTeam_@V@" + a + ".jar"), a);
            assertTrue(args.contains("--baseline\nbisect/hadur117.HadurTeam_@V@aa.jar\n"), a);
        }
        for (String a : List.of("gate", "gbb")) {
            String args = Files.readString(Path.of("plans/team-angles-" + a + ".args"));
            assertTrue(args.contains("--seeds\n16\n") && args.contains("--seed-base\n7500\n"), a);
            assertTrue(args.contains("--set\nwork/team-angles-gate.txt\n"), a);
        }
    }
}

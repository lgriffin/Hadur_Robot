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

/** BENCH-166: the pc-team-mirror card (OgiTeam and HadurTeam on the same teams and seeds) is complete before it reaches the PC. */
class TeamMirrorPlanTest {

    private static final Path QUEUE = Path.of("plans/pc-team-mirror.queue");

    private static String block(String queue, String step) {
        int at = queue.indexOf("\n" + step + " ");
        assertTrue(at >= 0, step);
        int next = queue.indexOf("\nmr", at + 1);
        return queue.substring(at, next < 0 ? queue.length() : next);
    }

    @Test
    @Tag("BENCH-166")
    @DisplayName("the steps chain from prep through both subjects to the mirror read and a results PR")
    void stepsChain() throws IOException {
        String queue = Files.readString(QUEUE);
        String[] steps = {"mrprep", "mrogi", "mrhad", "mrread", "mrpr"};
        for (int i = 1; i < steps.length; i++) {
            assertTrue(block(queue, steps[i]).contains("after: " + steps[i - 1]), steps[i] + " after " + steps[i - 1]);
        }
        assertTrue(queue.contains("<robot.release>"), "the version comes from the pom");
        assertFalse(queue.matches("(?s).*HadurTeam_3\\.\\d.*"), "no robot version is hard-coded");
        assertTrue(queue.contains("bash ./build-ablation.sh aa"));
        assertTrue(queue.contains("rm -f ${OUT}/team-mirror*.md"), "a rerun never carries an old read");
        assertTrue(block(queue, "mrread").contains("tools/team_mirror.py --ogi work/team-mirror-\"$V\"-ogi --hadur work/team-mirror-\"$V\"-hadur"));
        assertTrue(queue.contains("open_results_pr.sh claude/pc-team-mirror-results"));
        for (String step : List.of("mrogi", "mrhad")) {
            assertTrue(block(queue, step).contains("watch: battles=540"), step);
            for (String rule : List.of("stop: fails 20", "stop: stall 30m", "stop: skips 60 over 200")) {
                assertTrue(block(queue, step).contains(rule), step + " declares " + rule);
            }
        }
    }

    @Test
    @Tag("BENCH-166")
    @DisplayName("both subjects play the 45 other teams at the same 12 seeds from 7300, with no baseline")
    void args() throws IOException {
        List<String> set = Files.readAllLines(Path.of("plans/team-mirror-set.txt"));
        assertTrue(set.stream().filter(l -> !l.startsWith("#") && !l.isBlank()).count() == 45, "45 teams");
        assertFalse(set.stream().anyMatch(l -> l.startsWith("cz.libors.OgiTeam")), "Ogi is a subject, not an opponent");
        for (String a : List.of("ogi", "hadur")) {
            String args = Files.readString(Path.of("plans/team-mirror-" + a + ".args"));
            assertTrue(args.contains("--seeds\n12\n") && args.contains("--rounds\n10\n"), a);
            assertTrue(args.contains("--seed-base\n7300\n"), a);
            assertTrue(args.contains("--set\nplans/team-mirror-set.txt\n"), a);
            assertFalse(args.contains("--baseline"), a);
            assertTrue(args.contains("--out\nwork/team-mirror-@V@-" + a + "\n"), a);
        }
        assertTrue(Files.readString(Path.of("plans/team-mirror-ogi.args")).contains("--member\ncz.libors.Ogi\n"));
        assertTrue(Files.readString(Path.of("plans/team-mirror-hadur.args")).contains("bisect/hadur117.HadurTeam_@V@aa.jar"));
    }
}

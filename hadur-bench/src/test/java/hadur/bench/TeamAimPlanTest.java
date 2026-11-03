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

/** BENCH-172: the pc-team-aim card (pilot, screen, per-team pick, fresh-seed gate) is complete before it reaches the PC. */
class TeamAimPlanTest {

    private static final Path QUEUE = Path.of("plans/pc-team-aim.queue");

    private static String block(String queue, String step) {
        int at = queue.indexOf("\n" + step + " ");
        assertTrue(at >= 0, step);
        int next = queue.indexOf("\nai", at + 1);
        return queue.substring(at, next < 0 ? queue.length() : next);
    }

    @Test
    @Tag("BENCH-172")
    @DisplayName("the pilot comes first and its check gates the rest; the results PR opens whatever the pilot says")
    void pilotFirst() throws IOException {
        String queue = Files.readString(QUEUE);
        String[] steps = {"aiprep", "aibb1", "aiam1", "aipilot", "aibb", "aiam", "aipick", "aigate", "aigbb", "aisum"};
        for (int i = 1; i < steps.length; i++) {
            assertTrue(block(queue, steps[i]).contains("after: " + steps[i - 1]), steps[i] + " after " + steps[i - 1]);
        }
        assertFalse(block(queue, "aipr").contains("after:"), "the results PR opens even when the pilot stops the card");
        assertTrue(block(queue, "aipilot").contains("--stop-below 0.0"));
        assertTrue(queue.contains("bash ./build-ablation.sh tmaim"));
        assertFalse(queue.matches("(?s).*HadurTeam_3\\.\\d.*"), "no robot version is hard-coded");
        assertTrue(queue.contains("rm -f ${OUT}/team-aim-*.md"), "a rerun never carries an old verdict");
        assertTrue(queue.contains("# Why it should win:"), "Leigh's rule: the card says why it should win");
        assertTrue(block(queue, "aisum").contains("--seeds 16 --teams 46 --min-aps 0.15"));
        assertTrue(queue.contains("open_results_pr.sh claude/pc-team-aim-results"));
        for (String step : List.of("aibb1", "aiam1", "aibb", "aiam", "aigate", "aigbb")) {
            assertTrue(block(queue, step).contains(".args\" || test $? -eq 1"), step + " goes on past failed battles");
            for (String rule : List.of("stop: fails 60", "stop: stall 30m", "stop: skips 40 over 100")) {
                assertTrue(block(queue, step).contains(rule), step + " declares " + rule);
            }
        }
    }

    @Test
    @Tag("BENCH-172")
    @DisplayName("the pilot's 3 seeds are the screen's first 3, in the same run directory, so the screen resumes them")
    void pilotResumes() throws IOException {
        for (String a : List.of("bb", "am")) {
            String pilot = Files.readString(Path.of("plans/team-aim-" + a + "1.args"));
            String screen = Files.readString(Path.of("plans/team-aim-" + a + ".args"));
            assertTrue(pilot.contains("--seeds\n3\n") && screen.contains("--seeds\n12\n"), a);
            for (String s : List.of(pilot, screen)) {
                assertTrue(s.contains("--seed-base\n8200\n") && s.contains("--set\nplans/team-aim-set.txt\n"), a);
                assertTrue(s.contains("--out\nwork/team-aim-@V@-" + a + "\n"), a);
                assertTrue(s.contains("--baseline\nbisect/hadur117.HadurTeam_@V@aa.jar\n"), a);
            }
        }
        long teams = Files.readAllLines(Path.of("plans/team-aim-set.txt")).stream().filter(l -> !l.startsWith("#")).count();
        assertTrue(teams == 13, "13 mid teams, not " + teams);
    }
}

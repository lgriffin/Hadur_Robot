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

/** BENCH-TG1: the pc-team-dgun card (pilot, then the whole 46-team screen) is complete before it reaches the PC. */
class TeamDgunPlanTest {

    private static final Path QUEUE = Path.of("plans/pc-team-dgun.queue");

    private static String block(String queue, String step) {
        int at = queue.indexOf("\n" + step + " ");
        assertTrue(at >= 0, step);
        int next = queue.indexOf("\ndg", at + 1);
        return queue.substring(at, next < 0 ? queue.length() : next);
    }

    @Test
    @Tag("BENCH-TG1")
    @DisplayName("the pilot comes first and its check gates the rest; the results PR opens whatever the pilot says, never before")
    void pilotFirst() throws IOException {
        String queue = Files.readString(QUEUE);
        String[] steps = {"dgprep", "dgbb1", "dgdg1", "dgpilot", "dgbb", "dgdg", "dgscr", "dgpr"};
        for (int i = 1; i < steps.length; i++) {
            assertTrue(block(queue, steps[i]).contains("after: " + steps[i - 1]), steps[i] + " after " + steps[i - 1]);
        }
        assertTrue(block(queue, "dgpilot").contains("--set team-census46.txt --seeds 3 --teams 46"), "a short pilot cannot decide the card");
        assertTrue(block(queue, "dgpilot").contains("--stop-below 0.0"));
        assertTrue(block(queue, "dgpilot").contains("if [ $rc -eq 3 ]; then bash tools/open_results_pr.sh claude/pc-team-dgun-results"),
            "a pilot that stops the card opens the results PR itself");
        assertTrue(block(queue, "dgscr").contains("--set team-census46.txt --seeds 12 --teams 46 --min-aps 0.5"), "a whole screen gated at +0.5");
        assertTrue(queue.contains("bash ./build-ablation.sh tmdgun"));
        assertFalse(queue.matches("(?s).*HadurTeam_3\\.\\d.*"), "no robot version is hard-coded");
        assertTrue(queue.contains("rm -f ${OUT}/team-dgun-*.md"), "a rerun never carries an old verdict");
        assertTrue(queue.contains("# Why it should win:"), "Leigh's rule: the card says why it should win");
        for (String step : List.of("dgbb1", "dgdg1", "dgbb", "dgdg")) {
            assertTrue(block(queue, step).contains(".args\" || test $? -eq 1"), step + " goes on past failed battles");
            for (String rule : List.of("stop: fails 60", "stop: stall 30m", "stop: skips 40 over 100")) {
                assertTrue(block(queue, step).contains(rule), step + " declares " + rule);
            }
        }
    }

    @Test
    @Tag("BENCH-TG1")
    @DisplayName("the pilot's 3 seeds are the screen's first 3, in the same run directory, so the screen resumes them")
    void pilotResumes() throws IOException {
        for (String a : List.of("bb", "dg")) {
            String pilot = Files.readString(Path.of("plans/team-dgun-" + a + "1.args"));
            String screen = Files.readString(Path.of("plans/team-dgun-" + a + ".args"));
            assertTrue(pilot.contains("--seeds\n3\n") && screen.contains("--seeds\n12\n"), a);
            for (String s : List.of(pilot, screen)) {
                assertTrue(s.contains("--seed-base\n9300\n") && s.contains("--set\nteam-census46.txt\n"), a);
                assertTrue(s.contains("--out\nwork/team-dgun-@V@-" + a + "\n"), a);
                assertTrue(s.contains("--baseline\nbisect/hadur117.HadurTeam_@V@aa.jar\n"), a);
            }
        }
    }
}

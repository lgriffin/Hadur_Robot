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

/** BENCH-237: the pc-team-guard card (keep moving and last enemy, piloted then screened) is complete before it reaches the PC. */
class TeamGuardPlanTest {

    @Test
    @Tag("BENCH-237")
    @DisplayName("a 3-seed pilot of mv and la that stops an arm under 0, then bb and the surviving arms on 12 fresh seeds, each gated on its own")
    void cardIsComplete() throws IOException {
        String queue = Files.readString(Path.of("plans/pc-team-guard.queue"));
        String prev = "tgprep";
        for (String step : List.of("tgpmv", "tgpla", "tgpilot", "tgbb", "tgmv", "tgla", "tggate", "tgpr")) {
            int at = queue.indexOf("\n" + step + " | ");
            assertTrue(at >= 0, step);
            int next = queue.indexOf("\ntg", at + 1);
            String block = queue.substring(at, next < 0 ? queue.length() : next);
            assertTrue(block.contains("after: " + prev), step + " after " + prev);
            if (block.contains("mvn -q exec:java")) {
                for (String rule : List.of("watch:", "stop: fails 60", "stop: stall 30m", "stop: skips 60 over 200")) {
                    assertTrue(block.contains(rule), step + " declares " + rule);
                }
            }
            prev = step;
        }
        assertTrue(queue.contains("<robot.release>"), "the version comes from the pom");
        assertFalse(queue.matches("(?s).*HadurTeam_3\\.\\d.*"), "no robot version is hard-coded");
        assertTrue(queue.contains("bash ./build-ablation.sh tmmoving && bash ./build-ablation.sh tmlast"));
        assertTrue(queue.contains("--seeds 3 --teams 46 --min-aps 0 --stop-below 0") && queue.contains("touch work/team-guard-go-$a || test $? -eq 3"),
            "an arm under 0 on the pilot stops without failing the card");
        assertTrue(queue.contains("--control ${OUT}/team-guard-bb.md --set team-census46.txt --seeds 12 --teams 46 --min-aps 0.15"), "each arm gated");
        for (String step : List.of("tgbb", "tgmv", "tgla")) {
            int at = queue.indexOf("\n" + step + " | ");
            String line = queue.substring(at + 1, queue.indexOf("\n", at + 1));
            assertTrue(line.contains("if [ -f work/team-guard-go-"), step + " runs only for an arm the pilot kept");
        }
        assertTrue(queue.contains("open_results_pr.sh claude/pc-team-guard-results"));
        assertTrue(queue.contains("Why it should win"));
    }

    @Test
    @Tag("BENCH-237")
    @DisplayName("the pilot is 3 seeds from 15200 and the screen 12 fresh seeds from 15300, all 46 teams against aa")
    void args() throws IOException {
        String pilot = Files.readString(Path.of("plans/team-guard-pilot.args"));
        String screen = Files.readString(Path.of("plans/team-guard-screen.args"));
        assertTrue(pilot.contains("--seeds\n3\n") && pilot.contains("--seed-base\n15200\n"));
        assertTrue(screen.contains("--seeds\n12\n") && screen.contains("--seed-base\n15300\n"));
        assertTrue(pilot.contains("--report\n../docs/bench/local/team-guard-p@A@.md\n"));
        assertTrue(screen.contains("--report\n../docs/bench/local/team-guard-@A@.md\n"));
        for (String a : List.of(pilot, screen)) {
            assertTrue(a.contains("--set\nteam-census46.txt\n") && a.contains("--rounds\n12\n")
                && a.contains("bisect/hadur117.HadurTeam_@V@@A@.jar") && a.contains("--baseline\nbisect/hadur117.HadurTeam_@V@aa.jar\n"));
        }
        String ablation = Files.readString(Path.of("build-ablation.sh"));
        assertTrue(ablation.contains("        tmmoving)") && ablation.contains("version=\"${version}mv\""));
        assertTrue(ablation.contains("        tmlast)") && ablation.contains("version=\"${version}la\""));
    }
}

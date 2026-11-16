package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** BENCH-254: the team fitted-aims card (plans/pc-team-fitted.queue), TMODE-50 on the eight fitted teams. */
class PcTeamFittedPlanTest {

    @Test
    @Tag("BENCH-254")
    @DisplayName("aa/bb/fit on the eight fitted teams: a 4-seed pilot from 22500 with a stop below 0, a 24-seed screen from 22600 gated at +0.15 APS over 46 pairings, stop rules and a results PR")
    void cardIsComplete() throws IOException {
        String q = Files.readString(Path.of("plans/pc-team-fitted.queue"));
        assertTrue(q.startsWith("# battle: team\n"), "a team card, outside the 1v1 live-match rule");
        assertTrue(q.contains("bash ./build-ablation.sh aa && bash ./build-ablation.sh bb && bash ./build-ablation.sh tmfitted"));
        assertTrue(Files.readString(Path.of("build-ablation.sh")).contains("        tmfitted)\n"));
        long teams = Files.readAllLines(Path.of("plans/team-fitted-set.txt")).stream().filter(l -> !l.startsWith("#") && !l.isBlank()).count();
        assertEquals(8, teams);
        String pilot = Files.readString(Path.of("plans/team-fitted-pilot.args"));
        assertTrue(pilot.contains("--team\ntrue\n--seeds\n4\n--seed-base\n22500\n--rounds\n12\n") && pilot.contains("--set\nplans/team-fitted-set.txt\n")
            && pilot.contains("--baseline-robot\nhadur117.HadurTeam @V@aa\n"));
        String screen = Files.readString(Path.of("plans/team-fitted-screen.args"));
        assertTrue(screen.contains("--team\ntrue\n--seeds\n24\n--seed-base\n22600\n--rounds\n12\n") && screen.contains("--set\nplans/team-fitted-set.txt\n"));
        for (String step : new String[] {"tfpfit", "tfbb", "tffit"}) {
            int at = q.indexOf("\n" + step + " | ");
            assertTrue(at > 0, step);
            int end = q.indexOf("\ntf", at + 1);
            String body = q.substring(at, end < 0 ? q.length() : end);
            assertTrue(body.contains("stop: fails 60") && body.contains("stop: stall 30m") && body.contains("stop: skips 60 over 200")
                && body.contains("  after: "), step);
        }
        assertTrue(q.contains("--stop-below 0") && q.contains("--min-aps 0.15") && q.contains("--teams 46"));
        assertTrue(q.contains("open_results_pr.sh claude/pc-team-fitted-results") && q.contains("set ALERT = lgriffin"));
        assertTrue(q.contains("# Why it should win:"));
    }
}

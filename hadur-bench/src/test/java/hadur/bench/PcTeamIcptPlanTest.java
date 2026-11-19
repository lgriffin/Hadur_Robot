package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** BENCH-261: the team intercept-views card (plans/pc-team-icpt.queue), TMODE-53 on all 46 teams. */
class PcTeamIcptPlanTest {

    @Test
    @Tag("BENCH-261")
    @DisplayName("aa/bb/tic on all 46 teams: a 3-seed pilot from 29000 with a stop below 0, a 12-seed screen from 29100 gated at +0.15 APS, stop rules and a results PR")
    void cardIsComplete() throws IOException {
        String q = Files.readString(Path.of("plans/pc-team-icpt.queue"));
        assertTrue(q.startsWith("# battle: team\n"), "a team card, outside the 1v1 live-match rule");
        assertTrue(q.contains("bash ./build-ablation.sh aa && bash ./build-ablation.sh bb && bash ./build-ablation.sh tmicpt"));
        assertTrue(Files.readString(Path.of("build-ablation.sh")).contains("        tmicpt)\n"));
        String pilot = Files.readString(Path.of("plans/team-icpt-pilot.args"));
        assertTrue(pilot.contains("--team\ntrue\n--seeds\n3\n--seed-base\n29000\n--rounds\n12\n") && pilot.contains("--set\nteam-census46.txt\n")
            && pilot.contains("--robot\nhadur117.HadurTeam @V@tic\n") && pilot.contains("--baseline-robot\nhadur117.HadurTeam @V@aa\n"));
        String screen = Files.readString(Path.of("plans/team-icpt-screen.args"));
        assertTrue(screen.contains("--team\ntrue\n--seeds\n12\n--seed-base\n29100\n--rounds\n12\n") && screen.contains("--set\nteam-census46.txt\n")
            && screen.contains("--robot\nhadur117.HadurTeam @V@@A@\n"));
        for (String step : new String[] {"tcptic", "tcbb", "tctic"}) {
            int at = q.indexOf("\n" + step + " | ");
            assertTrue(at > 0, step);
            int end = q.indexOf("\ntc", at + 1);
            String body = q.substring(at, end < 0 ? q.length() : end);
            assertTrue(body.contains("stop: fails 60") && body.contains("stop: stall 30m") && body.contains("stop: skips 60 over 200")
                && body.contains("  after: "), step);
        }
        assertTrue(q.contains("--stop-below 0") && q.contains("--min-aps 0.15") && q.contains("--teams 46"));
        assertTrue(q.contains("open_results_pr.sh claude/pc-team-icpt-results") && q.contains("set ALERT = lgriffin"));
        assertTrue(q.contains("# Why it should win:"));
    }
}

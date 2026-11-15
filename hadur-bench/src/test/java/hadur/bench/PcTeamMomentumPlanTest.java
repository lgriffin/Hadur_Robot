package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** BENCH-247: the team momentum card (plans/pc-team-momentum.queue), TMODE-49 on all 46 teams. */
class PcTeamMomentumPlanTest {

    @Test
    @Tag("BENCH-247")
    @DisplayName("aa/bb/mo/mod on 46 teams: a 3-seed pilot from 21900 with a stop below 0, a 12-seed screen from 22000 gated at +0.15 APS, stop rules and a results PR")
    void cardIsComplete() throws IOException {
        String q = Files.readString(Path.of("plans/pc-team-momentum.queue"));
        assertTrue(q.startsWith("# battle: team\n"), "a team card, outside the 1v1 live-match rule");
        assertTrue(q.contains("bash ./build-ablation.sh aa && bash ./build-ablation.sh bb && bash ./build-ablation.sh tmmomentum && bash ./build-ablation.sh tmmomentumd"));
        String ablation = Files.readString(Path.of("build-ablation.sh"));
        assertTrue(ablation.contains("tmmomentum|tmmomentums|tmmomentumd)"));
        String pilot = Files.readString(Path.of("plans/team-momentum-pilot.args"));
        assertTrue(pilot.contains("--team\ntrue\n--seeds\n3\n--seed-base\n21900\n--rounds\n12\n") && pilot.contains("--set\nteam-census46.txt\n")
            && pilot.contains("--baseline-robot\nhadur117.HadurTeam @V@aa\n"));
        String screen = Files.readString(Path.of("plans/team-momentum-screen.args"));
        assertTrue(screen.contains("--team\ntrue\n--seeds\n12\n--seed-base\n22000\n--rounds\n12\n") && screen.contains("--set\nteam-census46.txt\n"));
        for (String step : new String[] {"tmpmo", "tmpmod", "tmbb", "tmmo", "tmmod"}) {
            int at = q.indexOf("\n" + step + " | ");
            assertTrue(at > 0, step);
            int end = q.indexOf("\ntm", at + 1);
            String body = q.substring(at, end < 0 ? q.length() : end);
            assertTrue(body.contains("stop: fails 60") && body.contains("stop: stall 30m") && body.contains("stop: skips 60 over 200")
                && body.contains("  after: "), step);
        }
        assertTrue(q.contains("--stop-below 0") && q.contains("--min-aps 0.15"));
        assertTrue(q.contains("open_results_pr.sh claude/pc-team-momentum-results") && q.contains("set ALERT = lgriffin"));
        assertTrue(q.contains("# Why it should win:"));
    }
}

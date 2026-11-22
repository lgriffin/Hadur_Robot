package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** BENCH-274: the team tight-pack card (plans/pc-team-tight.queue), TMODE-59 on the five TIGHT teams. */
class PcTeamTightPlanTest {

    @Test
    @Tag("BENCH-274")
    @DisplayName("aa/bb/tp on the five TIGHT teams: a 4-seed pilot from 31000 with a stop below 0, a 24-seed screen from 31100 gated at +0.3 APS over 47 pairings, stop rules and a results PR")
    void cardIsComplete() throws IOException {
        String q = Files.readString(Path.of("plans/pc-team-tight.queue"));
        assertTrue(q.startsWith("# battle: team\n"), "a team card, outside the 1v1 live-match rule");
        assertTrue(q.contains("bash ./build-ablation.sh aa && bash ./build-ablation.sh bb && bash ./build-ablation.sh tmtight"));
        assertTrue(Files.readString(Path.of("build-ablation.sh")).contains("        tmtight)\n"));
        String pilot = Files.readString(Path.of("plans/team-tight-pilot.args"));
        assertTrue(pilot.contains("--team\ntrue\n--seeds\n4\n--seed-base\n31000\n--rounds\n12\n") && pilot.contains("--set\nplans/team-tight-set.txt\n")
            && pilot.contains("--robot\nhadur117.HadurTeam @V@tp\n") && pilot.contains("--baseline-robot\nhadur117.HadurTeam @V@aa\n"));
        String screen = Files.readString(Path.of("plans/team-tight-screen.args"));
        assertTrue(screen.contains("--team\ntrue\n--seeds\n24\n--seed-base\n31100\n--rounds\n12\n") && screen.contains("--set\nplans/team-tight-set.txt\n")
            && screen.contains("--robot\nhadur117.HadurTeam @V@@A@\n"));
        for (String step : new String[] {"ttptp", "ttbb", "tttp"}) {
            int at = q.indexOf("\n" + step + " | ");
            assertTrue(at > 0, step);
            int end = q.indexOf("\ntt", at + 1);
            String body = q.substring(at, end < 0 ? q.length() : end);
            assertTrue(body.contains("stop: fails 10") && body.contains("stop: stall 30m") && body.contains("stop: skips 60 over 200")
                && body.contains("  after: "), step);
        }
        assertTrue(q.contains("work/team-tight-tp.args") && q.contains("work/team-tight-bb.args"));
        assertTrue(q.contains("--stop-below 0") && q.contains("--min-aps 0.3") && q.contains("--teams 47"));
        assertTrue(q.contains("open_results_pr.sh claude/pc-team-tight-results") && q.contains("set ALERT = lgriffin"));
        assertTrue(q.contains("# Why it should win:"));
    }

    @Test
    @Tag("BENCH-274")
    @DisplayName("the card's set is the five teams whose table entry carries TIGHT, each a line of the team census")
    void setIsTheFiveTeams() throws IOException {
        List<String> set = Files.readAllLines(Path.of("plans/team-tight-set.txt")).stream()
            .filter(l -> !l.startsWith("#") && !l.isBlank()).collect(Collectors.toList());
        List<String> census = Files.readAllLines(Path.of("team-census46.txt"));
        assertEquals(5, set.size());
        for (String line : set) assertTrue(census.contains(line), line);
        for (String team : new String[] {"cz.libors.OgiTeam", "abc.ShadowTeam", "rz.AlephTeam", "florent.XSeries.Xmen", "cx.mini.DemoniacNimrods"}) {
            assertTrue(set.stream().anyMatch(l -> l.startsWith(team + " ")), team);
        }
    }
}

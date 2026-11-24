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

/** BENCH-279: the NEAR and QUARTERS table-line card (plans/pc-team-pack4.queue), four teams. */
class PcTeamPack4PlanTest {

    @Test
    @Tag("BENCH-279")
    @DisplayName("aa/bb/p4 on the four teams: an 8-seed pilot from 45000 with a stop below -0.15, a 24-seed screen from 45100 gated at +0.10 APS over 47 pairings, stop rules and a results PR")
    void cardIsComplete() throws IOException {
        String q = Files.readString(Path.of("plans/pc-team-pack4.queue"));
        assertTrue(q.startsWith("# battle: team\n"), "a team card, outside the 1v1 live-match rule");
        assertTrue(q.contains("bash ./build-ablation.sh aa && bash ./build-ablation.sh bb && TEAM_MODE_TABLE=\"$(pwd)/plans/team-pack4-table.java\" TEAM_MODE_SUFFIX=p4 bash ./build-ablation.sh tmtab"));
        String table = Files.readString(Path.of("plans/team-pack4-table.java"));
        for (String key : new String[] {"ustimaw.Nightmare", "ustimaw.NigitmareDroid", "ags.polylunar.Charon", "ags.polylunar.Europa", "ags.polylunar.Io", "ags.polylunar.Luna", "ags.polylunar.Phobos", "amz.TeamDeath", "mn.nano.perceptual.Impact"}) {
            assertTrue(table.contains("        t.put(\"" + key + "\", of("), key);
        }
        String pilot = Files.readString(Path.of("plans/team-pack4-pilot.args"));
        assertTrue(pilot.contains("--team\ntrue\n--seeds\n8\n--seed-base\n45000\n--rounds\n12\n") && pilot.contains("--set\nplans/team-pack4-set.txt\n")
            && pilot.contains("--robot\nhadur117.HadurTeam @V@p4\n") && pilot.contains("--baseline-robot\nhadur117.HadurTeam @V@aa\n"));
        String screen = Files.readString(Path.of("plans/team-pack4-screen.args"));
        assertTrue(screen.contains("--team\ntrue\n--seeds\n24\n--seed-base\n45100\n--rounds\n12\n") && screen.contains("--set\nplans/team-pack4-set.txt\n")
            && screen.contains("--robot\nhadur117.HadurTeam @V@@A@\n"));
        for (String step : new String[] {"tkpp4", "tkbb", "tkp4"}) {
            int at = q.indexOf("\n" + step + " | ");
            assertTrue(at > 0, step);
            int end = q.indexOf("\ntk", at + 1);
            String body = q.substring(at, end < 0 ? q.length() : end);
            assertTrue(body.contains("stop: fails 10") && body.contains("stop: stall 30m") && body.contains("stop: skips 60 over 200")
                && body.contains("  after: "), step);
        }
        assertTrue(q.contains("work/team-pack4-p4.args") && q.contains("work/team-pack4-bb.args"));
        assertTrue(q.contains("--stop-below=-0.15") && q.contains("--min-aps 0.10") && q.contains("--teams 47"));
        assertTrue(q.contains("open_results_pr.sh claude/pc-team-pack4-results") && q.contains("set ALERT = lgriffin"));
        assertTrue(q.contains("# Why it should win:"));
    }

    @Test
    @Tag("BENCH-279")
    @DisplayName("the card's set is its four teams, each a line of the team census")
    void setIsItsFourTeams() throws IOException {
        List<String> set = Files.readAllLines(Path.of("plans/team-pack4-set.txt")).stream()
            .filter(l -> !l.startsWith("#") && !l.isBlank()).collect(Collectors.toList());
        List<String> census = Files.readAllLines(Path.of("team-census46.txt"));
        assertEquals(4, set.size());
        for (String line : set) assertTrue(census.contains(line), line);
        for (String team : new String[] {"ustimaw.NightmareTeam", "ags.polylunar.Polylunar", "amz.TeamDeathTeam", "mn.nano.perceptual.ImpactTeam"}) {
            assertTrue(set.stream().anyMatch(l -> l.startsWith(team + " ")), team);
        }
    }
}

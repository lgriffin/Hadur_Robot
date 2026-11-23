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

/** BENCH-278: the near place, wider tight pack and CONCORD card (plans/pc-team-pack3.queue), three teams. */
class PcTeamPack3PlanTest {

    @Test
    @Tag("BENCH-278")
    @DisplayName("aa/bb/p3 on the three teams: an 8-seed pilot from 36300 with a stop below -0.15, a 24-seed screen from 36400 gated at +0.10 APS over 47 pairings, stop rules and a results PR")
    void cardIsComplete() throws IOException {
        String q = Files.readString(Path.of("plans/pc-team-pack3.queue"));
        assertTrue(q.startsWith("# battle: team\n"), "a team card, outside the 1v1 live-match rule");
        assertTrue(q.contains("bash ./build-ablation.sh aa && bash ./build-ablation.sh bb && bash ./build-ablation.sh tmpack3"));
        assertTrue(Files.readString(Path.of("build-ablation.sh")).contains("        tmpack3)\n"));
        String pilot = Files.readString(Path.of("plans/team-pack3-pilot.args"));
        assertTrue(pilot.contains("--team\ntrue\n--seeds\n8\n--seed-base\n36300\n--rounds\n12\n") && pilot.contains("--set\nplans/team-pack3-set.txt\n")
            && pilot.contains("--robot\nhadur117.HadurTeam @V@p3\n") && pilot.contains("--baseline-robot\nhadur117.HadurTeam @V@aa\n"));
        String screen = Files.readString(Path.of("plans/team-pack3-screen.args"));
        assertTrue(screen.contains("--team\ntrue\n--seeds\n24\n--seed-base\n36400\n--rounds\n12\n") && screen.contains("--set\nplans/team-pack3-set.txt\n")
            && screen.contains("--robot\nhadur117.HadurTeam @V@@A@\n"));
        for (String step : new String[] {"tkpp3", "tkbb", "tkp3"}) {
            int at = q.indexOf("\n" + step + " | ");
            assertTrue(at > 0, step);
            int end = q.indexOf("\ntk", at + 1);
            String body = q.substring(at, end < 0 ? q.length() : end);
            assertTrue(body.contains("stop: fails 10") && body.contains("stop: stall 30m") && body.contains("stop: skips 60 over 200")
                && body.contains("  after: "), step);
        }
        assertTrue(q.contains("work/team-pack3-p3.args") && q.contains("work/team-pack3-bb.args"));
        assertTrue(q.contains("--stop-below=-0.15") && q.contains("--min-aps 0.10") && q.contains("--teams 47"));
        assertTrue(q.contains("open_results_pr.sh claude/pc-team-pack3-results") && q.contains("set ALERT = lgriffin"));
        assertTrue(q.contains("# Why it should win:"));
    }

    @Test
    @Tag("BENCH-278")
    @DisplayName("the card's set is its three teams, each a line of the team census")
    void setIsTheFourTeams() throws IOException {
        List<String> set = Files.readAllLines(Path.of("plans/team-pack3-set.txt")).stream()
            .filter(l -> !l.startsWith("#") && !l.isBlank()).collect(Collectors.toList());
        List<String> census = Files.readAllLines(Path.of("team-census46.txt"));
        assertEquals(3, set.size());
        for (String line : set) assertTrue(census.contains(line), line);
        for (String team : new String[] {"cx.mini.DemoniacNimrods", "kawigi.micro.ArmyOfShiz", "mn.CombatTeam"}) {
            assertTrue(set.stream().anyMatch(l -> l.startsWith(team + " ")), team);
        }
    }
}

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

/** BENCH-276: the second pack card (plans/pc-team-pack2.queue), TMODE-60 and TMODE-61 on four teams. */
class PcTeamPack2PlanTest {

    @Test
    @Tag("BENCH-276")
    @DisplayName("aa/bb/p2 on the four teams: a 4-seed pilot from 33300 with a stop below 0, a 24-seed screen from 33400 gated at +0.15 APS over 47 pairings, stop rules and a results PR")
    void cardIsComplete() throws IOException {
        String q = Files.readString(Path.of("plans/pc-team-pack2.queue"));
        assertTrue(q.startsWith("# battle: team\n"), "a team card, outside the 1v1 live-match rule");
        assertTrue(q.contains("bash ./build-ablation.sh aa && bash ./build-ablation.sh bb && bash ./build-ablation.sh tmpack2"));
        assertTrue(Files.readString(Path.of("build-ablation.sh")).contains("        tmpack2)\n"));
        String pilot = Files.readString(Path.of("plans/team-pack2-pilot.args"));
        assertTrue(pilot.contains("--team\ntrue\n--seeds\n4\n--seed-base\n33300\n--rounds\n12\n") && pilot.contains("--set\nplans/team-pack2-set.txt\n")
            && pilot.contains("--robot\nhadur117.HadurTeam @V@p2\n") && pilot.contains("--baseline-robot\nhadur117.HadurTeam @V@aa\n"));
        String screen = Files.readString(Path.of("plans/team-pack2-screen.args"));
        assertTrue(screen.contains("--team\ntrue\n--seeds\n24\n--seed-base\n33400\n--rounds\n12\n") && screen.contains("--set\nplans/team-pack2-set.txt\n")
            && screen.contains("--robot\nhadur117.HadurTeam @V@@A@\n"));
        for (String step : new String[] {"tkpp2", "tkbb", "tkp2"}) {
            int at = q.indexOf("\n" + step + " | ");
            assertTrue(at > 0, step);
            int end = q.indexOf("\ntk", at + 1);
            String body = q.substring(at, end < 0 ? q.length() : end);
            assertTrue(body.contains("stop: fails 10") && body.contains("stop: stall 30m") && body.contains("stop: skips 60 over 200")
                && body.contains("  after: "), step);
        }
        assertTrue(q.contains("work/team-pack2-p2.args") && q.contains("work/team-pack2-bb.args"));
        assertTrue(q.contains("--stop-below 0") && q.contains("--min-aps 0.15") && q.contains("--teams 47"));
        assertTrue(q.contains("open_results_pr.sh claude/pc-team-pack2-results") && q.contains("set ALERT = lgriffin"));
        assertTrue(q.contains("# Why it should win:"));
    }

    @Test
    @Tag("BENCH-276")
    @DisplayName("the card's set is the four teams of the second pack card, each a line of the team census")
    void setIsTheFourTeams() throws IOException {
        List<String> set = Files.readAllLines(Path.of("plans/team-pack2-set.txt")).stream()
            .filter(l -> !l.startsWith("#") && !l.isBlank()).collect(Collectors.toList());
        List<String> census = Files.readAllLines(Path.of("team-census46.txt"));
        assertEquals(4, set.size());
        for (String line : set) assertTrue(census.contains(line), line);
        for (String team : new String[] {"abc.ShadowTeam", "cx.mini.DemoniacNimrods", "davidalves.PhoenixTeam", "kawigi.micro.ArmyOfShiz"}) {
            assertTrue(set.stream().anyMatch(l -> l.startsWith(team + " ")), team);
        }
    }
}

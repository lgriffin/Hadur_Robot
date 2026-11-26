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

/** BENCH-296: the TIGHT table-line card (plans/pc-team-pack5.queue), FirestarterTeam. */
class PcTeamPack5PlanTest {

    @Test
    @Tag("BENCH-296")
    @DisplayName("aa/bb/p5 on FirestarterTeam: a 12-seed pilot from 45200 with a stop below -0.10, a 48-seed screen from 45300 gated at +0.05 APS over 47 pairings, stop rules and a results PR")
    void cardIsComplete() throws IOException {
        String q = Files.readString(Path.of("plans/pc-team-pack5.queue"));
        assertTrue(q.startsWith("# battle: team\n"), "a team card, outside the 1v1 live-match rule");
        assertTrue(q.contains("bash ./build-ablation.sh aa && bash ./build-ablation.sh bb && TEAM_MODE_TABLE=\"$(pwd)/plans/team-pack5-table.java\" TEAM_MODE_SUFFIX=p5 bash ./build-ablation.sh tmtab"));
        String table = Files.readString(Path.of("plans/team-pack5-table.java"));
        assertTrue(table.contains("        t.put(\"cb.fire.Firestarter\", of(Mode.MATEFIRE, Mode.HUNT, Mode.TIGHT, Mode.PATH, Mode.DODGE, Mode.CLOSE, Mode.LAST, Mode.MOMENTUM));"));
        String pilot = Files.readString(Path.of("plans/team-pack5-pilot.args"));
        assertTrue(pilot.contains("--team\ntrue\n--seeds\n12\n--seed-base\n45200\n--rounds\n12\n") && pilot.contains("--set\nplans/team-pack5-set.txt\n")
            && pilot.contains("--robot\nhadur117.HadurTeam @V@p5\n") && pilot.contains("--baseline-robot\nhadur117.HadurTeam @V@aa\n"));
        String screen = Files.readString(Path.of("plans/team-pack5-screen.args"));
        assertTrue(screen.contains("--team\ntrue\n--seeds\n48\n--seed-base\n45300\n--rounds\n12\n") && screen.contains("--set\nplans/team-pack5-set.txt\n")
            && screen.contains("--robot\nhadur117.HadurTeam @V@@A@\n"));
        for (String step : new String[] {"tkpp5", "tkbb", "tkp5"}) {
            int at = q.indexOf("\n" + step + " | ");
            assertTrue(at > 0, step);
            int end = q.indexOf("\ntk", at + 1);
            String body = q.substring(at, end < 0 ? q.length() : end);
            assertTrue(body.contains("stop: fails 10") && body.contains("stop: stall 30m") && body.contains("stop: skips 60 over 200")
                && body.contains("  after: "), step);
        }
        assertTrue(q.contains("work/team-pack5-p5.args") && q.contains("work/team-pack5-bb.args"));
        assertTrue(q.contains("--stop-below=-0.10") && q.contains("--min-aps 0.05") && q.contains("--teams 47"));
        assertTrue(q.contains("open_results_pr.sh claude/pc-team-pack5-results") && q.contains("set ALERT = lgriffin"));
        assertTrue(q.contains("# Why it should win:"));
    }

    @Test
    @Tag("BENCH-296")
    @DisplayName("the card's set is FirestarterTeam, a line of the team census")
    void setIsItsTeam() throws IOException {
        List<String> set = Files.readAllLines(Path.of("plans/team-pack5-set.txt")).stream()
            .filter(l -> !l.startsWith("#") && !l.isBlank()).collect(Collectors.toList());
        List<String> census = Files.readAllLines(Path.of("team-census46.txt"));
        assertEquals(1, set.size());
        for (String line : set) assertTrue(census.contains(line), line);
        for (String team : new String[] {"cb.fire.FirestarterTeam"}) {
            assertTrue(set.stream().anyMatch(l -> l.startsWith(team + " ")), team);
        }
    }
}

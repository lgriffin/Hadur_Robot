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

/** BENCH-277: the NightmareTeam dodge card (plans/pc-team-nmdodge.queue), DODGE back in that team's table entry. */
class PcTeamNmDodgePlanTest {

    @Test
    @Tag("BENCH-277")
    @DisplayName("aa/bb/nd on NightmareTeam: a 48-seed screen from 34900 gated at +0.03 APS over 47 pairings, stop rules and a results PR")
    void cardIsComplete() throws IOException {
        String q = Files.readString(Path.of("plans/pc-team-nmdodge.queue"));
        assertTrue(q.startsWith("# battle: team\n"), "a team card, outside the 1v1 live-match rule");
        assertTrue(q.contains("bash ./build-ablation.sh aa && bash ./build-ablation.sh bb && TEAM_MODE_TABLE=\"$(pwd)/plans/team-nmdodge-table.java\" TEAM_MODE_SUFFIX=nd bash ./build-ablation.sh tmtab"));
        String screen = Files.readString(Path.of("plans/team-nmdodge-screen.args"));
        assertTrue(screen.contains("--team\ntrue\n--seeds\n48\n--seed-base\n34900\n--rounds\n12\n") && screen.contains("--set\nplans/team-nmdodge-set.txt\n")
            && screen.contains("--robot\nhadur117.HadurTeam @V@@A@\n") && screen.contains("--baseline-robot\nhadur117.HadurTeam @V@aa\n"));
        for (String step : new String[] {"tnbb", "tnnd"}) {
            int at = q.indexOf("\n" + step + " | ");
            assertTrue(at > 0, step);
            int end = q.indexOf("\ntn", at + 1);
            String body = q.substring(at, end < 0 ? q.length() : end);
            assertTrue(body.contains("watch: battles=48") && body.contains("stop: fails 10") && body.contains("stop: stall 30m")
                && body.contains("stop: skips 60 over 200") && body.contains("  after: "), step);
        }
        assertTrue(q.contains("--seeds 48") && q.contains("--min-aps 0.03") && q.contains("--teams 47"));
        assertTrue(q.contains("open_results_pr.sh claude/pc-team-nmdodge-results") && q.contains("set ALERT = lgriffin"));
        assertTrue(q.contains("# Why it should win:"));
    }

    @Test
    @Tag("BENCH-277")
    @DisplayName("the table is NightmareTeam's shipped entry with DODGE added, and the set is that one team of the census")
    void tableAndSet() throws IOException {
        List<String> table = Files.readAllLines(Path.of("plans/team-nmdodge-table.java")).stream()
            .filter(l -> !l.isBlank()).collect(Collectors.toList());
        assertEquals(1, table.size());
        String modes = Files.readString(Path.of("../hadur-core/src/main/java/hadur117/core/melee/TeamModes.java"));
        String shipped = table.get(0).replace("Mode.DODGE, ", "");
        assertTrue(table.get(0).contains("\"ustimaw.Nightmare\"") && table.get(0).contains("Mode.DODGE"));
        assertTrue(modes.contains(shipped.trim()), "the entry differs from the shipped one only by DODGE");
        List<String> set = Files.readAllLines(Path.of("plans/team-nmdodge-set.txt")).stream()
            .filter(l -> !l.startsWith("#") && !l.isBlank()).collect(Collectors.toList());
        assertEquals(1, set.size());
        assertTrue(set.get(0).startsWith("ustimaw.NightmareTeam "));
        assertTrue(Files.readAllLines(Path.of("team-census46.txt")).contains(set.get(0)));
    }
}

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

/** BENCH-301: the family team card (plans/pc-team-family.queue), TMODE-65. */
class PcTeamFamilyPlanTest {

    @Test
    @Tag("BENCH-301")
    @DisplayName("aa/bb/fn/fd: 8-seed pilots from 45600 with a stop below -0.30, a 12-seed whole-field screen from 45700 gated at +0.10 APS over 47 pairings, stop rules and a results PR")
    void cardIsComplete() throws IOException {
        String q = Files.readString(Path.of("plans/pc-team-family.queue"));
        assertTrue(q.startsWith("# battle: team\n"), "a team card, outside the 1v1 live-match rule");
        assertTrue(q.contains("bash ./build-ablation.sh aa && bash ./build-ablation.sh bb && FAMILY=names bash ./build-ablation.sh tmfamily && FAMILY=droids bash ./build-ablation.sh tmfamily"));
        String pilot = Files.readString(Path.of("plans/team-family-pilot.args"));
        assertTrue(pilot.contains("--team\ntrue\n--seeds\n8\n--seed-base\n45600\n--rounds\n12\n")
            && pilot.contains("--set\nplans/team-family-pilot-set.txt\n")
            && pilot.contains("--robot\nhadur117.HadurTeam @V@@A@\n") && pilot.contains("--member\nhadur117.Hadur\n")
            && pilot.contains("--baseline-robot\nhadur117.HadurTeam @V@aa\n"));
        String screen = Files.readString(Path.of("plans/team-family-screen.args"));
        assertTrue(screen.contains("--team\ntrue\n--seeds\n12\n--seed-base\n45700\n--rounds\n12\n")
            && screen.contains("--set\nteam-census46.txt\n") && screen.contains("--robot\nhadur117.HadurTeam @V@@A@\n"));
        for (String step : new String[] {"tfpfn", "tfpfd", "tfbb", "tffn", "tffd"}) {
            int at = q.indexOf("\n" + step + " | ");
            assertTrue(at > 0, step);
            int end = q.indexOf("\ntf", at + 1);
            String body = q.substring(at, end < 0 ? q.length() : end);
            assertTrue(body.contains("stop: fails 10") && body.contains("stop: stall 30m") && body.contains("stop: skips 60 over 200")
                && body.contains("  after: "), step);
        }
        assertTrue(q.contains("--stop-below=-0.30") && q.contains("--min-aps 0.10") && q.contains("--teams 47"));
        assertTrue(q.contains("open_results_pr.sh claude/pc-team-family-results") && q.contains("set ALERT = lgriffin"));
        assertTrue(q.contains("# Why it should win:"));
    }

    @Test
    @Tag("BENCH-301")
    @DisplayName("tmfamily builds both families: names (fn) and droids (fd), three of them Droids")
    void ablationKnowsTheFamilies() throws IOException {
        String b = Files.readString(Path.of("build-ablation.sh"));
        assertTrue(b.contains("names)  version=\"${version}fn\"; family=(HadurB HadurC HadurD HadurE); droids=() ;;"));
        assertTrue(b.contains("droids) version=\"${version}fd\"; family=(HadurB); droids=(HadurDroidC HadurDroidD HadurDroidE) ;;"));
        assertTrue(b.contains("implements robocode.Droid") && b.contains("members=\"$pkg.Hadur $base\""),
            "the leader stays hadur117.Hadur, which the bench's --member finds the team by");
    }

    @Test
    @Tag("BENCH-301")
    @DisplayName("the pilot set is the top eight teams, lines of the team census")
    void pilotSetIsTopEight() throws IOException {
        List<String> set = Files.readAllLines(Path.of("plans/team-family-pilot-set.txt")).stream()
            .filter(l -> !l.startsWith("#") && !l.isBlank()).collect(Collectors.toList());
        List<String> census = Files.readAllLines(Path.of("team-census46.txt"));
        assertEquals(8, set.size());
        for (String line : set) assertTrue(census.contains(line), line);
        assertTrue(set.get(0).startsWith("cz.libors.OgiTeam "));
    }
}

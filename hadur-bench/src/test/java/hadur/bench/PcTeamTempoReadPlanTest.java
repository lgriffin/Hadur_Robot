package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** BENCH-259: the pc-team-tempo-read card (OgiTeam and HadurTeam master on the drill teams and the same seeds, read for where the ticks go) is complete before it reaches the PC. */
class PcTeamTempoReadPlanTest {

    @Test
    @Tag("BENCH-259")
    @DisplayName("OgiTeam and master fight SittingDroidTeam and five weak teams at the same 12 seeds from 27000 with no baseline, team_tempo.py reads both, and the read goes out as a results PR")
    void cardIsComplete() throws IOException {
        String queue = Files.readString(Path.of("plans/pc-team-tempo-read.queue"));
        assertTrue(queue.startsWith("# battle: team\n"), "a team card, outside the 1v1 live-match rule");
        String[] steps = {"ttprep", "ttogi", "tthad", "ttread", "ttpr"};
        for (int i = 1; i < steps.length; i++) {
            int at = queue.indexOf("\n" + steps[i] + " ");
            assertTrue(at >= 0, steps[i]);
            int next = queue.indexOf("\ntt", at + 1);
            String body = queue.substring(at, next < 0 ? queue.length() : next);
            assertTrue(body.contains("after: " + steps[i - 1]), steps[i]);
            if (steps[i].equals("ttogi") || steps[i].equals("tthad")) {
                assertTrue(body.contains("watch: battles=72") && body.contains(".args\" || test $? -eq 1"), steps[i]);
                for (String rule : List.of("stop: fails 20", "stop: stall 30m", "stop: skips 60 over 200")) {
                    assertTrue(body.contains(rule), steps[i] + " declares " + rule);
                }
            }
        }
        assertTrue(queue.contains("<robot.release>"), "the version comes from the pom");
        assertFalse(queue.matches("(?s).*HadurTeam_3\\.\\d.*"), "no robot version is hard-coded");
        assertTrue(queue.contains("bash ./build-ablation.sh aa"));
        assertTrue(queue.contains("python3 tools/team_tempo.py --a \"OgiTeam=cz.libors=work/team-tempo-$V-ogi\" --b \"HadurTeam=hadur117=work/team-tempo-$V-hadur\" --out ${OUT}/team-tempo.md"));
        assertTrue(queue.contains("open_results_pr.sh claude/pc-team-tempo-read-results") && queue.contains("set ALERT = lgriffin"));
        assertTrue(queue.contains("What the result decides"));
        List<String> set = Files.readAllLines(Path.of("plans/team-tempo-set.txt"));
        assertTrue(set.stream().filter(l -> !l.startsWith("#") && !l.isBlank()).count() == 6, "six drill teams");
        assertTrue(set.stream().anyMatch(l -> l.startsWith("logiblocs.SittingDroidTeam")), "the sitting droids are the drill");
        assertFalse(set.stream().anyMatch(l -> l.startsWith("cz.libors.OgiTeam")), "Ogi is a subject, not an opponent");
        List<String> census = Files.readAllLines(Path.of("team-census46.txt"));
        for (String l : set) {
            if (!l.startsWith("#") && !l.isBlank()) assertTrue(census.contains(l), l + " is a census team");
        }
        for (String a : List.of("ogi", "hadur")) {
            String args = Files.readString(Path.of("plans/team-tempo-" + a + ".args"));
            assertTrue(args.contains("--team\ntrue\n--seeds\n12\n--seed-base\n27000\n--rounds\n12\n"), a);
            assertTrue(args.contains("--set\nplans/team-tempo-set.txt\n"), a);
            assertFalse(args.contains("--baseline"), a);
            assertTrue(args.contains("--out\nwork/team-tempo-@V@-" + a + "\n"), a);
        }
        assertTrue(Files.readString(Path.of("plans/team-tempo-ogi.args")).contains("--member\ncz.libors.Ogi\n"));
        assertTrue(Files.readString(Path.of("plans/team-tempo-hadur.args")).contains("bisect/hadur117.HadurTeam_@V@aa.jar"));
        assertTrue(Files.exists(Path.of("tools/team_tempo.py")));
    }
}

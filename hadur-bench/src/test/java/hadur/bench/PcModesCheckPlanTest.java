package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** BENCH-246: the release check (plans/pc-modes-check.queue) reads the shadow fix in team and melee end games. */
class PcModesCheckPlanTest {

    @Test
    @Tag("BENCH-246")
    @DisplayName("melee aa/bb/so on 46 fields x 4 seeds, team bb/so against aa on 46 teams x 8 seeds, a melee read, stop rules and a results PR")
    void cardIsComplete() throws IOException {
        String q = Files.readString(Path.of("plans/pc-modes-check.queue"));
        assertTrue(q.startsWith("# battle: melee\n"), "a melee and team card, outside the 1v1 live-match rule");
        assertTrue(q.contains("bash ./build-ablation.sh aa && bash ./build-ablation.sh bb && bash ./build-ablation.sh shoff"));
        String ablation = Files.readString(Path.of("build-ablation.sh"));
        assertTrue(ablation.contains("edit \"$movedesign\" \"static final boolean KEEP_SHADOWS = true;\" \"static final boolean KEEP_SHADOWS = false;\""));
        String design = Files.readString(Path.of("../hadur-core/src/main/java/hadur117/core/duel/MoveDesign.java"));
        assertTrue(design.contains("static final boolean KEEP_SHADOWS = true;"), "master plays the fix; the so arm turns it off");
        String melee = Files.readString(Path.of("plans/modes-check-melee.args"));
        assertTrue(melee.contains("--suite\nmelee-census-317.txt\n--seeds\n4\n--seed-base\n40000\n") && melee.contains("--robot\nhadur117.Hadur @V@@A@\n"));
        String team = Files.readString(Path.of("plans/modes-check-team.args"));
        assertTrue(team.contains("--team\ntrue\n--seeds\n8\n--seed-base\n7400\n") && team.contains("--set\nteam-census46.txt\n")
            && team.contains("--baseline-robot\nhadur117.HadurTeam @V@aa\n"));
        for (String step : new String[] {"maa", "mbb", "mso", "tbb", "tso"}) {
            int at = q.indexOf("\n" + step + " | ");
            assertTrue(at > 0, step);
            String body = q.substring(at, q.indexOf("\n\n", at + 1));
            assertTrue(body.contains("stop: fails 20") && body.contains("stop: stall 30m") && body.contains("  after: "), step);
        }
        assertTrue(q.contains("melee_s0.py screen \"$W\"-aa --base2 \"$W\"-bb --arm bb=\"$W\"-bb --arm so=\"$W\"-so --census melee-census-317.txt --seeds 4 --gain 0"));
        assertTrue(q.contains("open_results_pr.sh claude/pc-modes-check-results") && q.contains("set ALERT = lgriffin"));
    }
}

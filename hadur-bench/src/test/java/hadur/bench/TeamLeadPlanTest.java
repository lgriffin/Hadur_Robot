package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** BENCH-145: the pc-team-lead card (LEAD, per team, on the leader and droid teams) is complete before it reaches the PC. */
class TeamLeadPlanTest {

    private static final Path QUEUE = Path.of("plans/pc-team-lead.queue");

    private static String block(String queue, String step) {
        int at = queue.indexOf("\n" + step + " ");
        assertTrue(at >= 0, step);
        int next = queue.indexOf("\nlg", at + 1);
        return queue.substring(at, next < 0 ? queue.length() : next);
    }

    @Test
    @Tag("BENCH-145")
    @DisplayName("the steps chain from prep through two screens, a pick, a gate and its A/A to a verdict and a results PR")
    void stepsChain() throws IOException {
        String queue = Files.readString(QUEUE);
        String[] steps = {"lgprep", "lgbb", "lgld", "lgpick", "lggate", "lggbb", "lgsum", "lgpr"};
        for (int i = 1; i < steps.length; i++) {
            assertTrue(block(queue, steps[i]).contains("after: " + steps[i - 1]), steps[i] + " after " + steps[i - 1]);
        }
        assertTrue(queue.contains("<robot.release>"), "the version comes from the pom");
        assertFalse(queue.matches("(?s).*HadurTeam_3\\.\\d.*"), "no robot version is hard-coded");
        assertTrue(queue.contains("bash ./build-ablation.sh tmlead"));
        assertTrue(queue.contains("rm -f ${OUT}/team-lead-*.md"), "a rerun never carries an old verdict");
        assertTrue(block(queue, "lgpick").contains("--report LEAD=${OUT}/team-lead-ld.md --control LEAD=${OUT}/team-lead-bb.md --min-mean 3.0 --low-end 0 --base MATEFIRE,HUNT,PATH,DODGE --shipped"));
        assertTrue(block(queue, "lgpick").contains("TEAM_MODE_LOCKED=\"$(pwd)/work/team-lead-picked.java\" bash ./build-ablation.sh tmlock"));
        assertTrue(block(queue, "lgsum").contains("--set work/team-lead-gate.txt --seeds 16 --teams 46 --min-aps 0.15"));
        assertTrue(queue.contains("open_results_pr.sh claude/pc-team-lead-results"));
        for (String step : List.of("lgbb", "lgld")) {
            assertTrue(block(queue, step).contains("watch: battles=288"), step);
        }
        for (String step : List.of("lgbb", "lgld", "lggate", "lggbb")) {
            for (String rule : List.of("stop: fails 20", "stop: stall 30m", "stop: skips 40 over 100")) {
                assertTrue(block(queue, step).contains(rule), step + " declares " + rule);
            }
        }
    }

    @Test
    @Tag("BENCH-145")
    @DisplayName("the set names the nine leader and droid teams, each in the census the pick reads")
    void set() throws IOException {
        String set = Files.readString(Path.of("plans/team-lead-set.txt"));
        String census = Files.readString(Path.of("team-census46.txt"));
        List<String> teams = set.lines().filter(l -> !l.startsWith("#") && !l.isBlank()).toList();
        assertEquals(9, teams.size());
        for (String line : teams) {
            String team = line.substring(0, line.indexOf(" |"));
            assertTrue(census.contains(team), team + " is in the census");
        }
    }

    @Test
    @Tag("BENCH-145")
    @DisplayName("bb and ld screen 16 seeds from 6100; the gate and its A/A use 16 fresh seeds from 6200 on the picked set")
    void args() throws IOException {
        for (String a : List.of("bb", "ld", "gate", "gbb")) {
            String args = Files.readString(Path.of("plans/team-lead-" + a + ".args"));
            boolean screen = a.equals("bb") || a.equals("ld");
            String jar = a.equals("gate") ? "mk" : a.equals("gbb") ? "bb" : a;
            assertTrue(args.contains("--seeds\n16\n") && args.contains("--rounds\n10\n"), a);
            assertTrue(args.contains("--seed-base\n" + (screen ? "6100" : "6200") + "\n"), a);
            assertTrue(args.contains("--set\n" + (screen ? "plans/team-lead-set.txt" : "work/team-lead-gate.txt") + "\n"), a);
            assertTrue(args.contains("bisect/hadur117.HadurTeam_@V@" + jar + ".jar"), a);
            assertTrue(args.contains("--baseline\nbisect/hadur117.HadurTeam_@V@aa.jar\n"), a);
            assertTrue(args.contains("--report\n../docs/bench/local/team-lead-" + a + ".md\n"), a);
            assertTrue(args.contains("--out\nwork/team-lead-@V@-" + a + "\n"), a);
        }
    }
}

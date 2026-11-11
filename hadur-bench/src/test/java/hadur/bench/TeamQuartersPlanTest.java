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

/** BENCH-225: the pc-team-quarters card (QUARTERS on the five point-blank teams: screen, pick, fresh-seed gate) is complete before it reaches the PC. */
class TeamQuartersPlanTest {

    private static final Path QUEUE = Path.of("plans/pc-team-quarters.queue");

    @Test
    @Tag("BENCH-225")
    @DisplayName("the steps chain from prep through the bb and qt screens, the pick, the table build and the gate pair to a verdict and a results PR, on the version the pom names")
    void stepsChain() throws IOException {
        String queue = Files.readString(QUEUE);
        String[] steps = {"qtprep", "qtbb", "qtqt", "qtpick", "qtgprep", "qtgbb", "qtgqg", "qtsum", "qtpr"};
        for (int i = 1; i < steps.length; i++) {
            int at = queue.indexOf("\n" + steps[i] + " ");
            assertTrue(at >= 0, steps[i]);
            int next = queue.indexOf("\nqt", at + 1);
            assertTrue(queue.substring(at, next < 0 ? queue.length() : next).contains("after: " + steps[i - 1]),
                steps[i] + " after " + steps[i - 1]);
        }
        assertTrue(queue.contains("<robot.release>"), "the version comes from the pom");
        assertFalse(queue.matches("(?s).*HadurTeam_3\\.\\d.*"), "no robot version is hard-coded");
        for (String a : List.of("aa", "bb", "tmquarters")) {
            assertTrue(queue.contains("bash ./build-ablation.sh " + a), a + " is built");
        }
        assertTrue(queue.contains("TEAM_MODE_TABLE=\"$(pwd)/work/team-quarters-table.java\" TEAM_MODE_SUFFIX=qg bash ./build-ablation.sh tmtab"),
            "the gate build is the picked table");
        assertTrue(queue.contains("pick --report QUARTERS=${OUT}/team-quarters-qt.md --control QUARTERS=${OUT}/team-quarters-bb.md"
            + " --census plans/team-quarters5.txt --opponents opponents --min-mean 3.0 --low-end 0"
            + " --base MATEFIRE,HUNT,PATH,DODGE,CONCORD,CLOSE --shipped ${MODES}"),
            "a team is picked at +3.0 over both baselines with the low end above zero, and keeps its entry's modes");
        assertTrue(queue.contains("test -s work/team-quarters-table.java || { bash tools/open_results_pr.sh claude/pc-team-quarters-results"),
            "no team picked: the results PR opens and the card ends");
        assertTrue(queue.contains("gate --report ${OUT}/team-quarters-gqg.md --control ${OUT}/team-quarters-gbb.md"
            + " --set work/team-quarters-picked.txt --seeds 16 --teams 45 --min-aps 0.15"),
            "the gate pools the picked teams over 45 pairings");
        assertTrue(queue.contains("python3 tools/team_quarters.py work/team-quarters-\"$V\"-qt > ${OUT}/team-quarters-damage.md"),
            "the damage from under 150 px is read");
        assertTrue(queue.contains("rm -f ${OUT}/team-quarters-*.md"), "a rerun never carries an old verdict");
        assertTrue(queue.contains("rm -rf work/team-quarters-\"$V\"-bb work/team-quarters-\"$V\"-qt work/team-quarters-\"$V\"-gbb work/team-quarters-\"$V\"-gqg"),
            "a fresh run never resumes battles an earlier build fought");
        assertTrue(queue.contains("rm -f work/team-quarters-table.java work/team-quarters-picked.txt"), "nor an earlier pick");
        assertFalse(queue.contains("; true"), "a failed step stops the queue");
        assertTrue(queue.contains("\nqtpr   | bash tools/open_results_pr.sh claude/pc-team-quarters-results"));
        for (String step : List.of("qtbb", "qtqt", "qtgbb", "qtgqg")) {
            int at = queue.indexOf("\n" + step + " ");
            int next = queue.indexOf("\nqt", at + 1);
            String block = queue.substring(at, next < 0 ? queue.length() : next);
            for (String rule : List.of("watch:", "stop: fails 20", "stop: stall 30m", "stop: skips 40 over 100")) {
                assertTrue(block.contains(rule), step + " declares " + rule);
            }
        }
        for (String step : List.of("qtbb", "qtqt")) {
            int at = queue.indexOf("\n" + step + " ");
            assertTrue(queue.substring(at, queue.indexOf("\nqt", at + 1)).contains("watch: battles=240"), step);
        }
    }

    @Test
    @Tag("BENCH-225")
    @DisplayName("the screen pairs bb and qt with aa on the five teams at 24 seeds from 9700; the gate pairs bb and qg on the picked teams at 16 fresh seeds from 9800; all at 12 rounds")
    void args() throws IOException {
        String[][] arms = {
            {"bb", "bb", "24", "9700", "plans/team-quarters5.txt"}, {"qt", "qt", "24", "9700", "plans/team-quarters5.txt"},
            {"gbb", "bb", "16", "9800", "work/team-quarters-picked.txt"}, {"gqg", "qg", "16", "9800", "work/team-quarters-picked.txt"}};
        for (String[] a : arms) {
            String args = Files.readString(Path.of("plans/team-quarters-" + a[0] + ".args"));
            assertTrue(args.contains("--set\n" + a[4] + "\n"), a[0]);
            assertTrue(args.contains("--seeds\n" + a[2] + "\n") && args.contains("--rounds\n12\n")
                && args.contains("--seed-base\n" + a[3] + "\n"), a[0]);
            assertTrue(args.contains("bisect/hadur117.HadurTeam_@V@" + a[1] + ".jar"), a[0]);
            assertTrue(args.contains("--baseline\nbisect/hadur117.HadurTeam_@V@aa.jar\n"), a[0]);
            assertTrue(args.contains("--report\n../docs/bench/local/team-quarters-" + a[0] + ".md\n"), a[0]);
            assertTrue(args.contains("--out\nwork/team-quarters-@V@-" + a[0] + "\n"), a[0]);
            assertTrue(args.contains("--parallel\nauto\n") && args.contains("--cpu-constant\nauto\n"), a[0]);
        }
    }

    @Test
    @Tag("BENCH-225")
    @DisplayName("the panel is the five point-blank teams, each on the team census, and tmquarters is a build-ablation arm with suffix qt")
    void panelAndArm() throws IOException {
        List<String> panel = Files.readAllLines(Path.of("plans/team-quarters5.txt")).stream()
            .filter(l -> !l.isBlank() && !l.startsWith("#")).toList();
        assertEquals(5, panel.size());
        List<String> census = Files.readAllLines(Path.of("team-census46.txt"));
        for (String line : panel) assertTrue(census.contains(line), line);
        for (String team : List.of("ustimaw.NightmareTeam 3.3", "ags.polylunar.Polylunar 1.6", "mn.nano.perceptual.ImpactTeam 1.3.0",
            "amz.TeamDeathTeam 1", "jab.Enjambre 3")) {
            assertTrue(panel.stream().anyMatch(l -> l.startsWith(team + " |")), team);
        }
        String build = Files.readString(Path.of("build-ablation.sh"));
        assertTrue(build.contains("        tmquarters)\n"), "the arm exists");
        assertTrue(build.contains("version=\"${version}qt\""), "suffix qt");
        assertTrue(build.contains("\"public static final boolean FORCE_QUARTERS = false;\" \"public static final boolean FORCE_QUARTERS = true;\""),
            "it forces QUARTERS on");
    }
}

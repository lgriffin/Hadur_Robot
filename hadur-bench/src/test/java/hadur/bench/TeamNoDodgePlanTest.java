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

/** BENCH-144: the pc-team-nododge card (DODGE off against the three teams it lost to) is complete before it reaches the PC. */
class TeamNoDodgePlanTest {

    private static final Path QUEUE = Path.of("plans/pc-team-nododge.queue");

    @Test
    @Tag("BENCH-144")
    @DisplayName("the steps chain from prep through bb and xd to a pooled gate and a results PR, on the version the pom names")
    void stepsChain() throws IOException {
        String queue = Files.readString(QUEUE);
        String[] steps = {"ndprep", "ndbb", "ndxd", "ndsum", "ndpr"};
        for (int i = 1; i < steps.length; i++) {
            int at = queue.indexOf("\n" + steps[i] + " ");
            assertTrue(at >= 0, steps[i]);
            int end = queue.indexOf("\n", queue.indexOf("\n", at + 1) + 1);
            assertTrue(queue.substring(at, end < 0 ? queue.length() : end).contains("after: " + steps[i - 1]),
                steps[i] + " after " + steps[i - 1]);
        }
        assertTrue(queue.contains("<robot.release>"), "the version comes from the pom");
        assertFalse(queue.matches("(?s).*HadurTeam_3\\.\\d.*"), "no robot version is hard-coded");
        assertTrue(queue.contains("TEAM_MODE_TABLE=\"$(pwd)/plans/team-nododge-table.java\" TEAM_MODE_SUFFIX=xd bash ./build-ablation.sh tmtab"));
        assertTrue(queue.contains("gate --report ${OUT}/team-nododge-xd.md --control ${OUT}/team-nododge-bb.md --set plans/team-nododge-set.txt --seeds 24 --teams 46 --min-aps 0.15"));
        assertTrue(queue.contains("rm -f ${OUT}/team-nododge-*.md"), "a rerun never carries an old verdict");
        assertTrue(queue.contains("rm -rf work/team-nododge-\"$V\"-bb work/team-nododge-\"$V\"-xd"));
        assertTrue(queue.contains("open_results_pr.sh claude/pc-team-nododge-results"));
        for (String step : List.of("ndbb", "ndxd")) {
            int at = queue.indexOf("\n" + step + " ");
            int next = queue.indexOf("\nnd", at + 1);
            String block = queue.substring(at, next < 0 ? queue.length() : next);
            for (String rule : List.of("watch: battles=144", "stop: fails 20", "stop: stall 30m", "stop: skips 40 over 100")) {
                assertTrue(block.contains(rule), step + " declares " + rule);
            }
        }
    }

    @Test
    @Tag("BENCH-144")
    @DisplayName("the table drops only DODGE for the three teams' member classes, and the set names exactly those teams")
    void tableAndSet() throws IOException {
        List<String> table = Files.readAllLines(Path.of("plans/team-nododge-table.java"));
        assertEquals(4, table.size());
        for (String line : table) {
            assertTrue(line.endsWith("of(Mode.MATEFIRE, Mode.HUNT, Mode.PATH));"), line);
        }
        String set = Files.readString(Path.of("plans/team-nododge-set.txt"));
        long teams = set.lines().filter(l -> !l.startsWith("#") && !l.isBlank()).count();
        assertEquals(3, teams);
        for (String t : List.of("ustimaw.NightmareTeam 3.3", "mn.nano.perceptual.ImpactTeam 1.3.0", "pedersen.ImWithStupidTeam 1.3")) {
            assertTrue(set.contains(t + " |"), t);
        }
    }

    @Test
    @Tag("BENCH-144")
    @DisplayName("bb and xd share 24 fresh seeds from 5900 at 12 rounds against aa")
    void args() throws IOException {
        for (String a : List.of("bb", "xd")) {
            String args = Files.readString(Path.of("plans/team-nododge-" + a + ".args"));
            assertTrue(args.contains("--set\nplans/team-nododge-set.txt\n"), a);
            assertTrue(args.contains("--seeds\n24\n") && args.contains("--rounds\n12\n") && args.contains("--seed-base\n5900\n"), a);
            assertTrue(args.contains("bisect/hadur117.HadurTeam_@V@" + a + ".jar"), a);
            assertTrue(args.contains("--baseline\nbisect/hadur117.HadurTeam_@V@aa.jar\n"), a);
            assertTrue(args.contains("--report\n../docs/bench/local/team-nododge-" + a + ".md\n"), a);
            assertTrue(args.contains("--out\nwork/team-nododge-@V@-" + a + "\n"), a);
        }
    }
}

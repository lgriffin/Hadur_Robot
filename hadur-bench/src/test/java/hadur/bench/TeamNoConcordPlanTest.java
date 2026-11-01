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

/** BENCH-160: the pc-team-noconcord card (CONCORD off against the four teams it lost to) is complete before it reaches the PC. */
class TeamNoConcordPlanTest {

    private static final Path QUEUE = Path.of("plans/pc-team-noconcord.queue");

    private static String block(String queue, String step) {
        int at = queue.indexOf("\n" + step + " ");
        assertTrue(at >= 0, step);
        int next = queue.indexOf("\nnc", at + 1);
        return queue.substring(at, next < 0 ? queue.length() : next);
    }

    @Test
    @Tag("BENCH-160")
    @DisplayName("the steps chain from prep through bb and xc to a pooled gate and a results PR, on the version the pom names")
    void stepsChain() throws IOException {
        String queue = Files.readString(QUEUE);
        String[] steps = {"ncprep", "ncbb", "ncxc", "ncsum", "ncpr"};
        for (int i = 1; i < steps.length; i++) {
            assertTrue(block(queue, steps[i]).contains("after: " + steps[i - 1]), steps[i] + " after " + steps[i - 1]);
        }
        assertTrue(queue.contains("<robot.release>"), "the version comes from the pom");
        assertFalse(queue.matches("(?s).*HadurTeam_3\\.\\d.*"), "no robot version is hard-coded");
        assertTrue(queue.contains("TEAM_MODE_TABLE=\"$(pwd)/plans/team-noconcord-table.java\" TEAM_MODE_SUFFIX=xc bash ./build-ablation.sh tmtab"));
        assertTrue(block(queue, "ncsum").contains("gate --report ${OUT}/team-noconcord-xc.md --control ${OUT}/team-noconcord-bb.md --set plans/team-noconcord-set.txt --seeds 24 --teams 46 --min-aps 0.15"));
        assertTrue(queue.contains("rm -f ${OUT}/team-noconcord-*.md"), "a rerun never carries an old verdict");
        assertTrue(queue.contains("open_results_pr.sh claude/pc-team-noconcord-results"));
        for (String step : List.of("ncbb", "ncxc")) {
            for (String rule : List.of("watch: battles=192", "stop: fails 20", "stop: stall 30m", "stop: skips 40 over 100")) {
                assertTrue(block(queue, step).contains(rule), step + " declares " + rule);
            }
        }
    }

    @Test
    @Tag("BENCH-160")
    @DisplayName("the table drops only CONCORD for the four teams' member classes, and the set names exactly those teams")
    void tableAndSet() throws IOException {
        List<String> table = Files.readAllLines(Path.of("plans/team-noconcord-table.java"));
        assertEquals(5, table.size());
        for (String line : table) {
            assertFalse(line.contains("CONCORD"), line);
            boolean nightmare = line.contains("\"ustimaw.");
            assertTrue(line.endsWith(nightmare ? "of(Mode.MATEFIRE, Mode.HUNT, Mode.PATH));"
                : "of(Mode.MATEFIRE, Mode.HUNT, Mode.PATH, Mode.DODGE));"), line);
        }
        String set = Files.readString(Path.of("plans/team-noconcord-set.txt"));
        assertEquals(4, set.lines().filter(l -> !l.startsWith("#") && !l.isBlank()).count());
        for (String t : List.of("cz.libors.OgiTeam v1", "mn.CombatTeam 3.25.0", "cb.fire.FirestarterTeam 2.0", "ustimaw.NightmareTeam 3.3")) {
            assertTrue(set.contains(t + " |"), t);
        }
    }

    @Test
    @Tag("BENCH-160")
    @DisplayName("bb and xc share 24 fresh seeds from 7000 at 10 rounds against aa")
    void args() throws IOException {
        for (String a : List.of("bb", "xc")) {
            String args = Files.readString(Path.of("plans/team-noconcord-" + a + ".args"));
            assertTrue(args.contains("--set\nplans/team-noconcord-set.txt\n"), a);
            assertTrue(args.contains("--seeds\n24\n") && args.contains("--rounds\n10\n") && args.contains("--seed-base\n7000\n"), a);
            assertTrue(args.contains("bisect/hadur117.HadurTeam_@V@" + a + ".jar"), a);
            assertTrue(args.contains("--baseline\nbisect/hadur117.HadurTeam_@V@aa.jar\n"), a);
            assertTrue(args.contains("--report\n../docs/bench/local/team-noconcord-" + a + ".md\n"), a);
            assertTrue(args.contains("--out\nwork/team-noconcord-@V@-" + a + "\n"), a);
        }
    }
}

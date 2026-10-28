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

/** BENCH-119: the pc-team-table card (per-team table v2) is complete before it reaches the PC. */
class TeamTablePlanTest {

    private static final Path QUEUE = Path.of("plans/pc-team-table.queue");

    @Test
    @Tag("BENCH-119")
    @DisplayName("the steps chain from prep through confirm, lock and gate to a results PR, on the version the pom names")
    void stepsChain() throws IOException {
        String queue = Files.readString(QUEUE);
        String[] steps = {"ttprep", "ttconf", "ttcbb", "ttlock", "ttgate", "ttgbb", "ttsum", "ttpr"};
        for (int i = 1; i < steps.length; i++) {
            int at = queue.indexOf("\n" + steps[i] + " ");
            assertTrue(at >= 0, steps[i]);
            int end = queue.indexOf("\n", queue.indexOf("\n", at + 1) + 1);
            assertTrue(queue.substring(at, end < 0 ? queue.length() : end).contains("after: " + steps[i - 1]),
                steps[i] + " after " + steps[i - 1]);
        }
        assertTrue(queue.contains("<robot.release>"), "the version comes from the pom");
        assertFalse(queue.matches("(?s).*HadurTeam_3\\.\\d.*"), "no robot version is hard-coded");
        for (String a : List.of("aa", "bb", "tmtab", "tmlock")) {
            assertTrue(queue.contains("bash ./build-ablation.sh " + a), a + " is built");
        }
        for (String m : List.of("LANEP=../docs/bench/local/team-lane-lp.md", "LANEB=../docs/bench/local/team-lane-lb.md",
                                "LINES=../docs/bench/local/team-lines-ml.md", "LINESW=../docs/bench/local/team-lines-mlw.md")) {
            assertTrue(queue.contains("--report " + m), m);
        }
        assertTrue(queue.contains("--control LANEP=../docs/bench/local/team-lane-bb.md"));
        assertTrue(queue.contains("--control LINESW=../docs/bench/local/team-lines-bb.md"));
        assertTrue(queue.contains("--min-mean 3.0 --base MATEFIRE,HUNT"), "picks keep the shipped modes");
        assertTrue(queue.contains("--min-gain 1.0"));
        assertTrue(queue.contains("--confirm ${OUT}/team-table-conf.md --control ${OUT}/team-table-cbb.md"), "lock scores both baselines");
        assertTrue(queue.contains("--set work/team-table-gate.txt --seeds 16 --teams 46 --min-aps 0.3"), "gate needs every team fully paired");
        assertFalse(queue.contains("; true"), "a failed step stops the queue");
        assertTrue(queue.contains("open_results_pr.sh claude/pc-team-table-results"));
    }

    @Test
    @Tag("BENCH-119")
    @DisplayName("confirm and gate run on their own team sets at fresh seeds, each beside a bb A/A on the same seeds")
    void args() throws IOException {
        for (String[] a : List.of(new String[] {"conf", "mt", "confirm", "12", "4300"}, new String[] {"cbb", "bb", "confirm", "12", "4300"},
                                  new String[] {"gate", "mk", "gate", "16", "4400"}, new String[] {"gbb", "bb", "gate", "16", "4400"})) {
            String args = Files.readString(Path.of("plans/team-table-" + a[0] + ".args"));
            assertTrue(args.contains("--set\nwork/team-table-" + a[2] + ".txt\n"), a[0]);
            assertTrue(args.contains("--seeds\n" + a[3] + "\n") && args.contains("--seed-base\n" + a[4] + "\n"), a[0]);
            assertTrue(args.contains("bisect/hadur117.HadurTeam_@V@" + a[1] + ".jar"), a[0]);
            assertTrue(args.contains("--baseline\nbisect/hadur117.HadurTeam_@V@aa.jar\n"), a[0]);
            assertTrue(args.contains("--report\n../docs/bench/local/team-table-" + a[0] + ".md\n"), a[0]);
            assertTrue(args.contains("--parallel\nauto\n") && args.contains("--cpu-constant\nauto\n"), a[0]);
        }
    }
}

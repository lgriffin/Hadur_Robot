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

/** BENCH-124: the pc-team-path card (path check and Troodon at 250 px, per opponent) is complete before it reaches the PC. */
class TeamPathPlanTest {

    private static final Path QUEUE = Path.of("plans/pc-team-path.queue");

    @Test
    @Tag("BENCH-124")
    @DisplayName("the steps chain from prep through the screens, A/A, pick and gate to a results PR, on the version the pom names")
    void stepsChain() throws IOException {
        String queue = Files.readString(QUEUE);
        String[] steps = {"tpprep", "tpbb", "tpmp", "tptn", "tptnbb", "tppick", "tpgate", "tpgbb", "tpsum", "tppr"};
        for (int i = 1; i < steps.length; i++) {
            int at = queue.indexOf("\n" + steps[i] + " ");
            assertTrue(at >= 0, steps[i]);
            int end = queue.indexOf("\n", queue.indexOf("\n", at + 1) + 1);
            assertTrue(queue.substring(at, end < 0 ? queue.length() : end).contains("after: " + steps[i - 1]),
                steps[i] + " after " + steps[i - 1]);
        }
        assertTrue(queue.contains("<robot.release>"), "the version comes from the pom");
        assertFalse(queue.matches("(?s).*HadurTeam_3\\.\\d.*"), "no robot version is hard-coded");
        for (String a : List.of("aa", "bb", "tmpath", "tmtnear", "tmlock")) {
            assertTrue(queue.contains("bash ./build-ablation.sh " + a), a + " is built");
        }
        assertTrue(queue.contains("--report PATH=../docs/bench/local/team-path-mp.md --control PATH=../docs/bench/local/team-path-bb.md"));
        assertTrue(queue.contains("--report NEAR=../docs/bench/local/team-path-tn.md --control NEAR=../docs/bench/local/team-path-tnbb.md"));
        assertTrue(queue.contains("--min-mean 3.0 --low-end 0 --base MATEFIRE,HUNT --shipped ../hadur-core/src/main/java/hadur117/core/melee/TeamModes.java"),
            "picks keep the shipped modes, and a named team keeps its entry's");
        assertTrue(queue.contains("--set work/team-path-gate.txt --seeds 16 --teams 46 --min-aps 0.3"), "gate needs every team fully paired");
        assertTrue(queue.contains("grep -q '\\*\\*PASS\\*\\*' ${OUT}/team-path-verdict.md; then cp work/team-path-picked.java"),
            "only a passed gate writes the table to ship");
        assertTrue(queue.contains("rm -f ${OUT}/team-path-*.md ${OUT}/team-path-pick.tsv ${OUT}/team-path-locked.java.txt work/team-path-picked.java"),
            "a rerun never carries an old table");
        assertFalse(queue.contains("; true"), "a failed step stops the queue");
        assertTrue(queue.contains("open_results_pr.sh claude/pc-team-path-results"));
        for (String step : List.of("tpbb", "tpmp", "tptn", "tptnbb", "tpgate", "tpgbb")) {
            int at = queue.indexOf("\n" + step + " ");
            int next = queue.indexOf("\ntp", at + 1);
            String block = queue.substring(at, next < 0 ? queue.length() : next);
            for (String rule : List.of("stop: fails 20", "stop: stall 30m", "stop: skips 40 over 100")) {
                assertTrue(block.contains(rule), step + " declares " + rule);
            }
        }
        assertTrue(queue.contains("watch: battles=920") && queue.contains("watch: battles=32"), "the page states what a stop leaves unrun");
    }

    @Test
    @Tag("BENCH-124")
    @DisplayName("each screen shares seeds with its A/A; the gate runs fresh seeds on the picked teams beside its own A/A")
    void args() throws IOException {
        for (String[] a : List.of(new String[] {"bb", "bb", "team-census46.txt", "10", "4900"},
                                  new String[] {"mp", "mp", "team-census46.txt", "10", "4900"},
                                  new String[] {"tn", "tn", "plans/team-path-troodon.txt", "16", "4900"},
                                  new String[] {"tnbb", "bb", "plans/team-path-troodon.txt", "16", "4900"},
                                  new String[] {"gate", "mk", "work/team-path-gate.txt", "16", "5000"},
                                  new String[] {"gbb", "bb", "work/team-path-gate.txt", "16", "5000"})) {
            String args = Files.readString(Path.of("plans/team-path-" + a[0] + ".args"));
            assertTrue(args.contains("--set\n" + a[2] + "\n"), a[0]);
            assertTrue(args.contains("--seeds\n" + a[3] + "\n") && args.contains("--seed-base\n" + a[4] + "\n"), a[0]);
            assertTrue(args.contains("bisect/hadur117.HadurTeam_@V@" + a[1] + ".jar"), a[0]);
            assertTrue(args.contains("--baseline\nbisect/hadur117.HadurTeam_@V@aa.jar\n"), a[0]);
            assertTrue(args.contains("--report\n../docs/bench/local/team-path-" + a[0] + ".md\n"), a[0]);
            assertTrue(args.contains("--out\nwork/team-path-@V@-" + a[0] + "\n"), a[0]);
            assertTrue(args.contains("--parallel\nauto\n") && args.contains("--cpu-constant\nauto\n"), a[0]);
        }
        String troodon = Files.readString(Path.of("plans/team-path-troodon.txt"));
        String census = Files.readString(Path.of("team-census46.txt"));
        for (String l : troodon.lines().filter(l -> !l.isBlank() && !l.startsWith("#")).toList()) {
            assertTrue(census.contains(l), "the Troodon set is a census line: " + l);
        }
    }
}

package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** BENCH-123: the pc-team-counters card (per-opponent counters) is complete before it reaches the PC. */
class TeamCountersPlanTest {

    private static final Path QUEUE = Path.of("plans/pc-team-counters.queue");

    @Test
    @Tag("BENCH-123")
    @DisplayName("the steps chain from prep through three screens, A/A, pick and gate to a results PR, on the version the pom names")
    void stepsChain() throws IOException {
        String queue = Files.readString(QUEUE);
        String[] steps = {"tcprep", "tcs1", "tcs2", "tcs3", "tcsbb", "tcpick", "tcgate", "tcgbb", "tcsum", "tcpr"};
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
        for (String[] s : List.of(new String[] {"s1", "ka"}, new String[] {"s2", "kb"}, new String[] {"s3", "kc"})) {
            assertTrue(queue.contains("TEAM_MODE_TABLE=\"$(pwd)/work/team-counters-" + s[0] + ".java\" TEAM_MODE_SUFFIX="
                + s[1] + " bash ./build-ablation.sh tmtab"), s[0]);
            assertTrue(queue.contains("--report " + s[0] + "=../docs/bench/local/team-counters-" + s[0] + ".md"), s[0]);
            assertTrue(queue.contains("--control " + s[0] + "=../docs/bench/local/team-counters-sbb.md"), s[0]);
        }
        assertTrue(queue.contains("screens --counters plans/team-counters.tsv"), "prep writes the screens' tables");
        assertTrue(queue.contains("--min-mean 3.0 --low-end 0 --base MATEFIRE,HUNT"), "picks keep the shipped modes");
        assertTrue(queue.contains("--set work/team-counters-gate.txt --seeds 16 --teams 46 --min-aps 0.3"), "gate needs every team fully paired");
        assertFalse(queue.contains(" lock "), "the shipped table is the gated one, not re-picked on the gate's seeds");
        assertTrue(queue.contains("grep -q '\\*\\*PASS\\*\\*' ${OUT}/team-counters-verdict.md; then cp work/team-counters-picked.java"),
            "only a passed gate writes the table to ship");
        assertTrue(queue.contains("rm -f ${OUT}/team-counters-*.md ${OUT}/team-counters-pick.tsv ${OUT}/team-counters-locked.java.txt"),
            "a rerun never carries an old table");
        assertFalse(queue.contains("; true"), "a failed step stops the queue");
        assertTrue(queue.contains("open_results_pr.sh claude/pc-team-counters-results"));
    }

    @Test
    @Tag("BENCH-123")
    @DisplayName("screens share seeds with their A/A; the gate runs fresh seeds on the picked teams beside its own A/A")
    void args() throws IOException {
        for (String[] a : List.of(new String[] {"s1", "ka", "s1", "4600"}, new String[] {"s2", "kb", "s2", "4600"},
                                  new String[] {"s3", "kc", "s3", "4600"}, new String[] {"sbb", "bb", "all", "4600"},
                                  new String[] {"gate", "mk", "gate", "4700"}, new String[] {"gbb", "bb", "gate", "4700"})) {
            String args = Files.readString(Path.of("plans/team-counters-" + a[0] + ".args"));
            assertTrue(args.contains("--set\nwork/team-counters-" + a[2] + ".txt\n"), a[0]);
            assertTrue(args.contains("--seeds\n16\n") && args.contains("--seed-base\n" + a[3] + "\n"), a[0]);
            assertTrue(args.contains("bisect/hadur2.HadurTeam_@V@" + a[1] + ".jar"), a[0]);
            assertTrue(args.contains("--baseline\nbisect/hadur2.HadurTeam_@V@aa.jar\n"), a[0]);
            assertTrue(args.contains("--report\n../docs/bench/local/team-counters-" + a[0] + ".md\n"), a[0]);
            assertTrue(args.contains("--parallel\nauto\n") && args.contains("--cpu-constant\nauto\n"), a[0]);
        }
    }

    @Test
    @Tag("BENCH-123")
    @DisplayName("every counter names census teams and known table-only modes, at most three per team")
    void counters() throws IOException {
        Set<String> census = new java.util.HashSet<>();
        for (String l : Files.readAllLines(Path.of("team-census46.txt"))) {
            if (!l.isBlank() && !l.startsWith("#")) census.add(l.split("\\|")[0].trim());
        }
        Set<String> modes = Set.of("OWN", "HEADON", "LINEAR", "FAR", "FARTHER");
        List<String> rows = Files.readAllLines(Path.of("plans/team-counters.tsv")).stream()
            .filter(l -> !l.isBlank() && !l.startsWith("#")).toList();
        assertEquals("team\ts1\ts2\ts3", rows.get(0));
        for (String row : rows.subList(1, rows.size())) {
            String[] cells = row.split("\t");
            assertTrue(census.contains(cells[0]), cells[0]);
            assertTrue(cells.length <= 4, row);
            for (int i = 1; i < cells.length; i++) {
                if (cells[i].equals("-")) continue;
                for (String m : cells[i].split(",")) assertTrue(modes.contains(m), row);
                assertFalse(cells[i].contains("HEADON") && cells[i].contains("LINEAR"), "one aim only: " + row);
                assertFalse(cells[i].contains("FAR,FARTHER"), "one range only: " + row);
            }
        }
    }
}

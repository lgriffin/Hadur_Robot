package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** BENCH-99: the mode table v1 card (plans/pc-table-v1.queue) is complete before it reaches the PC. */
class TableV1PlanTest {

    private static final Path QUEUE = Path.of("plans/pc-table-v1.queue");

    @Test
    @Tag("BENCH-99")
    @DisplayName("the screen's arms are the control, its A/A copy and shield-all with SHIELD-16, and the queue builds all three")
    void armsAreBuilt() throws IOException {
        String queue = Files.readString(QUEUE);
        List<Arms.Arm> arms = Arms.parse(Path.of("plans/table-v1.arms"), Path.of("").toAbsolutePath());
        assertEquals(List.of("c", "aa", "sasq"), arms.stream().map(Arms.Arm::label).toList());
        assertTrue(queue.contains("cp ../hadur-robot/target/hadur2.Hadur_3.15.jar bisect/"), "builds the control");
        assertTrue(queue.contains("build-ablation.sh aa"), "builds the A/A copy");
        assertTrue(queue.contains("build-ablation.sh shield-all,sprior"), "builds sasq");
        assertTrue(queue.contains("fetch-opponents.sh --set census-312.txt"));
    }

    @Test
    @Tag("BENCH-99")
    @DisplayName("every step reads the one before it, runs at 12 workers, and the run ends in a gate and a results PR")
    void stepsChain() throws IOException {
        String queue = Files.readString(QUEUE);
        assertTrue(queue.contains("set P = --parallel 12 --no-truth-log"));
        String[] steps = {"prep", "panel", "screen", "pick", "confirm", "final", "candidate", "census", "gate", "pr"};
        for (int i = 1; i < steps.length; i++) {
            assertTrue(queue.contains("\n" + steps[i] + " | "), steps[i]);
            int at = queue.indexOf("\n" + steps[i] + " | ");
            int next = queue.indexOf("\n\n", at + 1);
            assertTrue(queue.substring(at, next < 0 ? queue.length() : next).contains("after: " + steps[i - 1]),
                steps[i] + " after " + steps[i - 1]);
        }
        assertTrue(queue.contains("--out work/table-v1-screen ") && queue.contains("work/table-v1-screen/arms.tsv"));
        assertTrue(queue.contains("--out work/table-v1-confirm ") && queue.contains("work/table-v1-confirm/arms.tsv"));
        assertTrue(queue.contains("--arms work/table-v1-census.arms") && queue.contains("--out work/table-v1-census.arms"));
        assertTrue(queue.contains("--out work/table-v1-census ") && queue.contains("work/table-v1-census/arms.tsv"));
        assertTrue(queue.contains("gate work/table-v1-census/arms.tsv census-312.txt --arm t1"));
        assertTrue(Files.isRegularFile(Path.of("tools/table_v1.py")) && Files.isRegularFile(Path.of("tools/test_table_v1.py")));
        assertTrue(queue.contains("open_results_pr.sh claude/pc-table-v1-results"), "opens a results PR");
    }
}

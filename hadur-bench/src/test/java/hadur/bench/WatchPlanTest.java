package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/**
 * BENCH-128..131: the queue's live progress and stop rules. The runner is Python (benchqueue.py,
 * benchwatch.py) and its behaviour is tested in test_benchwatch.py, which CI runs; this checks the
 * smoke card and that the Python tests cover every rule, the shuffle and the progress branch.
 */
class WatchPlanTest {

    private static final Path QUEUE = Path.of("plans/watch-smoke.queue");

    @Test
    @Tag("BENCH-128")
    @DisplayName("bench-top20.sh passes --shuffle-jobs to Bench as --job-order shuffled, and the smoke screen uses it")
    void shuffledJobs() throws IOException {
        String script = Files.readString(Path.of("bench-top20.sh"));
        assertTrue(script.contains("--shuffle-jobs) SHUFFLE_JOBS=1"));
        assertTrue(script.contains("--job-order shuffled"));
        assertTrue(Files.readString(Path.of("src/main/java/hadur/bench/Bench.java")).contains("\"shuffled\".equals(opts.get(\"job-order\"))"));
        assertTrue(Files.readString(QUEUE).contains("--shuffle-jobs"));
    }

    @Test
    @Tag("BENCH-129")
    @Tag("BENCH-130")
    @DisplayName("the smoke card watches its screen with one rule of each kind and its gate runs after an early stop")
    void smokeCard() throws IOException {
        String queue = Files.readString(QUEUE);
        assertTrue(queue.contains("\n  watch:"));
        for (String r : new String[] {"fails 6", "dead 6", "skips 60 over 30", "stall 20m", "aa after 30%",
                "futility dz below 0 after 30%"}) {
            assertTrue(queue.contains("\n  stop: " + r + "\n"), r);
        }
        assertTrue(queue.contains("gate | python3 ../data/tools/multiarm.py work/watch-smoke/arms.tsv"));
        assertTrue(Files.isRegularFile(Path.of("watch-smoke.txt")));
        assertTrue(Files.readString(Path.of("plans/watch-smoke.arms")).contains("dz | kneels.nano.Derp 0.2"));
    }

    @Test
    @Tag("BENCH-129")
    @Tag("BENCH-130")
    @Tag("BENCH-131")
    @DisplayName("test_benchwatch.py exercises every rule, both actions, the progress branch push, and CI runs it")
    void pythonTestsCover() throws IOException {
        String tests = Files.readString(Path.of("test_benchwatch.py"));
        for (String s : new String[] {"futility", "\"aa", "fails 3", "dead 8", "skips 40 over 20", "stall 5m",
                "test_a_halt_rule_stops_the_queue_and_a_rerun_resumes",
                "test_futility_finishes_the_step_and_the_gate_reads_the_rows_so_far",
                "test_progress_is_pushed_to_its_branch_without_touching_the_work_tree"}) {
            assertTrue(tests.contains(s), s);
        }
        assertTrue(Files.readString(Path.of("benchqueue.py")).contains("def raise_alert"));
        assertTrue(Files.readString(Path.of("../.github/workflows/build.yml")).contains("test_benchwatch.py"));
    }
}

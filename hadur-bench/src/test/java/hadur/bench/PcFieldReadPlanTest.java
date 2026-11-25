package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** BENCH-292: the pc-field-read card reads the whole-field trace by mover, with no battles. */
class PcFieldReadPlanTest {

    @Test
    @Tag("BENCH-292")
    @DisplayName("pc-field-read: no battles, a clear stop when the trace is gone, the driver census and ram-wait list, a results PR")
    void cardIsComplete() throws IOException {
        String q = Files.readString(Path.of("plans/pc-field-read.queue"));
        assertTrue(!q.contains("bench-top20.sh") && !q.contains("hadur.bench.Bench"), "no battles");
        assertTrue(q.contains("set W = work/learn-trace-324\n"), "the whole-field trace");
        assertTrue(q.contains("test -d ${W}/battles || {"), "stops clearly when the trace is gone");
        assertTrue(q.contains("../data/tools/driver_census.py ${W} --arm c --ledger field-ledger.tsv --table "
            + "../hadur-robot/src/main/java/hadur117/ShieldTableData.java"));
        assertTrue(q.contains("--ram-out ${OUT}/field-read-ram-wait.tsv"));
        assertTrue(q.contains("open_results_pr.sh claude/pc-field-read-results") && q.contains("  after: read"));
        assertTrue(Files.isRegularFile(Path.of("../data/tools/driver_census.py")));
        assertTrue(Files.readString(Path.of("plans/timing-legacy.txt")).contains("\npc-field-read.queue\n"),
            "a read card runs no bench, so it needs no live-match step");
    }
}

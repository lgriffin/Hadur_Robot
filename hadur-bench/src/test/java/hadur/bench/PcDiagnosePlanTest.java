package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** BENCH-240: the field diagnosis card (plans/pc-diagnose.queue) reads the learn-trace logs and opens a results PR. */
class PcDiagnosePlanTest {

    @Test
    @Tag("BENCH-240")
    @DisplayName("reads work/learn-trace-pc with diagnose_field.py (c against bb, the ledger's gaps), then a results PR")
    void cardIsComplete() throws IOException {
        String queue = Files.readString(Path.of("plans/pc-diagnose.queue"));
        assertTrue(queue.contains("set W = work/learn-trace-pc\n"), "the learn-trace logs pc-learn-trace leaves");
        assertTrue(queue.contains("set W = work/learn-trace-pc")
            && Files.readString(Path.of("plans/pc-learn-trace.queue")).contains("set W = work/learn-trace-pc\n"),
            "the same work directory as pc-learn-trace");
        assertTrue(queue.contains("\nread | test -d ${W}/battles && python3 -I ../data/tools/diagnose_field.py ${W} --base c"
            + " --other bb --ledger field-ledger.tsv "), "the read");
        assertTrue(Files.exists(Path.of("../data/tools/diagnose_field.py")) && Files.exists(Path.of("field-ledger.tsv")));
        assertTrue(queue.contains("\npr | bash tools/open_results_pr.sh claude/pc-diagnose-results ")
            && queue.substring(queue.indexOf("\npr | ")).contains("after: read"), "a results PR after the read");
        String arms = Files.readString(Path.of("plans/pc-learn-trace.arms"));
        assertTrue(arms.contains("\nc | ") && arms.contains("\nbb | kc.mega.BeepBoop 2.0 |"), "the arms the read pairs");
    }
}

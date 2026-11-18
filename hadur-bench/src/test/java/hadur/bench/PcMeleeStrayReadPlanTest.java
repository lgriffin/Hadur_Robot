package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** BENCH-258: the pc-melee-stray-read card (the census and twelve ScalarR-seated fields, traced, read for stray fire) is complete before it reaches the PC. */
class PcMeleeStrayReadPlanTest {

    @Test
    @Tag("BENCH-258")
    @DisplayName("master fights the 46 census fields and 12 ScalarR-seated fields once with the melee trace on, melee_strays.py reads both, and the read goes out as a results PR")
    void cardIsComplete() throws IOException {
        String queue = Files.readString(Path.of("plans/pc-melee-stray-read.queue"));
        assertTrue(queue.startsWith("# battle: melee\n"), "a melee card, outside the 1v1 live-match rule");
        String[] steps = {"srprep", "srtrace", "srseat", "srread", "srpr"};
        for (int i = 1; i < steps.length; i++) {
            int at = queue.indexOf("\n" + steps[i] + " ");
            assertTrue(at >= 0, steps[i]);
            int next = queue.indexOf("\nsr", at + 1);
            String body = queue.substring(at, next < 0 ? queue.length() : next);
            assertTrue(body.contains("after: " + steps[i - 1]), steps[i]);
            if (steps[i].equals("srtrace") || steps[i].equals("srseat")) {
                assertTrue(body.contains("stop: fails 10") && body.contains("stop: stall 30m"), steps[i]);
            }
        }
        assertTrue(queue.contains("<robot.release>"), "the version comes from the pom");
        assertFalse(queue.matches("(?s).*Hadur_3\\.\\d.*"), "no robot version is hard-coded");
        assertTrue(queue.contains("${S} seat --suite melee-census-317.txt --fields 12 --robot \"aaa.r.ScalarR 0.005g.047 | melee-1 | aaa.r.ScalarR_0.005g.047.jar\""));
        assertTrue(queue.contains("${S} work/melee-stray-\"$V\" --ours hadur117.Hadur --compare aaa.r.ScalarR"));
        assertTrue(queue.contains("${S} work/melee-stray-seat-\"$V\" --ours hadur117.Hadur --compare aaa.r.ScalarR --out ${OUT}/melee-stray-seat.md"));
        assertTrue(queue.contains("open_results_pr.sh claude/pc-melee-stray-read-results"));
        assertTrue(queue.contains("What the result decides"));
        String census = Files.readString(Path.of("plans/melee-stray.args"));
        assertTrue(census.contains("--suite\nmelee-census-317.txt\n") && census.contains("--seeds\n1\n") && census.contains("--seed-base\n3360\n")
            && census.contains("--rounds\n20\n") && census.contains("--out\nwork/melee-stray-@V@\n"));
        String seat = Files.readString(Path.of("plans/melee-stray-seat.args"));
        assertTrue(seat.contains("--suite\nwork/melee-stray-seat.txt\n") && seat.contains("--seeds\n1\n") && seat.contains("--seed-base\n3361\n")
            && seat.contains("--rounds\n20\n") && seat.contains("--out\nwork/melee-stray-seat-@V@\n"));
        for (String args : new String[] {census, seat}) {
            assertTrue(args.contains("--melee-trace\ntrue\n"), "the trace is on");
            assertFalse(args.contains("--baseline"), "one build: the card compares no builds");
            assertTrue(args.contains("bisect/hadur117.Hadur_@V@aa.jar"));
        }
        assertTrue(Files.exists(Path.of("melee-census-317.txt")) && Files.exists(Path.of("tools/melee_strays.py")));
    }
}

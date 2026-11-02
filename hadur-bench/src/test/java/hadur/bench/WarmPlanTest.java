package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** BENCH-174: the cold-against-warm card (plans/pc-warm.queue) is complete before it reaches the PC. */
class WarmPlanTest {

    @Test
    @Tag("BENCH-174")
    @DisplayName("sa and aa cold then warm on the 400 screen at 2 fresh seeds, the read, the stop rules and the PR")
    void cardIsComplete() throws IOException {
        String queue = Files.readString(Path.of("plans/pc-warm.queue"));
        String version = Files.readString(Path.of("../hadur-robot/pom.xml"))
            .replaceAll("(?s).*<robot.release>(.*?)</robot.release>.*", "$1");
        assertTrue(queue.contains("set V = " + version + "\n"), "the card builds the current release");
        assertTrue(queue.contains("build-ablation.sh aa ") && queue.contains("build-ablation.sh seedall "));
        assertTrue(Files.readString(Path.of("build-ablation.sh")).contains("        seedall)"), "the seedall ablation exists");
        assertTrue(queue.contains("--set screen-311.txt --seeds 2 --seed-base 7900"));
        assertTrue(queue.contains("--robot \"hadur117.Hadur ${V}sa\" --baseline bisect/hadur117.Hadur_${V}aa.jar"
            + " --baseline-robot \"hadur117.Hadur ${V}aa\" --cold-warm --out ${W}"));
        assertTrue(queue.contains("tools/cold_warm_read.py ${W}/cold-warm.tsv"));
        String[] steps = {"prep", "cw", "read", "pr"};
        for (int i = 1; i < steps.length; i++) {
            int at = queue.indexOf("\n" + steps[i] + " | ");
            assertTrue(at >= 0, steps[i]);
            int next = queue.indexOf("\n\n", at + 1);
            assertTrue(queue.substring(at, next < 0 ? queue.length() : next).contains("after: " + steps[i - 1]),
                steps[i] + " after " + steps[i - 1]);
        }
        String cw = queue.substring(queue.indexOf("\ncw | "), queue.indexOf("\n\nread | "));
        for (String rule : new String[] {"fails 30", "skips 60 over 200", "stall 30m"}) {
            assertTrue(cw.contains("stop: " + rule), rule);
        }
        String read = queue.substring(queue.indexOf("\nread | "), queue.indexOf("\n\npr | "));
        assertTrue(!read.contains(";"), "a read error must stop the card before the results PR");
        assertTrue(queue.contains("open_results_pr.sh claude/pc-warm-results"));
        assertTrue(queue.contains("set ALERT = lgriffin") && queue.contains("set P = --parallel 12 --no-truth-log"));
    }
}

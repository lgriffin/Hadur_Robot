package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** BENCH-58: the CPU-constant sweep script derives its three runs and labels; the dry run starts nothing. */
@Tag("BENCH-58")
class SweepScriptTest {

    private static String dryRun(String... args) throws Exception {
        Path script = Path.of("sweep-cpu-constant.sh").toAbsolutePath();
        assumeTrue(Files.exists(script), "run from the hadur-bench directory");
        List<String> cmd = new ArrayList<>(List.of("sh", script.toString()));
        cmd.addAll(List.of(args));
        Process p;
        try {
            p = new ProcessBuilder(cmd).redirectErrorStream(true).start();
        } catch (IOException e) {
            assumeTrue(false, "no sh on this machine");
            return "";
        }
        String text = new String(p.getInputStream().readAllBytes(), StandardCharsets.UTF_8);
        assertEquals(0, p.waitFor(), text);
        return text;
    }

    @Test
    @DisplayName("a dry run lists the constant at 0.5x, 1x and 2x with a label for each")
    void dryRunDerivesConstantsAndLabels() throws Exception {
        String text = dryRun("--dry-run", "--constant", "1000", "--label", "t");
        assertTrue(text.contains("--cpu-constant 500 --label t-cpu0.5x"), text);
        assertTrue(text.contains("--cpu-constant 1000 --label t-cpu1x"), text);
        assertTrue(text.contains("--cpu-constant 2000 --label t-cpu2x"), text);
    }

    @Test
    @DisplayName("only the first run builds and fetches, and options after -- reach every run")
    void laterRunsSkipTheBuild() throws Exception {
        String text = dryRun("--dry-run", "--constant", "1000", "--multipliers", "1 4", "--", "--parallel", "8");
        String[] lines = text.split("\n");
        assertEquals(1, Arrays.stream(lines).filter(l -> l.contains("--skip-build --skip-fetch")).count(), text);
        assertTrue(text.contains("--cpu-constant 4000 --label sweep-cpu4x"), text);
        assertEquals(2, Arrays.stream(lines).filter(l -> l.contains("--parallel 8")).count(), text);
    }
}

package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/**
 * Issue #151: the LiteRumble arithmetic lives in data/tools/literumble.py (standard library
 * Python, beside analyse.py). Each test runs one class of its unit tests, so the requirements
 * are traced and fail the Maven build like any other. Skipped where no python3 is on the PATH.
 */
class LiveToolsTest {

    private static final Path TOOLS = Path.of("..", "data", "tools");

    @Test
    @Tag("BENCH-73")
    @DisplayName("bench differences project onto the live APS as their sum over the page's pairings")
    void projection() throws Exception {
        assertEquals(0, unittest("test_literumble.ProjectionTest"));
    }

    @Test
    @Tag("BENCH-74")
    @DisplayName("a set's coverage of the live field by rank band, with version drift and unrunnable robots")
    void coverage() throws Exception {
        assertEquals(0, unittest("test_literumble.CoverageTest"));
    }

    @Test
    @Tag("BENCH-75")
    @DisplayName("LiteRumble's APS, CI, PWIN and survival, reproducing the saved 3.9 page's header")
    void summary() throws Exception {
        assertEquals(0, unittest("test_literumble.SummaryTest"));
    }

    @Test
    @Tag("BENCH-73")
    @Tag("BENCH-74")
    @Tag("BENCH-75")
    @DisplayName("analyse.py --live prints and writes the LiteRumble-style read")
    void analyseLive() throws Exception {
        assertEquals(0, unittest("test_literumble.AnalyseLiveTest"));
    }

    private static int unittest(String target) throws IOException, InterruptedException {
        assumeTrue(python(), "python3 is not on the PATH");
        Path log = Files.createTempFile("literumble", ".log");
        Process p = new ProcessBuilder("python3", "-m", "unittest", "-q", target)
            .directory(TOOLS.toFile()).redirectErrorStream(true).redirectOutput(log.toFile()).start();
        if (!p.waitFor(2, TimeUnit.MINUTES)) {
            p.destroyForcibly();
            return -1;
        }
        if (p.exitValue() != 0) System.err.println(Files.readString(log, StandardCharsets.UTF_8));
        return p.exitValue();
    }

    private static boolean python() {
        try {
            Process p = new ProcessBuilder("python3", "--version").start();
            return p.waitFor(30, TimeUnit.SECONDS) && p.exitValue() == 0;
        } catch (IOException | InterruptedException e) {
            return false;
        }
    }
}

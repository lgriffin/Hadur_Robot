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

    @Test
    @Tag("BENCH-80")
    @DisplayName("two live passes compared off the opponents the change touched, with the drift's interval")
    void drift() throws Exception {
        assertEquals(0, unittest("test_live_passes.DriftTest"));
    }

    @Test
    @Tag("BENCH-81")
    @DisplayName("single-battle pairings far under Hadur's other passes, per pass")
    void collapses() throws Exception {
        assertEquals(0, unittest("test_live_passes.CollapsesTest"));
    }

    @Test
    @Tag("BENCH-82")
    @DisplayName("every opponent classed by tier, problem tags, kind and the room at the peers' median")
    void classify() throws Exception {
        assertEquals(0, unittest("test_live_passes.ClassifyTest"));
    }

    @Test
    @Tag("BENCH-84")
    @DisplayName("analyse.py does not trust a battle where a robot was denied a JDK class-path resource")
    void hostDenial() throws Exception {
        assertEquals(0, unittest("test_live_passes.HostDenialTest"));
    }

    @Test
    @Tag("BENCH-85")
    @DisplayName("Hadur's profiles decoded with the codec's checks, counting stored shield verdicts")
    void clientProfiles() throws Exception {
        assertEquals(0, unittest("test_live_client.ProfilesTest"));
    }

    @Test
    @Tag("BENCH-86")
    @DisplayName("a live client's battles and health records harvested once each, across uploads and restarts")
    void clientFiles() throws Exception {
        assertEquals(0, unittest("test_live_client.ClientFilesTest"));
    }

    @Test
    @Tag("BENCH-87")
    @DisplayName("each newly uploaded battle's score inferred from two live pages, drops flagged")
    void livePage() throws Exception {
        assertEquals(0, unittest("test_live_client.PageTest"));
    }

    @Test
    @Tag("BENCH-88")
    @DisplayName("a watch folder summarised, 1v1 battles joined to their health records")
    void clientReport() throws Exception {
        assertEquals(0, unittest("test_live_client.ReportTest"));
    }

    @Test
    @Tag("BENCH-121")
    @DisplayName("the clients run under the watch: a console per start, Hadur's lines counted, restarts between battles")
    void clients() throws Exception {
        assertEquals(0, unittest("test_live_client.ClientsTest"));
    }

    @Test
    @Tag("BENCH-124")
    @DisplayName("the live tools know Hadur by both packages, hadur2 and hadur117, and keep Saor apart")
    void packageNames() throws Exception {
        assertEquals(0, unittest("test_live_client.PackageNamesTest"));
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

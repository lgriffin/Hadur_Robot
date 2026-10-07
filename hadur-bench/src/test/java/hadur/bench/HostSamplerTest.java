package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

/**
 * BENCH-50: each battle's result carries the host load it ran under, from a sampler of system
 * CPU use and of the other Robocode JVMs. None of this starts a battle.
 */
@Tag("BENCH-50")
class HostSamplerTest {

    @Test
    @DisplayName("a battle's window takes min, mean and max of the samples inside it and the most other JVMs")
    void windowSummarisesTheSamplesInsideIt() {
        Host.Sampler s = new Host.Sampler(1000, 1000, () -> 0, () -> 0);
        s.record(500, 0.90, 9);
        s.record(1000, 0.20, 1);
        s.record(2000, 0.40, 3);
        s.record(3000, 0.60, 2);
        s.record(4000, 0.10, 8);
        Host.Window w = s.window(1000, 3000);
        assertEquals(0.20, w.cpuMin(), 1e-9);
        assertEquals(0.40, w.cpuMean(), 1e-9);
        assertEquals(0.60, w.cpuMax(), 1e-9);
        assertEquals(3, w.otherJvms());
        assertEquals(3, w.samples());
    }

    @Test
    @DisplayName("a battle shorter than the interval takes the last sample before it")
    void shortBattleTakesTheLastSampleBefore() {
        Host.Sampler s = new Host.Sampler(1000, 1000, () -> 0, () -> 0);
        s.record(1000, 0.30, 4);
        s.record(5000, 0.80, 7);
        Host.Window w = s.window(2000, 2500);
        assertEquals(0.30, w.cpuMean(), 1e-9);
        assertEquals(4, w.otherJvms());
    }

    @Test
    @DisplayName("no sample at all gives NaN load and an unknown JVM count")
    void noSamplesIsUnknown() {
        Host.Sampler s = new Host.Sampler(1000, 1000, () -> 0, () -> 0);
        Host.Window w = s.window(0, 100);
        assertTrue(Double.isNaN(w.cpuMean()));
        assertEquals(-1, w.otherJvms());
    }

    @Test
    @DisplayName("a CPU load the JVM cannot give yet (negative or NaN) is not averaged in")
    void unknownLoadIsLeftOut() {
        Host.Sampler s = new Host.Sampler(1000, 1000, () -> 0, () -> 0);
        s.record(1, -1.0, 2);
        s.record(2, Double.NaN, 2);
        s.record(3, 0.50, 2);
        Host.Window w = s.overall();
        assertEquals(0.50, w.cpuMean(), 1e-9);
        assertEquals(0.50, w.cpuMin(), 1e-9);
    }

    @Test
    @DisplayName("the running sampler fills its samples from its suppliers and stops on close")
    void runningSamplerSamples() throws InterruptedException {
        Host.Sampler s = new Host.Sampler(5, 5, () -> 0.25, () -> 3);
        s.start();
        long deadline = System.currentTimeMillis() + 5000;
        while (s.overall().samples() < 3 && System.currentTimeMillis() < deadline) Thread.sleep(10);
        s.close();
        Host.Window w = s.overall();
        assertTrue(w.samples() >= 3);
        assertEquals(0.25, w.cpuMean(), 1e-9);
        assertEquals(3, w.otherJvms());
    }

    @Test
    @DisplayName("jps lines are counted by main class, leaving out this JVM and the bench's own children")
    void robocodeJvmsLeavesOutSelfAndOwn() {
        List<String> jps = List.of(
            "100 hadur.bench.Bench",
            "200 roborumble.RoboRumbleAtHome",
            "201 roborumble.RoboRumbleAtHome",
            "300 hadur.bench.BattleRunner",
            "400 org.apache.maven.wrapper.MavenWrapperMain",
            "garbage",
            "500 jdk.jcmd/sun.tools.jps.Jps");
        Map<String, Integer> found = Host.robocodeJvms(jps, 100, Set.of(300L));
        assertEquals(Map.of("roborumble.RoboRumbleAtHome", 2), found);
    }

    @Test
    @DisplayName("a result row carries the four host columns, appended to the header")
    void rowCarriesTheHostColumns() {
        assertTrue(BattleResult.HEADER.contains(",hostCpuMin,hostCpuMean,hostCpuMax,otherJvms,"));
        BattleResult r = BattleResult.parse(BattleResult.failed("x"));
        r.hostCpuMin = 0.125;
        r.hostCpuMean = 0.5;
        r.hostCpuMax = 0.875;
        r.otherJvms = 6;
        String csv = r.toCsv();
        assertEquals(BattleResult.HEADER.split(",").length, csv.split(",").length);
        BattleResult back = BattleResult.parse(csv);
        assertEquals(0.5, back.hostCpuMean, 1e-6);
        assertEquals(0.875, back.hostCpuMax, 1e-6);
        assertEquals(6, back.otherJvms);
    }

    @Test
    @DisplayName("a row without the host columns still reads, with the load unknown")
    void oldRowStillReads() {
        String failed = BattleResult.failed("old format");
        String old = failed.substring(0, failed.length() - (",0,0,0,0,0,NaN,NaN,NaN,-1" + BattleResult.FAILED_TAIL).length());
        assertEquals(51, old.split(",", -1).length);
        BattleResult r = BattleResult.parse(old);
        assertEquals("old format", r.errors);
        assertTrue(Double.isNaN(r.hostCpuMean));
        assertEquals(-1, r.otherJvms);
    }

    @Test
    @DisplayName("annotate gives the result the window and rewrites result.csv with the columns filled in")
    void annotateRewritesTheResultFile(@TempDir Path dir) throws IOException {
        BattleResult r = BattleResult.parse(BattleResult.failed("none"));
        Path file = dir.resolve("result.csv");
        Files.writeString(file, BattleResult.HEADER + "\n" + r.toCsv() + "\n");
        Bench.annotate(r, file, new Host.Window(0.1, 0.2, 0.3, 4, 5));
        BattleResult back = BattleResult.parse(Files.readAllLines(file).get(1));
        assertEquals(0.2, back.hostCpuMean, 1e-6);
        assertEquals(4, back.otherJvms);
        assertEquals(0.3, r.hostCpuMax, 1e-9);
    }

    @Test
    @DisplayName("annotate leaves a missing result file alone")
    void annotateToleratesNoFile(@TempDir Path dir) throws IOException {
        BattleResult r = BattleResult.parse(BattleResult.failed("none"));
        Bench.annotate(r, dir.resolve("result.csv"), new Host.Window(0.1, 0.2, 0.3, 4, 5));
        assertFalse(Files.exists(dir.resolve("result.csv")));
        assertEquals(4, r.otherJvms);
    }
}

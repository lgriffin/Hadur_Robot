package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.nio.file.Path;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

/** RES-5: the bench report carries the counters Hadur writes in its R and FAULT records. */
@Tag("RES-5")
class TelemetryReportTest {

    @TempDir
    Path dir;

    @Test
    @DisplayName("R and FAULT records are summed into the battle result")
    void harvestsRecords() throws Exception {
        LogHarvester h = new LogHarvester(dir, "hadur2.Hadur 2.0");
        h.readRecord("V,1");
        h.readRecord("R,0,500,win,80.00,0.00,0.2000,0.1000,0.1000,0.1000,0,1,0,0");
        h.readRecord("FAULT,1,33,IllegalStateException:boom");
        h.readRecord("R,1,700,loss,0.00,20.00,0.4000,0.1000,0.3000,0.1000,0,0,12,0");
        h.readRecord("R,broken");
        h.close();
        assertEquals(2, h.roundRecords());
        assertEquals(12, h.faults());
        assertEquals(1, h.faultRecords());
        assertEquals(0.3, h.ourHitRate(), 1e-9);
        assertEquals(0.2, h.theirHitRate(), 1e-9);
    }

    @Test
    @DisplayName("the counters survive the CSV hop between battle JVM and bench")
    void csvRoundTrip() {
        BattleResult r = sample();
        BattleResult back = BattleResult.parse(r.toCsv());
        assertEquals(r.faults, back.faults);
        assertEquals(r.faultRecords, back.faultRecords);
        assertEquals(r.roundRecords, back.roundRecords);
        assertEquals(r.ourHitRate, back.ourHitRate, 1e-3);
        assertEquals(r.theirHitRate, back.theirHitRate, 1e-3);
        assertEquals("a; b", back.errors);
        assertEquals(BattleResult.HEADER.split(",").length, r.toCsv().split(",").length);
    }

    @Test
    @DisplayName("a failed battle row still parses")
    void failedRowParses() {
        BattleResult f = BattleResult.parse(BattleResult.failed("timed out"));
        assertEquals(false, f.ok);
        assertEquals("timed out", f.errors);
    }

    @Test
    @DisplayName("the report shows hit rates and faults per opponent")
    void reportShowsCounters() throws Exception {
        Map<Opponent, List<BattleResult>> results = new LinkedHashMap<>();
        results.put(Opponent.load(Path.of("reference-set.txt")).get(0), List.of(sample()));
        String report = Report.render(results, "hadur2.Hadur 2.0", false, 35, 1, 800, 600, "cpu");
        assertTrue(report.contains("| Faults |"), report);
        assertTrue(report.contains("| 12 in 1 round(s) |"), report);
        assertTrue(report.contains("Our hit rate"), report);
    }

    static BattleResult sample() {
        BattleResult r = new BattleResult();
        r.ok = true;
        r.rounds = 35;
        r.score = 3000;
        r.theirScore = 1000;
        r.firsts = 30;
        r.roundRecords = 35;
        r.faults = 12;
        r.faultRecords = 1;
        r.ourHitRate = 0.18;
        r.theirHitRate = 0.09;
        r.errors = "a, b";
        return r;
    }
}

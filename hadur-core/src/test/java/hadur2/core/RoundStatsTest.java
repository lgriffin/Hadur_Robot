package hadur2.core;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur2.core.model.BotEvent;
import hadur2.core.model.BotInput;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** RES-5: every fault and degradation counter reaches the round record. */
@Tag("RES-5")
class RoundStatsTest {

    @Test
    @DisplayName("the R record carries every counter in the documented order")
    void recordLayout() {
        RoundStats s = new RoundStats();
        s.shotsFired = 10;
        s.shotsHit = 3;
        s.enemyShotsDetected = 8;
        s.hitsTaken = 2;
        s.phantomWaves = 4;
        s.skippedTurns = 5;
        s.faults = 6;
        s.computationLevel = 7;
        String[] f = s.toRecord(2, 900, "win", 55.5, 0).split(",");
        assertEquals(14, f.length);
        assertEquals("R", f[0]);
        assertEquals("2", f[1]);
        assertEquals("900", f[2]);
        assertEquals("win", f[3]);
        assertEquals("55.50", f[4]);
        assertEquals("0.00", f[5]);
        assertEquals("0.3000", f[6]);
        assertEquals("0.2500", f[8]);
        assertEquals("4", f[10], "phantom waves");
        assertEquals("5", f[11], "skipped turns");
        assertEquals("6", f[12], "faults");
        assertEquals("7", f[13], "computation level");
    }

    @Test
    @DisplayName("no shots means a zero rate with the widest margin")
    void emptyRates() {
        String[] f = new RoundStats().toRecord(0, 1, "loss", 0, 100).split(",");
        assertEquals("0.0000", f[6]);
        assertEquals("1.0000", f[7]);
    }

    @Test
    @DisplayName("the core counts skipped turns and faults into the round record")
    void coreCountsIntoRecord() {
        List<String> telemetry = new ArrayList<>();
        HadurCore core = new HadurCore(800, 600, 1, telemetry::add);
        core.newRound(3);
        core.tick(new BotInput(5, 3, 400, 300, 0, 0, 100, 0, 0.1, 0, 0, 0, 1,
            List.of(new BotEvent.SkippedTurn(4), new BotEvent.SkippedTurn(5))));
        core.roundEnded(40, "draw", 80, 9);
        String r = telemetry.get(telemetry.size() - 1);
        assertTrue(r.startsWith("R,3,40,draw,80.00,"), r);
        String[] f = r.split(",");
        assertEquals("2", f[11]);
        assertEquals("9", f[12]);
        assertEquals("V,1", telemetry.get(0));
    }
}

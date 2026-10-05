package hadur2.core.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur2.core.HadurCore;
import hadur2.core.model.BotEvent;
import hadur2.core.model.BotInput;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** RES-5: every fault and degradation counter reaches the round record; POW-11: so do the hit counts by power class. */
@Tag("RES-5")
@Tag("POW-11")
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
        s.radarReacquired = 8;
        s.hiddenShots = 9;
        s.profileLoadFailures = 1;
        s.profileSaveFailures = 2;
        s.seedsEvicted = 3;
        s.bulletsIntercepted = 11;
        s.jitteredShots = 12;
        s.seedDecays = 13;
        s.distanceSum = 900;
        s.distanceScans = 3;
        s.targetDistance = 425;
        s.finishTicks = 14;
        s.ramTicks = 15;
        s.fullPowerShots = 16;
        s.slowTicks = 17;
        s.shadowedWaves = 18;
        s.flavourChanges = 1;
        s.flavourStep = 2;
        s.interceptsShadowed = 19;
        s.duressTicks = 20;
        s.ramEscapeTicks = 21;
        s.mirrorShots = 22;
        // POW-11: shots then hits, for classes 0, 1 and 2, ours then theirs.
        s.ourShotsByClass[0] = 30;
        s.ourHitsByClass[0] = 3;
        s.ourShotsByClass[1] = 4;
        s.ourHitsByClass[1] = 1;
        s.ourShotsByClass[2] = 5;
        s.ourHitsByClass[2] = 2;
        s.theirShotsByClass[0] = 40;
        s.theirHitsByClass[0] = 4;
        s.theirShotsByClass[1] = 6;
        s.theirHitsByClass[1] = 0;
        s.theirShotsByClass[2] = 7;
        s.theirHitsByClass[2] = 1;
        String[] f = s.toRecord(2, 900, "win", 55.5, 0).split(",");
        assertEquals(48, f.length);
        assertEquals("30", f[36], "our light bullets (POW-11)");
        assertEquals("3", f[37], "our light hits");
        assertEquals("4", f[38]);
        assertEquals("1", f[39]);
        assertEquals("5", f[40]);
        assertEquals("2", f[41], "our heavy hits");
        assertEquals("40", f[42], "their light bullets");
        assertEquals("4", f[43]);
        assertEquals("6", f[44]);
        assertEquals("0", f[45]);
        assertEquals("7", f[46]);
        assertEquals("1", f[47], "their heavy hits");
        assertEquals("21", f[34], "ticks running from a rammer (RAM-2)");
        assertEquals("22", f[35], "shots at the mirror image (MIR-1)");
        assertEquals("17", f[28], "slow ticks (TIME-1)");
        assertEquals("18", f[29], "shadowed waves (MOVE-1)");
        assertEquals("1", f[30], "flavour changes (MOVE-2)");
        assertEquals("2", f[31], "flavour step (MOVE-2)");
        assertEquals("19", f[32], "intercepts inside a shadow (MOVE-1)");
        assertEquals("20", f[33], "ticks in duress (RES-14)");
        assertEquals("300.0", f[23], "mean scan distance (S5)");
        assertEquals("425.0", f[24], "target distance at the round's end (DIST-1)");
        assertEquals("14", f[25], "finishing ticks (END-1)");
        assertEquals("15", f[26], "ramming ticks (END-2)");
        assertEquals("16", f[27], "full-power shots (POW-1, POW-2)");
        assertEquals("13", f[22], "seed decays (RES-4)");
        assertEquals("1", f[16], "profile load failures");
        assertEquals("2", f[17], "profile save failures");
        assertEquals("3", f[18], "seed evictions");
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
        assertEquals("8", f[14], "radar reacquire ticks");
        assertEquals("9", f[15], "hidden shots");
        assertEquals("11", f[19], "bullets shot down (SHIELD-1)");
        assertEquals("12", f[20], "jittered shots (SHIELD-2)");
        assertEquals("10", f[21], "shots fired");
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

package hadur2.core;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import hadur2.core.port.MemoryProfileStore;
import java.nio.charset.StandardCharsets;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** RES-8: a small battle-health record, written at battle end for client-side diagnosis. */
@Tag("RES-8")
class BattleHealthTest {

    @Test
    @DisplayName("writes rounds, survived, faults, skipped turns, memory failures and the allowance")
    void writesTheRecord() {
        MemoryProfileStore store = new MemoryProfileStore(200_000);
        HadurCore core = new HadurCore(800, 600, 1, line -> {}, store);
        core.writeBattleHealth(35, 32, 4, 7);
        String record = new String(store.read("health.hc"), StandardCharsets.US_ASCII);
        assertEquals("HEALTH,35,32,4,7,0,-1", record);
    }

    @Test
    @DisplayName("at most 64 bytes")
    void staysSmall() {
        MemoryProfileStore store = new MemoryProfileStore(200_000);
        HadurCore core = new HadurCore(800, 600, 1, line -> {}, store);
        core.writeBattleHealth(9999, 9999, 9999, 9999);
        assertEquals(true, store.read("health.hc").length <= 64);
    }

    @Test
    @DisplayName("does nothing without a store, and never throws")
    void noStoreIsFine() {
        HadurCore core = new HadurCore(800, 600, 1, line -> {}, null);
        core.writeBattleHealth(1, 1, 0, 0);
        // No assertion needed beyond "did not throw"; nothing to read back without a store.
        assertNull(core.profile());
    }

    @Test
    @DisplayName("overwrites the same entry each battle")
    void overwritesEachBattle() {
        MemoryProfileStore store = new MemoryProfileStore(200_000);
        HadurCore core = new HadurCore(800, 600, 1, line -> {}, store);
        core.writeBattleHealth(35, 35, 0, 0);
        core.writeBattleHealth(35, 30, 2, 1);
        assertEquals(1, store.names().stream().filter(n -> n.equals("health.hc")).count());
        assertEquals("HEALTH,35,30,2,1,0,-1",
            new String(store.read("health.hc"), StandardCharsets.US_ASCII));
    }
}

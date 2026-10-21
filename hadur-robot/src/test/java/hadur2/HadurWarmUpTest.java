package hadur2;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

import hadur2.core.role.RoleId;
import java.util.Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** TIME-5: the throwaway warm-up ticks run before the real battle starts. */
class HadurWarmUpTest {

    @Test
    @Tag("TIME-5")
    @DisplayName("TIME-5: the warm-up ticks run to completion and never throw out of the battle's start")
    void warmUpNeverThrows() {
        assertDoesNotThrow(() -> Hadur.warmUp(800, 600, 1));
        // Idempotent: nothing it touches is static, so running it again is just as safe.
        assertDoesNotThrow(() -> Hadur.warmUp(1000, 1000, 3));
    }

    @Test
    @Tag("TIME-5")
    @DisplayName("TIME-5: each role of the charter drives one warm-up tick, and none faults")
    void oneTickForEachRole() {
        assertEquals(Set.of(RoleId.DUEL), Hadur.warmUp(800, 600, 1));
        assertEquals(Set.of(RoleId.MELEE, RoleId.DUEL), Hadur.warmUp(1000, 1000, 3));
    }

    @Test
    @Tag("TIME-8")
    @DisplayName("TIME-8: the set-up record gives the warm-up, the core's construction, the memory and their total in ms")
    void setupRecord() {
        assertEquals("SETUP,0,0,212.4,35.0,3.5,250.9", Hadur.setupRecord(212_400_000L, 35_000_000L, 3_500_000L));
    }
}

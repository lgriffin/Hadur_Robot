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
}

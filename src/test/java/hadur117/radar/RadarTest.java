package hadur117.radar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Radar")
class RadarTest {

    private Radar radar;

    @BeforeEach
    void setUp() {
        radar = new Radar();
    }

    @Test
    @DisplayName("isLockAcquired returns false initially")
    void lockNotAcquiredByDefault() {
        assertFalse(radar.isLockAcquired());
    }

    @Test
    @DisplayName("resetRound sets lockAcquired back to false")
    void resetRoundClearsLock() throws Exception {
        // Manually set lockAcquired to true via reflection
        java.lang.reflect.Field lockField = Radar.class.getDeclaredField("lockAcquired");
        lockField.setAccessible(true);
        lockField.setBoolean(radar, true);
        assertTrue(radar.isLockAcquired());

        radar.resetRound();
        assertFalse(radar.isLockAcquired());
    }

    @Test
    @DisplayName("resetRound can be called multiple times safely")
    void resetRoundMultipleTimes() {
        radar.resetRound();
        radar.resetRound();
        assertFalse(radar.isLockAcquired());
    }

    @Test
    @DisplayName("resetRound on fresh instance does not throw")
    void resetFreshInstance() {
        assertDoesNotThrow(() -> radar.resetRound());
        assertFalse(radar.isLockAcquired());
    }

    @Test
    @DisplayName("new Radar instance has lockAcquired = false")
    void freshInstanceNotLocked() {
        Radar r = new Radar();
        assertFalse(r.isLockAcquired());
    }
}

package hadur117.core.duel;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** POW-14: BeepBoop's anti-BasicSurfer powers. */
class PowerDesignTest {

    @Test
    @Tag("POW-14")
    @DisplayName("a power rounds down to the highest anti-BasicSurfer power at or below it; below 0.15 it is kept")
    void roundsDown() {
        assertEquals(Math.nextAfter(2.45, -1), PowerDesign.antiBasicSurfer(3.0), 0);
        assertEquals(Math.nextAfter(2.45, -1), PowerDesign.antiBasicSurfer(2.45), 0, "2.45 itself goes one ulp under");
        assertEquals(1.95, PowerDesign.antiBasicSurfer(2.4), 0);
        assertEquals(1.95, PowerDesign.antiBasicSurfer(1.95), 0);
        assertEquals(0.65, PowerDesign.antiBasicSurfer(0.9), 0);
        assertEquals(0.15, PowerDesign.antiBasicSurfer(0.15), 0);
        assertEquals(0.1, PowerDesign.antiBasicSurfer(0.1), 0);
        assertEquals(0.2, PowerDesign.ABS_HIT_RATE, 0);
        assertFalse(PowerDesign.ANTI_BASIC_SURFER, "ships off");
    }
}

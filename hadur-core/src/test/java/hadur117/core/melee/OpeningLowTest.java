package hadur117.core.melee;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** MGUN-28: the low-power opening. */
@Tag("MGUN-28")
class OpeningLowTest {

    @Test
    @DisplayName("MGUN-28: capped until enough have died, a finisher and a hold excepted, off by default")
    void cap() {
        assertEquals(0.1, MeleeEnergyPolicy.openingPower(2.5, 2, 7, 80, true, 3, 0.1), 1e-12);
        assertEquals(2.5, MeleeEnergyPolicy.openingPower(2.5, 3, 6, 80, true, 3, 0.1), 1e-12);
        assertEquals(2.5, MeleeEnergyPolicy.openingPower(2.5, 0, 9, 10, true, 3, 0.1), 1e-12);
        assertEquals(0.0, MeleeEnergyPolicy.openingPower(0.0, 0, 9, 80, true, 3, 0.1), 1e-12);
        assertEquals(2.5, MeleeEnergyPolicy.openingPower(2.5, 0, 9, 80, false, 3, 0.1), 1e-12);
        // A melee of two never caps, whatever the dead count.
        assertEquals(2.5, MeleeEnergyPolicy.openingPower(2.5, 0, 2, 80, true, 3, 0.1), 1e-12);
        assertFalse(MeleeEnergyPolicy.OPENING_LOW);
    }
}

package hadur117.core.policy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** POW-19's low-energy cap and lead hold, as pure functions. */
class EndGamePowerTest {

    @Test
    @Tag("POW-19")
    @DisplayName("POW-19: at 20 energy or more the power is untouched")
    void highEnergyUntouched() {
        assertEquals(1.95, PowerPolicy.endGamePower(1.95, 20));
        assertEquals(3.0, PowerPolicy.endGamePower(3.0, 100));
    }

    @Test
    @Tag("POW-19")
    @DisplayName("POW-19: below 20 energy the power is capped at a fifteenth of it, never below 0.1, never raised")
    void lowEnergyCapped() {
        assertEquals(1.0, PowerPolicy.endGamePower(1.95, 15), 1e-9);
        assertEquals(0.2, PowerPolicy.endGamePower(1.95, 3), 1e-9);
        assertEquals(0.1, PowerPolicy.endGamePower(1.95, 0.6), 1e-9);
        assertEquals(0.3, PowerPolicy.endGamePower(0.3, 15), 1e-9);
    }

    @Test
    @Tag("POW-19")
    @DisplayName("POW-19: below 5 energy and ahead, a shot that gives up the lead is held")
    void holdsLowLead() {
        assertTrue(PowerPolicy.holdsLead(4.0, 0.5, 3.6));
        assertFalse(PowerPolicy.holdsLead(4.0, 0.2, 3.6), "the lead survives the shot");
        assertFalse(PowerPolicy.holdsLead(4.0, 0.5, 4.5), "behind: no lead to keep");
        assertFalse(PowerPolicy.holdsLead(6.0, 3.0, 5.9), "at 5 energy or more the hold is off");
    }
}

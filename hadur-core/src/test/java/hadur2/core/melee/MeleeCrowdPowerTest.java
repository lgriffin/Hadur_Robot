package hadur2.core.melee;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class MeleeCrowdPowerTest {

    @Test
    @Tag("MGUN-12")
    @Tag("MGUN-13")
    @DisplayName("MGUN-12, MGUN-13: the floor ships off and Ogi's power on (BENCH-118)")
    void shipped() {
        assertFalse(MeleeEnergyPolicy.CROWD_FLOOR);
        assertTrue(MeleeEnergyPolicy.CROWD_OGI);
        assertEquals(MeleeEnergyPolicy.crowdPower(1.0, 600, 80, 80, 5, false, true),
            MeleeEnergyPolicy.crowdPower(1.0, 600, 80, 80, 5), 1e-9);
    }

    @Test
    @Tag("MGUN-12")
    @DisplayName("MGUN-12: switched on, the crowd fires at least 1.9 at any distance from 20 energy")
    void floor() {
        assertEquals(1.9, MeleeEnergyPolicy.crowdPower(1.0, 600, 60, 80, 5, true, false), 1e-9);
        assertEquals(1.9, MeleeEnergyPolicy.crowdPower(1.5, 400, 60, 80, 5, true, false), 1e-9);
        assertEquals(2.5, MeleeEnergyPolicy.crowdPower(2.5, 200, 60, 80, 5, true, false), 1e-9, "never below the table");
        assertEquals(1.0, MeleeEnergyPolicy.crowdPower(1.0, 600, 19, 80, 5, true, false), 1e-9, "under 20 energy the table stands");
        assertEquals(1.95, MeleeEnergyPolicy.crowdPower(1.95, 600, 60, 80, 2, true, false), 1e-9, "two left: the duel's table");
        assertEquals(0.0, MeleeEnergyPolicy.crowdPower(0.0, 600, 60, 80, 5, true, false), 1e-9, "a hold stands");
        assertEquals(2.0, MeleeEnergyPolicy.crowdPower(2.0, 600, 60, 12, 5, true, false), 1e-9, "a finisher keeps its power");
    }

    @Test
    @Tag("MGUN-13")
    @DisplayName("MGUN-13: switched on, Ogi's 1.92, and 3 within 200 px, capped as the table is")
    void ogi() {
        assertEquals(1.92, MeleeEnergyPolicy.crowdPower(1.0, 600, 60, 80, 5, false, true), 1e-9);
        assertEquals(1.92, MeleeEnergyPolicy.crowdPower(2.5, 250, 60, 80, 5, false, true), 1e-9, "Ogi's rule replaces the table");
        assertEquals(3.0, MeleeEnergyPolicy.crowdPower(2.5, 150, 60, 80, 5, false, true), 1e-9);
        assertEquals(1.5, MeleeEnergyPolicy.crowdPower(1.0, 150, 81.5, 80, 5, false, true), 1e-9, "the lead over the target caps it");
        assertEquals(1.92, MeleeEnergyPolicy.crowdPower(1.0, 600, 20, 80, 3, false, true), 1e-9,
            "from exactly 20 energy, with exactly three opponents");
    }
}

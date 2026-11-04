package hadur117.core.melee;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class MeleeCrowdPowerTest {

    @Test
    @Tag("MGUN-13")
    @Tag("MGUN-16")
    @DisplayName("MGUN-13 and MGUN-16 ship on (BENCH-118, PR #349), so the crowd fires 3 out to 300 px")
    void shipped() {
        assertTrue(MeleeEnergyPolicy.CROWD_OGI);
        assertTrue(MeleeEnergyPolicy.OGI_WIDE);
        assertEquals(MeleeEnergyPolicy.crowdPower(1.0, 600, 59, 80, 5, true, true),
            MeleeEnergyPolicy.crowdPower(1.0, 600, 59, 80, 5), 1e-9);
        assertEquals(3.0, MeleeEnergyPolicy.crowdPower(1.95, 250, 60, 80, 3), 1e-9, "within 300 px");
        assertEquals(2.5, MeleeEnergyPolicy.crowdPower(1.95, 350, 60, 80, 3), 1e-9, "beyond 300 px from 60 energy (MGUN-25)");
        assertEquals(1.92, MeleeEnergyPolicy.crowdPower(1.95, 350, 59, 80, 3), 1e-9, "beyond 300 px under 60 energy");
        assertEquals(1.95, MeleeEnergyPolicy.crowdPower(1.95, 250, 60, 80, 2), 1e-9, "two left: the duel's table");
    }

    @Test
    @Tag("MGUN-13")
    @DisplayName("MGUN-13: switched on, Ogi's 1.92, and 3 within 200 px, capped as the table is")
    void ogi() {
        assertEquals(1.92, MeleeEnergyPolicy.crowdPower(1.0, 600, 60, 80, 5, true, false), 1e-9);
        assertEquals(1.92, MeleeEnergyPolicy.crowdPower(2.5, 250, 60, 80, 5, true, false), 1e-9, "Ogi's rule replaces the table");
        assertEquals(3.0, MeleeEnergyPolicy.crowdPower(2.5, 150, 60, 80, 5, true, false), 1e-9);
        assertEquals(1.5, MeleeEnergyPolicy.crowdPower(1.0, 150, 81.5, 80, 5, true, false), 1e-9, "the lead over the target caps it");
        assertEquals(1.92, MeleeEnergyPolicy.crowdPower(1.0, 600, 20, 80, 3, true, false), 1e-9,
            "from exactly 20 energy, with exactly three opponents");
        assertEquals(1.0, MeleeEnergyPolicy.crowdPower(1.0, 600, 19, 80, 5, true, false), 1e-9, "under 20 energy the table stands");
        assertEquals(1.95, MeleeEnergyPolicy.crowdPower(1.95, 600, 60, 80, 2, true, false), 1e-9, "two left: the duel's table");
        assertEquals(0.0, MeleeEnergyPolicy.crowdPower(0.0, 600, 60, 80, 5, true, false), 1e-9, "a hold stands");
        assertEquals(2.0, MeleeEnergyPolicy.crowdPower(2.0, 600, 60, 12, 5, true, false), 1e-9, "a finisher keeps its power");
        assertEquals(1.0, MeleeEnergyPolicy.crowdPower(1.0, 600, 60, 80, 5, false, true), 1e-9, "off: the table stands");
    }

    @Test
    @Tag("MGUN-16")
    @DisplayName("MGUN-16: switched on, power 3 out to 300 px")
    void wide() {
        assertEquals(1.92, MeleeEnergyPolicy.crowdPower(1.0, 250, 60, 80, 5, true, false), 1e-9, "off: 3 only within 200");
        assertEquals(3.0, MeleeEnergyPolicy.crowdPower(1.0, 250, 60, 80, 5, true, true), 1e-9);
        assertEquals(1.92, MeleeEnergyPolicy.crowdPower(1.0, 301, 60, 80, 5, true, true), 1e-9);
    }
}

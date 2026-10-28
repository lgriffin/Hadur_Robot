package hadur117.core.melee;

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

    @Test
    @Tag("MGUN-14")
    @Tag("MGUN-15")
    @Tag("MGUN-16")
    @DisplayName("MGUN-14 and MGUN-15 ship off; MGUN-16 ships on, so the shipped MGUN-13 fires 3 out to 300 px")
    void wideningShipsOff() {
        assertFalse(MeleeEnergyPolicy.OGI_TWO);
        assertFalse(MeleeEnergyPolicy.OGI_LOW);
        assertTrue(MeleeEnergyPolicy.OGI_WIDE);
        assertEquals(MeleeEnergyPolicy.crowdPower(1.95, 250, 15, 80, 2, false, true),
            MeleeEnergyPolicy.crowdPower(1.95, 250, 15, 80, 2), 1e-9);
        assertEquals(3.0, MeleeEnergyPolicy.crowdPower(1.95, 250, 60, 80, 3), 1e-9, "within 300 px");
        assertEquals(1.92, MeleeEnergyPolicy.crowdPower(1.95, 350, 60, 80, 3), 1e-9, "beyond 300 px");
    }

    @Test
    @Tag("MGUN-14")
    @DisplayName("MGUN-14: switched on, Ogi's power also with two opponents left; one left keeps the duel's")
    void two() {
        assertEquals(1.95, MeleeEnergyPolicy.crowdPower(1.95, 600, 60, 80, 2, false, true), 1e-9, "off: the duel's table");
        assertEquals(1.92, MeleeEnergyPolicy.crowdPower(1.95, 600, 60, 80, 2, false, true, true, false, false), 1e-9);
        assertEquals(3.0, MeleeEnergyPolicy.crowdPower(1.95, 150, 60, 80, 2, false, true, true, false, false), 1e-9);
        assertEquals(1.95, MeleeEnergyPolicy.crowdPower(1.95, 600, 60, 80, 1, false, true, true, false, false), 1e-9, "the duel");
        assertEquals(1.95, MeleeEnergyPolicy.crowdPower(1.95, 600, 60, 80, 2, false, false, true, false, false), 1e-9,
            "nothing without MGUN-13");
    }

    @Test
    @Tag("MGUN-15")
    @DisplayName("MGUN-15: switched on, Ogi's power from 10 own energy, still capped by it")
    void low() {
        assertEquals(1.0, MeleeEnergyPolicy.crowdPower(1.0, 600, 15, 80, 5, false, true), 1e-9, "off: the table under 20");
        assertEquals(1.92, MeleeEnergyPolicy.crowdPower(1.0, 600, 15, 80, 5, false, true, false, true, false), 1e-9);
        assertEquals(1.0, MeleeEnergyPolicy.crowdPower(1.0, 600, 9.9, 80, 5, false, true, false, true, false), 1e-9);
        assertEquals(1.0, MeleeEnergyPolicy.crowdPower(1.0, 600, 15, 80, 5, true, false, false, true, false), 1e-9,
            "the floor keeps its 20");
    }

    @Test
    @Tag("MGUN-16")
    @DisplayName("MGUN-16: switched on, power 3 out to 300 px")
    void wide() {
        assertEquals(1.92, MeleeEnergyPolicy.crowdPower(1.0, 250, 60, 80, 5, false, true), 1e-9, "off: 3 only within 200");
        assertEquals(3.0, MeleeEnergyPolicy.crowdPower(1.0, 250, 60, 80, 5, false, true, false, false, true), 1e-9);
        assertEquals(1.92, MeleeEnergyPolicy.crowdPower(1.0, 301, 60, 80, 5, false, true, false, false, true), 1e-9);
    }
}

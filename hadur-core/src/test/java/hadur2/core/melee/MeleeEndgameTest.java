package hadur2.core.melee;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class MeleeEndgameTest {

    @Test
    @Tag("MEND-1")
    @Tag("MEND-2")
    @Tag("MEND-3")
    @DisplayName("MEND-1..3: every Stage 1 switch ships off, so the robot plays as before")
    void shipOff() {
        assertFalse(MeleeEndgame.THREE_RING);
        assertFalse(MeleeEndgame.THREE_POWER);
        assertFalse(MeleeEndgame.THREE_FAR);
    }

    @Test
    @Tag("MEND-1")
    @DisplayName("MEND-1: switched on, two opponents left off a team keeps the crowd's ring; a team keeps MMOVE-4")
    void ring() {
        assertTrue(MeleeEndgame.endgameRing(2, false, false), "off: MMOVE-4 as before");
        assertFalse(MeleeEndgame.endgameRing(2, false, true));
        assertTrue(MeleeEndgame.endgameRing(2, true, true), "a team is untouched");
        assertFalse(MeleeEndgame.endgameRing(3, false, true));
        assertFalse(MeleeEndgame.endgameRing(1, false, false));
    }

    @Test
    @Tag("MEND-2")
    @DisplayName("MEND-2: switched on, two opponents left off a team reads the crowd's power table")
    void power() {
        assertEquals(2, MeleeEndgame.powerOthers(2, false, false), "off: as before");
        assertEquals(3, MeleeEndgame.powerOthers(2, false, true));
        assertEquals(2, MeleeEndgame.powerOthers(2, true, true), "a team is untouched");
        assertEquals(1, MeleeEndgame.powerOthers(1, false, true), "the duel is untouched");
        assertEquals(5, MeleeEndgame.powerOthers(5, false, true));
        // At 400 px the duel's table fires 1.95; the crowd's fires 1.5.
        assertEquals(1.5, MeleeEnergyPolicy.power(400, 60, 80, MeleeEndgame.powerOthers(2, false, true)), 1e-9);
        assertEquals(1.95, MeleeEnergyPolicy.power(400, 100, 80, MeleeEndgame.powerOthers(2, false, false)), 1e-9);
    }

    @Test
    @Tag("MEND-3")
    @DisplayName("MEND-3: switched on, being a survivor's closest robot weighs 4 off a team with two opponents left")
    void far() {
        assertEquals(2.0, MeleeEndgame.closestFactor(2.0, 2, false, false), 1e-9, "off: MMOVE-2 as before");
        assertEquals(4.0, MeleeEndgame.closestFactor(2.0, 2, false, true), 1e-9);
        assertEquals(2.0, MeleeEndgame.closestFactor(2.0, 2, true, true), 1e-9, "a team is untouched");
        assertEquals(2.0, MeleeEndgame.closestFactor(2.0, 3, false, true), 1e-9);
    }
}

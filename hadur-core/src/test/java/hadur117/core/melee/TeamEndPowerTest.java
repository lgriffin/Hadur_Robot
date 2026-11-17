package hadur117.core.melee;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** TMODE-51: the team endgame's power. */
class TeamEndPowerTest {

    @Test
    @Tag("TMODE-51")
    @DisplayName("TMODE-51: with two or fewer enemies a light shot rises to 1.9, capped by the kill and a third of own energy")
    void raisesEndgameShots() {
        assertEquals(1.9, MeleeEnergyPolicy.teamEndPower(0.1, 16, 50, 2), 1e-12);
        assertEquals(1.9, MeleeEnergyPolicy.teamEndPower(0.13, 25, 33, 1), 1e-12);
        assertEquals(4.0 / 3, MeleeEnergyPolicy.teamEndPower(0.1, 4, 50, 1), 1e-12);
        assertEquals(MeleeEnergyPolicy.killPower(2), MeleeEnergyPolicy.teamEndPower(0.1, 20, 2, 2), 1e-12);
    }

    @Test
    @Tag("TMODE-51")
    @DisplayName("TMODE-51: a hold, a heavier shot and three or more enemies left stand; off in the shipped build")
    void leavesTheRest() {
        assertEquals(0, MeleeEnergyPolicy.teamEndPower(0, 50, 50, 2), 0);
        assertEquals(2.95, MeleeEnergyPolicy.teamEndPower(2.95, 50, 50, 2), 0);
        assertEquals(0.5, MeleeEnergyPolicy.teamEndPower(0.5, 8, 50, 3), 0);
        assertEquals(1.5, MeleeEnergyPolicy.teamEndPower(1.5, 3, 50, 2), 0);
        assertFalse(TeamModes.FORCE_ENDPOWER);
    }
}

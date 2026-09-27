package hadur2.core.melee;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class MeleeEnergyPolicyTest {

    @Test
    @Tag("MGUN-3")
    @DisplayName("MGUN-3: the table by distance with four or more opponents left")
    void distanceBands() {
        assertEquals(1.0, MeleeEnergyPolicy.power(600, 100, 80, 5), 1e-9);
        assertEquals(1.5, MeleeEnergyPolicy.power(400, 100, 80, 5), 1e-9);
        assertEquals(1.5, MeleeEnergyPolicy.power(300, 100, 80, 5), 1e-9);
        assertEquals(2.0 + 1 / 3.0, MeleeEnergyPolicy.power(250, 100, 80, 5), 1e-9);
        assertEquals(3.0, MeleeEnergyPolicy.power(150, 100, 80, 5), 1e-9);
        assertEquals(3.0, MeleeEnergyPolicy.power(60, 100, 80, 5), 1e-9);
    }

    @Test
    @Tag("MGUN-3")
    @DisplayName("MGUN-3: low own energy fires 1.0, or 0.5 below 10, and nothing below 1.0")
    void lowEnergy() {
        assertEquals(1.0, MeleeEnergyPolicy.power(100, 19, 80, 5), 1e-9);
        assertEquals(0.5, MeleeEnergyPolicy.power(100, 9, 80, 5), 1e-9);
        assertEquals(0, MeleeEnergyPolicy.power(100, 0.9, 80, 5));
    }

    @Test
    @Tag("MGUN-3")
    @DisplayName("MGUN-3: a shot never drops Hadur's energy below a weaker target's")
    void neverBelowTarget() {
        assertEquals(1.0, MeleeEnergyPolicy.power(100, 60, 59, 5), 1e-9);
        assertEquals(MeleeEnergyPolicy.MIN_POWER, MeleeEnergyPolicy.power(100, 60, 59.9, 5), 1e-9);
        // A lead smaller than the lightest shot: holding fire is the only way to keep it.
        assertEquals(0, MeleeEnergyPolicy.power(100, 60, 59.95, 5));
        // Already behind: the table stands.
        assertEquals(3.0, MeleeEnergyPolicy.power(100, 50, 70, 5), 1e-9);
    }

    @Test
    @Tag("MGUN-3")
    @DisplayName("MGUN-3: with two opponents left the duel's table applies")
    void duelTable() {
        assertEquals(1.95, MeleeEnergyPolicy.power(300, 100, 80, 2), 1e-9);
        assertEquals(2.95, MeleeEnergyPolicy.power(100, 100, 80, 2), 1e-9);
        assertTrue(MeleeEnergyPolicy.power(500, 30, 20, 2) < 1.95);
    }

    @Test
    @Tag("MGUN-2")
    @DisplayName("MGUN-2: a finisher gets exactly the power that kills it")
    void finisher() {
        assertEquals(0.51, MeleeEnergyPolicy.power(600, 100, 2, 5), 1e-9);
        // Power 2 deals 4*2 + 2*(2-1) = 10 damage.
        assertEquals(2.01, MeleeEnergyPolicy.power(600, 100, 10, 5), 1e-9);
        assertEquals(3.0, MeleeEnergyPolicy.power(600, 100, 16, 5), 1e-9);
        assertEquals(0.1, MeleeEnergyPolicy.killPower(0.0), 1e-9);
    }
}

package hadur117.core.melee;

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

    @Test
    @Tag("MGUN-6")
    @DisplayName("MGUN-6: on a team, from 30 own energy, every shot is 3 or what kills the target")
    void teamFullPower() {
        // The table's 1.0 beyond 500 px, its lead cap and its two-left row all give way.
        assertEquals(3.0, MeleeEnergyPolicy.teamPower(MeleeEnergyPolicy.power(600, 100, 80, 5), 100, 80), 1e-9);
        assertEquals(3.0, MeleeEnergyPolicy.teamPower(MeleeEnergyPolicy.power(100, 60, 59, 5), 60, 59), 1e-9);
        assertEquals(3.0, MeleeEnergyPolicy.teamPower(MeleeEnergyPolicy.power(400, 100, 80, 2), 100, 80), 1e-9);
        assertEquals(3.0, MeleeEnergyPolicy.teamPower(1.5, MeleeEnergyPolicy.TEAM_FULL_POWER_ENERGY, 80), 1e-9);
        // Never more than kills the target.
        assertEquals(MeleeEnergyPolicy.killPower(10), MeleeEnergyPolicy.teamPower(1.0, 100, 10), 1e-9);
    }

    @Test
    @Tag("MGUN-6")
    @DisplayName("MGUN-6: on a team, below 30 own energy or on a hold, the table stands")
    void teamTableStands() {
        assertEquals(1.0, MeleeEnergyPolicy.teamPower(1.0, 29.9, 80), 1e-9);
        assertEquals(0.5, MeleeEnergyPolicy.teamPower(0.5, 9, 80), 1e-9);
        assertEquals(0, MeleeEnergyPolicy.teamPower(0, 100, 99.95));
    }

    @Test
    @Tag("MGUN-25")
    @DisplayName("MGUN-25: on at 2.5; at least the far power beyond 300 px with 60 energy or more and three or more left")
    void farPower() {
        assertTrue(MeleeEnergyPolicy.FAR_SPARE);
        assertEquals(2.5, MeleeEnergyPolicy.FAR_SPARE_POWER, 1e-12);
        assertEquals(2.5, MeleeEnergyPolicy.crowdPower(1.5, 600, 60, 50, 5), 1e-9, "on: 2.5 beyond 300 px from 60 energy");
        assertEquals(1.92, MeleeEnergyPolicy.crowdPower(1.5, 600, 59, 50, 5), 1e-9, "under 60 energy MGUN-13 stands");
        assertEquals(3.0, MeleeEnergyPolicy.farPower(1.92, 600, 70, 50, 5, true, 3.0), 1e-9);
        assertEquals(2.5, MeleeEnergyPolicy.farPower(1.92, 900, 60, 50, 3, true, 2.5), 1e-9, "from 60 energy, three left");
        assertEquals(1.92, MeleeEnergyPolicy.farPower(1.92, 600, 59, 50, 5, true, 3.0), 1e-9, "under 60 energy: unchanged");
        assertEquals(3.0, MeleeEnergyPolicy.farPower(3.0, 300, 70, 50, 5, true, 2.5), 1e-9, "within 300 px: unchanged");
        assertEquals(1.92, MeleeEnergyPolicy.farPower(1.92, 600, 70, 50, 2, true, 3.0), 1e-9, "two left: the duel's");
        assertEquals(0.0, MeleeEnergyPolicy.farPower(0.0, 600, 70, 50, 5, true, 3.0), 1e-9, "a hold stands");
        assertEquals(2.0, MeleeEnergyPolicy.farPower(2.0, 600, 70, 12, 5, true, 3.0), 1e-9, "a finisher keeps its power");
        assertEquals(2.0, MeleeEnergyPolicy.farPower(1.92, 600, 82, 80, 5, true, 3.0), 1e-9, "the lead cap");
        assertEquals(1.92, MeleeEnergyPolicy.farPower(1.92, 600, 81, 80, 5, true, 3.0), 1e-9, "never lowers the power");
        assertEquals(1.92, MeleeEnergyPolicy.farPower(1.92, 600, 70, 50, 5, false, 3.0), 1e-9, "switched off: unchanged");
    }
}

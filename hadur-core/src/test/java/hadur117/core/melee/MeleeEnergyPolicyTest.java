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
    @Tag("MGUN-22")
    @DisplayName("MGUN-22: ScalarR-shaped power falls with the nearest robot's distance and Hadur's own energy")
    void scalPower() {
        assertFalse(MeleeEnergyPolicy.SCAL_POWER);
        // Full energy: 3 within 433 px of the nearest robot, 1300/d beyond.
        assertEquals(3.0, MeleeEnergyPolicy.scalPower(300, 100, 100), 1e-9);
        assertEquals(1300.0 / 600, MeleeEnergyPolicy.scalPower(600, 100, 100), 1e-9);
        // 30 energy: E/15 = 2 beyond 325 px; inside it E/6 = 5 does not bite.
        assertEquals(2.0, MeleeEnergyPolicy.scalPower(400, 30, 100), 1e-9);
        assertEquals(3.0, MeleeEnergyPolicy.scalPower(200, 30, 100), 1e-9);
        // 15 energy: E/6 = 2.5 near, E/15 = 1 far; 6 energy: 1.0 near, 0.4 far.
        assertEquals(2.5, MeleeEnergyPolicy.scalPower(200, 15, 100), 1e-9);
        assertEquals(1.0, MeleeEnergyPolicy.scalPower(600, 15, 100), 1e-9);
        assertEquals(0.4, MeleeEnergyPolicy.scalPower(600, 6, 100), 1e-9);
        // Never more than kills the target.
        assertEquals(MeleeEnergyPolicy.killPower(10), MeleeEnergyPolicy.scalPower(200, 100, 10), 1e-9);
        // Never more than the lead over the target; a lead under the lightest shot holds.
        assertEquals(1.0, MeleeEnergyPolicy.scalPower(200, 51, 50), 1e-9);
        assertEquals(0.0, MeleeEnergyPolicy.scalPower(200, 50.05, 50), 1e-9);
    }

    @Test
    @Tag("MGUN-22")
    @DisplayName("MGUN-22: only off a team with two or more opponents; a hold and a finisher stand")
    void scalOnlyInTheCrowd() {
        double table = MeleeEnergyPolicy.power(600, 15, 100, 5);
        assertEquals(1.0, MeleeEnergyPolicy.crowdPower(table, 600, 600, 15, 100, 5, true), 1e-9);
        assertEquals(MeleeEnergyPolicy.crowdPower(table, 600, 15, 100, 5),
            MeleeEnergyPolicy.crowdPower(table, 600, 600, 15, 100, 5, false), 1e-12, "off: today's rule");
        assertEquals(MeleeEnergyPolicy.crowdPower(table, 600, 15, 100, 1),
            MeleeEnergyPolicy.crowdPower(table, 600, 600, 15, 100, 1, true), 1e-12, "one left: the duel");
        assertEquals(0, MeleeEnergyPolicy.crowdPower(0, 600, 600, 15, 100, 5, true), "a hold stands");
        assertEquals(MeleeEnergyPolicy.crowdPower(0.51, 600, 100, 2, 5),
            MeleeEnergyPolicy.crowdPower(0.51, 600, 600, 100, 2, 5, true), 1e-12, "a finisher stands");
    }

    @Test
    @Tag("MGUN-23")
    @DisplayName("MGUN-23: ships off; on, 3 at any range to 700 px at or above the field's mean, 1 beyond 300 px below it")
    void avgPower() {
        assertFalse(MeleeEnergyPolicy.AVG_POWER);
        assertEquals(1.92, MeleeEnergyPolicy.crowdPower(1.5, 600, 400, 60, 80, 5, 70), 1e-9, "off: MGUN-13 stands");
        // On, at or above the mean, four or more left.
        assertEquals(3.0, MeleeEnergyPolicy.avgPower(1.92, 600, 70, 80, 5, 70, true), 1e-9);
        assertEquals(3.0, MeleeEnergyPolicy.avgPower(1.92, 700, 70, 80, 5, 70, true), 1e-9, "to 700 px");
        assertEquals(1.0, MeleeEnergyPolicy.avgPower(1.92, 701, 70, 80, 5, 70, true), 1e-9, "beyond 700 px");
        assertEquals(1.92, MeleeEnergyPolicy.avgPower(1.92, 600, 70, 80, 3, 70, true), 1e-9, "three left: MGUN-13 stands");
        // Below the mean.
        assertEquals(1.0, MeleeEnergyPolicy.avgPower(1.92, 301, 40, 80, 5, 70, true), 1e-9);
        assertEquals(3.0, MeleeEnergyPolicy.avgPower(3.0, 250, 40, 80, 5, 70, true), 1e-9, "within 300 px the rules so far stand");
        // The crowd conditions and caps.
        assertEquals(1.0, MeleeEnergyPolicy.avgPower(1.0, 600, 19, 80, 5, 70, true), 1e-9, "under 20 energy the table stands");
        assertEquals(0.0, MeleeEnergyPolicy.avgPower(0.0, 600, 70, 80, 5, 70, true), 1e-9, "a hold stands");
        assertEquals(2.0, MeleeEnergyPolicy.avgPower(2.0, 600, 70, 12, 5, 70, true), 1e-9, "a finisher keeps its power");
        assertEquals(1.92, MeleeEnergyPolicy.avgPower(1.92, 600, 70, 80, 5, Double.NaN, true), 1e-9, "no mean known");
        assertEquals(2.0, MeleeEnergyPolicy.avgPower(1.92, 600, 82, 80, 5, 70, true), 1e-9, "the lead cap");
        assertEquals(1.92, MeleeEnergyPolicy.avgPower(1.92, 600, 70, 80, 5, 70, false), 1e-9, "switched off: unchanged");
    }
}

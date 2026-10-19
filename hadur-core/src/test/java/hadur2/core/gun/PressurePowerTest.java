package hadur2.core.gun;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur2.core.memory.Estimate;
import hadur2.core.memory.Tiers;
import hadur2.core.physics.BattleField;
import hadur2.core.policy.PowerPolicy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** POW-12: pressure power, the gate ({@link PowerPolicy#pressure}) and the gun's reading of it. */
class PressurePowerTest {

    private static final double N = 400;

    /** An estimate of {@code n} trials whose centre less its margin is {@code lower}. */
    static Estimate withLower(double lower) {
        double lo = 0, hi = N;
        for (int i = 0; i < 200; i++) {
            double mid = (lo + hi) / 2;
            Estimate e = Estimate.of(mid, N);
            if (e.center() - e.margin() < lower) lo = mid; else hi = mid;
        }
        return Estimate.of(hi, N);
    }

    /** An estimate of {@code n} trials whose centre plus its margin is {@code upper}. */
    static Estimate withUpper(double upper) {
        double lo = 0, hi = N;
        for (int i = 0; i < 200; i++) {
            double mid = (lo + hi) / 2;
            Estimate e = Estimate.of(mid, N);
            if (e.center() + e.margin() < upper) lo = mid; else hi = mid;
        }
        return Estimate.of(lo, N);
    }

    static final Estimate OURS_OK = withLower(0.12 + 1e-6);
    static final Estimate THEIRS_OK = withUpper(0.09 - 1e-6);
    static GunController duel() {
        return new GunController(new BattleField(800, 600), 1);
    }

    @Test
    @Tag("POW-12")
    @DisplayName("POW-12: on when our lower bound is at least 12%, theirs upper at most 9%, energy above 12, no lead regime")
    void gateOn() {
        assertTrue(PowerPolicy.pressure(false, 50, OURS_OK, THEIRS_OK));
        assertTrue(PowerPolicy.pressure(false, 12.01, OURS_OK, THEIRS_OK));
    }

    @Test
    @Tag("POW-12")
    @DisplayName("POW-12: off just past each margin boundary")
    void gateOffAtBoundaries() {
        assertFalse(PowerPolicy.pressure(false, 50, withLower(0.12 - 1e-6), THEIRS_OK));
        assertFalse(PowerPolicy.pressure(false, 50, OURS_OK, withUpper(0.09 + 1e-6)));
        assertFalse(PowerPolicy.pressure(false, 50, Estimate.NONE, THEIRS_OK));
        assertFalse(PowerPolicy.pressure(false, 50, OURS_OK, Estimate.NONE));
    }

    @Test
    @Tag("POW-12")
    @DisplayName("POW-12: off while the lead-aware regime holds, and at or under MIN_OUR_ENERGY")
    void gateOffForLeadAndEnergy() {
        assertFalse(PowerPolicy.pressure(true, 50, OURS_OK, THEIRS_OK));
        assertFalse(PowerPolicy.pressure(false, PowerPolicy.MIN_OUR_ENERGY, OURS_OK, THEIRS_OK));
        assertFalse(PowerPolicy.pressure(false, 5, OURS_OK, THEIRS_OK));
        // the regime itself: POW-9 holds the default while both rates stand under 12.5%
        Estimate low = Estimate.of(2, 100);
        assertTrue(PowerPolicy.applies(false, low, low));
        assertNotEqualsOff(PowerPolicy.lead(true, 80, 80));
    }

    private static void assertNotEqualsOff(PowerPolicy.Lead lead) {
        assertTrue(lead != PowerPolicy.Lead.OFF, "a holding regime is never OFF, so the gate yields to it");
    }

    @Test
    @Tag("POW-12")
    @DisplayName("POW-12: pressure skips the power-down and fires 2.5 beyond 150 px; 2.95 inside stays")
    void pressureBase() {
        GunController g = duel();
        // 40 energy against 100 at 400 px: 1.20 would cut to 1.95 (40/63)^3
        assertEquals(1.95 * Math.pow(40.0 / 63.0, 3), g.calculateBulletPower(400, 40, 100, 1), 1e-9);
        assertEquals(2.5, g.calculateBulletPower(400, 40, 100, 1, GunController.Stakes.PRESSURE), 1e-12);
        assertEquals(2.5, g.calculateBulletPower(150, 80, 100, 1, GunController.Stakes.PRESSURE), 1e-12);
        assertEquals(2.95, g.calculateBulletPower(149.9, 40, 100, 1, GunController.Stakes.PRESSURE), 1e-12);
        assertEquals(2.95, g.calculateBulletPower(100, 80, 100, 1, GunController.Stakes.PRESSURE_DOWN), 1e-12);
    }

    @Test
    @Tag("POW-12")
    @DisplayName("POW-12: pdown skips only the power-down: the base stays 1.95")
    void pdownKeepsBase() {
        GunController g = duel();
        assertEquals(1.95, g.calculateBulletPower(400, 40, 100, 1, GunController.Stakes.PRESSURE_DOWN), 1e-12);
        assertEquals(1.95, g.calculateBulletPower(200, 80, 100, 1, GunController.Stakes.PRESSURE_DOWN), 1e-12);
    }

    @Test
    @Tag("POW-12")
    @DisplayName("POW-12: the quarter-of-their-energy cap, our energy and the floor still apply; melee ignores it")
    void downstreamCapsApply() {
        GunController g = duel();
        assertEquals(1.0, g.calculateBulletPower(400, 80, 4, 1, GunController.Stakes.PRESSURE), 1e-12);
        assertEquals(1.5, g.calculateBulletPower(400, 1.5, 100, 1, GunController.Stakes.PRESSURE), 1e-12);
        GunController melee = new GunController(new BattleField(1000, 1000), 5);
        assertEquals(melee.calculateBulletPower(400, 80, 100, 5),
            melee.calculateBulletPower(400, 80, 100, 5, GunController.Stakes.PRESSURE), 1e-12);
    }

    @Test
    @Tag("POW-12")
    @DisplayName("POW-12: POW-1..4 still raise 2.5 to 3.0, POW-5 still caps it, END-3 still lowers it")
    void policyRulesStillApply() {
        // POW-2 is also true at these rates only above 20%; use a T0 gun (POW-1) to raise.
        PowerPolicy.Reason why = PowerPolicy.reason(Tiers.Gun.T0, 80, 50, 400, 2.5, OURS_OK, THEIRS_OK);
        assertEquals(PowerPolicy.Reason.POW_1, why);
        assertEquals(3.0, PowerPolicy.power(why, 2.5, 80), 1e-12);
        assertEquals(1.7, PowerPolicy.capPower(Tiers.Gun.T3, 600, 2.5), 1e-12);
        assertEquals(2.5, PowerPolicy.capPower(Tiers.Gun.T3, 400, 2.5), 1e-12);
        assertEquals(PowerPolicy.leastPowerThatKills(10), 2.0, 1e-12);
    }
}

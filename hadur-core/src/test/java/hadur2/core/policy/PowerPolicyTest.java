package hadur2.core.policy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur2.core.memory.Estimate;
import hadur2.core.memory.Tiers;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

/** POW-1, POW-2, POW-3, POW-4, END-3 and their guards. */
class PowerPolicyTest {

    static final Estimate NONE = Estimate.NONE;
    /** A distance and gun power that play no part in the tests that don't care about them. */
    static final double ANY_DISTANCE = 200;
    static final double ANY_GUN_POWER = 1.0;

    @Test
    @Tag("POW-1")
    @DisplayName("POW-1: a T0 gun with more than 12 energy gets power 3.0, whatever the gun chose")
    void t0GetsFullPower() {
        PowerPolicy.Reason r = PowerPolicy.reason(Tiers.Gun.T0, 12.5, 80,
            ANY_DISTANCE, ANY_GUN_POWER, NONE, NONE);
        assertEquals(PowerPolicy.Reason.POW_1, r);
        assertEquals(3.0, PowerPolicy.power(r, 1.95, 12.5));
        assertEquals(3.0, PowerPolicy.power(r, 0.3, 90), "even where the gun powered down");
    }

    @ParameterizedTest
    @EnumSource(value = Tiers.Gun.class, names = {"UNKNOWN", "T2", "T3"})
    @Tag("POW-1")
    @DisplayName("POW-1: no other tier but T1 (POW-3) gets it")
    void otherTiersKeepTheGun(Tiers.Gun tier) {
        assertEquals(PowerPolicy.Reason.GUN,
            PowerPolicy.reason(tier, 80, 80, ANY_DISTANCE, ANY_GUN_POWER, NONE, NONE));
    }

    @Test
    @Tag("POW-1")
    @DisplayName("POW-1: at 12 enemy energy or less, or 12 of our own, the gun's own power stands")
    void guards() {
        assertEquals(PowerPolicy.Reason.GUN,
            PowerPolicy.reason(Tiers.Gun.T0, 12, 80, ANY_DISTANCE, ANY_GUN_POWER, NONE, NONE));
        assertEquals(PowerPolicy.Reason.GUN,
            PowerPolicy.reason(Tiers.Gun.T0, 80, 12, ANY_DISTANCE, ANY_GUN_POWER, NONE, NONE));
        assertEquals(1.2, PowerPolicy.power(PowerPolicy.Reason.GUN, 1.2, 80));
    }

    @Test
    @Tag("POW-2")
    @DisplayName("POW-2: a certain 20%+ against a certain sub-10% gets full power, capped at a quarter of their energy")
    void liveLead() {
        Estimate ours = Estimate.of(40, 100);
        Estimate theirs = Estimate.of(3, 100);
        PowerPolicy.Reason r = PowerPolicy.reason(Tiers.Gun.UNKNOWN, 8, 80,
            ANY_DISTANCE, ANY_GUN_POWER, ours, theirs);
        assertEquals(PowerPolicy.Reason.POW_2, r);
        assertEquals(2.0, PowerPolicy.power(r, 1.95, 8), 1e-12, "a quarter of 8 kills");
        assertEquals(1.95, PowerPolicy.power(r, 1.95, 4), 1e-12, "never below the gun's choice");
    }

    @Test
    @Tag("POW-2")
    @Tag("DIAL-1")
    @DisplayName("DIAL-1: POW-2 keeps the gun's power while either rate is within its margin of the bound")
    void uncertainLeadKeepsTheGun() {
        // 30% of 20 shots could be 20%; 5% of 20 could be 10%.
        assertEquals(PowerPolicy.Reason.GUN, PowerPolicy.reason(Tiers.Gun.UNKNOWN, 80, 80,
            ANY_DISTANCE, ANY_GUN_POWER, Estimate.of(6, 20), Estimate.of(3, 100)));
        assertEquals(PowerPolicy.Reason.GUN, PowerPolicy.reason(Tiers.Gun.UNKNOWN, 80, 80,
            ANY_DISTANCE, ANY_GUN_POWER, Estimate.of(40, 100), Estimate.of(1, 20)));
        assertEquals(PowerPolicy.Reason.GUN, PowerPolicy.reason(Tiers.Gun.UNKNOWN, 80, 80,
            ANY_DISTANCE, ANY_GUN_POWER, NONE, Estimate.of(1, 100)));
    }

    @Test
    @Tag("POW-3")
    @DisplayName("POW-3: a T1 gun within 450 px and more than 12 energy gets power 3.0")
    void t1WithinRangeGetsFullPower() {
        PowerPolicy.Reason r = PowerPolicy.reason(Tiers.Gun.T1, 12.5, 80,
            450, ANY_GUN_POWER, NONE, NONE);
        assertEquals(PowerPolicy.Reason.POW_3, r);
        assertEquals(3.0, PowerPolicy.power(r, 0.3, 90));
    }

    @Test
    @Tag("POW-3")
    @DisplayName("POW-3: a T1 gun beyond 450 px keeps the gun's own power")
    void t1BeyondRangeKeepsTheGun() {
        assertEquals(PowerPolicy.Reason.GUN,
            PowerPolicy.reason(Tiers.Gun.T1, 12.5, 80, 450.01, ANY_GUN_POWER, NONE, NONE));
    }

    /** Certain enough for POW-4's 5-point gate: n=400 keeps the margin under 0.05 near these rates. */
    static final Estimate CERTAIN_40_PERCENT = Estimate.of(160, 400);
    static final Estimate CERTAIN_20_PERCENT = Estimate.of(80, 400);
    static final Estimate CERTAIN_5_PERCENT = Estimate.of(5, 100);

    @Test
    @Tag("POW-4")
    @DisplayName("POW-4: a high enough hit rate favours full power over the gun's own choice")
    void highHitRateFavoursFullPower() {
        // 40% hit rate: damage(3.0)=16, 0.4*16-3=3.4; damage(0.5)=2, 0.4*2-0.5=0.3. Full power wins.
        PowerPolicy.Reason r = PowerPolicy.reason(Tiers.Gun.UNKNOWN, 80, 80,
            ANY_DISTANCE, 0.5, CERTAIN_40_PERCENT, CERTAIN_20_PERCENT);
        assertEquals(PowerPolicy.Reason.POW_4, r);
        assertEquals(3.0, PowerPolicy.power(r, 0.5, 80));
    }

    @Test
    @Tag("POW-4")
    @DisplayName("POW-4: a low hit rate keeps the gun's own choice, spending no extra energy")
    void lowHitRateKeepsTheGun() {
        // 5% hit rate: damage(3.0)=16, 0.05*16-3=-2.2; damage(1.9)=9.4, 0.05*9.4-1.9=-1.43. Gun's choice wins.
        assertEquals(PowerPolicy.Reason.GUN, PowerPolicy.reason(Tiers.Gun.UNKNOWN, 80, 80,
            ANY_DISTANCE, 1.9, CERTAIN_5_PERCENT, CERTAIN_20_PERCENT));
    }

    @Test
    @Tag("POW-4")
    @Tag("DIAL-1")
    @DisplayName("POW-4: a rate uncertain past 5 points keeps the gun's own choice")
    void uncertainRateKeepsTheGunForPow4() {
        // A margin over 5 points, on either side, leaves the comparison untrusted.
        assertEquals(PowerPolicy.Reason.GUN, PowerPolicy.reason(Tiers.Gun.UNKNOWN, 80, 80,
            ANY_DISTANCE, 0.5, Estimate.of(4, 10), CERTAIN_20_PERCENT));
        assertEquals(PowerPolicy.Reason.GUN, PowerPolicy.reason(Tiers.Gun.UNKNOWN, 80, 80,
            ANY_DISTANCE, 0.5, CERTAIN_40_PERCENT, Estimate.of(2, 10)));
    }

    @Test
    @Tag("POW-4")
    @DisplayName("POW-4: never below the gun's own choice even when GUN wins the comparison")
    void neverBelowGunPower() {
        assertEquals(1.9, PowerPolicy.power(PowerPolicy.Reason.GUN, 1.9, 80));
    }

    @Test
    @Tag("END-3")
    @DisplayName("END-3: the least power that kills, at the boundary and either side of power 1")
    void leastPowerThatKills() {
        assertEquals(0.1, PowerPolicy.leastPowerThatKills(0.05), 1e-12, "never below the minimum power");
        assertEquals(1.0, PowerPolicy.leastPowerThatKills(4.0), 1e-12, "4 damage needs exactly power 1");
        assertEquals(0.5, PowerPolicy.leastPowerThatKills(2.0), 1e-12, "2 damage needs power 0.5, below 1");
        assertEquals(2.0, PowerPolicy.leastPowerThatKills(10.0), 1e-12, "10 damage needs power 2, above 1");
        assertEquals(3.0, PowerPolicy.leastPowerThatKills(16.0), 1e-12, "16 damage needs exactly full power");
    }

    @Test
    @Tag("END-3")
    @DisplayName("END-3: more energy than a full-power bullet can do is not a one-shot kill")
    void tooMuchEnergyIsNotAKillShot() {
        assertTrue(Double.isNaN(PowerPolicy.leastPowerThatKills(16.01)));
        assertTrue(Double.isNaN(PowerPolicy.leastPowerThatKills(80)));
    }
}

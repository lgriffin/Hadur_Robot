package hadur2.core.policy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import hadur2.core.memory.Estimate;
import hadur2.core.memory.Tiers;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

/** POW-1, POW-2 and their guards. */
class PowerPolicyTest {

    static final Estimate NONE = Estimate.NONE;

    @Test
    @Tag("POW-1")
    @DisplayName("POW-1: a T0 gun with more than 12 energy gets power 3.0, whatever the gun chose")
    void t0GetsFullPower() {
        PowerPolicy.Reason r = PowerPolicy.reason(Tiers.Gun.T0, 12.5, 80, NONE, NONE);
        assertEquals(PowerPolicy.Reason.POW_1, r);
        assertEquals(3.0, PowerPolicy.power(r, 1.95, 12.5));
        assertEquals(3.0, PowerPolicy.power(r, 0.3, 90), "even where the gun powered down");
    }

    @ParameterizedTest
    @EnumSource(value = Tiers.Gun.class, names = {"UNKNOWN", "T1", "T2", "T3"})
    @Tag("POW-1")
    @DisplayName("POW-1: no other tier gets it")
    void otherTiersKeepTheGun(Tiers.Gun tier) {
        assertEquals(PowerPolicy.Reason.GUN, PowerPolicy.reason(tier, 80, 80, NONE, NONE));
    }

    @Test
    @Tag("POW-1")
    @DisplayName("POW-1: at 12 enemy energy or less, or 12 of our own, the gun's own power stands")
    void guards() {
        assertEquals(PowerPolicy.Reason.GUN, PowerPolicy.reason(Tiers.Gun.T0, 12, 80, NONE, NONE));
        assertEquals(PowerPolicy.Reason.GUN, PowerPolicy.reason(Tiers.Gun.T0, 80, 12, NONE, NONE));
        assertEquals(1.2, PowerPolicy.power(PowerPolicy.Reason.GUN, 1.2, 80));
    }

    @Test
    @Tag("POW-2")
    @DisplayName("POW-2: a certain 20%+ against a certain sub-10% gets full power, capped at a quarter of their energy")
    void liveLead() {
        Estimate ours = Estimate.of(40, 100);
        Estimate theirs = Estimate.of(3, 100);
        PowerPolicy.Reason r = PowerPolicy.reason(Tiers.Gun.UNKNOWN, 8, 80, ours, theirs);
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
        assertEquals(PowerPolicy.Reason.GUN,
            PowerPolicy.reason(Tiers.Gun.UNKNOWN, 80, 80, Estimate.of(6, 20), Estimate.of(3, 100)));
        assertEquals(PowerPolicy.Reason.GUN,
            PowerPolicy.reason(Tiers.Gun.UNKNOWN, 80, 80, Estimate.of(40, 100), Estimate.of(1, 20)));
        assertEquals(PowerPolicy.Reason.GUN,
            PowerPolicy.reason(Tiers.Gun.UNKNOWN, 80, 80, NONE, Estimate.of(1, 100)));
    }
}

package hadur2.core.memory;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/** The tier tables, and DIAL-1: a tier is named only on a narrow enough margin. */
class TiersTest {

    static OpponentProfile profile(double theirRate, double main, double antiSurfer) {
        return Profiles.tiers(new OpponentProfile("a.B"), theirRate, main, antiSurfer);
    }

    @ParameterizedTest(name = "normalised rate {0} is {1}")
    @CsvSource({"0.005,T0", "0.019,T0", "0.03,T1", "0.05,T2", "0.069,T2", "0.082,T3", "0.2,T3"})
    @DisplayName("the gun tier follows their normalised hit rate")
    void gunTier(double rate, Tiers.Gun expected) {
        assertEquals(expected, Tiers.gun(profile(rate, 0.2, 0.2)));
    }

    @ParameterizedTest(name = "main {0}, anti-surfer {1} is {2}")
    @CsvSource({"0.30,0.20,M0", "0.20,0.19,M1", "0.20,0.15,M1", "0.12,0.20,M2", "0.05,0.04,M3",
        "0.09,0.12,M2"})
    @DisplayName("the movement tier follows our virtual guns' ratings")
    void moveTier(double main, double antiSurfer, Tiers.Move expected) {
        assertEquals(expected, Tiers.move(profile(0.05, main, antiSurfer)));
    }

    @Test
    @Tag("DIAL-1")
    @DisplayName("a margin wider than the threshold leaves the tier unknown")
    void wideMarginIsUnknown() {
        OpponentProfile p = new OpponentProfile("a.B");
        p.normalised[0] = 60;
        p.normalised[1] = 12;
        p.virtualFired[0] = 60;
        p.virtualHits[0] = 20;
        p.virtualFired[1] = 60;
        p.virtualHits[1] = 5;
        assertEquals(Tiers.Gun.UNKNOWN, Tiers.gun(p), "60 waves: " + Tiers.theirHitRate(p));
        assertEquals(Tiers.Move.UNKNOWN, Tiers.move(p));
        assertEquals("T?/M?", Tiers.label(p));
    }

    @Test
    @DisplayName("a rammer's point-blank hits do not make it a top gun")
    void normalisedNotRaw() {
        // RamFire's raw hit rate on Hadur was 70% in S3's bench; weighted by Hadur's
        // angular size at a few pixels, the same hits count for almost nothing.
        OpponentProfile p = profile(0.01, 0.4, 0.4);
        for (int i = 0; i < 5; i++) p.shotsAtUs[i] = 40;
        for (int i = 0; i < 5; i++) p.hitsOnUs[i] = 28;
        assertEquals(0.7, p.theirHitRate(), 1e-6);
        assertEquals(Tiers.Gun.T0, Tiers.gun(p));
    }
}

package hadurling.core.policy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SeedTrustTest {

    /** A full window of 100 outcomes with the given number of hits. */
    private static Estimate full(int hits) {
        HitWindow w = new HitWindow(100);
        for (int i = 0; i < 100; i++) w.record(i < hits);
        return w.estimate();
    }

    @Test
    @DisplayName("the rule can fire at all: a full window of 100 shots is narrow enough to judge")
    void aFullWindowCanJudge() {
        assertTrue(full(20).within(SeedTrust.MAX_LIVE_MARGIN), "margin " + full(20).margin());
        assertTrue(full(50).within(SeedTrust.MAX_LIVE_MARGIN), "the widest case, a 50% rate: margin " + full(50).margin());
    }

    @Test
    @Tag("HL-29")
    @DisplayName("live evidence that disagrees takes a twentieth off per wave, and nothing is left after twenty")
    void fades() {
        SeedTrust trust = new SeedTrust(Estimate.of(50, 100));
        Estimate live = full(20);
        assertEquals(1.0, trust.weight(), 0);
        assertTrue(trust.observe(live));
        assertEquals(0.95, trust.weight(), 1e-12);
        for (int i = 1; i < SeedTrust.DECAY_WAVES; i++) trust.observe(live);
        assertEquals(0.0, trust.weight(), 0);
        assertFalse(trust.observe(live), "nothing left to take");
        assertEquals(0.0, trust.weight(), 0);
        assertTrue(trust.distrusted());
    }

    @Test
    @Tag("HL-30")
    @DisplayName("thin live evidence cannot contradict the profile, however far off it is")
    void holdsBackOnThinEvidence() {
        SeedTrust trust = new SeedTrust(Estimate.of(50, 100));
        Estimate thin = Estimate.of(0, 5); // a raw 0% against the profile's 50%
        assertFalse(thin.within(SeedTrust.MAX_LIVE_MARGIN));
        for (int i = 0; i < 100; i++) assertFalse(trust.observe(thin));
        assertEquals(1.0, trust.weight(), 0);
        assertFalse(trust.distrusted());
    }

    @Test
    @Tag("HL-30")
    @DisplayName("live evidence that agrees with the profile leaves the weight alone")
    void agreementHolds() {
        SeedTrust trust = new SeedTrust(Estimate.of(50, 100));
        for (int i = 0; i < 50; i++) assertFalse(trust.observe(full(50)));
        assertEquals(1.0, trust.weight(), 0);
    }

    @Test
    @Tag("HL-30")
    @DisplayName("a profile with nothing in it cannot be contradicted")
    void noProfileNoDivergence() {
        SeedTrust trust = new SeedTrust(Estimate.NONE);
        assertFalse(trust.observe(full(20)));
        assertEquals(1.0, trust.weight(), 0);
    }

    @Test
    @Tag("HL-29")
    @DisplayName("the weight never grows back")
    void neverRecovers() {
        SeedTrust trust = new SeedTrust(Estimate.of(50, 100));
        trust.observe(full(20));
        double after = trust.weight();
        trust.observe(full(50)); // now they agree
        assertEquals(after, trust.weight(), 0);
    }
}

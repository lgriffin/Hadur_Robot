package hadur2.core.adapt;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur2.core.memory.Estimate;
import hadur2.core.model.SeedWeight;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** RES-4: a seed the opponent no longer matches fades to nothing within 20 waves. */
@Tag("RES-4")
class SeedTrustTest {

    static final Estimate PROFILE = Estimate.of(170, 2000);

    @Test
    @DisplayName("a diverging live rate takes the seed to zero in exactly 20 waves")
    void divergingDecaysToZero() {
        SeedTrust t = new SeedTrust(new SeedWeight(0.5), PROFILE);
        Estimate live = Estimate.of(300, 1000);
        assertTrue(t.diverges(live), "30% against 8.5%");
        for (int wave = 1; wave <= SeedTrust.DECAY_WAVES; wave++) {
            assertTrue(t.observe(live));
            assertEquals(0.5 * (SeedTrust.DECAY_WAVES - wave) / SeedTrust.DECAY_WAVES,
                t.weight().value(), 1e-12, "wave " + wave);
        }
        assertEquals(0, t.weight().value());
        assertFalse(t.observe(live), "nothing left to decay");
        assertEquals(SeedTrust.DECAY_WAVES, t.decayedWaves());
        assertTrue(t.distrusted());
    }

    @Test
    @DisplayName("a live rate within the margins leaves the seed alone")
    void agreeingHolds() {
        SeedTrust t = new SeedTrust(new SeedWeight(0.5), PROFILE);
        for (int wave = 0; wave < 100; wave++) assertFalse(t.observe(Estimate.of(90, 1000)));
        assertEquals(0.5, t.weight().value());
        assertFalse(t.distrusted());
    }

    @Test
    @DisplayName("early waves, whose margin is wide, never count as divergence")
    void earlyWavesAreTooUncertain() {
        SeedTrust t = new SeedTrust(new SeedWeight(0.5), PROFILE);
        assertFalse(t.observe(Estimate.of(0.79, 1)), "one heavy hit in one wave says little");
        assertFalse(t.observe(Estimate.of(0.6, 31)), "nor does 2% over 31 waves");
        assertFalse(t.observe(Estimate.of(60, 200)), "30% over 200 waves: margin still above 5 points");
        assertFalse(t.observe(Estimate.NONE));
        assertFalse(t.distrusted());
    }

    @Test
    @DisplayName("a profile without the estimate never distrusts anything")
    void noProfileEstimate() {
        SeedTrust t = new SeedTrust(new SeedWeight(0.5), Estimate.NONE);
        assertFalse(t.observe(Estimate.of(900, 1000)));
    }

    @Test
    @DisplayName("without a seed the trust still reports divergence")
    void divergenceWithoutSeed() {
        SeedTrust t = new SeedTrust(new SeedWeight(0), PROFILE);
        assertFalse(t.observe(Estimate.of(300, 1000)), "no weight to lower");
        assertTrue(t.distrusted());
        assertEquals(0, t.decayedWaves());
    }
}

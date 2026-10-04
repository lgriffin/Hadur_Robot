package hadurling.core.policy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class PowerPolicyTest {

    /** A window of {@code n} outcomes with {@code hits} hits. */
    private static Estimate rate(int hits, int n) {
        HitWindow w = new HitWindow(n);
        for (int i = 0; i < n; i++) w.record(i < hits);
        return w.estimate();
    }

    @Test
    @Tag("HL-27")
    @DisplayName("a full window that is certain on both sides fires full power")
    void certainEvidence() {
        Estimate ours = rate(40, 100);   // 40%: even the lowest 95% bound is above 20%
        Estimate theirs = rate(0, 100);  // 0%: even the highest bound is under 10%
        assertTrue(PowerPolicy.certain(ours, theirs));
        assertEquals(3.0, PowerPolicy.power(1.0, ours, theirs, 100, 100), 0);
    }

    @Test
    @Tag("HL-28")
    @DisplayName("one hit in one shot is a raw 100% and still not enough")
    void thinEvidenceOfOurs() {
        Estimate ours = rate(1, 1);
        Estimate theirs = rate(0, 100);
        assertEquals(1.0, ours.value(), 0);
        assertFalse(PowerPolicy.certain(ours, theirs));
        assertEquals(1.0, PowerPolicy.power(1.0, ours, theirs, 100, 100), 0);
    }

    @Test
    @Tag("HL-28")
    @DisplayName("thirty shots at them with none landing is still not enough to call their gun harmless")
    void thinEvidenceOfTheirs() {
        Estimate theirs = rate(0, 30); // upper bound about 13.8%
        assertFalse(PowerPolicy.certain(rate(40, 100), theirs));
        assertTrue(PowerPolicy.certain(rate(40, 100), rate(0, 50))); // upper bound about 8.8%
    }

    @Test
    @Tag("HL-28")
    @DisplayName("unknown rates hold the gun's own power")
    void unknown() {
        assertFalse(PowerPolicy.certain(Estimate.NONE, rate(0, 100)));
        assertFalse(PowerPolicy.certain(rate(40, 100), Estimate.NONE));
        assertEquals(1.5, PowerPolicy.power(1.5, Estimate.NONE, Estimate.NONE, 100, 100), 0);
    }

    @Test
    @Tag("HL-28")
    @DisplayName("rates on the wrong side of their lines hold back, however many samples")
    void wrongSide() {
        assertFalse(PowerPolicy.certain(rate(10, 100), rate(0, 100)));  // we hit only 10%
        assertFalse(PowerPolicy.certain(rate(40, 100), rate(30, 100))); // they hit 30%
    }

    @Test
    @Tag("HL-28")
    @DisplayName("with 12 energy or less, the gun's power-down stands even when the evidence is certain")
    void lowEnergy() {
        assertEquals(1.0, PowerPolicy.power(1.0, rate(40, 100), rate(0, 100), 12, 100), 0);
        assertEquals(3.0, PowerPolicy.power(1.0, rate(40, 100), rate(0, 100), 12.1, 100), 0);
    }

    @Test
    @Tag("HL-27")
    @DisplayName("full power is capped at a quarter of their energy, and never below the gun's choice")
    void capped() {
        Estimate ours = rate(40, 100);
        Estimate theirs = rate(0, 100);
        assertEquals(2.0, PowerPolicy.power(1.0, ours, theirs, 100, 8), 1e-12);
        assertEquals(1.0, PowerPolicy.power(1.0, ours, theirs, 100, 2), 1e-12);
        assertEquals(2.5, PowerPolicy.power(2.5, ours, theirs, 100, 4), 1e-12);
    }
}

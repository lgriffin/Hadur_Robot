package hadurling.core.policy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class EstimateTest {

    @Test
    @Tag("HL-25")
    @DisplayName("with no samples nothing is known: no rate, a margin of 1")
    void nothingKnown() {
        assertSame(Estimate.NONE, Estimate.of(0, 0));
        assertSame(Estimate.NONE, Estimate.of(Double.NaN, 10));
        assertSame(Estimate.NONE, Estimate.of(-1, 10));
        assertSame(Estimate.NONE, Estimate.of(3, Double.POSITIVE_INFINITY));
        assertTrue(Double.isNaN(Estimate.NONE.value()));
        assertEquals(1.0, Estimate.NONE.margin(), 0);
        assertFalse(Estimate.NONE.within(1.0));
        assertEquals("-", Estimate.NONE.toString());
    }

    @Test
    @Tag("HL-25")
    @DisplayName("the margin is Agresti-Coull's: p = (h + 2) / (n + 4), margin = 1.96 sqrt(p (1 - p) / (n + 4))")
    void agrestiCoull() {
        Estimate e = Estimate.of(20, 100);
        double p = 22.0 / 104.0;
        assertEquals(0.2, e.value(), 1e-12);
        assertEquals(p, e.center(), 1e-12);
        assertEquals(1.96 * Math.sqrt(p * (1 - p) / 104.0), e.margin(), 1e-12);
        assertEquals(e.center() - e.margin(), e.lower(), 1e-12);
        assertEquals(e.center() + e.margin(), e.upper(), 1e-12);
    }

    @Test
    @Tag("HL-25")
    @DisplayName("a perfect or an empty record over a few shots still has a wide margin")
    void thinEvidenceIsWide() {
        // The plain Wald interval would say 0 +- 0 here.
        assertEquals(0.3346, Estimate.of(0, 3).margin(), 1e-3);
        assertEquals(0.3346, Estimate.of(3, 3).margin(), 1e-3);
        assertFalse(Estimate.of(3, 3).within(0.1));
    }

    @Test
    @DisplayName("more samples narrow the margin")
    void marginShrinks() {
        assertTrue(Estimate.of(10, 100).margin() < Estimate.of(1, 10).margin());
        assertTrue(Estimate.of(10, 100).within(0.1));
    }

    @Test
    @DisplayName("hits above the trials are clamped, so the rate never passes 1")
    void clamped() {
        assertEquals(1.0, Estimate.of(7, 5).value(), 0);
    }
}

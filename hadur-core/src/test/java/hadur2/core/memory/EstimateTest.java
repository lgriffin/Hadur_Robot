package hadur2.core.memory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** DIAL-1: every policy input is a value with a margin of error. */
@Tag("DIAL-1")
class EstimateTest {

    @Test
    @DisplayName("the margin narrows as evidence grows")
    void marginNarrows() {
        Estimate few = Estimate.of(2, 20);
        Estimate many = Estimate.of(200, 2000);
        assertEquals(0.1, few.value(), 1e-12);
        assertEquals(0.1, many.value(), 1e-12);
        assertTrue(few.margin() > 0.12, "20 shots: " + few.margin());
        assertTrue(many.margin() < 0.014, "2000 shots: " + many.margin());
    }

    @Test
    @DisplayName("a rate of 0 or 1 over few samples still has a wide margin")
    void extremesStayUncertain() {
        assertTrue(Estimate.of(0, 3).margin() > 0.3, "0 of 3 is not a certain 0%");
        assertTrue(Estimate.of(3, 3).margin() > 0.3, "3 of 3 is not a certain 100%");
        assertFalse(Estimate.of(0, 3).within(Tiers.MAX_MARGIN));
        assertTrue(Estimate.of(0, 400).within(Tiers.MAX_MARGIN), "0 of 400 is certain enough");
    }

    @Test
    @DisplayName("no evidence, or broken evidence, is no estimate")
    void nothingKnown() {
        assertSame(Estimate.NONE, Estimate.of(0, 0));
        assertSame(Estimate.NONE, Estimate.of(Double.NaN, 10));
        assertSame(Estimate.NONE, Estimate.of(1, Double.POSITIVE_INFINITY));
        assertSame(Estimate.NONE, Estimate.of(-1, 10));
        assertFalse(Estimate.NONE.within(1.0), "no estimate is ever certain");
        assertFalse(Estimate.NONE.excludes(0.5));
    }

    @Test
    @DisplayName("weighted hits above the trial count are capped at a rate of 1")
    void weightedHitsCapped() {
        assertEquals(1.0, Estimate.of(12.5, 10).value(), 1e-12);
    }

    @Test
    @DisplayName("an estimate excludes values outside its margin")
    void excludes() {
        Estimate e = Estimate.of(100, 1000);
        assertTrue(e.excludes(0.2));
        assertFalse(e.excludes(0.11));
    }

    @Test
    @DisplayName("the centre is Agresti-Coull's, pulled toward a half over few samples")
    void center() {
        assertEquals(0.6, Estimate.of(1, 1).center(), 1e-12);
        assertEquals(42.0 / 104, Estimate.of(40, 100).center(), 1e-12);
        assertTrue(Double.isNaN(Estimate.NONE.center()));
    }

    @Test
    @Tag("DIAL-3")
    @DisplayName("DIAL-3: the margin is always finite, whatever the inputs, including NONE's")
    void marginIsAlwaysFinite() {
        // The premise DIAL-3 guards against ("an estimate's margin is not a finite number")
        // never arises through the only way to build one: of() rejects bad inputs into
        // NONE, whose own margin (1.0) is finite too. A policy reading margin() can rely on
        // it always being a real number, and hadur2.core.adapt.SeedTrust.diverges still adds
        // an explicit guard for the value should this invariant ever be weakened.
        double[][] cases = {{0, 0}, {Double.NaN, 10}, {1, Double.POSITIVE_INFINITY}, {-1, 10},
            {0, 1}, {1, 1}, {1e9, 1e9}, {0, 3}, {3, 3}, {12.5, 10}};
        for (double[] c : cases) {
            double margin = Estimate.of(c[0], c[1]).margin();
            assertTrue(Double.isFinite(margin), "of(" + c[0] + ", " + c[1] + ") margin=" + margin);
        }
        assertTrue(Double.isFinite(Estimate.NONE.margin()));
    }
}

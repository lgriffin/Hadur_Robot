package hadurling.bench;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class StatsTest {

    @Test
    @Tag("HL-33")
    @DisplayName("five samples: the mean, and a half-width of t(4) * s / sqrt(5)")
    void fiveSeeds() {
        Stats s = Stats.of(List.of(0.50, 0.60, 0.55, 0.52, 0.58));
        assertEquals(5, s.n());
        assertEquals(0.55, s.mean(), 1e-12);
        // Sum of squared deviations 0.0068, so s = sqrt(0.0068 / 4) = 0.04123; t(4) = 2.776.
        assertEquals(2.776 * Math.sqrt(0.0068 / 4) / Math.sqrt(5), s.halfWidth(), 1e-9);
        assertEquals(s.mean() - s.halfWidth(), s.low(), 1e-12);
        assertEquals(s.mean() + s.halfWidth(), s.high(), 1e-12);
    }

    @Test
    @Tag("HL-33")
    @DisplayName("identical samples have a mean and no spread")
    void noSpread() {
        Stats s = Stats.of(List.of(0.6, 0.6, 0.6));
        assertEquals(0.6, s.mean(), 1e-12);
        assertEquals(0.0, s.halfWidth(), 1e-12);
    }

    @Test
    @Tag("HL-33")
    @DisplayName("more samples of the same spread give a narrower interval")
    void moreSeedsNarrower() {
        Stats few = Stats.of(List.of(0.4, 0.6, 0.4, 0.6));
        Stats many = Stats.of(List.of(0.4, 0.6, 0.4, 0.6, 0.4, 0.6, 0.4, 0.6, 0.4, 0.6, 0.4, 0.6));
        assertTrue(many.halfWidth() < few.halfWidth());
    }

    @Test
    @Tag("HL-34")
    @DisplayName("one sample or none: the interval is unknown, never zero")
    void tooFew() {
        Stats one = Stats.of(List.of(0.7));
        assertEquals(0.7, one.mean(), 0);
        assertTrue(Double.isNaN(one.halfWidth()));
        Stats none = Stats.of(List.of());
        assertTrue(Double.isNaN(none.mean()));
        assertEquals("n/a", none.percent());
        assertEquals("70.0% +/- ? (n=1)", one.percent());
    }

    @Test
    @DisplayName("percent formats a mean and an interval")
    void percent() {
        assertEquals("55.0% +/- 5.1 (n=5)", Stats.of(List.of(0.50, 0.60, 0.55, 0.52, 0.58)).percent());
    }

    @Test
    @Tag("HL-35")
    @DisplayName("a paired difference cancels what both versions share")
    void pairingCancelsTheSeedEffect() {
        // The seeds swing both versions by 20 points, but the candidate is always 3 ahead.
        List<Double> baseline = List.of(0.40, 0.60, 0.50, 0.30, 0.55);
        List<Double> candidate = List.of(0.43, 0.63, 0.53, 0.33, 0.58);
        Stats diff = Stats.pairedDiff(candidate, baseline);
        assertEquals(0.03, diff.mean(), 1e-12);
        assertEquals(0.0, diff.halfWidth(), 1e-9);
        assertEquals(Stats.Verdict.BETTER, diff.verdict());
        // Compared as two separate samples, the same data cannot tell them apart.
        Stats a = Stats.of(baseline);
        Stats b = Stats.of(candidate);
        assertTrue(b.low() < a.high() && a.low() < b.high(), "the intervals of the two means overlap");
    }

    @Test
    @Tag("HL-35")
    @DisplayName("the verdict is only better or worse when the whole interval is on one side of 0")
    void verdicts() {
        assertEquals(Stats.Verdict.BETTER, Stats.of(List.of(0.04, 0.05, 0.06, 0.05, 0.05)).verdict());
        assertEquals(Stats.Verdict.WORSE, Stats.of(List.of(-0.04, -0.05, -0.06, -0.05, -0.05)).verdict());
        assertEquals(Stats.Verdict.UNCLEAR, Stats.of(List.of(0.10, -0.08, 0.06, -0.05, 0.02)).verdict());
        // Unknown is not "no effect" and not "an effect": it is unclear.
        assertEquals(Stats.Verdict.UNCLEAR, Stats.of(List.of(0.5)).verdict());
    }

    @Test
    @DisplayName("only the pairs both lists have are used")
    void unevenLists() {
        Stats diff = Stats.pairedDiff(List.of(0.5, 0.6, 0.7), List.of(0.4, 0.4));
        assertEquals(2, diff.n());
    }
}

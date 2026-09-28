package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** BENCH-1 (stratified APS estimate) and BENCH-2 (paired A/B diff). */
class StatsTest {

    @Test
    @Tag("BENCH-1")
    @DisplayName("a weighted estimate is the weight-normalised mean of the per-opponent means")
    void weightedMean() {
        Stats a = Stats.of(List.of(0.9, 0.9));
        Stats b = Stats.of(List.of(0.5, 0.5));
        Stats weighted = Stats.weighted(List.of(a, b), List.of(0.75, 0.25));
        assertEquals(0.8, weighted.mean, 1e-9);
    }

    @Test
    @Tag("BENCH-1")
    @DisplayName("equal weights match a plain mean of the per-opponent means")
    void equalWeightsMatchPlainMean() {
        Stats a = Stats.of(List.of(0.6));
        Stats b = Stats.of(List.of(0.4));
        Stats c = Stats.of(List.of(1.0));
        Stats weighted = Stats.weighted(List.of(a, b, c), List.of(1.0, 1.0, 1.0));
        assertEquals(2.0 / 3, weighted.mean, 1e-9);
    }

    @Test
    @Tag("BENCH-1")
    @DisplayName("an opponent with no battles or zero weight is skipped, not treated as zero")
    void skipsUnweightedAndEmpty() {
        Stats a = Stats.of(List.of(0.8));
        Stats empty = Stats.of(List.of());
        Stats weighted = Stats.weighted(List.of(a, empty), List.of(1.0, 0.0));
        assertEquals(1, weighted.n);
        assertEquals(0.8, weighted.mean, 1e-9);
    }

    @Test
    @Tag("BENCH-1")
    @DisplayName("no weighted opponents yields an empty estimate")
    void noOpponentsIsEmpty() {
        Stats weighted = Stats.weighted(List.of(), List.of());
        assertEquals(0, weighted.n);
        assertTrue(Double.isNaN(weighted.mean));
    }

    @Test
    @Tag("BENCH-2")
    @DisplayName("a paired diff cancels a shift common to both jars at every seed")
    void pairedDiffCancelsCommonNoise() {
        // Both jars are 0.1 higher on seed 2 (a friendlier field); the diff should not see it.
        List<Double> candidate = List.of(0.60, 0.70, 0.55);
        List<Double> baseline = List.of(0.50, 0.60, 0.45);
        Stats diff = Stats.pairedDiff(candidate, baseline);
        assertEquals(0.10, diff.mean, 1e-9);
        assertTrue(diff.halfWidth < 0.01, "a constant paired diff should have ~zero spread");
    }

    @Test
    @Tag("BENCH-2")
    @DisplayName("a paired diff is negative when the baseline wins")
    void pairedDiffSignsTowardCandidate() {
        Stats diff = Stats.pairedDiff(List.of(0.4, 0.3), List.of(0.6, 0.5));
        assertTrue(diff.mean < 0);
    }

    @Test
    @Tag("BENCH-2")
    @DisplayName("mismatched-length inputs pair only the shared prefix, not a shifted tail")
    void pairedDiffTruncatesToShorterList() {
        // If a caller drops one side's failed seed independently before pairing, the lists
        // can end up different lengths and every later seed would pair against the wrong
        // one; pairedDiff itself only pairs index-for-index over the shared length.
        List<Double> candidate = List.of(0.9, 0.9, 0.1);
        List<Double> baseline = List.of(0.9, 0.9);
        Stats diff = Stats.pairedDiff(candidate, baseline);
        assertEquals(2, diff.n);
        assertEquals(0.0, diff.mean, 1e-9);
    }
}

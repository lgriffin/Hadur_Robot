package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** BENCH-1 (stratified APS estimate), BENCH-2 (paired A/B diff), BENCH-38 (t quantile), BENCH-39 (bootstrap). */
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
    @Tag("BENCH-1")
    @DisplayName("equal weights give the same interval as a plain Stats.of over the same means")
    void equalWeightsMatchPlainMeanInterval() {
        // Four "opponents", each a single mean: a weighted estimate over equal weights
        // should reduce exactly to treating those means as one plain sample.
        List<Stats> perOpponent = List.of(Stats.of(List.of(0.7)), Stats.of(List.of(0.5)),
            Stats.of(List.of(0.6)), Stats.of(List.of(0.4)));
        Stats weighted = Stats.weighted(perOpponent, List.of(1.0, 1.0, 1.0, 1.0));
        Stats plain = Stats.of(List.of(0.7, 0.5, 0.6, 0.4));
        assertEquals(plain.mean, weighted.mean, 1e-9);
        assertEquals(plain.halfWidth, weighted.halfWidth, 1e-6);
    }

    @Test
    @Tag("BENCH-1")
    @DisplayName("a weighted estimate near the t-table's edge does not throw")
    void tTableEdgeDoesNotThrow() {
        // 31 equally-weighted opponents: effective N rounds to 31, which the old table
        // (to df 30) could not index.
        List<Stats> perOpponent = new java.util.ArrayList<>();
        List<Double> weights = new java.util.ArrayList<>();
        for (int i = 0; i < 31; i++) {
            perOpponent.add(Stats.of(List.of(0.5 + 0.01 * i)));
            weights.add(1.0);
        }
        Stats weighted = Stats.weighted(perOpponent, weights);
        assertTrue(weighted.n == 31 && !Double.isNaN(weighted.halfWidth));
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

    @Test
    @Tag("BENCH-38")
    @DisplayName("the 97.5% t quantile matches published values from df 1 to df 1000")
    void tQuantileKnownValues() {
        double[][] known = {
            {1, 12.7062}, {2, 4.3027}, {5, 2.5706}, {10, 2.2281}, {30, 2.0423}, {31, 2.0395},
            {40, 2.0211}, {60, 2.0003}, {120, 1.9799}, {1000, 1.9623}
        };
        for (double[] row : known) {
            assertEquals(row[1], Stats.t975(row[0]), 5e-4, "df " + row[0]);
        }
    }

    @Test
    @Tag("BENCH-38")
    @DisplayName("the t quantile tends to the normal 1.95996 for a huge df, and is symmetric")
    void tQuantileLimitsAndSymmetry() {
        assertEquals(1.959964, Stats.tQuantile(0.975, 1e7), 1e-4);
        assertEquals(-Stats.tQuantile(0.9, 7), Stats.tQuantile(0.1, 7), 1e-9);
        assertEquals(0.0, Stats.tQuantile(0.5, 3), 0.0);
        assertTrue(Double.isNaN(Stats.tQuantile(1.2, 5)));
    }

    @Test
    @Tag("BENCH-38")
    @DisplayName("the t CDF inverts the quantile")
    void tCdfInvertsQuantile() {
        for (double df : new double[] {1, 3, 17, 45, 250}) {
            for (double p : new double[] {0.6, 0.9, 0.975, 0.995}) {
                assertEquals(p, Stats.tCdf(Stats.tQuantile(p, df), df), 1e-9);
            }
        }
    }

    @Test
    @Tag("BENCH-38")
    @DisplayName("a mean of 40 values gets the df-39 interval, not the 1.96 fallback")
    void ofUsesExactTBeyondTable() {
        List<Double> xs = new java.util.ArrayList<>();
        for (int i = 0; i < 40; i++) xs.add(i % 2 == 0 ? 0.4 : 0.6);
        Stats s = Stats.of(xs);
        double sd = Math.sqrt(40 * 0.01 / 39);
        assertEquals(2.0227 * sd / Math.sqrt(40), s.halfWidth, 1e-4);
    }

    @Test
    @Tag("BENCH-39")
    @DisplayName("a bootstrap interval brackets the true difference and is reproducible for a seed")
    void bootstrapDiffBracketsAndRepeats() {
        List<Double> a = new java.util.ArrayList<>();
        List<Double> b = new java.util.ArrayList<>();
        java.util.Random rng = new java.util.Random(5);
        for (int i = 0; i < 200; i++) {
            a.add(0.60 + 0.05 * rng.nextGaussian());
            b.add(0.50 + 0.05 * rng.nextGaussian());
        }
        Stats.Interval one = Stats.bootstrapDiff(a, b, 2000, 42);
        Stats.Interval two = Stats.bootstrapDiff(a, b, 2000, 42);
        assertEquals(one, two);
        assertTrue(one.lo() < 0.10 && 0.10 < one.hi(), one.toString());
        assertTrue(one.lo() < one.estimate() && one.estimate() < one.hi());
        assertTrue(one.hi() - one.lo() < 0.03);
    }

    @Test
    @Tag("BENCH-39")
    @DisplayName("a bootstrap interval over identical constant samples collapses to the difference")
    void bootstrapDiffDegenerate() {
        Stats.Interval i = Stats.bootstrapDiff(List.of(0.7, 0.7, 0.7), List.of(0.5, 0.5), 100, 1);
        assertEquals(0.2, i.lo(), 1e-12);
        assertEquals(0.2, i.hi(), 1e-12);
        assertTrue(Double.isNaN(Stats.bootstrapDiff(List.of(), List.of(1.0), 10, 1).lo()));
    }
}

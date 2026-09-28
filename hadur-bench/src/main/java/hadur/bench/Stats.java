package hadur.bench;

import java.util.List;

/** Mean and 95% confidence half-width (Student's t) of a small sample. */
public final class Stats {

    private static final double[] T975 = {
        Double.NaN, 12.706, 4.303, 3.182, 2.776, 2.571, 2.447, 2.365, 2.306, 2.262, 2.228,
        2.201, 2.179, 2.160, 2.145, 2.131, 2.120, 2.110, 2.101, 2.093, 2.086,
        2.080, 2.074, 2.069, 2.064, 2.060, 2.056, 2.052, 2.048, 2.045, 2.042
    };

    public final int n;
    public final double mean;
    public final double halfWidth;

    private Stats(int n, double mean, double halfWidth) {
        this.n = n;
        this.mean = mean;
        this.halfWidth = halfWidth;
    }

    public static Stats of(List<Double> xs) {
        int n = xs.size();
        if (n == 0) return new Stats(0, Double.NaN, Double.NaN);
        double sum = 0;
        for (double x : xs) sum += x;
        double mean = sum / n;
        if (n == 1) return new Stats(1, mean, Double.NaN);
        double ss = 0;
        for (double x : xs) ss += (x - mean) * (x - mean);
        double sd = Math.sqrt(ss / (n - 1));
        double t = n - 1 < T975.length ? T975[n - 1] : 1.96;
        return new Stats(n, mean, t * sd / Math.sqrt(n));
    }

    /** As a percentage, e.g. {@code 62.4% ± 3.1}. */
    public String percent() {
        if (n == 0) return "n/a";
        String m = String.format(java.util.Locale.ROOT, "%.1f%%", mean * 100);
        return Double.isNaN(halfWidth) ? m
            : m + String.format(java.util.Locale.ROOT, " ± %.1f", halfWidth * 100);
    }

    /**
     * BENCH-1: a stratified estimate over several opponents, each contributing its own mean
     * score share and a weight (its stratum's share of the rumble population). The estimate
     * is the weight-normalised mean; the interval comes from a weighted (Welford-style)
     * variance across opponents, which is what a stratum of noisy single-opponent means
     * needs (it is not the interval any one opponent's battles would give). Opponents with
     * zero or NaN weight are skipped, as are those with no battles.
     */
    public static Stats weighted(List<Stats> perOpponent, List<Double> weights) {
        int n = 0;
        double weightSum = 0, weightedMean = 0;
        List<Double> usedWeights = new java.util.ArrayList<>();
        List<Double> usedMeans = new java.util.ArrayList<>();
        for (int i = 0; i < perOpponent.size(); i++) {
            Stats s = perOpponent.get(i);
            double w = weights.get(i);
            if (s.n == 0 || Double.isNaN(s.mean) || Double.isNaN(w) || w <= 0) continue;
            n++;
            weightSum += w;
            weightedMean += w * s.mean;
            usedWeights.add(w);
            usedMeans.add(s.mean);
        }
        if (n == 0) return new Stats(0, Double.NaN, Double.NaN);
        double mean = weightedMean / weightSum;
        if (n == 1) return new Stats(1, mean, Double.NaN);
        double v1 = weightSum;
        double v2 = 0;
        for (double w : usedWeights) v2 += w * w;
        double effectiveN = v1 * v1 / v2;
        // Bias-corrected weighted sample variance for reliability weights (Gatz & Smith):
        // dividing by weightSum alone (a population variance) understates it; for equal
        // weights this reduces exactly to the unbiased sample variance Stats.of uses.
        double num = 0;
        for (int i = 0; i < n; i++) {
            double d = usedMeans.get(i) - mean;
            num += usedWeights.get(i) * d * d;
        }
        double denom = v1 - v2 / v1;
        double variance = denom > 0 ? num / denom : Double.NaN;
        if (Double.isNaN(variance)) return new Stats(n, mean, Double.NaN);
        int nRounded = (int) Math.round(effectiveN);
        double t = nRounded >= 2 && nRounded - 1 < T975.length ? T975[nRounded - 1] : 1.96;
        double se = Math.sqrt(variance / effectiveN);
        return new Stats(n, mean, t * se);
    }

    /**
     * BENCH-2: the mean and 95% interval of {@code candidate[i] - baseline[i]}, paired by
     * seed so noise common to both jars (the seed's opening, the field) cancels out.
     */
    public static Stats pairedDiff(List<Double> candidate, List<Double> baseline) {
        int n = Math.min(candidate.size(), baseline.size());
        List<Double> diffs = new java.util.ArrayList<>();
        for (int i = 0; i < n; i++) diffs.add(candidate.get(i) - baseline.get(i));
        return of(diffs);
    }
}

package hadur.bench;

import java.util.List;

/** Mean and 95% confidence half-width (Student's t) of a small sample. */
public final class Stats {

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
        double t = tQuantile(0.975, n - 1);
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
        double t = nRounded >= 2 ? tQuantile(0.975, nRounded - 1) : Double.NaN;
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

    /** A percentile bootstrap interval for a difference of means, with the observed estimate. */
    public record Interval(double estimate, double lo, double hi) {}

    /**
     * BENCH-39: a percentile bootstrap interval (95%) for {@code mean(a) - mean(b)}, the two
     * samples resampled independently, {@code resamples} times, from a fixed {@code seed}.
     * Needs no normality and holds for any sample size; empty input gives NaNs.
     */
    public static Interval bootstrapDiff(List<Double> a, List<Double> b, int resamples, long seed) {
        if (a.isEmpty() || b.isEmpty() || resamples < 1) {
            return new Interval(Double.NaN, Double.NaN, Double.NaN);
        }
        double[] xs = a.stream().mapToDouble(Double::doubleValue).toArray();
        double[] ys = b.stream().mapToDouble(Double::doubleValue).toArray();
        java.util.Random rng = new java.util.Random(seed);
        double[] diffs = new double[resamples];
        for (int r = 0; r < resamples; r++) {
            diffs[r] = resampleMean(xs, rng) - resampleMean(ys, rng);
        }
        java.util.Arrays.sort(diffs);
        return new Interval(mean(xs) - mean(ys), percentile(diffs, 0.025), percentile(diffs, 0.975));
    }

    private static double mean(double[] xs) {
        double sum = 0;
        for (double x : xs) sum += x;
        return sum / xs.length;
    }

    private static double resampleMean(double[] xs, java.util.Random rng) {
        double sum = 0;
        for (int i = 0; i < xs.length; i++) sum += xs[rng.nextInt(xs.length)];
        return sum / xs.length;
    }

    private static double percentile(double[] sorted, double q) {
        double pos = q * (sorted.length - 1);
        int lo = (int) Math.floor(pos);
        int hi = Math.min(lo + 1, sorted.length - 1);
        return sorted[lo] + (pos - lo) * (sorted[hi] - sorted[lo]);
    }

    /**
     * BENCH-38: the {@code p}-quantile of Student's t with {@code df} degrees of freedom,
     * accurate to about 1e-9 for any df. The CDF comes from the regularised incomplete beta
     * function; the quantile is found by bisection on it.
     */
    public static double tQuantile(double p, double df) {
        if (!(df > 0) || !(p > 0) || !(p < 1) || Double.isNaN(p)) return Double.NaN;
        if (p == 0.5) return 0;
        if (p < 0.5) return -tQuantile(1 - p, df);
        double lo = 0, hi = 1;
        while (tCdf(hi, df) < p) {
            lo = hi;
            hi *= 2;
            if (hi > 1e300) return Double.POSITIVE_INFINITY;
        }
        for (int i = 0; i < 200 && hi - lo > 1e-13 * hi; i++) {
            double mid = 0.5 * (lo + hi);
            if (tCdf(mid, df) < p) lo = mid; else hi = mid;
        }
        return 0.5 * (lo + hi);
    }

    /** The two-sided 95% critical value of Student's t, {@code tQuantile(0.975, df)}. */
    public static double t975(double df) {
        return tQuantile(0.975, df);
    }

    /** CDF of Student's t. */
    public static double tCdf(double t, double df) {
        if (t == 0) return 0.5;
        double x = df / (df + t * t);
        double tail = 0.5 * regularisedBeta(x, df / 2, 0.5);
        return t > 0 ? 1 - tail : tail;
    }

    private static double regularisedBeta(double x, double a, double b) {
        if (x <= 0) return 0;
        if (x >= 1) return 1;
        double front = Math.exp(logGamma(a + b) - logGamma(a) - logGamma(b)
            + a * Math.log(x) + b * Math.log1p(-x));
        if (x < (a + 1) / (a + b + 2)) return front * betaContinuedFraction(x, a, b) / a;
        return 1 - front * betaContinuedFraction(1 - x, b, a) / b;
    }

    /** Lentz's continued fraction for the incomplete beta function. */
    private static double betaContinuedFraction(double x, double a, double b) {
        final double tiny = 1e-300;
        double qab = a + b, qap = a + 1, qam = a - 1;
        double c = 1, d = 1 - qab * x / qap;
        if (Math.abs(d) < tiny) d = tiny;
        d = 1 / d;
        double h = d;
        for (int m = 1; m <= 1000; m++) {
            int m2 = 2 * m;
            double aa = m * (b - m) * x / ((qam + m2) * (a + m2));
            d = 1 + aa * d;
            if (Math.abs(d) < tiny) d = tiny;
            c = 1 + aa / c;
            if (Math.abs(c) < tiny) c = tiny;
            d = 1 / d;
            h *= d * c;
            aa = -(a + m) * (qab + m) * x / ((a + m2) * (qap + m2));
            d = 1 + aa * d;
            if (Math.abs(d) < tiny) d = tiny;
            c = 1 + aa / c;
            if (Math.abs(c) < tiny) c = tiny;
            d = 1 / d;
            double delta = d * c;
            h *= delta;
            if (Math.abs(delta - 1) < 1e-15) break;
        }
        return h;
    }

    private static final double[] LANCZOS = {
        0.99999999999980993, 676.5203681218851, -1259.1392167224028, 771.32342877765313,
        -176.61502916214059, 12.507343278686905, -0.13857109526572012,
        9.9843695780195716e-6, 1.5056327351493116e-7
    };

    private static double logGamma(double x) {
        if (x < 0.5) return Math.log(Math.PI / Math.abs(Math.sin(Math.PI * x))) - logGamma(1 - x);
        x -= 1;
        double sum = LANCZOS[0];
        double t = x + 7.5;
        for (int i = 1; i < 9; i++) sum += LANCZOS[i] / (x + i);
        return 0.5 * Math.log(2 * Math.PI) + (x + 0.5) * Math.log(t) - t + Math.log(sum);
    }
}

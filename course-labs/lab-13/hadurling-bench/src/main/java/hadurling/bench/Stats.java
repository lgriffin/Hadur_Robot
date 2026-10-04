package hadurling.bench;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * The mean of a small sample and the half-width of its 95% confidence interval, using
 * Student's t (HL-33). A bench result is only a few battles, so the interval is as important
 * as the mean: a share of 54% from five battles that range from 40% to 68% says nothing.
 *
 * <p>The half-width is {@code t * s / sqrt(n)}, where {@code s} is the sample standard
 * deviation (dividing by {@code n - 1}) and {@code t} is the 97.5th percentile of Student's
 * distribution with {@code n - 1} degrees of freedom. With a few samples {@code t} is much
 * bigger than the normal distribution's 1.96 (2.776 for five samples), which is exactly the
 * extra caution small samples deserve. Beyond 30 samples the table stops and 1.96 is used.
 * With fewer than two samples there is no spread to measure, so the half-width is NaN
 * ("unknown"), never 0 (HL-34).</p>
 */
public final class Stats {

    /** Student's t, 97.5th percentile, for 1 to 30 degrees of freedom (index 0 is unused). */
    private static final double[] T975 = {
        Double.NaN, 12.706, 4.303, 3.182, 2.776, 2.571, 2.447, 2.365, 2.306, 2.262, 2.228,
        2.201, 2.179, 2.160, 2.145, 2.131, 2.120, 2.110, 2.101, 2.093, 2.086,
        2.080, 2.074, 2.069, 2.064, 2.060, 2.056, 2.052, 2.048, 2.045, 2.042
    };

    /** How a change compares with the noise. */
    public enum Verdict {
        /** The interval of the paired differences lies entirely above 0. */
        BETTER,
        /** The interval lies entirely below 0. */
        WORSE,
        /** The interval includes 0, or is unknown: the data cannot tell. */
        UNCLEAR
    }

    private final int n;
    private final double mean;
    private final double halfWidth;

    private Stats(int n, double mean, double halfWidth) {
        this.n = n;
        this.mean = mean;
        this.halfWidth = halfWidth;
    }

    /**
     * The statistics of a sample.
     *
     * @param xs the values, for example one score share per seed
     * @return the mean (NaN when empty) and the 95% half-width (NaN with fewer than two values)
     */
    public static Stats of(List<Double> xs) {
        int n = xs.size();
        if (n == 0) return new Stats(0, Double.NaN, Double.NaN);
        double sum = 0;
        for (double x : xs) sum += x;
        double mean = sum / n;
        if (n == 1) return new Stats(1, mean, Double.NaN);
        double squares = 0;
        for (double x : xs) squares += (x - mean) * (x - mean);
        double sd = Math.sqrt(squares / (n - 1));
        double t = n - 1 < T975.length ? T975[n - 1] : 1.96;
        return new Stats(n, mean, t * sd / Math.sqrt(n));
    }

    /**
     * The statistics of {@code candidate[i] - baseline[i]}. <em>Paired</em> means the i-th
     * values were measured on the same seed, so whatever the seed did to both (the opening,
     * the luck of the first shots) cancels in the difference and the interval is narrower
     * than comparing the two means (HL-35).
     *
     * @param candidate the new version's value per seed
     * @param baseline the old version's value per seed, in the same order
     * @return the mean difference and its interval; only the first {@code min} pairs are used
     */
    public static Stats pairedDiff(List<Double> candidate, List<Double> baseline) {
        int n = Math.min(candidate.size(), baseline.size());
        List<Double> diffs = new ArrayList<>();
        for (int i = 0; i < n; i++) diffs.add(candidate.get(i) - baseline.get(i));
        return of(diffs);
    }

    /** @return how many values */
    public int n() { return n; }
    /** @return the mean, NaN when there are no values */
    public double mean() { return mean; }
    /** @return the half-width of the 95% interval, NaN when there are fewer than two values */
    public double halfWidth() { return halfWidth; }
    /** @return the lower end of the interval, NaN when unknown */
    public double low() { return mean - halfWidth; }
    /** @return the upper end of the interval, NaN when unknown */
    public double high() { return mean + halfWidth; }

    /**
     * Whether, treating this as the paired differences of a change, the change is outside the
     * noise (HL-35).
     *
     * @return {@link Verdict#BETTER} or {@link Verdict#WORSE} only if the whole interval is on
     *     one side of 0; {@link Verdict#UNCLEAR} otherwise, and whenever the interval is unknown
     */
    public Verdict verdict() {
        if (Double.isNaN(halfWidth)) return Verdict.UNCLEAR;
        if (low() > 0) return Verdict.BETTER;
        if (high() < 0) return Verdict.WORSE;
        return Verdict.UNCLEAR;
    }

    /**
     * @return for example {@code "62.4% +/- 3.1 (n=5)"}; the interval is {@code "?"} with one
     *     value, and the whole thing is {@code "n/a"} with none
     */
    public String percent() {
        if (n == 0) return "n/a";
        String m = String.format(Locale.ROOT, "%.1f%%", mean * 100);
        String h = Double.isNaN(halfWidth) ? "?" : String.format(Locale.ROOT, "%.1f", halfWidth * 100);
        return m + " +/- " + h + " (n=" + n + ")";
    }
}

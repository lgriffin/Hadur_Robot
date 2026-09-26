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
}

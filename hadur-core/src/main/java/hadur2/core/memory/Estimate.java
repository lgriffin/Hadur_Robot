package hadur2.core.memory;

import java.util.Locale;

/**
 * A rate and its 95% margin of error (DIAL-1): every input the opening book reads carries
 * both, so a policy can tell "their gun hits 15% of the time" from "it hit 1 of 6 shots".
 *
 * <p>The margin is Agresti-Coull's: the rate of {@code hits + 2} in {@code n + 4}. Unlike
 * the plain Wald interval, it stays wide for a rate of 0 or 1 over few samples, and it is
 * defined (about 49%) with no samples at all.</p>
 */
public final class Estimate {

    /** Nothing known: rate NaN, margin 1. */
    public static final Estimate NONE = new Estimate(Double.NaN, 1.0, 0);

    private final double value;
    private final double margin;
    private final double samples;

    private Estimate(double value, double margin, double samples) {
        this.value = value;
        this.margin = margin;
        this.samples = samples;
    }

    /** The rate of {@code hits} (may be weighted) in {@code n} trials. */
    public static Estimate of(double hits, double n) {
        if (!(n > 0) || Double.isInfinite(n) || !(hits >= 0) || Double.isInfinite(hits)) return NONE;
        double h = Math.min(hits, n);
        double p = (h + 2) / (n + 4);
        return new Estimate(h / n, 1.96 * Math.sqrt(p * (1 - p) / (n + 4)), n);
    }

    public double value() {
        return value;
    }

    public double margin() {
        return margin;
    }

    public double samples() {
        return samples;
    }

    /**
     * The centre the margin is measured from: Agresti-Coull's rate of {@code hits + 2} in
     * {@code n + 4}, pulled toward a half when there are few samples. A bound that must hold
     * with 95% confidence is {@code center() +- margin()}; the raw value can sit at 0 or 1,
     * right at the edge of an interval that is not centred on it. NaN when nothing is known.
     */
    public double center() {
        return Double.isNaN(value) ? Double.NaN : (value * samples + 2) / (samples + 4);
    }

    /** Whether the margin is at most {@code threshold}: a policy may act on it (DIAL-1). */
    public boolean within(double threshold) {
        return !Double.isNaN(value) && margin <= threshold;
    }

    /** Whether {@code other} lies outside this estimate's margin (RES-4). */
    public boolean excludes(double other) {
        return !Double.isNaN(value) && !Double.isNaN(other) && Math.abs(value - other) > margin;
    }

    @Override
    public String toString() {
        return Double.isNaN(value) ? "-" : String.format(Locale.ROOT, "%.4f+-%.4f", value, margin);
    }
}

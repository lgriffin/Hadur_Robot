package hadurling.core.policy;

import java.util.Locale;

/**
 * A rate and its 95% margin of error (HL-25). "Their gun hits 15% of the time" and "it hit 1
 * of 6 shots" are the same number and very different amounts of knowledge; an estimate
 * carries both so that a policy can tell them apart.
 *
 * <p><b>Which interval.</b> The margin is the Agresti-Coull interval. With {@code h} hits in
 * {@code n} trials, add two hits and two misses: {@code p = (h + 2) / (n + 4)}. The 95%
 * interval is {@code p} plus or minus {@code 1.96 * sqrt(p * (1 - p) / (n + 4))}. The plain
 * "Wald" interval around {@code h / n} collapses to nothing when every shot so far hit or
 * missed, which is exactly when a policy most needs to be told it knows very little. The
 * adjusted counts keep it wide: 0 hits in 3 shots still has a margin of about 33 points.
 * The 1.96 is the 97.5th percentile of the normal distribution.</p>
 *
 * <p>Everything is a fraction in [0, 1]: a margin of 0.03 is 3 points. Instances are
 * immutable. With nothing known, the value is NaN and the margin is 1.</p>
 */
public final class Estimate {

    /** Nothing known: rate NaN, margin 1. */
    public static final Estimate NONE = new Estimate(Double.NaN, 1.0, 0);

    private final double value;
    private final double margin;
    private final double samples;
    private final double center;

    private Estimate(double value, double margin, double samples) {
        this.value = value;
        this.margin = margin;
        this.samples = samples;
        this.center = Double.isNaN(value) ? Double.NaN : (value * samples + 2) / (samples + 4);
    }

    /**
     * The rate of {@code hits} in {@code n} trials.
     *
     * @param hits successes; clamped to {@code n}
     * @param n trials
     * @return the estimate, or {@link #NONE} when {@code n} is not a positive finite number or
     *     {@code hits} is negative, NaN or infinite
     */
    public static Estimate of(double hits, double n) {
        // Written as !(x > 0) rather than x <= 0 so that NaN is rejected too.
        if (!(n > 0) || Double.isInfinite(n) || !(hits >= 0) || Double.isInfinite(hits)) return NONE;
        double h = Math.min(hits, n);
        double p = (h + 2) / (n + 4);
        return new Estimate(h / n, 1.96 * Math.sqrt(p * (1 - p) / (n + 4)), n);
    }

    /** @return the raw rate {@code hits / n}, or NaN when nothing is known */
    public double value() { return value; }

    /** @return the half-width of the 95% interval, as a fraction; 1 when nothing is known */
    public double margin() { return margin; }

    /** @return the number of trials; 0 when nothing is known */
    public double samples() { return samples; }

    /**
     * @return the Agresti-Coull centre, {@code (h + 2) / (n + 4)}, which the margin is measured
     *     from; NaN when nothing is known. With few trials it sits nearer a half than
     *     {@link #value()} does.
     */
    public double center() { return center; }

    /** @return the lowest rate the data allow at 95%, {@code center - margin}; NaN when unknown */
    public double lower() { return center - margin; }

    /** @return the highest rate the data allow at 95%, {@code center + margin}; NaN when unknown */
    public double upper() { return center + margin; }

    /**
     * Whether the margin is narrow enough to act on.
     *
     * @param threshold the widest margin accepted, as a fraction
     * @return false for {@link #NONE}, whatever the threshold
     */
    public boolean within(double threshold) {
        return !Double.isNaN(value) && margin <= threshold;
    }

    /** @return for example {@code "0.0820+-0.0120"}, or {@code "-"} when nothing is known */
    @Override
    public String toString() {
        return Double.isNaN(value) ? "-" : String.format(Locale.ROOT, "%.4f+-%.4f", value, margin);
    }
}

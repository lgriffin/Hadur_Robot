package hadur2.core.memory;

import java.util.Locale;

/**
 * A rate and its 95% margin of error (DIAL-1): every input the opening book reads carries
 * both, so a policy can tell "their gun hits 15% of the time" from "it hit 1 of 6 shots".
 *
 * <p>The margin is Agresti-Coull's: the rate of {@code hits + 2} in {@code n + 4}. Unlike
 * the plain Wald interval, it stays wide for a rate of 0 or 1 over few samples. The
 * formula is even defined with no samples at all (about 49%), although {@link #of} returns
 * {@link #NONE} in that case so that "nothing known" is explicit.</p>
 *
 * <p>Concretely, with {@code h} hits in {@code n} trials:</p>
 * <ul>
 * <li>{@link #value()} is the raw rate {@code h / n};</li>
 * <li>{@link #center()} is {@code p = (h + 2) / (n + 4)}, the Agresti-Coull centre;</li>
 * <li>{@link #margin()} is {@code 1.96 * sqrt(p (1 - p) / (n + 4))}, the half-width of the
 *     95% interval around that centre (1.96 is the normal distribution's 97.5th
 *     percentile).</li>
 * </ul>
 *
 * <p>Hits may be weighted (a normalised hit counts for less than 1), so {@code h} and
 * {@code n} are doubles. Rates, centres and margins are all fractions in [0, 1], not
 * percentages: a margin of 0.03 is 3 points.</p>
 *
 * <p>Instances are immutable. The adapt package reads tiers from them ({@link Tiers}),
 * RES-4's seed trust compares live estimates with the profile's, and the S5 and S6
 * policies in {@code hadur2.core.policy} compare centres and margins (DIST-1, POW-2,
 * MOVE-2).</p>
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

    /**
     * The rate of {@code hits} (may be weighted) in {@code n} trials.
     *
     * @param hits successes, possibly weighted; clamped to {@code n}
     * @param n trials, possibly weighted
     * @return the estimate, or {@link #NONE} when {@code n} is not a positive finite number
     *     or {@code hits} is negative, NaN or infinite
     */
    public static Estimate of(double hits, double n) {
        // Written as !(x > 0) rather than x <= 0 so that NaN is rejected too.
        if (!(n > 0) || Double.isInfinite(n) || !(hits >= 0) || Double.isInfinite(hits)) return NONE;
        // Clamp so the rate never exceeds 1, whatever the caller passes.
        double h = Math.min(hits, n);
        // Agresti-Coull: add two successes and two failures, then use the Wald formula on
        // the adjusted counts. This keeps the interval honest for rates near 0 or 1.
        double p = (h + 2) / (n + 4);
        return new Estimate(h / n, 1.96 * Math.sqrt(p * (1 - p) / (n + 4)), n);
    }

    /** The raw rate {@code hits / n} as a fraction in [0, 1], or NaN when nothing is known. */
    public double value() {
        return value;
    }

    /** The half-width of the 95% interval around {@link #center()}, as a fraction; 1 when nothing is known. */
    public double margin() {
        return margin;
    }

    /** The number of trials {@code n} (weighted if the trials were); 0 when nothing is known. */
    public double samples() {
        return samples;
    }

    /**
     * The centre the margin is measured from: Agresti-Coull's rate of {@code hits + 2} in
     * {@code n + 4}, pulled toward a half when there are few samples. A bound that must hold
     * with 95% confidence is {@code center() +- margin()}; the raw value can sit at 0 or 1,
     * right at the edge of an interval that is not centred on it. NaN when nothing is known.
     *
     * @return the Agresti-Coull centre, a fraction in [0, 1], or NaN
     */
    public double center() {
        // value * samples recovers the (clamped) hit count h, so this is (h + 2) / (n + 4).
        return Double.isNaN(value) ? Double.NaN : (value * samples + 2) / (samples + 4);
    }

    /**
     * Whether the margin is at most {@code threshold}: a policy may act on it (DIAL-1).
     *
     * @param threshold the widest margin the policy accepts, as a fraction
     * @return false for {@link #NONE}, whatever the threshold
     */
    public boolean within(double threshold) {
        return !Double.isNaN(value) && margin <= threshold;
    }

    /**
     * Whether {@code other} lies outside this estimate's margin (RES-4).
     *
     * <p>Measured from the raw {@link #value()}, not the centre. The main code's seed trust
     * ({@code hadur2.core.adapt.SeedTrust}) makes its own comparison; this method is used by
     * the tests.</p>
     *
     * @param other a rate to test, as a fraction
     * @return false when either side is unknown
     */
    public boolean excludes(double other) {
        return !Double.isNaN(value) && !Double.isNaN(other) && Math.abs(value - other) > margin;
    }

    /** {@code "0.0820+-0.0120"}, or {@code "-"} when nothing is known; always in the root locale. */
    @Override
    public String toString() {
        return Double.isNaN(value) ? "-" : String.format(Locale.ROOT, "%.4f+-%.4f", value, margin);
    }
}

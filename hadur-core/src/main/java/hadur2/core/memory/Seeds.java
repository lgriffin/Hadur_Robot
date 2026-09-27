package hadur2.core.memory;

/**
 * How a KNN sample becomes a seed of {@link OpponentProfile#SAMPLE_WIDTH} shorts and back
 * (S4). Data-point values and guess factors are stored to 1/10000, displacements (pixels
 * per tick) to 1/1000; values outside a short's range are clamped and NaN reads as 0.
 *
 * <ul>
 * <li>A <b>gun</b> sample: the main gun view's 10 data-point values, the guess factor
 *     the enemy reached, and its displacement vector (x, y).</li>
 * <li>A <b>surf</b> sample: the flattener view's 11 data-point values, the simple view's
 *     lateral-velocity value, and the guess factor of the bullet that hit us.</li>
 * </ul>
 *
 * <p>Both layouts are {@link OpponentProfile#SAMPLE_WIDTH} (13) values wide. In a gun
 * sample the first 11 values (10 data points and the guess factor) use the fine scale and
 * the last two (the displacement) the coarse one; in a surf sample all 13 use the fine
 * scale. A short holds -32768 to 32767, so a fine value covers about [-3.27, 3.27] and a
 * coarse one about [-32.7, 32.7] px per tick; guess factors lie in [-1, 1] and a robot
 * moves at most 8 px a tick, so both fit.</p>
 *
 * <p>Seeding is ADAPT-3: {@link ProfileFolder} quantises samples as the round runs, the
 * profile stores them, and {@code hadur2.core.adapt.OpeningBook} restores them for
 * replay at a reduced weight. Quantising costs a little precision (at most half a unit of
 * the scale) in exchange for a profile a quarter the size of one stored as doubles.</p>
 */
public final class Seeds {

    /** Units per 1.0 for data-point values and guess factors: a resolution of 0.0001. */
    static final double FINE = 10_000;
    /** Units per pixel for displacements: a resolution of 0.001 px per tick. */
    static final double COARSE = 1_000;

    private Seeds() {}

    /**
     * Quantises a gun sample for storage.
     *
     * @param sample 13 values in the gun layout
     * @return the stored form
     * @throws IllegalArgumentException if the sample is not 13 values wide
     */
    public static short[] gun(double[] sample) {
        return quantise(sample, 11);
    }

    /**
     * Restores a stored gun sample.
     *
     * @param stored 13 shorts written by {@link #gun(double[])}
     * @return the sample, to within the quantisation step
     * @throws IllegalArgumentException if the sample is not 13 values wide
     */
    public static double[] gun(short[] stored) {
        return restore(stored, 11);
    }

    /**
     * Quantises a surf sample for storage; every value uses the fine scale.
     *
     * @param sample 13 values in the surf layout
     * @return the stored form
     * @throws IllegalArgumentException if the sample is not 13 values wide
     */
    public static short[] surf(double[] sample) {
        return quantise(sample, OpponentProfile.SAMPLE_WIDTH);
    }

    /**
     * Restores a stored surf sample.
     *
     * @param stored 13 shorts written by {@link #surf(double[])}
     * @return the sample, to within the quantisation step
     * @throws IllegalArgumentException if the sample is not 13 values wide
     */
    public static double[] surf(short[] stored) {
        return restore(stored, OpponentProfile.SAMPLE_WIDTH);
    }

    /** Values before {@code fineUpTo} at the fine scale, the rest at the coarse one. */
    private static short[] quantise(double[] sample, int fineUpTo) {
        if (sample.length != OpponentProfile.SAMPLE_WIDTH) {
            throw new IllegalArgumentException("a sample has " + OpponentProfile.SAMPLE_WIDTH + " values");
        }
        short[] s = new short[sample.length];
        for (int i = 0; i < s.length; i++) {
            double v = sample[i] * (i < fineUpTo ? FINE : COARSE);
            // Round to the nearest unit and saturate at a short's range rather than wrap;
            // NaN (an undefined data point) becomes 0.
            s[i] = Double.isNaN(v) ? 0 : (short) Math.max(Short.MIN_VALUE, Math.min(Short.MAX_VALUE, Math.round(v)));
        }
        return s;
    }

    private static double[] restore(short[] stored, int fineUpTo) {
        if (stored.length != OpponentProfile.SAMPLE_WIDTH) {
            throw new IllegalArgumentException("a sample has " + OpponentProfile.SAMPLE_WIDTH + " values");
        }
        double[] d = new double[stored.length];
        for (int i = 0; i < d.length; i++) d[i] = stored[i] / (i < fineUpTo ? FINE : COARSE);
        return d;
    }
}

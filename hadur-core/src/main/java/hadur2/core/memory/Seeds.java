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
 */
public final class Seeds {

    static final double FINE = 10_000;
    static final double COARSE = 1_000;

    private Seeds() {}

    public static short[] gun(double[] sample) {
        return quantise(sample, 11);
    }

    public static double[] gun(short[] stored) {
        return restore(stored, 11);
    }

    public static short[] surf(double[] sample) {
        return quantise(sample, OpponentProfile.SAMPLE_WIDTH);
    }

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

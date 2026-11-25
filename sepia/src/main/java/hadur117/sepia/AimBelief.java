package hadur117.sepia;

import hadur117.core.model.Wave;
import hadur117.core.physics.DiaUtils;

/**
 * Where the enemy aims: a belief over guess factors, the chance that a wave's bullet lies on a
 * given stretch of bearings (JET-2's "aim belief").
 *
 * <p>A guess factor is the bullet's bearing off the line to where Sepia stood when the shot was
 * fired, over the widest escape a body at full speed could make ({@code asin(8 / speed)}),
 * positive the way Sepia was travelling. The belief starts from two simple aims, head-on (guess
 * factor 0) and linear (the factor Sepia's lateral speed gives), over a thin even floor, and learns
 * every bullet whose heading Sepia sees: one that hits it, and one its own bullet meets. Bins are
 * smoothed over a few neighbours, as a guess-factor gun's are.</p>
 *
 * <p>The belief is kept for the battle, so what one round reveals guides the next. It is not a
 * verdict on the gun: Recognition (EXACT, SIMPLE, LEARNER) is a later stage of the design.</p>
 */
public final class AimBelief {

    /** Guess-factor bins over [-1, 1]; the middle one is head-on. */
    static final int BINS = 47;
    /** The weight of each simple aim in the prior, against one revealed bullet's 1. */
    static final double PRIOR = 1.0;
    /** The even floor in every bin, so no landing is ever thought safe. */
    static final double FLOOR = 0.02;
    /** The smoothing width of a revealed bullet, bins. */
    static final double SPREAD = 1.5;

    /** The revealed bullets, smoothed, by bin. */
    private final double[] learned = new double[BINS];
    /** How many bullets have been revealed. */
    private int revealed;

    /** Bullets revealed so far this battle. */
    public int revealed() {
        return revealed;
    }

    /**
     * A bullet of {@code wave} is seen flying on {@code heading}: it hit Sepia, or met one of
     * Sepia's bullets. Its guess factor is learnt.
     *
     * @param wave the wave it belongs to
     * @param heading the bullet's heading, radians
     */
    public void reveal(Wave wave, double heading) {
        addAt(guessFactor(wave, heading), 1.0, learned);
        revealed++;
    }

    /**
     * The chance that {@code wave}'s bullet lies on a bearing in {@code [lo, hi]}.
     *
     * @param wave the wave
     * @param lo the low bearing, radians
     * @param hi the high bearing, radians
     * @return a probability in [0, 1]
     */
    public double mass(Wave wave, double lo, double hi) {
        double[] d = density(wave);
        double g0 = guessFactor(wave, lo), g1 = guessFactor(wave, hi);
        double a = Math.min(g0, g1), b = Math.max(g0, g1);
        // Each bin covers [centre - half, centre + half]; the density is flat inside it.
        double half = 1.0 / (BINS - 1);
        double sum = 0;
        for (int i = 0; i < BINS; i++) {
            double c = -1 + 2.0 * i / (BINS - 1);
            double overlap = Math.min(b, c + half) - Math.max(a, c - half);
            if (overlap > 0) sum += d[i] * overlap / (2 * half);
        }
        return Math.min(1.0, sum);
    }

    /**
     * The belief for one wave, normalised to sum to 1: the learnt bins plus the prior's head-on and
     * linear peaks and the floor.
     */
    double[] density(Wave wave) {
        double[] d = learned.clone();
        addAt(0.0, PRIOR, d);
        addAt(linearFactor(wave), PRIOR, d);
        double total = 0;
        for (int i = 0; i < BINS; i++) {
            d[i] += FLOOR;
            total += d[i];
        }
        for (int i = 0; i < BINS; i++) d[i] /= total;
        return d;
    }

    /** The guess factor of a bullet on {@code bearing} from the wave's source. */
    static double guessFactor(Wave wave, double bearing) {
        double offset = DiaUtils.normalizeAngle(bearing, wave.absBearing) - wave.absBearing;
        return offset / maxEscape(wave) * wave.orbitDirection;
    }

    /** Where a linear aim would put the bullet, as a guess factor (walls ignored). */
    static double linearFactor(Wave wave) {
        double lateral = Math.abs(wave.lateralVelocity());
        double offset = Math.asin(Math.min(1.0, lateral / wave.bulletSpeed()));
        return Math.min(1.0, offset / maxEscape(wave));
    }

    /** The widest escape a body at full speed can make from this wave, radians. */
    static double maxEscape(Wave wave) {
        return Math.asin(Math.min(1.0, 8.0 / wave.bulletSpeed()));
    }

    /** Adds {@code weight} at guess factor {@code gf}, smoothed over neighbouring bins. */
    private static void addAt(double gf, double weight, double[] bins) {
        if (!(Math.abs(gf) <= 1.0)) return;
        double at = (gf + 1) * (BINS - 1) / 2;
        for (int i = 0; i < BINS; i++) {
            double z = (i - at) / SPREAD;
            if (Math.abs(z) < 4) bins[i] += weight * Math.exp(-0.5 * z * z);
        }
    }
}

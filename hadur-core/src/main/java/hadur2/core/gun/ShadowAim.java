package hadur2.core.gun;

import hadur2.core.physics.Angles;
import hadur2.core.physics.Rules;

/**
 * GUN-7: bullets are armour. Given the angle the chosen gun would fire along, it weighs a
 * small set of nearby candidate angles by the damage a hit would do plus the damage the
 * bullet's shadows would save us, and fires the best.
 *
 * <p>The value of a candidate {@code a} is
 * {@code P(hit at a) * damage(power) + ShadowValue.avoided(a, power)}: the first term is the
 * gun's probability mass at the angle (see {@link Mass}) times Robocode's damage for the
 * power, the second is what the duel says the bullet's path blocks on the intervals movement
 * published (MOVE-8). The gun's own angle comes first and wins every tie, so with nothing to
 * shadow the choice is the gun's, exactly.</p>
 *
 * <p>Candidates, all bounded: the gun's angle; four offsets of {@code +-0.45} and
 * {@code +-0.9} of the target's half-width, so the bullet still hits where the gun's mass is
 * but its path crosses other enemy bullets; and, when the gun is the main gun, up to
 * {@link #MAX_SAMPLES} of its neighbours' own angles within two half-widths of its choice (a
 * kernel sample is an angle the gun believes in). The other virtual guns' angles are not
 * candidates: they are computed only when a real bullet leaves, and the KNN searches are the
 * gun's costly part.</p>
 */
public final class ShadowAim {

    /** Offsets from the gun's angle, in target half-widths. */
    static final double[] OFFSETS = {-0.9, -0.45, 0.45, 0.9};
    /** The most of the main gun's neighbour angles that join as candidates. */
    static final int MAX_SAMPLES = 8;
    /** Neighbour angles are candidates within this many half-widths of the gun's angle. */
    static final double SAMPLE_REACH = 2.0;
    /** A candidate this close, in half-widths, to one already taken adds nothing. */
    static final double MIN_SPACING = 0.25;
    /**
     * The chance a bullet hits at the peak of a gun that is not the main gun, whose neighbours
     * the aim cannot read: a typical hit rate against a surfer.
     */
    static final double FALLBACK_PEAK = 0.15;
    /**
     * The chance a bullet aimed at a point hits when every neighbour sits on it: a Gaussian
     * kernel one bot-width wide, {@code 1 / sqrt(2 pi)}, spread over the bot's width.
     */
    static final double KERNEL_SCALE = 0.3989422804014327;

    /** Not instantiated: the class is a set of pure functions. */
    private ShadowAim() {}

    /**
     * The gun's probability mass over firing angles: a Gaussian kernel density of points (the
     * main gun's neighbours, or one point at the gun's angle), each {@code weight} strong,
     * of bandwidth {@code bandwidth}, scaled so that the value is the chance a bullet fired
     * along the angle hits.
     */
    public static final class Mass {
        private final double[] angles;
        private final double[] weights;
        private final double sumWeights;
        private final double bandwidth;
        private final double scale;

        private Mass(double[] angles, double[] weights, double bandwidth, double scale) {
            this.angles = angles;
            this.weights = weights;
            double sum = 0;
            for (double w : weights) sum += w;
            this.sumWeights = sum;
            this.bandwidth = bandwidth;
            this.scale = scale;
        }

        /**
         * The main gun's own density: its valid neighbours' angles with their weights.
         *
         * @param angles the neighbours' firing angles, absolute radians
         * @param weights the neighbours' weights (at least 0)
         * @param bandwidth the kernel bandwidth, radians (the main gun's: twice the half-width)
         * @return the mass
         */
        public static Mass kernel(double[] angles, double[] weights, double bandwidth) {
            return new Mass(angles, weights, bandwidth, KERNEL_SCALE);
        }

        /**
         * A gun whose neighbours are not read: one point at {@code angle} of peak
         * {@link #FALLBACK_PEAK}.
         *
         * @param angle the gun's angle, absolute radians
         * @param bandwidth the kernel bandwidth, radians
         * @return the mass
         */
        public static Mass around(double angle, double bandwidth) {
            return new Mass(new double[] {angle}, new double[] {1.0}, bandwidth, FALLBACK_PEAK);
        }

        /**
         * The chance a bullet fired along {@code angle} hits, in [0, 1].
         *
         * @param angle an absolute bearing, radians
         * @return the probability, 0 with no weight at all
         */
        public double at(double angle) {
            if (!(sumWeights > 0)) return 0;
            double sum = 0;
            for (int i = 0; i < angles.length; i++) {
                double u = Angles.normalRelativeAngle(angle - angles[i]) / bandwidth;
                sum += weights[i] * Math.exp(-0.5 * u * u);
            }
            return Math.min(1.0, scale * sum / sumWeights);
        }

        /** The points' angles; the aim reads them as kernel samples. */
        double[] angles() {
            return angles;
        }
    }

    /**
     * The firing angle GUN-7 picks.
     *
     * @param gunAngle the angle the chosen gun would fire along, absolute radians
     * @param mass the gun's probability mass over angles
     * @param halfWidth the target's angular half-width at this range, radians
     * @param power the bullet's power
     * @param shadow the damage-avoided term; when not {@link ShadowValue#active} the answer is
     *     {@code gunAngle} itself
     * @return an absolute bearing in [0, 2pi)
     */
    public static double choose(double gunAngle, Mass mass, double halfWidth, double power,
                                ShadowValue shadow) {
        if (shadow == null || !shadow.active() || !(halfWidth > 0)) return gunAngle;
        double[] angles = new double[1 + OFFSETS.length + MAX_SAMPLES];
        int n = 0;
        angles[n++] = gunAngle;
        for (double offset : OFFSETS) angles[n++] = gunAngle + offset * halfWidth;
        int samples = 0;
        double[] pool = mass.angles();
        // Kernel samples within reach of the gun's angle and clear of those already taken.
        for (int i = 0; i < pool.length && samples < MAX_SAMPLES; i++) {
            double a = pool[i];
            double d = Math.abs(Angles.normalRelativeAngle(a - gunAngle));
            if (d > SAMPLE_REACH * halfWidth) continue;
            boolean near = false;
            for (int j = 0; j < n && !near; j++) {
                near = Math.abs(Angles.normalRelativeAngle(a - angles[j])) < MIN_SPACING * halfWidth;
            }
            if (near) continue;
            angles[n++] = a;
            samples++;
        }
        double[] hits = new double[n];
        for (int i = 0; i < n; i++) hits[i] = mass.at(angles[i]);
        int best = pick(angles, hits, n, power, shadow);
        return Angles.normalAbsoluteAngle(angles[best]);
    }

    /**
     * The index of the candidate with the greatest value, {@code hit * damage + avoided}; the
     * lowest index on a tie, so the gun's own angle (index 0) is kept unless another is
     * strictly better.
     *
     * @param angles the candidates' angles, absolute radians
     * @param hits each candidate's chance of hitting
     * @param n how many of them to consider
     * @param power the bullet's power
     * @param shadow the damage-avoided term
     * @return an index in [0, n)
     */
    static int pick(double[] angles, double[] hits, int n, double power, ShadowValue shadow) {
        double damage = Rules.getBulletDamage(power);
        double ceiling = shadow.ceiling(power);
        int best = 0;
        double bestValue = hits[0] * damage + shadow.avoided(angles[0], power);
        for (int i = 1; i < n; i++) {
            double hitValue = hits[i] * damage;
            // Even stopping everything cannot beat the best so far: skip the shadow geometry.
            if (hitValue + ceiling <= bestValue) continue;
            double value = hitValue + shadow.avoided(angles[i], power);
            if (value > bestValue) {
                bestValue = value;
                best = i;
            }
        }
        return best;
    }
}

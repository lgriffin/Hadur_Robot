package hadur2.core.move;

/**
 * MOVE-14: the protean pick. Among the surf's options it draws one at random, with a softmin
 * over their dangers, so a gun that has learned our least-danger option is right less often,
 * and the cost in danger is bounded: the Gibbs distribution's expected excess over the best
 * option is at most {@code T ln K}, with {@code T} the temperature. An option much worse than
 * the best is never drawn (the safety cap).
 *
 * <p><b>The die.</b> The logistic map {@code x -> 4x(1 - x)} is chaotic, and
 * {@code u = (2 / pi) asin(sqrt(x))} makes its values uniform on [0, 1]. The enemy never sees
 * {@code x}, so to it the draws are fair; to us they replay exactly from the seed
 * ({@link #seed}), which keeps the replay fixtures deterministic and the core free of
 * {@code java.util.Random}. In floating point the orbit can fall into 0, the fixed point 3/4
 * or a short cycle: a state at one of those, or equal to any of the last
 * {@value #HISTORY} states, is moved on by the golden ratio's fraction.</p>
 *
 * <p>Pure: no engine types, no clock. The surf feeds it the option dangers, the views'
 * spread per option and their mean danger; the order of options is the caller's.</p>
 */
public final class ProteanPick {

    /** How much the views' disagreement raises the temperature. */
    static final double C = 1.0;
    /** The temperature floor as a share of the least danger, so a near tie is broken at random. */
    static final double T0_SHARE = 0.02;
    /** The floor when the least danger is 0. */
    static final double T0_ZERO = 1e-9;
    /** The cap: an option is drawable when its excess is at most {@code DELTA * D* + DELTA0}. */
    static final double DELTA = 0.5;
    static final double DELTA0 = 0.01;
    /** Keeps the spread's denominator off 0. */
    static final double EPSILON = 1e-6;
    /** How many past states the die compares a new one with. */
    static final int HISTORY = 64;
    /** The fraction added to a state the guard moves on, (sqrt(5) - 1) / 2. */
    static final double PHI = (Math.sqrt(5.0) - 1.0) / 2.0;
    /** How close to 0, 3/4 or 1 a state counts as being there. */
    private static final double GUARD_EPS = 1e-12;
    /** The longest a dwell may be, a bound on a pathological draw. */
    private static final int MAX_DWELL = 10_000;

    private double x = 0.3141592653589793;
    private final double[] recent = new double[HISTORY];
    private int recentCount;
    private int recentNext;

    /**
     * Seeds the die from a hash of the enemy's name and the round number, into (0, 1) away
     * from 0, 1/4, 1/2, 3/4 and 1, and forgets the history.
     *
     * @param enemyName the opponent's name
     * @param round the round number
     */
    public void seed(String enemyName, int round) {
        long z = (enemyName == null ? 0 : enemyName.hashCode()) * 0x9E3779B97F4A7C15L + round;
        // splitmix64's finalizer
        z = (z ^ (z >>> 30)) * 0xBF58476D1CE4E5B9L;
        z = (z ^ (z >>> 27)) * 0x94D049BB133111EBL;
        z ^= z >>> 31;
        double s = ((z >>> 11) + 0.5) / 9007199254740992.0;
        for (int i = 0; i < 16 && nearSeedAvoid(s); i++) s = frac(s + PHI);
        x = s;
        recentCount = 0;
        recentNext = 0;
    }

    private static boolean nearSeedAvoid(double s) {
        for (double a : new double[] {0.0, 0.25, 0.5, 0.75, 1.0}) {
            if (Math.abs(s - a) < 1e-3) return true;
        }
        return false;
    }

    private static double frac(double v) {
        return v - Math.floor(v);
    }

    /** The die's state now, in [0, 1]; a seam for tests. */
    double state() {
        return x;
    }

    /** Puts the die's state at {@code s} with an empty history; a seam for tests. */
    void setState(double s) {
        x = s;
        recentCount = 0;
        recentNext = 0;
    }

    private boolean stuck(double v) {
        if (Math.abs(v) < GUARD_EPS || Math.abs(v - 0.75) < GUARD_EPS || Math.abs(v - 1.0) < GUARD_EPS) {
            return true;
        }
        for (int i = 0; i < recentCount; i++) {
            if (recent[i] == v) return true;
        }
        return false;
    }

    /**
     * The next uniform draw: steps the map, moves a stuck state on, and maps it to [0, 1].
     *
     * @return {@code u} in [0, 1]
     */
    public double next() {
        double v = 4.0 * x * (1.0 - x);
        for (int i = 0; i < 8 && stuck(v); i++) v = frac(v + PHI);
        x = v;
        recent[recentNext] = v;
        recentNext = (recentNext + 1) % HISTORY;
        if (recentCount < HISTORY) recentCount++;
        double u = (2.0 / Math.PI) * Math.asin(Math.sqrt(Math.min(1.0, Math.max(0.0, v))));
        return Math.min(1.0, Math.max(0.0, u));
    }

    /**
     * The temperature: {@code c S D* + T0}, with {@code S = mean(spread) / (meanViewDanger + 1e-6)}
     * and {@code T0 = 0.02 D*} (1e-9 when {@code D*} is 0).
     *
     * @param dangers the options' dangers
     * @param spread the views' weighted standard deviation for each option
     * @param meanViewDanger the views' weighted mean danger, averaged over the options
     * @return the temperature, above 0
     */
    static double temperature(double[] dangers, double[] spread, double meanViewDanger) {
        double best = min(dangers);
        double sum = 0;
        for (double s : spread) sum += s;
        double spreadShare = spread.length == 0 ? 0 : sum / spread.length / (meanViewDanger + EPSILON);
        double t0 = best > 0 ? T0_SHARE * best : T0_ZERO;
        return C * spreadShare * best + t0;
    }

    /**
     * The pick's distribution: the Gibbs probability of each option inside the cap, 0 outside.
     *
     * @param dangers the options' dangers
     * @param spread the views' weighted standard deviation for each option
     * @param meanViewDanger the views' weighted mean danger, averaged over the options
     * @return the probability of each option, in the order of {@code dangers}; sums to 1
     */
    static double[] probabilities(double[] dangers, double[] spread, double meanViewDanger) {
        double best = min(dangers);
        double t = temperature(dangers, spread, meanViewDanger);
        double cap = DELTA * best + DELTA0;
        double[] p = new double[dangers.length];
        double z = 0;
        for (int i = 0; i < p.length; i++) {
            double excess = dangers[i] - best;
            if (excess <= cap) {
                p[i] = Math.exp(-excess / t);
                z += p[i];
            }
        }
        for (int i = 0; i < p.length; i++) p[i] /= z;
        return p;
    }

    /**
     * Draws an option with the die's next value.
     *
     * @param dangers the options' dangers (the surf's totals), at least one
     * @param spread the views' weighted standard deviation for each option
     * @param meanViewDanger the views' weighted mean danger, averaged over the options
     * @return the index of the option drawn
     */
    public int pick(double[] dangers, double[] spread, double meanViewDanger) {
        return pick(dangers, spread, meanViewDanger, next());
    }

    /**
     * The option the uniform draw {@code u} selects: the options in the cap, best first (ties
     * in index order), the first whose cumulative probability reaches {@code u}.
     *
     * @param dangers the options' dangers, at least one
     * @param spread the views' weighted standard deviation for each option
     * @param meanViewDanger the views' weighted mean danger, averaged over the options
     * @param u a draw in [0, 1]
     * @return the index of the option picked
     */
    static int pick(double[] dangers, double[] spread, double meanViewDanger, double u) {
        double[] p = probabilities(dangers, spread, meanViewDanger);
        Integer[] order = new Integer[dangers.length];
        for (int i = 0; i < order.length; i++) order[i] = i;
        java.util.Arrays.sort(order, (a, b) -> Double.compare(dangers[a], dangers[b]));
        double cumulative = 0;
        int last = order[0];
        for (int k : order) {
            if (p[k] <= 0) continue;
            cumulative += p[k];
            last = k;
            if (cumulative >= u) return k;
        }
        return last;
    }

    /**
     * How long a pick stands, in ticks: geometric with the given mean,
     * {@code 1 + floor(ln u / ln(1 - 1 / mean))}; 1 when the mean is 1 or less (no draw is spent).
     *
     * @param mean the mean dwell, in ticks
     * @return the dwell, at least 1
     */
    public int dwell(double mean) {
        if (!(mean > 1.0)) return 1;
        double u = Math.max(next(), 1e-12);
        double tau = 1.0 + Math.floor(Math.log(u) / Math.log(1.0 - 1.0 / mean));
        return (int) Math.min(MAX_DWELL, Math.max(1.0, tau));
    }

    private static double min(double[] a) {
        double m = Double.POSITIVE_INFINITY;
        for (double v : a) m = Math.min(m, v);
        return m;
    }
}

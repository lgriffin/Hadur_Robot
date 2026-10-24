package hadur2.core.physics;

/**
 * DODGE-2: which simple aim the enemy's gun uses, read from the headings of its bullets we learn
 * (those that hit us and those that meet ours), and, once one stands out, the danger of a surf
 * option as whether that aim's bullet would cross us there.
 *
 * <p>Saguaro's ShotDodger: a gun that fires the same simple aim every time is beaten outright by
 * standing anywhere its next bullet will not be. Its experts, per lag ({@link SimpleAims}): the
 * six aims that are angles; the same six with the enemy's body turn on the tick after added (a
 * gun that does not turn apart from its body); and a one-line linear aim with a divisor of its
 * own in place of the bullet's speed, with and without that turn, the divisor learned from the
 * bullets read as Saguaro does (a running mean decayed by {@value #DIVISOR_DECAY} a bullet, kept
 * within 4 to 30). The count runs across the rounds of one battle (a gun does not change its aim
 * between rounds) and is cleared by {@link #reset}. The dodger is active only while one expert
 * matched at least {@value #MIN_MATCHES} of the bullets read and at least {@value #MIN_SHARE} of
 * them; a learning gun matches none, so the surf stays on its views.</p>
 *
 * <p>Pure: no engine types, no clock, no randomness.</p>
 */
public final class ShotDodger {

    /** A bullet's heading matches an aim within this many radians (our state is exact). */
    public static final double MATCH = 0.002;
    /** The fewest matches of the best aim before the dodger acts. */
    public static final int MIN_MATCHES = 3;
    /** The least share of the bullets read that the best aim must match. */
    public static final double MIN_SHARE = 0.6;
    /** The views' weight left in a dodged danger, so ties between safe options still use them. */
    public static final double VIEW_WEIGHT = 0.05;
    /**
     * Added to every dodged danger, so the surf's distancing and escape factors still choose
     * among the options the bullet misses. Without it the first smokes took twice the ram
     * damage: a danger of almost 0 makes closing in on the enemy free.
     */
    public static final double FLOOR = 0.1;
    /** Margin added each side of a surf option's hit range, radians. */
    public static final double MARGIN = 0.005;
    /** Experts a lag: the angles, the angles with the turn after, and the two divisor aims. */
    public static final int PER_LAG = 2 * SimpleAims.ANGLES + 2;
    /** Experts in all. */
    public static final int EXPERTS = SimpleAims.LAGS * PER_LAG;
    /** The first expert a lag that adds the enemy's turn after. */
    static final int TURNED = SimpleAims.ANGLES;
    /** The divisor aim, and the one after it with the turn added. */
    static final int DIVISOR = 2 * SimpleAims.ANGLES;
    /** A learned divisor's running mean keeps this much of the last a bullet. */
    static final double DIVISOR_DECAY = 0.85;
    static final double MIN_DIVISOR = 4.0;
    static final double MAX_DIVISOR = 30.0;

    private final int[] matches = new int[EXPERTS];
    private final double[] divisorSum = new double[2 * SimpleAims.LAGS];
    private final double[] divisorWeight = new double[2 * SimpleAims.LAGS];
    private int read;

    /**
     * Counts one enemy bullet whose heading we know, then learns the divisors from it.
     *
     * @param aims the bullet's wave's {@link SimpleAims#angles}
     * @param heading the bullet's heading, radians
     */
    public void observe(double[] aims, double heading) {
        if (aims == null || Double.isNaN(heading) || aims.length < SimpleAims.COUNT) return;
        read++;
        for (int k = 0; k < EXPERTS; k++) {
            double a = expert(aims, k);
            if (!Double.isNaN(a) && Math.abs(SimpleAims.relative(heading - a)) <= MATCH) matches[k]++;
        }
        for (int lag = 0; lag < SimpleAims.LAGS; lag++) {
            int base = lag * SimpleAims.TYPES;
            double headOn = aims[base + SimpleAims.HEAD_ON];
            double lateral = aims[base + SimpleAims.LATERAL];
            double turn = aims[base + SimpleAims.TURN_AFTER];
            learn(2 * lag, lateral, heading - headOn);
            if (!Double.isNaN(turn)) learn(2 * lag + 1, lateral, heading - headOn - turn);
        }
    }

    private void learn(int slot, double lateral, double offset) {
        if (Double.isNaN(lateral) || Double.isNaN(offset)) return;
        double off = SimpleAims.relative(offset);
        if (Math.abs(off) < 1e-4 || Math.abs(lateral) < 1e-4) return;
        double d = lateral / off;
        if (d < MIN_DIVISOR || d > MAX_DIVISOR) return;
        divisorSum[slot] = divisorSum[slot] * DIVISOR_DECAY + d;
        divisorWeight[slot] = divisorWeight[slot] * DIVISOR_DECAY + 1;
    }

    /** Expert {@code k}'s absolute angle for a wave's aims; NaN when it has none. */
    public double expert(double[] aims, int k) {
        int lag = k / PER_LAG;
        int j = k % PER_LAG;
        int base = lag * SimpleAims.TYPES;
        if (j < TURNED) return aims[base + j];
        double turn = aims[base + SimpleAims.TURN_AFTER];
        if (j < DIVISOR) return aims[base + j - TURNED] + turn;
        int slot = 2 * lag + (j - DIVISOR);
        if (divisorWeight[slot] <= 0) return Double.NaN;
        double a = aims[base + SimpleAims.HEAD_ON]
            + aims[base + SimpleAims.LATERAL] / (divisorSum[slot] / divisorWeight[slot]);
        return j == DIVISOR ? a : a + turn;
    }

    /** The expert matched most often (the lowest index on a tie), or -1 with none matched. */
    public int best() {
        int b = -1;
        for (int k = 0; k < matches.length; k++) if (matches[k] > 0 && (b < 0 || matches[k] > matches[b])) b = k;
        return b;
    }

    /** Whether one expert stands out enough to dodge it. */
    public boolean active() {
        int b = best();
        return b >= 0 && matches[b] >= MIN_MATCHES && matches[b] >= MIN_SHARE * read;
    }

    /** Bullets read this battle. */
    public int read() {
        return read;
    }

    /** Matches of expert {@code k} this battle. */
    public int matches(int k) {
        return matches[k];
    }

    /**
     * The danger of a surf option whose hit range is {@code angle +/- bandwidth}: 1 when the best
     * expert's bullet falls inside it (with {@link #MARGIN}), else 0; NaN while not {@link #active}.
     */
    public double danger(double[] aims, double angle, double bandwidth) {
        if (!active() || aims == null || aims.length < SimpleAims.COUNT) return Double.NaN;
        double a = expert(aims, best());
        if (Double.isNaN(a)) return Double.NaN;
        return Math.abs(SimpleAims.relative(a - angle)) <= bandwidth + MARGIN ? 1.0 : 0.0;
    }

    /** Forgets the count and the divisors, for a new battle. */
    public void reset() {
        java.util.Arrays.fill(matches, 0);
        java.util.Arrays.fill(divisorSum, 0);
        java.util.Arrays.fill(divisorWeight, 0);
        read = 0;
    }
}

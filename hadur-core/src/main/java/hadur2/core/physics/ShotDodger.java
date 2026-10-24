package hadur2.core.physics;

/**
 * DODGE-2: which simple aim ({@link SimpleAims}) the enemy's gun uses, read from the headings of
 * its bullets we learn (those that hit us and those that meet ours), and, once one stands out,
 * the danger of a surf option as whether that aim's bullet would cross us there.
 *
 * <p>Saguaro's ShotDodger: a gun that fires the same simple aim every time is beaten outright by
 * standing anywhere its next bullet will not be. The count runs across the rounds of one battle
 * (a gun does not change its aim between rounds) and is cleared by {@link #reset}. The dodger is
 * active only while one aim matched at least {@value #MIN_MATCHES} of the bullets read and at
 * least {@value #MIN_SHARE} of them; a learning gun matches none, so the surf stays on its views.</p>
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
    /** Margin added each side of a surf option's hit range, radians. */
    public static final double MARGIN = 0.005;

    private final int[] matches = new int[SimpleAims.COUNT];
    private int read;

    /**
     * Counts one enemy bullet whose heading we know.
     *
     * @param aims the bullet's wave's {@link SimpleAims#angles}
     * @param heading the bullet's heading, radians
     */
    public void observe(double[] aims, double heading) {
        if (aims == null || Double.isNaN(heading)) return;
        read++;
        for (int k = 0; k < aims.length && k < matches.length; k++) {
            if (!Double.isNaN(aims[k]) && Math.abs(relative(heading - aims[k])) <= MATCH) matches[k]++;
        }
    }

    /** The aim matched most often (the lowest index on a tie), or -1 with none matched. */
    public int best() {
        int b = -1;
        for (int k = 0; k < matches.length; k++) if (matches[k] > 0 && (b < 0 || matches[k] > matches[b])) b = k;
        return b;
    }

    /** Whether one aim stands out enough to dodge it. */
    public boolean active() {
        int b = best();
        return b >= 0 && matches[b] >= MIN_MATCHES && matches[b] >= MIN_SHARE * read;
    }

    /** Bullets read this battle. */
    public int read() {
        return read;
    }

    /** Matches of aim {@code k} this battle. */
    public int matches(int k) {
        return matches[k];
    }

    /**
     * The danger of a surf option whose hit range is {@code angle +/- bandwidth}: 1 when the best
     * aim's bullet falls inside it (with {@link #MARGIN}), else 0; NaN while not {@link #active}.
     */
    public double danger(double[] aims, double angle, double bandwidth) {
        if (!active() || aims == null) return Double.NaN;
        double a = aims[best()];
        if (Double.isNaN(a)) return Double.NaN;
        return Math.abs(relative(a - angle)) <= bandwidth + MARGIN ? 1.0 : 0.0;
    }

    /** Forgets the count, for a new battle. */
    public void reset() {
        java.util.Arrays.fill(matches, 0);
        read = 0;
    }

    private static double relative(double a) {
        a %= 2 * Math.PI;
        if (a > Math.PI) a -= 2 * Math.PI;
        if (a < -Math.PI) a += 2 * Math.PI;
        return a;
    }
}

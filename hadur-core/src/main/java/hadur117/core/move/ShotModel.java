package hadur117.core.move;

import hadur117.core.physics.SimpleAims;

/**
 * RAM-20: which simple aims a close-range gun really fires, learned in the battle from its bullets.
 *
 * <p>RAM-5 weighs the escape's paths against two fixed aims, head-on and linear at one fixed tick of lag.
 * The close-range robots' guns fire a handful of variants (the one-line linear aims, circular, averaged)
 * from a state one to three ticks old, some turning with the body, so the fixed pair often puts the
 * bullet on the wrong side of us. This model scores every candidate aim ({@link #EXPERTS} of them: the
 * six angles of {@link SimpleAims} at each lag, and each again with the enemy's body turn added) by how
 * near it fell to each bullet whose heading we learn (a hit on us, a bullet meeting ours), and gives the
 * escape the {@link #TOP} best as weighted rays for each new shot.</p>
 *
 * <p>Pure and bounded: {@value #EXPERTS} doubles, no clock, no randomness. Angles are radians on
 * Robocode's compass.</p>
 */
public final class ShotModel {

    /** Candidate aims a lag: the six angles, and the six with the enemy's body turn added. */
    static final int PER_LAG = 2 * SimpleAims.ANGLES;
    /** All the candidate aims. */
    static final int EXPERTS = SimpleAims.LAGS * PER_LAG;
    /** How near a bullet a candidate must fall to score: the kernel's width, radians. */
    static final double SIGMA = Math.toRadians(2.0);
    /** The candidates handed to the escape for each shot. */
    public static final int TOP = 3;
    /** The leading candidate's score before the model speaks: two clean matches. */
    static final double MIN_SCORE = 2.0;
    /** The share of the bullets read the leading candidate must explain for the model to speak. */
    static final double MIN_SHARE = 0.2;

    private final double[] score = new double[EXPERTS];
    private int read;

    /** Candidate {@code k}'s absolute angle for a wave's aims ({@link SimpleAims#angles}), NaN when unknown. */
    static double angle(double[] aims, int k) {
        int base = (k / PER_LAG) * SimpleAims.TYPES;
        int j = k % PER_LAG;
        if (j < SimpleAims.ANGLES) return aims[base + j];
        return aims[base + j - SimpleAims.ANGLES] + aims[base + SimpleAims.TURN_AFTER];
    }

    /**
     * One enemy bullet's heading read: every candidate scores by its distance from it.
     *
     * @param aims the bullet's wave's simple aims, null when the wave carried none
     * @param heading the bullet's heading
     */
    public void observe(double[] aims, double heading) {
        if (aims == null || aims.length < SimpleAims.COUNT || Double.isNaN(heading)) return;
        read++;
        for (int k = 0; k < EXPERTS; k++) {
            double a = angle(aims, k);
            if (Double.isNaN(a)) continue;
            double d = relative(heading - a) / SIGMA;
            score[k] += Math.exp(-0.5 * d * d);
        }
    }

    /** Bullets read so far. */
    public int read() {
        return read;
    }

    /** Candidate {@code k}'s score, for tests and records. */
    public double score(int k) {
        return score[k];
    }

    /** The leading candidate, -1 before any bullet. */
    public int best() {
        int b = -1;
        for (int k = 0; k < EXPERTS; k++) if (score[k] > 0 && (b < 0 || score[k] > score[b])) b = k;
        return b;
    }

    /**
     * Whether the model may replace the fixed aims: its leading candidate has matched {@link #MIN_SCORE} bullets'
     * worth and at least {@link #MIN_SHARE} of those read. A gun none of the simple aims explains (a pattern
     * matcher, a guess-factor gun) never clears the share, and the escape keeps RAM-5's pair against it.
     */
    public boolean ready() {
        int b = best();
        return b >= 0 && score[b] >= MIN_SCORE && score[b] >= MIN_SHARE * read;
    }

    /**
     * The rays a new shot is dodged as: the {@link #TOP} leading candidates known for this wave.
     *
     * @param aims the firing wave's simple aims
     * @return {@code {angle, weight}} pairs, the weights summing to 1; null when the model is not ready, the wave
     *     carries no aims, or none of the aims known for it clears the bar {@link #ready} sets
     */
    public double[] rays(double[] aims) {
        if (aims == null || aims.length < SimpleAims.COUNT || !ready()) return null;
        int[] top = new int[TOP];
        java.util.Arrays.fill(top, -1);
        for (int k = 0; k < EXPERTS; k++) {
            if (score[k] <= 0 || Double.isNaN(angle(aims, k))) continue;
            int at = k;
            for (int i = 0; i < TOP; i++) {
                if (top[i] < 0 || score[at] > score[top[i]]) {
                    int t = top[i];
                    top[i] = at;
                    at = t;
                    if (at < 0) break;
                }
            }
        }
        // The leading aim may be unknown for this wave (no body turn read): what is left must clear the bar itself.
        if (top[0] < 0 || score[top[0]] < MIN_SCORE || score[top[0]] < MIN_SHARE * read) return null;
        double sum = 0;
        for (int k : top) if (k >= 0) sum += score[k];
        double[] out = new double[2 * TOP];
        for (int i = 0; i < TOP; i++) {
            out[2 * i] = top[i] < 0 ? Double.NaN : angle(aims, top[i]);
            out[2 * i + 1] = top[i] < 0 ? 0 : score[top[i]] / sum;
        }
        return out;
    }

    private static double relative(double a) {
        a %= 2 * Math.PI;
        if (a > Math.PI) a -= 2 * Math.PI;
        if (a <= -Math.PI) a += 2 * Math.PI;
        return a;
    }
}

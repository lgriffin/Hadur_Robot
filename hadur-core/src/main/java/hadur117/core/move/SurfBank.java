package hadur117.core.move;

import hadur117.core.model.Wave;
import hadur117.core.physics.Angles;

import java.util.IdentityHashMap;
import java.util.Map;

/**
 * SURF-BANK-1: a second opinion on where the enemy's bullet on a wave will go, used to
 * re-rank the surf's options. Three members each give a distribution over the wave's guess
 * factors (classic escape angle, {@link #BINS} bins):
 * <ul>
 *   <li>a population prior, {@link SurfBankPrior}, keyed on our lateral speed, acceleration,
 *       flight time, wall room and time since our last reversal at fire time;</li>
 *   <li>an online table on the same key, learned from this enemy's bullets;</li>
 *   <li>a k-nearest-neighbour member over this enemy's bullets on six plain features.</li>
 * </ul>
 * Each member is weighted by how well it predicted the enemy's known bullets (those that hit
 * us or hit one of ours), as {@code exp} of a decayed log score. The surf multiplies each
 * option's danger by {@code (mass + FLOOR) ^ POWER}, where {@code mass} is the bank's share
 * of the option's first-wave interval. Only the 1v1 duel builds one; team and melee never do.
 */
public final class SurfBank {

    /** Guess-factor bins, -1 to 1. */
    public static final int BINS = 61;
    /** The exponent on the bank's mass in the option multiplier. */
    static final double POWER = 0.25;
    /** Added to the mass before the exponent, so an empty interval still keeps some danger. */
    static final double FLOOR = 0.02;
    /** Known bullets the k-NN member keeps. */
    static final int KNN_KEEP = 400;
    /** Neighbours the k-NN member reads. */
    static final int KNN_K = 12;
    private static final int FEATURES = 6;
    private static final int KEYS = 432;
    private static final double[][] PRIOR = decodePrior();

    private static final int PRI = 0;
    private static final int ONL = 1;
    private static final int KNN = 2;
    private static final int MEMBERS = 3;

    private final double[][] online = new double[KEYS][];
    private final double[][] knnX = new double[KNN_KEEP][];
    private final double[] knnG = new double[KNN_KEEP];
    private int knnCount;
    private final double[] score = new double[MEMBERS];
    /** The members' distributions per wave, fixed at the wave's first read. */
    private final Map<Wave, double[][]> waves = new IdentityHashMap<>();

    /** The bank's share of the firing angles {@code [low, high]} (radians) on wave {@code w}, in [0, 1]. */
    public double mass(Wave w, double low, double high) {
        double[] bank = bank(members(w));
        double g1 = gf(w, low);
        double g2 = gf(w, high);
        if (g2 < g1) { double t = g1; g1 = g2; g2 = t; }
        double m = 0;
        for (int i = 0; i < BINS; i++) {
            double c = binCentre(i);
            if (c >= g1 && c <= g2) m += bank[i];
        }
        return m;
    }

    /** The multiplier on an option's danger whose first-wave interval is {@code [low, high]}. */
    public double multiplier(Wave w, double low, double high) {
        return Math.pow(mass(w, low, high) + FLOOR, POWER);
    }

    /**
     * A known bullet on wave {@code w}, fired at {@code heading} (radians): scores the members
     * on the distributions they gave the wave, then teaches the online table and the k-NN.
     */
    public void learn(Wave w, double heading) {
        double[][] d = members(w);
        double g = gf(w, heading);
        int c = bin(g);
        for (int m = 0; m < MEMBERS; m++) {
            score[m] = 0.9 * score[m] + 0.1 * Math.log(Math.max(1e-6, d[m][c] * BINS));
        }
        int key = priorKey(w);
        if (online[key] == null) online[key] = flat(1e-3);
        double[] h = online[key];
        double[] k = kernel(c, 1.5);
        for (int i = 0; i < BINS; i++) h[i] = 0.98 * h[i] + k[i];
        int slot = knnCount % KNN_KEEP;
        knnX[slot] = features(w);
        knnG[slot] = g;
        knnCount++;
        waves.remove(w);
    }

    /** Forgets the waves that have passed; the learned data is kept for the battle. */
    public void forget(Wave w) {
        waves.remove(w);
    }

    /** Drops every wave's cached distributions (a new round's waves are new objects). */
    public void initRound() {
        waves.clear();
    }

    double[][] members(Wave w) {
        double[][] d = waves.get(w);
        if (d != null) return d;
        int key = priorKey(w);
        d = new double[MEMBERS][];
        d[PRI] = PRIOR[key];
        d[ONL] = online[key] == null ? flat(1.0 / BINS) : normalise(online[key].clone());
        d[KNN] = knn(features(w));
        for (int m = 0; m < MEMBERS; m++) {
            double[] s = new double[BINS];
            for (int i = 0; i < BINS; i++) s[i] = 0.97 * d[m][i] + 0.03 / BINS;
            d[m] = s;
        }
        waves.put(w, d);
        return d;
    }

    private double[] bank(double[][] d) {
        double[] wt = new double[MEMBERS];
        double total = 0;
        for (int m = 0; m < MEMBERS; m++) { wt[m] = Math.exp(score[m]); total += wt[m]; }
        double[] b = new double[BINS];
        for (int m = 0; m < MEMBERS; m++) {
            for (int i = 0; i < BINS; i++) b[i] += wt[m] / total * d[m][i];
        }
        return b;
    }

    private double[] knn(double[] f) {
        int n = Math.min(knnCount, KNN_KEEP);
        if (n < 3) return flat(1.0 / BINS);
        int k = Math.min(KNN_K, n);
        double[] bestD = new double[k];
        int[] bestI = new int[k];
        java.util.Arrays.fill(bestD, Double.MAX_VALUE);
        for (int j = 0; j < n; j++) {
            double dd = 0;
            for (int q = 0; q < FEATURES; q++) { double x = f[q] - knnX[j][q]; dd += x * x; }
            if (dd < bestD[k - 1]) {
                int p = k - 1;
                while (p > 0 && bestD[p - 1] > dd) { bestD[p] = bestD[p - 1]; bestI[p] = bestI[p - 1]; p--; }
                bestD[p] = dd;
                bestI[p] = j;
            }
        }
        double[] h = new double[BINS];
        for (int p = 0; p < k; p++) {
            double[] kk = kernel((knnG[bestI[p]] + 1) / 2 * (BINS - 1), 2.0);
            double wgt = 1 / (bestD[p] + 0.02);
            for (int i = 0; i < BINS; i++) h[i] += wgt * kk[i];
        }
        return normalise(h);
    }

    /** The k-NN features of our state on wave {@code w}. */
    static double[] features(Wave w) {
        double lat = Math.abs(lateral(w));
        double flight = w.targetDistance / w.bulletSpeed();
        return new double[] {
            lat / 8,
            w.targetAccel / 2,
            flight / 80,
            wallBucket(w) / 2.0,
            Math.min(1.0, w.targetTicksSinceReversal / 60.0),
            Math.abs(w.targetVelocity) / 8,
        };
    }

    /** The prior's row for wave {@code w}: lateral speed, acceleration, flight time, wall room, time since reversal. */
    static int priorKey(Wave w) {
        int lat = Math.min(3, (int) (Math.abs(lateral(w)) / 2.5));
        int acc = w.targetAccel < -0.1 ? 0 : w.targetAccel > 0.1 ? 2 : 1;
        int ft = Math.min(3, (int) (w.targetDistance / w.bulletSpeed() / 15));
        int wall = wallBucket(w);
        long s = w.targetTicksSinceReversal;
        int sc = s < 10 ? 0 : s < 30 ? 1 : 2;
        return (((lat * 3 + acc) * 4 + ft) * 3 + wall) * 3 + sc;
    }

    private static int wallBucket(Wave w) {
        double room = w.targetWallDistance;
        return room < 0.4 ? 0 : room < 0.8 ? 1 : 2;
    }

    private static double lateral(Wave w) {
        return w.targetVelocity * Math.sin(w.targetHeading - w.absBearing);
    }

    /** The classic guess factor of firing angle {@code angle} on wave {@code w}, cut to [-1, 1]. */
    static double gf(Wave w, double angle) {
        double g = w.orbitDirection * Angles.normalRelativeAngle(angle - w.absBearing) / w.maxEscapeAngle();
        return Math.max(-1, Math.min(1, g));
    }

    private static double binCentre(int i) {
        return (double) i / (BINS - 1) * 2 - 1;
    }

    private static int bin(double g) {
        return (int) Math.round((g + 1) / 2 * (BINS - 1));
    }

    private static double[] kernel(double c, double width) {
        double[] p = new double[BINS];
        double s = 0;
        for (int i = 0; i < BINS; i++) { double z = (i - c) / width; p[i] = Math.exp(-0.5 * z * z); s += p[i]; }
        for (int i = 0; i < BINS; i++) p[i] /= s;
        return p;
    }

    private static double[] flat(double v) {
        double[] p = new double[BINS];
        java.util.Arrays.fill(p, v);
        return p;
    }

    private static double[] normalise(double[] h) {
        double s = 0;
        for (double x : h) s += x;
        for (int i = 0; i < h.length; i++) h[i] /= s;
        return h;
    }

    private static double[][] decodePrior() {
        String t = SurfBankPrior.TABLE;
        double[][] rows = new double[KEYS][BINS];
        for (int k = 0; k < KEYS; k++) {
            for (int i = 0; i < BINS; i++) rows[k][i] = SurfBankPrior.DIGITS.indexOf(t.charAt(k * BINS + i)) + 0.25;
            normalise(rows[k]);
        }
        return rows;
    }
}

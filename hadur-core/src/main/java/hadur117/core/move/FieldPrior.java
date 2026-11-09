package hadur117.core.move;

import hadur117.core.model.Wave;

/**
 * MOVE-35 (K1 step 3 of the road to king, docs/bench/gun-oracle.md): the field prior, a member
 * of the danger that knows how learning guns shoot before this one has shown us anything. It is
 * a table fitted offline on the oracle's bullets from many learning guns: for the state the enemy
 * aimed at (our lateral speed, acceleration, wall room ahead and the bullet's flight time, each
 * cut into a few bins) the share of their bullets that went to each guess factor. Against a new
 * opponent the views are empty for the first rounds and the surf drives on a head-on guess; the
 * prior puts the field's experience there from the first wave, and the rolling score weighs it
 * down once the views have learnt this gun.
 *
 * <p>On the oracle's 48 learning guns the rolling blend with the prior scores +0.44 bits against
 * +0.39 for views and aims alone, and the bullets from the third of the wave the model rated
 * safest fall from 7.7% to 6.8%; in the first three rounds from 8.2-9.2% to 6.0-7.4%.</p>
 *
 * <p>Pure: no engine types, no clock, no randomness, no state. Duel only, off unless the duel
 * turns it on.</p>
 */
public final class FieldPrior {

    /** The prior's standing weight against the views' 1 in {@link AimMembers}. */
    static final double WEIGHT = 2.0;
    /** The share of the flat (all cells) profile mixed into each cell's, so a thin cell is not spiky. */
    static final double SMOOTH = 0.1;
    /** A cell with fewer bullets than this reads as the flat profile. */
    static final int MIN_BULLETS = 20;

    private final double[][] profile;
    private final double[] centres;

    /** The shipped table ({@link FieldPriorData}). */
    public FieldPrior() {
        this(FieldPriorData.ROWS);
    }

    /** A table of {@code rows}, each a cell's comma-separated bin counts. */
    FieldPrior(String[] rows) {
        int bins = FieldPriorData.GF_BINS;
        double[] flat = new double[bins];
        double[][] counts = new double[rows.length][];
        for (int c = 0; c < rows.length; c++) {
            String[] p = rows[c].split(",");
            if (p.length != bins) throw new IllegalArgumentException("cell " + c + " has " + p.length + " bins");
            counts[c] = new double[bins];
            for (int b = 0; b < bins; b++) {
                counts[c][b] = Double.parseDouble(p[b].trim());
                flat[b] += counts[c][b];
            }
        }
        normalise(flat);
        profile = new double[rows.length][];
        for (int c = 0; c < rows.length; c++) {
            double total = 0;
            for (double v : counts[c]) total += v;
            double[] out = new double[bins];
            if (total < MIN_BULLETS) {
                System.arraycopy(flat, 0, out, 0, bins);
            } else {
                for (int b = 0; b < bins; b++) out[b] = (1 - SMOOTH) * counts[c][b] / total + SMOOTH * flat[b];
            }
            profile[c] = out;
        }
        centres = new double[bins];
        for (int b = 0; b < bins; b++) centres[b] = -1.0 + 2.0 * b / (bins - 1);
    }

    private static void normalise(double[] p) {
        double s = 0;
        for (double v : p) s += v;
        if (s > 0) for (int i = 0; i < p.length; i++) p[i] /= s;
    }

    /** The number of cells. */
    public int cells() {
        return profile.length;
    }

    /** The guess-factor bins. */
    public int bins() {
        return centres.length;
    }

    /** The guess factor at the centre of bin {@code b}. */
    public double centre(int b) {
        return centres[b];
    }

    /**
     * The oracle walks the orbit toward the wall in steps of this many escape angles and records
     * the first step outside the field; the wave's distance is walked in hundredths, so it is
     * rounded up to the same grid before binning, or a wall at 0.48 would read a different cell
     * here than in the table.
     */
    static final double WALL_STEP = 0.05;

    static int bin(double value, double[] edges) {
        int s = 0;
        while (s < edges.length && value >= edges[s]) s++;
        return s;
    }

    /**
     * The cell of the state wave {@code w} was aimed at: lateral speed, acceleration, wall room
     * in the orbit direction and flight time, the first index varying fastest.
     */
    public int cell(Wave w) {
        int lat = bin(Math.abs(w.lateralVelocity()), FieldPriorData.LAT);
        int accel = bin(w.targetAccel, FieldPriorData.ACCEL);
        int wall = bin(Math.ceil(w.targetWallDistance / WALL_STEP - 1e-9) * WALL_STEP, FieldPriorData.WALL);
        int flight = bin(w.targetDistance / w.bulletSpeed(), FieldPriorData.FLIGHT);
        int nLat = FieldPriorData.LAT.length + 1;
        int nAccel = FieldPriorData.ACCEL.length + 1;
        int nWall = FieldPriorData.WALL.length + 1;
        return lat + nLat * (accel + nAccel * (wall + nWall * flight));
    }

    /** The prior's probability of each guess-factor bin on wave {@code w}; sums to 1. */
    public double[] profile(Wave w) {
        return profile[cell(w)].clone();
    }
}

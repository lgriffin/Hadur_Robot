package hadur117.core.move;

import hadur117.core.model.Wave;

/**
 * MOVE-38 (K3 of the road to king, docs/bench/gun-oracle.md): an opponent's own prior, a member of
 * the danger that knows how this gun shot in recorded battles before it has shown us anything in
 * this one. It is a table fitted offline on the oracle's bullets of that opponent
 * ({@link OpponentPriorData}): for the state the enemy aimed at (our lateral speed, acceleration,
 * wall room ahead and the bullet's flight time, each cut into a few bins) the share of its bullets
 * that went to each guess factor. It stands in the blend at {@link #WEIGHT} against a view's 1,
 * and the rolling score weighs it as the other members. The field-wide table of the same shape
 * (MOVE-35) lost on the PC and on the wave forensic; this is the per-opponent form the oracle rated
 * at +0.555 bits, gated on real hits by round before any card.
 *
 * <p>Pure: no engine types, no clock, no randomness, no state. Duel only, off unless the duel
 * turns it on and knows the opponent.</p>
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

    /** A table of {@code rows}, each a cell's comma-separated bin counts ({@link OpponentPriorData#rows}). */
    public FieldPrior(String[] rows) {
        int bins = OpponentPriorData.GF_BINS;
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
        int lat = bin(Math.abs(w.lateralVelocity()), OpponentPriorData.LAT);
        int accel = bin(w.targetAccel, OpponentPriorData.ACCEL);
        int wall = bin(Math.ceil(w.targetWallDistance / WALL_STEP - 1e-9) * WALL_STEP, OpponentPriorData.WALL);
        int flight = bin(w.targetDistance / w.bulletSpeed(), OpponentPriorData.FLIGHT);
        int nLat = OpponentPriorData.LAT.length + 1;
        int nAccel = OpponentPriorData.ACCEL.length + 1;
        int nWall = OpponentPriorData.WALL.length + 1;
        return lat + nLat * (accel + nAccel * (wall + nWall * flight));
    }

    /** The prior's probability of each guess-factor bin on wave {@code w}; sums to 1. */
    public double[] profile(Wave w) {
        return profile[cell(w)].clone();
    }
}

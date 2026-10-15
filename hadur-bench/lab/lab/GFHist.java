package lab;

/**
 * Guess-factor histogram: 31 bins, segmented on lateral velocity (5 slices) by distance (3), each
 * bin a rolling average. Learns from every wave as it passes the enemy, hit or not.
 */
public class GFHist extends LabBase {
    static final int BINS = 31, LAT = 5, DIST = 3;
    static final double RATE = 0.1;
    static final double[][] HIST = new double[LAT * DIST][BINS];

    protected boolean usesWaves() { return true; }

    private int segment() {
        double l = Math.abs(eLateral);
        int lat = l < 1 ? 0 : l < 3 ? 1 : l < 5 ? 2 : l < 7 ? 3 : 4;
        int dist = eDistance < 350 ? 0 : eDistance < 500 ? 1 : 2;
        return lat * DIST + dist;
    }

    protected Object snapshot() { return Integer.valueOf(segment()); }

    protected void waveBroke(Wave w, double gf) {
        double[] h = HIST[((Integer) w.info).intValue()];
        int bin = bin(gf);
        for (int i = 0; i < BINS; i++) {
            double d = i - bin;
            h[i] = (1 - RATE) * h[i] + RATE * Math.exp(-d * d / 2);
        }
    }

    static int bin(double gf) {
        return (int) Math.max(0, Math.min(BINS - 1, Math.round((gf + 1) / 2 * (BINS - 1))));
    }

    protected double aim() {
        double[] h = HIST[segment()];
        int best = BINS / 2;
        for (int i = 0; i < BINS; i++) if (h[i] > h[best] + 1e-12) best = i;
        return aimAt(best * 2.0 / (BINS - 1) - 1);
    }
}

package lab;

/**
 * Guess factor by k nearest neighbours (k = 25). Features: lateral velocity, advancing velocity,
 * distance, acceleration, time since the lateral direction changed, distance to the wall ahead.
 * A wave is logged every tick, firing or not; the aim is the densest guess factor among the
 * neighbours under a Gaussian kernel.
 */
public class Knn extends LabBase {
    static final int K = 25, F = 6, CAP = 40000;
    static final double[] WEIGHT = {2, 1, 2, 1, 1, 1};
    static final double BANDWIDTH = 0.1;
    static final double[] FEATURES = new double[CAP * F];
    static final double[] GFS = new double[CAP];
    static int size, next;

    protected boolean usesWaves() { return true; }

    protected boolean waveEveryTick() { return true; }

    private double[] features() {
        double ahead = eVelocity >= 0 ? eHeading : eHeading + Math.PI;
        double sx = Math.sin(ahead), cy = Math.cos(ahead), t = Double.MAX_VALUE;
        if (sx > 1e-9) t = Math.min(t, (fw - eX) / sx); else if (sx < -1e-9) t = Math.min(t, -eX / sx);
        if (cy > 1e-9) t = Math.min(t, (fh - eY) / cy); else if (cy < -1e-9) t = Math.min(t, -eY / cy);
        return new double[] {
            Math.abs(eLateral) / 8,
            (eAdvancing + 8) / 16,
            Math.min(eDistance, 900) / 900,
            (eAccel + 2) / 3,
            Math.min(sinceDirChange, 60) / 60.0,
            Math.min(t, 400) / 400,
        };
    }

    protected Object snapshot() { return features(); }

    protected void waveBroke(Wave w, double gf) {
        double[] f = (double[]) w.info;
        System.arraycopy(f, 0, FEATURES, next * F, F);
        GFS[next] = gf;
        next = (next + 1) % CAP;
        if (size < CAP) size++;
    }

    protected double aim() {
        if (size == 0) return absBearing;
        double[] q = features();
        int k = Math.min(K, size);
        int[] idx = new int[k];
        double[] dist = new double[k];
        int n = 0;
        for (int i = 0; i < size; i++) {
            double d = 0;
            for (int j = 0; j < F; j++) {
                double x = FEATURES[i * F + j] - q[j];
                d += WEIGHT[j] * x * x;
            }
            if (n < k) {
                int p = n++;
                while (p > 0 && dist[p - 1] > d) { dist[p] = dist[p - 1]; idx[p] = idx[p - 1]; p--; }
                dist[p] = d;
                idx[p] = i;
            } else if (d < dist[k - 1]) {
                int p = k - 1;
                while (p > 0 && dist[p - 1] > d) { dist[p] = dist[p - 1]; idx[p] = idx[p - 1]; p--; }
                dist[p] = d;
                idx[p] = i;
            }
        }
        double bestGf = 0, bestDensity = -1;
        for (int a = 0; a < n; a++) {
            double ga = GFS[idx[a]], density = 0;
            for (int b = 0; b < n; b++) {
                double z = (GFS[idx[b]] - ga) / BANDWIDTH;
                density += Math.exp(-z * z / 2);
            }
            if (density > bestDensity) { bestDensity = density; bestGf = ga; }
        }
        return aimAt(bestGf);
    }
}

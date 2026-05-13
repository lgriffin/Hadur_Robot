package hadur117.movement.danger;

import hadur117.movement.EnemyWave;

public class GFDangerModel implements DangerModel {

    static final int BINS = 47;
    static final int CENTER_BIN = 23;
    private static final double DECAY = 0.95;
    private static final double CENTER_INIT = 0.001;

    private static double[][][][][] stats = new double[3][3][3][2][BINS];
    private double avgDanger = 0.2;
    private int hitCount = 0;

    static {
        initCenterBins();
    }

    private static void initCenterBins() {
        for (int d = 0; d < 3; d++)
            for (int v = 0; v < 3; v++)
                for (int a = 0; a < 3; a++)
                    for (int w = 0; w < 2; w++)
                        stats[d][v][a][w][CENTER_BIN] = CENTER_INIT;
    }

    @Override
    public double danger(EnemyWave wave, int bin) {
        double[] s = stats[wave.distSeg][wave.velSeg][wave.accelSeg][wave.wallSeg];
        return smoothDanger(s, bin);
    }

    @Override
    public void logHit(EnemyWave wave, int bin) {
        double[] s = stats[wave.distSeg][wave.velSeg][wave.accelSeg][wave.wallSeg];
        int clamped = clampBin(bin);
        s[clamped] += 1.0;
        if (clamped > 0) s[clamped - 1] += 0.5;
        if (clamped < BINS - 1) s[clamped + 1] += 0.5;

        double dangerAtHit = smoothDanger(s, clamped);
        hitCount++;
        avgDanger = avgDanger * 0.95 + dangerAtHit * 0.05;
    }

    @Override
    public void decay(EnemyWave wave) {
        double[] s = stats[wave.distSeg][wave.velSeg][wave.accelSeg][wave.wallSeg];
        for (int i = 0; i < BINS; i++) s[i] *= DECAY;
    }

    @Override
    public double getWeight() {
        return Math.pow(Math.max(0.001, avgDanger), 3);
    }

    @Override
    public String name() {
        return "GF";
    }

    public static double[][][][][] getStats() {
        return stats;
    }

    static double smoothDanger(double[] s, int bin) {
        int b = clampBin(bin);
        double val = s[b];
        if (b > 0) val += s[b - 1] * 0.5;
        if (b < BINS - 1) val += s[b + 1] * 0.5;
        return val;
    }

    static int clampBin(int bin) {
        return Math.max(0, Math.min(BINS - 1, bin));
    }
}

package hadur117.movement.danger;

import hadur117.movement.EnemyWave;

public class KNNDangerModel implements DangerModel {

    private static final int BINS = 47;
    private static final int CENTER_BIN = 23;
    private static final int BUFFER_SIZE = 500;
    private static final int DIMENSIONS = 7;
    private static final int MIN_DATA = 10;
    private static final double[] WEIGHTS = {2, 3, 2, 3, 2, 2, 2};

    private static final double[][] features = new double[BUFFER_SIZE][DIMENSIONS];
    private static final int[] hitBins = new int[BUFFER_SIZE];
    private static int size = 0;
    private static int index = 0;

    private double avgDanger = 0.1;
    private int hitCount = 0;

    @Override
    public double danger(EnemyWave wave, int bin) {
        if (size < MIN_DATA || wave.dangerFeatures == null) {
            return 0.01;
        }
        double[] gfDist = queryDistribution(wave.dangerFeatures);
        int b = Math.max(0, Math.min(BINS - 1, bin));
        return gfDist[b];
    }

    @Override
    public void logHit(EnemyWave wave, int bin) {
        if (wave.dangerFeatures != null) {
            int clamped = Math.max(0, Math.min(BINS - 1, bin));
            System.arraycopy(wave.dangerFeatures, 0, features[index], 0,
                    Math.min(wave.dangerFeatures.length, DIMENSIONS));
            hitBins[index] = clamped;
            index = (index + 1) % BUFFER_SIZE;
            if (size < BUFFER_SIZE) size++;
        }

        double dangerAtHit = danger(wave, bin);
        hitCount++;
        avgDanger = avgDanger * 0.95 + dangerAtHit * 0.05;
    }

    @Override
    public void decay(EnemyWave wave) {
        // KNN doesn't decay — recency handled by buffer overwrite
    }

    @Override
    public double getWeight() {
        if (size < MIN_DATA) return 0.0001;
        return Math.pow(Math.max(0.001, avgDanger), 3);
    }

    @Override
    public String name() {
        return "KNN";
    }

    private double[] queryDistribution(double[] query) {
        int k = Math.max(5, (int) Math.sqrt(size));
        double[] distances = new double[size];
        int[] indices = new int[size];

        int n = Math.min(size, BUFFER_SIZE);
        for (int i = 0; i < n; i++) {
            double dist = 0;
            for (int j = 0; j < DIMENSIONS && j < query.length; j++) {
                double d = (query[j] - features[i][j]) * WEIGHTS[j];
                dist += d * d;
            }
            distances[i] = dist;
            indices[i] = i;
        }

        partialSort(distances, indices, n, k);

        double[] gfDist = new double[BINS];
        for (int i = 0; i < k && i < n; i++) {
            double w = 1.0 / (Math.sqrt(distances[i]) + 0.001);
            int b = hitBins[indices[i]];
            gfDist[b] += w;
            if (b > 0) gfDist[b - 1] += w * 0.5;
            if (b < BINS - 1) gfDist[b + 1] += w * 0.5;
        }
        return gfDist;
    }

    private void partialSort(double[] dist, int[] idx, int n, int k) {
        for (int i = 0; i < k && i < n; i++) {
            int minJ = i;
            for (int j = i + 1; j < n; j++) {
                if (dist[j] < dist[minJ]) minJ = j;
            }
            if (minJ != i) {
                double td = dist[i]; dist[i] = dist[minJ]; dist[minJ] = td;
                int ti = idx[i]; idx[i] = idx[minJ]; idx[minJ] = ti;
            }
        }
    }

    public static int getSize() { return size; }
}

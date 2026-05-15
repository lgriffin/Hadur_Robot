package hadur117.utils;

public abstract class DistanceFormula {
    public double[] weights;

    public abstract double[] dataPointFromWave(Wave w, boolean aiming);

    public double[] dataPointFromWave(Wave w) {
        return dataPointFromWave(w, false);
    }
}

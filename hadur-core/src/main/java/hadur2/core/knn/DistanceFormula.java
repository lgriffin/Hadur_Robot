package hadur2.core.knn;

import hadur2.core.model.*;
import hadur2.core.physics.*;
import hadur2.core.knn.*;

public abstract class DistanceFormula {
    public double[] weights;

    public abstract double[] dataPointFromWave(Wave w, boolean aiming);

    public double[] dataPointFromWave(Wave w) {
        return dataPointFromWave(w, false);
    }
}

package hadur117.move;

import hadur117.utils.DistanceFormula;
import hadur117.utils.Wave;

public class SimpleFormula extends DistanceFormula {

    public SimpleFormula() {
        this.weights = new double[]{1, 1, 1};
    }

    @Override
    public double[] dataPointFromWave(Wave w, boolean aiming) {
        return new double[]{
            Math.min(91.0, w.targetDistance / w.bulletSpeed()) / 91.0,
            (w.lateralVelocity() + 0.1) / 8.1,
            (w.targetAccel / (w.targetAccel < 0 ? 2.0 : 1.0) + 1.0) / 2.0
        };
    }
}

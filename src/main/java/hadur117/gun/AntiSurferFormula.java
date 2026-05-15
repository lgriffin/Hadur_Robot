package hadur117.gun;

import hadur117.utils.DistanceFormula;
import hadur117.utils.Wave;

public class AntiSurferFormula extends DistanceFormula {

    public AntiSurferFormula() {
        this.weights = new double[]{3, 4, 3, 2, 2, 4, 2, 3, 1};
    }

    @Override
    public double[] dataPointFromWave(Wave w, boolean aiming) {
        return new double[]{
            Math.min(91.0, w.targetDistance / w.bulletSpeed()) / 91.0,
            ((double) w.targetVelocitySign * w.targetVelocity + 0.1) / 8.1,
            Math.sin(w.targetRelativeHeading),
            (Math.cos(w.targetRelativeHeading) + 1.0) / 2.0,
            (w.targetAccel / (w.targetAccel < 0 ? 2.0 : 1.0) + 1.0) / 2.0,
            Math.min(1.0, w.targetWallDistance),
            Math.min(1.0, w.targetRevWallDistance),
            Math.min(1.0, (double) w.targetVchangeTime / (w.targetDistance / w.bulletSpeed())),
            aiming ? 0.0 : w.virtuality()
        };
    }
}

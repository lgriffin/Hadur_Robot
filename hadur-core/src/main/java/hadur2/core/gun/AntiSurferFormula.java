package hadur2.core.gun;

import hadur2.core.model.*;
import hadur2.core.physics.*;
import hadur2.core.knn.*;
import hadur2.core.gun.*;
import hadur2.core.move.*;


/**
 * The anti-surfer views' feature space: the first nine features of {@link GunFormula},
 * computed the same way, without the melee crowd feature. The weights match the main
 * gun's except virtuality, which counts half as much (1 against 2).
 *
 * <p>A gun seed sample's first nine values are this point, which is why
 * {@link GunController#seed} can hand the same sample to every gun view.</p>
 */
public class AntiSurferFormula extends DistanceFormula {

    /** The anti-surfer formula, with its nine weights. */
    public AntiSurferFormula() {
        this.weights = new double[]{3, 4, 3, 2, 2, 4, 2, 3, 1};
    }

    /** {@inheritDoc} See {@link GunFormula} for what each value means. */
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

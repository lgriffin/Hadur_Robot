package hadur2.core.move;

import hadur2.core.model.*;
import hadur2.core.physics.*;
import hadur2.core.knn.*;
import hadur2.core.gun.*;
import hadur2.core.move.*;


/**
 * The flattener's feature space: {@link MoveFormula}'s nine attributes of our movement
 * when an enemy wave was fired, plus our displacement over the last 20 and 40 ticks, with
 * its own weights.
 *
 * <p>A flattener view logs where we were when every enemy wave broke, not only the waves
 * that hit us, so its danger is high wherever we tend to be when waves break: surfing
 * away from it spreads our visits out, leaving a gun that learns them no peak to aim at. The two longer displacement dimensions
 * let it tell apart movements that look the same over 8 ticks. {@link MoveController}
 * builds the "flattener" and "flattener2" views on it; they are the views ADAPT-2 and
 * MOVE-2 turn on.</p>
 *
 * <p>It is also the layout of a stored surf sample: {@link MoveController#logBulletHit}
 * writes this formula's eleven values as the first eleven of a
 * {@link MoveController#SAMPLE_WIDTH}-value sample, so a seeded sample can be cut to the
 * first nine for {@link MoveFormula} views (ADAPT-3). The {@link #weights} are tuning
 * values, not derived.</p>
 */
public class FlattenerFormula extends DistanceFormula {

    /** Sets the eleven dimension weights. */
    public FlattenerFormula() {
        this.weights = new double[]{3, 4, 3, 5, 1, 4, 3, 3, 2, 2, 2};
    }

    /**
     * The eleven-value point for enemy wave {@code w}: {@link MoveFormula}'s nine, scaled
     * the same way (see the comments there), then the 20- and 40-tick displacements.
     *
     * @param w an enemy wave, fired at us
     * @param aiming unused: the surf uses the same point whether it is logging or searching
     * @return a new array of eleven values
     */
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
            w.targetDl8t / 64.0,
            // Displacement over 20 and 40 ticks, each over the most a robot covers at 8 px/tick.
            w.targetDl20t / 160.0,
            w.targetDl40t / 320.0
        };
    }
}

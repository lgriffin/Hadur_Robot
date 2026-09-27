package hadur2.core.move;

import hadur2.core.model.*;
import hadur2.core.physics.*;
import hadur2.core.knn.*;
import hadur2.core.gun.*;
import hadur2.core.move.*;


/**
 * The simplest danger space: bullet flight time, lateral velocity and acceleration, equally
 * weighted.
 *
 * <p>{@link MoveController}'s "simple" view is built on it. That view has no hit-rate
 * thresholds, so it is the one view a stranger's surf starts with (DIAL-1); every other
 * view waits until the enemy's hit rate on us clears its threshold. A stored surf sample keeps this formula's lateral-velocity value in
 * its own slot (index 11 of {@link MoveController#SAMPLE_WIDTH}), because it is not one of
 * {@link FlattenerFormula}'s dimensions.</p>
 */
public class SimpleFormula extends DistanceFormula {

    /** Sets the three dimension weights, all 1. */
    public SimpleFormula() {
        this.weights = new double[]{1, 1, 1};
    }

    /**
     * The three-value point for enemy wave {@code w}, each value in about [0, 1].
     *
     * @param w an enemy wave, fired at us
     * @param aiming unused: the surf uses the same point whether it is logging or searching
     * @return a new array of three values
     */
    @Override
    public double[] dataPointFromWave(Wave w, boolean aiming) {
        return new double[]{
            // Bullet flight time in ticks, capped at 91 and scaled to [0, 1].
            Math.min(91.0, w.targetDistance / w.bulletSpeed()) / 91.0,
            // Our speed across the line of fire, 0 to 8 px/tick (the orbit direction carries
            // the side, so this is never negative), shifted and scaled as in MoveFormula.
            (w.lateralVelocity() + 0.1) / 8.1,
            // Acceleration, braking halved into [-1, 1], mapped to [0, 1] (as in MoveFormula).
            (w.targetAccel / (w.targetAccel < 0 ? 2.0 : 1.0) + 1.0) / 2.0
        };
    }
}

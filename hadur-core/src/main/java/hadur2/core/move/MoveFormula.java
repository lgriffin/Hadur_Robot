package hadur2.core.move;

import hadur2.core.model.*;
import hadur2.core.physics.*;
import hadur2.core.knn.*;
import hadur2.core.gun.*;
import hadur2.core.move.*;


/**
 * The surf's main feature space: nine attributes of our own movement when an enemy wave was
 * fired, each scaled to about [0, 1], that the danger views' KD-trees search for the
 * enemy's past firing situations most like the one being surfed.
 *
 * <p>The wave passed in is an enemy wave (source: the enemy; target: us), so every
 * {@code target*} field describes Hadur as the enemy saw it on the fire tick. The
 * {@link #weights} multiply each dimension's difference in the KD-tree's distance, so
 * they say how much a mismatch in each attribute counts; they are tuning values, not
 * derived. {@link MoveController} builds the "normal", "recent" and "lightFlattener" views
 * on this formula. Its dimensions are the first nine of {@link FlattenerFormula}'s, which
 * is what lets a stored surf sample ({@link MoveController#SAMPLE_WIDTH}) be cut down to
 * either space (ADAPT-3).</p>
 *
 * <p>Dimensions, in order: bullet flight time, speed, lateral and advancing components of
 * our heading relative to the shooter, acceleration, room to the wall ahead and behind on
 * the orbit, time since our velocity last changed (relative to the flight time), and how
 * far we moved in the last 8 ticks.</p>
 */
public class MoveFormula extends DistanceFormula {

    /** Sets the nine dimension weights. */
    public MoveFormula() {
        this.weights = new double[]{4, 3, 3, 3, 2, 4, 1, 3, 2};
    }

    /**
     * The nine-value point for enemy wave {@code w}. Every value is scaled to about [0, 1].
     *
     * @param w an enemy wave, fired at us
     * @param aiming unused: the surf uses the same point whether it is logging or searching
     * @return a new array of nine values
     */
    @Override
    public double[] dataPointFromWave(Wave w, boolean aiming) {
        return new double[]{
            // Bullet flight time in ticks (distance / speed), capped at 91 and scaled to [0, 1].
            Math.min(91.0, w.targetDistance / w.bulletSpeed()) / 91.0,
            // Speed: the sign is the last direction of travel, so the product is |velocity|,
            // 0 to 8 px/tick, shifted by 0.1 and over 8.1: a stop reads about 0.01, full speed 1.
            ((double) w.targetVelocitySign * w.targetVelocity + 0.1) / 8.1,
            // Relative heading is |effective heading - bearing from the shooter|, in [0, pi]:
            // sin is the share of our motion across the line of fire (1 = orbiting)...
            Math.sin(w.targetRelativeHeading),
            // ...and (cos + 1) / 2 the share along it: 1 moving straight away, 0 straight in.
            (Math.cos(w.targetRelativeHeading) + 1.0) / 2.0,
            // Acceleration: Robocode accelerates by at most 1 and brakes by at most 2 px/tick,
            // so braking is halved to put both in [-1, 1], then mapped to [0, 1].
            (w.targetAccel / (w.targetAccel < 0 ? 2.0 : 1.0) + 1.0) / 2.0,
            // The share of the escape angle we could cover orbiting forward before a wall
            // (capped at 1: no wall within it), then the same orbiting backward.
            Math.min(1.0, w.targetWallDistance),
            Math.min(1.0, w.targetRevWallDistance),
            // Ticks since our velocity last changed by more than 0.5, as a share of the
            // bullet's flight time, capped at 1.
            Math.min(1.0, (double) w.targetVchangeTime / (w.targetDistance / w.bulletSpeed())),
            // Displacement over the last 8 ticks, over the 64 px a full-speed robot covers.
            w.targetDl8t / 64.0
        };
    }
}

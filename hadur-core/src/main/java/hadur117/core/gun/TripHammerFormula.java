package hadur117.core.gun;

import hadur117.core.model.*;
import hadur117.core.physics.*;
import hadur117.core.knn.*;


/**
 * GUN-8: the TripHammer gun's feature space, a port of Diamond 1.8.22's
 * {@code TripHammerFormula}, the view Diamond fires in a duel. Ten features, each scaled to
 * about [0, 1], read from the {@link Wave}:
 *
 * <ol start="0">
 * <li>Bullet power, capped at 3, over 3.</li>
 * <li>Flight time (distance over bullet speed), capped at 91 ticks, over 91.</li>
 * <li>Signed speed: the target's speed in its direction of travel, plus 0.1, over 8.1.</li>
 * <li>The sine of its heading relative to the line from us.</li>
 * <li>The cosine of that heading, mapped to [0, 1].</li>
 * <li>Acceleration, mapped by {@code (a + 2) / 3}: braking by 2 gives 0, accelerating by 1
 *     gives 1 (the main gun halves braking instead).</li>
 * <li>Wall ahead, capped at 1.25.</li>
 * <li>Wall behind, capped at 1.15.</li>
 * <li>Time since its speed last changed by more than 0.5, over the flight time, capped at 1.</li>
 * <li>Virtuality (0 for a query, as in {@link GunFormula}).</li>
 * </ol>
 *
 * <p>The weights below are Diamond's starting weights; the gun slides them to the final ones as
 * its view grows (see {@link TripHammerGun#weightsFor}).</p>
 */
public class TripHammerFormula extends DistanceFormula {

    /** The starting weights: Diamond's {@code TripHammerFormula} constructor's. */
    public TripHammerFormula() {
        this.weights = new double[]{0.34, 10.0, 3.13, 2.58, 8.38, 7.91, 8.67, 5.12, 2.34, 0.38};
    }

    @Override
    public double[] dataPointFromWave(Wave w, boolean aiming) {
        return new double[]{
            Math.min(3.0, w.bulletPower()) / 3.0,
            Math.min(91.0, w.targetDistance / w.bulletSpeed()) / 91.0,
            ((double) w.targetVelocitySign * w.targetVelocity + 0.1) / 8.1,
            Math.sin(w.targetRelativeHeading),
            (Math.cos(w.targetRelativeHeading) + 1.0) / 2.0,
            (w.targetAccel + Rules.DECELERATION) / (Rules.DECELERATION + Rules.ACCELERATION),
            Math.min(1.25, w.targetWallDistance),
            Math.min(1.15, w.targetRevWallDistance),
            Math.min(1.0, (double) w.targetVchangeTime / (w.targetDistance / w.bulletSpeed())),
            aiming ? 0.0 : w.virtuality()
        };
    }
}

package hadur2.core.gun;

import hadur2.core.model.*;
import hadur2.core.physics.*;
import hadur2.core.knn.*;
import hadur2.core.gun.*;
import hadur2.core.move.*;


/**
 * The main gun's feature space: ten features of the target's situation when a gun wave
 * was fired, each scaled to about [0, 1].
 *
 * <p>The features, in order (weights in brackets), all read from the {@link Wave}, whose
 * target is the enemy and whose source is us:</p>
 * <ol start="0">
 * <li>Bullet flight time: distance over bullet speed, in ticks, capped at 91 and divided
 *     by 91 [3].</li>
 * <li>Speed: the target's speed in px/tick (0 to 8) plus 0.1, over 8.1 [4].</li>
 * <li>Lateral share of its heading: the sine of its heading relative to the line from us,
 *     0 moving straight toward or away, 1 moving square across [3].</li>
 * <li>Advancing or retreating: that angle's cosine, mapped to [0, 1]; 1 is straight away
 *     from us, 0 straight at us [2].</li>
 * <li>Acceleration: speed change in px/tick per tick. Robocode accelerates by 1 and
 *     brakes by 2, so braking is halved to put both in [-1, 1], then mapped to [0, 1] [2].</li>
 * <li>Wall ahead: how far the target could orbit us in its direction of travel, at its
 *     present distance, before leaving the field, as a fraction of the maximum escape
 *     angle, capped at 1 [4].</li>
 * <li>Wall behind: the same against its direction of travel [2].</li>
 * <li>Time since its speed last changed by more than 0.5, over the flight time, capped at
 *     1 [3].</li>
 * <li>Virtuality: 0 for a wave that carried a real bullet (and for an aiming query); for a
 *     virtual wave, the ticks since our last real bullet or until the gun is next cool,
 *     whichever is fewer, over 8 (capped at 1 only before our first shot). Waves fired
 *     close to a real bullet so look most like one [2].</li>
 * <li>Crowd: the square root of (opponents alive - 1) / (opponents at the start - 1), so 1
 *     at a melee's start and 0 with one left; always 0 in a duel [2].</li>
 * </ol>
 *
 * <p>The first ten values of a gun seed sample are this point
 * ({@link GunController#SAMPLE_WIDTH}); {@link AntiSurferFormula} uses the first nine.</p>
 */
public class GunFormula extends DistanceFormula {

    /** The opponents at the start of the battle, for the crowd feature. */
    private final int enemiesTotal;

    /**
     * The main gun's formula.
     *
     * @param enemiesTotal the opponents at the start of the battle
     */
    public GunFormula(int enemiesTotal) {
        this.enemiesTotal = enemiesTotal;
        this.weights = new double[]{3, 4, 3, 2, 2, 4, 2, 3, 2, 2};
    }

    @Override
    public double[] dataPointFromWave(Wave w, boolean aiming) {
        return new double[]{
            Math.min(91.0, w.targetDistance / w.bulletSpeed()) / 91.0,
            // The sign is the target's last non-zero direction, so this is its speed.
            ((double) w.targetVelocitySign * w.targetVelocity + 0.1) / 8.1,
            // targetRelativeHeading is in [0, pi], so the sine is in [0, 1].
            Math.sin(w.targetRelativeHeading),
            (Math.cos(w.targetRelativeHeading) + 1.0) / 2.0,
            (w.targetAccel / (w.targetAccel < 0 ? 2.0 : 1.0) + 1.0) / 2.0,
            Math.min(1.0, w.targetWallDistance),
            Math.min(1.0, w.targetRevWallDistance),
            Math.min(1.0, (double) w.targetVchangeTime / (w.targetDistance / w.bulletSpeed())),
            // A query is always for a real shot, so it sits among the real bullets.
            aiming ? 0.0 : w.virtuality(),
            // (alive - 1) / (total - 1); the max keeps a duel's denominator at 1.
            Math.sqrt((double) (w.enemiesAlive - 1) / Math.max(enemiesTotal - 1, 1))
        };
    }
}

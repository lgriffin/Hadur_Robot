package hadur2.core.gun;

import hadur2.core.model.*;
import hadur2.core.physics.*;
import hadur2.core.knn.*;
import hadur2.core.gun.*;
import hadur2.core.move.*;


/**
 * The anti-surfer views' feature space: the first nine features of {@link GunFormula},
 * computed the same way, without the melee crowd feature, plus three GUN-2 features aimed
 * squarely at a wave surfer: ticks since its last velocity reversal, its 20-tick
 * displacement and its orbit-direction changes over the last 40 ticks. The weights match the
 * main gun's for the first nine, except virtuality, which counts half as much (1 against 2);
 * the three new features start at a modest weight (2 each), between the main features and
 * virtuality.
 *
 * <p>A gun seed sample's first nine values are the first nine of this point, which is why
 * {@link GunController#seed} can still hand an old (pre-R3) seed sample to this view: the
 * three new features have no data in a sample recorded before GUN-2 and are seeded at
 * {@link #NEUTRAL_NEW_FEATURE} instead of guessed (see {@code GunController.seed}).</p>
 */
public class AntiSurferFormula extends DistanceFormula {

    /** How many of this formula's features a pre-R3 gun seed sample can supply. */
    public static final int LEGACY_FEATURES = 9;
    /** GUN-2: the value a legacy seed sample gives the three new features, the middle of [0, 1]. */
    public static final double NEUTRAL_NEW_FEATURE = 0.5;
    /** GUN-2: ticks-since-reversal and the 40-tick orbit-change count are capped over this many. */
    private static final double MAX_ORBIT_CHANGES = 8.0;
    /** GUN-2: the 20-tick displacement is capped over roughly the most a robot can cover in 20 ticks. */
    private static final double MAX_DL20 = 160.0;

    /** The anti-surfer formula, with its twelve weights. */
    public AntiSurferFormula() {
        this.weights = new double[]{3, 4, 3, 2, 2, 4, 2, 3, 1, 2, 2, 2};
    }

    /** {@inheritDoc} See {@link GunFormula} for what the first nine values mean. */
    @Override
    public double[] dataPointFromWave(Wave w, boolean aiming) {
        double flightTime = w.targetDistance / w.bulletSpeed();
        return new double[]{
            Math.min(91.0, flightTime) / 91.0,
            ((double) w.targetVelocitySign * w.targetVelocity + 0.1) / 8.1,
            Math.sin(w.targetRelativeHeading),
            (Math.cos(w.targetRelativeHeading) + 1.0) / 2.0,
            (w.targetAccel / (w.targetAccel < 0 ? 2.0 : 1.0) + 1.0) / 2.0,
            Math.min(1.0, w.targetWallDistance),
            Math.min(1.0, w.targetRevWallDistance),
            Math.min(1.0, (double) w.targetVchangeTime / flightTime),
            aiming ? 0.0 : w.virtuality(),
            // GUN-2: ticks since the target's velocity last reversed sign, over the flight
            // time, capped at 1 - the same scaling targetVchangeTime uses above.
            Math.min(1.0, (double) w.targetTicksSinceReversal / flightTime),
            // GUN-2: how far the target has moved over the last 20 ticks, capped at 1.
            Math.min(1.0, w.targetDl20t / MAX_DL20),
            // GUN-2: how often the target's orbit direction flipped over the last 40 ticks,
            // capped at 1; a surfer that keeps reversing which way it orbits scores high.
            Math.min(1.0, w.targetOrbitChanges40 / MAX_ORBIT_CHANGES)
        };
    }
}

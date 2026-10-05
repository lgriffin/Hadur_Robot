package hadur2.core.move;

import hadur2.core.model.Wave;
import hadur2.core.physics.DiaUtils;

/**
 * MOVE-8: where our current plan puts us on one enemy wave, as the firing angles that would
 * hit us there. It is what the surf already scores, published read-only for the duel's gun:
 * the wave, the absolute bearing interval from the wave's source {@code [low, high]} (the
 * precise intersection of the plan's arrival states, {@code angle +/- bandwidth}), and the
 * surf's own estimate of the chance a bullet fired inside that interval is a hit.
 *
 * <p>The interval is in radians, as {@link BulletShadows}' are: Robocode's compass, not
 * wrapped, so {@code low <= high} and {@code high - low} is its width. The bearing from the
 * source to the plan's arrival position lies inside it (the intersection is taken over the
 * states the wave crosses us in, which include the arrival). Instances are immutable.</p>
 */
public final class PlanInterval {

    /** The enemy wave in the air; the gun reads its source, power and shadows. */
    public final Wave wave;
    /** The interval's low end, absolute radians from the wave's source. */
    public final double low;
    /** The interval's high end, absolute radians from the wave's source; never below {@link #low}. */
    public final double high;
    /**
     * The surf's chance that a bullet fired inside the interval hits us, in [0, 1]: its views'
     * score at the plan plus the enemy's hit rate, as {@code SurfMover} adds them before the
     * bullet's damage, and cut to 1.
     */
    public final double danger;

    /**
     * A published plan interval.
     *
     * @param wave the enemy wave
     * @param low the low end, radians
     * @param high the high end, radians (raised to {@code low} when below it)
     * @param danger the chance a bullet fired inside hits us, cut to [0, 1]
     */
    public PlanInterval(Wave wave, double low, double high, double danger) {
        this.wave = wave;
        this.low = low;
        this.high = Math.max(low, high);
        // !(x > 0) also catches NaN.
        this.danger = !(danger > 0) ? 0 : Math.min(1.0, danger);
    }

    /**
     * The interval of an intersection.
     *
     * @param wave the enemy wave
     * @param intersection the firing angles that would hit us at the plan's arrival
     * @param danger the chance a bullet fired inside hits us
     * @return the interval {@code angle +/- bandwidth}
     */
    public static PlanInterval of(Wave wave, Wave.Intersection intersection, double danger) {
        return new PlanInterval(wave, intersection.angle - intersection.bandwidth,
            intersection.angle + intersection.bandwidth, danger);
    }

    /** The interval's width, in radians. */
    public double width() {
        return high - low;
    }

    /**
     * Whether {@code angle} is inside the interval, going the short way round the circle.
     *
     * @param angle an absolute bearing from the source, radians
     * @return true when it lies in {@code [low, high]}
     */
    public boolean contains(double angle) {
        double a = DiaUtils.normalizeAngle(angle, (low + high) / 2);
        return a >= low && a <= high;
    }
}

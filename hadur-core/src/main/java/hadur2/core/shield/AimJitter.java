package hadur2.core.shield;

/**
 * SHIELD-2: an aim offset a bullet shielder can't predict, small enough to stay on its body.
 *
 * <p>A shielder predicts our bullet's heading from where the two robots stood when we fired
 * (head-on, or head-on plus an offset it learns). Moving the aim by a different amount each
 * shot defeats that: meeting a bullet head-on leaves it almost no room for error. The offset
 * is at most {@link #MAX_FRACTION} of the target's angular half-width and at least
 * {@link #MIN_FRACTION} of that maximum, so a still target is always hit and no shot goes
 * out with a near-zero offset. Offsets follow the golden-ratio sequence, which spreads them
 * evenly over the range without any randomness (RES-6, CORE-2).</p>
 *
 * <p>The offset stays the same from aiming until the shot goes out: the gun only fires once
 * it has turned to the aim, so a new offset every tick would keep it from ever settling.</p>
 *
 * <p>{@code HadurCore} adds {@link #offset} to the gun's aim on every duel tick once
 * {@link ShieldDetector#shielded()} holds, and calls {@link #shotFired()} when a shot aimed
 * with it goes out. The offset is in radians, positive clockwise like every Robocode
 * bearing.</p>
 */
public final class AimJitter {

    /**
     * SHIELD-2's upper bound: the largest offset is half the target's angular half-width, so
     * even the largest keeps the bullet well inside a still target's body.
     */
    public static final double MAX_FRACTION = 0.5;
    /**
     * The smallest offset as a share of the largest: 0.3 x 0.5 gives SHIELD-2's lower bound
     * of 15% of the half-width, far outside the shielder's 1e-5 rad tolerance.
     */
    public static final double MIN_FRACTION = 0.3;
    /**
     * The golden ratio's fractional part, (sqrt(5) - 1) / 2. Adding it modulo 1 gives a
     * low-discrepancy sequence: every run of shots covers [0, 1) about evenly, and no
     * pattern repeats for a shielder to learn.
     */
    private static final double GOLDEN = 0.6180339887498949;
    /** Half a robot's 36 px body. */
    private static final double BODY_HALF_WIDTH = 18;

    /** Position in the golden-ratio sequence, in [0, 1); the same start in every core (CORE-2). */
    private double phase = GOLDEN;
    /** The offset held for the shot being aimed, in radians; NaN until it is first asked for. */
    private double current = Double.NaN;

    /**
     * The aim offset for the next shot, in radians. It is sized from {@code distance} to the
     * target the first time it is asked for, and stays the same until {@link #shotFired}.
     */
    public double offset(double distance) {
        if (Double.isNaN(current)) current = fresh(distance);
        return current;
    }

    /**
     * A new offset from the current phase: {@code sign(u) * m * MAX_FRACTION * halfWidth},
     * where {@code u = 2 * phase - 1} is in [-1, 1) and {@code m} maps {@code |u|} linearly
     * onto [{@link #MIN_FRACTION}, 1]. The result's size is 15% to 50% of the half-width,
     * on either side of head-on with equal share, so it has no mean for a shielder's
     * learned offset to find.
     */
    private double fresh(double distance) {
        // The angle a 36 px body subtends each side of its centre, seen from distance px.
        // The floor at 18 px keeps it at most 45 degrees when the robots touch.
        double halfWidth = Math.atan(BODY_HALF_WIDTH / Math.max(distance, BODY_HALF_WIDTH));
        double u = 2 * phase - 1;
        double magnitude = MIN_FRACTION + (1 - MIN_FRACTION) * Math.abs(u);
        return Math.signum(u) * magnitude * MAX_FRACTION * halfWidth;
    }

    /** A shot went out with the current offset; the next shot gets a new one. */
    public void shotFired() {
        // Next term of the sequence: phase = (phase + GOLDEN) mod 1.
        phase += GOLDEN;
        if (phase >= 1) phase -= 1;
        current = Double.NaN;
    }
}

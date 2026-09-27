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
 */
public final class AimJitter {

    public static final double MAX_FRACTION = 0.5;
    public static final double MIN_FRACTION = 0.3;
    private static final double GOLDEN = 0.6180339887498949;
    /** Half a robot's 36 px body. */
    private static final double BODY_HALF_WIDTH = 18;

    private double phase = GOLDEN;

    /** The aim offset for the next shot, in radians, at {@code distance} from the target. */
    public double offset(double distance) {
        double halfWidth = Math.atan(BODY_HALF_WIDTH / Math.max(distance, BODY_HALF_WIDTH));
        double u = 2 * phase - 1;
        double magnitude = MIN_FRACTION + (1 - MIN_FRACTION) * Math.abs(u);
        return Math.signum(u) * magnitude * MAX_FRACTION * halfWidth;
    }

    /** A shot went out with the current offset; the next shot gets a new one. */
    public void shotFired() {
        phase += GOLDEN;
        if (phase >= 1) phase -= 1;
    }
}

package hadur2.core.model;

import hadur2.core.model.*;
import hadur2.core.physics.*;
import hadur2.core.knn.*;

import java.awt.geom.Point2D;

/**
 * The result of a precise maximum-escape-angle prediction: how far, as an angle seen from a
 * wave's source, the target can get from its bearing at fire time before the wave reaches
 * it, and where it would be then.
 *
 * <p>{@link hadur2.core.physics.MovementPredictor#preciseEscapeAngle} makes these by driving
 * the target at full speed (8 px/tick) perpendicular to the source, in one orbit direction,
 * tick by tick until the wave passes it; if that straight run leaves the field it retries
 * with wall smoothing and keeps whichever angle is larger. {@link Wave#preciseEscapeAngle}
 * caches the angle for each side, and it replaces the classic {@code asin(8 / bulletSpeed)}
 * bound, which ignores walls, when guess factors are made precise.</p>
 */
public class MaxEscapeTarget {
    /**
     * The escape angle, radians, measured from the source-to-target bearing at fire time and
     * positive in the direction that was predicted.
     */
    public final double angle;
    /** Where the target would be when the wave reaches it, pixels, kept inside the field. */
    public final Point2D.Double location;
    /** The tick of that prediction. */
    public final long time;
    /** Whether the straight, unsmoothed run would have left the field before the wave arrived. */
    public final boolean hitWall;

    /**
     * A prediction's result.
     *
     * @param angle the escape angle, radians, positive in the predicted direction
     * @param location where the target would be when the wave reaches it, pixels
     * @param time the tick of that prediction
     * @param hitWall whether the straight run would have left the field first
     */
    public MaxEscapeTarget(double angle, Point2D.Double location, long time, boolean hitWall) {
        this.angle = angle;
        this.location = location;
        this.time = time;
        this.hitWall = hitWall;
    }
}

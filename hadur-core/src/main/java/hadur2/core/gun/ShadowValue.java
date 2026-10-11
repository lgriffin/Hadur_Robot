package hadur2.core.gun;

/**
 * GUN-7's view of MOVE-8, as the gun is allowed to see it: what firing along an angle is
 * worth in damage we avoid taking, because the bullet's path meets enemy bullets on their
 * way to where our plan puts us. The duel builds one from movement's published intervals
 * (the gun package does not depend on movement's), and hands it to
 * {@link GunController#aim(hadur2.core.model.Wave, java.awt.geom.Point2D.Double, long, ShadowValue)}.
 *
 * <p>Implementations must be pure for the duration of one aim: the same angle and power give
 * the same answer.</p>
 */
public interface ShadowValue {

    /**
     * Whether there is any wave to shadow. When false the gun aims exactly as it did without
     * this term (the choice is not even scored).
     *
     * @return true when at least one enemy wave has a published interval
     */
    boolean active();

    /**
     * The most {@link #avoided} can return for a bullet of {@code power}: every published
     * interval wholly newly stopped. The gun uses it to skip candidates that cannot win.
     *
     * @param power the bullet's power
     * @return the damage, 0 or more
     */
    double ceiling(double power);

    /**
     * The expected damage to us a bullet fired along {@code angle} would prevent, over what
     * our bullets in flight already prevent.
     *
     * @param angle the firing angle, an absolute bearing in radians
     * @param power the bullet's power
     * @return the damage, 0 or more
     */
    double avoided(double angle, double power);
}

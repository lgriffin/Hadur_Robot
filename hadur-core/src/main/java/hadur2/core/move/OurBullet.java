package hadur2.core.move;

import hadur2.core.physics.Rules;
import java.awt.geom.Point2D;

/**
 * One of our bullets in flight, as the core fired it: it leaves from where we stood on the
 * tick we fired, along the gun's heading that tick, and after turn {@code k} it is
 * {@code speed * (k - fireTime)} from there (the engine's order, checked in S2's bench).
 *
 * <p>MOVE-1 needs our bullets' paths to work out where they shadow the enemy's waves
 * ({@link BulletShadows}). A bullet flies in a straight line at a constant speed, so its
 * fire time, source, heading and power pin down its whole path and nothing needs updating
 * while it flies. {@code HadurCore} creates one when the gun fires and hands it to
 * {@link MoveController#ourBulletFired}; the engine's bullet events later remove it through
 * {@link MoveController#ourBulletGone}.</p>
 *
 * <p>Coordinates are Robocode's: x to the right, y up, in px; headings are in radians with
 * 0 pointing north (+y) and angles growing clockwise, so a step of length {@code d} along
 * heading {@code h} moves {@code (d sin h, d cos h)}. Instances are immutable.</p>
 */
public final class OurBullet {

    /** The tick the bullet was fired on; it has moved {@code speed} px after each later turn. */
    public final long fireTime;
    /** Where we stood when we fired, in px (a private copy of the caller's point). */
    public final Point2D.Double source;
    /** The gun's heading on the fire tick, in radians (0 north, clockwise). */
    public final double heading;
    /** The power actually fired (the core clamps it to [0.1, 3.0] and to our energy). */
    public final double power;
    /**
     * The bullet's speed in px per turn: {@code 20 - 3 * power}, Robocode's rule, with the
     * power clamped to [0.1, 3.0] first; so between 11 and 19.7.
     */
    public final double speed;

    /**
     * A bullet fired on tick {@code fireTime} from {@code source} along {@code heading} with
     * {@code power}.
     *
     * @param fireTime the tick the gun fired on
     * @param source where we stood on that tick, in px; copied, so the caller may reuse it
     * @param heading the gun's heading that tick, in radians
     * @param power the power actually fired
     */
    public OurBullet(long fireTime, Point2D.Double source, double heading, double power) {
        this.fireTime = fireTime;
        // Copied: the caller's point may be a live, reused object.
        this.source = new Point2D.Double(source.x, source.y);
        this.heading = heading;
        this.power = power;
        this.speed = Rules.getBulletSpeed(power);
    }

    /**
     * Where the bullet is after turn {@code time}: {@code speed * (time - fireTime)} px from
     * {@link #source} along {@link #heading}. Times before {@code fireTime} give points
     * behind the source; callers only ask for times from {@code fireTime} on.
     *
     * @param time the turn, in ticks
     * @return a new point, in px
     */
    public Point2D.Double at(long time) {
        double d = speed * (time - fireTime);
        // Robocode's compass: x grows with sin(heading), y with cos(heading).
        return new Point2D.Double(source.x + Math.sin(heading) * d, source.y + Math.cos(heading) * d);
    }

    /**
     * Whether this is the bullet an engine event names by its heading and power. Both are
     * compared to within 1e-6, a tolerance for rounding on the way through the adapter. Two
     * bullets in flight that match the same event are not told apart:
     * {@link MoveController#ourBulletGone} drops the oldest.
     *
     * @param heading the event bullet's heading, in radians
     * @param power the event bullet's power
     * @return true when both match this bullet's
     */
    public boolean is(double heading, double power) {
        return Math.abs(this.heading - heading) < 1e-6 && Math.abs(this.power - power) < 1e-6;
    }
}

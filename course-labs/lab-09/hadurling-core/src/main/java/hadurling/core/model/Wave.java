package hadurling.core.model;

import hadurling.core.physics.Angles;
import hadurling.core.physics.Rules;

/**
 * A bullet seen as the circle it sweeps out. The moment a bullet is fired we know where it
 * started, when, and how fast it goes, so after {@code t} ticks it could be anywhere on a
 * circle of radius {@code t * speed} around the shooter. The circle is a <em>wave</em>.
 *
 * <p>The wave also remembers where the target was when the bullet was fired, as an angle
 * from the shooter: the <em>bearing</em>. Where the target is found when the wave reaches it
 * is then described by one number, the <em>guess factor</em>: how far round from the bearing
 * it went, as a share of the furthest it could have gone (the maximum escape angle). 0 means
 * it was still straight ahead of the barrel, 1 that it ran at full speed in the direction it
 * was already going, and -1 that it reversed and ran the other way.</p>
 *
 * <p>One class serves both sides: a wave we fire teaches our gun, and a wave the enemy fires
 * teaches our movement. It is immutable. Angles are radians, 0 north, clockwise.</p>
 */
public final class Wave {

    private final double originX;
    private final double originY;
    private final long fireTime;
    private final double power;
    private final double bearing;
    private final int direction;

    /**
     * A wave.
     *
     * @param originX the shooter's x when it fired, in px
     * @param originY the shooter's y when it fired, in px
     * @param fireTime the tick the bullet was fired
     * @param power the bullet's power
     * @param bearing the compass angle from the shooter to the target at fire time
     * @param direction +1 if the target was circling clockwise round the shooter, -1 if
     *     anticlockwise; it makes "forwards" mean the same thing for every wave
     */
    public Wave(double originX, double originY, long fireTime, double power, double bearing,
            int direction) {
        this.originX = originX;
        this.originY = originY;
        this.fireTime = fireTime;
        this.power = power;
        this.bearing = bearing;
        this.direction = direction < 0 ? -1 : 1;
    }

    /**
     * Which way round a target is circling, from its velocity across the line to the shooter.
     *
     * @param lateralVelocity the target's velocity at right angles to that line, positive
     *     when clockwise round the shooter
     * @return +1 for clockwise or no sideways movement, -1 for anticlockwise
     */
    public static int direction(double lateralVelocity) {
        return lateralVelocity < 0 ? -1 : 1;
    }

    /** @return the shooter's x when it fired, in px */
    public double originX() { return originX; }
    /** @return the shooter's y when it fired, in px */
    public double originY() { return originY; }
    /** @return the tick the bullet was fired */
    public long fireTime() { return fireTime; }
    /** @return the bullet's power */
    public double power() { return power; }
    /** @return the compass angle from the shooter to the target at fire time */
    public double bearing() { return bearing; }
    /** @return +1 if the target was circling clockwise, -1 if anticlockwise */
    public int direction() { return direction; }

    /** @return the bullet's speed in px/tick */
    public double speed() {
        return Rules.bulletSpeed(power);
    }

    /** @return the furthest round, in radians, a target can get while the bullet is in flight */
    public double maxEscapeAngle() {
        return Rules.maxEscapeAngle(power);
    }

    /**
     * How far the wave has grown.
     *
     * @param time the tick
     * @return its radius in px, 0 at the moment of firing
     */
    public double radius(long time) {
        return (time - fireTime) * speed();
    }

    /**
     * @param x a point's x in px
     * @param y a point's y in px
     * @return the distance from the shooter's firing position to the point
     */
    public double distanceTo(double x, double y) {
        return Math.hypot(x - originX, y - originY);
    }

    /**
     * Whether the wave has reached a point.
     *
     * @param time the tick
     * @param x the point's x in px
     * @param y the point's y in px
     * @return true once the circle is at least as big as the distance to the point
     */
    public boolean hasReached(long time, double x, double y) {
        return radius(time) >= distanceTo(x, y);
    }

    /**
     * Where a point sits in this wave, as a guess factor.
     *
     * @param x the point's x in px
     * @param y the point's y in px
     * @return a number in [-1, 1]: positive means further round in the wave's direction
     */
    public double guessFactor(double x, double y) {
        double offset = Angles.normalRelativeAngle(Angles.absoluteBearing(originX, originY, x, y) - bearing);
        double gf = offset * direction / maxEscapeAngle();
        return Math.max(-1, Math.min(1, gf));
    }

    /**
     * The inverse of {@link #guessFactor}: the compass angle to fire at to hit a target that
     * goes to {@code guessFactor}.
     *
     * @param guessFactor a number in [-1, 1]
     * @return the angle, normalised to [0, 2 PI)
     */
    public double firingAngle(double guessFactor) {
        return Angles.normalAbsoluteAngle(bearing + direction * guessFactor * maxEscapeAngle());
    }
}

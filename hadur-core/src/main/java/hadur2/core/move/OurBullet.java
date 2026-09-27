package hadur2.core.move;

import hadur2.core.physics.Rules;
import java.awt.geom.Point2D;

/**
 * One of our bullets in flight, as the core fired it: it leaves from where we stood on the
 * tick we fired, along the gun's heading that tick, and after turn {@code k} it is
 * {@code speed * (k - fireTime)} from there (the engine's order, checked in S2's bench).
 */
public final class OurBullet {

    public final long fireTime;
    public final Point2D.Double source;
    public final double heading;
    public final double power;
    public final double speed;

    public OurBullet(long fireTime, Point2D.Double source, double heading, double power) {
        this.fireTime = fireTime;
        this.source = new Point2D.Double(source.x, source.y);
        this.heading = heading;
        this.power = power;
        this.speed = Rules.getBulletSpeed(power);
    }

    /** Where the bullet is after turn {@code time}. */
    public Point2D.Double at(long time) {
        double d = speed * (time - fireTime);
        return new Point2D.Double(source.x + Math.sin(heading) * d, source.y + Math.cos(heading) * d);
    }

    /** Whether this is the bullet an engine event names by its heading and power. */
    public boolean is(double heading, double power) {
        return Math.abs(this.heading - heading) < 1e-6 && Math.abs(this.power - power) < 1e-6;
    }
}

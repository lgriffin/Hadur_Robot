package hadur2.core.melee;

import hadur2.core.physics.DiaUtils;
import java.awt.geom.Point2D;

/**
 * One of the aims an opponent's recorded shot may have taken (MMOVE-3): a bullet from the
 * shot's source along {@link #heading}, flying at the shot's speed from its fire tick.
 */
public final class VirtualBullet {

    /** How the shooter is assumed to have aimed. */
    public enum Aim { HEAD_ON, LINEAR }

    public final EnemyShot shot;
    public final Aim aim;
    public final double heading;

    public VirtualBullet(EnemyShot shot, Aim aim, double heading) {
        this.shot = shot;
        this.aim = aim;
        this.heading = heading;
    }

    /** Where the bullet is at tick {@code time} (at the source before it was fired). */
    public Point2D.Double position(double time) {
        double flown = Math.max(0, time - shot.fireTime) * shot.speed();
        return DiaUtils.project(shot.source, heading, flown);
    }

    /**
     * Whether the bullet has flown past {@code p}, or left a field no larger than
     * {@code reach}, even if it was fired at the latest tick its shot's window allows.
     */
    public boolean passed(Point2D.Double p, long now, double reach) {
        double flown = Math.max(0, now - (shot.fireTime + shot.window)) * shot.speed();
        return flown > reach || flown > shot.source.distance(p) + 40;
    }

    /**
     * Shortest distance from {@code p} to the bullet's flight between ticks {@code from} and
     * {@code to}; the bullet moves in a straight line, so this is a point-to-segment distance.
     */
    public double closestApproach(Point2D.Double p, double from, double to) {
        Point2D.Double a = position(from);
        Point2D.Double b = position(to);
        double dx = b.x - a.x, dy = b.y - a.y;
        double len2 = dx * dx + dy * dy;
        if (len2 == 0) return a.distance(p);
        double t = ((p.x - a.x) * dx + (p.y - a.y) * dy) / len2;
        t = Math.max(0, Math.min(1, t));
        return p.distance(a.x + t * dx, a.y + t * dy);
    }

    /** The heading a linear-aiming shooter at {@code source} fires at a target moving in a straight line. */
    public static double linearHeading(Point2D.Double source, Point2D.Double target,
                                       double targetHeading, double targetVelocity,
                                       double bulletSpeed, double width, double height) {
        double x = target.x, y = target.y;
        for (int t = 1; t < 150; t++) {
            x = DiaUtils.limit(18, x + Math.sin(targetHeading) * targetVelocity, width - 18);
            y = DiaUtils.limit(18, y + Math.cos(targetHeading) * targetVelocity, height - 18);
            if (t * bulletSpeed >= source.distance(x, y)) break;
        }
        return DiaUtils.absoluteBearing(source, new Point2D.Double(x, y));
    }
}

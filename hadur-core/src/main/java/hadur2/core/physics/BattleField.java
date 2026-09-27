package hadur2.core.physics;

import hadur2.core.model.*;
import hadur2.core.physics.*;
import hadur2.core.knn.*;

import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

/**
 * The battle field's walls, as seen by a robot's centre, and the geometry that depends on
 * them: clamping a point into the field, how far a target can move before a wall stops it
 * (two of the gun's and the surf's KNN features), and wall smoothing.
 *
 * <p>A robot is a 36 × 36 px square, so its centre can never come closer than 18 px to a
 * wall. {@link #rectangle} is the field shrunk by those 18 px on every side: the set of
 * legal centre positions. Every method here works on centres against that rectangle, not
 * on the field's own edges.</p>
 *
 * <p>Coordinates are Robocode's: the origin is the bottom-left corner, +y is north (up),
 * and angles are radians with 0 north and growing clockwise, so a point at angle {@code a}
 * and distance {@code d} from {@code p} is {@code (p.x + sin(a) d, p.y + cos(a) d)}.</p>
 *
 * <p>One instance is made per battle from the field size and shared by the movement
 * predictor, the waves, the guns, the surf and the melee brain. It is immutable.</p>
 */
public class BattleField {

    /**
     * Where a robot's centre can be: the field inset by half a robot (18 px) on every side,
     * in px. Note that {@link Rectangle2D#contains(double, double)} treats the top and right
     * edges as outside.
     */
    public final Rectangle2D.Double rectangle;
    /** The field's full width, in px. */
    public final double width;
    /** The field's full height, in px. */
    public final double height;

    /**
     * A field of the given size, as the engine reports it.
     *
     * @param width the field's width, in px
     * @param height the field's height, in px
     */
    public BattleField(double width, double height) {
        this.rectangle = new Rectangle2D.Double(18.0, 18.0, width - 36.0, height - 36.0);
        this.width = width;
        this.height = height;
    }

    /**
     * Clamps a point into the area a robot's centre can occupy, [18, width - 18] ×
     * [18, height - 18]. Used where a prediction ran through a wall (the precise escape
     * angle's end point, the melee's candidate points) and the answer must be a place a
     * robot could really be.
     *
     * @param p the point, in field coordinates (not modified)
     * @return a new point, {@code p} moved onto the nearest legal position if it was outside
     */
    public Point2D.Double translateToField(Point2D.Double p) {
        return new Point2D.Double(
            DiaUtils.limit(18.0, p.x, width - 18.0),
            DiaUtils.limit(18.0, p.y, height - 18.0));
    }

    /**
     * How far the target can orbit the source, at its current distance, before its centre
     * leaves the field: the gun and the surf read it as a KNN feature (a wave's
     * "wall distance" forward and reverse), so that a target pinned against a wall is not
     * expected to escape the way one in open field would.
     *
     * <p>The answer is in units of the classic maximum escape angle,
     * {@code asin(8 / bulletSpeed)}: the widest angle a target at full speed (8 px/tick) can
     * cover, seen from the source, before a bullet of this power reaches it. So 1.0 means the
     * wall is exactly one escape angle away along the orbit, and the value is directly
     * comparable with a guess factor. The circle is walked in steps of 1% of the escape
     * angle, up to 2 escape angles; 2.0 means no wall within that.</p>
     *
     * @param sourceLocation where the bullet is fired from
     * @param targetLocation the target's centre; its distance from the source is the orbit's radius
     * @param bulletPower the bullet's power, which sets its speed and so the escape angle
     * @param direction +1 to orbit clockwise, -1 counter-clockwise (a wave's orbit direction, or its reverse)
     * @return the wall's distance along the orbit, as a multiple of the escape angle, in [0, 2]
     */
    public double orbitalWallDistance(Point2D.Double sourceLocation,
            Point2D.Double targetLocation, double bulletPower, int direction) {
        double absBearing = DiaUtils.absoluteBearing(sourceLocation, targetLocation);
        double distance = sourceLocation.distance(targetLocation);
        // Classic maximum escape angle: the bullet covers the distance in d / v ticks, the
        // target 8 px a tick sideways at most, so the angle's sine is 8 / v. The bullet's
        // speed is 20 - 3 × power (Rules.getBulletSpeed, without its clamp).
        double maxEscapeAngle = Math.asin(8.0 / (20.0 - 3.0 * bulletPower));
        double wallDistance = 2.0;
        for (int x = 0; x < 200; x++) {
            // A point on the circle round the source through the target, x hundredths of
            // an escape angle along the orbit.
            double testAngle = absBearing + direction * ((double) x / 100.0) * maxEscapeAngle;
            double testX = sourceLocation.x + Math.sin(testAngle) * distance;
            double testY = sourceLocation.y + Math.cos(testAngle) * distance;
            if (!rectangle.contains(testX, testY)) {
                wallDistance = (double) x / 100.0;
                break;
            }
        }
        return wallDistance;
    }

    /**
     * How far the target can drive straight along {@code heading}, at full speed, before
     * its centre leaves the field, as a share of the bullet's flight time: 1.0 means it
     * would reach the wall just as the bullet arrives. The path is walked a tick (8 px) at a
     * time for up to two flight times; 2.0 means no wall within that. Nothing in the core
     * calls it at present.
     *
     * @param targetLocation the target's centre
     * @param distance the bullet's flight distance, in px, which sets its flight time
     * @param heading the direction the target would drive, in radians
     * @param bulletPower the bullet's power, which sets its speed
     * @return ticks to the wall divided by the bullet's flight time in ticks, in [0, 2]
     */
    public double directToWallDistance(Point2D.Double targetLocation,
            double distance, double heading, double bulletPower) {
        int bulletTicks = DiaUtils.bulletTicksFromPower(distance, bulletPower);
        double wallDistance = 2.0;
        double sinH = Math.sin(heading);
        double cosH = Math.cos(heading);
        for (int x = 0; x < 2 * bulletTicks; x++) {
            double testX = targetLocation.x + sinH * 8.0 * x;
            double testY = targetLocation.y + cosH * 8.0 * x;
            if (!rectangle.contains(testX, testY)) {
                wallDistance = (double) x / bulletTicks;
                break;
            }
        }
        return wallDistance;
    }

    /**
     * Wall smoothing: bends a desired heading just enough that a robot driving along it
     * slides along a wall instead of running into it. Movement calls it on every heading it
     * is about to drive, so a surfing or orbiting robot turns smoothly along walls and never
     * loses speed (and energy) to a wall hit.
     *
     * <p>The test is a "stick" of length {@code wallStick} held out from the robot along the
     * heading. While the stick's tip is outside {@link #rectangle}, the heading is replaced
     * by one that points at the offending wall and then rotated away from it by exactly the
     * angle that puts the tip back on the wall line: if the robot is {@code adjacent} px from
     * the wall, a stick at angle θ from the wall's normal reaches {@code wallStick × cos θ}
     * toward it, so θ = {@code acos(adjacent / wallStick)}. A further 0.0005 rad keeps the tip
     * just inside. Near a corner the new heading can poke through the other wall, so the loop
     * repeats, at most 25 times. A robot already outside the rectangle (negative
     * {@code adjacent}) is steered back in, lengthening the stick if it is shorter than the
     * overshoot so that {@code acos} stays defined.</p>
     *
     * @param startLocation the robot's centre
     * @param startAngle the heading it wants to drive, in radians
     * @param orientation which way to rotate off a wall: +1 clockwise, -1 counter-clockwise
     *     (the direction the robot is orbiting in)
     * @param wallStick the stick's length, in px: longer turns off a wall sooner and more gently
     * @return the smoothed heading, in radians; {@code startAngle} unchanged when the robot
     *     is more than {@code wallStick} from both walls
     */
    public double wallSmoothing(Point2D.Double startLocation, double startAngle,
            int orientation, double wallStick) {
        // Distance from the centre to the nearer legal-centre edge on each axis.
        double wallDistanceX = Math.min(startLocation.x - 18.0, width - startLocation.x - 18.0);
        double wallDistanceY = Math.min(startLocation.y - 18.0, height - startLocation.y - 18.0);
        // Fast path: no stick of this length can reach a wall, whatever the heading.
        if (wallDistanceX > wallStick && wallDistanceY > wallStick) {
            return startAngle;
        }

        double angle = startAngle;
        double testX = startLocation.x + Math.sin(angle) * wallStick;
        double testY = startLocation.y + Math.cos(angle) * wallStick;
        double testDistanceX = Math.min(testX - 18.0, width - testX - 18.0);
        double testDistanceY = Math.min(testY - 18.0, height - testY - 18.0);
        double adjacent = 0;
        int g = 0;
        // g bounds the loop: a corner may take a couple of passes, a pathological input
        // must not hang the tick.
        while ((testDistanceX < 0 || testDistanceY < 0) && g++ < 25) {
            // Fix the wall the tip is furthest through. Point straight at it (south at the
            // bottom wall, north at the top, west at the left, east at the right) and note
            // how far the robot is from it.
            if (testDistanceY < 0 && testDistanceY < testDistanceX) {
                angle = testY < 18.0 ? Math.PI : 0.0;
                adjacent = wallDistanceY;
            } else if (testDistanceX < 0 && testDistanceX <= testDistanceY) {
                angle = testX < 18.0 ? 3.0 * Math.PI / 2.0 : Math.PI / 2.0;
                adjacent = wallDistanceX;
            }
            if (adjacent < 0) {
                // The robot itself is past the wall: turn back in, away from it.
                if (-adjacent > wallStick) {
                    wallStick += -adjacent;
                }
                angle += Math.PI - orientation * (Math.abs(Math.acos(-adjacent / wallStick)) - 5e-4);
            } else {
                // Rotate off the wall's normal until the tip just touches the wall line.
                angle += orientation * (Math.abs(Math.acos(adjacent / wallStick)) + 5e-4);
            }
            testX = startLocation.x + Math.sin(angle) * wallStick;
            testY = startLocation.y + Math.cos(angle) * wallStick;
            testDistanceX = Math.min(testX - 18.0, width - testX - 18.0);
            testDistanceY = Math.min(testY - 18.0, height - testY - 18.0);
        }
        return angle;
    }
}

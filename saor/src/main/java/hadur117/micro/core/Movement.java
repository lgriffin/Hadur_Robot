package hadur117.micro.core;

import java.awt.geom.Point2D;

/**
 * Corner oscillation (MeleeSeed, as Figment runs it): the robot shuttles between two points
 * near its nearest corner, one on each wall that meets there. Each point sits {@link #WALL}
 * px off its own wall and a leg along it, so whichever point the robot is heading for, it
 * stops {@link #WALL} px from an edge (SAOR-1). The axis flips each time a leg is done.
 *
 * <p>Pure statics on primitives, no engine types (SAOR-2). The shipped class
 * {@code hadur117.micro.Saor} is this core flattened by hand; the bench adapter
 * {@code SaorLab} calls it, and the equivalence test holds the two to the same orders (SAOR-15).</p>
 */
public final class Movement {

    /** The battlefield's side; Saor enters MeleeRumble only, whose field is 1000 x 1000. */
    public static final int FIELD = 1000;
    /** How far the oscillation points sit from their wall (SAOR-1). */
    public static final int WALL = 25;

    private Movement() {
    }

    /**
     * The axis after this tick: flipped when the last leg is done.
     *
     * @param axis 1 while running along the y wall's point, 0 along the x wall's
     * @param distanceRemaining the engine's distance still to go
     * @return the axis to drive on
     */
    public static int axis(int axis, double distanceRemaining) {
        return distanceRemaining == 0 ? axis ^ 1 : axis;
    }

    /**
     * How far along the wall, from the corner, the leg's point lies: 55 px plus 0.4 of the
     * target's distance, so the robot swings wider when the fight is further off. An infinite distance (no target yet) overflows as it
     * does in Figment and sends the robot at the far wall until the first scan.
     *
     * @param targetDistance the target's distance at its last scan
     * @return the leg in px
     */
    public static int leg(double targetDistance) {
        return 55 + (int) (targetDistance / 2.5);
    }

    /**
     * One coordinate of the point the robot drives to, mirrored into the half of the field the
     * robot is in: {@link #WALL} on the axis whose wall the point sits against, else the leg.
     *
     * @param againstWall whether the point sits against this axis's wall
     * @param leg the leg, from {@link #leg}
     * @param position the robot's own coordinate on this axis
     * @return the point's coordinate on this axis
     */
    public static int coordinate(boolean againstWall, int leg, double position) {
        int c = againstWall ? WALL : leg;
        return position > FIELD / 2 ? FIELD - c : c;
    }

    /**
     * The body turn toward the point, before the reverse trick: the adapter turns by its
     * tangent and drives by its cosine, so a point behind the robot is reached backwards.
     *
     * @param x the point's x
     * @param y the point's y
     * @param myX our x
     * @param myY our y
     * @param heading our heading, radians
     * @return the bearing to the point less our heading, radians
     */
    public static double turn(int x, int y, double myX, double myY, double heading) {
        return Math.atan2(x - myX, y - myY) - heading;
    }

    /**
     * The body turn order: the tangent of {@link #turn}, small both when the point is ahead
     * and when it is behind.
     *
     * @param turn from {@link #turn}
     * @return the right turn, radians
     */
    public static double bodyTurn(double turn) {
        return Math.tan(turn);
    }

    /**
     * The move order: the distance to the point, negative when the point is behind.
     *
     * @param turn from {@link #turn}
     * @param x the point's x
     * @param y the point's y
     * @param myX our x
     * @param myY our y
     * @return the distance ahead, px
     */
    public static double ahead(double turn, int x, int y, double myX, double myY) {
        return Math.cos(turn) * Point2D.distance(myX, myY, x, y);
    }
}

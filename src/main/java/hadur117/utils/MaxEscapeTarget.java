package hadur117.utils;

import java.awt.geom.Point2D;

public class MaxEscapeTarget {
    public final double angle;
    public final Point2D.Double location;
    public final long time;
    public final boolean hitWall;

    public MaxEscapeTarget(double angle, Point2D.Double location, long time, boolean hitWall) {
        this.angle = angle;
        this.location = location;
        this.time = time;
        this.hitWall = hitWall;
    }
}

package hadurling.core.physics;

/**
 * The battlefield: a rectangle with its origin at the bottom left. A robot's centre can get
 * no closer to a wall than half its own width, 18 px.
 */
public final class Field {

    /** Half a robot's width: how close its centre may come to a wall, in px. */
    public static final double MARGIN = 18;

    private final double width;
    private final double height;

    /**
     * A field of the given size.
     *
     * @param width the width in px
     * @param height the height in px
     */
    public Field(double width, double height) {
        this.width = width;
        this.height = height;
    }

    /**
     * Whether a robot centred here would be inside the field.
     *
     * @param x the x of the centre, in px
     * @param y the y of the centre, in px
     * @return true when the point is within the walls, margin included
     */
    public boolean contains(double x, double y) {
        return x >= MARGIN && x <= width - MARGIN && y >= MARGIN && y <= height - MARGIN;
    }

    /**
     * How far the point is from the nearest wall, measured to the robot's reachable edge.
     * Negative when the point is outside it.
     *
     * @param x the x of the point, in px
     * @param y the y of the point, in px
     * @return the distance in px to the nearest wall, margin excluded
     */
    public double distanceToWall(double x, double y) {
        double horizontal = Math.min(x - MARGIN, width - MARGIN - x);
        double vertical = Math.min(y - MARGIN, height - MARGIN - y);
        return Math.min(horizontal, vertical);
    }
}

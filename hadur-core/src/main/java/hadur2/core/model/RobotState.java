package hadur2.core.model;

import hadur2.core.model.*;
import hadur2.core.physics.*;
import hadur2.core.knn.*;

import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.List;

/**
 * A robot's position and motion at one tick: ours or the enemy's, observed, interpolated
 * or predicted. Scans become states in the core's {@link RobotStateLog}s, the movement
 * predictor produces them tick by tick, and waves test them to decide when a wave reaches
 * a robot ({@link Wave#checkWavePosition(RobotState)}) and which firing angles would have
 * hit it ({@link Wave#preciseIntersection}).
 *
 * <p>Units follow the engine: location in pixels (origin at the field's bottom-left, y up),
 * heading in radians (0 = north, clockwise), velocity in pixels per tick (negative while
 * driving backwards), time in ticks within the round.</p>
 *
 * <p>The robot's body, for hit tests, is the engine's: a 36 by 36 pixel square centred on
 * the location and aligned with the axes whatever the heading. The corners, rectangle and
 * sides of that square are computed on first use and cached, since a wave's checks ask for
 * them on every tick of its flight; the cached lists are shared, so callers must not change
 * them. The fields are final, but the location point is the caller's own object and is
 * not copied.</p>
 */
public class RobotState {

    /** Half the side of a robot's square hit box, pixels: Robocode robots are 36 by 36. */
    private static final double BOT_HALF_WIDTH = 18.0;

    /** The robot's centre, pixels. */
    public final Point2D.Double location;
    /** The body heading, radians (0 = north, clockwise). */
    public final double heading;
    /** The velocity, pixels per tick; negative while driving backwards. */
    public final double velocity;
    /** The tick this state describes; -1 when the builder was not given one. */
    public final long time;
    /**
     * Whether {@link RobotStateLog} made this state up by interpolating between two observed
     * ones, rather than it coming from a scan or a prediction.
     */
    public final boolean interpolated;

    /** Cached by {@link #botCorners()}. */
    private List<Point2D.Double> _botCorners;
    /** Cached by {@link #botRectangle()}. */
    private Rectangle2D.Double _botRectangle;
    /** Cached by {@link #botSides()}. */
    private List<Line2D.Double> _botSides;

    private RobotState(Point2D.Double location, double heading, double velocity,
                       long time, boolean interpolated) {
        this.location = location;
        this.heading = heading;
        this.velocity = velocity;
        this.time = time;
        this.interpolated = interpolated;
    }

    /**
     * The four corners of the robot's hit box, pixels: (-, -), (-, +), (+, -), (+, +)
     * offsets from the centre. Cached and shared; do not modify.
     */
    public List<Point2D.Double> botCorners() {
        if (_botCorners == null) {
            _botCorners = new ArrayList<>();
            _botCorners.add(new Point2D.Double(location.x - BOT_HALF_WIDTH, location.y - BOT_HALF_WIDTH));
            _botCorners.add(new Point2D.Double(location.x - BOT_HALF_WIDTH, location.y + BOT_HALF_WIDTH));
            _botCorners.add(new Point2D.Double(location.x + BOT_HALF_WIDTH, location.y - BOT_HALF_WIDTH));
            _botCorners.add(new Point2D.Double(location.x + BOT_HALF_WIDTH, location.y + BOT_HALF_WIDTH));
        }
        return _botCorners;
    }

    /** The robot's 36 by 36 pixel hit box. Cached and shared; do not modify. */
    public Rectangle2D.Double botRectangle() {
        if (_botRectangle == null) {
            _botRectangle = new Rectangle2D.Double(
                location.x - BOT_HALF_WIDTH, location.y - BOT_HALF_WIDTH, 36.0, 36.0);
        }
        return _botRectangle;
    }

    /**
     * The four sides of the robot's hit box as segments, in order south, east, north, west
     * (with y growing upward). Cached and shared; do not modify.
     */
    public List<Line2D.Double> botSides() {
        if (_botSides == null) {
            double x = location.x, y = location.y;
            _botSides = new ArrayList<>();
            _botSides.add(new Line2D.Double(x - 18, y - 18, x + 18, y - 18));
            _botSides.add(new Line2D.Double(x + 18, y - 18, x + 18, y + 18));
            _botSides.add(new Line2D.Double(x + 18, y + 18, x - 18, y + 18));
            _botSides.add(new Line2D.Double(x - 18, y + 18, x - 18, y - 18));
        }
        return _botSides;
    }

    /** A builder with no location (null), heading 0, velocity 0 and tick -1 until set. */
    public static Builder newBuilder() {
        return new Builder();
    }

    /** Builds a {@link RobotState}; each setter returns the builder. */
    public static class Builder {
        private Point2D.Double location;
        private double heading;
        private double velocity;
        private long time = -1;
        private boolean interpolated;

        /** The centre, pixels; kept by reference, not copied. */
        public Builder setLocation(Point2D.Double location) {
            this.location = location;
            return this;
        }

        /** The body heading, radians (0 = north, clockwise). */
        public Builder setHeading(double heading) {
            this.heading = heading;
            return this;
        }

        /** The velocity, pixels per tick. */
        public Builder setVelocity(double velocity) {
            this.velocity = velocity;
            return this;
        }

        /** The tick the state describes. */
        public Builder setTime(long time) {
            this.time = time;
            return this;
        }

        /** Marks the state as interpolated rather than observed or predicted. */
        public Builder setInterpolated(boolean interpolated) {
            this.interpolated = interpolated;
            return this;
        }

        /** The state with the values set so far. */
        public RobotState build() {
            return new RobotState(location, heading, velocity, time, interpolated);
        }
    }
}

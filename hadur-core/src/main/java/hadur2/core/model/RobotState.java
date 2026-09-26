package hadur2.core.model;

import hadur2.core.model.*;
import hadur2.core.physics.*;
import hadur2.core.knn.*;

import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.List;

public class RobotState {

    private static final double BOT_HALF_WIDTH = 18.0;

    public final Point2D.Double location;
    public final double heading;
    public final double velocity;
    public final long time;
    public final boolean interpolated;

    private List<Point2D.Double> _botCorners;
    private Rectangle2D.Double _botRectangle;
    private List<Line2D.Double> _botSides;

    private RobotState(Point2D.Double location, double heading, double velocity,
                       long time, boolean interpolated) {
        this.location = location;
        this.heading = heading;
        this.velocity = velocity;
        this.time = time;
        this.interpolated = interpolated;
    }

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

    public Rectangle2D.Double botRectangle() {
        if (_botRectangle == null) {
            _botRectangle = new Rectangle2D.Double(
                location.x - BOT_HALF_WIDTH, location.y - BOT_HALF_WIDTH, 36.0, 36.0);
        }
        return _botRectangle;
    }

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

    public static Builder newBuilder() {
        return new Builder();
    }

    public static class Builder {
        private Point2D.Double location;
        private double heading;
        private double velocity;
        private long time = -1;
        private boolean interpolated;

        public Builder setLocation(Point2D.Double location) {
            this.location = location;
            return this;
        }

        public Builder setHeading(double heading) {
            this.heading = heading;
            return this;
        }

        public Builder setVelocity(double velocity) {
            this.velocity = velocity;
            return this;
        }

        public Builder setTime(long time) {
            this.time = time;
            return this;
        }

        public Builder setInterpolated(boolean interpolated) {
            this.interpolated = interpolated;
            return this;
        }

        public RobotState build() {
            return new RobotState(location, heading, velocity, time, interpolated);
        }
    }
}

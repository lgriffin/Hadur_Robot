package hadur117.utils;

import java.awt.geom.Point2D;

public final class DiaUtils {

    private DiaUtils() {}

    public static Point2D.Double project(Point2D.Double src, double angle, double length) {
        return new Point2D.Double(
            src.x + Math.sin(angle) * length,
            src.y + Math.cos(angle) * length);
    }

    public static Point2D.Double project(Point2D.Double src,
            double sinAngle, double cosAngle, double length) {
        return new Point2D.Double(
            src.x + sinAngle * length,
            src.y + cosAngle * length);
    }

    public static double absoluteBearing(Point2D.Double src, Point2D.Double target) {
        return Math.atan2(target.x - src.x, target.y - src.y);
    }

    public static int nonZeroSign(double d) {
        return d < 0 ? -1 : 1;
    }

    public static double square(double d) {
        return d * d;
    }

    public static double limit(double min, double value, double max) {
        return Math.max(min, Math.min(value, max));
    }

    public static int limit(int min, int value, int max) {
        return Math.max(min, Math.min(value, max));
    }

    public static double botWidthAimAngle(double distance) {
        return Math.abs(18.0 / distance);
    }

    public static int bulletTicksFromSpeed(double distance, double speed) {
        return (int) Math.ceil(distance / speed);
    }

    public static int bulletTicksFromPower(double distance, double power) {
        return (int) Math.ceil(distance / (20.0 - 3.0 * power));
    }

    public static double accel(double velocity, double previousVelocity) {
        double a = velocity - previousVelocity;
        if (previousVelocity == 0.0) {
            return Math.abs(a);
        }
        return a * Math.signum(previousVelocity);
    }

    public static double normalizeAngle(double angle, double reference) {
        double normDiff = reference - angle;
        while (Math.abs(normDiff) > Math.PI) {
            angle += Math.signum(normDiff) * (Math.PI * 2);
            normDiff = reference - angle;
        }
        return angle;
    }

    public static double[] generateFiringAngles(int numAngles, double maxEscapeAngle) {
        int gfZero = (numAngles - 1) / 2;
        double[] firingAngles = new double[numAngles];
        for (int x = 0; x < numAngles; x++) {
            firingAngles[x] = (double) (x - gfZero) / gfZero * maxEscapeAngle;
        }
        return firingAngles;
    }

    public static double marginOfError(double probability, int numDataPoints) {
        return 1.96 * Math.sqrt(probability * (1.0 - probability) / numDataPoints);
    }

    public static double round(double d, int decimalPlaces) {
        long powerTen = 1;
        for (int x = 0; x < decimalPlaces; x++) {
            powerTen *= 10;
        }
        return (double) Math.round(d * powerTen) / powerTen;
    }

    public static void setBackAsFront(robocode.AdvancedRobot robot, double goAngle) {
        double angle = robocode.util.Utils.normalRelativeAngle(goAngle - robot.getHeadingRadians());
        if (Math.abs(angle) > Math.PI / 2) {
            if (angle < 0) {
                robot.setTurnRightRadians(Math.PI + angle);
            } else {
                robot.setTurnLeftRadians(Math.PI - angle);
            }
            robot.setBack(100.0);
        } else {
            if (angle < 0) {
                robot.setTurnLeftRadians(-angle);
            } else {
                robot.setTurnRightRadians(angle);
            }
            robot.setAhead(100.0);
        }
    }
}

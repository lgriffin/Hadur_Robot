package hadur2.core.physics;

import hadur2.core.model.*;
import hadur2.core.physics.*;
import hadur2.core.knn.*;

import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public class BattleField {

    public final Rectangle2D.Double rectangle;
    public final double width;
    public final double height;

    public BattleField(double width, double height) {
        this.rectangle = new Rectangle2D.Double(18.0, 18.0, width - 36.0, height - 36.0);
        this.width = width;
        this.height = height;
    }

    public Point2D.Double translateToField(Point2D.Double p) {
        return new Point2D.Double(
            DiaUtils.limit(18.0, p.x, width - 18.0),
            DiaUtils.limit(18.0, p.y, height - 18.0));
    }

    public double orbitalWallDistance(Point2D.Double sourceLocation,
            Point2D.Double targetLocation, double bulletPower, int direction) {
        double absBearing = DiaUtils.absoluteBearing(sourceLocation, targetLocation);
        double distance = sourceLocation.distance(targetLocation);
        double maxEscapeAngle = Math.asin(8.0 / (20.0 - 3.0 * bulletPower));
        double wallDistance = 2.0;
        for (int x = 0; x < 200; x++) {
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

    public double wallSmoothing(Point2D.Double startLocation, double startAngle,
            int orientation, double wallStick) {
        double wallDistanceX = Math.min(startLocation.x - 18.0, width - startLocation.x - 18.0);
        double wallDistanceY = Math.min(startLocation.y - 18.0, height - startLocation.y - 18.0);
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
        while ((testDistanceX < 0 || testDistanceY < 0) && g++ < 25) {
            if (testDistanceY < 0 && testDistanceY < testDistanceX) {
                angle = testY < 18.0 ? Math.PI : 0.0;
                adjacent = wallDistanceY;
            } else if (testDistanceX < 0 && testDistanceX <= testDistanceY) {
                angle = testX < 18.0 ? 3.0 * Math.PI / 2.0 : Math.PI / 2.0;
                adjacent = wallDistanceX;
            }
            if (adjacent < 0) {
                if (-adjacent > wallStick) {
                    wallStick += -adjacent;
                }
                angle += Math.PI - orientation * (Math.abs(Math.acos(-adjacent / wallStick)) - 5e-4);
            } else {
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

package hadur117.utils;

import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import robocode.Rules;
import robocode.util.Utils;

public class MovementPredictor {

    private static final double HALF_PI = Math.PI / 2;
    private static final double QUARTER_PI = Math.PI / 4;
    private static final int PRECISE_MEA_ITERATIONS = 3;

    private final BattleField battleField;
    private final Rectangle2D.Double rect;

    public MovementPredictor(BattleField battleField) {
        this.battleField = battleField;
        this.rect = battleField.rectangle;
    }

    public RobotState predict(RobotState startState, double distance, double turn,
                              double maxVelocity, long ticks, boolean ignoreWalls) {
        RobotState state = startState;
        for (long t = 0; t < ticks; t++) {
            double nextHeading = state.heading;
            double maxTurnRate = Math.abs(Rules.getTurnRateRadians(state.velocity));
            if (Math.abs(turn) < maxTurnRate) {
                nextHeading += turn;
                turn = 0;
            } else {
                double turnAmount = maxTurnRate * Math.signum(turn);
                nextHeading += turnAmount;
                turn -= turnAmount;
            }

            double nextVelocity = getNewVelocity(state.velocity, distance, maxVelocity);
            distance -= nextVelocity;
            Point2D.Double nextLocation = DiaUtils.project(state.location, nextHeading, nextVelocity);

            if (!ignoreWalls && !rect.contains(nextLocation)) {
                adjustForWalls(nextLocation, nextHeading);
            }

            state = RobotState.newBuilder()
                .setLocation(nextLocation).setHeading(nextHeading)
                .setVelocity(nextVelocity).setTime(state.time + 1)
                .build();
        }
        return state;
    }

    private void adjustForWalls(Point2D.Double location, double heading) {
        double xOut = Math.min(0, rect.getMaxX() - location.x);
        double yOut = Math.min(0, rect.getMaxY() - location.y);
        if (xOut == 0) xOut = Math.max(0, rect.getMinX() - location.x);
        if (yOut == 0) yOut = Math.max(0, rect.getMinY() - location.y);

        double xOffset = xOut;
        double yOffset = yOut;

        double h = heading;
        while (h < 0) h += Math.PI * 2;

        if (h % QUARTER_PI != 0) {
            double tanH = Math.tan(h);
            if (Math.abs(xOut) > 0) yOffset = xOut / tanH;
            if (Math.abs(yOut) > 0) xOffset = yOut * tanH;
            if (Math.abs(yOut) > Math.abs(yOffset)) yOffset = yOut;
            if (Math.abs(xOut) > Math.abs(xOffset)) xOffset = xOut;
        }
        location.x += xOffset;
        location.y += yOffset;
    }

    double getNewVelocity(double velocity, double distance, double maxVelocity) {
        if (distance < 0) {
            return -getNewVelocity(-velocity, -distance, maxVelocity);
        }
        double goalVel = (distance == Double.POSITIVE_INFINITY)
            ? maxVelocity
            : Math.min(getMaxVelocity(distance), maxVelocity);
        if (velocity >= 0) {
            return DiaUtils.limit(velocity - 2.0, goalVel, velocity + 1.0);
        }
        return DiaUtils.limit(velocity - 1.0, goalVel, velocity + maxDecel(-velocity));
    }

    private double getMaxVelocity(double distance) {
        double decelTime = Math.max(1, Math.ceil((Math.sqrt(4.0 * distance + 1.0) - 1.0) / 2.0));
        double decelDist = decelTime / 2.0 * (decelTime - 1.0) * 2.0;
        return (decelTime - 1.0) * 2.0 + (distance - decelDist) / decelTime;
    }

    private double maxDecel(double velocity) {
        velocity = Math.abs(velocity);
        if (velocity > 2.0) return 2.0;
        double tickFractionDecel = velocity / 2.0;
        double tickFractionAccel = 1.0 - tickFractionDecel;
        return tickFractionDecel * 2.0 + tickFractionAccel * 1.0;
    }

    public Point2D.Double nextLocation(RobotState robotState) {
        return new Point2D.Double(
            robotState.location.x + Math.sin(robotState.heading) * robotState.velocity,
            robotState.location.y + Math.cos(robotState.heading) * robotState.velocity);
    }

    public RobotState nextPerpendicularLocation(RobotState robotState, double absBearing,
            int orientation, double attackAngle, boolean ignoreWallHits) {
        return nextPerpendicularWallSmoothedLocation(robotState, absBearing,
            8.0, attackAngle, orientation, 0, ignoreWallHits);
    }

    public RobotState nextPerpendicularWallSmoothedLocation(RobotState robotState,
            double absBearing, double maxVelocity, double attackAngle,
            int orientation, double wallStick, boolean ignoreWallHits) {
        double goAngle = Utils.normalRelativeAngle(
            absBearing + orientation * (HALF_PI + attackAngle));
        if (wallStick != 0) {
            goAngle = battleField.wallSmoothing(robotState.location, goAngle, orientation, wallStick);
        }
        return nextLocation(robotState, maxVelocity, goAngle, ignoreWallHits);
    }

    public RobotState nextLocation(RobotState robotState, double maxVelocity,
                                    double goAngle, boolean ignoreWallHits) {
        double futureTurn = Utils.normalRelativeAngle(goAngle - robotState.heading);
        double futureDistance;
        if (Math.abs(futureTurn) > HALF_PI) {
            futureTurn -= Math.signum(futureTurn) * Math.PI;
            futureDistance = -1000;
        } else {
            futureDistance = 1000;
        }
        return predict(robotState, futureDistance, futureTurn, maxVelocity, 1, ignoreWallHits);
    }

    public MaxEscapeTarget preciseEscapeAngle(int predictDirection,
            Point2D.Double sourceLocation, long fireTime, double bulletSpeed,
            RobotState startState, double wallStick) {
        return preciseEscapeAngle(predictDirection, sourceLocation, fireTime,
            bulletSpeed, startState, 0, wallStick);
    }

    public MaxEscapeTarget preciseEscapeAngle(int predictDirection,
            Point2D.Double sourceLocation, long fireTime, double bulletSpeed,
            RobotState startState, double attackAngle, double wallStick) {
        double absBearing = DiaUtils.absoluteBearing(sourceLocation, startState.location);
        MaxEscapeTarget straightTarget = straightPreciseEscapeAngle(
            predictDirection, absBearing, sourceLocation, fireTime,
            bulletSpeed, startState, attackAngle);

        MaxEscapeTarget smoothTarget = null;
        if (straightTarget.hitWall) {
            smoothTarget = smoothingPreciseEscapeAngle(
                predictDirection, absBearing, sourceLocation, fireTime,
                bulletSpeed, startState, attackAngle, wallStick, PRECISE_MEA_ITERATIONS);
        }
        if (smoothTarget != null && smoothTarget.angle > straightTarget.angle) {
            return smoothTarget;
        }
        return straightTarget;
    }

    MaxEscapeTarget straightPreciseEscapeAngle(int predictDirection, double absBearing,
            Point2D.Double sourceLocation, long fireTime, double bulletSpeed,
            RobotState startState, double attackAngle) {
        RobotState predictedState = startState;
        boolean hitWall = false;
        boolean wavePassed = false;
        do {
            predictedState = nextPerpendicularLocation(
                predictedState, absBearing, predictDirection, attackAngle, true);
            if (!rect.contains(predictedState.location)) {
                hitWall = true;
            } else if (wavePassed(sourceLocation, fireTime, bulletSpeed, predictedState)) {
                wavePassed = true;
            }
        } while (!hitWall && !wavePassed);

        Point2D.Double meaLocation = battleField.translateToField(predictedState.location);
        double escapeAngle = predictDirection * Utils.normalRelativeAngle(
            DiaUtils.absoluteBearing(sourceLocation, meaLocation) - absBearing);
        return new MaxEscapeTarget(escapeAngle, meaLocation, predictedState.time, hitWall);
    }

    MaxEscapeTarget smoothingPreciseEscapeAngle(int predictDirection, double absBearing,
            Point2D.Double sourceLocation, long fireTime, double bulletSpeed,
            RobotState startState, double attackAngle, double wallStick, int iterations) {
        MaxEscapeTarget best = new MaxEscapeTarget(0, startState.location, startState.time, false);
        double goAngle = absBearing + predictDirection * (HALF_PI + attackAngle);
        goAngle = battleField.wallSmoothing(startState.location, goAngle, predictDirection, wallStick);

        for (int x = 0; x < iterations; x++) {
            RobotState predictedState = startState;
            boolean wavePassed = false;
            do {
                predictedState = nextLocation(predictedState, 8.0, goAngle, true);
                if (wavePassed(sourceLocation, fireTime, bulletSpeed, predictedState)) {
                    wavePassed = true;
                } else {
                    goAngle = battleField.wallSmoothing(
                        predictedState.location, goAngle, predictDirection, wallStick);
                }
            } while (!wavePassed);

            Point2D.Double loc = battleField.translateToField(predictedState.location);
            double thisAngle = predictDirection * Utils.normalRelativeAngle(
                DiaUtils.absoluteBearing(sourceLocation, loc) - absBearing);
            if (thisAngle > best.angle) {
                best = new MaxEscapeTarget(thisAngle, loc, predictedState.time, false);
            }
            if (x + 1 < iterations) {
                goAngle = DiaUtils.absoluteBearing(startState.location, loc);
            }
        }
        return best;
    }

    private boolean wavePassed(Point2D.Double sourceLocation, long fireTime,
                               double bulletSpeed, RobotState enemyState) {
        double threshold = bulletSpeed * (enemyState.time - fireTime) + bulletSpeed;
        return enemyState.location.distanceSq(sourceLocation) <
            DiaUtils.square(threshold) * Math.signum(threshold);
    }
}

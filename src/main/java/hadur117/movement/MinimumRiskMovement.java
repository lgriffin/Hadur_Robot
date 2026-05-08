package hadur117.movement;

import hadur117.intel.Brain;
import hadur117.model.OpponentData;
import robocode.AdvancedRobot;
import robocode.util.Utils;
import java.awt.geom.*;

/**
 * Minimum-risk movement for melee (free-for-all) battles.
 *
 * <p>Evaluates 24 directions × 3 distances (100/175/250 px) every 30 ticks. Risk per
 * candidate point sums {@code energy / distance²} for each alive enemy, with penalties
 * for close range, walls, corners, and staying in place. A lateral-angle bonus rewards
 * perpendicular positioning relative to enemies.</p>
 */
public class MinimumRiskMovement {

    private static final double MAX_VELOCITY = 8.0;
    private static final double WALL_MARGIN = 18.0;

    private double fieldWidth, fieldHeight;
    private Rectangle2D.Double fieldRect;

    private Point2D.Double destination;
    private long destTime = -1;

    public void init(double bfWidth, double bfHeight) {
        fieldWidth = bfWidth;
        fieldHeight = bfHeight;
        fieldRect = new Rectangle2D.Double(WALL_MARGIN, WALL_MARGIN,
                bfWidth - 2 * WALL_MARGIN, bfHeight - 2 * WALL_MARGIN);
        destination = null;
    }

    public void doMinimumRisk(AdvancedRobot robot, Brain brain) {
        Point2D.Double myPos = new Point2D.Double(robot.getX(), robot.getY());
        long time = robot.getTime();

        if (destination != null && myPos.distance(destination) < 20)
            destination = null;

        if (destination == null || time - destTime > 10) {
            destination = findSafestPoint(myPos, robot, brain);
            destTime = time;
        }

        if (destination != null)
            navigateTo(robot, destination);
    }

    private Point2D.Double findSafestPoint(Point2D.Double myPos,
                                            AdvancedRobot robot, Brain brain) {
        double bestRisk = Double.MAX_VALUE;
        Point2D.Double bestPoint = null;

        for (int i = 0; i < 36; i++) {
            double angle = i * (2 * Math.PI / 36);
            for (double dist = 80; dist <= 260; dist += 60) {
                double px = myPos.x + dist * Math.sin(angle);
                double py = myPos.y + dist * Math.cos(angle);
                if (!fieldRect.contains(px, py)) continue;

                Point2D.Double candidate = new Point2D.Double(px, py);
                double risk = calculateRisk(candidate, myPos, robot, brain);
                if (risk < bestRisk) {
                    bestRisk = risk;
                    bestPoint = candidate;
                }
            }
        }
        return bestPoint != null ? bestPoint : myPos;
    }

    private double calculateRisk(Point2D.Double point, Point2D.Double myPos,
                                  AdvancedRobot robot, Brain brain) {
        double risk = 0;
        int nearbyCount = 0;

        for (OpponentData od : brain.getAllOpponents()) {
            if (od.energy <= 0 || robot.getTime() - od.lastScanTick > 30) continue;

            double dist = point.distance(od.x, od.y);
            if (dist < 1) dist = 1;

            double enemyRisk = od.energy / (dist * dist);
            enemyRisk *= (0.5 + od.threatLevel);
            if (dist < 150) enemyRisk *= 3.0;
            else if (dist < 250) enemyRisk *= 1.5;

            double lateralAngle = Math.abs(Math.sin(
                    Math.atan2(od.x - point.x, od.y - point.y)
                  - Math.atan2(point.x - myPos.x, point.y - myPos.y)));
            enemyRisk *= (1.1 - 0.5 * lateralAngle);

            risk += enemyRisk;
            if (dist < 300) nearbyCount++;
        }

        if (nearbyCount >= 2) risk *= 1.0 + 0.3 * nearbyCount;

        double myEnergy = robot.getEnergy();
        if (myEnergy < 15) {
            risk *= 2.5;
        } else if (myEnergy < 30) {
            risk *= 1.5;
        }

        double wallDist = Math.min(
                Math.min(point.x - WALL_MARGIN, fieldWidth - WALL_MARGIN - point.x),
                Math.min(point.y - WALL_MARGIN, fieldHeight - WALL_MARGIN - point.y));
        if (wallDist < 80) risk += 1.0 / Math.max(wallDist, 1);

        double cornerDist = Math.min(
                Math.min(point.distance(0, 0), point.distance(fieldWidth, 0)),
                Math.min(point.distance(0, fieldHeight),
                         point.distance(fieldWidth, fieldHeight)));
        if (cornerDist < 200) risk += 0.5 / Math.max(cornerDist, 1);

        if (myPos.distance(point) < 50) risk += 0.5;

        return risk;
    }

    private void navigateTo(AdvancedRobot robot, Point2D.Double dest) {
        double angle = Math.atan2(dest.x - robot.getX(), dest.y - robot.getY());
        double turn = Utils.normalRelativeAngle(angle - robot.getHeadingRadians());
        double dist = new Point2D.Double(robot.getX(), robot.getY()).distance(dest);

        if (Math.abs(turn) > Math.PI / 2) {
            turn = Utils.normalRelativeAngle(turn + Math.PI);
            dist = -dist;
        }

        robot.setTurnRightRadians(turn);
        robot.setAhead(dist);
        robot.setMaxVelocity(MAX_VELOCITY);
    }
}

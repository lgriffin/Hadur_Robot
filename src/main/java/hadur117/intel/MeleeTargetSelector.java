package hadur117.intel;

import hadur117.model.OpponentData;
import robocode.AdvancedRobot;
import robocode.util.Utils;

/**
 * Target selection for melee (free-for-all) battles.
 *
 * <p>Scores each alive opponent by a weighted sum of energy, distance, and gun-turn
 * angle. A hysteresis factor prevents rapid target switching: the current target is
 * kept unless a new candidate scores significantly better.</p>
 */
public class MeleeTargetSelector {

    private static final double HYSTERESIS = 0.90;
    private String currentTarget;
    private long lastSwitchTime = -1;

    public String selectTarget(AdvancedRobot robot, Brain brain) {
        long time = robot.getTime();
        double myX = robot.getX();
        double myY = robot.getY();
        double gunHeading = robot.getGunHeadingRadians();

        String bestTarget = null;
        double bestScore = Double.MAX_VALUE;

        for (OpponentData od : brain.getAllOpponents()) {
            if (od.energy <= 0) continue;
            if (time - od.lastScanTick > 50) continue;

            double dist = Math.sqrt((od.x - myX) * (od.x - myX)
                                   + (od.y - myY) * (od.y - myY));
            double angle = Math.atan2(od.x - myX, od.y - myY);
            double gunTurn = Math.abs(Utils.normalRelativeAngle(angle - gunHeading));

            double score = od.energy * 1.5 + dist * 0.15
                         + Math.toDegrees(gunTurn) * 0.8;

            if (od.energy == 0) score = -1000;

            if (score < bestScore) {
                bestScore = score;
                bestTarget = od.name;
            }
        }

        if (currentTarget != null && bestTarget != null
                && !bestTarget.equals(currentTarget)) {
            OpponentData current = brain.getOpponent(currentTarget);
            if (current != null && current.energy > 0
                    && time - current.lastScanTick < 50) {
                double currentDist = Math.sqrt(
                        (current.x - myX) * (current.x - myX)
                      + (current.y - myY) * (current.y - myY));
                OpponentData best = brain.getOpponent(bestTarget);
                if (best != null) {
                    double bestDist = Math.sqrt(
                            (best.x - myX) * (best.x - myX)
                          + (best.y - myY) * (best.y - myY));
                    if (bestDist > currentDist * HYSTERESIS) {
                        bestTarget = currentTarget;
                    }
                }
            }
        }

        if (bestTarget != null) {
            currentTarget = bestTarget;
            lastSwitchTime = time;
        }

        return currentTarget;
    }

    public void onRobotDeath(String name) {
        if (name.equals(currentTarget)) currentTarget = null;
    }

    public String getCurrentTarget() {
        return currentTarget;
    }

    public void resetRound() {
        currentTarget = null;
        lastSwitchTime = -1;
    }
}

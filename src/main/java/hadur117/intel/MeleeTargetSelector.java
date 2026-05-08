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

    private static final double HYSTERESIS = 0.75;
    private static final int MIN_SWITCH_INTERVAL = 30;
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

            double score = scoreOpponent(od, myX, myY, gunHeading, brain);

            if (score < bestScore) {
                bestScore = score;
                bestTarget = od.name;
            }
        }

        if (currentTarget != null && bestTarget != null
                && !bestTarget.equals(currentTarget)) {
            OpponentData current = brain.getOpponent(currentTarget);
            boolean currentViable = current != null && current.energy > 0
                    && time - current.lastScanTick < 50;
            if (currentViable) {
                if (time - lastSwitchTime < MIN_SWITCH_INTERVAL) {
                    bestTarget = currentTarget;
                } else {
                    double currentScore = scoreOpponent(current, myX, myY,
                            gunHeading, brain);
                    if (bestScore > currentScore * HYSTERESIS) {
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

    private double scoreOpponent(OpponentData od, double myX, double myY,
                                  double gunHeading, Brain brain) {
        double dist = Math.sqrt((od.x - myX) * (od.x - myX)
                               + (od.y - myY) * (od.y - myY));
        double angle = Math.atan2(od.x - myX, od.y - myY);
        double gunTurn = Math.abs(Utils.normalRelativeAngle(angle - gunHeading));

        double score = od.energy * 0.8 + dist * 0.5
                     + Math.toDegrees(gunTurn) * 0.3;

        double acc = brain.getOurAccuracy(od.name);
        if (acc > 0.20) score *= 0.7;
        else if (acc < 0.05 && od.shotsFiredAt > 10) score *= 1.4;

        return score;
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

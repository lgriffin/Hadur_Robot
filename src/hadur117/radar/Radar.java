package hadur117.radar;

import hadur117.intel.Brain;
import hadur117.model.OpponentData;
import robocode.AdvancedRobot;
import robocode.util.Utils;

public class Radar {

    private boolean lockAcquired = false;

    public void doDuelRadar(AdvancedRobot robot, double absBearing) {
        double radarTurn = Utils.normalRelativeAngle(
                absBearing - robot.getRadarHeadingRadians()) * 2.0;
        robot.setTurnRadarRightRadians(radarTurn);
        lockAcquired = true;
    }

    public void doMeleeRadar(AdvancedRobot robot, Brain brain) {
        OpponentData stalest = brain.getStalestOpponent(robot.getTime());
        if (stalest == null || stalest.lastScanTick < 0) {
            robot.setTurnRadarRightRadians(Double.POSITIVE_INFINITY);
            return;
        }

        double angle = Math.atan2(stalest.x - robot.getX(),
                                   stalest.y - robot.getY());
        double radarTurn = Utils.normalRelativeAngle(
                angle - robot.getRadarHeadingRadians());
        robot.setTurnRadarRightRadians(radarTurn * 1.9);
    }

    public void doMeleeRadarWithGunLock(AdvancedRobot robot, Brain brain,
                                         double gunHeat) {
        if (gunHeat > 0 && gunHeat < 0.3) return;
        doMeleeRadar(robot, brain);
    }

    public void spinRadar(AdvancedRobot robot) {
        robot.setTurnRadarRightRadians(Double.POSITIVE_INFINITY);
    }

    public boolean isLockAcquired() { return lockAcquired; }

    public void resetRound() { lockAcquired = false; }
}

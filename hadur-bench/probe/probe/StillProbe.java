package probe;

import robocode.AdvancedRobot;
import robocode.ScannedRobotEvent;
import robocode.util.Utils;

/** Sits still and fires head-on, to measure how predictable an opponent's aim is at a still target. */
public class StillProbe extends AdvancedRobot {
    public void run() {
        setAdjustGunForRobotTurn(true);
        setAdjustRadarForGunTurn(true);
        while (true) {
            if (getRadarTurnRemainingRadians() == 0) setTurnRadarRightRadians(Double.POSITIVE_INFINITY);
            execute();
        }
    }

    public void onScannedRobot(ScannedRobotEvent e) {
        double abs = getHeadingRadians() + e.getBearingRadians();
        setTurnRadarRightRadians(Utils.normalRelativeAngle(abs - getRadarHeadingRadians()) * 2);
        if (getGunHeat() == 0 && Math.abs(getGunTurnRemainingRadians()) < 0.01) setFire(1.5);
        setTurnGunRightRadians(Utils.normalRelativeAngle(abs - getGunHeadingRadians()));
    }
}

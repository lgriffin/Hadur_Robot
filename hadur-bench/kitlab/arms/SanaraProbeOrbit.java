package hadur117.nano;

import robocode.AdvancedRobot;
import robocode.HitWallEvent;
import robocode.ScannedRobotEvent;
import robocode.util.Utils;

/**
 * Step 0 probe for the Sanara behaviour profile (docs/sanara.md): orbit. All three probes aim head-on
 * at power 2 with a locked radar, so the probes differ only in how they move and the opponent's hit
 * rate on each one measures its gun against that motion. Bench only, never entered.
 */
public class SanaraProbeOrbit extends AdvancedRobot {
    static double enemyEnergy;
    static double dir = 1;

    public void run() {
        setAdjustGunForRobotTurn(true);
        setAdjustRadarForGunTurn(true);
        turnRadarRightRadians(Double.POSITIVE_INFINITY);
    }

    public void onScannedRobot(ScannedRobotEvent e) {
        double absBearing = e.getBearingRadians() + getHeadingRadians();
        setTurnRadarLeftRadians(getRadarTurnRemainingRadians());
        // Orbit: perpendicular at full speed, reversing only on a wall hit.
        setTurnRightRadians(Math.cos(e.getBearingRadians()));
        setAhead(dir * 120);
        setTurnGunRightRadians(Utils.normalRelativeAngle(absBearing - getGunHeadingRadians()));
        setFire(2);
    }

    public void onHitWall(HitWallEvent e) {
        dir = -dir;
    }
}

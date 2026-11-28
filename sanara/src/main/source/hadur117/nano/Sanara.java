package hadur117.nano;

import robocode.AdvancedRobot;
import robocode.HitWallEvent;
import robocode.ScannedRobotEvent;
import robocode.util.Utils;

/**
 * Sanara, a NanoRumble duellist by lgriffin (https://github.com/lgriffin/Hadur_Robot).
 *
 * This is the readable form of the shipped class. The class in the jar is written as bytecode by
 * hadur117.nano.gen.SanaraGen, in 249 bytes, and plays as this source does; javac makes this
 * source about 300 bytes.
 *
 * Radar: the one-call lock. Movement: a perpendicular orbit at full speed, tilted toward 300 px;
 * when the enemy's energy drops (a shot, or Sanara's own hit) it reverses with chance 0.6, unless
 * the enemy is on the orbit list, the bots that the bench found hit a reversing orbit harder than a
 * plain one; it also reverses on a wall hit. Gun: symbolic pattern matching over the enemy's lateral
 * velocity, one character a tick, newest first; the longest recent match of up to 30 ticks is
 * replayed as an angle (the lateral speeds that followed it, summed over the flight and divided by
 * the distance), wrapping back to the match when it reaches the present. Power 800 / distance,
 * which the engine caps at 3.
 *
 * Published techniques used: symbolic pattern matching and the one-call radar lock, both described
 * on the RoboWiki, and reacting to an enemy shot from its energy drop.
 */
public class Sanara extends AdvancedRobot {
    // The bots met with the plain orbit, "name version" joined by |; the build fills it from
    // sanara-orbit.txt.
    static final String ORBIT = "";

    static String h = "\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0";
    static double E;
    static double dir = 600;

    public void run() {
        setAdjustRadarForGunTurn(true);
        turnRadarRightRadians(Double.POSITIVE_INFINITY);
    }

    public void onScannedRobot(ScannedRobotEvent e) {
        setTurnRadarLeftRadians(getRadarTurnRemainingRadians());
        if (E > (E = e.getEnergy()) && ORBIT.indexOf(e.getName()) < 0 && Math.random() < 0.6) {
            dir = -dir;
        }
        double d;
        setTurnRightRadians(Math.cos(e.getBearingRadians() + (300 - (d = e.getDistance())) / dir));
        setAhead(dir);

        double a;
        h = String.valueOf((char) Math.round(e.getVelocity()
            * Math.sin(e.getHeadingRadians() - (a = e.getBearingRadians() + getHeadingRadians())))).concat(h);
        int i;
        int k = 30;
        while ((i = h.indexOf(h.substring(0, k--), 1)) < 0) {
        }
        setFire(800 / d);
        int n = (int) (d / 14);
        double o = 0;
        do {
            n--;
            o += (short) h.charAt(i - 1 - n % i);
        } while (n > 0);
        setTurnGunRightRadians(Utils.normalRelativeAngle(o / d + a - getGunHeadingRadians()));
    }

    public void onHitWall(HitWallEvent e) {
        dir = -dir;
    }
}

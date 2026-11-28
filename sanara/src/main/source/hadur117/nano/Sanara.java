package hadur117.nano;

import robocode.AdvancedRobot;
import robocode.HitWallEvent;
import robocode.ScannedRobotEvent;
import robocode.util.Utils;

/**
 * Sanara, a NanoRumble duellist by lgriffin (https://github.com/lgriffin/Hadur_Robot).
 *
 * This is the readable form of the shipped class. The class in the jar is written as bytecode by
 * hadur117.nano.gen.SanaraGen, in 248 bytes, and plays as this source does; javac makes this
 * source about 300 bytes.
 *
 * Radar: the one-call lock. Movement: a perpendicular orbit at full speed, tilted toward 300 px;
 * when the enemy's energy drops (a shot, or Sanara's own hit) it reverses with a chance set per
 * enemy, from 0 (the plain orbit) to 1, read from the enemy's place in the chance string: an enemy
 * at index i reverses with chance 1 - i / 58000, and one not in it on every shot. It also reverses
 * on a wall hit. Gun: symbolic pattern matching over the enemy's lateral
 * velocity, one character a tick, newest first; the longest recent match of up to 30 ticks is
 * replayed as an angle (the lateral speeds that followed it, summed over the flight and divided by
 * the distance), wrapping back to the match when it reaches the present. Power 800 / distance,
 * which the engine caps at 3.
 *
 * Published techniques used: symbolic pattern matching and the one-call radar lock, both described
 * on the RoboWiki, and reacting to an enemy shot from its energy drop.
 */
public class Sanara extends AdvancedRobot {
    // The chance string: each bot's "name version" placed so that 1 - index / 58000 is its reversal
    // chance, padded with |; the build lays it out from sanara-chance.txt.
    static final String CHANCE = "";

    static String h = "\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0";
    static double E;
    static double dir = 600;

    public void run() {
        setAdjustRadarForGunTurn(true);
        turnRadarRightRadians(Double.POSITIVE_INFINITY);
    }

    public void onScannedRobot(ScannedRobotEvent e) {
        setTurnRadarLeftRadians(getRadarTurnRemainingRadians());
        if (E > (E = e.getEnergy()) && Math.random() * 58000 > CHANCE.indexOf(e.getName())) {
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

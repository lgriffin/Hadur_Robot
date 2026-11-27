package hadur117.nano;

import robocode.AdvancedRobot;
import robocode.HitByBulletEvent;
import robocode.HitWallEvent;
import robocode.ScannedRobotEvent;
import robocode.util.Utils;

/**
 * Sanara 0.0, the over-budget base for the NanoRumble 1v1 screens (docs/sanara.md). Not a release:
 * it is above the 249 B limit on purpose, so the screens decide play before bytes.
 *
 * Movement: a perpendicular orbit at full speed with a distance bias, reversing at random when the
 * enemy's energy drops (a shot) with a chance read by distance, and on a wall hit.
 * Gun: symbolic pattern matching over the enemy's lateral velocity, one character a tick; the
 * longest recent match of up to KEY ticks is replayed as a bearing offset (sum of lateral speeds
 * over the flight, over distance). Power from a table by distance. Radar: one-call lock.
 * Published techniques used: symbolic pattern matching and the radar lock (RoboWiki).
 *
 * Known approximation: any drop in the enemy's energy counts as a shot, including the damage of
 * Sanara's own hits; telling them apart costs bytes the fitted build does not have.
 *
 * Every constant below is a screen knob; the arms change them with sed (kitlab/sanara-arms.txt).
 */
public class Sanara extends AdvancedRobot {
    // Preferred distance (px) and how hard the orbit tilts toward it (px per radian).
    static final double IDEAL = 420;
    static final double TILT = 600;
    // Reversal chance on an enemy shot, x 64, by distance / 100 px (index 0..9, last cell beyond).
    static final String FLIP = "\u0026\u0026\u0026\u0026\u0026\u0026\u0026\u0026\u0026\u0026";
    // Extra chance per tick to reverse with no shot seen (0 = off).
    static final double TICK = 0;
    // Bullet power x 16 by distance / 100 px; the replay takes the matching bullet speed.
    static final String POWER = "\u0030\u0030\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020";
    // Longest pattern key in ticks; REPLAY 1 replays tick by tick, 0 holds the matched tick's speed.
    static final int KEY = 30;
    static final int REPLAY = 1;
    // Longest history kept, in ticks (0 = all of it, across every round).
    static final int CAP = 0;
    // Random aim jitter in radians (0 = off).
    static final double JITTER = 0;

    static String history = "\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0";
    static double enemyEnergy;
    static double dir = 1;
    // BANDIT 1: two movement modes, 0 = reverse on shots as above, 1 = plain orbit (no reversal on
    // shots); each round plays the mode with less bullet power taken per tick so far (each mode is
    // tried once first). 0 = off: always mode 0.
    static final int BANDIT = 0;
    // With BANDIT, each round first scales both modes' tallies by DECAY, so later rounds weigh more.
    static final double DECAY = 1;
    static double[] taken = new double[2];
    static double[] seen = new double[2];
    static int mode;

    public void run() {
        setAdjustGunForRobotTurn(true);
        setAdjustRadarForGunTurn(true);
        if (BANDIT == 1) {
            taken[0] *= DECAY;
            taken[1] *= DECAY;
            seen[0] *= DECAY;
            seen[1] *= DECAY;
            mode = seen[0] == 0 ? 0 : seen[1] == 0 ? 1
                : taken[0] / seen[0] <= taken[1] / seen[1] ? 0 : 1;
        }
        turnRadarRightRadians(Double.POSITIVE_INFINITY);
    }

    public void onScannedRobot(ScannedRobotEvent e) {
        double distance = e.getDistance();
        int band = Math.min(9, (int) (distance / 100));
        double absBearing = e.getBearingRadians() + getHeadingRadians();
        setTurnRadarLeftRadians(getRadarTurnRemainingRadians());

        // Movement.
        if (BANDIT == 1) {
            seen[mode]++;
        }
        if ((enemyEnergy > (enemyEnergy = e.getEnergy()) && mode == 0 && Math.random() * 64 < FLIP.charAt(band))
                || Math.random() < TICK) {
            dir = -dir;
        }
        setTurnRightRadians(Math.cos(e.getBearingRadians() + dir * (IDEAL - distance) / TILT));
        setAhead(dir * 120);

        // Gun.
        history = (char) Math.round(e.getVelocity() * Math.sin(e.getHeadingRadians() - absBearing)) + history;
        if (CAP > 0 && history.length() > CAP) {
            history = history.substring(0, CAP);
        }
        int i;
        int k = KEY;
        while ((i = history.indexOf(history.substring(0, k--), 1)) < 0) {
        }
        double power = POWER.charAt(band) / 16.0;
        int ticks = (int) (distance / (20 - 3 * power));
        double offset = 0;
        if (REPLAY == 1) {
            // The match at i means the history repeats with period i, so the replay wraps back to
            // i - 1 when it reaches the present instead of stopping short of the flight time.
            for (int j = i; ticks-- > 0; ) {
                if (--j < 0) {
                    j = i - 1;
                }
                offset += (short) history.charAt(j);
            }
        } else {
            offset = (short) history.charAt(i - 1) * ticks;
        }
        setTurnGunRightRadians(Utils.normalRelativeAngle(absBearing - getGunHeadingRadians()
            + offset / distance + (Math.random() - 0.5) * JITTER));
        setFire(power);
    }

    public void onHitByBullet(HitByBulletEvent e) {
        if (BANDIT == 1) {
            taken[mode] += e.getPower();
        }
    }

    public void onHitWall(HitWallEvent e) {
        dir = -dir;
    }
}

package hadur117.nano;

import robocode.AdvancedRobot;
import robocode.RobotDeathEvent;
import robocode.ScannedRobotEvent;
import robocode.util.Utils;

/**
 * Sanaro, a NanoMelee robot (docs/sanaro.md): anti-gravity from where each robot is about to be,
 * with a radar that sweeps while the gun cools and flips on the target once it is nearly ready, a
 * target held by name until a nearer robot shows or any robot dies, a flat lead of its own, a gun
 * that fires only once it is on the lead, and power 2 in a band that doubles as range halves. The
 * anti-gravity, the fire gate and the held target come from the open DustBunny, Quantum and
 * NaturalScience line (Quantum by d414 holds its target the same way); the lead, the band and the
 * radar's threshold are Sanaro's. One class within NanoMelee's 249 bytes (SANARO-1).
 */
public class Sanaro extends AdvancedRobot {
    // The field's memory from one scan to the next (SANARO-3).
    static final double DECAY = 0.9;
    // Drive: ahead this far less the turn still to make, in degrees; backwards past it (SANARO-4).
    static final double AHEAD = 120;
    // The lead: lateral velocity over LEAD at every range (SANARO-7), Sanaro's own.
    static final double LEAD = 16;
    // The fire gate: fire only when the gun is within GATE / distance radians of the lead (SANARO-14).
    static final int GATE = 18;
    // Below this gun heat each scan of the target flips the radar (SANARO-6).
    static final double LOCK = 0.9;
    // Power: 2 times the integer BAND / distance, so 0 (the engine's 0.1) past BAND px, 2 out to
    // BAND / 2 and the engine's 3 closer (SANARO-8).
    static final int BAND = 480;

    // The target's name and its distance at its last scan; no target holds while range is at its
    // most (SANARO-5).
    static String target;
    static int range;
    static double fx, fy;

    public void run() {
        setAdjustGunForRobotTurn(true);
        setTurnRadarRight(Double.POSITIVE_INFINITY);
        range = Integer.MAX_VALUE;
    }

    public void onScannedRobot(ScannedRobotEvent e) {
        int d;
        double aim;
        // aim holds the bearing until the lead has read it (one local slot fewer).
        setTurnRightRadians(Utils.normalRelativeAngle(Math.atan2(
            (fx = fx * DECAY - Math.sin(aim = (aim = e.getBearingRadians() + getHeadingRadians())
                + e.getVelocity() / LEAD
                * Math.sin(e.getHeadingRadians() - aim)) / (d = (int) e.getDistance())) + wall(getX()),
            (fy = fy * DECAY - Math.cos(aim) / d) + wall(getY()))
            - getHeadingRadians()));
        setAhead(AHEAD - Math.abs(getTurnRemaining()));
        // The held target, or any robot nearer than it was (SANARO-5).
        if (!(e.getName() != target && d >= range)) {
            target = e.getName();
            setTurnRadarRight((getGunHeat() - LOCK) * getRadarTurnRemaining());
            setTurnGunRightRadians(aim = Utils.normalRelativeAngle(aim - getGunHeadingRadians()));
            // |aim| < GATE / d in integers: the shot leaves along the gun as it stands (SANARO-14).
            if ((int) (aim * (range = d)) / GATE == 0)
                setFire(BAND / d << 1);
        }
    }

    // Any robot's death frees the target: the next robot scanned takes it (SANARO-5).
    public void onRobotDeath(RobotDeathEvent e) {
        range = Integer.MAX_VALUE;
    }

    // The wall's push on one axis of the 1000 px MeleeRumble field.
    static double wall(double v) {
        return 1 / v - 1 / (1000 - v);
    }
}

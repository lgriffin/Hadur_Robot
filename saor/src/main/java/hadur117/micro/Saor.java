package hadur117.micro;

import java.awt.geom.Point2D;
import robocode.AdvancedRobot;
import robocode.HitRobotEvent;
import robocode.RobotDeathEvent;
import robocode.Rules;
import robocode.ScannedRobotEvent;
import robocode.StatusEvent;
import robocode.util.Utils;

/**
 * Saor (Irish for free), a MicroMelee entry: the micro adapter, and the class that ships.
 *
 * <p>The behaviour is specified by the pure core in {@code hadur117.micro.core} and its tests.
 * This class is that core flattened by hand into Figment's shape, because a core inlined by
 * ProGuard measured 914 bytes against the 749 limit: every inlined call stores its arguments
 * into fresh locals and every boolean is materialised. {@code SaorEquivalenceTest} drives this
 * class and the bench adapter {@link SaorLab}, which calls the core, with the same events and
 * requires the same orders (SAOR-15), on the compiled class and on the shipped jar. ProGuard
 * still runs over it as a peephole pass, and the build fails above 749 bytes (SAOR-11).</p>
 *
 * <p>Byte idioms, each mirrored in the core and listed in docs/saor.md: statics over fields;
 * the axis toggles with {@code ^= 1} so it needs no initialiser; a collision takes the rammer as target at
 * distance -12.5, which makes the leg 50 px until the target is next scanned (SAOR-9);
 * the end-game cap is {@code others / 3 + 1.9}; 1024 angle bins wrap with {@code & 1023};
 * one catch absorbs a full Markov row and an out-of-range state.</p>
 */
public class Saor extends AdvancedRobot {

    /** Per-opponent Markov rows: [name hash][state][successors..., count]; chars keep it at 75 MB. */
    static char[][][] markov = new char[512][579][127];
    static String targetName;
    static double targetDistance;
    static double targetVelocity;
    static double targetHeading;
    static int targetState;
    static double myX;
    static double myY;
    static int axis;

    @Override
    public void run() {
        setAdjustGunForRobotTurn(true);
        onRobotDeath(null);
    }

    /** Corner oscillation, every tick (SAOR-1). */
    @Override
    public void onStatus(StatusEvent e) {
        if (getDistanceRemaining() == 0) {
            axis ^= 1;
        }
        int x = 55 + (int) (targetDistance / 2.5);
        int y = 25;
        if (axis > 0) {
            y = x;
            x = 25;
        }
        if ((myX = getX()) > 500) {
            x = 1000 - x;
        }
        if ((myY = getY()) > 500) {
            y = 1000 - y;
        }
        double turn;
        setTurnRightRadians(Math.tan(turn = Math.atan2(x - myX, y - myY) - getHeadingRadians()));
        setAhead(Math.cos(turn) * Point2D.distance(myX, myY, x, y));
    }

    @Override
    public void onScannedRobot(ScannedRobotEvent e) {
        String name = e.getName();
        double distance;
        double velocity;
        double power;
        double bearing = getHeadingRadians() + e.getBearingRadians();
        // Nearest, sticky by name (SAOR-3).
        if ((distance = e.getDistance()) < targetDistance || name == targetName) {
            targetName = name;
            // Hold the radar while the gun is about to fire (SAOR-5).
            if (getGunHeat() < 1) {
                setTurnRadarRightRadians(Double.POSITIVE_INFINITY * Math.sin(bearing - getRadarHeadingRadians()));
            }
            // Power by range, capped at 1.9 below three opponents (SAOR-8); fire only on target (SAOR-10).
            power = Math.min(getOthers() / 3 + 1.9, Math.log10(getEnergy()) * 325 / (targetDistance = distance));
            if (getGunTurnRemaining() == 0) {
                setFire(power);
            }
            int state = (int) Math.signum((velocity = e.getVelocity()) - targetVelocity) + 1
                + ((int) (8.5 + velocity) << 2)
                + ((int) (-2 * Utils.normalRelativeAngle(targetHeading - (targetHeading = e.getHeadingRadians()))
                    / Rules.getTurnRateRadians(targetVelocity) + 2.5) << 7);
            try {
                char[][] table = markov[name.hashCode() & 511];
                int[] bins = new int[1024];
                int best = 0;
                int i = 0;
                do {
                    double px = myX + Math.sin(bearing) * distance;
                    double py = myY + Math.cos(bearing) * distance;
                    double h = targetHeading;
                    double v = velocity;
                    int id = state;
                    int ticks = 1;
                    int weight = 100;
                    int n;
                    do {
                        // A row of 8 or more is sampled (SAOR-7); a colder one holds the state,
                        // which is circular projection (SAOR-6).
                        if ((n = table[id][126]) >= 8) {
                            id = table[id][(int) (Math.random() * n) % 126];
                        } else {
                            weight = 5;
                        }
                        if (Math.max(Math.abs((px += Math.sin(h += ((id >> 7) - 2) * Rules.getTurnRateRadians(v) / 2)
                                * (v = ((id >> 2) & 31) - 8)) - 500), Math.abs((py += Math.cos(h) * v) - 500)) > 482.5) {
                            weight = 1;
                        }
                    } while (++ticks * Rules.getBulletSpeed(power) < Math.hypot(px - myX, py - myY));
                    int k = -4;
                    int b;
                    do {
                        if ((bins[b = (int) (Math.atan2(px - myX, py - myY) * (512 / Math.PI)) + k & 1023]
                                += weight + 1 / (Math.abs(k) + 1)) > bins[best]) {
                            best = b;
                        }
                    } while (++k <= 4);
                } while (++i < 64);
                setTurnGunRightRadians(Utils.normalRelativeAngle(best * (Math.PI / 512) - getGunHeadingRadians()));
                if (getGunHeat() < 0.7) {
                    char[] row;
                    (row = table[targetState])[row[126]++] = (char) state;
                }
            } catch (Exception ex) {
            }
            targetState = state;
            targetVelocity = velocity;
        }
    }

    /** Any death frees the target and the radar (SAOR-4). */
    @Override
    public void onRobotDeath(RobotDeathEvent e) {
        setTurnRadarRightRadians(targetDistance = Double.POSITIVE_INFINITY);
    }

    /**
     * A collision makes the robot hit the target and shortens the leg to 50 px until the
     * rammer's next scan (SAOR-9). Taking its name keeps the gun alive: no scan is nearer
     * than -12.5, so without it a ram before the first lock would leave no target at all.
     */
    @Override
    public void onHitRobot(HitRobotEvent e) {
        targetName = e.getName();
        targetDistance = -12.5;
    }
}

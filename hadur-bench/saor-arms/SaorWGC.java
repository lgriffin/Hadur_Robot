package hadur117.micro;

import java.awt.geom.Point2D;
import robocode.AdvancedRobot;
import robocode.BulletHitEvent;
import robocode.HitByBulletEvent;
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
 * <p>Credit: this arm is built on Saor 0.3, which restates Figment 1.0 by Kevin Clark (Kev),
 * kc.micro.Figment (source in its jar, no licence stated). In this arm the play-it-forward
 * playout and the shape of the Markov state are still Figment's design; the speed is kept in
 * 2 px/tick steps. The movement (corner-wall legs whose depth follows the robot most likely aiming at us), the vote width, the target rule and the
 * expected-gain power rule are our own, written for the 0.4 plan (docs/plan-saor-first.md).</p>
 *
 * <p>Byte idioms, each mirrored in the core and listed in docs/saor.md: statics over fields;
 * the axis toggles with {@code ^= 1} so it needs no initialiser; 1024 angle bins wrap with
 * {@code & 1023}; one catch absorbs a full Markov row and an out-of-range state. 0.2 has no collision handler: the ram leg of 0.1
 * (SAOR-9, retired) measured level and its bytes pay for the graded vote (SAOR-7).</p>
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
    /** Last seen position and energy of every robot, by name hash (0 energy once dead or unseen). */
    static double[] seenX = new double[512], seenY = new double[512], seenE = new double[512];
    static double[] shots = new double[512], hits = new double[512];
    static double targetScore;
    static Point2D.Double goal = new Point2D.Double();
    static double targetBearing;
    /** The robot that last hit us (null until one does), and its range at its latest scan. */
    static String threat;
    static double threatRange = 300;
    static int dir = 1;

    @Override
    public void run() {
        setAdjustGunForRobotTurn(true);
        java.util.Arrays.fill(seenE, 0);
        onRobotDeath(null);
    }

    /**
     * WTA, Saor's own movement (0.4 candidate, docs/bench/saor-0.4-own-parts.md). In the crowd: legs
     * between the two walls of the corner we are in, 25 off the wall, crossing to the other wall at
     * each leg end; the depth along the wall is recomputed every tick as half the range of the
     * nearest robot whose own nearest robot is us (the one most likely aiming at us), else of the
     * robot that last hit us, else of the nearest, at most 260. From two robots left: an orbit,
     * perpendicular to the target and edging to 300 away, reversing at the walls and at random
     * about every 25 ticks.
     */
    @Override
    public void onStatus(StatusEvent e) {
        myX = getX();
        myY = getY();
        if (getOthers() < 3) {
            if (Math.random() < 0.04) {
                dir = -dir;
            }
            double a = targetBearing + dir * (Math.PI / 2 - (targetDistance > 300 ? 0.3 : -0.3));
            double x = myX + Math.sin(a) * 120;
            double y = myY + Math.cos(a) * 120;
            if (x < 40 || y < 40 || x > 960 || y > 960) {
                dir = -dir;
            }
            goal.setLocation(x, y);
        } else {
            if (getDistanceRemaining() == 0) {
                axis ^= 1;
            }
            // The nearest robot whose own nearest robot is us.
            double aim = Double.POSITIVE_INFINITY;
            for (int i = 0; i < 512; i++) {
                if (seenE[i] > 0) {
                    double d = Point2D.distance(myX, myY, seenX[i], seenY[i]);
                    boolean ours = d < aim;
                    for (int j = 0; ours && j < 512; j++) {
                        if (j != i && seenE[j] > 0
                                && Point2D.distance(seenX[i], seenY[i], seenX[j], seenY[j]) < d) {
                            ours = false;
                        }
                    }
                    if (ours) {
                        aim = d;
                    }
                }
            }
            double x = Math.min(260, (aim < 1e9 ? aim : threat == null ? targetDistance : threatRange) / 2);
            double y = 25;
            if (axis > 0) {
                y = x;
                x = 25;
            }
            goal.setLocation(myX > 500 ? 1000 - x : x, myY > 500 ? 1000 - y : y);
        }
        double turn;
        setTurnRightRadians(Math.tan(turn = Math.atan2(goal.x - myX, goal.y - myY) - getHeadingRadians()));
        setAhead(Math.cos(turn) * Point2D.distance(myX, myY, goal.x, goal.y));
    }

    @Override
    public void onScannedRobot(ScannedRobotEvent e) {
        String name = e.getName();
        double distance;
        double velocity;
        double power;
        double bearing = getHeadingRadians() + e.getBearingRadians();
        int hh = name.hashCode() & 511;
        seenX[hh] = myX + Math.sin(bearing) * e.getDistance();
        seenY[hh] = myY + Math.cos(bearing) * e.getDistance();
        seenE[hh] = e.getEnergy() + 20;
        if (name.equals(threat)) {
            threatRange = e.getDistance();
        }
        double score = (distance = e.getDistance()) * (shots[hh] + 6) / (hits[hh] + 2);
        if (score < targetScore || name == targetName) {
            targetName = name;
            targetScore = score;
            targetBearing = bearing;
            // Hold the radar while the gun is about to fire (SAOR-5).
            if (getGunHeat() < 1) {
                setTurnRadarRightRadians(Double.POSITIVE_INFINITY * Math.sin(bearing - getRadarHeadingRadians()));
            }
            // Fire only on target (SAOR-10).
            // Power for the best expected energy gain: hit chance taken as k (20 - 3p) / d, with k from
            // this robot's hit rate at a typical 400 px; gain k (20 - 3p) 7p / d - p peaks at
            // p = (20 - d / 7k) / 6, held to [0.1, 3] and a sixth of our energy.
            double hr = (hits[hh] + 1) / (shots[hh] + 4) * 400 / 17;
            power = Math.max(0.1, Math.min(Math.min(3, getEnergy() / 6), (20 - (targetDistance = distance) / (7 * hr)) / 6));
            if (getGunTurnRemaining() == 0 && setFireBullet(power) != null) {
                shots[hh]++;
            }
            int state = (int) Math.signum((velocity = e.getVelocity()) - targetVelocity) + 1
                + ((int) (4.5 + velocity / 2) << 3)
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
                        // A row with a sample is sampled; under 8 samples the playout's vote falls
                        // to 5 + 12 a sample of its thinnest row (SAOR-7). An empty row holds the
                        // state, which is circular projection (SAOR-6).
                        if ((n = table[id][126]) > 0) {
                            id = table[id][(int) (Math.random() * n) % 126];
                        } if (n < 8) {
                            weight = Math.min(weight, n * 12 + 5);
                        }
                        if (Math.max(Math.abs((px += Math.sin(h += ((id >> 7) - 2) * Rules.getTurnRateRadians(v) / 2)
                                * (v = ((id >> 2) & 31) - 8)) - 500), Math.abs((py += Math.cos(h) * v) - 500)) > 482.5) {
                            weight = 1;
                        }
                    } while (++ticks * Rules.getBulletSpeed(power) < Math.hypot(px - myX, py - myY));
                    int kk = Math.min(8, 2 + ticks / 8);
                    int k = -kk;
                    int b;
                    do {
                        if ((bins[b = (int) (Math.atan2(px - myX, py - myY) * (512 / Math.PI)) + k & 1023]
                                += weight + 1 / (Math.abs(k) + 1)) > bins[best]) {
                            best = b;
                        }
                    } while (++k <= kk);
                } while (++i < 64);
                setTurnGunRightRadians(Utils.normalRelativeAngle(best * (Math.PI / 512) - getGunHeadingRadians()));
                char[] row;
                (row = table[targetState])[row[126]++] = (char) state;
            } catch (Exception ex) {
            }
            targetState = state;
            targetVelocity = velocity;
        }
    }

    /** Any death frees the target and the radar (SAOR-4). */
    @Override
    public void onHitByBullet(HitByBulletEvent e) {
        threat = e.getName();
    }

    @Override
    public void onBulletHit(BulletHitEvent e) {
        hits[e.getName().hashCode() & 511]++;
    }

    @Override
    public void onRobotDeath(RobotDeathEvent e) {
        if (e != null && e.getName().equals(threat)) {
            threat = null;
        }
        setTurnRadarRightRadians(targetScore = targetDistance = Double.POSITIVE_INFINITY);
        if (e != null) {
            seenE[e.getName().hashCode() & 511] = 0;
        }
    }
}

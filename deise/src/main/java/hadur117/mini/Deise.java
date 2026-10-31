package hadur117.mini;

import java.awt.geom.Point2D;
import robocode.AdvancedRobot;
import robocode.RobotDeathEvent;
import robocode.Rules;
import robocode.ScannedRobotEvent;
import robocode.util.Utils;

/**
 * Deise (the Déise, Waterford's people), a MiniMelee entry: Saor's graded Markov gun, learning
 * every robot it scans, over a least-risk movement that steps off the lines of the shots it sees
 * fired and keeps furthest from the robots likely aiming at it (docs/deise.md).
 *
 * <p>This is the class that ships: the core ({@code hadur117.mini.core}) flattened by hand into
 * one class to fit MiniMelee's 1,499 bytes, as Saor is. {@code DeiseEquivalenceTest} drives it
 * and the bench adapter {@link DeiseLab}, which calls the core, with the same events and
 * requires the same orders (DEISE-16). 0.4 is stage E3b's FAP: 0.3 without the field cap on
 * power, the test of whether an opponent likely aims at Deise made at every scan and kept as its
 * weight (1, or 0.25 when another robot is nearer it), which weighs its waves and its push,
 * 106,667 + 213,333 x weight (docs/deise.md section 8).</p>
 */
public class Deise extends AdvancedRobot {

    /**
     * Per-opponent Markov rows: [id][state][successors..., count], kept across rounds (DEISE-6). Ids
     * start at 1, so slot 0 is what an unseen robot's death clears.
     */
    static char[][][] markov = new char[17][579][127];
    /** Per opponent: last scan time, heading, velocity, state. */
    static double[][] last = new double[17][4];
    static int[] ids = new int[1 << 18];
    static int seen;
    /** Live opponents this round, {x, y, energy, weight}. */
    static double[][] bots;
    static double[][] waves;
    static int wave;
    static int target;
    static double targetDistance;

    @Override
    public void run() {
        setAdjustGunForRobotTurn(true);
        setAdjustRadarForGunTurn(true);
        bots = new double[17][];
        waves = new double[64][];
        setTurnRadarRightRadians(targetDistance = Double.POSITIVE_INFINITY);
        // Declared first so they take local slots 1 to 4, which have one-byte loads and stores:
        // the risk loops read them most (docs/bench/kitlab-priors.md).
        double[] o;
        int k;
        double r;
        while (true) {
            double myX = getX();
            double myY = getY();
            // The least-risk point of a ring of 36 (DEISE-1).
            double reach = Math.max(36, Math.min(160, targetDistance * 0.45));
            double bestX = myX;
            double bestY = myY;
            double best = Double.POSITIVE_INFINITY;
            double px;
            double py;
            double h;
            double t = getTime();
            int i = 0;
            do {
                if (!out(px = myX + Math.sin(r = i * (2 * Math.PI / 36)) * reach,
                        py = myY + Math.cos(r) * reach)) {
                    // Away from every opponent (DEISE-2), off the lines of shots seen fired (DEISE-5).
                    r = 0;
                    for (k = 0; k < 17; k++) {
                        if ((o = bots[k]) != null) {
                            r += (106667 + 213333 * o[3]) / Point2D.distanceSq(px, py, o[0], o[1]);
                        }
                    }
                    for (k = 0; k < 64; k++) {
                        if ((o = waves[k]) != null && (t - o[2]) * o[3] < (h = Point2D.distance(px, py, o[0], o[1])) + 30) {
                            for (int j = 4; j < 6; j++) {
                                r += o[6] * 4000 / (800 + Point2D.distanceSq(px, py, o[0] + Math.sin(o[j]) * h, o[1] + Math.cos(o[j]) * h));
                            }
                        }
                    }
                    if (r < best) {
                        best = r;
                        bestX = px;
                        bestY = py;
                    }
                }
            } while (++i < 36);
            setTurnRightRadians(Math.tan(r = Math.atan2(bestX - myX, bestY - myY) - getHeadingRadians()));
            setAhead(Math.cos(r) * reach);
            execute();
        }
    }

    @Override
    public void onScannedRobot(ScannedRobotEvent e) {
        int code;
        int id;
        double bearing;
        double distance;
        double x;
        double y;
        double heading;
        double velocity;
        double gap;
        double dt;
        double lastVelocity;
        double turn = 0;
        double mx;
        double my;
        double en = e.getEnergy();
        double t = getTime();
        double[] l;
        char[][] table;
        if (ids[code = e.getName().hashCode() & 262143] == 0) {
            ids[code] = ++seen;
        }
        dt = t - (l = last[id = ids[code]])[0];
        table = markov[id];
        double[] old = bots[id];
        double[] me = bots[id] = new double[] {
            x = (mx = getX()) + Math.sin(bearing = getHeadingRadians() + e.getBearingRadians()) * (distance = e.getDistance()),
            y = (my = getY()) + Math.cos(bearing) * distance,
            en, 1};
        // Weighed 0.25 when another robot is nearer the shooter than we are (DEISE-3, DEISE-5): its
        // push and its waves.
        for (int k = 0; k < 17; k++) {
            double[] other = bots[k];
            if (other != null && Point2D.distanceSq(x, y, other[0], other[1]) < 0.81 * distance * distance && other != me) {
                me[3] = 0.25;
            }
        }
        // A drop of 0.1 to 3 is a shot: a wave at us, fired halfway back to the last scan, weighed
        // 0.25 when another robot is nearer the shooter than we are (DEISE-5).
        if (old != null && (gap = old[2] - en) > 0.09 && gap < 3.01) {
            double speed;
            double head;
            waves[wave++ & 63] = new double[] {x, y, t - Math.min(dt, 8) / 2, speed = 20 - 3 * gap,
                head = bearing + Math.PI,
                head + Math.asin(getVelocity() * Math.sin(e.getBearingRadians()) / speed), me[3]};
        }
        // Every robot scanned is learned, its turn spread over a gap of up to 8 ticks (DEISE-6).
        lastVelocity = velocity = e.getVelocity();
        heading = e.getHeadingRadians();
        char[] row = null;
        if (dt >= 1 && dt <= 8) {
            lastVelocity = l[2];
            turn = Utils.normalRelativeAngle(heading - l[1]) / dt;
            row = table[(int) l[3]];
        }
        int state = (int) Math.signum(velocity - lastVelocity) + 1
            + ((int) (8.5 + velocity) << 2)
            + (Math.max(0, Math.min(4, (int) (2 * turn / Rules.getTurnRateRadians(lastVelocity) + 2.5))) << 7);
        if (row != null) {
            row[row[126] < 126 ? row[126]++ : (int) (Math.random() * 126)] = (char) state;
        }
        l[0] = t;
        l[1] = heading;
        l[2] = velocity;
        l[3] = state;
        // The nearest, sticky (DEISE-11).
        if (distance < targetDistance || id == target) {
            target = id;
            targetDistance = distance;
            if (getGunHeat() < 1) {
                setTurnRadarRightRadians(Double.POSITIVE_INFINITY * Math.sin(bearing - getRadarHeadingRadians()));
            }
            // Range power, within 0.1 to 3 (DEISE-10).
            double power = Math.max(0.1, Math.min(3,
                Math.log10(getEnergy()) * 325 / distance));
            if (getGunTurnRemaining() == 0 && getEnergy() > power) {
                setFire(power);
            }
            // 200 playouts of the target's chain, each voting over its width (DEISE-7 to DEISE-9).
            int[] bins = new int[1024];
            int best = 0;
            int width = (int) (Math.atan(18 / distance) * (512 / Math.PI));
            int i = 0;
            do {
                double px = x;
                double py = y;
                double h = heading;
                double v = velocity;
                int s = state;
                int weight = 100;
                int ticks = 0;
                int n;
                while (++ticks * (20 - 3 * power) < Point2D.distance(px, py, mx, my)) {
                    if ((n = table[s][126]) > 0) {
                        s = table[s][(int) (Math.random() * n)];
                    }
                    if (n < 8) {
                        weight = Math.min(weight, n * 12 + 5);
                    }
                    h += ((s >> 7) - 2) * Rules.getTurnRateRadians(v) / 2;
                    px += Math.sin(h) * (v = ((s >> 2) & 31) - 8);
                    py += Math.cos(h) * v;
                    if (out(px, py)) {
                        weight = 1;
                    }
                }
                n = (int) (Math.atan2(px - mx, py - my) * (512 / Math.PI));
                int k = -width;
                do {
                    int b;
                    if ((bins[b = (n + k) & 1023] += weight + 1 / (k * k + 1)) > bins[best]) {
                        best = b;
                    }
                } while (++k <= width);
            } while (++i < 200);
            setTurnGunRightRadians(Utils.normalRelativeAngle(best * (Math.PI / 512) - getGunHeadingRadians()));
        }
    }

    /** Whether (px, py) is within 18 px of a wall. */
    static boolean out(double px, double py) {
        return Math.min(Math.min(px, py), 1000 - Math.max(px, py)) < 18;
    }

    @Override
    public void onRobotDeath(RobotDeathEvent e) {
        int id = ids[e.getName().hashCode() & 262143];
        bots[id] = null;
        if (id == target) {
            targetDistance = Double.POSITIVE_INFINITY;
        }
    }
}

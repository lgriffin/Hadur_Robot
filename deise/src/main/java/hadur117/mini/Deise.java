package hadur117.mini;

import java.awt.geom.Point2D;
import robocode.AdvancedRobot;
import robocode.RobotDeathEvent;
import robocode.Rules;
import robocode.ScannedRobotEvent;
import robocode.util.Utils;

/**
 * Deise (the Déise, Waterford's people), a MiniMelee entry: Saor's graded Markov gun, learning
 * every robot it scans, over a least-risk movement that holds the corners while the field is
 * crowded (docs/deise.md).
 *
 * <p>This is the class that ships: the core ({@code hadur117.mini.core}) flattened by hand into
 * one class to fit MiniMelee's 1,499 bytes, as Saor is. {@code DeiseEquivalenceTest} drives it
 * and the bench adapter {@link DeiseLab}, which calls the core, with the same events and
 * requires the same orders (DEISE-16).</p>
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
    /** Live opponents this round, {x, y, energy}. */
    static double[][] bots;
    static int target;
    static double targetDistance;
    static double myX;
    static double myY;
    static double destX;
    static double destY;

    @Override
    public void run() {
        setAdjustGunForRobotTurn(true);
        setAdjustRadarForGunTurn(true);
        bots = new double[17][];
        destX = getX();
        destY = getY();
        setTurnRadarRightRadians(targetDistance = Double.POSITIVE_INFINITY);
        while (true) {
            myX = getX();
            myY = getY();
            // The least-risk point of a ring of 36 (DEISE-1).
            double reach = Math.max(36, Math.min(160, targetDistance * 0.45));
            double bestX = myX;
            double bestY = myY;
            double best = Double.POSITIVE_INFINITY;
            double px;
            double py;
            double r;
            int i = 0;
            do {
                if (Math.min(Math.min(px = myX + Math.sin(r = i * (2 * Math.PI / 36)) * reach,
                        py = myY + Math.cos(r) * reach), 1000 - Math.max(px, py)) >= 18
                        && (r = risk(px, py, r)) < best) {
                    best = r;
                    bestX = px;
                    bestY = py;
                }
            } while (++i < 36);
            // Keep the destination unless a point is 10% safer or it is reached (DEISE-1).
            if (Point2D.distance(destX, destY, myX, myY) < 16
                    || best < 0.9 * risk(destX, destY, Math.atan2(destX - myX, destY - myY))) {
                destX = bestX;
                destY = bestY;
            }
            setTurnRightRadians(Math.tan(r = Math.atan2(destX - myX, destY - myY) - getHeadingRadians()));
            setAhead(Math.cos(r) * Point2D.distance(destX, destY, myX, myY));
            execute();
        }
    }

    /** The risk of moving on {@code heading} to (px, py) (DEISE-2 to DEISE-4). */
    double risk(double px, double py, double heading) {
        double r = 0;
        int others;
        for (double[] bot : bots) {
            if (bot != null) {
                r += (50000 + bot[2] * 500) / Point2D.distanceSq(px, py, bot[0], bot[1]);
                // Across the line of an opponent likely aiming at us: no robot is nearer it (DEISE-3).
                double mine = 0.81 * Point2D.distanceSq(bot[0], bot[1], myX, myY);
                others = 1;
                for (double[] other : bots) {
                    if (other != null && other != bot
                            && Point2D.distanceSq(bot[0], bot[1], other[0], other[1]) < mine) {
                        others = 0;
                    }
                }
                r += others * Math.abs(Math.cos(Math.atan2(bot[0] - px, bot[1] - py) - heading));
            }
        }
        // To the nearest corner while crowded (DEISE-4).
        if ((others = getOthers()) >= 4) {
            r += others * Math.hypot(Math.min(px, 1000 - px), Math.min(py, 1000 - py)) / 5000;
        }
        return r;
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
        double lastVelocity;
        double turn = 0;
        double[] l;
        char[][] table;
        if (ids[code = e.getName().hashCode() & 262143] == 0) {
            ids[code] = ++seen;
        }
        l = last[id = ids[code]];
        table = markov[id];
        bots[id] = new double[] {
            x = (myX = getX()) + Math.sin(bearing = getHeadingRadians() + e.getBearingRadians()) * (distance = e.getDistance()),
            y = (myY = getY()) + Math.cos(bearing) * distance,
            e.getEnergy()};
        // Every robot scanned is learned, its turn spread over a gap of up to 8 ticks (DEISE-6).
        lastVelocity = velocity = e.getVelocity();
        heading = e.getHeadingRadians();
        int fresh = 0;
        if ((gap = getTime() - l[0]) >= 1 && gap <= 8) {
            lastVelocity = l[2];
            turn = Utils.normalRelativeAngle(heading - l[1]) / gap;
            fresh = 1;
        }
        int state = (int) Math.signum(velocity - lastVelocity) + 1
            + ((int) (8.5 + velocity) << 2)
            + (Math.max(0, Math.min(4, (int) (2 * turn / Rules.getTurnRateRadians(lastVelocity) + 2.5))) << 7);
        if (fresh > 0) {
            char[] row = table[(int) l[3]];
            row[row[126] < 126 ? row[126]++ : (int) (Math.random() * 126)] = (char) state;
        }
        l[0] = getTime();
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
            // Range power, capped by the field and at what kills the target (DEISE-10).
            double power = Math.max(0.1, Math.min(Math.min(Math.min(3, getOthers() / 3 + 1.9),
                Math.log10(getEnergy()) * 325 / distance),
                (gap = e.getEnergy()) > 4 ? (gap + 2) / 6 : gap / 4));
            if (getGunTurnRemaining() == 0 && getEnergy() > power) {
                setFire(power);
            }
            // 64 playouts of the target's chain, each voting over its width (DEISE-7 to DEISE-9).
            int[] bins = new int[1024];
            int best = 0;
            int width = Math.max(1, (int) (Math.atan(18 / Point2D.distance(x, y, myX, myY)) * 1024 / (2 * Math.PI)));
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
                while (++ticks * (20 - 3 * power) < Point2D.distance(px, py, myX, myY)) {
                    if ((n = table[s][126]) > 0) {
                        s = table[s][(int) (Math.random() * n)];
                    }
                    if (n < 8) {
                        weight = Math.min(weight, n * 12 + 5);
                    }
                    h += ((s >> 7) - 2) * Rules.getTurnRateRadians(v) / 2;
                    px += Math.sin(h) * (v = ((s >> 2) & 31) - 8);
                    py += Math.cos(h) * v;
                    if (Math.min(Math.min(px, py), 1000 - Math.max(px, py)) < 18) {
                        weight = 1;
                    }
                }
                n = (int) (Math.atan2(px - myX, py - myY) * 1024 / (2 * Math.PI));
                int k = -width;
                do {
                    int b;
                    if ((bins[b = (n + k) & 1023] += weight + (k == 0 ? 1 : 0)) > bins[best]) {
                        best = b;
                    }
                } while (++k <= width);
            } while (++i < 64);
            setTurnGunRightRadians(Utils.normalRelativeAngle(best * 2 * Math.PI / 1024 - getGunHeadingRadians()));
        }
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

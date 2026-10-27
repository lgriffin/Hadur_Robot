package hadur117.mini;

import hadur117.mini.core.Gun;
import hadur117.mini.core.Move;
import java.util.Random;
import robocode.AdvancedRobot;
import robocode.BulletHitEvent;
import robocode.RobotDeathEvent;
import robocode.ScannedRobotEvent;
import robocode.util.Utils;

/**
 * Deise (the Déise, Waterford's people), a MiniMelee entry: Saor's graded Markov gun, learning
 * every robot it scans, over a least-risk movement that dodges the waves it sees fired and holds
 * the corners while the field is crowded (docs/deise.md). This class is the adapter: it keeps
 * what Robocode tells it and asks the core (hadur117.mini.core) what to do.
 */
public class Deise extends AdvancedRobot {

    /** Opponents a battle can hold; ids are handed out in the order robots are first seen. */
    static final int MAX = 16;
    /** Scans further apart than this are not learned (DEISE-6). */
    static final int GAP = 8;
    /** Whether unscanned opponents are played on by their last heading and speed: arm RK. */
    static final boolean RECKON = false;
    static final Random RANDOM = new Random();
    static final int[] IDS = new int[1 << 18];
    static int seen;
    /** Per-opponent Markov tables, kept across rounds (DEISE-6). */
    static final char[][][] TABLES = new char[MAX][][];
    /** Per opponent: last scan time, heading, velocity, state. */
    static final double[][] LAST = new double[MAX][4];
    static double[][] bots;
    static double[][] waves;
    static int target;
    static double targetDistance;
    static double[] destination;

    @Override
    public void run() {
        setAdjustGunForRobotTurn(true);
        bots = new double[MAX][];
        waves = new double[64][];
        targetDistance = Double.POSITIVE_INFINITY;
        destination = null;
        setTurnRadarRightRadians(Double.POSITIVE_INFINITY);
        while (true) {
            double x = getX();
            double y = getY();
            double time = getTime();
            for (int i = 0; RECKON && i < MAX; i++) {
                if (bots[i] != null && LAST[i][0] < time) {
                    bots[i][Move.X] += Math.sin(LAST[i][1]) * LAST[i][2];
                    bots[i][Move.Y] += Math.cos(LAST[i][1]) * LAST[i][2];
                }
            }
            for (int i = 0; i < waves.length; i++) {
                if (waves[i] != null && Move.spent(waves[i], x, y, time)) {
                    waves[i] = null;
                }
            }
            // Keep the destination unless the ring holds a point 10% safer (DEISE-1).
            double[] best = Move.best(x, y, Move.reach(targetDistance), bots, waves, time, getOthers());
            if (destination == null || Math.hypot(destination[0] - x, destination[1] - y) < 16
                || best[2] < 0.9 * Move.risk(destination[0], destination[1],
                    Math.atan2(destination[0] - x, destination[1] - y), x, y, bots, waves, time, getOthers())) {
                destination = best;
            }
            double turn = Math.atan2(destination[0] - x, destination[1] - y) - getHeadingRadians();
            setTurnRightRadians(Math.tan(turn));
            setAhead(Math.cos(turn) * Math.hypot(destination[0] - x, destination[1] - y));
            execute();
        }
    }

    @Override
    public void onScannedRobot(ScannedRobotEvent e) {
        int code = e.getName().hashCode() & (IDS.length - 1);
        int id = IDS[code] == 0 ? (IDS[code] = ++seen) - 1 : IDS[code] - 1;
        double time = getTime();
        double bearing = getHeadingRadians() + e.getBearingRadians();
        double distance = e.getDistance();
        double x = getX() + Math.sin(bearing) * distance;
        double y = getY() + Math.cos(bearing) * distance;
        double heading = e.getHeadingRadians();
        double velocity = e.getVelocity();
        double[] bot = bots[id];
        double[] last = LAST[id];
        char[][] table = TABLES[id] == null ? (TABLES[id] = new char[Gun.STATES][Gun.ROW + 1]) : TABLES[id];
        if (bot == null) {
            bot = bots[id] = new double[] {x, y, e.getEnergy()};
            last[3] = -1;
        }
        // A drop of 0.1 to 3 is a shot: a wave at us, weighed by whether it likely aims at us (DEISE-5).
        double drop = bot[Move.ENERGY] - e.getEnergy();
        bot[Move.X] = x;
        bot[Move.Y] = y;
        bot[Move.ENERGY] = e.getEnergy();
        if (drop > 0.09 && drop < 3.01) {
            for (int i = 0; i < waves.length; i++) {
                if (waves[i] == null) {
                    waves[i] = Move.wave(x, y, (time + Math.max(last[0], time - GAP)) / 2, drop, getX(), getY(),
                        getHeadingRadians(), getVelocity(), Move.aimsAtUs(bot, getX(), getY(), bots) ? 1 : 0.25);
                    break;
                }
            }
        }
        // Learn every robot scanned, one transition per scan, its turn spread over the gap (DEISE-6).
        double gap = time - last[0];
        int state;
        if (gap >= 1 && gap <= GAP) {
            state = Gun.state(velocity, last[2], Utils.normalRelativeAngle(heading - last[1]) / gap);
            if (last[3] >= 0) {
                Gun.learn(table, (int) last[3], state, RANDOM);
            }
        } else {
            state = Gun.state(velocity, velocity, 0);
        }
        last[0] = time;
        last[1] = heading;
        last[2] = velocity;
        last[3] = state;
        // The nearest, sticky (DEISE-11).
        if (distance < targetDistance || id == target) {
            target = id;
            targetDistance = distance;
            if (getGunHeat() < 1) {
                setTurnRadarRightRadians(Double.POSITIVE_INFINITY * Math.sin(bearing - getRadarHeadingRadians()));
            }
            double power = Gun.power(getEnergy(), e.getEnergy(), distance, getOthers());
            if (getGunTurnRemaining() == 0 && getEnergy() > power) {
                setFire(power);
            }
            setTurnGunRightRadians(Utils.normalRelativeAngle(
                Gun.aim(table, state, x, y, heading, velocity, getX(), getY(), power, 64, RANDOM) - getGunHeadingRadians()));
        }
    }

    /** Our hit is not their shot: their energy after it is the base for the next drop (DEISE-5). */
    @Override
    public void onBulletHit(BulletHitEvent e) {
        int id = IDS[e.getName().hashCode() & (IDS.length - 1)] - 1;
        if (id >= 0 && bots[id] != null) {
            bots[id][Move.ENERGY] = e.getEnergy();
        }
    }

    @Override
    public void onRobotDeath(RobotDeathEvent e) {
        int id = IDS[e.getName().hashCode() & (IDS.length - 1)] - 1;
        if (id >= 0) {
            bots[id] = null;
            if (id == target) {
                targetDistance = Double.POSITIVE_INFINITY;
            }
        }
    }
}

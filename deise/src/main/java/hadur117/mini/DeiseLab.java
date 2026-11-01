package hadur117.mini;

import hadur117.mini.core.Gun;
import hadur117.mini.core.Move;
import java.awt.geom.Point2D;
import java.util.Random;
import robocode.AdvancedRobot;
import robocode.BulletHitEvent;
import robocode.RobotDeathEvent;
import robocode.ScannedRobotEvent;
import robocode.util.Utils;

/**
 * The bench adapter: Deise driven by the core (hadur117.mini.core), call by call. It is the
 * reference the shipped class {@link Deise} is held to (DEISE-16), and the source the bench arms
 * are built from (hadur-bench/tools/deise_arms.sh). It also records the shots it sees fired, but
 * their waves count for nothing since stage E0's smoke ({@code Move.WAVES}); arm W measures them.
 * Built into its own jar ({@code hadur117.mini.DeiseLab_<release>.jar}); it never ships.
 */
public class DeiseLab extends AdvancedRobot {

    /** Opponents a battle can hold; ids are handed out in the order robots are first seen. */
    static final int MAX = 16;
    /** Scans further apart than this are not learned (DEISE-6). */
    static final int GAP = 8;
    /** Whether unscanned opponents are played on by their last heading and speed: arm RK. */
    static final boolean RECKON = false;
    /** Playouts an aim (DEISE-7): 400 since 0.5 (arm PN, pc-deise-e09 and e10). */
    static final int PLAYOUTS = 400;
    /**
     * A point must be this much safer than the destination to replace it (DEISE-1); 0, since 0.3
     * (arm WN), takes the ring's best point every tick.
     */
    static final double HOLD = 0;
    /** Whether a wave from a robot unlikely to aim at us weighs 0.25, not 1 (DEISE-5); false for arm WH. */
    static final boolean AIMED = true;
    /** Whether our hits move the energy a shot drop is measured from (DEISE-5): off since 0.3 (arm WB). */
    static final boolean HITS = false;
    static final Random RANDOM = new Random();
    static final int[] IDS = new int[1 << 18];
    static int seen;
    /** Per-opponent Markov tables, kept across rounds (DEISE-6). */
    static final char[][][] TABLES = new char[MAX][][];
    /** Per opponent: last scan time, heading, velocity, state. */
    static final double[][] LAST = new double[MAX][4];
    /**
     * Per opponent: the energy the next drop is measured from (DEISE-5). Kept apart from the risk's
     * energy so a hit, which moves only this, leaves every order as the shipped class gives it.
     */
    static final double[] BASE = new double[MAX];
    static double[][] bots;
    /** Waves in a ring of 64 slots, the newest over the oldest (DEISE-5). */
    static double[][] waves;
    static int wave;
    static int target;
    static double targetDistance;
    /**
     * Per opponent, kept across rounds: shots aimed at it and hits on it (DEISE-17, arm LEARNH since
     * 0.5). The target is the nearest by distance times the root of (shots + 10) / (hits + 1.5).
     */
    static final double[] SHOT = new double[MAX];
    static final double[] HIT = new double[MAX];
    static double targetScore;
    static double[] destination;

    @Override
    public void run() {
        setAdjustGunForRobotTurn(true);
        setAdjustRadarForGunTurn(true);
        bots = new double[MAX][];
        waves = new double[64][];
        targetScore = Double.POSITIVE_INFINITY;
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
            // Keep the destination unless the ring holds a point 10% safer (DEISE-1); with no hold, the
            // ring's best point, which is the reach away.
            double reach = Move.reach(targetDistance);
            double[] best = Move.best(x, y, reach, bots, waves, time, getOthers());
            if (HOLD == 0 || destination == null || Point2D.distance(destination[0], destination[1], x, y) < 16
                || best[2] < HOLD * Move.risk(destination[0], destination[1],
                    Math.atan2(destination[0] - x, destination[1] - y), x, y, bots, waves, time, getOthers())) {
                destination = best;
            }
            double turn = Math.atan2(destination[0] - x, destination[1] - y) - getHeadingRadians();
            setTurnRightRadians(Math.tan(turn));
            setAhead(Math.cos(turn) * (HOLD == 0 ? reach : Point2D.distance(destination[0], destination[1], x, y)));
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
            bot = bots[id] = new double[] {x, y, BASE[id] = e.getEnergy(), 1};
        }
        // A drop of 0.1 to 3 is a shot: a wave at us, weighed by whether it likely aims at us (DEISE-5).
        double drop = BASE[id] - e.getEnergy();
        BASE[id] = e.getEnergy();
        bot[Move.X] = x;
        bot[Move.Y] = y;
        bot[Move.ENERGY] = e.getEnergy();
        // Whether it likely aims at us, at every scan: it weighs its push and its waves (DEISE-3, DEISE-5).
        bot[Move.AIM] = Move.aimsAtUs(bot, distance, bots) ? 1 : 0.25;
        if (drop > 0.09 && drop < 3.01) {
            waves[wave++ & 63] = Move.wave(x, y, (time + Math.max(last[0], time - GAP)) / 2, drop, bearing,
                getVelocity() * Math.sin(e.getBearingRadians()), AIMED ? bot[Move.AIM] : 1);
        }
        // Learn every robot scanned, one transition per scan, its turn spread over the gap (DEISE-6).
        double gap = time - last[0];
        int state;
        if (gap >= 1 && gap <= GAP) {
            state = Gun.state(velocity, last[2], Utils.normalRelativeAngle(heading - last[1]) / gap);
            Gun.learn(table, (int) last[3], state, RANDOM);
        } else {
            state = Gun.state(velocity, velocity, 0);
        }
        last[0] = time;
        last[1] = heading;
        last[2] = velocity;
        last[3] = state;
        // The nearest by distance over the root of its hit rate, sticky (DEISE-11, DEISE-17).
        double score = distance * Math.sqrt((SHOT[id] + 10) / (HIT[id] + 1.5));
        if (score < targetScore || id == target) {
            target = id;
            targetDistance = distance;
            targetScore = score;
            if (getGunHeat() < 1) {
                setTurnRadarRightRadians(Double.POSITIVE_INFINITY * Math.sin(bearing - getRadarHeadingRadians()));
            }
            double power = Gun.power(getEnergy(), e.getEnergy(), distance, getOthers());
            if (getGunTurnRemaining() == 0 && getEnergy() > power && setFireBullet(power) != null) {
                SHOT[id]++;
            }
            setTurnGunRightRadians(Utils.normalRelativeAngle(
                Gun.aim(table, state, x, y, heading, velocity, getX(), getY(), distance, power, PLAYOUTS, RANDOM) - getGunHeadingRadians()));
        }
    }

    /** Our hit is not their shot: their energy after it is the base for the next drop (DEISE-5, arm W). */
    @Override
    public void onBulletHit(BulletHitEvent e) {
        int id = IDS[e.getName().hashCode() & (IDS.length - 1)] - 1;
        if (id >= 0) {
            HIT[id]++;
        }
        if (HITS && id >= 0) {
            BASE[id] = e.getEnergy();
        }
    }

    @Override
    public void onRobotDeath(RobotDeathEvent e) {
        int id = IDS[e.getName().hashCode() & (IDS.length - 1)] - 1;
        if (id >= 0) {
            bots[id] = null;
        }
        // Any death opens the target to every robot again (DEISE-11, since 0.5).
        targetScore = Double.POSITIVE_INFINITY;
    }
}

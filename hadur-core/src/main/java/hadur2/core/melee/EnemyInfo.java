package hadur2.core.melee;

import java.awt.geom.Point2D;
import java.util.ArrayDeque;
import java.util.Deque;
import hadur2.core.physics.Angles;

/**
 * Latest known state of one opponent in the current round.
 */
public class EnemyInfo {

    /** Ticks without a scan after which an opponent's data is stale. */
    public static final int STALE_TICKS = 20;
    /** Scans further apart than this are too old to derive a turn rate from. */
    private static final int MAX_TURN_RATE_GAP = 10;
    /** Window over which energy lost to other robots is summed. */
    public static final int LOSS_WINDOW = 40;
    /** The engine's bullet powers: a drop in this range may be a shot (MSENSE-2). */
    static final double MIN_SHOT = 0.1, MAX_SHOT = 3.0;
    /**
     * The fewest ticks between two shots: the lightest bullet heats the gun by 1.02, which
     * the default cooling rate of 0.1 a tick takes 11 ticks to clear.
     */
    static final int MIN_REFIRE_TICKS = 11;
    private static final double EPS = 1e-6;

    public final String name;
    public Point2D.Double location;
    public double energy;
    public double heading;
    public double velocity;
    public long lastScanTime = -1;
    public boolean alive = true;
    /** The last tick one of its bullets hit Hadur, or -1 (MMOVE-2). */
    public long lastHitHadur = -1;
    /** The ticks its last few bullets hit Hadur, oldest first (RES-2: at most {@link #HITS_KEPT}). */
    private final Deque<Long> hitsOnHadur = new ArrayDeque<>();
    static final int HITS_KEPT = 8;

    private double prevHeading;
    private long prevScanTime = -1;
    private final Deque<long[]> externalLosses = new ArrayDeque<>();
    private double pendingOwnDamage;

    public EnemyInfo(String name) {
        this.name = name;
    }

    void update(Point2D.Double location, double energy, double heading,
                double velocity, long time) {
        update(location, energy, heading, velocity, time, false);
    }

    /**
     * Takes a scan. Returns the power of the shot the energy drop since the last scan
     * shows, or NaN: a drop in [0.1, 3.0] that neither our bullets nor a bump
     * ({@code bumped}: a wall or a robot stopped it) explain (MSENSE-2). A drop above 3.0 is
     * damage from another robot, unless the scans were far enough apart for several shots
     * to fit, when it is recorded as neither. A hit from another
     * robot's weak bullet can look the same; such false shots are cheap, and accepted.
     */
    double update(Point2D.Double location, double energy, double heading,
                  double velocity, long time, boolean bumped) {
        double shot = Double.NaN;
        if (lastScanTime >= 0) {
            double loss = this.energy - energy - pendingOwnDamage;
            // A gap long enough for several shots can hide them in one bigger drop.
            long shotsPossible = 1 + Math.max(0, time - lastScanTime - 1) / MIN_REFIRE_TICKS;
            if (loss > MAX_SHOT + EPS && shotsPossible > 1 && loss <= shotsPossible * MAX_SHOT + EPS) {
                // Several shots or someone's hit: neither can be told, so neither is recorded.
            } else if (loss > MAX_SHOT + EPS) {
                // Firing costs at most 3 energy, so larger drops are damage from someone else.
                externalLosses.addLast(new long[]{time, Math.round(loss * 100)});
            } else if (loss >= MIN_SHOT - EPS && !bumped) {
                shot = Math.min(MAX_SHOT, Math.max(MIN_SHOT, loss));
            }
            prevHeading = this.heading;
            prevScanTime = lastScanTime;
        }
        pendingOwnDamage = 0;
        pruneLosses(time);
        this.location = location;
        this.energy = energy;
        this.heading = heading;
        this.velocity = velocity;
        this.lastScanTime = time;
        return shot;
    }

    void recordOwnDamage(double damage) {
        pendingOwnDamage += damage;
    }

    /** Ticks since the last scan. */
    public long age(long now) {
        return lastScanTime < 0 ? Long.MAX_VALUE : now - lastScanTime;
    }

    public boolean isStale(long now) {
        return age(now) >= STALE_TICKS;
    }

    /** Weight in [0.3, 1] used to discount decisions based on old scans. */
    public double freshness(long now) {
        long age = age(now);
        if (age <= 8) return 1.0;
        return Math.max(0.3, 1.0 - (age - 8) / 30.0);
    }

    /** Heading change per tick between the last two scans, or NaN if unknown. */
    public double turnRate() {
        long dt = lastScanTime - prevScanTime;
        if (prevScanTime < 0 || dt <= 0 || dt > MAX_TURN_RATE_GAP) return Double.NaN;
        return Angles.normalRelativeAngle(heading - prevHeading) / dt;
    }

    /** Energy lost to robots other than Hadur within the last {@link #LOSS_WINDOW} ticks. */
    public double recentExternalLoss(long now) {
        pruneLosses(now);
        double sum = 0;
        for (long[] l : externalLosses) sum += l[1] / 100.0;
        return sum;
    }

    /** Drops losses older than the window, so the list stays bounded (RES-2). */
    private void pruneLosses(long now) {
        while (!externalLosses.isEmpty() && now - externalLosses.peekFirst()[0] > LOSS_WINDOW) {
            externalLosses.removeFirst();
        }
    }

    /** How many external losses are held; for the bounds test. */
    int lossesHeld() {
        return externalLosses.size();
    }

    public double distance(Point2D.Double p) {
        return location.distance(p);
    }

    /** One of its bullets hit Hadur at {@code time}. */
    public void recordHitOnHadur(long time) {
        lastHitHadur = time;
        if (hitsOnHadur.size() >= HITS_KEPT) hitsOnHadur.removeFirst();
        hitsOnHadur.addLast(time);
    }

    /** How many of its bullets hit Hadur in the last {@code window} ticks. */
    public int hitsOnHadur(long now, long window) {
        int n = 0;
        for (long t : hitsOnHadur) {
            if (now - t <= window) n++;
        }
        return n;
    }
}

package hadur117.melee;

import java.awt.geom.Point2D;
import java.util.ArrayDeque;
import java.util.Deque;
import robocode.util.Utils;

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

    public final String name;
    public Point2D.Double location;
    public double energy;
    public double heading;
    public double velocity;
    public long lastScanTime = -1;
    public boolean alive = true;

    private double prevHeading;
    private long prevScanTime = -1;
    private final Deque<long[]> externalLosses = new ArrayDeque<>();
    private double pendingOwnDamage;

    public EnemyInfo(String name) {
        this.name = name;
    }

    void update(Point2D.Double location, double energy, double heading,
                double velocity, long time) {
        if (lastScanTime >= 0) {
            double loss = this.energy - energy - pendingOwnDamage;
            // Firing costs at most 3 energy, so larger drops are damage from someone else.
            if (loss > 3.0) {
                externalLosses.addLast(new long[]{time, Math.round(loss * 100)});
            }
            prevHeading = this.heading;
            prevScanTime = lastScanTime;
        }
        pendingOwnDamage = 0;
        this.location = location;
        this.energy = energy;
        this.heading = heading;
        this.velocity = velocity;
        this.lastScanTime = time;
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
        return Utils.normalRelativeAngle(heading - prevHeading) / dt;
    }

    /** Energy lost to robots other than Hadur within the last {@link #LOSS_WINDOW} ticks. */
    public double recentExternalLoss(long now) {
        while (!externalLosses.isEmpty() && now - externalLosses.peekFirst()[0] > LOSS_WINDOW) {
            externalLosses.removeFirst();
        }
        double sum = 0;
        for (long[] l : externalLosses) sum += l[1] / 100.0;
        return sum;
    }

    public double distance(Point2D.Double p) {
        return location.distance(p);
    }
}

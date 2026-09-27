package hadur2.core.melee;

import hadur2.core.physics.Angles;
import hadur2.core.physics.DiaUtils;
import java.awt.geom.Point2D;

/**
 * Melee radar. With four or more opponents alive it spins one way without stopping, so the
 * whole field is swept every 8 ticks whatever the layout (MRADAR-1). With two or three it
 * turns toward the opponent scanned longest ago, which keeps the longest gap between scans
 * short (MRADAR-2); a weak target the gun wants to finish is rescanned every
 * {@link #FINISHER_RESCAN} ticks while no one else is badly out of date. Until every living
 * opponent has been seen once, and while more are tracked than are alive, it spins. Once it
 * turns toward an opponent it keeps turning that way until that opponent is scanned: an
 * opponent that has moved off its last bearing is found by sweeping on, never by reversing
 * about the place it was.
 */
public class MeleeRadar {

    /** Opponents alive from which the radar just spins (MRADAR-1). */
    public static final int SPIN_OTHERS = 4;
    /** A finisher's scan this old is refreshed first (others at most 3). */
    static final long FINISHER_RESCAN = 2;
    /** ...unless the stalest opponent's scan is this old: one full sweep. */
    static final long OVERDUE = 8;

    private int direction = 1;
    /** The opponent the radar is turning toward, and when it started to. */
    private String chasing;
    private long chaseStart = Long.MIN_VALUE;

    public void newRound() {
        direction = 1;
        chasing = null;
        chaseStart = Long.MIN_VALUE;
    }

    /** Radar turn for this tick, in radians (infinite: keep sweeping that way). */
    public double radarTurn(Point2D.Double me, double radarHeading,
                            EnemyTracker tracker, int others) {
        return radarTurn(me, radarHeading, tracker, others, null, Long.MIN_VALUE);
    }

    /**
     * Radar turn for this tick at {@code now}, with {@code finisher} the opponent the gun
     * wants to finish (or null).
     */
    public double radarTurn(Point2D.Double me, double radarHeading, EnemyTracker tracker,
                            int others, String finisher, long now) {
        EnemyInfo stalest = tracker.stalest();
        boolean allSeen = stalest != null && tracker.alive().size() == others;
        if (others >= SPIN_OTHERS || !allSeen) {
            // MRADAR-1: a steady spin sweeps 360 degrees in 8 ticks.
            return direction * Double.POSITIVE_INFINITY;
        }
        EnemyInfo aim = stalest;
        EnemyInfo f = tracker.get(finisher);
        if (f != null && f != stalest && f.age(now) >= FINISHER_RESCAN
                && stalest.age(now) < OVERDUE) {
            aim = f;
        }
        if (aim.name.equals(chasing) && aim.lastScanTime < chaseStart) {
            // Still looking for it: it has moved off its last bearing, so sweep on the same
            // way rather than wobble about where it was.
            return direction * Double.POSITIVE_INFINITY;
        }
        chasing = aim.name;
        chaseStart = now;
        double offset = Angles.normalRelativeAngle(
            DiaUtils.absoluteBearing(me, aim.location) - radarHeading);
        direction = offset >= 0 ? 1 : -1;
        return direction * Double.POSITIVE_INFINITY;
    }
}

package hadur117.core.melee;

import hadur117.core.world.EnemyTracker;
import hadur117.core.world.EnemyInfo;
import hadur117.core.physics.Angles;
import hadur117.core.physics.DiaUtils;
import java.awt.geom.Point2D;
import java.util.List;

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

    /**
     * MRADAR-3 (team step E): on a team, with four or more enemies alive, a member whose gun
     * is about to fire looks at its own target when the team's freshest scan of it is stale.
     * Off in the shipped build: the {@code tlook} ablation turns it on.
     */
    public static final boolean TEAM_LOOK = false;
    /** MRADAR-3: the gun heat at or under which the gun fires within two ticks (it cools 0.1 a tick). */
    static final double LOOK_HEAT = 0.2;
    /** MRADAR-3: a target scan this old, by any member, is worth a look; a teammate's arrives a tick late. */
    static final long LOOK_AGE = 2;

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
        return radarTurn(me, radarHeading, tracker, others, finisher, now, false, Double.NaN, null);
    }

    /**
     * Radar turn for this tick at {@code now}; {@code team} says whether a teammate lives, and
     * {@code gunHeat} and {@code target} are the gun's heat and its last target, for MRADAR-3.
     */
    public double radarTurn(Point2D.Double me, double radarHeading, EnemyTracker tracker,
                            int others, String finisher, long now, boolean team, double gunHeat,
                            String target) {
        EnemyInfo stalest = tracker.stalest();
        boolean allSeen = stalest != null && tracker.alive().size() == others;
        if (TEAM_LOOK && team && allSeen && others >= SPIN_OTHERS && gunHeat <= LOOK_HEAT) {
            // MRADAR-3: the shot is near; look at its target if every member's scan of it is stale.
            EnemyInfo t = tracker.get(target);
            if (t != null && t.location != null && t.age(now) >= LOOK_AGE) {
                double offset = Angles.normalRelativeAngle(
                    DiaUtils.absoluteBearing(me, t.location) - radarHeading);
                direction = offset >= 0 ? 1 : -1;
                return direction * Double.POSITIVE_INFINITY;
            }
        }
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
        return toward(aim, me, radarHeading, now);
    }

    /**
     * TMODE-33: the team brain's radar. Each member keeps its own {@code group} fresh (the
     * enemies nearest it, {@link TeamConcord#group}): it turns toward the stalest of them, or the
     * gun's {@code finisher} among them once its scan is {@link #FINISHER_RESCAN} old. It spins,
     * as MRADAR-1, until every living enemy has been seen, while any enemy's freshest scan by
     * any member is {@link #OVERDUE} old, and with an empty group.
     */
    public double groupTurn(Point2D.Double me, double radarHeading, EnemyTracker tracker, int others,
                            String finisher, long now, List<EnemyInfo> group) {
        EnemyInfo stalest = tracker.stalest();
        boolean allSeen = stalest != null && tracker.alive().size() == others;
        if (!allSeen || stalest.age(now) >= OVERDUE || group.isEmpty()) {
            return direction * Double.POSITIVE_INFINITY;
        }
        EnemyInfo aim = null;
        for (EnemyInfo e : group) {
            if (aim == null || e.lastScanTime < aim.lastScanTime) aim = e;
        }
        for (EnemyInfo e : group) {
            if (e.name.equals(finisher) && e != aim && e.age(now) >= FINISHER_RESCAN) aim = e;
        }
        return toward(aim, me, radarHeading, now);
    }

    /** Turns toward {@code aim}, or sweeps on the same way while still looking for it. */
    private double toward(EnemyInfo aim, Point2D.Double me, double radarHeading, long now) {
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

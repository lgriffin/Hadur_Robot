package hadur2.core.melee;

import hadur2.core.physics.DiaUtils;
import java.awt.geom.Point2D;
import hadur2.core.physics.Angles;

/**
 * Chooses which opponent to shoot at in a melee. Lower score is better.
 *
 * <p>Energy weighs most (weak robots die quickly), then distance and how far the gun
 * has to turn, then threat, which only counts once Hadur itself is low on energy. The
 * current target is kept unless another scores clearly better and the gun can swing
 * onto it within a few ticks.</p>
 */
public class MeleeTargetSelector {

    static final double ENERGY_WEIGHT = 1.0;
    static final double DISTANCE_WEIGHT = 0.06;
    static final double GUN_ANGLE_WEIGHT = 0.2;
    static final double THREAT_WEIGHT = 0.5;
    static final double ENDANGERED_ENERGY = 30.0;
    static final double SWITCH_MARGIN = 0.8;
    static final double MAX_SWITCH_TICKS = 4.0;
    static final double GUN_TURN_RATE = Math.toRadians(20);

    private final OpponentStatsBook book;
    private String current;

    public MeleeTargetSelector(OpponentStatsBook book) {
        this.book = book;
    }

    public void newRound() {
        current = null;
    }

    public String current() {
        return current;
    }

    public void onRobotDeath(String name) {
        if (name.equals(current)) current = null;
    }

    public double score(EnemyInfo e, Point2D.Double me, double gunHeading,
                        long now, double myEnergy) {
        double gunTurn = Math.toDegrees(Math.abs(gunTurnTo(e, me, gunHeading)));
        double s = e.energy * ENERGY_WEIGHT
                 + e.distance(me) * DISTANCE_WEIGHT
                 + gunTurn * GUN_ANGLE_WEIGHT;
        if (myEnergy < ENDANGERED_ENERGY) {
            double threat = Math.min(20.0, book.get(e.name).damageReceivedFrom() / 5.0);
            s -= threat * THREAT_WEIGHT;
        }
        return s + (1.0 - e.freshness(now)) * 50.0;
    }

    /**
     * Re-evaluates every opponent and returns the target's name, or null if none is
     * known. A {@code preferred} target from the strategy wins outright.
     */
    public String select(EnemyTracker tracker, Point2D.Double me, double gunHeading,
                         long now, double myEnergy, EnemyInfo preferred) {
        if (preferred != null && preferred.alive) {
            current = preferred.name;
            return current;
        }

        EnemyInfo best = null;
        double bestScore = Double.POSITIVE_INFINITY;
        for (EnemyInfo e : tracker.alive()) {
            double s = score(e, me, gunHeading, now, myEnergy);
            if (s < bestScore) {
                bestScore = s;
                best = e;
            }
        }
        if (best == null) {
            current = null;
            return null;
        }

        EnemyInfo cur = tracker.get(current);
        if (cur == null) {
            current = best.name;
        } else if (best != cur
                && bestScore < SWITCH_MARGIN * score(cur, me, gunHeading, now, myEnergy)
                && gunTurnTicks(best, me, gunHeading) <= MAX_SWITCH_TICKS) {
            current = best.name;
        }
        return current;
    }

    public static double gunTurnTo(EnemyInfo e, Point2D.Double me, double gunHeading) {
        return Angles.normalRelativeAngle(DiaUtils.absoluteBearing(me, e.location) - gunHeading);
    }

    public static double gunTurnTicks(EnemyInfo e, Point2D.Double me, double gunHeading) {
        return Math.abs(gunTurnTo(e, me, gunHeading)) / GUN_TURN_RATE;
    }
}

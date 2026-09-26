package hadur117.melee;

import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Per-round registry of every opponent Hadur has scanned.
 */
public class EnemyTracker {

    /** Two robots closer than this, both losing energy to others, are fighting. */
    static final double ENGAGEMENT_RANGE = 300.0;
    static final double ENGAGEMENT_LOSS = 8.0;

    private final Map<String, EnemyInfo> enemies = new LinkedHashMap<>();

    public void newRound() {
        enemies.clear();
    }

    public EnemyInfo onScan(String name, Point2D.Double location, double energy,
                            double heading, double velocity, long time) {
        EnemyInfo e = enemies.computeIfAbsent(name, EnemyInfo::new);
        e.update(location, energy, heading, velocity, time);
        e.alive = true;
        return e;
    }

    /** Damage Hadur's bullets did, so it is not mistaken for another robot's. */
    public void onBulletHit(String name, double damage) {
        EnemyInfo e = enemies.get(name);
        if (e != null) e.recordOwnDamage(damage);
    }

    public void onRobotDeath(String name) {
        EnemyInfo e = enemies.get(name);
        if (e != null) e.alive = false;
    }

    public EnemyInfo get(String name) {
        EnemyInfo e = name == null ? null : enemies.get(name);
        return e != null && e.alive ? e : null;
    }

    public Collection<EnemyInfo> all() {
        return enemies.values();
    }

    public List<EnemyInfo> alive() {
        List<EnemyInfo> list = new ArrayList<>();
        for (EnemyInfo e : enemies.values()) {
            if (e.alive) list.add(e);
        }
        return list;
    }

    /** The alive opponent scanned longest ago, or null if none is known. */
    public EnemyInfo stalest() {
        EnemyInfo stalest = null;
        for (EnemyInfo e : alive()) {
            if (stalest == null || e.lastScanTime < stalest.lastScanTime) stalest = e;
        }
        return stalest;
    }

    /** Pairs of opponents fighting each other, away from Hadur. */
    public List<EnemyInfo[]> engagedPairs(Point2D.Double me, long now) {
        List<EnemyInfo[]> pairs = new ArrayList<>();
        List<EnemyInfo> alive = alive();
        for (int i = 0; i < alive.size(); i++) {
            for (int j = i + 1; j < alive.size(); j++) {
                EnemyInfo a = alive.get(i), b = alive.get(j);
                double apart = a.location.distance(b.location);
                if (apart < ENGAGEMENT_RANGE
                        && a.recentExternalLoss(now) >= ENGAGEMENT_LOSS
                        && b.recentExternalLoss(now) >= ENGAGEMENT_LOSS
                        && a.distance(me) > apart && b.distance(me) > apart) {
                    pairs.add(new EnemyInfo[]{a, b});
                }
            }
        }
        return pairs;
    }
}

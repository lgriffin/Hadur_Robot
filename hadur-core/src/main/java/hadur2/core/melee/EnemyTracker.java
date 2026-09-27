package hadur2.core.melee;

import hadur2.core.physics.BattleField;
import java.awt.geom.Point2D;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Per-round model of the battlefield: every opponent Hadur has scanned, its last position,
 * heading, velocity, energy and scan tick, whether it is alive, and the shots its energy
 * drops show (MSENSE-2). Deaths take an opponent out of {@link #alive()} at once (MSENSE-1).
 */
public class EnemyTracker {

    /** Two robots closer than this, both losing energy to others, are fighting. */
    static final double ENGAGEMENT_RANGE = 300.0;
    static final double ENGAGEMENT_LOSS = 8.0;

    /** Far more than any rumble battle holds (MeleeRumble runs 10 robots); RES-2. */
    static final int MAX_ENEMIES = 64;
    /** Shots kept: a bullet crosses a 1000 px field's diagonal in under 130 ticks. RES-2. */
    static final int MAX_SHOTS = 64;
    static final long SHOT_LIFETIME = 130;
    /** A robot stopped this close to a wall, or to another robot, may have hit it. */
    static final double BUMP_RANGE = 26.0;
    static final double ROBOT_BUMP_RANGE = 55.0;
    /**
     * A surplus opponent not seen for two full sweeps (8 ticks each) may be a ghost. One
     * sweep is not enough: a robot moving with the sweep can go unseen for 10 to 24 ticks.
     */
    static final long GHOST_AGE = 16;
    /** The engine's radar range. */
    static final double RADAR_RANGE = 1200.0;
    /** How far Hadur and an opponent can move apart in a tick, both at full speed. */
    private static final double MAX_SEPARATION_RATE = 16.0;

    private final Map<String, EnemyInfo> enemies = new LinkedHashMap<>();
    private final Deque<EnemyShot> shots = new ArrayDeque<>();
    /** The shot the last scan showed, or null (MMEM-1 counts them). */
    private EnemyShot lastScanShot;
    /** Null when walls are not known; bumps against them then go undetected. */
    private final BattleField field;

    public EnemyTracker() {
        this(null);
    }

    public EnemyTracker(BattleField field) {
        this.field = field;
    }

    public void newRound() {
        enemies.clear();
        shots.clear();
        lastScanShot = null;
    }

    public EnemyInfo onScan(String name, Point2D.Double location, double energy,
                            double heading, double velocity, long time) {
        return onScan(name, location, energy, heading, velocity, time, Double.POSITIVE_INFINITY);
    }

    /**
     * Takes a scan of {@code name}, {@code distanceToUs} from Hadur. An energy drop that
     * looks like a shot joins {@link #shots()} (MSENSE-2).
     */
    public EnemyInfo onScan(String name, Point2D.Double location, double energy,
                            double heading, double velocity, long time, double distanceToUs) {
        EnemyInfo e = enemies.get(name);
        if (e == null) {
            e = new EnemyInfo(name);
            if (enemies.size() < MAX_ENEMIES) enemies.put(name, e);
        }
        boolean bumped = stopped(e, velocity) && (nearWall(location)
            || distanceToUs < ROBOT_BUMP_RANGE || nearOther(e, location));
        Point2D.Double before = e.location;
        long previousScan = e.lastScanTime;
        double shot = e.update(location, energy, heading, velocity, time, bumped);
        e.alive = true;
        lastScanShot = null;
        if (!Double.isNaN(shot)) {
            lastScanShot = inferredShot(name, before, previousScan, location, time, shot);
            addShot(lastScanShot, time);
        }
        return e;
    }

    /** The shot the last {@link #onScan} inferred, or null when it inferred none. */
    public EnemyShot lastScanShot() {
        return lastScanShot;
    }

    /**
     * The shot an energy drop between two scans shows. Under the engine's convention a drop
     * seen at {@code time} was fired at {@code time - 1} at the latest, and no earlier than
     * the previous scan. Between scans the fire tick is unknown, so the shot takes the middle
     * of that window, fired from the matching point on the line between the two scans, and
     * carries the window's half-width as its uncertainty (MSENSE-2).
     */
    static EnemyShot inferredShot(String name, Point2D.Double before, long previousScan,
                                  Point2D.Double location, long time, double power) {
        if (before == null || previousScan < 0 || previousScan >= time - 1) {
            return new EnemyShot(name, before == null ? location : before, time - 1, power);
        }
        long span = time - 1 - previousScan;
        long fireTime = previousScan + span / 2;
        double f = (double) (fireTime - previousScan) / (time - previousScan);
        Point2D.Double source = new Point2D.Double(before.x + f * (location.x - before.x),
            before.y + f * (location.y - before.y));
        return new EnemyShot(name, source, fireTime, power, (span + 1) / 2);
    }

    private static boolean stopped(EnemyInfo e, double velocity) {
        return e.lastScanTime >= 0 && Math.abs(e.velocity) > 0 && velocity == 0;
    }

    private boolean nearWall(Point2D.Double p) {
        if (field == null) return false;
        return p.x < BUMP_RANGE || p.y < BUMP_RANGE
            || p.x > field.width - BUMP_RANGE || p.y > field.height - BUMP_RANGE;
    }

    private boolean nearOther(EnemyInfo self, Point2D.Double p) {
        for (EnemyInfo o : enemies.values()) {
            if (o != self && o.alive && o.location != null
                    && o.location.distance(p) < ROBOT_BUMP_RANGE) {
                return true;
            }
        }
        return false;
    }

    private void addShot(EnemyShot shot, long now) {
        pruneShots(now);
        if (shots.size() >= MAX_SHOTS) shots.removeFirst();
        shots.addLast(shot);
    }

    private void pruneShots(long now) {
        while (!shots.isEmpty() && now - shots.peekFirst().fireTime > SHOT_LIFETIME) {
            shots.removeFirst();
        }
    }

    /**
     * Shots fired in the last {@link #SHOT_LIFETIME} ticks, oldest first. A dead robot's
     * bullets fly on, so its shots stay.
     */
    public List<EnemyShot> shots(long now) {
        pruneShots(now);
        return new ArrayList<>(shots);
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

    /** {@link #pruneGhosts(int, long, Point2D.Double)} with Hadur's position unknown. */
    public int pruneGhosts(int others, long now) {
        return pruneGhosts(others, now, null);
    }

    /**
     * Drops opponents that must be dead: while more are alive here than the engine counts
     * (a death this core never heard of), the one scanned longest ago goes, if two full
     * sweeps have passed it by and it cannot have left radar range since its last scan
     * (unknown when {@code me} is null). The count says one is dead but not which one: a
     * live robot dropped by mistake comes back on its next scan, and the dead one, which can
     * never be scanned again, becomes the stalest and goes next. Returns how many it
     * dropped (MSENSE-1).
     */
    public int pruneGhosts(int others, long now, Point2D.Double me) {
        int dropped = 0;
        List<EnemyInfo> alive = alive();
        while (alive.size() > others) {
            EnemyInfo stalest = stalest();
            if (stalest == null || stalest.age(now) <= GHOST_AGE || !inRadarRange(stalest, me, now)) break;
            stalest.alive = false;
            alive.remove(stalest);
            dropped++;
        }
        return dropped;
    }

    /** Whether {@code e} is surely still within radar range of {@code me}, alive. */
    private static boolean inRadarRange(EnemyInfo e, Point2D.Double me, long now) {
        if (me == null || e.location == null) return true;
        return me.distance(e.location) + MAX_SEPARATION_RATE * e.age(now) < RADAR_RANGE;
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

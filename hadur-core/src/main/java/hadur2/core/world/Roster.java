package hadur2.core.world;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * The World's teammates and its count of enemies alive (A5): who is on our team, where each
 * was last known to be and since when, who is known or presumed dead, and from the enemies'
 * deaths a count that never falls below the truth (WORLD-3, WORLD-8). Empty off a team.
 *
 * <p>A teammate is never in the {@link EnemyTracker}: nothing a strand reads holds one.</p>
 */
public final class Roster {

    /**
     * WORLD-3: a teammate silent this many ticks while the engine's count of others has
     * fallen is counted dead. Reports arrive every tick, so this is a run of skipped turns
     * long enough to be a death the engine's event did not reach us.
     */
    public static final long SILENT_WINDOW = 20;

    /** One teammate as the World knows it. */
    public static final class Mate {
        public final String name;
        double x = Double.NaN;
        double y = Double.NaN;
        /** The tick its position was known on; -1 for never this round. */
        long seen = -1;
        /** The tick its last report stated; -1 for none this round. */
        long reported = -1;
        /** The engine's count of others when that report was read. */
        int othersAtReport = Integer.MAX_VALUE;
        /** The tick a death event or report named it, or -1. */
        long diedAt = -1;
        boolean presumedDead;

        Mate(String name) {
            this.name = name;
        }

        public double x() {
            return x;
        }

        public double y() {
            return y;
        }

        /** The tick its position was known on; -1 for never this round. */
        public long seen() {
            return seen;
        }

        public boolean alive() {
            return diedAt < 0 && !presumedDead;
        }
    }

    private final Map<String, Mate> mates = new LinkedHashMap<>();
    private final int enemiesAtStart;
    /** Enemies known dead this round, and the tick each was named dead. */
    private final Map<String, Long> deadEnemies = new TreeMap<>();
    /** Robots seen this round to be no sentry: only their deaths count on a field with sentries. */
    private final Set<String> seenNotSentry = new TreeSet<>();
    /** Teammates heard from on the current tick. */
    private final Set<String> heard = new TreeSet<>();
    private long now = -1;

    /**
     * @param teammates the other members of our team, in roster order
     * @param enemiesAtStart the others less the roster at the start
     */
    public Roster(List<String> teammates, int enemiesAtStart) {
        for (String t : teammates) mates.put(t, new Mate(t));
        this.enemiesAtStart = enemiesAtStart;
    }

    /** A new round: everyone alive again and nothing known. */
    public void newRound() {
        for (String t : new ArrayList<>(mates.keySet())) mates.put(t, new Mate(t));
        deadEnemies.clear();
        seenNotSentry.clear();
        heard.clear();
        now = -1;
    }

    /** A new tick: no teammate has been heard from on it yet. */
    public void beginTick(long tick) {
        if (tick != now) heard.clear();
        now = tick;
    }

    public boolean isTeammate(String name) {
        return mates.containsKey(name);
    }

    public boolean isEmpty() {
        return mates.isEmpty();
    }

    public List<Mate> mates() {
        return new ArrayList<>(mates.values());
    }

    public Mate mate(String name) {
        return mates.get(name);
    }

    /** Our radar saw a teammate at ({@code x}, {@code y}) on {@code tick}: heard from, and alive. */
    public void scanned(String name, double x, double y, long tick) {
        Mate m = mates.get(name);
        if (m == null) return;
        place(m, x, y, tick);
        m.diedAt = -1;
        m.presumedDead = false;
        if (tick == now) heard.add(name);
    }

    /**
     * WORLD-4, WORLD-8: a report from {@code name} stating {@code tick}, with its position. A
     * report proves its sender alive; one stating the tick before is a hearing on this one.
     */
    public void reported(String name, long tick, double x, double y, int othersNow) {
        Mate m = mates.get(name);
        if (m == null) return;
        place(m, x, y, tick);
        m.reported = Math.max(m.reported, tick);
        m.othersAtReport = othersNow;
        m.diedAt = -1;
        m.presumedDead = false;
        if (tick == now - 1) heard.add(name);
    }

    /** A teammate's sighting of another teammate: the newer position wins (WORLD-4). */
    public void sighted(String name, double x, double y, long tick) {
        Mate m = mates.get(name);
        if (m != null) place(m, x, y, tick);
    }

    private static void place(Mate m, double x, double y, long tick) {
        if (tick < m.seen) return;
        m.x = x;
        m.y = y;
        m.seen = tick;
    }

    /** A robot scanned and seen to be no sentry. */
    public void notSentry(String name) {
        seenNotSentry.add(name);
    }

    /**
     * A robot named dead on {@code tick}, by the engine or a teammate's report. On a field
     * with sentries an enemy counts only once seen not to be one: the engine announces a
     * sentry's death too, though its count of others never held it.
     */
    public void died(String name, long tick, boolean sentriesOnField) {
        Mate m = mates.get(name);
        if (m != null) {
            if (m.diedAt < 0) m.diedAt = tick;
            heard.remove(name);
            return;
        }
        if (sentriesOnField && !seenNotSentry.contains(name)) return;
        deadEnemies.putIfAbsent(name, tick);
    }

    /** A later sighting of an enemy withdraws its death. */
    public void enemySighted(String name, long tick) {
        Long died = deadEnemies.get(name);
        if (died != null && tick > died) deadEnemies.remove(name);
    }

    /** Whether {@code name} is an enemy known dead this round. */
    public boolean enemyDead(String name) {
        return deadEnemies.containsKey(name);
    }

    /** The enemies known dead this round. */
    public Set<String> deadEnemies() {
        return new TreeSet<>(deadEnemies.keySet());
    }

    /** The teammates known or presumed dead this round. */
    public Set<String> deadMates() {
        Set<String> dead = new TreeSet<>();
        for (Mate m : mates.values()) if (!m.alive()) dead.add(m.name);
        return dead;
    }

    /**
     * WORLD-3: a teammate whose last report is more than {@link #SILENT_WINDOW} ticks old
     * while the engine's count of others has fallen below what it was then is counted dead.
     * A teammate never heard from this round counts from the round's start, with the count
     * at the start.
     */
    public void presume(long tick, int others, int othersAtStart) {
        for (Mate m : mates.values()) {
            if (!m.alive()) continue;
            long last = m.reported < 0 ? 0 : m.reported;
            int then = m.reported < 0 ? othersAtStart : m.othersAtReport;
            if (tick - last > SILENT_WINDOW && others < then) m.presumedDead = true;
        }
    }

    /** Teammates heard from on the current tick (WORLD-8). */
    public int heardFrom() {
        return heard.size();
    }

    /** Whether any teammate is alive as the World believes. */
    public boolean anyAlive() {
        for (Mate m : mates.values()) if (m.alive()) return true;
        return false;
    }

    /**
     * WORLD-8: the count of enemies alive, never below the truth: the smaller of the engine's
     * others less the teammates heard from on this tick, and the enemies at the start less
     * those known dead this round.
     */
    public int enemiesAlive(int others) {
        return Math.max(0, Math.min(others - heardFrom(), enemiesAtStart - deadEnemies.size()));
    }
}

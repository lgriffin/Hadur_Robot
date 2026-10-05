package hadur2.core.melee;

import hadur2.core.world.EnemyInfo;
import hadur2.core.physics.Angles;
import hadur2.core.physics.DiaUtils;
import java.awt.geom.Point2D;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;

/**
 * Targeting waves on every gun-heat cycle (MGUN-4): whenever the gun comes off cooldown, and
 * every {@link #IDLE_INTERVAL} ticks while it sits cool without firing, a wave goes out at
 * every opponent in sight carrying the angle the field gun would aim at it. When a wave
 * reaches its opponent it scores a virtual hit if the opponent is within its angular
 * width of that aim, so the bench can read the gun's hit rate on every opponent, fired at
 * or not.
 */
public final class MeleeWaves {

    /** Ticks between waves while the gun is cool and idle: a power-2 shot's cooldown. */
    static final long IDLE_INTERVAL = 16;
    /** Waves in flight (RES-2): ten opponents, eight cycles deep. */
    static final int MAX_WAVES = 128;

    /** One wave at one opponent. */
    public static final class Wave {
        public final String target;
        public final Point2D.Double source;
        public final long time;
        public final double speed, aim;

        Wave(String target, Point2D.Double source, long time, double speed, double aim) {
            this.target = target;
            this.source = source;
            this.time = time;
            this.speed = speed;
            this.aim = aim;
        }
    }

    private final Deque<Wave> waves = new ArrayDeque<>();
    private double lastHeat = Double.NaN;
    private long lastEmit = Long.MIN_VALUE;
    private long emitted, resolved, hits;

    public void newRound() {
        waves.clear();
        lastHeat = Double.NaN;
        lastEmit = Long.MIN_VALUE;
    }

    /**
     * Emits this tick's waves if a gun-heat cycle starts, each carrying {@code gun}'s aim at
     * its opponent. Returns whether it did.
     */
    public boolean tick(Point2D.Double me, long now, double gunHeat, List<EnemyInfo> alive,
                        FieldGun gun, double energy, int others) {
        boolean cool = gunHeat <= 0;
        boolean cycle = cool && (!(lastHeat <= 0) || now - lastEmit >= IDLE_INTERVAL);
        lastHeat = gunHeat;
        if (!cycle) return false;
        lastEmit = now;
        for (EnemyInfo e : alive) {
            if (e.age(now) > FieldGun.MAX_AGE) continue;
            // The gun's own choice for this opponent: the density peak over its solutions.
            // With none (a rammer it leaves alone, too little energy) there is no aim to score.
            FieldGun.Aim a = gun.aim(me, energy, others, Collections.singletonList(e), now);
            if (a == null) continue;
            if (waves.size() >= MAX_WAVES) waves.removeFirst();
            waves.addLast(new Wave(e.name, new Point2D.Double(me.x, me.y), now, 20 - 3 * a.power, a.angle));
            emitted++;
        }
        return true;
    }

    /**
     * Scores the waves that have reached {@code e} by its latest scan, each at where the
     * opponent was when the wave crossed it: between two scans the opponent is taken to move
     * in a straight line, and the crossing is found along that segment.
     */
    public void onScan(EnemyInfo e, long now) {
        for (Iterator<Wave> it = waves.iterator(); it.hasNext(); ) {
            Wave w = it.next();
            if (!w.target.equals(e.name)) continue;
            if ((now - w.time) * w.speed < w.source.distance(e.location)) continue;
            Point2D.Double at = crossing(w, e.previousLocation(), e.previousScanTime(), e.location, now);
            double d = w.source.distance(at);
            double off = Math.abs(Angles.normalRelativeAngle(
                DiaUtils.absoluteBearing(w.source, at) - w.aim));
            if (off <= DiaUtils.botWidthAimAngle(Math.max(18.0, d))) hits++;
            resolved++;
            it.remove();
        }
    }

    /**
     * Where the opponent was when {@code w} reached it, given that it had by tick {@code t1}
     * at {@code p1}: along the straight line from its previous scan ({@code p0} at {@code t0})
     * if the wave had not yet reached it there, else {@code p0}; {@code p1} with no previous scan.
     */
    static Point2D.Double crossing(Wave w, Point2D.Double p0, long t0, Point2D.Double p1, long t1) {
        if (p0 == null || t0 < 0 || t0 >= t1) return p1;
        if ((t0 - w.time) * w.speed >= w.source.distance(p0)) return p0;
        double lo = 0, hi = 1;
        for (int i = 0; i < 20; i++) {
            double s = (lo + hi) / 2;
            double t = t0 + s * (t1 - t0);
            double x = p0.x + s * (p1.x - p0.x), y = p0.y + s * (p1.y - p0.y);
            if ((t - w.time) * w.speed >= w.source.distance(x, y)) hi = s; else lo = s;
        }
        return new Point2D.Double(p0.x + hi * (p1.x - p0.x), p0.y + hi * (p1.y - p0.y));
    }

    /** Drops the waves at a robot that died. */
    public void onRobotDeath(String name) {
        waves.removeIf(w -> w.target.equals(name));
    }

    /** The aim of the newest wave in flight (tests). */
    double peekAim() {
        return waves.peekLast().aim;
    }

    public int inFlight() {
        return waves.size();
    }

    /** Battle totals: waves sent, waves that reached their opponent, and virtual hits. */
    public long emitted() { return emitted; }
    public long resolved() { return resolved; }
    public long hits() { return hits; }
}

package hadur2.core.melee;

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
            FieldGun.Solution best = null;
            for (FieldGun.Solution s : gun.solutions(me, energy, others, Collections.singletonList(e), now)) {
                if (best == null || s.weight > best.weight) best = s;
            }
            double power = best == null ? 1.0 : best.power;
            double aim = best == null ? DiaUtils.absoluteBearing(me, e.location) : best.angle;
            if (waves.size() >= MAX_WAVES) waves.removeFirst();
            waves.addLast(new Wave(e.name, new Point2D.Double(me.x, me.y), now, 20 - 3 * power, aim));
            emitted++;
        }
        return true;
    }

    /** Scores the waves that have reached {@code e}'s latest scan. */
    public void onScan(EnemyInfo e, long now) {
        for (Iterator<Wave> it = waves.iterator(); it.hasNext(); ) {
            Wave w = it.next();
            if (!w.target.equals(e.name)) continue;
            double d = w.source.distance(e.location);
            if ((now - w.time) * w.speed < d) continue;
            double off = Math.abs(Angles.normalRelativeAngle(
                DiaUtils.absoluteBearing(w.source, e.location) - w.aim));
            if (off <= DiaUtils.botWidthAimAngle(Math.max(18.0, d))) hits++;
            resolved++;
            it.remove();
        }
    }

    /** Drops the waves at a robot that died. */
    public void onRobotDeath(String name) {
        waves.removeIf(w -> w.target.equals(name));
    }

    public int inFlight() {
        return waves.size();
    }

    /** Battle totals: waves sent, waves that reached their opponent, and virtual hits. */
    public long emitted() { return emitted; }
    public long resolved() { return resolved; }
    public long hits() { return hits; }
}

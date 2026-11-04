package hadur117.core.melee;

import hadur117.core.gun.GunController;
import hadur117.core.model.RobotState;
import hadur117.core.model.RobotStateLog;
import hadur117.core.model.Wave;
import hadur117.core.model.WaveManager;
import hadur117.core.physics.Angles;
import hadur117.core.physics.BattleField;
import hadur117.core.physics.DiaUtils;
import hadur117.core.physics.MovementPredictor;
import java.awt.geom.Point2D;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.function.UnaryOperator;

/**
 * TGUN-1..3, the team duelist's gun (Leigh's strategy doc of 2026-11-04): the duel's
 * {@link GunController} (the main GF kNN, the anti-surfer views and the hybrid, picked by their
 * virtual scores) aimed at the field gun's target. Every sighting of an enemy, the member's own
 * scans and its teammates' alike, makes a gun wave from where the member stood to the enemy, as
 * the duel makes one per scan; the waves break on that enemy's later sightings and teach views
 * kept per enemy class ({@code key}), so all copies of a class and all five observers fill one
 * record from the first round.
 *
 * <p>The field gun keeps a target until the duel gun has learned its class
 * ({@link #MIN_BREAKS} waves broken) and has a fresh wave on it (no older than
 * {@link #MAX_WAVE_AGE} ticks); the power is always the field gun's.</p>
 */
public final class TeamDuelGun {

    /** Waves a class must have broken before the duel gun aims at it. */
    static final int MIN_BREAKS = 20;
    /** The oldest gun wave, ticks, the duel gun aims from. */
    static final long MAX_WAVE_AGE = 2;
    /** Ticks of history kept per enemy; RES-2. */
    static final int LOG_TICKS = 200;

    private final BattleField field;
    private final MovementPredictor predictor;
    private final GunController gun;
    private final UnaryOperator<String> key;
    private final Map<String, Track> tracks = new HashMap<>();
    private final Map<String, Integer> breaks = new HashMap<>();
    private int round = -1;
    private long aimed, fired;
    /** The wave the last aim was taken on; the shot that follows fires its virtual guns on it. */
    private Wave aimedWave;

    /** One enemy's movement, as the duel's scan handler keeps it for its one opponent. */
    private static final class Track {
        final RobotStateLog log = new RobotStateLog();
        final WaveManager waves = new WaveManager();
        final ArrayDeque<Integer> orbit = new ArrayDeque<>();
        int velocitySign = 1;
        long ticksSinceReversal;
        long vchangeTime;
        double prevVelocity;
        long last = Long.MIN_VALUE;
        Wave lastWave;
    }

    public TeamDuelGun(BattleField field, UnaryOperator<String> key) {
        this.field = field;
        this.predictor = new MovementPredictor(field);
        this.gun = new GunController(field, 1);
        this.key = key;
    }

    /** A new round: every enemy's track and waves go; the views keep what they learned. */
    public void newRound() {
        round++;
        tracks.clear();
        aimedWave = null;
        gun.initRound();
    }

    /** Waves broken so far for {@code name}'s class. */
    int breaks(String name) {
        return breaks.getOrDefault(key.apply(name), 0);
    }

    public long aimed() { return aimed; }

    public long fired() { return fired; }

    /**
     * {@code name} seen at {@code at} on {@code time} with {@code heading} and {@code velocity},
     * by the member or a teammate; {@code me} is where the member stood then. A sighting no newer
     * than the last one of that enemy is ignored.
     */
    public void sighted(String name, long time, Point2D.Double at, double heading, double velocity,
                        double energy, Point2D.Double me, double myEnergy, int others) {
        Track t = tracks.computeIfAbsent(name, n -> new Track());
        if (time <= t.last || me == null) return;
        long gap = t.last == Long.MIN_VALUE ? 1 : time - t.last;
        t.last = time;
        RobotState state = RobotState.newBuilder().setLocation(new Point2D.Double(at.x, at.y))
            .setHeading(heading).setVelocity(velocity).setTime(time).build();
        t.log.addState(state);
        int prevSign = t.velocitySign;
        if (velocity != 0) t.velocitySign = velocity > 0 ? 1 : -1;
        if (t.velocitySign != prevSign) t.ticksSinceReversal = 0;
        else t.ticksSinceReversal += gap;
        double bearing = DiaUtils.absoluteBearing(me, at);
        double effective = Angles.normalAbsoluteAngle(heading + (t.velocitySign == 1 ? 0 : Math.PI));
        if (t.orbit.size() == 40) t.orbit.removeFirst();
        t.orbit.addLast(Angles.normalRelativeAngle(effective - bearing) < 0 ? -1 : 1);
        int changes = 0;
        Integer previous = null;
        for (int dir : t.orbit) {
            if (previous != null && dir != previous) changes++;
            previous = dir;
        }
        double accel = DiaUtils.accel(velocity, t.prevVelocity);
        if (Math.abs(velocity - t.prevVelocity) > 0.5) t.vchangeTime = 0;
        else t.vchangeTime += gap;
        t.prevVelocity = velocity;

        String k = key.apply(name);
        Wave w = new Wave(k, new Point2D.Double(me.x, me.y), state.location, Math.max(round, 0), time,
            1.9, heading, velocity, t.velocitySign, field, predictor);
        w.setAccel(accel)
            .setDistance(me.distance(at))
            .setVchangeTime(t.vchangeTime)
            .setDistanceLast8Ticks(t.log.getDisplacementDistance(at, time, 8))
            .setDistanceLast20Ticks(t.log.getDisplacementDistance(at, time, 20))
            .setDistanceLast40Ticks(t.log.getDisplacementDistance(at, time, 40))
            .setTicksSinceReversal(t.ticksSinceReversal)
            .setOrbitChanges40(changes)
            .setTargetEnergy(energy)
            .setSourceEnergy(myEnergy)
            .setEnemiesAlive(others);
        w.setWallDistances();
        t.waves.addWave(w);
        t.lastWave = w;
        t.waves.checkActiveWaves(time, state, (broken, states) -> {
            gun.onWaveBreak(broken, states);
            breaks.merge(k, 1, Integer::sum);
        });
    }

    /**
     * The duel gun's angle at {@code target} from {@code me} on {@code time} for a shot of
     * {@code power}, or NaN while it has not learned the target's class or has no fresh wave on
     * it. The wave takes the shot's power first (GUN-5: the gun is picked from that power
     * class's ratings), as the duel decides power before aim.
     */
    public double aim(String target, Point2D.Double me, long time, double power) {
        aimedWave = null;
        if (target == null) return Double.NaN;
        Track t = tracks.get(target);
        if (t == null || t.lastWave == null || time - t.lastWave.fireTime > MAX_WAVE_AGE) return Double.NaN;
        if (breaks(target) < MIN_BREAKS) return Double.NaN;
        aimed++;
        Wave w = t.lastWave;
        if (power > 0 && power != w.bulletPower()) {
            w.setBulletPower(power);
            w.setWallDistances();
        }
        aimedWave = w;
        return gun.aim(w, me, time);
    }

    /**
     * A shot of {@code power} left at {@code target} on the duel gun's last aim: that aim's
     * wave (not a newer sighting's) becomes the firing wave, so its virtual bullets are scored
     * when it breaks, as the duel's real-bullet waves are.
     */
    public void fired(String target, Point2D.Double me, long time, double power) {
        Wave w = aimedWave;
        aimedWave = null;
        if (w == null || target == null || !w.botName.equals(key.apply(target))) return;
        fired++;
        w.firingWave = true;
        if (power != w.bulletPower()) {
            w.setBulletPower(power);
            w.setWallDistances();
        }
        gun.fireVirtualBullets(w, me, time, power);
        gun.shotFired();
    }

    /** The wave the last aim was taken on, or null; for tests. */
    Wave aimedWave() { return aimedWave; }
}

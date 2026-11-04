package hadur117.core.melee;

import hadur117.core.physics.BattleField;
import hadur117.core.model.RobotState;
import hadur117.core.model.RobotStateLog;
import hadur117.core.model.Wave;
import hadur117.core.move.MoveController;
import hadur117.core.physics.Angles;
import hadur117.core.physics.DiaUtils;
import hadur117.core.physics.MovementPredictor;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import hadur117.core.physics.Rules;

/**
 * The duel surfer's waves and danger views fed by several shooters at once (MSURF-1..3, and
 * the engine TSURF shares). Each shooter keeps its own {@link MoveController}, so its waves
 * and the views learned from its hits and passes stay its own across the battle, as a duel
 * opponent's do. A shot becomes a duel wave aimed at Hadur as it was the tick before the
 * shot left; a move to a point is rated by driving there with the engine's physics, the
 * {@link #PRECISE} heaviest waves by precise intersection and every other wave at the first
 * tick it reaches Hadur on the way.
 *
 * <p>A wave weighs {@code 1 / (1 + k)^2}, where {@code k} counts the other robots nearer its
 * shooter than Hadur was when it fired (a shot is most likely at the shooter's nearest
 * robot); a wave under {@link #MIN_WEIGHT} is dropped. A move's danger is expected damage:
 * each wave's weight, times the bullet's damage, times the views' score at the intersection
 * (plus the shooter's normalised hit rate on Hadur, as the duel surf adds it).</p>
 *
 * <p>The class holds no opinion about where to go: the caller supplies the points (the
 * crowd mover's ring) and adds its own crowd cost.</p>
 */
public final class CrowdSurfer {

    /** Waves rated by precise intersection; the rest are rated at one state. */
    public static final int PRECISE = 2;
    /** A wave weighing less is not surfed (Ogi drops a shot under 0.1). */
    public static final double MIN_WEIGHT = 0.1;
    /** The most ticks a move is predicted: past every wave in the air at the slowest speed. */
    static final int HORIZON = 100;

    private final BattleField field;
    private final MovementPredictor predictor;
    private final Map<String, MoveController> shooters = new HashMap<>();
    private int round = -1;
    private long wavesAdded, hitsLogged;

    public CrowdSurfer(BattleField field) {
        this.field = field;
        this.predictor = new MovementPredictor(field);
    }

    /** A new round: every shooter's waves go, what its views learned stays. */
    public void newRound() {
        round++;
        for (MoveController mc : shooters.values()) mc.initRound();
    }

    MoveController shooter(String name) {
        return shooters.computeIfAbsent(name, n -> {
            MoveController mc = new MoveController(field, predictor);
            mc.initRound();
            return mc;
        });
    }

    /** How many shooters have a controller, for tests. */
    int shooters() { return shooters.size(); }

    public long wavesAdded() { return wavesAdded; }

    public long hitsLogged() { return hitsLogged; }

    /**
     * A shot {@code shooter} fired from {@code source} on {@code fireTime} at {@code power}:
     * a firing wave aimed at Hadur as {@code myPath} had it the tick before. Nothing is added
     * when the path does not reach back that far.
     *
     * @param sourceEnergy the shooter's energy when the shot was seen
     * @param myEnergy Hadur's energy now
     */
    public void onShot(String shooter, Point2D.Double source, long fireTime, double power,
                       RobotStateLog myPath, double sourceEnergy, double myEnergy) {
        RobotState at = myPath.getState(fireTime - 1);
        if (at == null || power < 0.1) return;
        RobotState before = myPath.getState(fireTime - 2);
        double velocity = at.velocity;
        int sign = velocitySign(myPath, fireTime - 1);
        Wave w = new Wave(shooter, new Point2D.Double(source.x, source.y), at.location, Math.max(round, 0),
            fireTime, power, at.heading, velocity, sign, field, predictor);
        w.setAccel(before == null ? 0 : DiaUtils.accel(velocity, before.velocity))
            .setDistance(source.distance(at.location))
            .setVchangeTime(vchangeTime(myPath, fireTime - 1))
            .setDistanceLast8Ticks(myPath.getDisplacementDistance(at.location, fireTime - 1, 8))
            .setDistanceLast20Ticks(myPath.getDisplacementDistance(at.location, fireTime - 1, 20))
            .setDistanceLast40Ticks(myPath.getDisplacementDistance(at.location, fireTime - 1, 40))
            .setTargetEnergy(myEnergy)
            .setSourceEnergy(sourceEnergy);
        w.firingWave = true;
        w.setWallDistances();
        shooter(shooter).addWave(w);
        wavesAdded++;
    }

    /** The sign of Hadur's last non-zero velocity at or before {@code time}; 1 when none. */
    static int velocitySign(RobotStateLog path, long time) {
        for (long t = time; t > time - 100; t--) {
            RobotState s = path.getState(t);
            if (s == null) break;
            if (s.velocity != 0) return s.velocity > 0 ? 1 : -1;
        }
        return 1;
    }

    /** Ticks since Hadur's velocity last changed by more than 0.5, up to 100. */
    static long vchangeTime(RobotStateLog path, long time) {
        RobotState s = path.getState(time);
        if (s == null) return 0;
        for (long t = time - 1; t > time - 100; t--) {
            RobotState p = path.getState(t);
            if (p == null) return time - t - 1;
            if (Math.abs(s.velocity - p.velocity) > 0.5) return time - t - 1;
            s = p;
        }
        return 100;
    }

    /** Every shooter's waves log Hadur at {@code me} on {@code time}; passed waves teach and go. */
    public void tick(long time, Point2D.Double me) {
        for (MoveController mc : shooters.values()) mc.checkWaves(time, me);
    }

    /**
     * {@code shooter}'s bullet of {@code power}, travelling at {@code heading}, hit Hadur at
     * {@code me}: its wave learns the angle it was fired at and counts as a hit.
     */
    public void onHitByBullet(String shooter, double power, double heading, Point2D.Double me, long time) {
        MoveController mc = shooters.get(shooter);
        if (mc == null) return;
        Wave w = mc.findBulletWave(me, time, shooter, power);
        if (w == null) return;
        w.hitByBullet = true;
        // The bullet lies on its firing line: put it there at Hadur's range from the source.
        Point2D.Double on = DiaUtils.project(w.sourceLocation, heading, w.sourceLocation.distance(me));
        mc.logBulletHit(w, on, Math.max(round, 0), time);
        hitsLogged++;
    }

    /** One of Hadur's bullets met {@code shooter}'s at {@code at}: that wave is no shot at Hadur. */
    public void onBulletHitBullet(String shooter, double power, Point2D.Double at, long time) {
        MoveController mc = shooters.get(shooter);
        if (mc == null) return;
        Wave w = mc.findBulletWave(at, time, shooter, power);
        if (w != null) w.bulletHitBullet = true;
    }

    /** One wave to surf: whose it is, its index among its shooter's surfable waves, its weight. */
    public static final class Threat {
        public final Wave wave;
        final MoveController mc;
        final int index;
        public final double weight;
        /** Weight times damage over the ticks to impact: the order the precise ones are picked in. */
        final double urgency;

        Threat(Wave wave, MoveController mc, int index, double weight, double urgency) {
            this.wave = wave;
            this.mc = mc;
            this.index = index;
            this.weight = weight;
            this.urgency = urgency;
        }
    }

    /**
     * Every wave still to reach {@code me}, weighted by the robots in {@code others} (every
     * living opponent's last known position, by name) nearer its shooter than Hadur was when
     * it fired, heaviest first; a wave under {@link #MIN_WEIGHT} is left out.
     */
    public List<Threat> threats(RobotState me, Map<String, Point2D.Double> others) {
        List<Threat> out = new ArrayList<>();
        for (Map.Entry<String, MoveController> en : shooters.entrySet()) {
            MoveController mc = en.getValue();
            for (int i = 0; ; i++) {
                Wave w = mc.findSurfableWave(i, me);
                if (w == null) break;
                if (w.bulletHitBullet) continue;
                double aimed = w.sourceLocation.distance(w.targetLocation);
                int k = 0;
                for (Map.Entry<String, Point2D.Double> o : others.entrySet()) {
                    if (o.getKey().equals(en.getKey())) continue;
                    if (o.getValue().distance(w.sourceLocation) < aimed) k++;
                }
                double weight = 1.0 / ((1 + k) * (1 + k));
                if (weight < MIN_WEIGHT) continue;
                double toGo = me.location.distance(w.sourceLocation) - w.distanceTraveled(me.time);
                double ticks = Math.max(1.0, toGo / w.bulletSpeed());
                double damage = Rules.getBulletDamage(w.bulletPower());
                out.add(new Threat(w, mc, i, weight, weight * damage / ticks));
            }
        }
        out.sort(Comparator.comparingDouble((Threat t) -> -t.urgency));
        return out;
    }

    /**
     * The expected damage of driving from {@code me} to {@code point} and stopping there,
     * against {@code threats} (heaviest first, from {@link #threats}): the first
     * {@link #PRECISE} by precise intersection over every state that wave crosses Hadur in,
     * the rest at the first such state.
     */
    public double danger(RobotState me, Point2D.Double point, List<Threat> threats) {
        if (threats.isEmpty()) return 0;
        int n = threats.size();
        List<List<RobotState>> crossing = new ArrayList<>(n);
        boolean[] gone = new boolean[n];
        for (int i = 0; i < n; i++) crossing.add(new ArrayList<>());
        int open = n;
        RobotState s = me;
        for (int t = 0; t < HORIZON && open > 0; t++) {
            s = goToStep(s, point);
            for (int i = 0; i < n; i++) {
                if (gone[i]) continue;
                Threat th = threats.get(i);
                Wave.WavePosition pos = th.wave.checkWavePosition(s, true);
                if (pos == Wave.WavePosition.GONE) {
                    gone[i] = true;
                    open--;
                    continue;
                }
                if (pos != Wave.WavePosition.MIDAIR) {
                    List<RobotState> c = crossing.get(i);
                    // Past the precise ones, one state is the wave's rating.
                    if (i < PRECISE || c.isEmpty()) c.add(s);
                }
            }
        }
        double total = 0;
        for (int i = 0; i < n; i++) {
            List<RobotState> c = crossing.get(i);
            if (c.isEmpty()) continue;
            Threat th = threats.get(i);
            Wave.Intersection x = th.wave.preciseIntersection(c);
            if (x == null) continue;
            double score = th.mc.getDangerScore(th.wave, x, th.index) + th.mc.normalizedEnemyHitRate();
            double d = th.weight * Rules.getBulletDamage(th.wave.bulletPower()) * score;
            if (th.wave.uncertain) d *= 0.5;
            total += d;
        }
        return total;
    }

    /** One tick of driving to {@code point} and stopping there, front or back first. */
    RobotState goToStep(RobotState state, Point2D.Double point) {
        double dist = state.location.distance(point);
        if (dist < 0.5) return predictor.predict(state, 0, 0, 8.0, 1, false);
        double turn = Angles.normalRelativeAngle(
            DiaUtils.absoluteBearing(state.location, point) - state.heading);
        double distance = dist;
        if (Math.abs(turn) > Math.PI / 2) {
            turn -= Math.signum(turn) * Math.PI;
            distance = -dist;
        }
        return predictor.predict(state, distance, turn, 8.0, 1, false);
    }
}

package hadur2.core.melee;

import hadur2.core.world.EnemyInfo;
import hadur2.core.knn.KdTree;
import hadur2.core.physics.Angles;
import hadur2.core.physics.BattleField;
import hadur2.core.physics.DiaUtils;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * The melee gun (MGUN-1, MGUN-2): Shadow's melee gun, as Diamond and Neuromancer use it.
 *
 * <p>Every opponent scanned within {@link #MAX_AGE} ticks gets {@link #K} firing solutions,
 * each one of its {@link EnemyHistory} situations most like its present one played forward
 * until Hadur's bullet (at the power the {@link MeleeEnergyPolicy} gives that opponent) would
 * reach it. A solution covers its angle plus or minus the robot's half-width at that range,
 * with the situation's share of the opponent's probability. Every opponent's probability is
 * weighted by 1/distance and by (1 + 0.5 (100 - energy)/100), doubled for a finisher, 1.3
 * for an isolated opponent and 1.5 for one that has hit Hadur twice in 200 ticks. The gun
 * aims at the angle where the summed density peaks, at the power of the opponent that
 * contributes most there. An opponent with too little history gets one circular or linear
 * solution instead. A robot coming at Hadur inside {@link #RAMMER_RANGE} is not shot at
 * unless it can be finished: Hadur moves instead.</p>
 */
public class FieldGun {

    public static final int K = 3;
    public static final long MAX_AGE = 8;
    static final double ISOLATED_RANGE = 350;
    static final double FINISHER_BOOST = 2.0;
    static final double ISOLATED_BOOST = 1.3;
    static final double SHOOTER_BOOST = 1.5;
    static final long SHOOTER_WINDOW = 200;
    static final double RAMMER_RANGE = 100;
    /** Closing speed above which a robot inside {@link #RAMMER_RANGE} counts as ramming. */
    static final double RAMMER_CLOSING = 2.0;
    static final int MAX_OPPONENTS = 64;

    /** One firing solution. */
    public static final class Solution {
        public final String target;
        public final double angle, tolerance, weight, power;
        public final Point2D.Double predicted;

        Solution(String target, double angle, double tolerance, double weight, double power,
                 Point2D.Double predicted) {
            this.target = target;
            this.angle = angle;
            this.tolerance = tolerance;
            this.weight = weight;
            this.power = power;
            this.predicted = predicted;
        }
    }

    /** Where to aim, at which power, and at whom. */
    public static final class Aim {
        public final double angle, power, density;
        public final String target;
        public final boolean learned;

        Aim(double angle, double power, double density, String target, boolean learned) {
            this.angle = angle;
            this.power = power;
            this.density = density;
            this.target = target;
            this.learned = learned;
        }
    }

    private final BattleField field;
    private final MeleeGun fallback;
    private final Map<String, EnemyHistory> histories = new LinkedHashMap<>();

    public FieldGun(BattleField field) {
        this.field = field;
        this.fallback = new MeleeGun(field);
    }

    /** Ends the round's logs; the situations learned stay for the battle. */
    public void newRound() {
        for (EnemyHistory h : histories.values()) h.newRound();
    }

    public EnemyHistory history(String name) {
        EnemyHistory h = histories.get(name);
        if (h == null && histories.size() < MAX_OPPONENTS) {
            h = new EnemyHistory();
            histories.put(name, h);
        }
        return h;
    }

    /** An opponent was scanned {@code distance} from Hadur. */
    public void onScan(EnemyInfo e, double distance, long time) {
        EnemyHistory h = history(e.name);
        if (h != null) {
            h.onScan(time, e.location.x, e.location.y, e.heading, e.velocity, distance,
                e.turnRate(), field);
        }
    }

    /** Every firing solution this tick, for every opponent fresh enough to shoot at. */
    public List<Solution> solutions(Point2D.Double me, double energy, int others,
                                    List<EnemyInfo> alive, long now) {
        List<Solution> out = new ArrayList<>();
        for (EnemyInfo e : alive) {
            if (e.age(now) > MAX_AGE) continue;
            double distance = e.distance(me);
            boolean finisher = e.energy <= MeleeEnergyPolicy.FINISHER_ENERGY;
            if (!finisher && rams(e, me)) continue;
            double power = MeleeEnergyPolicy.power(distance, energy, e.energy, others);
            if (power <= 0) continue;
            double weight = weight(e, me, alive, now);
            EnemyHistory h = history(e.name);
            double[] attributes = h == null ? null : h.current();
            List<KdTree.Entry<float[]>> near = attributes == null || h.size() < K
                ? new ArrayList<KdTree.Entry<float[]>>() : h.neighbours(attributes, K);
            if (near.isEmpty()) {
                MeleeGun.Aim a = fallback.aim(me, e, power, now);
                out.add(new Solution(e.name, a.angle, tolerance(me, a.predicted), weight, power,
                    a.predicted));
                continue;
            }
            double total = 0;
            double[] w = new double[near.size()];
            for (int i = 0; i < near.size(); i++) {
                w[i] = 1.0 / (0.01 + near.get(i).distance);
                total += w[i];
            }
            for (int i = 0; i < near.size(); i++) {
                Point2D.Double p = playForward(me, e, near.get(i).value, power, now);
                out.add(new Solution(e.name, DiaUtils.absoluteBearing(me, p), tolerance(me, p),
                    weight * w[i] / total, power, p));
            }
        }
        return out;
    }

    /** The peak of the summed density over every solution, or null with none. */
    public Aim aim(Point2D.Double me, double energy, int others, List<EnemyInfo> alive, long now) {
        List<Solution> all = solutions(me, energy, others, alive, now);
        if (all.isEmpty()) return null;
        Aim best = null;
        for (Solution s : all) {
            double density = 0;
            Map<String, Double> byTarget = new LinkedHashMap<>();
            for (Solution o : all) {
                if (Math.abs(Angles.normalRelativeAngle(s.angle - o.angle)) <= o.tolerance) {
                    density += o.weight;
                    byTarget.merge(o.target, o.weight, Double::sum);
                }
            }
            if (best == null || density > best.density + 1e-12) {
                String target = s.target;
                double top = -1;
                for (Map.Entry<String, Double> t : byTarget.entrySet()) {
                    if (t.getValue() > top) {
                        top = t.getValue();
                        target = t.getKey();
                    }
                }
                double power = s.power;
                for (Solution o : all) {
                    if (o.target.equals(target)) {
                        power = o.power;
                        break;
                    }
                }
                EnemyHistory h = histories.get(target);
                best = new Aim(s.angle, power, density, target, h != null && h.size() >= K);
            }
        }
        return best;
    }

    /**
     * An opponent's weight: 1/distance, leaning toward weak opponents, boosted for a finisher
     * (MGUN-2), an isolated opponent and a recent shooter.
     */
    double weight(EnemyInfo e, Point2D.Double me, List<EnemyInfo> alive, long now) {
        double w = 100.0 / Math.max(50.0, e.distance(me));
        w *= 1 + 0.5 * (100 - Math.min(100, e.energy)) / 100.0;
        if (e.energy <= MeleeEnergyPolicy.FINISHER_ENERGY) w *= FINISHER_BOOST;
        if (isolated(e, alive)) w *= ISOLATED_BOOST;
        if (e.hitsOnHadur(now, SHOOTER_WINDOW) >= 2) w *= SHOOTER_BOOST;
        return w;
    }

    static boolean isolated(EnemyInfo e, List<EnemyInfo> alive) {
        for (EnemyInfo o : alive) {
            if (o != e && o.location.distance(e.location) <= ISOLATED_RANGE) return false;
        }
        return true;
    }

    /** Coming at Hadur inside {@link #RAMMER_RANGE}. */
    static boolean rams(EnemyInfo e, Point2D.Double me) {
        double d = e.distance(me);
        if (d > RAMMER_RANGE) return false;
        double toMe = DiaUtils.absoluteBearing(e.location, me);
        return e.velocity * Math.cos(e.heading - toMe) > RAMMER_CLOSING;
    }

    static double tolerance(Point2D.Double me, Point2D.Double p) {
        return DiaUtils.botWidthAimAngle(Math.max(18.0, me.distance(p)));
    }

    /**
     * Plays trajectory {@code t} forward from {@code e}'s last scan until a bullet of
     * {@code power} fired from {@code me} now would reach it; stays inside the walls.
     */
    Point2D.Double playForward(Point2D.Double me, EnemyInfo e, float[] t, double power, long now) {
        double speed = 20 - 3 * power;
        double m = e.velocity < 0 ? e.heading + Math.PI : e.heading;
        double sin = Math.sin(m), cos = Math.cos(m);
        long elapsed = Math.max(0, now - e.lastScanTime);
        Point2D.Double p = e.location;
        for (int tick = 1; tick <= EnemyHistory.HORIZON + MAX_AGE; tick++) {
            double[] o = EnemyHistory.offset(t, elapsed + tick);
            double x = e.location.x + o[0] * sin + o[1] * cos;
            double y = e.location.y + o[0] * cos - o[1] * sin;
            p = new Point2D.Double(DiaUtils.limit(18, x, field.width - 18),
                DiaUtils.limit(18, y, field.height - 18));
            if (tick * speed >= me.distance(p)) break;
        }
        return p;
    }
}

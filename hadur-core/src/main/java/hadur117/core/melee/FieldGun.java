package hadur117.core.melee;

import hadur117.core.world.EnemyInfo;
import hadur117.core.knn.KdTree;
import hadur117.core.physics.Angles;
import hadur117.core.physics.BattleField;
import hadur117.core.physics.DiaUtils;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * The melee gun (MGUN-1, MGUN-2): Shadow's melee gun, as Diamond and Neuromancer use it.
 *
 * <p>Every opponent scanned within {@link #MAX_AGE} ticks gets {@link #MELEE_K} firing solutions
 * off a team (MGUN-7) and {@link #K} on one,
 * each one of its {@link EnemyHistory} situations most like its present one played forward
 * until Hadur's bullet (at the power the {@link MeleeEnergyPolicy} gives that opponent) would
 * reach it. A solution covers its angle plus or minus the robot's half-width at that range,
 * with the situation's share of the opponent's probability. Every opponent's probability is
 * weighted by 1/distance and by (1 + 0.5 (100 - energy)/100), doubled for a finisher, 1.3
 * for an isolated opponent and 1.5 for one that has hit Hadur twice in 200 ticks. The gun
 * aims at the angle where the summed density peaks, at the power of the opponent that
 * contributes most there. An opponent with too little history gets one circular or linear
 * solution instead. Off a team, a robot coming at Hadur inside {@link #RAMMER_RANGE} is not
 * shot at unless it can be finished: Hadur moves instead. On a team it is shot at like any
 * other (MGUN-10).</p>
 */
public class FieldGun {

    /**
     * MGUN-9: the kNN depth on a team. CombatTeam's 21 situations per opponent; the team
     * census gained +2.4 points over MGUN-1's three (docs/plan-team-top5.md).
     */
    public static final int K = 21;
    /**
     * MGUN-7: the kNN depth off a team. More situations spread each opponent over more
     * likely angles, so the summed density peaks where several opponents' futures overlap,
     * which is what a crowd gun is for (docs/bench/melee-gun-3.13.md). Ogi's 24, not the first
     * 12: the bank card gained +0.62 +-0.14 with MEND-3 (docs/plan-melee-top5.md, BENCH-115).
     */
    public static final int MELEE_K = 24;
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

    /** TMODE-33: the team brain's power, from Ogi's 1.92: a faster bullet than 3 that still pays. */
    public static final double CONCORD_POWER = 1.9;
    /** TMODE-33: within this, px, the team brain fires full power. */
    static final double CONCORD_CLOSE = 200;
    /** TMODE-33: the team brain fires full power at a class it hits this often... */
    static final double CONCORD_RATE = 0.55;
    /** TMODE-33: ...once this many shots at it have ended. */
    static final int CONCORD_SHOTS = 20;

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
    /** MGUN-6: whether Hadur has a living teammate this tick; false off a team. */
    private boolean onTeam;
    /** TMODE-33: whether the team modes this tick carry CONCORD. */
    private boolean concord;
    /** TMODE-33: per enemy class, the tree every copy's situations join. */
    private final Map<String, KdTree<float[]>> classTrees = new LinkedHashMap<>();
    /** TMODE-33: per enemy class, the shots fired at it and the hits on it, this battle. */
    private final Map<String, int[]> classShots = new LinkedHashMap<>();

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
            h = new EnemyHistory(classTrees.computeIfAbsent(TeamModes.key(name), k -> EnemyHistory.classTree()));
            histories.put(name, h);
        }
        return h;
    }

    /** MGUN-6: whether Hadur has a living teammate this tick, set before any aim of the tick. */
    public void onTeam(boolean onTeam) {
        this.onTeam = onTeam;
    }

    /** MGUN-6: whether Hadur had a living teammate at the latest {@link #onTeam(boolean)}. */
    public boolean onTeam() {
        return onTeam;
    }

    /** MGUN-7: the kNN depth this tick, {@link #K} on a team and {@link #MELEE_K} off one. */
    int k() {
        return onTeam ? K : MELEE_K;
    }

    /** An opponent was scanned {@code distance} from Hadur. */
    public void onScan(EnemyInfo e, double distance, long time) {
        EnemyHistory h = history(e.name);
        if (h != null) {
            h.onScan(time, e.location.x, e.location.y, e.heading, e.velocity, distance,
                e.turnRate(), field);
        }
    }

    /**
     * MGUN-8: a teammate's sighting of {@code name}, {@code distance} from Hadur, joins its
     * movement history as one of Hadur's own scans would.
     */
    public void onSighting(String name, long time, double x, double y, double heading, double velocity,
                           double distance, double turnRate) {
        EnemyHistory h = history(name);
        if (h != null) h.onScan(time, x, y, heading, velocity, distance, turnRate, field);
    }

    /** Every firing solution this tick, for every opponent fresh enough to shoot at. */
    public List<Solution> solutions(Point2D.Double me, double energy, int others,
                                    List<EnemyInfo> alive, long now) {
        List<Solution> out = new ArrayList<>();
        for (EnemyInfo e : alive) {
            if (e.age(now) > MAX_AGE) continue;
            double distance = e.distance(me);
            boolean finisher = e.energy <= MeleeEnergyPolicy.FINISHER_ENERGY;
            if (!finisher && !onTeam && rams(e, me)) continue;
            double power = MeleeEnergyPolicy.power(distance, energy, e.energy, others);
            if (power <= 0) continue;
            if (onTeam) power = MeleeEnergyPolicy.teamPower(power, energy, e.energy);
            else power = MeleeEnergyPolicy.crowdPower(power, distance, energy, e.energy, others);
            if (onTeam && concord && TeamConcord.POWER && power > CONCORD_POWER && distance > CONCORD_CLOSE && !readsWell(e.name)) {
                power = CONCORD_POWER;
            }
            if (power <= 0) continue;
            double weight = weight(e, me, alive, now);
            EnemyHistory h = history(e.name);
            double[] attributes = h == null ? null : h.current();
            List<KdTree.Entry<float[]>> near;
            if (onTeam && concord && TeamConcord.POOL && attributes != null) {
                near = pooled(e.name, attributes, k());
            } else {
                near = attributes == null || h.size() < k()
                    ? new ArrayList<KdTree.Entry<float[]>>() : h.neighbours(attributes, k());
            }
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
                best = new Aim(s.angle, power, density, target, h != null && h.size() >= k());
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
        // TMODE-41: with FOCUS the whole team leans on the enemy nearest death.
        if (focus && onTeam && weakest(e, alive)) w *= FOCUS_BOOST;
        return w;
    }

    /** TMODE-33: whether this tick's team modes carry CONCORD; set before any aim of the tick. */
    public void concord(boolean concord) {
        this.concord = concord;
    }

    /** TMODE-41: the weight on the enemy of least energy with FOCUS. */
    static final double FOCUS_BOOST = 3.0;
    /** TMODE-41: whether this tick's team modes carry FOCUS; set before any aim of the tick. */
    private boolean focus;

    /** TMODE-41: whether the field gun weighs the weakest enemy {@link #FOCUS_BOOST} times over. */
    public void focus(boolean focus) {
        this.focus = focus;
    }

    /** TMODE-41: whether no living opponent has less energy than {@code e}. */
    static boolean weakest(EnemyInfo e, List<EnemyInfo> alive) {
        for (EnemyInfo o : alive) {
            if (o != e && o.energy < e.energy) return false;
        }
        return true;
    }

    /** TMODE-33: one of Hadur's bullets left, aimed at {@code target}; counted against its class. */
    public void shotAt(String target) {
        if (target == null) return;
        int[] c = classShots.get(TeamModes.key(target));
        if (c == null) {
            if (classShots.size() >= MAX_OPPONENTS) return;
            c = new int[2];
            classShots.put(TeamModes.key(target), c);
        }
        c[0]++;
    }

    /** TMODE-33: one of Hadur's bullets hit {@code name}; a hit on its class. */
    public void hitOn(String name) {
        int[] c = classShots.get(TeamModes.key(name));
        if (c != null) c[1]++;
    }

    /** TMODE-33: whether Hadur hits {@code name}'s class {@link #CONCORD_RATE} of {@link #CONCORD_SHOTS} or more shots. */
    boolean readsWell(String name) {
        int[] c = classShots.get(TeamModes.key(name));
        return c != null && c[0] >= CONCORD_SHOTS && c[1] >= CONCORD_RATE * c[0];
    }

    /**
     * TMODE-33: the {@code k} situations most like {@code attributes} from every history of
     * {@code name}'s class, so each copy of a team's robot teaches the gun about the others.
     * Nearest first; with fewer than {@code k} in all, none.
     */
    List<KdTree.Entry<float[]>> pooled(String name, double[] attributes, int k) {
        KdTree<float[]> t = classTrees.get(TeamModes.key(name));
        if (t == null || t.size() < k) return new ArrayList<>();
        return t.nearestNeighbor(attributes, k, true);
    }

    /** MGUN-4: the field gun's own aim at one opponent, which a targeting wave carries. */
    Aim fieldAim(Point2D.Double me, double energy, int others, EnemyInfo e, long now) {
        return aim(me, energy, others, Collections.singletonList(e), now);
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

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

    /**
     * MGUN-17: off a team, each opponent's virtual waves (MGUN-4) also score three simple aims
     * beside the field gun's own (head-on, linear, circular), and once {@link #EXPERT_MIN} waves
     * have reached it, a simple aim whose hit rate beats the field gun's by
     * {@link #EXPERT_EDGE} takes that opponent, so a robot the situations miss but a simple
     * aim reads gets that aim.
     * Inspired by Ogi's aim experts, scored on our own waves rather than copied.
     */
    public static final boolean EXPERTS = false;
    /**
     * MGUN-18: off a team, an opponent's weight also leans toward the ones the gun has been
     * hitting: times 5 (hits + 1) / (waves + 5) of the aim it fires at it, 1 with no waves read.
     */
    public static final boolean HIT_TARGET = false;
    /** MGUN-19: off a team, an opponent's distance weight is (100/d)^0.7, not 100/d (Ogi's flatter d^-0.686). */
    public static final boolean FLAT_DISTANCE = false;
    /**
     * MGUN-20: off a team, a situation's weight is 1/(its distance + the mean distance of
     * the opponent's chosen situations), not 1/(0.01 + its distance), so one very close match
     * cannot take the whole opponent (Ogi's 1/(match + 1.6), scaled to our distances).
     */
    public static final boolean SOFT_MATCH = false;

    /**
     * MGUN-21: on a team, the enemy leader (Robocode starts a team's leader with 200 energy,
     * every other member with 100 and a droid with 120) weighs {@link #DECAP_BOOST} times more
     * once killing it pays: its energy is no more than the 30 its death drains from each living
     * teammate of its, summed over them (each capped at its own energy).
     */
    public static final boolean DECAP = false;
    static final double DECAP_BOOST = 3.0;
    /** MGUN-21: a robot first seen in a round above this energy is its team's leader. */
    static final double LEADER_SEEN = 150;
    /** MGUN-21: what a leader's death drains from each living teammate. */
    static final double LEADER_DRAIN = 30;
    /** TMODE-31: the leader's weight under LEAD. */
    static final double LEAD_BOOST = 4.0;
    /** TMODE-31: a scanner's weight under LEAD while droids are about. */
    static final double EYES_BOOST = 2.5;
    /** TMODE-31: a robot first seen in a round with more than this, up to {@link #LEADER_SEEN}, is a droid (120). */
    static final double DROID_SEEN = 110;

    /** MGUN-17: the aims a wave scores; FIELD is the field gun's own. */
    public static final int FIELD = 0, HEAD_ON = 1, LINEAR = 2, CIRCULAR = 3, EXPERT_COUNT = 4;
    /** MGUN-17: waves an opponent needs before a simple aim can take it. */
    static final int EXPERT_MIN = 20;
    /** MGUN-17: each read's weight decays by this per newer read, so the scores follow a robot that changes. */
    static final double EXPERT_DECAY = 0.95;
    /** MGUN-17: how far a simple aim's smoothed hit rate must beat the field gun's to take the opponent. */
    static final double EXPERT_EDGE = 1.25;

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
    /** MGUN-17: each opponent's decayed hits per aim, then its decayed wave count last. */
    private final Map<String, double[]> expertScores = new LinkedHashMap<>();
    /** MGUN-21: each robot's energy when first seen this round, kept from its first scan on whatever switches are on. */
    private final Map<String, Double> firstEnergy = new LinkedHashMap<>();
    /** TMODE-31: whether the team modes this tick carry LEAD. */
    private boolean lead;
    /** MGUN-17: true while a wave reads the field gun's own aim, which the experts must not steer. */
    private boolean pure;

    public FieldGun(BattleField field) {
        this.field = field;
        this.fallback = new MeleeGun(field);
    }

    /** Ends the round's logs; the situations learned stay for the battle. */
    public void newRound() {
        firstEnergy.clear();
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
        onScan(e, distance, time, null, 0);
    }

    /**
     * As above, with the robot nearest it ({@code nearest}, Hadur included, or null) and the
     * opponents alive, which MGUN-11's crowd attributes read.
     */
    public void onScan(EnemyInfo e, double distance, long time, Point2D.Double nearest, int alive) {
        firstEnergy.putIfAbsent(e.name, e.energy);
        EnemyHistory h = history(e.name);
        if (h != null) {
            h.onScan(time, e.location.x, e.location.y, e.heading, e.velocity, distance,
                e.turnRate(), field, nearest, alive);
        }
    }

    /**
     * MGUN-8: a teammate's sighting of {@code name}, {@code distance} from Hadur, joins its
     * movement history as one of Hadur's own scans would.
     */
    public void onSighting(String name, long time, double x, double y, double heading, double velocity,
                           double distance, double turnRate) {
        onSighting(name, time, x, y, heading, velocity, distance, turnRate, null, 0);
    }

    /** As above, with MGUN-11's crowd context, as {@link #onScan(EnemyInfo, double, long, Point2D.Double, int)}. */
    public void onSighting(String name, long time, double x, double y, double heading, double velocity,
                           double distance, double turnRate, Point2D.Double nearest, int alive) {
        EnemyHistory h = history(name);
        if (h != null) h.onScan(time, x, y, heading, velocity, distance, turnRate, field, nearest, alive);
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
            double power = MeleeEnergyPolicy.power(distance, energy, e.energy,
                MeleeEndgame.powerOthers(others, onTeam, MeleeEndgame.THREE_POWER));
            if (power <= 0) continue;
            if (onTeam) power = MeleeEnergyPolicy.teamPower(power, energy, e.energy);
            else power = MeleeEnergyPolicy.crowdPower(power, distance, energy, e.energy, others);
            double weight = weight(e, me, alive, now);
            int first = out.size();
            EnemyHistory h = history(e.name);
            double[] attributes = h == null ? null : h.current();
            List<KdTree.Entry<float[]>> near = attributes == null || h.size() < k()
                ? new ArrayList<KdTree.Entry<float[]>>() : h.neighbours(attributes, k());
            if (near.isEmpty()) {
                MeleeGun.Aim a = fallback.aim(me, e, power, now);
                out.add(new Solution(e.name, a.angle, tolerance(me, a.predicted), weight, power,
                    a.predicted));
                if (expertsOn()) expert(out, first, me, e, weight, power, now);
                continue;
            }
            double total = 0;
            double[] w = new double[near.size()];
            double soft = 0.01;
            if (SOFT_MATCH && !onTeam) {
                soft = 0;
                for (KdTree.Entry<float[]> n : near) soft += n.distance;
                soft = Math.max(0.01, soft / near.size());
            }
            for (int i = 0; i < near.size(); i++) {
                w[i] = 1.0 / (soft + near.get(i).distance);
                total += w[i];
            }
            for (int i = 0; i < near.size(); i++) {
                Point2D.Double p = playForward(me, e, near.get(i).value, power, now);
                out.add(new Solution(e.name, DiaUtils.absoluteBearing(me, p), tolerance(me, p),
                    weight * w[i] / total, power, p));
            }
            if (expertsOn()) expert(out, first, me, e, weight, power, now);
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
        if (FLAT_DISTANCE && !onTeam) w = Math.pow(w, 0.7);
        if (HIT_TARGET && !onTeam) w *= hitFactor(e.name);
        if (DECAP && onTeam && decapitates(e, alive)) w *= DECAP_BOOST;
        if (lead && onTeam) w *= leadFactor(e, alive);
        w *= 1 + 0.5 * (100 - Math.min(100, e.energy)) / 100.0;
        if (e.energy <= MeleeEnergyPolicy.FINISHER_ENERGY) w *= FINISHER_BOOST;
        if (isolated(e, alive)) w *= ISOLATED_BOOST;
        if (e.hitsOnHadur(now, SHOOTER_WINDOW) >= 2) w *= SHOOTER_BOOST;
        return w;
    }

    /** TMODE-31: whether this tick's team modes carry LEAD; set before any aim of the tick. */
    public void lead(boolean lead) {
        this.lead = lead;
    }

    /**
     * TMODE-31: {@link #LEAD_BOOST} for the enemy leader; {@link #EYES_BOOST} for any other
     * robot that is not a droid while a droid is alive; else 1.
     */
    double leadFactor(EnemyInfo e, List<EnemyInfo> alive) {
        for (EnemyInfo o : alive) firstEnergy.putIfAbsent(o.name, o.energy);
        double first = firstEnergy.getOrDefault(e.name, 0.0);
        if (first > LEADER_SEEN) return LEAD_BOOST;
        if (first > DROID_SEEN) return 1;
        for (EnemyInfo o : alive) {
            double f = firstEnergy.getOrDefault(o.name, 0.0);
            if (o != e && f > DROID_SEEN && f <= LEADER_SEEN) return EYES_BOOST;
        }
        return 1;
    }

    /**
     * MGUN-21: whether {@code e} is the enemy leader and killing it now pays: its energy is no
     * more than what its death drains from its living teammates.
     */
    boolean decapitates(EnemyInfo e, List<EnemyInfo> alive) {
        for (EnemyInfo o : alive) firstEnergy.putIfAbsent(o.name, o.energy);
        if (firstEnergy.getOrDefault(e.name, 0.0) <= LEADER_SEEN) return false;
        double drain = 0;
        for (EnemyInfo o : alive) {
            if (o != e) drain += Math.min(LEADER_DRAIN, Math.max(0, o.energy));
        }
        return e.energy <= drain;
    }

    private boolean expertsOn() {
        return EXPERTS && !onTeam && !pure;
    }

    /**
     * MGUN-4/17: the field gun's own aim at one opponent, which a targeting wave carries; with
     * MGUN-17 on, the simple aims are left out so the wave reads the field gun alone.
     */
    Aim fieldAim(Point2D.Double me, double energy, int others, EnemyInfo e, long now) {
        pure = true;
        try {
            return aim(me, energy, others, Collections.singletonList(e), now);
        } finally {
            pure = false;
        }
    }

    /** MGUN-17: where aim {@code x} (HEAD_ON, LINEAR or CIRCULAR) puts {@code e} for a bullet of {@code power}. */
    Point2D.Double expertAim(Point2D.Double me, EnemyInfo e, int x, double power, long now) {
        if (x == HEAD_ON) return e.location;
        double turnRate = x == CIRCULAR && !Double.isNaN(e.turnRate()) ? e.turnRate() : 0.0;
        return fallback.predict(me, e, power, now, turnRate);
    }

    /** MGUN-17: a wave at {@code name} reached it; {@code hit[x]} is whether aim x would have hit. */
    public void scoreExperts(String name, boolean[] hit) {
        double[] s = expertScores.get(name);
        if (s == null) {
            if (expertScores.size() >= MAX_OPPONENTS) return;
            s = new double[EXPERT_COUNT + 1];
            expertScores.put(name, s);
        }
        for (int x = 0; x <= EXPERT_COUNT; x++) s[x] *= EXPERT_DECAY;
        for (int x = 0; x < EXPERT_COUNT; x++) if (hit[x]) s[x] += 1;
        s[EXPERT_COUNT] += 1;
    }

    /**
     * MGUN-17: the simple aim that has beaten the field gun on {@code name} by
     * {@link #EXPERT_EDGE}, with its smoothed hit rate over the field gun's, or null: before
     * {@link #EXPERT_MIN} waves, or with no aim that far ahead.
     */
    double[] pick(String name) {
        double[] s = expertScores.get(name);
        if (s == null || s[EXPERT_COUNT] < (1 - Math.pow(EXPERT_DECAY, EXPERT_MIN)) / (1 - EXPERT_DECAY) - 1e-9) return null;
        double field = (s[FIELD] + 1) / (s[EXPERT_COUNT] + 2);
        int best = -1;
        double top = field * EXPERT_EDGE;
        for (int x = HEAD_ON; x < EXPERT_COUNT; x++) {
            double rate = (s[x] + 1) / (s[EXPERT_COUNT] + 2);
            if (rate > top) {
                top = rate;
                best = x;
            }
        }
        return best < 0 ? null : new double[] {best, top / field};
    }

    /**
     * MGUN-17: replaces {@code e}'s field-gun solutions ({@code out} from {@code first}) with
     * its picked aim's single solution. The solution carries what the field gun's own peak
     * held of the opponent's weight, times the aim's edge in hit rate, so the opponent pulls
     * on the crowd peak by how likely a shot is to hit it, not by how narrow the aim is.
     */
    private void expert(List<Solution> out, int first, Point2D.Double me, EnemyInfo e, double weight,
                        double power, long now) {
        double[] pick = pick(e.name);
        if (pick == null || weight <= 0) return;
        List<Solution> mine = out.subList(first, out.size());
        double peak = 0;
        for (Solution a : mine) {
            double d = 0;
            for (Solution o : mine) {
                if (Math.abs(Angles.normalRelativeAngle(a.angle - o.angle)) <= o.tolerance) d += o.weight;
            }
            peak = Math.max(peak, d);
        }
        mine.clear();
        Point2D.Double p = expertAim(me, e, (int) pick[0], power, now);
        out.add(new Solution(e.name, DiaUtils.absoluteBearing(me, p), tolerance(me, p),
            Math.min(weight, peak * pick[1]), power, p));
    }

    /**
     * MGUN-18: 5 (hits + 1) / (waves + 5) of the aim the gun fires at the opponent (MGUN-17's
     * pick, else the field gun's own), decayed; 1 with none read.
     */
    double hitFactor(String name) {
        double[] s = expertScores.get(name);
        if (s == null) return 1;
        double[] pick = expertsOn() ? pick(name) : null;
        double hits = s[pick == null ? FIELD : (int) pick[0]];
        return 5 * (hits + 1) / (s[EXPERT_COUNT] + 5);
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

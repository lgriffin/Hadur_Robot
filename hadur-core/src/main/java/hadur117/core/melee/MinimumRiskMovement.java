package hadur117.core.melee;

import static hadur117.core.melee.TeamRisk.*;

import hadur117.core.world.EnemyInfo;
import hadur117.core.world.EnemyShot;
import hadur117.core.world.Roster;
import hadur117.core.model.RobotState;
import hadur117.core.model.RobotStateLog;
import hadur117.core.physics.Angles;
import hadur117.core.physics.BattleField;
import hadur117.core.physics.DiaUtils;
import java.awt.geom.Point2D;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.ToDoubleFunction;

/**
 * Melee movement: minimum risk (MMOVE-1..4), the HawkOnFire and Diamond shape.
 *
 * <p>Each tick {@link #CANDIDATES} points on a ring around Hadur are scored and the least
 * risky becomes the destination; the current destination is kept until a point
 * {@link #SWITCH_GAIN} safer turns up or it is reached. The ring is capped at
 * {@link #NEAREST_FRACTION} of the distance to the nearest opponent, so Hadur never runs
 * into anyone. Risk is in units of one full-energy opponent 100 px away, the sum of:</p>
 *
 * <ul>
 * <li>each opponent's energy (relative to Hadur's) over distance squared, doubled where
 *     Hadur would be that opponent's closest robot and half again for an opponent that hit
 *     Hadur in the last {@link #RECENT_HIT_TICKS} ticks (MMOVE-2), and higher for points
 *     that run straight at or away from it rather than across it;</li>
 * <li>the virtual bullets: a head-on and a linear aim for every shot an energy drop showed,
 *     scored where they would be when Hadur gets to the point (MMOVE-3);</li>
 * <li>a pull off the middle of the field, a push off the walls' last few pixels, Hadur's
 *     recent positions, and a fixed per-round noise field, so the path is no pattern;</li>
 * <li>the melee strategy's posture (MMOVE-5).</li>
 * </ul>
 *
 * <p>On a team (T1) each living teammate whose position is fresh adds a term that rises with
 * the inverse square of its distance from the point, taken where the teammate is predicted
 * to be when Hadur gets there, and a term for a path that crosses its predicted track
 * (MMOVE-6, MMOVE-7); the ring is capped by the nearest such teammate as by the nearest
 * opponent; and each member's noise field and opening spot are shifted by its place in the
 * roster (MMOVE-8), so five copies of this function do not choose one destination. Off a
 * team none of this applies and the scoring is what it was.</p>
 *
 * <p>For the first {@link #OPENING_TICKS} ticks the closest-robot term doubles again and a
 * pull heads for the nearest wall-adjacent spot away from the corners. With two opponents
 * left the ring shrinks and the lateral weight rises (MMOVE-4), so the movement already
 * orbits when the duel takes over. Everything is deterministic: the noise is a hash.</p>
 */
public class MinimumRiskMovement {

    static final int ANGLES = 32;
    static final int RINGS = 5;
    /** Points scored per decision (MMOVE-1). */
    public static final int CANDIDATES = ANGLES * RINGS;
    static final double RING_MIN = 100, RING_MAX = 300;
    static final double ENDGAME_RING_MIN = 80, ENDGAME_RING_MAX = 200;
    /** Candidates keep this far from the walls: the robot's half-width and a little. */
    static final double WALL_MARGIN = 20;
    static final double NEAREST_FRACTION = 0.8;

    static final double CLOSEST_FACTOR = 2.0;
    static final double RECENT_HIT_FACTOR = 1.5;
    static final long RECENT_HIT_TICKS = 100;
    static final long OPENING_TICKS = 30;
    static final double LATERAL = 0.5;
    static final double ENDGAME_LATERAL = 1.2;
    /** Energy ratio cap: an opponent far stronger than Hadur is no more than twice the danger. */
    static final double ENERGY_RATIO_CAP = 2.0;

    /** A virtual bullet within this of a point, when Hadur would be there, is a hit. */
    static final double HIT_RADIUS = 26;
    static final double HIT_WINDOW = 2;
    static final double BULLET_K = 1.0;
    /** Hadur's rough speed to a point, for when it would be there. */
    static final double TRAVEL_SPEED = 7.0;
    static final int MAX_BULLETS = 128;
    /** MMOVE-15: the learned aims a melee shot keeps, its nearest samples'. */
    static final int SURF_AIMS = 4;

    static final double CENTRE_K = 0.25;
    static final double WALL_K = 0.3;
    static final double WALL_RANGE = 50;
    static final double CORNER_K = 0.5;
    static final double CORNER_RANGE = 120;
    static final double OPENING_K = 1.0;
    static final double OPENING_WALL_GAP = 60;
    static final double OPENING_CORNER_GAP = 250;
    static final double PAST_K = 0.02;
    static final int PAST_POSITIONS = 40;
    static final long PAST_EVERY = 5;
    static final double NOISE_K = 0.05;
    static final double NOISE_CELL = 25;
    /** MMOVE-8: how far apart, along its wall, the opening spots of two members in the roster are. */
    static final double MATE_FAN = 120;
    /** TMODE-2: a shot's weight is 1/(1+k)^2 for k teammates nearer its shooter; under this it makes no bullets. */
    static final double SOFT_FLOOR = 0.1;
    /** Cloud arm plinwall: the linear guess of a shot fired while Hadur had under WALL_LINEAR_ROOM px of wall room weighs this much more (1 on master). */
    static final double WALL_LINEAR_BOOST = 1, WALL_LINEAR_ROOM = 60;
    static final double SWITCH_GAIN = 0.9;
    static final double REACHED = 20;

    /**
     * MMOVE-15 (arm msurf), the melee surfer: off a team, the top three's way. Each seen shot is
     * a wave weighed by who else is nearer its shooter ({@link #crowdWeight}); once Hadur's log of
     * that shooter's hits holds {@link TeamDanger#MIN_SAMPLES}, its bullets are the learned aims
     * (MMOVE-10's log, fed off a team by Hadur's own hits) in place of head-on and linear; and the
     * destination is chosen by the wave check (TMODE-11): the {@link #WAVE_RERANK} least risky
     * candidates driven to, scored by risk and the waves' damage on the way. On from 3.21
     * (pc-melee-surf: +0.99 +- 0.19 census APS, PR #462).
     */
    public static final boolean MELEE_SURF = true;
    /**
     * MMOVE-22 (arm mdmg), inspired by Diamond's melee movement: off a team, each opponent's risk
     * term weighs by the damage its bullets have done to Hadur over the whole battle, plus
     * {@link #DAMAGE_BASE}, times its mean distance from Hadur (a gun that hits from afar is the
     * more dangerous), the weights scaled to average 1 over the living opponents. Without it a hit
     * is remembered for {@link #RECENT_HIT_TICKS} ticks only. On from 3.21: pc-melee-dia dm
     * +0.43 ± 0.17 with the low end +0.26, endgame wins +0.7, others outlived +0.5, skips +8%
     * (PR #503).
     */
    public static final boolean MELEE_DAMAGE_MEMORY = true;
    static final double DAMAGE_BASE = 10;
    /** MMOVE-22: the mean distance taken for an opponent never scanned. */
    static final double DAMAGE_DISTANCE_START = 500;
    static final double PERIPHERY_K = 0.2;
    static final double CUTOFF_K = 0.4;
    static final double FIGHT_K = 0.4;
    static final double FIGHT_WEIGHT = 2.0;
    static final double CUTOFF_DISTANCE = 220.0;
    static final double FIGHT_CLEARANCE = 350.0;
    static final double FINISH_RANGE = 550.0;

    static final double UNIT = 100.0 * 100.0;
    /**
     * A robot's top speed, and the most drift an unseen opponent's position is given beyond
     * the usual {@link #SWEEP_TICKS} between scans, which every position shares.
     */
    static final double MAX_SPEED = 8.0;
    static final double MAX_DRIFT = 400.0;
    static final long SWEEP_TICKS = 10;
    /** Opponents whose data has gone stale do not cap the ring. */
    static final long CAP_MAX_AGE = EnemyInfo.STALE_TICKS;
    /** TMODE-11: the lowest-risk candidates driven to, the ticks each drive is checked, and the damage term's weight. */
    static final int WAVE_RERANK = 8;
    static final int WAVE_TICKS = 30;
    static final double WAVE_DAMAGE_K = 3.0;
    /** TMODE-11: the share of a shot spread evenly over its escape angle, and the least median damage. */
    static final double WAVE_UNIFORM = 0.3;
    static final double WAVE_MEDIAN_FLOOR = 0.1;
    /** TMODE-11: a robot's half-width, px: a wave hits the box it crosses. */
    static final double WAVE_HALF = 18;
    /** The ring never shrinks below a robot's width, so Hadur can always move. */
    static final double MIN_RING = 36.0;

    /** What the movement sees this tick. */
    public static final class View {
        final Point2D.Double me;
        final double energy;
        final long now;
        final int others;
        final List<EnemyInfo> enemies;
        final List<VirtualBullet> bullets;
        final MeleeStrategy.Plan plan;
        /** Per enemy: the distance to its nearest other opponent. */
        final double[] nearestOther;
        /** MMOVE-6: the living teammates whose position is fresh; empty off a team. */
        final List<Roster.Mate> mates;
        /** TMODE-3, TMODE-4: the point this decision is drawn to, or null; only on a team. */
        Pull pull;
        /** TMODE-9: the teammates' bullets in flight this decision weighs; empty unless MATEFIRE. */
        List<VirtualBullet> mateBullets = List.of();
        /** TMODE-25: the teammates' bullets in flight each candidate's drive is checked against; empty unless PATH. */
        List<VirtualBullet> pathBullets = List.of();
        /** TMODE-33: whether the enemy terms count every robot between an enemy and the point; only on a team. */
        boolean concord;

        View(Point2D.Double me, double energy, long now, int others, List<EnemyInfo> enemies,
             List<VirtualBullet> bullets, MeleeStrategy.Plan plan) {
            this(me, energy, now, others, enemies, bullets, plan, List.of());
        }

        View(Point2D.Double me, double energy, long now, int others, List<EnemyInfo> enemies,
             List<VirtualBullet> bullets, MeleeStrategy.Plan plan, List<Roster.Mate> mates) {
            this.mates = mates;
            this.me = me;
            this.energy = energy;
            this.now = now;
            this.others = others;
            this.enemies = enemies;
            this.bullets = relevant(bullets, me, now);
            this.plan = plan;
            this.nearestOther = new double[enemies.size()];
            for (int i = 0; i < enemies.size(); i++) {
                double best = Double.POSITIVE_INFINITY;
                for (int j = 0; j < enemies.size(); j++) {
                    if (i == j) continue;
                    // A neighbour unseen for a while may have moved away: take it as far as it
                    // could be, so an old position never hides Hadur being the closest.
                    EnemyInfo o = enemies.get(j);
                    double drift = Math.min(MAX_DRIFT, MAX_SPEED * Math.max(0, o.age(now) - SWEEP_TICKS));
                    best = Math.min(best, enemies.get(i).location.distance(o.location) + drift);
                }
                nearestOther[i] = best;
            }
        }
    }

    private final BattleField field;
    private final Point2D.Double centre;
    private final Deque<VirtualBullet> bullets = new ArrayDeque<>();
    /** TMODE-9: the teammates' bullets from their reports, oldest first. */
    private final Deque<VirtualBullet> mateBullets = new ArrayDeque<>();
    private final Set<EnemyShot> seenShots =
        Collections.newSetFromMap(new IdentityHashMap<EnemyShot, Boolean>());
    /** MMOVE-26: the crowd weight the surfer gave each shot it processed, for the hit record. */
    private final Map<EnemyShot, Weighed> weighed = new IdentityHashMap<>();

    /** MMOVE-26: what the surfer saw of a shot when it first processed it. */
    public static final class Weighed {
        /** Living opponents nearer the shooter than Hadur was when it fired. */
        public final int nearer;
        /** The crowd weight given; under {@link #SOFT_FLOOR} the shot made no bullets. */
        public final double weight;

        Weighed(int nearer, double weight) {
            this.nearer = nearer;
            this.weight = weight;
        }
    }

    /** MMOVE-26: what the surfer saw of {@code shot} when it processed it, or null if it never did. */
    public Weighed weighed(EnemyShot shot) {
        return shot == null ? null : weighed.get(shot);
    }
    private final Deque<Point2D.Double> past = new ArrayDeque<>();
    private Point2D.Double destination;
    private Point2D.Double openingSpot;
    private long round = -1;
    /** MMOVE-15: whether this movement surfs off a team. */
    private boolean surf = MELEE_SURF;
    /** MMOVE-22: whether this movement remembers the damage each gun has done. */
    private boolean damageMemory = MELEE_DAMAGE_MEMORY;
    /** MMOVE-22: this tick's weight per opponent, averaging 1; empty when the switch is off. */
    private Map<String, Double> damageWeight = Map.of();
    public boolean damageMemory() {
        return damageMemory;
    }

    /** MMOVE-22: sets the damage memory, for tests. */
    void damageMemory(boolean on) {
        this.damageMemory = on;
    }

    /** MMOVE-22: the weights this decision's enemy terms carry, from {@link #damageWeights}. */
    public void damageWeights(Map<String, Double> weights) {
        this.damageWeight = weights == null ? Map.of() : weights;
    }

    /**
     * MMOVE-22: each living opponent's weight, (its damage to Hadur + {@link #DAMAGE_BASE}) x its
     * mean distance, scaled so the weights average 1; an opponent without a scan takes
     * {@link #DAMAGE_DISTANCE_START}.
     */
    public static Map<String, Double> damageWeights(List<EnemyInfo> alive, ToDoubleFunction<String> damage,
                                                    ToDoubleFunction<String> meanDistance) {
        if (alive.isEmpty()) return Map.of();
        Map<String, Double> raw = new HashMap<>();
        double sum = 0;
        for (EnemyInfo e : alive) {
            double d = meanDistance.applyAsDouble(e.name);
            if (!(d > 0)) d = DAMAGE_DISTANCE_START;
            double w = (Math.max(0, damage.applyAsDouble(e.name)) + DAMAGE_BASE) * d;
            raw.put(e.name, w);
            sum += w;
        }
        double mean = sum / alive.size();
        Map<String, Double> out = new HashMap<>();
        for (Map.Entry<String, Double> x : raw.entrySet()) out.put(x.getKey(), x.getValue() / mean);
        return out;
    }
    private int lastCandidates;
    /** MMOVE-8: this member's place in the team's roster, or -1 off a team. */
    private int teamIndex = -1;
    /** This member's name on a team (TMODE-13); null off one. */
    private String teamName;
    /** MMOVE-8: XORed into the noise field's hash; 0 off a team, so the field is MMOVE-1's. */
    private long salt;
    /** TMODE-27: Ogi's dodge, its shot profiles and aim experts; read only while it plays. */
    private final TeamDodge dodge;

    public MinimumRiskMovement(BattleField field) {
        this.field = field;
        this.centre = new Point2D.Double(field.width / 2, field.height / 2);
        this.dodge = new TeamDodge(field);
    }

    /** TMODE-27: the dodge's profiles and experts. */
    TeamDodge dodge() {
        return dodge;
    }

    /** TMODE-27: drops every virtual bullet, when the dodge's profiles stand in for them. */
    void clearBullets() {
        bullets.clear();
        seenShots.clear();
        weighed.clear();
    }

    /**
     * MMOVE-8: this member's place in the team's roster, 0 up; a negative index is off a team.
     * It salts the noise field and fans the opening spots out along the walls.
     */
    public void team(int index) {
        teamIndex = index < 0 ? -1 : index;
        salt = index < 0 ? 0 : mix(index + 1L);
    }

    /** MMOVE-8 with this member's own name, by which TMODE-13 orders the team. */
    public void team(int index, String name) {
        team(index);
        teamName = name;
    }

    /** Whether this member is on a team: a roster place, or a living teammate in sight (MEND-3 reads it). */
    private boolean onTeam(List<Roster.Mate> mates) {
        return teamIndex >= 0 || !mates.isEmpty();
    }

    public void newRound() {
        destination = null;
        openingSpot = null;
        bullets.clear();
        mateBullets.clear();
        seenShots.clear();
        weighed.clear();
        past.clear();
        dodge.newRound();
        round++;
    }

    /** MMOVE-15: sets the melee surfer, for tests. */
    void surf(boolean on) {
        this.surf = on;
    }

    /** MMOVE-15: whether this movement surfs off a team. */
    public boolean surfing() {
        return surf;
    }

    /**
     * Off a team: {@link #updateBullets(List, RobotStateLog, Point2D.Double, long)}, MMOVE-3.
     * {@code enemies} are the living opponents.
     */
    public void updateMeleeBullets(List<EnemyShot> shots, RobotStateLog myPath, Point2D.Double me,
                                   long now, List<EnemyInfo> enemies) {
        updateMeleeBullets(shots, myPath, me, now, enemies, null);
    }

    /**
     * As above, where with MMOVE-15 each shot also weighs by its {@link #crowdWeight} and a
     * shooter whose log in {@code danger} is deep enough makes its learned aims.
     */
    public void updateMeleeBullets(List<EnemyShot> shots, RobotStateLog myPath, Point2D.Double me,
                                   long now, List<EnemyInfo> enemies, TeamDanger danger) {
        boolean learn = surf && danger != null;
        if (!learn) {
            updateBullets(shots, myPath, me, now);
            return;
        }
        for (EnemyShot s : shots) {
            if (!seenShots.add(s)) continue;
            RobotState at = myPath.getState(s.fireTime);
            if (at == null) at = myPath.getState(s.fireTime + 1);
            Point2D.Double target = at == null ? me : at.location;
            double w = crowdWeight(s, target, enemies);
            weighed.put(s, new Weighed(nearer(s, target, enemies), w));
            if (w < SOFT_FLOOR) continue;
            List<TeamDanger.Aim> aims = at != null ? danger.aims(s, at) : null;
            if (aims != null) {
                // The SURF_AIMS nearest aims carry the shot's whole weight: melee has many shots
                // in flight, and every bullet costs each candidate's risk sum.
                int n = Math.min(SURF_AIMS, aims.size());
                double all = 0, top = 0;
                for (int i = 0; i < aims.size(); i++) {
                    all += aims.get(i).weight;
                    if (i < n) top += aims.get(i).weight;
                }
                for (int i = 0; i < n; i++) {
                    TeamDanger.Aim a = aims.get(i);
                    add(new VirtualBullet(s, VirtualBullet.Aim.LEARNED, a.heading, w * a.weight * all / top));
                }
                continue;
            }
            addGuesses(s, at, target, w);
        }
        double reach = Math.hypot(field.width, field.height);
        for (Iterator<VirtualBullet> it = bullets.iterator(); it.hasNext(); ) {
            if (it.next().passed(me, now, reach)) it.remove();
        }
        seenShots.retainAll(shots);
        weighed.keySet().retainAll(shots);
    }

    private void addGuesses(EnemyShot s, RobotState at, Point2D.Double target, double w) {
        double hot = DiaUtils.absoluteBearing(s.source, target);
        double linear = at == null ? hot : VirtualBullet.linearHeading(s.source, target,
            at.heading, at.velocity, s.speed(), field.width, field.height);
        add(new VirtualBullet(s, VirtualBullet.Aim.HEAD_ON, hot, w));
        double lw = w;
        if (WALL_LINEAR_BOOST != 1 && at != null) {
            double room = Math.min(Math.min(at.location.x, field.width - at.location.x),
                Math.min(at.location.y, field.height - at.location.y));
            if (room < WALL_LINEAR_ROOM) lw *= WALL_LINEAR_BOOST;
        }
        add(new VirtualBullet(s, VirtualBullet.Aim.LINEAR, linear, lw));
    }

    /**
     * MMOVE-15: the share of {@code shot} aimed at Hadur, standing at {@code me} when it was
     * fired: 1/(1+k)^2 for the k living opponents other than its shooter nearer its source.
     */
    static double crowdWeight(EnemyShot shot, Point2D.Double me, List<EnemyInfo> enemies) {
        int k = nearer(shot, me, enemies);
        return 1.0 / ((1 + k) * (1 + k));
    }

    /** The k of {@link #crowdWeight}: living opponents other than the shooter nearer {@code shot}'s source than {@code me}. */
    static int nearer(EnemyShot shot, Point2D.Double me, List<EnemyInfo> enemies) {
        double mine = shot.source.distance(me);
        int k = 0;
        for (EnemyInfo e : enemies) {
            if (e.location == null || e.name.equals(shot.shooter)) continue;
            if (shot.source.distance(e.location) < mine) k++;
        }
        return k;
    }

    /**
     * TMODE-9: a teammate's bullet, from its report: fired from {@code at} on {@code tick}
     * along {@code heading}. Kept whether or not MATEFIRE is on; read only when it is.
     */
    public void mateShot(String mate, Point2D.Double at, long tick, double heading, double power) {
        while (mateBullets.size() >= MATE_BULLETS) mateBullets.removeFirst();
        mateBullets.addLast(new VirtualBullet(new EnemyShot(mate, at, tick, power, 0), VirtualBullet.Aim.HEAD_ON, heading));
    }

    /** TMODE-9: the teammates' bullets that have not yet passed {@code me}; the rest are dropped. */
    List<VirtualBullet> mateBullets(Point2D.Double me, long now) {
        double reach = Math.hypot(field.width, field.height);
        mateBullets.removeIf(b -> b.passed(me, now, reach));
        return new ArrayList<>(mateBullets);
    }

    /** Virtual bullets in flight, for tests and the bench. */
    public List<VirtualBullet> bullets() {
        return new ArrayList<>(bullets);
    }

    /** Candidates the last decision scored (MMOVE-1). */
    public int lastCandidates() {
        return lastCandidates;
    }

    /**
     * Turns newly recorded shots into a head-on and a linear virtual bullet each, aimed at
     * where Hadur was when they were fired, and drops the bullets that have passed Hadur
     * (MMOVE-3).
     */
    public void updateBullets(List<EnemyShot> shots, RobotStateLog myPath, Point2D.Double me,
                              long now) {
        for (EnemyShot s : shots) {
            if (!seenShots.add(s)) continue;
            RobotState at = myPath.getState(s.fireTime);
            if (at == null) at = myPath.getState(s.fireTime + 1);
            Point2D.Double target = at == null ? me : at.location;
            double hot = DiaUtils.absoluteBearing(s.source, target);
            double linear = at == null ? hot : VirtualBullet.linearHeading(s.source, target,
                at.heading, at.velocity, s.speed(), field.width, field.height);
            add(new VirtualBullet(s, VirtualBullet.Aim.HEAD_ON, hot));
            add(new VirtualBullet(s, VirtualBullet.Aim.LINEAR, linear));
        }
        double reach = Math.hypot(field.width, field.height);
        for (Iterator<VirtualBullet> it = bullets.iterator(); it.hasNext(); ) {
            VirtualBullet b = it.next();
            if (b.passed(me, now, reach)) {
                it.remove();
            }
        }
        // Forget only the shots the tracker no longer holds, so each one turns into bullets once.
        seenShots.retainAll(shots);
    }

    /**
     * On a team (T6): as above, where {@code mates} are the living teammates' positions. With
     * {@code nearest} (TMODE-20 OWN) a shot whose source was nearer a teammate than Hadur makes
     * no bullets (MMOVE-9's rule); with {@code only} (TMODE-21 HEADON, TMODE-22 LINEAR) each shot
     * makes one virtual bullet, on that aim, at {@link TeamRisk#ONE_AIM_WEIGHT}: the team's code aims no
     * other way. With neither, or no teammate, this is
     * {@link #updateBullets(List, RobotStateLog, Point2D.Double, long)}.
     */
    public void updateBullets(List<EnemyShot> shots, RobotStateLog myPath, Point2D.Double me,
                              long now, List<Point2D.Double> mates, boolean nearest, VirtualBullet.Aim only) {
        if (mates.isEmpty() || (!nearest && only == null)) {
            updateBullets(shots, myPath, me, now);
            return;
        }
        int cap = MAX_BULLETS;
        for (EnemyShot s : shots) {
            if (!seenShots.add(s)) continue;
            RobotState at = myPath.getState(s.fireTime);
            if (at == null) at = myPath.getState(s.fireTime + 1);
            Point2D.Double target = at == null ? me : at.location;
            if (nearest && !TeamDanger.aimedAtMe(s, target, mates)) continue;
            double hot = DiaUtils.absoluteBearing(s.source, target);
            if (only == VirtualBullet.Aim.HEAD_ON) {
                add(new VirtualBullet(s, VirtualBullet.Aim.HEAD_ON, hot, ONE_AIM_WEIGHT), cap);
                continue;
            }
            double linear = at == null ? hot : VirtualBullet.linearHeading(s.source, target,
                at.heading, at.velocity, s.speed(), field.width, field.height);
            if (only == VirtualBullet.Aim.LINEAR) {
                add(new VirtualBullet(s, VirtualBullet.Aim.LINEAR, linear, ONE_AIM_WEIGHT), cap);
                continue;
            }
            add(new VirtualBullet(s, VirtualBullet.Aim.HEAD_ON, hot, 1.0), cap);
            add(new VirtualBullet(s, VirtualBullet.Aim.LINEAR, linear, 1.0), cap);
        }
        double reach = Math.hypot(field.width, field.height);
        for (Iterator<VirtualBullet> it = bullets.iterator(); it.hasNext(); ) {
            if (it.next().passed(me, now, reach)) it.remove();
        }
        seenShots.retainAll(shots);
    }

    private void add(VirtualBullet b) {
        add(b, MAX_BULLETS);
    }

    private void add(VirtualBullet b, int cap) {
        while (bullets.size() >= cap) bullets.removeFirst();
        bullets.addLast(b);
    }

    /** Picks this tick's destination. */
    public Point2D.Double chooseDestination(Point2D.Double me, double energy, int others,
                                            List<EnemyInfo> enemies, long now,
                                            MeleeStrategy.Plan plan) {
        return chooseDestination(me, energy, others, enemies, now, plan, List.of());
    }

    /** As above, on a team: the living teammates {@code mates} add their terms (MMOVE-6, MMOVE-7). */
    public Point2D.Double chooseDestination(Point2D.Double me, double energy, int others,
                                            List<EnemyInfo> enemies, long now,
                                            MeleeStrategy.Plan plan, List<Roster.Mate> mates) {
        return chooseDestination(me, energy, others, enemies, now, plan, mates, TeamModes.NONE);
    }

    /**
     * As above, with the team's {@code modes} against this team (T7): {@link TeamModes.Mode#GANG}
     * and {@link TeamModes.Mode#FINISH} draw the decision to a point (TMODE-3, TMODE-4). With
     * no teammate the modes are not read.
     */
    public Point2D.Double chooseDestination(Point2D.Double me, double energy, int others,
                                            List<EnemyInfo> enemies, long now,
                                            MeleeStrategy.Plan plan, List<Roster.Mate> mates,
                                            Set<TeamModes.Mode> modes) {
        remember(me, now);
        if (openingSpot == null) openingSpot = openingSpot(me);
        View v = new View(me, energy, now, others, enemies, new ArrayList<>(bullets), plan, mates);
        if (!mates.isEmpty() && !modes.isEmpty()) v.pull = pull(me, teamName, energy, others, enemies, now, mates, modes);
        if (!mates.isEmpty() && modes.contains(TeamModes.Mode.MATEFIRE)) v.mateBullets = relevant(mateBullets(me, now), me, now);
        v.concord = TeamConcord.MOVE && TeamConcord.RISK && !mates.isEmpty() && modes.contains(TeamModes.Mode.CONCORD);
        List<Point2D.Double> candidates = candidates(me, others, enemies, now, mates);
        lastCandidates = candidates.size();
        if (surf && !onTeam(mates)) {
            // MMOVE-15: the melee surfer picks by the wave check.
            destination = waveBest(candidates, v);
            return destination;
        }
        if (!mates.isEmpty() && modes.contains(TeamModes.Mode.DODGE)) {
            v.pathBullets = mateBullets(me, now);
            if (!TeamDodge.OWN_FIRE) v.mateBullets = List.of();
            destination = dodgeBest(candidates, v, dodge.waves());
            return destination;
        }
        if (!mates.isEmpty() && modes.contains(TeamModes.Mode.PATH)) {
            v.pathBullets = mateBullets(me, now);
            if (!v.pathBullets.isEmpty()) {
                destination = TeamRisk.pathBest(this, destination, candidates, v);
                return destination;
            }
        }
        Point2D.Double best = null;
        double bestRisk = Double.POSITIVE_INFINITY;
        for (Point2D.Double p : candidates) {
            double r = risk(p, v);
            if (r < bestRisk) {
                bestRisk = r;
                best = p;
            }
        }
        if (destination != null && destination.distance(me) > REACHED
                && bestRisk >= SWITCH_GAIN * risk(destination, v)) {
            return destination;
        }
        destination = best;
        return destination;
    }

    /**
     * {@link #CANDIDATES} points on rings around {@code me}, capped at
     * {@link #NEAREST_FRACTION} of the nearest opponent's distance and moved inside the
     * field's margin (MMOVE-1). With two opponents left the ring is the endgame one (MMOVE-4).
     */
    public List<Point2D.Double> candidates(Point2D.Double me, int others, List<EnemyInfo> enemies) {
        return candidates(me, others, enemies, Long.MIN_VALUE);
    }

    /**
     * As {@link #candidates(Point2D.Double, int, List)}, where only opponents scanned within
     * {@link #CAP_MAX_AGE} ticks of {@code now} cap the ring, and the cap is never below
     * {@link #MIN_RING}: an old position must not pin Hadur where the opponent used to be.
     */
    public List<Point2D.Double> candidates(Point2D.Double me, int others, List<EnemyInfo> enemies,
                                           long now) {
        return candidates(me, others, enemies, now, List.of());
    }

    /**
     * As above, where the nearest of {@code mates} caps the ring like the nearest opponent
     * (MMOVE-7); {@code mates} are the living teammates whose position is fresh at {@code now}.
     */
    public List<Point2D.Double> candidates(Point2D.Double me, int others, List<EnemyInfo> enemies,
                                           long now, List<Roster.Mate> mates) {
        boolean endgame = others == 2;
        double min = endgame ? ENDGAME_RING_MIN : RING_MIN;
        double max = endgame ? ENDGAME_RING_MAX : RING_MAX;
        double nearest = Double.POSITIVE_INFINITY;
        for (EnemyInfo e : enemies) {
            if (now != Long.MIN_VALUE && e.age(now) >= CAP_MAX_AGE) continue;
            nearest = Math.min(nearest, e.location.distance(me));
        }
        for (Roster.Mate m : mates) nearest = Math.min(nearest, m.at(now).distance(me));
        double cap = Math.max(MIN_RING, NEAREST_FRACTION * nearest);
        List<Point2D.Double> out = new ArrayList<>(CANDIDATES);
        for (int ring = 0; ring < RINGS; ring++) {
            double d = min + (max - min) * ring / (RINGS - 1);
            d = Math.min(d, cap);
            // Stagger the rings so their points do not line up.
            double offset = ring % 2 == 0 ? 0 : Math.PI / ANGLES;
            for (int i = 0; i < ANGLES; i++) {
                Point2D.Double p = DiaUtils.project(me, offset + i * 2 * Math.PI / ANGLES, d);
                out.add(clip(p));
            }
        }
        return out;
    }

    Point2D.Double clip(Point2D.Double p) {
        return new Point2D.Double(
            DiaUtils.limit(WALL_MARGIN, p.x, field.width - WALL_MARGIN),
            DiaUtils.limit(WALL_MARGIN, p.y, field.height - WALL_MARGIN));
    }

    /**
     * TMODE-11, Ogi's wave check: the {@link #WAVE_RERANK} lowest-risk candidates, and the
     * destination held if not reached, are each driven to for {@link #WAVE_TICKS} ticks, and
     * every shot in flight that crosses Hadur's box on the way counts the share of it aimed
     * there. A shot is a profile that sums to its aimed-at weight, not a certain bullet: its
     * virtual bullets' headings share {@code 1 - }{@link #WAVE_UNIFORM} of it, and the rest is
     * spread over its escape angle. The score is {@code risk / median(risk) + 3 x damage /
     * max(0.1, median(damage))}, each risk measured from the least of them (the posture term
     * can make risks negative), times {@link #SWITCH_GAIN} for the held destination.
     */
    Point2D.Double waveBest(List<Point2D.Double> candidates, View v) {
        return rerankBest(candidates, v, WAVE_RERANK, Wave.of(v.bullets), List.of(), false);
    }

    /**
     * TMODE-27, Ogi's dodge: the {@link TeamDodge#RERANK} lowest-risk candidates, and the
     * destination held if not reached, are each driven to through the shot profiles
     * {@code waves} for {@link #WAVE_TICKS} ticks and through the teammates' bullets for
     * {@link TeamRisk#PATH_TICKS}; scored as {@link #waveScores}, the held destination times
     * {@link #SWITCH_GAIN}.
     */
    Point2D.Double dodgeBest(List<Point2D.Double> candidates, View v, List<Wave> waves) {
        return rerankBest(candidates, v, TeamDodge.RERANK, waves, v.pathBullets, TeamDodge.OWN_FIRE);
    }

    /**
     * TMODE-11, TMODE-27: the {@code rerank} lowest-risk candidates, and the destination held if
     * not reached, each driven to through the {@code waves} for {@link #WAVE_TICKS} ticks and
     * through the teammates' {@code bullets} for {@link TeamRisk#PATH_TICKS}; scored as
     * {@link #waveScores}, the held destination times {@link #SWITCH_GAIN}. With
     * {@code ownFire} the teammates' bullets add {@link TeamRisk#PATH_K} times their damage to the
     * risk, as PATH scores them, instead of joining the waves' damage.
     */
    Point2D.Double rerankBest(List<Point2D.Double> candidates, View v, int rerank, List<Wave> waves,
                              List<VirtualBullet> mateBullets, boolean ownFire) {
        List<Point2D.Double> pool = new ArrayList<>(candidates);
        boolean hold = destination != null && destination.distance(v.me) > REACHED;
        if (hold) pool.add(destination);
        double[] risk = new double[pool.size()];
        Integer[] order = new Integer[pool.size()];
        for (int i = 0; i < pool.size(); i++) {
            risk[i] = risk(pool.get(i), v);
            order[i] = i;
        }
        java.util.Arrays.sort(order, (a, b) -> Double.compare(risk[a], risk[b]));
        List<Integer> picked = new ArrayList<>();
        for (int i = 0; i < order.length && picked.size() < rerank; i++) picked.add(order[i]);
        if (hold && !picked.contains(pool.size() - 1)) picked.add(pool.size() - 1);
        double[] damage = new double[picked.size()];
        double[] r = new double[picked.size()];
        for (int k = 0; k < picked.size(); k++) {
            Point2D.Double p = pool.get(picked.get(k));
            r[k] = risk[picked.get(k)];
            damage[k] = waveDamage(v.me, p, v.now, waves);
            if (mateBullets.isEmpty()) continue;
            double own = pathDamage(v.me, p, v.now, mateBullets);
            if (ownFire) r[k] += PATH_K * own;
            else damage[k] += own;
        }
        double[] score = waveScores(r, damage);
        Point2D.Double best = null;
        double bestScore = Double.POSITIVE_INFINITY;
        for (int k = 0; k < picked.size(); k++) {
            double sc = score[k];
            if (hold && picked.get(k) == pool.size() - 1) sc *= SWITCH_GAIN;
            if (sc < bestScore) {
                bestScore = sc;
                best = pool.get(picked.get(k));
            }
        }
        return best;
    }

    /**
     * TMODE-11: each destination's score from its risk and wave damage. The posture term may
     * make a risk negative, so each risk is measured from the least of them, which keeps the
     * order and gives the median a positive scale.
     */
    static double[] waveScores(double[] risk, double[] damage) {
        double least = Double.POSITIVE_INFINITY;
        for (double x : risk) least = Math.min(least, x);
        double[] shifted = new double[risk.length];
        for (int k = 0; k < risk.length; k++) shifted[k] = risk[k] - least;
        double riskMedian = Math.max(1e-9, median(shifted));
        double damageMedian = Math.max(WAVE_MEDIAN_FLOOR, median(damage));
        double[] out = new double[risk.length];
        for (int k = 0; k < risk.length; k++) {
            out[k] = shifted[k] / riskMedian + WAVE_DAMAGE_K * damage[k] / damageMedian;
        }
        return out;
    }

    static double median(double[] xs) {
        double[] s = xs.clone();
        java.util.Arrays.sort(s);
        int n = s.length;
        if (n == 0) return 0;
        return n % 2 == 1 ? s[n / 2] : (s[n / 2 - 1] + s[n / 2]) / 2;
    }

    /**
     * TMODE-11: the damage the {@code waves} are expected to do Hadur driving from {@code me}
     * straight to {@code to} (accelerating 1 px a tick to 8, stopping there) for
     * {@link #WAVE_TICKS} ticks. Each wave counts once, on the tick its front crosses the box.
     */
    static double waveDamage(Point2D.Double me, Point2D.Double to, long now, List<Wave> waves) {
        if (waves.isEmpty()) return 0;
        boolean[] done = new boolean[waves.size()];
        double total = 0;
        double x = me.x, y = me.y, speed = 0;
        for (int t = 1; t <= WAVE_TICKS; t++) {
            double left = Math.hypot(to.x - x, to.y - y);
            if (left > 0.5) {
                speed = Math.min(MAX_SPEED, Math.min(speed + 1, left));
                x += (to.x - x) / left * speed;
                y += (to.y - y) / left * speed;
            }
            total += waveHits(x, y, now + t, waves, done);
        }
        return total;
    }

    /** The mass of the {@code waves} not yet {@code done} whose front crosses Hadur's box at ({@code x}, {@code y}) on {@code tick}; marks them done. */
    private static double waveHits(double x, double y, long tick, List<Wave> waves, boolean[] done) {
        double total = 0;
        for (int i = 0; i < waves.size(); i++) {
            if (done[i]) continue;
            Wave w = waves.get(i);
            double d = Math.hypot(x - w.source.x, y - w.source.y);
            double front = w.speed * (tick - w.fireTime);
            if (front < d - WAVE_HALF) continue;
            done[i] = true;
            if (front - w.speed > d + WAVE_HALF) continue;
            double bearing = Math.atan2(x - w.source.x, y - w.source.y);
            double half = Math.atan(WAVE_HALF / Math.max(d, WAVE_HALF));
            total += w.mass(bearing, half);
        }
        return total;
    }

    /** TMODE-11: one shot in flight as a profile over its headings. */
    static final class Wave {
        final Point2D.Double source;
        final String shooter;
        final long fireTime;
        final double speed;
        final double damage;
        /** The aimed-at weight: the most the wave can do, as a share of one bullet. */
        final double aimed;
        final double[] headings;
        final double[] shares;
        final double centre;
        final double escape;

        Wave(EnemyShot shot, List<VirtualBullet> bullets) {
            source = shot.source;
            shooter = shot.shooter;
            fireTime = shot.fireTime;
            speed = shot.speed();
            damage = 4 * shot.power + Math.max(0, 2 * (shot.power - 1));
            double sum = 0, max = 0;
            boolean learned = false;
            for (VirtualBullet b : bullets) {
                sum += b.weight;
                max = Math.max(max, b.weight);
                learned |= b.aim == VirtualBullet.Aim.LEARNED;
            }
            aimed = Math.min(1.0, learned ? sum : max);
            headings = new double[bullets.size()];
            shares = new double[bullets.size()];
            double c = Double.NaN;
            for (int i = 0; i < bullets.size(); i++) {
                VirtualBullet b = bullets.get(i);
                headings[i] = b.heading;
                shares[i] = sum > 0 ? b.weight / sum : 1.0 / bullets.size();
                if (b.aim == VirtualBullet.Aim.HEAD_ON || Double.isNaN(c)) c = b.heading;
            }
            centre = c;
            escape = Math.asin(Math.min(1.0, MAX_SPEED / speed));
        }

        /**
         * TMODE-27: a shot's profile given outright: {@code headings} with their {@code shares}
         * (summing to 1), {@code aimed} the share of the shot meant for Hadur, and the uniform
         * part centred on {@code centre}, the head-on heading.
         */
        Wave(EnemyShot shot, double aimed, double[] headings, double[] shares, double centre) {
            source = shot.source;
            shooter = shot.shooter;
            fireTime = shot.fireTime;
            speed = shot.speed();
            damage = 4 * shot.power + Math.max(0, 2 * (shot.power - 1));
            this.aimed = Math.min(1.0, aimed);
            this.headings = headings.clone();
            this.shares = shares.clone();
            this.centre = centre;
            escape = Math.asin(Math.min(1.0, MAX_SPEED / speed));
        }

        /** The waves of {@code bullets}, one for each shot, in the order first seen. */
        static List<Wave> of(List<VirtualBullet> bullets) {
            IdentityHashMap<EnemyShot, List<VirtualBullet>> by = new IdentityHashMap<>();
            List<EnemyShot> order = new ArrayList<>();
            for (VirtualBullet b : bullets) {
                List<VirtualBullet> l = by.get(b.shot);
                if (l == null) {
                    l = new ArrayList<>();
                    by.put(b.shot, l);
                    order.add(b.shot);
                }
                l.add(b);
            }
            List<Wave> out = new ArrayList<>(order.size());
            for (EnemyShot s : order) out.add(new Wave(s, by.get(s)));
            return out;
        }

        /** The expected damage to a box at {@code bearing} from the source, {@code half} radians each side. */
        double mass(double bearing, double half) {
            double m = 0;
            double sigma = Math.max(1e-3, half / 2);
            for (int i = 0; i < headings.length; i++) {
                double off = Angles.normalRelativeAngle(bearing - headings[i]);
                m += shares[i] * (phi((off + half) / sigma) - phi((off - half) / sigma));
            }
            m *= 1 - WAVE_UNIFORM;
            double off = Math.abs(Angles.normalRelativeAngle(bearing - centre));
            double lo = Math.max(off - half, -escape), hi = Math.min(off + half, escape);
            if (hi > lo) m += WAVE_UNIFORM * (hi - lo) / (2 * escape);
            return aimed * m * damage;
        }
    }

    /** The standard normal distribution function (Abramowitz and Stegun 7.1.26). */
    static double phi(double z) {
        double x = Math.abs(z) / Math.sqrt(2);
        double t = 1 / (1 + 0.3275911 * x);
        double erf = 1 - ((((1.061405429 * t - 1.453152027) * t + 1.421413741) * t - 0.284496736) * t
            + 0.254829592) * t * Math.exp(-x * x);
        return z >= 0 ? 0.5 * (1 + erf) : 0.5 * (1 - erf);
    }

    /** The whole risk of {@code p}. */
    public double risk(Point2D.Double p, View v) {
        double r = 0;
        for (int i = 0; i < v.enemies.size(); i++) {
            EnemyInfo e = v.enemies.get(i);
            double w = 1.0;
            if (v.plan.fight != null && (e == v.plan.fight[0] || e == v.plan.fight[1])) {
                w = FIGHT_WEIGHT;
            }
            r += w * enemyRisk(p, v, i);
        }
        // TMODE-13: a pull that leaves the bullets alone adds them after it scales the rest.
        boolean apart = v.pull != null && !v.pull.scalesBullets;
        double shots = 0;
        if (apart) {
            shots = bulletRisk(p, v.me, v.bullets, v.now);
            if (!v.mateBullets.isEmpty()) shots += bulletRisk(p, v.me, v.mateBullets, v.now);
        } else {
            r += bulletRisk(p, v.me, v.bullets, v.now);
            if (!v.mateBullets.isEmpty()) r += bulletRisk(p, v.me, v.mateBullets, v.now);
        }
        r += centreRisk(p) + wallRisk(p) + cornerRisk(p) + pastRisk(p) + noise(p);
        if (v.now < OPENING_TICKS && openingSpot != null) {
            r += OPENING_K * p.distance(openingSpot) / 500.0;
        }
        if (!v.mates.isEmpty()) r += TeamRisk.teammateRisk(p, v);
        // TMODE-3, TMODE-4: the pull scales every term but the posture's, which may be negative.
        if (v.pull != null) r *= v.pull.factor(v.me, p);
        if (apart) r += shots;
        return r + postureRisk(p, v.enemies, v.plan);
    }

    /** Opponent {@code i}'s term: energy over distance squared, with the closest-robot factor (MMOVE-2). */
    double enemyRisk(Point2D.Double p, View v, int i) {
        EnemyInfo e = v.enemies.get(i);
        double d = Math.max(1.0, p.distance(e.location));
        double energy = Math.min(Math.max(e.energy, 1.0) / Math.max(v.energy, 1.0), ENERGY_RATIO_CAP);
        double r = UNIT * e.freshness(v.now) * energy / (d * d);
        r *= v.concord ? concordFactor(p, e, v, i) : closestFactor(p, e, v.nearestOther[i], v.now, v.others, onTeam(v.mates));
        // MMOVE-22: the guns that have hurt Hadur this battle weigh more, the harmless ones less.
        if (damageMemory && !onTeam(v.mates)) r *= damageWeight.getOrDefault(e.name, 1.0);
        if (p.distance(v.me) > 1) {
            double lateral = v.others == 2 ? ENDGAME_LATERAL : LATERAL;
            double a = DiaUtils.absoluteBearing(p, e.location) - DiaUtils.absoluteBearing(v.me, p);
            r *= 1.0 + lateral * Math.abs(Math.cos(a));
        }
        return r;
    }

    /**
     * 2 where Hadur at {@code p} would be {@code e}'s closest robot, 4 in the opening, and
     * half again if {@code e} hit Hadur lately (MMOVE-2).
     */
    double closestFactor(Point2D.Double p, EnemyInfo e, double nearestOther, long now) {
        return closestFactor(p, e, nearestOther, now, 0, false);
    }

    /** As above with {@code others} opponents left; MEND-3 may raise the factor off a team. */
    double closestFactor(Point2D.Double p, EnemyInfo e, double nearestOther, long now, int others, boolean onTeam) {
        double c = 1.0;
        if (p.distance(e.location) < nearestOther) {
            c = MeleeEndgame.closestFactor(CLOSEST_FACTOR, others, onTeam,
                MeleeEndgame.THREE_FAR);
            if (now < OPENING_TICKS) c *= 2;
        }
        if (e.lastHitHadur >= 0 && now - e.lastHitHadur <= RECENT_HIT_TICKS) c *= RECENT_HIT_FACTOR;
        return c;
    }

    /**
     * The virtual bullets' danger at {@code p}: a bullet that passes within {@link #HIT_RADIUS}
     * of it within {@link #HIT_WINDOW} ticks of Hadur arriving, widened by the uncertainty of
     * the shot's fire tick, is a hit. The route there is deliberately not scored: virtual
     * bullets are guesses (two per shot), and counting every guessed path Hadur would cross
     * hems it in. Scoring the route, sampled or in closed form, cost 3 to 5 APS on the
     * reference field with no rise in skipped turns (docs/bench/m4-gates.md); the destination
     * is re-scored every tick as Hadur moves. Each bullet counts once, at its
     * nearest point, weighted by its damage; nearer misses count for less (MMOVE-3).
     */
    /**
     * The bullets that can come near any candidate: every candidate and every point on the way
     * to it is within {@link #RING_MAX} of Hadur, so a bullet that stays further than that
     * plus three hit radii from Hadur until the furthest candidate is reached adds nothing
     * worth the time it takes to score (TIME-1).
     */
    static List<VirtualBullet> relevant(List<VirtualBullet> bullets, Point2D.Double me, long now) {
        List<VirtualBullet> out = new ArrayList<>(bullets.size());
        double horizon = now + RING_MAX / TRAVEL_SPEED + HIT_WINDOW;
        for (VirtualBullet b : bullets) {
            double to = horizon + b.shot.window;
            if (b.closestApproach(me, now, to) <= RING_MAX + 3 * HIT_RADIUS) out.add(b);
        }
        return out;
    }

    public static double bulletRisk(Point2D.Double p, Point2D.Double me,
                                    List<VirtualBullet> bullets, long now) {
        if (bullets.isEmpty()) return 0;
        double travel = p.distance(me) / TRAVEL_SPEED;
        double r = 0;
        for (VirtualBullet b : bullets) {
            double window = HIT_WINDOW + b.shot.window;
            double arrive = now + travel;
            double d = b.closestApproach(p, Math.max(now, arrive - window), arrive + window);
            double damage = 4 * b.shot.power + Math.max(0, 2 * (b.shot.power - 1));
            double x = d / HIT_RADIUS;
            r += b.weight * BULLET_K * damage / 4.0 * Math.exp(-x * x);
        }
        return r;
    }

    double centreRisk(Point2D.Double p) {
        double reach = Math.min(field.width, field.height) / 2;
        return CENTRE_K * Math.max(0, 1 - p.distance(centre) / reach);
    }

    double wallRisk(Point2D.Double p) {
        return wallTerm(p.x) + wallTerm(field.width - p.x)
            + wallTerm(p.y) + wallTerm(field.height - p.y);
    }

    static double wallTerm(double d) {
        return d >= WALL_RANGE ? 0 : WALL_K * (1 - d / WALL_RANGE);
    }

    double cornerRisk(Point2D.Double p) {
        double d = Math.min(
            Math.min(p.distance(0, 0), p.distance(field.width, 0)),
            Math.min(p.distance(0, field.height), p.distance(field.width, field.height)));
        return d >= CORNER_RANGE ? 0 : CORNER_K * (1 - d / CORNER_RANGE);
    }

    double pastRisk(Point2D.Double p) {
        double r = 0;
        for (Point2D.Double q : past) {
            double d = Math.max(50.0, p.distance(q));
            r += PAST_K * 2500.0 / (d * d);
        }
        return r;
    }

    /**
     * A fixed pseudo-random field over the battlefield, different every round, and on a team
     * different for each member (MMOVE-8).
     */
    double noise(Point2D.Double p) {
        long cx = (long) Math.floor(p.x / NOISE_CELL);
        long cy = (long) Math.floor(p.y / NOISE_CELL);
        return NOISE_K * unit(mix(round * 0x9E3779B97F4A7C15L ^ (cx << 20) ^ cy ^ salt));
    }

    static long mix(long z) {
        z = (z ^ (z >>> 30)) * 0xBF58476D1CE4E5B9L;
        z = (z ^ (z >>> 27)) * 0x94D049BB133111EBL;
        return z ^ (z >>> 31);
    }

    static double unit(long z) {
        return (z >>> 11) * 0x1.0p-53;
    }

    private void remember(Point2D.Double me, long now) {
        if (now % PAST_EVERY != 0) return;
        if (past.size() >= PAST_POSITIONS) past.removeFirst();
        past.addLast(new Point2D.Double(me.x, me.y));
    }

    /**
     * The opening's goal: the nearest wall's spot {@link #OPENING_WALL_GAP} px off it, at
     * least {@link #OPENING_CORNER_GAP} px from either corner.
     */
    Point2D.Double openingSpot(Point2D.Double me) {
        double left = me.x, right = field.width - me.x, bottom = me.y, top = field.height - me.y;
        double m = Math.min(Math.min(left, right), Math.min(bottom, top));
        double gapX = Math.min(OPENING_CORNER_GAP, field.width / 2);
        double gapY = Math.min(OPENING_CORNER_GAP, field.height / 2);
        double alongX = DiaUtils.limit(gapX, me.x, field.width - gapX);
        double alongY = DiaUtils.limit(gapY, me.y, field.height - gapY);
        // MMOVE-8: on a team the spots fan out along the wall by the member's place (centred on
        // a roster of five), still clear of the corners; off a team there is no shift.
        if (teamIndex >= 0) {
            double fan = (teamIndex - 2) * MATE_FAN;
            alongX = DiaUtils.limit(gapX, alongX + fan, field.width - gapX);
            alongY = DiaUtils.limit(gapY, alongY + fan, field.height - gapY);
        }
        if (m == left) return new Point2D.Double(OPENING_WALL_GAP, alongY);
        if (m == right) return new Point2D.Double(field.width - OPENING_WALL_GAP, alongY);
        if (m == bottom) return new Point2D.Double(alongX, OPENING_WALL_GAP);
        return new Point2D.Double(alongX, field.height - OPENING_WALL_GAP);
    }

    /** Where the opening heads this round, once the first decision is made. */
    public Point2D.Double openingSpot() {
        return openingSpot;
    }

    double postureRisk(Point2D.Double p, List<EnemyInfo> enemies, MeleeStrategy.Plan plan) {
        switch (plan.posture) {
            case LOW_PROFILE: {
                Point2D.Double c = centroid(enemies);
                return c == null ? 0 : -PERIPHERY_K * Math.min(p.distance(c), 500) / 500;
            }
            case AGGRESSIVE:
                if (plan.preferredTarget == null) return 0;
                return CUTOFF_K * p.distance(cutOffPoint(plan.preferredTarget)) / 500;
            case LET_THEM_FIGHT: {
                if (plan.fight == null) return 0;
                Point2D.Double mid = new Point2D.Double(
                    (plan.fight[0].location.x + plan.fight[1].location.x) / 2,
                    (plan.fight[0].location.y + plan.fight[1].location.y) / 2);
                double r = FIGHT_K * Math.max(0, FIGHT_CLEARANCE - p.distance(mid)) / FIGHT_CLEARANCE;
                if (plan.preferredTarget != null) {
                    double d = p.distance(plan.preferredTarget.location);
                    r += FIGHT_K * Math.max(0, d - FINISH_RANGE) / FINISH_RANGE;
                }
                return r;
            }
            default:
                return 0;
        }
    }

    /** The spot between {@code target} and open space: holding it pins the target to the walls. */
    public Point2D.Double cutOffPoint(EnemyInfo target) {
        double toCentre = DiaUtils.absoluteBearing(target.location, centre);
        double d = Math.min(CUTOFF_DISTANCE, target.location.distance(centre));
        return field.translateToField(DiaUtils.project(target.location, toCentre, d));
    }

    static Point2D.Double centroid(List<EnemyInfo> enemies) {
        if (enemies.isEmpty()) return null;
        double x = 0, y = 0;
        for (EnemyInfo e : enemies) {
            x += e.location.x;
            y += e.location.y;
        }
        return new Point2D.Double(x / enemies.size(), y / enemies.size());
    }

    /** A view for scoring points outside a decision, as tests and the bench do. */
    public View view(Point2D.Double me, double energy, long now, int others,
                     List<EnemyInfo> enemies, MeleeStrategy.Plan plan) {
        return new View(me, energy, now, others, enemies, new ArrayList<>(bullets), plan);
    }

    /** As above with the living teammates a team member sees (MMOVE-6). */
    public View view(Point2D.Double me, double energy, long now, int others,
                     List<EnemyInfo> enemies, MeleeStrategy.Plan plan, List<Roster.Mate> mates) {
        return new View(me, energy, now, others, enemies, new ArrayList<>(bullets), plan, mates);
    }
}

package hadur2.core.melee;

import hadur2.core.model.RobotState;
import hadur2.core.model.RobotStateLog;
import hadur2.core.physics.BattleField;
import hadur2.core.physics.DiaUtils;
import java.awt.geom.Point2D;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

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
 * <li>the melee strategy's posture (MELEE-8).</li>
 * </ul>
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
    static final double SWITCH_GAIN = 0.9;
    static final double REACHED = 20;

    static final double PERIPHERY_K = 0.2;
    static final double CUTOFF_K = 0.4;
    static final double FIGHT_K = 0.4;
    static final double FIGHT_WEIGHT = 2.0;
    static final double CUTOFF_DISTANCE = 220.0;
    static final double FIGHT_CLEARANCE = 350.0;
    static final double FINISH_RANGE = 550.0;

    private static final double UNIT = 100.0 * 100.0;
    /** A robot's top speed, and the most drift an unseen opponent's position is given. */
    static final double MAX_SPEED = 8.0;
    static final double MAX_DRIFT = 400.0;
    /** Opponents scanned longer ago than one sweep do not cap the ring. */
    static final long CAP_MAX_AGE = 8;
    /** The ring never shrinks below a robot's width, so Hadur can always move. */
    static final double MIN_RING = 36.0;
    /** Points along the way to a candidate where the virtual bullets are checked. */
    static final int ROUTE_SAMPLES = 4;

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

        View(Point2D.Double me, double energy, long now, int others, List<EnemyInfo> enemies,
             List<VirtualBullet> bullets, MeleeStrategy.Plan plan) {
            this.me = me;
            this.energy = energy;
            this.now = now;
            this.others = others;
            this.enemies = enemies;
            this.bullets = bullets;
            this.plan = plan;
            this.nearestOther = new double[enemies.size()];
            for (int i = 0; i < enemies.size(); i++) {
                double best = Double.POSITIVE_INFINITY;
                for (int j = 0; j < enemies.size(); j++) {
                    if (i == j) continue;
                    // A neighbour unseen for a while may have moved away: take it as far as it
                    // could be, so an old position never hides Hadur being the closest.
                    EnemyInfo o = enemies.get(j);
                    double drift = Math.min(MAX_DRIFT, MAX_SPEED * Math.max(0, o.age(now)));
                    best = Math.min(best, enemies.get(i).location.distance(o.location) + drift);
                }
                nearestOther[i] = best;
            }
        }
    }

    private final BattleField field;
    private final Point2D.Double centre;
    private final Deque<VirtualBullet> bullets = new ArrayDeque<>();
    private final Set<EnemyShot> seenShots =
        Collections.newSetFromMap(new IdentityHashMap<EnemyShot, Boolean>());
    private final Deque<Point2D.Double> past = new ArrayDeque<>();
    private Point2D.Double destination;
    private Point2D.Double openingSpot;
    private long round = -1;
    private int lastCandidates;

    public MinimumRiskMovement(BattleField field) {
        this.field = field;
        this.centre = new Point2D.Double(field.width / 2, field.height / 2);
    }

    public void newRound() {
        destination = null;
        openingSpot = null;
        bullets.clear();
        seenShots.clear();
        past.clear();
        round++;
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

    private void add(VirtualBullet b) {
        if (bullets.size() >= MAX_BULLETS) bullets.removeFirst();
        bullets.addLast(b);
    }

    /** Picks this tick's destination. */
    public Point2D.Double chooseDestination(Point2D.Double me, double energy, int others,
                                            List<EnemyInfo> enemies, long now,
                                            MeleeStrategy.Plan plan) {
        remember(me, now);
        if (openingSpot == null) openingSpot = openingSpot(me);
        View v = new View(me, energy, now, others, enemies, new ArrayList<>(bullets), plan);
        List<Point2D.Double> candidates = candidates(me, others, enemies, now);
        lastCandidates = candidates.size();
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
        boolean endgame = others == 2;
        double min = endgame ? ENDGAME_RING_MIN : RING_MIN;
        double max = endgame ? ENDGAME_RING_MAX : RING_MAX;
        double nearest = Double.POSITIVE_INFINITY;
        for (EnemyInfo e : enemies) {
            if (now != Long.MIN_VALUE && e.age(now) > CAP_MAX_AGE) continue;
            nearest = Math.min(nearest, e.location.distance(me));
        }
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
        r += bulletRisk(p, v.me, v.bullets, v.now);
        r += centreRisk(p) + wallRisk(p) + cornerRisk(p) + pastRisk(p) + noise(p);
        if (v.now < OPENING_TICKS && openingSpot != null) {
            r += OPENING_K * p.distance(openingSpot) / 500.0;
        }
        return r + postureRisk(p, v.enemies, v.plan);
    }

    /** Opponent {@code i}'s term: energy over distance squared, with the closest-robot factor (MMOVE-2). */
    double enemyRisk(Point2D.Double p, View v, int i) {
        EnemyInfo e = v.enemies.get(i);
        double d = Math.max(1.0, p.distance(e.location));
        double energy = Math.min(Math.max(e.energy, 1.0) / Math.max(v.energy, 1.0), ENERGY_RATIO_CAP);
        double r = UNIT * e.freshness(v.now) * energy / (d * d);
        r *= closestFactor(p, e, v.nearestOther[i], v.now);
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
        double c = 1.0;
        if (p.distance(e.location) < nearestOther) {
            c = CLOSEST_FACTOR;
            if (now < OPENING_TICKS) c *= 2;
        }
        if (e.lastHitHadur >= 0 && now - e.lastHitHadur <= RECENT_HIT_TICKS) c *= RECENT_HIT_FACTOR;
        return c;
    }

    /**
     * The virtual bullets' danger on the way to {@code p}: Hadur drives there in a straight
     * line, and at each of {@link #ROUTE_SAMPLES} points along it a bullet that passes within
     * {@link #HIT_RADIUS} within {@link #HIT_WINDOW} ticks of Hadur being there, widened by
     * the uncertainty of the shot's fire tick, is a hit. Each bullet counts once, at its
     * nearest point, weighted by its damage; nearer misses count for less (MMOVE-3).
     */
    public static double bulletRisk(Point2D.Double p, Point2D.Double me,
                                    List<VirtualBullet> bullets, long now) {
        if (bullets.isEmpty()) return 0;
        double travel = p.distance(me) / TRAVEL_SPEED;
        double r = 0;
        for (VirtualBullet b : bullets) {
            double window = HIT_WINDOW + b.shot.window;
            double d = Double.POSITIVE_INFINITY;
            for (int k = 1; k <= ROUTE_SAMPLES; k++) {
                double f = (double) k / ROUTE_SAMPLES;
                Point2D.Double at = new Point2D.Double(me.x + f * (p.x - me.x), me.y + f * (p.y - me.y));
                double arrive = now + f * travel;
                double from = Math.max(now, arrive - window);
                d = Math.min(d, b.closestApproach(at, from, arrive + window));
            }
            double damage = 4 * b.shot.power + Math.max(0, 2 * (b.shot.power - 1));
            double x = d / HIT_RADIUS;
            r += BULLET_K * damage / 4.0 * Math.exp(-x * x);
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

    /** A fixed pseudo-random field over the battlefield, different every round. */
    double noise(Point2D.Double p) {
        long cx = (long) Math.floor(p.x / NOISE_CELL);
        long cy = (long) Math.floor(p.y / NOISE_CELL);
        return NOISE_K * unit(mix(round * 0x9E3779B97F4A7C15L ^ (cx << 20) ^ cy));
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
}

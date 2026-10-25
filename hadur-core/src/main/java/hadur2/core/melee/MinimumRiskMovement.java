package hadur2.core.melee;

import hadur2.core.world.EnemyInfo;
import hadur2.core.world.EnemyShot;
import hadur2.core.world.Roster;
import hadur2.core.model.RobotState;
import hadur2.core.model.RobotStateLog;
import hadur2.core.physics.Angles;
import hadur2.core.physics.BattleField;
import hadur2.core.physics.DiaUtils;
import java.awt.geom.Line2D;
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
    /** MMOVE-10: a learned shot makes up to {@link TeamDanger#K} bullets, so the cap is three times MMOVE-3's. */
    static final int LEARNED_MAX_BULLETS = 3 * MAX_BULLETS;

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
    /** MMOVE-6: weight, in units of {@link #UNIT}, of a teammate's inverse-square term. */
    static final double MATE_K = 0.6;
    /** MMOVE-6: a teammate nearer than this is scored as if at this distance: about a robot's width. */
    static final double MATE_FLOOR = 36;
    /** MMOVE-7: weight, and reach in px, of the term for a path crossing a teammate's track. */
    static final double MATE_PATH_K = 0.3;
    static final double MATE_PATH_RANGE = 60;
    /** MMOVE-8: how far apart, along its wall, the opening spots of two members in the roster are. */
    static final double MATE_FAN = 120;
    /** TMODE-2: a shot's weight is 1/(1+k)^2 for k teammates nearer its shooter; under this it makes no bullets. */
    static final double SOFT_FLOOR = 0.1;
    /** TMODE-3: an enemy within this of a robot counts toward ganging it; two make a gang. */
    static final double GANG_RANGE = 250;
    static final int GANG_SIZE = 2;
    /** TMODE-3: the pull's strength, and the floor when helping a ganged teammate. */
    static final double GANG_PULL = 0.5;
    static final double HELP_FLOOR = 300;
    /** TMODE-4: the last enemy pulls this hard, down to this distance, while Hadur has this energy. */
    static final double FINISH_PULL = 1.0;
    static final double FINISH_FLOOR = 350;
    static final double FINISH_ENERGY = 30;
    /** TMODE-5: the prey's cost weighs its energy this much against its distance (NightmareTeam's 1.2). */
    static final double PACK_ENERGY_WEIGHT = 1.2;
    /** TMODE-5: the pincer's radius as a share of the nearest member's distance (NightmareTeam's 0.74), and its bounds. */
    static final double PACK_RADIUS_SHARE = 0.74;
    static final double PACK_MIN_RADIUS = 150;
    static final double PACK_MAX_RADIUS = 450;
    /** TMODE-5: members' places are at most this far apart round the prey: 70 degrees. */
    static final double PACK_SPREAD = Math.toRadians(70);
    /** TMODE-5: the pull's strength, its floor, and the energy a member needs to hunt. */
    static final double PACK_PULL = 1.0;
    static final double PACK_FLOOR = 40;
    static final double PACK_ENERGY = 20;
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
    /**
     * A robot's top speed, and the most drift an unseen opponent's position is given beyond
     * the usual {@link #SWEEP_TICKS} between scans, which every position shares.
     */
    static final double MAX_SPEED = 8.0;
    static final double MAX_DRIFT = 400.0;
    static final long SWEEP_TICKS = 10;
    /** Opponents whose data has gone stale do not cap the ring. */
    static final long CAP_MAX_AGE = EnemyInfo.STALE_TICKS;
    /** TMODE-8: an enemy at or under this energy is disabled; one within the range draws a member, to the floor. */
    static final double DISABLED_ENERGY = 0.1;
    static final double DISABLED_RANGE = 500;
    static final double DISABLED_FLOOR = 50;
    static final double DISABLED_PULL = 0.5;
    /** TMODE-9: teammates' bullets kept, oldest dropped first. */
    static final int MATE_BULLETS = 64;
    /** TMODE-10: the leader's enemy terms weigh this much more. */
    static final double REAR_FACTOR = 1.5;
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

    /**
     * TMODE-3, TMODE-4: a point a team member is drawn to. A candidate's risk is multiplied
     * by e^(strength (to - from) / 100), where from and to are Hadur's and the candidate's
     * distances to the point, each floored at {@code floor}: closing on it lowers the risk,
     * and inside the floor it neither pulls nor pushes.
     */
    static final class Pull {
        final Point2D.Double at;
        final double floor;
        final double strength;

        Pull(Point2D.Double at, double floor, double strength) {
            this.at = at;
            this.floor = floor;
            this.strength = strength;
        }

        /** The factor for moving from {@code me} to {@code p}. */
        double factor(Point2D.Double me, Point2D.Double p) {
            double from = Math.max(floor, me.distance(at));
            double to = Math.max(floor, p.distance(at));
            return Math.exp(strength * (to - from) / 100.0);
        }
    }

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
        /** TMODE-10: whether this decision is the leader's keeping back. */
        boolean rear;

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
    /** TMODE-10: whether this member leads its team (fixed for the battle). */
    private boolean leader;
    private final Set<EnemyShot> seenShots =
        Collections.newSetFromMap(new IdentityHashMap<EnemyShot, Boolean>());
    private final Deque<Point2D.Double> past = new ArrayDeque<>();
    private Point2D.Double destination;
    private Point2D.Double openingSpot;
    private long round = -1;
    private int lastCandidates;
    /** MMOVE-8: this member's place in the team's roster, or -1 off a team. */
    private int teamIndex = -1;
    /** MMOVE-8: XORed into the noise field's hash; 0 off a team, so the field is MMOVE-1's. */
    private long salt;

    public MinimumRiskMovement(BattleField field) {
        this.field = field;
        this.centre = new Point2D.Double(field.width / 2, field.height / 2);
    }

    /**
     * MMOVE-8: this member's place in the team's roster, 0 up; a negative index is off a team.
     * It salts the noise field and fans the opening spots out along the walls.
     */
    public void team(int index) {
        teamIndex = index < 0 ? -1 : index;
        salt = index < 0 ? 0 : mix(index + 1L);
    }

    public void newRound() {
        destination = null;
        openingSpot = null;
        bullets.clear();
        mateBullets.clear();
        seenShots.clear();
        past.clear();
        round++;
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

    /** TMODE-10: whether this member is its team's leader; set on the battle's first tick. */
    public void leader(boolean leader) {
        this.leader = leader;
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
     * {@code nearest} ({@link TeamDanger#NEAREST}) a shot whose source was nearer a teammate
     * than Hadur makes no bullets (MMOVE-9); with {@code learned} ({@link TeamDanger#LEARNED})
     * a shot whose shooter's log is deep enough makes the learned aims in place of the head-on
     * and linear guesses (MMOVE-10). With neither, or no teammate, this is
     * {@link #updateBullets(List, RobotStateLog, Point2D.Double, long)}.
     */
    public void updateBullets(List<EnemyShot> shots, RobotStateLog myPath, Point2D.Double me,
                              long now, List<Point2D.Double> mates, TeamDanger danger,
                              boolean nearest, boolean learned) {
        updateBullets(shots, myPath, me, now, mates, danger, nearest, learned, false);
    }

    /**
     * As above, where with {@code soft} (TMODE-2) each shot's bullets weigh
     * {@link #softWeight}: less for each teammate nearer its shooter than Hadur was, and none
     * under {@link #SOFT_FLOOR}.
     */
    public void updateBullets(List<EnemyShot> shots, RobotStateLog myPath, Point2D.Double me,
                              long now, List<Point2D.Double> mates, TeamDanger danger,
                              boolean nearest, boolean learned, boolean soft) {
        if (mates.isEmpty() || (!nearest && !learned && !soft)) {
            updateBullets(shots, myPath, me, now);
            return;
        }
        int cap = learned ? LEARNED_MAX_BULLETS : MAX_BULLETS;
        for (EnemyShot s : shots) {
            if (!seenShots.add(s)) continue;
            RobotState at = myPath.getState(s.fireTime);
            if (at == null) at = myPath.getState(s.fireTime + 1);
            Point2D.Double target = at == null ? me : at.location;
            if (nearest && !TeamDanger.aimedAtMe(s, target, mates)) continue;
            double w = soft ? softWeight(s, target, mates) : 1.0;
            if (w < SOFT_FLOOR) continue;
            List<TeamDanger.Aim> aims = learned && at != null ? danger.aims(s, at) : null;
            if (aims != null) {
                for (TeamDanger.Aim a : aims) {
                    add(new VirtualBullet(s, VirtualBullet.Aim.LEARNED, a.heading, w * a.weight), cap);
                }
                continue;
            }
            double hot = DiaUtils.absoluteBearing(s.source, target);
            double linear = at == null ? hot : VirtualBullet.linearHeading(s.source, target,
                at.heading, at.velocity, s.speed(), field.width, field.height);
            add(new VirtualBullet(s, VirtualBullet.Aim.HEAD_ON, hot, w), cap);
            add(new VirtualBullet(s, VirtualBullet.Aim.LINEAR, linear, w), cap);
        }
        double reach = Math.hypot(field.width, field.height);
        for (Iterator<VirtualBullet> it = bullets.iterator(); it.hasNext(); ) {
            if (it.next().passed(me, now, reach)) it.remove();
        }
        seenShots.retainAll(shots);
    }

    /**
     * TMODE-2: the share of {@code shot} aimed at Hadur, standing at {@code me} when it was
     * fired: 1/(1+k)^2 for the k teammates in {@code mates} nearer its source.
     */
    static double softWeight(EnemyShot shot, Point2D.Double me, List<Point2D.Double> mates) {
        double mine = shot.source.distance(me);
        int k = 0;
        for (Point2D.Double m : mates) {
            if (shot.source.distance(m) < mine) k++;
        }
        return 1.0 / ((1 + k) * (1 + k));
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
        if (!mates.isEmpty() && !modes.isEmpty()) v.pull = pull(me, energy, others, enemies, now, mates, modes);
        if (!mates.isEmpty() && modes.contains(TeamModes.Mode.SCREEN)) screen(v, now);
        if (!mates.isEmpty() && modes.contains(TeamModes.Mode.MATEFIRE)) v.mateBullets = relevant(mateBullets(me, now), me, now);
        v.rear = leader && !mates.isEmpty() && modes.contains(TeamModes.Mode.REAR);
        List<Point2D.Double> candidates = candidates(me, others, enemies, now, mates);
        lastCandidates = candidates.size();
        if (!mates.isEmpty() && modes.contains(TeamModes.Mode.WAVES)) {
            destination = waveBest(candidates, v);
            return destination;
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
     * TMODE-3, TMODE-4: the point a team member is drawn to, or null. With
     * {@link TeamModes.Mode#FINISH}, one enemy left by the engine's count ({@code others} less
     * the teammates in view), seen lately, and at least {@link #FINISH_ENERGY}, that enemy, to
     * {@link #FINISH_FLOOR}: early in a round the tracker holds only the enemies scanned so far. Else with {@link TeamModes.Mode#GANG}: when
     * {@link #GANG_SIZE} enemies are within {@link #GANG_RANGE} of Hadur, its nearest teammate;
     * when they are of a teammate, the nearest such teammate, to {@link #HELP_FLOOR}.
     */
    static Pull pull(Point2D.Double me, double energy, int others, List<EnemyInfo> enemies, long now,
                     List<Roster.Mate> mates, Set<TeamModes.Mode> modes) {
        if (modes.contains(TeamModes.Mode.FINISH) && enemies.size() == 1 && others - mates.size() == 1
                && enemies.get(0).age(now) < CAP_MAX_AGE && energy >= FINISH_ENERGY) {
            return new Pull(enemies.get(0).location, FINISH_FLOOR, FINISH_PULL);
        }
        if (modes.contains(TeamModes.Mode.DISABLED)) {
            EnemyInfo prey = disabled(me, enemies, now);
            if (prey != null) return new Pull(prey.location, DISABLED_FLOOR, DISABLED_PULL);
        }
        boolean gang = modes.contains(TeamModes.Mode.GANG);
        if (!gang && !modes.contains(TeamModes.Mode.PACK)) return null;
        Point2D.Double nearest = null;
        Point2D.Double ganged = null;
        for (Roster.Mate m : mates) {
            Point2D.Double q = m.at(now);
            if (nearest == null || q.distance(me) < nearest.distance(me)) nearest = q;
            if (enemiesNear(q, enemies, now) >= GANG_SIZE && (ganged == null || q.distance(me) < ganged.distance(me))) {
                ganged = q;
            }
        }
        if (gang && nearest != null && enemiesNear(me, enemies, now) >= GANG_SIZE) return new Pull(nearest, 0, GANG_PULL);
        if (modes.contains(TeamModes.Mode.PACK) && energy >= PACK_ENERGY) {
            Point2D.Double slot = pincerSlot(me, enemies, now, mates);
            if (slot != null) return new Pull(slot, PACK_FLOOR, PACK_PULL);
        }
        if (gang && ganged != null) return new Pull(ganged, HELP_FLOOR, GANG_PULL);
        return null;
    }

    /**
     * TMODE-8: the nearest enemy seen lately at or under {@link #DISABLED_ENERGY} and within
     * {@link #DISABLED_RANGE} of {@code me}, or null.
     */
    static EnemyInfo disabled(Point2D.Double me, List<EnemyInfo> enemies, long now) {
        EnemyInfo best = null;
        for (EnemyInfo e : enemies) {
            if (e.age(now) >= CAP_MAX_AGE || e.energy > DISABLED_ENERGY) continue;
            double d = e.location.distance(me);
            if (d <= DISABLED_RANGE && (best == null || d < best.location.distance(me))) best = e;
        }
        return best;
    }

    /**
     * TMODE-5: the team's prey, as every member works it out from the positions they share: the
     * enemy seen lately with the least distance from the team's centre plus
     * {@link #PACK_ENERGY_WEIGHT} times its energy (NightmareTeam's assignment cost). Null when
     * none is fresh.
     */
    static EnemyInfo prey(Point2D.Double centre, List<EnemyInfo> enemies, long now) {
        EnemyInfo best = null;
        double bestCost = Double.POSITIVE_INFINITY;
        for (EnemyInfo e : enemies) {
            if (e.age(now) >= CAP_MAX_AGE) continue;
            double cost = e.location.distance(centre) + PACK_ENERGY_WEIGHT * e.energy;
            // Ties go to the name, so every member picks the same prey.
            if (cost < bestCost || (cost == bestCost && best != null && e.name.compareTo(best.name) < 0)) {
                bestCost = cost;
                best = e;
            }
        }
        return best;
    }

    /**
     * TMODE-5: Hadur's place in the pincer round the prey. The members (Hadur and its teammates
     * in view) are ranked by their bearing from the prey about the team's mean bearing, and
     * spread over an arc about that mean, {@link #PACK_SPREAD} apart at most and never more than
     * a full turn in all; Hadur's place is its rank's angle at {@link #PACK_RADIUS_SHARE} of the
     * nearest member's distance, kept within {@link #PACK_MIN_RADIUS} and
     * {@link #PACK_MAX_RADIUS}. Null with no fresh enemy.
     */
    static Point2D.Double pincerSlot(Point2D.Double me, List<EnemyInfo> enemies, long now, List<Roster.Mate> mates) {
        List<Point2D.Double> pack = new ArrayList<>(mates.size() + 1);
        pack.add(me);
        for (Roster.Mate m : mates) pack.add(m.at(now));
        double cx = 0, cy = 0;
        for (Point2D.Double q : pack) {
            cx += q.x;
            cy += q.y;
        }
        EnemyInfo prey = prey(new Point2D.Double(cx / pack.size(), cy / pack.size()), enemies, now);
        if (prey == null) return null;
        Point2D.Double t = prey.location;
        double sx = 0, sy = 0, nearest = Double.POSITIVE_INFINITY;
        for (Point2D.Double q : pack) {
            double b = DiaUtils.absoluteBearing(t, q);
            sx += Math.sin(b);
            sy += Math.cos(b);
            nearest = Math.min(nearest, q.distance(t));
        }
        double mean = Math.atan2(sx, sy);
        double mine = Angles.normalRelativeAngle(DiaUtils.absoluteBearing(t, me) - mean);
        int rank = 0;
        for (int i = 1; i < pack.size(); i++) {
            double off = Angles.normalRelativeAngle(DiaUtils.absoluteBearing(t, pack.get(i)) - mean);
            if (off < mine) rank++;
        }
        int n = pack.size();
        double spread = Math.min(PACK_SPREAD, 2 * Math.PI / n);
        double angle = mean + (rank - (n - 1) / 2.0) * spread;
        double r = DiaUtils.limit(PACK_MIN_RADIUS, PACK_RADIUS_SHARE * nearest, PACK_MAX_RADIUS);
        return DiaUtils.project(t, angle, r);
    }

    /**
     * TMODE-6: a teammate screens Hadur from an enemy as another enemy does: each enemy's
     * distance to its nearest other robot, which decides whether Hadur at a point would be its
     * closest (MMOVE-2), takes the living teammates in view too (Ogi counts every robot nearer
     * the enemy, teammates included).
     */
    static void screen(View v, long now) {
        for (int i = 0; i < v.enemies.size(); i++) {
            Point2D.Double e = v.enemies.get(i).location;
            for (Roster.Mate m : v.mates) {
                v.nearestOther[i] = Math.min(v.nearestOther[i], e.distance(m.at(now)));
            }
        }
    }

    /** TMODE-3: the enemies seen lately within {@link #GANG_RANGE} of {@code p}. */
    static int enemiesNear(Point2D.Double p, List<EnemyInfo> enemies, long now) {
        int n = 0;
        for (EnemyInfo e : enemies) {
            if (e.age(now) < CAP_MAX_AGE && e.location.distance(p) <= GANG_RANGE) n++;
        }
        return n;
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
        for (int i = 0; i < order.length && picked.size() < WAVE_RERANK; i++) picked.add(order[i]);
        if (hold && !picked.contains(pool.size() - 1)) picked.add(pool.size() - 1);
        List<Wave> waves = Wave.of(v.bullets);
        double[] damage = new double[picked.size()];
        double[] r = new double[picked.size()];
        for (int k = 0; k < picked.size(); k++) {
            r[k] = risk[picked.get(k)];
            damage[k] = waveDamage(v.me, pool.get(picked.get(k)), v.now, waves);
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
            long tick = now + t;
            for (int i = 0; i < waves.size(); i++) {
                if (done[i]) continue;
                Wave w = waves.get(i);
                double d = Math.hypot(x - w.source.x, y - w.source.y);
                double front = w.speed * (tick - w.fireTime);
                if (front < d - WAVE_HALF) continue;
                done[i] = true;
                if (front - w.speed > d + WAVE_HALF) continue;
                total += w.mass(Math.atan2(x - w.source.x, y - w.source.y), Math.atan(WAVE_HALF / Math.max(d, WAVE_HALF)));
            }
        }
        return total;
    }

    /** TMODE-11: one shot in flight as a profile over its headings. */
    static final class Wave {
        final Point2D.Double source;
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
            r += w * enemyRisk(p, v, i) * (v.rear ? REAR_FACTOR : 1.0);
        }
        r += bulletRisk(p, v.me, v.bullets, v.now);
        if (!v.mateBullets.isEmpty()) r += bulletRisk(p, v.me, v.mateBullets, v.now);
        r += centreRisk(p) + wallRisk(p) + cornerRisk(p) + pastRisk(p) + noise(p);
        if (v.now < OPENING_TICKS && openingSpot != null) {
            r += OPENING_K * p.distance(openingSpot) / 500.0;
        }
        if (!v.mates.isEmpty()) r += teammateRisk(p, v);
        // TMODE-3, TMODE-4: the pull scales every term but the posture's, which may be negative.
        if (v.pull != null) r *= v.pull.factor(v.me, p);
        return r + postureRisk(p, v.enemies, v.plan);
    }

    /**
     * MMOVE-6, MMOVE-7: for each living teammate with a fresh position, its predicted point
     * when Hadur would arrive at {@code p} scores {@link #MATE_K} over the inverse square of
     * the distance (floored at {@link #MATE_FLOOR}), and the path from Hadur to {@code p}
     * scores {@link #MATE_PATH_K} for passing within {@link #MATE_PATH_RANGE} of the
     * teammate's predicted track from now until then.
     */
    double teammateRisk(Point2D.Double p, View v) {
        double r = 0;
        long arrive = v.now + (long) Math.ceil(p.distance(v.me) / TRAVEL_SPEED);
        for (Roster.Mate m : v.mates) {
            Point2D.Double q = m.at(arrive);
            double d = Math.max(MATE_FLOOR, p.distance(q));
            r += MATE_K * UNIT / (d * d);
            Point2D.Double from = m.at(v.now);
            // Segments whose boxes are further apart than the range score nothing: skip the geometry.
            if (Math.max(from.x, q.x) < Math.min(v.me.x, p.x) - MATE_PATH_RANGE
                    || Math.min(from.x, q.x) > Math.max(v.me.x, p.x) + MATE_PATH_RANGE
                    || Math.max(from.y, q.y) < Math.min(v.me.y, p.y) - MATE_PATH_RANGE
                    || Math.min(from.y, q.y) > Math.max(v.me.y, p.y) + MATE_PATH_RANGE) {
                continue;
            }
            double sd = segmentDistance(v.me, p, from, q);
            r += MATE_PATH_K * Math.max(0, 1 - sd / MATE_PATH_RANGE);
        }
        return r;
    }

    /** The least distance between segments a-b and c-d. */
    static double segmentDistance(Point2D a, Point2D b, Point2D c, Point2D d) {
        if (Line2D.linesIntersect(a.getX(), a.getY(), b.getX(), b.getY(),
                c.getX(), c.getY(), d.getX(), d.getY())) {
            return 0;
        }
        return Math.min(Math.min(Line2D.ptSegDist(a.getX(), a.getY(), b.getX(), b.getY(), c.getX(), c.getY()),
                Line2D.ptSegDist(a.getX(), a.getY(), b.getX(), b.getY(), d.getX(), d.getY())),
            Math.min(Line2D.ptSegDist(c.getX(), c.getY(), d.getX(), d.getY(), a.getX(), a.getY()),
                Line2D.ptSegDist(c.getX(), c.getY(), d.getX(), d.getY(), b.getX(), b.getY())));
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

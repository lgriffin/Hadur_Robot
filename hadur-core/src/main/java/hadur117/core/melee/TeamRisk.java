package hadur117.core.melee;

import static hadur117.core.melee.MinimumRiskMovement.*;

import hadur117.core.world.EnemyInfo;
import hadur117.core.world.EnemyShot;
import hadur117.core.world.Roster;
import hadur117.core.physics.Angles;
import hadur117.core.physics.DiaUtils;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * The team half of the melee mover: the terms and choices {@link MinimumRiskMovement} reads only
 * on a team (T1..T7). Teammates' risk and path terms (MMOVE-6, MMOVE-7), the soft weight of a
 * shot by who stands nearer its shooter (TMODE-2), the pulls of GANG, FINISH and HUNT (TMODE-3,
 * TMODE-4, TMODE-13), the teammates' bullet path check (TMODE-25) and the concord factor
 * (TMODE-33). Off a team none of it is read, so the solo mover is the rest of
 * {@link MinimumRiskMovement}.
 */
final class TeamRisk {

    private TeamRisk() {
    }

    /** MMOVE-6: weight, in units of {@link MinimumRiskMovement#UNIT}, of a teammate's inverse-square term. */
    static final double MATE_K = 0.6;

    /** MMOVE-6: a teammate nearer than this is scored as if at this distance: about a robot's width. */
    static final double MATE_FLOOR = 36;

    /** MMOVE-7: weight, and reach in px, of the term for a path crossing a teammate's track. */
    static final double MATE_PATH_K = 0.3;

    static final double MATE_PATH_RANGE = 60;

    /**
     * TMODE-25: the {@link #PATH_RERANK} lowest-risk candidates and the destination held are
     * each driven to for {@link #PATH_TICKS} ticks; every teammate bullet whose
     * flight on some tick crosses Hadur's box ({@link #PATH_HALF} px each side) there adds
     * {@link #PATH_K} times its damage to that candidate's risk.
     */
    static final double PATH_K = 1.0;

    static final double PATH_HALF = 18;

    static final int PATH_TICKS = 15;

    static final int PATH_RERANK = 8;

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

    /** TMODE-5: members' places are at most this far apart round the prey: 70 degrees. */
    static final double PACK_SPREAD = Math.toRadians(70);

    /** TMODE-5: the hunt's floor, and the energy a member needs to hunt. */
    static final double PACK_FLOOR = 40;

    static final double PACK_ENERGY = 20;

    /**
     * TMODE-13, HUNT (NightmareTeam's packs, PACK's retry): each member is assigned an enemy at
     * the cost (distance + {@link #PACK_ENERGY_WEIGHT} x energy) squared, times
     * {@link #HUNT_CROWD} for an enemy that already has {@link #HUNT_MAX_GROUP} members, so two or
     * three go to each; it holds a place {@link #HUNT_RADIUS} from its prey, fixed, and the pull,
     * at {@link #HUNT_PULL}, leaves the bullets' risk unscaled.
     */
    static final double HUNT_RADIUS = 350;

    /**
     * TMODE-21, TMODE-22: the weight of a shot's one virtual bullet against a team that aims
     * only head-on or only linear: the two guesses' total, all on the real line.
     */
    static final double ONE_AIM_WEIGHT = 2.0;

    static final double HUNT_PULL = 0.3;

    static final double HUNT_CROWD = 1.6;

    static final int HUNT_MAX_GROUP = 3;

    /** TMODE-9: teammates' bullets kept, oldest dropped first. */
    static final int MATE_BULLETS = 64;

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
        /** Whether the pull scales the bullets' risk too; TMODE-13's leaves it as it is. */
        final boolean scalesBullets;

        Pull(Point2D.Double at, double floor, double strength) {
            this(at, floor, strength, true);
        }

        Pull(Point2D.Double at, double floor, double strength, boolean scalesBullets) {
            this.at = at;
            this.floor = floor;
            this.strength = strength;
            this.scalesBullets = scalesBullets;
        }

        /** The factor for moving from {@code me} to {@code p}. */
        double factor(Point2D.Double me, Point2D.Double p) {
            double from = Math.max(floor, me.distance(at));
            double to = Math.max(floor, p.distance(at));
            return Math.exp(strength * (to - from) / 100.0);
        }
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
        return pull(me, null, energy, others, enemies, now, mates, modes);
    }

    /** As above, with {@code name} this member's name for TMODE-13's order (null: first). */
    static Pull pull(Point2D.Double me, String name, double energy, int others, List<EnemyInfo> enemies,
                     long now, List<Roster.Mate> mates, Set<TeamModes.Mode> modes) {
        if (modes.contains(TeamModes.Mode.FINISH) && enemies.size() == 1 && others - mates.size() == 1
                && enemies.get(0).age(now) < CAP_MAX_AGE && energy >= FINISH_ENERGY) {
            return new Pull(enemies.get(0).location, FINISH_FLOOR, FINISH_PULL);
        }
        if (modes.contains(TeamModes.Mode.HUNT) && energy >= PACK_ENERGY) {
            Point2D.Double slot = huntSlot(me, name, enemies, now, mates, HUNT_RADIUS);
            if (slot != null) return new Pull(slot, PACK_FLOOR, HUNT_PULL, false);
        }
        boolean gang = modes.contains(TeamModes.Mode.GANG);
        if (!gang) return null;
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
        if (gang && ganged != null) return new Pull(ganged, HELP_FLOOR, GANG_PULL);
        return null;
    }

    /**
     * TMODE-13: each member's prey, as every member works it out from the positions they share.
     * Members go in name order ({@code me} as {@code name}); each takes the fresh enemy of least
     * (distance + {@link #PACK_ENERGY_WEIGHT} x energy) squared, times {@link #HUNT_CROWD} when
     * {@link #HUNT_MAX_GROUP} members already hunt it. Returns the members' places as indexes
     * into {@code enemies}, in the order of {@code pack}; -1 with no fresh enemy.
     */
    static int[] huntAssign(List<Point2D.Double> pack, List<EnemyInfo> enemies, long now) {
        int[] group = new int[enemies.size()];
        int[] prey = new int[pack.size()];
        for (int m = 0; m < pack.size(); m++) {
            int best = -1;
            double bestCost = Double.POSITIVE_INFINITY;
            for (int i = 0; i < enemies.size(); i++) {
                EnemyInfo e = enemies.get(i);
                if (e.age(now) >= CAP_MAX_AGE) continue;
                double c = e.location.distance(pack.get(m)) + PACK_ENERGY_WEIGHT * e.energy;
                c *= c;
                if (group[i] >= HUNT_MAX_GROUP) c *= HUNT_CROWD;
                // Ties go to the name, so every member makes the same choice.
                if (c < bestCost || (c == bestCost && e.name.compareTo(enemies.get(best).name) < 0)) {
                    bestCost = c;
                    best = i;
                }
            }
            prey[m] = best;
            if (best >= 0) group[best]++;
        }
        return prey;
    }

    /**
     * TMODE-13: Hadur's place round its prey: the members hunting it, ranked by their bearing
     * from it about their mean bearing, spread {@link #PACK_SPREAD} apart, at
     * {@link #HUNT_RADIUS}. Null with no fresh enemy.
     */
    static Point2D.Double huntSlot(Point2D.Double me, String name, List<EnemyInfo> enemies, long now,
                                   List<Roster.Mate> mates) {
        return huntSlot(me, name, enemies, now, mates, HUNT_RADIUS);
    }

    /** As above, at {@code radius} from the prey. */
    static Point2D.Double huntSlot(Point2D.Double me, String name, List<EnemyInfo> enemies, long now,
                                   List<Roster.Mate> mates, double radius) {
        List<Roster.Mate> sorted = new ArrayList<>(mates);
        sorted.sort((a, b) -> a.name.compareTo(b.name));
        List<Point2D.Double> pack = new ArrayList<>(mates.size() + 1);
        int self = 0;
        for (Roster.Mate m : sorted) {
            if (name != null && m.name.compareTo(name) < 0) self++;
            pack.add(m.at(now));
        }
        pack.add(self, me);
        int[] prey = huntAssign(pack, enemies, now);
        if (prey[self] < 0) return null;
        Point2D.Double t = enemies.get(prey[self]).location;
        List<Integer> group = new ArrayList<>();
        double sx = 0, sy = 0;
        for (int m = 0; m < pack.size(); m++) {
            if (prey[m] != prey[self]) continue;
            group.add(m);
            double b = DiaUtils.absoluteBearing(t, pack.get(m));
            sx += Math.sin(b);
            sy += Math.cos(b);
        }
        double mean = Math.atan2(sx, sy);
        double mine = Angles.normalRelativeAngle(DiaUtils.absoluteBearing(t, me) - mean);
        int rank = 0;
        for (int m : group) {
            if (m == self) continue;
            double off = Angles.normalRelativeAngle(DiaUtils.absoluteBearing(t, pack.get(m)) - mean);
            // Name order breaks ties, so members on one ray from the prey still take apart slots.
            if (off < mine || (off == mine && m < self)) rank++;
        }
        int n = group.size();
        double spread = Math.min(PACK_SPREAD, 2 * Math.PI / n);
        double angle = mean + (rank - (n - 1) / 2.0) * spread;
        return DiaUtils.project(t, angle, radius);
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
     * TMODE-25, Firestarter's path check: the {@link #PATH_RERANK} lowest-risk candidates and the
     * destination held if not reached are each scored as their risk
     * plus {@link #PATH_K} times the damage of the teammates' bullets their drive would meet in
     * {@link #PATH_TICKS} ticks. The held destination keeps its place as in the plain choice:
     * another wins only below {@link MinimumRiskMovement#SWITCH_GAIN} times its risk, both with their bullet damage.
     */
    static Point2D.Double pathBest(MinimumRiskMovement move, Point2D.Double destination,
                                   List<Point2D.Double> candidates, View v) {
        List<Point2D.Double> pool = new ArrayList<>(candidates);
        boolean hold = destination != null && destination.distance(v.me) > REACHED;
        double[] risk = new double[pool.size()];
        Integer[] order = new Integer[pool.size()];
        for (int i = 0; i < pool.size(); i++) {
            risk[i] = move.risk(pool.get(i), v);
            order[i] = i;
        }
        java.util.Arrays.sort(order, (a, b) -> Double.compare(risk[a], risk[b]));
        List<Point2D.Double> picked = new ArrayList<>();
        List<Double> pickedRisk = new ArrayList<>();
        for (int i = 0; i < order.length && picked.size() < PATH_RERANK; i++) {
            picked.add(pool.get(order[i]));
            pickedRisk.add(risk[order[i]]);
        }
        Point2D.Double best = null;
        double bestScore = Double.POSITIVE_INFINITY;
        for (int k = 0; k < picked.size(); k++) {
            double sc = pickedRisk.get(k) + PATH_K * pathDamage(v.me, picked.get(k), v.now, v.pathBullets);
            if (sc < bestScore) {
                bestScore = sc;
                best = picked.get(k);
            }
        }
        if (hold) {
            double held = PATH_K * pathDamage(v.me, destination, v.now, v.pathBullets);
            if (bestScore >= SWITCH_GAIN * move.risk(destination, v) + held) return destination;
        }
        return best;
    }

    /**
     * TMODE-25: the damage of the {@code bullets} Hadur would meet driving from {@code me}
     * straight to {@code to} (accelerating 1 px a tick to 8, stopping there) for
     * {@link #PATH_TICKS} ticks: a bullet counts once, on the first tick its flight that tick
     * crosses Hadur's box, {@link #PATH_HALF} px each side of its centre, as the engine checks it.
     */
    static double pathDamage(Point2D.Double me, Point2D.Double to, long now, List<VirtualBullet> bullets) {
        if (bullets.isEmpty()) return 0;
        boolean[] done = new boolean[bullets.size()];
        double total = 0;
        double x = me.x, y = me.y, speed = 0;
        for (int t = 1; t <= PATH_TICKS; t++) {
            double left = Math.hypot(to.x - x, to.y - y);
            if (left > 0.5) {
                speed = Math.min(MAX_SPEED, Math.min(speed + 1, left));
                x += (to.x - x) / left * speed;
                y += (to.y - y) / left * speed;
            }
            long tick = now + t;
            for (int i = 0; i < bullets.size(); i++) {
                VirtualBullet b = bullets.get(i);
                if (done[i] || tick <= b.shot.fireTime) continue;
                Point2D.Double from = b.position(tick - 1);
                Point2D.Double at = b.position(tick);
                if (!crossesBox(from, at, x, y, PATH_HALF)) continue;
                done[i] = true;
                double p = b.shot.power;
                total += 4 * p + Math.max(0, 2 * (p - 1));
            }
        }
        return total;
    }

    /** Whether the segment {@code a}-{@code b} meets the square of half-side {@code half} round ({@code cx}, {@code cy}). */
    static boolean crossesBox(Point2D.Double a, Point2D.Double b, double cx, double cy, double half) {
        double t0 = 0, t1 = 1;
        double dx = b.x - a.x, dy = b.y - a.y;
        double[] p = {-dx, dx, -dy, dy};
        double[] q = {a.x - (cx - half), (cx + half) - a.x, a.y - (cy - half), (cy + half) - a.y};
        for (int i = 0; i < 4; i++) {
            if (p[i] == 0) {
                if (q[i] < 0) return false;
            } else {
                double r = q[i] / p[i];
                if (p[i] < 0) t0 = Math.max(t0, r);
                else t1 = Math.min(t1, r);
                if (t0 > t1) return false;
            }
        }
        return true;
    }

    /**
     * MMOVE-6, MMOVE-7: for each living teammate with a fresh position, its predicted point
     * when Hadur would arrive at {@code p} scores {@link #MATE_K} over the inverse square of
     * the distance (floored at {@link #MATE_FLOOR}), and the path from Hadur to {@code p}
     * scores {@link #MATE_PATH_K} for passing within {@link #MATE_PATH_RANGE} of the
     * teammate's predicted track from now until then.
     */
    static double teammateRisk(Point2D.Double p, View v) {
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

    /**
     * TMODE-33: enemy {@code i}'s factor in the team brain: 1/(1 + n) for the n robots, the other
     * enemies seen lately and the teammates, nearer that enemy than {@code p}. A point with robots
     * between it and an enemy is one that enemy would sooner not shoot at; there is no closest-robot
     * doubling. A recent shooter keeps {@link MinimumRiskMovement#RECENT_HIT_FACTOR}.
     */
    static double concordFactor(Point2D.Double p, EnemyInfo e, View v, int i) {
        double mine = p.distance(e.location);
        int n = 0;
        for (int j = 0; j < v.enemies.size(); j++) {
            EnemyInfo o = v.enemies.get(j);
            if (j != i && o.age(v.now) < CAP_MAX_AGE && o.location.distance(e.location) < mine) n++;
        }
        for (Roster.Mate m : v.mates) {
            if (m.at(v.now).distance(e.location) < mine) n++;
        }
        double c = 1.0 / (1 + n);
        if (e.lastHitHadur >= 0 && v.now - e.lastHitHadur <= RECENT_HIT_TICKS) c *= RECENT_HIT_FACTOR;
        return c;
    }
}

package hadur2.core.melee;

import hadur2.core.physics.BattleField;
import hadur2.core.physics.Angles;
import hadur2.core.physics.DiaUtils;
import java.awt.geom.Point2D;
import java.util.List;

/**
 * Melee movement: minimum-risk positioning.
 *
 * <p>Each tick, candidate points around Hadur are scored and the least risky one
 * becomes the destination. Risk works like anti-gravity: every opponent repels in
 * proportion to its energy over distance squared (much harder inside 200px), walls
 * and corners repel, standing between two opponents is penalised, and points with
 * few escape routes cost more. The strategy's posture adds its own pull.</p>
 */
public class MeleeMover {

    static final double MIN_ENEMY_DISTANCE = 200.0;
    static final double WALL_RANGE = 150.0;
    static final double WALL_DANGER = 50.0;
    static final double CORNER_RANGE = 250.0;
    static final double CROSSFIRE_ANGLE = Math.toRadians(120);
    static final double ESCAPE_LENGTH = 120.0;

    private static final double WALL_K = 5.0;
    private static final double CORNER_K = 15.0;
    private static final double CROSSFIRE_K = 0.006;
    private static final double ESCAPE_K = 0.0015;
    private static final double STAY_K = 0.0004;
    private static final double PERIPHERY_K = 0.002;
    private static final double CUTOFF_K = 0.004;
    private static final double FIGHT_K = 0.004;
    private static final double CUTOFF_DISTANCE = 220.0;
    private static final double FIGHT_CLEARANCE = 350.0;
    private static final double FINISH_RANGE = 550.0;

    private static final int CANDIDATE_ANGLES = 36;
    private static final double[] CANDIDATE_DISTANCES = {90, 150, 210};
    private static final double MARGIN = 30.0;

    private final BattleField field;
    private final Point2D.Double centre;
    private Point2D.Double destination;

    public MeleeMover(BattleField field) {
        this.field = field;
        this.centre = new Point2D.Double(field.width / 2, field.height / 2);
    }

    public void newRound() {
        destination = null;
    }

    /** Picks the destination for this tick, keeping the current one unless it got worse. */
    public Point2D.Double chooseDestination(Point2D.Double me, List<EnemyInfo> enemies,
                                            long now, MeleeStrategy.Plan plan) {
        Point2D.Double best = null;
        double bestRisk = Double.POSITIVE_INFINITY;
        for (int i = 0; i < CANDIDATE_ANGLES; i++) {
            double angle = i * 2 * Math.PI / CANDIDATE_ANGLES;
            for (double d : CANDIDATE_DISTANCES) {
                Point2D.Double p = DiaUtils.project(me, angle, d);
                if (!inField(p)) continue;
                double r = risk(p, me, enemies, now, plan);
                if (r < bestRisk) {
                    bestRisk = r;
                    best = p;
                }
            }
        }
        if (best == null) best = new Point2D.Double(centre.x, centre.y);

        if (destination != null && destination.distance(me) > 25
                && risk(destination, me, enemies, now, plan) <= bestRisk * 1.1 + 1e-9) {
            return destination;
        }
        destination = best;
        return destination;
    }

    public double risk(Point2D.Double p, Point2D.Double me, List<EnemyInfo> enemies,
                       long now, MeleeStrategy.Plan plan) {
        double r = wallRisk(p) + cornerRisk(p) + crossfireRisk(p, enemies, now);
        for (EnemyInfo e : enemies) {
            double weight = 1.0;
            if (plan.fight != null && (e == plan.fight[0] || e == plan.fight[1])) weight = 2.0;
            r += enemyRisk(p, me, e, now) * weight;
        }
        r += ESCAPE_K * (8 - escapeRoutes(p, enemies)) / 8.0;
        if (p.distance(me) < 30) r += STAY_K;
        return r + postureRisk(p, enemies, plan);
    }

    /** Repulsion of one opponent: energy over distance squared, fading with staleness. */
    public double enemyRisk(Point2D.Double p, Point2D.Double me, EnemyInfo e, long now) {
        double d = Math.max(1.0, p.distance(e.location));
        double r = e.freshness(now) * Math.max(e.energy, 1.0) / (d * d);
        if (d < MIN_ENEMY_DISTANCE) r *= 3.0;
        if (p.distance(me) > 1) {
            // Moving straight at or away from a gun is easier to hit than moving across it.
            double a = DiaUtils.absoluteBearing(p, e.location) - DiaUtils.absoluteBearing(me, p);
            r *= 1.0 + 0.5 * Math.abs(Math.cos(a));
        }
        return r;
    }

    /** Repulsion from the four walls, rising sharply inside {@link #WALL_DANGER}. */
    public double wallRisk(Point2D.Double p) {
        return wallTerm(p.x) + wallTerm(field.width - p.x)
             + wallTerm(p.y) + wallTerm(field.height - p.y);
    }

    static double wallTerm(double d) {
        if (d >= WALL_RANGE) return 0;
        d = Math.max(d, 1.0);
        double r = WALL_K / (d * d) - WALL_K / (WALL_RANGE * WALL_RANGE);
        if (d < WALL_DANGER) r *= 1.0 + (WALL_DANGER - d) / 10.0;
        return r;
    }

    public double cornerRisk(Point2D.Double p) {
        double d = Math.min(
            Math.min(p.distance(0, 0), p.distance(field.width, 0)),
            Math.min(p.distance(0, field.height), p.distance(field.width, field.height)));
        if (d >= CORNER_RANGE) return 0;
        d = Math.max(d, 1.0);
        return CORNER_K / (d * d) - CORNER_K / (CORNER_RANGE * CORNER_RANGE);
    }

    /** Penalty for standing between two opponents, where both can fire at once. */
    public double crossfireRisk(Point2D.Double p, List<EnemyInfo> enemies, long now) {
        double r = 0;
        for (int i = 0; i < enemies.size(); i++) {
            for (int j = i + 1; j < enemies.size(); j++) {
                EnemyInfo a = enemies.get(i), b = enemies.get(j);
                double angle = Math.abs(Angles.normalRelativeAngle(
                    DiaUtils.absoluteBearing(p, a.location)
                    - DiaUtils.absoluteBearing(p, b.location)));
                if (angle <= CROSSFIRE_ANGLE) continue;
                double f = (angle - CROSSFIRE_ANGLE) / (Math.PI - CROSSFIRE_ANGLE);
                double strength = Math.min(a.energy * a.freshness(now),
                                           b.energy * b.freshness(now)) / 100.0;
                double reach = 600.0 / Math.max(300.0,
                    Math.max(p.distance(a.location), p.distance(b.location)));
                r += CROSSFIRE_K * f * f * Math.min(strength, 1.0) * reach;
            }
        }
        return r;
    }

    /** How many of the eight compass directions offer a clear run of {@link #ESCAPE_LENGTH}. */
    public int escapeRoutes(Point2D.Double p, List<EnemyInfo> enemies) {
        int free = 0;
        for (int i = 0; i < 8; i++) {
            Point2D.Double end = DiaUtils.project(p, i * Math.PI / 4, ESCAPE_LENGTH);
            if (!field.rectangle.contains(end)) continue;
            boolean blocked = false;
            for (EnemyInfo e : enemies) {
                if (e.location.distance(end) < 100) {
                    blocked = true;
                    break;
                }
            }
            if (!blocked) free++;
        }
        return free;
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

    /**
     * The spot between {@code target} and open space: holding it pins the target
     * against the walls and cuts off its escape routes.
     */
    public Point2D.Double cutOffPoint(EnemyInfo target) {
        double toCentre = DiaUtils.absoluteBearing(target.location, centre);
        double d = Math.min(CUTOFF_DISTANCE, target.location.distance(centre));
        Point2D.Double p = DiaUtils.project(target.location, toCentre, d);
        return field.translateToField(p);
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

    private boolean inField(Point2D.Double p) {
        return p.x > MARGIN && p.y > MARGIN
            && p.x < field.width - MARGIN && p.y < field.height - MARGIN;
    }
}

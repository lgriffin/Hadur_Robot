package hadur117.core.move;

import hadur117.core.model.*;
import hadur117.core.physics.*;

import java.awt.geom.Point2D;
import java.util.*;

/**
 * DODGE-6: Hadur's own shot-dodge planner, inspired by Saguaro's ShotDodger (its ideas: score a
 * path by its clearance from the predicted bullet, add the enemy's distance, learn from misses;
 * no code or data of it): against a gun that fires one simple aim, plan a path on which that
 * aim's bullets miss us, as far from them as the field allows. The paths are our surf's stop
 * points, the experts our simple aims (DODGE-1), the band each bullet is given our own misses. Off by default; {@link SurfMover} hands
 * it the tick only when the duel switches it on for the opponent and {@link ShotDodger#planActive}.
 *
 * <p><b>Why.</b> DODGE-2's three-option surf knew Machete's bullet exactly (190 of 194 matched)
 * and still took the same damage as without it (2,150 a battle, dodge-smoke run2..run5): orbit
 * either way or stop cannot reach a safe spot at close range, and a 0/1 danger floored at 0.1
 * does not say how near a miss was. Saguaro instead searches many paths and scores each by the
 * clearance its bullets leave.</p>
 *
 * <ul>
 * <li><b>Paths.</b> Drive to a point and stop there: standing still, and the points reached at
 * {@link #POINT_TICKS} ticks along {@value #HEADINGS} straight headings and along both orbits of
 * the first wave's source (wall-smoothed, the surf's attack angle toward the desired distance),
 * each until every wave planned for has passed.</li>
 * <li><b>Waves.</b> Up to {@value #MAX_WAVES} surfable waves whose expert bullet is known.</li>
 * <li><b>Score.</b> For each wave, the precise intersection of the path's states with it: a path
 * on which the expert's bullet falls inside it (within {@link ShotDodger#MARGIN}, at the share our
 * bullet shadows let through) costs {@value #HIT_COST} times the bullet's damage, so it is taken
 * only when every path is hit, and then the one hit least; otherwise the bullet's damage over the
 * square of the clearance in radians (Saguaro's {@code damage / (gfDistance * MEA)^2}). Plus
 * Saguaro's {@code 2500 / d^2}, {@code d} the least distance along the path to the enemy
 * extrapolated at its last heading and speed.</li>
 * <li><b>Commitment.</b> The path is kept until the waves planned for or the expert change, we
 * are more than {@value #DRIFT} px off it, or {@value #REPLAN_TICKS} ticks have passed (the enemy
 * moves).</li>
 * </ul>
 *
 * <p>Angles are radians on Robocode's compass; distances in px; times in ticks.</p>
 */
public final class ShotDodgePlanner {

    /** Straight headings tried, evenly round the compass. */
    static final int HEADINGS = 12;
    /** The ticks along each heading or orbit at which a stop point is taken. */
    static final int[] POINT_TICKS = {3, 6, 10, 15, 21, 28, 36, 45, 55};
    /** With no wave to dodge, the planner keeps away from an enemy closer than this, px. */
    static final double CLOSE_RANGE = 200.0;
    /**
     * Whether the planner keeps a close enemy away with no wave in the air, and drives ahead of
     * RAM-2's escape (the ablation {@code sdkeep0} turns both off).
     */
    public static final boolean KEEP_AWAY = true;
    /** Centres closer than this collide, px (a robot is 36 px square). */
    static final double COLLIDE = 40.0;
    /** A collision costs as much as a bullet of this damage, so a path is rammed only when every path is. */
    static final double RAM_DAMAGE = 4.0;
    /** The ticks a keep-away path looks ahead. */
    static final int KEEP_TICKS = 20;
    /** Waves planned for at once. */
    static final int MAX_WAVES = 3;
    /** The most ticks a path runs. */
    static final int MAX_TICKS = 120;
    /** A hit's cost per point of damage: above any miss's. */
    static final double HIT_COST = 1e9;
    /** Saguaro's weight on the closest approach to the enemy, px squared. */
    static final double OPPONENT_WEIGHT = 2500.0;
    /** A clearance is floored here, radians, so a graze is costly but finite. */
    static final double MIN_CLEARANCE = 1e-4;
    /** A replan is forced when we are this far from the path, px. */
    static final double DRIFT = 2.0;
    /** A replan is forced after this many ticks on one path. */
    static final int REPLAN_TICKS = 5;
    /** Wall smoothing's reach for the orbit points, px. */
    private static final double WALL_STICK = 160.0;

    private final BattleField battleField;
    private final MovementPredictor predictor;

    private List<Wave> planWaves = List.of();
    private int planExpert = -1;
    private long planTime = Long.MIN_VALUE;
    private Point2D.Double planPoint;
    private List<RobotState> planPath = List.of();
    private int replans;

    /**
     * @param battleField the field, for wall smoothing and the enemy's extrapolation
     * @param predictor the engine's movement rules
     */
    public ShotDodgePlanner(BattleField battleField, MovementPredictor predictor) {
        this.battleField = battleField;
        this.predictor = predictor;
    }

    /** Forgets the plan, at each round and after anything else drove. */
    public void reset() {
        planWaves = List.of();
        planExpert = -1;
        planTime = Long.MIN_VALUE;
        planPoint = null;
        planPath = List.of();
    }

    /** Replans over the battle; for tests. */
    int replans() {
        return replans;
    }

    /** The point driven to; null before the first plan. */
    Point2D.Double planPoint() {
        return planPoint;
    }

    /**
     * Drives the tick when the dodger has an expert and a surfable wave has its bullet.
     *
     * @param orders the orders to write the drive into
     * @param myState our state now
     * @param moveCtrl the waves
     * @param dodger the duel's dodger
     * @param enemy the enemy's last scanned state, or null
     * @param desiredDistance the distance the orbit points' attack angle steers toward, px
     * @return whether it drove; false leaves the tick to the surf
     */
    public boolean surf(BotOrders.Builder orders, RobotState myState, MoveController moveCtrl,
                        ShotDodger dodger, RobotState enemy, double desiredDistance) {
        if (dodger == null || !dodger.planActive()) return false;
        int expert = dodger.planBest();
        List<Wave> waves = new ArrayList<>(MAX_WAVES);
        List<Double> bullets = new ArrayList<>(MAX_WAVES);
        double band = dodger.band(expert);
        for (int i = 0; i < MAX_WAVES; i++) {
            Wave w = moveCtrl.findSurfableWave(i, myState);
            if (w == null) break;
            double[] aims = w.simpleAims();
            double a = aims == null ? Double.NaN : dodger.expert(aims, expert);
            if (Double.isNaN(a)) continue;
            waves.add(w);
            bullets.add(a);
        }
        // With no wave in the air, a close enemy is kept away from (Saguaro's distance term alone).
        if (waves.isEmpty() && (!KEEP_AWAY || enemy == null || enemy.location.distance(myState.location) > CLOSE_RANGE)) return false;
        if (needsPlan(myState, waves, expert)) {
            plan(myState, waves, bullets, band, enemy, desiredDistance);
            planWaves = waves;
            planExpert = expert;
            planTime = myState.time;
        }
        moveCtrl.publishPlan(List.of());
        goTo(orders, myState, planPoint);
        return true;
    }

    private boolean needsPlan(RobotState myState, List<Wave> waves, int expert) {
        if (planPoint == null || expert != planExpert || !waves.equals(planWaves)) return true;
        if (myState.time - planTime >= REPLAN_TICKS) return true;
        long offset = myState.time - planPath.get(0).time;
        if (offset < 0) return true;
        RobotState expected = planPath.get((int) Math.min(offset, planPath.size() - 1));
        return expected.location.distance(myState.location) > DRIFT;
    }

    void plan(RobotState myState, List<Wave> waves, List<Double> bullets, double band, RobotState enemy,
              double desiredDistance) {
        replans++;
        double best = Double.POSITIVE_INFINITY;
        Point2D.Double bestPoint = myState.location;
        List<RobotState> bestPath = List.of(myState);
        Point2D.Double source = waves.isEmpty() ? enemy.location : waves.get(0).sourceLocation;
        for (Point2D.Double p : points(myState, source, waves, desiredDistance)) {
            List<RobotState> path = path(myState, p, waves);
            double cost = cost(path, waves, bullets, band, enemy);
            if (cost < best) {
                best = cost;
                bestPoint = p;
                bestPath = path;
            }
        }
        planPoint = bestPoint;
        planPath = bestPath;
    }

    /** The stop points (see the class comment), standing still first. */
    List<Point2D.Double> points(RobotState start, Point2D.Double source, List<Wave> waves, double desiredDistance) {
        List<Point2D.Double> out = new ArrayList<>();
        out.add(start.location);
        int last = waves.isEmpty() ? KEEP_TICKS : POINT_TICKS[POINT_TICKS.length - 1];
        for (int h = 0; h < HEADINGS; h++) {
            double heading = 2 * Math.PI * h / HEADINGS;
            RobotState s = start;
            for (int t = 1, i = 0; t <= last && i < POINT_TICKS.length; t++) {
                s = predictor.nextLocation(s, 8.0, heading, false);
                if (t == last && t != POINT_TICKS[i]) out.add(s.location);
                if (t == POINT_TICKS[i]) {
                    out.add(s.location);
                    i++;
                    if (!waves.isEmpty() && allPassed(s, waves)) break;
                }
            }
        }
        for (int direction : new int[] {-1, 1}) {
            RobotState s = start;
            for (int t = 1, i = 0; t <= last && i < POINT_TICKS.length; t++) {
                double bearing = DiaUtils.absoluteBearing(source, s.location);
                double attack = StopPointSurf.attackAngle(source.distance(s.location), desiredDistance);
                double goAngle = battleField.wallSmoothing(s.location,
                    bearing + direction * (Math.PI / 2 + attack), direction, WALL_STICK);
                s = predictor.nextLocation(s, 8.0, goAngle, false);
                if (t == POINT_TICKS[i]) {
                    out.add(s.location);
                    i++;
                    if (!waves.isEmpty() && allPassed(s, waves)) break;
                }
            }
        }
        return out;
    }

    private static boolean allPassed(RobotState s, List<Wave> waves) {
        for (Wave w : waves) {
            if (w.checkWavePosition(s, true) != Wave.WavePosition.GONE) return false;
        }
        return true;
    }

    /** Driving to {@code point} and stopping there, one state a tick from {@code start}, until every wave has passed. */
    List<RobotState> path(RobotState start, Point2D.Double point, List<Wave> waves) {
        List<RobotState> path = new ArrayList<>();
        RobotState s = start;
        path.add(s);
        int ticks = waves.isEmpty() ? KEEP_TICKS : MAX_TICKS;
        for (int t = 0; t < ticks && (waves.isEmpty() || !allPassed(s, waves)); t++) {
            s = goToStep(s, point);
            path.add(s);
        }
        return path;
    }

    /** The path's cost (see the class comment). */
    double cost(List<RobotState> path, List<Wave> waves, List<Double> bullets, double band, RobotState enemy) {
        double cost = 0;
        for (int i = 0; i < waves.size(); i++) {
            Wave w = waves.get(i);
            List<RobotState> crossing = new ArrayList<>();
            for (RobotState s : path) {
                if (w.checkWavePosition(s).isBreaking()) crossing.add(s);
            }
            if (crossing.isEmpty()) continue;
            Wave.Intersection x = w.preciseIntersection(crossing);
            if (x == null) continue;
            cost += waveCost(w, x, bullets.get(i), band);
        }
        if (enemy != null) {
            double min = Double.POSITIVE_INFINITY;
            for (RobotState s : path) {
                min = Math.min(min, s.location.distance(enemyAt(enemy, s.time)));
            }
            cost += OPPONENT_WEIGHT / Math.max(1.0, min * min);
            // A path that drives into the enemy's extrapolated track is rammed.
            if (min < COLLIDE) cost += HIT_COST * RAM_DAMAGE;
        }
        return cost;
    }

    /**
     * One wave's cost for a path crossing it at {@code x}, its expert bullet at {@code bullet} and
     * as far as {@code band} either side ({@link ShotDodger#band}).
     */
    static double waveCost(Wave w, Wave.Intersection x, double bullet, double band) {
        double damage = Rules.getBulletDamage(w.bulletPower());
        double off = Math.abs(Angles.normalRelativeAngle(bullet - x.angle));
        if (off <= x.bandwidth + band) {
            double through = 1.0;
            List<double[]> segments = w.transmission(x);
            if (!segments.isEmpty()) {
                through = 0;
                for (double[] seg : segments) {
                    double at = DiaUtils.normalizeAngle(bullet, (seg[0] + seg[1]) / 2);
                    if (at >= seg[0] - band && at <= seg[1] + band) {
                        through = Math.max(through, seg[2]);
                    }
                }
            }
            if (through > 0) return HIT_COST * damage * through;
        }
        double clearance = Math.max(MIN_CLEARANCE, off - x.bandwidth - band);
        return damage / (clearance * clearance);
    }

    /** The enemy at {@code time}, driven on at its last heading and speed and held inside the field. */
    Point2D.Double enemyAt(RobotState enemy, long time) {
        double t = Math.max(0, time - enemy.time);
        return battleField.translateToField(DiaUtils.project(enemy.location, enemy.heading, enemy.velocity * t));
    }

    /** One tick of driving to {@code point} and stopping there, as go-to surfing's. */
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

    /** The orders that match {@link #goToStep}. */
    private static void goTo(BotOrders.Builder orders, RobotState state, Point2D.Double point) {
        orders.maxVelocity(8.0);
        double dist = state.location.distance(point);
        if (dist < 0.5) {
            orders.turnRight(0);
            orders.ahead(0);
            return;
        }
        double turn = Angles.normalRelativeAngle(
            DiaUtils.absoluteBearing(state.location, point) - state.heading);
        double distance = dist;
        if (Math.abs(turn) > Math.PI / 2) {
            turn -= Math.signum(turn) * Math.PI;
            distance = -dist;
        }
        orders.turnRight(turn);
        orders.ahead(distance);
    }
}

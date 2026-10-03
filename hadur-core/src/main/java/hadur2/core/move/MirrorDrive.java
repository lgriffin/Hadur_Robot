package hadur2.core.move;

import hadur2.core.model.BotOrders;
import hadur2.core.model.RobotState;
import hadur2.core.physics.Angles;
import hadur2.core.physics.BattleField;
import hadur2.core.physics.DiaUtils;
import hadur2.core.physics.MovementPredictor;

import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;
import java.util.function.LongFunction;
import java.util.function.UnaryOperator;

/**
 * MIR-1: a path decided in advance, so a robot that mirrors it can be hit.
 *
 * <p>A mirror bot drives toward the reflection of our position, a few ticks late. The gun
 * can only use that if it knows where we will be when its bullet arrives, up to a hundred
 * ticks ahead, and a surf decides that a tick at a time. So while {@code
 * policy.MirrorDetector} says the enemy mirrors us, the movement is this instead: a plan of
 * straight runs at full speed, each in a new direction and of a new length, played forward
 * with the engine's own movement rules at least {@link #HORIZON} ticks ahead and then
 * followed order for order. {@link #plannedLocation} answers where we will be at any tick of
 * the plan, and {@link #aim} turns that into a firing angle.</p>
 *
 * <p>The runs are what a simple gun cannot follow: directions and lengths come from the
 * golden-ratio sequence (no randomness, RES-6), so each run turns somewhere new after
 * {@link #MIN_RUN} to {@link #MIN_RUN} + {@link #RUN_SPREAD} ticks. A run that would come
 * within {@link #WALL_MARGIN} px of a wall, or within {@link #CENTRE_MARGIN} px of the
 * field's centre (where the mirror image is right on top of us), is not taken; the next
 * direction in the sequence is tried. If the actual state ever leaves the plan (a collision,
 * a skipped turn), the plan is dropped and made again from where we really are.</p>
 */
public final class MirrorDrive {

    /** Ticks the plan always reaches beyond now: longer than any bullet's flight here. */
    static final int HORIZON = 110;
    /** The shortest run, in ticks. */
    static final int MIN_RUN = 10;
    /** Runs are {@link #MIN_RUN} plus up to this many ticks. */
    static final int RUN_SPREAD = 26;
    /** The least distance, in px, a planned centre keeps from each wall. */
    static final double WALL_MARGIN = 40;
    /** The least distance, in px, a planned position keeps from the field's centre. */
    static final double CENTRE_MARGIN = 140;
    /** How far, in px, the real state may be from the plan's before the plan is remade. */
    private static final double DRIFT = 0.5;
    /** The golden ratio's fractional part: the low-discrepancy step (see shield.AimJitter). */
    private static final double GOLDEN = 0.6180339887498949;
    /** Directions tried per run before falling back on the field's centre line. */
    private static final int TRIES = 16;

    private final BattleField battleField;
    private final MovementPredictor predictor;
    /** The planned states, one per tick, oldest first; each with the angle driven to reach it. */
    private final List<RobotState> plan = new ArrayList<>();
    private final List<Double> angles = new ArrayList<>();
    private double phase = GOLDEN;
    private double lengthPhase = GOLDEN * GOLDEN;

    /**
     * @param battleField the field, whose walls the plan keeps clear of
     * @param predictor the engine's movement rules
     */
    public MirrorDrive(BattleField battleField, MovementPredictor predictor) {
        this.battleField = battleField;
        this.predictor = predictor;
    }

    /** A new round: the plan is dropped. The sequences carry on, so no two rounds repeat. */
    public void initRound() {
        plan.clear();
        angles.clear();
    }

    /**
     * Writes this tick's drive into {@code orders}: the next step of the plan, which is made
     * or remade first if it does not start from {@code me}.
     *
     * @param orders the orders to write the drive into
     * @param me our state this tick
     */
    public void move(BotOrders.Builder orders, RobotState me) {
        follow(me);
        orders.maxVelocity(8.0);
        DiaUtils.setBackAsFront(orders, me.heading, angles.get(0));
    }

    /**
     * Brings the plan up to date with {@code me}: drops the steps already taken, remakes it
     * if {@code me} is not where it said, and extends it to {@link #HORIZON} ticks ahead.
     *
     * @param me our state this tick
     */
    public void follow(RobotState me) {
        while (!plan.isEmpty() && plan.get(0).time <= me.time) {
            RobotState done = plan.remove(0);
            angles.remove(0);
            if (done.time == me.time && (done.location.distance(me.location) > DRIFT
                    || Math.abs(done.velocity - me.velocity) > 1e-6
                    || Math.abs(Angles.normalRelativeAngle(done.heading - me.heading)) > 1e-6)) {
                plan.clear();
                angles.clear();
            }
        }
        if (!plan.isEmpty() && plan.get(0).time != me.time + 1) {
            plan.clear();
            angles.clear();
        }
        RobotState last = plan.isEmpty() ? me : plan.get(plan.size() - 1);
        while (last.time < me.time + HORIZON) {
            last = addRun(last);
        }
    }

    /** Plans one run from {@code from}; returns its last state. */
    private RobotState addRun(RobotState from) {
        lengthPhase = (lengthPhase + GOLDEN) % 1.0;
        int length = MIN_RUN + (int) (lengthPhase * (RUN_SPREAD + 1));
        List<RobotState> states = new ArrayList<>(length);
        for (int i = 0; i < TRIES; i++) {
            phase = (phase + GOLDEN) % 1.0;
            double angle = phase * 2 * Math.PI;
            if (tryRun(from, angle, length, states)) return commit(states, angle);
        }
        // Nothing clear for a whole run: the shortest run, in whichever of a full circle of
        // directions stays furthest inside both limits.
        double bestAngle = 0;
        double bestClearance = Double.NEGATIVE_INFINITY;
        List<RobotState> best = new ArrayList<>(MIN_RUN);
        for (int i = 0; i < 2 * TRIES; i++) {
            double angle = Math.PI * i / TRIES;
            states.clear();
            RobotState s = from;
            double clearance = Double.POSITIVE_INFINITY;
            for (int t = 0; t < MIN_RUN; t++) {
                s = predictor.nextLocation(s, 8.0, angle, false);
                states.add(s);
                clearance = Math.min(clearance, clearance(s.location));
            }
            if (clearance > bestClearance) {
                bestClearance = clearance;
                bestAngle = angle;
                best = new ArrayList<>(states);
            }
        }
        return commit(best, bestAngle);
    }

    /** How far, in px, {@code p} is inside both the wall margin and the centre margin. */
    private double clearance(Point2D.Double p) {
        double walls = Math.min(Math.min(p.x, battleField.width - p.x),
            Math.min(p.y, battleField.height - p.y)) - WALL_MARGIN;
        double centre = p.distance(battleField.width / 2, battleField.height / 2) - CENTRE_MARGIN;
        return Math.min(walls, centre);
    }

    private boolean tryRun(RobotState from, double angle, int length, List<RobotState> states) {
        states.clear();
        RobotState s = from;
        for (int t = 0; t < length; t++) {
            s = predictor.nextLocation(s, 8.0, angle, false);
            if (clearance(s.location) < 0) return false;
            states.add(s);
        }
        return true;
    }

    private RobotState commit(List<RobotState> states, double angle) {
        for (RobotState s : states) {
            plan.add(s);
            angles.add(angle);
        }
        return states.get(states.size() - 1);
    }

    /**
     * Where the plan has us at {@code time}, or null if the plan does not reach it.
     *
     * @param time the tick
     * @return our planned position then, in px
     */
    public Point2D.Double plannedLocation(long time) {
        if (plan.isEmpty()) return null;
        long first = plan.get(0).time;
        int i = (int) (time - first);
        if (i < 0 || i >= plan.size()) return null;
        return plan.get(i).location;
    }

    /**
     * The firing angle at a robot that sits at the mirror image of where we were {@code lag}
     * ticks earlier: the first tick of the bullet's flight at which the reflection of our
     * position then is within the bullet's reach. Ticks before the plan starts are read from
     * {@code past}.
     *
     * @param from where the bullet leaves, in px
     * @param fireTime the tick it leaves
     * @param bulletSpeed its speed, in px/tick
     * @param lag how many ticks the mirror runs behind us
     * @param mirror maps a position to its reflection
     * @param past our real position at a tick before the plan starts, null if unknown
     * @return the absolute angle, in radians; NaN if the plan does not reach far enough
     */
    public double aim(Point2D.Double from, long fireTime, double bulletSpeed, int lag,
                      UnaryOperator<Point2D.Double> mirror, LongFunction<Point2D.Double> past) {
        if (plan.isEmpty()) return Double.NaN;
        long first = plan.get(0).time;
        for (int k = 1; k <= HORIZON; k++) {
            long t = fireTime + k - lag;
            Point2D.Double us = t < first ? past.apply(t) : plannedLocation(t);
            if (us == null) return Double.NaN;
            Point2D.Double target = mirror.apply(us);
            if (from.distance(target) <= bulletSpeed * k) {
                return DiaUtils.absoluteBearing(from, target);
            }
        }
        return Double.NaN;
    }
}

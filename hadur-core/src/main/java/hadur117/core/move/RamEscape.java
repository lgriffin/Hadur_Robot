package hadur117.core.move;

import hadur117.core.model.BotOrders;
import hadur117.core.model.RobotState;
import hadur117.core.physics.Angles;
import hadur117.core.physics.BattleField;
import hadur117.core.physics.DiaUtils;
import hadur117.core.physics.MovementPredictor;
import hadur117.core.physics.Rules;

import java.awt.geom.Point2D;

/**
 * RAM-2: keeping a charging rammer at arm's length.
 *
 * <p>A rammer drives straight at us and, at point-blank range, fires full power shots it
 * rarely misses (the RoboRumble's rammers mostly fire only inside 100 px). Neither the surf
 * (those shots leave no room to dodge) nor the plain orbit (it holds a distance, it does not
 * run) keeps it out, so while {@code policy.RammerPolicy} says one is charging, the movement
 * is this instead: the heading that keeps it furthest away over the next
 * {@link #HORIZON} ticks.</p>
 *
 * <p>Each candidate is one of {@link #HEADINGS} absolute headings, wall-smoothed every tick
 * on either side (so a candidate that meets a wall slides along it rather than stopping),
 * and is played forward with the engine's own movement rules. The rammer is played forward
 * alongside as pure pursuit: it accelerates to full speed and turns, at the engine's turn
 * rate, toward where we will be. The candidate scored best is the one whose closest approach
 * over the horizon is furthest; ties go to the larger mean distance, then to the candidate
 * closest to the last choice, so the heading does not flicker between equals.</p>
 *
 * <p>Deterministic and cheap: at most {@value #HEADINGS} x 2 candidates of
 * {@value #HORIZON} ticks each, run only while a rammer is charging. A candidate stops being
 * played once it comes closer than the best so far already has, and the second orientation
 * is skipped when no wall bent the first, since it would drive the same path.</p>
 */
public final class RamEscape {

    /** Absolute headings tried, evenly spaced. */
    static final int HEADINGS = 24;
    /** Ticks each candidate is played forward. */
    static final int HORIZON = 20;
    /** The wall-smoothing stick, in px: the same as the surf's. */
    private static final double WALL_STICK = 160.0;
    /** Closest approaches within this many px of each other count as equal. */
    private static final double TIE = 4.0;

    private final BattleField battleField;
    private final MovementPredictor predictor;
    /** The heading chosen last tick, NaN when there is none. */
    private double lastHeading = Double.NaN;
    /** RAM-5: a candidate path loses this many px of closest approach for each aim one of the rammer's shots would hit it with. */
    static final double HIT_COST = 60.0;
    /** RAM-5: a bullet within this many px of our centre on both axes counts as a hit (half a robot, plus slack). */
    static final double HIT_BOX = 22.0;
    /** RAM-5: ticks a candidate is played for the shots: a shot chasing a fleeing robot takes long to reach it. */
    static final int SHOT_HORIZON = 45;
    /** RAM-5: the most shots in flight kept. */
    static final int MAX_SHOTS = 4;
    /** RAM-5: the rammer's shots in flight, each {fire tick, x, y, speed, head-on angle, linear angle}. */
    private final java.util.ArrayDeque<double[]> shots = new java.util.ArrayDeque<>();
    /** RAM-5: whether the escape scores paths against the shots in flight. */
    private boolean dodge;
    /**
     * RAM-11: a third aim per shot, circular: the rammers that lead us (RammingC, MaxRisk and their kind) extrapolate
     * our turn rate, and the escape's smooth wall-smoothed arcs are exactly what that aim predicts. On per opponent
     * ({@code ram-circ:} lines, {@link #setCircular}); this forces it on every rammer, for the bench's screen only.
     */
    static final boolean FORCE_CIRCULAR = false;
    /** RAM-11: whether this opponent's shots are also dodged as circular aims. */
    private boolean circular;
    /**
     * RAM-13: a zig-zag on the escape's heading. The field's close-range rammers lead us linearly from our velocity when
     * they fire, and the escape's straight full-speed runs are what that aim predicts; RAM-12 broke the line by slowing
     * and let them close. This keeps full speed and swings the heading {@link #ZIG} radians either side of the chosen
     * one, switching side every {@link #ZIG_MIN} to {@link #ZIG_MAX} ticks. On per opponent ({@code ram-zig:} lines,
     * {@link #setZig}); this forces it on every rammer, for the bench's screen only.
     */
    static final boolean FORCE_ZIG = false;
    /** RAM-13: the swing either side, radians. */
    static final double ZIG = 0.45;
    /** RAM-13: the shortest stretch on one side, ticks. */
    static final int ZIG_MIN = 5;
    /** RAM-13: the longest stretch on one side, ticks. */
    static final int ZIG_MAX = 11;
    /** RAM-13: whether this opponent gets the zig-zag. */
    private boolean zig;
    /** RAM-13: the draws for the stretch lengths. */
    private final java.util.Random zigRandom = new java.util.Random();
    /** RAM-13: the tick the current side ends, and the side (+1 or -1). */
    private long zigUntil = Long.MIN_VALUE;
    private int zigSide = 1;

    /** RAM-11: our heading at the last move, for the turn rate a circular aim extrapolates; NaN before the first. */
    private double prevHeading = Double.NaN;
    /** RAM-11: the tick of {@link #prevHeading}. */
    private long prevTime;
    /** RAM-11: our turn rate at the last move, radians a tick, averaged over the ticks since the move before. */
    private double turnRate;

    /**
     * @param battleField the field, for wall smoothing
     * @param predictor the engine's movement rules
     */
    public RamEscape(BattleField battleField, MovementPredictor predictor) {
        this.battleField = battleField;
        this.predictor = predictor;
    }

    /** A new round: no heading carried over. */
    public void initRound() {
        lastHeading = Double.NaN;
        shots.clear();
        prevHeading = Double.NaN;
        turnRate = 0;
        zigUntil = Long.MIN_VALUE;
    }

    /** The heading chosen on the last {@link #move}, NaN before the first. */
    public double lastHeading() {
        return lastHeading;
    }

    /**
     * Writes this tick's escape drive into {@code orders}: full speed along the chosen
     * heading, back-as-front.
     *
     * @param orders the orders to write the drive into
     * @param me our state this tick
     * @param enemy the rammer's state this tick (its location, heading and velocity)
     */
    public void move(BotOrders.Builder orders, RobotState me, RobotState enemy) {
        move(orders, me, enemy, false);
    }

    /**
     * RAM-5: as {@link #move(BotOrders.Builder, RobotState, RobotState)}; with {@code dodge} on, a
     * path one of the rammer's shots in flight would hit, aimed head-on or linear, loses
     * {@link #HIT_COST} px of closest approach for each aim that hits it.
     */
    public void move(BotOrders.Builder orders, RobotState me, RobotState enemy, boolean dodge) {
        this.dodge = dodge;
        // Another driver may have moved us since the last escape move: average the turn over the ticks between.
        if (!Double.isNaN(prevHeading) && me.time > prevTime) {
            turnRate = Angles.normalRelativeAngle(me.heading - prevHeading) / (me.time - prevTime);
        }
        prevHeading = me.heading;
        prevTime = me.time;
        // A shot that has flown past the field's diagonal can hit nothing more.
        while (!shots.isEmpty() && (me.time - shots.peekFirst()[0]) * shots.peekFirst()[3] > 1000) shots.removeFirst();
        double heading = choose(me, enemy);
        if (zig) {
            // RAM-13: swing off the chosen heading, wall-smoothed on the swing's side so it never drives into a wall.
            int side = zigSide(me.time);
            heading = battleField.wallSmoothing(me.location, Angles.normalAbsoluteAngle(heading + side * ZIG), side, WALL_STICK);
        }
        orders.maxVelocity(8.0);
        DiaUtils.setBackAsFront(orders, me.heading, heading);
    }

    /**
     * RAM-5: the rammer fired. The shot is kept with the two aims a nano rammer uses: head-on at
     * where we were, and linear, leading our heading and speed then.
     *
     * @param fireTime the tick the bullet left
     * @param enemyX the rammer's x when it fired
     * @param enemyY the rammer's y when it fired
     * @param power the shot's power
     * @param me our state when it fired (or as near as is known)
     */
    public void onEnemyShot(long fireTime, double enemyX, double enemyY, double power, RobotState me) {
        double speed = Rules.getBulletSpeed(power);
        double headOn = Math.atan2(me.location.x - enemyX, me.location.y - enemyY);
        double tx = me.location.x;
        double ty = me.location.y;
        for (int k = 1; k < 100; k++) {
            tx = DiaUtils.limit(18.0, me.location.x + Math.sin(me.heading) * me.velocity * k, battleField.width - 18.0);
            ty = DiaUtils.limit(18.0, me.location.y + Math.cos(me.heading) * me.velocity * k, battleField.height - 18.0);
            if (Point2D.distance(enemyX, enemyY, tx, ty) <= speed * k) break;
        }
        double circAim = Double.NaN;
        if (FORCE_CIRCULAR || circular) {
            double cx = me.location.x;
            double cy = me.location.y;
            double ch = me.velocity < 0 ? me.heading + Math.PI : me.heading;
            double cv = Math.abs(me.velocity);
            for (int k = 1; k < 100; k++) {
                ch += turnRate;
                cx = DiaUtils.limit(18.0, cx + Math.sin(ch) * cv, battleField.width - 18.0);
                cy = DiaUtils.limit(18.0, cy + Math.cos(ch) * cv, battleField.height - 18.0);
                if (Point2D.distance(enemyX, enemyY, cx, cy) <= speed * k) break;
            }
            circAim = Math.atan2(cx - enemyX, cy - enemyY);
        }
        if (shots.size() >= MAX_SHOTS) shots.removeFirst();
        shots.addLast(new double[] {fireTime, enemyX, enemyY, speed, headOn, Math.atan2(tx - enemyX, ty - enemyY), circAim});
    }

    /**
     * RAM-11: dodge this opponent's shots as circular aims too (its {@code ram-circ:} line).
     *
     * @param on true for an opponent the table names
     */
    public void setCircular(boolean on) {
        circular = on;
    }

    /**
     * RAM-13: turns the zig-zag on or off for this opponent ({@link #FORCE_ZIG} keeps it on).
     *
     * @param on whether the table names the opponent
     */
    public void setZig(boolean on) {
        zig = on || FORCE_ZIG;
    }

    /**
     * RAM-13: the swing's side for {@code time}, drawing the next stretch's length once this one has run out.
     *
     * @param time the tick
     * @return +1 or -1
     */
    int zigSide(long time) {
        if (time >= zigUntil) {
            zigSide = -zigSide;
            zigUntil = time + ZIG_MIN + zigRandom.nextInt(ZIG_MAX - ZIG_MIN + 1);
        }
        return zigSide;
    }

    /** RAM-11: the newest shot's circular aim minus its linear aim, NaN when it carries none; for tests. */
    double lastCircularLead() {
        double[] s = shots.peekLast();
        return s == null ? Double.NaN : Angles.normalRelativeAngle(s[6] - s[5]);
    }

    /** RAM-5: the shots in flight, for tests. */
    int shotsInFlight() {
        return shots.size();
    }

    /**
     * The heading, wall-smoothed for this tick, that keeps the rammer furthest away.
     *
     * @param me our state this tick
     * @param enemy the rammer's state this tick
     * @return the absolute heading to drive, in radians
     */
    double choose(RobotState me, RobotState enemy) {
        double bestMin = Double.NEGATIVE_INFINITY;
        double bestMean = Double.NEGATIVE_INFINITY;
        double bestTurn = Double.POSITIVE_INFINITY;
        double bestHeading = DiaUtils.absoluteBearing(enemy.location, me.location);
        for (int i = 0; i < HEADINGS; i++) {
            double raw = 2 * Math.PI * i / HEADINGS;
            for (int orientation = 1; orientation >= -1; orientation -= 2) {
                double[] score = play(me, enemy, raw, orientation, bestMin - TIE);
                if (score == null) {
                    // Pruned: it came closer than the best's closest approach already.
                    continue;
                }
                if (score[2] == 0 && orientation == 1) {
                    // No wall touched this run, so the other orientation would drive the same.
                    orientation = -1;
                }
                double first = battleField.wallSmoothing(me.location, raw, orientation, WALL_STICK);
                double turn = Double.isNaN(lastHeading) ? 0
                    : Math.abs(Angles.normalRelativeAngle(first - lastHeading));
                boolean better;
                if (score[0] > bestMin + TIE) better = true;
                else if (score[0] < bestMin - TIE) better = false;
                else if (score[1] > bestMean + TIE) better = true;
                else if (score[1] < bestMean - TIE) better = false;
                else better = turn < bestTurn;
                if (better) {
                    // Keep the best closest approach, not the tied one, so ties cannot drift.
                    bestMin = Math.max(bestMin, score[0]);
                    bestMean = score[1];
                    bestTurn = turn;
                    bestHeading = first;
                }
            }
        }
        lastHeading = bestHeading;
        return bestHeading;
    }

    /**
     * Plays one candidate forward.
     *
     * @param floor a closest approach below which the candidate cannot win: play stops there
     * @return {closest approach, mean distance, 1 if a wall bent the heading else 0} over the
     *     horizon, in px; null once the closest approach falls below {@code floor}
     */
    private double[] play(RobotState me, RobotState enemy, double raw, int orientation,
                          double floor) {
        RobotState us = me;
        double ex = enemy.location.x;
        double ey = enemy.location.y;
        // The direction of travel: a robot driving backward travels opposite its heading.
        double eh = enemy.velocity < 0 ? Angles.normalAbsoluteAngle(enemy.heading + Math.PI)
            : enemy.heading;
        double ev = Math.abs(enemy.velocity);
        double min = Double.POSITIVE_INFINITY;
        double sum = 0;
        double bent = 0;
        int hits = 0;
        int ticks = dodge && !shots.isEmpty() ? SHOT_HORIZON : HORIZON;
        for (int t = 0; t < ticks; t++) {
            double go = battleField.wallSmoothing(us.location, raw, orientation, WALL_STICK);
            if (go != raw) bent = 1;
            us = predictor.nextLocation(us, 8.0, go, false);
            // Pure pursuit: turn toward where we are now, at the engine's rate, then move.
            double want = Math.atan2(us.location.x - ex, us.location.y - ey);
            double maxTurn = Rules.getTurnRateRadians(ev);
            eh += DiaUtils.limit(-maxTurn, Angles.normalRelativeAngle(want - eh), maxTurn);
            ev = Math.min(8.0, ev + 1.0);
            ex = DiaUtils.limit(18.0, ex + Math.sin(eh) * ev, battleField.width - 18.0);
            ey = DiaUtils.limit(18.0, ey + Math.cos(eh) * ev, battleField.height - 18.0);
            if (dodge) hits |= hits(us.location.x, us.location.y, me.time + t + 1);
            if (t >= HORIZON) continue;
            double d = Point2D.distance(us.location.x, us.location.y, ex, ey);
            min = Math.min(min, d);
            if (min < floor) return null;
            sum += d;
        }
        return new double[] {min - HIT_COST * Integer.bitCount(hits), sum / HORIZON, bent};
    }

    /**
     * RAM-5: which of the shots in flight would hit us at {@code (x, y)} on {@code time}, two bits
     * a shot (head-on, linear and, with RAM-11, circular).
     */
    private int hits(double x, double y, long time) {
        int bits = 0;
        int i = 0;
        for (double[] s : shots) {
            double flown = (time - s[0]) * s[3];
            if (flown > 0) {
                for (int a = 0; a < 3; a++) {
                    if (Double.isNaN(s[4 + a])) continue;
                    double bx = s[1] + Math.sin(s[4 + a]) * flown;
                    double by = s[2] + Math.cos(s[4 + a]) * flown;
                    if (Math.abs(bx - x) < HIT_BOX && Math.abs(by - y) < HIT_BOX) bits |= 1 << (3 * i + a);
                }
            }
            i++;
        }
        return bits;
    }
}

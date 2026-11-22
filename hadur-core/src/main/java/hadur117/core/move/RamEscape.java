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
    /** RAM-11: our heading at the last move, for the turn rate a circular aim extrapolates; NaN before the first. */
    private double prevHeading = Double.NaN;
    /** RAM-11: the tick of {@link #prevHeading}. */
    private long prevTime;
    /** RAM-11: our turn rate at the last move, radians a tick, averaged over the ticks since the move before. */
    private double turnRate;
    /**
     * RAM-20: every rammer's shots are dodged by the learned shot model, for the bench's screen only; in the robot
     * the table's {@code ram-learn:} lines turn it on per opponent ({@link #setLearned}).
     */
    static final boolean FORCE_LEARNED = false;
    /** RAM-20: the closest approach a path loses for a shot the learned model is sure hits it, px. */
    static final double LEARNED_COST = 120.0;
    /** RAM-20: each learned ray is tested as three, itself and this far either side, radians. */
    static final double LEARNED_FAN = Math.toRadians(3);
    /** RAM-20: where a learned shot's record keeps its rays' sines and cosines, three rays an aim. */
    private static final int RAY_BASE = 10;
    /** RAM-20 (measurement): the hit bits of the path {@link #play} last scored. */
    private int lastPlayBits;
    /** RAM-20 (measurement): the last choice's note, {@code candidates,unhit,chosenBits,chosenScore}; null when none. */
    private String choiceNote;

    /** RAM-20 (measurement): the note of the last choice, cleared by the read. */
    public String drainChoiceNote() {
        String n = choiceNote;
        choiceNote = null;
        return n;
    }

    /** RAM-20: the learned shot model, null while the switch is off for this opponent. */
    private ShotModel model;
    /** RAM-20: a learned ray counts as hitting a path when it passes within this many px of our centre on both axes. */
    static final double LEARNED_BOX = 22.0;

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
        bendFrom = Double.NaN;
        bendUntil = Long.MIN_VALUE;
        prevHeading = Double.NaN;
        turnRate = 0;
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
        onEnemyShot(fireTime, enemyX, enemyY, power, me, null);
    }

    /**
     * RAM-20: as {@link #onEnemyShot(long, double, double, double, RobotState)}; with the learned model on and
     * ready, the shot is kept as the model's rays for the firing wave's simple aims instead of the fixed aims.
     *
     * @param aims the firing wave's simple aims ({@code Wave.simpleAims()}), null when it carries none
     */
    public void onEnemyShot(long fireTime, double enemyX, double enemyY, double power, RobotState me, double[] aims) {
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
        if (bend) {
            bendFrom = Angles.normalAbsoluteAngle(me.velocity < 0 ? me.heading + Math.PI : me.heading);
            bendUntil = fireTime + BEND_TICKS;
        }
        if (shots.size() >= MAX_SHOTS) shots.removeFirst();
        double[] rays = model == null ? null : model.rays(aims);
        if (rays != null) {
            // RAM-20: the learned rays, each with its weight; the last entry marks the shot as learned.
            double[] shot = new double[RAY_BASE + 6 * ShotModel.TOP];
            shot[0] = fireTime;
            shot[1] = enemyX;
            shot[2] = enemyY;
            shot[3] = speed;
            for (int a = 0; a < ShotModel.TOP; a++) {
                shot[4 + a] = rays[2 * a];
                shot[7 + a] = rays[2 * a + 1];
                for (int k = -1; k <= 1; k++) {
                    double angle = rays[2 * a] + k * LEARNED_FAN;
                    shot[RAY_BASE + 6 * a + 2 * (k + 1)] = Math.sin(angle);
                    shot[RAY_BASE + 6 * a + 2 * (k + 1) + 1] = Math.cos(angle);
                }
            }
            shots.addLast(shot);
            return;
        }
        shots.addLast(new double[] {fireTime, enemyX, enemyY, speed, headOn, Math.atan2(tx - enemyX, ty - enemyY), circAim});
    }

    /**
     * RAM-20: dodge this opponent's shots by the aims learned from its own bullets (its {@code ram-learn:} line).
     * The model lasts the battle; turning the switch off drops it.
     *
     * @param on whether the table names this opponent
     */
    public void setLearned(boolean on) {
        if (!(on || FORCE_LEARNED)) model = null;
        else if (model == null) model = new ShotModel();
    }

    /** RAM-20: a new opponent: what the model learned is forgotten. */
    public void forgetLearned() {
        if (model != null) model = new ShotModel();
    }

    /**
     * RAM-20 (measurement): how a bullet that hit us sat against the rays its shot was kept with.
     *
     * @param fireTime the shot's fire tick
     * @param heading the bullet's heading
     * @return {@code {1 when the shot was kept by the learned model else 0, the nearest ray's distance from the
     *     heading in radians, that ray's weight}}, null when no such shot is kept
     */
    public double[] hitAgainst(long fireTime, double heading) {
        for (double[] s : shots) {
            if ((long) s[0] != fireTime) continue;
            double best = Double.POSITIVE_INFINITY;
            double weight = 0;
            for (int a = 0; a < 3; a++) {
                if (Double.isNaN(s[4 + a])) continue;
                double d = Math.abs(Angles.normalRelativeAngle(heading - s[4 + a]));
                if (d < best) {
                    best = d;
                    weight = s.length > 7 ? s[7 + a] : 1;
                }
            }
            return new double[] {s.length > 7 ? 1 : 0, best, weight};
        }
        return null;
    }

    /** RAM-20: the learned shot model, null while the switch is off. */
    public ShotModel learned() {
        return model;
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
     * RAM-17: the half-width of the fan a linear or circular aim is widened to, in radians. The point-blank rammers'
     * guns lag our state by a tick and turn at a limited rate, so their bullets scatter a few degrees about the aim.
     */
    static final double FAN = Math.toRadians(4);
    /** RAM-17: whether the linear and circular aims are dodged as fans. */
    private boolean fan;

    /**
     * RAM-17: dodge this opponent's linear and circular aims as +-{@link #FAN} fans (its {@code ram-fan:} line). The
     * line also weighs its shots as RAM-14 does, the pairing that held on the cloud.
     *
     * @param on whether the table names this opponent
     */
    public void setFan(boolean on) {
        fan = on;
    }

    /**
     * RAM-18: after a shot, the escape keeps this far, in radians, off the line it was travelling when the rammer
     * fired. Nano rammers aim linear (the bench's truth logs: under 150 px a linear aim would hit 32% of our escape
     * paths against 10% of BB's); a fixed escape heading is exactly the path that aim predicts.
     */
    static final double BEND = Math.toRadians(25);
    /** RAM-18: ticks after a shot for which the bend holds; a point-blank shot lands in about 15. */
    static final int BEND_TICKS = 10;
    /** RAM-18: whether this opponent's shots bend the escape. */
    private boolean bend;
    /** RAM-18: our direction of travel when the rammer last fired, NaN when there is none. */
    private double bendFrom = Double.NaN;
    /** RAM-18: the last tick the bend holds. */
    private long bendUntil = Long.MIN_VALUE;

    /**
     * RAM-18: bend the escape off its line of travel after each of this opponent's shots (its {@code ram-bend:} line).
     *
     * @param on whether the table names this opponent
     */
    public void setBend(boolean on) {
        bend = on;
    }

    /** RAM-14: the closest-approach cost of each kept aim that hits a path; {@link #HIT_COST} unless doubled. */
    private double hitCost = HIT_COST;

    /**
     * RAM-14: weigh this opponent's shots twice as heavily, {@code 2 * HIT_COST} px of closest approach for each aim
     * that hits a path (its {@code ram-heavy:} line).
     *
     * @param on whether the table names this opponent
     */
    public void setHeavy(boolean on) {
        hitCost = on ? 2 * HIT_COST : HIT_COST;
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
        // RAM-18: while a bend holds, the candidates on the line the rammer's last shot was aimed along are left out;
        // when every candidate is, the escape chooses as it would without the bend.
        boolean bending = bend && !Double.isNaN(bendFrom) && me.time <= bendUntil;
        double heading = choose(me, enemy, bending);
        return Double.isNaN(heading) ? choose(me, enemy, false) : heading;
    }

    private double choose(RobotState me, RobotState enemy, boolean bending) {
        boolean found = false;
        int played = 0;
        int unhit = 0;
        int bestBits = 0;
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
                played++;
                if (lastPlayBits == 0) unhit++;
                int bits = lastPlayBits;
                if (score[2] == 0 && orientation == 1) {
                    // No wall touched this run, so the other orientation would drive the same.
                    orientation = -1;
                }
                double first = battleField.wallSmoothing(me.location, raw, orientation, WALL_STICK);
                if (bending && Math.abs(Angles.normalRelativeAngle(first - bendFrom)) < BEND) continue;
                double turn = Double.isNaN(lastHeading) ? 0
                    : Math.abs(Angles.normalRelativeAngle(first - lastHeading));
                boolean better;
                if (score[0] > bestMin + TIE) better = true;
                else if (score[0] < bestMin - TIE) better = false;
                else if (score[1] > bestMean + TIE) better = true;
                else if (score[1] < bestMean - TIE) better = false;
                else better = turn < bestTurn;
                if (better) {
                    found = true;
                    // Keep the best closest approach, not the tied one, so ties cannot drift.
                    bestMin = Math.max(bestMin, score[0]);
                    bestMean = score[1];
                    bestTurn = turn;
                    bestHeading = first;
                    bestBits = bits;
                }
            }
        }
        if (!found && bending) return Double.NaN;
        if (model != null && !shots.isEmpty()) {
            choiceNote = played + "," + unhit + "," + bestBits + "," + Math.round(bestMin) + "," + shots.size()
                + "," + (long) shots.peekLast()[0] + "," + (bending ? 1 : 0);
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
            double px = us.location.x;
            double py = us.location.y;
            us = predictor.nextLocation(us, 8.0, go, false);
            // Pure pursuit: turn toward where we are now, at the engine's rate, then move.
            double want = Math.atan2(us.location.x - ex, us.location.y - ey);
            double maxTurn = Rules.getTurnRateRadians(ev);
            eh += DiaUtils.limit(-maxTurn, Angles.normalRelativeAngle(want - eh), maxTurn);
            ev = Math.min(8.0, ev + 1.0);
            ex = DiaUtils.limit(18.0, ex + Math.sin(eh) * ev, battleField.width - 18.0);
            ey = DiaUtils.limit(18.0, ey + Math.cos(eh) * ev, battleField.height - 18.0);
            if (dodge) hits |= hits(us.location.x, us.location.y, me.time + t + 1, px, py);
            if (t >= HORIZON) continue;
            double d = Point2D.distance(us.location.x, us.location.y, ex, ey);
            min = Math.min(min, d);
            if (min < floor) return null;
            sum += d;
        }
        lastPlayBits = hits;
        return new double[] {min - hitPenalty(hits), sum / HORIZON, bent};
    }

    /**
     * RAM-5: which of the shots in flight would hit us at {@code (x, y)} on {@code time}, two bits
     * a shot (head-on, linear and, with RAM-11, circular).
     */
    /**
     * RAM-20: whether a ray from {@code (ox, oy)} along the direction {@code (sin, cos)}, between {@code from} and
     * {@code to} px out, passes within {@link #LEARNED_BOX} px of {@code (x, y)} on both axes.
     */
    static boolean crosses(double ox, double oy, double sin, double cos, double from, double to, double x, double y) {
        double lo = Math.max(0, from);
        double hi = to;
        double dx = x - ox;
        double dy = y - oy;
        if (Math.abs(sin) < 1e-9) {
            if (Math.abs(dx) >= LEARNED_BOX) return false;
        } else {
            double a = (dx - LEARNED_BOX) / sin;
            double b = (dx + LEARNED_BOX) / sin;
            lo = Math.max(lo, Math.min(a, b));
            hi = Math.min(hi, Math.max(a, b));
        }
        if (Math.abs(cos) < 1e-9) {
            if (Math.abs(dy) >= LEARNED_BOX) return false;
        } else {
            double a = (dy - LEARNED_BOX) / cos;
            double b = (dy + LEARNED_BOX) / cos;
            lo = Math.max(lo, Math.min(a, b));
            hi = Math.min(hi, Math.max(a, b));
        }
        return lo <= hi;
    }

    /** The closest approach a path loses for the aims that hit it: RAM-5's cost an aim, RAM-20's by the ray's weight. */
    private double hitPenalty(int bits) {
        if (bits == 0) return 0;
        double cost = 0;
        int i = 0;
        for (double[] s : shots) {
            for (int a = 0; a < 3; a++) {
                if ((bits & (1 << (3 * i + a))) != 0) cost += s.length > 7 ? LEARNED_COST * s[7 + a] : hitCost;
            }
            i++;
        }
        return cost;
    }

    private int hits(double x, double y, long time, double px, double py) {
        int bits = 0;
        int i = 0;
        for (double[] s : shots) {
            double flown = (time - s[0]) * s[3];
            if (flown > 0 && s.length > 7) {
                // RAM-20: a learned ray is tested as the engine tests a bullet: the stretch it flies this tick against
                // where we stood before this tick's move.
                for (int a = 0; a < ShotModel.TOP; a++) {
                    if (Double.isNaN(s[4 + a])) continue;
                    for (int k = 0; k < 3; k++) {
                        if (crosses(s[1], s[2], s[RAY_BASE + 6 * a + 2 * k], s[RAY_BASE + 6 * a + 2 * k + 1],
                                flown - s[3], flown, px, py)) {
                            bits |= 1 << (3 * i + a);
                            break;
                        }
                    }
                }
            } else if (flown > 0) {
                for (int a = 0; a < 3; a++) {
                    if (Double.isNaN(s[4 + a])) continue;
                    // RAM-17: with a fan, the linear and circular aims are each three rays, the aim and +-FAN.
                    int rays = fan && a > 0 ? 1 : 0;
                    for (int k = -rays; k <= rays; k++) {
                        double angle = s[4 + a] + k * FAN;
                        double bx = s[1] + Math.sin(angle) * flown;
                        double by = s[2] + Math.cos(angle) * flown;
                        if (Math.abs(bx - x) < HIT_BOX && Math.abs(by - y) < HIT_BOX) bits |= 1 << (3 * i + a);
                    }
                }
            }
            i++;
        }
        return bits;
    }
}

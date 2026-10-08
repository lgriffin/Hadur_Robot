package hadur2.core.move;

import hadur2.core.model.BotOrders;
import hadur2.core.model.RobotState;
import hadur2.core.physics.Angles;
import hadur2.core.physics.BattleField;
import hadur2.core.physics.DiaUtils;
import hadur2.core.physics.MovementPredictor;
import hadur2.core.physics.Rules;

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
 * <p>RAM-4 (3.11): running straight away from a pursuer keeps our bearing from it still, so
 * its head-on and linear shots (a rammer fires at what is in front of it) hit 47% of the time
 * while we run (docs/bench/plan-3.11.md). So the closest approach only sets a bar: every
 * candidate whose closest approach is within {@link #SLACK} px of the best, while the best is
 * at least {@link #SAFE} + {@link #SLACK} px (otherwise RAM-2's order alone decides), and
 * whose distance at the horizon's end is within {@link #END_SLACK} px of the best (the chase
 * lasts longer than the horizon), is good enough, and among those the one that crosses the
 * rammer's line of fire fastest wins: the largest mean share of our travel across the line
 * from the rammer to
 * us. Ties go to the larger closest approach, then to the candidate closest to the last
 * choice.</p>
 *
 * <p>Deterministic and cheap: at most {@value #HEADINGS} x 2 candidates of
 * {@value #HORIZON} ticks each, run only while a rammer is charging. The second orientation
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
    /** RAM-4: how much closest approach, in px, a candidate may give up for crossing the line of fire. */
    static final double SLACK = 40.0;
    /** RAM-4: the closest approach, in px, no candidate may give up below: a rammer fires inside it. */
    static final double SAFE = 100.0;
    /** RAM-4: how much distance at the horizon's end, in px, a candidate may give up: the chase is long. */
    static final double END_SLACK = 15.0;
    /** RAM-4: mean crossing shares within this of each other count as equal. */
    private static final double CROSS_TIE = 0.02;

    private final BattleField battleField;
    private final MovementPredictor predictor;
    /** The heading chosen last tick, NaN when there is none. */
    private double lastHeading = Double.NaN;

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
        double heading = choose(me, enemy);
        orders.maxVelocity(8.0);
        DiaUtils.setBackAsFront(orders, me.heading, heading);
    }

    /**
     * The heading, wall-smoothed for this tick, that keeps the rammer furthest away.
     *
     * @param me our state this tick
     * @param enemy the rammer's state this tick
     * @return the absolute heading to drive, in radians
     */
    double choose(RobotState me, RobotState enemy) {
        int n = 0;
        double[][] scores = new double[2 * HEADINGS][];
        double[] firsts = new double[2 * HEADINGS];
        double bestMin = Double.NEGATIVE_INFINITY;
        double bestEnd = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < HEADINGS; i++) {
            double raw = 2 * Math.PI * i / HEADINGS;
            for (int orientation = 1; orientation >= -1; orientation -= 2) {
                double[] score = play(me, enemy, raw, orientation);
                scores[n] = score;
                firsts[n++] = battleField.wallSmoothing(me.location, raw, orientation, WALL_STICK);
                bestMin = Math.max(bestMin, score[0]);
                bestEnd = Math.max(bestEnd, score[4]);
                if (score[2] == 0 && orientation == 1) {
                    // No wall touched this run, so the other orientation would drive the same.
                    orientation = -1;
                }
            }
        }
        // RAM-4: with room to spare, good enough is near the best closest approach and outside
        // ram range; without it (a wall, a corner, a rammer already close) RAM-2 alone decides.
        boolean room = bestMin >= SAFE + SLACK;
        double bar = room ? bestMin - SLACK : bestMin - TIE;
        int best = -1;
        double bestTurn = Double.POSITIVE_INFINITY;
        for (int k = 0; k < n; k++) {
            double[] score = scores[k];
            if (score[0] < bar || (room && score[4] < bestEnd - END_SLACK)) continue;
            double turn = Double.isNaN(lastHeading) ? 0
                : Math.abs(Angles.normalRelativeAngle(firsts[k] - lastHeading));
            boolean better;
            if (best < 0) better = true;
            else if (!room) better = ramTwo(score, scores[best], turn, bestTurn);
            else if (score[3] > scores[best][3] + CROSS_TIE) better = true;
            else if (score[3] < scores[best][3] - CROSS_TIE) better = false;
            else if (score[0] > scores[best][0] + TIE) better = true;
            else if (score[0] < scores[best][0] - TIE) better = false;
            else better = turn < bestTurn;
            if (better) {
                best = k;
                bestTurn = turn;
            }
        }
        double heading = best < 0 ? DiaUtils.absoluteBearing(enemy.location, me.location) : firsts[best];
        lastHeading = heading;
        return heading;
    }

    /** RAM-2's order: the larger closest approach, then the larger mean distance, then the smaller turn. */
    private static boolean ramTwo(double[] score, double[] best, double turn, double bestTurn) {
        if (score[0] > best[0] + TIE) return true;
        if (score[0] < best[0] - TIE) return false;
        if (score[1] > best[1] + TIE) return true;
        if (score[1] < best[1] - TIE) return false;
        return turn < bestTurn;
    }

    /**
     * Plays one candidate forward.
     *
     * @return {closest approach in px, mean distance in px, 1 if a wall bent the heading else 0,
     *     the mean share of our travel across the line from the rammer to us (RAM-4), the distance
     *     at the horizon's end in px} over the horizon
     */
    private double[] play(RobotState me, RobotState enemy, double raw, int orientation) {
        RobotState us = me;
        double ex = enemy.location.x;
        double ey = enemy.location.y;
        // The direction of travel: a robot driving backward travels opposite its heading.
        double eh = enemy.velocity < 0 ? Angles.normalAbsoluteAngle(enemy.heading + Math.PI)
            : enemy.heading;
        double ev = Math.abs(enemy.velocity);
        double min = Double.POSITIVE_INFINITY;
        double sum = 0;
        double d = 0;
        double bent = 0;
        double cross = 0;
        for (int t = 0; t < HORIZON; t++) {
            double go = battleField.wallSmoothing(us.location, raw, orientation, WALL_STICK);
            if (go != raw) bent = 1;
            double fx = us.location.x;
            double fy = us.location.y;
            us = predictor.nextLocation(us, 8.0, go, false);
            // Our travel this tick across the line from the rammer: the part its aim must lead.
            double step = Point2D.distance(fx, fy, us.location.x, us.location.y);
            if (step > 1e-9) {
                double lineOfFire = Math.atan2(fx - ex, fy - ey);
                double travel = Math.atan2(us.location.x - fx, us.location.y - fy);
                cross += Math.abs(Math.sin(travel - lineOfFire));
            }
            // Pure pursuit: turn toward where we are now, at the engine's rate, then move.
            double want = Math.atan2(us.location.x - ex, us.location.y - ey);
            double maxTurn = Rules.getTurnRateRadians(ev);
            eh += DiaUtils.limit(-maxTurn, Angles.normalRelativeAngle(want - eh), maxTurn);
            ev = Math.min(8.0, ev + 1.0);
            ex = DiaUtils.limit(18.0, ex + Math.sin(eh) * ev, battleField.width - 18.0);
            ey = DiaUtils.limit(18.0, ey + Math.cos(eh) * ev, battleField.height - 18.0);
            d = Point2D.distance(us.location.x, us.location.y, ex, ey);
            min = Math.min(min, d);
            sum += d;
        }
        return new double[] {min, sum / HORIZON, bent, cross / HORIZON, d};
    }
}

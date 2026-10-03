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
        double eh = enemy.heading;
        double ev = Math.abs(enemy.velocity);
        double min = Double.POSITIVE_INFINITY;
        double sum = 0;
        double bent = 0;
        for (int t = 0; t < HORIZON; t++) {
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
            double d = Point2D.distance(us.location.x, us.location.y, ex, ey);
            min = Math.min(min, d);
            if (min < floor) return null;
            sum += d;
        }
        return new double[] {min, sum / HORIZON, bent};
    }
}

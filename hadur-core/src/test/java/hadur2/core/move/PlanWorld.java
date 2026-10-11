package hadur2.core.move;

import hadur2.core.model.BotOrders;
import hadur2.core.model.RobotState;
import hadur2.core.model.RobotStateLog;
import hadur2.core.model.Wave;
import hadur2.core.physics.DiaUtils;
import java.awt.geom.Point2D;
import java.util.List;

/**
 * Test support for the MOVE-8 Cucumber steps (package {@code hadur2.core.steps}): a public
 * door onto the surf, with one enemy wave in the air (or none), and what movement publishes.
 */
public final class PlanWorld {

    private final Point2D.Double source = new Point2D.Double(400, 450);
    private final Point2D.Double me = new Point2D.Double(400, 100);
    private final MoveController moves = PlanPublishTest.moveController();
    private final SurfMover surf = new SurfMover(PlanPublishTest.FIELD, PlanPublishTest.PREDICTOR);
    private Wave wave;

    /** An enemy firing wave, fired on tick 30 from 350 px away, in the air on tick 40. */
    public void waveInTheAir() {
        wave = PlanPublishTest.firingWave(source, me);
        moves.addWave(wave);
    }

    private RobotState now() {
        return PlanPublishTest.at(me, 40);
    }

    /** The surf drives one tick, as the duel does, and publishes its plan. */
    public void surfDrives() {
        surf.move(BotOrders.builder(), now(), moves, source, 2);
    }

    /** What the surf plans for a stop in place, for the arrival-position check. */
    public void surfPlansAStop() {
        RobotState s = now();
        surf.checkDanger(s, moves, s, SurfMover.SurfOption.STOP, true, 0, 1, Double.POSITIVE_INFINITY,
            new RobotStateLog());
    }

    /** How many intervals movement publishes through the controller. */
    public int published() {
        return moves.planIntervals().size();
    }

    /** Whether the first published interval is on the wave in the air. */
    public boolean publishedOnTheWave() {
        List<PlanInterval> plan = moves.planIntervals();
        return !plan.isEmpty() && plan.get(0).wave == wave;
    }

    /** Whether the stop's interval holds the bearing from the wave's source to where we stand. */
    public boolean stopIntervalHoldsOurPosition() {
        List<PlanInterval> plan = surf.lastPlan();
        return plan.size() == 1 && plan.get(0).contains(DiaUtils.absoluteBearing(source, me));
    }
}

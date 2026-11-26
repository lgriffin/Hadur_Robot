package hadur117.core.move;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur117.core.model.RobotState;
import hadur117.core.model.RobotStateLog;
import hadur117.core.model.Wave;
import hadur117.core.physics.Angles;
import hadur117.core.physics.DiaUtils;
import java.awt.geom.Point2D;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** MOVE-73: the half-speed orbits in the two-wave surf. */
class HalfSurfTest {

    @Test
    @Tag("MOVE-73")
    @DisplayName("a half-speed orbit is driven only when it is cheaper than the option taken, the cheaper side first")
    void halfPick() {
        assertEquals(-1, SurfMover.halfPick(new double[] {2, 3}, 1), "the option taken is cheaper");
        assertEquals(-1, SurfMover.halfPick(new double[] {1, 1}, 1), "a tie keeps the option taken");
        assertEquals(0, SurfMover.halfPick(new double[] {0.5, 0.7}, 1));
        assertEquals(1, SurfMover.halfPick(new double[] {0.7, 0.5}, 1));
        assertEquals(0, SurfMover.halfPick(new double[] {0.5, 0.5}, 1), "counter-clockwise on a tie");
    }

    @Test
    @Tag("MOVE-73")
    @DisplayName("the switch is off by default and set per opponent")
    void offByDefault() {
        SurfMover m = new SurfMover(PlanPublishTest.FIELD, PlanPublishTest.PREDICTOR);
        assertFalse(m.halfSpeed());
        m.setHalfSpeed(true);
        assertTrue(m.halfSpeed());
        m.setHalfSpeed(false);
        assertFalse(m.halfSpeed());
    }

    @Test
    @Tag("MOVE-73")
    @DisplayName("a half-speed orbit meets the wave between where the stop and the full-speed orbit do")
    void halfLandsBetween() {
        Point2D.Double source = new Point2D.Double(400, 450);
        Point2D.Double me = new Point2D.Double(400, 100);
        MoveController m = PlanPublishTest.moveController();
        m.addWave(PlanPublishTest.firingWave(source, me));
        SurfMover surf = new SurfMover(PlanPublishTest.FIELD, PlanPublishTest.PREDICTOR);
        RobotState now = PlanPublishTest.at(me, 40);
        double still = DiaUtils.absoluteBearing(source, me);
        double full = centre(surf, m, now, 8.0);
        double half = centre(surf, m, now, SurfMover.HALF_SPEED);
        double fullOff = Math.abs(Angles.normalRelativeAngle(full - still));
        double halfOff = Math.abs(Angles.normalRelativeAngle(half - still));
        assertTrue(halfOff > 0.01, "the half orbit moves: " + halfOff);
        assertTrue(halfOff < fullOff, "half " + halfOff + " is short of full " + fullOff);
    }

    @Test
    @Tag("MOVE-73")
    @DisplayName("on, the look-ahead's next wave rates the half-speed orbits too, so a leg's total is never higher")
    void lookAheadTakesTheCheaper() {
        Point2D.Double me = new Point2D.Double(400, 100);
        MoveController m = PlanPublishTest.moveController();
        m.addWave(PlanPublishTest.firingWave(new Point2D.Double(400, 450), me));
        Wave second = PlanPublishTest.firingWave(new Point2D.Double(420, 450), me);
        m.addWave(second);
        RobotState now = PlanPublishTest.at(me, 40);
        SurfMover off = new SurfMover(PlanPublishTest.FIELD, PlanPublishTest.PREDICTOR);
        SurfMover on = new SurfMover(PlanPublishTest.FIELD, PlanPublishTest.PREDICTOR);
        on.setHalfSpeed(true);
        double a = off.checkDanger(now, m, now, SurfMover.SurfOption.CLOCKWISE, true, 0, 2,
            Double.POSITIVE_INFINITY, new RobotStateLog());
        double b = on.checkDanger(now, m, now, SurfMover.SurfOption.CLOCKWISE, true, 0, 2,
            Double.POSITIVE_INFINITY, new RobotStateLog());
        assertTrue(b <= a, b + " <= " + a);
        assertEquals(2, on.lastPlan().size(), "the plan still holds both waves");
    }

    private static double centre(SurfMover surf, MoveController m, RobotState now, double speed) {
        surf.checkDanger(now, m, now, SurfMover.SurfOption.CLOCKWISE, true, 0, 1, Double.POSITIVE_INFINITY,
            new RobotStateLog(), speed);
        List<PlanInterval> plan = surf.lastPlan();
        assertEquals(1, plan.size());
        PlanInterval p = plan.get(0);
        return p.low + Angles.normalRelativeAngle(p.high - p.low) / 2;
    }
}

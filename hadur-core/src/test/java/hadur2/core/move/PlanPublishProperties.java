package hadur2.core.move;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur2.core.model.RobotState;
import hadur2.core.model.RobotStateLog;
import hadur2.core.model.Wave;
import hadur2.core.physics.DiaUtils;
import java.awt.geom.Point2D;
import java.util.List;
import net.jqwik.api.ForAll;
import net.jqwik.api.Property;
import net.jqwik.api.Tag;
import net.jqwik.api.constraints.DoubleRange;

/** MOVE-8 for any wave source, any place we stand and any time the wave is in the air. */
class PlanPublishProperties {

    @Property(tries = 60)
    @Tag("MOVE-8")
    void aStopsPlanIntervalAlwaysHoldsTheArrivalPosition(
            @ForAll @DoubleRange(min = 150, max = 650) double meX,
            @ForAll @DoubleRange(min = 150, max = 450) double meY,
            @ForAll @DoubleRange(min = 0, max = 6.28) double fromAngle,
            @ForAll @DoubleRange(min = 250, max = 600) double distance,
            @ForAll @DoubleRange(min = 0.1, max = 0.6) double progress) {
        Point2D.Double me = new Point2D.Double(meX, meY);
        Point2D.Double source = DiaUtils.project(me, fromAngle, distance);
        if (!PlanPublishTest.FIELD.rectangle.contains(source)) return;
        Wave w = PlanPublishTest.firingWave(source, me);
        MoveController m = new MoveController(PlanPublishTest.FIELD, PlanPublishTest.PREDICTOR);
        m.addWave(w);
        // The wave has covered `progress` of the way to us, so it is in the air and surfable.
        long now = 30 + Math.round(progress * distance / w.bulletSpeed());
        RobotState state = RobotState.newBuilder().setLocation(me).setTime(now).build();
        SurfMover surf = new SurfMover(PlanPublishTest.FIELD, PlanPublishTest.PREDICTOR);
        surf.checkDanger(state, m, state, SurfMover.SurfOption.STOP, true, 0, 1, Double.POSITIVE_INFINITY,
            new RobotStateLog());
        List<PlanInterval> plan = surf.lastPlan();
        assertEquals(1, plan.size());
        PlanInterval p = plan.get(0);
        assertTrue(p.low <= p.high);
        assertTrue(p.contains(DiaUtils.absoluteBearing(source, me)),
            "bearing " + DiaUtils.absoluteBearing(source, me) + " in " + p.low + ".." + p.high);
        assertTrue(p.danger >= 0 && p.danger <= 1);
    }

    @Property
    @Tag("MOVE-8")
    void anIntervalHoldsItsCentreAndIsNeverInverted(
            @ForAll @DoubleRange(min = -7, max = 7) double centre,
            @ForAll @DoubleRange(min = 0, max = 1) double halfWidth,
            @ForAll @DoubleRange(min = -1, max = 2) double danger) {
        Wave w = PlanPublishTest.firingWave(new Point2D.Double(400, 450), new Point2D.Double(400, 100));
        PlanInterval p = PlanInterval.of(w, new Wave.Intersection(centre, halfWidth), danger);
        assertTrue(p.low <= p.high);
        assertTrue(p.contains(centre));
        assertEquals(2 * halfWidth, p.width(), 1e-9);
        assertTrue(p.danger >= 0 && p.danger <= 1);
    }
}

package hadur2.core.move;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur2.core.model.RobotState;
import hadur2.core.model.RobotStateLog;
import hadur2.core.model.Wave;
import hadur2.core.physics.BattleField;
import hadur2.core.physics.DiaUtils;
import hadur2.core.physics.MovementPredictor;
import java.awt.geom.Point2D;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** MOVE-8: movement publishes the interval its plan occupies on each enemy wave in the air. */
class PlanPublishTest {

    static final BattleField FIELD = new BattleField(800, 600);
    static final MovementPredictor PREDICTOR = new MovementPredictor(FIELD);

    /** A firing wave of power 1.95 from {@code source} at tick 30, aimed at {@code me}. */
    static Wave firingWave(Point2D.Double source, Point2D.Double me) {
        Wave w = new Wave("abc.Shadow 3.83c", source, me, 0, 30, 1.95, 3 * Math.PI / 2, 8, 1, FIELD, PREDICTOR);
        w.setAccel(0).setDistance(me.distance(source)).setVchangeTime(10).setTargetEnergy(100)
            .setSourceEnergy(100).setGunHeat(0).setEnemiesAlive(1).setLastBulletFiredTime(0);
        w.setWallDistances();
        w.firingWave = true;
        return w;
    }

    static MoveController moveController() {
        return new MoveController(FIELD, PREDICTOR);
    }

    static RobotState at(Point2D.Double p, long time) {
        return RobotState.newBuilder().setLocation(p).setTime(time).build();
    }

    @Test
    @Tag("MOVE-8")
    @DisplayName("an interval is the intersection's range, and holds its centre and both ends")
    void intervalIsTheIntersectionsRange() {
        Wave w = firingWave(new Point2D.Double(400, 450), new Point2D.Double(400, 100));
        PlanInterval p = PlanInterval.of(w, new Wave.Intersection(3.0, 0.05), 0.2);
        assertEquals(2.95, p.low, 1e-12);
        assertEquals(3.05, p.high, 1e-12);
        assertEquals(0.1, p.width(), 1e-12);
        assertTrue(p.contains(3.0) && p.contains(2.95) && p.contains(3.05));
        assertTrue(!p.contains(3.2));
        // Across the seam: an angle a whole turn away is the same bearing.
        assertTrue(p.contains(3.0 - 2 * Math.PI));
    }

    @Test
    @Tag("MOVE-8")
    @DisplayName("the chance a published interval carries is cut to [0, 1]")
    void dangerIsCut() {
        Wave w = firingWave(new Point2D.Double(400, 450), new Point2D.Double(400, 100));
        assertEquals(1.0, new PlanInterval(w, 0, 1, 3.7).danger, 0);
        assertEquals(0.0, new PlanInterval(w, 0, 1, -2).danger, 0);
        assertEquals(0.0, new PlanInterval(w, 0, 1, Double.NaN).danger, 0);
    }

    @Test
    @Tag("MOVE-8")
    @DisplayName("a stop's plan interval holds the bearing from the wave's source to where we stand")
    void stopPlanHoldsOurPosition() {
        MoveController m = new MoveController(FIELD, PREDICTOR);
        Point2D.Double source = new Point2D.Double(400, 450);
        Point2D.Double me = new Point2D.Double(400, 100);
        Wave w = firingWave(source, me);
        m.addWave(w);
        SurfMover surf = new SurfMover(FIELD, PREDICTOR);
        RobotState now = at(me, 40);
        surf.checkDanger(now, m, now, SurfMover.SurfOption.STOP, true, 0, 1, Double.POSITIVE_INFINITY,
            new RobotStateLog());
        List<PlanInterval> plan = surf.lastPlan();
        assertEquals(1, plan.size());
        assertEquals(w, plan.get(0).wave);
        assertTrue(plan.get(0).contains(DiaUtils.absoluteBearing(source, me)),
            "the arrival position's bearing is inside " + plan.get(0).low + ".." + plan.get(0).high);
        assertTrue(plan.get(0).width() > 0);
    }

    @Test
    @Tag("MOVE-8")
    @DisplayName("looking two waves ahead, the plan holds one interval per wave, nearest first")
    void twoWavesTwoIntervals() {
        MoveController m = new MoveController(FIELD, PREDICTOR);
        Point2D.Double me = new Point2D.Double(400, 100);
        Wave first = firingWave(new Point2D.Double(400, 450), me);
        Wave second = new Wave("abc.Shadow 3.83c", new Point2D.Double(420, 450), me, 0, 38, 1.95,
            3 * Math.PI / 2, 8, 1, FIELD, PREDICTOR);
        second.setAccel(0).setDistance(350).setVchangeTime(10).setTargetEnergy(100)
            .setSourceEnergy(100).setGunHeat(0).setEnemiesAlive(1).setLastBulletFiredTime(0);
        second.setWallDistances();
        second.firingWave = true;
        m.addWave(first);
        m.addWave(second);
        SurfMover surf = new SurfMover(FIELD, PREDICTOR);
        RobotState now = at(me, 40);
        surf.checkDanger(now, m, now, SurfMover.SurfOption.STOP, true, 0, 2, Double.POSITIVE_INFINITY,
            new RobotStateLog());
        List<PlanInterval> plan = surf.lastPlan();
        assertEquals(2, plan.size());
        assertEquals(first, plan.get(0).wave);
        assertEquals(second, plan.get(1).wave);
    }

    @Test
    @Tag("MOVE-8")
    @DisplayName("with no wave in the air nothing is published, and a published plan can be withdrawn")
    void nothingWithoutWaves() {
        MoveController m = new MoveController(FIELD, PREDICTOR);
        assertTrue(m.planIntervals().isEmpty());
        Wave w = firingWave(new Point2D.Double(400, 450), new Point2D.Double(400, 100));
        m.publishPlan(List.of(new PlanInterval(w, 1, 2, 0.1)));
        assertEquals(1, m.planIntervals().size());
        m.clearPlan();
        assertTrue(m.planIntervals().isEmpty());
        m.publishPlan(List.of(new PlanInterval(w, 1, 2, 0.1)));
        m.initRound();
        assertTrue(m.planIntervals().isEmpty(), "a new round starts with no plan");
    }

    @Test
    @Tag("MOVE-8")
    @DisplayName("the published list is read-only")
    void publishedListIsReadOnly() {
        MoveController m = new MoveController(FIELD, PREDICTOR);
        Wave w = firingWave(new Point2D.Double(400, 450), new Point2D.Double(400, 100));
        m.publishPlan(List.of(new PlanInterval(w, 1, 2, 0.1)));
        try {
            m.planIntervals().clear();
            throw new AssertionError("the published plan must not be modifiable");
        } catch (UnsupportedOperationException expected) {
            // read-only, as MOVE-8 says
        }
    }
}

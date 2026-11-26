package hadur117.sepia;

import static hadur117.sepia.Fixtures.p;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class InkPlannerTest {

    static final Point2D.Double SOURCE = p(400, 500);
    static final Point2D.Double STOOD = p(400, 100);
    final InkPlanner planner = new InkPlanner(Fixtures.W, Fixtures.H);
    final AimBelief belief = new AimBelief();

    @Test
    @Tag("INK-2")
    @DisplayName("an ink shot is power 0.1")
    void inkIsWeakest() {
        assertEquals(0.1, InkPlanner.INK_POWER, 0.0);
    }

    @Test
    @Tag("INK-1")
    @DisplayName("a shot from the spot being left shades a landing 120 px aside far more than one from the landing")
    void sidestepShades() {
        InkWave w = Fixtures.land(Fixtures.wave(SOURCE, STOOD, 0, 2.0), p(520, 100));
        InkPlanner.Shot left = planner.best(List.of(w), 2, STOOD, 0, Math.PI, belief);
        InkPlanner.Shot there = planner.best(List.of(w), 2, p(520, 100), 0, Math.PI, belief);
        assertNotNull(left);
        assertTrue(left.gains[0] > 0.3, "one ink from the old spot shades " + left.gains[0]);
        double headOn = there == null ? 0 : there.gains[0];
        assertTrue(headOn < 0.15, "one ink from the landing itself shades " + headOn);
        assertTrue(left.stopped > 0 && left.worth > left.stopped, "worth weighs damage and energy return");
    }

    @Test
    @Tag("INK-1")
    @DisplayName("the gun's reach limits the aims: none within reach, no shot")
    void gunReach() {
        InkWave w = Fixtures.land(Fixtures.wave(SOURCE, STOOD, 0, 2.0), p(520, 100));
        double away = Math.PI;  // the gun points south, the aims are north-east
        assertNull(planner.best(List.of(w), 2, STOOD, away, Math.toRadians(20), belief));
    }

    @Test
    @Tag("INK-3")
    @DisplayName("candidates come from solved crossings, at most 64 a shot")
    void boundedCandidates() {
        List<InkWave> many = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            many.add(Fixtures.land(Fixtures.wave(SOURCE, STOOD, i, 2.0), p(300 + 10 * i, 100)));
        }
        List<Double> c = planner.candidates(many, 31, STOOD);
        assertEquals(InkPlanner.MAX_CANDIDATES, c.size());
        InkWave one = Fixtures.land(Fixtures.wave(SOURCE, STOOD, 0, 2.0), p(520, 100));
        assertTrue(planner.candidates(List.of(one), 2, STOOD).size() <= 6);
    }

    @Test
    @Tag("INK-5")
    @DisplayName("no shade is credited once the wave can meet the body")
    void tooLateCountsNothing() {
        InkWave w = Fixtures.land(Fixtures.wave(SOURCE, STOOD, 0, 2.0), p(520, 100));
        w.commit(w.lo, w.hi, w.landingDistance, 3, w.passed, Gait.CARRY);
        assertNull(planner.best(List.of(w), 2, STOOD, 0, Math.PI, belief));
    }
}

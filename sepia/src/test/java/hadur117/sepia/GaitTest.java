package hadur117.sepia;

import static hadur117.sepia.Fixtures.p;
import static hadur117.sepia.Fixtures.state;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur117.core.model.RobotState;
import hadur117.core.model.Wave;
import hadur117.core.physics.BattleField;
import hadur117.core.physics.MovementPredictor;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class GaitTest {

    static final Point2D.Double ENEMY = p(400, 540);

    /** Rates each option by a fixed table. */
    static Gait.Rater table(Map<Gait.Option, Double> t) {
        return (w, f) -> t.getOrDefault(f.option, 9.0);
    }

    static RobotState start() {
        return state(400, 120, Math.PI / 2, 8, 10);
    }

    static InkWave shot() {
        return Fixtures.wave(ENEMY, p(392, 120), 9, 2.0);
    }

    @Test
    @Tag("JET-1")
    @DisplayName("the jet cycle chooses among carry on, turn back and hold; the ink surf adds half speed")
    void options() {
        assertEquals(List.of(Gait.CARRY, Gait.BACK, Gait.HOLD), new Gait(Gait.Kind.JET, 800, 600).options());
        assertEquals(5, new Gait(Gait.Kind.SURF, 800, 600).options().size());
    }

    @Test
    @Tag("JET-1")
    @Tag("SURF-2")
    @DisplayName("a shot read fixes a landing, and the drive then lands exactly there")
    void commitsAndHolds() {
        for (Gait.Kind kind : Gait.Kind.values()) {
            Gait g = new Gait(kind, 800, 600);
            InkWave w = shot();
            g.shotRead(w, start(), ENEMY, table(Map.of(Gait.BACK, 1.0)));
            assertTrue(w.committed());
            assertSame(Gait.BACK, w.option());
            // Drive tick by tick as the robot would, and read the hit set the wave really meets.
            MovementPredictor mp = new MovementPredictor(new BattleField(800, 600));
            RobotState s = start();
            List<RobotState> crossing = new ArrayList<>();
            for (int k = 0; k < 120; k++) {
                double d = s.location.distance(ENEMY);
                if (w.wave.distanceTraveled(s.time + 1) >= d - 26 && w.wave.distanceTraveled(s.time) <= d + 26) crossing.add(s);
                if (w.pastBody(s.time, d)) break;
                assertSame(Gait.BACK, g.current(s.time), "the path holds its option until the wave passes");
                double[] drive = g.drive(s, ENEMY);
                s = mp.nextLocation(s, drive[1], drive[0], false);
            }
            Wave.Intersection hit = w.wave.preciseIntersection(crossing);
            assertEquals(w.lo(), hit.angle - hit.bandwidth, 1e-9, kind + " low edge");
            assertEquals(w.hi(), hit.angle + hit.bandwidth, 1e-9, kind + " high edge");
        }
    }

    @Test
    @Tag("JET-2")
    @Tag("JET-3")
    @Tag("SURF-4")
    @DisplayName("the least exposed option is fixed")
    void leastExposed() {
        Gait g = new Gait(Gait.Kind.JET, 800, 600);
        InkWave w = shot();
        g.shotRead(w, start(), ENEMY, table(Map.of(Gait.CARRY, 3.0, Gait.BACK, 2.0, Gait.HOLD, 1.0)));
        assertSame(Gait.HOLD, w.option());
        Gait s = new Gait(Gait.Kind.SURF, 800, 600);
        InkWave v = shot();
        s.shotRead(v, start(), ENEMY, table(Map.of(Gait.CARRY, 3.0, Gait.BACK, 2.0, Gait.HOLD, 1.0, Gait.HALF_BACK, 0.5)));
        assertSame(Gait.HALF_BACK, v.option());
    }

    @Test
    @Tag("JET-5")
    @DisplayName("below 450 px the path turns away; beyond it, it orbits and does not close")
    void holdsRange() {
        Gait g = new Gait(Gait.Kind.JET, 2000, 2000);
        Point2D.Double c = p(1000, 1000);
        RobotState near = state(1000, 700, Math.PI / 2, 8, 0);
        RobotState far = state(1000, 480, Math.PI / 2, 8, 0);
        for (int k = 0; k < 15; k++) {
            near = g.step(near, c, 1, 8);
            far = g.step(far, c, 1, 8);
        }
        assertTrue(near.location.distance(c) > 320, "retreated to " + near.location.distance(c));
        assertTrue(far.location.distance(c) >= 520 - 1e-6, "closed to " + far.location.distance(c));
    }

    @Test
    @Tag("JET-6")
    @DisplayName("a committed path into the enemy is chosen again; a clear one is kept")
    void rescue() {
        Gait g = new Gait(Gait.Kind.JET, 800, 600);
        InkWave w = shot();
        Gait.Rater r = table(Map.of(Gait.CARRY, 1.0));
        g.shotRead(w, start(), ENEMY, r);
        assertFalse(g.rescue(start(), ENEMY, r));
        Point2D.Double inTheWay = g.ahead(start(), ENEMY, 6).location;
        assertTrue(g.rescue(start(), inTheWay, r));
    }

    @Test
    @Tag("SURF-3")
    @DisplayName("the ink surf lets a fixed landing go only for one under half as exposed")
    void letGo() {
        for (double alt : new double[] {0.4, 0.6}) {
            Gait g = new Gait(Gait.Kind.SURF, 800, 600);
            InkWave first = shot();
            g.shotRead(first, start(), ENEMY, table(Map.of(Gait.CARRY, 0.1)));
            assertSame(Gait.CARRY, first.option());
            RobotState later = state(408, 120, Math.PI / 2, 8, 11);
            InkWave second = Fixtures.wave(ENEMY, p(400, 120), 10, 2.0);
            g.shotRead(second, later, ENEMY, table(Map.of(Gait.CARRY, 1.0, Gait.BACK, alt)));
            assertSame(alt < Gait.LET_GO ? Gait.BACK : Gait.CARRY, first.option(), "alternative at " + alt);
        }
    }
}

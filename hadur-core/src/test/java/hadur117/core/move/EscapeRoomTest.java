package hadur117.core.move;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur117.core.model.RobotState;
import hadur117.core.model.RobotStateLog;
import hadur117.core.model.Wave;
import hadur117.core.physics.BattleField;
import java.awt.geom.Point2D;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** MOVE-12: the escape-angle position term. */
class EscapeRoomTest {
    static final BattleField F = new BattleField(800, 600);
    static final double V = 14.0;

    static Point2D.Double p(double x, double y) {
        return new Point2D.Double(x, y);
    }

    @Test
    @Tag("MOVE-12")
    @DisplayName("open field: the restriction is 1 and the angles are asin(8/v)")
    void openField() {
        double open = Math.asin(8.0 / V);
        double[] a = EscapeRoom.inFieldAngles(p(400, 300), p(400, 400), V, F);
        assertEquals(open, a[0], 1e-9);
        assertEquals(open, a[1], 1e-9);
        assertEquals(1.0, EscapeRoom.restriction(p(400, 300), p(400, 400), V, F), 1e-9);
    }

    @Test
    @Tag("MOVE-12")
    @DisplayName("a wall on the escape side takes that side's room, and only that side's")
    void nearWall() {
        // Fired from the west along the south wall's row: the target at y=40 has the wall below.
        Point2D.Double src = p(100, 40);
        Point2D.Double tgt = p(500, 40);
        double[] a = EscapeRoom.inFieldAngles(src, tgt, V, F);
        double open = Math.asin(8.0 / V);
        assertTrue(EscapeRoom.restriction(src, tgt, V, F) < 0.75);
        // Bearing is east (90deg); positive offsets are clockwise = south. South is walled.
        assertTrue(a[1] < 0.2 * open, "south side: " + a[1]);
        assertEquals(open, a[0], 1e-9, "north side stays open");
    }

    @Test
    @Tag("MOVE-12")
    @DisplayName("mirror and rotation symmetry: the same layout flipped gives the same room")
    void symmetric() {
        double r1 = EscapeRoom.restriction(p(100, 40), p(500, 40), V, F);
        double r2 = EscapeRoom.restriction(p(700, 40), p(300, 40), V, F);       // flipped east-west
        double r3 = EscapeRoom.restriction(p(100, 560), p(500, 560), V, F);     // flipped north-south
        assertEquals(r1, r2, 1e-9);
        assertEquals(r1, r3, 1e-9);
        double[] a = EscapeRoom.inFieldAngles(p(100, 40), p(500, 40), V, F);
        double[] b = EscapeRoom.inFieldAngles(p(100, 560), p(500, 560), V, F);
        assertEquals(a[0], b[1], 1e-9);
        assertEquals(a[1], b[0], 1e-9);
    }

    @Test
    @Tag("MOVE-12")
    @DisplayName("a corner target is restricted and always inside (0, 1]")
    void corner() {
        double r = EscapeRoom.restriction(p(400, 300), p(30, 30), V, F);
        assertTrue(r > 0 && r < 0.8, "r=" + r);
        for (double x = 20; x <= 780; x += 40) {
            for (double y = 20; y <= 580; y += 40) {
                double q = EscapeRoom.restriction(p(400, 300), p(x, y), V, F);
                assertTrue(q > 0 && q <= 1.0, x + "," + y + " -> " + q);
            }
        }
    }

    @Test
    @Tag("MOVE-12")
    @DisplayName("the multiplier is cheaper for the end that keeps our room and costs the enemy his")
    void multiplierPrefersOurRoom() {
        Point2D.Double enemy = p(400, 300);
        double centre = EscapeRoom.multiplier(p(400, 100), enemy, V, F);
        double corner = EscapeRoom.multiplier(p(30, 30), enemy, V, F);
        // In the corner we have little room to escape his bullets: dearer.
        assertTrue(corner > centre, corner + " vs " + centre);
        // Enemy cornered, us in the open: cheap.
        double enemyCornered = EscapeRoom.multiplier(p(400, 300), p(30, 30), V, F);
        assertTrue(enemyCornered < 1.0, "" + enemyCornered);
        // Open field both ways: 1.
        assertEquals(1.0, EscapeRoom.multiplier(p(400, 250), p(400, 350), V, F), 1e-9);
    }

    private static Wave wave(Point2D.Double source, Point2D.Double me) {
        return PlanPublishTest.firingWave(source, me);
    }

    private double stopDanger(boolean on, Point2D.Double source, Point2D.Double me, Wave[] w) {
        MoveController m = new MoveController(PlanPublishTest.FIELD, PlanPublishTest.PREDICTOR);
        w[0] = wave(source, me);
        m.addWave(w[0]);
        SurfMover surf = new SurfMover(PlanPublishTest.FIELD, PlanPublishTest.PREDICTOR);
        surf.setEscapeRoomTerm(on);
        RobotState now = PlanPublishTest.at(me, 40);
        return surf.checkDanger(now, m, now, SurfMover.SurfOption.STOP, true, 0, 1,
            Double.POSITIVE_INFINITY, new RobotStateLog());
    }

    @Test
    @Tag("MOVE-12")
    @DisplayName("off: the scores are identical to the default; on: the first wave's danger carries the term")
    void switchScalesTheScore() {
        Point2D.Double source = p(400, 450);
        Point2D.Double me = p(60, 40);
        Wave[] w = new Wave[1];
        double base = stopDanger(false, source, me, w);
        double dflt;
        {
            MoveController m = new MoveController(PlanPublishTest.FIELD, PlanPublishTest.PREDICTOR);
            m.addWave(wave(source, me));
            SurfMover surf = new SurfMover(PlanPublishTest.FIELD, PlanPublishTest.PREDICTOR);
            RobotState now = PlanPublishTest.at(me, 40);
            dflt = surf.checkDanger(now, m, now, SurfMover.SurfOption.STOP, true, 0, 1,
                Double.POSITIVE_INFINITY, new RobotStateLog());
        }
        assertEquals(dflt, base, 0.0);
        double on = stopDanger(true, source, me, w);
        double term = EscapeRoom.multiplier(me, source, w[0].bulletSpeed(), PlanPublishTest.FIELD);
        assertTrue(base > 0, "the test needs a wave with some danger");
        assertEquals(base * term, on, 1e-9 * Math.max(1, on));
        assertTrue(term != 1.0);
    }
}

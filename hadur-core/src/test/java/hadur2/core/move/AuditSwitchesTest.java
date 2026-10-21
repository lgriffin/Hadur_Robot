package hadur2.core.move;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur2.core.model.Wave;
import hadur2.core.physics.BattleField;
import hadur2.core.physics.MovementPredictor;
import java.awt.geom.Point2D;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** MOVE-18 and MOVE-21: where the distancing factor is measured to, and the point kernel. */
class AuditSwitchesTest {

    private static final BattleField FIELD = new BattleField(800, 600);

    @Test
    @Tag("MOVE-18")
    @DisplayName("dfac off measures to the wave's source; on, to the enemy's last position")
    void distancingPoint() {
        Wave w = new Wave("enemy", new Point2D.Double(400, 500), new Point2D.Double(400, 200), 0, 0, 2,
            0, 0, 1, FIELD, new MovementPredictor(FIELD));
        Point2D.Double enemy = new Point2D.Double(100, 450);
        SurfMover off = new SurfMover(FIELD, new MovementPredictor(FIELD));
        off.noteEnemyAt(enemy);
        assertSame(w.sourceLocation, off.distancingPoint(w));
        SurfMover on = new SurfMover(FIELD, new MovementPredictor(FIELD));
        on.setDistancingToEnemy(true);
        assertSame(w.sourceLocation, on.distancingPoint(w), "no enemy position yet: the source");
        on.noteEnemyAt(enemy);
        assertSame(enemy, on.distancingPoint(w));
    }

    @Test
    @Tag("MOVE-21")
    @DisplayName("point kernel is 2^-|u| at the centre; the integral spreads over the intersection")
    void pointKernel() {
        List<double[]> seg = List.of(new double[] {-0.1, 0.1, 1});
        assertEquals(1.0, MoveController.pointKernelValue(0, 0.1, seg), 1e-12);
        assertEquals(0.5, MoveController.pointKernelValue(0.1, 0.1, seg), 1e-12);
        assertEquals(0.25, MoveController.pointKernelValue(0.2, 0.1, seg), 1e-12);
        // The integrated kernel gives 0.75 at the intersection's edge (MOVE-4); the point kernel 0.5.
        assertTrue(MoveController.kernelMass(0.1, 0.1, seg) > MoveController.pointKernelValue(0.1, 0.1, seg));
    }

    @Test
    @Tag("MOVE-21")
    @DisplayName("point kernel is scaled by the share the shadows let through")
    void pointKernelShadowed() {
        List<double[]> seg = List.of(new double[] {-0.1, 0.0, 0}, new double[] {0.0, 0.1, 1});
        assertEquals(0.5, MoveController.pointKernelValue(0, 0.1, seg), 1e-12);
    }

    @Test
    @Tag("MOVE-21")
    @DisplayName("the instance kernel follows the switch")
    void switchSelects() {
        MoveController m = new MoveController(FIELD, new MovementPredictor(FIELD));
        List<double[]> seg = List.of(new double[] {-0.1, 0.1, 1});
        assertEquals(MoveController.kernelMass(0.1, 0.1, seg), m.kernel(0.1, 0.1, seg), 1e-12);
        m.setPointKernel(true);
        assertEquals(0.5, m.kernel(0.1, 0.1, seg), 1e-12);
    }
}

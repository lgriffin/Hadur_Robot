package hadur2.core.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur2.core.knn.DistanceFormula;
import hadur2.core.knn.KdTree;
import hadur2.core.knn.KnnView;
import hadur2.core.physics.BattleField;
import hadur2.core.physics.MovementPredictor;
import java.awt.geom.Point2D;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/**
 * RES-2: everything that grows during a battle has a bound. The structures that grow
 * are the state logs, the KNN trees and the wave lists; the rest is either cleared each
 * round (virtual bullets, neighbour caches, surf options) or keyed by opponent name.
 */
@Tag("RES-2")
class ResourceBoundsTest {

    static RobotState state(long t) {
        return RobotState.newBuilder().setLocation(new Point2D.Double(400, 300))
            .setHeading(0).setVelocity(0).setTime(t).build();
    }

    @Test
    @DisplayName("a robot state log keeps at most MAX_STATES, dropping the oldest")
    void stateLogIsBounded() {
        RobotStateLog log = new RobotStateLog();
        int n = RobotStateLog.MAX_STATES + 250;
        for (long t = 0; t < n; t++) log.addState(state(t));
        assertEquals(RobotStateLog.MAX_STATES, log.size());
        assertNull(log.getState(0, false), "oldest state was dropped");
        assertNotNull(log.getState(n - 1, false), "newest state kept");
    }

    @Test
    @DisplayName("a KD-tree with a limit drops its oldest points")
    void kdTreeIsBounded() {
        KdTree<Integer> tree = new KdTree<>(2, 100);
        for (int i = 0; i < 1000; i++) tree.addPoint(new double[] {i, i}, i);
        assertEquals(100, tree.size());
        assertEquals(999, tree.nearestNeighbor(new double[] {2000, 2000}, 1).get(0).value);
        assertEquals(900, tree.nearestNeighbor(new double[] {-1, -1}, 1).get(0).value);
    }

    @Test
    @DisplayName("a KNN view with no limit of its own gets the default cap")
    void knnViewDefaultCap() {
        int[] next = {0};
        DistanceFormula formula = new DistanceFormula() {
            { weights = new double[] {1}; }

            @Override
            public double[] dataPointFromWave(Wave w, boolean aiming) {
                return new double[] {next[0]++};
            }
        };
        KnnView<Integer> view = new KnnView<>(formula);
        for (int i = 0; i < KnnView.DEFAULT_MAX_DATA_POINTS + 10; i++) view.logWave(null, i);
        assertEquals(KnnView.DEFAULT_MAX_DATA_POINTS, view.size());
    }

    @Test
    @DisplayName("a wave's state log is dropped when the wave breaks")
    void waveManagerDropsBrokenWaves() {
        BattleField field = new BattleField(800, 600);
        MovementPredictor predictor = new MovementPredictor(field);
        WaveManager manager = new WaveManager();
        Point2D.Double source = new Point2D.Double(100, 300);
        Point2D.Double target = new Point2D.Double(400, 300);
        for (long t = 0; t < 20; t++) {
            manager.addWave(new Wave("enemy", source, target, 0, t, 3.0, 0, 0, 1, field,
                predictor));
        }
        RobotState still = null;
        for (long t = 0; t < 200; t++) {
            still = RobotState.newBuilder().setLocation(target).setHeading(0).setVelocity(0)
                .setTime(t).build();
            manager.checkActiveWaves(t, still, (w, states) -> { });
        }
        assertEquals(0, manager.size(), "every wave passed the target");
        assertEquals(0, manager.stateLogCount(), "no state logs left behind");
        assertTrue(still.time > 0);
    }
}

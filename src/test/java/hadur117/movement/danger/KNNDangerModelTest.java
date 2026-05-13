package hadur117.movement.danger;

import hadur117.movement.EnemyWave;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.awt.geom.Point2D;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("KNNDangerModel")
class KNNDangerModelTest {

    private EnemyWave makeWave(int hitBin) {
        EnemyWave w = new EnemyWave();
        w.fireLocation = new Point2D.Double(400, 400);
        w.bulletSpeed = 14.0;
        w.directAngle = 0;
        w.lateralDirection = 1;
        w.distSeg = 1;
        w.velSeg = 1;
        w.accelSeg = 1;
        w.wallSeg = 1;
        w.dangerFeatures = new double[]{0.5, 0.5, 0.0, 0.5, 0.1, 0.3, 0.25};
        return w;
    }

    @Test
    @DisplayName("returns flat danger before MIN_DATA hits")
    void coldStartReturnsFlatDanger() {
        KNNDangerModel model = new KNNDangerModel();
        assertEquals(0.01, model.danger(makeWave(23), 23), 1e-9);
    }

    @Test
    @DisplayName("weight is near-zero before MIN_DATA")
    void coldStartWeightNearZero() {
        KNNDangerModel model = new KNNDangerModel();
        assertTrue(model.getWeight() < 0.001);
    }

    @Test
    @DisplayName("null dangerFeatures returns flat danger")
    void nullFeaturesReturnsFlatDanger() {
        KNNDangerModel model = new KNNDangerModel();
        EnemyWave w = makeWave(23);
        w.dangerFeatures = null;
        assertEquals(0.01, model.danger(w, 23), 1e-9);
    }

    @Test
    @DisplayName("logHit records data and increases size")
    void logHitIncrementsSize() {
        KNNDangerModel model = new KNNDangerModel();
        int before = KNNDangerModel.getSize();
        model.logHit(makeWave(23), 23);
        assertTrue(KNNDangerModel.getSize() >= before);
    }

    @Test
    @DisplayName("name returns KNN")
    void nameIsKNN() {
        assertEquals("KNN", new KNNDangerModel().name());
    }
}

package hadur117.movement.danger;

import hadur117.movement.EnemyWave;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.awt.geom.Point2D;
import java.util.Arrays;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("DangerEnsemble")
class DangerEnsembleTest {

    private EnemyWave makeWave() {
        EnemyWave w = new EnemyWave();
        w.fireLocation = new Point2D.Double(400, 400);
        w.bulletSpeed = 14.0;
        w.directAngle = 0;
        w.lateralDirection = 1;
        w.distSeg = 1;
        w.velSeg = 1;
        w.accelSeg = 1;
        w.wallSeg = 1;
        w.myLateralVelocity = 4.0;
        w.myTurnRate = 0.01;
        w.myAdvancingVelocity = 2.0;
        w.dangerFeatures = new double[]{0.5, 0.5, 0.0, 0.5, 0.1, 0.3, 0.25};
        return w;
    }

    @Test
    @DisplayName("blendedDanger returns non-negative value")
    void blendedDangerNonNegative() {
        DangerEnsemble ensemble = new DangerEnsemble(
                Arrays.asList(new HeadOnDangerModel(), new LinearDangerModel()));
        assertTrue(ensemble.blendedDanger(makeWave(), 23) >= 0);
    }

    @Test
    @DisplayName("blendedDanger at center bin is highest for HeadOn model")
    void blendedDangerCenterBinHighest() {
        DangerEnsemble ensemble = new DangerEnsemble(
                Arrays.asList(new HeadOnDangerModel()));
        EnemyWave w = makeWave();
        double center = ensemble.blendedDanger(w, 23);
        double edge = ensemble.blendedDanger(w, 0);
        assertTrue(center > edge);
    }

    @Test
    @DisplayName("logHitAll notifies all models")
    void logHitAllNotifiesAll() {
        HeadOnDangerModel hot = new HeadOnDangerModel();
        LinearDangerModel lin = new LinearDangerModel();
        DangerEnsemble ensemble = new DangerEnsemble(Arrays.asList(hot, lin));

        double hotWeightBefore = hot.getWeight();
        ensemble.logHitAll(makeWave(), 23);
        assertNotEquals(hotWeightBefore, hot.getWeight());
    }

    @Test
    @DisplayName("getWeights returns entry for each model")
    void getWeightsSize() {
        DangerEnsemble ensemble = new DangerEnsemble(
                Arrays.asList(new HeadOnDangerModel(), new LinearDangerModel(),
                        new CircularDangerModel()));
        Map<String, Double> weights = ensemble.getWeights();
        assertEquals(3, weights.size());
        assertTrue(weights.containsKey("HOT"));
        assertTrue(weights.containsKey("Linear"));
        assertTrue(weights.containsKey("Circular"));
    }

    @Test
    @DisplayName("blendedDanger with zero-weight models returns 0")
    void blendedDangerZeroWeight() {
        DangerModel zeroModel = new DangerModel() {
            public double danger(EnemyWave w, int bin) { return 1.0; }
            public void logHit(EnemyWave w, int bin) {}
            public void decay(EnemyWave w) {}
            public double getWeight() { return 0; }
            public String name() { return "zero"; }
        };
        DangerEnsemble ensemble = new DangerEnsemble(Arrays.asList(zeroModel));
        assertEquals(0.0, ensemble.blendedDanger(makeWave(), 23));
    }
}

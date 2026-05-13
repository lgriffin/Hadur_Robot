package hadur117.movement.danger;

import hadur117.movement.EnemyWave;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.awt.geom.Point2D;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("GFDangerModel")
class GFDangerModelTest {

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
        return w;
    }

    @Test
    @DisplayName("center bin has initial danger from static init")
    void centerBinHasInitialDanger() {
        GFDangerModel model = new GFDangerModel();
        double danger = model.danger(makeWave(), 23);
        assertTrue(danger > 0, "Center bin should have initial danger > 0");
    }

    @Test
    @DisplayName("logHit increases danger at hit bin")
    void logHitIncreasesDanger() {
        GFDangerModel model = new GFDangerModel();
        EnemyWave w = makeWave();
        double before = model.danger(w, 10);
        model.logHit(w, 10);
        double after = model.danger(w, 10);
        assertTrue(after > before, "Danger should increase after logHit");
    }

    @Test
    @DisplayName("logHit also affects neighbor bins via smoothing")
    void logHitAffectsNeighbors() {
        GFDangerModel model = new GFDangerModel();
        EnemyWave w = makeWave();
        double before = model.danger(w, 11);
        model.logHit(w, 10);
        double after = model.danger(w, 11);
        assertTrue(after > before, "Neighbor bins should also increase");
    }

    @Test
    @DisplayName("decay reduces stats")
    void decayReducesStats() {
        GFDangerModel model = new GFDangerModel();
        EnemyWave w = makeWave();
        model.logHit(w, 15);
        double before = model.danger(w, 15);
        model.decay(w);
        double after = model.danger(w, 15);
        assertTrue(after < before, "Decay should reduce danger");
    }

    @Test
    @DisplayName("name returns GF")
    void nameIsGF() {
        assertEquals("GF", new GFDangerModel().name());
    }

    @Test
    @DisplayName("getWeight is positive")
    void weightIsPositive() {
        assertTrue(new GFDangerModel().getWeight() > 0);
    }

    @Test
    @DisplayName("getStats returns 5D array")
    void getStatsReturnsArray() {
        double[][][][][] stats = GFDangerModel.getStats();
        assertNotNull(stats);
        assertEquals(3, stats.length);
    }

    @Test
    @DisplayName("smoothDanger includes neighbor weighting")
    void smoothDangerNeighborWeighting() {
        double[] bins = new double[47];
        bins[23] = 2.0;
        double smoothed = GFDangerModel.smoothDanger(bins, 23);
        assertEquals(2.0, smoothed, 1e-9);

        bins[22] = 1.0;
        smoothed = GFDangerModel.smoothDanger(bins, 23);
        assertEquals(2.5, smoothed, 1e-9);
    }
}

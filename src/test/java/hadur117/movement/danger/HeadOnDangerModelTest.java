package hadur117.movement.danger;

import hadur117.movement.EnemyWave;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.awt.geom.Point2D;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("HeadOnDangerModel")
class HeadOnDangerModelTest {

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
    @DisplayName("danger peaks at center bin 23")
    void dangerPeaksAtCenter() {
        HeadOnDangerModel model = new HeadOnDangerModel();
        EnemyWave w = makeWave();
        double center = model.danger(w, 23);
        double off = model.danger(w, 20);
        assertTrue(center > off, "Center bin should have highest danger");
    }

    @Test
    @DisplayName("danger at center bin is 1.0 (Gaussian peak)")
    void dangerAtCenterIsOne() {
        HeadOnDangerModel model = new HeadOnDangerModel();
        assertEquals(1.0, model.danger(makeWave(), 23), 1e-9);
    }

    @Test
    @DisplayName("danger is symmetric around center")
    void dangerSymmetric() {
        HeadOnDangerModel model = new HeadOnDangerModel();
        EnemyWave w = makeWave();
        assertEquals(model.danger(w, 20), model.danger(w, 26), 1e-9);
    }

    @Test
    @DisplayName("danger drops to near-zero at extreme bins")
    void dangerNearZeroAtEdge() {
        HeadOnDangerModel model = new HeadOnDangerModel();
        assertTrue(model.danger(makeWave(), 0) < 0.01);
        assertTrue(model.danger(makeWave(), 46) < 0.01);
    }

    @Test
    @DisplayName("name returns HOT")
    void nameIsHOT() {
        assertEquals("HOT", new HeadOnDangerModel().name());
    }

    @Test
    @DisplayName("getWeight changes after logHit")
    void weightChangesAfterLogHit() {
        HeadOnDangerModel model = new HeadOnDangerModel();
        double before = model.getWeight();
        model.logHit(makeWave(), 23);
        assertNotEquals(before, model.getWeight());
    }
}

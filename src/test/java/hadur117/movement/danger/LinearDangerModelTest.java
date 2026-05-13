package hadur117.movement.danger;

import hadur117.movement.EnemyWave;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.awt.geom.Point2D;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("LinearDangerModel")
class LinearDangerModelTest {

    private EnemyWave makeWave(double latVel) {
        EnemyWave w = new EnemyWave();
        w.fireLocation = new Point2D.Double(400, 400);
        w.bulletSpeed = 14.0;
        w.directAngle = 0;
        w.lateralDirection = 1;
        w.distSeg = 1;
        w.velSeg = 1;
        w.accelSeg = 1;
        w.wallSeg = 1;
        w.myLateralVelocity = latVel;
        w.dangerFeatures = new double[]{400.0 / 800.0, Math.abs(latVel) / 8.0, 0, 0.5, 0.1, 0.3, 0.25};
        return w;
    }

    @Test
    @DisplayName("stationary target peaks at center bin")
    void stationaryTargetPeaksAtCenter() {
        LinearDangerModel model = new LinearDangerModel();
        EnemyWave w = makeWave(0);
        double center = model.danger(w, 23);
        double off = model.danger(w, 10);
        assertTrue(center > off);
    }

    @Test
    @DisplayName("moving target shifts predicted GF away from center")
    void movingTargetShiftsPrediction() {
        LinearDangerModel model = new LinearDangerModel();
        EnemyWave w = makeWave(6.0);
        double center = model.danger(w, 23);
        double forward = model.danger(w, 30);
        assertTrue(forward > center, "Fast lateral movement should shift prediction");
    }

    @Test
    @DisplayName("name returns Linear")
    void nameIsLinear() {
        assertEquals("Linear", new LinearDangerModel().name());
    }

    @Test
    @DisplayName("getWeight is positive")
    void weightIsPositive() {
        assertTrue(new LinearDangerModel().getWeight() > 0);
    }
}

package hadur117.movement.danger;

import hadur117.movement.EnemyWave;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.awt.geom.Point2D;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("CircularDangerModel")
class CircularDangerModelTest {

    private EnemyWave makeWave(double latVel, double turnRate) {
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
        w.myTurnRate = turnRate;
        w.dangerFeatures = new double[]{400.0 / 800.0, Math.abs(latVel) / 8.0, 0, 0.5, 0.1, 0.3, 0.25};
        return w;
    }

    @Test
    @DisplayName("stationary non-turning target peaks at center")
    void stationaryPeaksAtCenter() {
        CircularDangerModel model = new CircularDangerModel();
        EnemyWave w = makeWave(0, 0);
        double center = model.danger(w, 23);
        double edge = model.danger(w, 5);
        assertTrue(center > edge);
    }

    @Test
    @DisplayName("turning target shifts prediction from linear")
    void turningShiftsPrediction() {
        CircularDangerModel model = new CircularDangerModel();
        LinearDangerModel linear = new LinearDangerModel();

        EnemyWave w = makeWave(6.0, 0.05);
        int peakBinCirc = -1, peakBinLin = -1;
        double maxCirc = -1, maxLin = -1;
        for (int b = 0; b < 47; b++) {
            double dc = model.danger(w, b);
            double dl = linear.danger(w, b);
            if (dc > maxCirc) { maxCirc = dc; peakBinCirc = b; }
            if (dl > maxLin) { maxLin = dl; peakBinLin = b; }
        }
        assertNotEquals(peakBinCirc, peakBinLin,
                "Circular and linear should predict differently with turn rate");
    }

    @Test
    @DisplayName("name returns Circular")
    void nameIsCircular() {
        assertEquals("Circular", new CircularDangerModel().name());
    }

    @Test
    @DisplayName("getWeight is positive")
    void weightIsPositive() {
        assertTrue(new CircularDangerModel().getWeight() > 0);
    }
}

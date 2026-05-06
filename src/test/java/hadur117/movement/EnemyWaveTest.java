package hadur117.movement;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.awt.geom.Point2D;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("EnemyWave (data carrier)")
class EnemyWaveTest {

    private EnemyWave wave;

    @BeforeEach
    void setUp() {
        wave = new EnemyWave();
    }

    @Test
    @DisplayName("default fields are zero/null")
    void defaultFields() {
        assertNull(wave.fireLocation);
        assertEquals(0L, wave.fireTime);
        assertEquals(0.0, wave.bulletSpeed, 1e-9);
        assertEquals(0.0, wave.directAngle, 1e-9);
        assertEquals(0.0, wave.distanceTraveled, 1e-9);
        assertEquals(0, wave.lateralDirection);
        assertEquals(0, wave.distSeg);
        assertEquals(0, wave.velSeg);
        assertEquals(0, wave.accelSeg);
    }

    @Test
    @DisplayName("fireLocation can be set and read")
    void fireLocation() {
        wave.fireLocation = new Point2D.Double(300.0, 400.0);
        assertEquals(300.0, wave.fireLocation.x, 1e-9);
        assertEquals(400.0, wave.fireLocation.y, 1e-9);
    }

    @Test
    @DisplayName("fireTime can be set")
    void fireTime() {
        wave.fireTime = 55L;
        assertEquals(55L, wave.fireTime);
    }

    @Test
    @DisplayName("bulletSpeed can be set")
    void bulletSpeed() {
        wave.bulletSpeed = 17.0; // 20 - 3*1 = 17
        assertEquals(17.0, wave.bulletSpeed, 1e-9);
    }

    @Test
    @DisplayName("directAngle can be set")
    void directAngle() {
        wave.directAngle = -Math.PI / 3;
        assertEquals(-Math.PI / 3, wave.directAngle, 1e-9);
    }

    @Test
    @DisplayName("distanceTraveled can be accumulated")
    void distanceTraveled() {
        wave.bulletSpeed = 14.0;
        wave.distanceTraveled = 14.0;
        wave.distanceTraveled += wave.bulletSpeed;
        assertEquals(28.0, wave.distanceTraveled, 1e-9);
    }

    @Test
    @DisplayName("lateralDirection can be 1 or -1")
    void lateralDirection() {
        wave.lateralDirection = 1;
        assertEquals(1, wave.lateralDirection);
        wave.lateralDirection = -1;
        assertEquals(-1, wave.lateralDirection);
    }

    @Test
    @DisplayName("segmentation indices can be set")
    void segIndices() {
        wave.distSeg = 4;
        wave.velSeg = 3;
        wave.accelSeg = 2;
        assertEquals(4, wave.distSeg);
        assertEquals(3, wave.velSeg);
        assertEquals(2, wave.accelSeg);
    }

    @Test
    @DisplayName("full setup integration test")
    void fullSetup() {
        wave.fireLocation = new Point2D.Double(500, 600);
        wave.fireTime = 80;
        wave.bulletSpeed = 11.0;
        wave.directAngle = 0.5;
        wave.distanceTraveled = 33.0;
        wave.lateralDirection = -1;
        wave.distSeg = 2;
        wave.velSeg = 1;
        wave.accelSeg = 0;

        assertEquals(80, wave.fireTime);
        assertEquals(-1, wave.lateralDirection);
        assertEquals(33.0, wave.distanceTraveled, 1e-9);
    }
}

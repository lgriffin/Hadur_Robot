package hadur117.gun;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.awt.geom.Point2D;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("GunWave (data carrier)")
class GunWaveTest {

    private GunWave wave;

    @BeforeEach
    void setUp() {
        wave = new GunWave();
    }

    @Test
    @DisplayName("default fields are zero/null/false")
    void defaultFields() {
        assertNull(wave.firePosition);
        assertEquals(0L, wave.fireTime);
        assertEquals(0.0, wave.bulletSpeed, 1e-9);
        assertEquals(0.0, wave.absBearing, 1e-9);
        assertEquals(0.0, wave.latDir, 1e-9);
        assertEquals(0.0, wave.mea, 1e-9);
        assertNull(wave.stats);
        assertEquals(0, wave.distSeg);
        assertEquals(0, wave.velSeg);
        assertEquals(0, wave.latvelSeg);
        assertEquals(0, wave.accelSeg);
        assertEquals(0, wave.wallSeg);
        assertFalse(wave.realBullet);
        assertNull(wave.aimAngles);
    }

    @Test
    @DisplayName("firePosition can be set and read")
    void firePosition() {
        wave.firePosition = new Point2D.Double(100.0, 200.0);
        assertEquals(100.0, wave.firePosition.x, 1e-9);
        assertEquals(200.0, wave.firePosition.y, 1e-9);
    }

    @Test
    @DisplayName("fireTime can be set")
    void fireTime() {
        wave.fireTime = 42L;
        assertEquals(42L, wave.fireTime);
    }

    @Test
    @DisplayName("bulletSpeed can be set")
    void bulletSpeed() {
        wave.bulletSpeed = 14.0; // 20 - 3 * 2.0
        assertEquals(14.0, wave.bulletSpeed, 1e-9);
    }

    @Test
    @DisplayName("absBearing can be set")
    void absBearing() {
        wave.absBearing = Math.PI / 4;
        assertEquals(Math.PI / 4, wave.absBearing, 1e-9);
    }

    @Test
    @DisplayName("latDir can be 1.0 or -1.0")
    void latDir() {
        wave.latDir = 1.0;
        assertEquals(1.0, wave.latDir, 1e-9);
        wave.latDir = -1.0;
        assertEquals(-1.0, wave.latDir, 1e-9);
    }

    @Test
    @DisplayName("mea (max escape angle) can be set")
    void mea() {
        wave.mea = Math.asin(8.0 / 14.0);
        assertTrue(wave.mea > 0);
    }

    @Test
    @DisplayName("stats array can be set")
    void stats() {
        wave.stats = new double[]{1.0, 2.0, 3.0};
        assertEquals(3, wave.stats.length);
        assertEquals(2.0, wave.stats[1], 1e-9);
    }

    @Test
    @DisplayName("segmentation indices can be set")
    void segIndices() {
        wave.distSeg = 3;
        wave.velSeg = 4;
        wave.latvelSeg = 2;
        wave.accelSeg = 1;
        wave.wallSeg = 0;
        assertEquals(3, wave.distSeg);
        assertEquals(4, wave.velSeg);
        assertEquals(2, wave.latvelSeg);
        assertEquals(1, wave.accelSeg);
        assertEquals(0, wave.wallSeg);
    }

    @Test
    @DisplayName("realBullet flag can be toggled")
    void realBullet() {
        wave.realBullet = true;
        assertTrue(wave.realBullet);
        wave.realBullet = false;
        assertFalse(wave.realBullet);
    }

    @Test
    @DisplayName("aimAngles array can hold 5 gun angles")
    void aimAngles() {
        wave.aimAngles = new double[]{0.1, 0.2, 0.3, 0.4, 0.5};
        assertEquals(5, wave.aimAngles.length);
        assertEquals(0.3, wave.aimAngles[2], 1e-9);
    }

    @Test
    @DisplayName("all fields can be set together (integration)")
    void fullSetup() {
        wave.firePosition = new Point2D.Double(400, 300);
        wave.fireTime = 100;
        wave.bulletSpeed = 11.0;
        wave.absBearing = 1.57;
        wave.latDir = -1.0;
        wave.mea = 0.75;
        wave.stats = new double[31];
        wave.distSeg = 2;
        wave.velSeg = 3;
        wave.latvelSeg = 1;
        wave.accelSeg = 2;
        wave.wallSeg = 1;
        wave.realBullet = true;
        wave.aimAngles = new double[]{1.0, 1.1, 1.2, 1.3, 1.4};

        assertEquals(100, wave.fireTime);
        assertTrue(wave.realBullet);
        assertEquals(31, wave.stats.length);
    }
}

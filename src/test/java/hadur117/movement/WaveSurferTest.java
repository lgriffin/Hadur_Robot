package hadur117.movement;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.awt.geom.Rectangle2D;
import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("WaveSurfer")
class WaveSurferTest {

    private WaveSurfer surfer;

    @BeforeEach
    void setUp() {
        surfer = new WaveSurfer();
    }

    // ── Constructor ────────────────────────────────────────────────────

    @Test
    @DisplayName("constructor sets center bin minimum in all dangerStats segments")
    void constructorSetsCenterBinMinimum() throws Exception {
        Field statsField = WaveSurfer.class.getDeclaredField("dangerStats");
        statsField.setAccessible(true);
        double[][][][][][] stats = (double[][][][][][]) statsField.get(null);

        int centerBin = 23;
        for (int d = 0; d < 5; d++)
            for (int v = 0; v < 5; v++)
                for (int a = 0; a < 3; a++)
                    for (int w = 0; w < 2; w++)
                        for (int t = 0; t < 3; t++)
                            assertTrue(stats[d][v][a][w][t][centerBin] >= 0.001,
                                    "dangerStats[" + d + "][" + v + "][" + a + "]["
                                            + w + "][" + t + "][" + centerBin
                                            + "] should be >= 0.001");
    }

    @Test
    @DisplayName("dangerStats dimensions are [5][5][3][2][3][47]")
    void dangerStatsDimensions() throws Exception {
        Field statsField = WaveSurfer.class.getDeclaredField("dangerStats");
        statsField.setAccessible(true);
        double[][][][][][] stats = (double[][][][][][]) statsField.get(null);

        assertEquals(5, stats.length);
        assertEquals(5, stats[0].length);
        assertEquals(3, stats[0][0].length);
        assertEquals(2, stats[0][0][0].length);
        assertEquals(3, stats[0][0][0][0].length);
        assertEquals(47, stats[0][0][0][0][0].length);
    }

    // ── init ───────────────────────────────────────────────────────────

    @Test
    @DisplayName("init sets field dimensions")
    void initSetsFieldDimensions() throws Exception {
        surfer.init(800, 600);

        Field widthField = WaveSurfer.class.getDeclaredField("fieldWidth");
        widthField.setAccessible(true);
        assertEquals(800.0, widthField.getDouble(surfer), 1e-9);

        Field heightField = WaveSurfer.class.getDeclaredField("fieldHeight");
        heightField.setAccessible(true);
        assertEquals(600.0, heightField.getDouble(surfer), 1e-9);
    }

    @Test
    @DisplayName("init creates fieldRect with WALL_MARGIN=18")
    void initCreatesFieldRect() throws Exception {
        surfer.init(800, 600);

        Field rectField = WaveSurfer.class.getDeclaredField("fieldRect");
        rectField.setAccessible(true);
        Rectangle2D.Double rect = (Rectangle2D.Double) rectField.get(surfer);

        assertNotNull(rect);
        assertEquals(18.0, rect.x, 1e-9);
        assertEquals(18.0, rect.y, 1e-9);
        assertEquals(800.0 - 36.0, rect.width, 1e-9);
        assertEquals(600.0 - 36.0, rect.height, 1e-9);
    }

    @Test
    @DisplayName("init resets lastEnemyEnergy to 100")
    void initResetsLastEnemyEnergy() throws Exception {
        surfer.init(800, 600);

        Field leeField = WaveSurfer.class.getDeclaredField("lastEnemyEnergy");
        leeField.setAccessible(true);
        assertEquals(100.0, leeField.getDouble(surfer), 1e-9);
    }

    @Test
    @DisplayName("init clears waves list")
    void initClearsWaves() throws Exception {
        surfer.init(800, 600);

        Field wavesField = WaveSurfer.class.getDeclaredField("waves");
        wavesField.setAccessible(true);
        @SuppressWarnings("unchecked")
        java.util.ArrayList<EnemyWave> waves =
                (java.util.ArrayList<EnemyWave>) wavesField.get(surfer);
        assertTrue(waves.isEmpty());
    }

    @Test
    @DisplayName("init resets roundHitsTaken to 0")
    void initResetsRoundHits() throws Exception {
        surfer.init(800, 600);

        Field hitsField = WaveSurfer.class.getDeclaredField("roundHitsTaken");
        hitsField.setAccessible(true);
        assertEquals(0, hitsField.getInt(surfer));
    }

    @Test
    @DisplayName("getRoundHitsTaken returns 0 after init")
    void getRoundHitsTaken() {
        surfer.init(800, 600);
        assertEquals(0, surfer.getRoundHitsTaken());
    }

    @Test
    @DisplayName("init with different dimensions creates correct fieldRect")
    void initDifferentDimensions() throws Exception {
        surfer.init(1200, 900);

        Field rectField = WaveSurfer.class.getDeclaredField("fieldRect");
        rectField.setAccessible(true);
        Rectangle2D.Double rect = (Rectangle2D.Double) rectField.get(surfer);

        assertEquals(18.0, rect.x, 1e-9);
        assertEquals(18.0, rect.y, 1e-9);
        assertEquals(1164.0, rect.width, 1e-9);
        assertEquals(864.0, rect.height, 1e-9);
    }

    // ── Static accessors ─────────────────────────────────────────────

    @Test
    @DisplayName("getTotalHitsTaken returns static field value")
    void totalHitsTaken() {
        int hits = WaveSurfer.getTotalHitsTaken();
        assertTrue(hits >= 0);
    }

    @Test
    @DisplayName("getTotalWavesPassed returns static field value")
    void totalWavesPassed() {
        int waves = WaveSurfer.getTotalWavesPassed();
        assertTrue(waves >= 0);
    }

    // ── Constants ──────────────────────────────────────────────────────

    @Test
    @DisplayName("BINS constant is 47")
    void binsConstant() throws Exception {
        Field binsField = WaveSurfer.class.getDeclaredField("BINS");
        binsField.setAccessible(true);
        assertEquals(47, binsField.getInt(null));
    }

    @Test
    @DisplayName("CENTER_BIN constant is 23")
    void centerBinConstant() throws Exception {
        Field cbField = WaveSurfer.class.getDeclaredField("CENTER_BIN");
        cbField.setAccessible(true);
        assertEquals(23, cbField.getInt(null));
    }

    @Test
    @DisplayName("STICK constant is 160")
    void stickConstant() throws Exception {
        Field stickField = WaveSurfer.class.getDeclaredField("STICK");
        stickField.setAccessible(true);
        assertEquals(160.0, stickField.getDouble(null), 1e-9);
    }

    // ── Bullet shadows ────────────────────────────────────────────────

    @Test
    @DisplayName("addBullet stores bullet in ourBullets list")
    void addBulletStoresBullet() throws Exception {
        surfer.init(800, 600);
        surfer.addBullet(400, 300, Math.PI, 2.0, 10);

        java.util.ArrayList<?> bullets = getOurBullets();
        assertEquals(1, bullets.size());
    }

    @Test
    @DisplayName("addBullet computes bullet speed as 20 - 3*power")
    void addBulletSpeed() throws Exception {
        surfer.init(800, 600);
        surfer.addBullet(400, 300, 0.0, 3.0, 10);

        java.util.ArrayList<?> bullets = getOurBullets();
        Object bullet = bullets.get(0);
        Field speedField = bullet.getClass().getDeclaredField("bulletSpeed");
        speedField.setAccessible(true);
        assertEquals(11.0, speedField.getDouble(bullet), 1e-9);
    }

    @Test
    @DisplayName("init clears ourBullets list")
    void initClearsOurBullets() throws Exception {
        surfer.init(800, 600);
        surfer.addBullet(400, 300, 0.0, 2.0, 10);
        assertEquals(1, getOurBullets().size());

        surfer.init(800, 600);
        assertEquals(0, getOurBullets().size());
    }

    @Test
    @DisplayName("getShadowBin returns valid bin for head-on intersection")
    void shadowBinHeadOnIntersection() throws Exception {
        surfer.init(800, 600);
        surfer.addBullet(400, 300, 0.0, 2.0, 0);

        WaveSurfer.OurBullet bullet = (WaveSurfer.OurBullet) getOurBullets().get(0);

        EnemyWave wave = new EnemyWave();
        wave.fireLocation = new java.awt.geom.Point2D.Double(400, 500);
        wave.fireTime = 0;
        wave.bulletSpeed = 14.0;
        wave.directAngle = Math.atan2(400.0 - 400.0, 300.0 - 500.0);
        wave.lateralDirection = 1;

        int bin = surfer.getShadowBin(bullet, wave);
        assertTrue(bin >= 0 && bin < 47, "shadow bin should be valid: " + bin);
    }

    @Test
    @DisplayName("prune removes out-of-bounds bullets")
    void pruneRemovesOutOfBounds() throws Exception {
        surfer.init(800, 600);
        surfer.addBullet(400, 590, 0.0, 1.0, 0);

        java.lang.reflect.Method prune = WaveSurfer.class.getDeclaredMethod("pruneOurBullets", long.class);
        prune.setAccessible(true);
        prune.invoke(surfer, 100L);

        assertEquals(0, getOurBullets().size());
    }

    @Test
    @DisplayName("prune keeps in-bounds bullets")
    void pruneKeepsInBounds() throws Exception {
        surfer.init(800, 600);
        surfer.addBullet(400, 300, 0.0, 3.0, 0);

        java.lang.reflect.Method prune = WaveSurfer.class.getDeclaredMethod("pruneOurBullets", long.class);
        prune.setAccessible(true);
        prune.invoke(surfer, 2L);

        assertEquals(1, getOurBullets().size());
    }

    @SuppressWarnings("unchecked")
    private java.util.ArrayList<?> getOurBullets() throws Exception {
        Field f = WaveSurfer.class.getDeclaredField("ourBullets");
        f.setAccessible(true);
        return (java.util.ArrayList<?>) f.get(surfer);
    }
}

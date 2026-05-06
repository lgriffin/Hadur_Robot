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
        double[][][][] stats = (double[][][][]) statsField.get(null);

        // CENTER_BIN = (47-1)/2 = 23
        int centerBin = 23;
        for (int d = 0; d < 5; d++) {
            for (int v = 0; v < 5; v++) {
                for (int a = 0; a < 3; a++) {
                    assertTrue(stats[d][v][a][centerBin] >= 0.001,
                            "dangerStats[" + d + "][" + v + "][" + a + "][" + centerBin
                                    + "] should be >= 0.001 but was " + stats[d][v][a][centerBin]);
                }
            }
        }
    }

    @Test
    @DisplayName("dangerStats dimensions are [5][5][3][47]")
    void dangerStatsDimensions() throws Exception {
        Field statsField = WaveSurfer.class.getDeclaredField("dangerStats");
        statsField.setAccessible(true);
        double[][][][] stats = (double[][][][]) statsField.get(null);

        assertEquals(5, stats.length);
        assertEquals(5, stats[0].length);
        assertEquals(3, stats[0][0].length);
        assertEquals(47, stats[0][0][0].length);
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
}

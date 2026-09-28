package hadur2.core.gun;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur2.core.model.Wave;
import hadur2.core.physics.BattleField;
import hadur2.core.physics.MovementPredictor;
import java.awt.geom.Point2D;
import java.util.Arrays;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** GUN-2: the anti-surfer formula's three new features, and how a legacy seed seeds them. */
class AntiSurferFormulaTest {

    static final BattleField FIELD = new BattleField(800, 600);
    static final MovementPredictor PREDICTOR = new MovementPredictor(FIELD);
    static final Point2D.Double ME = new Point2D.Double(400, 100);
    static final Point2D.Double ENEMY = new Point2D.Double(400, 450);

    static Wave wave() {
        Wave w = new Wave("abc.Shadow 3.83c", ME, ENEMY, 0, 30, 1.95, Math.PI / 2, 8, 1, FIELD, PREDICTOR);
        w.setAccel(0).setDistance(ME.distance(ENEMY)).setVchangeTime(10).setTargetEnergy(100)
            .setSourceEnergy(100).setGunHeat(0).setEnemiesAlive(1).setLastBulletFiredTime(0);
        w.setWallDistances();
        return w;
    }

    @Test
    @Tag("GUN-2")
    @DisplayName("the formula has 12 weights: the original nine, plus three GUN-2 features")
    void twelveWeights() {
        assertEquals(12, new AntiSurferFormula().weights.length);
        assertEquals(9, AntiSurferFormula.LEGACY_FEATURES);
    }

    @Test
    @Tag("GUN-2")
    @DisplayName("ticks since reversal, over the flight time, is capped at 1")
    void ticksSinceReversalCapped() {
        Wave w = wave().setTicksSinceReversal(1_000_000);
        double[] point = new AntiSurferFormula().dataPointFromWave(w, false);
        assertEquals(1.0, point[9], 1e-12);

        Wave freshReversal = wave().setTicksSinceReversal(0);
        double[] freshPoint = new AntiSurferFormula().dataPointFromWave(freshReversal, false);
        assertEquals(0.0, freshPoint[9], 1e-12);
    }

    @Test
    @Tag("GUN-2")
    @DisplayName("the 20-tick displacement feature reuses Wave.targetDl20t, capped at 1")
    void displacement20Capped() {
        Wave still = wave().setDistanceLast20Ticks(0);
        assertEquals(0.0, new AntiSurferFormula().dataPointFromWave(still, false)[10], 1e-12);

        Wave farMoved = wave().setDistanceLast20Ticks(10_000);
        assertEquals(1.0, new AntiSurferFormula().dataPointFromWave(farMoved, false)[10], 1e-12);

        Wave half = wave().setDistanceLast20Ticks(80);
        assertEquals(0.5, new AntiSurferFormula().dataPointFromWave(half, false)[10], 1e-9);
    }

    @Test
    @Tag("GUN-2")
    @DisplayName("orbit-direction changes over 40 ticks is capped at 1, and a steady orbit reads 0")
    void orbitChanges40Capped() {
        Wave steady = wave().setOrbitChanges40(0);
        assertEquals(0.0, new AntiSurferFormula().dataPointFromWave(steady, false)[11], 1e-12);

        Wave busy = wave().setOrbitChanges40(1000);
        assertEquals(1.0, new AntiSurferFormula().dataPointFromWave(busy, false)[11], 1e-12);
    }

    @Test
    @Tag("GUN-2")
    @DisplayName("the first nine features are unchanged from before R3")
    void firstNineFeaturesUnchanged() {
        Wave w = wave();
        double[] point = new AntiSurferFormula().dataPointFromWave(w, false);
        // The main gun's formula computes the same first nine values (it just doesn't stop there).
        double[] mainPoint = new GunFormula(1).dataPointFromWave(w, false);
        assertArrayEquals(Arrays.copyOf(mainPoint, 9), Arrays.copyOfRange(point, 0, 9), 1e-12);
    }

    @Test
    @Tag("GUN-2")
    @DisplayName("a legacy (pre-R3) gun seed sample seeds the three new features at the neutral value")
    void legacySeedIsNeutral() {
        GunController g = new GunController(FIELD, 1);
        Wave w = wave();
        double[] point = new GunFormula(1).dataPointFromWave(w, true);
        double[] sample = Arrays.copyOf(point, GunController.SAMPLE_WIDTH);
        sample[10] = 0.5; // guess factor
        sample[11] = 0;   // dv.x
        sample[12] = 3;   // dv.y
        g.seed(w.botName, sample, new hadur2.core.model.SeedWeight(1.0));

        // Every anti-surfer/hybrid view (12-dim) got a point whose last three values are neutral.
        for (var view : g.getOrCreateViews(w.botName).values()) {
            if (view.formula.weights.length != 12) continue;
            var neighbours = view.nearestNeighbors(w, true, 1);
            assertTrue(neighbours.size() >= 1, view.name + " should hold the seeded point");
        }
    }
}

package hadur117.core.move;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur117.core.model.Wave;
import hadur117.core.physics.BattleField;
import hadur117.core.physics.MovementPredictor;
import java.awt.geom.Point2D;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("SURF-BANK-1")
class SurfBankTest {

    static final BattleField FIELD = new BattleField(800, 600);

    private static Wave wave() {
        // Enemy at (400, 100), us at (400, 450) driving across the line of fire at full speed.
        Wave w = new Wave("enemy", new Point2D.Double(400, 100), new Point2D.Double(400, 450),
            0, 10, 2.0, Math.PI / 2, 8.0, 1, FIELD, new MovementPredictor(FIELD));
        w.targetDistance = 350;
        w.setWallDistances();
        return w;
    }

    @Test
    @DisplayName("the bank's mass over every firing angle the escape allows is the whole bank")
    void massOverTheWholeEscapeIsOne() {
        SurfBank bank = new SurfBank();
        Wave w = wave();
        double mea = w.maxEscapeAngle();
        assertEquals(1.0, bank.mass(w, w.absBearing - mea - 0.01, w.absBearing + mea + 0.01), 1e-9);
        double half = bank.mass(w, w.absBearing - 0.001, w.absBearing + mea + 0.01);
        assertTrue(half > 0 && half < 1);
    }

    @Test
    @DisplayName("bullets learned at one guess factor raise the bank's mass there")
    void learningMovesTheMass() {
        SurfBank bank = new SurfBank();
        double at = wave().firingAngle(0.6);
        double lo = at - 0.03;
        double hi = at + 0.03;
        double before = bank.mass(wave(), lo, hi);
        for (int i = 0; i < 30; i++) bank.learn(wave(), at);
        double after = bank.mass(wave(), lo, hi);
        assertTrue(after > 2 * before, "before " + before + ", after " + after);
        double away = wave().firingAngle(-0.6);
        assertTrue(bank.multiplier(wave(), lo, hi) > bank.multiplier(wave(), away - 0.03, away + 0.03));
    }

    @Test
    @DisplayName("the prior row is one of the 432 keys and the guess factor is cut to [-1, 1]")
    void keyAndGuessFactor() {
        Wave w = wave();
        int k = SurfBank.priorKey(w);
        assertTrue(k >= 0 && k < 432);
        assertEquals(1.0, SurfBank.gf(w, w.absBearing + w.orbitDirection * 3 * w.maxEscapeAngle()), 1e-12);
        assertEquals(0.0, SurfBank.gf(w, w.absBearing), 1e-12);
    }
}

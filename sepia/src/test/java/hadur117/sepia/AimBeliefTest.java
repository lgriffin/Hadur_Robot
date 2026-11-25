package hadur117.sepia;

import static hadur117.sepia.Fixtures.p;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class AimBeliefTest {

    @Test
    @Tag("SEPIA-4")
    @DisplayName("the belief over the whole escape range is one, and a revealed bullet pulls it to its bearing")
    void learnsRevealedBullets() {
        AimBelief b = new AimBelief();
        InkWave w = Fixtures.wave(p(400, 500), p(400, 100), 0, 2.0);
        double mea = AimBelief.maxEscape(w.wave);
        double head = w.wave.absBearing;
        assertEquals(1.0, b.mass(w.wave, head - mea * 1.05, head + mea * 1.05), 1e-6);
        // Travelling east, seen from the north: positive guess factors are clockwise (west of south)...
        double gfHalf = head + w.wave.orbitDirection * 0.5 * mea;
        double before = b.mass(w.wave, gfHalf - 0.03, gfHalf + 0.03);
        for (int i = 0; i < 10; i++) b.reveal(w.wave, gfHalf);
        double after = b.mass(w.wave, gfHalf - 0.03, gfHalf + 0.03);
        assertTrue(after > 3 * before, before + " -> " + after);
        assertEquals(10, b.revealed());
        assertEquals(0.5, AimBelief.guessFactor(w.wave, gfHalf), 1e-9);
    }
}

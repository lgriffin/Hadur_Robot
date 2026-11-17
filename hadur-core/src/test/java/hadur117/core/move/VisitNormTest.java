package hadur117.core.move;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur117.core.model.SeedWeight;
import hadur117.core.model.Wave;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** MOVE-49: the views' danger divided by c plus our past positions on waves that missed us. */
class VisitNormTest {

    private static MoveController seeded() {
        MoveController m = SurfOpeningTest.controller();
        double[] s = new double[MoveController.SAMPLE_WIDTH];
        s[12] = 0.5;
        for (int i = 0; i < 7; i++) m.seed(s, new SeedWeight(1.0));
        return m;
    }

    @Test
    @Tag("MOVE-49")
    @DisplayName("off by default; on with no misses, the danger is only divided by c")
    void offAndEmpty() {
        Wave w = DangerIntegrationTest.wave(1.95, 400, 450);
        Wave.Intersection at = new Wave.Intersection(w.firingAngle(0.5), 0.1);
        double plain = seeded().getDangerScore(w, at, 0);
        MoveController m = seeded();
        m.setVisitNorm(0.25);
        assertEquals(plain / 0.25, m.getDangerScore(w, at, 0), 1e-9);
        assertEquals(0, m.missCount());
    }

    @Test
    @Tag("MOVE-49")
    @DisplayName("a spot we stood on while bullets missed is rated less dangerous than one we never visited")
    void missesSoftenVisitedSpots() {
        Wave w = DangerIntegrationTest.wave(1.95, 400, 450);
        Wave.Intersection visited = new Wave.Intersection(w.firingAngle(0.5), 0.1);
        MoveController m = seeded();
        m.setVisitNorm(0.25);
        double before = m.getDangerScore(w, visited, 0);
        for (int i = 0; i < 20; i++) m.logMiss(w, 0.5, 0, i);
        m.clearNeighborCache();
        double after = m.getDangerScore(w, visited, 0);
        assertEquals(20, m.missCount());
        assertTrue(after < before / 2, before + " -> " + after);
    }
}

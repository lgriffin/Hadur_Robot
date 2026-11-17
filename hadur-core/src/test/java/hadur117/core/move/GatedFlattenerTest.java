package hadur117.core.move;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur117.core.model.SeedWeight;
import hadur117.core.model.Wave;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** MOVE-50: the flatteners' score added where the hit views are silent. */
class GatedFlattenerTest {

    private static MoveController controller(double tau) {
        MoveController m = SurfOpeningTest.controller();
        m.setFlattenerOff(true);
        m.setPrior(0.09, 0.01);
        m.setGatedFlattener(tau);
        double[] s = new double[MoveController.SAMPLE_WIDTH];
        s[12] = 0.5;
        for (int i = 0; i < 7; i++) m.seed(s, new SeedWeight(1.0));
        return m;
    }

    @Test
    @Tag("MOVE-50")
    @DisplayName("with no visits logged the gated flattener changes nothing")
    void emptyChangesNothing() {
        Wave w = DangerIntegrationTest.wave(1.95, 400, 450);
        Wave.Intersection at = new Wave.Intersection(w.firingAngle(-0.6), 0.03);
        assertEquals(controller(0).getDangerScore(w, at, 0), controller(0.05).getDangerScore(w, at, 0), 1e-12);
    }

    @Test
    @Tag("MOVE-50")
    @DisplayName("visits add the flatteners' score, faded by exp(-viewScore / tau): a wider tau lets more through")
    void visitsAddFadedFlattenerScore() {
        Wave w = DangerIntegrationTest.wave(1.95, 400, 450);
        Wave.Intersection at = new Wave.Intersection(w.firingAngle(-0.6), 0.03);
        MoveController off = controller(0);
        MoveController narrow = controller(0.05);
        MoveController wide = controller(0.15);
        for (int i = 0; i < 30; i++) {
            off.logVisit(w, -0.6, 0, i);
            narrow.logVisit(w, -0.6, 0, i);
            wide.logVisit(w, -0.6, 0, i);
        }
        double base = off.getDangerScore(w, at, 0);
        double gainNarrow = narrow.getDangerScore(w, at, 0) - base;
        double gainWide = wide.getDangerScore(w, at, 0) - base;
        assertTrue(gainNarrow > 0, "narrow " + gainNarrow);
        assertTrue(gainWide > gainNarrow, gainWide + " vs " + gainNarrow);
    }
}

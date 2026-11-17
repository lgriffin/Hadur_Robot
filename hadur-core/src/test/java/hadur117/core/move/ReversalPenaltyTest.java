package hadur117.core.move;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur117.core.physics.BattleField;
import hadur117.core.physics.MovementPredictor;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** MOVE-51: leaving the way at the run length we usually leave it at costs more. */
class ReversalPenaltyTest {

    private static SurfMover mover(double beta) {
        BattleField field = new BattleField(800, 600);
        SurfMover s = new SurfMover(field, new MovementPredictor(field));
        s.setReversalPenalty(beta);
        return s;
    }

    @Test
    @Tag("MOVE-51")
    @DisplayName("run lengths fall in their buckets, the last one open")
    void buckets() {
        assertEquals(0, SurfMover.runBucket(0));
        assertEquals(1, SurfMover.runBucket(4));
        assertEquals(2, SurfMover.runBucket(11));
        assertEquals(SurfMover.RUN_BUCKETS.length - 1, SurfMover.runBucket(5000));
    }

    @Test
    @Tag("MOVE-51")
    @DisplayName("with no history the factor is 1; a habit of turning at 20 ticks makes turning there dearer, elsewhere not")
    void habitRaisesTheFactor() {
        SurfMover s = mover(1.0);
        assertEquals(1.0, s.reversalFactor(20), 1e-12);
        for (int run = 0; run < 30; run++) {
            for (int t = 0; t < 20; t++) s.recordRun(true, false);
            s.recordRun(true, true);
        }
        double habit = s.reversalFactor(20);
        assertTrue(habit > 1.5, "turning at the habitual length: " + habit);
        assertEquals(1.0, s.reversalFactor(2), 1e-12, "turning early is unusual, so not penalised");
        assertTrue(s.reversalFactor(200) <= 1.0 + 1e-12);
        assertTrue(habit <= 4.0 + 1e-12, "capped at 1 + 3 beta");
    }

    @Test
    @Tag("MOVE-51")
    @DisplayName("a stop resets the run without counting exposure; off means beta 0 gives factor 1")
    void stopResetsAndOffIsNeutral() {
        SurfMover s = mover(0.0);
        for (int run = 0; run < 30; run++) {
            for (int t = 0; t < 20; t++) s.recordRun(true, false);
            s.recordRun(true, true);
        }
        assertEquals(1.0, s.reversalFactor(20), 1e-12);
        s.recordRun(false, false);
    }
}

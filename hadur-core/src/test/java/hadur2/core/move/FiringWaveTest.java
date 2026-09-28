package hadur2.core.move;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur2.core.model.RobotState;
import hadur2.core.model.Wave;
import hadur2.core.physics.BattleField;
import hadur2.core.physics.MovementPredictor;
import java.awt.geom.Point2D;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** WAVE-3: an uncertain reading marks the wave it becomes, for {@code SurfMover} to halve. */
class FiringWaveTest {

    static final BattleField FIELD = new BattleField(800, 600);

    static MoveController controller() {
        return new MoveController(FIELD, new MovementPredictor(FIELD));
    }

    static Wave add(MoveController m, long fireTime) {
        Wave w = new Wave("enemy", new Point2D.Double(400, 500), new Point2D.Double(400, 200),
            0, fireTime, 2, 0, 0, 1, FIELD, new MovementPredictor(FIELD));
        m.addWave(w);
        return w;
    }

    @Test
    @Tag("WAVE-3")
    @DisplayName("WAVE-3: a shot found alongside an inferred wall hit surfs as an uncertain wave")
    void uncertainReadingMarksTheWave() {
        MoveController m = controller();
        add(m, 5);
        m.updateFiringWave(5, 6, 1.7, true);
        RobotState me = RobotState.newBuilder().setLocation(new Point2D.Double(400, 200)).setTime(6).build();
        Wave surfable = m.findSurfableWave(0, me);
        assertTrue(surfable.uncertain, "the wave should carry WAVE-3's flag");
    }

    @Test
    @Tag("WAVE-3")
    @DisplayName("WAVE-3: a clean reading leaves the wave trusted")
    void cleanReadingLeavesTheWaveTrusted() {
        MoveController m = controller();
        add(m, 5);
        m.updateFiringWave(5, 6, 1.7, false);
        RobotState me = RobotState.newBuilder().setLocation(new Point2D.Double(400, 200)).setTime(6).build();
        Wave surfable = m.findSurfableWave(0, me);
        assertFalse(surfable.uncertain);
    }
}

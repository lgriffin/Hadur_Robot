package hadur2.core.move;

import static org.junit.jupiter.api.Assertions.assertEquals;

import hadur2.core.model.RobotState;
import hadur2.core.model.Wave;
import hadur2.core.physics.BattleField;
import hadur2.core.physics.MovementPredictor;
import java.awt.geom.Point2D;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** Go-to surfing (MOVE-2's second flavour): which way round a candidate stop point goes. */
class GoToSurfTest {

    static final BattleField FIELD = new BattleField(800, 600);

    @Test
    @Tag("MOVE-2")
    @DisplayName("each go-to candidate is scored along its own way round, not the last surf's")
    void orbitSideIsTheCandidates() {
        // The enemy fired from (400, 500); Hadur is 300 px due south of it.
        Wave w = new Wave("enemy", new Point2D.Double(400, 500), new Point2D.Double(400, 200), 0, 0, 2,
            0, 0, 1, FIELD, new MovementPredictor(FIELD));
        RobotState me = RobotState.newBuilder().setLocation(new Point2D.Double(400, 200)).setTime(5).build();
        // East of Hadur the bearing from the source falls below pi: counter-clockwise.
        assertEquals(SurfMover.SurfOption.COUNTER_CLOCKWISE,
            SurfMover.orbitSide(w, me, new Point2D.Double(500, 200)));
        assertEquals(SurfMover.SurfOption.CLOCKWISE,
            SurfMover.orbitSide(w, me, new Point2D.Double(300, 200)));
    }
}

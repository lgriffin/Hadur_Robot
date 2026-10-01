package hadur2.core.physics;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur2.core.model.RobotState;
import java.awt.geom.Point2D;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** PHYS-1: a predicted robot that meets a wall is stopped dead, as the engine stops it. */
@Tag("PHYS-1")
class WallStopTest {

    @Test
    @DisplayName("a robot driven into the east wall ends the tick on it with velocity 0")
    void stoppedAtTheWall() {
        BattleField field = new BattleField(800, 600);
        MovementPredictor p = new MovementPredictor(field);
        // Heading east (pi / 2) at full speed, 3 px from the legal-centre edge (x = 782).
        RobotState start = RobotState.newBuilder().setLocation(new Point2D.Double(779, 300))
            .setHeading(Math.PI / 2).setVelocity(8).setTime(0).build();
        RobotState end = p.predict(start, Double.POSITIVE_INFINITY, 0, 8, 1, false);
        assertEquals(0.0, end.velocity, 0);
        assertEquals(782, end.location.x, 1e-9);
    }

    @Test
    @DisplayName("the next tick starts again from standstill, not from the old speed")
    void restartsFromStandstill() {
        BattleField field = new BattleField(800, 600);
        MovementPredictor p = new MovementPredictor(field);
        RobotState start = RobotState.newBuilder().setLocation(new Point2D.Double(779, 300))
            .setHeading(Math.PI / 2).setVelocity(8).setTime(0).build();
        RobotState end = p.predict(start, Double.POSITIVE_INFINITY, 0, 8, 2, false);
        // Tick 2: velocity 0 -> 1 toward the wall, which stops it again.
        assertEquals(0.0, end.velocity, 0);
        assertTrue(end.location.x <= 782 + 1e-9);
    }

    @Test
    @DisplayName("away from walls nothing changes")
    void openFieldKeepsSpeed() {
        BattleField field = new BattleField(800, 600);
        MovementPredictor p = new MovementPredictor(field);
        RobotState start = RobotState.newBuilder().setLocation(new Point2D.Double(400, 300))
            .setHeading(Math.PI / 2).setVelocity(8).setTime(0).build();
        assertEquals(8.0, p.predict(start, Double.POSITIVE_INFINITY, 0, 8, 1, false).velocity, 0);
    }
}

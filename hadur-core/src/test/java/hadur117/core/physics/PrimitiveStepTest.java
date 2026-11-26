package hadur117.core.physics;

import static org.junit.jupiter.api.Assertions.assertEquals;

import hadur117.core.model.RobotState;
import java.awt.geom.Point2D;
import java.util.Random;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** TIME-14: the in-place step plays exactly as the state-building step, walls included. */
@Tag("TIME-14")
class PrimitiveStepTest {

    @Test
    @DisplayName("TIME-14: nextLocation on plain coordinates equals nextLocation on a state, bit for bit")
    void primitiveStepMatchesStateStep() {
        MovementPredictor p = new MovementPredictor(new BattleField(800, 600));
        Random r = new Random(14);
        for (int i = 0; i < 20_000; i++) {
            RobotState state = RobotState.newBuilder()
                .setLocation(new Point2D.Double(18 + r.nextDouble() * 764, 18 + r.nextDouble() * 564))
                .setHeading(r.nextDouble() * 2 * Math.PI).setVelocity(r.nextDouble() * 16 - 8).setTime(i).build();
            double go = r.nextDouble() * 4 * Math.PI - 2 * Math.PI;
            double max = 1 + r.nextInt(8);
            boolean ignore = r.nextBoolean();
            double[] s = {state.location.x, state.location.y, state.heading, state.velocity, 0, 0};
            for (int t = 0; t < 5; t++) {
                state = p.nextLocation(state, max, go, ignore);
                p.nextLocation(s, max, go, ignore);
                assertEquals(state.location.x, s[0], 0.0);
                assertEquals(state.location.y, s[1], 0.0);
                assertEquals(state.heading, s[2], 0.0);
                assertEquals(state.velocity, s[3], 0.0);
            }
        }
    }
}

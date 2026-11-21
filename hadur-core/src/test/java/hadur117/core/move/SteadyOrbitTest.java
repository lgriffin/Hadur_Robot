package hadur117.core.move;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur117.core.move.SurfMover.SurfOption;
import hadur117.core.physics.BattleField;
import hadur117.core.physics.MovementPredictor;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** MOVE-47: the steady orbit's choice between the three options. */
class SteadyOrbitTest {

    @Test
    @Tag("MOVE-47")
    @DisplayName("off, the three options are chosen as before: the stop wins ties, then counter-clockwise")
    void offChoosesAsBefore() {
        assertEquals(SurfOption.STOP, SurfMover.choose(1, 1, 1, SurfOption.CLOCKWISE, false));
        assertEquals(SurfOption.CLOCKWISE, SurfMover.choose(2, 3, 1, SurfOption.COUNTER_CLOCKWISE, false));
        assertEquals(SurfOption.COUNTER_CLOCKWISE, SurfMover.choose(1, 3, 1, SurfOption.CLOCKWISE, false));
    }

    @Test
    @Tag("MOVE-47")
    @DisplayName("on, the stop is never taken and the way round is kept unless the other way is under half as dangerous")
    void onKeepsTheWayRound() {
        assertEquals(SurfOption.CLOCKWISE, SurfMover.choose(1, 0, 1, SurfOption.CLOCKWISE, true), "no stop");
        assertEquals(SurfOption.CLOCKWISE, SurfMover.choose(0.6, 0, 1, SurfOption.CLOCKWISE, true),
            "a slightly safer other way does not reverse");
        assertEquals(SurfOption.COUNTER_CLOCKWISE, SurfMover.choose(0.4, 0, 1, SurfOption.CLOCKWISE, true),
            "a known bullet or wall on this way reverses");
        assertEquals(SurfOption.COUNTER_CLOCKWISE, SurfMover.choose(1, 0, 0.6, SurfOption.COUNTER_CLOCKWISE, true));
        assertEquals(SurfOption.CLOCKWISE, SurfMover.choose(1, 0, 0.4, SurfOption.COUNTER_CLOCKWISE, true));
    }

    @Test
    @Tag("MOVE-47")
    @DisplayName("the switch is off by default and set per opponent")
    void offByDefault() {
        SurfMover m = new SurfMover(new BattleField(800, 600), new MovementPredictor(new BattleField(800, 600)));
        assertFalse(m.steadyOrbit());
        m.setSteadyOrbit(true);
        assertTrue(m.steadyOrbit());
    }
}

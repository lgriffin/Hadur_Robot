package hadur117.core.move;

import static org.junit.jupiter.api.Assertions.assertEquals;

import hadur117.core.move.SurfMover.SurfOption;
import hadur117.core.physics.BattleField;
import hadur117.core.physics.MovementPredictor;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** MOVE-48: stop less often, the stop margin in the three-option choice. */
class StopMarginTest {

    @Test
    @Tag("MOVE-48")
    @DisplayName("margin 1 keeps the shipped rule: the stop wins ties")
    void oneKeepsTheShippedRule() {
        assertEquals(SurfOption.STOP, SurfMover.choose(1, 1, 1, SurfOption.CLOCKWISE, false, 1.0));
        assertEquals(SurfOption.STOP, SurfMover.choose(2, 1.9, 3, SurfOption.CLOCKWISE, false, 1.0));
    }

    @Test
    @Tag("MOVE-48")
    @DisplayName("under 1, the stop is taken only when it is that much safer than each way round")
    void underOneNeedsAClearStop() {
        assertEquals(SurfOption.CLOCKWISE, SurfMover.choose(2, 1.9, 1.95, SurfOption.CLOCKWISE, false, 0.8),
            "a stop only slightly safer is not taken");
        assertEquals(SurfOption.COUNTER_CLOCKWISE, SurfMover.choose(1, 1, 1, SurfOption.CLOCKWISE, false, 0.9),
            "a tie goes to moving");
        assertEquals(SurfOption.STOP, SurfMover.choose(2, 1.5, 2, SurfOption.CLOCKWISE, false, 0.8),
            "a stop 25% safer is taken");
    }

    @Test
    @Tag("MOVE-48")
    @DisplayName("the steady orbit still never stops, whatever the margin")
    void steadyOrbitUnchanged() {
        assertEquals(SurfOption.CLOCKWISE, SurfMover.choose(1, 0, 1, SurfOption.CLOCKWISE, true, 0.8));
    }

    @Test
    @Tag("MOVE-48")
    @DisplayName("the margin is 1 by default")
    void defaultIsOne() {
        SurfMover m = new SurfMover(new BattleField(800, 600), new MovementPredictor(new BattleField(800, 600)));
        assertEquals(1.0, m.stopMargin());
        m.setStopMargin(0.9);
        assertEquals(0.9, m.stopMargin());
    }
}

package hadur2.core.duel;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur2.core.model.Wave;
import hadur2.core.physics.BattleField;
import hadur2.core.physics.MovementPredictor;
import java.awt.geom.Point2D;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** DIST-2, MOVE-19, MOVE-20: the duel decisions behind the surf-audit switches, and that they ship off. */
class DuelOnlySwitchesTest {

    private static Wave wave() {
        BattleField f = new BattleField(800, 600);
        return new Wave("enemy", new Point2D.Double(400, 500), new Point2D.Double(400, 200), 0, 0, 2,
            0, 0, 1, f, new MovementPredictor(f));
    }

    @Test
    @Tag("DIST-2")
    @DisplayName("hold650 on stops DIST-1 moving the target; off leaves it")
    void holdStopsDistance() {
        assertTrue(DuelController.distanceMoves(false));
        assertFalse(DuelController.distanceMoves(true));
    }

    @Test
    @Tag("MOVE-19")
    @DisplayName("bhb on logs an intercept whose wave was found; off or no wave does not")
    void interceptLogged() {
        assertTrue(DuelController.logsIntercept(true, wave()));
        assertFalse(DuelController.logsIntercept(false, wave()));
        assertFalse(DuelController.logsIntercept(true, null));
    }

    @Test
    @Tag("MOVE-20")
    @DisplayName("hitclr on clears the cache on a hit or intercept; off does not")
    void hitClears() {
        assertTrue(DuelController.clearsCacheOnHit(true));
        assertFalse(DuelController.clearsCacheOnHit(false));
    }

    @Test
    @Tag("DIST-2")
    @DisplayName("every switch ships off")
    void shippedOff() {
        assertFalse(MoveDesign.HOLD_650);
        assertFalse(MoveDesign.DISTANCING_TO_ENEMY);
        assertFalse(MoveDesign.BULLET_HIT_BULLET_LOG);
        assertFalse(MoveDesign.HIT_CLEARS_CACHE);
        assertFalse(MoveDesign.POINT_KERNEL);
        assertFalse(MoveDesign.KEEP_SECOND_WAVE);
    }
}

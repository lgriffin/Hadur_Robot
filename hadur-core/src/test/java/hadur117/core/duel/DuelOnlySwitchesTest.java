package hadur117.core.duel;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** MOVE-24, GUN-8 to GUN-10: the duel-only switch rule, and the gun switches shipping off. */
class DuelOnlySwitchesTest {

    @Test
    @Tag("MOVE-24")
    @DisplayName("a duel-only switch acts only in a duel; with enemiesTotal > 1 it reads as off")
    void moveSwitchesAreDuelOnly() {
        assertTrue(DuelController.duelOnly(true, 1));
        assertFalse(DuelController.duelOnly(true, 2));
        assertFalse(DuelController.duelOnly(true, 5));
        assertFalse(DuelController.duelOnly(false, 1));
    }

    @Test
    @Tag("MOVE-24")
    @DisplayName("MOVE-24: flattener off ships on, and only in a duel")
    void flattenerOffDuelOnly() {
        assertTrue(MoveDesign.FLATTENER_OFF, "3.15 ships it");
        assertTrue(DuelController.duelOnly(MoveDesign.FLATTENER_OFF, 1));
        assertFalse(DuelController.duelOnly(MoveDesign.FLATTENER_OFF, 3), "never in melee or team");
    }

    @Test
    @Tag("GUN-8")
    @Tag("GUN-9")
    @Tag("GUN-10")
    @DisplayName("the gun switches (thgun, freegun, nodecay) ship off")
    void gunSwitchesShipOff() {
        assertFalse(GunDesign.TRIPHAMMER);
        assertFalse(GunDesign.FREE_GUN);
        assertFalse(GunDesign.UNDECAYED);
    }

    @Test
    @Tag("MOVE-75")
    @DisplayName("MOVE-75: the driver guard ships off, and yields only a move rated over the ratio times the surf's best")
    void stopGuard() {
        assertFalse(MoveDesign.STOP_GUARD);
        // counter-clockwise, stop, clockwise
        double[] rated = {0.2, 1.0, 0.45};
        assertTrue(StopGuard.yields(rated, 0, 2.0), "the stop costs five times the best");
        assertTrue(StopGuard.yields(rated, 1, 2.0), "going clockwise costs over twice the best");
        assertFalse(StopGuard.yields(rated, -1, 2.0), "the best option itself never yields");
        assertFalse(StopGuard.yields(rated, 1, 3.0), "inside a ratio of three");
        assertFalse(StopGuard.yields(new double[] {0, 0, 0}, 0, 2.0), "nothing dangerous: the mover keeps the tick");
        assertFalse(StopGuard.yields(new double[] {0.2, Double.NaN, 0.4}, 0, 2.0), "an unrated move does not yield");
        assertFalse(StopGuard.yields(null, 0, 2.0));
    }
}

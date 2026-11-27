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
}

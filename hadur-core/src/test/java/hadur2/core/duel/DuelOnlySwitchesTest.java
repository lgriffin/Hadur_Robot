package hadur2.core.duel;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur2.core.model.Wave;
import hadur2.core.physics.BattleField;
import hadur2.core.shieldmode.ShieldList;
import hadur2.core.physics.MovementPredictor;
import java.awt.geom.Point2D;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** DIST-3, MOVE-19, MOVE-20, GUN-8 to GUN-10: the duel decisions behind the audit switches, and that they ship off. */
class DuelOnlySwitchesTest {

    private static Wave wave() {
        BattleField f = new BattleField(800, 600);
        return new Wave("enemy", new Point2D.Double(400, 500), new Point2D.Double(400, 200), 0, 0, 2,
            0, 0, 1, f, new MovementPredictor(f));
    }

    @Test
    @Tag("DIST-3")
    @DisplayName("hold650 on stops DIST-1 moving the target; off leaves it")
    void holdStopsDistance() {
        assertTrue(DuelController.distanceMoves(false));
        assertFalse(DuelController.distanceMoves(true));
    }

    @Test
    @Tag("DIST-3")
    @DisplayName("the new move switches act only in a duel; with enemiesTotal > 1 they read as off (hold650 gates FAR's shift too)")
    void moveSwitchesAreDuelOnly() {
        assertTrue(DuelController.duelOnly(true, 1));
        assertFalse(DuelController.duelOnly(true, 2));
        assertFalse(DuelController.duelOnly(true, 5));
        assertFalse(DuelController.duelOnly(false, 1));
        // The decision both onWave and the FAR shiftOut share: melee distance moves as before.
        assertTrue(DuelController.distanceMoves(DuelController.duelOnly(true, 3)));
        assertFalse(DuelController.distanceMoves(DuelController.duelOnly(true, 1)));
        assertTrue(DuelController.clearsCacheOnHit(DuelController.duelOnly(true, 1)));
        assertFalse(DuelController.clearsCacheOnHit(DuelController.duelOnly(true, 4)));
        assertFalse(DuelController.logsIntercept(DuelController.duelOnly(true, 4), wave()));
        assertTrue(DuelController.stackApplies(DuelController.duelOnly(true, 4), stackList(), "kc.mega.BeepBoop"));
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
    @Tag("DIST-3")
    @DisplayName("every switch ships off")
    void shippedOff() {
        assertFalse(MoveDesign.HOLD_650);
        assertFalse(MoveDesign.DISTANCING_TO_ENEMY);
        assertFalse(MoveDesign.BULLET_HIT_BULLET_LOG);
        assertFalse(MoveDesign.HIT_CLEARS_CACHE);
        assertFalse(MoveDesign.POINT_KERNEL);
        assertFalse(MoveDesign.KEEP_SECOND_WAVE);
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

    private static ShieldList stackList() {
        return ShieldList.parse(java.util.Arrays.asList(
            "apv.test.Virus 0.6.1", "stack-off: kc.mega.BeepBoop", "stack-off: jk.mega.DrussGT 3.1.16"));
    }

    @Test
    @Tag("MOVE-23")
    @DisplayName("stacklist on: a listed name, with or without its version, turns the stack off; an unlisted or unnamed one keeps it")
    void stackListPerOpponent() {
        ShieldList list = stackList();
        assertFalse(DuelController.stackApplies(true, list, "kc.mega.BeepBoop"));
        assertFalse(DuelController.stackApplies(true, list, "kc.mega.BeepBoop 2.0"));
        assertFalse(DuelController.stackApplies(true, list, "jk.mega.DrussGT 3.1.16"));
        assertTrue(DuelController.stackApplies(true, list, "jk.mega.DrussGT 3.1.17"), "a versioned entry is that version only");
        assertTrue(DuelController.stackApplies(true, list, "new.Stranger 1.0"));
        assertTrue(DuelController.stackApplies(true, list, null));
        assertTrue(DuelController.stackApplies(true, null, "kc.mega.BeepBoop"));
        assertTrue(DuelController.stackApplies(true, ShieldList.NONE, "kc.mega.BeepBoop"));
    }

    @Test
    @Tag("MOVE-23")
    @DisplayName("stacklist off: the stack applies to everyone, listed or not")
    void stackListOffUnchanged() {
        ShieldList list = stackList();
        assertTrue(DuelController.stackApplies(false, list, "kc.mega.BeepBoop"));
        assertTrue(DuelController.stackApplies(false, list, "new.Stranger 1.0"));
        assertFalse(MoveDesign.STACK_LIST);
    }

    @Test
    @Tag("MOVE-23")
    @DisplayName("stack-off lines are not shield-mode entries: the shield list's size and matches are as before")
    void stackLinesAreNotShieldEntries() {
        ShieldList list = stackList();
        assertTrue(list.matches("apv.test.Virus 0.6.1"));
        assertFalse(list.matches("kc.mega.BeepBoop"));
        assertTrue(list.onStackOffList("kc.mega.BeepBoop 9.9"));
        assertFalse(list.onStackOffList("apv.test.Virus 0.6.1"));
        assertTrue(ShieldList.parse(java.util.Arrays.asList("stack-off: a.B")).isEmpty(), "no shield entry, so no shield mode");
        assertFalse(ShieldList.parse(java.util.Arrays.asList("stack-off: a.B")).onStackOffList("c.D"));
    }
}

package hadur2.core.melee;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BattleModeTest {

    @Test
    @Tag("MELEE-1")
    void oneOpponentIsADuel() {
        assertEquals(BattleMode.DUEL, BattleMode.fromOthers(1));
        assertEquals(BattleMode.DUEL, BattleMode.fromOthers(0));
    }

    @Test
    @Tag("MELEE-1")
    void twoOrMoreOpponentsIsAMelee() {
        assertEquals(BattleMode.MELEE, BattleMode.fromOthers(2));
        assertEquals(BattleMode.MELEE, BattleMode.fromOthers(9));
    }

    @Test
    @Tag("MELEE-1")
    void eachModeNamesItsSubsystems() {
        assertEquals(BattleMode.Movement.WAVE_SURFING, BattleMode.DUEL.movement);
        assertEquals(BattleMode.Radar.NARROW_LOCK, BattleMode.DUEL.radar);
        assertEquals(BattleMode.Targeting.VIRTUAL_GUN_ARRAY, BattleMode.DUEL.targeting);
        assertEquals(BattleMode.Movement.MINIMUM_RISK, BattleMode.MELEE.movement);
        assertEquals(BattleMode.Radar.FULL_SWEEP, BattleMode.MELEE.radar);
        assertEquals(BattleMode.Targeting.CIRCULAR, BattleMode.MELEE.targeting);
    }
}

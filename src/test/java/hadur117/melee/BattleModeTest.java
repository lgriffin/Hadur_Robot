package hadur117.melee;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BattleModeTest {

    @Test
    void oneOpponentIsADuel() {
        assertEquals(BattleMode.DUEL, BattleMode.fromOthers(1));
        assertEquals(BattleMode.DUEL, BattleMode.fromOthers(0));
    }

    @Test
    void twoOrMoreOpponentsIsAMelee() {
        assertEquals(BattleMode.MELEE, BattleMode.fromOthers(2));
        assertEquals(BattleMode.MELEE, BattleMode.fromOthers(9));
    }

    @Test
    void eachModeNamesItsSubsystems() {
        assertEquals(BattleMode.Movement.WAVE_SURFING, BattleMode.DUEL.movement);
        assertEquals(BattleMode.Radar.NARROW_LOCK, BattleMode.DUEL.radar);
        assertEquals(BattleMode.Targeting.VIRTUAL_GUN_ARRAY, BattleMode.DUEL.targeting);
        assertEquals(BattleMode.Movement.MINIMUM_RISK, BattleMode.MELEE.movement);
        assertEquals(BattleMode.Radar.FULL_SWEEP, BattleMode.MELEE.radar);
        assertEquals(BattleMode.Targeting.CIRCULAR, BattleMode.MELEE.targeting);
    }
}

package hadur117.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("BattleMode enum")
class BattleModeTest {

    @Test
    @DisplayName("DUEL constant exists")
    void duelExists() {
        assertNotNull(BattleMode.DUEL);
    }

    @Test
    @DisplayName("MELEE constant exists")
    void meleeExists() {
        assertNotNull(BattleMode.MELEE);
    }

    @Test
    @DisplayName("exactly two enum values")
    void exactlyTwoValues() {
        assertEquals(2, BattleMode.values().length);
    }

    @Test
    @DisplayName("values() returns DUEL and MELEE in declaration order")
    void valuesOrder() {
        BattleMode[] vals = BattleMode.values();
        assertSame(BattleMode.DUEL, vals[0]);
        assertSame(BattleMode.MELEE, vals[1]);
    }

    @Test
    @DisplayName("valueOf(DUEL) returns DUEL")
    void valueOfDuel() {
        assertEquals(BattleMode.DUEL, BattleMode.valueOf("DUEL"));
    }

    @Test
    @DisplayName("valueOf(MELEE) returns MELEE")
    void valueOfMelee() {
        assertEquals(BattleMode.MELEE, BattleMode.valueOf("MELEE"));
    }

    @Test
    @DisplayName("valueOf with invalid name throws IllegalArgumentException")
    void valueOfInvalid() {
        assertThrows(IllegalArgumentException.class, () -> BattleMode.valueOf("UNKNOWN"));
    }

    @Test
    @DisplayName("valueOf with null throws NullPointerException")
    void valueOfNull() {
        assertThrows(NullPointerException.class, () -> BattleMode.valueOf(null));
    }

    @Test
    @DisplayName("name() returns correct string")
    void nameReturnsString() {
        assertEquals("DUEL", BattleMode.DUEL.name());
        assertEquals("MELEE", BattleMode.MELEE.name());
    }

    @Test
    @DisplayName("ordinal values are correct")
    void ordinalValues() {
        assertEquals(0, BattleMode.DUEL.ordinal());
        assertEquals(1, BattleMode.MELEE.ordinal());
    }
}

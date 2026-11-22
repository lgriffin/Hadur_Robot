package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** BENCH-291: a hung melee battle is killed inside a card's stall rule, so it cannot halt the card. */
class MeleeBattleTimeoutTest {

    @Test
    @Tag("BENCH-291")
    @DisplayName("a melee battle is killed after 20 minutes by default, well inside the 30-minute stall rule")
    void defaultInsideStall() {
        assertEquals(20, Bench.meleeBattleMinutes(Map.of()));
        assertTrue(Bench.MELEE_BATTLE_MINUTES < 30, "the kill must come before stall 30m halts the card");
    }

    @Test
    @Tag("BENCH-291")
    @DisplayName("--melee-battle-minutes sets it, and refuses less than a minute")
    void option() {
        assertEquals(45, Bench.meleeBattleMinutes(Map.of("melee-battle-minutes", "45")));
        assertThrows(IllegalArgumentException.class, () -> Bench.meleeBattleMinutes(Map.of("melee-battle-minutes", "0")));
    }
}

package hadur117.core.melee;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class MeleeEndgameTest {

    @Test
    @Tag("MEND-3")
    @DisplayName("MEND-3: ships on (BENCH-115); being a survivor's closest robot weighs 4 off a team with two opponents left")
    void far() {
        assertTrue(MeleeEndgame.THREE_FAR);
        assertEquals(2.0, MeleeEndgame.closestFactor(2.0, 2, false, false), 1e-9, "off: MMOVE-2 as before");
        assertEquals(4.0, MeleeEndgame.closestFactor(2.0, 2, false, true), 1e-9);
        assertEquals(2.0, MeleeEndgame.closestFactor(2.0, 2, true, true), 1e-9, "a team is untouched");
        assertEquals(2.0, MeleeEndgame.closestFactor(2.0, 3, false, true), 1e-9);
    }
}

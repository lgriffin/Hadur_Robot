package hadur2.core.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** A4: the adapter's facts carry the roster, our name, our starting energy and the sentry border. */
class BattleFactsTest {

    @Test
    @Tag("ROLE-1")
    @DisplayName("ROLE-1: the leader is known from its own starting energy, and only on a team")
    void leaderFromEnergy() {
        List<String> mates = List.of("hadur2.Hadur (2)", "hadur2.Hadur (3)");
        assertTrue(new BattleFacts(1200, 1200, 7, mates, "hadur2.Hadur (1)", 200, 0).leads());
        assertFalse(new BattleFacts(1200, 1200, 7, mates, "hadur2.Hadur (2)", 100, 0).leads());
        assertFalse(new BattleFacts(800, 600, 1, null, "hadur2.Hadur", 100, 0).leads());
        BattleFacts f = new BattleFacts(1200, 1200, 7, mates, "hadur2.Hadur (1)", 200, 100);
        assertEquals(5, f.enemies());
        assertEquals("hadur2.Hadur (1)", f.name());
        assertEquals(100, f.sentryBorder());
        assertEquals(BattleFacts.solo(800, 600, 1), new BattleFacts(800, 600, 1, List.of()));
    }
}

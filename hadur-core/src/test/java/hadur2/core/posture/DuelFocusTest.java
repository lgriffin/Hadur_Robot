package hadur2.core.posture;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.LinkedHashMap;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DuelFocusTest {

    private final DuelFocus focus = new DuelFocus();

    private static Map<String, Double> alive(Object... nameDistance) {
        Map<String, Double> m = new LinkedHashMap<>();
        for (int i = 0; i < nameDistance.length; i += 2) {
            m.put((String) nameDistance[i], ((Number) nameDistance[i + 1]).doubleValue());
        }
        return m;
    }

    @Test
    @Tag("GATE-3")
    @DisplayName("GATE-3: the duel focuses the closest opponent and keeps it while it lives")
    void closestThenSticky() {
        assertNull(focus.update(alive()));
        assertEquals("b", focus.update(alive("a", 400, "b", 200, "c", 300)));
        // Someone else coming closer does not change the duel's enemy.
        assertEquals("b", focus.update(alive("a", 100, "b", 500, "c", 300)));
        assertEquals("b", focus.target());
    }

    @Test
    @Tag("GATE-3")
    @DisplayName("GATE-3: when the focus dies, the closest survivor is next")
    void rechoosesOnDeath() {
        focus.update(alive("a", 400, "b", 200));
        focus.died("b");
        assertNull(focus.target());
        assertEquals("a", focus.update(alive("a", 400, "c", 500)));
        focus.died("zzz");
        assertEquals("a", focus.target());
    }

    @Test
    @Tag("GATE-4")
    @DisplayName("GATE-4: a focus missing from the living list is replaced")
    void missingFocusReplaced() {
        focus.update(alive("a", 100));
        assertEquals("c", focus.update(alive("c", 300, "d", 350)));
        focus.clear();
        assertNull(focus.target());
    }
}

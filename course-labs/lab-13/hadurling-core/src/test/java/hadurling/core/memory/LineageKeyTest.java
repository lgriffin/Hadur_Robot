package hadurling.core.memory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class LineageKeyTest {

    @Test
    @Tag("HL-24")
    @DisplayName("every version and duplicate marker of a robot shares one key")
    void versionsShareAKey() {
        assertEquals("abc.Shadow", LineageKey.of("abc.Shadow 3.84"));
        assertEquals("abc.Shadow", LineageKey.of("abc.Shadow 3.83c (2)"));
        assertEquals("abc.Shadow", LineageKey.of("abc.Shadow (1) (2)"));
        assertEquals("abc.Shadow", LineageKey.of("abc.Shadow"));
    }

    @Test
    @DisplayName("a name without a package is kept whole, and odd input never throws")
    void oddNames() {
        assertEquals("Crazy 1.0", LineageKey.of("Crazy 1.0"));
        assertEquals(LineageKey.UNKNOWN, LineageKey.of(null));
        assertEquals(LineageKey.UNKNOWN, LineageKey.of("   "));
        assertEquals("x (a)", LineageKey.of("x (a)"));
    }

    @Test
    @DisplayName("different robots get different file names, even if they differ only in unsafe characters")
    void stemsDiffer() {
        assertNotEquals(LineageKey.fileStem("a/b"), LineageKey.fileStem("a\\b"));
    }
}

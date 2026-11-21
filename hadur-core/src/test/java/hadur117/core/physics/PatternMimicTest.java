package hadur117.core.physics;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** MOVE-56: the truncated-lateral-velocity pattern-matcher mimic. */
class PatternMimicTest {

    @Test
    @Tag("MOVE-56")
    @DisplayName("a repeating oscillation is replayed: the aim is the arc length the match was followed by")
    void replaysRepeatingPattern() {
        PatternMimic pm = new PatternMimic();
        // 40 ticks at +7.5 then 40 at -7.5, over and over: the symbols are 7 and -7 (truncated).
        for (int i = 0; i < 400; i++) pm.observe((i / 40) % 2 == 0 ? 7.5 : -7.5);
        // At 400 we are at the start of a +7.5 run, after 40 ticks of -7.5; a 10-tick flight follows
        // the earlier matches by 10 ticks of +7.5.
        double offset = pm.offset(400, 200, 20);
        assertEquals(75.0 / 200, offset, 1e-9);
    }

    @Test
    @Tag("MOVE-56")
    @DisplayName("no aim before the history reaches past the search buffer, nor when the flight runs past it")
    void noAimWithoutHistory() {
        PatternMimic pm = new PatternMimic();
        for (int i = 0; i < 50; i++) pm.observe(8);
        assertTrue(Double.isNaN(pm.offset(50, 300, 11)));
        for (int i = 0; i < 100; i++) pm.observe(8);
        assertEquals(8.0 * (int) (300 / 11.0) / 300, pm.offset(150, 300, 11), 1e-9);
        assertTrue(Double.isNaN(pm.offset(150, 9000, 11)));
    }

    @Test
    @Tag("MOVE-56")
    @DisplayName("symbols truncate toward zero, so 7.9 and 7.1 match each other but not 8")
    void truncates() {
        PatternMimic a = new PatternMimic();
        for (int i = 0; i < 200; i++) a.observe(i % 2 == 0 ? 7.9 : 7.1);
        assertEquals(7.5 * 10 / 150.0, a.offset(200, 150, 15), 1e-9);
    }
}

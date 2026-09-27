package hadur2.core.policy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur2.core.memory.Estimate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** The rolling hit rate DIST-1 and POW-2 read. */
class HitWindowTest {

    @Test
    @DisplayName("an empty window knows nothing")
    void emptyIsNone() {
        assertSame(Estimate.NONE, new HitWindow().estimate());
    }

    @Test
    @DisplayName("the rate is over the last outcomes only")
    void rolls() {
        HitWindow w = new HitWindow(4);
        w.record(true);
        w.record(true);
        w.record(false);
        w.record(false);
        assertEquals(0.5, w.estimate().value(), 1e-12);
        w.record(false);
        w.record(false);
        assertEquals(0.0, w.estimate().value(), 1e-12, "the two hits rolled out");
        assertEquals(4, w.size());
        w.record(true);
        assertEquals(0.25, w.estimate().value(), 1e-12);
    }

    @Test
    @Tag("RES-2")
    @DisplayName("RES-2: a window never holds more than its capacity")
    void bounded() {
        HitWindow w = new HitWindow();
        for (int i = 0; i < 10_000; i++) w.record(i % 3 == 0);
        assertEquals(HitWindow.DEFAULT_CAPACITY, w.size());
        assertEquals(34.0 / 100, w.estimate().value(), 0.011);
        assertThrows(IllegalArgumentException.class, () -> new HitWindow(0));
    }

    @Test
    @Tag("DIAL-1")
    @DisplayName("DIAL-1: the estimate carries a margin that narrows with more outcomes")
    void marginNarrows() {
        HitWindow few = new HitWindow();
        HitWindow many = new HitWindow();
        for (int i = 0; i < 10; i++) few.record(i % 5 == 0);
        for (int i = 0; i < 100; i++) many.record(i % 5 == 0);
        assertEquals(few.estimate().value(), many.estimate().value(), 1e-12);
        assertTrue(many.estimate().margin() < few.estimate().margin() / 2);
    }
}

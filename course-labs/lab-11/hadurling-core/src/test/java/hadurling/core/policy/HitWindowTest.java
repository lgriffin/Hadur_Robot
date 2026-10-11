package hadurling.core.policy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class HitWindowTest {

    @Test
    @DisplayName("an empty window knows nothing")
    void empty() {
        assertSame(Estimate.NONE, new HitWindow().estimate());
        assertEquals(0, new HitWindow().size());
    }

    @Test
    @Tag("HL-26")
    @DisplayName("once full, the oldest outcome drops out")
    void rolls() {
        HitWindow w = new HitWindow(4);
        for (boolean hit : new boolean[] {true, true, false, false}) w.record(hit);
        assertEquals(0.5, w.estimate().value(), 0);
        w.record(false); // the first true falls out
        assertEquals(0.25, w.estimate().value(), 0);
        w.record(false); // the second true falls out
        assertEquals(0.0, w.estimate().value(), 0);
        assertEquals(4, w.size());
    }

    @Test
    @DisplayName("clear forgets everything")
    void clears() {
        HitWindow w = new HitWindow(4);
        w.record(true);
        w.clear();
        assertSame(Estimate.NONE, w.estimate());
    }

    @Test
    @DisplayName("a window needs room for at least one outcome")
    void capacity() {
        assertThrows(IllegalArgumentException.class, () -> new HitWindow(0));
        assertEquals(HitWindow.DEFAULT_CAPACITY, new HitWindow().capacity());
    }
}

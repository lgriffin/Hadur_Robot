package hadur2.core.policy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur2.core.memory.Estimate;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** MOVE-2's trigger and its order of flavours. */
class MoveFlavourTest {

    /** A profile that saw the enemy hit 10% of 2,000 waves. */
    static final Estimate BASELINE = Estimate.of(200, 2000);

    static List<MoveFlavour.Step> feed(MoveFlavour f, int waves, int hitsInTen) {
        List<MoveFlavour.Step> added = new ArrayList<>();
        for (int i = 0; i < waves; i++) {
            MoveFlavour.Step s = f.onWave(i % 10 < hitsInTen);
            if (s != null) added.add(s);
        }
        return added;
    }

    @Test
    @Tag("MOVE-2")
    @DisplayName("MOVE-2: a gun hitting at its profile's rate changes nothing")
    void atBaselineNothingChanges() {
        MoveFlavour f = new MoveFlavour(BASELINE);
        assertTrue(feed(f, 1000, 1).isEmpty());
        assertEquals(MoveFlavour.Step.BASE, f.step());
    }

    @Test
    @Tag("MOVE-2")
    @Tag("DIAL-1")
    @DisplayName("MOVE-2: hitting well above the baseline adds flavours in order, each on fresh evidence")
    void aboveBaselineAddsInOrder() {
        MoveFlavour f = new MoveFlavour(BASELINE);
        List<MoveFlavour.Step> added = feed(f, 400, 4);
        assertEquals(List.of(MoveFlavour.Step.FLATTENER, MoveFlavour.Step.GO_TO, MoveFlavour.Step.FAR), added);
        assertEquals(MoveFlavour.Step.FAR, f.step());
        assertNull(f.onWave(true), "nothing after the last");
    }

    @Test
    @Tag("MOVE-2")
    @Tag("DIAL-1")
    @DisplayName("MOVE-2: early hits change nothing until the live margin is narrow enough")
    void earlyHitsAreNoise() {
        MoveFlavour f = new MoveFlavour(BASELINE);
        assertNull(f.onWave(true), "one hit in one wave clears 10% but proves little");
        for (int i = 0; i < 8; i++) assertNull(f.onWave(false));
        int waves = 0;
        MoveFlavour g = new MoveFlavour(BASELINE);
        while (g.onWave(true) == null) waves++;
        assertTrue(waves >= 10, "even a gun that never misses waits for " + waves + " waves");
        assertEquals(MoveFlavour.Step.FLATTENER, g.step());
        assertTrue(g.trigger().value() > BASELINE.value(), "the change reports the rate that made it");
        assertTrue(g.trigger().within(MoveFlavour.MAX_MARGIN));
        assertTrue(Double.isNaN(g.live().value()), "and the window starts again");
    }

    @Test
    @Tag("MOVE-2")
    @DisplayName("MOVE-2: a stranger has no baseline and never changes flavour")
    void strangerNeverChanges() {
        MoveFlavour f = MoveFlavour.stranger();
        assertTrue(feed(f, 500, 9).isEmpty());
    }

    @Test
    @Tag("MOVE-2")
    @DisplayName("the comparison uses both margins")
    void aboveNeedsBothMargins() {
        assertTrue(MoveFlavour.above(Estimate.of(40, 100), BASELINE));
        assertFalse(MoveFlavour.above(Estimate.of(2, 10), BASELINE), "20% of 10 could be luck");
        assertFalse(MoveFlavour.above(Estimate.NONE, BASELINE));
    }
}

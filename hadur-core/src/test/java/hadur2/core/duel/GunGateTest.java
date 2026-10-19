package hadur2.core.duel;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur2.core.move.GunClassifier;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** MOVE-17: the gun gate closes the gun-heat wave against a learning gun. */
class GunGateTest {

    private static GunClassifier counted(int learned, int other) {
        GunClassifier c = new GunClassifier();
        for (int i = 0; i < learned; i++) c.record("learned");
        for (int i = 0; i < other; i++) c.record("headon");
        return c;
    }

    @Test
    @Tag("MOVE-17")
    @DisplayName("gate on: open before 6 hits and under 60% learned, closed from 6 hits at 60% learned")
    void gateClosesOnLearning() {
        assertTrue(DuelController.provisionalOffered(true, true, counted(0, 0).learning(), true));
        assertTrue(DuelController.provisionalOffered(true, true, counted(5, 0).learning(), true));
        assertTrue(DuelController.provisionalOffered(true, true, counted(3, 3).learning(), true));
        assertFalse(DuelController.provisionalOffered(true, true, counted(6, 0).learning(), true));
        assertFalse(DuelController.provisionalOffered(true, true, counted(4, 2).learning(), true));
    }

    @Test
    @Tag("MOVE-17")
    @DisplayName("gate off, or heat wave off, or gun not ready: learning changes nothing")
    void otherwiseAsMove11() {
        assertTrue(DuelController.provisionalOffered(true, false, true, true));
        assertFalse(DuelController.provisionalOffered(false, true, false, true));
        assertFalse(DuelController.provisionalOffered(true, true, false, false));
    }
}

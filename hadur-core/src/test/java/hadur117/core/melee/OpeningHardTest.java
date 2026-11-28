package hadur117.core.melee;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** MGUN-29: hit harder while the field is full. */
class OpeningHardTest {

    private static double hard(double p, double own, double target, int others) {
        return MeleeEnergyPolicy.openingHard(p, own, target, others, true, 5, 50.0, 3.0);
    }

    @Test
    @Tag("MGUN-29")
    @DisplayName("off on master")
    void offOnMaster() {
        assertFalse(MeleeEnergyPolicy.OPENING_HARD);
        assertEquals(1.92, MeleeEnergyPolicy.openingHard(1.92, 100, 100, 9), 1e-9);
    }

    @Test
    @Tag("MGUN-29")
    @DisplayName("with five or more alive and 50 energy a shot fires 3, past the lead cap")
    void raises() {
        assertEquals(3.0, hard(1.92, 100, 99, 9), 1e-9);
        assertEquals(3.0, hard(0.4, 80, 79.6, 5), 1e-9);
    }

    @Test
    @Tag("MGUN-29")
    @DisplayName("a hold, a finisher, a thin field or low energy keep the shot as it was")
    void keeps() {
        assertEquals(0.0, hard(0.0, 100, 100, 9), 1e-9);
        assertEquals(1.0, hard(1.0, 100, 12, 9), 1e-9);
        assertEquals(1.92, hard(1.92, 100, 100, 4), 1e-9);
        assertEquals(1.92, hard(1.92, 49, 100, 9), 1e-9);
    }

    @Test
    @Tag("MGUN-29")
    @DisplayName("never lowers the shot")
    void neverLowers() {
        assertEquals(3.0, hard(3.0, 100, 100, 9), 1e-9);
    }
}

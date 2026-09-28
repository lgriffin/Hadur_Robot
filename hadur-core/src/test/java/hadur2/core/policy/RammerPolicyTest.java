package hadur2.core.policy;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** RAM-1: recognising a robot that is simply driving at us. */
class RammerPolicyTest {

    @Test
    @Tag("RAM-1")
    @DisplayName("RAM-1: ten scans closing at 6 px/tick or more within 250 px activates the response")
    void tenClosingScansActivate() {
        RammerPolicy r = new RammerPolicy();
        for (int i = 0; i < 9; i++) {
            assertFalse(r.tick(200, 6.0), "not yet on scan " + (i + 1));
        }
        assertTrue(r.tick(200, 6.0), "ten closing scans should activate it");
    }

    @Test
    @Tag("RAM-1")
    @DisplayName("RAM-1: a closing speed under 6 px/tick never activates it")
    void slowApproachNeverActivates() {
        RammerPolicy r = new RammerPolicy();
        for (int i = 0; i < 30; i++) {
            assertFalse(r.tick(200, 5.9));
        }
    }

    @Test
    @Tag("RAM-1")
    @DisplayName("RAM-1: closing from beyond 250 px never activates it")
    void closingFromBeyondRangeNeverActivates() {
        RammerPolicy r = new RammerPolicy();
        for (int i = 0; i < 20; i++) {
            assertFalse(r.tick(400, 10.0), "distance 400 is still outside 250 px");
        }
    }

    @Test
    @Tag("RAM-1")
    @DisplayName("RAM-1: our own approach never counts as their closing speed")
    void ourOwnApproachDoesNotActivateIt() {
        // Distance is closing fast (as it would if only we were driving in), but the enemy's
        // own speed toward us, which is what tick() is given, is well under the threshold.
        RammerPolicy r = new RammerPolicy();
        double distance = 250;
        for (int i = 0; i < 20; i++) {
            distance -= 8;
            assertFalse(r.tick(distance, 1.0), "the enemy itself isn't closing");
        }
    }

    @Test
    @Tag("RAM-1")
    @DisplayName("RAM-1: once active it holds while the enemy stays within range, and clears once it backs out")
    void activeHoldsThenClearsOutsideRange() {
        RammerPolicy r = new RammerPolicy();
        for (int i = 0; i < 10; i++) {
            r.tick(200, 6.0);
        }
        assertTrue(r.active());
        // A tick that isn't closing at all no longer extends the run, but it's still close.
        assertTrue(r.tick(200, 0.0), "still within range: the response should hold");
        assertFalse(r.tick(550, 0.0), "backed out past 250 px: the response should clear");
    }

    @Test
    @Tag("RAM-1")
    @DisplayName("RAM-1: a new round forgets the run and the active state")
    void newRoundForgetsTheRun() {
        RammerPolicy r = new RammerPolicy();
        for (int i = 0; i < 10; i++) {
            r.tick(200, 6.0);
        }
        assertTrue(r.active());
        r.newRound();
        assertFalse(r.active());
        assertFalse(r.tick(50, 6.0), "one scan can't activate it on its own");
    }
}

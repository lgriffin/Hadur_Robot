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
        double distance = 250;
        r.tick(distance);
        for (int i = 0; i < 9; i++) {
            distance -= 6;
            assertFalse(r.tick(distance), "not yet on scan " + (i + 1));
        }
        distance -= 6;
        assertTrue(r.tick(distance), "ten closing scans should activate it");
    }

    @Test
    @Tag("RAM-1")
    @DisplayName("RAM-1: a closing rate under 6 px/tick never activates it")
    void slowApproachNeverActivates() {
        RammerPolicy r = new RammerPolicy();
        double distance = 250;
        r.tick(distance);
        for (int i = 0; i < 30; i++) {
            distance -= 5.9;
            assertFalse(r.tick(distance));
        }
    }

    @Test
    @Tag("RAM-1")
    @DisplayName("RAM-1: closing from beyond 250 px never activates it")
    void closingFromBeyondRangeNeverActivates() {
        RammerPolicy r = new RammerPolicy();
        double distance = 400;
        r.tick(distance);
        for (int i = 0; i < 20; i++) {
            distance -= 6;
            assertFalse(r.tick(distance), "distance " + distance + " is still outside 250 px");
        }
    }

    @Test
    @Tag("RAM-1")
    @DisplayName("RAM-1: once active it holds while the enemy stays within range, and clears once it backs out")
    void activeHoldsThenClearsOutsideRange() {
        RammerPolicy r = new RammerPolicy();
        double distance = 250;
        r.tick(distance);
        for (int i = 0; i < 10; i++) {
            distance -= 6;
            r.tick(distance);
        }
        assertTrue(r.active());
        // A tick that isn't closing at all no longer extends the run, but it's still close.
        assertTrue(r.tick(distance), "still within range: the response should hold");
        assertFalse(r.tick(distance + 300), "backed out past 250 px: the response should clear");
    }

    @Test
    @Tag("RAM-1")
    @DisplayName("RAM-1: a new round forgets the run and the active state")
    void newRoundForgetsTheRun() {
        RammerPolicy r = new RammerPolicy();
        double distance = 250;
        r.tick(distance);
        for (int i = 0; i < 10; i++) {
            distance -= 6;
            r.tick(distance);
        }
        assertTrue(r.active());
        r.newRound();
        assertFalse(r.active());
        assertFalse(r.tick(50), "no baseline yet: one scan can't activate it");
    }
}

package hadur2.core.posture;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class PostureGateTest {

    private final PostureGate gate = new PostureGate();

    @Test
    @Tag("GATE-1")
    @DisplayName("GATE-1: two or more opponents, no sentries, no veto: melee")
    void meleeWhenTheGateHolds() {
        assertEquals(Posture.MELEE, gate.evaluate(2, 0));
        assertEquals(Posture.MELEE, gate.evaluate(9, 0));
        assertEquals(PostureGate.Veto.NONE, gate.veto());
    }

    @Test
    @Tag("GATE-2")
    @DisplayName("GATE-2: fewer than two opponents is a duel")
    void duelBelowTwo() {
        assertEquals(Posture.DUEL, gate.evaluate(1, 0));
        assertEquals(Posture.DUEL, gate.evaluate(0, 0));
    }

    @Test
    @Tag("GATE-1")
    @DisplayName("GATE-1: a sentry alive keeps the duel, whatever the opponent count")
    void sentryAliveKeepsTheDuel() {
        assertEquals(Posture.DUEL, gate.evaluate(5, 1));
        // Not sticky on its own: the count is re-read every tick.
        assertEquals(Posture.MELEE, gate.evaluate(5, 0));
    }

    @Test
    @Tag("GATE-3")
    @DisplayName("GATE-3: a scanned sentry vetoes melee for the rest of the round only")
    void scannedSentryVetoesTheRound() {
        gate.sentryScanned("samplesentry.BorderGuard");
        assertEquals(PostureGate.Veto.SENTRY, gate.veto());
        assertEquals(Posture.DUEL, gate.evaluate(5, 0));
        assertEquals(Posture.DUEL, gate.evaluate(2, 0));
        gate.newRound();
        assertEquals(Posture.MELEE, gate.evaluate(5, 0));
    }

    @Test
    @Tag("GATE-4")
    @DisplayName("GATE-4: a melee fault vetoes melee for the rest of the round")
    void faultVetoesTheRound() {
        gate.meleeFailed();
        assertEquals(PostureGate.Veto.FAULT, gate.veto());
        assertEquals(Posture.DUEL, gate.evaluate(7, 0));
        // A sentry seen after a fault does not hide the fault.
        gate.sentryScanned("s");
        assertEquals(PostureGate.Veto.FAULT, gate.veto());
        gate.newRound();
        assertEquals(Posture.MELEE, gate.evaluate(7, 0));
    }

    @Test
    @Tag("GATE-5")
    @DisplayName("GATE-5: a sentry's name is remembered for the battle")
    void sentriesRememberedAcrossRounds() {
        assertFalse(gate.isSentry("s"));
        assertFalse(gate.sentriesSeen());
        gate.sentryScanned("s");
        gate.newRound();
        assertTrue(gate.isSentry("s"));
        assertTrue(gate.sentriesSeen());
        assertFalse(gate.isSentry("t"));
        assertFalse(gate.isSentry(null));
    }

    @Test
    @Tag("RES-2")
    @DisplayName("RES-2: the sentry names are bounded")
    void sentryNamesBounded() {
        for (int i = 0; i < 1000; i++) gate.sentryScanned("s" + i);
        assertTrue(gate.isSentry("s0"));
        assertFalse(gate.isSentry("s" + PostureGate.MAX_SENTRIES));
    }
}

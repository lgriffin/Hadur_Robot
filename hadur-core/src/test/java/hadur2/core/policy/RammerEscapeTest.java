package hadur2.core.policy;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** RAM-2: the escape turns on only after a charge has really reached us this battle. */
class RammerEscapeTest {

    /** A charge from {@code from} px at 8 px/tick until {@code to} px; returns the last answer. */
    private static boolean charge(RammerPolicy r, double from, double to, double ours, double theirs) {
        boolean on = false;
        for (double d = from; d >= to; d -= 8) on = r.escape(d, 8.0, ours, theirs);
        return on;
    }

    @Test
    @Tag("RAM-2")
    @DisplayName("RAM-2: a charge that stops at 150 px (a strong bot closing in) never starts the escape")
    void chargeThatStopsShortNeverConfirms() {
        RammerPolicy r = new RammerPolicy();
        for (int round = 0; round < 5; round++) {
            assertFalse(charge(r, 500, 150, 100, 100));
            for (int i = 0; i < 50; i++) assertFalse(r.escape(150, 0.0, 100, 100));
            r.newRound();
        }
        assertFalse(r.confirmed());
    }

    /** Rams in two rounds: confirmed, and a fresh round. */
    private static RammerPolicy confirmedRammer() {
        RammerPolicy r = new RammerPolicy();
        charge(r, 500, 110, 100, 100);
        r.newRound();
        charge(r, 500, 110, 100, 100);
        return r;
    }

    @Test
    @Tag("RAM-2")
    @DisplayName("RAM-2: rams (charges reaching 120 px with both robots healthy) in two rounds confirm a rammer and start the escape")
    void closeChargesInTwoRoundsConfirm() {
        RammerPolicy r = new RammerPolicy();
        assertFalse(charge(r, 500, 110, 100, 100), "one ram is not enough");
        assertFalse(r.confirmed());
        assertFalse(charge(r, 500, 110, 100, 100), "nor two in the same round");
        r.newRound();
        assertTrue(charge(r, 500, 110, 100, 100));
        assertTrue(r.confirmed());
        assertTrue(r.escaping());
    }

    @Test
    @Tag("RAM-2")
    @DisplayName("RAM-2: closing in on a robot under 20 energy (finishing it) confirms nothing")
    void finishingIsNotRamming() {
        RammerPolicy r = new RammerPolicy();
        assertFalse(charge(r, 500, 30, 15, 100), "we are nearly dead");
        assertFalse(charge(r, 500, 30, 100, 15), "they are nearly dead");
        assertFalse(r.confirmed());
    }

    @Test
    @Tag("RAM-2")
    @DisplayName("RAM-2: a close pass that is not a charge (under four closing scans) confirms nothing")
    void briefApproachIsNotACharge() {
        RammerPolicy r = new RammerPolicy();
        for (int i = 0; i < 3; i++) r.escape(130 - 8 * i, 8.0, 100, 100);
        assertFalse(r.escape(100, 0.0, 100, 100));
        assertFalse(r.confirmed());
    }

    @Test
    @Tag("RAM-2")
    @DisplayName("RAM-2: once confirmed, later rounds start the escape on the second closing scan within 500 px")
    void laterRoundsStartAtRange() {
        RammerPolicy r = confirmedRammer();
        r.newRound();
        assertFalse(r.escaping(), "a new round starts with the escape off");
        assertFalse(r.escape(480, 8.0, 100, 100));
        assertTrue(r.escape(472, 8.0, 100, 100));
    }

    @Test
    @Tag("RAM-2")
    @DisplayName("RAM-2: the escape holds within 650 px and stops beyond")
    void releaseBeyond650() {
        RammerPolicy r = confirmedRammer();
        assertTrue(r.escape(300, 0.0, 100, 100));
        assertTrue(r.escape(640, -8.0, 100, 100));
        assertFalse(r.escape(660, 0.0, 100, 100));
    }

    @Test
    @Tag("RAM-2")
    @DisplayName("RAM-2: a new opponent forgets the confirmation")
    void forgetClearsConfirmation() {
        RammerPolicy r = confirmedRammer();
        r.forget();
        assertFalse(r.confirmed());
        assertFalse(r.escaping());
        assertFalse(charge(r, 500, 150, 100, 100));
    }
}

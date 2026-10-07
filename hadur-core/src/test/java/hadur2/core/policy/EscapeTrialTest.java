package hadur2.core.policy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur2.core.policy.EscapeTrial.Arm;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** RAM-3: the escape is tried for two rounds, then the arm with the better margin plays. */
class EscapeTrialTest {

    @Test
    @Tag("RAM-3")
    @DisplayName("RAM-3: with no rounds or only fought ones, the escape is tried")
    void triesTheEscapeFirst() {
        EscapeTrial t = new EscapeTrial();
        assertEquals(Arm.ESCAPE, t.choose());
        t.record(Arm.FIGHT, 90);
        t.record(Arm.FIGHT, 90);
        assertEquals(Arm.ESCAPE, t.choose(), "the fight's rounds alone decide nothing");
        t.record(Arm.ESCAPE, -40);
        assertEquals(Arm.ESCAPE, t.choose(), "one escape round is not a trial");
    }

    @Test
    @Tag("RAM-3")
    @DisplayName("RAM-3: after two rounds each, the arm with the higher mean margin plays")
    void higherMeanPlays() {
        EscapeTrial t = new EscapeTrial();
        t.record(Arm.FIGHT, 85);
        t.record(Arm.FIGHT, 75);
        t.record(Arm.ESCAPE, -40);
        t.record(Arm.ESCAPE, 10);
        assertEquals(Arm.FIGHT, t.choose());
        assertEquals(80, t.mean(Arm.FIGHT), 1e-9);
        assertEquals(-15, t.mean(Arm.ESCAPE), 1e-9);

        EscapeTrial rammer = new EscapeTrial();
        rammer.record(Arm.FIGHT, 20);
        rammer.record(Arm.FIGHT, -30);
        rammer.record(Arm.ESCAPE, 90);
        rammer.record(Arm.ESCAPE, 85);
        assertEquals(Arm.ESCAPE, rammer.choose());
    }

    @Test
    @Tag("RAM-3")
    @DisplayName("RAM-3: a tie keeps the escape, and a later run of bad fights brings it back")
    void tieAndRecovery() {
        EscapeTrial t = new EscapeTrial();
        t.record(Arm.FIGHT, 50);
        t.record(Arm.FIGHT, 50);
        t.record(Arm.ESCAPE, 50);
        t.record(Arm.ESCAPE, 50);
        assertEquals(Arm.ESCAPE, t.choose(), "a tie is the escape, 3.5's play");
        t.record(Arm.FIGHT, 100);
        assertEquals(Arm.FIGHT, t.choose());
        t.record(Arm.FIGHT, -100);
        t.record(Arm.FIGHT, -100);
        assertEquals(Arm.ESCAPE, t.choose());
    }

    @Test
    @Tag("RAM-3")
    @DisplayName("RAM-3: an unknown margin is not a sample, and a new opponent forgets them all")
    void nanAndForget() {
        EscapeTrial t = new EscapeTrial();
        t.record(Arm.ESCAPE, Double.NaN);
        assertEquals(0, t.rounds(Arm.ESCAPE));
        assertTrue(Double.isNaN(t.mean(Arm.ESCAPE)));
        t.record(Arm.FIGHT, 1);
        t.forget();
        assertEquals(0, t.rounds(Arm.FIGHT));
        assertFalse(t.rounds(Arm.ESCAPE) > 0);
    }

    @Test
    @Tag("RAM-3")
    @DisplayName("RAM-3: the rammer policy says whether this round has had a ram")
    void rammedThisRound() {
        RammerPolicy r = new RammerPolicy();
        assertFalse(r.rammedThisRound());
        for (double d = 500; d >= 110; d -= 8) r.escape(d, 8.0, 100, 100);
        assertTrue(r.rammedThisRound());
        r.newRound();
        assertFalse(r.rammedThisRound());
    }
}

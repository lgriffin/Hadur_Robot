package hadur2.core.role;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur2.core.model.BattleFacts;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class RoleResolverTest {

    private final RoleResolver gate = new RoleResolver(Charter.MELEE);

    @Test
    @Tag("ROLE-3")
    @DisplayName("ROLE-3: two or more enemies, no sentries, no veto, no Duel yet: melee")
    void meleeWhenTheGateHolds() {
        assertEquals(RoleId.MELEE, gate.resolve(2, 0, 0));
        assertEquals(RoleId.MELEE, gate.resolve(9, 0, 0));
        assertEquals(Veto.NONE, gate.veto());
    }

    @Test
    @Tag("GATE-2")
    @DisplayName("GATE-2: fewer than two enemies is a duel")
    void duelBelowTwo() {
        assertEquals(RoleId.DUEL, gate.resolve(1, 0, 0));
        assertEquals(RoleId.DUEL, gate.resolve(0, 0, 0));
    }

    @Test
    @Tag("ROLE-3")
    @Tag("ROLE-4")
    @DisplayName("ROLE-3, ROLE-4: a sentry alive keeps the duel, and once the Duel has driven it stays")
    void sentryAliveKeepsTheDuel() {
        assertEquals(RoleId.DUEL, gate.resolve(5, 0, 1));
        // Before the Duel has driven, the count alone decides, as the posture gate did.
        assertEquals(RoleId.MELEE, gate.resolve(5, 0, 0));
        // A1's one intended change: once the Duel has driven this round, a sentry that dies
        // unscanned no longer hands the round back to melee.
        gate.drove(RoleId.DUEL);
        assertEquals(RoleId.DUEL, gate.resolve(5, 0, 0));
        gate.newRound();
        assertEquals(RoleId.MELEE, gate.resolve(5, 0, 0));
    }

    @Test
    @Tag("ROLE-4")
    @DisplayName("ROLE-4: the latch only moves down, and only a new round clears it")
    void latchMovesDownOnly() {
        assertNull(gate.driven());
        gate.drove(RoleId.MELEE);
        assertEquals(RoleId.MELEE, gate.driven());
        gate.drove(RoleId.DUEL);
        assertEquals(RoleId.DUEL, gate.driven());
        gate.drove(RoleId.MELEE);
        assertEquals(RoleId.DUEL, gate.driven(), "a role above the latch never moves it back up");
        gate.newRound();
        assertNull(gate.driven());
    }

    @Test
    @Tag("GATE-3")
    @DisplayName("GATE-3: a scanned sentry vetoes melee for the rest of the round only")
    void scannedSentryVetoesTheRound() {
        gate.sentryScanned("samplesentry.BorderGuard");
        assertEquals(Veto.SENTRY, gate.veto());
        assertEquals(RoleId.DUEL, gate.resolve(5, 0, 0));
        assertEquals(RoleId.DUEL, gate.resolve(2, 0, 0));
        gate.newRound();
        assertEquals(RoleId.MELEE, gate.resolve(5, 0, 0));
    }

    @Test
    @Tag("GATE-4")
    @DisplayName("GATE-4: a melee fault vetoes melee for the rest of the round")
    void faultVetoesTheRound() {
        gate.meleeFailed();
        assertEquals(Veto.FAULT, gate.veto());
        assertEquals(RoleId.DUEL, gate.resolve(7, 0, 0));
        // A sentry seen after a fault does not hide the fault.
        gate.sentryScanned("s");
        assertEquals(Veto.FAULT, gate.veto());
        gate.newRound();
        assertEquals(RoleId.MELEE, gate.resolve(7, 0, 0));
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
        assertFalse(gate.isSentry("s" + RoleResolver.MAX_SENTRIES));
    }

    @Test
    @Tag("ROLE-1")
    @DisplayName("ROLE-1: the charter comes from the facts at tick 0")
    void charterFromFacts() {
        assertEquals(Charter.DUEL, Charter.of(BattleFacts.solo(800, 600, 1)));
        assertEquals(Charter.DUEL, Charter.of(BattleFacts.solo(800, 600, 0)));
        assertEquals(Charter.MELEE, Charter.of(BattleFacts.solo(1000, 1000, 2)));
        assertEquals(Charter.MELEE, Charter.of(BattleFacts.solo(1000, 1000, 9)));
        assertEquals(Charter.MELEE, Charter.of(new BattleFacts(1000, 1000, 9, null)));
        assertEquals(Charter.TEAM, Charter.of(new BattleFacts(1200, 1200, 9, List.of("a", "b", "c", "d"))));
        assertEquals(5, new BattleFacts(1200, 1200, 9, List.of("a", "b", "c", "d")).enemies());
    }

    @Test
    @Tag("ROLE-2")
    @DisplayName("ROLE-2: a Duel charter never asks for melee, whatever the counts")
    void duelCharterIsADuel() {
        RoleResolver duel = new RoleResolver(Charter.DUEL);
        assertEquals(RoleId.DUEL, duel.resolve(5, 0, 0));
        assertFalse(Charter.DUEL.has(RoleId.MELEE));
        assertTrue(Charter.MELEE.has(RoleId.DUEL));
    }

    @Test
    @Tag("ROLE-2")
    @DisplayName("ROLE-2: until the Team strand exists, a Team charter plays Melee then Duel")
    void teamCharterWithoutATeamStrand() {
        RoleResolver team = new RoleResolver(Charter.TEAM);
        assertEquals(RoleId.MELEE, team.resolve(5, 4, 0));
        assertEquals(RoleId.DUEL, team.resolve(1, 4, 0));
    }

    @Test
    @DisplayName("the core's posture accessor keeps the melee extension's two postures")
    void postureOfARole() {
        assertEquals(Posture.MELEE, RoleResolver.posture(RoleId.MELEE));
        assertEquals(Posture.DUEL, RoleResolver.posture(RoleId.DUEL));
        assertTrue(RoleId.TEAM.above(RoleId.MELEE));
        assertTrue(RoleId.MELEE.above(RoleId.DUEL));
        assertFalse(RoleId.DUEL.above(RoleId.DUEL));
    }
}

package hadur2.core.shield;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** SHIELD-3 and SHIELD-4's inputs: the shielder latch and the enemy's stillness. */
class ShieldOpenerTest {

    @Test
    @Tag("SHIELD-3")
    @DisplayName("SHIELD-3: one bullet destroyed by an enemy that has not moved latches the shielder")
    void oneBulletFromAStillEnemyLatches() {
        ShieldDetector d = new ShieldDetector();
        d.bulletIntercepted(true);
        assertTrue(d.shielded());
        assertEquals(1, d.totalIntercepts());
    }

    @Test
    @Tag("SHIELD-3")
    @DisplayName("SHIELD-3: bullets destroyed by an enemy that has moved are SHIELD-1's evidence only")
    void oneBulletFromAMovingEnemyDoesNot() {
        ShieldDetector d = new ShieldDetector();
        d.bulletIntercepted(false);
        d.bulletIntercepted();
        assertFalse(d.shielded());
        for (int i = 0; i < 2; i++) d.bulletIntercepted(false);
        assertTrue(d.shielded(), "SHIELD-1's four in twenty still latches it");
    }

    @Test
    @Tag("SHIELD-3")
    @DisplayName("SHIELD-3: a profile's shielder is one from the first shot, and the latch holds for the battle")
    void profileLatches() {
        ShieldDetector d = new ShieldDetector();
        d.knownShielder();
        assertTrue(d.shielded());
        for (int i = 0; i < 40; i++) d.bulletMissed();
        assertTrue(d.shielded());
    }

    @Test
    @Tag("SHIELD-3")
    @DisplayName("SHIELD-3: the enemy has not moved while it is at the same spot from the first scan")
    void stillEnemyHasNotMoved() {
        EnemyStillness s = new EnemyStillness();
        s.newRound();
        for (long t = 1; t <= 50; t++) s.scanned(t, 400, 300, 0);
        assertFalse(s.movedThisRound());
    }

    @Test
    @Tag("SHIELD-3")
    @DisplayName("SHIELD-3: any velocity, or a position off its start, means it has moved, for the rest of the round")
    void movementIsRemembered() {
        EnemyStillness s = new EnemyStillness();
        s.newRound();
        s.scanned(1, 400, 300, 0);
        s.scanned(2, 400, 300, 1);
        assertTrue(s.movedThisRound());
        s.scanned(3, 400, 300, 0);
        assertTrue(s.movedThisRound(), "it stopped again, but it moved");
        s.newRound();
        assertFalse(s.movedThisRound(), "a new round starts afresh");
        s.scanned(1, 400, 300, 0);
        s.scanned(2, 400.3, 300, 0);
        assertFalse(s.movedThisRound(), "scan rounding is not movement");
        s.scanned(3, 405, 300, 0);
        assertTrue(s.movedThisRound());
    }

    @Test
    @Tag("SHIELD-3")
    @DisplayName("SHIELD-3: where the history is unknown the enemy counts as having moved")
    void unknownHistoryIsMoved() {
        EnemyStillness s = new EnemyStillness();
        assertTrue(s.movedThisRound());
        s.newRound();
        s.scanned(1, 400, 300, 0);
        s.forget();
        assertTrue(s.movedThisRound());
        assertFalse(s.stillForTenTicks(500));
    }

    @Test
    @Tag("SHIELD-4")
    @DisplayName("SHIELD-4: the enemy is still once it has not moved for 10 ticks, and a step starts the count again")
    void tenStillTicks() {
        EnemyStillness s = new EnemyStillness();
        s.newRound();
        assertFalse(s.stillForTenTicks(5), "never scanned");
        for (long t = 100; t < 110; t++) {
            s.scanned(t, 400, 300, 0);
            assertFalse(s.stillForTenTicks(t), "tick " + t);
        }
        s.scanned(110, 400, 300, 0);
        assertTrue(s.stillForTenTicks(110));
        s.scanned(111, 400, 300, 2);
        assertFalse(s.stillForTenTicks(111));
        for (long t = 112; t < 121; t++) {
            s.scanned(t, 400, 300, 0);
            assertFalse(s.stillForTenTicks(t), "tick " + t);
        }
        s.scanned(121, 400, 300, 0);
        assertTrue(s.stillForTenTicks(121));
    }
}

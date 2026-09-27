package hadur2.core.shield;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** SHIELD-1: a shielder is told apart from bullets that meet by accident. */
@Tag("SHIELD-1")
class ShieldDetectorTest {

    private static void misses(ShieldDetector d, int n) {
        for (int i = 0; i < n; i++) d.bulletMissed();
    }

    @Test
    @DisplayName("a fresh detector sees no shield")
    void startsClear() {
        assertFalse(new ShieldDetector().shielded());
    }

    @Test
    @DisplayName("four bullets shot down in a row is a shield")
    void fourInARow() {
        ShieldDetector d = new ShieldDetector();
        for (int i = 0; i < 3; i++) d.bulletIntercepted();
        assertFalse(d.shielded(), "three is not enough evidence");
        d.bulletIntercepted();
        assertTrue(d.shielded());
        assertEquals(4, d.totalIntercepts());
    }

    @Test
    @DisplayName("an occasional collision among hits and misses is not a shield")
    void accidentalCollisions() {
        ShieldDetector d = new ShieldDetector();
        for (int round = 0; round < 50; round++) {
            d.bulletIntercepted();
            misses(d, 12);
            for (int i = 0; i < 7; i++) d.bulletHit();
        }
        assertFalse(d.shielded());
        assertEquals(50, d.totalIntercepts());
    }

    @Test
    @DisplayName("four shot down among twenty is under a quarter, five is a shield")
    void quarterOfTheWindow() {
        ShieldDetector d = new ShieldDetector();
        misses(d, 16);
        for (int i = 0; i < 4; i++) d.bulletIntercepted();
        assertFalse(d.shielded(), "4 of 20 is 20%");
        d.bulletIntercepted();
        assertTrue(d.shielded(), "5 of the last 20 is 25%");
    }

    @Test
    @DisplayName("only the last twenty bullets count")
    void windowSlides() {
        ShieldDetector d = new ShieldDetector();
        for (int i = 0; i < 3; i++) d.bulletIntercepted();
        misses(d, ShieldDetector.WINDOW);
        d.bulletIntercepted();
        assertFalse(d.shielded(), "the first three have left the window");
    }

    @Test
    @DisplayName("once found, the shield is assumed for the rest of the battle")
    void latches() {
        ShieldDetector d = new ShieldDetector();
        for (int i = 0; i < 4; i++) d.bulletIntercepted();
        misses(d, 100);
        assertTrue(d.shielded());
    }
}

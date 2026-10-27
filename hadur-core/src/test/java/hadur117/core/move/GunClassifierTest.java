package hadur117.core.move;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** MOVE-15: the gun classifier. */
class GunClassifierTest {

    private static GunClassifier counted(int learned, int headon) {
        GunClassifier c = new GunClassifier();
        for (int i = 0; i < learned; i++) c.record("learned");
        for (int i = 0; i < headon; i++) c.record("headon");
        return c;
    }

    @Test
    @Tag("MOVE-15")
    @DisplayName("below 6 hits the gun is never learning, whatever their class")
    void belowMinimumNeverLearning() {
        GunClassifier c = new GunClassifier();
        assertFalse(c.learning());
        for (int i = 0; i < GunClassifier.MIN_HITS - 1; i++) {
            c.record("learned");
            assertFalse(c.learning(), "after " + (i + 1) + " hits");
        }
    }

    @Test
    @Tag("MOVE-15")
    @DisplayName("6 learned hits are a learning gun")
    void sixLearnedLearning() {
        assertTrue(counted(6, 0).learning());
    }

    @Test
    @Tag("MOVE-15")
    @DisplayName("3 learned and 3 head-on hits (share 0.5) are not learning")
    void halfLearnedNotLearning() {
        assertFalse(counted(3, 3).learning());
    }

    @Test
    @Tag("MOVE-15")
    @DisplayName("4 learned of 6 (share 0.67) are learning; linear hits count as not learned")
    void twoThirdsLearned() {
        assertTrue(counted(4, 2).learning());
        GunClassifier c = counted(4, 0);
        c.record("linear");
        c.record("linear");
        assertTrue(c.learning());
    }

    @Test
    @Tag("MOVE-15")
    @DisplayName("reset clears the count")
    void resetClears() {
        GunClassifier c = counted(8, 0);
        assertTrue(c.learning());
        c.reset();
        assertFalse(c.learning());
        for (int i = 0; i < GunClassifier.MIN_HITS - 1; i++) c.record("learned");
        assertFalse(c.learning(), "the count restarted from 0");
    }
}

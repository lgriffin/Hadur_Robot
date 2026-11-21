package hadur117.core.move;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** MOVE-59: the aim members learn the waves that missed us. */
class AimMembersMissTest {

    @Test
    @Tag("MOVE-59")
    @DisplayName("a member that put its danger where we stood unharmed loses weight; one that put none there gains a little")
    void missMovesWeightAwayFromWhereWeStood() {
        AimMembers m = new AimMembers();
        double[] scores = new double[m.members()];
        java.util.Arrays.fill(scores, Double.NaN);
        scores[0] = 0.0;   // the views put nothing on where we were
        scores[1] = 1.6;   // the first aim put most of its mass there
        double before0 = m.weight(0);
        double before1 = m.weight(1);
        m.learnMiss(scores, 0.05, 8);
        assertTrue(m.weight(1) < before1);
        assertTrue(m.weight(0) > before0);
        assertEquals(0.0, m.score(2), 0.0);
    }

    @Test
    @Tag("MOVE-59")
    @DisplayName("a member scoring the uniform guess is not moved, and a bad uniform leaves every score alone")
    void uniformMemberIsUnmoved() {
        AimMembers m = new AimMembers();
        double[] scores = new double[m.members()];
        java.util.Arrays.fill(scores, Double.NaN);
        scores[0] = 2 * 0.05;
        m.learnMiss(scores, 0.05, 8);
        assertEquals(0.0, m.score(0), 1e-9);
        scores[0] = 1.9;
        m.learnMiss(scores, 0, 8);
        m.learnMiss(scores, 1, 8);
        assertEquals(0.0, m.score(0), 1e-9);
    }
}

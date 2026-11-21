package hadur117.core.move;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** MOVE-65: the EM danger mixture over the aim members. */
@Tag("MOVE-65")
class AimMembersEmTest {

    private static double[] scores(int members, int sure, double sureScore, double rest) {
        double[] s = new double[members];
        Arrays.fill(s, rest);
        s[sure] = sureScore;
        return s;
    }

    @Test
    void startsFromThePriorsAndAddsTwoFlattenerMembers() {
        AimMembers m = new AimMembers();
        m.enableEm(2);
        assertTrue(m.em());
        assertEquals(AimMembers.MEMBERS + 2, m.members());
        double total = 0;
        for (int i = 0; i < m.members(); i++) total += AimMembers.prior(i);
        assertEquals(AimMembers.EM_VIEW_PRIOR / total, m.weight(0), 1e-12);
        assertEquals(AimMembers.EM_PRIOR / total, m.weight(1), 1e-12);
    }

    @Test
    void aMemberThatCallsTheHitsAndPassesGainsWeight() {
        AimMembers m = new AimMembers();
        m.enableEm(2);
        int n = m.members();
        double before = m.weight(3);
        for (int k = 0; k < 30; k++) {
            // member 3 put all its mass on the hit and none on where we were when waves passed.
            m.learn(scores(n, 3, 2.0, 0.2), 0.05);
            m.learnPass(scores(n, 3, 0.0, 0.6), 0.05);
        }
        assertTrue(m.weight(3) > 5 * before, "weight " + m.weight(3) + " vs " + before);
        assertTrue(m.weight(3) > m.weight(4));
        assertEquals(30, m.bullets());
        assertEquals(60, m.waves());
    }

    @Test
    void aPassDoesNothingWithTheMixtureOffAndNaNMembersKeepTheirWeight() {
        AimMembers off = new AimMembers();
        off.learnPass(new double[off.members()], 0.05);
        assertEquals(0, off.bullets());
        AimMembers m = new AimMembers();
        m.enableEm(2);
        double[] s = scores(m.members(), 1, 2.0, 0.1);
        s[2] = Double.NaN;
        double w2 = m.weight(2);
        m.learnPass(s, 0.05);
        // n hits is 0, so the weights are still the priors.
        assertEquals(w2, m.weight(2), 1e-12);
    }
}

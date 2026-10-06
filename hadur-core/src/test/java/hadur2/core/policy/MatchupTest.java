package hadur2.core.policy;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur2.core.memory.Estimate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** MATCH-1: when this battle's guns already favour us. */
@Tag("MATCH-1")
class MatchupTest {

    private static Estimate rate(int hits, int shots) {
        return Estimate.of(hits, shots);
    }

    @Test
    @DisplayName("a weak bot's gun against ours reads as won once both have fired enough")
    void weakBotWon() {
        assertTrue(Matchup.won(rate(25, 100), rate(6, 100), false));
    }

    @Test
    @DisplayName("the top 10's numbers never read as won: they out-hit us")
    void topTenOpen() {
        // DrussGT and BeepBoop on the local bench: ours 7.6% and 5.0%, theirs 10.2% and 14.3%.
        assertFalse(Matchup.won(rate(76, 1000), rate(102, 1000), false));
        assertFalse(Matchup.won(rate(50, 1000), rate(143, 1000), false));
    }

    @Test
    @DisplayName("rates within each other's margins read as open")
    void closeOpen() {
        assertFalse(Matchup.won(rate(10, 100), rate(8, 100), false));
    }

    @Test
    @DisplayName("fewer than the minimum bullets on either side reads as open, however lopsided")
    void tooFewOpen() {
        int few = Matchup.MIN_BULLETS - 1;
        assertFalse(Matchup.won(rate(few, few), rate(0, 100), false));
        assertFalse(Matchup.won(rate(50, 100), rate(0, few), false));
        assertFalse(Matchup.won(Estimate.NONE, Estimate.NONE, false));
    }

    @Test
    @DisplayName("once won, it holds until our lower bound falls to their raw rate")
    void hysteresis() {
        // Our lower bound sits between their raw rate and their upper bound.
        Estimate ours = rate(30, 200);
        Estimate theirs = rate(14, 200);
        double lower = ours.value() - ours.margin();
        assertTrue(lower > theirs.value() && lower < theirs.value() + theirs.margin(), "setup");
        assertFalse(Matchup.won(ours, theirs, false));
        assertTrue(Matchup.won(ours, theirs, true));
        assertFalse(Matchup.won(rate(20, 200), theirs, true));
    }
}

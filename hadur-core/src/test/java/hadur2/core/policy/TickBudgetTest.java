package hadur2.core.policy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** The tick budget's levels and what each one sheds. */
class TickBudgetTest {

    static final long ALLOWANCE = 3_000_000L;

    @Test
    @Tag("TIME-1")
    @DisplayName("TIME-1: a tick over 70% of the allowance sheds a level for the next tick only")
    void slowTickShedsOneTick() {
        TickBudget b = new TickBudget();
        b.newRound();
        b.tickTook(2_000_000L, ALLOWANCE);
        assertEquals(0, b.level(), "66% is under the threshold");
        b.tickTook(2_200_000L, ALLOWANCE);
        assertEquals(1, b.level());
        b.tickTook(500_000L, ALLOWANCE);
        assertEquals(0, b.level(), "a quick tick restores it");
        assertEquals(1, b.slowTicks());
        assertEquals(1, b.maxLevel());
    }

    @Test
    @Tag("TIME-2")
    @DisplayName("TIME-2: each skipped turn drops a level for the rest of the round, down to the last")
    void skippedTurnsHoldForTheRound() {
        TickBudget b = new TickBudget();
        b.newRound();
        b.skippedTurn();
        b.tickTook(100_000L, ALLOWANCE);
        assertEquals(1, b.level());
        b.skippedTurn();
        b.tickTook(2_500_000L, ALLOWANCE);
        assertEquals(3, b.level(), "two skips and a slow tick");
        b.skippedTurn();
        b.skippedTurn();
        assertEquals(TickBudget.MAX_LEVEL, b.level());
        b.newRound();
        assertEquals(0, b.level(), "a new round starts at full computation");
        assertEquals(0, b.maxLevel());
    }

    @Test
    @Tag("TIME-1")
    @DisplayName("each level sheds more: second wave and go-to, then half k, then the virtual guns")
    void levelsShedInOrder() {
        assertEquals(2, TickBudget.wavesToSurf(0));
        assertTrue(TickBudget.goToAllowed(0));
        assertEquals(1, TickBudget.wavesToSurf(1));
        assertFalse(TickBudget.goToAllowed(1));
        assertEquals(1.0, TickBudget.kShare(1));
        assertEquals(0.5, TickBudget.kShare(2));
        assertTrue(TickBudget.virtualGuns(2));
        assertFalse(TickBudget.virtualGuns(3));
    }

    @Test
    @Tag("DIAL-2")
    @DisplayName("an unknown allowance never sheds")
    void noAllowanceNoShedding() {
        TickBudget b = new TickBudget();
        b.tickTook(Long.MAX_VALUE, 0);
        assertEquals(0, b.level());
    }

    @Test
    @Tag("TIME-3")
    @DisplayName("TIME-3: the first skip learns the real allowance from the tick that caused it")
    void firstSkipLearnsTheRealAllowance() {
        TickBudget b = new TickBudget();
        b.newRound();
        b.tickTook(2_000_000L, ALLOWANCE); // 2ms, under the guessed 3ms allowance
        assertEquals(-1, b.learnedAllowanceNanos(), "nothing learned before a skip");
        b.skippedTurn(); // the engine skipped anyway: the real allowance is under 2ms
        assertEquals(2_000_000L, b.learnedAllowanceNanos());
    }

    @Test
    @Tag("TIME-3")
    @DisplayName("TIME-3: once learned, the passed-in allowance is ignored and the learned one holds across rounds")
    void learnedAllowanceOverridesTheGuessAndSurvivesNewRound() {
        TickBudget b = new TickBudget();
        b.newRound();
        b.tickTook(1_000_000L, ALLOWANCE);
        b.skippedTurn(); // learns 1ms
        b.newRound();
        // 1.5ms is under the guessed 3ms allowance but over 70% of the learned 1ms one.
        b.tickTook(1_500_000L, ALLOWANCE);
        assertEquals(1, b.level(), "the learned 1ms allowance, not the guessed 3ms, should apply");
        assertEquals(1_000_000L, b.learnedAllowanceNanos(), "still holds after a new round");
    }

    @Test
    @Tag("TIME-3")
    @DisplayName("TIME-3: a later skip does not relearn the allowance")
    void onlyTheFirstSkipLearns() {
        TickBudget b = new TickBudget();
        b.newRound();
        b.tickTook(1_000_000L, ALLOWANCE);
        b.skippedTurn(); // learns 1ms
        b.tickTook(5_000_000L, ALLOWANCE);
        b.skippedTurn(); // must not overwrite the learned 1ms with 5ms
        assertEquals(1_000_000L, b.learnedAllowanceNanos());
    }

    @Test
    @Tag("TIME-3")
    @DisplayName("TIME-3: a measurement far below the guess is not trusted as the real allowance")
    void implausiblyTinyMeasurementIsNotLearned() {
        TickBudget b = new TickBudget();
        b.newRound();
        // A skip right after a tiny measured tick: plausible when something the adapter
        // does not time (a checkpoint write, a GC pause) caused the skip, not the tick
        // itself. Below 20% of the 3ms guess, so it must not become the allowance.
        b.tickTook(50_000L, ALLOWANCE);
        b.skippedTurn();
        assertEquals(-1, b.learnedAllowanceNanos(), "too small a share of the guess to trust");

        // A later skip whose tick is a plausible share of the guess still learns normally.
        b.tickTook(1_000_000L, ALLOWANCE);
        b.skippedTurn();
        assertEquals(1_000_000L, b.learnedAllowanceNanos());
    }
}

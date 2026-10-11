package hadurling.core.policy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class TickBudgetTest {

    private static final long ALLOWANCE = TickBudget.ALLOWANCE_NANOS;

    @Test
    @DisplayName("a new budget is at full computation")
    void startsAtZero() {
        assertEquals(0, new TickBudget().level());
    }

    @Test
    @Tag("HL-36")
    @DisplayName("a tick over 70% of the allowance sheds one level, for the next tick only")
    void slowTickCostsOneTick() {
        TickBudget budget = new TickBudget();
        budget.tickTook((long) (0.71 * ALLOWANCE));
        assertEquals(1, budget.level());
        budget.tickTook((long) (0.30 * ALLOWANCE));
        assertEquals(0, budget.level());
        assertEquals(1, budget.slowTicks());
    }

    @Test
    @Tag("HL-36")
    @DisplayName("a tick at or under 70% sheds nothing")
    void fastTick() {
        TickBudget budget = new TickBudget();
        budget.tickTook((long) (0.70 * ALLOWANCE));
        assertEquals(0, budget.level());
        assertEquals(0, budget.slowTicks());
    }

    @Test
    @Tag("HL-37")
    @DisplayName("a skipped turn sheds a level for the rest of the round, up to three")
    void skipsStick() {
        TickBudget budget = new TickBudget();
        budget.skippedTurn();
        assertEquals(1, budget.level());
        budget.tickTook(0); // a fast tick does not undo it
        assertEquals(1, budget.level());
        budget.skippedTurn();
        budget.skippedTurn();
        budget.skippedTurn();
        budget.skippedTurn();
        assertEquals(TickBudget.MAX_LEVEL, budget.level());
    }

    @Test
    @Tag("HL-37")
    @DisplayName("a slow tick on top of skips never passes the deepest level")
    void capped() {
        TickBudget budget = new TickBudget();
        for (int i = 0; i < 3; i++) budget.skippedTurn();
        budget.tickTook(10 * ALLOWANCE);
        assertEquals(3, budget.level());
        assertEquals(3, budget.maxLevel());
    }

    @Test
    @Tag("HL-38")
    @DisplayName("each level sheds more: half the neighbours, then no surfing, then no tree")
    void whatEachLevelSheds() {
        assertEquals(10, TickBudget.neighbours(0, 10));
        assertEquals(5, TickBudget.neighbours(1, 10));
        assertEquals(5, TickBudget.neighbours(2, 10));
        assertEquals(0, TickBudget.neighbours(3, 10));
        assertEquals(1, TickBudget.neighbours(1, 1));
        assertTrue(TickBudget.surfs(0));
        assertTrue(TickBudget.surfs(1));
        assertFalse(TickBudget.surfs(2));
        assertFalse(TickBudget.surfs(3));
    }
}

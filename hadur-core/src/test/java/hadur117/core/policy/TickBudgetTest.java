package hadur117.core.policy;

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
    @Tag("TIME-1")
    @DisplayName("TIME-1: the shadow-aware aim is shed from level 2, with the halving of k")
    void shadowAimShedAtLevelTwo() {
        assertTrue(TickBudget.shadowAim(0));
        assertTrue(TickBudget.shadowAim(1));
        assertFalse(TickBudget.shadowAim(2));
        assertFalse(TickBudget.shadowAim(3));
    }

    @Test
    @Tag("DIAL-2")
    @DisplayName("an unknown allowance never sheds")
    void noAllowanceNoShedding() {
        TickBudget b = new TickBudget();
        b.tickTook(Long.MAX_VALUE, 0);
        assertEquals(0, b.level());
    }
}

package hadur2.core.policy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import net.jqwik.api.ForAll;
import net.jqwik.api.Property;
import net.jqwik.api.Tag;
import net.jqwik.api.constraints.IntRange;

/** TIME-2: skipped turns shed levels to the cap and hold them for the round; since 3.11 nothing more follows. */
class TickBudgetProperties {

    @Property(tries = 300)
    @Tag("TIME-2")
    void nSkipsShedMinOfNAndTheCapAndTheLevelHoldsForTheRound(
            @ForAll @IntRange(min = 0, max = 12) int skips,
            @ForAll @IntRange(min = 0, max = 700) int quietTicks) {
        TickBudget b = new TickBudget();
        b.newRound();
        for (int i = 0; i < skips; i++) b.skippedTurn(i);
        for (int i = 0; i < quietTicks; i++) b.tickTook(0, 3_000_000);
        assertEquals(Math.min(TickBudget.MAX_LEVEL, skips), b.level());
    }

    @Property(tries = 100)
    @Tag("TIME-2")
    void aNewRoundClearsTheShedLevels(@ForAll @IntRange(min = 3, max = 10) int skips) {
        TickBudget b = new TickBudget();
        b.newRound();
        for (int i = 0; i < skips; i++) b.skippedTurn(i);
        b.newRound();
        assertEquals(0, b.level());
    }
}

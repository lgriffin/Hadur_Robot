package hadur2.core.policy;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import net.jqwik.api.ForAll;
import net.jqwik.api.Property;
import net.jqwik.api.Tag;
import net.jqwik.api.constraints.IntRange;
import net.jqwik.api.constraints.Size;

/** RES-14: duress is exactly three skips in the round and fewer than 300 ticks since the last. */
class TickBudgetProperties {

    @Property(tries = 300)
    @Tag("RES-14")
    void duressIsThreeSkipsAndFewerThan300TicksSinceTheLast(
            @ForAll @Size(max = 8) List<@IntRange(min = 0, max = 400) Integer> gaps,
            @ForAll @IntRange(min = 0, max = 700) int wait) {
        TickBudget b = new TickBudget();
        b.newRound();
        long now = 0;
        long lastSkip = -1;
        for (int gap : gaps) {
            now += gap;
            b.tickBegan(now);
            b.skippedTurn();
            lastSkip = now;
        }
        now += wait;
        b.tickBegan(now);
        boolean expected = gaps.size() >= TickBudget.DURESS_SKIPS
            && now - lastSkip < TickBudget.DURESS_QUIET_TICKS;
        assertEquals(expected, b.duress());
    }

    @Property(tries = 100)
    @Tag("RES-14")
    void aNewRoundClearsDuress(@ForAll @IntRange(min = 3, max = 10) int skips) {
        TickBudget b = new TickBudget();
        b.newRound();
        for (int i = 0; i < skips; i++) {
            b.tickBegan(i);
            b.skippedTurn();
        }
        b.newRound();
        b.tickBegan(0);
        assertFalse(b.duress());
    }
}

package hadur2.core.world;

import static hadur2.core.melee.Fixtures.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** RES-2 for the melee state that lives through a round. */
class EnemyTrackerBoundsTest {

    @Test
    @Tag("RES-2")
    void theTrackerStopsGrowingAtItsBound() {
        EnemyTracker t = new EnemyTracker();
        for (int i = 0; i < EnemyTracker.MAX_ENEMIES + 10; i++) scan(t, "bot" + i, 100, 100, 50, 0);
        assertEquals(EnemyTracker.MAX_ENEMIES, t.all().size());
    }

    @Test
    @Tag("RES-2")
    void externalLossesAreForgottenOutsideTheWindow() {
        EnemyTracker t = new EnemyTracker();
        EnemyInfo e = scan(t, "A", 100, 100, 100, 0);
        // A 5-point hit from someone else every 10 ticks for a whole round.
        double energy = 100;
        for (long time = 10; time <= 5_000; time += 10) {
            energy = energy <= 10 ? 100 : energy - 5;
            scan(t, "A", 100, 100, energy, time);
        }
        assertTrue(e.lossesHeld() <= EnemyInfo.LOSS_WINDOW / 10 + 1, "held " + e.lossesHeld());
    }
}

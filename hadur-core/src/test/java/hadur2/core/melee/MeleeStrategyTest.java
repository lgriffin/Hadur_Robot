package hadur2.core.melee;

import static hadur2.core.melee.Fixtures.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class MeleeStrategyTest {

    private final EnemyTracker tracker = new EnemyTracker();
    private final MeleeStrategy strategy = new MeleeStrategy();

    @Test
    void normalWhenNothingSpecialIsHappening() {
        scan(tracker, "a", 100, 100, 100, 0);
        scan(tracker, "b", 700, 100, 100, 0);
        scan(tracker, "c", 400, 500, 100, 0);
        assertEquals(MeleeStrategy.Posture.NORMAL,
            strategy.evaluate(tracker, pt(400, 300), 80, 3, 0).posture);
    }

    @Test
    void lowProfileWhenLeadingAMelee() {
        scan(tracker, "a", 100, 100, 50, 0);
        scan(tracker, "b", 700, 100, 60, 0);
        scan(tracker, "c", 400, 500, 70, 0);
        assertEquals(MeleeStrategy.Posture.LOW_PROFILE,
            strategy.evaluate(tracker, pt(400, 300), 90, 3, 0).posture);
    }

    @Test
    void aggressiveAgainstTheWeakerOfTheLastTwo() {
        scan(tracker, "a", 100, 100, 50, 0);
        scan(tracker, "b", 700, 100, 30, 0);
        MeleeStrategy.Plan plan = strategy.evaluate(tracker, pt(400, 300), 90, 2, 0);
        assertEquals(MeleeStrategy.Posture.AGGRESSIVE, plan.posture);
        assertEquals("b", plan.preferredTarget.name);
    }

    @Test
    void notAggressiveWhenBehindOnEnergy() {
        scan(tracker, "a", 100, 100, 50, 0);
        scan(tracker, "b", 700, 100, 30, 0);
        assertEquals(MeleeStrategy.Posture.NORMAL,
            strategy.evaluate(tracker, pt(400, 300), 40, 2, 0).posture);
    }

    @Test
    @Tag("MELEE-8")
    void letsAFightPlayOutAndWaitsForTheWeakerSurvivor() {
        scan(tracker, "a", 100, 450, 100, 0);
        scan(tracker, "b", 250, 450, 100, 0);
        scan(tracker, "c", 700, 100, 100, 0);
        scan(tracker, "a", 100, 450, 80, 10);
        scan(tracker, "b", 250, 450, 90, 10);
        MeleeStrategy.Plan plan = strategy.evaluate(tracker, pt(650, 300), 100, 3, 10);
        assertEquals(MeleeStrategy.Posture.LET_THEM_FIGHT, plan.posture);
        assertEquals("a", plan.preferredTarget.name);
    }

    @Test
    @Tag("MELEE-8")
    void postureScalesFirePower() {
        assertTrue(MeleeStrategy.adjustPower(2, MeleeStrategy.Posture.AGGRESSIVE) > 2);
        assertEquals(2, MeleeStrategy.adjustPower(2, MeleeStrategy.Posture.NORMAL));
        assertTrue(MeleeStrategy.adjustPower(2, MeleeStrategy.Posture.LOW_PROFILE) < 2);
        assertTrue(MeleeStrategy.adjustPower(2, MeleeStrategy.Posture.LET_THEM_FIGHT)
            < MeleeStrategy.adjustPower(2, MeleeStrategy.Posture.LOW_PROFILE));
        assertEquals(3.0, MeleeStrategy.adjustPower(2.9, MeleeStrategy.Posture.AGGRESSIVE));
        assertEquals(0.1, MeleeStrategy.adjustPower(0.1, MeleeStrategy.Posture.LET_THEM_FIGHT));
    }
}

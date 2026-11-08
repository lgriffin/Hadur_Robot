package hadur117.core.melee;

import hadur117.core.world.EnemyInfo;
import hadur117.core.world.EnemyTracker;
import static hadur117.core.melee.Fixtures.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
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
    @Tag("MMOVE-5")
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
    @Tag("MHIDE-1")
    @DisplayName("MHIDE-1: off by default; hides in a crowd of five, or of three when behind the median energy, never with two")
    void hide() {
        assertFalse(MeleeStrategy.HIDE, "ships off (arm mhide)");
        scan(tracker, "a", 100, 100, 50, 0);
        scan(tracker, "b", 700, 100, 60, 0);
        scan(tracker, "c", 400, 500, 70, 0);
        assertEquals(MeleeStrategy.Posture.LOW_PROFILE, strategy.evaluate(tracker, pt(400, 300), 90, 3, 0).posture,
            "the shipped robot: hide off");
        assertEquals(MeleeStrategy.Posture.LOW_PROFILE, strategy.evaluate(tracker, pt(400, 300), 90, 3, 0, true).posture,
            "ahead of the median with three left: no hiding");
        assertEquals(MeleeStrategy.Posture.HIDE, strategy.evaluate(tracker, pt(400, 300), 55, 3, 0, true).posture,
            "behind the median (60) with three left");
        assertEquals(MeleeStrategy.Posture.HIDE, strategy.evaluate(tracker, pt(400, 300), 100, 5, 0, true).posture,
            "five left: hide whatever the energy");
        assertEquals(MeleeStrategy.Posture.NORMAL, strategy.evaluate(tracker, pt(400, 300), 55, 2, 0, true).posture,
            "two left: the fight is on");
    }

    @Test
    @Tag("MHIDE-3")
    @DisplayName("MHIDE-3: Hadur is a target's nearest when no other living robot is closer to it")
    void nearestIs() {
        scan(tracker, "a", 500, 500, 50, 0);
        scan(tracker, "b", 500, 700, 60, 0);
        EnemyInfo a = tracker.get("a");
        assertTrue(MeleeStrategy.nearestIs(pt(500, 350), a, tracker.alive()), "150 px against b's 200");
        assertFalse(MeleeStrategy.nearestIs(pt(500, 250), a, tracker.alive()), "250 px against b's 200");
    }
}

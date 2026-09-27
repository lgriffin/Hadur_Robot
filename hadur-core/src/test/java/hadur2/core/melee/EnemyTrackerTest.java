package hadur2.core.melee;

import static hadur2.core.melee.Fixtures.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class EnemyTrackerTest {

    private final EnemyTracker tracker = new EnemyTracker();

    @Test
    @Tag("MRADAR-2")
    void opponentGoesStaleAfterTwentyTicksWithoutAScan() {
        EnemyInfo e = scan(tracker, "a", 100, 100, 100, 10);
        assertFalse(e.isStale(29));
        assertTrue(e.isStale(30));
    }

    @Test
    @Tag("MMOVE-1")
    void staleDataIsWeightedLower() {
        EnemyInfo e = scan(tracker, "a", 100, 100, 100, 0);
        assertEquals(1.0, e.freshness(8));
        assertTrue(e.freshness(20) < 1.0);
        assertTrue(e.freshness(200) >= 0.3);
        assertTrue(e.freshness(20) > e.freshness(40));
    }

    @Test
    @Tag("MGUN-1")
    void turnRateComesFromConsecutiveScans() {
        tracker.onScan("a", pt(100, 100), 100, 0.0, 8, 0);
        EnemyInfo e = tracker.onScan("a", pt(100, 108), 100, 0.2, 8, 2);
        assertEquals(0.1, e.turnRate(), 1e-9);
    }

    @Test
    void turnRateIsUnknownAfterOneScanOrALongGap() {
        EnemyInfo e = tracker.onScan("a", pt(100, 100), 100, 0.0, 8, 0);
        assertTrue(Double.isNaN(e.turnRate()));
        tracker.onScan("a", pt(100, 100), 100, 1.0, 8, 30);
        assertTrue(Double.isNaN(e.turnRate()));
    }

    @Test
    @Tag("MRADAR-2")
    void stalestIsTheOpponentScannedLongestAgo() {
        scan(tracker, "a", 100, 100, 100, 5);
        scan(tracker, "b", 200, 100, 100, 2);
        scan(tracker, "c", 300, 100, 100, 9);
        assertEquals("b", tracker.stalest().name);
    }

    @Test
    void deadOpponentsAreNotAlive() {
        scan(tracker, "a", 100, 100, 100, 5);
        scan(tracker, "b", 200, 100, 100, 5);
        tracker.onRobotDeath("a");
        assertEquals(1, tracker.alive().size());
        assertNull(tracker.get("a"));
    }

    @Test
    @Tag("MELEE-8")
    void damageFromOurBulletsIsNotCountedAsAnotherRobotsHit() {
        scan(tracker, "a", 100, 100, 100, 0);
        tracker.onBulletHit("a", 16);
        EnemyInfo a = scan(tracker, "a", 100, 100, 84, 5);
        assertEquals(0, a.recentExternalLoss(5));
    }

    @Test
    @Tag("MELEE-8")
    void opponentsLosingEnergyNearEachOtherAreFighting() {
        scan(tracker, "a", 100, 100, 100, 0);
        scan(tracker, "b", 250, 100, 100, 0);
        scan(tracker, "c", 700, 500, 100, 0);
        scan(tracker, "a", 100, 100, 88, 10);
        scan(tracker, "b", 250, 100, 90, 10);
        scan(tracker, "c", 700, 500, 100, 10);

        var pairs = tracker.engagedPairs(pt(700, 100), 10);
        assertEquals(1, pairs.size());
        assertTrue(java.util.Set.of("a", "b").contains(pairs.get(0)[0].name));

        // The losses age out of the window.
        assertTrue(tracker.engagedPairs(pt(700, 100), 10 + EnemyInfo.LOSS_WINDOW + 1).isEmpty());
    }

    @Test
    @Tag("MELEE-8")
    void firingCostsAreNotMistakenForDamage() {
        scan(tracker, "a", 100, 100, 100, 0);
        EnemyInfo a = scan(tracker, "a", 100, 100, 97, 5);
        assertEquals(0, a.recentExternalLoss(5));
    }

    @Test
    void newRoundForgetsEveryone() {
        scan(tracker, "a", 100, 100, 100, 0);
        tracker.newRound();
        assertTrue(tracker.alive().isEmpty());
    }
}

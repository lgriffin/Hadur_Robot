package hadur117.melee;

import static hadur117.melee.Fixtures.*;
import static org.junit.jupiter.api.Assertions.*;

import java.awt.geom.Point2D;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MeleeTargetSelectorTest {

    private final EnemyTracker tracker = new EnemyTracker();
    private final MeleeTargetSelector selector = new MeleeTargetSelector();
    private final Point2D.Double me = pt(400, 300);

    @BeforeEach
    void clearStats() {
        OpponentStatsBook.clear();
    }

    private EnemyInfo put(String name, double bearing, double distance, double energy) {
        Point2D.Double p = at(me, bearing, distance);
        return scan(tracker, name, p.x, p.y, energy, 0);
    }

    @Test
    void prefersLowEnergyCloseTargets() {
        put("A", 0, 200, 20);
        put("B", 90, 150, 80);
        put("C", 180, 400, 50);
        put("D", 270, 600, 10);
        assertEquals("A", selector.select(tracker, me, 0, 0, 100, null));
    }

    @Test
    void noOpponentsMeansNoTarget() {
        assertNull(selector.select(tracker, me, 0, 0, 100, null));
    }

    @Test
    void keepsTheCurrentTargetAgainstSmallImprovements() {
        put("A", 0, 300, 50);
        assertEquals("A", selector.select(tracker, me, 0, 0, 100, null));
        put("B", 10, 300, 45);
        assertEquals("A", selector.select(tracker, me, 0, 0, 100, null));
    }

    @Test
    void switchesImmediatelyWhenTheTargetDies() {
        put("A", 0, 300, 20);
        put("B", 90, 300, 60);
        assertEquals("A", selector.select(tracker, me, 0, 0, 100, null));
        tracker.onRobotDeath("A");
        selector.onRobotDeath("A");
        assertEquals("B", selector.select(tracker, me, 0, 1, 100, null));
    }

    @Test
    void doesNotSwingTheGunFarForABetterTarget() {
        put("A", 0, 400, 60);
        assertEquals("A", selector.select(tracker, me, 0, 0, 100, null));
        put("B", 170, 150, 10);
        assertEquals("A", selector.select(tracker, me, 0, 0, 100, null));
        put("C", 40, 150, 10);
        assertEquals("C", selector.select(tracker, me, 0, 0, 100, null));
    }

    @Test
    void strategyPreferenceWins() {
        put("A", 0, 200, 20);
        EnemyInfo b = put("B", 90, 500, 90);
        assertEquals("B", selector.select(tracker, me, 0, 0, 100, b));
    }

    @Test
    void threatOnlyCountsWhenEndangered() {
        EnemyInfo a = put("A", 0, 300, 50);
        double before = selector.score(a, me, 0, 0, 100);
        OpponentStatsBook.get("A").recordDamageReceived(50, Double.NaN, 0);
        assertEquals(before, selector.score(a, me, 0, 0, 100));
        OpponentStatsBook.clear();
        double calm = selector.score(a, me, 0, 0, 20);
        OpponentStatsBook.get("A").recordDamageReceived(50, Double.NaN, 0);
        assertTrue(selector.score(a, me, 0, 0, 20) < calm);
    }

    @Test
    void gunTurnTicksUseTwentyDegreesPerTick() {
        EnemyInfo e = put("A", 80, 300, 50);
        assertEquals(4.0, MeleeTargetSelector.gunTurnTicks(e, me, 0), 1e-9);
    }
}

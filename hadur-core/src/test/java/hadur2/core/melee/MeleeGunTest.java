package hadur2.core.melee;

import static hadur2.core.melee.Fixtures.*;
import static org.junit.jupiter.api.Assertions.*;

import hadur2.core.physics.DiaUtils;
import java.awt.geom.Point2D;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class MeleeGunTest {

    private final MeleeGun gun = new MeleeGun(field(800, 600));
    private final EnemyTracker tracker = new EnemyTracker();
    private final Point2D.Double me = pt(400, 100);

    @Test
    @Tag("MGUN-1")
    void stationaryTargetIsAimedAtDirectly() {
        EnemyInfo e = scan(tracker, "a", 400, 400, 100, 0);
        MeleeGun.Aim aim = gun.aim(me, e, 2.0, 0);
        assertEquals(DiaUtils.absoluteBearing(me, e.location), aim.angle, 1e-9);
    }

    @Test
    @Tag("MGUN-1")
    void linearPredictionLeadsAMovingTarget() {
        EnemyInfo e = scan(tracker, "a", 400, 400, 100, Math.PI / 2, 8, 0);
        MeleeGun.Aim aim = gun.aim(me, e, 2.0, 0);
        assertEquals(MeleeGun.Strategy.LINEAR, aim.strategy);
        assertTrue(aim.predicted.x > 400);
        // The bullet and the robot arrive together.
        double flight = me.distance(aim.predicted) / (20 - 3 * 2.0);
        assertEquals(aim.predicted.x - 400, 8 * Math.ceil(flight), 8.0 + 1e-9);
    }

    @Test
    @Tag("MGUN-1")
    void circularPredictionFollowsTheTurn() {
        tracker.onScan("a", pt(400, 400), 100, Math.PI / 2, 8, 0);
        EnemyInfo e = tracker.onScan("a", pt(416, 400), 100, Math.PI / 2 + 0.2, 8, 2);
        MeleeGun.Aim aim = gun.aim(me, e, 2.0, 2);
        assertEquals(MeleeGun.Strategy.CIRCULAR, aim.strategy);
        Point2D.Double straight = gun.predict(me, e, 2.0, 2, 0);
        // Turning clockwise from east bends the path south, toward us.
        assertTrue(aim.predicted.y < straight.y);
    }

    @Test
    @Tag("MGUN-1")
    void predictionAccountsForTimeSinceTheScan() {
        EnemyInfo e = scan(tracker, "a", 400, 400, 100, Math.PI / 2, 8, 0);
        Point2D.Double fresh = gun.predict(me, e, 2.0, 0, 0);
        Point2D.Double later = gun.predict(me, e, 2.0, 5, 0);
        assertTrue(later.x > fresh.x);
    }

    @Test
    @Tag("MGUN-1")
    void predictedRobotsStopAtWalls() {
        EnemyInfo e = scan(tracker, "a", 760, 400, 100, Math.PI / 2, 8, 0);
        Point2D.Double p = gun.predict(me, e, 0.5, 0, 0);
        assertTrue(p.x <= 782);
    }
}

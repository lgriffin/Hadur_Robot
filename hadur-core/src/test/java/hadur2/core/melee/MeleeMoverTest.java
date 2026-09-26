package hadur2.core.melee;

import static hadur2.core.melee.Fixtures.*;
import static org.junit.jupiter.api.Assertions.*;

import java.awt.geom.Point2D;
import java.util.List;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class MeleeMoverTest {

    private final MeleeMover mover = new MeleeMover(field(800, 600));
    private final EnemyTracker tracker = new EnemyTracker();

    @Test
    @Tag("MELEE-4")
    void wallRiskIsZeroAwayFromWallsAndRisesSharplyNearThem() {
        assertEquals(0, mover.wallRisk(pt(400, 300)));
        assertTrue(MeleeMover.wallTerm(40) > MeleeMover.wallTerm(50));
        assertTrue(MeleeMover.wallTerm(50) > MeleeMover.wallTerm(100));
        assertEquals(0, MeleeMover.wallTerm(MeleeMover.WALL_RANGE));
        double below = MeleeMover.wallTerm(30) - MeleeMover.wallTerm(40);
        double above = MeleeMover.wallTerm(60) - MeleeMover.wallTerm(70);
        assertTrue(below > 3 * above);
    }

    @Test
    @Tag("MELEE-4")
    void cornersAreRiskierThanWallMidpoints() {
        assertTrue(mover.cornerRisk(pt(60, 60)) > 0);
        assertEquals(0, mover.cornerRisk(pt(400, 60)));
    }

    @Test
    @Tag("MELEE-4")
    void closeEnemiesAreFarRiskierThanDistantOnes() {
        EnemyInfo e = scan(tracker, "a", 400, 300, 100, 0);
        Point2D.Double near = pt(400, 450), far = pt(400, 100);
        // 150px vs 200px: the close-range multiplier kicks in below 200.
        double ratio = mover.enemyRisk(near, near, e, 0) / mover.enemyRisk(far, far, e, 0);
        assertTrue(ratio > 3.0);
    }

    @Test
    @Tag("MELEE-4")
    void weakerEnemiesRepelLess() {
        EnemyInfo strong = scan(tracker, "s", 100, 100, 100, 0);
        EnemyInfo weak = scan(tracker, "w", 100, 100, 10, 0);
        Point2D.Double p = pt(400, 300);
        assertTrue(mover.enemyRisk(p, p, weak, 0) < mover.enemyRisk(p, p, strong, 0));
    }

    @Test
    @Tag("MELEE-4")
    void movingAcrossAnEnemyIsSaferThanMovingAtIt() {
        EnemyInfo e = scan(tracker, "a", 400, 600 - 40, 100, 0);
        Point2D.Double me = pt(400, 300);
        Point2D.Double toward = pt(400, 400), across = pt(500, 300);
        // Same distance to the enemy would favour neither; compare direction factor directly.
        double towardRisk = mover.enemyRisk(toward, me, e, 0) * sq(toward.distance(e.location));
        double acrossRisk = mover.enemyRisk(across, me, e, 0) * sq(across.distance(e.location));
        assertTrue(acrossRisk < towardRisk);
    }

    @Test
    @Tag("MELEE-4")
    void standingBetweenTwoEnemiesIsCrossfire() {
        scan(tracker, "a", 200, 300, 100, 0);
        scan(tracker, "b", 600, 300, 100, 0);
        List<EnemyInfo> enemies = tracker.alive();
        assertTrue(mover.crossfireRisk(pt(400, 300), enemies, 0) > 0);
        assertEquals(0, mover.crossfireRisk(pt(400, 550), enemies, 0));
    }

    @Test
    @Tag("MELEE-4")
    void escapeRoutesShrinkInCornersAndNextToEnemies() {
        assertEquals(8, mover.escapeRoutes(pt(400, 300), List.of()));
        assertTrue(mover.escapeRoutes(pt(50, 50), List.of()) <= 3);
        scan(tracker, "a", 400, 420, 100, 0);
        assertTrue(mover.escapeRoutes(pt(400, 300), tracker.alive()) < 8);
    }

    @Test
    @Tag("MELEE-4")
    void destinationStaysInsideTheField() {
        scan(tracker, "a", 400, 300, 100, 0);
        Point2D.Double d = mover.chooseDestination(pt(40, 40), tracker.alive(), 0,
            MeleeStrategy.Plan.normal());
        assertTrue(d.x > 18 && d.y > 18 && d.x < 782 && d.y < 582);
    }

    @Test
    @Tag("MELEE-4")
    void keepsItsDestinationWhileItIsStillGood() {
        scan(tracker, "a", 100, 100, 100, 0);
        Point2D.Double me = pt(400, 300);
        Point2D.Double first = mover.chooseDestination(me, tracker.alive(), 0, MeleeStrategy.Plan.normal());
        Point2D.Double second = mover.chooseDestination(me, tracker.alive(), 1, MeleeStrategy.Plan.normal());
        assertSame(first, second);
    }

    @Test
    void cutOffPointSitsBetweenTheTargetAndTheCentre() {
        EnemyInfo e = scan(tracker, "a", 100, 100, 30, 0);
        Point2D.Double cut = mover.cutOffPoint(e);
        Point2D.Double centre = pt(400, 300);
        assertTrue(cut.distance(centre) < e.location.distance(centre));
        assertEquals(220, cut.distance(e.location), 1e-6);
    }

    private static double sq(double d) {
        return d * d;
    }
}

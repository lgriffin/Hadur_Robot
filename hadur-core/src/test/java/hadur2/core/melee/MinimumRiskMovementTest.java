package hadur2.core.melee;

import static hadur2.core.melee.Fixtures.*;
import static org.junit.jupiter.api.Assertions.*;

import hadur2.core.model.RobotState;
import hadur2.core.model.RobotStateLog;
import java.awt.geom.Point2D;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class MinimumRiskMovementTest {

    private final MinimumRiskMovement move = new MinimumRiskMovement(field(1000, 1000));
    private final EnemyTracker tracker = new EnemyTracker(field(1000, 1000));
    private final MeleeStrategy.Plan normal = MeleeStrategy.Plan.normal();

    MinimumRiskMovementTest() {
        move.newRound();
    }

    private static RobotStateLog path(Point2D.Double at, double heading, double velocity, long... times) {
        RobotStateLog log = new RobotStateLog();
        for (long t : times) {
            log.addState(RobotState.newBuilder().setLocation(at).setHeading(heading)
                .setVelocity(velocity).setTime(t).build());
        }
        return log;
    }

    @Test
    @Tag("MMOVE-1")
    @DisplayName("MMOVE-1: every decision scores at least 120 candidate points")
    void scoresAtLeast120Points() {
        scan(tracker, "a", 300, 300, 100, 1);
        scan(tracker, "b", 700, 700, 100, 1);
        scan(tracker, "c", 900, 100, 100, 1);
        move.chooseDestination(pt(500, 500), 100, 3, tracker.alive(), 100, normal);
        assertTrue(move.lastCandidates() >= 120, "scored " + move.lastCandidates());
        assertEquals(MinimumRiskMovement.CANDIDATES, move.lastCandidates());
    }

    @Test
    @Tag("MMOVE-1")
    @DisplayName("MMOVE-1: the ring is 100 to 300 px, inside the walls, and short of the nearest opponent")
    void ringBounds() {
        scan(tracker, "far", 900, 900, 100, 1);
        List<Point2D.Double> c = move.candidates(pt(500, 500), 3, tracker.alive());
        double min = c.stream().mapToDouble(p -> p.distance(500, 500)).min().getAsDouble();
        double max = c.stream().mapToDouble(p -> p.distance(500, 500)).max().getAsDouble();
        assertEquals(100, min, 1e-9);
        assertEquals(300, max, 1e-9);

        EnemyTracker close = new EnemyTracker();
        scan(close, "near", 600, 500, 100, 1);
        for (Point2D.Double p : move.candidates(pt(500, 500), 3, close.alive())) {
            assertTrue(p.distance(500, 500) <= 80 + 1e-9, "past 80% of the nearest: " + p);
        }
        for (Point2D.Double p : move.candidates(pt(30, 30), 3, tracker.alive())) {
            assertTrue(p.x >= MinimumRiskMovement.WALL_MARGIN && p.y >= MinimumRiskMovement.WALL_MARGIN);
        }
    }

    @Test
    @Tag("MMOVE-1")
    @DisplayName("MMOVE-1: an old position does not pin Hadur, and the ring never collapses")
    void staleOpponentDoesNotCapTheRing() {
        scan(tracker, "gone", 520, 500, 100, 1);
        double stale = move.candidates(pt(500, 500), 3, tracker.alive(), 50).stream()
            .mapToDouble(p -> p.distance(500, 500)).max().getAsDouble();
        assertEquals(300, stale, 1e-9);
        // Stale from exactly STALE_TICKS on, as EnemyInfo.isStale has it; one tick younger still caps.
        double atStale = move.candidates(pt(500, 500), 3, tracker.alive(), 1 + EnemyInfo.STALE_TICKS).stream()
            .mapToDouble(p -> p.distance(500, 500)).max().getAsDouble();
        assertEquals(300, atStale, 1e-9);
        double young = move.candidates(pt(500, 500), 3, tracker.alive(), EnemyInfo.STALE_TICKS).stream()
            .mapToDouble(p -> p.distance(500, 500)).max().getAsDouble();
        assertEquals(MinimumRiskMovement.MIN_RING, young, 1e-9);
        for (Point2D.Double p : move.candidates(pt(500, 500), 3, tracker.alive(), 2)) {
            assertEquals(MinimumRiskMovement.MIN_RING, p.distance(500, 500), 1e-9);
        }
    }

    @Test
    @Tag("MMOVE-1")
    @DisplayName("MMOVE-1: Hadur heads away from a lone strong opponent")
    void headsAwayFromDanger() {
        scan(tracker, "a", 600, 500, 100, 1);
        Point2D.Double d = move.chooseDestination(pt(500, 500), 100, 3, tracker.alive(), 100, normal);
        assertTrue(d.distance(600, 500) > 150, "went to " + d);
    }

    @Test
    @Tag("MMOVE-2")
    @DisplayName("MMOVE-2: being an opponent's closest robot at least doubles its risk")
    void closestRobotDoubles() {
        Point2D.Double me = pt(500, 300);
        Point2D.Double p = pt(500, 350);
        // "a" at 500,500 is 150 from p. Its other neighbour is either further (Hadur is
        // closest) or nearer (someone else is).
        EnemyTracker far = new EnemyTracker();
        scan(far, "a", 500, 500, 100, 100);
        scan(far, "b", 900, 900, 100, 100);
        EnemyTracker near = new EnemyTracker();
        scan(near, "a", 500, 500, 100, 100);
        scan(near, "b", 500, 600, 100, 100);
        double closest = move.enemyRisk(p, move.view(me, 100, 100, 3, far.alive(), normal), 0);
        double notClosest = move.enemyRisk(p, move.view(me, 100, 100, 3, near.alive(), normal), 0);
        assertEquals(2.0, closest / notClosest, 1e-9);
    }

    @Test
    @Tag("MMOVE-2")
    @DisplayName("MMOVE-2: a neighbour unseen for a while is taken as far as it could have moved")
    void staleNeighbourDoesNotHideClosest() {
        Point2D.Double me = pt(500, 300);
        Point2D.Double p = pt(500, 350);
        EnemyTracker fresh = new EnemyTracker();
        scan(fresh, "a", 500, 500, 100, 100);
        scan(fresh, "b", 500, 600, 100, 100);
        EnemyTracker stale = new EnemyTracker();
        scan(stale, "a", 500, 500, 100, 100);
        // "b" was 100 px from "a" 60 ticks ago; it may be 480 px further away by now.
        scan(stale, "b", 500, 600, 100, 40);
        double seen = move.enemyRisk(p, move.view(me, 100, 100, 3, fresh.alive(), normal), 0);
        double unseen = move.enemyRisk(p, move.view(me, 100, 100, 3, stale.alive(), normal), 0);
        assertEquals(2.0, unseen / seen, 1e-9);
    }

    @Test
    @Tag("MMOVE-2")
    @DisplayName("MMOVE-2: the closest factor doubles again in the opening and rises for a recent shooter")
    void closestFactorOpeningAndShooter() {
        EnemyInfo a = scan(tracker, "a", 500, 500, 100, 1);
        Point2D.Double p = pt(500, 400);
        assertEquals(4.0, move.closestFactor(p, a, 1000, 10), 1e-9);
        assertEquals(2.0, move.closestFactor(p, a, 1000, 40), 1e-9);
        assertEquals(1.0, move.closestFactor(p, a, 50, 40), 1e-9);
        a.lastHitHadur = 20;
        assertEquals(3.0, move.closestFactor(p, a, 1000, 100), 1e-9);
        assertEquals(1.5, move.closestFactor(p, a, 50, 120), 1e-9);
        assertEquals(1.0, move.closestFactor(p, a, 50, 121), 1e-9);
    }

    @Test
    @Tag("MMOVE-3")
    @DisplayName("MMOVE-3: a recorded shot becomes a head-on and a linear virtual bullet")
    void shotBecomesTwoBullets() {
        Point2D.Double me = pt(500, 500);
        EnemyShot s = new EnemyShot("a", pt(500, 900), 9, 2.0);
        move.updateBullets(Arrays.asList(s), path(me, Math.PI / 2, 8, 8, 9, 10), me, 10);
        List<VirtualBullet> b = move.bullets();
        assertEquals(2, b.size());
        assertEquals(VirtualBullet.Aim.HEAD_ON, b.get(0).aim);
        assertEquals(Math.PI, Math.abs(b.get(0).heading), 1e-9);
        assertEquals(VirtualBullet.Aim.LINEAR, b.get(1).aim);
        // Hadur was driving east: the linear aim leads to the east of head-on.
        assertTrue(b.get(1).position(40).x > b.get(0).position(40).x);
        // The same shot again adds nothing.
        move.updateBullets(Arrays.asList(s), path(me, 0, 0, 10), me, 11);
        assertEquals(2, move.bullets().size());
    }

    @Test
    @Tag("MMOVE-3")
    @DisplayName("MMOVE-3: a point on a virtual bullet's path when Hadur gets there is risky")
    void bulletPathIsRisky() {
        Point2D.Double me = pt(500, 200);
        EnemyShot s = new EnemyShot("a", pt(500, 900), 10, 3.0);
        VirtualBullet hot = new VirtualBullet(s, VirtualBullet.Aim.HEAD_ON, Math.PI);
        List<VirtualBullet> bs = Arrays.asList(hot);
        // Hadur needs about 43 ticks to cover 300 px; the power-3 bullet (11 px/tick) is at
        // y = 500 about 46 ticks after it was fired at tick 10.
        double onPath = MinimumRiskMovement.bulletRisk(pt(500, 500), me, bs, 5);
        double aside = MinimumRiskMovement.bulletRisk(pt(800, 200), me, bs, 5);
        assertTrue(onPath > 1.0, "on path " + onPath);
        assertTrue(aside < 0.01, "aside " + aside);
        assertEquals(0, MinimumRiskMovement.bulletRisk(pt(500, 500), me, List.of(), 5));
    }

    @Test
    @Tag("MMOVE-3")
    @DisplayName("MMOVE-3: bullets are scored at the destination, not along the route")
    void routeIsNotScored() {
        Point2D.Double me = pt(500, 200);
        // A power-3 bullet flying east along y = 350 crosses the route to 500,500 about when
        // Hadur does, but is far from 500,500 on arrival: the destination is re-scored every
        // tick as Hadur moves, and scoring guessed paths along the route cost APS.
        EnemyShot s = new EnemyShot("a", pt(100, 350), 5, 3.0);
        List<VirtualBullet> bs = Arrays.asList(new VirtualBullet(s, VirtualBullet.Aim.HEAD_ON, Math.PI / 2));
        assertTrue(MinimumRiskMovement.bulletRisk(pt(500, 500), me, bs, 20) < 0.01);
        // Standing in its way at the right time is risky.
        assertTrue(MinimumRiskMovement.bulletRisk(pt(500, 350), pt(500, 340), bs, 40) > 1.0);
    }

    @Test
    @Tag("TIME-1")
    @DisplayName("TIME-1: bullets that stay far from every candidate are not scored")
    void farBulletsAreSkipped() {
        Point2D.Double me = pt(200, 200);
        EnemyShot far = new EnemyShot("a", pt(900, 900), 10, 2.0);
        EnemyShot near = new EnemyShot("b", pt(200, 700), 10, 2.0);
        VirtualBullet away = new VirtualBullet(far, VirtualBullet.Aim.HEAD_ON, Math.PI / 2);
        VirtualBullet coming = new VirtualBullet(near, VirtualBullet.Aim.HEAD_ON, Math.PI);
        List<VirtualBullet> kept = MinimumRiskMovement.relevant(Arrays.asList(away, coming), me, 10);
        assertEquals(Arrays.asList(coming), kept);
    }

    @Test
    @Tag("MMOVE-3")
    @DisplayName("MMOVE-3: a shot with an uncertain fire tick stays until its latest possible bullet passes")
    void lateShotStays() {
        Point2D.Double me = pt(500, 500);
        EnemyShot s = new EnemyShot("a", pt(500, 900), 0, 3.0, 10);
        move.updateBullets(Arrays.asList(s), path(me, 0, 0, 0), me, 1);
        move.updateBullets(Arrays.asList(s), path(me, 0, 0, 45), me, 45);
        assertEquals(2, move.bullets().size(), "fired as late as tick 10: 385 px flown of 400");
        move.updateBullets(Arrays.asList(s), path(me, 0, 0, 51), me, 51);
        assertEquals(0, move.bullets().size());
    }

    @Test
    @Tag("MMOVE-3")
    @DisplayName("MMOVE-3: every recorded shot becomes bullets once however long the round")
    void shotsConvertOnce() {
        Point2D.Double me = pt(500, 500);
        // One shot the tracker keeps offering, still in flight, among 700 that pass at once.
        EnemyShot kept = new EnemyShot("a", pt(500, 900), 1000, 1.0);
        for (long t = 1; t <= 700; t++) {
            List<EnemyShot> shots = Arrays.asList(kept, new EnemyShot("b", pt(500, 500), t - 10, 3.0));
            move.updateBullets(shots, path(me, 0, 0, t), me, t);
        }
        assertEquals(2, move.bullets().stream().filter(b -> b.shot == kept).count());
        assertEquals(2, move.bullets().size());
    }

    @Test
    @Tag("MMOVE-3")
    @DisplayName("MMOVE-3: virtual bullets stay until they pass Hadur")
    void bulletsExpire() {
        Point2D.Double me = pt(500, 500);
        EnemyShot s = new EnemyShot("a", pt(500, 900), 0, 3.0);
        move.updateBullets(Arrays.asList(s), path(me, 0, 0, 0), me, 1);
        assertEquals(2, move.bullets().size());
        move.updateBullets(List.of(), path(me, 0, 0, 30), me, 30);
        assertEquals(2, move.bullets().size(), "330 px flown of 400");
        move.updateBullets(List.of(), path(me, 0, 0, 45), me, 45);
        assertEquals(0, move.bullets().size(), "495 px flown: past Hadur");
    }

    @Test
    @Tag("MMOVE-4")
    @DisplayName("MMOVE-4: with two opponents left the ring shrinks to 80-200 px")
    void endgameRing() {
        scan(tracker, "a", 900, 900, 100, 1);
        List<Point2D.Double> c = move.candidates(pt(500, 500), 2, tracker.alive());
        assertEquals(MinimumRiskMovement.CANDIDATES, c.size());
        double min = c.stream().mapToDouble(p -> p.distance(500, 500)).min().getAsDouble();
        double max = c.stream().mapToDouble(p -> p.distance(500, 500)).max().getAsDouble();
        assertEquals(80, min, 1e-9);
        assertEquals(200, max, 1e-9);
    }

    @Test
    @Tag("MMOVE-4")
    @DisplayName("MMOVE-4: with two opponents left moving at an opponent costs more than moving across it")
    void endgameLateral() {
        scan(tracker, "a", 500, 900, 100, 1);
        scan(tracker, "b", 100, 100, 100, 1);
        Point2D.Double me = pt(500, 500);
        Point2D.Double toward = pt(500, 600), across = pt(600, 500);
        double three = ratio(me, toward, across, 3);
        double two = ratio(me, toward, across, 2);
        assertTrue(two > three, two + " vs " + three);
    }

    private double ratio(Point2D.Double me, Point2D.Double toward, Point2D.Double across, int others) {
        MinimumRiskMovement.View v = move.view(me, 100, 100, others, tracker.alive(), normal);
        // Compare the lateral factor alone: equal distances to "a" keep everything else the same.
        double t = move.enemyRisk(toward, v, 0) * Math.pow(toward.distance(500, 900), 2);
        double a = move.enemyRisk(across, v, 0) * Math.pow(across.distance(500, 900), 2);
        return t / a;
    }

    @Test
    @Tag("MMOVE-1")
    @DisplayName("MMOVE-1: the opening heads for the nearest wall, away from the corners")
    void openingSpot() {
        Point2D.Double spot = move.openingSpot(pt(100, 150));
        assertEquals(MinimumRiskMovement.OPENING_WALL_GAP, spot.x, 1e-9);
        assertEquals(MinimumRiskMovement.OPENING_CORNER_GAP, spot.y, 1e-9);
        Point2D.Double top = move.openingSpot(pt(500, 950));
        assertEquals(1000 - MinimumRiskMovement.OPENING_WALL_GAP, top.y, 1e-9);
        assertEquals(500, top.x, 1e-9);
    }

    @Test
    @Tag("MMOVE-1")
    @DisplayName("MMOVE-1: a recent position is riskier than open ground")
    void pastPositionsRepel() {
        scan(tracker, "a", 900, 900, 100, 1);
        move.chooseDestination(pt(300, 300), 100, 3, tracker.alive(), 100, normal);
        assertTrue(move.pastRisk(pt(300, 300)) > move.pastRisk(pt(600, 300)));
    }

    @Test
    @Tag("RES-6")
    @DisplayName("RES-6: the noise is fixed within a round and changes between rounds")
    void noiseIsDeterministic() {
        Point2D.Double p = pt(412, 377);
        double a = move.noise(p);
        assertEquals(a, move.noise(p));
        assertTrue(a >= 0 && a < MinimumRiskMovement.NOISE_K);
        move.newRound();
        boolean differs = false;
        for (int i = 0; i < 20 && !differs; i++) {
            MinimumRiskMovement other = new MinimumRiskMovement(field(1000, 1000));
            other.newRound();
            differs = other.noise(pt(40 * i, 40 * i)) != move.noise(pt(40 * i, 40 * i));
        }
        assertTrue(differs);
    }

    @Test
    @Tag("MMOVE-1")
    @DisplayName("MMOVE-1: the destination is kept until a clearly safer point appears")
    void hysteresis() {
        scan(tracker, "a", 800, 500, 100, 1);
        Point2D.Double me = pt(500, 500);
        Point2D.Double first = move.chooseDestination(me, 100, 3, tracker.alive(), 100, normal);
        Point2D.Double second = move.chooseDestination(me, 100, 3, tracker.alive(), 101, normal);
        assertSame(first, second);
    }
}

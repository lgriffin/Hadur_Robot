package hadur117.core.melee;

import static hadur117.core.melee.Fixtures.*;
import static org.junit.jupiter.api.Assertions.*;

import hadur117.core.model.RobotState;
import hadur117.core.model.RobotStateLog;
import hadur117.core.world.EnemyInfo;
import hadur117.core.world.EnemyShot;
import hadur117.core.world.EnemyTracker;
import java.awt.geom.Point2D;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** MMOVE-11..14: the crowd switches of pc-melee-crowd, each alone. */
class MeleeCrowdMovementTest {

    private final MinimumRiskMovement move = new MinimumRiskMovement(field(1000, 1000));
    private final EnemyTracker tracker = new EnemyTracker(field(1000, 1000));
    private final MeleeStrategy.Plan normal = MeleeStrategy.Plan.normal();

    MeleeCrowdMovementTest() {
        move.newRound();
    }

    private static RobotStateLog still(Point2D.Double at, long... times) {
        RobotStateLog log = new RobotStateLog();
        for (long t : times) {
            log.addState(RobotState.newBuilder().setLocation(at).setHeading(0).setVelocity(0).setTime(t).build());
        }
        return log;
    }

    private static int index(List<EnemyInfo> enemies, String name) {
        for (int i = 0; i < enemies.size(); i++) if (enemies.get(i).name.equals(name)) return i;
        throw new AssertionError(name);
    }

    @Test
    @Tag("MMOVE-11")
    @Tag("MMOVE-12")
    @Tag("MMOVE-13")
    @Tag("MMOVE-14")
    @DisplayName("MMOVE-11..14 ship off")
    void shipOff() {
        assertFalse(MinimumRiskMovement.MELEE_AIMED);
        assertFalse(MinimumRiskMovement.MELEE_HOPS);
        assertFalse(MinimumRiskMovement.MELEE_HEAT);
        assertFalse(MinimumRiskMovement.MELEE_CLOSER);
    }

    @Test
    @Tag("MMOVE-11")
    @DisplayName("MMOVE-11: a shot weighs 1/(1+k)^2 for the k other opponents nearer its shooter than Hadur")
    void aimed() {
        Point2D.Double me = pt(500, 500);
        scan(tracker, "a", 500, 900, 100, 1);
        scan(tracker, "b", 500, 800, 100, 1);
        scan(tracker, "c", 600, 900, 100, 1);
        EnemyShot s = new EnemyShot("a", pt(500, 900), 9, 2.0);
        assertEquals(1.0 / 9, MinimumRiskMovement.crowdWeight(s, me, tracker.alive()), 1e-12);
        move.crowd(true, false, false, false);
        move.updateMeleeBullets(List.of(s), still(me, 9, 10), me, 10, tracker.alive());
        assertEquals(2, move.bullets().size());
        for (VirtualBullet b : move.bullets()) assertEquals(1.0 / 9, b.weight, 1e-12);

        // Off, the same shot weighs 1, as MMOVE-3 has it.
        MinimumRiskMovement off = new MinimumRiskMovement(field(1000, 1000));
        off.newRound();
        off.updateMeleeBullets(List.of(s), still(me, 9, 10), me, 10, tracker.alive());
        for (VirtualBullet b : off.bullets()) assertEquals(1.0, b.weight, 1e-12);

        // Three nearer: under the floor, no bullets.
        scan(tracker, "d", 400, 900, 100, 1);
        EnemyShot t = new EnemyShot("a", pt(500, 900), 11, 2.0);
        assertEquals(1.0 / 16, MinimumRiskMovement.crowdWeight(t, me, tracker.alive()), 1e-12);
        move.updateMeleeBullets(List.of(t), still(me, 11, 12), me, 12, tracker.alive());
        assertEquals(2, move.bullets().size());
    }

    @Test
    @Tag("MMOVE-12")
    @DisplayName("MMOVE-12: with three or more left the ring hops 40 px to 0.45 of the nearest, 80 to 300 px")
    void hops() {
        scan(tracker, "a", 900, 500, 100, 1);
        scan(tracker, "b", 100, 900, 100, 1);
        scan(tracker, "c", 100, 100, 100, 1);
        move.crowd(false, true, false, false);
        List<Point2D.Double> c = move.candidates(pt(500, 500), 3, tracker.alive(), 1);
        assertEquals(40, c.stream().mapToDouble(p -> p.distance(500, 500)).min().getAsDouble(), 1e-9);
        assertEquals(180, c.stream().mapToDouble(p -> p.distance(500, 500)).max().getAsDouble(), 1e-9);
        // A near opponent: at least 80 px, still short of 80% of it.
        EnemyTracker near = new EnemyTracker(field(1000, 1000));
        scan(near, "a", 600, 500, 100, 1);
        scan(near, "b", 100, 900, 100, 1);
        scan(near, "c", 100, 100, 100, 1);
        assertEquals(80, move.candidates(pt(500, 500), 3, near.alive(), 1).stream()
            .mapToDouble(p -> p.distance(500, 500)).max().getAsDouble(), 1e-9);
        // Two left: the endgame ring, as before.
        double two = move.candidates(pt(500, 500), 2, tracker.alive(), 1).stream()
            .mapToDouble(p -> p.distance(500, 500)).max().getAsDouble();
        MinimumRiskMovement off = new MinimumRiskMovement(field(1000, 1000));
        assertEquals(off.candidates(pt(500, 500), 2, tracker.alive(), 1).stream()
            .mapToDouble(p -> p.distance(500, 500)).max().getAsDouble(), two, 1e-9);
    }

    @Test
    @Tag("MMOVE-13")
    @DisplayName("MMOVE-13: an opponent Hadur is nearest to fires an assumed shot when its gun could be cool")
    void heat() {
        Point2D.Double me = pt(500, 500);
        scan(tracker, "a", 500, 700, 100, 28);
        scan(tracker, "b", 900, 900, 100, 28);
        move.crowd(false, false, true, false);
        RobotStateLog log = still(me, 20, 29, 30, 31, 33, 45, 46);
        move.updateMeleeBullets(List.of(), log, me, 20, tracker.alive());
        assertTrue(move.bullets().isEmpty(), "guns still hot before tick 30");
        move.updateMeleeBullets(List.of(), log, me, 30, tracker.alive());
        // Only a: a is nearer b than Hadur is.
        long fromA = move.bullets().stream().filter(b -> b.shot.shooter.equals("a")).count();
        assertEquals(2, fromA);
        for (VirtualBullet b : move.bullets()) {
            assertEquals(MinimumRiskMovement.ASSUMED_WEIGHT, b.weight, 1e-12);
            assertEquals(MinimumRiskMovement.ASSUMED_POWER, b.shot.power, 1e-12);
        }
        int after = move.bullets().size();
        move.updateMeleeBullets(List.of(), log, me, 31, tracker.alive());
        assertEquals(after, move.bullets().size(), "not again until it cools: 14 ticks at power 2");
        // A seen shot of power 1 at tick 33 sets the next to 33 + 12.
        EnemyShot seen = new EnemyShot("a", pt(500, 700), 33, 1.0);
        move.updateMeleeBullets(List.of(seen), log, me, 33, tracker.alive());
        int withSeen = move.bullets().size();
        // The seen shot replaces the shot assumed at tick 30, in the same cooling window.
        assertTrue(move.bullets().stream().noneMatch(b -> b.shot.fireTime == 30), "one shot is not counted twice");
        assertEquals(2, withSeen);
        move.updateMeleeBullets(List.of(seen), log, me, 44, tracker.alive());
        assertEquals(withSeen, move.bullets().size());
        move.updateMeleeBullets(List.of(seen), log, me, 45, tracker.alive());
        assertTrue(move.bullets().stream().anyMatch(b -> b.shot.fireTime == 45 && b.shot.power == 1.0));
        assertEquals(14, MinimumRiskMovement.coolTicks(2.0));
        assertEquals(12, MinimumRiskMovement.coolTicks(1.0));
    }

    @Test
    @Tag("MMOVE-13")
    @DisplayName("MMOVE-13: an opponent with a nearer robot than Hadur fires no assumed shot")
    void heatOnlyFromWhoeverIsNearestHadur() {
        Point2D.Double me = pt(500, 500);
        scan(tracker, "a", 500, 900, 100, 28);
        scan(tracker, "b", 500, 820, 100, 28);
        move.crowd(false, false, true, false);
        move.updateMeleeBullets(List.of(), still(me, 30), me, 30, tracker.alive());
        assertTrue(move.bullets().stream().noneMatch(b -> b.shot.shooter.equals("a")));
        assertTrue(move.bullets().stream().noneMatch(b -> b.shot.shooter.equals("b")));
    }

    @Test
    @Tag("MMOVE-14")
    @DisplayName("MMOVE-14: an opponent's term divides by one plus the others nearer it than the point")
    void closer() {
        scan(tracker, "a", 800, 500, 100, 1);
        scan(tracker, "b", 850, 550, 100, 1);
        scan(tracker, "c", 100, 100, 100, 1);
        Point2D.Double me = pt(500, 500);
        Point2D.Double p = pt(600, 500);
        List<EnemyInfo> alive = tracker.alive();
        int ia = index(alive, "a"), ic = index(alive, "c");
        MinimumRiskMovement plain = new MinimumRiskMovement(field(1000, 1000));
        MinimumRiskMovement.View v = move.view(me, 100, 5, 3, alive, normal);
        move.crowd(false, false, false, true);
        assertEquals(plain.enemyRisk(p, v, ia) / 2, move.enemyRisk(p, v, ia), 1e-12, "b is nearer a than the point");
        assertEquals(plain.enemyRisk(p, v, ic), move.enemyRisk(p, v, ic), 1e-12, "none nearer c than the point");
        MinimumRiskMovement.View two = move.view(me, 100, 5, 2, alive, normal);
        assertEquals(plain.enemyRisk(p, two, ia), move.enemyRisk(p, two, ia), 1e-12, "two left: unchanged");
        // b's scan gone stale: its old place is no evidence of nearer prey.
        scan(tracker, "a", 800, 500, 100, 60);
        scan(tracker, "c", 100, 100, 100, 60);
        List<EnemyInfo> later = tracker.alive();
        MinimumRiskMovement.View late = move.view(me, 100, 60, 3, later, normal);
        int la = index(later, "a");
        assertEquals(plain.enemyRisk(p, late, la), move.enemyRisk(p, late, la), 1e-12, "a stale b is not counted");
    }

    @Test
    @Tag("MMOVE-15")
    @DisplayName("MMOVE-15: the melee surfer ships on (3.21), weighs shots by the crowd and plays a shooter's learned aims")
    void surf() {
        assertTrue(MinimumRiskMovement.MELEE_SURF, "on from 3.21 (PR #462)");
        Point2D.Double me = pt(500, 500);
        scan(tracker, "a", 500, 900, 100, 1);
        scan(tracker, "b", 500, 800, 100, 1);
        RobotStateLog log = still(me, 8, 9, 10, 20, 21, 22);
        TeamDanger danger = new TeamDanger(field(1000, 1000));
        move.surf(true);
        // Before the log is deep enough: head-on and linear, at the crowd weight (b is nearer a).
        EnemyShot first = new EnemyShot("a", pt(500, 900), 9, 2.0);
        move.updateMeleeBullets(List.of(first), log, me, 10, tracker.alive(), danger);
        assertEquals(2, move.bullets().size());
        for (VirtualBullet b : move.bullets()) assertEquals(0.25, b.weight, 1e-12);
        // Five hits logged at guess factor 0.5: the next shot's bullets are learned aims.
        for (int i = 0; i < TeamDanger.MIN_SAMPLES; i++) {
            danger.add(danger.sample(first, log.getState(9), Math.PI + 0.2));
        }
        EnemyShot next = new EnemyShot("a", pt(500, 900), 21, 2.0);
        move.updateMeleeBullets(List.of(next), log, me, 22, tracker.alive(), danger);
        double learned = move.bullets().stream().filter(b -> b.aim == VirtualBullet.Aim.LEARNED)
            .mapToDouble(b -> b.weight).sum();
        assertEquals(0.25 * TeamDanger.SHOT_WEIGHT, learned, 1e-9);
        // Five samples, but only the SURF_AIMS nearest are kept, with the shot's whole weight.
        assertEquals(MinimumRiskMovement.SURF_AIMS,
            move.bullets().stream().filter(b -> b.aim == VirtualBullet.Aim.LEARNED).count());
        // Off, or with no log given, the same shots are MMOVE-3's.
        MinimumRiskMovement off = new MinimumRiskMovement(field(1000, 1000));
        off.surf(false);
        off.newRound();
        off.updateMeleeBullets(List.of(first, next), log, me, 22, tracker.alive(), danger);
        assertEquals(4, off.bullets().size());
        for (VirtualBullet b : off.bullets()) assertEquals(1.0, b.weight, 1e-12);
    }

    @Test
    @Tag("MMOVE-15")
    @DisplayName("MMOVE-15: off a team the surfer chooses by the wave check; on a team it changes nothing")
    void surfChoosesByWaves() {
        scan(tracker, "a", 300, 300, 100, 1);
        scan(tracker, "b", 700, 700, 100, 1);
        scan(tracker, "c", 900, 100, 100, 1);
        MinimumRiskMovement plain = new MinimumRiskMovement(field(1000, 1000));
        plain.newRound();
        move.surf(true);
        Point2D.Double surfed = move.chooseDestination(pt(500, 500), 100, 3, tracker.alive(), 5, normal);
        // With no wave in the air the wave check's damage is level, so its pick is the least risk.
        assertEquals(plain.chooseDestination(pt(500, 500), 100, 3, tracker.alive(), 5, normal), surfed);
    }

    @Test
    @Tag("MMOVE-16")
    @DisplayName("MMOVE-16: with the mix on, a shot's share at Hadur is 1/d^2 over every robot but the shooter")
    void mix() {
        assertFalse(MinimumRiskMovement.MELEE_MIX);
        Point2D.Double me = pt(500, 500);
        scan(tracker, "a", 500, 900, 100, 1);
        scan(tracker, "b", 500, 700, 100, 1);
        EnemyShot shot = new EnemyShot("a", pt(500, 900), 9, 2.0);
        // Hadur 400 px from a, b 200 px: (1/400^2) / (1/400^2 + 1/200^2) = 0.2.
        assertEquals(0.2, MinimumRiskMovement.mixWeight(shot, me, tracker.alive()), 1e-12);
        RobotStateLog log = still(me, 8, 9, 10);
        move.surf(true);
        move.scalar(true, false, false);
        move.updateMeleeBullets(List.of(shot), log, me, 10, tracker.alive(), new TeamDanger(field(1000, 1000)));
        assertEquals(2, move.bullets().size());
        for (VirtualBullet b : move.bullets()) assertEquals(0.2, b.weight, 1e-12);
    }

    @Test
    @Tag("MMOVE-17")
    @DisplayName("MMOVE-17: a crowd both adds and multiplies; with no wave the least risk still wins")
    void pathDanger() {
        assertFalse(MinimumRiskMovement.MELEE_PATH_DANGER);
        // Risk measured from the least (1): c = 0, 1, 3 over a base of here - least = 1.
        double[] s = MinimumRiskMovement.pathDangerScores(new double[] {1, 2, 4}, new double[] {0, 0, 0}, 2, 10);
        assertArrayEquals(new double[] {0, 2, 12}, s, 1e-9);
        // Damage: 20 x 1/10 = 2 on a quiet point still loses to a point one risk step higher.
        double[] d = MinimumRiskMovement.pathDangerScores(new double[] {1, 2}, new double[] {1, 0}, 2, 10);
        assertArrayEquals(new double[] {2, 2}, d, 1e-9);
        // Where Hadur stands is the least: the median keeps the scale.
        double[] m = MinimumRiskMovement.pathDangerScores(new double[] {1, 3}, new double[] {0, 0}, 1, 10);
        assertArrayEquals(new double[] {0, 6}, m, 1e-9);
        scan(tracker, "a", 300, 300, 100, 1);
        scan(tracker, "b", 700, 700, 100, 1);
        scan(tracker, "c", 900, 100, 100, 1);
        MinimumRiskMovement plain = new MinimumRiskMovement(field(1000, 1000));
        plain.newRound();
        move.surf(true);
        move.scalar(false, true, false);
        assertEquals(plain.chooseDestination(pt(500, 500), 100, 3, tracker.alive(), 5, normal),
            move.chooseDestination(pt(500, 500), 100, 3, tracker.alive(), 5, normal), "no wave: least risk");
    }

    @Test
    @Tag("MMOVE-18")
    @DisplayName("MMOVE-18: a robot nearer a wave's source shades the angles behind it")
    void shade() {
        assertFalse(MinimumRiskMovement.MELEE_SHADE);
        double half = Math.asin(18.0 / 200);
        double[][] behind = {{0, half, 200}};
        assertEquals(1.0, MinimumRiskMovement.shaded(0, half / 2, 400, behind), 1e-12, "fully behind b");
        assertEquals(0.0, MinimumRiskMovement.shaded(0, half / 2, 100, behind), 1e-12, "in front of b");
        assertEquals(0.0, MinimumRiskMovement.shaded(1.0, half / 2, 400, behind), 1e-12, "off to the side");
        assertEquals(0.5, MinimumRiskMovement.shaded(half, half, 400, behind), 1e-9, "half covered");
        double[][] twice = {{0, half, 200}, {0, half, 250}};
        assertEquals(0.5, MinimumRiskMovement.shaded(half, half, 400, twice), 1e-9, "overlaps count once");
        // A wave from a at (500, 900): b at (500, 700) shades Hadur at (500, 500) from it, c does not.
        scan(tracker, "a", 500, 900, 100, 1);
        scan(tracker, "b", 500, 700, 100, 1);
        scan(tracker, "c", 100, 100, 100, 1);
        EnemyShot shot = new EnemyShot("a", pt(500, 900), 0, 2.0);
        VirtualBullet hot = new VirtualBullet(shot, VirtualBullet.Aim.HEAD_ON, Math.PI);
        List<MinimumRiskMovement.Wave> waves = MinimumRiskMovement.Wave.of(List.of(hot));
        List<double[][]> sh = MinimumRiskMovement.shadows(waves, tracker.alive());
        assertEquals(2, sh.get(0).length, "b and c, not the shooter");
        double open = MinimumRiskMovement.waveDamage(pt(500, 500), pt(500, 500), 20, waves);
        assertTrue(open > 0);
        assertEquals(0.0, MinimumRiskMovement.waveDamage(pt(500, 500), pt(500, 500), 20, waves, sh), 1e-9);
    }

    @Test
    @Tag("MMOVE-20")
    @DisplayName("MMOVE-20: Hadur's own bullet shades the stretch of a wave from where it crosses it, outward")
    void bulletShade() {
        assertFalse(MinimumRiskMovement.MELEE_BULLET_SHADE);
        assertFalse(move.bulletShading(), "off: no own bullets are kept");
        // a at (500, 900) fires power 2 (14 px/tick) at tick 0; Hadur at (500, 500) fires power 3 (11 px/tick)
        // straight back at it: the front (14t) meets the bullet (400 - 11t from a) at tick 16.
        MinimumRiskMovement.Wave w = MinimumRiskMovement.Wave.of(List.of(new VirtualBullet(
            new EnemyShot("a", pt(500, 900), 0, 2.0), VirtualBullet.Aim.HEAD_ON, Math.PI))).get(0);
        VirtualBullet mine = new VirtualBullet(new EnemyShot("", pt(500, 500), 0, 3.0, 0), VirtualBullet.Aim.HEAD_ON, 0);
        double[] sh = MinimumRiskMovement.bulletShadow(w, mine, 1414);
        assertNotNull(sh);
        assertEquals(Math.PI, Math.abs(sh[0]), 1e-9, "on the line from a to Hadur");
        assertEquals(14 * 15, sh[2], 1e-9, "from the front's radius the tick before the crossing");
        // A bullet fired across, from (300, 500) eastward, shades a wider stretch.
        VirtualBullet across = new VirtualBullet(new EnemyShot("", pt(300, 520), 0, 3.0, 0), VirtualBullet.Aim.HEAD_ON, Math.PI / 2);
        double[] wide = MinimumRiskMovement.bulletShadow(w, across, 1414);
        assertNotNull(wide);
        assertTrue(wide[1] > sh[1]);
        List<double[][]> merged = MinimumRiskMovement.withBulletShadows(null, List.of(w), List.of(mine, across), 1414);
        assertEquals(2, merged.get(0).length);
        // A faster bullet that starts inside a slower wave shades where it crosses the front outward:
        // a speed-11 wave from (0, 500) at tick -5 has a 55 px front when Hadur's power-1 bullet
        // (17 px/tick) leaves (50, 500) eastward; it is outside the 66 px front at tick 1.
        MinimumRiskMovement.Wave slow = MinimumRiskMovement.Wave.of(List.of(new VirtualBullet(
            new EnemyShot("a", pt(0, 500), -5, 3.0), VirtualBullet.Aim.HEAD_ON, Math.PI / 2))).get(0);
        VirtualBullet out = new VirtualBullet(new EnemyShot("", pt(50, 500), 0, 1.0, 0), VirtualBullet.Aim.HEAD_ON, Math.PI / 2);
        double[] outward = MinimumRiskMovement.bulletShadow(slow, out, 1414);
        assertNotNull(outward);
        assertEquals(55, outward[2], 1e-9);
        // The crossing is looked for as long as the bullet flies, not a fixed horizon: on a 4000 px
        // field a power-3 bullet from (906, 2000) eastward is caught by a power-1 wave from (0, 2000) at tick 151.
        MinimumRiskMovement.Wave fast = MinimumRiskMovement.Wave.of(List.of(new VirtualBullet(
            new EnemyShot("a", pt(0, 2000), 0, 1.0), VirtualBullet.Aim.HEAD_ON, Math.PI / 2))).get(0);
        VirtualBullet far = new VirtualBullet(new EnemyShot("", pt(906, 2000), 0, 3.0, 0), VirtualBullet.Aim.HEAD_ON, Math.PI / 2);
        assertNotNull(MinimumRiskMovement.bulletShadow(fast, far, Math.hypot(4000, 4000)));
        assertNull(MinimumRiskMovement.bulletShadow(fast, far, 1414), "flown out of a 1000 px field first");

        MinimumRiskMovement on = new MinimumRiskMovement(field(1000, 1000));
        on.scalar2(true, false);
        assertTrue(on.bulletShading());
        // A bullet that hit something casts no more shadows: of those of its power, the nearest heading goes.
        on.ownShot(pt(500, 500), 0, 0, 3.0);
        on.ownShot(pt(500, 500), 1, Math.PI / 2, 3.0);
        on.ownShot(pt(500, 500), 2, Math.PI / 2, 2.0);
        on.ownBulletGone(3.0, Math.PI / 2 + 0.01);
        List<VirtualBullet> kept = on.ownBullets(pt(500, 500), 3);
        assertEquals(2, kept.size());
        assertEquals(0, kept.get(0).heading, 1e-9);
        assertEquals(2.0, kept.get(1).shot.power, 1e-9);
        on.ownBulletGone(1.0, Double.NaN);
        assertEquals(2, on.ownBullets(pt(500, 500), 3).size(), "no bullet of that power: none goes");
    }

    @Test
    @Tag("MMOVE-21")
    @DisplayName("MMOVE-21: the surfer weighs five 140 px steps, two waves deep, when the switch is on")
    void search() {
        assertFalse(MinimumRiskMovement.MELEE_SEARCH);
        scan(tracker, "a", 800, 500, 100, 1);
        MinimumRiskMovement.View v = new MinimumRiskMovement.View(pt(500, 500), 100, 5, 1, tracker.alive(), List.of(), normal);
        List<Point2D.Double> steps = move.steps(pt(500, 500), v);
        assertEquals(5, steps.size());
        for (Point2D.Double p : steps) assertEquals(MinimumRiskMovement.SEARCH_STEP, p.distance(500, 500), 1e-6);
        assertTrue(steps.get(0).x < 500, "the first step is away from a");
        // Near a wall the steps stay inside it.
        for (Point2D.Double p : move.steps(pt(30, 30), v)) {
            assertTrue(p.x >= MinimumRiskMovement.WALL_MARGIN && p.y >= MinimumRiskMovement.WALL_MARGIN);
        }
        assertEquals(1, MinimumRiskMovement.arrival(pt(0, 0), pt(0, 0)));
        // The second leg keeps the first's speed along its line, and none turning back.
        assertEquals(6, MinimumRiskMovement.carried(pt(0, 0), new double[] {0, 100, 6}, pt(0, 300)), 1e-9);
        assertEquals(0, MinimumRiskMovement.carried(pt(0, 0), new double[] {0, 100, 6}, pt(0, 0)), 1e-9);
        // A wave met on the first leg is not met again on the second: a speed-14 wave from (0, 0)
        // fired at tick -40 reaches a robot driving from (786, 0) to (998, 0) at the end of the leg.
        MinimumRiskMovement.Wave east = MinimumRiskMovement.Wave.of(List.of(new VirtualBullet(
            new EnemyShot("a", pt(0, 0), -40, 2.0), VirtualBullet.Aim.HEAD_ON, Math.PI / 2))).get(0);
        double[] end = {786, 0, 0};
        boolean[] met = new boolean[1];
        double first = MinimumRiskMovement.drive(end, pt(998, 0), 0, 30, List.of(east), null, met);
        assertTrue(first > 0 && met[0]);
        assertEquals(0, MinimumRiskMovement.drive(end.clone(), pt(998, 140), 30, 30, List.of(east), null, met.clone()), 1e-9);
        assertTrue(MinimumRiskMovement.arrival(pt(0, 0), pt(0, 140)) > 140 / 8);
        // On, the surfer's pick is one of the steps; off, it is one of the candidates it was given.
        MinimumRiskMovement on = new MinimumRiskMovement(field(1000, 1000));
        on.newRound();
        on.scalar2(false, true);
        List<Point2D.Double> given = List.of(pt(200, 200), pt(800, 800));
        assertTrue(on.steps(pt(500, 500), v).contains(on.surfBest(given, v)));
        assertTrue(given.contains(move.surfBest(given, v)));
    }
}

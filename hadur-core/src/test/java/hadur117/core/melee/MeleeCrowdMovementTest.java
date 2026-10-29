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
        MinimumRiskMovement.View v = move.view(me, 100, 100, 3, alive, normal);
        move.crowd(false, false, false, true);
        assertEquals(plain.enemyRisk(p, v, ia) / 2, move.enemyRisk(p, v, ia), 1e-12, "b is nearer a than the point");
        assertEquals(plain.enemyRisk(p, v, ic), move.enemyRisk(p, v, ic), 1e-12, "none nearer c than the point");
        MinimumRiskMovement.View two = move.view(me, 100, 100, 2, alive, normal);
        assertEquals(plain.enemyRisk(p, two, ia), move.enemyRisk(p, two, ia), 1e-12, "two left: unchanged");
    }

    @Test
    @Tag("MMOVE-15")
    @DisplayName("MMOVE-15: the melee surfer ships off, weighs shots by the crowd and plays a shooter's learned aims")
    void surf() {
        assertFalse(MinimumRiskMovement.MELEE_SURF);
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
        // Off, or with no log given, the same shots are MMOVE-3's.
        MinimumRiskMovement off = new MinimumRiskMovement(field(1000, 1000));
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
}

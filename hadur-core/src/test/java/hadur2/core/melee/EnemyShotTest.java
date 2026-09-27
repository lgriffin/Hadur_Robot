package hadur2.core.melee;

import static hadur2.core.melee.Fixtures.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** MSENSE-2: which energy drops the battlefield model reads as shots. */
class EnemyShotTest {

    private final EnemyTracker tracker = new EnemyTracker(field(1000, 1000));

    @Test
    @Tag("MSENSE-2")
    @DisplayName("MSENSE-2: an unexplained drop in [0.1, 3] is a shot at that power, fired the tick before")
    void dropIsAShot() {
        tracker.onScan("a", pt(300, 300), 100, 0, 8, 10, 400);
        tracker.onScan("a", pt(300, 308), 98, 0, 8, 11, 400);
        List<EnemyShot> shots = tracker.shots(11);
        assertEquals(1, shots.size());
        EnemyShot s = shots.get(0);
        assertEquals("a", s.shooter);
        assertEquals(2.0, s.power, 1e-9);
        assertEquals(10, s.fireTime);
        assertEquals(pt(300, 300), s.source);
        assertEquals(14.0, s.speed(), 1e-9);
        assertEquals(28.0, s.travelled(12), 1e-9);
    }

    @Test
    @Tag("MSENSE-2")
    @DisplayName("MSENSE-2: the lowest and highest powers count; a smaller drop does not")
    void powerRange() {
        tracker.onScan("a", pt(300, 300), 100, 0, 0, 1, 400);
        tracker.onScan("a", pt(300, 300), 99.9, 0, 0, 2, 400);
        tracker.onScan("a", pt(300, 300), 96.9, 0, 0, 3, 400);
        tracker.onScan("a", pt(300, 300), 96.85, 0, 0, 4, 400);
        assertEquals(List.of(0.1, 3.0), tracker.shots(4).stream().map(x -> Math.round(x.power * 100) / 100.0).toList());
    }

    @Test
    @Tag("MSENSE-2")
    @DisplayName("MSENSE-2: damage from our bullets is not a shot")
    void ourDamageExplained() {
        tracker.onScan("a", pt(300, 300), 100, 0, 0, 1, 400);
        tracker.onBulletHit("a", 4.0);
        tracker.onScan("a", pt(300, 300), 96, 0, 0, 2, 400);
        assertTrue(tracker.shots(2).isEmpty());
    }

    @Test
    @Tag("MSENSE-2")
    @DisplayName("MSENSE-2: a robot stopped at a wall, or against a robot, took damage, not a shot")
    void bumpsExplained() {
        // Stopped against the east wall: wall damage 3.
        tracker.onScan("w", pt(970, 300), 100, Math.PI / 2, 8, 1, 400);
        tracker.onScan("w", pt(982, 300), 97, Math.PI / 2, 0, 2, 400);
        // Stopped against another robot: collision damage 0.6.
        tracker.onScan("b", pt(500, 500), 100, 0, 0, 1, 400);
        tracker.onScan("c", pt(500, 440), 100, 0, 4, 1, 400);
        tracker.onScan("c", pt(500, 460), 99.4, 0, 0, 2, 400);
        // Stopped against us.
        tracker.onScan("d", pt(100, 500), 100, 0, 4, 1, 60);
        tracker.onScan("d", pt(100, 504), 99.4, 0, 0, 2, 40);
        assertTrue(tracker.shots(2).isEmpty(), tracker.shots(2).toString());
        // A robot that keeps moving and drops 0.6 fired.
        tracker.onScan("c", pt(500, 470), 98.8, 0, 4, 3, 400);
        assertEquals(1, tracker.shots(3).size());
    }

    @Test
    @Tag("MSENSE-2")
    @DisplayName("MSENSE-2: a big drop is someone else's hit, not a shot")
    void bigDropIsExternal() {
        tracker.onScan("a", pt(300, 300), 100, 0, 0, 1, 400);
        EnemyInfo a = tracker.onScan("a", pt(300, 300), 84, 0, 0, 2, 400);
        assertTrue(tracker.shots(2).isEmpty());
        assertEquals(16, a.recentExternalLoss(2), 1e-9);
    }

    @Test
    @Tag("MSENSE-2")
    @DisplayName("MSENSE-2: a dead robot's shots fly on; old shots are dropped")
    void shotsOutliveTheShooterButNotTheirFlight() {
        tracker.onScan("a", pt(300, 300), 100, 0, 0, 1, 400);
        tracker.onScan("a", pt(300, 300), 99, 0, 0, 2, 400);
        tracker.onRobotDeath("a");
        assertEquals(1, tracker.shots(3).size());
        assertEquals(0, tracker.shots(2 + EnemyTracker.SHOT_LIFETIME + 1).size());
        tracker.newRound();
        assertTrue(tracker.shots(3).isEmpty());
    }

    @Test
    @Tag("RES-2")
    @DisplayName("RES-2: the shots held are bounded")
    void shotsBounded() {
        double energy = 100;
        for (int t = 0; t < 200; t++) {
            tracker.onScan("a", pt(300, 300), energy, 0, 0, t, 400);
            energy -= 0.2;
        }
        assertTrue(tracker.shots(199).size() <= EnemyTracker.MAX_SHOTS);
    }
}

package hadur2.core.melee;

import hadur2.core.world.EnemyTracker;
import hadur2.core.world.EnemyInfo;
import static hadur2.core.melee.Fixtures.*;
import static org.junit.jupiter.api.Assertions.*;

import java.awt.geom.Point2D;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class MeleeWavesTest {

    private final FieldGun gun = new FieldGun(field(1000, 1000));
    private final EnemyTracker tracker = new EnemyTracker();
    private final MeleeWaves waves = new MeleeWaves();
    private final Point2D.Double me = pt(500, 500);

    @Test
    @Tag("MGUN-4")
    @DisplayName("MGUN-4: a wave goes out at every fresh opponent when the gun comes off cooldown")
    void waveOnEveryCycle() {
        scan(tracker, "a", 500, 800, 100, 1);
        scan(tracker, "b", 800, 500, 100, 1);
        assertTrue(waves.tick(me, 2, 0, tracker.alive(), gun, 100, 5));
        assertEquals(2, waves.inFlight());
        // Still cool and idle: the next cycle is a full cooldown away.
        assertFalse(waves.tick(me, 3, 0, tracker.alive(), gun, 100, 5));
        // Firing heats the gun; cooling to zero starts a cycle at once.
        assertFalse(waves.tick(me, 4, 1.2, tracker.alive(), gun, 100, 5));
        scan(tracker, "a", 500, 800, 100, 5);
        scan(tracker, "b", 800, 500, 100, 5);
        assertTrue(waves.tick(me, 6, 0, tracker.alive(), gun, 100, 5));
        assertEquals(4, waves.inFlight());
        assertEquals(4, waves.emitted());
    }

    @Test
    @Tag("MGUN-4")
    @DisplayName("MGUN-4: an idle cool gun still waves every full cooldown")
    void idleCycles() {
        scan(tracker, "a", 500, 800, 100, 1);
        assertTrue(waves.tick(me, 2, 0, tracker.alive(), gun, 100, 5));
        scan(tracker, "a", 500, 800, 100, 17);
        assertFalse(waves.tick(me, 17, 0, tracker.alive(), gun, 100, 5));
        assertTrue(waves.tick(me, 2 + MeleeWaves.IDLE_INTERVAL, 0, tracker.alive(), gun, 100, 5));
    }

    @Test
    @Tag("MGUN-4")
    @DisplayName("MGUN-4: a wave that reaches its opponent scores a virtual hit when the aim was right")
    void virtualHits() {
        EnemyInfo a = scan(tracker, "a", 500, 800, 100, 1);
        waves.tick(me, 2, 0, tracker.alive(), gun, 100, 5);
        // A stationary opponent: the fallback aim is dead on; the wave reaches 300 px later.
        waves.onScan(a, 10);
        assertEquals(0, waves.resolved());
        waves.onScan(scan(tracker, "a", 500, 800, 100, 40), 40);
        assertEquals(1, waves.resolved());
        assertEquals(1, waves.hits());
        assertEquals(0, waves.inFlight());
    }

    @Test
    @Tag("MGUN-4")
    @DisplayName("MGUN-4: a moved opponent is a virtual miss, and a death drops its waves")
    void missesAndDeaths() {
        scan(tracker, "a", 500, 800, 100, 1);
        scan(tracker, "b", 800, 500, 100, 1);
        waves.tick(me, 2, 0, tracker.alive(), gun, 100, 5);
        waves.onScan(scan(tracker, "a", 700, 760, 100, 60), 60);
        assertEquals(1, waves.resolved());
        assertEquals(0, waves.hits());
        waves.onRobotDeath("b");
        assertEquals(0, waves.inFlight());
    }

    @Test
    @Tag("MGUN-4")
    @DisplayName("MGUN-4: a wave carries the field gun's own aim, and none goes out when the gun has none")
    void wavesCarryTheGunsAim() {
        EnemyInfo a = scan(tracker, "a", 700, 800, 100, 1);
        assertTrue(waves.tick(me, 2, 0, tracker.alive(), gun, 100, 5));
        FieldGun.Aim aim = gun.aim(me, 100, 5, java.util.Collections.singletonList(a), 2);
        assertEquals(aim.angle, waves.peekAim(), 1e-12);
        // Below the energy to fire, the gun has no solution, so there is nothing to score.
        MeleeWaves low = new MeleeWaves();
        assertTrue(low.tick(me, 2, 0, tracker.alive(), gun, 0.5, 5));
        assertEquals(0, low.inFlight());
        assertEquals(0, low.emitted());
    }

    @Test
    @Tag("MGUN-4")
    @DisplayName("MGUN-4: a wave is scored where the opponent was when it crossed, not at the next scan")
    void scoredAtTheCrossing() {
        // A wave from 500,500 aimed due north at speed 10, fired at tick 0.
        MeleeWaves.Wave w = new MeleeWaves.Wave("a", pt(500, 500), 0, 10, 0);
        // Scanned at 500,700 (tick 10, not yet reached) then at 700,800 (tick 40, well past):
        // on the line between them the wave's radius 10t meets the distance at about 630,765.
        Point2D.Double at = MeleeWaves.crossing(w, pt(500, 700), 10, pt(700, 800), 40);
        assertEquals(630, at.x, 5);
        assertEquals(700 + (at.x - 500) / 2, at.y, 1e-6);
        // Off the aim line when crossed, back on it at the next scan: a miss, where scoring at
        // the scan would have called it a hit.
        scan(tracker, "b", 500, 800, 100, 1);
        MeleeWaves one = new MeleeWaves();
        one.tick(me, 2, 0, tracker.alive(), gun, 100, 5);
        assertEquals(0, one.peekAim(), 0.01);
        one.onScan(scan(tracker, "b", 800, 800, 100, 20), 20);
        assertEquals(0, one.resolved());
        EnemyInfo b = scan(tracker, "b", 500, 900, 100, 60);
        one.onScan(b, 60);
        assertEquals(1, one.resolved());
        assertEquals(0, one.hits());
        // With no earlier scan there is no segment: the latest position stands.
        assertSame(b.location, MeleeWaves.crossing(w, null, -1, b.location, 40));
    }
}

package hadur2.core.melee;

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
}

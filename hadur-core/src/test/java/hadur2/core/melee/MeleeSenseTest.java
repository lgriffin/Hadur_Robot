package hadur2.core.melee;

import static hadur2.core.melee.Fixtures.*;
import static org.junit.jupiter.api.Assertions.*;

import java.awt.geom.Point2D;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** MSENSE-1: a death leaves the melee brain's view of the field on the same tick. */
class MeleeSenseTest {

    private final MeleeController controller = new MeleeController(field(1000, 1000));
    private final Point2D.Double me = pt(500, 500);

    private MeleeController.Command tick(long time, int others) {
        return controller.tick(new MeleeController.Situation(me, 0, 0, 100, time, others));
    }

    @Test
    @Tag("MSENSE-1")
    @DisplayName("MSENSE-1: a dead target is dropped from targeting at once")
    void deadTargetDropped() {
        controller.onScan("weak", pt(500, 700), 200, 5, 0, 0, 1);
        controller.onScan("b", pt(800, 500), 300, 100, 0, 0, 1);
        controller.onScan("c", pt(200, 500), 300, 100, 0, 0, 1);
        assertEquals("weak", tick(1, 3).target);
        controller.onRobotDeath("weak");
        MeleeController.Command c = tick(2, 2);
        assertNotEquals("weak", c.target);
        assertNotNull(c.target);
    }

    @Test
    @Tag("MSENSE-1")
    @DisplayName("MSENSE-1: a dead robot adds no risk to the movement")
    void deadRobotAddsNoRisk() {
        controller.onScan("near", pt(560, 500), 60, 100, 0, 0, 1);
        controller.onScan("b", pt(900, 900), 570, 100, 0, 0, 1);
        controller.onScan("c", pt(100, 900), 570, 100, 0, 0, 1);
        double before = controller.mover().risk(pt(600, 500), me, controller.tracker.alive(), 1,
            MeleeStrategy.Plan.normal());
        controller.onRobotDeath("near");
        double after = controller.mover().risk(pt(600, 500), me, controller.tracker.alive(), 1,
            MeleeStrategy.Plan.normal());
        assertTrue(after < before, before + " -> " + after);
        assertEquals(2, controller.tracker.alive().size());
    }

    @Test
    @Tag("MSENSE-1")
    @DisplayName("MSENSE-1: a robot whose death was never reported is dropped once a sweep misses it")
    void ghostsAreDropped() {
        controller.onScan("a", pt(500, 700), 200, 100, 0, 0, 1);
        controller.onScan("b", pt(800, 500), 300, 100, 0, 0, 10);
        controller.onScan("c", pt(200, 500), 300, 100, 0, 0, 10);
        // The engine counts two alive: "a" died unseen, but it was scanned 8 ticks ago only.
        assertEquals(0, controller.tracker.pruneGhosts(2, 9));
        assertEquals(1, controller.tracker.pruneGhosts(2, 10));
        assertNull(controller.tracker.get("a"));
        assertEquals(0, controller.tracker.pruneGhosts(2, 50), "never below the engine's count");
        tick(11, 2);
        assertEquals(2, controller.tracker.alive().size());
    }

    @Test
    @Tag("MRADAR-1")
    @DisplayName("MRADAR-1: while more robots are tracked than alive, the radar spins")
    void surplusSpins() {
        EnemyTracker t = new EnemyTracker();
        t.onScan("a", pt(500, 700), 100, 0, 0, 1);
        t.onScan("b", pt(800, 500), 100, 0, 0, 1);
        t.onScan("c", pt(200, 500), 100, 0, 0, 5);
        MeleeRadar radar = new MeleeRadar();
        // Pointing at "c" (west) with "a" (north) stalest: with three alive it turns to "a".
        assertTrue(radar.radarTurn(me, -Math.PI / 2, t, 3) > 0);
        // With two alive, one of them is a ghost: spin on, whatever the stalest.
        MeleeRadar spin = new MeleeRadar();
        assertEquals(Double.POSITIVE_INFINITY, spin.radarTurn(me, Math.PI / 2, t, 2));
    }
}

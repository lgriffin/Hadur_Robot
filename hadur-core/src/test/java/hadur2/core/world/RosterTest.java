package hadur2.core.world;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.awt.geom.Point2D;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** T1: the roster keeps a teammate's heading and velocity and predicts from them (WORLD-9). */
class RosterTest {

    private static Roster roster() {
        Roster r = new Roster(List.of("a", "b", "c"), 3);
        r.newRound();
        r.beginTick(10);
        return r;
    }

    @Test
    @Tag("WORLD-9")
    @DisplayName("WORLD-9: a scan, a report and a sighting each keep the heading and velocity with the position")
    void keepsHeadingAndVelocity() {
        Roster r = roster();
        r.scanned("a", 100, 200, 1.0, 5.0, 10);
        assertEquals(1.0, r.mate("a").heading(), 0);
        assertEquals(5.0, r.mate("a").velocity(), 0);
        r.reported("b", 9, 300, 400, 2.0, -3.0, 4);
        assertEquals(2.0, r.mate("b").heading(), 0);
        assertEquals(-3.0, r.mate("b").velocity(), 0);
        r.sighted("c", 500, 600, 3.0, 7.0, 8);
        assertEquals(3.0, r.mate("c").heading(), 0);
        assertEquals(7.0, r.mate("c").velocity(), 0);
        assertEquals(500, r.mate("c").x(), 0);
        // An older sighting does not replace a newer state, heading and velocity included.
        r.sighted("a", 0, 0, 0, 0, 5);
        assertEquals(1.0, r.mate("a").heading(), 0);
        assertEquals(100, r.mate("a").x(), 0);
    }

    @Test
    @Tag("WORLD-9")
    @DisplayName("WORLD-9: the prediction moves the last known point along its heading, velocity a tick")
    void predictsLinearly() {
        Roster r = roster();
        // Heading east (pi/2) at 6 px a tick, known on tick 10.
        r.scanned("a", 100, 200, Math.PI / 2, 6.0, 10);
        Point2D.Double at = r.mate("a").at(15);
        assertEquals(130, at.x, 1e-9);
        assertEquals(200, at.y, 1e-6);
        // Reversing: a negative velocity goes the other way.
        r.scanned("b", 100, 200, 0, -4.0, 10);
        assertEquals(192, r.mate("b").at(12).y, 1e-9);
        // At or before the tick it was known on, and before it was ever known: the point itself.
        assertEquals(100, r.mate("a").at(10).x, 0);
        assertEquals(100, r.mate("a").at(3).x, 0);
    }

    @Test
    @Tag("WORLD-9")
    @DisplayName("WORLD-9: the prediction is moved no further than a robot's top speed allows")
    void predictionIsCapped() {
        Roster r = roster();
        r.scanned("a", 0, 0, 0, 40.0, 10);
        assertEquals(8.0 * 5, r.mate("a").at(15).y, 1e-9);
        r.scanned("b", 0, 0, 0, -40.0, 10);
        assertEquals(-8.0 * 5, r.mate("b").at(15).y, 1e-9);
    }

    @Test
    @Tag("WORLD-9")
    @DisplayName("WORLD-9: living lists the living teammates whose position is known and no older than the window")
    void livingListsTheFreshOnes() {
        Roster r = roster();
        r.scanned("a", 1, 1, 0, 0, 10);
        r.reported("b", 9, 2, 2, 0, 0, 4);
        // "c" never seen.
        List<Roster.Mate> now = r.living(10);
        assertEquals(List.of("a", "b"), now.stream().map(m -> m.name).toList());
        // Stale: a's position is more than the window old.
        assertEquals(List.of(), r.living(10 + Roster.SILENT_WINDOW + 1));
        assertEquals(2, r.living(10 + Roster.SILENT_WINDOW - 1).size());
        // Dead: left out.
        r.died("a", 10, false);
        assertEquals(List.of("b"), r.living(10).stream().map(m -> m.name).toList());
        // The list cannot be changed by a caller.
        boolean threw = false;
        try {
            r.living(10).clear();
        } catch (UnsupportedOperationException e) {
            threw = true;
        }
        assertTrue(threw);
    }
}

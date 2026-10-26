package hadur2.core.melee;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.geom.Point2D;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class EnemyHistoryCrowdTest {

    private static final double[] BASE = {0.5, 1.0, 0.0, 0.2, 0.3};

    @Test
    @Tag("MGUN-11")
    @DisplayName("MGUN-11: the crowd switch ships off, so the gun keeps MGUN-1's five attributes")
    void shipsOff() {
        assertFalse(EnemyHistory.CROWD);
        assertEquals(5, EnemyHistory.DIMENSIONS);
        assertEquals(EnemyHistory.DIMENSIONS, EnemyHistory.WEIGHTS.length);
    }

    @Test
    @Tag("MGUN-11")
    @DisplayName("MGUN-11: nearest-robot distance, heading toward it and opponents alive follow the five")
    void crowdAttributes() {
        // Moving north (heading 0) at 8 px/tick from (100, 100); the nearest robot 200 px north.
        double[] a = EnemyHistory.crowd(BASE, 100, 100, 0, 8, new Point2D.Double(100, 300), 6);
        assertEquals(8, a.length);
        assertArrayEquals(BASE, java.util.Arrays.copyOf(a, 5), 0);
        assertEquals(200 / 800.0, a[5], 1e-9);
        assertEquals(1.0, a[6], 1e-9, "heading straight at it");
        assertEquals(6 / 9.0, a[7], 1e-9);
        // Reversing (velocity < 0) turns the motion round: now heading straight away.
        assertEquals(0.0, EnemyHistory.crowd(BASE, 100, 100, 0, -8, new Point2D.Double(100, 300), 6)[6], 1e-9);
        // Moving across it: neither toward nor away.
        assertEquals(0.5, EnemyHistory.crowd(BASE, 100, 100, Math.PI / 2, 8, new Point2D.Double(100, 300), 6)[6], 1e-9);
    }

    @Test
    @Tag("MGUN-11")
    @DisplayName("MGUN-11: with no robot known, or the opponent stopped, the crowd attributes are neutral")
    void neutral() {
        double[] none = EnemyHistory.crowd(BASE, 100, 100, 0, 8, null, 0);
        assertEquals(1.0, none[5], 1e-9);
        assertEquals(0.5, none[6], 1e-9);
        assertEquals(0.0, none[7], 1e-9);
        assertEquals(0.5, EnemyHistory.crowd(BASE, 100, 100, 0, 0, new Point2D.Double(100, 300), 3)[6], 1e-9);
        assertEquals(1.0, EnemyHistory.crowd(BASE, 0, 0, 0, 8, new Point2D.Double(2000, 0), 12)[5], 1e-9, "capped at 800 px");
        assertEquals(1.0, EnemyHistory.crowd(BASE, 0, 0, 0, 8, new Point2D.Double(2000, 0), 12)[7], 1e-9, "capped at nine");
    }
}

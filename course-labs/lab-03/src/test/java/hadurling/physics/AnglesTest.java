package hadurling.physics;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AnglesTest {

    private static final double EPS = 1e-12;

    @Test
    @DisplayName("a relative angle takes the short way round")
    void relativeTakesTheShortWay() {
        assertEquals(-Math.PI / 2, Angles.normalRelativeAngle(3 * Math.PI / 2), EPS);
        assertEquals(Math.PI / 2, Angles.normalRelativeAngle(-3 * Math.PI / 2), EPS);
        assertEquals(0.5, Angles.normalRelativeAngle(0.5 + 4 * Math.PI), EPS);
    }

    @Test
    @DisplayName("exactly half a turn maps to -PI, as in the engine")
    void halfTurnIsMinusPi() {
        assertEquals(-Math.PI, Angles.normalRelativeAngle(Math.PI), 0.0);
    }

    @Test
    @DisplayName("an absolute angle is never negative")
    void absoluteIsNeverNegative() {
        assertEquals(3 * Math.PI / 2, Angles.normalAbsoluteAngle(-Math.PI / 2), EPS);
        assertTrue(Angles.normalAbsoluteAngle(-1e-9) >= 0);
    }

    @Test
    @DisplayName("the compass: north is 0, east is PI/2")
    void compass() {
        assertEquals(0, Angles.absoluteBearing(100, 100, 100, 200), EPS);
        assertEquals(Math.PI / 2, Angles.absoluteBearing(100, 100, 200, 100), EPS);
        assertEquals(Math.PI, Angles.absoluteBearing(100, 100, 100, 0), EPS);
        assertEquals(3 * Math.PI / 2, Angles.absoluteBearing(100, 100, 0, 100), EPS);
    }
}
